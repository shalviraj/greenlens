package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1760e;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1805d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1813f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1834j0;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1839l;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1875w1;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3411d;
import p005b.p096l.p097a.p113c.p148i.C3412e;

@Deprecated
public abstract class GoogleApiClient {

    /* renamed from: a */
    public static final Set<GoogleApiClient> f11262a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$a */
    public static final class C5469a {

        /* renamed from: a */
        public final Set<Scope> f11263a = new HashSet();

        /* renamed from: b */
        public final Set<Scope> f11264b = new HashSet();

        /* renamed from: c */
        public String f11265c;

        /* renamed from: d */
        public String f11266d;

        /* renamed from: e */
        public final Map<C1770a<?>, C1905d.C1907b> f11267e = new ArrayMap();

        /* renamed from: f */
        public final Context f11268f;

        /* renamed from: g */
        public final Map<C1770a<?>, C1770a.C1774d> f11269g = new ArrayMap();

        /* renamed from: h */
        public int f11270h = -1;

        /* renamed from: i */
        public Looper f11271i;

        /* renamed from: j */
        public C1760e f11272j;

        /* renamed from: k */
        public C1770a.C1771a<? extends C3412e, C3397a> f11273k;

        /* renamed from: l */
        public final ArrayList<C5470b> f11274l;

        /* renamed from: m */
        public final ArrayList<C5471c> f11275m;

        public C5469a(@NonNull Context context) {
            Object obj = C1760e.f3107c;
            this.f11272j = C1760e.f3108d;
            this.f11273k = C3411d.f6180c;
            this.f11274l = new ArrayList<>();
            this.f11275m = new ArrayList<>();
            this.f11268f = context;
            this.f11271i = context.getMainLooper();
            this.f11265c = context.getPackageName();
            this.f11266d = context.getClass().getName();
        }

        /* renamed from: a */
        public final GoogleApiClient mo18851a() {
            C0823f.m362c(!this.f11269g.isEmpty(), "must call addApi() to add at least one API");
            C3397a aVar = C3397a.f6163g;
            Map<C1770a<?>, C1770a.C1774d> map = this.f11269g;
            C1770a<C3397a> aVar2 = C3411d.f6182e;
            if (map.containsKey(aVar2)) {
                aVar = (C3397a) this.f11269g.get(aVar2);
            }
            C1905d dVar = new C1905d((Account) null, this.f11263a, this.f11267e, 0, (View) null, this.f11265c, this.f11266d, aVar, false);
            Map<C1770a<?>, C1905d.C1907b> map2 = dVar.f3415d;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            Iterator<C1770a<?>> it = this.f11269g.keySet().iterator();
            C1770a aVar3 = null;
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    C1770a next = it.next();
                    C1770a.C1774d dVar2 = this.f11269g.get(next);
                    boolean z2 = map2.get(next) != null;
                    arrayMap.put(next, Boolean.valueOf(z2));
                    C1875w1 w1Var = new C1875w1(next, z2);
                    arrayList.add(w1Var);
                    if (next.f3124a != null) {
                        z = true;
                    }
                    C0823f.m386o(z, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
                    C1770a aVar4 = next;
                    C1770a.C1779f a = next.f3124a.mo12013a(this.f11268f, this.f11271i, dVar, dVar2, w1Var, w1Var);
                    arrayMap2.put(aVar4.mo12012a(), a);
                    if (a.mo12020h()) {
                        if (aVar3 == null) {
                            aVar3 = aVar4;
                        } else {
                            String str = aVar4.f3126c;
                            String str2 = aVar3.f3126c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 21);
                            sb.append(str);
                            sb.append(" cannot be used with ");
                            sb.append(str2);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    if (aVar3 != null) {
                        boolean equals = this.f11263a.equals(this.f11264b);
                        Object[] objArr = {aVar3.f3126c};
                        if (!equals) {
                            throw new IllegalStateException(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
                        }
                    }
                    C1834j0 j0Var = new C1834j0(this.f11268f, new ReentrantLock(), this.f11271i, dVar, this.f11272j, this.f11273k, arrayMap, this.f11274l, this.f11275m, arrayMap2, this.f11270h, C1834j0.m2466j(arrayMap2.values(), true), arrayList);
                    Set<GoogleApiClient> set = GoogleApiClient.f11262a;
                    synchronized (set) {
                        set.add(j0Var);
                    }
                    if (this.f11270h < 0) {
                        return j0Var;
                    }
                    throw null;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$b */
    public interface C5470b extends C1813f {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.GoogleApiClient$c */
    public interface C5471c extends C1839l {
    }

    public abstract void connect();

    /* renamed from: d */
    public <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12139d(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    @NonNull
    /* renamed from: e */
    public <C extends C1770a.C1779f> C mo12141e(@NonNull C1770a.C1773c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public Looper mo12142f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public abstract boolean mo12143g();
}
