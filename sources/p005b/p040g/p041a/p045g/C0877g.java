package p005b.p040g.p041a.p045g;

import java.util.Date;
import p005b.p096l.p224e.C4471p;
import p005b.p096l.p224e.C4475t;

/* renamed from: b.g.a.g.g */
public class C0877g implements C4471p<C0878h> {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo10724a(p005b.p096l.p224e.C4472q r13, java.lang.reflect.Type r14, p005b.p096l.p224e.C4470o r15) {
        /*
            r12 = this;
            java.util.Objects.requireNonNull(r13)
            boolean r14 = r13 instanceof p005b.p096l.p224e.C4474s
            if (r14 != 0) goto L_0x00cb
            boolean r14 = r13 instanceof p005b.p096l.p224e.C4475t
            if (r14 == 0) goto L_0x00cb
            b.l.e.t r13 = r13.mo16136e()
            java.lang.String r14 = "iss"
            java.lang.String r1 = r12.mo10726c(r13, r14)
            java.lang.String r14 = "sub"
            java.lang.String r2 = r12.mo10726c(r13, r14)
            java.lang.String r14 = "exp"
            java.util.Date r3 = r12.mo10725b(r13, r14)
            java.lang.String r14 = "nbf"
            java.util.Date r4 = r12.mo10725b(r13, r14)
            java.lang.String r14 = "iat"
            java.util.Date r5 = r12.mo10725b(r13, r14)
            java.lang.String r14 = "jti"
            java.lang.String r6 = r12.mo10726c(r13, r14)
            java.lang.String r14 = "aud"
            java.util.List r15 = java.util.Collections.emptyList()
            boolean r0 = r13.mo16145u(r14)
            r7 = 0
            if (r0 == 0) goto L_0x007e
            b.l.e.q r14 = r13.mo16144r(r14)
            java.util.Objects.requireNonNull(r14)
            boolean r15 = r14 instanceof p005b.p096l.p224e.C4469n
            if (r15 == 0) goto L_0x0075
            b.l.e.n r14 = r14.mo16135d()
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.List<b.l.e.q> r0 = r14.f8317g
            int r0 = r0.size()
            r15.<init>(r0)
            r0 = r7
        L_0x005b:
            java.util.List<b.l.e.q> r8 = r14.f8317g
            int r8 = r8.size()
            if (r0 >= r8) goto L_0x007e
            java.util.List<b.l.e.q> r8 = r14.f8317g
            java.lang.Object r8 = r8.get(r0)
            b.l.e.q r8 = (p005b.p096l.p224e.C4472q) r8
            java.lang.String r8 = r8.mo16134q()
            r15.add(r8)
            int r0 = r0 + 1
            goto L_0x005b
        L_0x0075:
            java.lang.String r14 = r14.mo16134q()
            java.util.List r14 = java.util.Collections.singletonList(r14)
            goto L_0x007f
        L_0x007e:
            r14 = r15
        L_0x007f:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Set r13 = r13.entrySet()
            b.l.e.e0.s$b r13 = (p005b.p096l.p224e.p226e0.C4372s.C4374b) r13
            b.l.e.e0.s r13 = p005b.p096l.p224e.p226e0.C4372s.this
            b.l.e.e0.s$e<K, V> r15 = r13.f8093k
            b.l.e.e0.s$e<K, V> r15 = r15.f8105j
            int r0 = r13.f8092j
        L_0x0092:
            b.l.e.e0.s$e<K, V> r9 = r13.f8093k
            if (r15 == r9) goto L_0x0098
            r10 = 1
            goto L_0x0099
        L_0x0098:
            r10 = r7
        L_0x0099:
            if (r10 == 0) goto L_0x00c3
            if (r15 == r9) goto L_0x00bd
            int r9 = r13.f8092j
            if (r9 != r0) goto L_0x00b7
            b.l.e.e0.s$e<K, V> r9 = r15.f8105j
            java.lang.Object r10 = r15.getKey()
            b.g.a.g.c r11 = new b.g.a.g.c
            java.lang.Object r15 = r15.getValue()
            b.l.e.q r15 = (p005b.p096l.p224e.C4472q) r15
            r11.<init>(r15)
            r8.put(r10, r11)
            r15 = r9
            goto L_0x0092
        L_0x00b7:
            java.util.ConcurrentModificationException r13 = new java.util.ConcurrentModificationException
            r13.<init>()
            throw r13
        L_0x00bd:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L_0x00c3:
            b.g.a.g.h r13 = new b.g.a.g.h
            r0 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r13
        L_0x00cb:
            b.g.a.g.d r13 = new b.g.a.g.d
            java.lang.String r14 = "The token's payload had an invalid JSON format."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p040g.p041a.p045g.C0877g.mo10724a(b.l.e.q, java.lang.reflect.Type, b.l.e.o):java.lang.Object");
    }

    /* renamed from: b */
    public final Date mo10725b(C4475t tVar, String str) {
        if (!tVar.mo16145u(str)) {
            return null;
        }
        return new Date(tVar.mo16144r(str).mo16133n() * 1000);
    }

    /* renamed from: c */
    public final String mo10726c(C4475t tVar, String str) {
        if (!tVar.mo16145u(str)) {
            return null;
        }
        return tVar.mo16144r(str).mo16134q();
    }
}
