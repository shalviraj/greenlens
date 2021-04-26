package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1813f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1839l;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1917i;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;

/* renamed from: b.l.a.c.e.e.bi */
public final class C2065bi extends C1917i<C2385oi> implements C2040ai {

    /* renamed from: F */
    public static final C1955a f3648F = new C1955a("FirebaseAuth", "FirebaseAuth:");

    /* renamed from: D */
    public final Context f3649D;

    /* renamed from: E */
    public final C2481si f3650E;

    public C2065bi(Context context, Looper looper, C1905d dVar, C2481si siVar, C1813f fVar, C1839l lVar) {
        super(context, looper, 112, dVar, fVar, lVar);
        Objects.requireNonNull(context, "null reference");
        this.f3649D = context;
        this.f3650E = siVar;
    }

    /* renamed from: C */
    public final String mo12191C() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    /* renamed from: D */
    public final String mo12192D() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    /* renamed from: E */
    public final String mo12193E() {
        if (this.f3650E.f4075g) {
            C1955a aVar = f3648F;
            Log.i(aVar.f3501a, aVar.mo12284c("Preparing to create service connection to fallback implementation", new Object[0]));
            return this.f3649D.getPackageName();
        }
        C1955a aVar2 = f3648F;
        Log.i(aVar2.f3501a, aVar2.mo12284c("Preparing to create service connection to gms implementation", new Object[0]));
        return "com.google.android.gms";
    }

    /* renamed from: m */
    public final boolean mo12205m() {
        return DynamiteModule.m10394a(this.f3649D, ModuleDescriptor.MODULE_ID) == 0;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return queryLocalInterface instanceof C2385oi ? (C2385oi) queryLocalInterface : new C2337mi(iBinder);
    }

    /* renamed from: y */
    public final C1758d[] mo12217y() {
        return C2275k4.f4003d;
    }

    /* renamed from: z */
    public final Bundle mo12218z() {
        Bundle bundle = new Bundle();
        C2481si siVar = this.f3650E;
        if (siVar != null) {
            bundle.putString("com.google.firebase.auth.API_KEY", siVar.f4290h);
        }
        bundle.putString("com.google.firebase.auth.LIBRARY_VERSION", C2601xi.m4403b());
        return bundle;
    }
}
