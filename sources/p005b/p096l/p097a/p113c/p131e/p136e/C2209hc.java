package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.hc */
public final class C2209hc extends C1948a {
    public static final Parcelable.Creator<C2209hc> CREATOR = new C2234ic();

    /* renamed from: g */
    public final String f3914g;
    @Nullable

    /* renamed from: h */
    public final String f3915h;

    public C2209hc(String str, @Nullable String str2) {
        this.f3914g = str;
        this.f3915h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3914g, false);
        C0823f.m395s0(parcel, 2, this.f3915h, false);
        C0823f.m331A0(parcel, w0);
    }
}
