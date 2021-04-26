package p005b.p051h.p052a.p078s;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: b.h.a.s.d */
public class C1372d extends InputStream {

    /* renamed from: i */
    public static final Queue<C1372d> f1786i = new ArrayDeque(0);

    /* renamed from: g */
    public InputStream f1787g;

    /* renamed from: h */
    public IOException f1788h;

    static {
        char[] cArr = C1380j.f1801a;
    }

    public int available() {
        return this.f1787g.available();
    }

    public void close() {
        this.f1787g.close();
    }

    /* renamed from: d */
    public void mo11242d() {
        this.f1788h = null;
        this.f1787g = null;
        Queue<C1372d> queue = f1786i;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void mark(int i) {
        this.f1787g.mark(i);
    }

    public boolean markSupported() {
        return this.f1787g.markSupported();
    }

    public int read() {
        try {
            return this.f1787g.read();
        } catch (IOException e) {
            this.f1788h = e;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f1787g.read(bArr);
        } catch (IOException e) {
            this.f1788h = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f1787g.read(bArr, i, i2);
        } catch (IOException e) {
            this.f1788h = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f1787g.reset();
    }

    public long skip(long j) {
        try {
            return this.f1787g.skip(j);
        } catch (IOException e) {
            this.f1788h = e;
            return 0;
        }
    }
}
