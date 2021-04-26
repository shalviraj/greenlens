package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

public abstract class WidgetRun implements Dependency {
    public DimensionDependency dimension = new DimensionDependency(this);
    public ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public DependencyNode end = new DependencyNode(this);
    public RunType mRunType = RunType.NONE;
    public int matchConstraintsType;
    public int orientation = 0;
    public boolean resolved = false;
    public RunGroup runGroup;
    public DependencyNode start = new DependencyNode(this);
    public ConstraintWidget widget;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun$1 */
    public static /* synthetic */ class C01831 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type */
        public static final /* synthetic */ int[] f113x4c44d048;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|7|8|9|11|12|13|14|16) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|5|6|7|8|9|11|12|13|14|16) */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0024 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values()
                r0 = 9
                int[] r0 = new int[r0]
                f113x4c44d048 = r0
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x000e }
                r1 = 1
                r0[r1] = r1     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r0 = 2
                r1 = 3
                int[] r2 = f113x4c44d048     // Catch:{ NoSuchFieldError -> 0x0016 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r2 = f113x4c44d048     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r0 = 4
                r1 = 5
                int[] r2 = f113x4c44d048     // Catch:{ NoSuchFieldError -> 0x0024 }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                int[] r2 = f113x4c44d048     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x002a }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.WidgetRun.C01831.<clinit>():void");
        }
    }

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.widget = constraintWidget;
    }

    private void resolveDimension(int i, int i2) {
        int i3;
        DimensionDependency dimensionDependency;
        int i4 = this.matchConstraintsType;
        if (i4 != 0) {
            if (i4 == 1) {
                int limitedDimension = getLimitedDimension(this.dimension.wrapValue, i);
                dimensionDependency = this.dimension;
                i3 = Math.min(limitedDimension, i2);
                dimensionDependency.resolve(i3);
            } else if (i4 == 2) {
                ConstraintWidget parent = this.widget.getParent();
                if (parent != null) {
                    DimensionDependency dimensionDependency2 = (i == 0 ? parent.horizontalRun : parent.verticalRun).dimension;
                    if (dimensionDependency2.resolved) {
                        ConstraintWidget constraintWidget = this.widget;
                        i2 = (int) ((((float) dimensionDependency2.value) * (i == 0 ? constraintWidget.mMatchConstraintPercentWidth : constraintWidget.mMatchConstraintPercentHeight)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i4 == 3) {
                ConstraintWidget constraintWidget2 = this.widget;
                WidgetRun widgetRun = constraintWidget2.horizontalRun;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.dimensionBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.matchConstraintsType == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.verticalRun;
                    if (verticalWidgetRun.dimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    widgetRun = constraintWidget2.verticalRun;
                }
                if (widgetRun.dimension.resolved) {
                    float dimensionRatio = constraintWidget2.getDimensionRatio();
                    this.dimension.resolve(i == 1 ? (int) ((((float) widgetRun.dimension.value) / dimensionRatio) + 0.5f) : (int) ((dimensionRatio * ((float) widgetRun.dimension.value)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        dimensionDependency = this.dimension;
        i3 = getLimitedDimension(i2, i);
        dimensionDependency.resolve(i3);
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.margin = i;
        dependencyNode2.dependencies.add(dependencyNode);
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.targets.add(this.dimension);
        dependencyNode.marginFactor = i;
        dependencyNode.marginDependency = dimensionDependency;
        dependencyNode2.dependencies.add(dependencyNode);
        dimensionDependency.dependencies.add(dependencyNode);
    }

    public abstract void apply();

    public abstract void applyToWidget();

    public abstract void clear();

    public final int getLimitedDimension(int i, int i2) {
        int i3;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.widget;
            int i4 = constraintWidget.mMatchConstraintMaxWidth;
            i3 = Math.max(constraintWidget.mMatchConstraintMinWidth, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.widget;
            int i5 = constraintWidget2.mMatchConstraintMaxHeight;
            int max = Math.max(constraintWidget2.mMatchConstraintMinHeight, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int ordinal = constraintAnchor2.mType.ordinal();
        if (ordinal == 1) {
            widgetRun = constraintWidget.horizontalRun;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                widgetRun2 = constraintWidget.horizontalRun;
            } else if (ordinal == 4) {
                widgetRun2 = constraintWidget.verticalRun;
            } else if (ordinal != 5) {
                return null;
            } else {
                return constraintWidget.verticalRun.baseline;
            }
            return widgetRun2.end;
        } else {
            widgetRun = constraintWidget.verticalRun;
        }
        return widgetRun.start;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i == 0 ? constraintWidget.horizontalRun : constraintWidget.verticalRun;
        int ordinal = constraintAnchor2.mType.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return widgetRun.start;
        }
        if (ordinal == 3 || ordinal == 4) {
            return widgetRun.end;
        }
        return null;
    }

    public long getWrapDimension() {
        DimensionDependency dimensionDependency = this.dimension;
        if (dimensionDependency.resolved) {
            return (long) dimensionDependency.value;
        }
        return 0;
    }

    public boolean isCenterConnection() {
        int size = this.start.targets.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.start.targets.get(i2).run != this) {
                i++;
            }
        }
        int size2 = this.end.targets.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.end.targets.get(i3).run != this) {
                i++;
            }
        }
        return i >= 2;
    }

    public boolean isDimensionResolved() {
        return this.dimension.resolved;
    }

    public boolean isResolved() {
        return this.resolved;
    }

    public abstract void reset();

    public abstract boolean supportsWrapComputation();

    public void update(Dependency dependency) {
    }

    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = constraintAnchor.getMargin() + target.value;
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i2 = margin2 - margin;
            if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i, i2);
            }
            DimensionDependency dimensionDependency = this.dimension;
            if (dimensionDependency.resolved) {
                if (dimensionDependency.value == i2) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                ConstraintWidget constraintWidget = this.widget;
                float horizontalBiasPercent = i == 0 ? constraintWidget.getHorizontalBiasPercent() : constraintWidget.getVerticalBiasPercent();
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) ((((float) ((margin2 - margin) - this.dimension.value)) * horizontalBiasPercent) + ((float) margin) + 0.5f));
                this.end.resolve(this.start.value + this.dimension.value);
            }
        }
    }

    public void updateRunEnd(Dependency dependency) {
    }

    public void updateRunStart(Dependency dependency) {
    }

    public long wrapSize(int i) {
        int i2;
        DimensionDependency dimensionDependency = this.dimension;
        if (!dimensionDependency.resolved) {
            return 0;
        }
        long j = (long) dimensionDependency.value;
        if (isCenterConnection()) {
            i2 = this.start.margin - this.end.margin;
        } else if (i != 0) {
            return j - ((long) this.end.margin);
        } else {
            i2 = this.start.margin;
        }
        return j + ((long) i2);
    }
}
