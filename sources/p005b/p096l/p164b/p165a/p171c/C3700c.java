package p005b.p096l.p164b.p165a.p171c;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import p005b.p096l.p164b.p165a.p171c.p172j.C3709b;
import p005b.p096l.p164b.p165a.p173d.C3718d;

/* renamed from: b.l.b.a.c.c */
public abstract class C3700c {
    /* renamed from: a */
    public abstract C3701d mo15024a(OutputStream outputStream, Charset charset);

    /* renamed from: b */
    public abstract C3703f mo15025b(InputStream inputStream, Charset charset);

    /* renamed from: c */
    public abstract C3703f mo15026c(Reader reader);

    /* renamed from: d */
    public abstract C3703f mo15027d(String str);

    /* renamed from: e */
    public final String mo15028e(Object obj, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3701d a = mo15024a(byteArrayOutputStream, C3718d.f6864a);
        if (z) {
            ((C3709b) a).f6847g.mo11466d();
        }
        a.mo15029d(false, obj);
        ((C3709b) a).f6847g.flush();
        return byteArrayOutputStream.toString("UTF-8");
    }
}
