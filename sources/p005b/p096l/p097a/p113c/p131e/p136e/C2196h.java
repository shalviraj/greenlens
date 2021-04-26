package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: b.l.a.c.e.e.h */
public final class C2196h {

    /* renamed from: a */
    public static final Charset f3910a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f3911b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3911b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static int m3459a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static int m3460b(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: c */
    public static Object m3461c(Object obj, Object obj2) {
        C2044am m = ((C2072c0) obj).mo12450m();
        C2072c0 c0Var = (C2072c0) obj2;
        Objects.requireNonNull(m);
        C2195gn gnVar = (C2195gn) m;
        if (gnVar.f3907g.getClass().isInstance(c0Var)) {
            gnVar.mo12693d((C2071c) ((C2069bm) c0Var));
            return gnVar.mo12690b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
