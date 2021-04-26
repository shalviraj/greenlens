package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1903c;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.g.r */
public final class C2688r extends C1948a {
    public static final Parcelable.Creator<C2688r> CREATOR = new C2689s();

    /* renamed from: n */
    public static final List<C1903c> f4572n = Collections.emptyList();

    /* renamed from: g */
    public LocationRequest f4573g;

    /* renamed from: h */
    public List<C1903c> f4574h;
    @Nullable

    /* renamed from: i */
    public String f4575i;

    /* renamed from: j */
    public boolean f4576j;

    /* renamed from: k */
    public boolean f4577k;

    /* renamed from: l */
    public boolean f4578l;
    @Nullable

    /* renamed from: m */
    public String f4579m;

    public C2688r(LocationRequest locationRequest, List<C1903c> list, @Nullable String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f4573g = locationRequest;
        this.f4574h = list;
        this.f4575i = str;
        this.f4576j = z;
        this.f4577k = z2;
        this.f4578l = z3;
        this.f4579m = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2688r)) {
            return false;
        }
        C2688r rVar = (C2688r) obj;
        return C0823f.m330A(this.f4573g, rVar.f4573g) && C0823f.m330A(this.f4574h, rVar.f4574h) && C0823f.m330A(this.f4575i, rVar.f4575i) && this.f4576j == rVar.f4576j && this.f4577k == rVar.f4577k && this.f4578l == rVar.f4578l && C0823f.m330A(this.f4579m, rVar.f4579m);
    }

    public final int hashCode() {
        return this.f4573g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4573g);
        if (this.f4575i != null) {
            sb.append(" tag=");
            sb.append(this.f4575i);
        }
        if (this.f4579m != null) {
            sb.append(" moduleId=");
            sb.append(this.f4579m);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f4576j);
        sb.append(" clients=");
        sb.append(this.f4574h);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f4577k);
        if (this.f4578l) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4573g, i, false);
        C0823f.m401v0(parcel, 5, this.f4574h, false);
        C0823f.m395s0(parcel, 6, this.f4575i, false);
        boolean z = this.f4576j;
        C0823f.m333B0(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f4577k;
        C0823f.m333B0(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f4578l;
        C0823f.m333B0(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        C0823f.m395s0(parcel, 10, this.f4579m, false);
        C0823f.m331A0(parcel, w0);
    }
}
