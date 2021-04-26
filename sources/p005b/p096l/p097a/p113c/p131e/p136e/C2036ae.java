package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.e.ae */
public final class C2036ae extends C1948a {
    public static final Parcelable.Creator<C2036ae> CREATOR = new C2061be();

    /* renamed from: g */
    public final String f3587g;

    /* renamed from: h */
    public final String f3588h;
    @Nullable

    /* renamed from: i */
    public final String f3589i;

    /* renamed from: j */
    public final long f3590j;

    /* renamed from: k */
    public final boolean f3591k;

    /* renamed from: l */
    public final boolean f3592l;
    @Nullable

    /* renamed from: m */
    public final String f3593m;
    @Nullable

    /* renamed from: n */
    public final String f3594n;

    /* renamed from: o */
    public final boolean f3595o;

    public C2036ae(String str, String str2, @Nullable String str3, long j, boolean z, boolean z2, @Nullable String str4, @Nullable String str5, boolean z3) {
        this.f3587g = str;
        this.f3588h = str2;
        this.f3589i = str3;
        this.f3590j = j;
        this.f3591k = z;
        this.f3592l = z2;
        this.f3593m = str4;
        this.f3594n = str5;
        this.f3595o = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3587g, false);
        C0823f.m395s0(parcel, 2, this.f3588h, false);
        C0823f.m395s0(parcel, 3, this.f3589i, false);
        long j = this.f3590j;
        C0823f.m333B0(parcel, 4, 8);
        parcel.writeLong(j);
        boolean z = this.f3591k;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3592l;
        C0823f.m333B0(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m395s0(parcel, 7, this.f3593m, false);
        C0823f.m395s0(parcel, 8, this.f3594n, false);
        boolean z3 = this.f3595o;
        C0823f.m333B0(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
