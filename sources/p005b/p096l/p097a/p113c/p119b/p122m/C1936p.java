package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p131e.p135d.C2017a;

/* renamed from: b.l.a.c.b.m.p */
public interface C1936p extends IInterface {

    /* renamed from: b.l.a.c.b.m.p$a */
    public static abstract class C1937a extends Binder implements C1936p {

        /* renamed from: b.l.a.c.b.m.p$a$a */
        public static class C1938a implements C1936p {

            /* renamed from: a */
            public final IBinder f3477a;

            public C1938a(IBinder iBinder) {
                this.f3477a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f3477a;
            }

            /* renamed from: f0 */
            public final void mo12266f0(C1933o oVar, C1915h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder((C2017a) oVar);
                    obtain.writeInt(1);
                    hVar.writeToParcel(obtain, 0);
                    this.f3477a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C1937a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009a, code lost:
            if (r5.readInt() != 0) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b7, code lost:
            if (r5.readInt() != 0) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c8, code lost:
            if (r5.readInt() != 0) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
            if (r5.readInt() != 0) goto L_0x00e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00df, code lost:
            if (r5.readInt() != 0) goto L_0x00e1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 <= r0) goto L_0x000a
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x000a:
                java.lang.String r7 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r5.enforceInterface(r7)
                android.os.IBinder r7 = r5.readStrongBinder()
                r0 = 0
                if (r7 != 0) goto L_0x0018
                r1 = r0
                goto L_0x002a
            L_0x0018:
                java.lang.String r1 = "com.google.android.gms.common.internal.IGmsCallbacks"
                android.os.IInterface r1 = r7.queryLocalInterface(r1)
                boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p119b.p122m.C1933o
                if (r2 == 0) goto L_0x0025
                b.l.a.c.b.m.o r1 = (p005b.p096l.p097a.p113c.p119b.p122m.C1933o) r1
                goto L_0x002a
            L_0x0025:
                b.l.a.c.b.m.l0 r1 = new b.l.a.c.b.m.l0
                r1.<init>(r7)
            L_0x002a:
                r7 = 46
                r2 = 1
                if (r4 != r7) goto L_0x0048
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x003e
                android.os.Parcelable$Creator<b.l.a.c.b.m.h> r4 = p005b.p096l.p097a.p113c.p119b.p122m.C1915h.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                b.l.a.c.b.m.h r0 = (p005b.p096l.p097a.p113c.p119b.p122m.C1915h) r0
            L_0x003e:
                r4 = r3
                b.l.d.o.d0.a.a.a r4 = (p005b.p096l.p180d.p185o.p186d0.p187a.p188a.C3862a) r4
                r4.mo12266f0(r1, r0)
                r6.writeNoException()
                return r2
            L_0x0048:
                r6 = 47
                if (r4 != r6) goto L_0x005d
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0057
                android.os.Parcelable$Creator<b.l.a.c.b.m.s0> r4 = p005b.p096l.p097a.p113c.p119b.p122m.C1945s0.CREATOR
                r4.createFromParcel(r5)
            L_0x0057:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            L_0x005d:
                r5.readInt()
                r6 = 4
                if (r4 == r6) goto L_0x0066
                r5.readString()
            L_0x0066:
                if (r4 == r2) goto L_0x00d2
                r6 = 2
                if (r4 == r6) goto L_0x00cb
                r6 = 23
                if (r4 == r6) goto L_0x00cb
                r6 = 25
                if (r4 == r6) goto L_0x00cb
                r6 = 27
                if (r4 == r6) goto L_0x00cb
                r6 = 30
                if (r4 == r6) goto L_0x00be
                r6 = 34
                if (r4 == r6) goto L_0x00ba
                r6 = 41
                if (r4 == r6) goto L_0x00cb
                r6 = 43
                if (r4 == r6) goto L_0x00cb
                r6 = 37
                if (r4 == r6) goto L_0x00cb
                r6 = 38
                if (r4 == r6) goto L_0x00cb
                switch(r4) {
                    case 5: goto L_0x00cb;
                    case 6: goto L_0x00cb;
                    case 7: goto L_0x00cb;
                    case 8: goto L_0x00cb;
                    case 9: goto L_0x00a4;
                    case 10: goto L_0x009d;
                    case 11: goto L_0x00cb;
                    case 12: goto L_0x00cb;
                    case 13: goto L_0x00cb;
                    case 14: goto L_0x00cb;
                    case 15: goto L_0x00cb;
                    case 16: goto L_0x00cb;
                    case 17: goto L_0x00cb;
                    case 18: goto L_0x00cb;
                    case 19: goto L_0x0093;
                    case 20: goto L_0x00be;
                    default: goto L_0x0092;
                }
            L_0x0092:
                goto L_0x00e6
            L_0x0093:
                r5.readStrongBinder()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00e6
                goto L_0x00e1
            L_0x009d:
                r5.readString()
                r5.createStringArray()
                goto L_0x00e6
            L_0x00a4:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                r5.readStrongBinder()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00e6
                goto L_0x00e1
            L_0x00ba:
                r5.readString()
                goto L_0x00e6
            L_0x00be:
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00e6
                goto L_0x00e1
            L_0x00cb:
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00e6
                goto L_0x00e1
            L_0x00d2:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00e6
            L_0x00e1:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                r4.createFromParcel(r5)
            L_0x00e6:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p122m.C1936p.C1937a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: f0 */
    void mo12266f0(C1933o oVar, C1915h hVar);
}
