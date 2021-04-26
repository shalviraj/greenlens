package p352f.p353a.p355b.p359c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p352f.p353a.p355b.p359c.C6959b;

/* renamed from: f.a.b.c.a */
public interface C6956a extends IInterface {

    /* renamed from: f.a.b.c.a$a */
    public static abstract class C6957a extends Binder implements C6956a {

        /* renamed from: a */
        public static final /* synthetic */ int f13956a = 0;

        /* renamed from: f.a.b.c.a$a$a */
        public static class C6958a implements C6956a {

            /* renamed from: a */
            public IBinder f13957a;

            public C6958a(IBinder iBinder) {
                this.f13957a = iBinder;
            }

            public IBinder asBinder() {
                return this.f13957a;
            }

            /* renamed from: j1 */
            public void mo24338j1(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f13957a.transact(1, obtain, (Parcel) null, 1)) {
                        int i2 = C6957a.f13956a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C6957a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                ((C6959b.C6961b) this).mo24338j1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: j1 */
    void mo24338j1(int i, Bundle bundle);
}
