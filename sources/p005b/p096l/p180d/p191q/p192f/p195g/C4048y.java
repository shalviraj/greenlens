package p005b.p096l.p180d.p191q.p192f.p195g;

import java.io.File;
import java.io.IOException;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p200k.C4175h;

/* renamed from: b.l.d.q.f.g.y */
public class C4048y {

    /* renamed from: a */
    public final String f7439a;

    /* renamed from: b */
    public final C4175h f7440b;

    public C4048y(String str, C4175h hVar) {
        this.f7439a = str;
        this.f7440b = hVar;
    }

    /* renamed from: a */
    public boolean mo15552a() {
        try {
            return mo15553b().createNewFile();
        } catch (IOException e) {
            C3982b bVar = C3982b.f7289a;
            StringBuilder u = C0843a.m460u("Error creating marker: ");
            u.append(this.f7439a);
            bVar.mo15498d(u.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public final File mo15553b() {
        return new File(this.f7440b.mo15778a(), this.f7439a);
    }
}
