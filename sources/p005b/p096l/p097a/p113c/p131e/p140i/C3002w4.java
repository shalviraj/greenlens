package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.logging.Logger;

/* renamed from: b.l.a.c.e.i.w4 */
public abstract class C3002w4 extends C2872m4 {

    /* renamed from: b */
    public static final Logger f5103b = Logger.getLogger(C3002w4.class.getName());

    /* renamed from: c */
    public static final boolean f5104c = C3005w7.f5115g;

    /* renamed from: a */
    public C3015x4 f5105a;

    public C3002w4() {
    }

    public /* synthetic */ C3002w4(C2963t4 t4Var) {
    }

    /* renamed from: a */
    public static int m5501a(C2937r4 r4Var) {
        int l = r4Var.mo13567l();
        return m5506u(l) + l;
    }

    /* renamed from: b */
    public static int m5502b(C2913p6 p6Var, C3043z6 z6Var) {
        C2807h4 h4Var = (C2807h4) p6Var;
        int g = h4Var.mo13372g();
        if (g == -1) {
            g = z6Var.mo13629c(h4Var);
            h4Var.mo13373h(g);
        }
        return m5506u(g) + g;
    }

    @Deprecated
    /* renamed from: c */
    public static int m5503c(int i, C2913p6 p6Var, C3043z6 z6Var) {
        int u = m5506u(i << 3);
        int i2 = u + u;
        C2807h4 h4Var = (C2807h4) p6Var;
        int g = h4Var.mo13372g();
        if (g == -1) {
            g = z6Var.mo13629c(h4Var);
            h4Var.mo13373h(g);
        }
        return i2 + g;
    }

    /* renamed from: s */
    public static int m5504s(int i) {
        return m5506u(i << 3);
    }

    /* renamed from: t */
    public static int m5505t(int i) {
        if (i >= 0) {
            return m5506u(i);
        }
        return 10;
    }

    /* renamed from: u */
    public static int m5506u(int i) {
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

    /* renamed from: v */
    public static int m5507v(long j) {
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

    /* renamed from: w */
    public static int m5508w(String str) {
        int i;
        try {
            i = C3044z7.m5739b(str);
        } catch (C3031y7 unused) {
            i = str.getBytes(C2990v5.f5088a).length;
        }
        return m5506u(i) + i;
    }

    /* renamed from: d */
    public abstract void mo13770d(int i, int i2);

    /* renamed from: e */
    public abstract void mo13771e(int i, int i2);

    /* renamed from: f */
    public abstract void mo13772f(int i, int i2);

    /* renamed from: g */
    public abstract void mo13773g(int i, int i2);

    /* renamed from: h */
    public abstract void mo13774h(int i, long j);

    /* renamed from: i */
    public abstract void mo13775i(int i, long j);

    /* renamed from: j */
    public abstract void mo13776j(int i, boolean z);

    /* renamed from: k */
    public abstract void mo13777k(int i, String str);

    /* renamed from: l */
    public abstract void mo13778l(int i, C2937r4 r4Var);

    /* renamed from: m */
    public abstract void mo13779m(byte b);

    /* renamed from: n */
    public abstract void mo13780n(int i);

    /* renamed from: o */
    public abstract void mo13781o(int i);

    /* renamed from: p */
    public abstract void mo13782p(int i);

    /* renamed from: q */
    public abstract void mo13783q(long j);

    /* renamed from: r */
    public abstract void mo13784r(long j);
}
