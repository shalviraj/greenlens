package p005b.p096l.p097a.p113c.p142g;

import android.os.RemoteException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p139h.C2703g;
import p005b.p096l.p097a.p113c.p142g.p143f.C3078b;
import p005b.p096l.p097a.p113c.p142g.p144g.C3094b;
import p005b.p096l.p097a.p113c.p142g.p144g.C3095c;
import p005b.p096l.p097a.p113c.p142g.p144g.C3096d;

/* renamed from: b.l.a.c.g.a */
public final class C3069a {

    /* renamed from: a */
    public final C3078b f5206a;

    /* renamed from: b */
    public C3076e f5207b;

    /* renamed from: b.l.a.c.g.a$a */
    public interface C3070a {
        /* renamed from: a */
        boolean mo10648a(C3094b bVar);
    }

    public C3069a(C3078b bVar) {
        Objects.requireNonNull(bVar, "null reference");
        this.f5206a = bVar;
    }

    /* renamed from: a */
    public final C3094b mo14029a(C3095c cVar) {
        try {
            C2703g a1 = this.f5206a.mo14035a1(cVar);
            if (a1 != null) {
                return new C3094b(a1);
            }
            return null;
        } catch (RemoteException e) {
            throw new C3096d(e);
        }
    }
}
