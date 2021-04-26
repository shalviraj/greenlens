package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.appcompat.widget.ActivityChooserView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: b.l.a.c.e.e.om */
public final class C2389om {

    /* renamed from: a */
    public final C2365nm f4176a;

    /* renamed from: b */
    public int f4177b;

    /* renamed from: c */
    public int f4178c;

    /* renamed from: d */
    public int f4179d = 0;

    public C2389om(C2365nm nmVar) {
        Charset charset = C2196h.f3910a;
        this.f4176a = nmVar;
        nmVar.f4125b = this;
    }

    /* renamed from: t */
    public static final void m3938t(int i) {
        if ((i & 3) != 0) {
            throw C2246j.m3529f();
        }
    }

    /* renamed from: u */
    public static final void m3939u(int i) {
        if ((i & 7) != 0) {
            throw C2246j.m3529f();
        }
    }

    /* renamed from: A */
    public final String mo12877A() {
        mo12899p(2);
        C2365nm nmVar = this.f4176a;
        int e = nmVar.mo12851e();
        if (e > 0) {
            int i = nmVar.f4127d;
            int i2 = nmVar.f4129f;
            if (e <= i - i2) {
                String str = new String(nmVar.f4126c, i2, e, C2196h.f3910a);
                nmVar.f4129f += e;
                return str;
            }
        }
        if (e == 0) {
            return "";
        }
        if (e < 0) {
            throw C2246j.m3525b();
        }
        throw C2246j.m3524a();
    }

    /* renamed from: B */
    public final String mo12878B() {
        mo12899p(2);
        C2365nm nmVar = this.f4176a;
        int e = nmVar.mo12851e();
        if (e > 0) {
            int i = nmVar.f4127d;
            int i2 = nmVar.f4129f;
            if (e <= i - i2) {
                String d = C2344n1.m3791d(nmVar.f4126c, i2, e);
                nmVar.f4129f += e;
                return d;
            }
        }
        if (e == 0) {
            return "";
        }
        if (e <= 0) {
            throw C2246j.m3525b();
        }
        throw C2246j.m3524a();
    }

    /* renamed from: C */
    public final C2317lm mo12879C() {
        mo12899p(2);
        C2365nm nmVar = this.f4176a;
        int e = nmVar.mo12851e();
        if (e > 0) {
            int i = nmVar.f4127d;
            int i2 = nmVar.f4129f;
            if (e <= i - i2) {
                C2317lm I = C2317lm.m3705I(nmVar.f4126c, i2, e);
                nmVar.f4129f += e;
                return I;
            }
        }
        if (e == 0) {
            return C2317lm.f4051h;
        }
        if (e > 0) {
            int i3 = nmVar.f4127d;
            int i4 = nmVar.f4129f;
            if (e <= i3 - i4) {
                int i5 = e + i4;
                nmVar.f4129f = i5;
                byte[] copyOfRange = Arrays.copyOfRange(nmVar.f4126c, i4, i5);
                C2317lm lmVar = C2317lm.f4051h;
                return new C2293km(copyOfRange);
            }
        }
        if (e <= 0) {
            throw C2246j.m3525b();
        }
        throw C2246j.m3524a();
    }

    /* renamed from: D */
    public final int mo12880D() {
        mo12899p(0);
        return this.f4176a.mo12851e();
    }

    /* renamed from: E */
    public final void mo12881E(List<Double> list) {
        int a;
        int a2;
        if (list instanceof C2557vm) {
            C2557vm vmVar = (C2557vm) list;
            int i = this.f4177b & 7;
            if (i == 1) {
                do {
                    vmVar.mo13062e(Double.longBitsToDouble(this.f4176a.mo12855i()));
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.mo12851e();
                m3939u(e);
                int i2 = this.f4176a.f4129f + e;
                do {
                    vmVar.mo13062e(Double.longBitsToDouble(this.f4176a.mo12855i()));
                } while (this.f4176a.f4129f < i2);
            } else {
                int i3 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i4 = this.f4177b & 7;
            if (i4 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(this.f4176a.mo12855i())));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i4 == 2) {
                int e2 = this.f4176a.mo12851e();
                m3939u(e2);
                int i5 = this.f4176a.f4129f + e2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(this.f4176a.mo12855i())));
                } while (this.f4176a.f4129f < i5);
            } else {
                int i6 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: F */
    public final void mo12882F(List<Float> list) {
        int a;
        int a2;
        if (list instanceof C2145en) {
            C2145en enVar = (C2145en) list;
            int i = this.f4177b & 7;
            if (i == 2) {
                int e = this.f4176a.mo12851e();
                m3938t(e);
                int i2 = this.f4176a.f4129f + e;
                do {
                    enVar.mo12616e(Float.intBitsToFloat(this.f4176a.mo12854h()));
                } while (this.f4176a.f4129f < i2);
            } else if (i == 5) {
                do {
                    enVar.mo12616e(Float.intBitsToFloat(this.f4176a.mo12854h()));
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else {
                int i3 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i4 = this.f4177b & 7;
            if (i4 == 2) {
                int e2 = this.f4176a.mo12851e();
                m3938t(e2);
                int i5 = this.f4176a.f4129f + e2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(this.f4176a.mo12854h())));
                } while (this.f4176a.f4129f < i5);
            } else if (i4 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(this.f4176a.mo12854h())));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else {
                int i6 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: G */
    public final void mo12883G(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    rVar.mo12954l(this.f4176a.mo12852f());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    rVar.mo12954l(this.f4176a.mo12852f());
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f4176a.mo12852f()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Long.valueOf(this.f4176a.mo12852f()));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: a */
    public final void mo12884a(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    rVar.mo12954l(this.f4176a.mo12852f());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    rVar.mo12954l(this.f4176a.mo12852f());
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f4176a.mo12852f()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Long.valueOf(this.f4176a.mo12852f()));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: b */
    public final void mo12885b(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    dVar.mo12496l(this.f4176a.mo12851e());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    dVar.mo12496l(this.f4176a.mo12851e());
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12851e()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12851e()));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: c */
    public final void mo12886c(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            int i = this.f4177b & 7;
            if (i == 1) {
                do {
                    rVar.mo12954l(this.f4176a.mo12855i());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.mo12851e();
                m3939u(e);
                int i2 = this.f4176a.f4129f + e;
                do {
                    rVar.mo12954l(this.f4176a.mo12855i());
                } while (this.f4176a.f4129f < i2);
            } else {
                int i3 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i4 = this.f4177b & 7;
            if (i4 == 1) {
                do {
                    list.add(Long.valueOf(this.f4176a.mo12855i()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i4 == 2) {
                int e2 = this.f4176a.mo12851e();
                m3939u(e2);
                int i5 = this.f4176a.f4129f + e2;
                do {
                    list.add(Long.valueOf(this.f4176a.mo12855i()));
                } while (this.f4176a.f4129f < i5);
            } else {
                int i6 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: d */
    public final void mo12887d(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            int i = this.f4177b & 7;
            if (i == 2) {
                int e = this.f4176a.mo12851e();
                m3938t(e);
                int i2 = this.f4176a.f4129f + e;
                do {
                    dVar.mo12496l(this.f4176a.mo12854h());
                } while (this.f4176a.f4129f < i2);
            } else if (i == 5) {
                do {
                    dVar.mo12496l(this.f4176a.mo12854h());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else {
                int i3 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i4 = this.f4177b & 7;
            if (i4 == 2) {
                int e2 = this.f4176a.mo12851e();
                m3938t(e2);
                int i5 = this.f4176a.f4129f + e2;
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12854h()));
                } while (this.f4176a.f4129f < i5);
            } else if (i4 == 5) {
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12854h()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else {
                int i6 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: e */
    public final void mo12888e(List<Boolean> list) {
        int a;
        int a2;
        if (list instanceof C2169fm) {
            C2169fm fmVar = (C2169fm) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    fmVar.mo12655e(this.f4176a.mo12850d());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    fmVar.mo12655e(this.f4176a.mo12850d());
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f4176a.mo12850d()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Boolean.valueOf(this.f4176a.mo12850d()));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: f */
    public final void mo12889f(List<String> list, boolean z) {
        int a;
        int a2;
        if ((this.f4177b & 7) != 2) {
            int i = C2246j.f3950g;
            throw new C2221i();
        } else if ((list instanceof C2342n) && !z) {
            C2342n nVar = (C2342n) list;
            do {
                nVar.mo12625N(mo12879C());
                if (!this.f4176a.mo12857k()) {
                    a2 = this.f4176a.mo12847a();
                } else {
                    return;
                }
            } while (a2 == this.f4177b);
            this.f4179d = a2;
        } else {
            do {
                list.add(z ? mo12878B() : mo12877A());
                if (!this.f4176a.mo12857k()) {
                    a = this.f4176a.mo12847a();
                } else {
                    return;
                }
            } while (a == this.f4177b);
            this.f4179d = a;
        }
    }

    /* renamed from: g */
    public final <T> void mo12890g(List<T> list, C2319m0<T> m0Var, C2605xm xmVar) {
        int a;
        int i = this.f4177b;
        if ((i & 7) == 2) {
            do {
                list.add(mo12900q(m0Var, xmVar));
                if (!this.f4176a.mo12857k() && this.f4179d == 0) {
                    a = this.f4176a.mo12847a();
                } else {
                    return;
                }
            } while (a == i);
            this.f4179d = a;
            return;
        }
        int i2 = C2246j.f3950g;
        throw new C2221i();
    }

    /* renamed from: h */
    public final <T> void mo12891h(List<T> list, C2319m0<T> m0Var, C2605xm xmVar) {
        int a;
        int i = this.f4177b;
        if ((i & 7) == 3) {
            do {
                list.add(mo12901r(m0Var, xmVar));
                if (!this.f4176a.mo12857k() && this.f4179d == 0) {
                    a = this.f4176a.mo12847a();
                } else {
                    return;
                }
            } while (a == i);
            this.f4179d = a;
            return;
        }
        int i2 = C2246j.f3950g;
        throw new C2221i();
    }

    /* renamed from: i */
    public final void mo12892i(List<C2317lm> list) {
        int a;
        if ((this.f4177b & 7) == 2) {
            do {
                list.add(mo12879C());
                if (!this.f4176a.mo12857k()) {
                    a = this.f4176a.mo12847a();
                } else {
                    return;
                }
            } while (a == this.f4177b);
            this.f4179d = a;
            return;
        }
        int i = C2246j.f3950g;
        throw new C2221i();
    }

    /* renamed from: j */
    public final void mo12893j(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    dVar.mo12496l(this.f4176a.mo12851e());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    dVar.mo12496l(this.f4176a.mo12851e());
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12851e()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12851e()));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: k */
    public final void mo12894k(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    dVar.mo12496l(this.f4176a.mo12851e());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    dVar.mo12496l(this.f4176a.mo12851e());
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12851e()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12851e()));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: l */
    public final void mo12895l(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            int i = this.f4177b & 7;
            if (i == 2) {
                int e = this.f4176a.mo12851e();
                m3938t(e);
                int i2 = this.f4176a.f4129f + e;
                do {
                    dVar.mo12496l(this.f4176a.mo12854h());
                } while (this.f4176a.f4129f < i2);
            } else if (i == 5) {
                do {
                    dVar.mo12496l(this.f4176a.mo12854h());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else {
                int i3 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i4 = this.f4177b & 7;
            if (i4 == 2) {
                int e2 = this.f4176a.mo12851e();
                m3938t(e2);
                int i5 = this.f4176a.f4129f + e2;
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12854h()));
                } while (this.f4176a.f4129f < i5);
            } else if (i4 == 5) {
                do {
                    list.add(Integer.valueOf(this.f4176a.mo12854h()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else {
                int i6 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: m */
    public final void mo12896m(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            int i = this.f4177b & 7;
            if (i == 1) {
                do {
                    rVar.mo12954l(this.f4176a.mo12855i());
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.mo12851e();
                m3939u(e);
                int i2 = this.f4176a.f4129f + e;
                do {
                    rVar.mo12954l(this.f4176a.mo12855i());
                } while (this.f4176a.f4129f < i2);
            } else {
                int i3 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i4 = this.f4177b & 7;
            if (i4 == 1) {
                do {
                    list.add(Long.valueOf(this.f4176a.mo12855i()));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i4 == 2) {
                int e2 = this.f4176a.mo12851e();
                m3939u(e2);
                int i5 = this.f4176a.f4129f + e2;
                do {
                    list.add(Long.valueOf(this.f4176a.mo12855i()));
                } while (this.f4176a.f4129f < i5);
            } else {
                int i6 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: n */
    public final void mo12897n(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    dVar.mo12496l(C2365nm.m3839n(this.f4176a.mo12851e()));
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    dVar.mo12496l(C2365nm.m3839n(this.f4176a.mo12851e()));
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(C2365nm.m3839n(this.f4176a.mo12851e())));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Integer.valueOf(C2365nm.m3839n(this.f4176a.mo12851e())));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: o */
    public final void mo12898o(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            int i = this.f4177b & 7;
            if (i == 0) {
                do {
                    rVar.mo12954l(C2365nm.m3840o(this.f4176a.mo12852f()));
                    if (!this.f4176a.mo12857k()) {
                        a2 = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a2 == this.f4177b);
                this.f4179d = a2;
            } else if (i == 2) {
                int e = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    rVar.mo12954l(C2365nm.m3840o(this.f4176a.mo12852f()));
                } while (this.f4176a.f4129f < e);
                mo12902s(e);
            } else {
                int i2 = C2246j.f3950g;
                throw new C2221i();
            }
        } else {
            int i3 = this.f4177b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(C2365nm.m3840o(this.f4176a.mo12852f())));
                    if (!this.f4176a.mo12857k()) {
                        a = this.f4176a.mo12847a();
                    } else {
                        return;
                    }
                } while (a == this.f4177b);
                this.f4179d = a;
            } else if (i3 == 2) {
                int e2 = this.f4176a.f4129f + this.f4176a.mo12851e();
                do {
                    list.add(Long.valueOf(C2365nm.m3840o(this.f4176a.mo12852f())));
                } while (this.f4176a.f4129f < e2);
                mo12902s(e2);
            } else {
                int i4 = C2246j.f3950g;
                throw new C2221i();
            }
        }
    }

    /* renamed from: p */
    public final void mo12899p(int i) {
        if ((this.f4177b & 7) != i) {
            int i2 = C2246j.f3950g;
            throw new C2221i();
        }
    }

    /* renamed from: q */
    public final <T> T mo12900q(C2319m0<T> m0Var, C2605xm xmVar) {
        int e = this.f4176a.mo12851e();
        C2365nm nmVar = this.f4176a;
        if (nmVar.f4124a < 100) {
            int j = nmVar.mo12856j(e);
            T a = m0Var.mo12554a();
            this.f4176a.f4124a++;
            m0Var.mo12560g(a, this, xmVar);
            m0Var.mo12555b(a);
            this.f4176a.mo12848b(0);
            C2365nm nmVar2 = this.f4176a;
            nmVar2.f4124a--;
            nmVar2.f4131h = j;
            nmVar2.mo12860p();
            return a;
        }
        throw new C2246j("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: r */
    public final <T> T mo12901r(C2319m0<T> m0Var, C2605xm xmVar) {
        int i = this.f4178c;
        this.f4178c = ((this.f4177b >>> 3) << 3) | 4;
        try {
            T a = m0Var.mo12554a();
            m0Var.mo12560g(a, this, xmVar);
            m0Var.mo12555b(a);
            if (this.f4177b == this.f4178c) {
                return a;
            }
            throw C2246j.m3529f();
        } finally {
            this.f4178c = i;
        }
    }

    /* renamed from: s */
    public final void mo12902s(int i) {
        if (this.f4176a.f4129f != i) {
            throw C2246j.m3524a();
        }
    }

    /* renamed from: v */
    public final int mo12903v() {
        int i = this.f4179d;
        if (i != 0) {
            this.f4177b = i;
            this.f4179d = 0;
        } else {
            i = this.f4176a.mo12847a();
            this.f4177b = i;
        }
        return (i == 0 || i == this.f4178c) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i >>> 3;
    }

    /* renamed from: w */
    public final boolean mo12904w() {
        int i;
        if (this.f4176a.mo12857k() || (i = this.f4177b) == this.f4178c) {
            return false;
        }
        return this.f4176a.mo12849c(i);
    }

    /* renamed from: x */
    public final long mo12905x() {
        mo12899p(0);
        return this.f4176a.mo12852f();
    }

    /* renamed from: y */
    public final long mo12906y() {
        mo12899p(1);
        return this.f4176a.mo12855i();
    }

    /* renamed from: z */
    public final int mo12907z() {
        mo12899p(5);
        return this.f4176a.mo12854h();
    }
}
