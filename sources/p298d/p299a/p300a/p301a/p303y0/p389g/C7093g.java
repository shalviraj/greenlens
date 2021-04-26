package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7093g.C7094a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7103i;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;

/* renamed from: d.a.a.a.y0.g.g */
public final class C7093g<FieldDescriptorType extends C7094a<FieldDescriptorType>> {

    /* renamed from: d */
    public static final C7093g f14186d = new C7093g(true);

    /* renamed from: a */
    public final C7127u<FieldDescriptorType, Object> f14187a;

    /* renamed from: b */
    public boolean f14188b;

    /* renamed from: c */
    public boolean f14189c = false;

    /* renamed from: d.a.a.a.y0.g.g$a */
    public interface C7094a<T extends C7094a<T>> extends Comparable<T> {
        /* renamed from: f */
        int mo24672f();

        /* renamed from: g */
        C7117p.C7118a mo24673g(C7117p.C7118a aVar, C7117p pVar);

        /* renamed from: h */
        boolean mo24674h();

        /* renamed from: j */
        C7139y mo24675j();

        /* renamed from: m */
        C7144z mo24676m();

        /* renamed from: o */
        boolean mo24677o();
    }

    public C7093g() {
        int i = C7127u.f14234l;
        this.f14187a = new C7126t(16);
    }

    /* renamed from: d */
    public static int m12751d(C7139y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return C7089e.m12730h(((Long) obj).longValue());
            case 3:
                return C7089e.m12730h(((Long) obj).longValue());
            case 4:
                return C7089e.m12726d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C7089e.m12729g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((C7117p) obj).mo23683a();
            case 10:
                if (!(obj instanceof C7107k)) {
                    return C7089e.m12728f((C7117p) obj);
                }
                C7107k kVar = (C7107k) obj;
                if (kVar.f14212a) {
                    int a = kVar.f14213b.mo23683a();
                    return C7089e.m12729g(a) + a;
                }
                throw null;
            case 11:
                if (obj instanceof C7085c) {
                    return C7089e.m12723a((C7085c) obj);
                }
                byte[] bArr = (byte[]) obj;
                return C7089e.m12729g(bArr.length) + bArr.length;
            case 12:
                return C7089e.m12729g(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C7103i.C7104a) {
                    return C7089e.m12726d(((C7103i.C7104a) obj).mo23715f());
                }
                return C7089e.m12726d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return C7089e.m12729g((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return C7089e.m12730h((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: e */
    public static int m12752e(C7094a<?> aVar, Object obj) {
        int i;
        int d;
        C7139y j = aVar.mo24675j();
        int f = aVar.mo24672f();
        if (aVar.mo24674h()) {
            int i2 = 0;
            List<Object> list = (List) obj;
            if (aVar.mo24677o()) {
                for (Object d2 : list) {
                    i2 += m12751d(j, d2);
                }
                i = C7089e.m12731i(f) + i2;
                d = C7089e.m12729g(i2);
            } else {
                for (Object next : list) {
                    int i3 = C7089e.m12731i(f);
                    if (j == C7139y.GROUP) {
                        i3 *= 2;
                    }
                    i2 += m12751d(j, next) + i3;
                }
                return i2;
            }
        } else {
            i = C7089e.m12731i(f);
            if (j == C7139y.GROUP) {
                i *= 2;
            }
            d = m12751d(j, obj);
        }
        return d + i;
    }

    /* renamed from: g */
    public static int m12753g(C7139y yVar, boolean z) {
        if (z) {
            return 2;
        }
        return yVar.f14276h;
    }

    /* renamed from: k */
    public static Object m12754k(C7088d dVar, C7139y yVar, boolean z) {
        byte[] bArr;
        switch (yVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(dVar.mo24633k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(dVar.mo24632j()));
            case 2:
                return Long.valueOf(dVar.mo24635m());
            case 3:
                return Long.valueOf(dVar.mo24635m());
            case 4:
                return Integer.valueOf(dVar.mo24634l());
            case 5:
                return Long.valueOf(dVar.mo24633k());
            case 6:
                return Integer.valueOf(dVar.mo24632j());
            case 7:
                return Boolean.valueOf(dVar.mo24627e());
            case 8:
                if (z) {
                    int l = dVar.mo24634l();
                    int i = dVar.f14171e;
                    if (l <= dVar.f14169c - i && l > 0) {
                        bArr = dVar.f14167a;
                        dVar.f14171e = i + l;
                    } else if (l == 0) {
                        return "";
                    } else {
                        bArr = dVar.mo24631i(l);
                        i = 0;
                    }
                    if (C5266a.m9845M2(bArr, i, i + l)) {
                        return new String(bArr, i, l, "UTF-8");
                    }
                    throw new C7106j("Protocol message had invalid UTF-8.");
                }
                int l2 = dVar.mo24634l();
                if (l2 <= dVar.f14169c - dVar.f14171e && l2 > 0) {
                    String str = new String(dVar.f14167a, dVar.f14171e, l2, "UTF-8");
                    dVar.f14171e += l2;
                    return str;
                } else if (l2 == 0) {
                    return "";
                } else {
                    return new String(dVar.mo24631i(l2), "UTF-8");
                }
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return dVar.mo24628f();
            case 12:
                return Integer.valueOf(dVar.mo24634l());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(dVar.mo24632j());
            case 15:
                return Long.valueOf(dVar.mo24633k());
            case 16:
                int l3 = dVar.mo24634l();
                return Integer.valueOf((-(l3 & 1)) ^ (l3 >>> 1));
            case 17:
                long m = dVar.mo24635m();
                return Long.valueOf((-(m & 1)) ^ (m >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((r2 instanceof p298d.p299a.p300a.p301a.p303y0.p389g.C7107k) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r2 instanceof p298d.p299a.p300a.p301a.p303y0.p389g.C7103i.C7104a) == false) goto L_0x003c;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12755m(p298d.p299a.p300a.p301a.p303y0.p389g.C7139y r1, java.lang.Object r2) {
        /*
            java.util.Objects.requireNonNull(r2)
            d.a.a.a.y0.g.z r1 = r1.f14275g
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0037;
                case 2: goto L_0x0034;
                case 3: goto L_0x0031;
                case 4: goto L_0x002e;
                case 5: goto L_0x002b;
                case 6: goto L_0x0020;
                case 7: goto L_0x0017;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003c
        L_0x000e:
            boolean r1 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p389g.C7117p
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p389g.C7107k
            if (r1 == 0) goto L_0x003c
            goto L_0x0028
        L_0x0017:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p389g.C7103i.C7104a
            if (r1 == 0) goto L_0x003c
            goto L_0x0028
        L_0x0020:
            boolean r1 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p389g.C7085c
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x003c
        L_0x0028:
            r1 = 1
            r0 = r1
            goto L_0x003c
        L_0x002b:
            boolean r0 = r2 instanceof java.lang.String
            goto L_0x003c
        L_0x002e:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L_0x003c
        L_0x0031:
            boolean r0 = r2 instanceof java.lang.Double
            goto L_0x003c
        L_0x0034:
            boolean r0 = r2 instanceof java.lang.Float
            goto L_0x003c
        L_0x0037:
            boolean r0 = r2 instanceof java.lang.Long
            goto L_0x003c
        L_0x003a:
            boolean r0 = r2 instanceof java.lang.Integer
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            return
        L_0x003f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7093g.m12755m(d.a.a.a.y0.g.y, java.lang.Object):void");
    }

    /* renamed from: n */
    public static void m12756n(C7089e eVar, C7139y yVar, int i, Object obj) {
        if (yVar == C7139y.GROUP) {
            int i2 = i << 3;
            eVar.mo24658y(i2 | 3);
            ((C7117p) obj).mo23685d(eVar);
            eVar.mo24658y(i2 | 4);
            return;
        }
        eVar.mo24658y((i << 3) | m12753g(yVar, false));
        m12757o(eVar, yVar, obj);
    }

    /* renamed from: o */
    public static void m12757o(C7089e eVar, C7139y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                eVar.mo24657x(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                eVar.mo24656w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                eVar.mo24659z(((Long) obj).longValue());
                return;
            case 3:
                eVar.mo24659z(((Long) obj).longValue());
                return;
            case 4:
                eVar.mo24650q(((Integer) obj).intValue());
                return;
            case 5:
                eVar.mo24657x(((Long) obj).longValue());
                return;
            case 6:
                eVar.mo24656w(((Integer) obj).intValue());
                return;
            case 7:
                eVar.mo24653t(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                eVar.mo24658y(bytes.length);
                eVar.mo24655v(bytes);
                return;
            case 9:
                ((C7117p) obj).mo23685d(eVar);
                return;
            case 10:
                eVar.mo24652s((C7117p) obj);
                return;
            case 11:
                if (obj instanceof C7085c) {
                    eVar.mo24646m((C7085c) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                eVar.mo24658y(bArr.length);
                eVar.mo24655v(bArr);
                return;
            case 12:
                eVar.mo24658y(((Integer) obj).intValue());
                return;
            case 13:
                eVar.mo24648o(obj instanceof C7103i.C7104a ? ((C7103i.C7104a) obj).mo23715f() : ((Integer) obj).intValue());
                return;
            case 14:
                eVar.mo24656w(((Integer) obj).intValue());
                return;
            case 15:
                eVar.mo24657x(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                eVar.mo24658y((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                eVar.mo24659z((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo24663a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (((C7095h.C7101e) fielddescriptortype).f14201j) {
            m12755m(((C7095h.C7101e) fielddescriptortype).f14200i, obj);
            Object f = mo24667f(fielddescriptortype);
            if (f == null) {
                list = new ArrayList();
                this.f14187a.mo24743h(fielddescriptortype, list);
            } else {
                list = (List) f;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C7093g<FieldDescriptorType> clone() {
        C7093g<FieldDescriptorType> gVar = new C7093g<>();
        for (int i = 0; i < this.f14187a.mo24738e(); i++) {
            Map.Entry<FieldDescriptorType, Object> c = this.f14187a.mo24735c(i);
            gVar.mo24671l((C7094a) c.getKey(), c.getValue());
        }
        for (Map.Entry next : this.f14187a.mo24740f()) {
            gVar.mo24671l((C7094a) next.getKey(), next.getValue());
        }
        gVar.f14189c = this.f14189c;
        return gVar;
    }

    /* renamed from: c */
    public final Object mo24665c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: f */
    public Object mo24667f(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f14187a.get(fielddescriptortype);
        return obj instanceof C7107k ? ((C7107k) obj).mo24693a() : obj;
    }

    /* renamed from: h */
    public final boolean mo24668h(Map.Entry<FieldDescriptorType, Object> entry) {
        C7094a aVar = (C7094a) entry.getKey();
        if (aVar.mo24676m() == C7144z.MESSAGE) {
            boolean h = aVar.mo24674h();
            Object value = entry.getValue();
            if (h) {
                for (C7117p g : (List) value) {
                    if (!g.mo23687g()) {
                        return false;
                    }
                }
            } else if (value instanceof C7117p) {
                if (!((C7117p) value).mo23687g()) {
                    return false;
                }
            } else if (value instanceof C7107k) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: i */
    public void mo24669i() {
        if (!this.f14188b) {
            C7126t tVar = (C7126t) this.f14187a;
            if (!tVar.f14238j) {
                for (int i = 0; i < tVar.mo24738e(); i++) {
                    Map.Entry c = tVar.mo24735c(i);
                    if (((C7094a) c.getKey()).mo24674h()) {
                        c.setValue(Collections.unmodifiableList((List) c.getValue()));
                    }
                }
                for (Map.Entry entry : tVar.mo24740f()) {
                    if (((C7094a) entry.getKey()).mo24674h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            if (!tVar.f14238j) {
                tVar.f14237i = tVar.f14237i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(tVar.f14237i);
                tVar.f14238j = true;
            }
            this.f14188b = true;
        }
    }

    /* renamed from: j */
    public final void mo24670j(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C7127u<FieldDescriptorType, Object> uVar;
        Object f;
        C7094a aVar = (C7094a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C7107k) {
            value = ((C7107k) value).mo24693a();
        }
        if (aVar.mo24674h()) {
            Object f2 = mo24667f(aVar);
            if (f2 == null) {
                f2 = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) f2).add(mo24665c(c));
            }
            this.f14187a.mo24743h(aVar, f2);
            return;
        }
        if (aVar.mo24676m() != C7144z.MESSAGE || (f = mo24667f(aVar)) == null) {
            uVar = this.f14187a;
            obj = mo24665c(value);
        } else {
            obj = aVar.mo24673g(((C7117p) f).mo23684c(), (C7117p) value).mo23691e();
            uVar = this.f14187a;
        }
        uVar.mo24743h(aVar, obj);
    }

    /* renamed from: l */
    public void mo24671l(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo24674h()) {
            m12755m(fielddescriptortype.mo24675j(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m12755m(fielddescriptortype.mo24675j(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C7107k) {
            this.f14189c = true;
        }
        this.f14187a.mo24743h(fielddescriptortype, obj);
    }

    public C7093g(boolean z) {
        int i = C7127u.f14234l;
        this.f14187a = new C7126t(0);
        mo24669i();
    }
}
