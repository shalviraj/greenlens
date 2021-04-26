package p298d.p299a.p300a.p301a.p303y0.p405l;

import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7237o;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7465f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7528b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7531e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7532f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7536j;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7538l;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.e */
public final class C7462e {

    /* renamed from: a */
    public static final C7462e f14887a = new C7462e();

    /* renamed from: a */
    public static final boolean m13462a(C7465f fVar, C7462e eVar, C7535i iVar, C7535i iVar2, boolean z) {
        boolean z2;
        C7491b bVar = (C7491b) fVar;
        C6888i.m12438e(bVar, "this");
        C6888i.m12438e(iVar, "receiver");
        C7538l I4 = C5266a.m9823I4(bVar, iVar);
        if (I4 instanceof C7237o) {
            Set<C7452c0> set = ((C7237o) I4).f14467c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (C7534h hVar : set) {
                    if (C6888i.m12434a(C5266a.m9829J4(fVar, hVar), C5266a.m9823I4(bVar, iVar2)) || (z && m13463g(eVar, fVar, iVar2, hVar, false, 8))) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: d.a.a.a.y0.l.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: d.a.a.a.y0.l.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v83, types: [d.a.a.a.y0.l.l1.h] */
    /* JADX WARNING: type inference failed for: r1v85, types: [d.a.a.a.y0.l.l1.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0385, code lost:
        if (m13462a(r7, r12, r1, r2, false) != false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03e4, code lost:
        if (m13462a(r7, r12, r2, r1, true) == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021d, code lost:
        if (((p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g) r4).f14934m != false) goto L_0x0287;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x059e A[LOOP:8: B:226:0x0555->B:247:0x059e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x05ac A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13463g(p298d.p299a.p300a.p301a.p303y0.p405l.C7462e r25, p298d.p299a.p300a.p301a.p303y0.p405l.C7465f r26, p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h r27, p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h r28, boolean r29, int r30) {
        /*
            r6 = r25
            r7 = r26
            r0 = r27
            r1 = r28
            java.util.Objects.requireNonNull(r25)
            java.lang.String r8 = "context"
            p298d.p344x.p346c.C6888i.m12438e(r7, r8)
            java.lang.String r9 = "subType"
            p298d.p344x.p346c.C6888i.m12438e(r0, r9)
            java.lang.String r10 = "superType"
            p298d.p344x.p346c.C6888i.m12438e(r1, r10)
            if (r0 != r1) goto L_0x001e
            goto L_0x0713
        L_0x001e:
            p298d.p344x.p346c.C6888i.m12438e(r0, r9)
            p298d.p344x.p346c.C6888i.m12438e(r1, r10)
            d.a.a.a.y0.l.l1.h r0 = r26.mo25081J(r27)
            d.a.a.a.y0.l.l1.h r11 = r7.mo25080I(r0)
            d.a.a.a.y0.l.l1.h r0 = r7.mo25081J(r1)
            d.a.a.a.y0.l.l1.h r12 = r7.mo25080I(r0)
            d.a.a.a.y0.l.l1.i r13 = p005b.p291q.p292a.C5266a.m9927b3(r7, r11)
            d.a.a.a.y0.l.l1.i r14 = p005b.p291q.p292a.C5266a.m9841L4(r7, r12)
            r15 = r7
            d.a.a.a.y0.l.j1.b r15 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b) r15
            boolean r0 = r15.mo25104R(r13)
            java.lang.String r5 = "this"
            java.lang.String r4 = "receiver"
            java.lang.String r3 = "ClassicTypeSystemContext couldn't handle: "
            java.lang.String r2 = ", "
            r16 = 0
            if (r0 != 0) goto L_0x019f
            boolean r0 = r15.mo25104R(r14)
            if (r0 == 0) goto L_0x0057
            goto L_0x019f
        L_0x0057:
            r15.mo25107U(r13)
            r15.mo25107U(r14)
            d.a.a.a.y0.l.l1.d r0 = p005b.p291q.p292a.C5266a.m10043v(r15, r14)
            if (r0 != 0) goto L_0x0065
            r0 = r14
            goto L_0x0073
        L_0x0065:
            p298d.p344x.p346c.C6888i.m12438e(r15, r5)
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7553o
            if (r1 == 0) goto L_0x0177
            d.a.a.a.y0.l.o r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7553o) r0
            d.a.a.a.y0.l.j0 r0 = r0.f14992h
        L_0x0073:
            p298d.p344x.p346c.C6888i.m12438e(r15, r5)
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0
            if (r1 == 0) goto L_0x0164
            boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g
            if (r1 == 0) goto L_0x0084
            d.a.a.a.y0.l.j1.g r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g) r0
            goto L_0x0086
        L_0x0084:
            r0 = r16
        L_0x0086:
            if (r0 != 0) goto L_0x008b
            r1 = r16
            goto L_0x0093
        L_0x008b:
            p298d.p344x.p346c.C6888i.m12438e(r15, r5)
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            d.a.a.a.y0.l.g1 r1 = r0.f14931j
        L_0x0093:
            if (r0 == 0) goto L_0x0117
            if (r1 == 0) goto L_0x0117
            boolean r17 = p005b.p291q.p292a.C5266a.m9779B2(r15, r14)
            if (r17 == 0) goto L_0x00dd
            p298d.p344x.p346c.C6888i.m12438e(r15, r5)
            p298d.p344x.p346c.C6888i.m12438e(r1, r4)
            r27 = r2
            boolean r2 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i
            if (r2 == 0) goto L_0x00b3
            d.a.a.a.y0.l.l1.i r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r1
            r2 = 1
            d.a.a.a.y0.l.l1.i r1 = p005b.p291q.p292a.C5266a.m9859O4(r15, r1, r2)
            r28 = r3
            goto L_0x00f3
        L_0x00b3:
            boolean r2 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7532f
            if (r2 == 0) goto L_0x00d1
            d.a.a.a.y0.l.l1.f r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7532f) r1
            d.a.a.a.y0.l.l1.i r2 = p005b.p291q.p292a.C5266a.m9921a3(r15, r1)
            r28 = r3
            r3 = 1
            d.a.a.a.y0.l.l1.i r2 = p005b.p291q.p292a.C5266a.m9859O4(r15, r2, r3)
            d.a.a.a.y0.l.l1.i r1 = p005b.p291q.p292a.C5266a.m9835K4(r15, r1)
            d.a.a.a.y0.l.l1.i r1 = p005b.p291q.p292a.C5266a.m9859O4(r15, r1, r3)
            d.a.a.a.y0.l.l1.h r1 = p005b.p291q.p292a.C5266a.m10044v0(r15, r2, r1)
            goto L_0x00f3
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "sealed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r27 = r2
            r28 = r3
            boolean r2 = r15.mo25076E(r14)
            if (r2 == 0) goto L_0x00f3
            p298d.p344x.p346c.C6888i.m12438e(r15, r5)
            p298d.p344x.p346c.C6888i.m12438e(r1, r4)
            r2 = 0
            r3 = 1
            d.a.a.a.y0.l.g1 r1 = p298d.p299a.p300a.p301a.p303y0.p405l.C7544m0.m13700b(r1, r2, r3)
        L_0x00f3:
            r3 = r1
            p298d.p344x.p346c.C6888i.m12438e(r13, r9)
            p298d.p344x.p346c.C6888i.m12438e(r0, r10)
            r17 = 0
            r18 = 8
            r0 = r25
            r1 = r15
            r19 = r27
            r2 = r13
            r20 = r28
            r6 = r4
            r4 = r17
            r17 = r6
            r6 = r5
            r5 = r18
            boolean r0 = m13463g(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x011e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x015e
        L_0x0117:
            r19 = r2
            r20 = r3
            r17 = r4
            r6 = r5
        L_0x011e:
            d.a.a.a.y0.l.l1.l r0 = p005b.p291q.p292a.C5266a.m9823I4(r15, r14)
            boolean r1 = r15.mo25106T(r0)
            if (r1 == 0) goto L_0x015c
            p005b.p291q.p292a.C5266a.m9779B2(r15, r14)
            java.util.Collection r0 = r15.mo25109W(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0136
            goto L_0x0156
        L_0x0136:
            java.util.Iterator r14 = r0.iterator()
        L_0x013a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r14.next()
            r3 = r0
            d.a.a.a.y0.l.l1.h r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h) r3
            r4 = 0
            r5 = 8
            r0 = r25
            r1 = r15
            r2 = r13
            boolean r0 = m13463g(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x013a
            r0 = 0
            goto L_0x0157
        L_0x0156:
            r0 = 1
        L_0x0157:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x015e
        L_0x015c:
            r0 = r16
        L_0x015e:
            r2 = r19
            r1 = r20
            goto L_0x01d7
        L_0x0164:
            r1 = r3
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m425A(r1, r0, r2)
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m457r(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0177:
            r1 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.Class r0 = r0.getClass()
            d.a.e r0 = p298d.p344x.p346c.C6902w.m12460a(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x019f:
            r1 = r3
            r17 = r4
            r6 = r5
            boolean r0 = r15.f14922e
            if (r0 == 0) goto L_0x01aa
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x01d7
        L_0x01aa:
            boolean r0 = p005b.p291q.p292a.C5266a.m9779B2(r15, r13)
            if (r0 == 0) goto L_0x01b9
            boolean r0 = p005b.p291q.p292a.C5266a.m9779B2(r15, r14)
            if (r0 != 0) goto L_0x01b9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x01d7
        L_0x01b9:
            r0 = 0
            d.a.a.a.y0.l.l1.i r3 = p005b.p291q.p292a.C5266a.m9859O4(r15, r13, r0)
            d.a.a.a.y0.l.l1.i r0 = p005b.p291q.p292a.C5266a.m9859O4(r15, r14, r0)
            p298d.p344x.p346c.C6888i.m12438e(r15, r8)
            java.lang.String r4 = "a"
            p298d.p344x.p346c.C6888i.m12438e(r3, r4)
            java.lang.String r4 = "b"
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            boolean r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7454d.m13425b(r15, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01d7:
            if (r0 != 0) goto L_0x07da
            r7.mo25086z(r11, r12)
            d.a.a.a.y0.l.l1.i r0 = p005b.p291q.p292a.C5266a.m9927b3(r7, r11)
            d.a.a.a.y0.l.l1.i r3 = p005b.p291q.p292a.C5266a.m9841L4(r7, r12)
            p298d.p344x.p346c.C6888i.m12438e(r7, r8)
            p298d.p344x.p346c.C6888i.m12438e(r0, r9)
            p298d.p344x.p346c.C6888i.m12438e(r3, r10)
            boolean r4 = p005b.p291q.p292a.C5266a.m9779B2(r15, r3)
            java.lang.String r5 = "<this>"
            java.lang.String r8 = "current"
            java.lang.String r10 = ". Supertypes = "
            java.lang.String r11 = "Too many supertypes for type: "
            if (r4 == 0) goto L_0x01fc
            goto L_0x0202
        L_0x01fc:
            boolean r4 = r7.mo25076E(r0)
            if (r4 == 0) goto L_0x0206
        L_0x0202:
            r12 = r17
            goto L_0x0287
        L_0x0206:
            boolean r4 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7529c
            if (r4 == 0) goto L_0x0247
            r4 = r0
            d.a.a.a.y0.l.l1.c r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7529c) r4
            p298d.p344x.p346c.C6888i.m12438e(r15, r6)
            r12 = r17
            p298d.p344x.p346c.C6888i.m12438e(r4, r12)
            boolean r13 = r4 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g
            if (r13 == 0) goto L_0x0220
            d.a.a.a.y0.l.j1.g r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g) r4
            boolean r4 = r4.f14934m
            if (r4 == 0) goto L_0x0249
            goto L_0x0287
        L_0x0220:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            java.lang.Class r1 = r4.getClass()
            d.a.e r1 = p298d.p344x.p346c.C6902w.m12460a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0247:
            r12 = r17
        L_0x0249:
            d.a.a.a.y0.l.f$a$b r4 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7468b.f14894a
            boolean r4 = p298d.p299a.p300a.p301a.p303y0.p405l.C7451c.m13412a(r7, r0, r4)
            if (r4 == 0) goto L_0x0252
            goto L_0x0287
        L_0x0252:
            boolean r4 = r7.mo25076E(r3)
            if (r4 == 0) goto L_0x0259
            goto L_0x0268
        L_0x0259:
            d.a.a.a.y0.l.f$a$d r4 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7470d.f14896a
            boolean r4 = p298d.p299a.p300a.p301a.p303y0.p405l.C7451c.m13412a(r7, r3, r4)
            if (r4 == 0) goto L_0x0262
            goto L_0x0268
        L_0x0262:
            boolean r4 = r7.mo25075D(r0)
            if (r4 == 0) goto L_0x0270
        L_0x0268:
            r20 = r1
            r19 = r2
            r17 = r12
            goto L_0x0346
        L_0x0270:
            d.a.a.a.y0.l.l1.l r4 = p005b.p291q.p292a.C5266a.m9823I4(r15, r3)
            p298d.p344x.p346c.C6888i.m12438e(r7, r5)
            java.lang.String r13 = "start"
            p298d.p344x.p346c.C6888i.m12438e(r0, r13)
            java.lang.String r13 = "end"
            p298d.p344x.p346c.C6888i.m12438e(r4, r13)
            boolean r13 = p298d.p299a.p300a.p301a.p303y0.p405l.C7451c.m13413b(r7, r0, r4)
            if (r13 == 0) goto L_0x028f
        L_0x0287:
            r20 = r1
            r19 = r2
            r17 = r12
            goto L_0x0307
        L_0x028f:
            r26.mo25074C()
            java.util.ArrayDeque<d.a.a.a.y0.l.l1.i> r13 = r7.f14892c
            p298d.p344x.p346c.C6888i.m12436c(r13)
            java.util.Set<d.a.a.a.y0.l.l1.i> r14 = r7.f14893d
            p298d.p344x.p346c.C6888i.m12436c(r14)
            r13.push(r0)
        L_0x029f:
            boolean r17 = r13.isEmpty()
            r17 = r17 ^ 1
            if (r17 == 0) goto L_0x033d
            r17 = r12
            int r12 = r14.size()
            r20 = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r12 > r1) goto L_0x0314
            java.lang.Object r1 = r13.pop()
            d.a.a.a.y0.l.l1.i r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r1
            p298d.p344x.p346c.C6888i.m12437d(r1, r8)
            boolean r12 = r14.add(r1)
            if (r12 != 0) goto L_0x02c5
            r19 = r2
            goto L_0x030d
        L_0x02c5:
            boolean r12 = p005b.p291q.p292a.C5266a.m9779B2(r15, r1)
            if (r12 == 0) goto L_0x02ce
            d.a.a.a.y0.l.f$a$c r12 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7469c.f14895a
            goto L_0x02d0
        L_0x02ce:
            d.a.a.a.y0.l.f$a$b r12 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7468b.f14894a
        L_0x02d0:
            r19 = r2
            d.a.a.a.y0.l.f$a$c r2 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7469c.f14895a
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r12, r2)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x02dd
            goto L_0x02df
        L_0x02dd:
            r12 = r16
        L_0x02df:
            if (r12 != 0) goto L_0x02e2
            goto L_0x030d
        L_0x02e2:
            d.a.a.a.y0.l.l1.l r1 = p005b.p291q.p292a.C5266a.m9823I4(r15, r1)
            java.util.Collection r1 = r15.mo25109W(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x02ee:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x030d
            java.lang.Object r2 = r1.next()
            d.a.a.a.y0.l.l1.h r2 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h) r2
            d.a.a.a.y0.l.l1.i r2 = r12.mo25087a(r7, r2)
            boolean r18 = p298d.p299a.p300a.p301a.p303y0.p405l.C7451c.m13413b(r7, r2, r4)
            if (r18 == 0) goto L_0x0309
            r26.mo25072A()
        L_0x0307:
            r1 = 1
            goto L_0x0347
        L_0x0309:
            r13.add(r2)
            goto L_0x02ee
        L_0x030d:
            r12 = r17
            r2 = r19
            r1 = r20
            goto L_0x029f
        L_0x0314:
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m425A(r11, r0, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r17 = r14
            java.lang.String r1 = p298d.p334t.C6790h.m12369w(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x033d:
            r20 = r1
            r19 = r2
            r17 = r12
            r26.mo25072A()
        L_0x0346:
            r1 = 0
        L_0x0347:
            if (r1 != 0) goto L_0x034b
            goto L_0x07b9
        L_0x034b:
            d.a.a.a.y0.l.l1.i r1 = p005b.p291q.p292a.C5266a.m9927b3(r7, r0)
            d.a.a.a.y0.l.l1.i r2 = p005b.p291q.p292a.C5266a.m9841L4(r7, r3)
            boolean r4 = r7.mo25078G(r1)
            if (r4 != 0) goto L_0x0362
            boolean r4 = r7.mo25078G(r2)
            if (r4 != 0) goto L_0x0362
            r1 = r16
            goto L_0x0370
        L_0x0362:
            boolean r4 = r7.mo25078G(r1)
            if (r4 == 0) goto L_0x0376
            boolean r4 = r7.mo25078G(r2)
            if (r4 == 0) goto L_0x0376
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L_0x0370:
            r12 = r25
            r13 = r17
            goto L_0x03eb
        L_0x0376:
            boolean r4 = r7.mo25078G(r1)
            if (r4 == 0) goto L_0x0388
            r4 = 0
            r12 = r25
            r13 = r17
            boolean r1 = m13462a(r7, r12, r1, r2, r4)
            if (r1 == 0) goto L_0x03e9
            goto L_0x03e6
        L_0x0388:
            r12 = r25
            r13 = r17
            boolean r4 = r7.mo25078G(r2)
            if (r4 == 0) goto L_0x03e9
            d.a.a.a.y0.l.l1.l r4 = p005b.p291q.p292a.C5266a.m9823I4(r15, r1)
            boolean r14 = r4 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7533g
            if (r14 == 0) goto L_0x03dc
            java.util.Collection r4 = r15.mo25109W(r4)
            boolean r14 = r4.isEmpty()
            if (r14 == 0) goto L_0x03a5
            goto L_0x03d7
        L_0x03a5:
            java.util.Iterator r4 = r4.iterator()
        L_0x03a9:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x03d7
            java.lang.Object r14 = r4.next()
            d.a.a.a.y0.l.l1.h r14 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h) r14
            d.a.a.a.y0.l.l1.i r14 = p005b.p291q.p292a.C5266a.m9788D(r15, r14)
            if (r14 != 0) goto L_0x03c0
            r27 = r4
            r14 = r16
            goto L_0x03ca
        L_0x03c0:
            boolean r14 = r7.mo25078G(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r27 = r4
        L_0x03ca:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r14, r4)
            if (r4 == 0) goto L_0x03d4
            r4 = 1
            goto L_0x03d8
        L_0x03d4:
            r4 = r27
            goto L_0x03a9
        L_0x03d7:
            r4 = 0
        L_0x03d8:
            if (r4 == 0) goto L_0x03dc
            r4 = 1
            goto L_0x03dd
        L_0x03dc:
            r4 = 0
        L_0x03dd:
            if (r4 != 0) goto L_0x03e6
            r4 = 1
            boolean r1 = m13462a(r7, r12, r2, r1, r4)
            if (r1 == 0) goto L_0x03e9
        L_0x03e6:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x03eb
        L_0x03e9:
            r1 = r16
        L_0x03eb:
            if (r1 != 0) goto L_0x07d1
            d.a.a.a.y0.l.l1.l r1 = p005b.p291q.p292a.C5266a.m9823I4(r15, r3)
            d.a.a.a.y0.l.l1.l r2 = p005b.p291q.p292a.C5266a.m9823I4(r15, r0)
            boolean r2 = r15.mo25124v(r2, r1)
            if (r2 == 0) goto L_0x0403
            int r2 = r15.mo25108V(r1)
            if (r2 != 0) goto L_0x0403
            goto L_0x0713
        L_0x0403:
            d.a.a.a.y0.l.l1.l r2 = p005b.p291q.p292a.C5266a.m9823I4(r15, r3)
            p298d.p344x.p346c.C6888i.m12438e(r15, r6)
            p298d.p344x.p346c.C6888i.m12438e(r2, r13)
            boolean r4 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0
            if (r4 == 0) goto L_0x07bb
            d.a.a.a.y0.l.t0 r2 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0) r2
            d.a.a.a.y0.f.c r4 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.any
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isTypeConstructorForGivenClass(r2, r4)
            if (r2 == 0) goto L_0x041d
            goto L_0x0713
        L_0x041d:
            p298d.p344x.p346c.C6888i.m12438e(r7, r5)
            p298d.p344x.p346c.C6888i.m12438e(r0, r9)
            java.lang.String r2 = "superConstructor"
            p298d.p344x.p346c.C6888i.m12438e(r1, r2)
            boolean r2 = r7.mo25075D(r0)
            if (r2 == 0) goto L_0x0433
            java.util.List r2 = r12.mo25066c(r7, r0, r1)
            goto L_0x0443
        L_0x0433:
            boolean r2 = p005b.p291q.p292a.C5266a.m10022r2(r15, r1)
            if (r2 != 0) goto L_0x0447
            boolean r2 = p005b.p291q.p292a.C5266a.m10070z2(r15, r1)
            if (r2 != 0) goto L_0x0447
            java.util.List r2 = r12.mo25065b(r7, r0, r1)
        L_0x0443:
            r27 = r8
            goto L_0x0510
        L_0x0447:
            d.a.a.a.y0.n.l r2 = new d.a.a.a.y0.n.l
            r2.<init>()
            r26.mo25074C()
            java.util.ArrayDeque<d.a.a.a.y0.l.l1.i> r4 = r7.f14892c
            p298d.p344x.p346c.C6888i.m12436c(r4)
            java.util.Set<d.a.a.a.y0.l.l1.i> r5 = r7.f14893d
            p298d.p344x.p346c.C6888i.m12436c(r5)
            r4.push(r0)
        L_0x045c:
            boolean r9 = r4.isEmpty()
            r9 = r9 ^ 1
            if (r9 == 0) goto L_0x04e8
            int r9 = r5.size()
            r14 = 1000(0x3e8, float:1.401E-42)
            if (r9 > r14) goto L_0x04bf
            java.lang.Object r9 = r4.pop()
            d.a.a.a.y0.l.l1.i r9 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r9
            p298d.p344x.p346c.C6888i.m12437d(r9, r8)
            boolean r14 = r5.add(r9)
            if (r14 != 0) goto L_0x047c
            goto L_0x045c
        L_0x047c:
            boolean r14 = r7.mo25075D(r9)
            if (r14 == 0) goto L_0x0488
            r2.add(r9)
            d.a.a.a.y0.l.f$a$c r14 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7469c.f14895a
            goto L_0x048a
        L_0x0488:
            d.a.a.a.y0.l.f$a$b r14 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7468b.f14894a
        L_0x048a:
            r27 = r8
            d.a.a.a.y0.l.f$a$c r8 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7469c.f14895a
            boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r14, r8)
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0497
            goto L_0x0499
        L_0x0497:
            r14 = r16
        L_0x0499:
            if (r14 != 0) goto L_0x049c
            goto L_0x04bc
        L_0x049c:
            d.a.a.a.y0.l.l1.l r8 = p005b.p291q.p292a.C5266a.m9823I4(r15, r9)
            java.util.Collection r8 = r15.mo25109W(r8)
            java.util.Iterator r8 = r8.iterator()
        L_0x04a8:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x04bc
            java.lang.Object r9 = r8.next()
            d.a.a.a.y0.l.l1.h r9 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h) r9
            d.a.a.a.y0.l.l1.i r9 = r14.mo25087a(r7, r9)
            r4.add(r9)
            goto L_0x04a8
        L_0x04bc:
            r8 = r27
            goto L_0x045c
        L_0x04bf:
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m425A(r11, r0, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r17 = r5
            java.lang.String r1 = p298d.p334t.C6790h.m12369w(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x04e8:
            r27 = r8
            r26.mo25072A()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x04f6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x050f
            java.lang.Object r5 = r2.next()
            d.a.a.a.y0.l.l1.i r5 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r5
            java.lang.String r8 = "it"
            p298d.p344x.p346c.C6888i.m12437d(r5, r8)
            java.util.List r5 = r12.mo25066c(r7, r5, r1)
            p298d.p334t.C6790h.m12342b(r4, r5)
            goto L_0x04f6
        L_0x050f:
            r2 = r4
        L_0x0510:
            int r4 = r2.size()
            if (r4 == 0) goto L_0x06f9
            r5 = 1
            if (r4 == r5) goto L_0x06e9
            d.a.a.a.y0.l.l1.a r4 = new d.a.a.a.y0.l.l1.a
            int r5 = r15.mo25108V(r1)
            r4.<init>(r5)
            int r5 = r15.mo25108V(r1)
            if (r5 <= 0) goto L_0x06bc
            r8 = 0
            r9 = 0
        L_0x052a:
            int r10 = r8 + 1
            if (r9 != 0) goto L_0x053d
            d.a.a.a.y0.l.l1.m r9 = r15.mo25101O(r1, r8)
            d.a.a.a.y0.l.l1.p r9 = r15.mo25102P(r9)
            d.a.a.a.y0.l.l1.p r11 = p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7542p.OUT
            if (r9 == r11) goto L_0x053b
            goto L_0x053d
        L_0x053b:
            r9 = 0
            goto L_0x053e
        L_0x053d:
            r9 = 1
        L_0x053e:
            if (r9 == 0) goto L_0x0546
            r28 = r1
            r27 = r9
            goto L_0x06a6
        L_0x0546:
            java.util.ArrayList r11 = new java.util.ArrayList
            r14 = 10
            int r14 = p005b.p291q.p292a.C5266a.m9892V(r2, r14)
            r11.<init>(r14)
            java.util.Iterator r14 = r2.iterator()
        L_0x0555:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L_0x05d7
            java.lang.Object r17 = r14.next()
            r28 = r1
            r1 = r17
            d.a.a.a.y0.l.l1.i r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r1
            p298d.p344x.p346c.C6888i.m12438e(r7, r6)
            p298d.p344x.p346c.C6888i.m12438e(r1, r13)
            r27 = r9
            if (r8 < 0) goto L_0x0577
            int r9 = p005b.p291q.p292a.C5266a.m10025s(r15, r1)
            if (r8 >= r9) goto L_0x0577
            r9 = 1
            goto L_0x0578
        L_0x0577:
            r9 = 0
        L_0x0578:
            if (r9 == 0) goto L_0x057f
            d.a.a.a.y0.l.l1.k r9 = p005b.p291q.p292a.C5266a.m9937d1(r15, r1, r8)
            goto L_0x0581
        L_0x057f:
            r9 = r16
        L_0x0581:
            if (r9 != 0) goto L_0x0586
            r29 = r8
            goto L_0x059a
        L_0x0586:
            r29 = r8
            d.a.a.a.y0.l.l1.p r8 = p005b.p291q.p292a.C5266a.m9889U1(r15, r9)
            r30 = r9
            d.a.a.a.y0.l.l1.p r9 = p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7542p.INV
            if (r8 != r9) goto L_0x0594
            r8 = 1
            goto L_0x0595
        L_0x0594:
            r8 = 0
        L_0x0595:
            if (r8 == 0) goto L_0x059a
            r9 = r30
            goto L_0x059c
        L_0x059a:
            r9 = r16
        L_0x059c:
            if (r9 == 0) goto L_0x05ac
            d.a.a.a.y0.l.l1.h r1 = p005b.p291q.p292a.C5266a.m9868Q1(r15, r9)
            r11.add(r1)
            r9 = r27
            r1 = r28
            r8 = r29
            goto L_0x0555
        L_0x05ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Incorrect type: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = ", subType: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", superType: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x05d7:
            r28 = r1
            r27 = r9
            p298d.p344x.p346c.C6888i.m12438e(r15, r6)
            java.lang.String r1 = "types"
            p298d.p344x.p346c.C6888i.m12438e(r11, r1)
            p298d.p344x.p346c.C6888i.m12438e(r11, r1)
            int r1 = r11.size()
            if (r1 == 0) goto L_0x06b0
            r8 = 1
            if (r1 == r8) goto L_0x0692
            java.util.ArrayList r1 = new java.util.ArrayList
            r8 = 10
            int r8 = p005b.p291q.p292a.C5266a.m9892V(r11, r8)
            r1.<init>(r8)
            java.util.Iterator r8 = r11.iterator()
            r9 = 0
            r14 = 0
        L_0x0600:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x0643
            java.lang.Object r17 = r8.next()
            r29 = r8
            r8 = r17
            d.a.a.a.y0.l.g1 r8 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1) r8
            if (r14 != 0) goto L_0x061b
            boolean r14 = p005b.p291q.p292a.C5266a.m10046v2(r8)
            if (r14 == 0) goto L_0x0619
            goto L_0x061b
        L_0x0619:
            r14 = 0
            goto L_0x061c
        L_0x061b:
            r14 = 1
        L_0x061c:
            r30 = r14
            boolean r14 = r8 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0
            if (r14 == 0) goto L_0x0625
            d.a.a.a.y0.l.j0 r8 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0) r8
            goto L_0x0635
        L_0x0625:
            boolean r9 = r8 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7579w
            if (r9 == 0) goto L_0x063d
            boolean r9 = p005b.p291q.p292a.C5266a.m10034t2(r8)
            if (r9 == 0) goto L_0x0630
            goto L_0x0699
        L_0x0630:
            d.a.a.a.y0.l.w r8 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7579w) r8
            d.a.a.a.y0.l.j0 r8 = r8.f15029h
            r9 = 1
        L_0x0635:
            r1.add(r8)
            r8 = r29
            r14 = r30
            goto L_0x0600
        L_0x063d:
            d.h r0 = new d.h
            r0.<init>()
            throw r0
        L_0x0643:
            if (r14 == 0) goto L_0x0655
            java.lang.String r1 = "Intersection of error types: "
            java.lang.String r1 = p298d.p344x.p346c.C6888i.m12444k(r1, r11)
            d.a.a.a.y0.l.j0 r8 = p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.m13783d(r1)
            java.lang.String r1 = "createErrorType(\"Intersection of error types: $types\")"
            p298d.p344x.p346c.C6888i.m12437d(r8, r1)
            goto L_0x0699
        L_0x0655:
            if (r9 != 0) goto L_0x065e
            d.a.a.a.y0.l.j1.r r8 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7512r.f14954a
            d.a.a.a.y0.l.j0 r8 = r8.mo25151b(r1)
            goto L_0x0699
        L_0x065e:
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = p005b.p291q.p292a.C5266a.m9892V(r11, r9)
            r8.<init>(r9)
            java.util.Iterator r9 = r11.iterator()
        L_0x066d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0681
            java.lang.Object r11 = r9.next()
            d.a.a.a.y0.l.g1 r11 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1) r11
            d.a.a.a.y0.l.j0 r11 = p005b.p291q.p292a.C5266a.m9847M4(r11)
            r8.add(r11)
            goto L_0x066d
        L_0x0681:
            d.a.a.a.y0.l.d0 r9 = p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0.f14869a
            d.a.a.a.y0.l.j1.r r9 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7512r.f14954a
            d.a.a.a.y0.l.j0 r1 = r9.mo25151b(r1)
            d.a.a.a.y0.l.j0 r8 = r9.mo25151b(r8)
            d.a.a.a.y0.l.g1 r8 = p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0.m13428c(r1, r8)
            goto L_0x0699
        L_0x0692:
            java.lang.Object r1 = p298d.p334t.C6790h.m12329P(r11)
            r8 = r1
            d.a.a.a.y0.l.g1 r8 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1) r8
        L_0x0699:
            p298d.p344x.p346c.C6888i.m12438e(r15, r6)
            p298d.p344x.p346c.C6888i.m12438e(r8, r13)
            d.a.a.a.y0.l.w0 r1 = p005b.p291q.p292a.C5266a.m9794E(r8)
            r4.add(r1)
        L_0x06a6:
            r9 = r27
            if (r10 < r5) goto L_0x06ab
            goto L_0x06bd
        L_0x06ab:
            r1 = r28
            r8 = r10
            goto L_0x052a
        L_0x06b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected some types"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x06bc:
            r9 = 0
        L_0x06bd:
            if (r9 != 0) goto L_0x06c6
            boolean r0 = r12.mo25069f(r7, r4, r3)
            if (r0 == 0) goto L_0x06c6
            goto L_0x0713
        L_0x06c6:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x06ce
            goto L_0x07b9
        L_0x06ce:
            java.util.Iterator r0 = r2.iterator()
        L_0x06d2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x07b9
            java.lang.Object r1 = r0.next()
            d.a.a.a.y0.l.l1.i r1 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r1
            d.a.a.a.y0.l.l1.j r1 = r15.mo25099M(r1)
            boolean r1 = r12.mo25069f(r7, r1, r3)
            if (r1 == 0) goto L_0x06d2
            goto L_0x0713
        L_0x06e9:
            java.lang.Object r0 = p298d.p334t.C6790h.m12361o(r2)
            d.a.a.a.y0.l.l1.i r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r0
            d.a.a.a.y0.l.l1.j r0 = r15.mo25099M(r0)
            boolean r0 = r12.mo25069f(r7, r0, r3)
            goto L_0x07e1
        L_0x06f9:
            d.a.a.a.y0.l.l1.l r1 = p005b.p291q.p292a.C5266a.m9823I4(r15, r0)
            boolean r2 = p005b.p291q.p292a.C5266a.m10022r2(r15, r1)
            if (r2 == 0) goto L_0x0709
            boolean r0 = p005b.p291q.p292a.C5266a.m9791D2(r15, r1)
            goto L_0x07e1
        L_0x0709:
            d.a.a.a.y0.l.l1.l r1 = p005b.p291q.p292a.C5266a.m9823I4(r15, r0)
            boolean r1 = p005b.p291q.p292a.C5266a.m9791D2(r15, r1)
            if (r1 == 0) goto L_0x0716
        L_0x0713:
            r0 = 1
            goto L_0x07e1
        L_0x0716:
            r26.mo25074C()
            java.util.ArrayDeque<d.a.a.a.y0.l.l1.i> r1 = r7.f14892c
            p298d.p344x.p346c.C6888i.m12436c(r1)
            java.util.Set<d.a.a.a.y0.l.l1.i> r2 = r7.f14893d
            p298d.p344x.p346c.C6888i.m12436c(r2)
            r1.push(r0)
        L_0x0726:
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x07b6
            int r3 = r2.size()
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 > r4) goto L_0x0795
            java.lang.Object r3 = r1.pop()
            d.a.a.a.y0.l.l1.i r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r3
            r4 = r27
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            boolean r5 = r2.add(r3)
            if (r5 != 0) goto L_0x0748
            goto L_0x0792
        L_0x0748:
            boolean r5 = r7.mo25075D(r3)
            if (r5 == 0) goto L_0x0751
            d.a.a.a.y0.l.f$a$c r5 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7469c.f14895a
            goto L_0x0753
        L_0x0751:
            d.a.a.a.y0.l.f$a$b r5 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7468b.f14894a
        L_0x0753:
            d.a.a.a.y0.l.f$a$c r6 = p298d.p299a.p300a.p301a.p303y0.p405l.C7465f.C7466a.C7469c.f14895a
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            r8 = 1
            r6 = r6 ^ r8
            if (r6 == 0) goto L_0x075e
            goto L_0x0760
        L_0x075e:
            r5 = r16
        L_0x0760:
            if (r5 != 0) goto L_0x0763
            goto L_0x0792
        L_0x0763:
            d.a.a.a.y0.l.l1.l r3 = p005b.p291q.p292a.C5266a.m9823I4(r15, r3)
            java.util.Collection r3 = r15.mo25109W(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x076f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0792
            java.lang.Object r6 = r3.next()
            d.a.a.a.y0.l.l1.h r6 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h) r6
            d.a.a.a.y0.l.l1.i r6 = r5.mo25087a(r7, r6)
            d.a.a.a.y0.l.l1.l r9 = p005b.p291q.p292a.C5266a.m9823I4(r15, r6)
            boolean r9 = p005b.p291q.p292a.C5266a.m9791D2(r15, r9)
            if (r9 == 0) goto L_0x078e
            r26.mo25072A()
            r0 = r8
            goto L_0x07e1
        L_0x078e:
            r1.add(r6)
            goto L_0x076f
        L_0x0792:
            r27 = r4
            goto L_0x0726
        L_0x0795:
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m425A(r11, r0, r10)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            java.lang.String r1 = p298d.p334t.C6790h.m12369w(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x07b6:
            r26.mo25072A()
        L_0x07b9:
            r0 = 0
            goto L_0x07e1
        L_0x07bb:
            r1 = r19
            r0 = r20
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m426B(r0, r2, r1)
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m458s(r2, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x07d1:
            boolean r1 = r1.booleanValue()
            r7.mo25086z(r0, r3)
            r0 = r1
            goto L_0x07e1
        L_0x07da:
            boolean r0 = r0.booleanValue()
            r7.mo25086z(r11, r12)
        L_0x07e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.C7462e.m13463g(d.a.a.a.y0.l.e, d.a.a.a.y0.l.f, d.a.a.a.y0.l.l1.h, d.a.a.a.y0.l.l1.h, boolean, int):boolean");
    }

    /* renamed from: b */
    public final List<C7535i> mo25065b(C7465f fVar, C7535i iVar, C7538l lVar) {
        C7465f.C7466a aVar;
        C7465f fVar2 = fVar;
        C7535i iVar2 = iVar;
        C7538l lVar2 = lVar;
        C7528b bVar = C7528b.FOR_SUBTYPING;
        Objects.requireNonNull(fVar);
        C6888i.m12438e(fVar2, "this");
        C6888i.m12438e(iVar2, "receiver");
        C6888i.m12438e(lVar2, "constructor");
        C7491b bVar2 = (C7491b) fVar2;
        if (!C5266a.m10022r2(bVar2, lVar2) && fVar.mo25075D(iVar)) {
            return C6798p.f13713g;
        }
        C6888i.m12438e(bVar2, "this");
        C6888i.m12438e(lVar2, "receiver");
        if (lVar2 instanceof C7567t0) {
            C6083h declarationDescriptor = ((C7567t0) lVar2).getDeclarationDescriptor();
            C6046e eVar = declarationDescriptor instanceof C6046e ? (C6046e) declarationDescriptor : null;
            boolean z = false;
            if (!(eVar == null || !C5266a.m10052w2(eVar) || eVar.getKind() == C6051f.ENUM_ENTRY || eVar.getKind() == C6051f.ANNOTATION_CLASS)) {
                z = true;
            }
            if (!z) {
                C7639l lVar3 = new C7639l();
                fVar.mo25074C();
                ArrayDeque<C7535i> arrayDeque = fVar2.f14892c;
                C6888i.m12436c(arrayDeque);
                Set<C7535i> set = fVar2.f14893d;
                C6888i.m12436c(set);
                arrayDeque.push(iVar2);
                while (!arrayDeque.isEmpty()) {
                    if (set.size() <= 1000) {
                        C7535i pop = arrayDeque.pop();
                        C6888i.m12437d(pop, "current");
                        if (set.add(pop)) {
                            C7535i N = bVar2.mo25100N(pop, bVar);
                            if (N == null) {
                                N = pop;
                            }
                            if (bVar2.mo25124v(C5266a.m9823I4(bVar2, N), lVar2)) {
                                lVar3.add(N);
                                aVar = C7465f.C7466a.C7469c.f14895a;
                            } else {
                                aVar = C5266a.m10025s(bVar2, N) == 0 ? C7465f.C7466a.C7468b.f14894a : fVar2.mo25082K(N);
                            }
                            if (!(!C6888i.m12434a(aVar, C7465f.C7466a.C7469c.f14895a))) {
                                aVar = null;
                            }
                            if (aVar != null) {
                                for (C7534h a : bVar2.mo25109W(C5266a.m9823I4(bVar2, pop))) {
                                    arrayDeque.add(aVar.mo25087a(fVar2, a));
                                }
                            }
                        }
                    } else {
                        StringBuilder A = C0843a.m425A("Too many supertypes for type: ", iVar2, ". Supertypes = ");
                        A.append(C6790h.m12369w(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 63));
                        throw new IllegalStateException(A.toString().toString());
                    }
                }
                fVar.mo25072A();
                return lVar3;
            } else if (!bVar2.mo25124v(C5266a.m9823I4(bVar2, iVar2), lVar2)) {
                return C6798p.f13713g;
            } else {
                C7535i N2 = bVar2.mo25100N(iVar2, bVar);
                if (N2 == null) {
                    N2 = iVar2;
                }
                return C5266a.m9910Y2(N2);
            }
        } else {
            throw new IllegalArgumentException(C0843a.m458s(lVar2, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar2, ", ")).toString());
        }
    }

    /* renamed from: c */
    public final List<C7535i> mo25066c(C7465f fVar, C7535i iVar, C7538l lVar) {
        List<C7535i> b = mo25065b(fVar, iVar, lVar);
        if (b.size() < 2) {
            return b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C7491b bVar = (C7491b) fVar;
            C7536j M = bVar.mo25099M((C7535i) next);
            int a4 = C5266a.m9922a4(bVar, M);
            int i = 0;
            while (true) {
                if (i >= a4) {
                    break;
                }
                if (!(C5266a.m10061y(bVar, C5266a.m9868Q1(bVar, C5266a.m9908Y0(bVar, M, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : b;
    }

    /* renamed from: d */
    public final boolean mo25067d(C7465f fVar, C7534h hVar, C7534h hVar2) {
        C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
        C6888i.m12438e(hVar, "a");
        C6888i.m12438e(hVar2, "b");
        if (hVar == hVar2) {
            return true;
        }
        if (mo25068e(fVar, hVar) && mo25068e(fVar, hVar2)) {
            C7534h J = fVar.mo25081J(hVar);
            C7534h J2 = fVar.mo25081J(hVar2);
            C7535i b3 = C5266a.m9927b3(fVar, J);
            C7491b bVar = (C7491b) fVar;
            if (!bVar.mo25124v(C5266a.m9829J4(fVar, J), C5266a.m9829J4(fVar, J2))) {
                return false;
            }
            if (C5266a.m10025s(bVar, b3) == 0) {
                if (fVar.mo25073B(J) || fVar.mo25073B(J2) || C5266a.m9779B2(bVar, b3) == C5266a.m9779B2(bVar, C5266a.m9927b3(fVar, J2))) {
                    return true;
                }
                return false;
            }
        }
        if (!m13463g(this, fVar, hVar, hVar2, false, 8) || !m13463g(this, fVar, hVar2, hVar, false, 8)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo25068e(C7465f fVar, C7534h hVar) {
        C7531e eVar;
        C7538l J4 = C5266a.m9829J4(fVar, hVar);
        C7491b bVar = (C7491b) fVar;
        C6888i.m12438e(bVar, "this");
        C6888i.m12438e(J4, "receiver");
        if (J4 instanceof C7567t0) {
            if (((C7567t0) J4).isDenotable()) {
                C6888i.m12438e(fVar, "this");
                C6888i.m12438e(hVar, "receiver");
                C7532f y = C5266a.m10061y(bVar, hVar);
                if (y == null) {
                    eVar = null;
                } else {
                    eVar = C5266a.m10049w(bVar, y);
                }
                if (!(eVar != null) && !fVar.mo25076E(hVar) && C6888i.m12434a(C5266a.m9823I4(bVar, C5266a.m9927b3(fVar, hVar)), C5266a.m9823I4(bVar, C5266a.m9841L4(fVar, hVar)))) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException(C0843a.m458s(J4, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", J4, ", ")).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25069f(p298d.p299a.p300a.p301a.p303y0.p405l.C7465f r18, p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7536j r19, p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i r20) {
        /*
            r17 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            java.lang.String r0 = "capturedSubArguments"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            java.lang.String r0 = "superType"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)
            r9 = r6
            d.a.a.a.y0.l.j1.b r9 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b) r9
            d.a.a.a.y0.l.l1.l r10 = p005b.p291q.p292a.C5266a.m9823I4(r9, r8)
            int r11 = r9.mo25108V(r10)
            r12 = 1
            if (r11 <= 0) goto L_0x00c6
            r13 = 0
            r0 = r13
        L_0x0025:
            int r14 = r0 + 1
            d.a.a.a.y0.l.l1.k r1 = p005b.p291q.p292a.C5266a.m9937d1(r9, r8, r0)
            boolean r2 = p005b.p291q.p292a.C5266a.m9821I2(r9, r1)
            if (r2 == 0) goto L_0x0035
            r15 = r17
            goto L_0x00ae
        L_0x0035:
            d.a.a.a.y0.l.l1.h r2 = p005b.p291q.p292a.C5266a.m9868Q1(r9, r1)
            d.a.a.a.y0.l.l1.k r3 = p005b.p291q.p292a.C5266a.m9908Y0(r6, r7, r0)
            p005b.p291q.p292a.C5266a.m9889U1(r9, r3)
            d.a.a.a.y0.l.l1.p r4 = p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7542p.INV
            d.a.a.a.y0.l.l1.h r3 = p005b.p291q.p292a.C5266a.m9868Q1(r9, r3)
            d.a.a.a.y0.l.l1.m r0 = r9.mo25101O(r10, r0)
            d.a.a.a.y0.l.l1.p r0 = r9.mo25102P(r0)
            d.a.a.a.y0.l.l1.p r1 = p005b.p291q.p292a.C5266a.m9889U1(r9, r1)
            java.lang.String r5 = "declared"
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)
            java.lang.String r5 = "useSite"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            if (r0 != r4) goto L_0x0060
            r0 = r1
            goto L_0x0067
        L_0x0060:
            if (r1 != r4) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            if (r0 != r1) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r0 != 0) goto L_0x006e
            boolean r0 = r18.mo25077F()
            return r0
        L_0x006e:
            int r1 = r6.f14890a
            r4 = 100
            if (r1 > r4) goto L_0x00b4
            int r1 = r1 + 1
            r6.f14890a = r1
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0098
            if (r0 == r12) goto L_0x0090
            r1 = 2
            r15 = r17
            if (r0 != r1) goto L_0x008a
            boolean r0 = r15.mo25067d(r6, r3, r2)
            goto L_0x00a5
        L_0x008a:
            d.h r0 = new d.h
            r0.<init>()
            throw r0
        L_0x0090:
            r15 = r17
            r16 = r3
            r3 = r2
            r2 = r16
            goto L_0x009a
        L_0x0098:
            r15 = r17
        L_0x009a:
            r5 = 8
            r4 = 0
            r0 = r17
            r1 = r18
            boolean r0 = m13463g(r0, r1, r2, r3, r4, r5)
        L_0x00a5:
            int r1 = r6.f14890a
            int r1 = r1 + -1
            r6.f14890a = r1
            if (r0 != 0) goto L_0x00ae
            return r13
        L_0x00ae:
            if (r14 < r11) goto L_0x00b1
            goto L_0x00c8
        L_0x00b1:
            r0 = r14
            goto L_0x0025
        L_0x00b4:
            r15 = r17
            java.lang.String r0 = "Arguments depth is too high. Some related argument: "
            java.lang.String r0 = p298d.p344x.p346c.C6888i.m12444k(r0, r3)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00c6:
            r15 = r17
        L_0x00c8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.C7462e.mo25069f(d.a.a.a.y0.l.f, d.a.a.a.y0.l.l1.j, d.a.a.a.y0.l.l1.i):boolean");
    }
}
