package p005b.p280p.p285b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.C5134i;
import p435n.C8043g;

/* renamed from: b.p.b.x */
public abstract class C5263x implements Closeable {

    /* renamed from: g */
    public Reader f10516g;

    /* JADX INFO: finally extract failed */
    /* renamed from: H */
    public final String mo17208H() {
        long e = mo17098e();
        if (e <= 2147483647L) {
            C8043g z = mo17100z();
            try {
                byte[] A = z.mo25882A();
                C5134i.m9458c(z);
                if (e == -1 || e == ((long) A.length)) {
                    C5251q q = mo17099q();
                    return new String(A, (q != null ? q.mo17184a(C5134i.f9955c) : C5134i.f9955c).name());
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                C5134i.m9458c(z);
                throw th;
            }
        } else {
            throw new IOException(C0843a.m448i("Cannot buffer entire body for content length: ", e));
        }
    }

    public void close() {
        mo17100z().close();
    }

    /* renamed from: d */
    public final Reader mo17210d() {
        Reader reader = this.f10516g;
        if (reader == null) {
            InputStream k0 = mo17100z().mo25914k0();
            C5251q q = mo17099q();
            reader = new InputStreamReader(k0, q != null ? q.mo17184a(C5134i.f9955c) : C5134i.f9955c);
            this.f10516g = reader;
        }
        return reader;
    }

    /* renamed from: e */
    public abstract long mo17098e();

    /* renamed from: q */
    public abstract C5251q mo17099q();

    /* renamed from: z */
    public abstract C8043g mo17100z();
}
