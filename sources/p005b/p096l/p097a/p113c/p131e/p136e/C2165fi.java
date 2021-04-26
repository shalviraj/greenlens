package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.fi */
public final class C2165fi extends AsyncTask<Void, Void, C2140ei> {

    /* renamed from: f */
    public static final C1955a f3862f = new C1955a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a */
    public final String f3863a;

    /* renamed from: b */
    public final String f3864b;

    /* renamed from: c */
    public final WeakReference<C2190gi> f3865c;

    /* renamed from: d */
    public final Uri.Builder f3866d;

    /* renamed from: e */
    public final String f3867e;

    public C2165fi(String str, String str2, Intent intent, C2190gi giVar) {
        C0823f.m376j(str);
        this.f3863a = str;
        C0823f.m376j(str2);
        Objects.requireNonNull(intent, "null reference");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        C0823f.m376j(stringExtra);
        Uri.Builder buildUpon = Uri.parse(giVar.mo12682j(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        Objects.requireNonNull(str2, "null reference");
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f3864b = buildUpon.build().toString();
        this.f3865c = new WeakReference<>(giVar);
        this.f3866d = giVar.mo12684l(intent, str, str2);
        this.f3867e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* renamed from: a */
    public static byte[] m3375a(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* renamed from: b */
    public final void onPostExecute(C2140ei eiVar) {
        String str;
        Uri.Builder builder;
        C2190gi giVar = (C2190gi) this.f3865c.get();
        String str2 = null;
        if (eiVar != null) {
            str2 = eiVar.f3827a;
            str = eiVar.f3828b;
        } else {
            str = null;
        }
        if (giVar == null) {
            C1955a aVar = f3862f;
            Log.e(aVar.f3501a, aVar.mo12284c("An error has occurred: the handler reference has returned null.", new Object[0]));
        } else if (TextUtils.isEmpty(str2) || (builder = this.f3866d) == null) {
            giVar.mo12686n(this.f3863a, C1960d.m2768Y0(str));
        } else {
            builder.authority(str2);
            giVar.mo12683k(this.f3866d.build(), this.f3863a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = f3862f;
        r1 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r1.length() + 75);
        r5.append("Error parsing error message from response body in getErrorMessageFromBody. ");
        r5.append(r1);
        r3.mo12286e(r5.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0105, code lost:
        r2 = f3862f;
        r1 = java.lang.String.valueOf(r1);
        r2.mo12283b(p005b.p035e.p036a.p037a.C0843a.m455p(new java.lang.StringBuilder(r1.length() + 33), "ConversionException encountered: ", r1), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0122, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0123, code lost:
        r2 = f3862f;
        r1 = java.lang.String.valueOf(r1);
        r2.mo12283b(p005b.p035e.p036a.p037a.C0843a.m455p(new java.lang.StringBuilder(r1.length() + 26), "Null pointer encountered: ", r1), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5 A[Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0104 A[ExcHandler: qg (r1v6 'e' b.l.a.c.e.e.qg A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0122 A[ExcHandler: NullPointerException (r1v3 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.Void[] r7 = (java.lang.Void[]) r7
            java.lang.String r7 = r6.f3867e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0016
            java.lang.String r7 = r6.f3867e
            b.l.a.c.e.e.ei r0 = new b.l.a.c.e.e.ei
            r0.<init>()
            r0.f3827a = r7
            goto L_0x015d
        L_0x0016:
            r7 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r2 = r6.f3864b     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.ref.WeakReference<b.l.a.c.e.e.gi> r2 = r6.f3865c     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            b.l.a.c.e.e.gi r2 = (p005b.p096l.p097a.p113c.p131e.p136e.C2190gi) r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.net.HttpURLConnection r1 = r2.mo12685m(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=UTF-8"
            r1.addRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            b.l.a.c.e.e.zi r3 = new b.l.a.c.e.e.zi     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            android.content.Context r2 = r2.mo12681i()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            b.l.a.c.e.e.xi r4 = new b.l.a.c.e.e.xi     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2601xi.m4403b()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r4 = r4.mo13113a()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3.mo13143a(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 == r3) goto L_0x00c4
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, qg -> 0x0104 }
            r5 = 400(0x190, float:5.6E-43)
            if (r3 < r5) goto L_0x00a0
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, qg -> 0x0104 }
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            goto L_0x00a1
        L_0x006b:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, qg -> 0x0104 }
            byte[] r1 = m3375a(r1, r4)     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = p005b.p096l.p097a.p113c.p131e.p136e.C2529ui.m4270a(r3, r1)     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, qg -> 0x0104 }
            goto L_0x00a1
        L_0x007d:
            r1 = move-exception
            b.l.a.c.b.n.a r3 = f3862f     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            int r4 = r1.length()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            int r4 = r4 + 75
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            r5.append(r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r5.append(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3.mo12286e(r1, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
        L_0x00a0:
            r1 = r0
        L_0x00a1:
            b.l.a.c.b.n.a r3 = f3862f     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r4[r7] = r1     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r4[r5] = r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3.mo12283b(r2, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            b.l.a.c.e.e.ei r2 = new b.l.a.c.e.e.ei     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r2.<init>()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r2.f3828b = r1     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r0 = r2
            goto L_0x015d
        L_0x00c4:
            b.l.a.c.e.e.mk r2 = new b.l.a.c.e.e.mk     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r2.<init>()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            byte[] r1 = m3375a(r1, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r2.mo12819a(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.util.List<java.lang.String> r1 = r2.f4086g     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
        L_0x00df:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            if (r2 == 0) goto L_0x015d
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            if (r3 != 0) goto L_0x00fb
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            if (r3 == 0) goto L_0x00df
        L_0x00fb:
            b.l.a.c.e.e.ei r1 = new b.l.a.c.e.e.ei     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r1.<init>()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r1.f3827a = r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, qg -> 0x0104 }
            r0 = r1
            goto L_0x015d
        L_0x0104:
            r1 = move-exception
            b.l.a.c.b.n.a r2 = f3862f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 33
            r4.<init>(r3)
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m455p(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo12283b(r1, r7)
            goto L_0x015d
        L_0x0122:
            r1 = move-exception
            b.l.a.c.b.n.a r2 = f3862f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 26
            r4.<init>(r3)
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m455p(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo12283b(r1, r7)
            goto L_0x015d
        L_0x0140:
            r1 = move-exception
            b.l.a.c.b.n.a r2 = f3862f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 22
            r4.<init>(r3)
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m455p(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo12283b(r1, r7)
        L_0x015d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2165fi.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        C2140ei eiVar = (C2140ei) obj;
        onPostExecute((C2140ei) null);
    }
}
