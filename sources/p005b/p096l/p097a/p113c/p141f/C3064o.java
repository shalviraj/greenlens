package p005b.p096l.p097a.p113c.p141f;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p005b.p096l.p097a.p113c.p131e.p138g.C2687q;
import p005b.p096l.p097a.p113c.p131e.p138g.C2692v;

/* renamed from: b.l.a.c.f.o */
public abstract class C3064o extends C2687q implements C3063n {

    /* renamed from: a */
    public static final /* synthetic */ int f5204a = 0;

    /* renamed from: g */
    public final boolean mo13171g(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) C2692v.m4526a(parcel, LocationResult.CREATOR);
            throw null;
        } else if (i != 2) {
            return false;
        } else {
            LocationAvailability locationAvailability = (LocationAvailability) C2692v.m4526a(parcel, LocationAvailability.CREATOR);
            throw null;
        }
    }
}
