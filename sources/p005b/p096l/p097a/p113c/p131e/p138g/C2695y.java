package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1903c;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p141f.C3058i;

/* renamed from: b.l.a.c.e.g.y */
public final class C2695y extends C1948a {
    public static final Parcelable.Creator<C2695y> CREATOR = new C2696z();

    /* renamed from: j */
    public static final List<C1903c> f4590j = Collections.emptyList();

    /* renamed from: k */
    public static final C3058i f4591k = new C3058i();

    /* renamed from: g */
    public C3058i f4592g;

    /* renamed from: h */
    public List<C1903c> f4593h;
    @Nullable

    /* renamed from: i */
    public String f4594i;

    public C2695y(C3058i iVar, List<C1903c> list, String str) {
        this.f4592g = iVar;
        this.f4593h = list;
        this.f4594i = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2695y)) {
            return false;
        }
        C2695y yVar = (C2695y) obj;
        return C0823f.m330A(this.f4592g, yVar.f4592g) && C0823f.m330A(this.f4593h, yVar.f4593h) && C0823f.m330A(this.f4594i, yVar.f4594i);
    }

    public final int hashCode() {
        return this.f4592g.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4592g, i, false);
        C0823f.m401v0(parcel, 2, this.f4593h, false);
        C0823f.m395s0(parcel, 3, this.f4594i, false);
        C0823f.m331A0(parcel, w0);
    }
}
