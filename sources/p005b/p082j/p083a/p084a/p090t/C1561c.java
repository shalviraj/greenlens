package p005b.p082j.p083a.p084a.p090t;

import java.io.OutputStream;
import java.util.LinkedList;

/* renamed from: b.j.a.a.t.c */
public final class C1561c extends OutputStream {

    /* renamed from: k */
    public static final byte[] f2609k = new byte[0];

    /* renamed from: g */
    public final LinkedList<byte[]> f2610g = new LinkedList<>();

    /* renamed from: h */
    public int f2611h;

    /* renamed from: i */
    public byte[] f2612i;

    /* renamed from: j */
    public int f2613j;

    public C1561c(byte[] bArr, int i) {
        this.f2612i = bArr;
        this.f2613j = i;
    }

    public void close() {
    }

    /* renamed from: d */
    public final void mo11687d() {
        int length = this.f2611h + this.f2612i.length;
        if (length >= 0) {
            this.f2611h = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.f2610g.add(this.f2612i);
            this.f2612i = new byte[max];
            this.f2613j = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public void flush() {
    }

    public void write(int i) {
        if (this.f2613j >= this.f2612i.length) {
            mo11687d();
        }
        byte[] bArr = this.f2612i;
        int i2 = this.f2613j;
        this.f2613j = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this.f2612i.length - this.f2613j, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f2612i, this.f2613j, min);
                i += min;
                this.f2613j += min;
                i2 -= min;
            }
            if (i2 > 0) {
                mo11687d();
            } else {
                return;
            }
        }
    }
}
