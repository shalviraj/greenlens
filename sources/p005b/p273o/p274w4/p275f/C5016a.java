package p005b.p273o.p274w4.p275f;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.w4.f.a */
public class C5016a {

    /* renamed from: a */
    public C5018b f9692a;

    /* renamed from: b */
    public C5019c f9693b;
    @Nullable

    /* renamed from: c */
    public JSONArray f9694c;

    /* renamed from: b.o.w4.f.a$a */
    public static class C5017a {

        /* renamed from: a */
        public JSONArray f9695a;

        /* renamed from: b */
        public C5019c f9696b;

        /* renamed from: c */
        public C5018b f9697c;
    }

    public C5016a() {
    }

    public C5016a(@NonNull C5017a aVar) {
        this.f9694c = aVar.f9695a;
        this.f9693b = aVar.f9696b;
        this.f9692a = aVar.f9697c;
    }

    /* renamed from: a */
    public C5016a mo16770a() {
        C5016a aVar = new C5016a();
        aVar.f9694c = this.f9694c;
        aVar.f9693b = this.f9693b;
        aVar.f9692a = this.f9692a;
        return aVar;
    }

    /* renamed from: b */
    public String mo16771b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("influence_channel", this.f9692a.f9701g);
        jSONObject.put("influence_type", this.f9693b.toString());
        JSONArray jSONArray = this.f9694c;
        jSONObject.put("influence_ids", jSONArray != null ? jSONArray.toString() : "");
        return jSONObject.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5016a.class != obj.getClass()) {
            return false;
        }
        C5016a aVar = (C5016a) obj;
        return this.f9692a == aVar.f9692a && this.f9693b == aVar.f9693b;
    }

    public int hashCode() {
        return this.f9693b.hashCode() + (this.f9692a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("SessionInfluence{influenceChannel=");
        u.append(this.f9692a);
        u.append(", influenceType=");
        u.append(this.f9693b);
        u.append(", ids=");
        u.append(this.f9694c);
        u.append('}');
        return u.toString();
    }

    public C5016a(@NonNull String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String string3 = jSONObject.getString("influence_ids");
        C5018b bVar = C5018b.NOTIFICATION;
        if (string != null && !string.isEmpty()) {
            C5018b[] values = C5018b.values();
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                C5018b bVar2 = values[i];
                if (bVar2.f9701g.equals(string)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        }
        this.f9692a = bVar;
        this.f9693b = C5019c.m9220d(string2);
        this.f9694c = string3.isEmpty() ? null : new JSONArray(string3);
    }
}
