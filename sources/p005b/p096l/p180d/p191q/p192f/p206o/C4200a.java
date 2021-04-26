package p005b.p096l.p180d.p191q.p192f.p206o;

import android.content.Context;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4004e;

/* renamed from: b.l.d.q.f.o.a */
public class C4200a {

    /* renamed from: a */
    public final Context f7792a;

    /* renamed from: b */
    public boolean f7793b = false;

    /* renamed from: c */
    public String f7794c;

    public C4200a(Context context) {
        this.f7792a = context;
    }

    /* renamed from: a */
    public String mo15794a() {
        String str;
        if (!this.f7793b) {
            Context context = this.f7792a;
            int g = C4004e.m7399g(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (g != 0) {
                str = context.getResources().getString(g);
                C3982b.f7289a.mo15499e("Unity Editor version is: " + str);
            } else {
                str = null;
            }
            this.f7794c = str;
            this.f7793b = true;
        }
        String str2 = this.f7794c;
        if (str2 != null) {
            return str2;
        }
        return null;
    }
}
