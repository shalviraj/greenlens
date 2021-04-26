package p005b.p096l.p097a.p113c.p141f;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.f.g */
public final class C3056g extends C1948a {
    public static final Parcelable.Creator<C3056g> CREATOR = new C3057h();

    /* renamed from: g */
    public final int f5194g;

    /* renamed from: h */
    public final int f5195h;

    /* renamed from: i */
    public final long f5196i;

    /* renamed from: j */
    public final long f5197j;

    public C3056g(int i, int i2, long j, long j2) {
        this.f5194g = i;
        this.f5195h = i2;
        this.f5196i = j;
        this.f5197j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3056g.class == obj.getClass()) {
            C3056g gVar = (C3056g) obj;
            return this.f5194g == gVar.f5194g && this.f5195h == gVar.f5195h && this.f5196i == gVar.f5196i && this.f5197j == gVar.f5197j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5195h), Integer.valueOf(this.f5194g), Long.valueOf(this.f5197j), Long.valueOf(this.f5196i)});
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f5194g + " Cell status: " + this.f5195h + " elapsed time NS: " + this.f5197j + " system time ms: " + this.f5196i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f5194g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f5195h;
        C0823f.m333B0(parcel, 2, 4);
        parcel.writeInt(i3);
        long j = this.f5196i;
        C0823f.m333B0(parcel, 3, 8);
        parcel.writeLong(j);
        long j2 = this.f5197j;
        C0823f.m333B0(parcel, 4, 8);
        parcel.writeLong(j2);
        C0823f.m331A0(parcel, w0);
    }
}
