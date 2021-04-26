package p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6621c;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6625d;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6643i;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6648l;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6654n;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6684u;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6604e;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6700b;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7084b;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7091f;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.a0.b.h */
public final class C6610h {

    /* renamed from: a */
    public static final C6610h f13014a = new C6610h();

    /* renamed from: b */
    public static final C7091f f13015b;

    static {
        C7091f fVar = new C7091f();
        fVar.mo24660a(C6582a.f12906a);
        fVar.mo24660a(C6582a.f12907b);
        fVar.mo24660a(C6582a.f12908c);
        fVar.mo24660a(C6582a.f12909d);
        fVar.mo24660a(C6582a.f12910e);
        fVar.mo24660a(C6582a.f12911f);
        fVar.mo24660a(C6582a.f12912g);
        fVar.mo24660a(C6582a.f12913h);
        fVar.mo24660a(C6582a.f12914i);
        fVar.mo24660a(C6582a.f12915j);
        fVar.mo24660a(C6582a.f12916k);
        fVar.mo24660a(C6582a.f12917l);
        fVar.mo24660a(C6582a.f12918m);
        fVar.mo24660a(C6582a.f12919n);
        C6888i.m12437d(fVar, "newInstance().apply(JvmProtoBuf::registerAllExtensions)");
        f13015b = fVar;
    }

    /* renamed from: d */
    public static final boolean m11805d(C6654n nVar) {
        C6888i.m12438e(nVar, "proto");
        C6603d dVar = C6603d.f12998a;
        C6700b.C6702b bVar = C6603d.f12999b;
        Object l = nVar.mo24681l(C6582a.f12910e);
        C6888i.m12437d(l, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean f = bVar.mo23840d(((Number) l).intValue());
        C6888i.m12437d(f, "JvmFlags.IS_MOVED_FROM_INTERFACE_COMPANION.get(proto.getExtension(JvmProtoBuf.flags))");
        return f.booleanValue();
    }

    /* renamed from: f */
    public static final C6768j<C6608g, C6621c> m11806f(String[] strArr, String[] strArr2) {
        C6888i.m12438e(strArr, "data");
        C6888i.m12438e(strArr2, "strings");
        byte[] b = C6600a.m11787b(strArr);
        C6888i.m12437d(b, "decodeBytes(data)");
        C6888i.m12438e(b, "bytes");
        C6888i.m12438e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        C7091f fVar = f13015b;
        C6582a.C6593e eVar = (C6582a.C6593e) ((C7084b) C6582a.C6593e.f12958n).mo24598c(byteArrayInputStream, fVar);
        C6888i.m12437d(eVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        C6608g gVar = new C6608g(eVar, strArr2);
        C7084b bVar = (C7084b) C6621c.f13083F;
        C7117p d = bVar.mo24599d(byteArrayInputStream, fVar);
        bVar.mo24597b(d);
        return new C6768j<>(gVar, (C6621c) d);
    }

    /* renamed from: g */
    public static final C6768j<C6608g, C6648l> m11807g(String[] strArr, String[] strArr2) {
        C6888i.m12438e(strArr, "data");
        C6888i.m12438e(strArr2, "strings");
        byte[] b = C6600a.m11787b(strArr);
        C6888i.m12437d(b, "decodeBytes(data)");
        C6888i.m12438e(b, "bytes");
        C6888i.m12438e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        C7091f fVar = f13015b;
        C6582a.C6593e eVar = (C6582a.C6593e) ((C7084b) C6582a.C6593e.f12958n).mo24598c(byteArrayInputStream, fVar);
        C6888i.m12437d(eVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        C6608g gVar = new C6608g(eVar, strArr2);
        C7084b bVar = (C7084b) C6648l.f13258r;
        C7117p d = bVar.mo24599d(byteArrayInputStream, fVar);
        bVar.mo24597b(d);
        return new C6768j<>(gVar, (C6648l) d);
    }

    /* renamed from: a */
    public final C6604e.C6606b mo23729a(C6625d dVar, C6705c cVar, C6707e eVar) {
        String str;
        C6888i.m12438e(dVar, "proto");
        C6888i.m12438e(cVar, "nameResolver");
        C6888i.m12438e(eVar, "typeTable");
        C7095h.C7102f<C6625d, C6582a.C6587c> fVar = C6582a.f12906a;
        C6888i.m12437d(fVar, "constructorSignature");
        C6582a.C6587c cVar2 = (C6582a.C6587c) C5266a.m10009p1(dVar, fVar);
        String a = (cVar2 == null || !cVar2.mo23699k()) ? "<init>" : cVar.mo23725a(cVar2.f12935i);
        if (cVar2 == null || !cVar2.mo23698j()) {
            List<C6684u> list = dVar.f13138k;
            C6888i.m12437d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
            for (C6684u uVar : list) {
                C6888i.m12437d(uVar, "it");
                String e = mo23732e(C5266a.m9817H4(uVar, eVar), cVar);
                if (e == null) {
                    return null;
                }
                arrayList.add(e);
            }
            str = C6790h.m12369w(arrayList, "", "(", ")V", 0, (CharSequence) null, (C6862l) null, 56);
        } else {
            str = cVar.mo23725a(cVar2.f12936j);
        }
        return new C6604e.C6606b(a, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6604e.C6605a mo23730b(p298d.p299a.p300a.p301a.p303y0.p326e.C6654n r7, p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c r8, p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "proto"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            java.lang.String r0 = "nameResolver"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)
            java.lang.String r0 = "typeTable"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            d.a.a.a.y0.g.h$f<d.a.a.a.y0.e.n, d.a.a.a.y0.e.a0.a$d> r0 = p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a.f12909d
            java.lang.String r1 = "propertySignature"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            java.lang.Object r0 = p005b.p291q.p292a.C5266a.m10009p1(r7, r0)
            d.a.a.a.y0.e.a0.a$d r0 = (p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a.C6590d) r0
            r1 = 0
            if (r0 != 0) goto L_0x0020
            return r1
        L_0x0020:
            int r2 = r0.f12945h
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 != r3) goto L_0x0029
            r2 = r3
            goto L_0x002a
        L_0x0029:
            r2 = r4
        L_0x002a:
            if (r2 == 0) goto L_0x002f
            d.a.a.a.y0.e.a0.a$b r0 = r0.f12946i
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 != 0) goto L_0x0035
            if (r10 == 0) goto L_0x0035
            return r1
        L_0x0035:
            if (r0 == 0) goto L_0x0044
            int r10 = r0.f12923h
            r10 = r10 & r3
            if (r10 != r3) goto L_0x003e
            r10 = r3
            goto L_0x003f
        L_0x003e:
            r10 = r4
        L_0x003f:
            if (r10 == 0) goto L_0x0044
            int r10 = r0.f12924i
            goto L_0x0046
        L_0x0044:
            int r10 = r7.f13295l
        L_0x0046:
            if (r0 == 0) goto L_0x0059
            int r2 = r0.f12923h
            r5 = 2
            r2 = r2 & r5
            if (r2 != r5) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r3 = r4
        L_0x0050:
            if (r3 == 0) goto L_0x0059
            int r7 = r0.f12925j
            java.lang.String r7 = r8.mo23725a(r7)
            goto L_0x0064
        L_0x0059:
            d.a.a.a.y0.e.q r7 = p005b.p291q.p292a.C5266a.m9852N3(r7, r9)
            java.lang.String r7 = r6.mo23732e(r7, r8)
            if (r7 != 0) goto L_0x0064
            return r1
        L_0x0064:
            d.a.a.a.y0.e.a0.b.e$a r9 = new d.a.a.a.y0.e.a0.b.e$a
            java.lang.String r8 = r8.mo23725a(r10)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h.mo23730b(d.a.a.a.y0.e.n, d.a.a.a.y0.e.z.c, d.a.a.a.y0.e.z.e, boolean):d.a.a.a.y0.e.a0.b.e$a");
    }

    /* renamed from: c */
    public final C6604e.C6606b mo23731c(C6643i iVar, C6705c cVar, C6707e eVar) {
        int i;
        String str;
        C6643i iVar2 = iVar;
        C6705c cVar2 = cVar;
        C6707e eVar2 = eVar;
        C6888i.m12438e(iVar2, "proto");
        C6888i.m12438e(cVar2, "nameResolver");
        C6888i.m12438e(eVar2, "typeTable");
        C7095h.C7102f<C6643i, C6582a.C6587c> fVar = C6582a.f12907b;
        C6888i.m12437d(fVar, "methodSignature");
        C6582a.C6587c cVar3 = (C6582a.C6587c) C5266a.m10009p1(iVar2, fVar);
        if (cVar3 == null || !cVar3.mo23699k()) {
            i = iVar2.f13220l;
        } else {
            i = cVar3.f12935i;
        }
        if (cVar3 == null || !cVar3.mo23698j()) {
            List B = C6790h.m12315B(C5266a.m10029s3(iVar2, eVar2));
            List<C6684u> list = iVar2.f13226r;
            C6888i.m12437d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
            for (C6684u uVar : list) {
                C6888i.m12437d(uVar, "it");
                arrayList.add(C5266a.m9817H4(uVar, eVar2));
            }
            List I = C6790h.m12322I(B, arrayList);
            ArrayList arrayList2 = new ArrayList(C5266a.m9892V(I, 10));
            Iterator it = ((ArrayList) I).iterator();
            while (it.hasNext()) {
                String e = mo23732e((C6667q) it.next(), cVar2);
                if (e == null) {
                    return null;
                }
                arrayList2.add(e);
            }
            String e2 = mo23732e(C5266a.m9846M3(iVar2, eVar2), cVar2);
            if (e2 == null) {
                return null;
            }
            str = C6888i.m12444k(C6790h.m12369w(arrayList2, "", "(", ")", 0, (CharSequence) null, (C6862l) null, 56), e2);
        } else {
            str = cVar2.mo23725a(cVar3.f12936j);
        }
        return new C6604e.C6606b(cVar2.mo23725a(i), str);
    }

    /* renamed from: e */
    public final String mo23732e(C6667q qVar, C6705c cVar) {
        if (!qVar.mo23796v()) {
            return null;
        }
        C6601b bVar = C6601b.f12994a;
        return C6601b.m11790b(cVar.mo23727c(qVar.f13363o));
    }
}
