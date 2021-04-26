package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;

/* renamed from: b.l.a.c.e.e.nm */
public final class C2365nm {

    /* renamed from: a */
    public int f4124a;

    /* renamed from: b */
    public C2389om f4125b;

    /* renamed from: c */
    public final byte[] f4126c;

    /* renamed from: d */
    public int f4127d;

    /* renamed from: e */
    public int f4128e;

    /* renamed from: f */
    public int f4129f;

    /* renamed from: g */
    public int f4130g;

    /* renamed from: h */
    public int f4131h = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    public /* synthetic */ C2365nm(byte[] bArr, int i) {
        this.f4126c = bArr;
        this.f4127d = i;
        this.f4129f = 0;
    }

    /* renamed from: n */
    public static int m3839n(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: o */
    public static long m3840o(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public final int mo12847a() {
        if (mo12857k()) {
            this.f4130g = 0;
            return 0;
        }
        int e = mo12851e();
        this.f4130g = e;
        if ((e >>> 3) != 0) {
            return e;
        }
        throw C2246j.m3527d();
    }

    /* renamed from: b */
    public final void mo12848b(int i) {
        if (this.f4130g != i) {
            throw C2246j.m3528e();
        }
    }

    /* renamed from: c */
    public final boolean mo12849c(int i) {
        int a;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f4127d - this.f4129f >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f4126c;
                    int i4 = this.f4129f;
                    this.f4129f = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw C2246j.m3526c();
            }
            while (i3 < 10) {
                if (mo12858l() < 0) {
                    i3++;
                }
            }
            throw C2246j.m3526c();
            return true;
        } else if (i2 == 1) {
            mo12859m(8);
            return true;
        } else if (i2 == 2) {
            mo12859m(mo12851e());
            return true;
        } else if (i2 == 3) {
            do {
                a = mo12847a();
                if (a == 0 || !mo12849c(a)) {
                    mo12848b(((i >>> 3) << 3) | 4);
                }
                a = mo12847a();
                break;
            } while (!mo12849c(a));
            mo12848b(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo12859m(4);
                return true;
            }
            int i5 = C2246j.f3950g;
            throw new C2221i();
        }
    }

    /* renamed from: d */
    public final boolean mo12850d() {
        return mo12852f() != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12851e() {
        /*
            r5 = this;
            int r0 = r5.f4129f
            int r1 = r5.f4127d
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f4126c
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f4129f = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f4129f = r1
            return r0
        L_0x006c:
            long r0 = r5.mo12853g()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2365nm.mo12851e():int");
    }

    /* renamed from: f */
    public final long mo12852f() {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f4129f;
        int i2 = this.f4127d;
        if (i2 != i) {
            byte[] bArr = this.f4126c;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f4129f = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f4129f = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f4129f = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f4129f = i4;
                    return j;
                }
                j = (long) b;
                this.f4129f = i4;
                return j;
            }
        }
        return mo12853g();
    }

    /* renamed from: g */
    public final long mo12853g() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = mo12858l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw C2246j.m3526c();
    }

    /* renamed from: h */
    public final int mo12854h() {
        int i = this.f4129f;
        if (this.f4127d - i >= 4) {
            byte[] bArr = this.f4126c;
            this.f4129f = i + 4;
            return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << 16);
        }
        throw C2246j.m3524a();
    }

    /* renamed from: i */
    public final long mo12855i() {
        int i = this.f4129f;
        if (this.f4127d - i >= 8) {
            byte[] bArr = this.f4126c;
            this.f4129f = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C2246j.m3524a();
    }

    /* renamed from: j */
    public final int mo12856j(int i) {
        if (i >= 0) {
            int i2 = i + this.f4129f;
            int i3 = this.f4131h;
            if (i2 <= i3) {
                this.f4131h = i2;
                mo12860p();
                return i3;
            }
            throw C2246j.m3524a();
        }
        throw C2246j.m3525b();
    }

    /* renamed from: k */
    public final boolean mo12857k() {
        return this.f4129f == this.f4127d;
    }

    /* renamed from: l */
    public final byte mo12858l() {
        int i = this.f4129f;
        if (i != this.f4127d) {
            byte[] bArr = this.f4126c;
            this.f4129f = i + 1;
            return bArr[i];
        }
        throw C2246j.m3524a();
    }

    /* renamed from: m */
    public final void mo12859m(int i) {
        if (i >= 0) {
            int i2 = this.f4127d;
            int i3 = this.f4129f;
            if (i <= i2 - i3) {
                this.f4129f = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C2246j.m3525b();
        }
        throw C2246j.m3524a();
    }

    /* renamed from: p */
    public final void mo12860p() {
        int i = this.f4127d + this.f4128e;
        this.f4127d = i;
        int i2 = this.f4131h;
        if (i > i2) {
            int i3 = i - i2;
            this.f4128e = i3;
            this.f4127d = i - i3;
            return;
        }
        this.f4128e = 0;
    }
}
