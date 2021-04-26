package p005b.p096l.p232f.p258y;

import java.nio.charset.Charset;

/* renamed from: b.l.f.y.j */
public final class C4666j {

    /* renamed from: a */
    public static final String f8850a;

    /* renamed from: b */
    public static final boolean f8851b;

    static {
        String name = Charset.defaultCharset().name();
        f8850a = name;
        f8851b = "SJIS".equalsIgnoreCase(name) || "EUC_JP".equalsIgnoreCase(name);
    }
}
