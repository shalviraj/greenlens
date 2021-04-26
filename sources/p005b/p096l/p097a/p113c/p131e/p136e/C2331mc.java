package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.mc */
public final class C2331mc extends C1948a {
    public static final Parcelable.Creator<C2331mc> CREATOR = new C2355nc();

    /* renamed from: g */
    public final String f4065g;

    /* renamed from: h */
    public final String f4066h;
    @Nullable

    /* renamed from: i */
    public final String f4067i;

    public C2331mc(String str, String str2, @Nullable String str3) {
        this.f4065g = str;
        this.f4066h = str2;
        this.f4067i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f4065g, false);
        C0823f.m395s0(parcel, 2, this.f4066h, false);
        C0823f.m395s0(parcel, 3, this.f4067i, false);
        C0823f.m331A0(parcel, w0);
    }
}
