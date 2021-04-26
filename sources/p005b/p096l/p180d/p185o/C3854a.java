package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.d.o.a */
public class C3854a extends C1948a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3854a> CREATOR = new C3915l0();

    /* renamed from: g */
    public final String f7087g;

    /* renamed from: h */
    public final String f7088h;

    /* renamed from: i */
    public final String f7089i;

    /* renamed from: j */
    public final String f7090j;

    /* renamed from: k */
    public final boolean f7091k;
    @Nullable

    /* renamed from: l */
    public final String f7092l;

    /* renamed from: m */
    public final boolean f7093m;

    /* renamed from: n */
    public String f7094n;

    /* renamed from: o */
    public int f7095o;

    /* renamed from: p */
    public String f7096p;

    /* renamed from: b.l.d.o.a$a */
    public static class C3855a {
    }

    public C3854a(C3855a aVar) {
        this.f7087g = null;
        this.f7088h = null;
        this.f7089i = null;
        this.f7090j = null;
        this.f7091k = false;
        this.f7092l = null;
        this.f7093m = false;
        this.f7096p = null;
    }

    public C3854a(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7) {
        this.f7087g = str;
        this.f7088h = str2;
        this.f7089i = str3;
        this.f7090j = str4;
        this.f7091k = z;
        this.f7092l = str5;
        this.f7093m = z2;
        this.f7094n = str6;
        this.f7095o = i;
        this.f7096p = str7;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7087g, false);
        C0823f.m395s0(parcel, 2, this.f7088h, false);
        C0823f.m395s0(parcel, 3, this.f7089i, false);
        C0823f.m395s0(parcel, 4, this.f7090j, false);
        boolean z = this.f7091k;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 6, this.f7092l, false);
        boolean z2 = this.f7093m;
        C0823f.m333B0(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m395s0(parcel, 8, this.f7094n, false);
        int i2 = this.f7095o;
        C0823f.m333B0(parcel, 9, 4);
        parcel.writeInt(i2);
        C0823f.m395s0(parcel, 10, this.f7096p, false);
        C0823f.m331A0(parcel, w0);
    }
}
