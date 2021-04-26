package p005b.p273o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p273o.C4794c0;
import p005b.p273o.C4921n4;

/* renamed from: b.o.q3 */
public class C4947q3 {

    /* renamed from: a */
    public static HashMap<C4948a, C4921n4> f9540a = new HashMap<>();

    /* renamed from: b.o.q3$a */
    public enum C4948a {
        PUSH,
        EMAIL
    }

    /* renamed from: a */
    public static C4885j4 m9081a() {
        HashMap<C4948a, C4921n4> hashMap = f9540a;
        C4948a aVar = C4948a.EMAIL;
        if (!hashMap.containsKey(aVar) || f9540a.get(aVar) == null) {
            f9540a.put(aVar, new C4885j4());
        }
        return (C4885j4) f9540a.get(aVar);
    }

    /* renamed from: b */
    public static C4907m4 m9082b() {
        HashMap<C4948a, C4921n4> hashMap = f9540a;
        C4948a aVar = C4948a.PUSH;
        if (!hashMap.containsKey(aVar) || f9540a.get(aVar) == null) {
            f9540a.put(aVar, new C4907m4());
        }
        return (C4907m4) f9540a.get(aVar);
    }

    /* renamed from: c */
    public static String m9083c() {
        return m9082b().mo16660m();
    }

    /* renamed from: d */
    public static C4921n4.C4923b m9084d(boolean z) {
        C4921n4.C4923b bVar;
        JSONObject jSONObject;
        C4907m4 b = m9082b();
        Objects.requireNonNull(b);
        if (z) {
            String r = C4857i2.m8950r();
            String q = C4857i2.m8949q();
            C4805c3.m8813l("players/" + r + "?app_id=" + q, (String) null, (JSONObject) null, new C4898l4(b), 60000, "CACHE_KEY_GET_TAGS");
        }
        synchronized (b.f9493a) {
            boolean z2 = C4907m4.f9472l;
            C4999v g = b.f9503k.mo16598g();
            if (!g.f9670a.has("tags")) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject optJSONObject = g.f9670a.optJSONObject("tags");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        Object obj = optJSONObject.get(next);
                        if (!"".equals(obj)) {
                            jSONObject2.put(next, obj);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject = jSONObject2;
            }
            bVar = new C4921n4.C4923b(z2, jSONObject);
        }
        return bVar;
    }

    /* renamed from: e */
    public static void m9085e(C4794c0.C4798d dVar) {
        m9082b().mo16655A(dVar);
        m9081a().mo16655A(dVar);
    }

    /* renamed from: f */
    public static void m9086f(JSONObject jSONObject) {
        C4907m4 b = m9082b();
        Objects.requireNonNull(b);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", (String) null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", (String) null));
            b.mo16662o().mo16595d(jSONObject2, (Set<String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            C4853h4 o = b.mo16662o();
            Objects.requireNonNull(o);
            synchronized (C4853h4.f9323d) {
                JSONObject jSONObject4 = o.f9327b;
                C1960d.m2746R(jSONObject4, jSONObject3, jSONObject4, (Set<String>) null);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
