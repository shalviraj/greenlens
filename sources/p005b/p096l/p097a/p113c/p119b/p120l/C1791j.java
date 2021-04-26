package p005b.p096l.p097a.p113c.p119b.p120l;

import p005b.p096l.p097a.p113c.p119b.C1758d;

/* renamed from: b.l.a.c.b.l.j */
public final class C1791j extends UnsupportedOperationException {

    /* renamed from: g */
    public final C1758d f3139g;

    public C1791j(C1758d dVar) {
        this.f3139g = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f3139g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
