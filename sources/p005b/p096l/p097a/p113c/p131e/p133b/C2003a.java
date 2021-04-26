package p005b.p096l.p097a.p113c.p131e.p133b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p005b.p096l.p097a.p113c.p119b.p120l.C1781b;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.e.b.a */
public class C2003a extends Binder implements IInterface {
    public C2003a(String str) {
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
        C2008f fVar = (C2008f) this;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = C2005c.f3563a;
        Status status = (Status) (parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        C3429i iVar = ((C2013k) fVar).f3567a;
        if (status.mo18856V()) {
            iVar.f6197a.mo14695q(null);
        } else {
            iVar.f6197a.mo14694p(new C1781b(status));
        }
        return true;
    }
}
