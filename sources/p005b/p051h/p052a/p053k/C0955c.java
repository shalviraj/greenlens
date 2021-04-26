package p005b.p051h.p052a.p053k;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: b.h.a.k.c */
public final class C0955c {

    /* renamed from: a */
    public static final Charset f949a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m710a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m710a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
