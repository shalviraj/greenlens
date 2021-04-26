package p298d.p299a.p300a.p301a.p303y0.p389g;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d.a.a.a.y0.g.d */
public final class C7088d {

    /* renamed from: a */
    public final byte[] f14167a = new byte[4096];

    /* renamed from: b */
    public final boolean f14168b;

    /* renamed from: c */
    public int f14169c = 0;

    /* renamed from: d */
    public int f14170d;

    /* renamed from: e */
    public int f14171e = 0;

    /* renamed from: f */
    public final InputStream f14172f;

    /* renamed from: g */
    public int f14173g;

    /* renamed from: h */
    public int f14174h = 0;

    /* renamed from: i */
    public int f14175i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* renamed from: j */
    public int f14176j;

    public C7088d(InputStream inputStream) {
        this.f14172f = inputStream;
        this.f14168b = false;
    }

    /* renamed from: a */
    public void mo24623a(int i) {
        if (this.f14173g != i) {
            throw new C7106j("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public int mo24624b() {
        int i = this.f14175i;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f14174h + this.f14171e);
    }

    /* renamed from: c */
    public void mo24625c(int i) {
        this.f14175i = i;
        mo24638p();
    }

    /* renamed from: d */
    public int mo24626d(int i) {
        if (i >= 0) {
            int i2 = this.f14174h + this.f14171e + i;
            int i3 = this.f14175i;
            if (i2 <= i3) {
                this.f14175i = i2;
                mo24638p();
                return i3;
            }
            throw C7106j.m12798d();
        }
        throw C7106j.m12796a();
    }

    /* renamed from: e */
    public boolean mo24627e() {
        return mo24635m() != 0;
    }

    /* renamed from: f */
    public C7085c mo24628f() {
        int l = mo24634l();
        int i = this.f14169c;
        int i2 = this.f14171e;
        if (l > i - i2 || l <= 0) {
            return l == 0 ? C7085c.f14160g : new C7114o(mo24631i(l));
        }
        byte[] bArr = this.f14167a;
        C7085c cVar = C7085c.f14160g;
        byte[] bArr2 = new byte[l];
        System.arraycopy(bArr, i2, bArr2, 0, l);
        C7114o oVar = new C7114o(bArr2);
        this.f14171e += l;
        return oVar;
    }

    /* renamed from: g */
    public int mo24629g() {
        return mo24634l();
    }

    /* renamed from: h */
    public <T extends C7117p> T mo24630h(C7120r<T> rVar, C7091f fVar) {
        int l = mo24634l();
        if (this.f14176j < 64) {
            int d = mo24626d(l);
            this.f14176j++;
            T t = (C7117p) rVar.mo23688a(this, fVar);
            mo24623a(0);
            this.f14176j--;
            this.f14175i = d;
            mo24638p();
            return t;
        }
        throw C7106j.m12797b();
    }

    /* renamed from: i */
    public final byte[] mo24631i(int i) {
        if (i > 0) {
            int i2 = this.f14174h;
            int i3 = this.f14171e;
            int i4 = i2 + i3 + i;
            int i5 = this.f14175i;
            if (i4 > i5) {
                mo24641s((i5 - i2) - i3);
                throw C7106j.m12798d();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i6 = this.f14169c - i3;
                System.arraycopy(this.f14167a, i3, bArr, 0, i6);
                int i7 = this.f14169c;
                this.f14171e = i7;
                int i8 = i - i6;
                if (i7 - i7 >= i8 || mo24642t(i8)) {
                    System.arraycopy(this.f14167a, 0, bArr, i6, i8);
                    this.f14171e = i8;
                    return bArr;
                }
                throw C7106j.m12798d();
            } else {
                int i9 = this.f14169c;
                this.f14174h = i2 + i9;
                this.f14171e = 0;
                this.f14169c = 0;
                int i10 = i9 - i3;
                int i11 = i - i10;
                ArrayList arrayList = new ArrayList();
                while (i11 > 0) {
                    int min = Math.min(i11, 4096);
                    byte[] bArr2 = new byte[min];
                    int i12 = 0;
                    while (i12 < min) {
                        InputStream inputStream = this.f14172f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i12, min - i12);
                        if (read != -1) {
                            this.f14174h += read;
                            i12 += read;
                        } else {
                            throw C7106j.m12798d();
                        }
                    }
                    i11 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f14167a, i3, bArr3, 0, i10);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byte[] bArr4 = (byte[]) it.next();
                    System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
                    i10 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return C7103i.f14208a;
        } else {
            throw C7106j.m12796a();
        }
    }

    /* renamed from: j */
    public int mo24632j() {
        int i = this.f14171e;
        if (this.f14169c - i < 4) {
            mo24639q(4);
            i = this.f14171e;
        }
        byte[] bArr = this.f14167a;
        this.f14171e = i + 4;
        return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << 16);
    }

    /* renamed from: k */
    public long mo24633k() {
        int i = this.f14171e;
        if (this.f14169c - i < 8) {
            mo24639q(8);
            i = this.f14171e;
        }
        byte[] bArr = this.f14167a;
        this.f14171e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24634l() {
        /*
            r9 = this;
            int r0 = r9.f14171e
            int r1 = r9.f14169c
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.f14167a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f14171e = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.mo24636n()
            int r0 = (int) r0
            return r0
        L_0x0082:
            r9.f14171e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7088d.mo24634l():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24635m() {
        /*
            r9 = this;
            int r0 = r9.f14171e
            int r1 = r9.f14169c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.f14167a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.f14171e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.mo24636n()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.f14171e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7088d.mo24635m():long");
    }

    /* renamed from: n */
    public long mo24636n() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f14171e == this.f14169c) {
                mo24639q(1);
            }
            byte[] bArr = this.f14167a;
            int i2 = this.f14171e;
            this.f14171e = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new C7106j("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: o */
    public int mo24637o() {
        boolean z = true;
        if (this.f14171e != this.f14169c || mo24642t(1)) {
            z = false;
        }
        if (z) {
            this.f14173g = 0;
            return 0;
        }
        int l = mo24634l();
        this.f14173g = l;
        if ((l >>> 3) != 0) {
            return l;
        }
        throw new C7106j("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: p */
    public final void mo24638p() {
        int i = this.f14169c + this.f14170d;
        this.f14169c = i;
        int i2 = this.f14174h + i;
        int i3 = this.f14175i;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f14170d = i4;
            this.f14169c = i - i4;
            return;
        }
        this.f14170d = 0;
    }

    /* renamed from: q */
    public final void mo24639q(int i) {
        if (!mo24642t(i)) {
            throw C7106j.m12798d();
        }
    }

    /* renamed from: r */
    public boolean mo24640r(int i, C7089e eVar) {
        int o;
        int i2 = i & 7;
        if (i2 == 0) {
            long m = mo24635m();
            eVar.mo24658y(i);
            eVar.mo24659z(m);
            return true;
        } else if (i2 == 1) {
            long k = mo24633k();
            eVar.mo24658y(i);
            eVar.mo24657x(k);
            return true;
        } else if (i2 == 2) {
            C7085c f = mo24628f();
            eVar.mo24658y(i);
            eVar.mo24646m(f);
            return true;
        } else if (i2 == 3) {
            eVar.mo24658y(i);
            do {
                o = mo24637o();
                if (o == 0 || !mo24640r(o, eVar)) {
                    int i3 = ((i >>> 3) << 3) | 4;
                    mo24623a(i3);
                    eVar.mo24658y(i3);
                }
                o = mo24637o();
                break;
            } while (!mo24640r(o, eVar));
            int i32 = ((i >>> 3) << 3) | 4;
            mo24623a(i32);
            eVar.mo24658y(i32);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                int j = mo24632j();
                eVar.mo24658y(i);
                eVar.mo24656w(j);
                return true;
            }
            throw new C7106j("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: s */
    public void mo24641s(int i) {
        int i2 = this.f14169c;
        int i3 = this.f14171e;
        if (i <= i2 - i3 && i >= 0) {
            this.f14171e = i3 + i;
        } else if (i >= 0) {
            int i4 = this.f14174h;
            int i5 = i4 + i3 + i;
            int i6 = this.f14175i;
            if (i5 <= i6) {
                int i7 = i2 - i3;
                this.f14171e = i2;
                while (true) {
                    mo24639q(1);
                    int i8 = i - i7;
                    int i9 = this.f14169c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f14171e = i9;
                    } else {
                        this.f14171e = i8;
                        return;
                    }
                }
            } else {
                mo24641s((i6 - i4) - i3);
                throw C7106j.m12798d();
            }
        } else {
            throw C7106j.m12796a();
        }
    }

    /* renamed from: t */
    public final boolean mo24642t(int i) {
        int i2 = this.f14171e;
        int i3 = i2 + i;
        int i4 = this.f14169c;
        if (i3 > i4) {
            if (this.f14174h + i2 + i <= this.f14175i && this.f14172f != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f14167a;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f14174h += i2;
                    this.f14169c -= i2;
                    this.f14171e = 0;
                }
                InputStream inputStream = this.f14172f;
                byte[] bArr2 = this.f14167a;
                int i5 = this.f14169c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f14167a.length) {
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read > 0) {
                    this.f14169c += read;
                    if ((this.f14174h + i) - 67108864 <= 0) {
                        mo24638p();
                        if (this.f14169c >= i) {
                            return true;
                        }
                        return mo24642t(i);
                    }
                    throw new C7106j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }
}
