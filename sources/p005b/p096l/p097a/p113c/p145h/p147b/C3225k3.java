package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1922k;

/* renamed from: b.l.a.c.h.b.k3 */
public final class C3225k3 extends C1889b<C3170f3> {
    public C3225k3(Context context, Looper looper, C1889b.C1890a aVar, C1889b.C1891b bVar) {
        super(context, looper, C1922k.m2652a(context), C1763f.f3113b, 93, aVar, bVar, (String) null);
    }

    @NonNull
    /* renamed from: C */
    public final String mo12191C() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @NonNull
    /* renamed from: D */
    public final String mo12192D() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: n */
    public final int mo12206n() {
        return 12451000;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ IInterface mo12215w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C3170f3 ? (C3170f3) queryLocalInterface : new C3146d3(iBinder);
    }
}
