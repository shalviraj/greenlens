package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.solver.widgets.analyzer.Direct;
import androidx.constraintlayout.solver.widgets.analyzer.Grouping;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidgetContainer extends WidgetContainer {
    private static final boolean DEBUG = false;
    public static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    public static int mycounter;
    private WeakReference<ConstraintAnchor> horizontalWrapMax = null;
    private WeakReference<ConstraintAnchor> horizontalWrapMin = null;
    public BasicMeasure mBasicMeasureSolver = new BasicMeasure(this);
    public int mDebugSolverPassCount = 0;
    public DependencyGraph mDependencyGraph = new DependencyGraph(this);
    public boolean mGroupsWrapOptimized = false;
    private boolean mHeightMeasuredTooSmall = false;
    public ChainHead[] mHorizontalChainsArray = new ChainHead[4];
    public int mHorizontalChainsSize = 0;
    public boolean mHorizontalWrapOptimized = false;
    private boolean mIsRtl = false;
    public BasicMeasure.Measure mMeasure = new BasicMeasure.Measure();
    public BasicMeasure.Measurer mMeasurer = null;
    public Metrics mMetrics;
    private int mOptimizationLevel = 257;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    public boolean mSkipSolver = false;
    public LinearSystem mSystem = new LinearSystem();
    public ChainHead[] mVerticalChainsArray = new ChainHead[4];
    public int mVerticalChainsSize = 0;
    public boolean mVerticalWrapOptimized = false;
    private boolean mWidthMeasuredTooSmall = false;
    public int mWrapFixedHeight = 0;
    public int mWrapFixedWidth = 0;
    private WeakReference<ConstraintAnchor> verticalWrapMax = null;
    private WeakReference<ConstraintAnchor> verticalWrapMin = null;

    public ConstraintWidgetContainer() {
    }

    public ConstraintWidgetContainer(int i, int i2) {
        super(i, i2);
    }

    public ConstraintWidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public ConstraintWidgetContainer(String str, int i, int i2) {
        super(i, i2);
        setDebugName(str);
    }

    private void addHorizontalChain(ConstraintWidget constraintWidget) {
        int i = this.mHorizontalChainsSize + 1;
        ChainHead[] chainHeadArr = this.mHorizontalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mHorizontalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mHorizontalChainsArray[this.mHorizontalChainsSize] = new ChainHead(constraintWidget, 0, isRtl());
        this.mHorizontalChainsSize++;
    }

    private void addMaxWrap(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(solverVariable, this.mSystem.createObjectVariable(constraintAnchor), 0, 5);
    }

    private void addMinWrap(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(constraintAnchor), solverVariable, 0, 5);
    }

    private void addVerticalChain(ConstraintWidget constraintWidget) {
        int i = this.mVerticalChainsSize + 1;
        ChainHead[] chainHeadArr = this.mVerticalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mVerticalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mVerticalChainsArray[this.mVerticalChainsSize] = new ChainHead(constraintWidget, 1, isRtl());
        this.mVerticalChainsSize++;
    }

    public static boolean measure(ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure, boolean z) {
        int i;
        int i2;
        if (measurer == null) {
            return false;
        }
        measure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        measure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        measure.horizontalDimension = constraintWidget.getWidth();
        measure.verticalDimension = constraintWidget.getHeight();
        measure.measuredNeedsSolverPass = false;
        measure.useCurrentDimensions = z;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2;
        boolean z3 = measure.verticalBehavior == dimensionBehaviour2;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        boolean z5 = z3 && constraintWidget.mDimensionRatio > 0.0f;
        if (z2 && constraintWidget.hasDanglingDimension(0) && constraintWidget.mMatchConstraintDefaultWidth == 0 && !z4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z3 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (z3 && constraintWidget.hasDanglingDimension(1) && constraintWidget.mMatchConstraintDefaultHeight == 0 && !z5) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z3 = false;
        }
        if (constraintWidget.isResolvedHorizontally()) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (constraintWidget.isResolvedVertically()) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
            z3 = false;
        }
        if (z4) {
            if (constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
                measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z3) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.verticalBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i2 = measure.verticalDimension;
                } else {
                    measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.measure(constraintWidget, measure);
                    i2 = measure.measuredHeight;
                }
                measure.horizontalBehavior = dimensionBehaviour4;
                int i3 = constraintWidget.mDimensionRatioSide;
                measure.horizontalDimension = (int) ((i3 == 0 || i3 == -1) ? constraintWidget.getDimensionRatio() * ((float) i2) : constraintWidget.getDimensionRatio() / ((float) i2));
            }
        }
        if (z5) {
            if (constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
                measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = measure.horizontalBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i = measure.horizontalDimension;
                } else {
                    measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.measure(constraintWidget, measure);
                    i = measure.measuredWidth;
                }
                measure.verticalBehavior = dimensionBehaviour6;
                int i4 = constraintWidget.mDimensionRatioSide;
                measure.verticalDimension = (i4 == 0 || i4 == -1) ? (int) (((float) i) / constraintWidget.getDimensionRatio()) : (int) (constraintWidget.getDimensionRatio() * ((float) i));
            }
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(measure.measuredWidth);
        constraintWidget.setHeight(measure.measuredHeight);
        constraintWidget.setHasBaseline(measure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(measure.measuredBaseline);
        measure.useCurrentDimensions = false;
        return measure.measuredNeedsSolverPass;
    }

    private void resetChains() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    public void addChain(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            addHorizontalChain(constraintWidget);
        } else if (i == 1) {
            addVerticalChain(constraintWidget);
        }
    }

    public boolean addChildrenToSolver(LinearSystem linearSystem) {
        boolean optimizeFor = optimizeFor(64);
        addToSolver(linearSystem, optimizeFor);
        int size = this.mChildren.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            constraintWidget.setInBarrier(0, false);
            constraintWidget.setInBarrier(1, false);
            if (constraintWidget instanceof Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.mChildren.get(i2);
                if (constraintWidget2 instanceof Barrier) {
                    ((Barrier) constraintWidget2).markWidgets();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.mChildren.get(i3);
            if (constraintWidget3.addFirst()) {
                constraintWidget3.addToSolver(linearSystem, optimizeFor);
            }
        }
        if (LinearSystem.USE_DEPENDENCY_ORDERING) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = this.mChildren.get(i4);
                if (!constraintWidget4.addFirst()) {
                    hashSet.add(constraintWidget4);
                }
            }
            addChildrenToSolverByDependency(this, linearSystem, hashSet, getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it.next();
                Optimizer.checkMatchParent(this, linearSystem, constraintWidget5);
                constraintWidget5.addToSolver(linearSystem, optimizeFor);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget6 = this.mChildren.get(i5);
                if (constraintWidget6 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.mListDimensionBehaviors;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.addToSolver(linearSystem, optimizeFor);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    }
                } else {
                    Optimizer.checkMatchParent(this, linearSystem, constraintWidget6);
                    if (!constraintWidget6.addFirst()) {
                        constraintWidget6.addToSolver(linearSystem, optimizeFor);
                    }
                }
            }
        }
        if (this.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem, (ArrayList<ConstraintWidget>) null, 1);
        }
        return true;
    }

    public void addHorizontalWrapMaxVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.horizontalWrapMax;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > ((ConstraintAnchor) this.horizontalWrapMax.get()).getFinalValue()) {
            this.horizontalWrapMax = new WeakReference<>(constraintAnchor);
        }
    }

    public void addHorizontalWrapMinVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.horizontalWrapMin;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > ((ConstraintAnchor) this.horizontalWrapMin.get()).getFinalValue()) {
            this.horizontalWrapMin = new WeakReference<>(constraintAnchor);
        }
    }

    public void addVerticalWrapMaxVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.verticalWrapMax;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > ((ConstraintAnchor) this.verticalWrapMax.get()).getFinalValue()) {
            this.verticalWrapMax = new WeakReference<>(constraintAnchor);
        }
    }

    public void addVerticalWrapMinVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.verticalWrapMin;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > ((ConstraintAnchor) this.verticalWrapMin.get()).getFinalValue()) {
            this.verticalWrapMin = new WeakReference<>(constraintAnchor);
        }
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public boolean directMeasure(boolean z) {
        return this.mDependencyGraph.directMeasure(z);
    }

    public boolean directMeasureSetup(boolean z) {
        return this.mDependencyGraph.directMeasureSetup(z);
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        return this.mDependencyGraph.directMeasureWithOrientation(z, i);
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mSystem.fillMetrics(metrics);
    }

    public ArrayList<Guideline> getHorizontalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public BasicMeasure.Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public int getOptimizationLevel() {
        return this.mOptimizationLevel;
    }

    public LinearSystem getSystem() {
        return this.mSystem;
    }

    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList<Guideline> getVerticalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.mHeightMeasuredTooSmall;
    }

    public boolean isRtl() {
        return this.mIsRtl;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.mWidthMeasuredTooSmall;
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    public void layout() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        ? r6;
        boolean z3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i3 = 0;
        this.f103mX = 0;
        this.f104mY = 0;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        int size = this.mChildren.size();
        int max = Math.max(0, getWidth());
        int max2 = Math.max(0, getHeight());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.layouts++;
        }
        if (Optimizer.enabled(this.mOptimizationLevel, 1)) {
            Direct.solvingPass(this, getMeasurer());
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget = this.mChildren.get(i4);
                if (constraintWidget.isMeasureRequested() && !(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier) && !(constraintWidget instanceof VirtualLayout) && !constraintWidget.isInVirtualLayout()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidget.getDimensionBehaviour(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidget.getDimensionBehaviour(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (!(dimensionBehaviour4 == dimensionBehaviour6 && constraintWidget.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour5 == dimensionBehaviour6 && constraintWidget.mMatchConstraintDefaultHeight != 1)) {
                        measure(constraintWidget, this.mMeasurer, new BasicMeasure.Measure(), false);
                    }
                }
            }
        }
        if (size <= 2 || (!(dimensionBehaviour3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour2 == dimensionBehaviour) || !Optimizer.enabled(this.mOptimizationLevel, 1024) || !Grouping.simpleSolvingPass(this, getMeasurer()))) {
            i = max2;
            i2 = max;
            z = false;
        } else {
            if (dimensionBehaviour3 == dimensionBehaviour) {
                if (max >= getWidth() || max <= 0) {
                    max = getWidth();
                } else {
                    setWidth(max);
                    this.mWidthMeasuredTooSmall = true;
                }
            }
            if (dimensionBehaviour2 == dimensionBehaviour) {
                if (max2 >= getHeight() || max2 <= 0) {
                    max2 = getHeight();
                } else {
                    setHeight(max2);
                    this.mHeightMeasuredTooSmall = true;
                }
            }
            i = max2;
            i2 = max;
            z = true;
        }
        boolean z4 = optimizeFor(64) || optimizeFor(128);
        LinearSystem linearSystem = this.mSystem;
        linearSystem.graphOptimizer = false;
        linearSystem.newgraphOptimizer = false;
        if (this.mOptimizationLevel != 0 && z4) {
            linearSystem.newgraphOptimizer = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.mChildren;
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z5 = horizontalDimensionBehaviour == dimensionBehaviour7 || getVerticalDimensionBehaviour() == dimensionBehaviour7;
        resetChains();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget2 = this.mChildren.get(i5);
            if (constraintWidget2 instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget2).layout();
            }
        }
        boolean optimizeFor = optimizeFor(64);
        boolean z6 = z;
        int i6 = 0;
        boolean z7 = true;
        while (z7) {
            int i7 = i6 + 1;
            try {
                this.mSystem.reset();
                resetChains();
                createObjectVariables(this.mSystem);
                for (int i8 = i3; i8 < size; i8++) {
                    this.mChildren.get(i8).createObjectVariables(this.mSystem);
                }
                z7 = addChildrenToSolver(this.mSystem);
                WeakReference<ConstraintAnchor> weakReference = this.verticalWrapMin;
                if (!(weakReference == null || weakReference.get() == null)) {
                    addMinWrap((ConstraintAnchor) this.verticalWrapMin.get(), this.mSystem.createObjectVariable(this.mTop));
                    this.verticalWrapMin = null;
                }
                WeakReference<ConstraintAnchor> weakReference2 = this.verticalWrapMax;
                if (!(weakReference2 == null || weakReference2.get() == null)) {
                    addMaxWrap((ConstraintAnchor) this.verticalWrapMax.get(), this.mSystem.createObjectVariable(this.mBottom));
                    this.verticalWrapMax = null;
                }
                WeakReference<ConstraintAnchor> weakReference3 = this.horizontalWrapMin;
                if (!(weakReference3 == null || weakReference3.get() == null)) {
                    addMinWrap((ConstraintAnchor) this.horizontalWrapMin.get(), this.mSystem.createObjectVariable(this.mLeft));
                    this.horizontalWrapMin = null;
                }
                WeakReference<ConstraintAnchor> weakReference4 = this.horizontalWrapMax;
                if (!(weakReference4 == null || weakReference4.get() == null)) {
                    addMaxWrap((ConstraintAnchor) this.horizontalWrapMax.get(), this.mSystem.createObjectVariable(this.mRight));
                    this.horizontalWrapMax = null;
                }
                if (z7) {
                    this.mSystem.minimize();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            LinearSystem linearSystem2 = this.mSystem;
            if (z7) {
                updateChildrenFromSolver(linearSystem2, Optimizer.flags);
            } else {
                updateFromSolver(linearSystem2, optimizeFor);
                for (int i9 = 0; i9 < size; i9++) {
                    this.mChildren.get(i9).updateFromSolver(this.mSystem, optimizeFor);
                }
            }
            if (!z5 || i7 >= 8 || !Optimizer.flags[2]) {
                z2 = false;
            } else {
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    ConstraintWidget constraintWidget3 = this.mChildren.get(i12);
                    i10 = Math.max(i10, constraintWidget3.getWidth() + constraintWidget3.f103mX);
                    i11 = Math.max(i11, constraintWidget3.getHeight() + constraintWidget3.f104mY);
                }
                int max3 = Math.max(this.mMinWidth, i10);
                int max4 = Math.max(this.mMinHeight, i11);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour3 != dimensionBehaviour8 || getWidth() >= max3) {
                    z2 = false;
                } else {
                    setWidth(max3);
                    this.mListDimensionBehaviors[0] = dimensionBehaviour8;
                    z2 = true;
                    z6 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour8 && getHeight() < max4) {
                    setHeight(max4);
                    this.mListDimensionBehaviors[1] = dimensionBehaviour8;
                    z2 = true;
                    z6 = true;
                }
            }
            int max5 = Math.max(this.mMinWidth, getWidth());
            if (max5 > getWidth()) {
                setWidth(max5);
                this.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z2 = true;
                z6 = true;
            }
            int max6 = Math.max(this.mMinHeight, getHeight());
            if (max6 > getHeight()) {
                setHeight(max6);
                r6 = 1;
                this.mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                z2 = true;
                z3 = true;
            } else {
                r6 = 1;
                z3 = z6;
            }
            if (!z3) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = this.mListDimensionBehaviors[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour9 == dimensionBehaviour10 && i2 > 0 && getWidth() > i2) {
                    this.mWidthMeasuredTooSmall = r6;
                    this.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    setWidth(i2);
                    z2 = r6;
                    z3 = z2;
                }
                if (this.mListDimensionBehaviors[r6] == dimensionBehaviour10 && i > 0 && getHeight() > i) {
                    this.mHeightMeasuredTooSmall = r6;
                    this.mListDimensionBehaviors[r6] = ConstraintWidget.DimensionBehaviour.FIXED;
                    setHeight(i);
                    z6 = true;
                    z7 = true;
                    i6 = i7;
                    i3 = 0;
                }
            }
            z7 = z2;
            z6 = z3;
            i6 = i7;
            i3 = 0;
        }
        this.mChildren = arrayList;
        if (z6) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
            dimensionBehaviourArr2[0] = dimensionBehaviour3;
            dimensionBehaviourArr2[1] = dimensionBehaviour2;
        }
        resetSolverVariables(this.mSystem.getCache());
    }

    public long measure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.mPaddingLeft = i10;
        int i11 = i9;
        this.mPaddingTop = i11;
        return this.mBasicMeasureSolver.solverMeasure(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    public boolean optimizeFor(int i) {
        return (this.mOptimizationLevel & i) == i;
    }

    public void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
        this.mDependencyGraph.setMeasurer(measurer);
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        LinearSystem.USE_DEPENDENCY_ORDERING = optimizeFor(512);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    public void setRtl(boolean z) {
        this.mIsRtl = z;
    }

    public void updateChildrenFromSolver(LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        boolean optimizeFor = optimizeFor(64);
        updateFromSolver(linearSystem, optimizeFor);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromSolver(linearSystem, optimizeFor);
        }
    }

    public void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromRuns(z, z2);
        }
    }

    public void updateHierarchy() {
        this.mBasicMeasureSolver.updateHierarchy(this);
    }
}
