package p005b.p096l.p180d.p191q.p192f.p200k;

import android.content.Context;
import java.io.File;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.k.h */
public class C4175h {

    /* renamed from: a */
    public final Context f7743a;

    public C4175h(Context context) {
        this.f7743a = context;
    }

    /* renamed from: a */
    public File mo15778a() {
        File file = new File(this.f7743a.getFilesDir(), ".com.google.firebase.crashlytics");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        C3982b.f7289a.mo15500f("Couldn't create file");
        return null;
    }
}
