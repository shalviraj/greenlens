package p005b.p096l.p097a.p113c.p131e.p134c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p148i.p149b.C3400c;
import p005b.p096l.p097a.p113c.p148i.p149b.C3404g;
import p005b.p096l.p097a.p113c.p148i.p149b.C3409l;

/* renamed from: b.l.a.c.e.c.a */
public class C2014a extends Binder implements IInterface {
    public C2014a(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        C3404g gVar = (C3404g) this;
        if (i == 3) {
            C1754b bVar = (C1754b) C2015b.m2937a(parcel, C1754b.CREATOR);
            C3400c cVar = (C3400c) C2015b.m2937a(parcel, C3400c.CREATOR);
        } else if (i == 4 || i == 6) {
            Status status = (Status) C2015b.m2937a(parcel, Status.CREATOR);
        } else if (i == 7) {
            Status status2 = (Status) C2015b.m2937a(parcel, Status.CREATOR);
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C2015b.m2937a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i != 8) {
            return false;
        } else {
            gVar.mo12065g0((C3409l) C2015b.m2937a(parcel, C3409l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
