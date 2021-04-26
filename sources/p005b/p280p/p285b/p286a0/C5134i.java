package p005b.p280p.p285b.p286a0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p005b.p280p.p285b.C5245o;
import p435n.C8030a0;
import p435n.C8034b0;
import p435n.C8040e;

/* renamed from: b.p.b.a0.i */
public final class C5134i {

    /* renamed from: a */
    public static final byte[] f9953a = new byte[0];

    /* renamed from: b */
    public static final String[] f9954b = new String[0];

    /* renamed from: c */
    public static final Charset f9955c = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m9456a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public static void m9457b(Closeable closeable, Closeable closeable2) {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw th;
            } else {
                throw new AssertionError(th);
            }
        }
    }

    /* renamed from: c */
    public static void m9458c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m9459d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m9466k(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m9460e(C8030a0 a0Var, int i, TimeUnit timeUnit) {
        try {
            return m9467l(a0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m9461f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    public static String m9462g(C5245o oVar) {
        if (oVar.f10424e == C5245o.m9720d(oVar.f10420a)) {
            return oVar.f10423d;
        }
        return oVar.f10423d + ":" + oVar.f10424e;
    }

    /* renamed from: h */
    public static <T> List<T> m9463h(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: i */
    public static <T> List<T> m9464i(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: j */
    public static <T> T[] m9465j(Class<T> cls, T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }

    /* renamed from: k */
    public static boolean m9466k(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: l */
    public static boolean m9467l(C8030a0 a0Var, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = a0Var.mo17035f().mo25877e() ? a0Var.mo17035f().mo25875c() - nanoTime : Long.MAX_VALUE;
        a0Var.mo17035f().mo25876d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C8040e eVar = new C8040e();
            while (a0Var.mo17031T(eVar, 2048) != -1) {
                eVar.skip(eVar.f16140h);
            }
            int i2 = (c > RecyclerView.FOREVER_NS ? 1 : (c == RecyclerView.FOREVER_NS ? 0 : -1));
            C8034b0 f = a0Var.mo17035f();
            if (i2 == 0) {
                f.mo25873a();
            } else {
                f.mo25876d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i3 = (c > RecyclerView.FOREVER_NS ? 1 : (c == RecyclerView.FOREVER_NS ? 0 : -1));
            C8034b0 f2 = a0Var.mo17035f();
            if (i3 == 0) {
                f2.mo25873a();
            } else {
                f2.mo25876d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            int i4 = (c > RecyclerView.FOREVER_NS ? 1 : (c == RecyclerView.FOREVER_NS ? 0 : -1));
            C8034b0 f3 = a0Var.mo17035f();
            if (i4 == 0) {
                f3.mo25873a();
            } else {
                f3.mo25876d(nanoTime + c);
            }
            throw th;
        }
    }
}
