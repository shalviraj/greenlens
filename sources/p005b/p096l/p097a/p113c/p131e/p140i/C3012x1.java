package p005b.p096l.p097a.p113c.p131e.p140i;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.amplitude.api.DeviceInfo;
import java.util.List;

/* renamed from: b.l.a.c.e.i.x1 */
public final class C3012x1 extends C2899o5<C3012x1, C2999w1> implements C2926q6 {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C3012x1 zzaa;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    private C2977u5<C2843k1> zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private C2723b2 zzS;
    private C2951s5 zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private boolean zzZ;
    private int zze;
    private int zzf;
    private int zzg;
    private C2977u5<C2908p1> zzh;
    private C2977u5<C2805h2> zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        C3012x1 x1Var = new C3012x1();
        zzaa = x1Var;
        C2899o5.m5029q(C3012x1.class, x1Var);
    }

    public C3012x1() {
        C3017x6<Object> x6Var = C3017x6.f5138j;
        this.zzh = x6Var;
        this.zzi = x6Var;
        this.zzG = x6Var;
        this.zzH = "";
        this.zzL = "";
        this.zzO = "";
        this.zzP = "";
        this.zzR = "";
        this.zzT = C2912p5.f4938j;
        this.zzW = "";
        this.zzX = "";
    }

    /* renamed from: C0 */
    public static C2999w1 m5557C0() {
        return (C2999w1) zzaa.mo13545m();
    }

    /* renamed from: E0 */
    public static /* synthetic */ void m5559E0(C3012x1 x1Var) {
        x1Var.zze |= 1;
        x1Var.zzg = 1;
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m5560F0(C3012x1 x1Var, int i, C2908p1 p1Var) {
        x1Var.mo13927T0();
        x1Var.zzh.set(i, p1Var);
    }

    /* renamed from: G0 */
    public static /* synthetic */ void m5561G0(C3012x1 x1Var, C2908p1 p1Var) {
        x1Var.mo13927T0();
        x1Var.zzh.add(p1Var);
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m5562H0(C3012x1 x1Var, Iterable iterable) {
        x1Var.mo13927T0();
        C2807h4.m4807i(iterable, x1Var.zzh);
    }

    /* renamed from: I0 */
    public static void m5563I0(C3012x1 x1Var) {
        x1Var.zzh = C3017x6.f5138j;
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m5564J0(C3012x1 x1Var, int i) {
        x1Var.mo13927T0();
        x1Var.zzh.remove(i);
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m5565K0(C3012x1 x1Var, int i, C2805h2 h2Var) {
        h2Var.getClass();
        x1Var.mo13928U0();
        x1Var.zzi.set(i, h2Var);
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m5566L0(C3012x1 x1Var, C2805h2 h2Var) {
        h2Var.getClass();
        x1Var.mo13928U0();
        x1Var.zzi.add(h2Var);
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m5567M0(C3012x1 x1Var, int i) {
        x1Var.mo13928U0();
        x1Var.zzi.remove(i);
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m5568N0(C3012x1 x1Var, long j) {
        x1Var.zze |= 2;
        x1Var.zzj = j;
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m5569O0(C3012x1 x1Var, long j) {
        x1Var.zze |= 4;
        x1Var.zzk = j;
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m5570P0(C3012x1 x1Var, long j) {
        x1Var.zze |= 8;
        x1Var.zzl = j;
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m5571Q0(C3012x1 x1Var, long j) {
        x1Var.zze |= 16;
        x1Var.zzm = j;
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m5572R0(C3012x1 x1Var) {
        x1Var.zze &= -17;
        x1Var.zzm = 0;
    }

    /* renamed from: T */
    public static /* synthetic */ void m5573T(C3012x1 x1Var, long j) {
        x1Var.zze |= 32;
        x1Var.zzn = j;
    }

    /* renamed from: U */
    public static /* synthetic */ void m5574U(C3012x1 x1Var) {
        x1Var.zze &= -33;
        x1Var.zzn = 0;
    }

    /* renamed from: V */
    public static /* synthetic */ void m5575V(C3012x1 x1Var) {
        x1Var.zze |= 64;
        x1Var.zzo = DeviceInfo.OS_NAME;
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m5576V0(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 16777216;
        x1Var.zzH = str;
    }

    /* renamed from: W */
    public static /* synthetic */ void m5577W(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 128;
        x1Var.zzp = str;
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m5578W0(C3012x1 x1Var, int i) {
        x1Var.zze |= 33554432;
        x1Var.zzI = i;
    }

    /* renamed from: X */
    public static /* synthetic */ void m5579X(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 256;
        x1Var.zzq = str;
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m5580X0(C3012x1 x1Var) {
        x1Var.zze &= -268435457;
        x1Var.zzL = zzaa.zzL;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m5581Y(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 512;
        x1Var.zzr = str;
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m5582Y0(C3012x1 x1Var, long j) {
        x1Var.zze |= 536870912;
        x1Var.zzM = j;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m5583Z(C3012x1 x1Var, int i) {
        x1Var.zze |= 1024;
        x1Var.zzs = i;
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m5584Z0(C3012x1 x1Var, long j) {
        x1Var.zze |= BasicMeasure.EXACTLY;
        x1Var.zzN = j;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m5585a0(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 2048;
        x1Var.zzt = str;
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m5586a1(C3012x1 x1Var) {
        x1Var.zze &= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        x1Var.zzO = zzaa.zzO;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m5587b0(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 4096;
        x1Var.zzu = str;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m5588b1(C3012x1 x1Var, int i) {
        x1Var.zzf |= 2;
        x1Var.zzQ = i;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m5589c0(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 8192;
        x1Var.zzv = str;
    }

    /* renamed from: c1 */
    public static /* synthetic */ void m5590c1(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zzf |= 4;
        x1Var.zzR = str;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m5591d0(C3012x1 x1Var, long j) {
        x1Var.zze |= 16384;
        x1Var.zzw = j;
    }

    /* renamed from: d1 */
    public static void m5592d1(C3012x1 x1Var, Iterable iterable) {
        C2951s5 s5Var = x1Var.zzT;
        if (!((C2820i4) s5Var).f4835g) {
            C2912p5 p5Var = (C2912p5) s5Var;
            int i = p5Var.f4940i;
            x1Var.zzT = p5Var.mo13230h(i == 0 ? 10 : i + i);
        }
        C2807h4.m4807i(iterable, x1Var.zzT);
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m5593e0(C3012x1 x1Var) {
        x1Var.zze |= 32768;
        x1Var.zzx = 39065;
    }

    /* renamed from: e1 */
    public static /* synthetic */ void m5594e1(C3012x1 x1Var, long j) {
        x1Var.zzf |= 16;
        x1Var.zzU = j;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m5595f0(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 65536;
        x1Var.zzy = str;
    }

    /* renamed from: f1 */
    public static /* synthetic */ void m5596f1(C3012x1 x1Var, long j) {
        x1Var.zzf |= 32;
        x1Var.zzV = j;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m5597g0(C3012x1 x1Var) {
        x1Var.zze &= -65537;
        x1Var.zzy = zzaa.zzy;
    }

    /* renamed from: g1 */
    public static /* synthetic */ void m5598g1(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zzf |= 64;
        x1Var.zzW = str;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m5599h0(C3012x1 x1Var, boolean z) {
        x1Var.zze |= 131072;
        x1Var.zzz = z;
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m5600h1(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zzf |= 128;
        x1Var.zzX = str;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m5601i0(C3012x1 x1Var) {
        x1Var.zze &= -131073;
        x1Var.zzz = false;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m5602j0(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 262144;
        x1Var.zzA = str;
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m5603k0(C3012x1 x1Var) {
        x1Var.zze &= -262145;
        x1Var.zzA = zzaa.zzA;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m5604l0(C3012x1 x1Var, long j) {
        x1Var.zze |= 524288;
        x1Var.zzB = j;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m5605m0(C3012x1 x1Var, int i) {
        x1Var.zze |= 1048576;
        x1Var.zzC = i;
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m5606n0(C3012x1 x1Var, String str) {
        x1Var.zze |= 2097152;
        x1Var.zzD = str;
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m5607o0(C3012x1 x1Var) {
        x1Var.zze &= -2097153;
        x1Var.zzD = zzaa.zzD;
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m5608p0(C3012x1 x1Var, String str) {
        str.getClass();
        x1Var.zze |= 4194304;
        x1Var.zzE = str;
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m5609q0(C3012x1 x1Var, boolean z) {
        x1Var.zze |= 8388608;
        x1Var.zzF = z;
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m5610r0(C3012x1 x1Var, Iterable iterable) {
        C2977u5<C2843k1> u5Var = x1Var.zzG;
        if (!u5Var.mo13385a()) {
            x1Var.zzG = C2899o5.m5027l(u5Var);
        }
        C2807h4.m4807i(iterable, x1Var.zzG);
    }

    /* renamed from: s0 */
    public static void m5611s0(C3012x1 x1Var) {
        x1Var.zzG = C3017x6.f5138j;
    }

    /* renamed from: A */
    public final boolean mo13900A() {
        return this.zzz;
    }

    /* renamed from: A0 */
    public final boolean mo13901A0() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: A1 */
    public final String mo13902A1() {
        return this.zzq;
    }

    /* renamed from: B */
    public final String mo13903B() {
        return this.zzA;
    }

    /* renamed from: B0 */
    public final String mo13904B0() {
        return this.zzX;
    }

    /* renamed from: B1 */
    public final String mo13905B1() {
        return this.zzr;
    }

    /* renamed from: C */
    public final boolean mo13906C() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: C1 */
    public final boolean mo13907C1() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: D */
    public final long mo13908D() {
        return this.zzB;
    }

    /* renamed from: D1 */
    public final int mo13909D1() {
        return this.zzs;
    }

    /* renamed from: E */
    public final boolean mo13910E() {
        return (this.zze & 1048576) != 0;
    }

    /* renamed from: E1 */
    public final String mo13911E1() {
        return this.zzt;
    }

    /* renamed from: F */
    public final int mo13912F() {
        return this.zzC;
    }

    /* renamed from: G */
    public final String mo13913G() {
        return this.zzD;
    }

    /* renamed from: H */
    public final String mo13914H() {
        return this.zzE;
    }

    /* renamed from: I */
    public final boolean mo13915I() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: J */
    public final boolean mo13916J() {
        return this.zzF;
    }

    /* renamed from: K */
    public final List<C2843k1> mo13917K() {
        return this.zzG;
    }

    /* renamed from: L */
    public final String mo13918L() {
        return this.zzH;
    }

    /* renamed from: M */
    public final boolean mo13919M() {
        return (this.zze & 33554432) != 0;
    }

    /* renamed from: N */
    public final int mo13920N() {
        return this.zzI;
    }

    /* renamed from: O */
    public final boolean mo13921O() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: P */
    public final long mo13922P() {
        return this.zzM;
    }

    /* renamed from: Q */
    public final boolean mo13923Q() {
        return (this.zze & BasicMeasure.EXACTLY) != 0;
    }

    /* renamed from: R */
    public final long mo13924R() {
        return this.zzN;
    }

    /* renamed from: S */
    public final boolean mo13925S() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: S0 */
    public final int mo13926S0() {
        return this.zzg;
    }

    /* renamed from: T0 */
    public final void mo13927T0() {
        C2977u5<C2908p1> u5Var = this.zzh;
        if (!u5Var.mo13385a()) {
            this.zzh = C2899o5.m5027l(u5Var);
        }
    }

    /* renamed from: U0 */
    public final void mo13928U0() {
        C2977u5<C2805h2> u5Var = this.zzi;
        if (!u5Var.mo13385a()) {
            this.zzi = C2899o5.m5027l(u5Var);
        }
    }

    /* renamed from: i1 */
    public final List<C2908p1> mo13929i1() {
        return this.zzh;
    }

    /* renamed from: j1 */
    public final int mo13930j1() {
        return this.zzh.size();
    }

    /* renamed from: k1 */
    public final C2908p1 mo13931k1(int i) {
        return this.zzh.get(i);
    }

    /* renamed from: l1 */
    public final List<C2805h2> mo13932l1() {
        return this.zzi;
    }

    /* renamed from: m1 */
    public final int mo13933m1() {
        return this.zzi.size();
    }

    /* renamed from: n1 */
    public final C2805h2 mo13934n1(int i) {
        return this.zzi.get(i);
    }

    /* renamed from: o1 */
    public final boolean mo13935o1() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: p1 */
    public final long mo13936p1() {
        return this.zzj;
    }

    /* renamed from: q1 */
    public final boolean mo13937q1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzaa, "\u0001.\u0000\u0002\u00017.\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)", new Object[]{"zze", "zzf", "zzg", "zzh", C2908p1.class, "zzi", C2805h2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", C2843k1.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", C2804h1.f4759a, "zzZ"});
        } else if (i2 == 3) {
            return new C3012x1();
        } else {
            if (i2 == 4) {
                return new C2999w1((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzaa;
        }
    }

    /* renamed from: r1 */
    public final long mo13938r1() {
        return this.zzk;
    }

    /* renamed from: s */
    public final String mo13939s() {
        return this.zzu;
    }

    /* renamed from: s1 */
    public final boolean mo13940s1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: t */
    public final String mo13941t() {
        return this.zzv;
    }

    /* renamed from: t0 */
    public final String mo13942t0() {
        return this.zzO;
    }

    /* renamed from: t1 */
    public final long mo13943t1() {
        return this.zzl;
    }

    /* renamed from: u */
    public final boolean mo13944u() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: u0 */
    public final boolean mo13945u0() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: u1 */
    public final boolean mo13946u1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: v */
    public final long mo13947v() {
        return this.zzw;
    }

    /* renamed from: v0 */
    public final int mo13948v0() {
        return this.zzQ;
    }

    /* renamed from: v1 */
    public final long mo13949v1() {
        return this.zzm;
    }

    /* renamed from: w */
    public final boolean mo13950w() {
        return (this.zze & 32768) != 0;
    }

    /* renamed from: w0 */
    public final String mo13951w0() {
        return this.zzR;
    }

    /* renamed from: w1 */
    public final boolean mo13952w1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: x */
    public final long mo13953x() {
        return this.zzx;
    }

    /* renamed from: x0 */
    public final boolean mo13954x0() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: x1 */
    public final long mo13955x1() {
        return this.zzn;
    }

    /* renamed from: y */
    public final String mo13956y() {
        return this.zzy;
    }

    /* renamed from: y0 */
    public final long mo13957y0() {
        return this.zzU;
    }

    /* renamed from: y1 */
    public final String mo13958y1() {
        return this.zzo;
    }

    /* renamed from: z */
    public final boolean mo13959z() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: z0 */
    public final String mo13960z0() {
        return this.zzW;
    }

    /* renamed from: z1 */
    public final String mo13961z1() {
        return this.zzp;
    }
}
