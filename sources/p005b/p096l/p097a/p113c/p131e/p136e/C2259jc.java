package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.jc */
public final class C2259jc extends C1948a {
    public static final Parcelable.Creator<C2259jc> CREATOR = new C2307lc();

    /* renamed from: g */
    public final String f3959g;

    /* renamed from: h */
    public final String f3960h;
    @Nullable

    /* renamed from: i */
    public final String f3961i;

    public C2259jc(String str, String str2, @Nullable String str3) {
        this.f3959g = str;
        this.f3960h = str2;
        this.f3961i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3959g, false);
        C0823f.m395s0(parcel, 2, this.f3960h, false);
        C0823f.m395s0(parcel, 3, this.f3961i, false);
        C0823f.m331A0(parcel, w0);
    }
}
