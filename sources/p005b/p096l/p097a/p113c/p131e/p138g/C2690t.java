package p005b.p096l.p097a.p113c.p131e.p138g;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p141f.C3063n;
import p005b.p096l.p097a.p113c.p141f.C3064o;
import p005b.p096l.p097a.p113c.p141f.C3065p;
import p005b.p096l.p097a.p113c.p141f.C3066q;
import p005b.p096l.p097a.p113c.p141f.C3067r;
import p005b.p096l.p097a.p113c.p141f.C3068s;

/* renamed from: b.l.a.c.e.g.t */
public final class C2690t extends C1948a {
    public static final Parcelable.Creator<C2690t> CREATOR = new C2691u();

    /* renamed from: g */
    public int f4580g;

    /* renamed from: h */
    public C2688r f4581h;

    /* renamed from: i */
    public C3066q f4582i;

    /* renamed from: j */
    public PendingIntent f4583j;

    /* renamed from: k */
    public C3063n f4584k;

    /* renamed from: l */
    public C2676f f4585l;

    public C2690t(int i, C2688r rVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        C3066q qVar;
        C3063n nVar;
        this.f4580g = i;
        this.f4581h = rVar;
        C2676f fVar = null;
        if (iBinder == null) {
            qVar = null;
        } else {
            int i2 = C3067r.f5205a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            qVar = queryLocalInterface instanceof C3066q ? (C3066q) queryLocalInterface : new C3068s(iBinder);
        }
        this.f4582i = qVar;
        this.f4583j = pendingIntent;
        if (iBinder2 == null) {
            nVar = null;
        } else {
            int i3 = C3064o.f5204a;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            nVar = queryLocalInterface2 instanceof C3063n ? (C3063n) queryLocalInterface2 : new C3065p(iBinder2);
        }
        this.f4584k = nVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface3 instanceof C2676f ? (C2676f) queryLocalInterface3 : new C2678h(iBinder3);
        }
        this.f4585l = fVar;
    }

    /* renamed from: V */
    public static C2690t m4525V(C3066q qVar, @Nullable C2676f fVar) {
        return new C2690t(2, (C2688r) null, (C2687q) qVar, (PendingIntent) null, (IBinder) null, fVar != null ? fVar.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f4580g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m393r0(parcel, 2, this.f4581h, i, false);
        C3066q qVar = this.f4582i;
        IBinder iBinder = null;
        C0823f.m389p0(parcel, 3, qVar == null ? null : qVar.asBinder(), false);
        C0823f.m393r0(parcel, 4, this.f4583j, i, false);
        C3063n nVar = this.f4584k;
        C0823f.m389p0(parcel, 5, nVar == null ? null : nVar.asBinder(), false);
        C2676f fVar = this.f4585l;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        C0823f.m389p0(parcel, 6, iBinder, false);
        C0823f.m331A0(parcel, w0);
    }
}
