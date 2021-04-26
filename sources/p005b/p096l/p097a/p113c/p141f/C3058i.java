package p005b.p096l.p097a.p113c.p141f;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.f.i */
public final class C3058i extends C1948a {
    public static final Parcelable.Creator<C3058i> CREATOR = new C3059j();

    /* renamed from: g */
    public boolean f5198g;

    /* renamed from: h */
    public long f5199h;

    /* renamed from: i */
    public float f5200i;

    /* renamed from: j */
    public long f5201j;

    /* renamed from: k */
    public int f5202k;

    public C3058i() {
        this.f5198g = true;
        this.f5199h = 50;
        this.f5200i = 0.0f;
        this.f5201j = RecyclerView.FOREVER_NS;
        this.f5202k = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public C3058i(boolean z, long j, float f, long j2, int i) {
        this.f5198g = z;
        this.f5199h = j;
        this.f5200i = f;
        this.f5201j = j2;
        this.f5202k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3058i)) {
            return false;
        }
        C3058i iVar = (C3058i) obj;
        return this.f5198g == iVar.f5198g && this.f5199h == iVar.f5199h && Float.compare(this.f5200i, iVar.f5200i) == 0 && this.f5201j == iVar.f5201j && this.f5202k == iVar.f5202k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5198g), Long.valueOf(this.f5199h), Float.valueOf(this.f5200i), Long.valueOf(this.f5201j), Integer.valueOf(this.f5202k)});
    }

    public final String toString() {
        StringBuilder u = C0843a.m460u("DeviceOrientationRequest[mShouldUseMag=");
        u.append(this.f5198g);
        u.append(" mMinimumSamplingPeriodMs=");
        u.append(this.f5199h);
        u.append(" mSmallestAngleChangeRadians=");
        u.append(this.f5200i);
        long j = this.f5201j;
        if (j != RecyclerView.FOREVER_NS) {
            u.append(" expireIn=");
            u.append(j - SystemClock.elapsedRealtime());
            u.append("ms");
        }
        if (this.f5202k != Integer.MAX_VALUE) {
            u.append(" num=");
            u.append(this.f5202k);
        }
        u.append(']');
        return u.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        boolean z = this.f5198g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        long j = this.f5199h;
        C0823f.m333B0(parcel, 2, 8);
        parcel.writeLong(j);
        float f = this.f5200i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeFloat(f);
        long j2 = this.f5201j;
        C0823f.m333B0(parcel, 4, 8);
        parcel.writeLong(j2);
        int i2 = this.f5202k;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(i2);
        C0823f.m331A0(parcel, w0);
    }
}
