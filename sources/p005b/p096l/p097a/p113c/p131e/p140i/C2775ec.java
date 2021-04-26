package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.e.i.ec */
public final class C2775ec extends C1948a {
    public static final Parcelable.Creator<C2775ec> CREATOR = new C2720b();

    /* renamed from: g */
    public final long f4706g;

    /* renamed from: h */
    public final long f4707h;

    /* renamed from: i */
    public final boolean f4708i;
    @Nullable

    /* renamed from: j */
    public final String f4709j;
    @Nullable

    /* renamed from: k */
    public final String f4710k;
    @Nullable

    /* renamed from: l */
    public final String f4711l;
    @Nullable

    /* renamed from: m */
    public final Bundle f4712m;
    @Nullable

    /* renamed from: n */
    public final String f4713n;

    public C2775ec(long j, long j2, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Bundle bundle, @Nullable String str4) {
        this.f4706g = j;
        this.f4707h = j2;
        this.f4708i = z;
        this.f4709j = str;
        this.f4710k = str2;
        this.f4711l = str3;
        this.f4712m = bundle;
        this.f4713n = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        long j = this.f4706g;
        C0823f.m333B0(parcel, 1, 8);
        parcel.writeLong(j);
        long j2 = this.f4707h;
        C0823f.m333B0(parcel, 2, 8);
        parcel.writeLong(j2);
        boolean z = this.f4708i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 4, this.f4709j, false);
        C0823f.m395s0(parcel, 5, this.f4710k, false);
        C0823f.m395s0(parcel, 6, this.f4711l, false);
        C0823f.m385n0(parcel, 7, this.f4712m, false);
        C0823f.m395s0(parcel, 8, this.f4713n, false);
        C0823f.m331A0(parcel, w0);
    }
}
