package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p129c.C1980b;

/* renamed from: b.l.a.c.e.i.rb */
public final class C2944rb extends C2706a implements C2996vb {
    public C2944rb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeLong(j);
        mo13212k(23, g);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        C2894o0.m5008b(g, bundle);
        mo13212k(9, g);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeLong(j);
        mo13212k(24, g);
    }

    public final void generateEventId(C3035yb ybVar) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, ybVar);
        mo13212k(22, g);
    }

    public final void getCachedAppInstanceId(C3035yb ybVar) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, ybVar);
        mo13212k(19, g);
    }

    public final void getConditionalUserProperties(String str, String str2, C3035yb ybVar) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        C2894o0.m5009c(g, ybVar);
        mo13212k(10, g);
    }

    public final void getCurrentScreenClass(C3035yb ybVar) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, ybVar);
        mo13212k(17, g);
    }

    public final void getCurrentScreenName(C3035yb ybVar) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, ybVar);
        mo13212k(16, g);
    }

    public final void getGmpAppId(C3035yb ybVar) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, ybVar);
        mo13212k(21, g);
    }

    public final void getMaxUserProperties(String str, C3035yb ybVar) {
        Parcel g = mo13211g();
        g.writeString(str);
        C2894o0.m5009c(g, ybVar);
        mo13212k(6, g);
    }

    public final void getUserProperties(String str, String str2, boolean z, C3035yb ybVar) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        ClassLoader classLoader = C2894o0.f4920a;
        g.writeInt(z ? 1 : 0);
        C2894o0.m5009c(g, ybVar);
        mo13212k(5, g);
    }

    public final void initialize(C1980b bVar, C2775ec ecVar, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        C2894o0.m5008b(g, ecVar);
        g.writeLong(j);
        mo13212k(1, g);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        C2894o0.m5008b(g, bundle);
        g.writeInt(z ? 1 : 0);
        g.writeInt(z2 ? 1 : 0);
        g.writeLong(j);
        mo13212k(2, g);
    }

    public final void logHealthData(int i, String str, C1980b bVar, C1980b bVar2, C1980b bVar3) {
        Parcel g = mo13211g();
        g.writeInt(5);
        g.writeString(str);
        C2894o0.m5009c(g, bVar);
        C2894o0.m5009c(g, bVar2);
        C2894o0.m5009c(g, bVar3);
        mo13212k(33, g);
    }

    public final void onActivityCreated(C1980b bVar, Bundle bundle, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        C2894o0.m5008b(g, bundle);
        g.writeLong(j);
        mo13212k(27, g);
    }

    public final void onActivityDestroyed(C1980b bVar, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        g.writeLong(j);
        mo13212k(28, g);
    }

    public final void onActivityPaused(C1980b bVar, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        g.writeLong(j);
        mo13212k(29, g);
    }

    public final void onActivityResumed(C1980b bVar, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        g.writeLong(j);
        mo13212k(30, g);
    }

    public final void onActivitySaveInstanceState(C1980b bVar, C3035yb ybVar, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        C2894o0.m5009c(g, ybVar);
        g.writeLong(j);
        mo13212k(31, g);
    }

    public final void onActivityStarted(C1980b bVar, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        g.writeLong(j);
        mo13212k(25, g);
    }

    public final void onActivityStopped(C1980b bVar, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        g.writeLong(j);
        mo13212k(26, g);
    }

    public final void registerOnMeasurementEventListener(C2733bc bcVar) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bcVar);
        mo13212k(35, g);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, bundle);
        g.writeLong(j);
        mo13212k(8, g);
    }

    public final void setCurrentScreen(C1980b bVar, String str, String str2, long j) {
        Parcel g = mo13211g();
        C2894o0.m5009c(g, bVar);
        g.writeString(str);
        g.writeString(str2);
        g.writeLong(j);
        mo13212k(15, g);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel g = mo13211g();
        ClassLoader classLoader = C2894o0.f4920a;
        g.writeInt(z ? 1 : 0);
        mo13212k(39, g);
    }

    public final void setUserProperty(String str, String str2, C1980b bVar, boolean z, long j) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        C2894o0.m5009c(g, bVar);
        g.writeInt(z ? 1 : 0);
        g.writeLong(j);
        mo13212k(4, g);
    }
}
