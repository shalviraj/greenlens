package p352f.p353a.p354a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: f.a.a.c */
public interface C6932c extends IInterface {

    /* renamed from: f.a.a.c$a */
    public static abstract class C6933a extends Binder implements C6932c {
        private static final String DESCRIPTOR = "android.support.customtabs.IPostMessageService";
        public static final int TRANSACTION_onMessageChannelReady = 2;
        public static final int TRANSACTION_onPostMessage = 3;

        /* renamed from: f.a.a.c$a$a */
        public static class C6934a implements C6932c {

            /* renamed from: a */
            public IBinder f13946a;

            public C6934a(IBinder iBinder) {
                this.f13946a = iBinder;
            }

            public IBinder asBinder() {
                return this.f13946a;
            }

            public void onMessageChannelReady(C6926a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C6933a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13946a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPostMessage(C6926a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C6933a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13946a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C6933a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static C6932c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C6932c)) ? new C6934a(iBinder) : (C6932c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 2
                r1 = 0
                r2 = 1
                java.lang.String r3 = "android.support.customtabs.IPostMessageService"
                if (r5 == r0) goto L_0x003d
                r0 = 3
                if (r5 == r0) goto L_0x0018
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0014
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0014:
                r7.writeString(r3)
                return r2
            L_0x0018:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                f.a.a.a r5 = p352f.p353a.p354a.C6926a.C6927a.asInterface(r5)
                java.lang.String r8 = r6.readString()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0036
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0036:
                r4.onPostMessage(r5, r8, r1)
            L_0x0039:
                r7.writeNoException()
                return r2
            L_0x003d:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                f.a.a.a r5 = p352f.p353a.p354a.C6926a.C6927a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0057
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0057:
                r4.onMessageChannelReady(r5, r1)
                goto L_0x0039
            */
            throw new UnsupportedOperationException("Method not decompiled: p352f.p353a.p354a.C6932c.C6933a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onMessageChannelReady(C6926a aVar, Bundle bundle);

    void onPostMessage(C6926a aVar, String str, Bundle bundle);
}
