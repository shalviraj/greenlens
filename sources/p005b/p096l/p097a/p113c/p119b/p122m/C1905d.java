package p005b.p096l.p097a.p113c.p119b.p122m;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p148i.C3397a;

/* renamed from: b.l.a.c.b.m.d */
public final class C1905d {

    /* renamed from: a */
    public final Account f3412a;

    /* renamed from: b */
    public final Set<Scope> f3413b;

    /* renamed from: c */
    public final Set<Scope> f3414c;

    /* renamed from: d */
    public final Map<C1770a<?>, C1907b> f3415d;

    /* renamed from: e */
    public final String f3416e;

    /* renamed from: f */
    public final String f3417f;

    /* renamed from: g */
    public final C3397a f3418g;

    /* renamed from: h */
    public final boolean f3419h;

    /* renamed from: i */
    public Integer f3420i;

    /* renamed from: b.l.a.c.b.m.d$a */
    public static final class C1906a {

        /* renamed from: a */
        public Account f3421a;

        /* renamed from: b */
        public ArraySet<Scope> f3422b;

        /* renamed from: c */
        public String f3423c;

        /* renamed from: d */
        public String f3424d;

        /* renamed from: a */
        public final C1905d mo12238a() {
            return new C1905d(this.f3421a, this.f3422b, (Map<C1770a<?>, C1907b>) null, 0, (View) null, this.f3423c, this.f3424d, C3397a.f6163g, false);
        }
    }

    /* renamed from: b.l.a.c.b.m.d$b */
    public static final class C1907b {
    }

    public C1905d(Account account, Set<Scope> set, Map<C1770a<?>, C1907b> map, int i, View view, String str, String str2, C3397a aVar, boolean z) {
        this.f3412a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f3413b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f3415d = map;
        this.f3416e = str;
        this.f3417f = str2;
        this.f3418g = aVar;
        this.f3419h = z;
        HashSet hashSet = new HashSet(emptySet);
        for (C1907b requireNonNull : map.values()) {
            Objects.requireNonNull(requireNonNull);
            hashSet.addAll((Collection) null);
        }
        this.f3414c = Collections.unmodifiableSet(hashSet);
    }
}
