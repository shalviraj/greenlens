package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005b.p096l.p097a.p151d.p152a.p163i.C3636c;

/* renamed from: b.l.a.d.a.b.z1 */
public final /* synthetic */ class C3564z1 implements C3636c {

    /* renamed from: a */
    public final C3544t f6630a;

    public C3564z1(C3544t tVar) {
        this.f6630a = tVar;
    }

    /* renamed from: a */
    public final void mo10458a(Object obj) {
        C3544t tVar = this.f6630a;
        List list = (List) obj;
        int a = tVar.f6567b.mo14797a();
        Iterator it = ((ArrayList) tVar.mo14817d()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && C3544t.m6740c(file, true) != ((long) a)) {
                C3544t.m6741h(file);
            }
        }
    }
}
