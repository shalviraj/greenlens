package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.charset.Charset;

/* renamed from: b.l.a.c.e.i.i6 */
public final class C2822i6 implements C2714a7 {

    /* renamed from: b */
    public static final C2900o6 f4839b = new C2796g6();

    /* renamed from: a */
    public final C2900o6 f4840a;

    public C2822i6() {
        C2900o6 o6Var;
        C2900o6[] o6VarArr = new C2900o6[2];
        o6VarArr[0] = C2847k5.f4870a;
        try {
            o6Var = (C2900o6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            o6Var = f4839b;
        }
        o6VarArr[1] = o6Var;
        C2809h6 h6Var = new C2809h6(o6VarArr);
        Charset charset = C2990v5.f5088a;
        this.f4840a = h6Var;
    }
}
