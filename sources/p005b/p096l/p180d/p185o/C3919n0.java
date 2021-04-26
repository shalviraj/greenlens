package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p136e.C2364nl;
import p005b.p096l.p097a.p113c.p131e.p136e.C2459rk;

/* renamed from: b.l.d.o.n0 */
public final class C3919n0 extends C3936w {
    public static final Parcelable.Creator<C3919n0> CREATOR = new C3921o0();

    /* renamed from: g */
    public final String f7190g;
    @Nullable

    /* renamed from: h */
    public final String f7191h;
    @Nullable

    /* renamed from: i */
    public final String f7192i;
    @Nullable

    /* renamed from: j */
    public final C2364nl f7193j;
    @Nullable

    /* renamed from: k */
    public final String f7194k;
    @Nullable

    /* renamed from: l */
    public final String f7195l;
    @Nullable

    /* renamed from: m */
    public final String f7196m;

    public C3919n0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable C2364nl nlVar, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        int i = C2459rk.f4267a;
        this.f7190g = str == null ? "" : str;
        this.f7191h = str2;
        this.f7192i = str3;
        this.f7193j = nlVar;
        this.f7194k = str4;
        this.f7195l = str5;
        this.f7196m = str6;
    }

    /* renamed from: W */
    public static C3919n0 m7290W(C2364nl nlVar) {
        C0823f.m380l(nlVar, "Must specify a non-null webSignInCredential");
        return new C3919n0((String) null, (String) null, (String) null, nlVar, (String) null, (String) null, (String) null);
    }

    /* renamed from: V */
    public final C3859c mo15437V() {
        return new C3919n0(this.f7190g, this.f7191h, this.f7192i, this.f7193j, this.f7194k, this.f7195l, this.f7196m);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7190g, false);
        C0823f.m395s0(parcel, 2, this.f7191h, false);
        C0823f.m395s0(parcel, 3, this.f7192i, false);
        C0823f.m393r0(parcel, 4, this.f7193j, i, false);
        C0823f.m395s0(parcel, 5, this.f7194k, false);
        C0823f.m395s0(parcel, 6, this.f7195l, false);
        C0823f.m395s0(parcel, 7, this.f7196m, false);
        C0823f.m331A0(parcel, w0);
    }
}
