package p005b.p096l.p164b.p165a.p169b;

import com.google.api.client.http.HttpTransport;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p164b.p165a.p173d.C3718d;
import p005b.p096l.p164b.p165a.p173d.C3734l;
import p005b.p096l.p164b.p165a.p173d.C3738p;
import p005b.p096l.p164b.p165a.p173d.C3746w;

/* renamed from: b.l.b.a.b.h */
public final class C3679h {

    /* renamed from: a */
    public InputStream f6784a;

    /* renamed from: b */
    public final String f6785b;

    /* renamed from: c */
    public final String f6786c;

    /* renamed from: d */
    public final C3676e f6787d;

    /* renamed from: e */
    public C3684l f6788e;

    /* renamed from: f */
    public final int f6789f;

    /* renamed from: g */
    public final String f6790g;

    /* renamed from: h */
    public final C3677f f6791h;

    /* renamed from: i */
    public int f6792i;

    /* renamed from: j */
    public boolean f6793j;

    /* renamed from: k */
    public boolean f6794k;

    public C3679h(C3677f fVar, C3684l lVar) {
        StringBuilder sb;
        this.f6791h = fVar;
        this.f6792i = fVar.f6769e;
        this.f6793j = fVar.f6770f;
        this.f6788e = lVar;
        this.f6785b = lVar.mo15005c();
        int j = lVar.mo15012j();
        boolean z = false;
        j = j < 0 ? 0 : j;
        this.f6789f = j;
        String i = lVar.mo15011i();
        this.f6790g = i;
        Logger logger = HttpTransport.f11410a;
        if (this.f6793j && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        C3676e eVar = null;
        if (z) {
            sb = C0843a.m460u("-------------- RESPONSE --------------");
            String str = C3746w.f6927a;
            sb.append(str);
            String k = lVar.mo15013k();
            if (k != null) {
                sb.append(k);
            } else {
                sb.append(j);
                if (i != null) {
                    sb.append(' ');
                    sb.append(i);
                }
            }
            sb.append(str);
        } else {
            sb = null;
        }
        fVar.f6767c.mo22133b(lVar, z ? sb : null);
        String e = lVar.mo15007e();
        e = e == null ? fVar.f6767c.mo22137h() : e;
        this.f6786c = e;
        if (e != null) {
            try {
                eVar = new C3676e(e);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f6787d = eVar;
        if (z) {
            logger.config(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo14993a() {
        mo14996d();
        this.f6788e.mo15003a();
    }

    /* renamed from: b */
    public InputStream mo14994b() {
        if (!this.f6794k) {
            C3738p b = this.f6788e.mo15004b();
            if (b != null) {
                try {
                    String str = this.f6785b;
                    if (str != null) {
                        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                        if ("gzip".equals(lowerCase) || "x-gzip".equals(lowerCase)) {
                            b = new C3673b(new GZIPInputStream(b));
                        }
                    }
                    Logger logger = HttpTransport.f11410a;
                    if (this.f6793j) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            b = new C3738p(b, logger, level, this.f6792i);
                        }
                    }
                    this.f6784a = b;
                } catch (EOFException unused) {
                    b.close();
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            }
            this.f6794k = true;
        }
        return this.f6784a;
    }

    /* renamed from: c */
    public Charset mo14995c() {
        C3676e eVar = this.f6787d;
        return (eVar == null || eVar.mo14985d() == null) ? C3718d.f6865b : this.f6787d.mo14985d();
    }

    /* renamed from: d */
    public void mo14996d() {
        InputStream b = mo14994b();
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: e */
    public boolean mo14997e() {
        int i = this.f6789f;
        return i >= 200 && i < 300;
    }

    /* renamed from: f */
    public String mo14998f() {
        InputStream b = mo14994b();
        if (b == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3734l.m7037a(b, byteArrayOutputStream, true);
        return byteArrayOutputStream.toString(mo14995c().name());
    }
}
