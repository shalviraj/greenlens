package p435n;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.m */
public final class C8050m implements C8030a0 {

    /* renamed from: g */
    public byte f16153g;

    /* renamed from: h */
    public final C8059u f16154h;

    /* renamed from: i */
    public final Inflater f16155i;

    /* renamed from: j */
    public final C8051n f16156j;

    /* renamed from: k */
    public final CRC32 f16157k = new CRC32();

    public C8050m(C8030a0 a0Var) {
        C6888i.m12438e(a0Var, "source");
        C8059u uVar = new C8059u(a0Var);
        this.f16154h = uVar;
        Inflater inflater = new Inflater(true);
        this.f16155i = inflater;
        this.f16156j = new C8051n((C8043g) uVar, inflater);
    }

    /* renamed from: T */
    public long mo17031T(C8040e eVar, long j) {
        long j2;
        C8040e eVar2 = eVar;
        long j3 = j;
        C6888i.m12438e(eVar2, "sink");
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j3).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f16153g == 0) {
                this.f16154h.mo25904d0(10);
                byte N = this.f16154h.f16179g.mo25891N(3);
                boolean z2 = ((N >> 1) & 1) == 1;
                if (z2) {
                    mo25976e(this.f16154h.f16179g, 0, 10);
                }
                mo25975d("ID1ID2", 8075, this.f16154h.readShort());
                this.f16154h.skip(8);
                if (((N >> 2) & 1) == 1) {
                    this.f16154h.mo25904d0(2);
                    if (z2) {
                        mo25976e(this.f16154h.f16179g, 0, 2);
                    }
                    long h0 = (long) this.f16154h.f16179g.mo25909h0();
                    this.f16154h.mo25904d0(h0);
                    if (z2) {
                        j2 = h0;
                        mo25976e(this.f16154h.f16179g, 0, h0);
                    } else {
                        j2 = h0;
                    }
                    this.f16154h.skip(j2);
                }
                if (((N >> 3) & 1) == 1) {
                    long d = this.f16154h.mo25986d((byte) 0, 0, RecyclerView.FOREVER_NS);
                    if (d != -1) {
                        if (z2) {
                            mo25976e(this.f16154h.f16179g, 0, d + 1);
                        }
                        this.f16154h.skip(d + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((N >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long d2 = this.f16154h.mo25986d((byte) 0, 0, RecyclerView.FOREVER_NS);
                    if (d2 != -1) {
                        if (z2) {
                            mo25976e(this.f16154h.f16179g, 0, d2 + 1);
                        }
                        this.f16154h.skip(d2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    C8059u uVar = this.f16154h;
                    uVar.mo25904d0(2);
                    mo25975d("FHCRC", uVar.f16179g.mo25909h0(), (short) ((int) this.f16157k.getValue()));
                    this.f16157k.reset();
                }
                this.f16153g = 1;
            }
            if (this.f16153g == 1) {
                long j4 = eVar2.f16140h;
                long T = this.f16156j.mo17031T(eVar2, j3);
                if (T != -1) {
                    mo25976e(eVar, j4, T);
                    return T;
                }
                this.f16153g = 2;
            }
            if (this.f16153g == 2) {
                mo25975d("CRC", this.f16154h.mo25987e(), (int) this.f16157k.getValue());
                mo25975d("ISIZE", this.f16154h.mo25987e(), (int) this.f16155i.getBytesWritten());
                this.f16153g = 3;
                if (!this.f16154h.mo25886D()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() {
        this.f16156j.close();
    }

    /* renamed from: d */
    public final void mo25975d(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C6888i.m12437d(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: e */
    public final void mo25976e(C8040e eVar, long j, long j2) {
        C8061v vVar = eVar.f16139g;
        while (true) {
            C6888i.m12436c(vVar);
            int i = vVar.f16185c;
            int i2 = vVar.f16184b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            vVar = vVar.f16188f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) vVar.f16184b) + j);
            int min = (int) Math.min((long) (vVar.f16185c - i3), j2);
            this.f16157k.update(vVar.f16183a, i3, min);
            j2 -= (long) min;
            vVar = vVar.f16188f;
            C6888i.m12436c(vVar);
            j = 0;
        }
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f16154h.mo17035f();
    }
}
