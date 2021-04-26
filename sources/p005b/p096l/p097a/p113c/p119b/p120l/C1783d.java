package p005b.p096l.p097a.p113c.p119b.p120l;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1792a;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1796b;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1805d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1811e1;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1829i1;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1848o;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1851p;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1857q1;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1863s1;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.a.c.b.l.d */
public class C1783d<O extends C1770a.C1774d> {

    /* renamed from: a */
    public final Context f3128a;

    /* renamed from: b */
    public final C1770a<O> f3129b;

    /* renamed from: c */
    public final O f3130c;

    /* renamed from: d */
    public final C1796b<O> f3131d;

    /* renamed from: e */
    public final Looper f3132e;

    /* renamed from: f */
    public final int f3133f;

    /* renamed from: g */
    public final C1848o f3134g;

    /* renamed from: h */
    public final C1817g f3135h;

    /* renamed from: b.l.a.c.b.l.d$a */
    public static class C1784a {

        /* renamed from: c */
        public static final C1784a f3136c = new C1784a(new C1792a(), (Account) null, Looper.getMainLooper());

        /* renamed from: a */
        public final C1848o f3137a;

        /* renamed from: b */
        public final Looper f3138b;

        public C1784a(C1848o oVar, Account account, Looper looper) {
            this.f3137a = oVar;
            this.f3138b = looper;
        }
    }

    public C1783d(@NonNull Context context, C1770a<O> aVar, @Nullable O o, C1784a aVar2) {
        C0823f.m380l(context, "Null context is not permitted.");
        C0823f.m380l(aVar, "Api must not be null.");
        C0823f.m380l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f3128a = applicationContext;
        this.f3129b = aVar;
        this.f3130c = o;
        this.f3132e = aVar2.f3138b;
        this.f3131d = new C1796b<>(aVar, o);
        C1817g a = C1817g.m2414a(applicationContext);
        this.f3135h = a;
        this.f3133f = a.f3186e.getAndIncrement();
        this.f3134g = aVar2.f3137a;
        Handler handler = a.f3191j;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r1 = ((p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d.C1776b) r1).mo12015b();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p097a.p113c.p119b.p122m.C1905d.C1906a mo12032a() {
        /*
            r4 = this;
            b.l.a.c.b.m.d$a r0 = new b.l.a.c.b.m.d$a
            r0.<init>()
            O r1 = r4.f3130c
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d.C1776b
            r3 = 0
            if (r2 == 0) goto L_0x0024
            b.l.a.c.b.l.a$d$b r1 = (p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d.C1776b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo12015b()
            if (r1 == 0) goto L_0x0024
            java.lang.String r2 = r1.f11250j
            if (r2 != 0) goto L_0x0019
            goto L_0x0030
        L_0x0019:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r1 = r1.f11250j
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            r3 = r2
            goto L_0x0030
        L_0x0024:
            O r1 = r4.f3130c
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d.C1775a
            if (r2 == 0) goto L_0x0030
            b.l.a.c.b.l.a$d$a r1 = (p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d.C1775a) r1
            android.accounts.Account r3 = r1.mo12014a()
        L_0x0030:
            r0.f3421a = r3
            O r1 = r4.f3130c
            boolean r2 = r1 instanceof p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d.C1776b
            if (r2 == 0) goto L_0x0045
            b.l.a.c.b.l.a$d$b r1 = (p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d.C1776b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo12015b()
            if (r1 == 0) goto L_0x0045
            java.util.Set r1 = r1.mo18843V()
            goto L_0x0049
        L_0x0045:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0049:
            androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r2 = r0.f3422b
            if (r2 != 0) goto L_0x0054
            androidx.collection.ArraySet r2 = new androidx.collection.ArraySet
            r2.<init>()
            r0.f3422b = r2
        L_0x0054:
            androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r2 = r0.f3422b
            r2.addAll(r1)
            android.content.Context r1 = r4.f3128a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.f3424d = r1
            android.content.Context r1 = r4.f3128a
            java.lang.String r1 = r1.getPackageName()
            r0.f3423c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p120l.C1783d.mo12032a():b.l.a.c.b.m.d$a");
    }

    /* renamed from: b */
    public <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12033b(@NonNull T t) {
        t.mo18868i();
        C1817g gVar = this.f3135h;
        C1857q1 q1Var = new C1857q1(1, t);
        Handler handler = gVar.f3191j;
        handler.sendMessage(handler.obtainMessage(4, new C1811e1(q1Var, gVar.f3187f.get(), this)));
        return t;
    }

    @WorkerThread
    /* renamed from: c */
    public C1770a.C1779f mo12034c(Looper looper, C1817g.C1818a<O> aVar) {
        C1905d a = mo12032a().mo12238a();
        C1770a<O> aVar2 = this.f3129b;
        C0823f.m386o(aVar2.f3124a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return aVar2.f3124a.mo12013a(this.f3128a, looper, a, this.f3130c, aVar, aVar);
    }

    /* renamed from: d */
    public C1829i1 mo12035d(Context context, Handler handler) {
        return new C1829i1(context, handler, mo12032a().mo12238a(), C1829i1.f3222h);
    }

    /* renamed from: e */
    public final <TResult, A extends C1770a.C1772b> C3428h<TResult> mo12036e(int i, @NonNull C1851p<A, TResult> pVar) {
        C3429i iVar = new C3429i();
        C1817g gVar = this.f3135h;
        C1863s1 s1Var = new C1863s1(i, pVar, iVar, this.f3134g);
        Handler handler = gVar.f3191j;
        handler.sendMessage(handler.obtainMessage(4, new C1811e1(s1Var, gVar.f3187f.get(), this)));
        return iVar.f6197a;
    }
}
