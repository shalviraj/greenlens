package p005b.p096l.p180d.p191q.p192f.p200k;

import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;

/* renamed from: b.l.d.q.f.k.b */
public final /* synthetic */ class C4169b implements FileFilter {

    /* renamed from: a */
    public final String f7727a;

    public C4169b(String str) {
        this.f7727a = str;
    }

    public boolean accept(File file) {
        String str = this.f7727a;
        Charset charset = C4174g.f7732g;
        return file.isDirectory() && !file.getName().equals(str);
    }
}
