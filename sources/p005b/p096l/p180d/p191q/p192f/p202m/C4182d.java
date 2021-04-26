package p005b.p096l.p180d.p191q.p192f.p202m;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3427g;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4004e;
import p005b.p096l.p180d.p191q.p192f.p199j.C4165a;
import p005b.p096l.p180d.p191q.p192f.p199j.C4166b;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4192e;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4193f;
import p005b.p096l.p180d.p191q.p192f.p202m.p204k.C4194a;

/* renamed from: b.l.d.q.f.m.d */
public class C4182d implements C3427g<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C4183e f7757a;

    public C4182d(C4183e eVar) {
        this.f7757a = eVar;
    }

    @NonNull
    /* renamed from: a */
    public C3428h mo14700a(@Nullable Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void voidR = (Void) obj;
        C4183e eVar = this.f7757a;
        C4194a aVar = eVar.f7763f;
        C4193f fVar = eVar.f7759b;
        Objects.requireNonNull(aVar);
        FileWriter fileWriter2 = null;
        try {
            Map<String, String> c = aVar.mo15791c(fVar);
            C4166b bVar = aVar.f7784b;
            String str = aVar.f7783a;
            Objects.requireNonNull(bVar);
            C4165a aVar2 = new C4165a(str, c);
            aVar2.f7723c.put("User-Agent", "Crashlytics Android SDK/17.4.1");
            aVar2.f7723c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            aVar.mo15789a(aVar2, fVar);
            C3982b bVar2 = C3982b.f7289a;
            bVar2.mo15496b("Requesting settings from " + aVar.f7783a);
            bVar2.mo15499e("Settings query params were: " + c);
            jSONObject = aVar.mo15792d(aVar2.mo15769b());
        } catch (IOException e) {
            if (C3982b.f7289a.mo15495a(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            C4192e a = this.f7757a.f7760c.mo15786a(jSONObject);
            C4179a aVar3 = this.f7757a.f7762e;
            long j = a.f7773d;
            Objects.requireNonNull(aVar3);
            C3982b.f7289a.mo15499e("Writing settings to cache file...");
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter(aVar3.mo15780a());
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                fileWriter = null;
                try {
                    try {
                        if (C3982b.f7289a.mo15495a(6)) {
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        }
                        C4004e.m7393a(fileWriter, "Failed to close settings writer.");
                        this.f7757a.mo15785c(jSONObject, "Loaded settings: ");
                        C4183e eVar2 = this.f7757a;
                        String str2 = eVar2.f7759b.f7779f;
                        SharedPreferences.Editor edit = C4004e.m7400h(eVar2.f7758a).edit();
                        edit.putString("existing_instance_identifier", str2);
                        edit.apply();
                        this.f7757a.f7765h.set(a);
                        this.f7757a.f7766i.get().mo14702b(a.f7770a);
                        C3429i iVar = new C3429i();
                        iVar.mo14702b(a.f7770a);
                        this.f7757a.f7766i.set(iVar);
                        return C1960d.m2740P(null);
                    } catch (Throwable th) {
                        th = th;
                        C4004e.m7393a(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    fileWriter = fileWriter2;
                    C4004e.m7393a(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                C4004e.m7393a(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            C4004e.m7393a(fileWriter, "Failed to close settings writer.");
            this.f7757a.mo15785c(jSONObject, "Loaded settings: ");
            C4183e eVar22 = this.f7757a;
            String str22 = eVar22.f7759b.f7779f;
            SharedPreferences.Editor edit2 = C4004e.m7400h(eVar22.f7758a).edit();
            edit2.putString("existing_instance_identifier", str22);
            edit2.apply();
            this.f7757a.f7765h.set(a);
            this.f7757a.f7766i.get().mo14702b(a.f7770a);
            C3429i iVar2 = new C3429i();
            iVar2.mo14702b(a.f7770a);
            this.f7757a.f7766i.set(iVar2);
        }
        return C1960d.m2740P(null);
    }
}
