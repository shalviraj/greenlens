package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.charset.Charset;

/* renamed from: b.l.a.c.e.e.u */
public final class C2510u implements C2343n0 {

    /* renamed from: b */
    public static final C2047b0 f4332b = new C2462s();

    /* renamed from: a */
    public final C2047b0 f4333a;

    public C2510u() {
        C2047b0 b0Var;
        C2047b0[] b0VarArr = new C2047b0[2];
        b0VarArr[0] = C2170fn.f3876a;
        try {
            b0Var = (C2047b0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            b0Var = f4332b;
        }
        b0VarArr[1] = b0Var;
        C2486t tVar = new C2486t(b0VarArr);
        Charset charset = C2196h.f3910a;
        this.f4333a = tVar;
    }
}
