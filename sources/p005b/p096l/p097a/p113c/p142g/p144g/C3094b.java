package p005b.p096l.p097a.p113c.p142g.p144g;

import android.os.RemoteException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p139h.C2703g;

/* renamed from: b.l.a.c.g.g.b */
public final class C3094b {

    /* renamed from: a */
    public final C2703g f5223a;

    public C3094b(C2703g gVar) {
        Objects.requireNonNull(gVar, "null reference");
        this.f5223a = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3094b)) {
            return false;
        }
        try {
            return this.f5223a.mo13205P(((C3094b) obj).f5223a);
        } catch (RemoteException e) {
            throw new C3096d(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f5223a.mo13208h();
        } catch (RemoteException e) {
            throw new C3096d(e);
        }
    }
}
