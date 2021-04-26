package p005b.p096l.p097a.p113c.p129c;

import android.os.IBinder;
import android.os.IInterface;
import p005b.p096l.p097a.p113c.p131e.p135d.C2017a;
import p005b.p096l.p097a.p113c.p131e.p135d.C2018b;

/* renamed from: b.l.a.c.c.b */
public interface C1980b extends IInterface {

    /* renamed from: b.l.a.c.c.b$a */
    public static abstract class C1981a extends C2017a implements C1980b {

        /* renamed from: b.l.a.c.c.b$a$a */
        public static class C1982a extends C2018b implements C1980b {
            public C1982a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C1981a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: k */
        public static C1980b m2899k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C1980b ? (C1980b) queryLocalInterface : new C1982a(iBinder);
        }
    }
}
