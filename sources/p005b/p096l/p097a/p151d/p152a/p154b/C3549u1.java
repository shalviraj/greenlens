package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p005b.p096l.p097a.p151d.p152a.p159e.C3577b0;

/* renamed from: b.l.a.d.a.b.u1 */
public final class C3549u1 {

    /* renamed from: a */
    public static final Pattern f6577a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    public static List<File> m6761a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C3546t1.f6574a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C3495g0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C3558x1 d = new C3471a0(fileInputStream).mo14747d();
                    if (d.f6611a != null) {
                        File file5 = new File(file, d.f6611a);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new C3495g0(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new C3495g0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    C3577b0.f6643a.mo14880a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
