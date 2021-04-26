package p005b.p273o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4771a;
import p005b.p273o.C4857i2;

@TargetApi(19)
/* renamed from: b.o.s4 */
public class C4968s4 extends C4771a.C4773b {

    /* renamed from: g */
    public static final String f9596g = "b.o.s4";

    /* renamed from: h */
    public static final int f9597h = C4843g2.m8880b(24);
    @Nullable

    /* renamed from: i */
    public static C4968s4 f9598i = null;
    @Nullable

    /* renamed from: a */
    public C4851h2 f9599a;
    @Nullable

    /* renamed from: b */
    public C4777a0 f9600b;
    @NonNull

    /* renamed from: c */
    public Activity f9601c;
    @NonNull

    /* renamed from: d */
    public C4964s0 f9602d;

    /* renamed from: e */
    public String f9603e = null;

    /* renamed from: f */
    public Integer f9604f = null;

    /* renamed from: b.o.s4$a */
    public static class C4969a implements C4974f {

        /* renamed from: a */
        public final /* synthetic */ Activity f9605a;

        /* renamed from: b */
        public final /* synthetic */ C4964s0 f9606b;

        /* renamed from: c */
        public final /* synthetic */ String f9607c;

        public C4969a(Activity activity, C4964s0 s0Var, String str) {
            this.f9605a = activity;
            this.f9606b = s0Var;
            this.f9607c = str;
        }

        /* renamed from: a */
        public void mo16704a() {
            C4968s4.f9598i = null;
            C4968s4.m9126g(this.f9605a, this.f9606b, this.f9607c);
        }
    }

    /* renamed from: b.o.s4$b */
    public static class C4970b implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C4964s0 f9608g;

        /* renamed from: h */
        public final /* synthetic */ String f9609h;

        public C4970b(C4964s0 s0Var, String str) {
            this.f9608g = s0Var;
            this.f9609h = str;
        }

        public void run() {
            C4968s4.m9127i(this.f9608g, this.f9609h);
        }
    }

    /* renamed from: b.o.s4$c */
    public static class C4971c implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C4968s4 f9610g;

        /* renamed from: h */
        public final /* synthetic */ Activity f9611h;

        /* renamed from: i */
        public final /* synthetic */ String f9612i;

        public C4971c(C4968s4 s4Var, Activity activity, String str) {
            this.f9610g = s4Var;
            this.f9611h = activity;
            this.f9612i = str;
        }

        public void run() {
            C4968s4 s4Var = this.f9610g;
            Activity activity = this.f9611h;
            String str = this.f9612i;
            Objects.requireNonNull(s4Var);
            if (C4857i2.m8937e(C4857i2.C4868k.DEBUG)) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            C4851h2 h2Var = new C4851h2(activity);
            s4Var.f9599a = h2Var;
            h2Var.setOverScrollMode(2);
            s4Var.f9599a.setVerticalScrollBarEnabled(false);
            s4Var.f9599a.setHorizontalScrollBarEnabled(false);
            s4Var.f9599a.getSettings().setJavaScriptEnabled(true);
            s4Var.f9599a.addJavascriptInterface(new C4973e(), "OSAndroid");
            C4843g2.m8879a(activity, new C4998u4(s4Var, activity, str));
        }
    }

    /* renamed from: b.o.s4$d */
    public class C4972d implements C4974f {

        /* renamed from: a */
        public final /* synthetic */ C4974f f9613a;

        public C4972d(C4974f fVar) {
            this.f9613a = fVar;
        }

        /* renamed from: a */
        public void mo16704a() {
            C4968s4.this.f9600b = null;
            C4974f fVar = this.f9613a;
            if (fVar != null) {
                fVar.mo16704a();
            }
        }
    }

    /* renamed from: b.o.s4$e */
    public class C4973e {
        public C4973e() {
        }

        /* renamed from: a */
        public final void mo16707a(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString(AnalyticsContext.Device.DEVICE_ID_KEY, (String) null);
            if (C4968s4.this.f9602d.f9587k) {
                C4857i2.m8948p().mo16736s(C4968s4.this.f9602d, jSONObject2);
            } else if (optString != null) {
                C4857i2.m8948p().mo16735r(C4968s4.this.f9602d, jSONObject2);
            }
            if (jSONObject2.getBoolean("close")) {
                C4968s4.this.mo16701f((C4974f) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[SYNTHETIC, Splitter:B:13:0x002f] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo16708b(org.json.JSONObject r9) {
            /*
                r8 = this;
                b.o.s4$g r0 = p005b.p273o.C4968s4.C4975g.FULL_SCREEN
                java.lang.String r1 = "displayLocation"
                boolean r2 = r9.has(r1)     // Catch:{ JSONException -> 0x0026 }
                if (r2 == 0) goto L_0x002a
                java.lang.Object r2 = r9.get(r1)     // Catch:{ JSONException -> 0x0026 }
                java.lang.String r3 = ""
                boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x0026 }
                if (r2 != 0) goto L_0x002a
                java.lang.String r2 = "FULL_SCREEN"
                java.lang.String r1 = r9.optString(r1, r2)     // Catch:{ JSONException -> 0x0026 }
                java.lang.String r1 = r1.toUpperCase()     // Catch:{ JSONException -> 0x0026 }
                b.o.s4$g r1 = p005b.p273o.C4968s4.C4975g.valueOf(r1)     // Catch:{ JSONException -> 0x0026 }
                r4 = r1
                goto L_0x002b
            L_0x0026:
                r1 = move-exception
                r1.printStackTrace()
            L_0x002a:
                r4 = r0
            L_0x002b:
                r1 = -1
                if (r4 != r0) goto L_0x002f
                goto L_0x003f
            L_0x002f:
                b.o.s4 r0 = p005b.p273o.C4968s4.this     // Catch:{ JSONException -> 0x003f }
                android.app.Activity r0 = r0.f9601c     // Catch:{ JSONException -> 0x003f }
                java.lang.String r2 = "pageMetaData"
                org.json.JSONObject r2 = r9.getJSONObject(r2)     // Catch:{ JSONException -> 0x003f }
                int r0 = p005b.p273o.C4968s4.m9124d(r0, r2)     // Catch:{ JSONException -> 0x003f }
                r5 = r0
                goto L_0x0040
            L_0x003f:
                r5 = r1
            L_0x0040:
                java.lang.String r0 = "dragToDismissDisabled"
                r9.getBoolean(r0)     // Catch:{ JSONException -> 0x0045 }
            L_0x0045:
                b.o.s4 r9 = p005b.p273o.C4968s4.this
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r9.f9604f = r0
                b.o.a0 r0 = new b.o.a0
                b.o.h2 r3 = r9.f9599a
                b.o.s0 r1 = r9.f9602d
                double r6 = r1.f9582f
                r2 = r0
                r2.<init>(r3, r4, r5, r6)
                r9.f9600b = r0
                b.o.v4 r1 = new b.o.v4
                r1.<init>(r9)
                r0.f9145n = r1
                b.o.a r0 = p005b.p273o.C4793c.f9174h
                if (r0 == 0) goto L_0x007e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = p005b.p273o.C4968s4.f9596g
                r1.append(r2)
                b.o.s0 r2 = r9.f9602d
                java.lang.String r2 = r2.f9577a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.mo16487a(r1, r9)
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4968s4.C4973e.mo16708b(org.json.JSONObject):void");
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
                C4857i2.m8933a(kVar, "OSJavaScriptInterface:postMessage: " + str, (Throwable) null);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                if (string.equals("rendering_complete")) {
                    mo16708b(jSONObject);
                } else if (string.equals("action_taken") && !C4968s4.this.f9600b.f9140i) {
                    mo16707a(jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b.o.s4$f */
    public interface C4974f {
        /* renamed from: a */
        void mo16704a();
    }

    /* renamed from: b.o.s4$g */
    public enum C4975g {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN
    }

    public C4968s4(@NonNull C4964s0 s0Var, @NonNull Activity activity) {
        this.f9602d = s0Var;
        this.f9601c = activity;
    }

    /* renamed from: d */
    public static int m9124d(Activity activity, JSONObject jSONObject) {
        try {
            int b = C4843g2.m8880b(jSONObject.getJSONObject("rect").getInt("height"));
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            C4857i2.m8933a(kVar, "getPageHeightData:pxHeight: " + b, (Throwable) null);
            int c = C4843g2.m8881c(activity) - (f9597h * 2);
            if (b <= c) {
                return b;
            }
            C4857i2.m8933a(kVar, "getPageHeightData:pxHeight is over screen max: " + c, (Throwable) null);
            return c;
        } catch (JSONException e) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "pageRectToViewHeight could not get page height", e);
            return -1;
        }
    }

    /* renamed from: e */
    public static void m9125e(C4968s4 s4Var, Activity activity) {
        C4851h2 h2Var = s4Var.f9599a;
        int i = C4843g2.f9301a;
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int width = rect.width();
        int i2 = f9597h * 2;
        h2Var.layout(0, 0, width - i2, C4843g2.m8881c(activity) - i2);
    }

    /* renamed from: g */
    public static void m9126g(@NonNull Activity activity, @NonNull C4964s0 s0Var, @NonNull String str) {
        try {
            String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 2);
            C4968s4 s4Var = new C4968s4(s0Var, activity);
            f9598i = s4Var;
            C4835f2.m8871u(new C4971c(s4Var, activity, encodeToString));
        } catch (UnsupportedEncodingException e) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Catch on initInAppMessage: ", e);
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public static void m9127i(@NonNull C4964s0 s0Var, @NonNull String str) {
        Activity k = C4857i2.m8943k();
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        C4857i2.m8933a(kVar, "in app message showHTMLString on currentActivity: " + k, (Throwable) null);
        if (k != null) {
            C4968s4 s4Var = f9598i;
            if (s4Var == null || !s0Var.f9587k) {
                m9126g(k, s0Var, str);
            } else {
                s4Var.mo16701f(new C4969a(k, s0Var, str));
            }
        } else {
            Looper.prepare();
            new Handler().postDelayed(new C4970b(s0Var, str), 200);
        }
    }

    /* renamed from: a */
    public void mo16492a(@NonNull Activity activity) {
        String str = this.f9603e;
        this.f9601c = activity;
        String localClassName = activity.getLocalClassName();
        this.f9603e = localClassName;
        if (str == null) {
            mo16703j((Integer) null);
        } else if (!str.equals(localClassName)) {
            C4777a0 a0Var = this.f9600b;
            if (a0Var != null) {
                a0Var.mo16503h();
            }
            mo16703j(this.f9604f);
        } else {
            C4777a0 a0Var2 = this.f9600b;
            if (a0Var2 != null) {
                if (a0Var2.f9141j == C4975g.FULL_SCREEN) {
                    mo16703j((Integer) null);
                    return;
                }
                C4857i2.m8933a(C4857i2.C4868k.DEBUG, "In app message new activity, calculate height and show ", (Throwable) null);
                C4843g2.m8879a(this.f9601c, new C4984t4(this));
            }
        }
    }

    /* renamed from: b */
    public void mo16493b() {
        C4990u0 p = C4857i2.m8948p();
        C4964s0 s0Var = this.f9602d;
        Objects.requireNonNull(p);
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        StringBuilder u = C0843a.m460u("OSInAppMessageController messageWasDismissed by back press: ");
        u.append(s0Var.toString());
        C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
        p.mo16724g(s0Var);
        mo16702h();
        this.f9600b = null;
    }

    /* renamed from: c */
    public void mo16494c(Activity activity) {
        C4857i2.m8933a(C4857i2.C4868k.DEBUG, "In app message activity stopped, cleaning views", (Throwable) null);
        if (this.f9600b != null && this.f9603e.equals(activity.getLocalClassName())) {
            this.f9600b.mo16503h();
        }
    }

    /* renamed from: f */
    public void mo16701f(@Nullable C4974f fVar) {
        C4777a0 a0Var = this.f9600b;
        if (a0Var != null) {
            a0Var.mo16500e(new C4972d(fVar));
        } else if (fVar != null) {
            ((C4969a) fVar).mo16704a();
        }
    }

    /* renamed from: h */
    public final void mo16702h() {
        if (C4793c.f9174h != null) {
            C4771a.f9115c.remove(f9596g + this.f9602d.f9577a);
        }
    }

    /* renamed from: j */
    public final void mo16703j(@Nullable Integer num) {
        if (this.f9600b == null) {
            C4857i2.m8933a(C4857i2.C4868k.WARN, "No messageView found to update a with a new height.", (Throwable) null);
            return;
        }
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        C4857i2.m8933a(kVar, "In app message, showing first one with height: " + num, (Throwable) null);
        C4777a0 a0Var = this.f9600b;
        a0Var.f9142k = this.f9599a;
        if (num != null) {
            this.f9604f = num;
            int intValue = num.intValue();
            a0Var.f9136e = intValue;
            C4835f2.m8871u(new C5005w(a0Var, intValue));
        }
        this.f9600b.mo16499d(this.f9601c);
        C4777a0 a0Var2 = this.f9600b;
        if (a0Var2.f9139h) {
            a0Var2.f9139h = false;
            a0Var2.mo16501f((C4974f) null);
        }
    }
}
