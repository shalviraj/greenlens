package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p040g.p041a.p046h.C0893n;
import p005b.p096l.p097a.p113c.p142g.p143f.C3088l;

/* renamed from: b.l.a.c.h.b.x3 */
public final class C3368x3 {

    /* renamed from: a */
    public final String f6081a = "default_event_parameters";

    /* renamed from: b */
    public final Bundle f6082b = new Bundle();

    /* renamed from: c */
    public Bundle f6083c;

    /* renamed from: d */
    public final /* synthetic */ C3135c4 f6084d;

    public C3368x3(C3135c4 c4Var) {
        this.f6084d = c4Var;
        C0823f.m376j("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f6084d.f5638a.mo14329d().f5799f.mo14414a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a1 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[Catch:{ NumberFormatException | JSONException -> 0x00a1 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14620a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f6083c
            if (r0 == 0) goto L_0x0006
            goto L_0x00ce
        L_0x0006:
            b.l.a.c.h.b.c4 r0 = r11.f6084d
            android.content.SharedPreferences r0 = r0.mo14143o()
            java.lang.String r1 = r11.f6081a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00c6
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b7 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b7 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b7 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00b7 }
            r0 = 0
            r3 = r0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00b7 }
            if (r3 >= r4) goto L_0x00b4
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r9
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r10
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x0099
            if (r7 == r10) goto L_0x008d
            if (r7 == r9) goto L_0x0081
            b.l.a.c.h.b.c4 r4 = r11.f6084d     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            b.l.a.c.h.b.p4 r4 = r4.f5638a     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            b.l.a.c.h.b.m3 r4 = r4.f5799f     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.mo14415b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0081:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x008d:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0099:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x00a1:
            b.l.a.c.h.b.c4 r4 = r11.f6084d     // Catch:{ JSONException -> 0x00b7 }
            b.l.a.c.h.b.p4 r4 = r4.f5638a     // Catch:{ JSONException -> 0x00b7 }
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()     // Catch:{ JSONException -> 0x00b7 }
            b.l.a.c.h.b.m3 r4 = r4.f5799f     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.mo14414a(r5)     // Catch:{ JSONException -> 0x00b7 }
        L_0x00b0:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b4:
            r11.f6083c = r1     // Catch:{ JSONException -> 0x00b7 }
            goto L_0x00c6
        L_0x00b7:
            b.l.a.c.h.b.c4 r0 = r11.f6084d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5799f
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo14414a(r1)
        L_0x00c6:
            android.os.Bundle r0 = r11.f6083c
            if (r0 != 0) goto L_0x00ce
            android.os.Bundle r0 = r11.f6082b
            r11.f6083c = r0
        L_0x00ce:
            android.os.Bundle r0 = r11.f6083c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3368x3.mo14620a():android.os.Bundle");
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo14621b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f6084d.mo14143o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f6081a);
        } else {
            String str2 = this.f6081a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C0893n.f779k, str3);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = C3088l.f5219a;
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            this.f6084d.f5638a.mo14329d().f5799f.mo14415b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f6084d.f5638a.mo14329d().f5799f.mo14415b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f6083c = bundle;
    }
}
