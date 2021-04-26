package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.h.b.v9 */
public final class C3352v9 extends C1948a {
    public static final Parcelable.Creator<C3352v9> CREATOR = new C3363w9();
    @Nullable

    /* renamed from: A */
    public final String f6027A;

    /* renamed from: B */
    public final String f6028B;
    @Nullable

    /* renamed from: g */
    public final String f6029g;
    @Nullable

    /* renamed from: h */
    public final String f6030h;
    @Nullable

    /* renamed from: i */
    public final String f6031i;
    @Nullable

    /* renamed from: j */
    public final String f6032j;

    /* renamed from: k */
    public final long f6033k;

    /* renamed from: l */
    public final long f6034l;
    @Nullable

    /* renamed from: m */
    public final String f6035m;

    /* renamed from: n */
    public final boolean f6036n;

    /* renamed from: o */
    public final boolean f6037o;

    /* renamed from: p */
    public final long f6038p;
    @Nullable

    /* renamed from: q */
    public final String f6039q;

    /* renamed from: r */
    public final long f6040r;

    /* renamed from: s */
    public final long f6041s;

    /* renamed from: t */
    public final int f6042t;

    /* renamed from: u */
    public final boolean f6043u;

    /* renamed from: v */
    public final boolean f6044v;
    @Nullable

    /* renamed from: w */
    public final String f6045w;
    @Nullable

    /* renamed from: x */
    public final Boolean f6046x;

    /* renamed from: y */
    public final long f6047y;
    @Nullable

    /* renamed from: z */
    public final List<String> f6048z;

    public C3352v9(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List<String> list, @Nullable String str8, String str9) {
        C0823f.m376j(str);
        this.f6029g = str;
        this.f6030h = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f6031i = str3;
        this.f6038p = j;
        this.f6032j = str4;
        this.f6033k = j2;
        this.f6034l = j3;
        this.f6035m = str5;
        this.f6036n = z;
        this.f6037o = z2;
        this.f6039q = str6;
        this.f6040r = j4;
        this.f6041s = j5;
        this.f6042t = i;
        this.f6043u = z3;
        this.f6044v = z4;
        this.f6045w = str7;
        this.f6046x = bool;
        this.f6047y = j6;
        this.f6048z = list;
        this.f6027A = str8;
        this.f6028B = str9;
    }

    public C3352v9(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, long j2, @Nullable String str5, boolean z, boolean z2, long j3, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List<String> list, @Nullable String str8, String str9) {
        this.f6029g = str;
        this.f6030h = str2;
        this.f6031i = str3;
        this.f6038p = j3;
        this.f6032j = str4;
        this.f6033k = j;
        this.f6034l = j2;
        this.f6035m = str5;
        this.f6036n = z;
        this.f6037o = z2;
        this.f6039q = str6;
        this.f6040r = j4;
        this.f6041s = j5;
        this.f6042t = i;
        this.f6043u = z3;
        this.f6044v = z4;
        this.f6045w = str7;
        this.f6046x = bool;
        this.f6047y = j6;
        this.f6048z = list;
        this.f6027A = str8;
        this.f6028B = str9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f6029g, false);
        C0823f.m395s0(parcel, 3, this.f6030h, false);
        C0823f.m395s0(parcel, 4, this.f6031i, false);
        C0823f.m395s0(parcel, 5, this.f6032j, false);
        long j = this.f6033k;
        C0823f.m333B0(parcel, 6, 8);
        parcel.writeLong(j);
        long j2 = this.f6034l;
        C0823f.m333B0(parcel, 7, 8);
        parcel.writeLong(j2);
        C0823f.m395s0(parcel, 8, this.f6035m, false);
        boolean z = this.f6036n;
        C0823f.m333B0(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f6037o;
        C0823f.m333B0(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j3 = this.f6038p;
        C0823f.m333B0(parcel, 11, 8);
        parcel.writeLong(j3);
        C0823f.m395s0(parcel, 12, this.f6039q, false);
        long j4 = this.f6040r;
        C0823f.m333B0(parcel, 13, 8);
        parcel.writeLong(j4);
        long j5 = this.f6041s;
        C0823f.m333B0(parcel, 14, 8);
        parcel.writeLong(j5);
        int i2 = this.f6042t;
        C0823f.m333B0(parcel, 15, 4);
        parcel.writeInt(i2);
        boolean z3 = this.f6043u;
        C0823f.m333B0(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.f6044v;
        C0823f.m333B0(parcel, 18, 4);
        parcel.writeInt(z4 ? 1 : 0);
        C0823f.m395s0(parcel, 19, this.f6045w, false);
        C0823f.m383m0(parcel, 21, this.f6046x, false);
        long j6 = this.f6047y;
        C0823f.m333B0(parcel, 22, 8);
        parcel.writeLong(j6);
        C0823f.m397t0(parcel, 23, this.f6048z, false);
        C0823f.m395s0(parcel, 24, this.f6027A, false);
        C0823f.m395s0(parcel, 25, this.f6028B, false);
        C0823f.m331A0(parcel, w0);
    }
}
