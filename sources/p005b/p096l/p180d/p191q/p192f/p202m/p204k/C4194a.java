package p005b.p096l.p180d.p191q.p192f.p202m.p204k;

import android.text.TextUtils;
import com.amplitude.api.DeviceInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C4012g0;
import p005b.p096l.p180d.p191q.p192f.p199j.C4165a;
import p005b.p096l.p180d.p191q.p192f.p199j.C4166b;
import p005b.p096l.p180d.p191q.p192f.p199j.C4167c;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4193f;

/* renamed from: b.l.d.q.f.m.k.a */
public class C4194a {

    /* renamed from: a */
    public final String f7783a;

    /* renamed from: b */
    public final C4166b f7784b;

    public C4194a(String str, C4166b bVar) {
        if (str != null) {
            this.f7784b = bVar;
            this.f7783a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    /* renamed from: a */
    public final C4165a mo15789a(C4165a aVar, C4193f fVar) {
        mo15790b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f7774a);
        mo15790b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", DeviceInfo.OS_NAME);
        mo15790b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "17.4.1");
        mo15790b(aVar, "Accept", "application/json");
        mo15790b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f7775b);
        mo15790b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f7776c);
        mo15790b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.f7777d);
        mo15790b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((C4012g0) fVar.f7778e).mo15522b());
        return aVar;
    }

    /* renamed from: b */
    public final void mo15790b(C4165a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f7723c.put(str, str2);
        }
    }

    /* renamed from: c */
    public final Map<String, String> mo15791c(C4193f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f7781h);
        hashMap.put("display_version", fVar.f7780g);
        hashMap.put("source", Integer.toString(fVar.f7782i));
        String str = fVar.f7779f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: d */
    public JSONObject mo15792d(C4167c cVar) {
        int i = cVar.f7724a;
        C3982b bVar = C3982b.f7289a;
        bVar.mo15499e("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str = cVar.f7725b;
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                C3982b bVar2 = C3982b.f7289a;
                StringBuilder u = C0843a.m460u("Failed to parse settings JSON from ");
                u.append(this.f7783a);
                bVar2.mo15501g(u.toString(), e);
                bVar2.mo15500f("Settings response " + str);
                return null;
            }
        } else {
            StringBuilder v = C0843a.m461v("Settings request failed; (status: ", i, ") from ");
            v.append(this.f7783a);
            bVar.mo15497c(v.toString());
            return null;
        }
    }
}
