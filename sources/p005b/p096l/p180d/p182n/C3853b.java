package p005b.p096l.p180d.p182n;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p131e.p140i.C2734c;
import p005b.p096l.p097a.p113c.p131e.p140i.C2748d;
import p005b.p096l.p097a.p113c.p131e.p140i.C2762e;
import p005b.p096l.p097a.p113c.p131e.p140i.C2790g0;
import p005b.p096l.p097a.p113c.p131e.p140i.C2802h;
import p005b.p096l.p097a.p113c.p131e.p140i.C2815i;
import p005b.p096l.p097a.p113c.p131e.p140i.C2828j;
import p005b.p096l.p097a.p113c.p131e.p140i.C2841k;
import p005b.p096l.p097a.p113c.p131e.p140i.C2854l;
import p005b.p096l.p097a.p113c.p131e.p140i.C2867m;
import p005b.p096l.p097a.p113c.p131e.p140i.C2880n;
import p005b.p096l.p097a.p113c.p131e.p140i.C2893o;
import p005b.p096l.p097a.p113c.p131e.p140i.C2930qa;
import p005b.p096l.p097a.p113c.p131e.p140i.C2932r;
import p005b.p096l.p097a.p113c.p145h.p147b.C3305r6;

/* renamed from: b.l.d.n.b */
public final class C3853b implements C3305r6 {

    /* renamed from: a */
    public final /* synthetic */ C2790g0 f7086a;

    public C3853b(C2790g0 g0Var) {
        this.f7086a = g0Var;
    }

    /* renamed from: a */
    public final void mo14565a(String str, String str2, Bundle bundle) {
        this.f7086a.mo13338d(str, str2, bundle);
    }

    /* renamed from: b */
    public final void mo14566b(String str, @Nullable String str2, @Nullable Bundle bundle) {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        g0Var.f4740c.execute(new C2748d(g0Var, str, str2, bundle));
    }

    /* renamed from: c */
    public final List<Bundle> mo14567c(@Nullable String str, @Nullable String str2) {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2762e(g0Var, str, str2, qaVar));
        List<Bundle> list = (List) C2930qa.m5116o(qaVar.mo13604n(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: d */
    public final void mo14568d(Bundle bundle) {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        g0Var.f4740c.execute(new C2734c(g0Var, bundle));
    }

    /* renamed from: e */
    public final int mo14569e(String str) {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2932r(g0Var, str, qaVar));
        Integer num = (Integer) C2930qa.m5116o(qaVar.mo13604n(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Nullable
    /* renamed from: f */
    public final String mo14570f() {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2841k(g0Var, qaVar));
        return qaVar.mo13603k(50);
    }

    @Nullable
    /* renamed from: g */
    public final String mo14571g() {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2880n(g0Var, qaVar));
        return qaVar.mo13603k(500);
    }

    @Nullable
    /* renamed from: h */
    public final String mo14572h() {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2828j(g0Var, qaVar));
        return qaVar.mo13603k(500);
    }

    /* renamed from: i */
    public final Map<String, Object> mo14573i(@Nullable String str, @Nullable String str2, boolean z) {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2893o(g0Var, str, str2, z, qaVar));
        Bundle n = qaVar.mo13604n(5000);
        if (n == null || n.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(n.size());
        for (String str3 : n.keySet()) {
            Object obj = n.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public final long mo14574j() {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2854l(g0Var, qaVar));
        Long l = (Long) C2930qa.m5116o(qaVar.mo13604n(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nanoTime = System.nanoTime();
        Objects.requireNonNull((C1959c) g0Var.f4739b);
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i = g0Var.f4743f + 1;
        g0Var.f4743f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: k */
    public final void mo14575k(String str) {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        g0Var.f4740c.execute(new C2815i(g0Var, str));
    }

    /* renamed from: m */
    public final void mo14576m(String str) {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        g0Var.f4740c.execute(new C2802h(g0Var, str));
    }

    @Nullable
    /* renamed from: r */
    public final String mo14577r() {
        C2790g0 g0Var = this.f7086a;
        Objects.requireNonNull(g0Var);
        C2930qa qaVar = new C2930qa();
        g0Var.f4740c.execute(new C2867m(g0Var, qaVar));
        return qaVar.mo13603k(500);
    }
}
