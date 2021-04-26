package p005b.p096l.p180d.p191q.p192f.p200k;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* renamed from: b.l.d.q.f.k.a */
public final /* synthetic */ class C4168a implements FilenameFilter {

    /* renamed from: a */
    public final String f7726a;

    public C4168a(String str) {
        this.f7726a = str;
    }

    public boolean accept(File file, String str) {
        String str2 = this.f7726a;
        Charset charset = C4174g.f7732g;
        return str.startsWith(str2);
    }
}
