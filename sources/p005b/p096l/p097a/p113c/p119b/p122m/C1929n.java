package p005b.p096l.p097a.p113c.p119b.p122m;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p005b.p096l.p097a.p113c.p131e.p135d.C2017a;
import p005b.p096l.p097a.p113c.p131e.p135d.C2018b;
import p005b.p096l.p097a.p113c.p131e.p135d.C2019c;

/* renamed from: b.l.a.c.b.m.n */
public interface C1929n extends IInterface {

    /* renamed from: b.l.a.c.b.m.n$a */
    public static abstract class C1930a extends C2017a implements C1929n {

        /* renamed from: b.l.a.c.b.m.n$a$a */
        public static class C1931a extends C2018b implements C1929n {
            public C1931a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: a */
            public final Account mo12263a() {
                Parcel k = mo12336k(2, mo12335g());
                Account account = (Account) C2019c.m2941a(k, Account.CREATOR);
                k.recycle();
                return account;
            }
        }

        /* renamed from: k */
        public static C1929n m2662k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C1929n ? (C1929n) queryLocalInterface : new C1931a(iBinder);
        }
    }

    /* renamed from: a */
    Account mo12263a();
}
