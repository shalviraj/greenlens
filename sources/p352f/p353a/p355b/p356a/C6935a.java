package p352f.p353a.p355b.p356a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: f.a.b.a.a */
public interface C6935a extends IInterface {

    /* renamed from: f.a.b.a.a$a */
    public static abstract class C6936a extends Binder implements C6935a {
        private static final String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
        public static final int TRANSACTION_cancel = 2;
        public static final int TRANSACTION_cancelAll = 3;
        public static final int TRANSACTION_notify = 1;

        /* renamed from: f.a.b.a.a$a$a */
        public static class C6937a implements C6935a {

            /* renamed from: b */
            public static C6935a f13947b;

            /* renamed from: a */
            public IBinder f13948a;

            public C6937a(IBinder iBinder) {
                this.f13948a = iBinder;
            }

            public IBinder asBinder() {
                return this.f13948a;
            }

            public void cancel(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C6936a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.f13948a.transact(2, obtain, (Parcel) null, 1) || C6936a.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        C6936a.getDefaultImpl().cancel(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C6936a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.f13948a.transact(3, obtain, (Parcel) null, 1) || C6936a.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        C6936a.getDefaultImpl().cancelAll(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void notify(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C6936a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f13948a.transact(1, obtain, (Parcel) null, 1) || C6936a.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        C6936a.getDefaultImpl().notify(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C6936a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C6935a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C6935a)) ? new C6937a(iBinder) : (C6935a) queryLocalInterface;
        }

        public static C6935a getDefaultImpl() {
            return C6937a.f13947b;
        }

        public static boolean setDefaultImpl(C6935a aVar) {
            if (C6937a.f13947b != null || aVar == null) {
                return false;
            }
            C6937a.f13947b = aVar;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}
