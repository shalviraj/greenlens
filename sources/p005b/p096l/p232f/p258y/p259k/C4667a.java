package p005b.p096l.p232f.p258y.p259k;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.y.k.a */
public final class C4667a {

    /* renamed from: a */
    public final C4658b f8852a;

    /* renamed from: b */
    public final int f8853b;

    /* renamed from: c */
    public final int f8854c;

    /* renamed from: d */
    public final int f8855d;

    /* renamed from: e */
    public final int f8856e;

    /* renamed from: f */
    public final int f8857f;

    /* renamed from: g */
    public final int f8858g;

    public C4667a(C4658b bVar, int i, int i2, int i3) {
        this.f8852a = bVar;
        int i4 = bVar.f8788h;
        this.f8853b = i4;
        int i5 = bVar.f8787g;
        this.f8854c = i5;
        int i6 = i / 2;
        int i7 = i2 - i6;
        this.f8855d = i7;
        int i8 = i2 + i6;
        this.f8856e = i8;
        int i9 = i3 - i6;
        this.f8858g = i9;
        int i10 = i3 + i6;
        this.f8857f = i10;
        if (i9 < 0 || i7 < 0 || i10 >= i4 || i8 >= i5) {
            throw C4619m.f8685i;
        }
    }

    /* renamed from: a */
    public final boolean mo16347a(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f8852a.mo16333b(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f8852a.mo16333b(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: b */
    public C4625s[] mo16348b() {
        boolean z;
        int i = this.f8855d;
        int i2 = this.f8856e;
        int i3 = this.f8858g;
        int i4 = this.f8857f;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (true) {
            if (!z6) {
                z = false;
                break;
            }
            boolean z7 = false;
            boolean z8 = true;
            while (true) {
                if ((z8 || !z2) && i2 < this.f8854c) {
                    z8 = mo16347a(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z2 = true;
                        z7 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f8854c) {
                boolean z9 = true;
                while (true) {
                    if ((z9 || !z3) && i4 < this.f8853b) {
                        z9 = mo16347a(i, i2, i4, true);
                        if (z9) {
                            i4++;
                            z3 = true;
                            z7 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f8853b) {
                    boolean z10 = true;
                    while (true) {
                        if ((z10 || !z4) && i >= 0) {
                            z10 = mo16347a(i3, i4, i, false);
                            if (z10) {
                                i--;
                                z4 = true;
                                z7 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z6 = z7;
                        boolean z11 = true;
                        while (true) {
                            if ((z11 || !z5) && i3 >= 0) {
                                z11 = mo16347a(i, i2, i3, true);
                                if (z11) {
                                    i3--;
                                    z6 = true;
                                    z5 = true;
                                } else if (!z5) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i5 = i2 - i;
            C4625s sVar = null;
            int i6 = 1;
            C4625s sVar2 = null;
            while (sVar2 == null && i6 < i5) {
                sVar2 = mo16349c((float) i, (float) (i4 - i6), (float) (i + i6), (float) i4);
                i6++;
            }
            if (sVar2 != null) {
                int i7 = 1;
                C4625s sVar3 = null;
                while (sVar3 == null && i7 < i5) {
                    sVar3 = mo16349c((float) i, (float) (i3 + i7), (float) (i + i7), (float) i3);
                    i7++;
                }
                if (sVar3 != null) {
                    int i8 = 1;
                    C4625s sVar4 = null;
                    while (sVar4 == null && i8 < i5) {
                        sVar4 = mo16349c((float) i2, (float) (i3 + i8), (float) (i2 - i8), (float) i3);
                        i8++;
                    }
                    if (sVar4 != null) {
                        int i9 = 1;
                        while (sVar == null && i9 < i5) {
                            sVar = mo16349c((float) i2, (float) (i4 - i9), (float) (i2 - i9), (float) i4);
                            i9++;
                        }
                        if (sVar != null) {
                            float f = sVar.f8708a;
                            float f2 = sVar.f8709b;
                            float f3 = sVar2.f8708a;
                            float f4 = sVar2.f8709b;
                            float f5 = sVar4.f8708a;
                            float f6 = sVar4.f8709b;
                            float f7 = sVar3.f8708a;
                            float f8 = sVar3.f8709b;
                            if (f < ((float) this.f8854c) / 2.0f) {
                                return new C4625s[]{new C4625s(f7 - 1.0f, f8 + 1.0f), new C4625s(f3 + 1.0f, f4 + 1.0f), new C4625s(f5 - 1.0f, f6 - 1.0f), new C4625s(f + 1.0f, f2 - 1.0f)};
                            }
                            return new C4625s[]{new C4625s(f7 + 1.0f, f8 + 1.0f), new C4625s(f3 + 1.0f, f4 - 1.0f), new C4625s(f5 - 1.0f, f6 + 1.0f), new C4625s(f - 1.0f, f2 - 1.0f)};
                        }
                        throw C4619m.f8685i;
                    }
                    throw C4619m.f8685i;
                }
                throw C4619m.f8685i;
            }
            throw C4619m.f8685i;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: c */
    public final C4625s mo16349c(float f, float f2, float f3, float f4) {
        int F0 = C1960d.m2711F0(C1960d.m2716H(f, f2, f3, f4));
        float f5 = (float) F0;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < F0; i++) {
            float f8 = (float) i;
            int F02 = C1960d.m2711F0((f8 * f6) + f);
            int F03 = C1960d.m2711F0((f8 * f7) + f2);
            if (this.f8852a.mo16333b(F02, F03)) {
                return new C4625s((float) F02, (float) F03);
            }
        }
        return null;
    }
}
