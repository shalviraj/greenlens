package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: b.l.a.d.a.b.a1 */
public final /* synthetic */ class C3472a1 implements FilenameFilter {

    /* renamed from: a */
    public final String f6301a;

    public C3472a1(String str) {
        this.f6301a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f6301a).concat("-")) && str.endsWith(".apk");
    }
}
