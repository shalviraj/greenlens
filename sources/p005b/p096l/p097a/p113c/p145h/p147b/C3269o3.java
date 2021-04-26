package p005b.p096l.p097a.p113c.p145h.p147b;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: b.l.a.c.h.b.o3 */
public final class C3269o3 extends C3227k5 {

    /* renamed from: c */
    public char f5796c = 0;

    /* renamed from: d */
    public long f5797d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    public String f5798e;

    /* renamed from: f */
    public final C3247m3 f5799f = new C3247m3(this, 6, false, false);

    /* renamed from: g */
    public final C3247m3 f5800g = new C3247m3(this, 6, true, false);

    /* renamed from: h */
    public final C3247m3 f5801h = new C3247m3(this, 6, false, true);

    /* renamed from: i */
    public final C3247m3 f5802i = new C3247m3(this, 5, false, false);

    /* renamed from: j */
    public final C3247m3 f5803j = new C3247m3(this, 5, true, false);

    /* renamed from: k */
    public final C3247m3 f5804k = new C3247m3(this, 5, false, true);

    /* renamed from: l */
    public final C3247m3 f5805l = new C3247m3(this, 4, false, false);

    /* renamed from: m */
    public final C3247m3 f5806m = new C3247m3(this, 3, false, false);

    /* renamed from: n */
    public final C3247m3 f5807n = new C3247m3(this, 2, false, false);

    public C3269o3(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: t */
    public static Object m6253t(String str) {
        if (str == null) {
            return null;
        }
        return new C3258n3(str);
    }

    /* renamed from: w */
    public static String m6254w(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String x = m6255x(z, obj);
        String x2 = m6255x(z, obj2);
        String x3 = m6255x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(x)) {
            sb.append(str2);
            sb.append(x);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(str2);
            sb.append(x2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(str3);
            sb.append(x3);
        }
        return sb.toString();
    }

    /* renamed from: x */
    public static String m6255x(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String y = m6256y(C3281p4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m6256y(className).equals(y)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C3258n3) {
                return ((C3258n3) obj).f5766a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: y */
    public static String m6256y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: i */
    public final boolean mo14141i() {
        return false;
    }

    /* renamed from: o */
    public final C3247m3 mo14440o() {
        return this.f5799f;
    }

    /* renamed from: p */
    public final C3247m3 mo14441p() {
        return this.f5802i;
    }

    /* renamed from: q */
    public final C3247m3 mo14442q() {
        return this.f5804k;
    }

    /* renamed from: r */
    public final C3247m3 mo14443r() {
        return this.f5806m;
    }

    /* renamed from: s */
    public final C3247m3 mo14444s() {
        return this.f5807n;
    }

    /* renamed from: u */
    public final void mo14445u(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo14446v(), i)) {
            Log.println(i, mo14446v(), m6254w(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            Objects.requireNonNull(str, "null reference");
            C3248m4 m4Var = this.f5638a.f5851j;
            if (m4Var == null) {
                Log.println(6, mo14446v(), "Scheduler not set. Not logging error/warn");
            } else if (!m4Var.mo14376k()) {
                Log.println(6, mo14446v(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                m4Var.mo14420q(new C3236l3(this, i, str, obj, obj2, obj3));
            }
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: v */
    public final String mo14446v() {
        String str;
        synchronized (this) {
            if (this.f5798e == null) {
                C3281p4 p4Var = this.f5638a;
                String str2 = p4Var.f5845d;
                if (str2 != null) {
                    this.f5798e = str2;
                } else {
                    C3165ea eaVar = p4Var.f5848g.f5638a.f5847f;
                    this.f5798e = "FA";
                }
            }
            Objects.requireNonNull(this.f5798e, "null reference");
            str = this.f5798e;
        }
        return str;
    }
}
