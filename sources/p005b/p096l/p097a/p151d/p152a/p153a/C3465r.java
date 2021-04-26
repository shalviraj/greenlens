package p005b.p096l.p097a.p151d.p152a.p153a;

import android.content.Context;
import java.io.File;

/* renamed from: b.l.a.d.a.a.r */
public final class C3465r {

    /* renamed from: a */
    public final Context f6272a;

    public C3465r(Context context) {
        this.f6272a = context;
    }

    /* renamed from: a */
    public static long m6617a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File a : listFiles) {
                j += m6617a(a);
            }
        }
        return j;
    }
}
