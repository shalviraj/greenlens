package androidx.constraintlayout.solver;

import java.util.ArrayList;
import p005b.p035e.p036a.p037a.C0843a;

public class Metrics {
    public long additionalMeasures;
    public long barrierConnectionResolved;
    public long bfs;
    public long centerConnectionResolved;
    public long chainConnectionResolved;
    public long constraints;
    public long determineGroups;
    public long errors;
    public long extravariables;
    public long fullySolved;
    public long graphOptimizer;
    public long graphSolved;
    public long grouping;
    public long infeasibleDetermineGroups;
    public long iterations;
    public long lastTableSize;
    public long layouts;
    public long linearSolved;
    public long matchConnectionResolved;
    public long maxRows;
    public long maxTableSize;
    public long maxVariables;
    public long measuredMatchWidgets;
    public long measuredWidgets;
    public long measures;
    public long measuresLayoutDuration;
    public long measuresWidgetsDuration;
    public long measuresWrap;
    public long measuresWrapInfeasible;
    public long minimize;
    public long minimizeGoal;
    public long nonresolvedWidgets;
    public long oldresolvedWidgets;
    public long optimize;
    public long pivots;
    public ArrayList<String> problematicLayouts = new ArrayList<>();
    public long resolutions;
    public long resolvedWidgets;
    public long simpleconstraints;
    public long slackvariables;
    public long tableSizeIncrease;
    public long variables;
    public long widgets;

    public void reset() {
        this.measures = 0;
        this.widgets = 0;
        this.additionalMeasures = 0;
        this.resolutions = 0;
        this.tableSizeIncrease = 0;
        this.maxTableSize = 0;
        this.lastTableSize = 0;
        this.maxVariables = 0;
        this.maxRows = 0;
        this.minimize = 0;
        this.minimizeGoal = 0;
        this.constraints = 0;
        this.simpleconstraints = 0;
        this.optimize = 0;
        this.iterations = 0;
        this.pivots = 0;
        this.bfs = 0;
        this.variables = 0;
        this.errors = 0;
        this.slackvariables = 0;
        this.extravariables = 0;
        this.fullySolved = 0;
        this.graphOptimizer = 0;
        this.graphSolved = 0;
        this.resolvedWidgets = 0;
        this.oldresolvedWidgets = 0;
        this.nonresolvedWidgets = 0;
        this.centerConnectionResolved = 0;
        this.matchConnectionResolved = 0;
        this.chainConnectionResolved = 0;
        this.barrierConnectionResolved = 0;
        this.problematicLayouts.clear();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("\n*** Metrics ***\nmeasures: ");
        u.append(this.measures);
        u.append("\nmeasuresWrap: ");
        u.append(this.measuresWrap);
        u.append("\nmeasuresWrapInfeasible: ");
        u.append(this.measuresWrapInfeasible);
        u.append("\ndetermineGroups: ");
        u.append(this.determineGroups);
        u.append("\ninfeasibleDetermineGroups: ");
        u.append(this.infeasibleDetermineGroups);
        u.append("\ngraphOptimizer: ");
        u.append(this.graphOptimizer);
        u.append("\nwidgets: ");
        u.append(this.widgets);
        u.append("\ngraphSolved: ");
        u.append(this.graphSolved);
        u.append("\nlinearSolved: ");
        u.append(this.linearSolved);
        u.append("\n");
        return u.toString();
    }
}