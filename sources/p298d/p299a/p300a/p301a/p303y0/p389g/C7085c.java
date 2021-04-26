package p298d.p299a.p300a.p301a.p303y0.p389g;

import com.google.android.material.badge.BadgeDrawable;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7121s;

/* renamed from: d.a.a.a.y0.g.c */
public abstract class C7085c implements Iterable<Byte> {

    /* renamed from: g */
    public static final C7085c f14160g = new C7114o(new byte[0]);

    /* renamed from: d.a.a.a.y0.g.c$a */
    public interface C7086a extends Iterator<Byte> {
        /* renamed from: a */
        byte mo24616a();
    }

    /* renamed from: d.a.a.a.y0.g.c$b */
    public static final class C7087b extends OutputStream {

        /* renamed from: l */
        public static final byte[] f14161l = new byte[0];

        /* renamed from: g */
        public final int f14162g;

        /* renamed from: h */
        public final ArrayList<C7085c> f14163h;

        /* renamed from: i */
        public int f14164i;

        /* renamed from: j */
        public byte[] f14165j;

        /* renamed from: k */
        public int f14166k;

        public C7087b(int i) {
            if (i >= 0) {
                this.f14162g = i;
                this.f14163h = new ArrayList<>();
                this.f14165j = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: d */
        public final void mo24617d(int i) {
            this.f14163h.add(new C7114o(this.f14165j));
            int length = this.f14164i + this.f14165j.length;
            this.f14164i = length;
            this.f14165j = new byte[Math.max(this.f14162g, Math.max(i, length >>> 1))];
            this.f14166k = 0;
        }

        /* renamed from: e */
        public final void mo24618e() {
            int i = this.f14166k;
            byte[] bArr = this.f14165j;
            if (i >= bArr.length) {
                this.f14163h.add(new C7114o(this.f14165j));
                this.f14165j = f14161l;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                this.f14163h.add(new C7114o(bArr2));
            }
            this.f14164i += this.f14166k;
            this.f14166k = 0;
        }

        /* renamed from: q */
        public synchronized C7085c mo24619q() {
            ArrayList<C7085c> arrayList;
            mo24618e();
            arrayList = this.f14163h;
            if (!(arrayList instanceof Collection)) {
                ArrayList<C7085c> arrayList2 = new ArrayList<>();
                for (C7085c add : arrayList) {
                    arrayList2.add(add);
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? C7085c.f14160g : C7085c.m12684d(arrayList.iterator(), arrayList.size());
        }

        public String toString() {
            int i;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.f14164i + this.f14166k;
            }
            objArr[1] = Integer.valueOf(i);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        public synchronized void write(int i) {
            if (this.f14166k == this.f14165j.length) {
                mo24617d(1);
            }
            byte[] bArr = this.f14165j;
            int i2 = this.f14166k;
            this.f14166k = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f14165j;
            int length = bArr2.length;
            int i3 = this.f14166k;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f14166k += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo24617d(i4);
                System.arraycopy(bArr, i + length2, this.f14165j, 0, i4);
                this.f14166k = i4;
            }
        }
    }

    static {
        Class<C7085c> cls = C7085c.class;
    }

    /* renamed from: B */
    public static C7087b m12683B() {
        return new C7087b(128);
    }

    /* renamed from: d */
    public static C7085c m12684d(Iterator<C7085c> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m12684d(it, i2).mo24607e(m12684d(it, i - i2));
    }

    /* renamed from: l */
    public static C7085c m12685l(String str) {
        try {
            return new C7114o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: A */
    public abstract C7086a iterator();

    /* renamed from: E */
    public abstract int mo24601E(int i, int i2, int i3);

    /* renamed from: F */
    public abstract int mo24602F(int i, int i2, int i3);

    /* renamed from: H */
    public abstract int mo24603H();

    /* renamed from: I */
    public abstract String mo24604I(String str);

    /* renamed from: J */
    public String mo24605J() {
        try {
            return mo24604I("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: K */
    public abstract void mo24606K(OutputStream outputStream, int i, int i2);

    /* renamed from: e */
    public C7085c mo24607e(C7085c cVar) {
        int size = size();
        int size2 = cVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            int[] iArr = C7121s.f14221n;
            C7121s sVar = this instanceof C7121s ? (C7121s) this : null;
            if (cVar.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return cVar;
            }
            int size3 = cVar.size() + size();
            if (size3 < 128) {
                return C7121s.m12832M(this, cVar);
            }
            if (sVar != null) {
                if (cVar.size() + sVar.f14224j.size() < 128) {
                    return new C7121s(sVar.f14223i, C7121s.m12832M(sVar.f14224j, cVar));
                }
            }
            if (sVar == null || sVar.f14223i.mo24611r() <= sVar.f14224j.mo24611r() || sVar.f14226l <= cVar.mo24611r()) {
                if (size3 >= C7121s.f14221n[Math.max(mo24611r(), cVar.mo24611r()) + 1]) {
                    return new C7121s(this, cVar);
                }
                C7121s.C7123b bVar = new C7121s.C7123b((C7121s.C7122a) null);
                bVar.mo24724a(this);
                bVar.mo24724a(cVar);
                C7085c pop = bVar.f14228a.pop();
                while (!bVar.f14228a.isEmpty()) {
                    pop = new C7121s(bVar.f14228a.pop(), pop);
                }
                return pop;
            }
            return new C7121s(sVar.f14223i, new C7121s(sVar.f14224j, cVar));
        }
        throw new IllegalArgumentException(C0843a.m439O(53, "ByteString would be too long: ", size, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, size2));
    }

    /* renamed from: n */
    public void mo24609n(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C0843a.m438N(30, "Source offset < 0: ", i));
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(C0843a.m438N(30, "Target offset < 0: ", i2));
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    throw new IndexOutOfBoundsException(C0843a.m438N(34, "Target end offset < 0: ", i5));
                } else if (i3 > 0) {
                    mo24610q(bArr, i, i2, i3);
                }
            } else {
                throw new IndexOutOfBoundsException(C0843a.m438N(34, "Source end offset < 0: ", i4));
            }
        } else {
            throw new IndexOutOfBoundsException(C0843a.m438N(23, "Length < 0: ", i3));
        }
    }

    /* renamed from: q */
    public abstract void mo24610q(byte[] bArr, int i, int i2, int i3);

    /* renamed from: r */
    public abstract int mo24611r();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: u */
    public abstract boolean mo24614u();

    /* renamed from: w */
    public abstract boolean mo24615w();
}
