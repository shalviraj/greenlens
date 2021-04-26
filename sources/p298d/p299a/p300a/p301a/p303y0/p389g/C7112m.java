package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: d.a.a.a.y0.g.m */
public class C7112m extends AbstractList<String> implements RandomAccess, C7113n {

    /* renamed from: h */
    public static final C7113n f14214h = new C7135w(new C7112m());

    /* renamed from: g */
    public final List<Object> f14215g;

    public C7112m() {
        this.f14215g = new ArrayList();
    }

    public C7112m(C7113n nVar) {
        this.f14215g = new ArrayList(nVar.size());
        addAll(size(), nVar);
    }

    /* renamed from: d */
    public static String m12801d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C7085c) {
            return ((C7085c) obj).mo24605J();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = C7103i.f14208a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: L */
    public List<?> mo24703L() {
        return Collections.unmodifiableList(this.f14215g);
    }

    /* renamed from: P */
    public void mo24704P(C7085c cVar) {
        this.f14215g.add(cVar);
        this.modCount++;
    }

    public void add(int i, Object obj) {
        this.f14215g.add(i, (String) obj);
        this.modCount++;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof C7113n) {
            collection = ((C7113n) collection).mo24703L();
        }
        boolean addAll = this.f14215g.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        this.f14215g.clear();
        this.modCount++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (p005b.p291q.p292a.C5266a.m9845M2(r0, 0, r0.length) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0.mo24615w() != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(int r5) {
        /*
            r4 = this;
            java.util.List<java.lang.Object> r0 = r4.f14215g
            java.lang.Object r0 = r0.get(r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0038
        L_0x000d:
            boolean r1 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p389g.C7085c
            if (r1 == 0) goto L_0x0024
            d.a.a.a.y0.g.c r0 = (p298d.p299a.p300a.p301a.p303y0.p389g.C7085c) r0
            java.lang.String r1 = r0.mo24605J()
            boolean r0 = r0.mo24615w()
            if (r0 == 0) goto L_0x0022
        L_0x001d:
            java.util.List<java.lang.Object> r0 = r4.f14215g
            r0.set(r5, r1)
        L_0x0022:
            r0 = r1
            goto L_0x0038
        L_0x0024:
            byte[] r0 = (byte[]) r0
            byte[] r1 = p298d.p299a.p300a.p301a.p303y0.p389g.C7103i.f14208a
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            int r2 = r0.length
            r3 = 0
            boolean r0 = p005b.p291q.p292a.C5266a.m9845M2(r0, r3, r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x001d
        L_0x0038:
            return r0
        L_0x0039:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "UTF-8 not supported?"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7112m.get(int):java.lang.Object");
    }

    public Object remove(int i) {
        Object remove = this.f14215g.remove(i);
        this.modCount++;
        return m12801d(remove);
    }

    public Object set(int i, Object obj) {
        return m12801d(this.f14215g.set(i, (String) obj));
    }

    public int size() {
        return this.f14215g.size();
    }

    /* renamed from: t */
    public C7085c mo24713t(int i) {
        C7085c cVar;
        Object obj = this.f14215g.get(i);
        if (obj instanceof C7085c) {
            cVar = (C7085c) obj;
        } else if (obj instanceof String) {
            cVar = C7085c.m12685l((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            C7085c cVar2 = C7085c.f14160g;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            cVar = new C7114o(bArr2);
        }
        if (cVar != obj) {
            this.f14215g.set(i, cVar);
        }
        return cVar;
    }

    /* renamed from: z */
    public C7113n mo24714z() {
        return new C7135w(this);
    }
}
