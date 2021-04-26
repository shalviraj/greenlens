package p005b.p096l.p097a.p113c.p131e.p140i;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: b.l.a.c.e.i.u2 */
public final class C2974u2 {

    /* renamed from: a */
    public static final Uri f5054a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f5055b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f5056c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f5057d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f5058e = new AtomicBoolean();

    /* renamed from: f */
    public static HashMap<String, String> f5059f;

    /* renamed from: g */
    public static final HashMap<String, Boolean> f5060g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Integer> f5061h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Long> f5062i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, Float> f5063j = new HashMap<>();

    /* renamed from: k */
    public static Object f5064k;

    /* renamed from: l */
    public static final String[] f5065l = new String[0];

    /* renamed from: a */
    public static void m5354a(Object obj, String str, String str2) {
        synchronized (C2974u2.class) {
            if (obj == f5064k) {
                f5059f.put(str, str2);
            }
        }
    }
}
