package p005b.p051h.p052a.p053k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: b.h.a.k.b */
public class C0953b implements Closeable {

    /* renamed from: g */
    public final InputStream f943g;

    /* renamed from: h */
    public final Charset f944h;

    /* renamed from: i */
    public byte[] f945i;

    /* renamed from: j */
    public int f946j;

    /* renamed from: k */
    public int f947k;

    /* renamed from: b.h.a.k.b$a */
    public class C0954a extends ByteArrayOutputStream {
        public C0954a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C0953b.this.f944h.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C0953b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(C0955c.f949a)) {
            this.f943g = inputStream;
            this.f944h = charset;
            this.f945i = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() {
        synchronized (this.f943g) {
            if (this.f945i != null) {
                this.f945i = null;
                this.f943g.close();
            }
        }
    }

    /* renamed from: d */
    public final void mo10804d() {
        InputStream inputStream = this.f943g;
        byte[] bArr = this.f945i;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f946j = 0;
            this.f947k = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: e */
    public String mo10805e() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f943g) {
            if (this.f945i != null) {
                if (this.f946j >= this.f947k) {
                    mo10804d();
                }
                for (int i3 = this.f946j; i3 != this.f947k; i3++) {
                    byte[] bArr2 = this.f945i;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f946j) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f945i;
                                int i4 = this.f946j;
                                String str = new String(bArr3, i4, i2 - i4, this.f944h.name());
                                this.f946j = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f945i;
                        int i42 = this.f946j;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f944h.name());
                        this.f946j = i3 + 1;
                        return str2;
                    }
                }
                C0954a aVar = new C0954a((this.f947k - this.f946j) + 80);
                loop1:
                while (true) {
                    byte[] bArr4 = this.f945i;
                    int i5 = this.f946j;
                    aVar.write(bArr4, i5, this.f947k - i5);
                    this.f947k = -1;
                    mo10804d();
                    i = this.f946j;
                    while (true) {
                        if (i != this.f947k) {
                            bArr = this.f945i;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f946j;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f946j = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
