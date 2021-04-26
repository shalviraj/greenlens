package p298d.p299a.p300a.p301a.p303y0.p389g;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7085c;

/* renamed from: d.a.a.a.y0.g.s */
public class C7121s extends C7085c {

    /* renamed from: n */
    public static final int[] f14221n;

    /* renamed from: h */
    public final int f14222h;

    /* renamed from: i */
    public final C7085c f14223i;

    /* renamed from: j */
    public final C7085c f14224j;

    /* renamed from: k */
    public final int f14225k;

    /* renamed from: l */
    public final int f14226l;

    /* renamed from: m */
    public int f14227m = 0;

    /* renamed from: d.a.a.a.y0.g.s$b */
    public static class C7123b {

        /* renamed from: a */
        public final Stack<C7085c> f14228a = new Stack<>();

        public C7123b(C7122a aVar) {
        }

        /* renamed from: a */
        public final void mo24724a(C7085c cVar) {
            if (cVar.mo24614u()) {
                int size = cVar.size();
                int[] iArr = C7121s.f14221n;
                int binarySearch = Arrays.binarySearch(iArr, size);
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i = iArr[binarySearch + 1];
                if (this.f14228a.isEmpty() || this.f14228a.peek().size() >= i) {
                    this.f14228a.push(cVar);
                    return;
                }
                int i2 = iArr[binarySearch];
                C7085c pop = this.f14228a.pop();
                while (!this.f14228a.isEmpty() && this.f14228a.peek().size() < i2) {
                    pop = new C7121s(this.f14228a.pop(), pop);
                }
                C7121s sVar = new C7121s(pop, cVar);
                while (!this.f14228a.isEmpty()) {
                    int i3 = sVar.f14222h;
                    int[] iArr2 = C7121s.f14221n;
                    int binarySearch2 = Arrays.binarySearch(iArr2, i3);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.f14228a.peek().size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    }
                    sVar = new C7121s(this.f14228a.pop(), sVar);
                }
                this.f14228a.push(sVar);
            } else if (cVar instanceof C7121s) {
                C7121s sVar2 = (C7121s) cVar;
                mo24724a(sVar2.f14223i);
                mo24724a(sVar2.f14224j);
            } else {
                String valueOf = String.valueOf(cVar.getClass());
                throw new IllegalArgumentException(C0843a.m455p(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    /* renamed from: d.a.a.a.y0.g.s$c */
    public static class C7124c implements Iterator<C7114o> {

        /* renamed from: g */
        public final Stack<C7121s> f14229g = new Stack<>();

        /* renamed from: h */
        public C7114o f14230h;

        public C7124c(C7085c cVar, C7122a aVar) {
            while (cVar instanceof C7121s) {
                C7121s sVar = (C7121s) cVar;
                this.f14229g.push(sVar);
                cVar = sVar.f14223i;
            }
            this.f14230h = (C7114o) cVar;
        }

        /* renamed from: b */
        public C7114o next() {
            C7114o oVar;
            boolean z;
            C7114o oVar2 = this.f14230h;
            if (oVar2 != null) {
                while (true) {
                    if (!this.f14229g.isEmpty()) {
                        C7085c cVar = this.f14229g.pop().f14224j;
                        while (cVar instanceof C7121s) {
                            C7121s sVar = (C7121s) cVar;
                            this.f14229g.push(sVar);
                            cVar = sVar.f14223i;
                        }
                        oVar = (C7114o) cVar;
                        if (oVar.size() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        oVar = null;
                        break;
                    }
                }
                this.f14230h = oVar;
                return oVar2;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f14230h != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d.a.a.a.y0.g.s$d */
    public class C7125d implements C7085c.C7086a {

        /* renamed from: g */
        public final C7124c f14231g;

        /* renamed from: h */
        public C7085c.C7086a f14232h;

        /* renamed from: i */
        public int f14233i;

        public C7125d(C7121s sVar, C7122a aVar) {
            C7124c cVar = new C7124c(sVar, (C7122a) null);
            this.f14231g = cVar;
            this.f14232h = cVar.next().iterator();
            this.f14233i = sVar.f14222h;
        }

        /* renamed from: a */
        public byte mo24616a() {
            if (!this.f14232h.hasNext()) {
                this.f14232h = this.f14231g.next().iterator();
            }
            this.f14233i--;
            return this.f14232h.mo24616a();
        }

        public boolean hasNext() {
            return this.f14233i > 0;
        }

        public Object next() {
            return Byte.valueOf(mo24616a());
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        f14221n = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f14221n;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    public C7121s(C7085c cVar, C7085c cVar2) {
        this.f14223i = cVar;
        this.f14224j = cVar2;
        int size = cVar.size();
        this.f14225k = size;
        this.f14222h = cVar2.size() + size;
        this.f14226l = Math.max(cVar.mo24611r(), cVar2.mo24611r()) + 1;
    }

    /* renamed from: M */
    public static C7114o m12832M(C7085c cVar, C7085c cVar2) {
        int size = cVar.size();
        int size2 = cVar2.size();
        byte[] bArr = new byte[(size + size2)];
        cVar.mo24609n(bArr, 0, 0, size);
        cVar2.mo24609n(bArr, 0, size, size2);
        return new C7114o(bArr);
    }

    /* renamed from: A */
    public C7085c.C7086a mo24600A() {
        return new C7125d(this, (C7122a) null);
    }

    /* renamed from: E */
    public int mo24601E(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f14225k;
        if (i4 <= i5) {
            return this.f14223i.mo24601E(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f14224j.mo24601E(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f14224j.mo24601E(this.f14223i.mo24601E(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: F */
    public int mo24602F(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f14225k;
        if (i4 <= i5) {
            return this.f14223i.mo24602F(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f14224j.mo24602F(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f14224j.mo24602F(this.f14223i.mo24602F(i, i2, i6), 0, i3 - i6);
    }

    /* renamed from: H */
    public int mo24603H() {
        return this.f14227m;
    }

    /* renamed from: I */
    public String mo24604I(String str) {
        byte[] bArr;
        int i = this.f14222h;
        if (i == 0) {
            bArr = C7103i.f14208a;
        } else {
            byte[] bArr2 = new byte[i];
            mo24610q(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, str);
    }

    /* renamed from: K */
    public void mo24606K(OutputStream outputStream, int i, int i2) {
        C7085c cVar;
        int i3 = i + i2;
        int i4 = this.f14225k;
        if (i3 <= i4) {
            cVar = this.f14223i;
        } else if (i >= i4) {
            cVar = this.f14224j;
            i -= i4;
        } else {
            int i5 = i4 - i;
            this.f14223i.mo24606K(outputStream, i, i5);
            this.f14224j.mo24606K(outputStream, 0, i2 - i5);
            return;
        }
        cVar.mo24606K(outputStream, i, i2);
    }

    public boolean equals(Object obj) {
        int H;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7085c)) {
            return false;
        }
        C7085c cVar = (C7085c) obj;
        if (this.f14222h != cVar.size()) {
            return false;
        }
        if (this.f14222h == 0) {
            return true;
        }
        if (this.f14227m != 0 && (H = cVar.mo24603H()) != 0 && this.f14227m != H) {
            return false;
        }
        C7124c cVar2 = new C7124c(this, (C7122a) null);
        C7114o oVar = (C7114o) cVar2.next();
        C7124c cVar3 = new C7124c(cVar, (C7122a) null);
        C7114o oVar2 = (C7114o) cVar3.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = oVar.f14216h.length - i;
            int length2 = oVar2.f14216h.length - i2;
            int min = Math.min(length, length2);
            if (!(i == 0 ? oVar.mo24715M(oVar2, i2, min) : oVar2.mo24715M(oVar, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f14222h;
            if (i3 < i4) {
                if (min == length) {
                    oVar = (C7114o) cVar2.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == length2) {
                    oVar2 = (C7114o) cVar3.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int i = this.f14227m;
        if (i == 0) {
            int i2 = this.f14222h;
            i = mo24601E(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f14227m = i;
        }
        return i;
    }

    public Iterator iterator() {
        return new C7125d(this, (C7122a) null);
    }

    /* renamed from: q */
    public void mo24610q(byte[] bArr, int i, int i2, int i3) {
        C7085c cVar;
        int i4 = i + i3;
        int i5 = this.f14225k;
        if (i4 <= i5) {
            cVar = this.f14223i;
        } else if (i >= i5) {
            cVar = this.f14224j;
            i -= i5;
        } else {
            int i6 = i5 - i;
            this.f14223i.mo24610q(bArr, i, i2, i6);
            this.f14224j.mo24610q(bArr, 0, i2 + i6, i3 - i6);
            return;
        }
        cVar.mo24610q(bArr, i, i2, i3);
    }

    /* renamed from: r */
    public int mo24611r() {
        return this.f14226l;
    }

    public int size() {
        return this.f14222h;
    }

    /* renamed from: u */
    public boolean mo24614u() {
        return this.f14222h >= f14221n[this.f14226l];
    }

    /* renamed from: w */
    public boolean mo24615w() {
        int F = this.f14223i.mo24602F(0, 0, this.f14225k);
        C7085c cVar = this.f14224j;
        return cVar.mo24602F(F, 0, cVar.size()) == 0;
    }
}
