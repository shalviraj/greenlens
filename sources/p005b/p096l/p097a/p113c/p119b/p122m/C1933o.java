package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2017a;
import p005b.p096l.p097a.p113c.p131e.p135d.C2019c;

/* renamed from: b.l.a.c.b.m.o */
public interface C1933o extends IInterface {

    /* renamed from: b.l.a.c.b.m.o$a */
    public static abstract class C1934a extends C2017a implements C1933o {
        public C1934a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: g */
        public final boolean mo12265g(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ((C1889b.C1898i) this).mo12228k1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C2019c.m2941a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                parcel.readInt();
                Bundle bundle = (Bundle) C2019c.m2941a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            } else if (i != 3) {
                return false;
            } else {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                C1904c0 c0Var = (C1904c0) C2019c.m2941a(parcel, C1904c0.CREATOR);
                C1889b.C1898i iVar = (C1889b.C1898i) this;
                C0823f.m380l(iVar.f3400a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                Objects.requireNonNull(c0Var, "null reference");
                iVar.f3400a.f3390y = c0Var;
                iVar.mo12228k1(readInt, readStrongBinder, c0Var.f3409g);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: k1 */
    void mo12228k1(int i, IBinder iBinder, Bundle bundle);
}
