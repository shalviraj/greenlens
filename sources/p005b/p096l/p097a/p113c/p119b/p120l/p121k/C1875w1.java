package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;

/* renamed from: b.l.a.c.b.l.k.w1 */
public final class C1875w1 implements GoogleApiClient.C5470b, GoogleApiClient.C5471c {

    /* renamed from: a */
    public final C1770a<?> f3317a;

    /* renamed from: b */
    public final boolean f3318b;

    /* renamed from: c */
    public C1881y1 f3319c;

    public C1875w1(C1770a<?> aVar, boolean z) {
        this.f3317a = aVar;
        this.f3318b = z;
    }

    /* renamed from: a */
    public final void mo12169a() {
        C0823f.m380l(this.f3319c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: g */
    public final void mo12086g(int i) {
        mo12169a();
        this.f3319c.mo12086g(i);
    }

    /* renamed from: k */
    public final void mo12087k(@Nullable Bundle bundle) {
        mo12169a();
        this.f3319c.mo12087k(bundle);
    }

    /* renamed from: n */
    public final void mo12088n(@NonNull C1754b bVar) {
        mo12169a();
        this.f3319c.mo12105o(bVar, this.f3317a, this.f3318b);
    }
}
