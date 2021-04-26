package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.tk */
public final class C2507tk extends C1948a {
    public static final Parcelable.Creator<C2507tk> CREATOR = new C2531uk();

    /* renamed from: g */
    public String f4322g;

    /* renamed from: h */
    public String f4323h;

    /* renamed from: i */
    public String f4324i;

    /* renamed from: j */
    public String f4325j;

    /* renamed from: k */
    public String f4326k;

    /* renamed from: l */
    public String f4327l;

    /* renamed from: m */
    public String f4328m;

    public C2507tk() {
    }

    public C2507tk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f4322g = str;
        this.f4323h = str2;
        this.f4324i = str3;
        this.f4325j = str4;
        this.f4326k = str5;
        this.f4327l = str6;
        this.f4328m = str7;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f4322g, false);
        C0823f.m395s0(parcel, 3, this.f4323h, false);
        C0823f.m395s0(parcel, 4, this.f4324i, false);
        C0823f.m395s0(parcel, 5, this.f4325j, false);
        C0823f.m395s0(parcel, 6, this.f4326k, false);
        C0823f.m395s0(parcel, 7, this.f4327l, false);
        C0823f.m395s0(parcel, 8, this.f4328m, false);
        C0823f.m331A0(parcel, w0);
    }
}
