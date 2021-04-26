package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p005b.p096l.p097a.p113c.p131e.p140i.C2706a;
import p005b.p096l.p097a.p113c.p131e.p140i.C2894o0;

/* renamed from: b.l.a.c.h.b.d3 */
public final class C3146d3 extends C2706a implements C3170f3 {
    public C3146d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: A0 */
    public final void mo14157A0(C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, v9Var);
        mo13212k(4, g);
    }

    /* renamed from: B0 */
    public final void mo14158B0(C3118b bVar, C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, bVar);
        C2894o0.m5008b(g, v9Var);
        mo13212k(12, g);
    }

    /* renamed from: C0 */
    public final void mo14159C0(long j, String str, String str2, String str3) {
        Parcel g = mo13211g();
        g.writeLong(j);
        g.writeString(str);
        g.writeString(str2);
        g.writeString(str3);
        mo13212k(10, g);
    }

    /* renamed from: D */
    public final void mo14160D(C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, v9Var);
        mo13212k(20, g);
    }

    /* renamed from: K */
    public final void mo14161K(C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, v9Var);
        mo13212k(6, g);
    }

    /* renamed from: N0 */
    public final List<C3253m9> mo14162N0(String str, String str2, boolean z, C3352v9 v9Var) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        ClassLoader classLoader = C2894o0.f4920a;
        g.writeInt(z ? 1 : 0);
        C2894o0.m5008b(g, v9Var);
        Parcel n = mo13213n(14, g);
        ArrayList<C3253m9> createTypedArrayList = n.createTypedArrayList(C3253m9.CREATOR);
        n.recycle();
        return createTypedArrayList;
    }

    /* renamed from: Q */
    public final String mo14163Q(C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, v9Var);
        Parcel n = mo13213n(11, g);
        String readString = n.readString();
        n.recycle();
        return readString;
    }

    /* renamed from: Q0 */
    public final List<C3118b> mo14164Q0(String str, String str2, String str3) {
        Parcel g = mo13211g();
        g.writeString((String) null);
        g.writeString(str2);
        g.writeString(str3);
        Parcel n = mo13213n(17, g);
        ArrayList<C3118b> createTypedArrayList = n.createTypedArrayList(C3118b.CREATOR);
        n.recycle();
        return createTypedArrayList;
    }

    /* renamed from: T0 */
    public final void mo14165T0(C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, v9Var);
        mo13212k(18, g);
    }

    /* renamed from: W0 */
    public final void mo14166W0(C3253m9 m9Var, C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, m9Var);
        C2894o0.m5008b(g, v9Var);
        mo13212k(2, g);
    }

    /* renamed from: Y0 */
    public final void mo14167Y0(C3309s sVar, C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, sVar);
        C2894o0.m5008b(g, v9Var);
        mo13212k(1, g);
    }

    /* renamed from: b1 */
    public final List<C3253m9> mo14168b1(String str, String str2, String str3, boolean z) {
        Parcel g = mo13211g();
        g.writeString((String) null);
        g.writeString(str2);
        g.writeString(str3);
        ClassLoader classLoader = C2894o0.f4920a;
        g.writeInt(z ? 1 : 0);
        Parcel n = mo13213n(15, g);
        ArrayList<C3253m9> createTypedArrayList = n.createTypedArrayList(C3253m9.CREATOR);
        n.recycle();
        return createTypedArrayList;
    }

    /* renamed from: c1 */
    public final void mo14169c1(Bundle bundle, C3352v9 v9Var) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, bundle);
        C2894o0.m5008b(g, v9Var);
        mo13212k(19, g);
    }

    /* renamed from: l1 */
    public final byte[] mo14170l1(C3309s sVar, String str) {
        Parcel g = mo13211g();
        C2894o0.m5008b(g, sVar);
        g.writeString(str);
        Parcel n = mo13213n(9, g);
        byte[] createByteArray = n.createByteArray();
        n.recycle();
        return createByteArray;
    }

    /* renamed from: r */
    public final List<C3118b> mo14171r(String str, String str2, C3352v9 v9Var) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        C2894o0.m5008b(g, v9Var);
        Parcel n = mo13213n(16, g);
        ArrayList<C3118b> createTypedArrayList = n.createTypedArrayList(C3118b.CREATOR);
        n.recycle();
        return createTypedArrayList;
    }
}
