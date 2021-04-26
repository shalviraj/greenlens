package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: b.l.a.c.h.b.u6 */
public final class C3338u6 extends C3227k5 {
    public C3338u6(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: i */
    public final boolean mo14141i() {
        return false;
    }

    @WorkerThread
    /* renamed from: o */
    public final HttpURLConnection mo14604o(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            C3166f fVar = this.f5638a.f5848g;
            httpURLConnection.setConnectTimeout(60000);
            C3166f fVar2 = this.f5638a.f5848g;
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
