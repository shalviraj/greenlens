package p005b.p038f.p039a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.activities.InitActivity;
import com.appfoundry.previewer.activities.LongPressActivity;
import com.appfoundry.previewer.activities.ModalActivity;
import com.appfoundry.previewer.model.Actions;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Coordinate;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.Dimensions;
import com.appfoundry.previewer.model.GradientColorStop;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Marker;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Params;
import com.appfoundry.previewer.model.Properties;
import com.appfoundry.previewer.model.ResponseAsAction;
import com.appfoundry.previewer.model.ResponseBody;
import com.appfoundry.previewer.model.Size;
import com.appfoundry.previewer.model.States;
import com.appfoundry.previewer.model.Style;
import com.appfoundry.previewer.model.Tap;
import com.segment.analytics.integrations.BasePayload;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005b.p006a.p007a.p008a.C0594b;
import p005b.p006a.p007a.p009b.C0628f;
import p005b.p006a.p007a.p018i.C0741b;
import p005b.p006a.p007a.p018i.C0743d;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0756o;
import p005b.p006a.p007a.p019j.C0771b;
import p005b.p006a.p007a.p023n.C0816e;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p006a.p007a.p024o.C0819b;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5079o;
import p298d.C6768j;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7850h0;
import p421m.C7855j0;
import p437o.p438a.p439a.C8068c;
import p441p.p442a.C8091a;

/* renamed from: b.f.a.e */
public final class C0849e {
    /* renamed from: A */
    public static final int m468A(Style style, boolean z) {
        C6888i.m12438e(style, "$this$getContainerHeight");
        if (style.f11162w == null || z) {
            return m548v0(style);
        }
        Float f = style.f11162w;
        C6888i.m12436c(f);
        return (int) (((float) m550w0(style)) / f.floatValue());
    }

    /* renamed from: A0 */
    public static final void m469A0(Component component) {
        List<Component> list;
        if (component != null) {
            C0744e.m194G(component);
        }
        Container p = C0823f.m388p();
        if (p != null && (list = p.f10972f) != null) {
            for (Component component2 : list) {
                if (!C6888i.m12434a(component2.f10939a, component != null ? component.f10939a : null)) {
                    C0744e.m195H(component2);
                }
            }
        }
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: B */
    public static final String m470B() {
        Context a = m505a();
        C6888i.m12437d(a, "appContext()");
        String string = Settings.Secure.getString(a.getContentResolver(), "android_id");
        return string != null ? string : "Unknown";
    }

    /* renamed from: B0 */
    public static final void m471B0(AppCompatActivity appCompatActivity, String str) {
        C6888i.m12438e(appCompatActivity, BasePayload.CONTEXT_KEY);
        C6888i.m12438e(str, "message");
        if (!appCompatActivity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(appCompatActivity);
            builder.setMessage((CharSequence) str);
            builder.setPositiveButton((CharSequence) "Ok", (DialogInterface.OnClickListener) C0819b.f643g);
            builder.create().show();
            return;
        }
        C8091a.f16272d.mo26044b("Activity was finishing, so not showing alert.", new Object[0]);
    }

    /* renamed from: C */
    public static final String m472C() {
        StringBuilder sb = new StringBuilder();
        Context b = BravoApp.f10730N.mo18362b();
        C6888i.m12437d(b, "BravoApp.context()");
        File filesDir = b.getFilesDir();
        C6888i.m12437d(filesDir, "BravoApp.context().filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: C0 */
    public static final void m473C0(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, BasePayload.CONTEXT_KEY);
        boolean K0 = m489K0();
        String str = K0 ? "Notifications are already enabled" : "Enable Push Notifications? Data will be shared with OneSignal";
        AlertDialog.Builder builder = new AlertDialog.Builder(appCompatActivity);
        builder.setMessage((CharSequence) str);
        if (K0) {
            builder.setPositiveButton((CharSequence) "Ok", (DialogInterface.OnClickListener) C5302c.f10643h);
        } else {
            builder.setPositiveButton((CharSequence) "Yes", (DialogInterface.OnClickListener) C5302c.f10644i);
            builder.setNegativeButton((CharSequence) "No", (DialogInterface.OnClickListener) C5302c.f10645j);
        }
        AlertDialog create = builder.create();
        C6888i.m12437d(create, "builder.create()");
        create.show();
    }

    /* renamed from: D */
    public static final String m474D(C7850h0 h0Var) {
        String str;
        C6888i.m12438e(h0Var, "$this$getErrorMessage");
        boolean z = false;
        if (h0Var.f15551i.length() > 0) {
            str = h0Var.f15551i;
        } else {
            C7855j0 j0Var = h0Var.f15555m;
            String z2 = j0Var != null ? j0Var.mo25572z() : null;
            if (z2 != null) {
                C6888i.m12438e(z2, "$this$getErrorMessageFromResponse");
                try {
                    C0816e eVar = C0816e.f639l;
                    ResponseBody b = C0816e.f635h.mo16830b(z2);
                    if (b != null) {
                        C6888i.m12438e(b, "$this$hasData");
                        if (!(b.f11096a == null && b.f11097b == null && b.f11098c == null && b.f11099d == null)) {
                            z = true;
                        }
                        if (z) {
                            return m534o0(b);
                        }
                    }
                    return m476E(z2);
                } catch (C5078n | C5079o unused) {
                    return m476E(z2);
                }
            } else {
                str = "";
            }
        }
        return C6888i.m12434a(str, "") ? "Unknown error. Please contact support@bravostudio.app" : str;
    }

    /* renamed from: D0 */
    public static final boolean m475D0() {
        return C6888i.m12434a(m490L(), "menu:slide") || C6888i.m12434a(m490L(), "menu:side");
    }

    /* renamed from: E */
    public static final String m476E(String str) {
        String str2;
        C6888i.m12438e(str, "$this$getErrorMessageFromResponseAsAction");
        try {
            C0816e eVar = C0816e.f639l;
            ResponseAsAction b = C0816e.f636i.mo16830b(str);
            if (b == null) {
                return "Unknown error. Please contact support@bravostudio.app";
            }
            C6888i.m12438e(b, "$this$printError");
            Params params = b.f11095b;
            if (params == null || (str2 = params.f11073m) == null) {
                return "Unknown error. Please contact support@bravostudio.app";
            }
            return str2;
        } catch (C5078n | C5079o unused) {
            return "Unknown error. Please contact support@bravostudio.app";
        }
    }

    /* renamed from: E0 */
    public static final void m477E0(BravoActivity bravoActivity, String str, boolean z) {
        C6888i.m12438e(bravoActivity, "$this$startActivityScan");
        if (str != null) {
            Intent intent = new Intent(bravoActivity, InitActivity.class);
            intent.putExtra("scan_new_app", true);
            intent.putExtra("new_app_url", str);
            intent.putExtra("from_scanning", z);
            bravoActivity.startActivity(intent);
            bravoActivity.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f11025h;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.ExchangeResponse m478F() {
        /*
            com.appfoundry.previewer.model.JsonApp r0 = p005b.p006a.p007a.p024o.C0820c.m306f()
            if (r0 == 0) goto L_0x000f
            java.lang.Long r0 = r0.f11025h
            if (r0 == 0) goto L_0x000f
            long r0 = r0.longValue()
            goto L_0x0013
        L_0x000f:
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0013:
            java.lang.String r2 = "app_"
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            java.lang.String r3 = p005b.p006a.p007a.p024o.C0823f.m332B()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 60000(0xea60, float:8.4078E-41)
            long r3 = (long) r3
            long r0 = r0 / r3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "key"
            p298d.p344x.p346c.C6888i.m12438e(r2, r1)
            java.lang.String r3 = "data"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.nio.charset.Charset r4 = p298d.p415c0.C7685a.f15210a
            byte[] r2 = r2.getBytes(r4)
            java.lang.String r4 = "(this as java.lang.String).getBytes(charset)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r4)
            p298d.p344x.p346c.C6888i.m12438e(r2, r1)
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.lang.String r1 = "HmacSHA256"
            javax.crypto.Mac r3 = javax.crypto.Mac.getInstance(r1)     // Catch:{ Exception -> 0x019d }
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x019d }
            r5.<init>(r2, r1)     // Catch:{ Exception -> 0x019d }
            r3.init(r5)     // Catch:{ Exception -> 0x019d }
            java.lang.String r1 = "UTF8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch:{ Exception -> 0x019d }
            java.lang.String r2 = "Charset.forName(charsetName)"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)     // Catch:{ Exception -> 0x019d }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ Exception -> 0x019d }
            p298d.p344x.p346c.C6888i.m12437d(r0, r4)     // Catch:{ Exception -> 0x019d }
            byte[] r0 = r3.doFinal(r0)     // Catch:{ Exception -> 0x019d }
            java.lang.String r1 = "Mac.getInstance(algorith…y(charset(\"UTF8\")))\n    }"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)     // Catch:{ Exception -> 0x019d }
            java.lang.String r1 = "$this$toHexString"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            b.a.a.o.a r1 = p005b.p006a.p007a.p024o.C0818a.f642g
            java.lang.String r2 = "..."
            java.lang.String r3 = "$this$joinToString"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.lang.String r3 = "separator"
            java.lang.String r4 = ""
            p298d.p344x.p346c.C6888i.m12438e(r4, r3)
            java.lang.String r5 = "prefix"
            p298d.p344x.p346c.C6888i.m12438e(r4, r5)
            java.lang.String r6 = "postfix"
            p298d.p344x.p346c.C6888i.m12438e(r4, r6)
            java.lang.String r7 = "truncated"
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "$this$joinTo"
            p298d.p344x.p346c.C6888i.m12438e(r0, r9)
            java.lang.String r9 = "buffer"
            p298d.p344x.p346c.C6888i.m12438e(r8, r9)
            p298d.p344x.p346c.C6888i.m12438e(r4, r3)
            p298d.p344x.p346c.C6888i.m12438e(r4, r5)
            p298d.p344x.p346c.C6888i.m12438e(r4, r6)
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)
            r8.append(r4)
            int r2 = r0.length
            r3 = 0
            r5 = r3
            r6 = r5
        L_0x00b7:
            r7 = 1
            if (r5 >= r2) goto L_0x00d9
            byte r9 = r0[r5]
            int r6 = r6 + r7
            if (r6 <= r7) goto L_0x00c2
            r8.append(r4)
        L_0x00c2:
            if (r1 == 0) goto L_0x00cf
            java.lang.Byte r7 = java.lang.Byte.valueOf(r9)
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            goto L_0x00d3
        L_0x00cf:
            java.lang.String r7 = java.lang.String.valueOf(r9)
        L_0x00d3:
            r8.append(r7)
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x00d9:
            r8.append(r4)
            java.lang.String r0 = r8.toString()
            java.lang.String r1 = "joinTo(StringBuilder(), …ed, transform).toString()"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.appfoundry.previewer.BravoApp$b r2 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.String r5 = com.appfoundry.previewer.BravoApp.f10748x
            r6 = 0
            if (r5 == 0) goto L_0x00f6
            java.lang.String r5 = p005b.p006a.p007a.p018i.C0756o.m225c(r5)
            goto L_0x00f7
        L_0x00f6:
            r5 = r6
        L_0x00f7:
            r1.append(r5)
            java.lang.String r5 = p005b.p006a.p007a.p024o.C0823f.m332B()
            r1.append(r5)
            java.lang.String r5 = "/"
            r1.append(r5)
            java.lang.String r5 = "authconfig?token="
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m.c0 r1 = r2.mo18363c()     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            m.e0$a r2 = new m.e0$a     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r2.<init>()     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r2.mo25540f(r0)     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            m.e0 r0 = r2.mo25535a()     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            m.f r0 = r1.mo25525a(r0)     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            m.m0.g.e r0 = (p421m.p422m0.p426g.C7887e) r0     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            m.h0 r0 = r0.mo25623h()     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            int r1 = r0.f15552j     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x014c
            java.lang.String r2 = "getExchangeResponse SUCCESS"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            p.a.a$b r8 = p441p.p442a.C8091a.f16272d     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r8.mo26043a(r2, r5)     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            m.j0 r0 = r0.f15555m     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0143
            java.lang.String r6 = r0.mo25572z()     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
        L_0x0143:
            com.appfoundry.previewer.model.ExchangeResponse r0 = new com.appfoundry.previewer.model.ExchangeResponse     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            if (r6 == 0) goto L_0x0148
            r4 = r6
        L_0x0148:
            r0.<init>(r1, r4)     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            goto L_0x0161
        L_0x014c:
            java.lang.String r0 = m474D(r0)     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            java.lang.String r2 = "getExchangeResponse FAILED: %s"
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r4[r3] = r0     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            p.a.a$b r5 = p441p.p442a.C8091a.f16272d     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r5.mo26044b(r2, r4)     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            com.appfoundry.previewer.model.ExchangeResponse r2 = new com.appfoundry.previewer.model.ExchangeResponse     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r2.<init>(r1, r0)     // Catch:{ UnknownHostException -> 0x0183, Exception -> 0x0162 }
            r0 = r2
        L_0x0161:
            return r0
        L_0x0162:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = r0.getLocalizedMessage()
            r1[r3] = r2
            p.a.a$b r2 = p441p.p442a.C8091a.f16272d
            java.lang.String r3 = "getExchangeResponse Exception: %s"
            r2.mo26044b(r3, r1)
            com.appfoundry.previewer.model.ExchangeResponse r1 = new com.appfoundry.previewer.model.ExchangeResponse
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = r0.getLocalizedMessage()
            java.lang.String r3 = "exception.localizedMessage"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            r1.<init>(r2, r0)
            return r1
        L_0x0183:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getLocalizedMessage()
            r1[r3] = r0
            p.a.a$b r0 = p441p.p442a.C8091a.f16272d
            java.lang.String r2 = "getExchangeResponse UnknownHostException: %s"
            r0.mo26044b(r2, r1)
            com.appfoundry.previewer.model.ExchangeResponse r0 = new com.appfoundry.previewer.model.ExchangeResponse
            r1 = 503(0x1f7, float:7.05E-43)
            java.lang.String r2 = "No internet connection detected. Please check your settings and try again"
            r0.<init>(r1, r2)
            return r0
        L_0x019d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not run HMAC SHA256"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m478F():com.appfoundry.previewer.model.ExchangeResponse");
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m479F0(BravoActivity bravoActivity, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        m477E0(bravoActivity, str, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = (r1 = r1.get(1)).f10982a;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Coordinate m480G(com.appfoundry.previewer.model.Style r4, int r5, int r6) {
        /*
            java.lang.String r0 = "$this$getGradientEnd"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            com.appfoundry.previewer.model.Coordinate r0 = new com.appfoundry.previewer.model.Coordinate
            java.util.List<com.appfoundry.previewer.model.Coordinate> r1 = r4.f11159t
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r1.get(r2)
            com.appfoundry.previewer.model.Coordinate r1 = (com.appfoundry.previewer.model.Coordinate) r1
            if (r1 == 0) goto L_0x0020
            java.lang.Float r1 = r1.f10982a
            if (r1 == 0) goto L_0x0020
            float r1 = r1.floatValue()
            float r5 = (float) r5
            float r1 = r1 * r5
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            java.util.List<com.appfoundry.previewer.model.Coordinate> r4 = r4.f11159t
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get(r2)
            com.appfoundry.previewer.model.Coordinate r4 = (com.appfoundry.previewer.model.Coordinate) r4
            if (r4 == 0) goto L_0x003c
            java.lang.Float r4 = r4.f10983b
            if (r4 == 0) goto L_0x003c
            float r4 = r4.floatValue()
            float r6 = (float) r6
            float r3 = r4 * r6
        L_0x003c:
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            r0.<init>(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m480G(com.appfoundry.previewer.model.Style, int, int):com.appfoundry.previewer.model.Coordinate");
    }

    /* renamed from: G0 */
    public static final int m481G0(char c) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new IllegalArgumentException(("Invalid Hexadecimal Character: " + c).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = (r1 = r1.get(0)).f10982a;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Coordinate m482H(com.appfoundry.previewer.model.Style r4, int r5, int r6) {
        /*
            java.lang.String r0 = "$this$getGradientStart"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            com.appfoundry.previewer.model.Coordinate r0 = new com.appfoundry.previewer.model.Coordinate
            java.util.List<com.appfoundry.previewer.model.Coordinate> r1 = r4.f11159t
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r1.get(r2)
            com.appfoundry.previewer.model.Coordinate r1 = (com.appfoundry.previewer.model.Coordinate) r1
            if (r1 == 0) goto L_0x0020
            java.lang.Float r1 = r1.f10982a
            if (r1 == 0) goto L_0x0020
            float r1 = r1.floatValue()
            float r5 = (float) r5
            float r1 = r1 * r5
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            java.util.List<com.appfoundry.previewer.model.Coordinate> r4 = r4.f11159t
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get(r2)
            com.appfoundry.previewer.model.Coordinate r4 = (com.appfoundry.previewer.model.Coordinate) r4
            if (r4 == 0) goto L_0x003c
            java.lang.Float r4 = r4.f10983b
            if (r4 == 0) goto L_0x003c
            float r4 = r4.floatValue()
            float r6 = (float) r6
            float r3 = r4 * r6
        L_0x003c:
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            r0.<init>(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m482H(com.appfoundry.previewer.model.Style, int, int):com.appfoundry.previewer.model.Coordinate");
    }

    /* renamed from: H0 */
    public static void m483H0(BravoActivity bravoActivity, String str, String str2, int i, int i2) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C6888i.m12438e(bravoActivity, "$this$toastUiThread");
        C6888i.m12438e(str, "message");
        bravoActivity.runOnUiThread(new C0743d(bravoActivity, str2, str, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = (r1 = r1.f11013b).get(1);
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.gms.maps.model.LatLng m484I(com.appfoundry.previewer.model.Marker r5) {
        /*
            java.lang.String r0 = "$this$getLatLong"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            com.appfoundry.previewer.model.Geometry r1 = r5.f11030b
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.util.List<java.lang.Float> r1 = r1.f11013b
            if (r1 == 0) goto L_0x001f
            r3 = 1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x001f
            float r1 = r1.floatValue()
            double r3 = (double) r1
            goto L_0x0020
        L_0x001f:
            double r3 = (double) r2
        L_0x0020:
            com.appfoundry.previewer.model.Geometry r5 = r5.f11030b
            if (r5 == 0) goto L_0x0036
            java.util.List<java.lang.Float> r5 = r5.f11013b
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r5.get(r2)
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 == 0) goto L_0x0036
            float r5 = r5.floatValue()
            double r1 = (double) r5
            goto L_0x0037
        L_0x0036:
            double r1 = (double) r2
        L_0x0037:
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m484I(com.appfoundry.previewer.model.Marker):com.google.android.gms.maps.model.LatLng");
    }

    /* renamed from: I0 */
    public static final void m485I0(Style style) {
        Float f;
        C6888i.m12438e(style, "$this$transformBorderRadiusIntoCornerRadiiIfExists");
        if (style.f11125B == null && (f = style.f11124A) != null && f.floatValue() > 0.0f) {
            Float f2 = style.f11124A;
            style.f11125B = C6790h.m12314A(f2, f2, f2, f2);
        }
    }

    /* renamed from: J */
    public static final String m486J(Marker marker) {
        C6888i.m12438e(marker, "$this$getMarkerId");
        StringBuilder sb = new StringBuilder();
        sb.append(m484I(marker).toString());
        sb.append(":");
        Properties properties = marker.f11031c;
        sb.append(properties != null ? properties.f11090b : null);
        return sb.toString();
    }

    /* renamed from: J0 */
    public static final void m487J0(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, "$this$unregisterFromEventBus");
        if (C8068c.m14948b().mo26007f(appCompatActivity)) {
            C8068c.m14948b().mo26014m(appCompatActivity);
        }
    }

    /* renamed from: K */
    public static final Page m488K() {
        App app2;
        Data data;
        List<Page> list;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        if (jsonApp == null || (app2 = jsonApp.f11021d) == null || (data = app2.f10891e) == null || (list = data.f10984a) == null) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: K0 */
    public static final boolean m489K0() {
        C0817f fVar = C0817f.f641b;
        return C0817f.m295c(m507b() + "user_allowed_push");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r0 = (r0 = (r0 = (r0 = (r0 = r0.f11021d).f10891e).f10984a).get(0)).f11035c;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m490L() {
        /*
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.f10730N
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f10738n
            if (r0 == 0) goto L_0x0020
            com.appfoundry.previewer.model.App r0 = r0.f11021d
            if (r0 == 0) goto L_0x0020
            com.appfoundry.previewer.model.Data r0 = r0.f10891e
            if (r0 == 0) goto L_0x0020
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f10984a
            if (r0 == 0) goto L_0x0020
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.f11035c
            if (r0 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "menu:slide"
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m490L():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: b.a.a.h.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: b.a.a.h.o0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: b.a.a.h.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v39, resolved type: b.a.a.h.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v50, resolved type: b.a.a.h.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v81, resolved type: b.a.a.h.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v82, resolved type: b.a.a.h.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v83, resolved type: b.a.a.h.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v84, resolved type: b.a.a.h.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: b.a.a.h.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v85, resolved type: b.a.a.h.v} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b9, code lost:
        if (r9 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d0, code lost:
        if (r10 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0150, code lost:
        r9 = r9.f11167b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0482  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m491M(java.lang.String r8, java.lang.String r9, java.lang.String r10, com.appfoundry.previewer.model.Actions r11, java.lang.String r12, java.util.List<java.lang.String> r13, java.lang.String r14) {
        /*
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x000d
            com.appfoundry.previewer.model.Tap r1 = r11.f10886a
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = r1.f11166a
            if (r1 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            if (r13 == 0) goto L_0x0017
            java.lang.String r2 = m549w(r13)
            if (r2 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            b.l.d.q.e r3 = p005b.p096l.p180d.p191q.C3980e.m7350a()
            java.lang.String r4 = "actionType"
            r3.mo15486b(r4, r1)
            if (r8 == 0) goto L_0x002c
            b.l.d.q.e r3 = p005b.p096l.p180d.p191q.C3980e.m7350a()
            java.lang.String r4 = "pageId"
            r3.mo15486b(r4, r8)
        L_0x002c:
            if (r9 == 0) goto L_0x0037
            b.l.d.q.e r3 = p005b.p096l.p180d.p191q.C3980e.m7350a()
            java.lang.String r4 = "containerId"
            r3.mo15486b(r4, r9)
        L_0x0037:
            if (r14 == 0) goto L_0x0042
            b.l.d.q.e r3 = p005b.p096l.p180d.p191q.C3980e.m7350a()
            java.lang.String r4 = "componentId"
            r3.mo15486b(r4, r14)
        L_0x0042:
            if (r10 == 0) goto L_0x004d
            b.l.d.q.e r14 = p005b.p096l.p180d.p191q.C3980e.m7350a()
            java.lang.String r3 = "href"
            r14.mo15486b(r3, r10)
        L_0x004d:
            if (r12 == 0) goto L_0x0058
            b.l.d.q.e r14 = p005b.p096l.p180d.p191q.C3980e.m7350a()
            java.lang.String r3 = "hrefRemote"
            r14.mo15486b(r3, r12)
        L_0x0058:
            java.lang.String r14 = "$this$isPhone"
            p298d.p344x.p346c.C6888i.m12438e(r1, r14)
            r14 = 1
            java.lang.String r3 = "phone"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            r4 = 0
            if (r3 == 0) goto L_0x0082
            b.a.a.h.e0 r8 = new b.a.a.h.e0
            if (r11 == 0) goto L_0x007d
            java.lang.String r9 = "$this$getPhone"
            p298d.p344x.p346c.C6888i.m12438e(r11, r9)
            com.appfoundry.previewer.model.Tap r9 = r11.f10886a
            if (r9 == 0) goto L_0x007a
            com.appfoundry.previewer.model.Params r9 = r9.f11167b
            if (r9 == 0) goto L_0x007a
            java.lang.String r4 = r9.f11064d
        L_0x007a:
            if (r4 == 0) goto L_0x007d
            r0 = r4
        L_0x007d:
            r8.<init>(r0)
            goto L_0x05e4
        L_0x0082:
            java.lang.String r3 = "$this$isEmail"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "email"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r3 == 0) goto L_0x00aa
            b.a.a.h.h r8 = new b.a.a.h.h
            if (r11 == 0) goto L_0x00a5
            java.lang.String r9 = "$this$getEmail"
            p298d.p344x.p346c.C6888i.m12438e(r11, r9)
            com.appfoundry.previewer.model.Tap r9 = r11.f10886a
            if (r9 == 0) goto L_0x00a2
            com.appfoundry.previewer.model.Params r9 = r9.f11167b
            if (r9 == 0) goto L_0x00a2
            java.lang.String r4 = r9.f11065e
        L_0x00a2:
            if (r4 == 0) goto L_0x00a5
            r0 = r4
        L_0x00a5:
            r8.<init>(r0)
            goto L_0x05e4
        L_0x00aa:
            java.lang.String r3 = "$this$isOpenUrl"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "openurl"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r3 == 0) goto L_0x00c7
            b.a.a.h.b0 r8 = new b.a.a.h.b0
            if (r11 == 0) goto L_0x00c2
            java.lang.String r9 = m496R(r11)
            if (r9 == 0) goto L_0x00c2
            r0 = r9
        L_0x00c2:
            r8.<init>(r0, r10)
            goto L_0x05e4
        L_0x00c7:
            java.lang.String r3 = "$this$isShare"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "share"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r3 == 0) goto L_0x00e4
            b.a.a.h.l0 r8 = new b.a.a.h.l0
            if (r11 == 0) goto L_0x00df
            java.lang.String r9 = m496R(r11)
            if (r9 == 0) goto L_0x00df
            r0 = r9
        L_0x00df:
            r8.<init>(r0)
            goto L_0x05e4
        L_0x00e4:
            java.lang.String r3 = "$this$isDownload"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "download"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x05cd
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x00fc
            goto L_0x05cd
        L_0x00fc:
            java.lang.String r3 = "$this$isOpenVideo"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "openvideo"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r3 == 0) goto L_0x0119
            b.a.a.h.v0 r8 = new b.a.a.h.v0
            if (r11 == 0) goto L_0x0114
            java.lang.String r9 = m496R(r11)
            if (r9 == 0) goto L_0x0114
            r0 = r9
        L_0x0114:
            r8.<init>(r0)
            goto L_0x05e4
        L_0x0119:
            java.lang.String r3 = "$this$isOpenPdf"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "openpdf"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r3 == 0) goto L_0x0136
            b.a.a.h.d0 r8 = new b.a.a.h.d0
            if (r11 == 0) goto L_0x0131
            java.lang.String r9 = m496R(r11)
            if (r9 == 0) goto L_0x0131
            r0 = r9
        L_0x0131:
            r8.<init>(r0)
            goto L_0x05e4
        L_0x0136:
            java.lang.String r3 = "$this$isMaps"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "mapsdirections"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r3 == 0) goto L_0x0197
            b.a.a.h.u r8 = new b.a.a.h.u
            if (r11 == 0) goto L_0x015b
            java.lang.String r9 = "$this$getPlace"
            p298d.p344x.p346c.C6888i.m12438e(r11, r9)
            com.appfoundry.previewer.model.Tap r9 = r11.f10886a
            if (r9 == 0) goto L_0x0157
            com.appfoundry.previewer.model.Params r9 = r9.f11167b
            if (r9 == 0) goto L_0x0157
            java.lang.String r9 = r9.f11066f
            goto L_0x0158
        L_0x0157:
            r9 = r4
        L_0x0158:
            if (r9 == 0) goto L_0x015b
            r0 = r9
        L_0x015b:
            if (r11 == 0) goto L_0x016d
            java.lang.String r9 = "$this$getLat"
            p298d.p344x.p346c.C6888i.m12438e(r11, r9)
            com.appfoundry.previewer.model.Tap r9 = r11.f10886a
            if (r9 == 0) goto L_0x016d
            com.appfoundry.previewer.model.Params r9 = r9.f11167b
            if (r9 == 0) goto L_0x016d
            java.lang.Float r9 = r9.f11067g
            goto L_0x016e
        L_0x016d:
            r9 = r4
        L_0x016e:
            if (r11 == 0) goto L_0x0180
            java.lang.String r10 = "$this$getLong"
            p298d.p344x.p346c.C6888i.m12438e(r11, r10)
            com.appfoundry.previewer.model.Tap r10 = r11.f10886a
            if (r10 == 0) goto L_0x0180
            com.appfoundry.previewer.model.Params r10 = r10.f11167b
            if (r10 == 0) goto L_0x0180
            java.lang.Float r10 = r10.f11068h
            goto L_0x0181
        L_0x0180:
            r10 = r4
        L_0x0181:
            if (r11 == 0) goto L_0x0192
            java.lang.String r12 = "$this$getZoom"
            p298d.p344x.p346c.C6888i.m12438e(r11, r12)
            com.appfoundry.previewer.model.Tap r11 = r11.f10886a
            if (r11 == 0) goto L_0x0192
            com.appfoundry.previewer.model.Params r11 = r11.f11167b
            if (r11 == 0) goto L_0x0192
            java.lang.Float r4 = r11.f11082v
        L_0x0192:
            r8.<init>(r0, r9, r10, r4)
            goto L_0x05e4
        L_0x0197:
            java.lang.String r3 = "$this$isAddToCalendar"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r3 = "addtocalendar"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r3 == 0) goto L_0x01ed
            b.a.a.h.b r8 = new b.a.a.h.b
            if (r11 == 0) goto L_0x01bc
            java.lang.String r9 = "$this$getTitle"
            p298d.p344x.p346c.C6888i.m12438e(r11, r9)
            com.appfoundry.previewer.model.Tap r9 = r11.f10886a
            if (r9 == 0) goto L_0x01b8
            com.appfoundry.previewer.model.Params r9 = r9.f11167b
            if (r9 == 0) goto L_0x01b8
            java.lang.String r9 = r9.f11062b
            goto L_0x01b9
        L_0x01b8:
            r9 = r4
        L_0x01b9:
            if (r9 == 0) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            r9 = r0
        L_0x01bd:
            if (r11 == 0) goto L_0x01d3
            java.lang.String r10 = "$this$getStartDate"
            p298d.p344x.p346c.C6888i.m12438e(r11, r10)
            com.appfoundry.previewer.model.Tap r10 = r11.f10886a
            if (r10 == 0) goto L_0x01cf
            com.appfoundry.previewer.model.Params r10 = r10.f11167b
            if (r10 == 0) goto L_0x01cf
            java.lang.String r10 = r10.f11069i
            goto L_0x01d0
        L_0x01cf:
            r10 = r4
        L_0x01d0:
            if (r10 == 0) goto L_0x01d3
            goto L_0x01d4
        L_0x01d3:
            r10 = r0
        L_0x01d4:
            if (r11 == 0) goto L_0x01e8
            java.lang.String r12 = "$this$getEndDate"
            p298d.p344x.p346c.C6888i.m12438e(r11, r12)
            com.appfoundry.previewer.model.Tap r11 = r11.f10886a
            if (r11 == 0) goto L_0x01e5
            com.appfoundry.previewer.model.Params r11 = r11.f11167b
            if (r11 == 0) goto L_0x01e5
            java.lang.String r4 = r11.f11070j
        L_0x01e5:
            if (r4 == 0) goto L_0x01e8
            r0 = r4
        L_0x01e8:
            r8.<init>(r9, r10, r0)
            goto L_0x05e4
        L_0x01ed:
            java.lang.String r3 = "$this$isScan"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "scan"
            boolean r6 = p298d.p415c0.C7694h.m13928f(r1, r5, r14)
            if (r6 != 0) goto L_0x05c7
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13928f(r2, r5, r14)
            if (r3 == 0) goto L_0x0205
            goto L_0x05c7
        L_0x0205:
            java.lang.String r3 = "$this$isScanQr"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "scanqr"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x05c1
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x021d
            goto L_0x05c1
        L_0x021d:
            java.lang.String r3 = "$this$isUnlink"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "unlink"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x05bb
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x0235
            goto L_0x05bb
        L_0x0235:
            java.lang.String r3 = "$this$isCloseIntro"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "closeIntro"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x05b5
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x024d
            goto L_0x05b5
        L_0x024d:
            java.lang.String r3 = "$this$isClose"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "close"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x05af
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x0265
            goto L_0x05af
        L_0x0265:
            java.lang.String r3 = "$this$isUpdate"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "update"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            r7 = 0
            if (r6 != 0) goto L_0x05a9
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x027e
            goto L_0x05a9
        L_0x027e:
            java.lang.String r3 = "$this$isLoadScannedApp"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "scanapp"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x059b
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x0296
            goto L_0x059b
        L_0x0296:
            java.lang.String r3 = "$this$isShowQr"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "showqr"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x0583
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x02ae
            goto L_0x0583
        L_0x02ae:
            java.lang.String r3 = "$this$isLogin"
            p298d.p344x.p346c.C6888i.m12438e(r1, r3)
            java.lang.String r5 = "login"
            boolean r6 = p298d.p415c0.C7694h.m13924b(r1, r5, r14)
            if (r6 != 0) goto L_0x0522
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            boolean r3 = p298d.p415c0.C7694h.m13924b(r2, r5, r14)
            if (r3 == 0) goto L_0x02c6
            goto L_0x0522
        L_0x02c6:
            java.lang.String r0 = "$this$isLogout"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "logout"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x051b
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x02de
            goto L_0x051b
        L_0x02de:
            java.lang.String r0 = "$this$isSubmit"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "submit"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x0514
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x02f6
            goto L_0x0514
        L_0x02f6:
            java.lang.String r0 = "$this$isRemoteAction"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r0 = "remote"
            boolean r0 = p298d.p415c0.C7694h.m13924b(r1, r0, r14)
            if (r0 == 0) goto L_0x032e
            b.a.a.h.i0 r9 = new b.a.a.h.i0
            if (r11 == 0) goto L_0x0317
            java.lang.String r10 = "$this$getTriggerUrl"
            p298d.p344x.p346c.C6888i.m12438e(r11, r10)
            com.appfoundry.previewer.model.Tap r10 = r11.f10886a
            if (r10 == 0) goto L_0x0317
            com.appfoundry.previewer.model.Params r10 = r10.f11167b
            if (r10 == 0) goto L_0x0317
            java.lang.String r10 = r10.f11075o
            goto L_0x0318
        L_0x0317:
            r10 = r4
        L_0x0318:
            if (r11 == 0) goto L_0x0329
            java.lang.String r12 = "$this$getConfirmPrompt"
            p298d.p344x.p346c.C6888i.m12438e(r11, r12)
            com.appfoundry.previewer.model.Tap r11 = r11.f10886a
            if (r11 == 0) goto L_0x0329
            com.appfoundry.previewer.model.Params r11 = r11.f11167b
            if (r11 == 0) goto L_0x0329
            java.lang.String r4 = r11.f11076p
        L_0x0329:
            r9.<init>(r8, r10, r4)
            goto L_0x0581
        L_0x032e:
            java.lang.String r0 = "$this$isEnableNotifications"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "enablenotifications"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x050d
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x0346
            goto L_0x050d
        L_0x0346:
            java.lang.String r0 = "$this$isOpenIntro"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "openIntro"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x0506
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x035e
            goto L_0x0506
        L_0x035e:
            java.lang.String r0 = "$this$isBackHome"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "backHome"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x04ff
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x0376
            goto L_0x04ff
        L_0x0376:
            java.lang.String r0 = "$this$isAppSettings"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "appSettings"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x04f8
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x038e
            goto L_0x04f8
        L_0x038e:
            java.lang.String r0 = "$this$isGoBack"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "goBack"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x04f1
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x03a6
            goto L_0x04f1
        L_0x03a6:
            java.lang.String r0 = "$this$isPreviewApp"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "previewapp"
            boolean r5 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r5 != 0) goto L_0x04d9
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x03be
            goto L_0x04d9
        L_0x03be:
            java.lang.String r0 = "$this$isPlayAudio"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r3 = "play"
            boolean r4 = p298d.p415c0.C7694h.m13924b(r1, r3, r14)
            if (r4 != 0) goto L_0x04c2
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = p298d.p415c0.C7694h.m13924b(r2, r3, r14)
            if (r0 == 0) goto L_0x03d6
            goto L_0x04c2
        L_0x03d6:
            java.lang.String r13 = "$this$isPauseAudio"
            p298d.p344x.p346c.C6888i.m12438e(r1, r13)
            java.lang.String r0 = "pause"
            boolean r3 = p298d.p415c0.C7694h.m13924b(r1, r0, r14)
            if (r3 != 0) goto L_0x04bb
            p298d.p344x.p346c.C6888i.m12438e(r2, r13)
            boolean r13 = p298d.p415c0.C7694h.m13924b(r2, r0, r14)
            if (r13 == 0) goto L_0x03ee
            goto L_0x04bb
        L_0x03ee:
            java.lang.String r9 = "$this$isOpenAudio"
            p298d.p344x.p346c.C6888i.m12438e(r1, r9)
            java.lang.String r9 = "openaudio"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r1, r9, r14)
            if (r9 != 0) goto L_0x04b0
            java.lang.String r9 = "$this$isOpenAudio"
            p298d.p344x.p346c.C6888i.m12438e(r2, r9)
            java.lang.String r9 = "openaudio"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r2, r9, r14)
            if (r9 == 0) goto L_0x040a
            goto L_0x04b0
        L_0x040a:
            java.lang.String r9 = "$this$isResetPassword"
            p298d.p344x.p346c.C6888i.m12438e(r1, r9)
            java.lang.String r9 = "reset-password"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r1, r9, r14)
            if (r9 != 0) goto L_0x04a9
            java.lang.String r9 = "$this$isResetPassword"
            p298d.p344x.p346c.C6888i.m12438e(r2, r9)
            java.lang.String r9 = "reset-password"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r2, r9, r14)
            if (r9 == 0) goto L_0x0426
            goto L_0x04a9
        L_0x0426:
            java.lang.String r9 = "$this$isFirebaseLogout"
            p298d.p344x.p346c.C6888i.m12438e(r1, r9)
            java.lang.String r9 = "logout:firebase"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r1, r9, r14)
            if (r9 != 0) goto L_0x04a2
            java.lang.String r9 = "$this$isFirebaseLogout"
            p298d.p344x.p346c.C6888i.m12438e(r2, r9)
            java.lang.String r9 = "logout:firebase"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r2, r9, r14)
            if (r9 == 0) goto L_0x0441
            goto L_0x04a2
        L_0x0441:
            java.lang.String r9 = "$this$isFirebaseRegister"
            p298d.p344x.p346c.C6888i.m12438e(r1, r9)
            java.lang.String r9 = "register:firebase-email-password"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r1, r9, r14)
            if (r9 != 0) goto L_0x049b
            java.lang.String r9 = "$this$isFirebaseRegister"
            p298d.p344x.p346c.C6888i.m12438e(r2, r9)
            java.lang.String r9 = "register:firebase-email-password"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r2, r9, r14)
            if (r9 == 0) goto L_0x045c
            goto L_0x049b
        L_0x045c:
            java.lang.String r9 = "$this$isShowEmulatorAppList"
            p298d.p344x.p346c.C6888i.m12438e(r2, r9)
            java.lang.String r9 = "show-emulator-appList"
            boolean r9 = p298d.p415c0.C7694h.m13924b(r2, r9, r14)
            if (r9 == 0) goto L_0x0478
            com.appfoundry.previewer.BravoApp$b r9 = com.appfoundry.previewer.BravoApp.f10730N
            java.lang.Boolean r9 = com.appfoundry.previewer.BravoApp.f10728L
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r9 = p298d.p344x.p346c.C6888i.m12434a(r9, r11)
            if (r9 != 0) goto L_0x0479
            p005b.p006a.p007a.p024o.C0820c.m302b()
        L_0x0478:
            r14 = r7
        L_0x0479:
            if (r14 == 0) goto L_0x0482
            b.a.a.h.m0 r8 = new b.a.a.h.m0
            r8.<init>()
            goto L_0x05e4
        L_0x0482:
            p005b.p006a.p007a.p024o.C0823f.m377j0(r12)
            if (r10 == 0) goto L_0x0494
            b.a.a.h.v r9 = new b.a.a.h.v
            r3 = 0
            r5 = 4
            r0 = r9
            r1 = r10
            r2 = r12
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0581
        L_0x0494:
            java.lang.Object r8 = new java.lang.Object
            r8.<init>()
            goto L_0x05e4
        L_0x049b:
            b.a.a.h.m r9 = new b.a.a.h.m
            r9.<init>(r8)
            goto L_0x0581
        L_0x04a2:
            b.a.a.h.l r8 = new b.a.a.h.l
            r8.<init>()
            goto L_0x05e4
        L_0x04a9:
            b.a.a.h.j0 r9 = new b.a.a.h.j0
            r9.<init>(r8)
            goto L_0x0581
        L_0x04b0:
            b.a.a.h.y r8 = new b.a.a.h.y
            java.lang.String r9 = m551x(r11, r2)
            r8.<init>(r9)
            goto L_0x05e4
        L_0x04bb:
            b.a.a.h.c0 r8 = new b.a.a.h.c0
            r8.<init>(r9)
            goto L_0x05e4
        L_0x04c2:
            b.a.a.h.f0 r8 = new b.a.a.h.f0
            java.lang.String r10 = m551x(r11, r2)
            if (r13 == 0) goto L_0x04d3
            java.lang.String r11 = "audio:background"
            boolean r11 = m508b0(r13, r11)
            if (r11 != r14) goto L_0x04d3
            goto L_0x04d4
        L_0x04d3:
            r14 = r7
        L_0x04d4:
            r8.<init>(r9, r10, r14)
            goto L_0x05e4
        L_0x04d9:
            b.a.a.h.g0 r8 = new b.a.a.h.g0
            if (r11 == 0) goto L_0x04ec
            java.lang.String r9 = "$this$getAppId"
            p298d.p344x.p346c.C6888i.m12438e(r11, r9)
            com.appfoundry.previewer.model.Tap r9 = r11.f10886a
            if (r9 == 0) goto L_0x04ec
            com.appfoundry.previewer.model.Params r9 = r9.f11167b
            if (r9 == 0) goto L_0x04ec
            java.lang.String r4 = r9.f11071k
        L_0x04ec:
            r8.<init>(r4)
            goto L_0x05e4
        L_0x04f1:
            b.a.a.h.n r8 = new b.a.a.h.n
            r8.<init>()
            goto L_0x05e4
        L_0x04f8:
            b.a.a.h.x r8 = new b.a.a.h.x
            r8.<init>()
            goto L_0x05e4
        L_0x04ff:
            b.a.a.h.c r8 = new b.a.a.h.c
            r8.<init>()
            goto L_0x05e4
        L_0x0506:
            b.a.a.h.z r8 = new b.a.a.h.z
            r8.<init>()
            goto L_0x05e4
        L_0x050d:
            b.a.a.h.h0 r8 = new b.a.a.h.h0
            r8.<init>()
            goto L_0x05e4
        L_0x0514:
            b.a.a.h.o0 r9 = new b.a.a.h.o0
            r9.<init>(r8)
            goto L_0x0581
        L_0x051b:
            b.a.a.h.s r8 = new b.a.a.h.s
            r8.<init>(r7)
            goto L_0x05e4
        L_0x0522:
            b.a.a.h.r r9 = new b.a.a.h.r
            java.lang.String r10 = "actionsInTags"
            p298d.p344x.p346c.C6888i.m12438e(r2, r10)
            if (r11 == 0) goto L_0x0535
            com.appfoundry.previewer.model.Tap r10 = r11.f10886a
            if (r10 == 0) goto L_0x0535
            com.appfoundry.previewer.model.Params r10 = r10.f11167b
            if (r10 == 0) goto L_0x0535
            java.lang.String r4 = r10.f11072l
        L_0x0535:
            java.lang.String r10 = "firebase-email-password"
            java.lang.String r12 = "apple"
            java.lang.String r13 = "Figma"
            java.lang.String r1 = "google-oauth2"
            if (r4 == 0) goto L_0x0553
            com.appfoundry.previewer.model.Tap r3 = r11.f10886a
            com.appfoundry.previewer.model.Params r3 = r3.f11167b
            java.lang.String r3 = r3.f11072l
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            r14 = r14 ^ r0
            if (r14 == 0) goto L_0x0553
            com.appfoundry.previewer.model.Tap r10 = r11.f10886a
            com.appfoundry.previewer.model.Params r10 = r10.f11167b
            java.lang.String r10 = r10.f11072l
            goto L_0x057e
        L_0x0553:
            r11 = 2
            boolean r14 = p298d.p415c0.C7694h.m13926d(r2, r1, r7, r11)
            if (r14 == 0) goto L_0x055c
            r10 = r1
            goto L_0x057e
        L_0x055c:
            boolean r14 = p298d.p415c0.C7694h.m13926d(r2, r13, r7, r11)
            if (r14 == 0) goto L_0x0564
            r10 = r13
            goto L_0x057e
        L_0x0564:
            boolean r13 = p298d.p415c0.C7694h.m13926d(r2, r12, r7, r11)
            if (r13 == 0) goto L_0x056c
            r10 = r12
            goto L_0x057e
        L_0x056c:
            boolean r11 = p298d.p415c0.C7694h.m13926d(r2, r10, r7, r11)
            if (r11 == 0) goto L_0x0573
            goto L_0x057e
        L_0x0573:
            boolean r10 = p005b.p006a.p007a.p024o.C0820c.m324x()
            if (r10 != 0) goto L_0x057c
            java.lang.String r10 = "app-with-oauth"
            goto L_0x057e
        L_0x057c:
            java.lang.String r10 = "passwordless"
        L_0x057e:
            r9.<init>(r8, r10)
        L_0x0581:
            r8 = r9
            goto L_0x05e4
        L_0x0583:
            b.a.a.h.n0 r8 = new b.a.a.h.n0
            if (r13 == 0) goto L_0x058e
            java.lang.String r9 = "appUrl"
            java.lang.String r9 = m497S(r13, r9, r7)
            goto L_0x058f
        L_0x058e:
            r9 = r4
        L_0x058f:
            if (r13 == 0) goto L_0x0597
            java.lang.String r10 = "appName"
            java.lang.String r4 = m497S(r13, r10, r7)
        L_0x0597:
            r8.<init>(r9, r4)
            goto L_0x05e4
        L_0x059b:
            b.a.a.h.k0 r8 = new b.a.a.h.k0
            if (r13 == 0) goto L_0x05a5
            java.lang.String r9 = "scannedAppUrl"
            java.lang.String r4 = m497S(r13, r9, r7)
        L_0x05a5:
            r8.<init>(r4)
            goto L_0x05e4
        L_0x05a9:
            b.a.a.h.u0 r8 = new b.a.a.h.u0
            r8.<init>(r7, r14)
            goto L_0x05e4
        L_0x05af:
            b.a.a.h.e r8 = new b.a.a.h.e
            r8.<init>()
            goto L_0x05e4
        L_0x05b5:
            b.a.a.h.q r8 = new b.a.a.h.q
            r8.<init>()
            goto L_0x05e4
        L_0x05bb:
            b.a.a.h.t r8 = new b.a.a.h.t
            r8.<init>()
            goto L_0x05e4
        L_0x05c1:
            b.a.a.h.a0 r8 = new b.a.a.h.a0
            r8.<init>()
            goto L_0x05e4
        L_0x05c7:
            b.a.a.h.a0 r8 = new b.a.a.h.a0
            r8.<init>()
            goto L_0x05e4
        L_0x05cd:
            b.a.a.h.g r8 = new b.a.a.h.g
            if (r11 == 0) goto L_0x05d8
            java.lang.String r9 = m496R(r11)
            if (r9 == 0) goto L_0x05d8
            goto L_0x05e1
        L_0x05d8:
            java.lang.String r9 = "$this$getUrlFromTag"
            p298d.p344x.p346c.C6888i.m12438e(r2, r9)
            java.lang.String r9 = p005b.p006a.p007a.p018i.C0756o.m226d(r2)
        L_0x05e1:
            r8.<init>(r9)
        L_0x05e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m491M(java.lang.String, java.lang.String, java.lang.String, com.appfoundry.previewer.model.Actions, java.lang.String, java.util.List, java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r4 = r4.f10989a;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p005b.p006a.p007a.p019j.C0780k m492N(com.appfoundry.previewer.model.Style r18, int r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "$this$getShadowData"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            com.appfoundry.previewer.model.Dimensions r3 = new com.appfoundry.previewer.model.Dimensions
            com.appfoundry.previewer.model.Dimensions r4 = r0.f11152m
            r5 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.Float r4 = r4.f10989a
            if (r4 == 0) goto L_0x001b
            float r4 = r4.floatValue()
            goto L_0x001c
        L_0x001b:
            r4 = r5
        L_0x001c:
            float r4 = p005b.p006a.p007a.p024o.C0820c.m322v(r4, r1)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            com.appfoundry.previewer.model.Dimensions r6 = r0.f11152m
            if (r6 == 0) goto L_0x0031
            java.lang.Float r6 = r6.f10990b
            if (r6 == 0) goto L_0x0031
            float r6 = r6.floatValue()
            goto L_0x0032
        L_0x0031:
            r6 = r5
        L_0x0032:
            float r6 = p005b.p006a.p007a.p024o.C0820c.m322v(r6, r2)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            com.appfoundry.previewer.model.Dimensions r7 = r0.f11152m
            if (r7 == 0) goto L_0x0047
            java.lang.Float r7 = r7.f10991c
            if (r7 == 0) goto L_0x0047
            float r7 = r7.floatValue()
            goto L_0x0048
        L_0x0047:
            r7 = r5
        L_0x0048:
            float r7 = p005b.p006a.p007a.p024o.C0820c.m322v(r7, r1)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            com.appfoundry.previewer.model.Dimensions r8 = r0.f11152m
            if (r8 == 0) goto L_0x005d
            java.lang.Float r8 = r8.f10992d
            if (r8 == 0) goto L_0x005d
            float r8 = r8.floatValue()
            goto L_0x005e
        L_0x005d:
            r8 = r5
        L_0x005e:
            float r8 = p005b.p006a.p007a.p024o.C0820c.m322v(r8, r2)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r3.<init>(r4, r6, r7, r8)
            if (r4 == 0) goto L_0x0070
            float r4 = r4.floatValue()
            goto L_0x0071
        L_0x0070:
            r4 = r5
        L_0x0071:
            java.lang.Float r6 = r3.f10991c
            if (r6 == 0) goto L_0x007a
            float r6 = r6.floatValue()
            goto L_0x007b
        L_0x007a:
            r6 = r5
        L_0x007b:
            float r4 = r4 + r6
            int r4 = (int) r4
            int r1 = r1 - r4
            java.lang.Float r4 = r3.f10990b
            if (r4 == 0) goto L_0x0087
            float r4 = r4.floatValue()
            goto L_0x0088
        L_0x0087:
            r4 = r5
        L_0x0088:
            java.lang.Float r6 = r3.f10992d
            if (r6 == 0) goto L_0x0091
            float r6 = r6.floatValue()
            goto L_0x0092
        L_0x0091:
            r6 = r5
        L_0x0092:
            float r4 = r4 + r6
            int r4 = (int) r4
            int r2 = r2 - r4
            com.appfoundry.previewer.model.Shadow r4 = r0.f11165z
            r6 = 0
            if (r4 == 0) goto L_0x009d
            java.lang.Float r7 = r4.f11105b
            goto L_0x009e
        L_0x009d:
            r7 = r6
        L_0x009e:
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x00b9
            java.lang.Float r4 = r4.f11105b
            float r4 = r4.floatValue()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
            com.appfoundry.previewer.model.Shadow r4 = r0.f11165z
            java.lang.Float r4 = r4.f11105b
            float r4 = r4.floatValue()
            float r7 = (float) r1
            float r4 = r4 * r7
            float r4 = r4 / r8
            r14 = r4
            goto L_0x00ba
        L_0x00b9:
            r14 = r5
        L_0x00ba:
            float r1 = (float) r1
            r4 = 2
            float r4 = (float) r4
            float r4 = r4 * r14
            float r7 = r1 + r4
            int r10 = (int) r7
            float r2 = (float) r2
            float r2 = r2 + r4
            int r11 = (int) r2
            com.appfoundry.previewer.model.Shadow r2 = r0.f11165z
            if (r2 == 0) goto L_0x00cf
            com.appfoundry.previewer.model.ShadowOffset r4 = r2.f11106c
            if (r4 == 0) goto L_0x00cf
            java.lang.Float r4 = r4.f11107a
            goto L_0x00d0
        L_0x00cf:
            r4 = r6
        L_0x00d0:
            if (r4 == 0) goto L_0x00de
            com.appfoundry.previewer.model.ShadowOffset r2 = r2.f11106c
            java.lang.Float r2 = r2.f11107a
            float r2 = r2.floatValue()
            float r2 = r2 * r1
            float r2 = r2 / r8
            r15 = r2
            goto L_0x00df
        L_0x00de:
            r15 = r5
        L_0x00df:
            com.appfoundry.previewer.model.Shadow r2 = r0.f11165z
            if (r2 == 0) goto L_0x00ea
            com.appfoundry.previewer.model.ShadowOffset r4 = r2.f11106c
            if (r4 == 0) goto L_0x00ea
            java.lang.Float r4 = r4.f11108b
            goto L_0x00eb
        L_0x00ea:
            r4 = r6
        L_0x00eb:
            if (r4 == 0) goto L_0x00fa
            com.appfoundry.previewer.model.ShadowOffset r2 = r2.f11106c
            java.lang.Float r2 = r2.f11108b
            float r2 = r2.floatValue()
            float r2 = r2 * r1
            float r2 = r2 / r8
            r16 = r2
            goto L_0x00fc
        L_0x00fa:
            r16 = r5
        L_0x00fc:
            java.lang.Float r1 = r3.f10989a
            if (r1 == 0) goto L_0x010a
            float r1 = r1.floatValue()
            float r1 = r1 - r14
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x010b
        L_0x010a:
            r1 = r6
        L_0x010b:
            java.lang.Float r2 = r3.f10990b
            if (r2 == 0) goto L_0x0119
            float r2 = r2.floatValue()
            float r2 = r2 - r14
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x011a
        L_0x0119:
            r2 = r6
        L_0x011a:
            java.lang.Float r4 = r3.f10991c
            if (r4 == 0) goto L_0x0128
            float r4 = r4.floatValue()
            float r4 = r4 - r14
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0129
        L_0x0128:
            r4 = r6
        L_0x0129:
            java.lang.Float r3 = r3.f10992d
            if (r3 == 0) goto L_0x0136
            float r3 = r3.floatValue()
            float r3 = r3 - r14
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
        L_0x0136:
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0155
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x014a
            if (r4 == 0) goto L_0x0155
            float r3 = r4.floatValue()
            float r3 = r3 - r15
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            goto L_0x0155
        L_0x014a:
            if (r1 == 0) goto L_0x0155
            float r1 = r1.floatValue()
            float r1 = r1 + r15
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L_0x0155:
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0176
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x016a
            if (r6 == 0) goto L_0x0176
            float r3 = r6.floatValue()
            float r3 = r3 - r16
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            goto L_0x0176
        L_0x016a:
            if (r2 == 0) goto L_0x0176
            float r2 = r2.floatValue()
            float r2 = r2 + r16
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0176:
            m485I0(r18)
            com.appfoundry.previewer.model.Dimensions r12 = new com.appfoundry.previewer.model.Dimensions
            r12.<init>(r1, r2, r4, r6)
            b.a.a.j.k r1 = new b.a.a.j.k
            com.appfoundry.previewer.model.Shadow r2 = r0.f11165z
            if (r2 == 0) goto L_0x018d
            java.lang.String r2 = r2.f11104a
            if (r2 == 0) goto L_0x018d
            int r2 = p005b.p006a.p007a.p018i.C0756o.m233k(r2)
            goto L_0x0190
        L_0x018d:
            r2 = -7829368(0xffffffffff888888, float:NaN)
        L_0x0190:
            r13 = r2
            float[] r17 = m547v(r0, r10)
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m492N(com.appfoundry.previewer.model.Style, int, int):b.a.a.j.k");
    }

    /* renamed from: O */
    public static final C6768j<int[], float[]> m493O(Style style) {
        C6888i.m12438e(style, "$this$getStopsAndPositions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<GradientColorStop> list = style.f11160u;
        if (list != null) {
            for (GradientColorStop next : list) {
                String str = next.f11014a;
                if (str != null) {
                    arrayList.add(Integer.valueOf(C0756o.m233k(str)));
                }
                arrayList2.add(Float.valueOf(next.f11015b));
            }
        }
        int i = 0;
        if (arrayList.size() == 1) {
            if (arrayList2.size() == 1) {
                arrayList.add(arrayList.get(0));
                arrayList2.add(arrayList2.get(0));
            } else {
                int size = arrayList2.size() - 1;
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        arrayList.add(arrayList.get(0));
                        if (i2 == size) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        int[] W = C6790h.m12336W(arrayList);
        C6888i.m12438e(arrayList2, "$this$toFloatArray");
        float[] fArr = new float[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return new C6768j<>(W, fArr);
    }

    /* renamed from: P */
    public static final int m494P(Context context) {
        List<Container> list;
        int A;
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
        Page K = m488K();
        if (K == null || (list = K.f11038f) == null) {
            return 0;
        }
        int i = 0;
        for (Container container : list) {
            Float f = null;
            Style O = C0823f.m346O(container.f10969c, (Boolean) null, 2);
            if (O != null) {
                f = O.f11149j;
            }
            if (f != null && (A = m468A(O, false)) > i) {
                i = A;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static final String m495Q(List<String> list, String str) {
        C6888i.m12438e(list, "$this$getTagWithName");
        C6888i.m12438e(str, "name");
        for (String next : list) {
            if (C7694h.m13924b(next, str, true)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: R */
    public static final String m496R(Actions actions) {
        Params params;
        C6888i.m12438e(actions, "$this$getUrl");
        Tap tap = actions.f10886a;
        if (tap == null || (params = tap.f11167b) == null) {
            return null;
        }
        return params.f11061a;
    }

    /* renamed from: S */
    public static final String m497S(List<String> list, String str, boolean z) {
        C6888i.m12438e(list, "$this$getValueFor");
        C6888i.m12438e(str, "actionType");
        for (String next : list) {
            if (C7694h.m13924b(next, str + ':', z) && !C7694h.m13924b(next, "action:", z)) {
                String substring = next.substring(C7694h.m13934l(next, ":", 0, false, 6) + 1, next.length());
                C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return null;
    }

    /* renamed from: T */
    public static final Size m498T(FrameLayout.LayoutParams layoutParams, int i, int i2) {
        C6888i.m12438e(layoutParams, "$this$getWidthAndHeight");
        return new Size(Integer.valueOf(i - (layoutParams.rightMargin + layoutParams.leftMargin)), Integer.valueOf(i2 - (layoutParams.bottomMargin + layoutParams.topMargin)));
    }

    /* renamed from: U */
    public static final boolean m499U() {
        return !C0820c.m324x() && m509c() != null && (C6888i.m12434a(m509c(), "") ^ true);
    }

    /* renamed from: V */
    public static final boolean m500V(List<String> list) {
        C6888i.m12438e(list, "$this$hasAspectRatioScreenTag");
        return (m495Q(list, "display:fullscreen") == null && m495Q(list, "aspectratio:screen") == null) ? false : true;
    }

    /* renamed from: W */
    public static final boolean m501W(Style style) {
        C6888i.m12438e(style, "$this$hasBackgroundColor");
        String str = style.f11142c;
        if (str == null || !(!C6888i.m12434a(str, ""))) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public static final boolean m502X(Style style) {
        C6888i.m12438e(style, "$this$hasBorder");
        Float f = style.f11163x;
        if (f == null || f.floatValue() <= ((float) 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r4 = r4.f11125B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = r4.f11125B;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m503Y(com.appfoundry.previewer.model.Style r4) {
        /*
            java.lang.String r0 = "$this$hasBorderOrRoundedCorners"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            java.lang.Float r0 = r4.f11163x
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            float r0 = r0.floatValue()
            float r3 = (float) r2
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
        L_0x0014:
            java.lang.String r0 = "$this$hasRoundedCorners"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            java.lang.Float r0 = r4.f11124A
            if (r0 == 0) goto L_0x0026
            float r0 = r0.floatValue()
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x003c
        L_0x0026:
            java.util.List<java.lang.Float> r0 = r4.f11125B
            if (r0 == 0) goto L_0x003e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x003e
            java.util.List<java.lang.Float> r4 = r4.f11125B
            if (r4 == 0) goto L_0x003e
            int r4 = r4.size()
            r0 = 4
            if (r4 != r0) goto L_0x003e
        L_0x003c:
            r4 = r1
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            if (r4 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m503Y(com.appfoundry.previewer.model.Style):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.f11124A;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m504Z(com.appfoundry.previewer.model.Style r1) {
        /*
            java.lang.String r0 = "$this$hasBorderRadius"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.util.List<java.lang.Float> r0 = r1.f11125B
            if (r0 != 0) goto L_0x0019
            java.lang.Float r1 = r1.f11124A
            if (r1 == 0) goto L_0x0017
            float r1 = r1.floatValue()
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r1 = 0
            goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m504Z(com.appfoundry.previewer.model.Style):boolean");
    }

    /* renamed from: a */
    public static final Context m505a() {
        return BravoApp.f10730N.mo18362b();
    }

    /* renamed from: a0 */
    public static final boolean m506a0() {
        return !C0820c.m324x() && m515f() != null && (C6888i.m12434a(m515f(), "") ^ true);
    }

    /* renamed from: b */
    public static final String m507b() {
        String string = m505a().getString(R.string.app_id);
        C6888i.m12437d(string, "appContext().getString(R.string.app_id)");
        return string;
    }

    /* renamed from: b0 */
    public static final boolean m508b0(List<String> list, String str) {
        C6888i.m12438e(list, "$this$hasTagWithName");
        C6888i.m12438e(str, "name");
        for (String b : list) {
            if (C7694h.m13924b(b, str, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final String m509c() {
        C0817f fVar = C0817f.f641b;
        StringBuilder sb = new StringBuilder();
        Context a = m505a();
        C6888i.m12437d(a, "appContext()");
        sb.append(a.getPackageName());
        sb.append(C0823f.m332B());
        sb.append("app_oauth_token");
        return C0817f.m294b(sb.toString());
    }

    /* renamed from: c0 */
    public static final void m510c0(AppCompatActivity appCompatActivity) {
        DrawerLayout drawerLayout;
        C6888i.m12438e(appCompatActivity, "$this$hideMenu");
        if (C6888i.m12434a(m490L(), "menu:tabs")) {
            FrameLayout frameLayout = (FrameLayout) appCompatActivity.findViewById(R.id.tab_menu);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else if ((C6888i.m12434a(m490L(), "menu:slide") || C6888i.m12434a(m490L(), "menu:side")) && (drawerLayout = (DrawerLayout) appCompatActivity.findViewById(R.id.drawer_menu)) != null) {
            drawerLayout.setDrawerLockMode(1);
        }
    }

    /* renamed from: d */
    public static final boolean m511d() {
        C0817f fVar = C0817f.f641b;
        return C0817f.m296d("app_process_id") != Process.myPid();
    }

    /* renamed from: d0 */
    public static final void m512d0(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, "$this$hideStatusBar");
        appCompatActivity.getWindow().setFlags(1024, 1024);
    }

    /* renamed from: e */
    public static final String m513e() {
        C0817f fVar = C0817f.f641b;
        return C0817f.m294b("auth_token");
    }

    /* renamed from: e0 */
    public static final void m514e0(FragmentManager fragmentManager, C6862l<? super FragmentTransaction, ? extends FragmentTransaction> lVar) {
        C6888i.m12438e(fragmentManager, "$this$inTransaction");
        C6888i.m12438e(lVar, "func");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        C6888i.m12437d(beginTransaction, "beginTransaction()");
        ((FragmentTransaction) lVar.invoke(beginTransaction)).addToBackStack((String) null).commitAllowingStateLoss();
    }

    /* renamed from: f */
    public static final String m515f() {
        C0817f fVar = C0817f.f641b;
        StringBuilder sb = new StringBuilder();
        Context a = m505a();
        C6888i.m12437d(a, "appContext()");
        sb.append(a.getPackageName());
        sb.append(C0823f.m332B());
        sb.append("bravo_id_token");
        return C0817f.m294b(sb.toString());
    }

    /* renamed from: f0 */
    public static final boolean m516f0(Style style) {
        C6888i.m12438e(style, "$this$isBold");
        Integer num = style.f11132I;
        return num != null && num.intValue() > 400;
    }

    /* renamed from: g */
    public static final float m517g(Style style, int i, int i2) {
        Float f;
        C6888i.m12438e(style, "$this$calculateRadius");
        Coordinate H = m482H(style, i, i2);
        Coordinate G = m480G(style, i, i2);
        if (H.f10982a == null || H.f10983b == null || (f = G.f10982a) == null || G.f10983b == null) {
            return 0.0f;
        }
        return (float) Math.sqrt((double) (((G.f10983b.floatValue() - H.f10983b.floatValue()) * (G.f10983b.floatValue() - H.f10983b.floatValue())) + ((G.f10982a.floatValue() - H.f10982a.floatValue()) * (f.floatValue() - H.f10982a.floatValue()))));
    }

    /* renamed from: g0 */
    public static final boolean m518g0(Style style) {
        C6888i.m12438e(style, "$this$isFlexo");
        return style.f11126C != null;
    }

    /* renamed from: h */
    public static final void m519h() {
        C0817f fVar = C0817f.f641b;
        StringBuilder u = C0843a.m460u("intro_already_displayed_");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        JsonApp jsonApp = BravoApp.f10738n;
        u.append(jsonApp != null ? jsonApp.f11018a : null);
        C0817f.m293a(u.toString());
        BravoApp.f10738n = null;
        bVar.mo18365e();
        C0817f.m293a("current_json");
    }

    /* renamed from: h0 */
    public static final String m520h0(int i) {
        String str;
        String str2;
        int i2 = i / 3600000;
        int i3 = i % 3600000;
        int i4 = i3 / 60000;
        int i5 = (i3 % 60000) / 1000;
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(':');
            str = sb.toString();
        } else {
            str = "";
        }
        if (i5 < 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i5);
            str2 = sb2.toString();
        } else {
            str2 = C0843a.m444e("", i5);
        }
        return str + i4 + ':' + str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r5.f10990b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p005b.p006a.p007a.p019j.C0771b m521i(com.appfoundry.previewer.model.Dimensions r5, int r6, int r7, boolean r8, int r9) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x000c
            java.lang.Float r1 = r5.f10990b
            if (r1 == 0) goto L_0x000c
            float r1 = r1.floatValue()
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            float r1 = p005b.p006a.p007a.p024o.C0820c.m322v(r1, r7)
            if (r5 == 0) goto L_0x001c
            java.lang.Float r2 = r5.f10992d
            if (r2 == 0) goto L_0x001c
            float r2 = r2.floatValue()
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            float r2 = p005b.p006a.p007a.p024o.C0820c.m322v(r2, r7)
            if (r8 == 0) goto L_0x0026
            float r8 = (float) r9
            float r2 = r2 - r8
            goto L_0x002a
        L_0x0026:
            if (r9 == 0) goto L_0x002a
            float r8 = (float) r9
            float r2 = r2 + r8
        L_0x002a:
            com.appfoundry.previewer.model.Dimensions r8 = new com.appfoundry.previewer.model.Dimensions
            if (r5 == 0) goto L_0x0037
            java.lang.Float r9 = r5.f10989a
            if (r9 == 0) goto L_0x0037
            float r9 = r9.floatValue()
            goto L_0x0038
        L_0x0037:
            r9 = r0
        L_0x0038:
            float r9 = p005b.p006a.p007a.p024o.C0820c.m322v(r9, r6)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            if (r5 == 0) goto L_0x004b
            java.lang.Float r3 = r5.f10990b
            if (r3 == 0) goto L_0x004b
            float r3 = r3.floatValue()
            goto L_0x004c
        L_0x004b:
            r3 = r0
        L_0x004c:
            float r3 = p005b.p006a.p007a.p024o.C0820c.m322v(r3, r7)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            if (r5 == 0) goto L_0x005f
            java.lang.Float r5 = r5.f10991c
            if (r5 == 0) goto L_0x005f
            float r5 = r5.floatValue()
            goto L_0x0060
        L_0x005f:
            r5 = r0
        L_0x0060:
            float r5 = p005b.p006a.p007a.p024o.C0820c.m322v(r5, r6)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r8.<init>(r9, r3, r5, r4)
            r5 = 0
            float r5 = (float) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0076
            float r1 = r1 + r2
        L_0x0076:
            b.a.a.j.b r5 = new b.a.a.j.b
            if (r9 == 0) goto L_0x007f
            float r9 = r9.floatValue()
            goto L_0x0080
        L_0x007f:
            r9 = r0
        L_0x0080:
            java.lang.Float r2 = r8.f10991c
            if (r2 == 0) goto L_0x0089
            float r2 = r2.floatValue()
            goto L_0x008a
        L_0x0089:
            r2 = r0
        L_0x008a:
            float r9 = r9 + r2
            int r9 = (int) r9
            int r6 = r6 - r9
            java.lang.Float r9 = r8.f10990b
            if (r9 == 0) goto L_0x0096
            float r9 = r9.floatValue()
            goto L_0x0097
        L_0x0096:
            r9 = r0
        L_0x0097:
            java.lang.Float r2 = r8.f10992d
            if (r2 == 0) goto L_0x009f
            float r0 = r2.floatValue()
        L_0x009f:
            float r9 = r9 + r0
            int r9 = (int) r9
            int r7 = r7 - r9
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            r5.<init>(r6, r7, r8, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m521i(com.appfoundry.previewer.model.Dimensions, int, int, boolean, int):b.a.a.j.b");
    }

    /* renamed from: i0 */
    public static final void m522i0(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, "$this$modifyEnterTransition");
        appCompatActivity.overridePendingTransition(R.anim.enter_100_from_bottom, R.anim.quiet);
    }

    /* renamed from: j */
    public static /* synthetic */ C0771b m523j(Dimensions dimensions, int i, int i2, boolean z, int i3, int i4) {
        if ((i4 & 8) != 0) {
            z = false;
        }
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        return m521i(dimensions, i, i2, z, i3);
    }

    /* renamed from: j0 */
    public static final void m524j0(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, "$this$modifyExitTransition");
        appCompatActivity.overridePendingTransition(0, R.anim.exit_100_to_bottom);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r5.f10989a;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Dimensions m525k(com.appfoundry.previewer.model.Dimensions r5, int r6) {
        /*
            com.appfoundry.previewer.model.Dimensions r0 = new com.appfoundry.previewer.model.Dimensions
            r1 = 0
            if (r5 == 0) goto L_0x000e
            java.lang.Float r2 = r5.f10989a
            if (r2 == 0) goto L_0x000e
            float r2 = r2.floatValue()
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            float r2 = p005b.p006a.p007a.p024o.C0820c.m322v(r2, r6)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            if (r5 == 0) goto L_0x0022
            java.lang.Float r3 = r5.f10990b
            if (r3 == 0) goto L_0x0022
            float r3 = r3.floatValue()
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            float r3 = p005b.p006a.p007a.p024o.C0820c.m322v(r3, r6)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            if (r5 == 0) goto L_0x0036
            java.lang.Float r4 = r5.f10991c
            if (r4 == 0) goto L_0x0036
            float r4 = r4.floatValue()
            goto L_0x0037
        L_0x0036:
            r4 = r1
        L_0x0037:
            float r4 = p005b.p006a.p007a.p024o.C0820c.m322v(r4, r6)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            if (r5 == 0) goto L_0x0049
            java.lang.Float r5 = r5.f10992d
            if (r5 == 0) goto L_0x0049
            float r1 = r5.floatValue()
        L_0x0049:
            float r5 = p005b.p006a.p007a.p024o.C0820c.m322v(r1, r6)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r0.<init>(r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m525k(com.appfoundry.previewer.model.Dimensions, int):com.appfoundry.previewer.model.Dimensions");
    }

    /* renamed from: k0 */
    public static final boolean m526k0(int i) {
        return i == -1;
    }

    /* renamed from: l */
    public static final int m527l(Style style, float f) {
        C6888i.m12438e(style, "$this$containerWidth");
        Float f2 = style.f11148i;
        if (f2 == null) {
            return 0;
        }
        return (int) (((float) (C0820c.m325y() * ((int) ((f2.floatValue() * f) / 100.0f)))) / 100.0f);
    }

    /* renamed from: l0 */
    public static final void m528l0(BravoActivity bravoActivity) {
        C6888i.m12438e(bravoActivity, "$this$onLongPressActivity");
        Intent intent = new Intent(bravoActivity, LongPressActivity.class);
        bravoActivity.getIntent().addFlags(67108864);
        bravoActivity.getIntent().addFlags(131072);
        bravoActivity.startActivity(intent);
    }

    /* renamed from: m */
    public static final Drawable m529m(Style style, int i) {
        Integer num;
        C6888i.m12438e(style, "$this$createBackgroundWithBorders");
        m485I0(style);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Float f = style.f11163x;
        if (f != null && f.floatValue() > ((float) 0)) {
            int floatValue = (int) ((style.f11163x.floatValue() * ((float) i)) / 100.0f);
            String str = style.f11164y;
            gradientDrawable.setStroke(floatValue, str != null ? C0756o.m233k(str) : ViewCompat.MEASURED_STATE_MASK);
        }
        String str2 = style.f11142c;
        if (str2 != null) {
            gradientDrawable.setColor(C0756o.m233k(str2));
        }
        if (!(style.f11125B == null || (num = style.f11138O) == null)) {
            gradientDrawable.setCornerRadii(m547v(style, num.intValue()));
        }
        return gradientDrawable;
    }

    /* renamed from: m0 */
    public static final void m530m0(BravoActivity bravoActivity, String str, boolean z, boolean z2) {
        C6888i.m12438e(bravoActivity, "$this$openModalActivity");
        Intent intent = new Intent(bravoActivity, ModalActivity.class);
        intent.putExtra("page_id", str);
        intent.putExtra("building_intro_from_shake_page", z2);
        if (z) {
            intent.putExtra("is_menu", z);
        }
        bravoActivity.startActivity(intent);
    }

    /* renamed from: n */
    public static final C0628f m531n(Style style, int i) {
        C6888i.m12438e(style, "$this$createCornerRadiiTransformation");
        m485I0(style);
        if (style.f11125B != null) {
            return new C0628f(m547v(style, i));
        }
        Float f = style.f11124A;
        C6888i.m12436c(f);
        return new C0628f((f.floatValue() * ((float) i)) / 100.0f);
    }

    /* renamed from: n0 */
    public static final String m532n0(Asset asset) {
        C6888i.m12438e(asset, "$this$path");
        return m472C() + asset.f10895a;
    }

    /* renamed from: o */
    public static final Fragment m533o(BravoActivity bravoActivity) {
        C6888i.m12438e(bravoActivity, "$this$currentlyVisibleFragment");
        FragmentManager supportFragmentManager = bravoActivity.getSupportFragmentManager();
        C6888i.m12437d(supportFragmentManager, "supportFragmentManager");
        List<Fragment> fragments = supportFragmentManager.getFragments();
        C6888i.m12437d(fragments, "supportFragmentManager.fragments");
        return (Fragment) C6790h.m12371y(fragments);
    }

    /* renamed from: o0 */
    public static final String m534o0(ResponseBody responseBody) {
        C6888i.m12438e(responseBody, "$this$printError");
        String str = "Error " + responseBody.f11096a + ": " + responseBody.f11097b;
        String str2 = responseBody.f11098c;
        boolean z = true;
        if (str2 != null) {
            if (str2.length() > 0) {
                StringBuilder y = C0843a.m464y(str, ". ");
                y.append(responseBody.f11098c);
                str = y.toString();
            }
        }
        String str3 = responseBody.f11099d;
        if (str3 != null) {
            if (str3.length() <= 0) {
                z = false;
            }
            if (z) {
                str = C0843a.m454o(C0843a.m464y(str, " ("), responseBody.f11099d, ')');
            }
        }
        return C6888i.m12434a(str, "") ? "Unknown error. Please contact support@bravostudio.app" : str;
    }

    /* renamed from: p */
    public static final byte[] m535p(String str) {
        C6888i.m12438e(str, "hexString");
        if (str.length() % 2 != 1) {
            byte[] bArr = new byte[(str.length() / 2)];
            int i = 0;
            while (i < str.length()) {
                int i2 = i / 2;
                int i3 = i + 2;
                String substring = str.substring(i, i3);
                C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                C6888i.m12438e(substring, "hexString");
                bArr[i2] = (byte) ((m481G0(substring.charAt(0)) << 4) + m481G0(substring.charAt(1)));
                i = i3;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Invalid hexadecimal String supplied.".toString());
    }

    /* renamed from: p0 */
    public static final void m536p0(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, "$this$registerInEventBus");
        if (!C8068c.m14948b().mo26007f(appCompatActivity)) {
            C8068c.m14948b().mo26012k(appCompatActivity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p005b.p291q.p292a.C5266a.m9877S(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        p005b.p291q.p292a.C5266a.m9877S(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        throw r3;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Boolean m537q(com.appfoundry.previewer.model.Asset r5) {
        /*
            java.lang.String r0 = "$this$download"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            java.lang.String r0 = r5.f10896b
            r1 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.String r5 = m532n0(r5)
            java.lang.String r2 = "$this$saveTo"
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            java.lang.String r2 = "path"
            p298d.p344x.p346c.C6888i.m12438e(r5, r2)
            r2 = 1
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x004b }
            r3.<init>(r0)     // Catch:{ Exception -> 0x004b }
            java.io.InputStream r0 = r3.openStream()     // Catch:{ Exception -> 0x004b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0044 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0044 }
            r4.<init>(r5)     // Catch:{ all -> 0x0044 }
            r3.<init>(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "input"
            p298d.p344x.p346c.C6888i.m12437d(r0, r4)     // Catch:{ all -> 0x003d }
            r4 = 8192(0x2000, float:1.14794E-41)
            p005b.p291q.p292a.C5266a.m9972j0(r0, r3, r4)     // Catch:{ all -> 0x003d }
            p005b.p291q.p292a.C5266a.m9877S(r3, r1)     // Catch:{ all -> 0x0044 }
            p005b.p291q.p292a.C5266a.m9877S(r0, r1)     // Catch:{ Exception -> 0x004b }
            goto L_0x0060
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r4 = move-exception
            p005b.p291q.p292a.C5266a.m9877S(r3, r1)     // Catch:{ all -> 0x0044 }
            throw r4     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r3 = move-exception
            p005b.p291q.p292a.C5266a.m9877S(r0, r1)     // Catch:{ Exception -> 0x004b }
            throw r3     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            java.lang.String r5 = r0.getLocalizedMessage()
            r1[r2] = r5
            p.a.a$b r5 = p441p.p442a.C8091a.f16272d
            java.lang.String r0 = "ASSETCACHING saveTo: Error downloading %s: %s"
            r5.mo26044b(r0, r1)
            r2 = r3
        L_0x0060:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m537q(com.appfoundry.previewer.model.Asset):java.lang.Boolean");
    }

    /* renamed from: q0 */
    public static final void m538q0(FragmentActivity fragmentActivity, Fragment fragment) {
        C6888i.m12438e(fragmentActivity, "$this$removeLoadingFragment");
        C6888i.m12438e(fragment, "fragment");
        fragmentActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
        FrameLayout frameLayout = (FrameLayout) fragmentActivity.findViewById(R.id.containerLoading);
        if (frameLayout != null) {
            frameLayout.setBackground((Drawable) null);
        }
    }

    /* renamed from: r */
    public static final Fragment m539r(FragmentActivity fragmentActivity, String str) {
        C6888i.m12438e(fragmentActivity, "$this$findFragmentByTag");
        return fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
    }

    /* renamed from: r0 */
    public static final void m540r0(AppCompatActivity appCompatActivity, C0594b bVar, int i) {
        C6888i.m12438e(appCompatActivity, "$this$replaceFragment");
        if (bVar != null) {
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            C6888i.m12437d(supportFragmentManager, "supportFragmentManager");
            m514e0(supportFragmentManager, new C0741b(i, bVar));
            BravoApp.C5403b bVar2 = BravoApp.f10730N;
            Page page = bVar.f210g;
            String str = page != null ? page.f11033a : null;
            BravoApp.f10732h++;
            List<String> list = BravoApp.f10733i;
            if (str == null) {
                str = "";
            }
            list.add(str);
        }
    }

    /* renamed from: s */
    public static final Component m541s(String str) {
        List<Component> list;
        Component component;
        List<Component> list2;
        Container p = C0823f.m388p();
        if (p == null || (list = p.f10972f) == null) {
            return null;
        }
        for (Component next : list) {
            if (C6888i.m12434a(next.f10943e, str)) {
                return next;
            }
            States states = next.f10950l;
            if (!(states == null || (component = states.f11111a) == null || (list2 = component.f10951m) == null)) {
                for (Component component2 : list2) {
                    if (C6888i.m12434a(component2.f10943e, str)) {
                        return next;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: s0 */
    public static final void m542s0(AppCompatActivity appCompatActivity, Page page, int i) {
        C6888i.m12438e(appCompatActivity, "$this$replaceFragment");
        String str = null;
        C0594b d = page != null ? C0744e.m200d(page, (Boolean) null, 1) : null;
        if (d != null) {
            FragmentTransaction beginTransaction = appCompatActivity.getSupportFragmentManager().beginTransaction();
            if (C0744e.m216t(page, "transition:slide:left")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_right, R.anim.exit_30_to_left, R.anim.enter_30_from_left, R.anim.exit_100_to_right);
            } else if (C0744e.m216t(page, "transition:slide:up")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_bottom, R.anim.exit_30_to_top, R.anim.enter_30_from_top, R.anim.exit_100_to_bottom);
            } else if (C0744e.m216t(page, "transition:slide:down")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_top, R.anim.exit_30_to_bottom, R.anim.enter_30_from_bottom, R.anim.exit_100_to_top);
            } else if (C0744e.m216t(page, "transition:slide:right")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_left, R.anim.exit_30_to_right, R.anim.enter_30_from_right, R.anim.exit_100_to_left);
            } else if (C0744e.m216t(page, "transition:move:left")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_right, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_right);
            } else if (C0744e.m216t(page, "transition:move:up")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_bottom, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_bottom);
            } else if (C0744e.m216t(page, "transition:move:down")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_top, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_top);
            } else if (C0744e.m216t(page, "transition:move:right")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_left, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_left);
            } else if (C0744e.m216t(page, "transition:push:left")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_right, R.anim.exit_100_to_left, R.anim.enter_100_from_left, R.anim.exit_100_to_right);
            } else if (C0744e.m216t(page, "transition:push:up")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_bottom, R.anim.exit_100_to_top, R.anim.enter_100_from_top, R.anim.exit_100_to_bottom);
            } else if (C0744e.m216t(page, "transition:push:down")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_top, R.anim.exit_100_to_bottom, R.anim.enter_100_from_bottom, R.anim.exit_100_to_top);
            } else if (C0744e.m216t(page, "transition:push:right")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_left, R.anim.exit_100_to_right, R.anim.enter_100_from_right, R.anim.exit_100_to_left);
            } else if (!C0744e.m216t(page, "transition:dissolve") && C0744e.m216t(page, "transition:instant")) {
                beginTransaction.setCustomAnimations(R.anim.quiet, R.anim.quiet, R.anim.quiet, R.anim.quiet);
            } else {
                beginTransaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
            }
            beginTransaction.replace(i, d, page.f11033a).addToBackStack((String) null).commitAllowingStateLoss();
            BravoApp.C5403b bVar = BravoApp.f10730N;
            Page page2 = d.f210g;
            if (page2 != null) {
                str = page2.f11033a;
            }
            BravoApp.f10732h++;
            List<String> list = BravoApp.f10733i;
            if (str == null) {
                str = "";
            }
            list.add(str);
            C8091a.f16272d.mo26043a("NavigatedPages: current list: \n%s", bVar.mo18364d());
        }
    }

    /* renamed from: t */
    public static final String m543t() {
        C0817f fVar = C0817f.f641b;
        StringBuilder sb = new StringBuilder();
        Context a = m505a();
        C6888i.m12437d(a, "appContext()");
        sb.append(a.getPackageName());
        sb.append(C0823f.m332B());
        sb.append("firebase_id_token");
        return C0817f.m294b(sb.toString());
    }

    /* renamed from: t0 */
    public static final void m544t0(C3663f fVar) {
        if (fVar != null) {
            C0817f fVar2 = C0817f.f641b;
            StringBuilder sb = new StringBuilder();
            Context a = m505a();
            C6888i.m12437d(a, "appContext()");
            sb.append(a.getPackageName());
            sb.append(C0823f.m332B());
            sb.append("app_oauth_token");
            String sb2 = sb.toString();
            String accessToken = fVar.getAccessToken();
            C6888i.m12437d(accessToken, "credential.accessToken");
            C0817f.m298f(sb2, accessToken);
            StringBuilder sb3 = new StringBuilder();
            Context a2 = m505a();
            C6888i.m12437d(a2, "appContext()");
            sb3.append(a2.getPackageName());
            sb3.append(C0823f.m332B());
            sb3.append("refreshToken");
            String sb4 = sb3.toString();
            String refreshToken = fVar.getRefreshToken();
            C6888i.m12437d(refreshToken, "credential.refreshToken");
            C0817f.m298f(sb4, refreshToken);
            StringBuilder sb5 = new StringBuilder();
            Context a3 = m505a();
            C6888i.m12437d(a3, "appContext()");
            sb5.append(a3.getPackageName());
            sb5.append(C0823f.m332B());
            sb5.append("expirationTimeMilliseconds");
            C0817f.m298f(sb5.toString(), String.valueOf(fVar.getExpirationTimeMilliseconds().longValue()));
        }
    }

    /* renamed from: u */
    public static final boolean m545u() {
        C0817f fVar = C0817f.f641b;
        StringBuilder sb = new StringBuilder();
        Context a = m505a();
        C6888i.m12437d(a, "appContext()");
        sb.append(a.getPackageName());
        sb.append("after_logout");
        return C0817f.m295c(sb.toString());
    }

    /* renamed from: u0 */
    public static final void m546u0() {
        C0817f fVar = C0817f.f641b;
        StringBuilder sb = new StringBuilder();
        Context a = m505a();
        C6888i.m12437d(a, "appContext()");
        sb.append(a.getPackageName());
        sb.append(C0823f.m332B());
        sb.append("app_user_logged_in");
        C0817f.m297e(sb.toString());
    }

    /* renamed from: v */
    public static final float[] m547v(Style style, int i) {
        float f;
        float f2;
        float f3;
        C6888i.m12438e(style, "$this$generateCornerRadii");
        List<Float> list = style.f11125B;
        Float f4 = null;
        float f5 = 0.0f;
        if ((list != null ? list.get(0) : null) != null) {
            List<Float> list2 = style.f11125B;
            Float f6 = list2 != null ? list2.get(0) : null;
            C6888i.m12436c(f6);
            f = (f6.floatValue() * ((float) i)) / 100.0f;
        } else {
            f = 0.0f;
        }
        List<Float> list3 = style.f11125B;
        if ((list3 != null ? list3.get(1) : null) != null) {
            List<Float> list4 = style.f11125B;
            Float f7 = list4 != null ? list4.get(1) : null;
            C6888i.m12436c(f7);
            f2 = (f7.floatValue() * ((float) i)) / 100.0f;
        } else {
            f2 = 0.0f;
        }
        List<Float> list5 = style.f11125B;
        if ((list5 != null ? list5.get(2) : null) != null) {
            List<Float> list6 = style.f11125B;
            Float f8 = list6 != null ? list6.get(2) : null;
            C6888i.m12436c(f8);
            f3 = (f8.floatValue() * ((float) i)) / 100.0f;
        } else {
            f3 = 0.0f;
        }
        List<Float> list7 = style.f11125B;
        if ((list7 != null ? list7.get(3) : null) != null) {
            List<Float> list8 = style.f11125B;
            if (list8 != null) {
                f4 = list8.get(3);
            }
            C6888i.m12436c(f4);
            f5 = (f4.floatValue() * ((float) i)) / 100.0f;
        }
        return new float[]{f, f, f2, f2, f3, f3, f5, f5};
    }

    /* renamed from: v0 */
    public static final int m548v0(Style style) {
        C6888i.m12438e(style, "$this$screenHeightInPixels");
        Float f = style.f11149j;
        if (f == null) {
            return 0;
        }
        float floatValue = f.floatValue();
        BravoApp.C5403b bVar = BravoApp.f10730N;
        return (int) ((floatValue * ((float) BravoApp.f10726J)) / 100.0f);
    }

    /* renamed from: w */
    public static final String m549w(List<String> list) {
        C6888i.m12438e(list, "$this$getActionTag");
        for (String next : list) {
            C6888i.m12438e(next, "$this$isActionTag");
            if (C7694h.m13924b(next, "action:", true)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: w0 */
    public static final int m550w0(Style style) {
        C6888i.m12438e(style, "$this$screenWidthInPixels");
        Float f = style.f11148i;
        if (f == null) {
            return 0;
        }
        C6888i.m12436c(f);
        return (int) ((f.floatValue() * ((float) C0820c.m325y())) / 100.0f);
    }

    /* renamed from: x */
    public static final String m551x(Actions actions, String str) {
        C6888i.m12438e(str, "actionInTags");
        if ((actions != null ? m496R(actions) : null) != null) {
            return m496R(actions);
        }
        C6888i.m12438e(str, "$this$getUrlFromTag");
        return C0756o.m226d(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.f10992d;
     */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m552x0(android.widget.FrameLayout.LayoutParams r4, com.appfoundry.previewer.model.Dimensions r5) {
        /*
            java.lang.String r0 = "$this$setComputedMargins"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            r0 = 0
            if (r5 == 0) goto L_0x0012
            java.lang.Float r1 = r5.f10992d
            if (r1 == 0) goto L_0x0012
            float r1 = r1.floatValue()
            int r1 = (int) r1
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            if (r5 == 0) goto L_0x001f
            java.lang.Float r2 = r5.f10989a
            if (r2 == 0) goto L_0x001f
            float r2 = r2.floatValue()
            int r2 = (int) r2
            goto L_0x0020
        L_0x001f:
            r2 = r0
        L_0x0020:
            if (r5 == 0) goto L_0x002c
            java.lang.Float r3 = r5.f10990b
            if (r3 == 0) goto L_0x002c
            float r3 = r3.floatValue()
            int r3 = (int) r3
            goto L_0x002d
        L_0x002c:
            r3 = r0
        L_0x002d:
            if (r5 == 0) goto L_0x0038
            java.lang.Float r5 = r5.f10991c
            if (r5 == 0) goto L_0x0038
            float r5 = r5.floatValue()
            int r0 = (int) r5
        L_0x0038:
            r4.setMargins(r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m552x0(android.widget.FrameLayout$LayoutParams, com.appfoundry.previewer.model.Dimensions):void");
    }

    /* renamed from: y */
    public static final ResponseBody m553y(C7850h0 h0Var) {
        String z;
        C6888i.m12438e(h0Var, "$this$getBodyAsObject");
        C7855j0 j0Var = h0Var.f15555m;
        if (!(j0Var == null || (z = j0Var.mo25572z()) == null)) {
            try {
                C0816e eVar = C0816e.f639l;
                return C0816e.f635h.mo16830b(z);
            } catch (C5079o e) {
                C8091a.f16272d.mo26044b("Exception %s parsing %s", e.getLocalizedMessage(), z);
            } catch (C5078n e2) {
                C8091a.f16272d.mo26044b("Exception %s parsing %s", e2.getLocalizedMessage(), z);
            }
        }
        return null;
    }

    /* renamed from: y0 */
    public static final void m554y0(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, "$this$setTransparentStatusBar");
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = appCompatActivity.getWindow();
            C6888i.m12437d(window, "window");
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        Window window2 = appCompatActivity.getWindow();
        C6888i.m12437d(window2, "window");
        View decorView = window2.getDecorView();
        C6888i.m12437d(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        Window window3 = appCompatActivity.getWindow();
        C6888i.m12437d(window3, "window");
        window3.setStatusBarColor(0);
    }

    /* renamed from: z */
    public static final String m555z(List<String> list) {
        C6888i.m12438e(list, "$this$getComponentTag");
        for (String next : list) {
            C6888i.m12438e(next, "$this$isComponentTag");
            if (C7694h.m13924b(next, "component:", true)) {
                return next;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: b.a.a.m.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: b.a.a.m.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: b.a.a.m.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: b.a.a.b.l.d.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: b.a.a.m.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: b.a.a.b.l.d.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: b.a.a.m.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.android.flexbox.FlexboxLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: androidx.recyclerview.widget.LinearLayoutManager} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r0v18, types: [b.a.a.b.l.d.d] */
    /* JADX WARNING: type inference failed for: r0v19, types: [b.a.a.b.l.d.f] */
    /* JADX WARNING: type inference failed for: r0v20, types: [b.a.a.b.l.d.e] */
    /* JADX WARNING: type inference failed for: r0v21, types: [b.a.a.b.l.d.d] */
    /* JADX WARNING: type inference failed for: r0v22, types: [b.a.a.b.l.d.f] */
    /* JADX WARNING: type inference failed for: r0v23, types: [b.a.a.b.l.d.e] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m556z0(androidx.recyclerview.widget.RecyclerView r18, java.lang.String r19, java.util.List r20, com.appfoundry.previewer.model.Animation r21, java.lang.Boolean r22, boolean r23, boolean r24, java.lang.Float r25, int r26) {
        /*
            r9 = r18
            r0 = r26 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r1
            goto L_0x000b
        L_0x0009:
            r0 = r21
        L_0x000b:
            r2 = r26 & 8
            if (r2 == 0) goto L_0x0013
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r13 = r2
            goto L_0x0015
        L_0x0013:
            r13 = r22
        L_0x0015:
            r2 = r26 & 16
            r3 = 0
            if (r2 == 0) goto L_0x001c
            r2 = r3
            goto L_0x001e
        L_0x001c:
            r2 = r23
        L_0x001e:
            r4 = r26 & 32
            if (r4 == 0) goto L_0x0025
            r17 = r3
            goto L_0x0027
        L_0x0025:
            r17 = r24
        L_0x0027:
            r4 = r26 & 64
            if (r4 == 0) goto L_0x0033
            r4 = 1120403456(0x42c80000, float:100.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r15 = r4
            goto L_0x0035
        L_0x0033:
            r15 = r25
        L_0x0035:
            java.lang.String r4 = "$this$setupWithFlexbox"
            p298d.p344x.p346c.C6888i.m12438e(r9, r4)
            android.content.Context r4 = r18.getContext()
            java.lang.String r8 = "context"
            p298d.p344x.p346c.C6888i.m12437d(r4, r8)
            if (r2 == 0) goto L_0x004b
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r4, r3, r3)
            goto L_0x005b
        L_0x004b:
            com.google.android.flexbox.FlexboxLayoutManager r2 = new com.google.android.flexbox.FlexboxLayoutManager
            r2.<init>(r4)
            r4 = 1
            r2.mo18816w(r4)
            r2.mo18815v(r3)
            r3 = 4
            r2.mo18814u(r3)
        L_0x005b:
            r9.setLayoutManager(r2)
            b.a.a.m.a r2 = new b.a.a.m.a
            r14 = 0
            r16 = 8
            r10 = r2
            r11 = r19
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = r0.getType()
        L_0x0071:
            if (r1 != 0) goto L_0x0076
        L_0x0073:
            r12 = r8
            goto L_0x0180
        L_0x0076:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1289167206: goto L_0x0162;
                case -1282132831: goto L_0x0142;
                case -1272587772: goto L_0x0124;
                case -795763400: goto L_0x0106;
                case -566947566: goto L_0x00e7;
                case -501084388: goto L_0x00c8;
                case 3536962: goto L_0x009e;
                case 1106799371: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0073
        L_0x007e:
            java.lang.String r3 = "slideright"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            b.a.a.b.l.d.e r10 = new b.a.a.b.l.d.e
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r11 = 44
            java.lang.String r5 = "right"
            r0 = r10
            r1 = r2
            r2 = r18
            r12 = r8
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x009e:
            r12 = r8
            java.lang.String r3 = "spin"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.g r1 = new b.a.a.b.l.d.g
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r0 = r0.getStrength()
            r6 = 28
            r19 = r1
            r20 = r2
            r21 = r18
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r2 = r1
            goto L_0x0180
        L_0x00c8:
            r12 = r8
            java.lang.String r3 = "slidebottom"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.f r10 = new b.a.a.b.l.d.f
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 44
            java.lang.String r5 = "bottom"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x00e7:
            r12 = r8
            java.lang.String r3 = "contract"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.d r10 = new b.a.a.b.l.d.d
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 28
            java.lang.String r6 = "contract"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x0106:
            r12 = r8
            java.lang.String r3 = "slideleft"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.e r10 = new b.a.a.b.l.d.e
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 44
            java.lang.String r5 = "left"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x0124:
            r12 = r8
            java.lang.String r3 = "slidetop"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.f r10 = new b.a.a.b.l.d.f
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 44
            java.lang.String r5 = "top"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x0142:
            r12 = r8
            java.lang.String r0 = "fadein"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0180
            b.a.a.b.l.d.a r0 = new b.a.a.b.l.d.a
            r1 = 0
            r3 = 0
            r4 = 12
            r19 = r0
            r20 = r2
            r21 = r18
            r22 = r1
            r23 = r3
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24)
            r2 = r0
            goto L_0x0180
        L_0x0162:
            r12 = r8
            java.lang.String r3 = "expand"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.d r10 = new b.a.a.b.l.d.d
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 28
            java.lang.String r6 = "expand"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x017f:
            r2 = r10
        L_0x0180:
            r9.setAdapter(r2)
            r0 = 20
            r9.setItemViewCacheSize(r0)
            java.lang.String r0 = m490L()
            java.lang.String r1 = "menu:tabs"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            if (r0 == 0) goto L_0x01a9
            if (r17 != 0) goto L_0x01a9
            b.a.a.i.p r0 = new b.a.a.i.p
            android.content.Context r1 = r18.getContext()
            p298d.p344x.p346c.C6888i.m12437d(r1, r12)
            int r1 = m494P(r1)
            r0.<init>(r1)
            r9.addItemDecoration(r0)
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0849e.m556z0(androidx.recyclerview.widget.RecyclerView, java.lang.String, java.util.List, com.appfoundry.previewer.model.Animation, java.lang.Boolean, boolean, boolean, java.lang.Float, int):void");
    }
}
