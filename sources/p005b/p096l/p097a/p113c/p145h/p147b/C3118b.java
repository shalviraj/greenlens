package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.h.b.b */
public final class C3118b extends C1948a {
    public static final Parcelable.Creator<C3118b> CREATOR = new C3130c();
    @Nullable

    /* renamed from: g */
    public String f5302g;

    /* renamed from: h */
    public String f5303h;

    /* renamed from: i */
    public C3253m9 f5304i;

    /* renamed from: j */
    public long f5305j;

    /* renamed from: k */
    public boolean f5306k;
    @Nullable

    /* renamed from: l */
    public String f5307l;
    @Nullable

    /* renamed from: m */
    public final C3309s f5308m;

    /* renamed from: n */
    public long f5309n;
    @Nullable

    /* renamed from: o */
    public C3309s f5310o;

    /* renamed from: p */
    public final long f5311p;
    @Nullable

    /* renamed from: q */
    public final C3309s f5312q;

    public C3118b(C3118b bVar) {
        this.f5302g = bVar.f5302g;
        this.f5303h = bVar.f5303h;
        this.f5304i = bVar.f5304i;
        this.f5305j = bVar.f5305j;
        this.f5306k = bVar.f5306k;
        this.f5307l = bVar.f5307l;
        this.f5308m = bVar.f5308m;
        this.f5309n = bVar.f5309n;
        this.f5310o = bVar.f5310o;
        this.f5311p = bVar.f5311p;
        this.f5312q = bVar.f5312q;
    }

    public C3118b(@Nullable String str, String str2, C3253m9 m9Var, long j, boolean z, @Nullable String str3, @Nullable C3309s sVar, long j2, @Nullable C3309s sVar2, long j3, @Nullable C3309s sVar3) {
        this.f5302g = str;
        this.f5303h = str2;
        this.f5304i = m9Var;
        this.f5305j = j;
        this.f5306k = z;
        this.f5307l = str3;
        this.f5308m = sVar;
        this.f5309n = j2;
        this.f5310o = sVar2;
        this.f5311p = j3;
        this.f5312q = sVar3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f5302g, false);
        C0823f.m395s0(parcel, 3, this.f5303h, false);
        C0823f.m393r0(parcel, 4, this.f5304i, i, false);
        long j = this.f5305j;
        C0823f.m333B0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f5306k;
        C0823f.m333B0(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 7, this.f5307l, false);
        C0823f.m393r0(parcel, 8, this.f5308m, i, false);
        long j2 = this.f5309n;
        C0823f.m333B0(parcel, 9, 8);
        parcel.writeLong(j2);
        C0823f.m393r0(parcel, 10, this.f5310o, i, false);
        long j3 = this.f5311p;
        C0823f.m333B0(parcel, 11, 8);
        parcel.writeLong(j3);
        C0823f.m393r0(parcel, 12, this.f5312q, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
