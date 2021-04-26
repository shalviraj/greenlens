package p005b.p096l.p097a.p113c.p131e.p138g;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1917i;

/* renamed from: b.l.a.c.e.g.w */
public class C2693w extends C1917i<C2679i> {

    /* renamed from: D */
    public final String f4587D;

    /* renamed from: E */
    public final C2694x<C2679i> f4588E = new C2694x(this);

    public C2693w(Context context, Looper looper, GoogleApiClient.C5470b bVar, GoogleApiClient.C5471c cVar, String str, C1905d dVar) {
        super(context, looper, 23, dVar, bVar, cVar);
        this.f4587D = str;
    }

    /* renamed from: C */
    public String mo12191C() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: D */
    public String mo12192D() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: n */
    public int mo12206n() {
        return 11925000;
    }

    /* renamed from: w */
    public /* synthetic */ IInterface mo12215w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C2679i ? (C2679i) queryLocalInterface : new C2680j(iBinder);
    }

    /* renamed from: z */
    public Bundle mo12218z() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f4587D);
        return bundle;
    }
}
