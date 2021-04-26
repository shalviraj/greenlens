package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.Barrier;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;

public class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void addDependency(DependencyNode dependencyNode) {
        this.start.dependencies.add(dependencyNode);
        dependencyNode.targets.add(this.start);
    }

    public void apply() {
        WidgetRun widgetRun;
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.allowsGoneWidget();
            int i = 0;
            if (barrierType == 0) {
                this.start.type = DependencyNode.Type.LEFT;
                while (i < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget2 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.horizontalRun.start;
                        dependencyNode.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode);
                    }
                    i++;
                }
            } else if (barrierType != 1) {
                if (barrierType == 2) {
                    this.start.type = DependencyNode.Type.TOP;
                    while (i < barrier.mWidgetsCount) {
                        ConstraintWidget constraintWidget3 = barrier.mWidgets[i];
                        if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                            DependencyNode dependencyNode2 = constraintWidget3.verticalRun.start;
                            dependencyNode2.dependencies.add(this.start);
                            this.start.targets.add(dependencyNode2);
                        }
                        i++;
                    }
                } else if (barrierType == 3) {
                    this.start.type = DependencyNode.Type.BOTTOM;
                    while (i < barrier.mWidgetsCount) {
                        ConstraintWidget constraintWidget4 = barrier.mWidgets[i];
                        if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                            DependencyNode dependencyNode3 = constraintWidget4.verticalRun.end;
                            dependencyNode3.dependencies.add(this.start);
                            this.start.targets.add(dependencyNode3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                addDependency(this.widget.verticalRun.start);
                widgetRun = this.widget.verticalRun;
                addDependency(widgetRun.end);
            } else {
                this.start.type = DependencyNode.Type.RIGHT;
                while (i < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget5 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.horizontalRun.end;
                        dependencyNode4.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode4);
                    }
                    i++;
                }
            }
            addDependency(this.widget.horizontalRun.start);
            widgetRun = this.widget.horizontalRun;
            addDependency(widgetRun.end);
        }
    }

    public void applyToWidget() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.widget.setX(this.start.value);
            } else {
                this.widget.setY(this.start.value);
            }
        }
    }

    public void clear() {
        this.runGroup = null;
        this.start.clear();
    }

    public void reset() {
        this.start.resolved = false;
    }

    public boolean supportsWrapComputation() {
        return false;
    }

    public void update(Dependency dependency) {
        int i;
        DependencyNode dependencyNode;
        Barrier barrier = (Barrier) this.widget;
        int barrierType = barrier.getBarrierType();
        int i2 = 0;
        int i3 = -1;
        for (DependencyNode dependencyNode2 : this.start.targets) {
            int i4 = dependencyNode2.value;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            dependencyNode = this.start;
            i = barrier.getMargin() + i3;
        } else {
            dependencyNode = this.start;
            i = barrier.getMargin() + i2;
        }
        dependencyNode.resolve(i);
    }
}
