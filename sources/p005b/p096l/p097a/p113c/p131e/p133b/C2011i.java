package p005b.p096l.p097a.p113c.p131e.p133b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1813f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1839l;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1917i;

/* renamed from: b.l.a.c.e.b.i */
public final class C2011i extends C1917i<C2007e> {
    public C2011i(Context context, Looper looper, C1905d dVar, C1813f fVar, C1839l lVar) {
        super(context, looper, 126, dVar, fVar, lVar);
    }

    /* renamed from: C */
    public final String mo12191C() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* renamed from: D */
    public final String mo12192D() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* renamed from: n */
    public final int mo12206n() {
        return 12451000;
    }

    /* renamed from: w */
    public final /* synthetic */ IInterface mo12215w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof C2007e ? (C2007e) queryLocalInterface : new C2006d(iBinder);
    }

    /* renamed from: y */
    public final C1758d[] mo12217y() {
        return C2004b.f3562d;
    }
}
