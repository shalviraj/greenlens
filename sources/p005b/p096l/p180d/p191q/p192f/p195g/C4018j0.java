package p005b.p096l.p180d.p191q.p192f.p195g;

import androidx.annotation.NonNull;
import java.io.File;
import java.nio.charset.Charset;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.d.q.f.g.j0 */
public class C4018j0 {

    /* renamed from: b */
    public static final Charset f7362b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f7363a;

    public C4018j0(File file) {
        this.f7363a = file;
    }

    @NonNull
    /* renamed from: a */
    public File mo15528a(String str) {
        return new File(this.f7363a, C0843a.m452m(str, "keys", ".meta"));
    }
}
