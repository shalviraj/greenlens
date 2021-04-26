package p005b.p096l.p180d.p216x.p219n;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1957a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1961e;
import p005b.p096l.p180d.p181a0.C3822h;
import p005b.p096l.p180d.p212u.C4228f;
import p005b.p096l.p180d.p215w.C4284b;
import p005b.p096l.p180d.p216x.C4291f;
import p005b.p096l.p180d.p216x.p219n.C4307a;
import p005b.p096l.p180d.p216x.p219n.C4309b;
import p005b.p096l.p180d.p216x.p219n.C4313d;
import p005b.p096l.p180d.p216x.p219n.C4316f;

/* renamed from: b.l.d.x.n.c */
public class C4312c {

    /* renamed from: e */
    public static final Pattern f8008e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    public static final Charset f8009f = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Context f8010a;

    /* renamed from: b */
    public final C4284b<C3822h> f8011b;

    /* renamed from: c */
    public final C4284b<C4228f> f8012c;

    /* renamed from: d */
    public final C4315e f8013d = new C4315e();

    public C4312c(@NonNull Context context, @NonNull C4284b<C3822h> bVar, @NonNull C4284b<C4228f> bVar2) {
        this.f8010a = context;
        this.f8011b = bVar;
        this.f8012c = bVar2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7909b(java.net.HttpURLConnection r10, @androidx.annotation.Nullable java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto L_0x000c
            goto L_0x0050
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f8009f
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r4] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r1 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006a
            java.lang.String r11 = ""
            goto L_0x0070
        L_0x006a:
            java.lang.String r12 = ", "
            java.lang.String r11 = p005b.p035e.p036a.p037a.C0843a.m451l(r12, r11)
        L_0x0070:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p216x.p219n.C4312c.m7909b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public static long m7910d(String str) {
        C0823f.m362c(f8008e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: i */
    public static void m7911i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* renamed from: a */
    public final URL mo15944a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C4291f(e.getMessage(), C4291f.C4292a.UNAVAILABLE);
        }
    }

    /* renamed from: c */
    public final HttpURLConnection mo15945c(URL url, String str) {
        C4228f.C4229a a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f8010a.getPackageName());
            if (!(this.f8012c.get() == null || this.f8011b.get() == null || (a = this.f8012c.get().mo15810a("fire-installations-id")) == C4228f.C4229a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f8011b.get().mo15341a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.f7823g));
            }
            String str2 = null;
            try {
                Context context = this.f8010a;
                byte[] a2 = C1957a.m2688a(context, context.getPackageName());
                if (a2 == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f8010a.getPackageName());
                } else {
                    str2 = C1961e.m2877a(a2, false);
                }
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder u = C0843a.m460u("No such package: ");
                u.append(this.f8010a.getPackageName());
                Log.e("ContentValues", u.toString(), e);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C4291f("Firebase Installations Service is unavailable. Please try again later.", C4291f.C4292a.UNAVAILABLE);
        }
    }

    /* renamed from: e */
    public final C4313d mo15946e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8009f));
        C4316f.C4317a a = C4316f.m7925a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        C4316f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(AnalyticsContext.Device.DEVICE_TOKEN_KEY)) {
                        ((C4309b.C4311b) a).f8005a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo15943b(m7910d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                fVar = a.mo15942a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C4307a(str, str2, str3, fVar, C4313d.C4314a.OK, (C4307a.C4308a) null);
    }

    /* renamed from: f */
    public final C4316f mo15947f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f8009f));
        C4316f.C4317a a = C4316f.m7925a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AnalyticsContext.Device.DEVICE_TOKEN_KEY)) {
                ((C4309b.C4311b) a).f8005a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a.mo15943b(m7910d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        C4309b.C4311b bVar = (C4309b.C4311b) a;
        bVar.f8007c = C4316f.C4318b.OK;
        return bVar.mo15942a();
    }

    /* renamed from: g */
    public final void mo15948g(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.5");
            m7911i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: h */
    public final void mo15949h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.5");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m7911i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
