package p298d.p299a.p300a.p301a;

import java.lang.ref.WeakReference;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.w0 */
public final class C5974w0 {

    /* renamed from: a */
    public final WeakReference<ClassLoader> f11802a;

    /* renamed from: b */
    public final int f11803b;

    public C5974w0(ClassLoader classLoader) {
        C6888i.m12438e(classLoader, "classLoader");
        this.f11802a = new WeakReference<>(classLoader);
        this.f11803b = System.identityHashCode(classLoader);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5974w0) && ((ClassLoader) this.f11802a.get()) == ((ClassLoader) ((C5974w0) obj).f11802a.get());
    }

    public int hashCode() {
        return this.f11803b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r1 = this;
            java.lang.ref.WeakReference<java.lang.ClassLoader> r0 = r1.f11802a
            java.lang.Object r0 = r0.get()
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            java.lang.String r0 = "<null>"
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5974w0.toString():java.lang.String");
    }
}
