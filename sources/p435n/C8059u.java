package p435n;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p435n.p436c0.C8037a;

/* renamed from: n.u */
public final class C8059u implements C8043g {

    /* renamed from: g */
    public final C8040e f16179g = new C8040e();

    /* renamed from: h */
    public boolean f16180h;

    /* renamed from: i */
    public final C8030a0 f16181i;

    public C8059u(C8030a0 a0Var) {
        C6888i.m12438e(a0Var, "source");
        this.f16181i = a0Var;
    }

    /* renamed from: A */
    public byte[] mo25882A() {
        this.f16179g.mo25918n(this.f16181i);
        return this.f16179g.mo25882A();
    }

    /* renamed from: C */
    public long mo25885C(C8044h hVar) {
        C6888i.m12438e(hVar, "bytes");
        C6888i.m12438e(hVar, "bytes");
        if (!this.f16180h) {
            long j = 0;
            while (true) {
                long S = this.f16179g.mo25895S(hVar, j);
                if (S != -1) {
                    return S;
                }
                C8040e eVar = this.f16179g;
                long j2 = eVar.f16140h;
                if (this.f16181i.mo17031T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) hVar.mo25959l())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: D */
    public boolean mo25886D() {
        if (!this.f16180h) {
            return this.f16179g.mo25886D() && this.f16181i.mo17031T(this.f16179g, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: G */
    public byte[] mo25888G(long j) {
        mo25904d0(j);
        return this.f16179g.mo25888G(j);
    }

    /* renamed from: P */
    public long mo25893P(C8044h hVar) {
        C6888i.m12438e(hVar, "targetBytes");
        C6888i.m12438e(hVar, "targetBytes");
        if (!this.f16180h) {
            long j = 0;
            while (true) {
                long Z = this.f16179g.mo25899Z(hVar, j);
                if (Z != -1) {
                    return Z;
                }
                C8040e eVar = this.f16179g;
                long j2 = eVar.f16140h;
                if (this.f16181i.mo17031T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: T */
    public long mo17031T(C8040e eVar, long j) {
        C6888i.m12438e(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j).toString());
        } else if (!this.f16180h) {
            C8040e eVar2 = this.f16179g;
            if (eVar2.f16140h == 0 && this.f16181i.mo17031T(eVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.f16179g.mo17031T(eVar, Math.min(j, this.f16179g.f16140h));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: U */
    public String mo25896U(long j) {
        if (j >= 0) {
            long j2 = j == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long d = mo25986d(b, 0, j2);
            if (d != -1) {
                return C8037a.m14745b(this.f16179g, d);
            }
            if (j2 < RecyclerView.FOREVER_NS && mo25935t(j2) && this.f16179g.mo25891N(j2 - 1) == ((byte) 13) && mo25935t(1 + j2) && this.f16179g.mo25891N(j2) == b) {
                return C8037a.m14745b(this.f16179g, j2);
            }
            C8040e eVar = new C8040e();
            C8040e eVar2 = this.f16179g;
            eVar2.mo25946z(eVar, 0, Math.min((long) 32, eVar2.f16140h));
            StringBuilder u = C0843a.m460u("\\n not found: limit=");
            u.append(Math.min(this.f16179g.f16140h, j));
            u.append(" content=");
            u.append(eVar.mo25907f0().mo25960p());
            u.append("…");
            throw new EOFException(u.toString());
        }
        throw new IllegalArgumentException(C0843a.m448i("limit < 0: ", j).toString());
    }

    /* renamed from: V */
    public long mo25897V(C8064y yVar) {
        C6888i.m12438e(yVar, "sink");
        long j = 0;
        while (this.f16181i.mo17031T(this.f16179g, (long) 8192) != -1) {
            long q = this.f16179g.mo25924q();
            if (q > 0) {
                j += q;
                ((C8056r) yVar).mo17030j(this.f16179g, q);
            }
        }
        C8040e eVar = this.f16179g;
        long j2 = eVar.f16140h;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        ((C8056r) yVar).mo17030j(eVar, j2);
        return j3;
    }

    /* renamed from: X */
    public C8043g mo25898X() {
        return C5266a.m9812H(new C8057s(this));
    }

    /* renamed from: a */
    public C8040e mo25900a() {
        return this.f16179g;
    }

    /* renamed from: c */
    public C8040e mo25901c() {
        return this.f16179g;
    }

    public void close() {
        if (!this.f16180h) {
            this.f16180h = true;
            this.f16181i.close();
            C8040e eVar = this.f16179g;
            eVar.skip(eVar.f16140h);
        }
    }

    /* renamed from: d */
    public long mo25986d(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f16180h) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long O = this.f16179g.mo25892O(b, j, j2);
                    if (O != -1) {
                        return O;
                    }
                    C8040e eVar = this.f16179g;
                    long j3 = eVar.f16140h;
                    if (j3 >= j2 || this.f16181i.mo17031T(eVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, j3);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: d0 */
    public void mo25904d0(long j) {
        if (!mo25935t(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: e */
    public int mo25987e() {
        mo25904d0(4);
        int readInt = this.f16179g.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f16181i.mo17035f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo25911i0() {
        /*
            r5 = this;
            r0 = 1
            r5.mo25904d0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo25935t(r2)
            if (r2 == 0) goto L_0x0062
            n.e r2 = r5.f16179g
            long r3 = (long) r0
            byte r2 = r2.mo25891N(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            p005b.p291q.p292a.C5266a.m9854O(r3)
            p005b.p291q.p292a.C5266a.m9854O(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            n.e r0 = r5.f16179g
            long r0 = r0.mo25911i0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8059u.mo25911i0():long");
    }

    public boolean isOpen() {
        return !this.f16180h;
    }

    /* renamed from: j0 */
    public String mo25913j0(Charset charset) {
        C6888i.m12438e(charset, "charset");
        this.f16179g.mo25918n(this.f16181i);
        return this.f16179g.mo25913j0(charset);
    }

    /* renamed from: k0 */
    public InputStream mo25914k0() {
        return new C8060a(this);
    }

    /* renamed from: m0 */
    public int mo25917m0(C8054q qVar) {
        C6888i.m12438e(qVar, "options");
        if (!this.f16180h) {
            while (true) {
                int c = C8037a.m14746c(this.f16179g, qVar, true);
                if (c == -2) {
                    if (this.f16181i.mo17031T(this.f16179g, (long) 8192) == -1) {
                        break;
                    }
                } else if (c != -1) {
                    this.f16179g.skip((long) qVar.f16166g[c].mo25959l());
                    return c;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: p */
    public C8044h mo25922p(long j) {
        if (mo25935t(j)) {
            return this.f16179g.mo25922p(j);
        }
        throw new EOFException();
    }

    public int read(ByteBuffer byteBuffer) {
        C6888i.m12438e(byteBuffer, "sink");
        C8040e eVar = this.f16179g;
        if (eVar.f16140h == 0 && this.f16181i.mo17031T(eVar, (long) 8192) == -1) {
            return -1;
        }
        return this.f16179g.read(byteBuffer);
    }

    public byte readByte() {
        mo25904d0(1);
        return this.f16179g.readByte();
    }

    public int readInt() {
        mo25904d0(4);
        return this.f16179g.readInt();
    }

    public short readShort() {
        mo25904d0(2);
        return this.f16179g.readShort();
    }

    public void skip(long j) {
        if (!this.f16180h) {
            while (j > 0) {
                C8040e eVar = this.f16179g;
                if (eVar.f16140h == 0 && this.f16181i.mo17031T(eVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f16179g.f16140h);
                this.f16179g.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: t */
    public boolean mo25935t(long j) {
        C8040e eVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j).toString());
        } else if (!this.f16180h) {
            do {
                eVar = this.f16179g;
                if (eVar.f16140h >= j) {
                    return true;
                }
            } while (this.f16181i.mo17031T(eVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("buffer(");
        u.append(this.f16181i);
        u.append(')');
        return u.toString();
    }

    /* renamed from: y */
    public String mo25944y() {
        return mo25896U(RecyclerView.FOREVER_NS);
    }

    /* renamed from: n.u$a */
    public static final class C8060a extends InputStream {

        /* renamed from: g */
        public final /* synthetic */ C8059u f16182g;

        public C8060a(C8059u uVar) {
            this.f16182g = uVar;
        }

        public int available() {
            C8059u uVar = this.f16182g;
            if (!uVar.f16180h) {
                return (int) Math.min(uVar.f16179g.f16140h, (long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f16182g.close();
        }

        public int read() {
            C8059u uVar = this.f16182g;
            if (!uVar.f16180h) {
                C8040e eVar = uVar.f16179g;
                if (eVar.f16140h == 0 && uVar.f16181i.mo17031T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f16182g.f16179g.readByte() & ExifInterface.MARKER;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f16182g + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C6888i.m12438e(bArr, "data");
            if (!this.f16182g.f16180h) {
                C5266a.m9848N((long) bArr.length, (long) i, (long) i2);
                C8059u uVar = this.f16182g;
                C8040e eVar = uVar.f16179g;
                if (eVar.f16140h == 0 && uVar.f16181i.mo17031T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f16182g.f16179g.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
