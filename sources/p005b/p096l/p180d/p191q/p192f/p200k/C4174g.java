package p005b.p096l.p180d.p191q.p192f.p200k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h;
import p005b.p096l.p180d.p191q.p192f.p202m.C4184f;

/* renamed from: b.l.d.q.f.k.g */
public class C4174g {

    /* renamed from: g */
    public static final Charset f7732g = Charset.forName("UTF-8");

    /* renamed from: h */
    public static final int f7733h = 15;

    /* renamed from: i */
    public static final C4163h f7734i = new C4163h();

    /* renamed from: j */
    public static final Comparator<? super File> f7735j = C4172e.f7730g;

    /* renamed from: k */
    public static final FilenameFilter f7736k = C4173f.f7731a;
    @NonNull

    /* renamed from: a */
    public final AtomicInteger f7737a = new AtomicInteger(0);
    @NonNull

    /* renamed from: b */
    public final File f7738b;
    @NonNull

    /* renamed from: c */
    public final File f7739c;
    @NonNull

    /* renamed from: d */
    public final File f7740d;
    @NonNull

    /* renamed from: e */
    public final File f7741e;
    @NonNull

    /* renamed from: f */
    public final C4184f f7742f;

    public C4174g(@NonNull File file, @NonNull C4184f fVar) {
        File file2 = new File(file, "report-persistence");
        this.f7738b = new File(file2, "sessions");
        this.f7739c = new File(file2, "priority-reports");
        this.f7740d = new File(file2, "reports");
        this.f7741e = new File(file2, "native-reports");
        this.f7742f = fVar;
    }

    @NonNull
    /* renamed from: a */
    public static List<File> m7704a(@NonNull List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> size : listArr) {
            i += size.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: b */
    public static List<File> m7705b(@NonNull File file) {
        return m7706d(file, (FileFilter) null);
    }

    @NonNull
    /* renamed from: d */
    public static List<File> m7706d(@NonNull File file, @Nullable FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    @NonNull
    /* renamed from: e */
    public static List<File> m7707e(@NonNull File file, @Nullable FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    @NonNull
    /* renamed from: g */
    public static File m7708g(@NonNull File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    @NonNull
    /* renamed from: h */
    public static String m7709h(@NonNull File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f7732g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    /* renamed from: i */
    public static void m7710i(@Nullable File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File i : file.listFiles()) {
                    m7710i(i);
                }
            }
            file.delete();
        }
    }

    /* renamed from: j */
    public static void m7711j(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f7732g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    @NonNull
    /* renamed from: c */
    public final List<File> mo15776c() {
        List[] listArr = {m7704a(m7705b(this.f7739c), m7705b(this.f7741e)), m7705b(this.f7740d)};
        for (int i = 0; i < 2; i++) {
            Collections.sort(listArr[i], f7735j);
        }
        return m7704a(listArr);
    }

    @NonNull
    /* renamed from: f */
    public final File mo15777f(@NonNull String str) {
        return new File(this.f7738b, str);
    }
}
