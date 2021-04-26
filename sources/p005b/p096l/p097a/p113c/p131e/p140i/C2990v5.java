package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: b.l.a.c.e.i.v5 */
public final class C2990v5 {

    /* renamed from: a */
    public static final Charset f5088a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f5089b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5089b = bArr;
        ByteBuffer.wrap(bArr);
        int i = 0 + 0;
    }

    /* renamed from: a */
    public static int m5404a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static int m5405b(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: c */
    public static Object m5406c(Object obj, Object obj2) {
        C2794g4 f = ((C2913p6) obj).mo13543f();
        C2913p6 p6Var = (C2913p6) obj2;
        Objects.requireNonNull(f);
        C2860l5 l5Var = (C2860l5) f;
        if (l5Var.f4884g.getClass().isInstance(p6Var)) {
            l5Var.mo13485h((C2899o5) ((C2807h4) p6Var));
            return l5Var.mo13489l();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
