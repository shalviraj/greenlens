package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.b.m.t */
public class C1946t extends C1948a {
    public static final Parcelable.Creator<C1946t> CREATOR = new C1902b0();

    /* renamed from: g */
    public final int f3491g;

    /* renamed from: h */
    public IBinder f3492h;

    /* renamed from: i */
    public C1754b f3493i;

    /* renamed from: j */
    public boolean f3494j;

    /* renamed from: k */
    public boolean f3495k;

    public C1946t(int i, IBinder iBinder, C1754b bVar, boolean z, boolean z2) {
        this.f3491g = i;
        this.f3492h = iBinder;
        this.f3493i = bVar;
        this.f3494j = z;
        this.f3495k = z2;
    }

    /* renamed from: V */
    public C1929n mo12276V() {
        return C1929n.C1930a.m2662k(this.f3492h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1946t)) {
            return false;
        }
        C1946t tVar = (C1946t) obj;
        return this.f3493i.equals(tVar.f3493i) && mo12276V().equals(tVar.mo12276V());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f3491g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m389p0(parcel, 2, this.f3492h, false);
        C0823f.m393r0(parcel, 3, this.f3493i, i, false);
        boolean z = this.f3494j;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3495k;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
