package p005b.p096l.p097a.p113c.p131e.p140i;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

/* renamed from: b.l.a.c.e.i.b3 */
public final /* synthetic */ class C2724b3 implements C2710a3 {

    /* renamed from: a */
    public final C2752d3 f4638a;

    /* renamed from: b */
    public final String f4639b;

    public C2724b3(C2752d3 d3Var, String str) {
        this.f4638a = d3Var;
        this.f4639b = str;
    }

    /* renamed from: a */
    public final Object mo13218a() {
        String str;
        C2752d3 d3Var = this.f4638a;
        String str2 = this.f4639b;
        ContentResolver contentResolver = d3Var.f4684a.getContentResolver();
        Uri uri = C2974u2.f5054a;
        synchronized (C2974u2.class) {
            if (C2974u2.f5059f == null) {
                C2974u2.f5058e.set(false);
                C2974u2.f5059f = new HashMap<>();
                C2974u2.f5064k = new Object();
                contentResolver.registerContentObserver(C2974u2.f5054a, true, new C2961t2());
            } else if (C2974u2.f5058e.getAndSet(false)) {
                C2974u2.f5059f.clear();
                C2974u2.f5060g.clear();
                C2974u2.f5061h.clear();
                C2974u2.f5062i.clear();
                C2974u2.f5063j.clear();
                C2974u2.f5064k = new Object();
            }
            Object obj = C2974u2.f5064k;
            str = null;
            if (C2974u2.f5059f.containsKey(str2)) {
                String str3 = C2974u2.f5059f.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = C2974u2.f5065l.length;
                Cursor query = contentResolver.query(C2974u2.f5054a, (String[]) null, (String) null, new String[]{str2}, (String) null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            C2974u2.m5354a(obj, str2, (String) null);
                        } else {
                            String string = query.getString(1);
                            if (string != null && string.equals((Object) null)) {
                                string = null;
                            }
                            C2974u2.m5354a(obj, str2, string);
                            if (string != null) {
                                str = string;
                            }
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return str;
    }
}
