package p005b.p096l.p097a.p113c.p145h.p147b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: b.l.a.c.h.b.t3 */
public final class C3324t3 extends C3395z8 {
    public C3324t3(C3220j9 j9Var) {
        super(j9Var);
    }

    /* renamed from: j */
    public final boolean mo14178j() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo14591l() {
        mo14646i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f5638a.f5842a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @WorkerThread
    /* renamed from: m */
    public final HttpURLConnection mo14592m(URL url) {
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
