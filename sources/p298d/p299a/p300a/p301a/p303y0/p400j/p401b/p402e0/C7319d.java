package p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p402e0;

import java.io.InputStream;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.e0.d */
public final class C7319d {
    /* renamed from: a */
    public final InputStream mo24945a(String str) {
        C6888i.m12438e(str, "path");
        ClassLoader classLoader = C7319d.class.getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream(str);
        return resourceAsStream == null ? ClassLoader.getSystemResourceAsStream(str) : resourceAsStream;
    }
}
