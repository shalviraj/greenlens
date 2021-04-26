package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b.l.a.c.e.e.tm */
public abstract class C2509tm extends C2194gm {

    /* renamed from: b */
    public static final Logger f4329b = Logger.getLogger(C2509tm.class.getName());

    /* renamed from: c */
    public static final boolean f4330c = C2272k1.f3997g;

    /* renamed from: a */
    public C2533um f4331a;

    public C2509tm() {
    }

    public /* synthetic */ C2509tm(C2413pm pmVar) {
    }

    /* renamed from: b */
    public static int m4203b(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: c */
    public static int m4204c(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: d */
    public static int m4205d(String str) {
        int i;
        try {
            i = C2344n1.m3789b(str);
        } catch (C2320m1 unused) {
            i = str.getBytes(C2196h.f3910a).length;
        }
        return m4203b(i) + i;
    }

    /* renamed from: e */
    public static int m4206e(C2317lm lmVar) {
        int l = lmVar.mo12755l();
        return m4203b(l) + l;
    }

    /* renamed from: f */
    public static int m4207f(C2072c0 c0Var, C2319m0 m0Var) {
        C2069bm bmVar = (C2069bm) c0Var;
        int b = bmVar.mo12439b();
        if (b == -1) {
            b = m0Var.mo12556c(bmVar);
            bmVar.mo12440c(b);
        }
        return m4203b(b) + b;
    }

    @Deprecated
    /* renamed from: h */
    public static int m4208h(int i, C2072c0 c0Var, C2319m0 m0Var) {
        int b = m4203b(i << 3);
        int i2 = b + b;
        C2069bm bmVar = (C2069bm) c0Var;
        int b2 = bmVar.mo12439b();
        if (b2 == -1) {
            b2 = m0Var.mo12556c(bmVar);
            bmVar.mo12440c(b2);
        }
        return i2 + b2;
    }

    /* renamed from: y */
    public static int m4209y(int i) {
        return m4203b(i << 3);
    }

    /* renamed from: z */
    public static int m4210z(int i) {
        if (i >= 0) {
            return m4203b(i);
        }
        return 10;
    }

    /* renamed from: g */
    public final void mo13020g(String str, C2320m1 m1Var) {
        f4329b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", m1Var);
        byte[] bytes = str.getBytes(C2196h.f3910a);
        try {
            int length = bytes.length;
            mo12945u(length);
            mo12688a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C2461rm(e);
        } catch (C2461rm e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    public abstract void mo12933i(int i, int i2);

    /* renamed from: j */
    public abstract void mo12934j(int i, int i2);

    /* renamed from: k */
    public abstract void mo12935k(int i, int i2);

    /* renamed from: l */
    public abstract void mo12936l(int i, int i2);

    /* renamed from: m */
    public abstract void mo12937m(int i, long j);

    /* renamed from: n */
    public abstract void mo12938n(int i, long j);

    /* renamed from: o */
    public abstract void mo12939o(int i, boolean z);

    /* renamed from: p */
    public abstract void mo12940p(int i, String str);

    /* renamed from: q */
    public abstract void mo12941q(int i, C2317lm lmVar);

    /* renamed from: r */
    public abstract void mo12942r(int i, C2072c0 c0Var, C2319m0 m0Var);

    /* renamed from: s */
    public abstract void mo12943s(byte b);

    /* renamed from: t */
    public abstract void mo12944t(int i);

    /* renamed from: u */
    public abstract void mo12945u(int i);

    /* renamed from: v */
    public abstract void mo12946v(int i);

    /* renamed from: w */
    public abstract void mo12947w(long j);

    /* renamed from: x */
    public abstract void mo12948x(long j);
}
