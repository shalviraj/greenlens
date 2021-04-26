package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7085c;

/* renamed from: d.a.a.a.y0.g.o */
public class C7114o extends C7085c {

    /* renamed from: h */
    public final byte[] f14216h;

    /* renamed from: i */
    public int f14217i = 0;

    /* renamed from: d.a.a.a.y0.g.o$b */
    public class C7116b implements C7085c.C7086a {

        /* renamed from: g */
        public int f14218g = 0;

        /* renamed from: h */
        public final int f14219h;

        public C7116b(C7115a aVar) {
            this.f14219h = C7114o.this.f14216h.length;
        }

        /* renamed from: a */
        public byte mo24616a() {
            try {
                byte[] bArr = C7114o.this.f14216h;
                int i = this.f14218g;
                this.f14218g = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public boolean hasNext() {
            return this.f14218g < this.f14219h;
        }

        public Object next() {
            return Byte.valueOf(mo24616a());
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7114o(byte[] bArr) {
        this.f14216h = bArr;
    }

    /* renamed from: A */
    public C7085c.C7086a iterator() {
        return new C7116b((C7115a) null);
    }

    /* renamed from: E */
    public int mo24601E(int i, int i2, int i3) {
        byte[] bArr = this.f14216h;
        int R = mo24716R() + i2;
        for (int i4 = R; i4 < R + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24602F(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.mo24716R()
            int r0 = r0 + r9
            byte[] r9 = r7.f14216h
            int r10 = r10 + r0
            if (r8 == 0) goto L_0x008d
            if (r0 < r10) goto L_0x000e
            goto L_0x0091
        L_0x000e:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L_0x0027
            r8 = -62
            if (r1 < r8) goto L_0x0024
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r0 = r8
            goto L_0x008d
        L_0x0024:
            r8 = r3
            goto L_0x0091
        L_0x0027:
            r5 = -16
            if (r1 >= r5) goto L_0x0054
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L_0x003f
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r8 < r10) goto L_0x003c
            int r8 = p005b.p291q.p292a.C5266a.m9950f2(r1, r0)
            goto L_0x0091
        L_0x003c:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x003f:
            if (r8 > r4) goto L_0x0024
            r5 = -96
            if (r1 != r2) goto L_0x0047
            if (r8 < r5) goto L_0x0024
        L_0x0047:
            r2 = -19
            if (r1 != r2) goto L_0x004d
            if (r8 >= r5) goto L_0x0024
        L_0x004d:
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x0054:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            r5 = 0
            if (r2 != 0) goto L_0x0068
            int r8 = r0 + 1
            byte r2 = r9[r0]
            if (r8 < r10) goto L_0x0066
            int r8 = p005b.p291q.p292a.C5266a.m9950f2(r1, r2)
            goto L_0x0091
        L_0x0066:
            r0 = r8
            goto L_0x006b
        L_0x0068:
            int r8 = r8 >> 16
            byte r5 = (byte) r8
        L_0x006b:
            if (r5 != 0) goto L_0x0079
            int r8 = r0 + 1
            byte r5 = r9[r0]
            if (r8 < r10) goto L_0x0078
            int r8 = p005b.p291q.p292a.C5266a.m9956g2(r1, r2, r5)
            goto L_0x0091
        L_0x0078:
            r0 = r8
        L_0x0079:
            if (r2 > r4) goto L_0x0024
            int r8 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r8
            int r8 = r2 >> 30
            if (r8 != 0) goto L_0x0024
            if (r5 > r4) goto L_0x0024
            int r8 = r0 + 1
            byte r0 = r9[r0]
            if (r0 <= r4) goto L_0x0021
            goto L_0x0024
        L_0x008d:
            int r8 = p005b.p291q.p292a.C5266a.m10011p3(r9, r0, r10)
        L_0x0091:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7114o.mo24602F(int, int, int):int");
    }

    /* renamed from: H */
    public int mo24603H() {
        return this.f14217i;
    }

    /* renamed from: I */
    public String mo24604I(String str) {
        byte[] bArr = this.f14216h;
        return new String(bArr, 0, bArr.length, str);
    }

    /* renamed from: K */
    public void mo24606K(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f14216h, mo24716R() + i, i2);
    }

    /* renamed from: M */
    public boolean mo24715M(C7114o oVar, int i, int i2) {
        if (i2 > oVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= oVar.size()) {
            byte[] bArr = this.f14216h;
            byte[] bArr2 = oVar.f14216h;
            int R = mo24716R() + i2;
            int R2 = mo24716R();
            int R3 = oVar.mo24716R() + i;
            while (R2 < R) {
                if (bArr[R2] != bArr2[R3]) {
                    return false;
                }
                R2++;
                R3++;
            }
            return true;
        } else {
            int size2 = oVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: R */
    public int mo24716R() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7085c) || size() != ((C7085c) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C7114o) {
            return mo24715M((C7114o) obj, 0, size());
        }
        if (obj instanceof C7121s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(C0843a.m455p(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public int hashCode() {
        int i = this.f14217i;
        if (i == 0) {
            int size = size();
            i = mo24601E(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f14217i = i;
        }
        return i;
    }

    /* renamed from: q */
    public void mo24610q(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f14216h, i, bArr, i2, i3);
    }

    /* renamed from: r */
    public int mo24611r() {
        return 0;
    }

    public int size() {
        return this.f14216h.length;
    }

    /* renamed from: u */
    public boolean mo24614u() {
        return true;
    }

    /* renamed from: w */
    public boolean mo24615w() {
        int R = mo24716R();
        return C5266a.m9845M2(this.f14216h, R, size() + R);
    }
}
