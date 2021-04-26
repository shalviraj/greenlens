package p005b.p051h.p052a.p055m.p056u;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0966e;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1148g;
import p005b.p051h.p052a.p078s.C1371c;
import p005b.p051h.p052a.p078s.C1376f;

/* renamed from: b.h.a.m.u.j */
public class C0997j implements C0987d<InputStream> {
    @VisibleForTesting

    /* renamed from: l */
    public static final C0999b f1044l = new C0998a();

    /* renamed from: g */
    public final C1148g f1045g;

    /* renamed from: h */
    public final int f1046h;

    /* renamed from: i */
    public HttpURLConnection f1047i;

    /* renamed from: j */
    public InputStream f1048j;

    /* renamed from: k */
    public volatile boolean f1049k;

    /* renamed from: b.h.a.m.u.j$a */
    public static class C0998a implements C0999b {
    }

    /* renamed from: b.h.a.m.u.j$b */
    public interface C0999b {
    }

    public C0997j(C1148g gVar, int i) {
        this.f1045g = gVar;
        this.f1046h = i;
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo10839a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo10842b() {
        InputStream inputStream = this.f1048j;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f1047i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f1047i = null;
    }

    /* renamed from: c */
    public final InputStream mo10865c(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C0966e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f1047i = (HttpURLConnection) url.openConnection();
            for (Map.Entry next : map.entrySet()) {
                this.f1047i.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f1047i.setConnectTimeout(this.f1046h);
            this.f1047i.setReadTimeout(this.f1046h);
            boolean z = false;
            this.f1047i.setUseCaches(false);
            this.f1047i.setDoInput(true);
            this.f1047i.setInstanceFollowRedirects(false);
            this.f1047i.connect();
            this.f1048j = this.f1047i.getInputStream();
            if (this.f1049k) {
                return null;
            }
            int responseCode = this.f1047i.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.f1047i;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f1048j = new C1371c(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        StringBuilder u = C0843a.m460u("Got non empty content encoding: ");
                        u.append(httpURLConnection.getContentEncoding());
                        Log.d("HttpUrlFetcher", u.toString());
                    }
                    this.f1048j = httpURLConnection.getInputStream();
                }
                return this.f1048j;
            }
            if (i2 == 3) {
                z = true;
            }
            if (z) {
                String headerField = this.f1047i.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo10842b();
                    return mo10865c(url3, i + 1, url, map);
                }
                throw new C0966e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new C0966e(responseCode);
            } else {
                throw new C0966e(this.f1047i.getResponseMessage(), responseCode);
            }
        } else {
            throw new C0966e("Too many (> 5) redirects!");
        }
    }

    public void cancel() {
        this.f1049k = true;
    }

    @NonNull
    /* renamed from: e */
    public C0962a mo10846e() {
        return C0962a.REMOTE;
    }

    /* renamed from: f */
    public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super InputStream> aVar) {
        StringBuilder sb;
        int i = C1376f.f1793b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.mo10854d(mo10865c(this.f1045g.mo11041d(), 0, (URL) null, this.f1045g.f1385b.mo11043a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C1376f.m1460a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo10853c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder u = C0843a.m460u("Finished http url fetcher fetch in ");
                u.append(C1376f.m1460a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", u.toString());
            }
            throw th;
        }
    }
}
