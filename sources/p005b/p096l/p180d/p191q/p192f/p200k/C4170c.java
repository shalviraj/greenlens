package p005b.p096l.p180d.p191q.p192f.p200k;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* renamed from: b.l.d.q.f.k.c */
public final /* synthetic */ class C4170c implements FilenameFilter {

    /* renamed from: a */
    public static final C4170c f7728a = new C4170c();

    public boolean accept(File file, String str) {
        Charset charset = C4174g.f7732g;
        return str.startsWith("event") && !str.endsWith("_");
    }
}
