package p005b.p096l.p097a.p113c.p119b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1941q0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1942r;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.b.d */
public class C1758d extends C1948a {
    public static final Parcelable.Creator<C1758d> CREATOR = new C1970s();

    /* renamed from: g */
    public final String f3104g;
    @Deprecated

    /* renamed from: h */
    public final int f3105h;

    /* renamed from: i */
    public final long f3106i;

    public C1758d(String str, int i, long j) {
        this.f3104g = str;
        this.f3105h = i;
        this.f3106i = j;
    }

    public C1758d(String str, long j) {
        this.f3104g = str;
        this.f3106i = j;
        this.f3105h = -1;
    }

    /* renamed from: V */
    public long mo11996V() {
        long j = this.f3106i;
        return j == -1 ? (long) this.f3105h : j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C1758d) {
            C1758d dVar = (C1758d) obj;
            String str = this.f3104g;
            if (((str == null || !str.equals(dVar.f3104g)) && (this.f3104g != null || dVar.f3104g != null)) || mo11996V() != dVar.mo11996V()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3104g, Long.valueOf(mo11996V())});
    }

    public String toString() {
        C1942r rVar = new C1942r(this, (C1941q0) null);
        rVar.mo12270a("name", this.f3104g);
        rVar.mo12270a("version", Long.valueOf(mo11996V()));
        return rVar.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3104g, false);
        int i2 = this.f3105h;
        C0823f.m333B0(parcel, 2, 4);
        parcel.writeInt(i2);
        long V = mo11996V();
        C0823f.m333B0(parcel, 3, 8);
        parcel.writeLong(V);
        C0823f.m331A0(parcel, w0);
    }
}
