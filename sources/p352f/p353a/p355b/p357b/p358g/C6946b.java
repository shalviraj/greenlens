package p352f.p353a.p355b.p357b.p358g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p352f.p353a.p355b.p357b.p358g.C6944a;

/* renamed from: f.a.b.b.g.b */
public interface C6946b extends IInterface {

    /* renamed from: f.a.b.b.g.b$a */
    public static abstract class C6947a extends Binder implements C6946b {

        /* renamed from: f.a.b.b.g.b$a$a */
        public static class C6948a implements C6946b {

            /* renamed from: a */
            public IBinder f13951a;

            public C6948a(IBinder iBinder) {
                this.f13951a = iBinder;
            }

            public IBinder asBinder() {
                return this.f13951a;
            }

            /* renamed from: y */
            public void mo24327y(C6944a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder((C6944a.C6945a) aVar);
                    this.f13951a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: g */
        public static C6946b m12544g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C6946b)) ? new C6948a(iBinder) : (C6946b) queryLocalInterface;
        }
    }

    /* renamed from: y */
    void mo24327y(C6944a aVar);
}
