package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3854a;

/* renamed from: b.l.a.c.e.e.gd */
public final class C2185gd extends C1948a {
    public static final Parcelable.Creator<C2185gd> CREATOR = new C2210hd();

    /* renamed from: g */
    public final String f3878g;
    @Nullable

    /* renamed from: h */
    public final C3854a f3879h;

    public C2185gd(String str, @Nullable C3854a aVar) {
        this.f3878g = str;
        this.f3879h = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3878g, false);
        C0823f.m393r0(parcel, 2, this.f3879h, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
