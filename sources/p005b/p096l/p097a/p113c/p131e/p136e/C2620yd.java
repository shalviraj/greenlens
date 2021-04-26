package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.yd */
public final class C2620yd extends C1948a {
    public static final Parcelable.Creator<C2620yd> CREATOR = new C2644zd();

    /* renamed from: g */
    public final C3938x f4485g;
    @Nullable

    /* renamed from: h */
    public final String f4486h;

    public C2620yd(C3938x xVar, @Nullable String str) {
        this.f4485g = xVar;
        this.f4486h = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4485g, i, false);
        C0823f.m395s0(parcel, 2, this.f4486h, false);
        C0823f.m331A0(parcel, w0);
    }
}
