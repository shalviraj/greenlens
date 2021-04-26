package p005b.p096l.p097a.p113c.p142g;

import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1765g;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p139h.C2700d;
import p005b.p096l.p097a.p113c.p142g.p143f.C3077a;
import p005b.p096l.p097a.p113c.p142g.p143f.C3088l;
import p005b.p096l.p097a.p113c.p142g.p143f.C3089m;
import p005b.p096l.p097a.p113c.p142g.p144g.C3096d;

/* renamed from: b.l.a.c.g.c */
public final class C3074c {

    /* renamed from: a */
    public static boolean f5217a = false;

    /* renamed from: a */
    public static synchronized int m5756a(Context context) {
        synchronized (C3074c.class) {
            C0823f.m380l(context, "Context is null");
            if (f5217a) {
                return 0;
            }
            try {
                C3089m a = C3088l.m5777a(context);
                try {
                    C3077a e = a.mo14043e();
                    Objects.requireNonNull(e, "null reference");
                    C1960d.f3516f = e;
                    C2700d i = a.mo14044i();
                    if (C1960d.f3517g == null) {
                        Objects.requireNonNull(i, "null reference");
                        C1960d.f3517g = i;
                    }
                    f5217a = true;
                    return 0;
                } catch (RemoteException e2) {
                    throw new C3096d(e2);
                }
            } catch (C1765g e3) {
                return e3.f3114g;
            }
        }
    }
}
