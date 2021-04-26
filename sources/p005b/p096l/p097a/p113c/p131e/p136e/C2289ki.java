package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.ki */
public abstract class C2289ki extends C2273k2 implements C2313li {
    public C2289ki() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    /* renamed from: g */
    public final boolean mo12764g(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ((C2041aj) this).mo12410v0((C2363nk) C2250j3.m3549a(parcel, C2363nk.CREATOR));
                return true;
            case 2:
                ((C2041aj) this).mo12401f1((C2363nk) C2250j3.m3549a(parcel, C2363nk.CREATOR), (C2192gk) C2250j3.m3549a(parcel, C2192gk.CREATOR));
                return true;
            case 3:
                ((C2041aj) this).mo12395H((C2506tj) C2250j3.m3549a(parcel, C2506tj.CREATOR));
                return true;
            case 4:
                ((C2041aj) this).mo12409t((C2627yk) C2250j3.m3549a(parcel, C2627yk.CREATOR));
                return true;
            case 5:
                ((C2041aj) this).mo12399Z0((Status) C2250j3.m3549a(parcel, Status.CREATOR));
                return true;
            case 6:
                ((C2041aj) this).mo12400f();
                return true;
            case 7:
                ((C2041aj) this).mo12402h();
                return true;
            case 8:
                ((C2041aj) this).mo12408m0(parcel.readString());
                return true;
            case 9:
                ((C2041aj) this).mo12407m(parcel.readString());
                throw null;
            case 10:
                ((C2041aj) this).mo12397I((C3938x) C2250j3.m3549a(parcel, C3938x.CREATOR));
                throw null;
            case 11:
                ((C2041aj) this).mo12396H0(parcel.readString());
                throw null;
            case 12:
                ((C2041aj) this).mo12403i1((Status) C2250j3.m3549a(parcel, Status.CREATOR), (C3938x) C2250j3.m3549a(parcel, C3938x.CREATOR));
                return true;
            case 13:
                ((C2041aj) this).mo12405l();
                return true;
            case 14:
                C2381oe oeVar = (C2381oe) C2250j3.m3549a(parcel, C2381oe.CREATOR);
                ((C2041aj) this).mo12404k(oeVar.f4170g, oeVar.f4171h, oeVar.f4172i, oeVar.f4173j);
                return true;
            case 15:
                ((C2041aj) this).mo12406l0((C2429qe) C2250j3.m3549a(parcel, C2429qe.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
