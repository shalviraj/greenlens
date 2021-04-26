package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3940y;

/* renamed from: b.l.a.c.e.e.ce */
public final class C2086ce extends C1948a {
    public static final Parcelable.Creator<C2086ce> CREATOR = new C2111de();

    /* renamed from: g */
    public final C3940y f3661g;

    /* renamed from: h */
    public final String f3662h;
    @Nullable

    /* renamed from: i */
    public final String f3663i;

    /* renamed from: j */
    public final long f3664j;

    /* renamed from: k */
    public final boolean f3665k;

    /* renamed from: l */
    public final boolean f3666l;
    @Nullable

    /* renamed from: m */
    public final String f3667m;
    @Nullable

    /* renamed from: n */
    public final String f3668n;

    /* renamed from: o */
    public final boolean f3669o;

    public C2086ce(C3940y yVar, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, boolean z3) {
        this.f3661g = yVar;
        this.f3662h = str;
        this.f3663i = str2;
        this.f3664j = j;
        this.f3665k = z;
        this.f3666l = z2;
        this.f3667m = str3;
        this.f3668n = str4;
        this.f3669o = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f3661g, i, false);
        C0823f.m395s0(parcel, 2, this.f3662h, false);
        C0823f.m395s0(parcel, 3, this.f3663i, false);
        long j = this.f3664j;
        C0823f.m333B0(parcel, 4, 8);
        parcel.writeLong(j);
        boolean z = this.f3665k;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3666l;
        C0823f.m333B0(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m395s0(parcel, 7, this.f3667m, false);
        C0823f.m395s0(parcel, 8, this.f3668n, false);
        boolean z3 = this.f3669o;
        C0823f.m333B0(parcel, 9, 4);
        parcel.writeInt(z3 ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
