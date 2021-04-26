package com.segment.analytics;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;

public class StatsSnapshot {
    public final long flushCount;
    public final long flushEventCount;
    public final float integrationOperationAverageDuration;
    public final long integrationOperationCount;
    public final long integrationOperationDuration;
    public final Map<String, Long> integrationOperationDurationByIntegration;
    public final long timestamp;

    public StatsSnapshot(long j, long j2, long j3, long j4, long j5, Map<String, Long> map) {
        this.timestamp = j;
        this.flushCount = j2;
        this.flushEventCount = j3;
        this.integrationOperationCount = j4;
        this.integrationOperationDuration = j5;
        this.integrationOperationAverageDuration = j4 == 0 ? 0.0f : ((float) j5) / ((float) j4);
        this.integrationOperationDurationByIntegration = map;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("StatsSnapshot{timestamp=");
        u.append(this.timestamp);
        u.append(", flushCount=");
        u.append(this.flushCount);
        u.append(", flushEventCount=");
        u.append(this.flushEventCount);
        u.append(", integrationOperationCount=");
        u.append(this.integrationOperationCount);
        u.append(", integrationOperationDuration=");
        u.append(this.integrationOperationDuration);
        u.append(", integrationOperationAverageDuration=");
        u.append(this.integrationOperationAverageDuration);
        u.append(", integrationOperationDurationByIntegration=");
        u.append(this.integrationOperationDurationByIntegration);
        u.append('}');
        return u.toString();
    }
}
