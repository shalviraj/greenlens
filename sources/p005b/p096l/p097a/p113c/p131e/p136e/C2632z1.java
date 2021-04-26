package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import p005b.p096l.p097a.p113c.p131e.p136e.C2072c0;

/* renamed from: b.l.a.c.e.e.z1 */
public class C2632z1<PrimitiveT, KeyProtoT extends C2072c0> implements C2608y1<PrimitiveT> {

    /* renamed from: a */
    public final C2099d2<KeyProtoT> f4519a;

    /* renamed from: b */
    public final Class<PrimitiveT> f4520b;

    public C2632z1(C2099d2<KeyProtoT> d2Var, Class<PrimitiveT> cls) {
        if (d2Var.mo12512f().contains(cls) || Void.class.equals(cls)) {
            this.f4519a = d2Var;
            this.f4520b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{d2Var.toString(), cls.getName()}));
    }

    /* renamed from: a */
    public final PrimitiveT mo13129a(C2317lm lmVar) {
        try {
            return mo13132d(this.f4519a.mo12368c(lmVar));
        } catch (C2246j e) {
            String name = this.f4519a.f3704a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, b.l.a.c.e.e.c0] */
    /* renamed from: b */
    public final C2072c0 mo13130b(C2317lm lmVar) {
        try {
            C2049b2 g = this.f4519a.mo12370g();
            C2072c0 b = g.mo12423b(lmVar);
            g.mo12422a(b);
            return g.mo12424c(b);
        } catch (C2246j e) {
            String name = this.f4519a.mo12370g().f3622a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, b.l.a.c.e.e.c0] */
    /* renamed from: c */
    public final C2081c9 mo13131c(C2317lm lmVar) {
        try {
            C2049b2 g = this.f4519a.mo12370g();
            C2072c0 b = g.mo12423b(lmVar);
            g.mo12422a(b);
            ? c = g.mo12424c(b);
            C2639z8 v = C2081c9.m3127v();
            String a = this.f4519a.mo12366a();
            if (v.f3909i) {
                v.mo12689a();
                v.f3909i = false;
            }
            v.f3908h.zzb = a;
            C2317lm n = c.mo12441n();
            if (v.f3909i) {
                v.mo12689a();
                v.f3909i = false;
            }
            v.f3908h.zze = n;
            C2056b9 b2 = this.f4519a.mo12367b();
            if (v.f3909i) {
                v.mo12689a();
                v.f3909i = false;
            }
            C2081c9.m3126A(v.f3908h, b2);
            return (C2081c9) v.mo12691c();
        } catch (C2246j e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: d */
    public final PrimitiveT mo13132d(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f4520b)) {
            this.f4519a.mo12369d(keyprotot);
            return this.f4519a.mo12511e(keyprotot, this.f4520b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }
}
