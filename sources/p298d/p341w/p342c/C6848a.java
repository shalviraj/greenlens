package p298d.p341w.p342c;

import p298d.p341w.C6845a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.w.c.a */
public class C6848a extends C6845a {
    /* renamed from: a */
    public void mo24182a(Throwable th, Throwable th2) {
        C6888i.m12438e(th, "cause");
        C6888i.m12438e(th2, "exception");
        th.addSuppressed(th2);
    }
}
