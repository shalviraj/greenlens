package p005b.p096l.p164b.p165a.p173d.p174z;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* renamed from: b.l.b.a.d.z.a */
public final class C3750a {

    /* renamed from: a */
    public static final C3754d f6932a = new C3751b("-_.*", true);

    /* renamed from: b */
    public static final C3754d f6933b = new C3751b("-_.!~*'()@:$&,;=+", false);

    /* renamed from: c */
    public static final C3754d f6934c = new C3751b("-_.!~*'():$&,;=", false);

    /* renamed from: d */
    public static final C3754d f6935d = new C3751b("-_.!~*'()@:$,;/?:", false);

    static {
        new C3751b("-_.!~*'()@:$&,;=+/?", false);
    }

    /* renamed from: a */
    public static String m7057a(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
