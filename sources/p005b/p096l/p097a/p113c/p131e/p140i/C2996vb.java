package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p005b.p096l.p097a.p113c.p129c.C1980b;

/* renamed from: b.l.a.c.e.i.vb */
public interface C2996vb extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C3035yb ybVar);

    void getAppInstanceId(C3035yb ybVar);

    void getCachedAppInstanceId(C3035yb ybVar);

    void getConditionalUserProperties(String str, String str2, C3035yb ybVar);

    void getCurrentScreenClass(C3035yb ybVar);

    void getCurrentScreenName(C3035yb ybVar);

    void getGmpAppId(C3035yb ybVar);

    void getMaxUserProperties(String str, C3035yb ybVar);

    void getTestFlag(C3035yb ybVar, int i);

    void getUserProperties(String str, String str2, boolean z, C3035yb ybVar);

    void initForTests(Map map);

    void initialize(C1980b bVar, C2775ec ecVar, long j);

    void isDataCollectionEnabled(C3035yb ybVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C3035yb ybVar, long j);

    void logHealthData(int i, String str, C1980b bVar, C1980b bVar2, C1980b bVar3);

    void onActivityCreated(C1980b bVar, Bundle bundle, long j);

    void onActivityDestroyed(C1980b bVar, long j);

    void onActivityPaused(C1980b bVar, long j);

    void onActivityResumed(C1980b bVar, long j);

    void onActivitySaveInstanceState(C1980b bVar, C3035yb ybVar, long j);

    void onActivityStarted(C1980b bVar, long j);

    void onActivityStopped(C1980b bVar, long j);

    void performAction(Bundle bundle, C3035yb ybVar, long j);

    void registerOnMeasurementEventListener(C2733bc bcVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(C1980b bVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C2733bc bcVar);

    void setInstanceIdProvider(C2761dc dcVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C1980b bVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C2733bc bcVar);
}
