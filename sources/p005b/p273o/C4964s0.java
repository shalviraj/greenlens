package p005b.p273o;

import androidx.annotation.NonNull;
import com.segment.analytics.AnalyticsContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.s0 */
public class C4964s0 {
    @NonNull

    /* renamed from: a */
    public String f9577a;
    @NonNull

    /* renamed from: b */
    public HashMap<String, HashMap<String, String>> f9578b;
    @NonNull

    /* renamed from: c */
    public ArrayList<ArrayList<C4812d2>> f9579c;
    @NonNull

    /* renamed from: d */
    public Set<String> f9580d;

    /* renamed from: e */
    public C4834f1 f9581e = new C4834f1();

    /* renamed from: f */
    public double f9582f;

    /* renamed from: g */
    public boolean f9583g = false;

    /* renamed from: h */
    public boolean f9584h = false;

    /* renamed from: i */
    public boolean f9585i;

    /* renamed from: j */
    public Date f9586j;

    /* renamed from: k */
    public boolean f9587k;

    public C4964s0(@NonNull String str, @NonNull Set<String> set, boolean z, C4834f1 f1Var) {
        this.f9577a = str;
        this.f9580d = set;
        this.f9583g = z;
        this.f9581e = f1Var;
    }

    public C4964s0(JSONObject jSONObject) {
        this.f9577a = jSONObject.getString(AnalyticsContext.Device.DEVICE_ID_KEY);
        JSONObject jSONObject2 = jSONObject.getJSONObject("variants");
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject3.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        this.f9578b = hashMap;
        JSONArray jSONArray = jSONObject.getJSONArray("triggers");
        ArrayList<ArrayList<C4812d2>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C4812d2(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(arrayList2);
        }
        this.f9579c = arrayList;
        this.f9580d = new HashSet();
        Date date = null;
        try {
            String string = jSONObject.getString("end_time");
            if (!string.equals("null")) {
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(string);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        } catch (JSONException unused) {
        }
        this.f9586j = date;
        if (jSONObject.has("redisplay")) {
            this.f9581e = new C4834f1(jSONObject.getJSONObject("redisplay"));
        }
    }

    public C4964s0(boolean z) {
        this.f9587k = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4964s0.class != obj.getClass()) {
            return false;
        }
        return this.f9577a.equals(((C4964s0) obj).f9577a);
    }

    public int hashCode() {
        return this.f9577a.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSInAppMessage{messageId='");
        u.append(this.f9577a);
        u.append('\'');
        u.append(", variants=");
        u.append(this.f9578b);
        u.append(", triggers=");
        u.append(this.f9579c);
        u.append(", clickedClickIds=");
        u.append(this.f9580d);
        u.append(", redisplayStats=");
        u.append(this.f9581e);
        u.append(", displayDuration=");
        u.append(this.f9582f);
        u.append(", displayedInSession=");
        u.append(this.f9583g);
        u.append(", triggerChanged=");
        u.append(this.f9584h);
        u.append(", actionTaken=");
        u.append(this.f9585i);
        u.append(", isPreview=");
        u.append(this.f9587k);
        u.append(", endTime=");
        u.append(this.f9586j);
        u.append('}');
        return u.toString();
    }
}
