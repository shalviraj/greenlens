package p005b.p096l.p180d.p191q.p192f.p193e;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p194f.C3993a;
import p005b.p096l.p180d.p191q.p192f.p195g.C4032q;
import p005b.p096l.p180d.p191q.p192f.p195g.C4035r;
import p005b.p096l.p180d.p191q.p192f.p195g.C4041u;
import p005b.p096l.p180d.p191q.p192f.p195g.C4043w;

/* renamed from: b.l.d.q.f.e.d */
public class C3990d implements C3988b, C3993a {
    @Nullable

    /* renamed from: a */
    public C4041u f7294a;

    @NonNull
    /* renamed from: c */
    public static String m7379c(@NonNull String str, @NonNull Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo15504a(@Nullable C4041u uVar) {
        this.f7294a = uVar;
        C3982b.f7289a.mo15496b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    /* renamed from: b */
    public void mo15503b(@NonNull String str, @NonNull Bundle bundle) {
        C4041u uVar = this.f7294a;
        if (uVar != null) {
            try {
                String str2 = "$A$:" + m7379c(str, bundle);
                C4043w wVar = uVar.f7419a;
                Objects.requireNonNull(wVar);
                long currentTimeMillis = System.currentTimeMillis() - wVar.f7424c;
                C4032q qVar = wVar.f7427f;
                qVar.f7392e.mo15518b(new C4035r(qVar, currentTimeMillis, str2));
            } catch (JSONException unused) {
                C3982b.f7289a.mo15500f("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
