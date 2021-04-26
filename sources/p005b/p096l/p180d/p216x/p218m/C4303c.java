package p005b.p096l.p180d.p216x.p218m;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.C3825d;

/* renamed from: b.l.d.x.m.c */
public class C4303c {

    /* renamed from: a */
    public final File f7988a;
    @NonNull

    /* renamed from: b */
    public final C3825d f7989b;

    /* renamed from: b.l.d.x.m.c$a */
    public enum C4304a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C4303c(@NonNull C3825d dVar) {
        dVar.mo15344a();
        File filesDir = dVar.f7042a.getFilesDir();
        StringBuilder u = C0843a.m460u("PersistedInstallation.");
        u.append(dVar.mo15345e());
        u.append(".json");
        this.f7988a = new File(filesDir, u.toString());
        this.f7989b = dVar;
    }

    @NonNull
    /* renamed from: a */
    public C4305d mo15924a(@NonNull C4305d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo15910c());
            jSONObject.put("Status", dVar.mo15914f().ordinal());
            jSONObject.put("AuthToken", dVar.mo15908a());
            jSONObject.put("RefreshToken", dVar.mo15912e());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo15915g());
            jSONObject.put("ExpiresInSecs", dVar.mo15909b());
            jSONObject.put("FisError", dVar.mo15911d());
            C3825d dVar2 = this.f7989b;
            dVar2.mo15344a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", dVar2.f7042a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f7988a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    @androidx.annotation.NonNull
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p180d.p216x.p218m.C4305d mo15925b() {
        /*
            r14 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r5 = r14.f7988a     // Catch:{ IOException | JSONException -> 0x002d }
            r4.<init>(r5)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0011:
            int r5 = r4.read(r2, r3, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r4.close()     // Catch:{ IOException | JSONException -> 0x002d }
            goto L_0x0032
        L_0x0024:
            r0.write(r2, r3, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0011
        L_0x0028:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0032:
            r0 = 0
            java.lang.String r2 = "Fid"
            java.lang.String r2 = r1.optString(r2, r0)
            b.l.d.x.m.c$a r4 = p005b.p096l.p180d.p216x.p218m.C4303c.C4304a.ATTEMPT_MIGRATION
            java.lang.String r5 = "Status"
            int r3 = r1.optInt(r5, r3)
            java.lang.String r5 = "AuthToken"
            java.lang.String r5 = r1.optString(r5, r0)
            java.lang.String r6 = "RefreshToken"
            java.lang.String r6 = r1.optString(r6, r0)
            r7 = 0
            java.lang.String r9 = "TokenCreationEpochInSecs"
            long r9 = r1.optLong(r9, r7)
            java.lang.String r11 = "ExpiresInSecs"
            long r11 = r1.optLong(r11, r7)
            java.lang.String r13 = "FisError"
            java.lang.String r0 = r1.optString(r13, r0)
            int r1 = p005b.p096l.p180d.p216x.p218m.C4305d.f7996a
            b.l.d.x.m.a$b r1 = new b.l.d.x.m.a$b
            r1.<init>()
            r1.mo15922d(r7)
            r1.mo15920b(r4)
            r1.mo15921c(r7)
            r1.f7978a = r2
            b.l.d.x.m.c$a[] r2 = p005b.p096l.p180d.p216x.p218m.C4303c.C4304a.values()
            r2 = r2[r3]
            r1.mo15920b(r2)
            r1.f7980c = r5
            r1.f7981d = r6
            r1.mo15922d(r9)
            r1.mo15921c(r11)
            r1.f7984g = r0
            b.l.d.x.m.d r0 = r1.mo15919a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p216x.p218m.C4303c.mo15925b():b.l.d.x.m.d");
    }
}
