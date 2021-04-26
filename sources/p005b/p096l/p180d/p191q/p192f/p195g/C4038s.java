package p005b.p096l.p180d.p191q.p192f.p195g;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.g.s */
public class C4038s implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ Map f7415a;

    /* renamed from: b */
    public final /* synthetic */ C4032q f7416b;

    public C4038s(C4032q qVar, Map map) {
        this.f7416b = qVar;
        this.f7415a = map;
    }

    public Object call() {
        BufferedWriter bufferedWriter;
        String f = this.f7416b.mo15539f();
        C4018j0 j0Var = new C4018j0(this.f7416b.mo15540g());
        Map map = this.f7415a;
        File a = j0Var.mo15528a(f);
        BufferedWriter bufferedWriter2 = null;
        try {
            String jSONObject = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), C4018j0.f7362b));
            try {
                bufferedWriter.write(jSONObject);
                bufferedWriter.flush();
            } catch (Exception e) {
                e = e;
            } catch (Throwable th) {
                th = th;
                C4004e.m7393a(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            bufferedWriter = null;
            try {
                if (C3982b.f7289a.mo15495a(6)) {
                    Log.e("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                }
                C4004e.m7393a(bufferedWriter, "Failed to close key/value metadata file.");
                return null;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                bufferedWriter = bufferedWriter2;
                C4004e.m7393a(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = bufferedWriter2;
            C4004e.m7393a(bufferedWriter, "Failed to close key/value metadata file.");
            throw th;
        }
        C4004e.m7393a(bufferedWriter, "Failed to close key/value metadata file.");
        return null;
    }
}
