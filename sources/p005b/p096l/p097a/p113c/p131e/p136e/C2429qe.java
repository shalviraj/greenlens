package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.qe */
public final class C2429qe extends C1948a {
    public static final Parcelable.Creator<C2429qe> CREATOR = new C2453re();

    /* renamed from: g */
    public final String f4232g;

    /* renamed from: h */
    public final List<C2435qk> f4233h;

    /* renamed from: i */
    public final C3919n0 f4234i;

    public C2429qe(String str, List<C2435qk> list, @Nullable C3919n0 n0Var) {
        this.f4232g = str;
        this.f4233h = list;
        this.f4234i = n0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f4232g, false);
        C0823f.m401v0(parcel, 2, this.f4233h, false);
        C0823f.m393r0(parcel, 3, this.f4234i, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
