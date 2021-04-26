package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.ji */
public final class C2265ji extends C2021a implements C2313li {
    public C2265ji(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    /* renamed from: H */
    public final void mo12395H(C2506tj tjVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, tjVar);
        mo12340k(3, n);
    }

    /* renamed from: H0 */
    public final void mo12396H0(String str) {
        Parcel n = mo12341n();
        n.writeString(str);
        mo12340k(11, n);
    }

    /* renamed from: I */
    public final void mo12397I(C3938x xVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, xVar);
        mo12340k(10, n);
    }

    /* renamed from: O */
    public final void mo12398O(C2381oe oeVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, oeVar);
        mo12340k(14, n);
    }

    /* renamed from: Z0 */
    public final void mo12399Z0(Status status) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, status);
        mo12340k(5, n);
    }

    /* renamed from: f */
    public final void mo12400f() {
        mo12340k(6, mo12341n());
    }

    /* renamed from: f1 */
    public final void mo12401f1(C2363nk nkVar, C2192gk gkVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, nkVar);
        C2250j3.m3550b(n, gkVar);
        mo12340k(2, n);
    }

    /* renamed from: h */
    public final void mo12402h() {
        mo12340k(7, mo12341n());
    }

    /* renamed from: i1 */
    public final void mo12403i1(Status status, C3938x xVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, status);
        C2250j3.m3550b(n, xVar);
        mo12340k(12, n);
    }

    /* renamed from: l */
    public final void mo12405l() {
        mo12340k(13, mo12341n());
    }

    /* renamed from: l0 */
    public final void mo12406l0(C2429qe qeVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, qeVar);
        mo12340k(15, n);
    }

    /* renamed from: m */
    public final void mo12407m(String str) {
        Parcel n = mo12341n();
        n.writeString(str);
        mo12340k(9, n);
    }

    /* renamed from: m0 */
    public final void mo12408m0(String str) {
        Parcel n = mo12341n();
        n.writeString(str);
        mo12340k(8, n);
    }

    /* renamed from: t */
    public final void mo12409t(C2627yk ykVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, ykVar);
        mo12340k(4, n);
    }

    /* renamed from: v0 */
    public final void mo12410v0(C2363nk nkVar) {
        Parcel n = mo12341n();
        C2250j3.m3550b(n, nkVar);
        mo12340k(1, n);
    }
}
