package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: b.l.a.c.e.e.i2 */
public final class C2224i2 {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<C2199h2> f3933a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C2199h2 m3492a(String str) {
        Iterator<C2199h2> it = f3933a.iterator();
        while (it.hasNext()) {
            C2199h2 next = it.next();
            if (next.mo12585d(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
