package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Arrays;

/* renamed from: b.l.a.c.e.e.c1 */
public final class C2073c1 extends C2023a1<C2048b1, C2048b1> {
    /* renamed from: a */
    public final boolean mo12345a(C2389om omVar) {
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo12346b(Object obj, int i, long j) {
        ((C2048b1) obj).mo12418c(i << 3, Long.valueOf(j));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12347c(Object obj, int i, int i2) {
        ((C2048b1) obj).mo12418c((i << 3) | 5, Integer.valueOf(i2));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12348d(Object obj, int i, long j) {
        ((C2048b1) obj).mo12418c((i << 3) | 1, Long.valueOf(j));
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo12349e(Object obj, int i, C2317lm lmVar) {
        ((C2048b1) obj).mo12418c((i << 3) | 2, lmVar);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo12350f(Object obj, int i, Object obj2) {
        ((C2048b1) obj).mo12418c((i << 3) | 3, obj2);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo12351g() {
        return C2048b1.m3040a();
    }

    /* renamed from: h */
    public final Object mo12352h(Object obj) {
        ((C2048b1) obj).f3621e = false;
        return obj;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo12353i(Object obj, Object obj2) {
        ((C2071c) obj).zzc = (C2048b1) obj2;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo12354j(Object obj) {
        return ((C2071c) obj).zzc;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo12355k(Object obj) {
        C2071c cVar = (C2071c) obj;
        C2048b1 b1Var = cVar.zzc;
        if (b1Var != C2048b1.f3616f) {
            return b1Var;
        }
        C2048b1 a = C2048b1.m3040a();
        cVar.zzc = a;
        return a;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo12356l(Object obj, Object obj2) {
        ((C2071c) obj).zzc = (C2048b1) obj2;
    }

    /* renamed from: m */
    public final void mo12357m(Object obj) {
        ((C2071c) obj).zzc.f3621e = false;
    }

    /* renamed from: o */
    public final Object mo12359o(Object obj, Object obj2) {
        C2048b1 b1Var = (C2048b1) obj2;
        if (b1Var.equals(C2048b1.f3616f)) {
            return obj;
        }
        C2048b1 b1Var2 = (C2048b1) obj;
        int i = b1Var2.f3617a + b1Var.f3617a;
        int[] copyOf = Arrays.copyOf(b1Var2.f3618b, i);
        System.arraycopy(b1Var.f3618b, 0, copyOf, b1Var2.f3617a, b1Var.f3617a);
        Object[] copyOf2 = Arrays.copyOf(b1Var2.f3619c, i);
        System.arraycopy(b1Var.f3619c, 0, copyOf2, b1Var2.f3617a, b1Var.f3617a);
        return new C2048b1(i, copyOf, copyOf2, true);
    }

    /* renamed from: p */
    public final int mo12360p(Object obj) {
        C2048b1 b1Var = (C2048b1) obj;
        int i = b1Var.f3620d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < b1Var.f3617a; i3++) {
            int i4 = b1Var.f3618b[i3];
            int b = C2509tm.m4203b(8);
            int l = ((C2317lm) b1Var.f3619c[i3]).mo12755l();
            i2 += C2509tm.m4203b(l) + l + C2509tm.m4203b(24) + C2509tm.m4203b(i4 >>> 3) + C2509tm.m4203b(16) + b + b;
        }
        b1Var.f3620d = i2;
        return i2;
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ int mo12361q(Object obj) {
        return ((C2048b1) obj).mo12417b();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ void mo12362r(Object obj, C2533um umVar) {
        ((C2048b1) obj).mo12419d(umVar);
    }
}
