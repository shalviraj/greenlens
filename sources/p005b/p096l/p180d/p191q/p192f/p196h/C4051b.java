package p005b.p096l.p180d.p191q.p192f.p196h;

import android.content.Context;
import java.io.File;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4004e;
import p005b.p096l.p180d.p191q.p192f.p195g.C4043w;

/* renamed from: b.l.d.q.f.h.b */
public class C4051b {

    /* renamed from: d */
    public static final C4054c f7447d = new C4054c((C4052a) null);

    /* renamed from: a */
    public final Context f7448a;

    /* renamed from: b */
    public final C4053b f7449b;

    /* renamed from: c */
    public C4050a f7450c = f7447d;

    /* renamed from: b.l.d.q.f.h.b$b */
    public interface C4053b {
    }

    /* renamed from: b.l.d.q.f.h.b$c */
    public static final class C4054c implements C4050a {
        public C4054c(C4052a aVar) {
        }

        /* renamed from: a */
        public void mo15557a() {
        }

        /* renamed from: b */
        public String mo15558b() {
            return null;
        }

        /* renamed from: c */
        public void mo15559c(long j, String str) {
        }
    }

    public C4051b(Context context, C4053b bVar) {
        this.f7448a = context;
        this.f7449b = bVar;
        mo15560a((String) null);
    }

    /* renamed from: a */
    public final void mo15560a(String str) {
        this.f7450c.mo15557a();
        this.f7450c = f7447d;
        if (str != null) {
            if (!C4004e.m7396d(this.f7448a, "com.crashlytics.CollectCustomLogs", true)) {
                C3982b.f7289a.mo15496b("Preferences requested no custom logs. Aborting log file creation.");
                return;
            }
            String m = C0843a.m452m("crashlytics-userlog-", str, ".temp");
            C4043w.C4046c cVar = (C4043w.C4046c) this.f7449b;
            Objects.requireNonNull(cVar);
            File file = new File(cVar.f7437a.mo15778a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f7450c = new C4061e(new File(file, m), 65536);
        }
    }
}
