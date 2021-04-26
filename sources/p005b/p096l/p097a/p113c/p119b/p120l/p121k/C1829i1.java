package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3411d;
import p005b.p096l.p097a.p113c.p148i.C3412e;
import p005b.p096l.p097a.p113c.p148i.p149b.C3402e;
import p005b.p096l.p097a.p113c.p148i.p149b.C3409l;

/* renamed from: b.l.a.c.b.l.k.i1 */
public final class C1829i1 extends C3402e implements GoogleApiClient.C5470b, GoogleApiClient.C5471c {

    /* renamed from: h */
    public static C1770a.C1771a<? extends C3412e, C3397a> f3222h = C3411d.f6180c;

    /* renamed from: a */
    public final Context f3223a;

    /* renamed from: b */
    public final Handler f3224b;

    /* renamed from: c */
    public final C1770a.C1771a<? extends C3412e, C3397a> f3225c;

    /* renamed from: d */
    public Set<Scope> f3226d;

    /* renamed from: e */
    public C1905d f3227e;

    /* renamed from: f */
    public C3412e f3228f;

    /* renamed from: g */
    public C1835j1 f3229g;

    @WorkerThread
    public C1829i1(Context context, Handler handler, @NonNull C1905d dVar, C1770a.C1771a<? extends C3412e, C3397a> aVar) {
        this.f3223a = context;
        this.f3224b = handler;
        C0823f.m380l(dVar, "ClientSettings must not be null");
        this.f3227e = dVar;
        this.f3226d = dVar.f3413b;
        this.f3225c = aVar;
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo12086g(int i) {
        this.f3228f.mo12017b();
    }

    @BinderThread
    /* renamed from: g0 */
    public final void mo12065g0(C3409l lVar) {
        this.f3224b.post(new C1838k1(this, lVar));
    }

    @WorkerThread
    /* renamed from: k */
    public final void mo12087k(@Nullable Bundle bundle) {
        this.f3228f.mo14654l(this);
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo12088n(@NonNull C1754b bVar) {
        ((C1817g.C1819b) this.f3229g).mo12113b(bVar);
    }
}
