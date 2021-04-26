package p005b.p273o;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.o.h4 */
public abstract class C4853h4 {

    /* renamed from: d */
    public static final Object f9323d = new Object();

    /* renamed from: e */
    public static final String[] f9324e;

    /* renamed from: f */
    public static final Set<String> f9325f;

    /* renamed from: a */
    public String f9326a;

    /* renamed from: b */
    public JSONObject f9327b;

    /* renamed from: c */
    public JSONObject f9328c;

    static {
        String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp", "ad_id"};
        f9324e = strArr;
        f9325f = new HashSet(Arrays.asList(strArr));
    }

    public C4853h4(String str, boolean z) {
        JSONObject jSONObject;
        boolean z2;
        this.f9326a = str;
        if (z) {
            String str2 = C4815d3.f9230a;
            StringBuilder u = C0843a.m460u("ONESIGNAL_USERSTATE_DEPENDVALYES_");
            u.append(this.f9326a);
            String f = C4815d3.m8831f(str2, u.toString(), (String) null);
            if (f == null) {
                JSONObject jSONObject2 = new JSONObject();
                synchronized (f9323d) {
                    this.f9327b = jSONObject2;
                }
                try {
                    int i = 1;
                    int c = C4815d3.m8828c(str2, this.f9326a.equals("CURRENT_STATE") ? "ONESIGNAL_SUBSCRIPTION" : "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                    if (c == -2) {
                        z2 = false;
                    } else {
                        i = c;
                        z2 = true;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("subscribableStatus", Integer.valueOf(i));
                    hashMap.put("userSubscribePref", Boolean.valueOf(z2));
                    mo16605n(this.f9327b, hashMap);
                } catch (JSONException unused) {
                }
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject(f);
                    synchronized (f9323d) {
                        this.f9327b = jSONObject3;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            String str3 = C4815d3.f9230a;
            StringBuilder u2 = C0843a.m460u("ONESIGNAL_USERSTATE_SYNCVALYES_");
            u2.append(this.f9326a);
            String f2 = C4815d3.m8831f(str3, u2.toString(), (String) null);
            if (f2 == null) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("identifier", C4815d3.m8831f(str3, "GT_REGISTRATION_ID", (String) null));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return;
                }
            } else {
                jSONObject = new JSONObject(f2);
            }
            synchronized (f9323d) {
                this.f9328c = jSONObject;
            }
            return;
        }
        this.f9327b = new JSONObject();
        this.f9328c = new JSONObject();
    }

    /* renamed from: c */
    public static JSONObject m8897c(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject R;
        synchronized (f9323d) {
            R = C1960d.m2746R(jSONObject, jSONObject2, jSONObject3, set);
        }
        return R;
    }

    /* renamed from: a */
    public abstract void mo16593a();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058 A[SYNTHETIC, Splitter:B:12:0x0058] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo16594b(p005b.p273o.C4853h4 r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "external_user_id_auth_hash"
            java.lang.String r1 = "email_auth_hash"
            java.lang.String r2 = "app_id"
            r10.mo16593a()
            r11.mo16593a()
            java.lang.String r3 = "loc_bg"
            java.lang.String r4 = "loc_time_stamp"
            r5 = 0
            org.json.JSONObject r6 = r10.f9327b     // Catch:{ all -> 0x0040 }
            long r6 = r6.optLong(r4)     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r8 = r11.f9327b     // Catch:{ all -> 0x0040 }
            long r8 = r8.getLong(r4)     // Catch:{ all -> 0x0040 }
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r7 = r11.f9327b     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r7.opt(r3)     // Catch:{ all -> 0x0040 }
            r6.put(r3, r7)     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r3 = r11.f9327b     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r3.opt(r4)     // Catch:{ all -> 0x0040 }
            r6.put(r4, r3)     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r3 = r11.f9328c     // Catch:{ all -> 0x0040 }
            r10.mo16605n(r3, r6)     // Catch:{ all -> 0x0040 }
            java.util.Set<java.lang.String> r3 = f9325f     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r3 = r5
        L_0x0041:
            org.json.JSONObject r4 = r10.f9328c
            org.json.JSONObject r11 = r11.f9328c
            org.json.JSONObject r11 = m8897c(r4, r11, r5, r3)
            if (r12 != 0) goto L_0x0058
            java.lang.String r12 = r11.toString()
            java.lang.String r3 = "{}"
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0058
            return r5
        L_0x0058:
            boolean r12 = r11.has(r2)     // Catch:{ JSONException -> 0x008a }
            if (r12 != 0) goto L_0x0067
            org.json.JSONObject r12 = r10.f9328c     // Catch:{ JSONException -> 0x008a }
            java.lang.String r12 = r12.optString(r2)     // Catch:{ JSONException -> 0x008a }
            r11.put(r2, r12)     // Catch:{ JSONException -> 0x008a }
        L_0x0067:
            org.json.JSONObject r12 = r10.f9328c     // Catch:{ JSONException -> 0x008a }
            boolean r12 = r12.has(r1)     // Catch:{ JSONException -> 0x008a }
            if (r12 == 0) goto L_0x0078
            org.json.JSONObject r12 = r10.f9328c     // Catch:{ JSONException -> 0x008a }
            java.lang.String r12 = r12.optString(r1)     // Catch:{ JSONException -> 0x008a }
            r11.put(r1, r12)     // Catch:{ JSONException -> 0x008a }
        L_0x0078:
            org.json.JSONObject r12 = r10.f9328c     // Catch:{ JSONException -> 0x008a }
            boolean r12 = r12.has(r0)     // Catch:{ JSONException -> 0x008a }
            if (r12 == 0) goto L_0x008e
            org.json.JSONObject r12 = r10.f9328c     // Catch:{ JSONException -> 0x008a }
            java.lang.String r12 = r12.optString(r0)     // Catch:{ JSONException -> 0x008a }
            r11.put(r0, r12)     // Catch:{ JSONException -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r12 = move-exception
            r12.printStackTrace()
        L_0x008e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4853h4.mo16594b(b.o.h4, boolean):org.json.JSONObject");
    }

    /* renamed from: d */
    public JSONObject mo16595d(JSONObject jSONObject, Set<String> set) {
        JSONObject R;
        synchronized (f9323d) {
            JSONObject jSONObject2 = this.f9328c;
            R = C1960d.m2746R(jSONObject2, jSONObject, jSONObject2, (Set<String>) null);
        }
        return R;
    }

    /* renamed from: e */
    public C4999v mo16596e() {
        try {
            return new C4999v(mo16597f());
        } catch (JSONException e) {
            e.printStackTrace();
            return new C4999v();
        }
    }

    /* renamed from: f */
    public JSONObject mo16597f() {
        JSONObject jSONObject;
        synchronized (f9323d) {
            jSONObject = new JSONObject(this.f9327b.toString());
        }
        return jSONObject;
    }

    /* renamed from: g */
    public C4999v mo16598g() {
        try {
            return new C4999v(mo16599h());
        } catch (JSONException e) {
            e.printStackTrace();
            return new C4999v();
        }
    }

    /* renamed from: h */
    public JSONObject mo16599h() {
        JSONObject jSONObject;
        synchronized (f9323d) {
            jSONObject = new JSONObject(this.f9328c.toString());
        }
        return jSONObject;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16600i(org.json.JSONObject r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.String r0 = "tags"
            boolean r0 = r6.has(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            org.json.JSONObject r0 = r5.mo16599h()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "tags"
            boolean r1 = r0.has(r1)     // Catch:{ JSONException -> 0x0085 }
            if (r1 == 0) goto L_0x0027
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = "tags"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ JSONException -> 0x0021 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x002c
        L_0x0021:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
            goto L_0x002c
        L_0x0027:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
        L_0x002c:
            java.lang.String r0 = "tags"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r0 = r6.keys()     // Catch:{ JSONException -> 0x0085 }
        L_0x0036:
            boolean r2 = r0.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r3 = ""
            java.lang.String r4 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            boolean r3 = r3.equals(r4)     // Catch:{ JSONException -> 0x0085 }
            if (r3 == 0) goto L_0x0052
            r1.remove(r2)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0052:
            if (r7 == 0) goto L_0x005a
            boolean r3 = r7.has(r2)     // Catch:{ JSONException -> 0x0085 }
            if (r3 != 0) goto L_0x0036
        L_0x005a:
            java.lang.String r3 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0062:
            java.lang.Object r6 = f9323d     // Catch:{ JSONException -> 0x0085 }
            monitor-enter(r6)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "{}"
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0079
            org.json.JSONObject r7 = r5.f9328c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.remove(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0079:
            org.json.JSONObject r7 = r5.f9328c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.put(r0, r1)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r7     // Catch:{ JSONException -> 0x0085 }
        L_0x0085:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4853h4.mo16600i(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* renamed from: j */
    public abstract C4853h4 mo16601j(String str);

    /* renamed from: k */
    public void mo16602k() {
        synchronized (f9323d) {
            String str = C4815d3.f9230a;
            C4815d3.m8833h(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f9326a, this.f9328c.toString());
            C4815d3.m8833h(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f9326a, this.f9327b.toString());
        }
    }

    /* renamed from: l */
    public void mo16603l(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f9327b;
            m8897c(jSONObject3, jSONObject, jSONObject3, (Set<String>) null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f9328c;
            m8897c(jSONObject4, jSONObject2, jSONObject4, (Set<String>) null);
            mo16600i(jSONObject2, (JSONObject) null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            mo16602k();
        }
    }

    /* renamed from: m */
    public void mo16604m(String str, Object obj) {
        synchronized (f9323d) {
            this.f9327b.put(str, obj);
        }
    }

    /* renamed from: n */
    public final void mo16605n(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        synchronized (f9323d) {
            for (Map.Entry next : hashMap.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: o */
    public void mo16606o(String str) {
        synchronized (f9323d) {
            this.f9327b.remove(str);
        }
    }

    /* renamed from: p */
    public void mo16607p(String str) {
        synchronized (f9323d) {
            this.f9328c.remove(str);
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("UserState{persistKey='");
        u.append(this.f9326a);
        u.append('\'');
        u.append(", dependValues=");
        u.append(this.f9327b);
        u.append(", syncValues=");
        u.append(this.f9328c);
        u.append('}');
        return u.toString();
    }
}
