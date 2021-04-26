package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3854a;

/* renamed from: b.l.a.c.e.e.id */
public final class C2235id extends C1948a {
    public static final Parcelable.Creator<C2235id> CREATOR = new C2260jd();

    /* renamed from: g */
    public final String f3934g;

    /* renamed from: h */
    public final C3854a f3935h;
    @Nullable

    /* renamed from: i */
    public final String f3936i;

    public C2235id(String str, C3854a aVar, @Nullable String str2) {
        this.f3934g = str;
        this.f3935h = aVar;
        this.f3936i = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3934g, false);
        C0823f.m393r0(parcel, 2, this.f3935h, i, false);
        C0823f.m395s0(parcel, 3, this.f3936i, false);
        C0823f.m331A0(parcel, w0);
    }
}
