package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3919n0;
import p005b.p096l.p180d.p185o.C3930t;
import p005b.p096l.p180d.p185o.C3932u;
import p005b.p096l.p180d.p185o.C3940y;

/* renamed from: b.l.d.o.e0.e */
public final class C3872e extends C3932u {
    public static final Parcelable.Creator<C3872e> CREATOR = new C3874f();

    /* renamed from: g */
    public final List<C3940y> f7123g = new ArrayList();

    /* renamed from: h */
    public final C3876g f7124h;

    /* renamed from: i */
    public final String f7125i;

    /* renamed from: j */
    public final C3919n0 f7126j;

    /* renamed from: k */
    public final C3883j0 f7127k;

    public C3872e(List<C3940y> list, C3876g gVar, String str, @Nullable C3919n0 n0Var, @Nullable C3883j0 j0Var) {
        for (C3930t next : list) {
            if (next instanceof C3940y) {
                this.f7123g.add((C3940y) next);
            }
        }
        Objects.requireNonNull(gVar, "null reference");
        this.f7124h = gVar;
        C0823f.m376j(str);
        this.f7125i = str;
        this.f7126j = n0Var;
        this.f7127k = j0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m401v0(parcel, 1, this.f7123g, false);
        C0823f.m393r0(parcel, 2, this.f7124h, i, false);
        C0823f.m395s0(parcel, 3, this.f7125i, false);
        C0823f.m393r0(parcel, 4, this.f7126j, i, false);
        C0823f.m393r0(parcel, 5, this.f7127k, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
