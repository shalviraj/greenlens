package p005b.p096l.p180d.p191q.p192f.p202m;

import android.content.Context;
import java.io.File;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.m.a */
public class C4179a {

    /* renamed from: a */
    public final Context f7752a;

    public C4179a(Context context) {
        this.f7752a = context;
    }

    /* renamed from: a */
    public final File mo15780a() {
        File file = new File(this.f7752a.getFilesDir(), ".com.google.firebase.crashlytics");
        if (!file.exists() && !file.mkdirs()) {
            C3982b.f7289a.mo15500f("Couldn't create file");
            file = null;
        }
        return new File(file, "com.crashlytics.settings.json");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057 A[Catch:{ all -> 0x0060 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo15781b() {
        /*
            r8 = this;
            java.lang.String r0 = "Error while closing settings cache file."
            b.l.d.q.f.b r1 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a
            java.lang.String r2 = "Checking for cached settings..."
            r1.mo15496b(r2)
            r2 = 0
            java.io.File r3 = r8.mo15780a()     // Catch:{ Exception -> 0x004a, all -> 0x0045 }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x004a, all -> 0x0045 }
            if (r4 == 0) goto L_0x003a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004a, all -> 0x0045 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x004a, all -> 0x0045 }
            java.util.Scanner r3 = new java.util.Scanner     // Catch:{ Exception -> 0x002f }
            r3.<init>(r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = "\\A"
            java.util.Scanner r3 = r3.useDelimiter(r4)     // Catch:{ Exception -> 0x002f }
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x002f }
            if (r4 == 0) goto L_0x0031
            java.lang.String r3 = r3.next()     // Catch:{ Exception -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            goto L_0x004c
        L_0x0031:
            java.lang.String r3 = ""
        L_0x0033:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x002f }
            r4.<init>(r3)     // Catch:{ Exception -> 0x002f }
            r2 = r1
            goto L_0x0040
        L_0x003a:
            java.lang.String r3 = "Settings file does not exist."
            r1.mo15499e(r3)     // Catch:{ Exception -> 0x004a, all -> 0x0045 }
            r4 = r2
        L_0x0040:
            p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7393a(r2, r0)
            r2 = r4
            goto L_0x005f
        L_0x0045:
            r1 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x0061
        L_0x004a:
            r3 = move-exception
            r1 = r2
        L_0x004c:
            b.l.d.q.f.b r4 = p005b.p096l.p180d.p191q.p192f.C3982b.f7289a     // Catch:{ all -> 0x0060 }
            java.lang.String r5 = "Failed to fetch cached settings"
            r6 = 6
            boolean r4 = r4.mo15495a(r6)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = "FirebaseCrashlytics"
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x0060 }
        L_0x005c:
            p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7393a(r1, r0)
        L_0x005f:
            return r2
        L_0x0060:
            r2 = move-exception
        L_0x0061:
            p005b.p096l.p180d.p191q.p192f.p195g.C4004e.m7393a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p202m.C4179a.mo15781b():org.json.JSONObject");
    }
}
