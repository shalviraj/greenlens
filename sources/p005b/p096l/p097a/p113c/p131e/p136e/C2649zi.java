package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import java.net.URLConnection;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.zi */
public final class C2649zi {

    /* renamed from: a */
    public final Context f4532a;

    /* renamed from: b */
    public C2166fj f4533b;

    /* renamed from: c */
    public final String f4534c;

    /* renamed from: d */
    public boolean f4535d = false;

    /* renamed from: e */
    public String f4536e;

    public C2649zi(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        this.f4532a = context.getApplicationContext();
        this.f4534c = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    /* renamed from: a */
    public final void mo13143a(URLConnection uRLConnection) {
        StringBuilder sb;
        String str;
        if (this.f4535d) {
            String str2 = this.f4534c;
            sb = new StringBuilder(String.valueOf(str2).length() + 19);
            sb.append(str2);
            str = "/FirebaseUI-Android";
        } else {
            String str3 = this.f4534c;
            sb = new StringBuilder(String.valueOf(str3).length() + 21);
            sb.append(str3);
            str = "/FirebaseCore-Android";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f4533b == null) {
            Context context = this.f4532a;
            this.f4533b = new C2166fj(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f4533b.f3868a);
        uRLConnection.setRequestProperty("X-Android-Cert", this.f4533b.f3869b);
        uRLConnection.setRequestProperty("Accept-Language", C1960d.m2791e1());
        uRLConnection.setRequestProperty("X-Client-Version", sb2);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f4536e);
        this.f4536e = null;
    }
}
