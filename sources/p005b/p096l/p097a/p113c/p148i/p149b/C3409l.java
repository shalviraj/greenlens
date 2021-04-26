package p005b.p096l.p097a.p113c.p148i.p149b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1946t;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.i.b.l */
public final class C3409l extends C1948a {
    public static final Parcelable.Creator<C3409l> CREATOR = new C3408k();

    /* renamed from: g */
    public final int f6175g;

    /* renamed from: h */
    public final C1754b f6176h;
    @Nullable

    /* renamed from: i */
    public final C1946t f6177i;

    public C3409l() {
        C1754b bVar = new C1754b(8, (PendingIntent) null);
        this.f6175g = 1;
        this.f6176h = bVar;
        this.f6177i = null;
    }

    public C3409l(int i, C1754b bVar, @Nullable C1946t tVar) {
        this.f6175g = i;
        this.f6176h = bVar;
        this.f6177i = tVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f6175g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m393r0(parcel, 2, this.f6176h, i, false);
        C0823f.m393r0(parcel, 3, this.f6177i, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
