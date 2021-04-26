package p005b.p096l.p097a.p113c.p141f;

import android.location.Location;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p131e.p138g.C2684n;
import p005b.p096l.p097a.p113c.p131e.p138g.C2685o;
import p005b.p096l.p097a.p113c.p131e.p138g.C2687q;
import p005b.p096l.p097a.p113c.p131e.p138g.C2692v;

/* renamed from: b.l.a.c.f.r */
public abstract class C3067r extends C2687q implements C3066q {

    /* renamed from: a */
    public static final /* synthetic */ int f5205a = 0;

    public C3067r() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: g */
    public final boolean mo13171g(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Location location = (Location) C2692v.m4526a(parcel, Location.CREATOR);
        C2684n nVar = (C2684n) this;
        synchronized (nVar) {
            nVar.f4569b.mo12132a(new C2685o(location));
        }
        return true;
    }
}
