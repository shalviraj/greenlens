package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Arrays;

/* renamed from: b.l.a.c.e.i.o7 */
public final class C2901o7 extends C2875m7<C2888n7, C2888n7> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo13491a(Object obj, int i, long j) {
        ((C2888n7) obj).mo13520c(i << 3, Long.valueOf(j));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo13492b() {
        return C2888n7.m4996a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo13493c(Object obj, Object obj2) {
        ((C2899o5) obj).zzc = (C2888n7) obj2;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo13494d(Object obj) {
        return ((C2899o5) obj).zzc;
    }

    /* renamed from: e */
    public final void mo13495e(Object obj) {
        ((C2899o5) obj).zzc.f4910e = false;
    }

    /* renamed from: f */
    public final Object mo13496f(Object obj, Object obj2) {
        C2888n7 n7Var = (C2888n7) obj2;
        if (n7Var.equals(C2888n7.f4905f)) {
            return obj;
        }
        C2888n7 n7Var2 = (C2888n7) obj;
        int i = n7Var2.f4906a + n7Var.f4906a;
        int[] copyOf = Arrays.copyOf(n7Var2.f4907b, i);
        System.arraycopy(n7Var.f4907b, 0, copyOf, n7Var2.f4906a, n7Var.f4906a);
        Object[] copyOf2 = Arrays.copyOf(n7Var2.f4908c, i);
        System.arraycopy(n7Var.f4908c, 0, copyOf2, n7Var2.f4906a, n7Var.f4906a);
        return new C2888n7(i, copyOf, copyOf2, true);
    }

    /* renamed from: g */
    public final int mo13497g(Object obj) {
        C2888n7 n7Var = (C2888n7) obj;
        int i = n7Var.f4909d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < n7Var.f4906a; i3++) {
            int i4 = n7Var.f4907b[i3];
            int u = C3002w4.m5506u(8);
            int l = ((C2937r4) n7Var.f4908c[i3]).mo13567l();
            i2 += C3002w4.m5506u(l) + l + C3002w4.m5506u(24) + C3002w4.m5506u(i4 >>> 3) + C3002w4.m5506u(16) + u + u;
        }
        n7Var.f4909d = i2;
        return i2;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ int mo13498h(Object obj) {
        return ((C2888n7) obj).mo13519b();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13499i(Object obj, C3015x4 x4Var) {
        ((C2888n7) obj).mo13521d(x4Var);
    }
}
