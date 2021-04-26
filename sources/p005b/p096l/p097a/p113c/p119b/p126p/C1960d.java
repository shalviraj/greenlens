package p005b.p096l.p097a.p113c.p119b.p126p;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.exifinterface.media.ExifInterface;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.google.android.gms.common.api.Status;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.onesignal.JobIntentService;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p040g.p041a.p046h.C0893n;
import p005b.p080i.p081a.C1422f;
import p005b.p096l.p097a.p113c.p119b.C1767i;
import p005b.p096l.p097a.p113c.p119b.C1768j;
import p005b.p096l.p097a.p113c.p119b.p128q.C1967a;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;
import p005b.p096l.p097a.p113c.p131e.p136e.C2030a8;
import p005b.p096l.p097a.p113c.p131e.p136e.C2048b1;
import p005b.p096l.p097a.p113c.p131e.p136e.C2071c;
import p005b.p096l.p097a.p113c.p131e.p136e.C2072c0;
import p005b.p096l.p097a.p113c.p131e.p136e.C2096d;
import p005b.p096l.p097a.p113c.p131e.p136e.C2116dj;
import p005b.p096l.p097a.p113c.p131e.p136e.C2122e0;
import p005b.p096l.p097a.p113c.p131e.p136e.C2144em;
import p005b.p096l.p097a.p113c.p131e.p136e.C2171g;
import p005b.p096l.p097a.p113c.p131e.p136e.C2196h;
import p005b.p096l.p097a.p113c.p131e.p136e.C2220hn;
import p005b.p096l.p097a.p113c.p131e.p136e.C2246j;
import p005b.p096l.p097a.p113c.p131e.p136e.C2279k8;
import p005b.p096l.p097a.p113c.p131e.p136e.C2283kc;
import p005b.p096l.p097a.p113c.p131e.p136e.C2293km;
import p005b.p096l.p097a.p113c.p131e.p136e.C2317lm;
import p005b.p096l.p097a.p113c.p131e.p136e.C2319m0;
import p005b.p096l.p097a.p113c.p131e.p136e.C2341mm;
import p005b.p096l.p097a.p113c.p131e.p136e.C2344n1;
import p005b.p096l.p097a.p113c.p131e.p136e.C2364nl;
import p005b.p096l.p097a.p113c.p131e.p136e.C2375o8;
import p005b.p096l.p097a.p113c.p131e.p136e.C2411pk;
import p005b.p096l.p097a.p113c.p131e.p136e.C2431qg;
import p005b.p096l.p097a.p113c.p131e.p136e.C2435qk;
import p005b.p096l.p097a.p113c.p131e.p136e.C2440r1;
import p005b.p096l.p097a.p113c.p131e.p136e.C2446r7;
import p005b.p096l.p097a.p113c.p131e.p136e.C2459rk;
import p005b.p096l.p097a.p113c.p131e.p136e.C2529ui;
import p005b.p096l.p097a.p113c.p131e.p136e.C2537v2;
import p005b.p096l.p097a.p113c.p131e.p136e.C2553vi;
import p005b.p096l.p097a.p113c.p131e.p136e.C2577wi;
import p005b.p096l.p097a.p113c.p131e.p136e.C2580wl;
import p005b.p096l.p097a.p113c.p131e.p136e.C2642zb;
import p005b.p096l.p097a.p113c.p131e.p136e.C2649zi;
import p005b.p096l.p097a.p113c.p131e.p139h.C2700d;
import p005b.p096l.p097a.p113c.p131e.p140i.C2710a3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2846k4;
import p005b.p096l.p097a.p113c.p131e.p140i.C2873m5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2888n7;
import p005b.p096l.p097a.p113c.p131e.p140i.C2899o5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2912p5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2913p6;
import p005b.p096l.p097a.p113c.p131e.p140i.C2924q4;
import p005b.p096l.p097a.p113c.p131e.p140i.C2937r4;
import p005b.p096l.p097a.p113c.p131e.p140i.C2939r6;
import p005b.p096l.p097a.p113c.p131e.p140i.C2975u3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2977u5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2988v3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2990v5;
import p005b.p096l.p097a.p113c.p131e.p140i.C3001w3;
import p005b.p096l.p097a.p113c.p131e.p140i.C3016x5;
import p005b.p096l.p097a.p113c.p131e.p140i.C3018x7;
import p005b.p096l.p097a.p113c.p131e.p140i.C3043z6;
import p005b.p096l.p097a.p113c.p131e.p140i.C3044z7;
import p005b.p096l.p097a.p113c.p142g.p143f.C3077a;
import p005b.p096l.p097a.p113c.p145h.p147b.C3165ea;
import p005b.p096l.p097a.p113c.p145h.p147b.C3269o3;
import p005b.p096l.p097a.p113c.p150j.C3423e0;
import p005b.p096l.p097a.p113c.p150j.C3426f0;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3430j;
import p005b.p096l.p097a.p113c.p150j.C3432k;
import p005b.p096l.p097a.p113c.p150j.C3433l;
import p005b.p096l.p097a.p113c.p150j.C3434m;
import p005b.p096l.p097a.p151d.p152a.p159e.C3577b0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3610s;
import p005b.p096l.p097a.p151d.p152a.p159e.C3612t;
import p005b.p096l.p097a.p151d.p152a.p159e.C3614u;
import p005b.p096l.p097a.p151d.p152a.p163i.C3638e;
import p005b.p096l.p097a.p151d.p152a.p163i.C3651r;
import p005b.p096l.p097a.p151d.p152a.p163i.C3652s;
import p005b.p096l.p175c.p176a.C3756b;
import p005b.p096l.p175c.p176a.C3757c;
import p005b.p096l.p175c.p176a.C3758d;
import p005b.p096l.p175c.p177b.C3792o;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p181a0.C3815a;
import p005b.p096l.p180d.p181a0.C3819e;
import p005b.p096l.p180d.p181a0.C3820f;
import p005b.p096l.p180d.p181a0.C3821g;
import p005b.p096l.p180d.p182n.p183a.C3840a;
import p005b.p096l.p180d.p185o.C3856a0;
import p005b.p096l.p180d.p185o.C3859c;
import p005b.p096l.p180d.p185o.C3863e;
import p005b.p096l.p180d.p185o.C3919n0;
import p005b.p096l.p180d.p185o.C3926r;
import p005b.p096l.p180d.p185o.C3928s;
import p005b.p096l.p180d.p185o.C3930t;
import p005b.p096l.p180d.p185o.C3938x;
import p005b.p096l.p180d.p185o.C3940y;
import p005b.p096l.p180d.p185o.C3941z;
import p005b.p096l.p180d.p190p.C3946c;
import p005b.p096l.p180d.p190p.C3948d;
import p005b.p096l.p180d.p190p.C3964o;
import p005b.p096l.p180d.p190p.C3965p;
import p005b.p096l.p180d.p190p.C3966q;
import p005b.p096l.p180d.p190p.C3967r;
import p005b.p096l.p180d.p190p.C3968s;
import p005b.p096l.p180d.p191q.p192f.p195g.C4006e0;
import p005b.p096l.p180d.p191q.p192f.p195g.C4010f0;
import p005b.p096l.p180d.p223z.C4325c;
import p005b.p096l.p232f.p246e0.p249e.C4609b;
import p005b.p265m.p266a.p267t.C4748i;
import p005b.p273o.C4783a3;
import p005b.p273o.C4805c3;
import p005b.p273o.C4810d0;
import p005b.p273o.C4815d3;
import p005b.p273o.C4820e0;
import p005b.p273o.C4835f2;
import p005b.p273o.C4839g;
import p005b.p273o.C4840g0;
import p005b.p273o.C4846g3;
import p005b.p273o.C4848h;
import p005b.p273o.C4849h0;
import p005b.p273o.C4855i0;
import p005b.p273o.C4856i1;
import p005b.p273o.C4857i2;
import p005b.p273o.C4916n1;
import p005b.p273o.C4941q;
import p005b.p273o.C4950r;
import p005b.p273o.C4976t;
import p005b.p273o.C5001v1;
import p005b.p273o.C5007w1;
import p005b.p273o.C5022x1;
import p005b.p273o.C5041y1;
import p005b.p273o.C5044y2;
import p005b.p273o.C5053z2;

/* renamed from: b.l.a.c.b.p.d */
public final class C1960d {

    /* renamed from: a */
    public static Boolean f3511a;

    /* renamed from: b */
    public static Boolean f3512b;

    /* renamed from: c */
    public static Boolean f3513c;

    /* renamed from: d */
    public static Context f3514d;

    /* renamed from: e */
    public static Boolean f3515e;

    /* renamed from: f */
    public static C3077a f3516f;

    /* renamed from: g */
    public static C2700d f3517g;

    /* renamed from: h */
    public static C3165ea f3518h;

    /* renamed from: A */
    public static void m2691A(@Nullable String str) {
        if (!"raw".equals(str)) {
            throw new IllegalArgumentException(C0843a.m451l("Unsupported resource type: ", str));
        }
    }

    /* renamed from: A0 */
    public static void m2692A0(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }

    /* renamed from: A1 */
    public static long m2693A1(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << 16))) & 4294967295L;
    }

    /* renamed from: A2 */
    public static int m2694A2(C2319m0<?> m0Var, int i, byte[] bArr, int i2, int i3, C2171g<?> gVar, C2144em emVar) {
        int s2 = m2848s2(m0Var, bArr, i2, i3, emVar);
        while (true) {
            gVar.add(emVar.f3839c);
            if (s2 >= i3) {
                break;
            }
            int V0 = m2759V0(bArr, s2, emVar);
            if (i != emVar.f3837a) {
                break;
            }
            s2 = m2848s2(m0Var, bArr, V0, i3, emVar);
        }
        return s2;
    }

    /* renamed from: B */
    public static int m2695B(@NonNull Context context, @NonNull String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    @NonNull
    /* renamed from: B0 */
    public static C4820e0 m2696B0(Context context, Bundle bundle) {
        boolean z;
        String str;
        Context context2 = context;
        Bundle bundle2 = bundle;
        C4820e0 e0Var = new C4820e0();
        if (!m2838q0(bundle)) {
            return e0Var;
        }
        e0Var.f9243a = true;
        if (bundle2.containsKey("o")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle2.getString("custom"));
                JSONObject jSONObject2 = jSONObject.has("a") ? jSONObject.getJSONObject("a") : new JSONObject();
                JSONArray jSONArray = new JSONArray(bundle2.getString("o"));
                bundle2.remove("o");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString(C0893n.f779k);
                    jSONObject3.remove(C0893n.f779k);
                    if (jSONObject3.has(C4748i.f9096b)) {
                        String string2 = jSONObject3.getString(C4748i.f9096b);
                        jSONObject3.remove(C4748i.f9096b);
                        str = string2;
                    } else {
                        str = string;
                    }
                    jSONObject3.put(AnalyticsContext.Device.DEVICE_ID_KEY, str);
                    jSONObject3.put(NotificationCompat.MessagingStyle.Message.KEY_TEXT, string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject2.put("actionButtons", jSONArray);
                jSONObject2.put("actionId", "__DEFAULT__");
                if (!jSONObject.has("a")) {
                    jSONObject.put("a", jSONObject2);
                }
                bundle2.putString("custom", jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        JSONObject m = m2821m(bundle);
        String g0 = m2798g0(m);
        if (g0 != null) {
            if (C4857i2.m8954v()) {
                e0Var.f9246d = true;
                C4857i2.m8948p().mo16726i(g0);
            }
            return e0Var;
        }
        Intent f = C4840g0.m8878f(context);
        if (f == null) {
            z = false;
        } else {
            f.putExtra("json_payload", m2821m(bundle).toString());
            f.putExtra(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis() / 1000);
            JobIntentService.m10584a(context2, f.getComponent(), 2071862121, f, Integer.parseInt(bundle2.getString("pri", "0")) > 9);
            e0Var.f9244b = true;
            z = true;
        }
        if (z) {
            return e0Var;
        }
        boolean x = C4857i2.m8956x(context2, m);
        e0Var.f9245c = x;
        if (!x && !m2726K0(bundle2.getString("alert"))) {
            C4849h0 h0Var = new C4849h0(context2);
            h0Var.f9312b = m2821m(bundle);
            C4840g0.C4841a aVar = new C4840g0.C4841a();
            h0Var.f9317g = aVar;
            aVar.f9299a = -1;
            m2700C0(h0Var, true);
            new Thread(new C4810d0(bundle2), "OS_PROC_BUNDLE").start();
        }
        return e0Var;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.NonNull
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.Status m2697B1(java.lang.String r6, @androidx.annotation.Nullable java.lang.String r7) {
        /*
            int r0 = r6.hashCode()
            r1 = 1
            switch(r0) {
                case -2130504259: goto L_0x031e;
                case -2065866930: goto L_0x0313;
                case -2014808264: goto L_0x0308;
                case -2005236790: goto L_0x02fd;
                case -2001169389: goto L_0x02f3;
                case -1944433728: goto L_0x02e8;
                case -1800638118: goto L_0x02dd;
                case -1774756919: goto L_0x02d2;
                case -1587614300: goto L_0x02c7;
                case -1583894766: goto L_0x02bb;
                case -1458751677: goto L_0x02af;
                case -1421414571: goto L_0x02a3;
                case -1345867105: goto L_0x0297;
                case -1340100504: goto L_0x028b;
                case -1232010689: goto L_0x027f;
                case -1202691903: goto L_0x0273;
                case -1112393964: goto L_0x0268;
                case -1063710844: goto L_0x025c;
                case -974503964: goto L_0x0250;
                case -863830559: goto L_0x0244;
                case -828507413: goto L_0x0239;
                case -749743758: goto L_0x022d;
                case -736207500: goto L_0x0221;
                case -646022241: goto L_0x0215;
                case -595928767: goto L_0x0209;
                case -333672188: goto L_0x01fd;
                case -294485423: goto L_0x01f1;
                case -217128228: goto L_0x01e5;
                case -122667194: goto L_0x01d9;
                case -75433118: goto L_0x01cd;
                case -40686718: goto L_0x01c1;
                case 15352275: goto L_0x01b5;
                case 210308040: goto L_0x01a9;
                case 269327773: goto L_0x019d;
                case 278802867: goto L_0x0191;
                case 408411681: goto L_0x0185;
                case 423563023: goto L_0x0179;
                case 483847807: goto L_0x016d;
                case 491979549: goto L_0x0161;
                case 492072102: goto L_0x0155;
                case 542728406: goto L_0x0149;
                case 582457886: goto L_0x013d;
                case 605031096: goto L_0x0131;
                case 745638750: goto L_0x0125;
                case 786916712: goto L_0x0119;
                case 799258561: goto L_0x010d;
                case 819646646: goto L_0x0102;
                case 844240628: goto L_0x00f6;
                case 886186878: goto L_0x00ea;
                case 895302372: goto L_0x00de;
                case 922685102: goto L_0x00d2;
                case 989000548: goto L_0x00c6;
                case 1034932393: goto L_0x00bb;
                case 1072360691: goto L_0x00b0;
                case 1094975491: goto L_0x00a4;
                case 1107081238: goto L_0x0098;
                case 1141576252: goto L_0x008c;
                case 1199811910: goto L_0x0080;
                case 1226505451: goto L_0x0074;
                case 1388786705: goto L_0x0069;
                case 1433767024: goto L_0x005e;
                case 1442968770: goto L_0x0052;
                case 1494923453: goto L_0x0046;
                case 1497901284: goto L_0x003a;
                case 1803454477: goto L_0x002e;
                case 1898790704: goto L_0x0022;
                case 2063209097: goto L_0x0016;
                case 2082564316: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0329
        L_0x000a:
            java.lang.String r0 = "UNSUPPORTED_TENANT_OPERATION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 49
            goto L_0x032a
        L_0x0016:
            java.lang.String r0 = "EMAIL_CHANGE_NEEDS_VERIFICATION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 63
            goto L_0x032a
        L_0x0022:
            java.lang.String r0 = "MISSING_SESSION_INFO"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 35
            goto L_0x032a
        L_0x002e:
            java.lang.String r0 = "MISSING_CONTINUE_URI"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 44
            goto L_0x032a
        L_0x003a:
            java.lang.String r0 = "TOO_MANY_ATTEMPTS_TRY_LATER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 21
            goto L_0x032a
        L_0x0046:
            java.lang.String r0 = "INVALID_APP_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 19
            goto L_0x032a
        L_0x0052:
            java.lang.String r0 = "INVALID_PHONE_NUMBER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 32
            goto L_0x032a
        L_0x005e:
            java.lang.String r0 = "USER_DISABLED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 5
            goto L_0x032a
        L_0x0069:
            java.lang.String r0 = "INVALID_IDENTIFIER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 6
            goto L_0x032a
        L_0x0074:
            java.lang.String r0 = "FEDERATED_USER_ID_ALREADY_LINKED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 12
            goto L_0x032a
        L_0x0080:
            java.lang.String r0 = "MISSING_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 33
            goto L_0x032a
        L_0x008c:
            java.lang.String r0 = "SESSION_EXPIRED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 38
            goto L_0x032a
        L_0x0098:
            java.lang.String r0 = "<<Network Error>>"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 15
            goto L_0x032a
        L_0x00a4:
            java.lang.String r0 = "INVALID_PASSWORD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 11
            goto L_0x032a
        L_0x00b0:
            java.lang.String r0 = "INVALID_CUSTOM_TOKEN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 2
            goto L_0x032a
        L_0x00bb:
            java.lang.String r0 = "INVALID_PENDING_TOKEN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 3
            goto L_0x032a
        L_0x00c6:
            java.lang.String r0 = "RESET_PASSWORD_EXCEED_LIMIT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 22
            goto L_0x032a
        L_0x00d2:
            java.lang.String r0 = "INVALID_MESSAGE_PAYLOAD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 26
            goto L_0x032a
        L_0x00de:
            java.lang.String r0 = "MISSING_CLIENT_IDENTIFIER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 65
            goto L_0x032a
        L_0x00ea:
            java.lang.String r0 = "REQUIRES_SECOND_FACTOR_AUTH"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 53
            goto L_0x032a
        L_0x00f6:
            java.lang.String r0 = "WEB_CONTEXT_CANCELED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 48
            goto L_0x032a
        L_0x0102:
            java.lang.String r0 = "CREDENTIAL_MISMATCH"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = r1
            goto L_0x032a
        L_0x010d:
            java.lang.String r0 = "INVALID_PROVIDER_ID"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 46
            goto L_0x032a
        L_0x0119:
            java.lang.String r0 = "INVALID_VERIFICATION_PROOF"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 37
            goto L_0x032a
        L_0x0125:
            java.lang.String r0 = "INVALID_MFA_PENDING_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 56
            goto L_0x032a
        L_0x0131:
            java.lang.String r0 = "REJECTED_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 52
            goto L_0x032a
        L_0x013d:
            java.lang.String r0 = "UNVERIFIED_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 59
            goto L_0x032a
        L_0x0149:
            java.lang.String r0 = "PASSWORD_LOGIN_DISABLED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 18
            goto L_0x032a
        L_0x0155:
            java.lang.String r0 = "WEB_STORAGE_UNSUPPORTED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 43
            goto L_0x032a
        L_0x0161:
            java.lang.String r0 = "INVALID_ID_TOKEN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 13
            goto L_0x032a
        L_0x016d:
            java.lang.String r0 = "EMAIL_EXISTS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 10
            goto L_0x032a
        L_0x0179:
            java.lang.String r0 = "MISSING_MFA_PENDING_CREDENTIAL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 54
            goto L_0x032a
        L_0x0185:
            java.lang.String r0 = "INVALID_DYNAMIC_LINK_DOMAIN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 51
            goto L_0x032a
        L_0x0191:
            java.lang.String r0 = "MISSING_PHONE_NUMBER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 31
            goto L_0x032a
        L_0x019d:
            java.lang.String r0 = "INVALID_SENDER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 27
            goto L_0x032a
        L_0x01a9:
            java.lang.String r0 = "UNSUPPORTED_FIRST_FACTOR"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 62
            goto L_0x032a
        L_0x01b5:
            java.lang.String r0 = "EMAIL_NOT_FOUND"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 8
            goto L_0x032a
        L_0x01c1:
            java.lang.String r0 = "WEAK_PASSWORD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 16
            goto L_0x032a
        L_0x01cd:
            java.lang.String r0 = "USER_NOT_FOUND"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 9
            goto L_0x032a
        L_0x01d9:
            java.lang.String r0 = "MISSING_MFA_ENROLLMENT_ID"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 55
            goto L_0x032a
        L_0x01e5:
            java.lang.String r0 = "SECOND_FACTOR_LIMIT_EXCEEDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 61
            goto L_0x032a
        L_0x01f1:
            java.lang.String r0 = "WEB_INTERNAL_ERROR"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 42
            goto L_0x032a
        L_0x01fd:
            java.lang.String r0 = "OPERATION_NOT_ALLOWED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 17
            goto L_0x032a
        L_0x0209:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 14
            goto L_0x032a
        L_0x0215:
            java.lang.String r0 = "CREDENTIAL_TOO_OLD_LOGIN_AGAIN"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 20
            goto L_0x032a
        L_0x0221:
            java.lang.String r0 = "MISSING_PASSWORD"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 30
            goto L_0x032a
        L_0x022d:
            java.lang.String r0 = "MFA_ENROLLMENT_NOT_FOUND"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 57
            goto L_0x032a
        L_0x0239:
            java.lang.String r0 = "NO_SUCH_PROVIDER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 0
            goto L_0x032a
        L_0x0244:
            java.lang.String r0 = "INVALID_CERT_HASH"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 40
            goto L_0x032a
        L_0x0250:
            java.lang.String r0 = "MISSING_OR_INVALID_NONCE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 66
            goto L_0x032a
        L_0x025c:
            java.lang.String r0 = "ADMIN_ONLY_OPERATION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 58
            goto L_0x032a
        L_0x0268:
            java.lang.String r0 = "INVALID_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 7
            goto L_0x032a
        L_0x0273:
            java.lang.String r0 = "SECOND_FACTOR_EXISTS"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 60
            goto L_0x032a
        L_0x027f:
            java.lang.String r0 = "INVALID_SESSION_INFO"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 36
            goto L_0x032a
        L_0x028b:
            java.lang.String r0 = "INVALID_TENANT_ID"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 50
            goto L_0x032a
        L_0x0297:
            java.lang.String r0 = "TOKEN_EXPIRED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 23
            goto L_0x032a
        L_0x02a3:
            java.lang.String r0 = "INVALID_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 34
            goto L_0x032a
        L_0x02af:
            java.lang.String r0 = "MISSING_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 29
            goto L_0x032a
        L_0x02bb:
            java.lang.String r0 = "INVALID_OOB_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 24
            goto L_0x032a
        L_0x02c7:
            java.lang.String r0 = "EXPIRED_OOB_CODE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 25
            goto L_0x032a
        L_0x02d2:
            java.lang.String r0 = "WEB_NETWORK_REQUEST_FAILED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 41
            goto L_0x032a
        L_0x02dd:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 39
            goto L_0x032a
        L_0x02e8:
            java.lang.String r0 = "DYNAMIC_LINK_NOT_ACTIVATED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 45
            goto L_0x032a
        L_0x02f3:
            java.lang.String r0 = "INVALID_IDP_RESPONSE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 4
            goto L_0x032a
        L_0x02fd:
            java.lang.String r0 = "INTERNAL_SUCCESS_SIGN_OUT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 64
            goto L_0x032a
        L_0x0308:
            java.lang.String r0 = "WEB_CONTEXT_ALREADY_PRESENTED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 47
            goto L_0x032a
        L_0x0313:
            java.lang.String r0 = "INVALID_RECIPIENT_EMAIL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 28
            goto L_0x032a
        L_0x031e:
            java.lang.String r0 = "USER_CANCELLED"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 67
            goto L_0x032a
        L_0x0329:
            r0 = -1
        L_0x032a:
            r2 = 17499(0x445b, float:2.4521E-41)
            switch(r0) {
                case 0: goto L_0x040d;
                case 1: goto L_0x040a;
                case 2: goto L_0x0407;
                case 3: goto L_0x0404;
                case 4: goto L_0x0404;
                case 5: goto L_0x0401;
                case 6: goto L_0x03fe;
                case 7: goto L_0x03fe;
                case 8: goto L_0x03fb;
                case 9: goto L_0x03fb;
                case 10: goto L_0x03f8;
                case 11: goto L_0x03f5;
                case 12: goto L_0x03f2;
                case 13: goto L_0x03ef;
                case 14: goto L_0x03ec;
                case 15: goto L_0x03ec;
                case 16: goto L_0x03e9;
                case 17: goto L_0x03e6;
                case 18: goto L_0x03e6;
                case 19: goto L_0x03e3;
                case 20: goto L_0x03e0;
                case 21: goto L_0x03dd;
                case 22: goto L_0x03dd;
                case 23: goto L_0x03da;
                case 24: goto L_0x03d7;
                case 25: goto L_0x03d4;
                case 26: goto L_0x03d1;
                case 27: goto L_0x03ce;
                case 28: goto L_0x03cb;
                case 29: goto L_0x03c8;
                case 30: goto L_0x03c5;
                case 31: goto L_0x03c2;
                case 32: goto L_0x03be;
                case 33: goto L_0x03ba;
                case 34: goto L_0x03b6;
                case 35: goto L_0x03b2;
                case 36: goto L_0x03ae;
                case 37: goto L_0x03aa;
                case 38: goto L_0x03a6;
                case 39: goto L_0x03a2;
                case 40: goto L_0x039e;
                case 41: goto L_0x039a;
                case 42: goto L_0x0396;
                case 43: goto L_0x0392;
                case 44: goto L_0x038e;
                case 45: goto L_0x038a;
                case 46: goto L_0x0386;
                case 47: goto L_0x0382;
                case 48: goto L_0x037e;
                case 49: goto L_0x037a;
                case 50: goto L_0x0376;
                case 51: goto L_0x0372;
                case 52: goto L_0x036e;
                case 53: goto L_0x036a;
                case 54: goto L_0x0366;
                case 55: goto L_0x0362;
                case 56: goto L_0x035e;
                case 57: goto L_0x035a;
                case 58: goto L_0x0356;
                case 59: goto L_0x0352;
                case 60: goto L_0x034e;
                case 61: goto L_0x034a;
                case 62: goto L_0x0346;
                case 63: goto L_0x0342;
                case 64: goto L_0x033e;
                case 65: goto L_0x033a;
                case 66: goto L_0x0336;
                case 67: goto L_0x0332;
                default: goto L_0x032f;
            }
        L_0x032f:
            r0 = r2
            goto L_0x040f
        L_0x0332:
            r0 = 18001(0x4651, float:2.5225E-41)
            goto L_0x040f
        L_0x0336:
            r0 = 17094(0x42c6, float:2.3954E-41)
            goto L_0x040f
        L_0x033a:
            r0 = 17093(0x42c5, float:2.3952E-41)
            goto L_0x040f
        L_0x033e:
            r0 = 17091(0x42c3, float:2.395E-41)
            goto L_0x040f
        L_0x0342:
            r0 = 17090(0x42c2, float:2.3948E-41)
            goto L_0x040f
        L_0x0346:
            r0 = 17089(0x42c1, float:2.3947E-41)
            goto L_0x040f
        L_0x034a:
            r0 = 17088(0x42c0, float:2.3945E-41)
            goto L_0x040f
        L_0x034e:
            r0 = 17087(0x42bf, float:2.3944E-41)
            goto L_0x040f
        L_0x0352:
            r0 = 17086(0x42be, float:2.3943E-41)
            goto L_0x040f
        L_0x0356:
            r0 = 17085(0x42bd, float:2.3941E-41)
            goto L_0x040f
        L_0x035a:
            r0 = 17084(0x42bc, float:2.394E-41)
            goto L_0x040f
        L_0x035e:
            r0 = 17083(0x42bb, float:2.3938E-41)
            goto L_0x040f
        L_0x0362:
            r0 = 17082(0x42ba, float:2.3937E-41)
            goto L_0x040f
        L_0x0366:
            r0 = 17081(0x42b9, float:2.3936E-41)
            goto L_0x040f
        L_0x036a:
            r0 = 17078(0x42b6, float:2.3931E-41)
            goto L_0x040f
        L_0x036e:
            r0 = 17075(0x42b3, float:2.3927E-41)
            goto L_0x040f
        L_0x0372:
            r0 = 17074(0x42b2, float:2.3926E-41)
            goto L_0x040f
        L_0x0376:
            r0 = 17079(0x42b7, float:2.3933E-41)
            goto L_0x040f
        L_0x037a:
            r0 = 17073(0x42b1, float:2.3924E-41)
            goto L_0x040f
        L_0x037e:
            r0 = 17058(0x42a2, float:2.3903E-41)
            goto L_0x040f
        L_0x0382:
            r0 = 17057(0x42a1, float:2.3902E-41)
            goto L_0x040f
        L_0x0386:
            r0 = 17071(0x42af, float:2.3922E-41)
            goto L_0x040f
        L_0x038a:
            r0 = 17068(0x42ac, float:2.3917E-41)
            goto L_0x040f
        L_0x038e:
            r0 = 17040(0x4290, float:2.3878E-41)
            goto L_0x040f
        L_0x0392:
            r0 = 17065(0x42a9, float:2.3913E-41)
            goto L_0x040f
        L_0x0396:
            r0 = 17062(0x42a6, float:2.3909E-41)
            goto L_0x040f
        L_0x039a:
            r0 = 17061(0x42a5, float:2.3908E-41)
            goto L_0x040f
        L_0x039e:
            r0 = 17064(0x42a8, float:2.3912E-41)
            goto L_0x040f
        L_0x03a2:
            r0 = 17052(0x429c, float:2.3895E-41)
            goto L_0x040f
        L_0x03a6:
            r0 = 17051(0x429b, float:2.3894E-41)
            goto L_0x040f
        L_0x03aa:
            r0 = 17049(0x4299, float:2.3891E-41)
            goto L_0x040f
        L_0x03ae:
            r0 = 17046(0x4296, float:2.3887E-41)
            goto L_0x040f
        L_0x03b2:
            r0 = 17045(0x4295, float:2.3885E-41)
            goto L_0x040f
        L_0x03b6:
            r0 = 17044(0x4294, float:2.3884E-41)
            goto L_0x040f
        L_0x03ba:
            r0 = 17043(0x4293, float:2.3882E-41)
            goto L_0x040f
        L_0x03be:
            r0 = 17042(0x4292, float:2.3881E-41)
            goto L_0x040f
        L_0x03c2:
            r0 = 17041(0x4291, float:2.388E-41)
            goto L_0x040f
        L_0x03c5:
            r0 = 17035(0x428b, float:2.3871E-41)
            goto L_0x040f
        L_0x03c8:
            r0 = 17034(0x428a, float:2.387E-41)
            goto L_0x040f
        L_0x03cb:
            r0 = 17033(0x4289, float:2.3868E-41)
            goto L_0x040f
        L_0x03ce:
            r0 = 17032(0x4288, float:2.3867E-41)
            goto L_0x040f
        L_0x03d1:
            r0 = 17031(0x4287, float:2.3866E-41)
            goto L_0x040f
        L_0x03d4:
            r0 = 17029(0x4285, float:2.3863E-41)
            goto L_0x040f
        L_0x03d7:
            r0 = 17030(0x4286, float:2.3864E-41)
            goto L_0x040f
        L_0x03da:
            r0 = 17021(0x427d, float:2.3852E-41)
            goto L_0x040f
        L_0x03dd:
            r0 = 17010(0x4272, float:2.3836E-41)
            goto L_0x040f
        L_0x03e0:
            r0 = 17014(0x4276, float:2.3842E-41)
            goto L_0x040f
        L_0x03e3:
            r0 = 17028(0x4284, float:2.3861E-41)
            goto L_0x040f
        L_0x03e6:
            r0 = 17006(0x426e, float:2.383E-41)
            goto L_0x040f
        L_0x03e9:
            r0 = 17026(0x4282, float:2.3859E-41)
            goto L_0x040f
        L_0x03ec:
            r0 = 17020(0x427c, float:2.385E-41)
            goto L_0x040f
        L_0x03ef:
            r0 = 17017(0x4279, float:2.3846E-41)
            goto L_0x040f
        L_0x03f2:
            r0 = 17025(0x4281, float:2.3857E-41)
            goto L_0x040f
        L_0x03f5:
            r0 = 17009(0x4271, float:2.3835E-41)
            goto L_0x040f
        L_0x03f8:
            r0 = 17007(0x426f, float:2.3832E-41)
            goto L_0x040f
        L_0x03fb:
            r0 = 17011(0x4273, float:2.3837E-41)
            goto L_0x040f
        L_0x03fe:
            r0 = 17008(0x4270, float:2.3833E-41)
            goto L_0x040f
        L_0x0401:
            r0 = 17005(0x426d, float:2.3829E-41)
            goto L_0x040f
        L_0x0404:
            r0 = 17004(0x426c, float:2.3828E-41)
            goto L_0x040f
        L_0x0407:
            r0 = 17000(0x4268, float:2.3822E-41)
            goto L_0x040f
        L_0x040a:
            r0 = 17002(0x426a, float:2.3825E-41)
            goto L_0x040f
        L_0x040d:
            r0 = 17016(0x4278, float:2.3844E-41)
        L_0x040f:
            if (r0 != r2) goto L_0x0434
            if (r7 == 0) goto L_0x042e
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            int r3 = r6.length()
            int r4 = r7.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + r1
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r1 = ":"
            java.lang.String r6 = p005b.p035e.p036a.p037a.C0843a.m456q(r5, r6, r1, r7)
            r0.<init>(r2, r6)
            return r0
        L_0x042e:
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r7.<init>(r2, r6)
            return r7
        L_0x0434:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r6.<init>(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2697B1(java.lang.String, java.lang.String):com.google.android.gms.common.api.Status");
    }

    /* renamed from: B2 */
    public static int m2698B2(C3043z6<?> z6Var, int i, byte[] bArr, int i2, int i3, C2977u5<?> u5Var, C2846k4 k4Var) {
        int t2 = m2852t2(z6Var, bArr, i2, i3, k4Var);
        while (true) {
            u5Var.add(k4Var.f4868c);
            if (t2 >= i3) {
                break;
            }
            int W0 = m2762W0(bArr, t2, k4Var);
            if (i != k4Var.f4866a) {
                break;
            }
            t2 = m2852t2(z6Var, bArr, W0, i3, k4Var);
        }
        return t2;
    }

    /* renamed from: C */
    public static void m2699C(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: C0 */
    public static void m2700C0(C4849h0 h0Var, boolean z) {
        C5007w1 w1Var;
        Context context = h0Var.f9311a;
        JSONObject jSONObject = h0Var.f9312b;
        try {
            JSONObject S = m2749S(jSONObject);
            C4783a3 e = C4783a3.m8766e(h0Var.f9311a);
            if (h0Var.mo16585b() != -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                e.mo16514l0("notification", contentValues, "android_notification_id = " + h0Var.mo16585b(), (String[]) null);
                C4839g.m8876b(e, context);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", S.optString(C4748i.f9096b));
            if (jSONObject.has("grp")) {
                contentValues2.put("group_id", jSONObject.optString("grp"));
            }
            if (jSONObject.has("collapse_key") && !"do_not_collapse".equals(jSONObject.optString("collapse_key"))) {
                contentValues2.put("collapse_id", jSONObject.optString("collapse_key"));
            }
            contentValues2.put("opened", Integer.valueOf(z ? 1 : 0));
            if (!z) {
                contentValues2.put("android_notification_id", Integer.valueOf(h0Var.mo16585b()));
            }
            if (h0Var.mo16587d() != null) {
                contentValues2.put("title", ((String) h0Var.mo16587d()).toString());
            }
            if (h0Var.mo16586c() != null) {
                contentValues2.put("message", ((String) h0Var.mo16586c()).toString());
            }
            contentValues2.put("expire_time", Long.valueOf((jSONObject.optLong("google.sent_time", SystemClock.currentThreadTimeMillis()) / 1000) + ((long) jSONObject.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", jSONObject.toString());
            e.mo16509N("notification", (String) null, contentValues2);
            if (!z) {
                C4839g.m8876b(e, context);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (h0Var.mo16585b() != -1) {
            String T = m2752T(h0Var.f9312b);
            C5041y1 y1Var = C4857i2.f9377v;
            ((C4856i1) y1Var.f9746c).mo16609a(C0843a.m451l("OneSignal SessionManager onNotificationReceived notificationId: ", T));
            if (T != null && !T.isEmpty()) {
                y1Var.f9744a.mo16769d().mo16764n(T);
            }
            synchronized (C5007w1.class) {
                if (C5007w1.f9679b == null) {
                    C5007w1.f9679b = new C5007w1();
                }
                w1Var = C5007w1.f9679b;
            }
            Objects.requireNonNull(w1Var);
            C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
            String str = C4857i2.f9356a;
            String q = (str == null || str.isEmpty()) ? C4857i2.m8949q() : C4857i2.f9356a;
            String r = C4857i2.m8950r();
            if (!C4815d3.m8827b(C4815d3.f9230a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false)) {
                C4857i2.m8933a(kVar, "sendReceiveReceipt disable", (Throwable) null);
                return;
            }
            C4857i2.m8933a(kVar, "sendReceiveReceipt appId: " + q + " playerId: " + r + " notificationId: " + T, (Throwable) null);
            C5022x1 x1Var = w1Var.f9680a;
            C5001v1 v1Var = new C5001v1(w1Var, T);
            Objects.requireNonNull(x1Var);
            try {
                new Thread(new C4846g3("notifications/" + T + "/report_received", new JSONObject().put("app_id", q).put("player_id", r), v1Var), "OS_REST_ASYNC_PUT").start();
            } catch (JSONException e3) {
                C4857i2.m8933a(C4857i2.C4868k.ERROR, "Generating direct receive receipt:JSON Failed.", e3);
            }
        }
    }

    @NonNull
    /* renamed from: C1 */
    public static C2431qg m2701C1(@NonNull Exception exc, @NonNull String str, @NonNull String str2) {
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(C0843a.m441b(String.valueOf(str).length(), 47, String.valueOf(str2).length(), String.valueOf(message).length()));
        C0843a.m431G(sb, "Failed to parse ", str, " for string [", str2);
        sb.append("] with exception: ");
        sb.append(message);
        Log.e(str, sb.toString());
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        C0843a.m431G(sb2, "Failed to parse ", str, " for string [", str2);
        sb2.append("]");
        return new C2431qg(sb2.toString(), exc);
    }

    /* renamed from: C2 */
    public static int m2702C2(int i, byte[] bArr, int i2, int i3, C2048b1 b1Var, C2144em emVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int Q1 = m2745Q1(bArr, i2, emVar);
                b1Var.mo12418c(i, Long.valueOf(emVar.f3838b));
                return Q1;
            } else if (i4 == 1) {
                b1Var.mo12418c(i, Long.valueOf(m2796f2(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int V0 = m2759V0(bArr, i2, emVar);
                int i5 = emVar.f3837a;
                if (i5 < 0) {
                    throw C2246j.m3525b();
                } else if (i5 <= bArr.length - V0) {
                    b1Var.mo12418c(i, i5 == 0 ? C2317lm.f4051h : C2317lm.m3705I(bArr, V0, i5));
                    return V0 + i5;
                } else {
                    throw C2246j.m3524a();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C2048b1 a = C2048b1.m3040a();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int V02 = m2759V0(bArr, i2, emVar);
                    int i8 = emVar.f3837a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = V02;
                        break;
                    }
                    int C2 = m2702C2(i7, bArr, V02, i3, a, emVar);
                    i7 = i8;
                    i2 = C2;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C2246j.m3529f();
                }
                b1Var.mo12418c(i, a);
                return i2;
            } else if (i4 == 5) {
                b1Var.mo12418c(i, Integer.valueOf(m2766X1(bArr, i2)));
                return i2 + 4;
            } else {
                throw C2246j.m3527d();
            }
        } else {
            throw C2246j.m3527d();
        }
    }

    /* renamed from: D */
    public static int m2703D(int i, int i2) {
        int i3 = i - i2;
        if (i3 > i2) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        int i5 = 1;
        int i6 = 1;
        while (i > i2) {
            i5 *= i;
            if (i6 <= i3) {
                i5 /= i6;
                i6++;
            }
            i--;
        }
        while (i6 <= i3) {
            i5 /= i6;
            i6++;
        }
        return i5;
    }

    /* renamed from: D0 */
    public static RuntimeException m2704D0(Throwable th) {
        Object obj = C3758d.f6943a;
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (!(th instanceof Error)) {
            throw new RuntimeException(th);
        } else {
            throw ((Error) th);
        }
    }

    /* renamed from: D1 */
    public static <T> T m2705D1(@NonNull Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }

    /* renamed from: D2 */
    public static int m2706D2(int i, byte[] bArr, int i2, int i3, C2888n7 n7Var, C2846k4 k4Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int R1 = m2748R1(bArr, i2, k4Var);
                n7Var.mo13520c(i, Long.valueOf(k4Var.f4867b));
                return R1;
            } else if (i4 == 1) {
                n7Var.mo13520c(i, Long.valueOf(m2812j2(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int W0 = m2762W0(bArr, i2, k4Var);
                int i5 = k4Var.f4866a;
                if (i5 < 0) {
                    throw C3016x5.m5683b();
                } else if (i5 <= bArr.length - W0) {
                    n7Var.mo13520c(i, i5 == 0 ? C2937r4.f4977h : C2937r4.m5128F(bArr, W0, i5));
                    return W0 + i5;
                } else {
                    throw C3016x5.m5682a();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C2888n7 a = C2888n7.m4996a();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int W02 = m2762W0(bArr, i2, k4Var);
                    int i8 = k4Var.f4866a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = W02;
                        break;
                    }
                    int D2 = m2706D2(i7, bArr, W02, i3, a, k4Var);
                    i7 = i8;
                    i2 = D2;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C3016x5.m5684c();
                }
                n7Var.mo13520c(i, a);
                return i2;
            } else if (i4 == 5) {
                n7Var.mo13520c(i, Integer.valueOf(m2788d2(bArr, i2)));
                return i2 + 4;
            } else {
                throw new C3016x5("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new C3016x5("Protocol message contained an invalid tag (zero).");
        }
    }

    /* renamed from: E */
    public static C3948d<?> m2707E(String str, String str2) {
        C3815a aVar = new C3815a(str, str2);
        C3948d.C3950b<C3819e> a = C3948d.m7321a(C3819e.class);
        a.f7237d = 1;
        a.mo15463c(new C3946c(aVar));
        return a.mo15462b();
    }

    /* renamed from: E0 */
    public static void m2708E0(byte[] bArr, C3612t tVar, OutputStream outputStream, long j, int i, long j2) {
        InputStream e;
        Throwable th;
        byte[] bArr2 = bArr;
        int i2 = i;
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i2;
            if (j3 <= j2) {
                C3614u uVar = new C3614u(tVar, j, j3);
                synchronized (uVar) {
                    e = uVar.mo14840e(0, uVar.mo14839d());
                }
                while (i2 > 0) {
                    try {
                        int min = Math.min(i2, 16384);
                        int i3 = 0;
                        while (i3 < min) {
                            int read = e.read(bArr, i3, min - i3);
                            if (read != -1) {
                                i3 += read;
                            } else {
                                throw new IOException("truncated input stream");
                            }
                        }
                        OutputStream outputStream2 = outputStream;
                        outputStream.write(bArr, 0, min);
                        i2 -= min;
                    } catch (EOFException e2) {
                        throw new IOException("patch underrun", e2);
                    } catch (Throwable th2) {
                        C3577b0.f6643a.mo14880a(th, th2);
                    }
                }
                e.close();
                return;
            }
            throw new IOException("Output length overrun");
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }

    /* renamed from: E1 */
    public static <TResult> TResult m2709E1(C3428h<TResult> hVar) {
        if (hVar.mo14692n()) {
            return hVar.mo14688j();
        }
        if (hVar.mo14690l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.mo14687i());
    }

    /* renamed from: F */
    public static <T> void m2710F(T t, Object obj) {
        Objects.requireNonNull(t, (String) obj);
    }

    /* renamed from: F0 */
    public static int m2711F0(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    /* renamed from: F1 */
    public static String m2712F1(C2375o8 o8Var) {
        int ordinal = o8Var.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 2) {
            return "HmacSha384";
        }
        if (ordinal == 3) {
            return "HmacSha256";
        }
        if (ordinal == 4) {
            return "HmacSha512";
        }
        if (ordinal == 5) {
            return "HmacSha224";
        }
        String valueOf = String.valueOf(o8Var);
        throw new NoSuchAlgorithmException(C0843a.m455p(new StringBuilder(valueOf.length() + 27), "hash unsupported for HMAC: ", valueOf));
    }

    /* renamed from: G */
    public static void m2713G(List<C3948d<?>> list) {
        Set<C3965p> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C3948d<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C3948d next = it.next();
                C3965p pVar = new C3965p(next);
                Iterator<Class<? super T>> it2 = next.f7228a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next2 = it2.next();
                        C3966q qVar = new C3966q(next2, !next.mo15459b(), (C3964o) null);
                        if (!hashMap.containsKey(qVar)) {
                            hashMap.put(qVar, new HashSet());
                        }
                        Set set2 = (Set) hashMap.get(qVar);
                        if (set2.isEmpty() || qVar.f7267b) {
                            set2.add(pVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<C3965p> it3 : hashMap.values()) {
                    for (C3965p pVar2 : it3) {
                        for (C3967r next3 : pVar2.f7263a.f7229b) {
                            if ((next3.f7270c == 0) && (set = (Set) hashMap.get(new C3966q(next3.f7268a, next3.mo15477a(), (C3964o) null))) != null) {
                                for (C3965p pVar3 : set) {
                                    pVar2.f7264b.add(pVar3);
                                    pVar3.f7265c.add(pVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C3965p pVar4 = (C3965p) it4.next();
                    if (pVar4.mo15474a()) {
                        hashSet2.add(pVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C3965p pVar5 = (C3965p) hashSet2.iterator().next();
                    hashSet2.remove(pVar5);
                    i++;
                    for (C3965p next4 : pVar5.f7264b) {
                        next4.f7265c.remove(pVar5);
                        if (next4.mo15474a()) {
                            hashSet2.add(next4);
                        }
                    }
                }
                if (i != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it5 = hashSet.iterator();
                    while (it5.hasNext()) {
                        C3965p pVar6 = (C3965p) it5.next();
                        if (!pVar6.mo15474a() && !pVar6.f7264b.isEmpty()) {
                            arrayList.add(pVar6.f7263a);
                        }
                    }
                    throw new C3968s(arrayList);
                }
                return;
            }
        }
    }

    /* renamed from: G0 */
    public static int m2714G0(long j) {
        if (j > 2147483647L) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    @Nullable
    /* renamed from: G1 */
    public static final String m2715G1(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: H */
    public static float m2716H(float f, float f2, float f3, float f4) {
        double d = (double) (f - f3);
        double d2 = (double) (f2 - f4);
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    /* renamed from: H0 */
    public static void m2717H0(TimerTask timerTask, String str, long j) {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        C4857i2.m8933a(kVar, "scheduleTrigger: " + str + " delay: " + j, (Throwable) null);
        new Timer(C0843a.m451l("trigger_timer:", str)).schedule(timerTask, j);
    }

    /* renamed from: H1 */
    public static BigInteger m2718H1(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: I */
    public static float m2719I(int i, int i2, int i3, int i4) {
        double d = (double) (i - i3);
        double d2 = (double) (i2 - i4);
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    /* renamed from: I0 */
    public static void m2720I0(C4916n1 n1Var) {
        JSONObject jSONObject = n1Var.f9490e;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = n1Var.f9490e.getJSONArray("actionButtons");
            n1Var.f9491f = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C4916n1.C4917a aVar = new C4916n1.C4917a();
                jSONObject2.optString(AnalyticsContext.Device.DEVICE_ID_KEY, (String) null);
                jSONObject2.optString(NotificationCompat.MessagingStyle.Message.KEY_TEXT, (String) null);
                jSONObject2.optString("icon", (String) null);
                n1Var.f9491f.add(aVar);
            }
            n1Var.f9490e.remove("actionId");
            n1Var.f9490e.remove("actionButtons");
        }
    }

    /* renamed from: I1 */
    public static List<C3930t> m2721I1(List<C2435qk> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (C2435qk next : list) {
            C3940y yVar = null;
            if (next != null && !TextUtils.isEmpty(next.f4238g)) {
                String str = next.f4239h;
                String str2 = next.f4240i;
                long j = next.f4241j;
                String str3 = next.f4238g;
                C0823f.m376j(str3);
                yVar = new C3940y(str, str2, j, str3);
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public static String m2722J(String str, String str2) {
        return C0843a.m456q(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    /* renamed from: J0 */
    public static void m2723J0(C4916n1 n1Var, JSONObject jSONObject) {
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            n1Var.f9492g = new C4916n1.C4918b();
            jSONObject2.optString("img");
            C4916n1.C4918b bVar = n1Var.f9492g;
            jSONObject2.optString("tc");
            Objects.requireNonNull(bVar);
            C4916n1.C4918b bVar2 = n1Var.f9492g;
            jSONObject2.optString("bc");
            Objects.requireNonNull(bVar2);
        }
    }

    /* renamed from: J1 */
    public static void m2724J1(C3269o3 o3Var, SQLiteDatabase sQLiteDatabase) {
        if (o3Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                o3Var.f5802i.mo14414a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                o3Var.f5802i.mo14414a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                o3Var.f5802i.mo14414a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                o3Var.f5802i.mo14414a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* renamed from: K */
    public static boolean m2725K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: K0 */
    public static boolean m2726K0(String str) {
        boolean z = str != null && !"".equals(str);
        C4857i2.C4864g gVar = C4857i2.f9338H;
        boolean z2 = gVar != null && gVar.f9395e == C4857i2.C4871n.InAppAlert;
        boolean v = C4857i2.m8954v();
        if (z) {
            C4857i2.C4864g gVar2 = C4857i2.f9338H;
            if ((gVar2 == null || gVar2.f9395e == C4857i2.C4871n.Notification) || z2 || !v) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K1 */
    public static final void m2727K1(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object K1 : (List) obj) {
                m2727K1(sb, i, str, K1);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry K12 : ((Map) obj).entrySet()) {
                m2727K1(sb, i, str, K12);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C2317lm lmVar = C2317lm.f4051h;
                sb.append(m2799g1(new C2293km(((String) obj).getBytes(C2196h.f3910a))));
                sb.append('\"');
            } else if (obj instanceof C2317lm) {
                sb.append(": \"");
                sb.append(m2799g1((C2317lm) obj));
                sb.append('\"');
            } else if (obj instanceof C2071c) {
                sb.append(" {");
                m2751S1((C2071c) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m2727K1(sb, i4, "key", entry.getKey());
                m2727K1(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: L */
    public static String m2728L(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(C0843a.m441b(str.length(), 2, String.valueOf(str2).length(), String.valueOf(str3).length()));
        C0843a.m431G(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: L0 */
    public static boolean m2729L0(Intent intent) {
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: L1 */
    public static void m2730L1(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }

    /* renamed from: M */
    public static int m2731M(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* renamed from: M0 */
    public static void m2732M0() {
        boolean z;
        if (C4835f2.m8863m()) {
            try {
                PackageManager packageManager = C4857i2.f9358c.getPackageManager();
                z = !((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market");
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (z && !C4815d3.m8827b(C4815d3.f9230a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
                C4835f2.m8871u(new C4976t());
            }
        }
    }

    /* renamed from: M1 */
    public static byte[] m2733M1(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    /* renamed from: N */
    public static void m2734N(@NonNull C1422f fVar) {
        RectF rectF;
        C1422f.C1445e0 e0Var = fVar.f1910a;
        if (e0Var != null) {
            C1422f.C1423a aVar = e0Var.f2091o;
            if (aVar == null) {
                rectF = null;
            } else {
                rectF = new RectF(aVar.f1913a, aVar.f1914b, aVar.mo11304a(), aVar.mo11305b());
            }
            float d = fVar.mo11298d();
            float c = fVar.mo11297c();
            if (rectF != null) {
                int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
                if (i <= 0 && c <= 0.0f) {
                    fVar.mo11303i(rectF.width());
                    fVar.mo11302h(rectF.height());
                } else if (i <= 0) {
                    fVar.mo11303i((rectF.width() / rectF.height()) * c);
                } else if (c <= 0.0f) {
                    fVar.mo11302h(d / (rectF.width() / rectF.height()));
                }
            } else if (d <= 0.0f || c <= 0.0f) {
                throw new IOException("SVG must have specify 'width' & 'height' tags or 'viewbox'");
            } else {
                C1422f.C1445e0 e0Var2 = fVar.f1910a;
                if (e0Var2 != null) {
                    e0Var2.f2091o = new C1422f.C1423a(0.0f, 0.0f, d, c);
                    return;
                }
                throw new IllegalArgumentException("SVG document is empty");
            }
        } else {
            throw new IllegalArgumentException("SVG document is empty");
        }
    }

    /* renamed from: N0 */
    public static int m2735N0(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: N1 */
    public static byte[] m2736N1(byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int length2 = bArr[i].length;
            if (i2 <= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - length2) {
                i2 += length2;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length3);
            i3 += length3;
        }
        return bArr2;
    }

    /* renamed from: O */
    public static <TResult> C3428h<TResult> m2737O(@NonNull Exception exc) {
        C3423e0 e0Var = new C3423e0();
        e0Var.mo14694p(exc);
        return e0Var;
    }

    /* renamed from: O0 */
    public static String m2738O0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: O1 */
    public static final void m2739O1(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object O1 : (List) obj) {
                m2739O1(sb, i, str, O1);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry O12 : ((Map) obj).entrySet()) {
                m2739O1(sb, i, str, O12);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C2937r4 r4Var = C2937r4.f4977h;
                sb.append(m2803h1(new C2924q4(((String) obj).getBytes(C2990v5.f5088a))));
                sb.append('\"');
            } else if (obj instanceof C2937r4) {
                sb.append(": \"");
                sb.append(m2803h1((C2937r4) obj));
                sb.append('\"');
            } else if (obj instanceof C2899o5) {
                sb.append(" {");
                m2754T1((C2899o5) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m2739O1(sb, i4, "key", entry.getKey());
                m2739O1(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: P */
    public static <TResult> C3428h<TResult> m2740P(TResult tresult) {
        C3423e0 e0Var = new C3423e0();
        e0Var.mo14695q(tresult);
        return e0Var;
    }

    /* renamed from: P0 */
    public static String m2741P0(JSONArray jSONArray) {
        int i = 0;
        String str = "[";
        while (i < jSONArray.length()) {
            try {
                str = str + "\"" + jSONArray.getString(i) + "\"";
                i++;
            } catch (JSONException unused) {
            }
        }
        return C0843a.m451l(str, "]");
    }

    /* renamed from: P1 */
    public static int m2742P1(C2279k8 k8Var) {
        int ordinal = k8Var.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(k8Var);
                throw new GeneralSecurityException(C0843a.m455p(new StringBuilder(valueOf.length() + 20), "unknown curve type: ", valueOf));
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static C3948d<?> m2743Q(String str, C3821g<Context> gVar) {
        C3948d.C3950b<C3819e> a = C3948d.m7321a(C3819e.class);
        a.f7237d = 1;
        a.mo15461a(new C3967r(Context.class, 1, 0));
        a.mo15463c(new C3820f(str, gVar));
        return a.mo15462b();
    }

    @TargetApi(19)
    /* renamed from: Q0 */
    public static boolean m2744Q0(Context context, int i, String str) {
        C1967a a = C1968b.m2885a(context);
        Objects.requireNonNull(a);
        try {
            ((AppOpsManager) a.f3529a.getSystemService("appops")).checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: Q1 */
    public static int m2745Q1(byte[] bArr, int i, C2144em emVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            emVar.f3838b = j2;
            return i3;
        }
        emVar.f3838b = j;
        return i2;
    }

    /* renamed from: R */
    public static JSONObject m2746R(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> keys = jSONObject2.keys();
        JSONObject jSONObject5 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String jSONObject6 = m2746R(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!jSONObject6.equals("{}")) {
                            jSONObject4 = new JSONObject(jSONObject6);
                        }
                    } else if (obj instanceof JSONArray) {
                        m2786d0(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject5);
                    } else {
                        if (set == null || !set.contains(next)) {
                            Object obj2 = jSONObject.get(next);
                            if (!obj.equals(obj2)) {
                                if ((obj2 instanceof Integer) && !"".equals(obj)) {
                                    if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                    }
                                }
                            }
                        }
                        jSONObject5.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4 = new JSONObject(obj.toString());
                } else {
                    if (obj instanceof JSONArray) {
                        m2786d0(next, (JSONArray) obj, (JSONArray) null, jSONObject5);
                    }
                    jSONObject5.put(next, obj);
                }
                jSONObject5.put(next, jSONObject4);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject5;
    }

    /* renamed from: R0 */
    public static void m2747R0(Context context, C5053z2 z2Var, String str, boolean z) {
        try {
            Cursor h0 = m2802h0(context, z2Var, str, z);
            if (!h0.isClosed()) {
                h0.close();
            }
        } catch (Throwable th) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }

    /* renamed from: R1 */
    public static int m2748R1(byte[] bArr, int i, C2846k4 k4Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            k4Var.f4867b = j2;
            return i3;
        }
        k4Var.f4867b = j;
        return i2;
    }

    /* renamed from: S */
    public static JSONObject m2749S(JSONObject jSONObject) {
        return new JSONObject(jSONObject.optString("custom"));
    }

    /* renamed from: S0 */
    public static void m2750S0() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    /* renamed from: S1 */
    public static void m2751S1(C2072c0 c0Var, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : c0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m2727K1(sb, i, m2769Y1(concat), C2071c.m3078d(method2, c0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m2727K1(sb, i, m2769Y1(concat2), C2071c.m3078d(method3, c0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object d = C2071c.m3078d(method4, c0Var, new Object[0]);
                    if (method5 == null) {
                        if (d instanceof Boolean) {
                            if (!((Boolean) d).booleanValue()) {
                            }
                        } else if (d instanceof Integer) {
                            if (((Integer) d).intValue() == 0) {
                            }
                        } else if (d instanceof Float) {
                            if (((Float) d).floatValue() == 0.0f) {
                            }
                        } else if (!(d instanceof Double)) {
                            if (d instanceof String) {
                                obj = "";
                            } else if (d instanceof C2317lm) {
                                obj = C2317lm.f4051h;
                            } else if (d instanceof C2072c0) {
                                if (d == ((C2072c0) d).mo12453q()) {
                                }
                            } else if ((d instanceof Enum) && ((Enum) d).ordinal() == 0) {
                            }
                            if (d.equals(obj)) {
                            }
                        } else if (((Double) d).doubleValue() == ShadowDrawableWrapper.COS_45) {
                        }
                    } else if (!((Boolean) C2071c.m3078d(method5, c0Var, new Object[0])).booleanValue()) {
                    }
                    m2727K1(sb, i, m2769Y1(concat3), d);
                }
            }
        }
        if (!(c0Var instanceof C2220hn)) {
            C2048b1 b1Var = ((C2071c) c0Var).zzc;
            if (b1Var != null) {
                for (int i2 = 0; i2 < b1Var.f3617a; i2++) {
                    m2727K1(sb, i, String.valueOf(b1Var.f3618b[i2] >>> 3), b1Var.f3619c[i2]);
                }
                return;
            }
            return;
        }
        C2220hn hnVar = (C2220hn) c0Var;
        throw null;
    }

    @Nullable
    /* renamed from: T */
    public static String m2752T(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return m2755U(jSONObject.optString("custom", (String) null));
    }

    /* renamed from: T0 */
    public static C3428h<Void> m2753T0(Collection<? extends C3428h<?>> collection) {
        if (collection.isEmpty()) {
            return m2740P((Object) null);
        }
        for (C3428h requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        C3423e0 e0Var = new C3423e0();
        C3434m mVar = new C3434m(collection.size(), e0Var);
        for (C3428h n1 : collection) {
            m2827n1(n1, mVar);
        }
        return e0Var;
    }

    /* renamed from: T1 */
    public static void m2754T1(C2913p6 p6Var, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : p6Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m2739O1(sb, i, m2792e2(concat), C2899o5.m5025j(method2, p6Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m2739O1(sb, i, m2792e2(concat2), C2899o5.m5025j(method3, p6Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object j = C2899o5.m5025j(method4, p6Var, new Object[0]);
                    if (method5 == null) {
                        if (j instanceof Boolean) {
                            if (!((Boolean) j).booleanValue()) {
                            }
                        } else if (j instanceof Integer) {
                            if (((Integer) j).intValue() == 0) {
                            }
                        } else if (j instanceof Float) {
                            if (((Float) j).floatValue() == 0.0f) {
                            }
                        } else if (!(j instanceof Double)) {
                            if (j instanceof String) {
                                obj = "";
                            } else if (j instanceof C2937r4) {
                                obj = C2937r4.f4977h;
                            } else if (j instanceof C2913p6) {
                                if (j == ((C2913p6) j).mo13483d()) {
                                }
                            } else if ((j instanceof Enum) && ((Enum) j).ordinal() == 0) {
                            }
                            if (j.equals(obj)) {
                            }
                        } else if (((Double) j).doubleValue() == ShadowDrawableWrapper.COS_45) {
                        }
                    } else if (!((Boolean) C2899o5.m5025j(method5, p6Var, new Object[0])).booleanValue()) {
                    }
                    m2739O1(sb, i, m2792e2(concat3), j);
                }
            }
        }
        if (!(p6Var instanceof C2873m5)) {
            C2888n7 n7Var = ((C2899o5) p6Var).zzc;
            if (n7Var != null) {
                for (int i2 = 0; i2 < n7Var.f4906a; i2++) {
                    m2739O1(sb, i, String.valueOf(n7Var.f4907b[i2] >>> 3), n7Var.f4908c[i2]);
                }
                return;
            }
            return;
        }
        C2873m5 m5Var = (C2873m5) p6Var;
        throw null;
    }

    @Nullable
    /* renamed from: U */
    public static String m2755U(@Nullable String str) {
        C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(C4748i.f9096b)) {
                return jSONObject.optString(C4748i.f9096b, (String) null);
            }
            C4857i2.m8933a(kVar, "Not a OneSignal formatted JSON string. No 'i' field in custom.", (Throwable) null);
            return null;
        } catch (JSONException unused) {
            C4857i2.m8933a(kVar, "Not a OneSignal formatted JSON String, error parsing string as JSON.", (Throwable) null);
        }
    }

    /* renamed from: U0 */
    public static byte m2756U0(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : 0;
        }
        return -1;
    }

    /* renamed from: U1 */
    public static boolean m2757U1(String str) {
        int i = C2459rk.f4267a;
        return str == null || str.isEmpty();
    }

    /* renamed from: V */
    public static int m2758V(int[] iArr, int i, boolean z) {
        int[] iArr2 = iArr;
        int i2 = i;
        int i3 = 0;
        for (int i4 : iArr2) {
            i3 += i4;
        }
        int length = iArr2.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = length - 1;
            if (i5 >= i8) {
                return i6;
            }
            int i9 = 1 << i5;
            i7 |= i9;
            int i10 = 1;
            while (i10 < iArr2[i5]) {
                int i11 = i3 - i10;
                int i12 = length - i5;
                int i13 = i12 - 2;
                int D = m2703D(i11 - 1, i13);
                if (z && i7 == 0) {
                    int i14 = i12 - 1;
                    if (i11 - i14 >= i14) {
                        D -= m2703D(i11 - i12, i13);
                    }
                }
                if (i12 - 1 > 1) {
                    int i15 = i11 - i13;
                    int i16 = 0;
                    while (i15 > i2) {
                        i16 += m2703D((i11 - i15) - 1, i12 - 3);
                        i15--;
                        int[] iArr3 = iArr;
                    }
                    D -= (i8 - i5) * i16;
                } else if (i11 > i2) {
                    D--;
                }
                i6 += D;
                i10++;
                i7 &= ~i9;
                iArr2 = iArr;
            }
            i3 -= i10;
            i5++;
            iArr2 = iArr;
        }
    }

    /* renamed from: V0 */
    public static int m2759V0(byte[] bArr, int i, C2144em emVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m2871y1(b, bArr, i2, emVar);
        }
        emVar.f3837a = b;
        return i2;
    }

    /* renamed from: V1 */
    public static final byte[] m2760V1(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    @RawRes
    /* renamed from: W */
    public static int m2761W(@NonNull Resources resources, @NonNull Uri uri) {
        int i;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String str = pathSegments.get(0);
            m2691A(str);
            i = resources.getIdentifier(pathSegments.get(1), str, uri.getAuthority());
        } else if (pathSegments.size() == 1) {
            try {
                int intValue = Integer.valueOf(pathSegments.get(0)).intValue();
                if (intValue != 0) {
                    m2691A(resources.getResourceTypeName(intValue));
                }
                i = intValue;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(C0843a.m449j("Unrecognized Uri format: ", uri), e);
            }
        } else {
            throw new IllegalArgumentException(C0843a.m449j("Unrecognized Uri format: ", uri));
        }
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(C0843a.m449j("Failed to obtain resource id for: ", uri));
    }

    /* renamed from: W0 */
    public static int m2762W0(byte[] bArr, int i, C2846k4 k4Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m2875z1(b, bArr, i2, k4Var);
        }
        k4Var.f4866a = b;
        return i2;
    }

    /* renamed from: W1 */
    public static int m2763W1(C2446r7 r7Var) {
        int ordinal = r7Var.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(r7Var);
                throw new GeneralSecurityException(C0843a.m455p(new StringBuilder(valueOf.length() + 22), "unknown point format: ", valueOf));
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        if (r3 != null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002b, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x002e, code lost:
        throw r1;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m2764X(@androidx.annotation.NonNull java.io.FileDescriptor r3) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch:{ all -> 0x0023 }
            long r1 = r3.size()     // Catch:{ all -> 0x0015 }
            int r1 = (int) r1
            r3.close()     // Catch:{ all -> 0x0023 }
            r0.close()
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            if (r3 == 0) goto L_0x0022
            r3.close()     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r3 = move-exception
            r1.addSuppressed(r3)     // Catch:{ all -> 0x0023 }
        L_0x0022:
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2764X(java.io.FileDescriptor):int");
    }

    /* renamed from: X0 */
    public static long m2765X0(String str) {
        byte[] bArr;
        C0823f.m376j(str);
        List<String> b = new C2440r1(new C2341mm(new C2283kc())).mo12961b(str);
        if (b.size() < 2) {
            throw new RuntimeException(str.length() != 0 ? "Invalid idToken ".concat(str) : new String("Invalid idToken "));
        }
        String str2 = b.get(1);
        try {
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(str2, 11);
            }
            C2411pk a = C2411pk.m4012a(new String(bArr, "UTF-8"));
            return a.f4208b.longValue() - a.f4207a.longValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }

    /* renamed from: X1 */
    public static int m2766X1(byte[] bArr, int i) {
        return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << 16);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer m2767Y(p005b.p273o.C5053z2 r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "android_notification_id"
            java.lang.String r4 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1"
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            r1 = 0
            r5[r1] = r12
            r9 = 0
            java.lang.String r2 = "notification"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x004c }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            b.o.a3 r1 = (p005b.p273o.C4783a3) r1     // Catch:{ all -> 0x004c }
            android.database.Cursor r11 = r1.mo16511S(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x002e
            r11.close()     // Catch:{ all -> 0x0047 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x002d
            r11.close()
        L_0x002d:
            return r9
        L_0x002e:
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0047 }
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0047 }
            r11.close()     // Catch:{ all -> 0x0047 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x0071
            r11.close()
            goto L_0x0071
        L_0x0047:
            r0 = move-exception
            r10 = r9
            r9 = r11
            r11 = r10
            goto L_0x004f
        L_0x004c:
            r11 = move-exception
            r0 = r11
            r11 = r9
        L_0x004f:
            b.o.i2$k r1 = p005b.p273o.C4857i2.C4868k.ERROR     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r2.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = "Error getting android notification id for summary notification group: "
            r2.append(r3)     // Catch:{ all -> 0x0072 }
            r2.append(r12)     // Catch:{ all -> 0x0072 }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x0072 }
            p005b.p273o.C4857i2.m8933a(r1, r12, r0)     // Catch:{ all -> 0x0072 }
            if (r9 == 0) goto L_0x0070
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x0070
            r9.close()
        L_0x0070:
            r9 = r11
        L_0x0071:
            return r9
        L_0x0072:
            r11 = move-exception
            if (r9 == 0) goto L_0x007e
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x007e
            r9.close()
        L_0x007e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2767Y(b.o.z2, java.lang.String):java.lang.Integer");
    }

    @NonNull
    /* renamed from: Y0 */
    public static Status m2768Y0(@Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        return asList.size() > 1 ? m2697B1((String) asList.get(0), (String) asList.get(1)) : m2697B1((String) asList.get(0), (String) null);
    }

    /* renamed from: Y1 */
    public static final String m2769Y1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        throw r1;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p080i.p081a.C1422f m2770Z(@androidx.annotation.NonNull java.io.File r2) {
        /*
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x002a
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1)
            b.i.a.i r2 = new b.i.a.i     // Catch:{ all -> 0x001e }
            r2.<init>()     // Catch:{ all -> 0x001e }
            r1 = 1
            b.i.a.f r2 = r2.mo11411h(r0, r1)     // Catch:{ all -> 0x001e }
            r0.close()
            return r2
        L_0x001e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0029:
            throw r1
        L_0x002a:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "File: '"
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = "' not exists"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2770Z(java.io.File):b.i.a.f");
    }

    @NonNull
    /* renamed from: Z0 */
    public static C2364nl m2771Z0(C3859c cVar, @Nullable String str) {
        if (C3928s.class.isAssignableFrom(cVar.getClass())) {
            C3928s sVar = (C3928s) cVar;
            return new C2364nl(sVar.f7202g, sVar.f7203h, "google.com", (String) null, (String) null, str, (String) null, (String) null);
        } else if (C3863e.class.isAssignableFrom(cVar.getClass())) {
            return new C2364nl((String) null, ((C3863e) cVar).f7113g, "facebook.com", (String) null, (String) null, str, (String) null, (String) null);
        } else {
            if (C3856a0.class.isAssignableFrom(cVar.getClass())) {
                C3856a0 a0Var = (C3856a0) cVar;
                return new C2364nl((String) null, a0Var.f7097g, "twitter.com", a0Var.f7098h, (String) null, str, (String) null, (String) null);
            } else if (C3926r.class.isAssignableFrom(cVar.getClass())) {
                return new C2364nl((String) null, ((C3926r) cVar).f7199g, "github.com", (String) null, (String) null, str, (String) null, (String) null);
            } else {
                if (C3941z.class.isAssignableFrom(cVar.getClass())) {
                    return new C2364nl((String) null, (String) null, "playgames.google.com", (String) null, ((C3941z) cVar).f7220g, str, (String) null, (String) null);
                }
                if (C3919n0.class.isAssignableFrom(cVar.getClass())) {
                    C3919n0 n0Var = (C3919n0) cVar;
                    C2364nl nlVar = n0Var.f7193j;
                    if (nlVar != null) {
                        return nlVar;
                    }
                    return new C2364nl(n0Var.f7191h, n0Var.f7192i, n0Var.f7190g, n0Var.f7195l, (String) null, str, n0Var.f7194k, n0Var.f7196m);
                }
                throw new IllegalArgumentException("Unsupported credential type.");
            }
        }
    }

    /* renamed from: Z1 */
    public static String m2772Z1(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + name2.length());
                    C0843a.m431G(sb3, "<", sb2, " threw ", name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb4 = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb4.append(str, i3, str.length());
            } else {
                sb4.append(str, i3, indexOf);
                sb4.append(objArr[i]);
                i3 = indexOf + 2;
                i++;
            }
        }
        sb4.append(str, i3, str.length());
        if (i < length2) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb4.append(", ");
                sb4.append(objArr[i4]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* renamed from: a */
    public static C4916n1 m2773a(JSONObject jSONObject) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        C4916n1 n1Var = new C4916n1();
        try {
            JSONObject S = m2749S(jSONObject);
            n1Var.f9486a = S.optString(C4748i.f9096b);
            n1Var.f9488c = S.optString("ti");
            n1Var.f9487b = S.optString("tn");
            jSONObject.toString();
            n1Var.f9490e = S.optJSONObject("a");
            S.optString("u", (String) null);
            jSONObject.optString("alert", (String) null);
            n1Var.f9489d = jSONObject.optString("title", (String) null);
            jSONObject.optString("sicon", (String) null);
            jSONObject.optString("bicon", (String) null);
            jSONObject.optString("licon", (String) null);
            jSONObject.optString("sound", (String) null);
            jSONObject.optString("grp", (String) null);
            jSONObject.optString("grp_msg", (String) null);
            jSONObject.optString("bgac", (String) null);
            jSONObject.optString("ledc", (String) null);
            String optString = jSONObject.optString("vis", (String) null);
            if (optString != null) {
                Integer.parseInt(optString);
            }
            jSONObject.optString("from", (String) null);
            jSONObject.optInt("pri", 0);
            boolean equals = "do_not_collapse".equals(jSONObject.optString("collapse_key", (String) null));
            try {
                m2720I0(n1Var);
            } catch (Throwable th) {
                C4857i2.m8933a(kVar, "Error assigning OSNotificationPayload.actionButtons values!", th);
            }
            try {
                m2723J0(n1Var, jSONObject);
            } catch (Throwable th2) {
                C4857i2.m8933a(kVar, "Error assigning OSNotificationPayload.backgroundImageLayout values!", th2);
            }
        } catch (JSONException e) {
            C4857i2.m8933a(kVar, "Error assigning OSNotificationPayload values!", e);
        }
        return n1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r1 = move-exception;
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p080i.p081a.C1422f m2774a0(@androidx.annotation.NonNull java.io.FileDescriptor r2) {
        /*
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1)
            b.i.a.i r2 = new b.i.a.i     // Catch:{ all -> 0x0018 }
            r2.<init>()     // Catch:{ all -> 0x0018 }
            r1 = 1
            b.i.a.f r2 = r2.mo11411h(r0, r1)     // Catch:{ all -> 0x0018 }
            r0.close()
            return r2
        L_0x0018:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x001f }
            goto L_0x0023
        L_0x001f:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0023:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2774a0(java.io.FileDescriptor):b.i.a.f");
    }

    /* renamed from: a1 */
    public static C2580wl m2775a1(C3938x xVar) {
        if (!TextUtils.isEmpty(xVar.f7214l)) {
            String str = xVar.f7212j;
            String str2 = xVar.f7214l;
            boolean z = xVar.f7213k;
            C2580wl wlVar = new C2580wl();
            C0823f.m376j(str);
            wlVar.f4412g = str;
            C0823f.m376j(str2);
            wlVar.f4415j = str2;
            wlVar.f4417l = z;
            return wlVar;
        }
        String str3 = xVar.f7209g;
        String str4 = xVar.f7210h;
        boolean z2 = xVar.f7213k;
        C2580wl wlVar2 = new C2580wl();
        C0823f.m376j(str3);
        wlVar2.f4413h = str3;
        C0823f.m376j(str4);
        wlVar2.f4414i = str4;
        wlVar2.f4417l = z2;
        return wlVar2;
    }

    /* renamed from: a2 */
    public static BigInteger m2776a2(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger H1 = m2718H1(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(H1);
        if (H1.signum() == 1) {
            BigInteger mod2 = mod.mod(H1);
            BigInteger bigInteger3 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger3)) {
                if (!H1.testBit(0) || !H1.testBit(1)) {
                    if (H1.testBit(0) && !H1.testBit(1)) {
                        bigInteger3 = BigInteger.ONE;
                        BigInteger shiftRight = H1.subtract(bigInteger3).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(H1);
                            if (mod3.equals(BigInteger.ZERO)) {
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, H1);
                            BigInteger bigInteger4 = BigInteger.ONE;
                            if (modPow.add(bigInteger4).equals(H1)) {
                                BigInteger shiftRight2 = H1.add(bigInteger4).shiftRight(1);
                                BigInteger bigInteger5 = bigInteger3;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(H1).multiply(mod3)).mod(H1);
                                    BigInteger mod4 = multiply.add(multiply).mod(H1);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod5 = bigInteger5.multiply(bigInteger3).add(mod4.multiply(mod3)).mod(H1);
                                        bigInteger4 = bigInteger3.multiply(mod4).add(bigInteger5).mod(H1);
                                        bigInteger5 = mod5;
                                    } else {
                                        bigInteger4 = mod4;
                                    }
                                }
                                bigInteger2 = bigInteger5;
                            } else if (modPow.equals(bigInteger4)) {
                                bigInteger3 = bigInteger3.add(bigInteger4);
                                i++;
                                if (i == 128 && !H1.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    } else {
                        bigInteger2 = null;
                    }
                } else {
                    bigInteger2 = mod2.modPow(H1.add(BigInteger.ONE).shiftRight(2), H1);
                }
                if (bigInteger3 != null && bigInteger3.multiply(bigInteger3).mod(H1).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z != bigInteger3.testBit(0) ? H1.subtract(bigInteger3).mod(H1) : bigInteger3;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    /* renamed from: b */
    public static void m2777b(Context context, C4848h hVar, C4840g0.C4841a aVar) {
        C4857i2.m8928E(context);
        try {
            String f = hVar.mo16582f("json_payload");
            C4840g0.C4841a aVar2 = null;
            if (f == null) {
                C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
                C4857i2.m8933a(kVar, "json_payload key is nonexistent from mBundle passed to ProcessFromGCMIntentService: " + hVar, (Throwable) null);
                return;
            }
            C4849h0 h0Var = new C4849h0(context);
            boolean z = false;
            h0Var.f9313c = hVar.mo16578b("restoring", false);
            h0Var.f9316f = hVar.mo16581e(BasePayload.TIMESTAMP_KEY);
            JSONObject jSONObject = new JSONObject(f);
            h0Var.f9312b = jSONObject;
            if (m2798g0(jSONObject) != null) {
                z = true;
            }
            h0Var.f9314d = z;
            if (h0Var.f9313c || z || !C4857i2.m8956x(context, h0Var.f9312b)) {
                if (hVar.mo16583g("android_notif_id")) {
                    aVar2 = new C4840g0.C4841a();
                    aVar2.f9299a = hVar.mo16580d("android_notif_id");
                }
                h0Var.f9317g = aVar2;
                m2781c(h0Var);
                if (h0Var.f9313c) {
                    C4835f2.m8872v(100);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b0 */
    public static DateFormat m2778b0(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else if (i == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(C0843a.m444e("Unknown DateFormat style: ", i));
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else if (i2 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(C0843a.m444e("Unknown DateFormat style: ", i2));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    /* renamed from: b1 */
    public static <T> C2975u3<T> m2779b1(C2975u3<T> u3Var) {
        return ((u3Var instanceof C3001w3) || (u3Var instanceof C2988v3)) ? u3Var : u3Var instanceof Serializable ? new C2988v3(u3Var) : new C3001w3(u3Var);
    }

    /* renamed from: b2 */
    public static final void m2780b2(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: c */
    public static int m2781c(C4849h0 h0Var) {
        Notification notification;
        Integer valueOf;
        C4840g0.C4841a aVar;
        C4849h0 h0Var2 = h0Var;
        C4857i2.C4864g gVar = C4857i2.f9338H;
        h0Var2.f9315e = (gVar != null && gVar.f9395e == C4857i2.C4871n.InAppAlert) && C4857i2.m8954v();
        if (!h0Var2.f9313c && h0Var2.f9312b.has("collapse_key") && !"do_not_collapse".equals(h0Var2.f9312b.optString("collapse_key"))) {
            Cursor S = C4783a3.m8766e(h0Var2.f9311a).mo16511S("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{h0Var2.f9312b.optString("collapse_key")}, (String) null, (String) null, (String) null);
            if (S.moveToFirst() && (valueOf = Integer.valueOf(S.getInt(S.getColumnIndex("android_notification_id")))) != null && ((aVar = h0Var2.f9317g) == null || aVar.f9299a == null)) {
                if (aVar == null) {
                    h0Var2.f9317g = new C4840g0.C4841a();
                }
                h0Var2.f9317g.f9299a = valueOf;
            }
            S.close();
        }
        if (m2726K0(h0Var2.f9312b.optString("alert"))) {
            C4950r.m9107s(h0Var2.f9311a);
            Activity k = C4857i2.m8943k();
            if (h0Var2.f9313c || !h0Var2.f9315e || k == null) {
                int intValue = h0Var.mo16584a().intValue();
                JSONObject jSONObject = h0Var2.f9312b;
                String optString = jSONObject.optString("grp", (String) null);
                new ArrayList();
                Context context = C4950r.f9548a;
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification statusBarNotification : C4805c3.m8807f(context)) {
                    Notification notification2 = statusBarNotification.getNotification();
                    boolean c = C4855i0.m8922c(statusBarNotification);
                    boolean z = notification2.getGroup() == null || notification2.getGroup().equals("os_group_undefined");
                    if (!c && z) {
                        arrayList.add(statusBarNotification);
                    }
                }
                if (optString == null && arrayList.size() >= 3) {
                    Context context2 = C4950r.f9548a;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        StatusBarNotification statusBarNotification2 = (StatusBarNotification) it.next();
                        NotificationManagerCompat.from(context2).notify(statusBarNotification2.getId(), Notification.Builder.recoverBuilder(context2, statusBarNotification2.getNotification()).setGroup("os_group_undefined").build());
                    }
                    optString = "os_group_undefined";
                }
                C4950r.C4951a g = C4950r.m9095g(h0Var);
                NotificationCompat.Builder builder = g.f9553a;
                C4950r.m9091c(jSONObject, builder, intValue, (String) null);
                try {
                    C4950r.m9089a(jSONObject, builder);
                } catch (Throwable th) {
                    C4857i2.m8933a(C4857i2.C4868k.ERROR, "Could not set background notification image!", th);
                }
                if (h0Var2.f9313c) {
                    C4950r.m9105q(builder);
                }
                int i = optString != null ? 2 : 1;
                Context context3 = C4950r.f9548a;
                String str = C4855i0.f9330a;
                try {
                    C4855i0.m8921b(context3, i);
                } catch (Throwable unused) {
                    C4855i0.m8920a(context3, i);
                }
                if (optString != null) {
                    SecureRandom secureRandom = new SecureRandom();
                    builder.setContentIntent(C4950r.m9100l(secureRandom.nextInt(), C4950r.m9102n(intValue).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", optString)));
                    builder.setDeleteIntent(C4950r.m9100l(secureRandom.nextInt(), C4950r.m9101m(intValue).putExtra("grp", optString)));
                    builder.setGroup(optString);
                    try {
                        builder.setGroupAlertBehavior(1);
                    } catch (Throwable unused2) {
                    }
                    notification = builder.build();
                    if (optString.equals("os_group_undefined")) {
                        int size = arrayList.size() + 1;
                        JSONObject jSONObject2 = h0Var2.f9312b;
                        SecureRandom secureRandom2 = new SecureRandom();
                        String str2 = size + " new messages";
                        PendingIntent l = C4950r.m9100l(secureRandom2.nextInt(), C4950r.m9093e(-718463522, jSONObject2, "os_group_undefined"));
                        PendingIntent l2 = C4950r.m9100l(secureRandom2.nextInt(), C4950r.m9101m(0).putExtra("summary", "os_group_undefined"));
                        NotificationCompat.Builder builder2 = C4950r.m9095g(h0Var).f9553a;
                        builder2.setContentIntent(l).setDeleteIntent(l2).setContentTitle(C4950r.f9548a.getPackageManager().getApplicationLabel(C4950r.f9548a.getApplicationInfo())).setContentText(str2).setNumber(size).setSmallIcon(C4950r.m9098j()).setLargeIcon(C4950r.m9106r(C4950r.m9097i("ic_onesignal_large_icon_default"))).setOnlyAlertOnce(true).setAutoCancel(false).setGroup("os_group_undefined").setGroupSummary(true);
                        try {
                            builder2.setGroupAlertBehavior(1);
                        } catch (Throwable unused3) {
                        }
                        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                        inboxStyle.setBigContentTitle(str2);
                        builder2.setStyle(inboxStyle);
                        NotificationManagerCompat.from(C4950r.f9548a).notify(-718463522, builder2.build());
                    } else {
                        C4950r.m9094f(h0Var2, g);
                    }
                } else {
                    SecureRandom secureRandom3 = new SecureRandom();
                    builder.setContentIntent(C4950r.m9100l(secureRandom3.nextInt(), C4950r.m9102n(intValue).putExtra("onesignalData", jSONObject.toString())));
                    builder.setDeleteIntent(C4950r.m9100l(secureRandom3.nextInt(), C4950r.m9101m(intValue)));
                    notification = builder.build();
                }
                C4950r.m9092d(g, notification);
                NotificationManagerCompat.from(C4950r.f9548a).notify(intValue, notification);
            } else {
                k.runOnUiThread(new C4941q(k, h0Var2.f9312b, h0Var.mo16584a().intValue()));
            }
        }
        if (!h0Var2.f9313c && !h0Var2.f9314d) {
            m2700C0(h0Var2, false);
            try {
                JSONObject jSONObject3 = new JSONObject(h0Var2.f9312b.toString());
                jSONObject3.put("androidNotificationId", h0Var.mo16584a());
                C4857i2.m8952t(new JSONArray().put(jSONObject3), true, h0Var2.f9315e);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return h0Var.mo16584a().intValue();
    }

    /* renamed from: c0 */
    public static void m2782c0(PackageManager packageManager, ComponentName componentName, int i) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0:
                    while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i2++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: c1 */
    public static Boolean m2783c1(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: c2 */
    public static void m2784c2(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    /* renamed from: d */
    public static Object m2785d(C3792o.C3793a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.mo15201d();
    }

    /* renamed from: d0 */
    public static void m2786d0(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) {
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String P0 = m2741P0(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String P02 = jSONArray2 == null ? null : m2741P0(jSONArray2);
        for (int i = 0; i < jSONArray.length(); i++) {
            String str2 = (String) jSONArray.get(i);
            if (jSONArray2 == null || !P02.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string = jSONArray2.getString(i2);
                if (!P0.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (!jSONArray4.toString().equals("[]")) {
            jSONObject.put(str + "_d", jSONArray4);
        }
    }

    /* renamed from: d1 */
    public static <V> V m2787d1(C2710a3<V> a3Var) {
        long clearCallingIdentity;
        try {
            return a3Var.mo13218a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = a3Var.mo13218a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: d2 */
    public static int m2788d2(byte[] bArr, int i) {
        return ((bArr[i + 3] & ExifInterface.MARKER) << 24) | (bArr[i] & ExifInterface.MARKER) | ((bArr[i + 1] & ExifInterface.MARKER) << 8) | ((bArr[i + 2] & ExifInterface.MARKER) << 16);
    }

    /* renamed from: e */
    public static int m2789e(C4609b bVar, boolean z) {
        int i;
        int i2;
        if (z) {
            i = bVar.f8659c;
        } else {
            i = bVar.f8658b;
        }
        if (z) {
            i2 = bVar.f8658b;
        } else {
            i2 = bVar.f8659c;
        }
        byte[][] bArr = bVar.f8657a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    i5 = 1;
                    b = b2;
                }
            }
            if (i5 >= 5) {
                i3 = (i5 - 5) + 3 + i3;
            }
        }
        return i3;
    }

    /* renamed from: e0 */
    public static <T> void m2790e0(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: e1 */
    public static String m2791e1() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        m2730L1(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            m2730L1(sb, locale2);
        }
        return sb.toString();
    }

    /* renamed from: e2 */
    public static final String m2792e2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static <TResult> TResult m2793f(@NonNull C3428h<TResult> hVar) {
        C0823f.m378k("Must not be called on the main application thread");
        C0823f.m380l(hVar, "Task must not be null");
        if (hVar.mo14691m()) {
            return m2709E1(hVar);
        }
        C3432k kVar = new C3432k((C3426f0) null);
        m2827n1(hVar, kVar);
        kVar.f6201a.await();
        return m2709E1(hVar);
    }

    /* renamed from: f0 */
    public static void m2794f0(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: f1 */
    public static String m2795f1(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: f2 */
    public static long m2796f2(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: g */
    public static <TResult> TResult m2797g(@NonNull C3428h<TResult> hVar, long j, @NonNull TimeUnit timeUnit) {
        C0823f.m378k("Must not be called on the main application thread");
        C0823f.m380l(hVar, "Task must not be null");
        C0823f.m380l(timeUnit, "TimeUnit must not be null");
        if (hVar.mo14691m()) {
            return m2709E1(hVar);
        }
        C3432k kVar = new C3432k((C3426f0) null);
        m2827n1(hVar, kVar);
        if (kVar.f6201a.await(j, timeUnit)) {
            return m2709E1(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Nullable
    /* renamed from: g0 */
    public static String m2798g0(JSONObject jSONObject) {
        try {
            JSONObject S = m2749S(jSONObject);
            if (!S.has("a")) {
                return null;
            }
            JSONObject optJSONObject = S.optJSONObject("a");
            if (optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: g1 */
    public static String m2799g1(C2317lm lmVar) {
        String str;
        StringBuilder sb = new StringBuilder(lmVar.mo12755l());
        for (int i = 0; i < lmVar.mo12755l(); i++) {
            int d = lmVar.mo12753d(i);
            if (d == 34) {
                str = "\\\"";
            } else if (d == 39) {
                str = "\\'";
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (d < 32 || d > 126) {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            d = (d & 7) + 48;
                        }
                        sb.append((char) d);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: g2 */
    public static ECParameterSpec m2800g2(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2 = i - 1;
        if (i2 == 0) {
            str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
            str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
        } else if (i2 != 1) {
            str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
            str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
        } else {
            str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
            str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
        }
        return m2836p2(str, str2, str3, str4, str5);
    }

    /* renamed from: h */
    public static <ResultT> ResultT m2801h(@NonNull C3651r<ResultT> rVar) {
        boolean z;
        m2710F(rVar, "Task must not be null");
        synchronized (rVar.f6724a) {
            z = rVar.f6726c;
        }
        if (z) {
            return m2825n(rVar);
        }
        C3652s sVar = new C3652s((byte[]) null);
        Executor executor = C3638e.f6703b;
        rVar.mo14934c(executor, sVar);
        rVar.mo14933b(executor, sVar);
        sVar.f6729a.await();
        return m2825n(rVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0098, code lost:
        if (r6.isClosed() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        if (r6.isClosed() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        r6.close();
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor m2802h0(android.content.Context r21, p005b.p273o.C5053z2 r22, java.lang.String r23, boolean r24) {
        /*
            r0 = r21
            r1 = r23
            java.lang.String r2 = "android_notification_id"
            java.lang.String r3 = "created_time"
            java.lang.String[] r6 = new java.lang.String[]{r2, r3}
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]
            r12 = 0
            r8[r12] = r1
            r13 = r22
            b.o.a3 r13 = (p005b.p273o.C4783a3) r13
            java.lang.String r5 = "notification"
            java.lang.String r7 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "_id DESC"
            r4 = r13
            android.database.Cursor r4 = r4.mo16511S(r5, r6, r7, r8, r9, r10, r11)
            int r5 = r4.getCount()
            r6 = 0
            if (r5 != 0) goto L_0x006b
            r4.close()
            java.lang.Integer r1 = m2767Y(r13, r1)
            if (r1 != 0) goto L_0x0034
            return r4
        L_0x0034:
            java.lang.String r3 = "notification"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            int r5 = r1.intValue()
            r0.cancel(r5)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            if (r24 == 0) goto L_0x004d
            java.lang.String r5 = "dismissed"
            goto L_0x004f
        L_0x004d:
            java.lang.String r5 = "opened"
        L_0x004f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "android_notification_id = "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r13.mo16514l0(r3, r0, r1, r6)
            return r4
        L_0x006b:
            if (r5 != r2) goto L_0x00bc
            r4.close()
            java.lang.Integer r3 = m2767Y(r13, r1)
            if (r3 != 0) goto L_0x0077
            return r4
        L_0x0077:
            b.o.a3 r13 = p005b.p273o.C4783a3.m8766e(r21)
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r12] = r1
            java.lang.String r14 = "notification"
            java.lang.String[] r15 = p005b.p273o.C4915n0.f9484a     // Catch:{ all -> 0x009b }
            java.lang.String r16 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r2
            android.database.Cursor r6 = r13.mo16511S(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x009b }
            p005b.p273o.C4915n0.m9029c(r0, r6, r12)     // Catch:{ all -> 0x009b }
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00ae
            goto L_0x00ab
        L_0x009b:
            r0 = move-exception
            b.o.i2$k r1 = p005b.p273o.C4857i2.C4868k.ERROR     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Error restoring notification records! "
            p005b.p273o.C4857i2.m8933a(r1, r2, r0)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x00ae
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x00ae
        L_0x00ab:
            r6.close()
        L_0x00ae:
            return r4
        L_0x00af:
            r0 = move-exception
            if (r6 == 0) goto L_0x00bb
            boolean r1 = r6.isClosed()
            if (r1 != 0) goto L_0x00bb
            r6.close()
        L_0x00bb:
            throw r0
        L_0x00bc:
            r4.moveToFirst()     // Catch:{ JSONException -> 0x00f2 }
            int r3 = r4.getColumnIndex(r3)     // Catch:{ JSONException -> 0x00f2 }
            long r7 = r4.getLong(r3)     // Catch:{ JSONException -> 0x00f2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ JSONException -> 0x00f2 }
            r4.close()     // Catch:{ JSONException -> 0x00f2 }
            java.lang.Integer r5 = m2767Y(r13, r1)     // Catch:{ JSONException -> 0x00f2 }
            if (r5 != 0) goto L_0x00d5
            return r4
        L_0x00d5:
            b.o.h0 r5 = new b.o.h0     // Catch:{ JSONException -> 0x00f2 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x00f2 }
            r5.f9313c = r2     // Catch:{ JSONException -> 0x00f2 }
            r5.f9316f = r3     // Catch:{ JSONException -> 0x00f2 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f2 }
            r0.<init>()     // Catch:{ JSONException -> 0x00f2 }
            java.lang.String r2 = "grp"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00f2 }
            r5.f9312b = r0     // Catch:{ JSONException -> 0x00f2 }
            android.content.Context r0 = r5.f9311a     // Catch:{ JSONException -> 0x00f2 }
            p005b.p273o.C4950r.m9107s(r0)     // Catch:{ JSONException -> 0x00f2 }
            p005b.p273o.C4950r.m9094f(r5, r6)     // Catch:{ JSONException -> 0x00f2 }
        L_0x00f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2802h0(android.content.Context, b.o.z2, java.lang.String, boolean):android.database.Cursor");
    }

    /* renamed from: h1 */
    public static String m2803h1(C2937r4 r4Var) {
        String str;
        StringBuilder sb = new StringBuilder(r4Var.mo13567l());
        for (int i = 0; i < r4Var.mo13567l(); i++) {
            int d = r4Var.mo13565d(i);
            if (d == 34) {
                str = "\\\"";
            } else if (d == 39) {
                str = "\\'";
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (d < 32 || d > 126) {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            d = (d & 7) + 48;
                        }
                        sb.append((char) d);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: h2 */
    public static boolean m2804h2(byte b) {
        return b > -65;
    }

    /* renamed from: i */
    public static <ResultT> C3651r<ResultT> m2805i(Exception exc) {
        C3651r<ResultT> rVar = new C3651r<>();
        rVar.mo14935d(exc);
        return rVar;
    }

    /* renamed from: i0 */
    public static boolean m2806i0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: i1 */
    public static String m2807i1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r1 + r1);
        for (byte b : bArr) {
            byte b2 = b & ExifInterface.MARKER;
            sb.append("0123456789abcdef".charAt(b2 >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    /* renamed from: i2 */
    public static final byte[] m2808i2(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return m2760V1(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: j */
    public static String m2809j(File file) {
        if (file.getName().endsWith(".apk")) {
            String str = "";
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: j0 */
    public static boolean m2810j0(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        return trim.startsWith("http://") || trim.startsWith("https://");
    }

    @NonNull
    /* renamed from: j1 */
    public static List<String> m2811j1(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    /* renamed from: j2 */
    public static long m2812j2(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: k */
    public static String m2813k(int i, int i2, String str) {
        if (i < 0) {
            return C3757c.m7060a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C3757c.m7060a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(C0843a.m444e("negative size: ", i2));
        }
    }

    /* renamed from: k0 */
    public static boolean m2814k0(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: k1 */
    public static void m2815k1(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* renamed from: k2 */
    public static boolean m2816k2(byte b) {
        return b > -65;
    }

    /* renamed from: l */
    public static ExecutorService m2817l(String str) {
        String str2 = str;
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C4006e0(str2, new AtomicLong(1)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new C4010f0(str, unconfigurableExecutorService, 2, TimeUnit.SECONDS), C0843a.m451l("Crashlytics Shutdown Hook for ", str2)));
        return unconfigurableExecutorService;
    }

    /* renamed from: l0 */
    public static boolean m2818l0(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: l1 */
    public static void m2819l1(C2030a8 a8Var) {
        m2800g2(m2742P1(a8Var.mo12380s().mo12738s()));
        m2712F1(a8Var.mo12380s().mo12739t());
        if (a8Var.mo12382u() != C2446r7.UNKNOWN_FORMAT) {
            C2537v2.m4281c(a8Var.mo12381t().mo13025s());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: l2 */
    public static int m2820l2(byte[] bArr, int i, C2144em emVar) {
        int V0 = m2759V0(bArr, i, emVar);
        int i2 = emVar.f3837a;
        if (i2 < 0) {
            throw C2246j.m3525b();
        } else if (i2 == 0) {
            emVar.f3839c = "";
            return V0;
        } else {
            emVar.f3839c = new String(bArr, V0, i2, C2196h.f3910a);
            return V0 + i2;
        }
    }

    @NonNull
    /* renamed from: m */
    public static JSONObject m2821m(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
                C4857i2.m8933a(kVar, "bundleAsJSONObject error for key: " + str, e);
            }
        }
        return jSONObject;
    }

    /* renamed from: m0 */
    public static boolean m2822m0(Context context, int i) {
        if (!m2744Q0(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C1768j a = C1768j.m2347a(context);
            Objects.requireNonNull(a);
            if (packageInfo == null) {
                return false;
            }
            if (!C1768j.m2349d(packageInfo, false)) {
                if (!C1768j.m2349d(packageInfo, true)) {
                    return false;
                }
                if (!C1767i.m2343a(a.f3121a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }, LOOP:1: B:31:0x00bb->B:36:0x00cd, LOOP_START, PHI: r13 
      PHI: (r13v1 int) = (r13v0 int), (r13v2 int) binds: [B:30:0x00b9, B:36:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[Catch:{  }, RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: m1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2823m1(p005b.p096l.p097a.p113c.p145h.p147b.C3269o3 r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) {
        /*
            r1 = r15
            r10 = r16
            r11 = r17
            r12 = r20
            if (r1 == 0) goto L_0x00fa
            r13 = 0
            r14 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r6[r13] = r11     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x002d }
            r2.close()
            if (r0 != 0) goto L_0x0045
            goto L_0x0040
        L_0x002d:
            r0 = move-exception
            goto L_0x0034
        L_0x002f:
            r0 = move-exception
            goto L_0x00f4
        L_0x0032:
            r0 = move-exception
            r2 = r14
        L_0x0034:
            b.l.a.c.h.b.m3 r3 = r1.f5802i     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "Error querying for table"
            r3.mo14416c(r4, r11, r0)     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x0040
            r2.close()
        L_0x0040:
            r2 = r18
            r10.execSQL(r2)
        L_0x0045:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "SELECT * FROM "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " LIMIT 0"
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            android.database.Cursor r2 = r10.rawQuery(r2, r14)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00e4 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00e4 }
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = ","
            r3 = r19
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00e9 }
            r4 = r13
        L_0x007e:
            if (r4 >= r3) goto L_0x00b9
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r6 == 0) goto L_0x008b
            int r4 = r4 + 1
            goto L_0x007e
        L_0x008b:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 35
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r3.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "Table "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " is missing required column: "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00b9:
            if (r12 == 0) goto L_0x00d0
        L_0x00bb:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00e9 }
            if (r13 >= r2) goto L_0x00d0
            r2 = r12[r13]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00cd
            int r2 = r13 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00e9 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00cd:
            int r13 = r13 + 2
            goto L_0x00bb
        L_0x00d0:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00e3
            b.l.a.c.h.b.m3 r2 = r1.f5802i     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r3 = "Table has extra columns. table, columns"
            java.lang.String r4 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)     // Catch:{ SQLiteException -> 0x00e9 }
            r2.mo14416c(r3, r11, r0)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e3:
            return
        L_0x00e4:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            b.l.a.c.h.b.m3 r1 = r1.f5799f
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.mo14415b(r2, r11)
            throw r0
        L_0x00f2:
            r0 = move-exception
            r14 = r2
        L_0x00f4:
            if (r14 == 0) goto L_0x00f9
            r14.close()
        L_0x00f9:
            throw r0
        L_0x00fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2823m1(b.l.a.c.h.b.o3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: m2 */
    public static int m2824m2(byte[] bArr, int i, C2846k4 k4Var) {
        int W0 = m2762W0(bArr, i, k4Var);
        int i2 = k4Var.f4866a;
        if (i2 < 0) {
            throw C3016x5.m5683b();
        } else if (i2 == 0) {
            k4Var.f4868c = "";
            return W0;
        } else {
            k4Var.f4868c = new String(bArr, W0, i2, C2990v5.f5088a);
            return W0 + i2;
        }
    }

    /* renamed from: n */
    public static <ResultT> ResultT m2825n(C3651r<ResultT> rVar) {
        Exception exc;
        if (rVar.mo14938g()) {
            return rVar.mo14937f();
        }
        synchronized (rVar.f6724a) {
            exc = rVar.f6728e;
        }
        throw new ExecutionException(exc);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003d */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m2826n0(android.content.Context r4) {
        /*
            java.lang.Class<b.l.a.c.b.p.d> r0 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004a }
            android.content.Context r2 = f3514d     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0017
            java.lang.Boolean r3 = f3515e     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0017
            if (r2 != r1) goto L_0x0017
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return r4
        L_0x0017:
            r2 = 0
            f3515e = r2     // Catch:{ all -> 0x004a }
            boolean r2 = m2806i0()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x002f
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004a }
        L_0x002c:
            f3515e = r4     // Catch:{ all -> 0x004a }
            goto L_0x0040
        L_0x002f:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003d }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003d }
            f3515e = r4     // Catch:{ ClassNotFoundException -> 0x003d }
            goto L_0x0040
        L_0x003d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004a }
            goto L_0x002c
        L_0x0040:
            f3514d = r1     // Catch:{ all -> 0x004a }
            java.lang.Boolean r4 = f3515e     // Catch:{ all -> 0x004a }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return r4
        L_0x004a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2826n0(android.content.Context):boolean");
    }

    /* renamed from: n1 */
    public static void m2827n1(C3428h<?> hVar, C3433l lVar) {
        Executor executor = C3430j.f6199b;
        hVar.mo14683e(executor, lVar);
        hVar.mo14682d(executor, lVar);
        hVar.mo14679a(executor, lVar);
    }

    /* renamed from: n2 */
    public static int m2828n2(byte[] bArr, int i, C2144em emVar) {
        int V0 = m2759V0(bArr, i, emVar);
        int i2 = emVar.f3837a;
        if (i2 < 0) {
            throw C2246j.m3525b();
        } else if (i2 == 0) {
            emVar.f3839c = "";
            return V0;
        } else {
            emVar.f3839c = C2344n1.m3791d(bArr, V0, i2);
            return V0 + i2;
        }
    }

    /* renamed from: o */
    public static <TResult> C3428h<TResult> m2829o(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        C0823f.m380l(executor, "Executor must not be null");
        C0823f.m380l(callable, "Callback must not be null");
        C3423e0 e0Var = new C3423e0();
        executor.execute(new C3426f0(e0Var, callable));
        return e0Var;
    }

    /* renamed from: o0 */
    public static boolean m2830o0(char c) {
        if (m2858v0(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: o1 */
    public static void m2831o1(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", (intent.getExtras() == null || !C4325c.m7933h(intent.getExtras())) ? "data" : "display");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 22);
            sb.append("Sending event=");
            sb.append(str);
            sb.append(" params=");
            sb.append(valueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        C3825d c = C3825d.m7208c();
        c.mo15344a();
        C3840a aVar = (C3840a) c.f7045d.mo15457a(C3840a.class);
        if (aVar != null) {
            aVar.mo15360c("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    /* renamed from: o2 */
    public static int m2832o2(byte[] bArr, int i, C2846k4 k4Var) {
        int i2;
        int i3;
        int W0 = m2762W0(bArr, i, k4Var);
        int i4 = k4Var.f4866a;
        if (i4 < 0) {
            throw C3016x5.m5683b();
        } else if (i4 == 0) {
            k4Var.f4868c = "";
            return W0;
        } else {
            C3018x7 x7Var = C3044z7.f5186a;
            int length = bArr.length;
            if ((W0 | i4 | ((length - W0) - i4)) >= 0) {
                int i5 = W0 + i4;
                char[] cArr = new char[i4];
                int i6 = 0;
                while (i2 < i5) {
                    byte b = bArr[i2];
                    if (!m2867x1(b)) {
                        break;
                    }
                    W0 = i2 + 1;
                    cArr[i3] = (char) b;
                    i6 = i3 + 1;
                }
                while (i2 < i5) {
                    int i7 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (m2867x1(b2)) {
                        int i8 = i3 + 1;
                        cArr[i3] = (char) b2;
                        i2 = i7;
                        while (true) {
                            i3 = i8;
                            if (i2 >= i5) {
                                break;
                            }
                            byte b3 = bArr[i2];
                            if (!m2867x1(b3)) {
                                break;
                            }
                            i2++;
                            i8 = i3 + 1;
                            cArr[i3] = (char) b3;
                        }
                    } else if (b2 < -32) {
                        if (i7 < i5) {
                            int i9 = i7 + 1;
                            int i10 = i3 + 1;
                            byte b4 = bArr[i7];
                            if (b2 < -62 || m2816k2(b4)) {
                                throw C3016x5.m5685d();
                            }
                            cArr[i3] = (char) (((b2 & 31) << 6) | (b4 & 63));
                            i2 = i9;
                            i3 = i10;
                        } else {
                            throw C3016x5.m5685d();
                        }
                    } else if (b2 < -16) {
                        if (i7 < i5 - 1) {
                            int i11 = i7 + 1;
                            int i12 = i11 + 1;
                            int i13 = i3 + 1;
                            byte b5 = bArr[i7];
                            byte b6 = bArr[i11];
                            if (!m2816k2(b5)) {
                                if (b2 == -32) {
                                    if (b5 >= -96) {
                                        b2 = -32;
                                    }
                                }
                                if (b2 == -19) {
                                    if (b5 < -96) {
                                        b2 = -19;
                                    }
                                }
                                if (!m2816k2(b6)) {
                                    cArr[i3] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i2 = i12;
                                    i3 = i13;
                                }
                            }
                            throw C3016x5.m5685d();
                        }
                        throw C3016x5.m5685d();
                    } else if (i7 < i5 - 2) {
                        int i14 = i7 + 1;
                        int i15 = i14 + 1;
                        int i16 = i15 + 1;
                        byte b7 = bArr[i7];
                        byte b8 = bArr[i14];
                        byte b9 = bArr[i15];
                        if (!m2816k2(b7)) {
                            if ((((b7 + 112) + (b2 << 28)) >> 30) == 0 && !m2816k2(b8) && !m2816k2(b9)) {
                                byte b10 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                                cArr[i3] = (char) ((b10 >>> 10) + 55232);
                                cArr[i3 + 1] = (char) ((b10 & ExifInterface.MARKER) + 56320);
                                i3 += 2;
                                i2 = i16;
                            }
                        }
                        throw C3016x5.m5685d();
                    } else {
                        throw C3016x5.m5685d();
                    }
                }
                k4Var.f4868c = new String(cArr, 0, i3);
                return i5;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(W0), Integer.valueOf(i4)}));
        }
    }

    /* renamed from: p */
    public static void m2833p(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: p0 */
    public static boolean m2834p0(String str) {
        int i = C3756b.f6942a;
        return str == null || str.isEmpty();
    }

    /* renamed from: p1 */
    public static void m2835p1(String str, C2553vi viVar, C2116dj djVar, Type type, C2649zi ziVar) {
        String str2;
        BufferedOutputStream bufferedOutputStream;
        BufferedReader bufferedReader;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            boolean z = true;
            httpURLConnection.setDoOutput(true);
            byte[] bytes = viVar.mo12411a().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            ziVar.mo13143a(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (responseCode < 200 || responseCode >= 300) {
                z = false;
            }
            if (!z) {
                djVar.mo12390d((String) C2529ui.m4270a(sb2, String.class));
                return;
            } else {
                djVar.mo12389a((C2577wi) C2529ui.m4270a(sb2, type));
                return;
            }
            throw th;
            throw th;
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            djVar.mo12390d(str2);
        } catch (UnknownHostException unused2) {
            str2 = "<<Network Error>>";
            djVar.mo12390d(str2);
        } catch (C2431qg | IOException | JSONException e) {
            str2 = e.getMessage();
            djVar.mo12390d(str2);
        } catch (Throwable th) {
            C2642zb.f4525a.mo13011a(th, th);
        }
    }

    /* renamed from: p2 */
    public static ECParameterSpec m2836p2(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger(ExifInterface.GPS_MEASUREMENT_3D)), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: q */
    public static void m2837q(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C3757c.m7060a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: q0 */
    public static boolean m2838q0(@Nullable Bundle bundle) {
        String str = null;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", (String) null);
            if (string != null) {
                str = m2755U(string);
            } else {
                C4857i2.m8933a(C4857i2.C4868k.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.", (Throwable) null);
            }
        }
        return str != null;
    }

    /* renamed from: q1 */
    public static void m2839q1(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger H1 = m2718H1(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(H1) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(H1) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(H1).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(H1))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: q2 */
    public static int m2840q2(byte[] bArr, int i, C2144em emVar) {
        int V0 = m2759V0(bArr, i, emVar);
        int i2 = emVar.f3837a;
        if (i2 < 0) {
            throw C2246j.m3525b();
        } else if (i2 > bArr.length - V0) {
            throw C2246j.m3524a();
        } else if (i2 == 0) {
            emVar.f3839c = C2317lm.f4051h;
            return V0;
        } else {
            emVar.f3839c = C2317lm.m3705I(bArr, V0, i2);
            return V0 + i2;
        }
    }

    /* renamed from: r */
    public static void m2841r(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C3757c.m7060a(str, Integer.valueOf(i)));
        }
    }

    @TargetApi(20)
    /* renamed from: r0 */
    public static boolean m2842r0(Context context) {
        if (f3511a == null) {
            f3511a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f3511a.booleanValue();
    }

    /* renamed from: r1 */
    public static boolean m2843r1() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: r2 */
    public static int m2844r2(byte[] bArr, int i, C2846k4 k4Var) {
        int W0 = m2762W0(bArr, i, k4Var);
        int i2 = k4Var.f4866a;
        if (i2 < 0) {
            throw C3016x5.m5683b();
        } else if (i2 > bArr.length - W0) {
            throw C3016x5.m5682a();
        } else if (i2 == 0) {
            k4Var.f4868c = C2937r4.f4977h;
            return W0;
        } else {
            k4Var.f4868c = C2937r4.m5128F(bArr, W0, i2);
            return W0 + i2;
        }
    }

    /* renamed from: s */
    public static void m2845s(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C3757c.m7060a(str, objArr));
        }
    }

    @TargetApi(26)
    /* renamed from: s0 */
    public static boolean m2846s0(Context context) {
        if (!m2842r0(context)) {
            return false;
        }
        if (f3512b == null) {
            f3512b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3512b.booleanValue() && !m2806i0();
    }

    /* renamed from: s1 */
    public static /* synthetic */ boolean m2847s1(byte b) {
        return b >= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m2848s2(p005b.p096l.p097a.p113c.p131e.p136e.C2319m0 r6, byte[] r7, int r8, int r9, p005b.p096l.p097a.p113c.p131e.p136e.C2144em r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m2871y1(r8, r7, r0, r10)
            int r8 = r10.f3837a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo12554a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo12563j(r1, r2, r3, r4, r5)
            r6.mo12555b(r9)
            r10.f3839c = r9
            return r8
        L_0x0025:
            b.l.a.c.e.e.j r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2246j.m3524a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2848s2(b.l.a.c.e.e.m0, byte[], int, int, b.l.a.c.e.e.em):int");
    }

    /* renamed from: t */
    public static void m2849t(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: t0 */
    public static boolean m2850t0(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t1 */
    public static final boolean m2851t1(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null || bArr.length != bArr2.length)) {
            byte b = 0;
            for (int i = 0; i < bArr.length; i++) {
                b |= bArr[i] ^ bArr2[i];
            }
            if (b == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m2852t2(p005b.p096l.p097a.p113c.p131e.p140i.C3043z6 r6, byte[] r7, int r8, int r9, p005b.p096l.p097a.p113c.p131e.p140i.C2846k4 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m2875z1(r8, r7, r0, r10)
            int r8 = r10.f4866a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo13627a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo13634h(r1, r2, r3, r4, r5)
            r6.mo13633g(r9)
            r10.f4868c = r9
            return r8
        L_0x0025:
            b.l.a.c.e.i.x5 r6 = p005b.p096l.p097a.p113c.p131e.p140i.C3016x5.m5682a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2852t2(b.l.a.c.e.i.z6, byte[], int, int, b.l.a.c.e.i.k4):int");
    }

    /* renamed from: u */
    public static void m2853u(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: u0 */
    public static boolean m2854u0(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u1 */
    public static byte[] m2855u1(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = bArr[i];
                byte b2 = (byte) ((b + b) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    /* renamed from: u2 */
    public static int m2856u2(C2319m0 m0Var, byte[] bArr, int i, int i2, int i3, C2144em emVar) {
        C2122e0 e0Var = (C2122e0) m0Var;
        Object a = e0Var.mo12554a();
        int E = e0Var.mo12542E(a, bArr, i, i2, i3, emVar);
        e0Var.mo12555b(a);
        emVar.f3839c = a;
        return E;
    }

    /* renamed from: v */
    public static int m2857v(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = C3757c.m7060a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 >= 0) {
            str = C3757c.m7060a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(C0843a.m444e("negative size: ", i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    /* renamed from: v0 */
    public static boolean m2858v0(char c) {
        return c == 13 || c == '*' || c == '>';
    }

    /* renamed from: v1 */
    public static byte[] m2859v1(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            byte b = 0;
            long A1 = (m2693A1(bArr3, 0) >> 0) & 67108863;
            long A12 = (m2693A1(bArr3, 3) >> 2) & 67108863 & 67108611;
            long A13 = (m2693A1(bArr3, 6) >> 4) & 67108863 & 67092735;
            long A14 = (m2693A1(bArr3, 9) >> 6) & 67108863 & 66076671;
            long A15 = (m2693A1(bArr3, 12) >> 8) & 67108863 & 1048575;
            long j = A12 * 5;
            long j2 = A13 * 5;
            long j3 = A14 * 5;
            long j4 = A15 * 5;
            int i = 17;
            byte[] bArr5 = new byte[17];
            long j5 = 0;
            int i2 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (true) {
                int length = bArr4.length;
                if (i2 < length) {
                    int min = Math.min(16, length - i2);
                    System.arraycopy(bArr4, i2, bArr5, b, min);
                    bArr5[min] = 1;
                    if (min != 16) {
                        Arrays.fill(bArr5, min + 1, i, b);
                    }
                    long A16 = j9 + ((m2693A1(bArr5, b) >> b) & 67108863);
                    long A17 = j5 + ((m2693A1(bArr5, 3) >> 2) & 67108863);
                    long A18 = j6 + ((m2693A1(bArr5, 6) >> 4) & 67108863);
                    long A19 = j7 + ((m2693A1(bArr5, 9) >> 6) & 67108863);
                    long A110 = j8 + (((m2693A1(bArr5, 12) >> 8) & 67108863) | ((long) (bArr5[16] << 24)));
                    long j10 = (A110 * j) + (A19 * j2) + (A18 * j3) + (A17 * j4) + (A16 * A1);
                    long j11 = (A110 * j2) + (A19 * j3) + (A18 * j4) + (A17 * A1) + (A16 * A12) + (j10 >> 26);
                    long j12 = (A110 * j3) + (A19 * j4) + (A18 * A1) + (A17 * A12) + (A16 * A13) + (j11 >> 26);
                    long j13 = (A110 * j4) + (A19 * A1) + (A18 * A12) + (A17 * A13) + (A16 * A14) + (j12 >> 26);
                    long j14 = A19 * A12;
                    long j15 = A110 * A1;
                    long j16 = j15 + j14 + (A18 * A13) + (A17 * A14) + (A16 * A15) + (j13 >> 26);
                    long j17 = ((j16 >> 26) * 5) + (j10 & 67108863);
                    j9 = j17 & 67108863;
                    long j18 = (j11 & 67108863) + (j17 >> 26);
                    i2 += 16;
                    j8 = j16 & 67108863;
                    j7 = j13 & 67108863;
                    j6 = j12 & 67108863;
                    j5 = j18;
                    b = 0;
                    i = 17;
                } else {
                    long j19 = j6 + (j5 >> 26);
                    long j20 = j19 & 67108863;
                    long j21 = j7 + (j19 >> 26);
                    long j22 = j21 & 67108863;
                    long j23 = j8 + (j21 >> 26);
                    long j24 = j23 & 67108863;
                    long j25 = ((j23 >> 26) * 5) + j9;
                    long j26 = j25 & 67108863;
                    long j27 = (j5 & 67108863) + (j25 >> 26);
                    long j28 = j26 + 5;
                    long j29 = j27 + (j28 >> 26);
                    long j30 = j20 + (j29 >> 26);
                    long j31 = j22 + (j30 >> 26);
                    long j32 = (j24 + (j31 >> 26)) - 67108864;
                    long j33 = j32 >> 63;
                    long j34 = j26;
                    long j35 = ~j33;
                    long j36 = (j27 & j33) | (j29 & 67108863 & j35);
                    long j37 = (j20 & j33) | (j30 & 67108863 & j35);
                    long j38 = (j22 & j33) | (j31 & 67108863 & j35);
                    long A111 = m2693A1(bArr3, 16) + (((j34 & j33) | (j28 & 67108863 & j35) | (j36 << 26)) & 4294967295L);
                    long A112 = m2693A1(bArr3, 20) + (((j36 >> 6) | (j37 << 20)) & 4294967295L) + (A111 >> 32);
                    long A113 = m2693A1(bArr3, 24) + (((j37 >> 12) | (j38 << 14)) & 4294967295L) + (A112 >> 32);
                    byte[] bArr6 = new byte[16];
                    long A114 = m2693A1(bArr3, 28);
                    m2784c2(bArr6, A111 & 4294967295L, 0);
                    m2784c2(bArr6, A112 & 4294967295L, 4);
                    m2784c2(bArr6, A113 & 4294967295L, 8);
                    m2784c2(bArr6, ((((j38 >> 18) | (((j24 & j33) | (j32 & j35)) << 8)) & 4294967295L) + A114 + (A113 >> 32)) & 4294967295L, 12);
                    return bArr6;
                }
            }
        } else {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
    }

    /* renamed from: v2 */
    public static int m2860v2(C3043z6 z6Var, byte[] bArr, int i, int i2, int i3, C2846k4 k4Var) {
        C2939r6 r6Var = (C2939r6) z6Var;
        Object r = ((C2899o5) r6Var.f4985e).mo13245r(4, (Object) null, (Object) null);
        int A = r6Var.mo13615A(r, bArr, i, i2, i3, k4Var);
        r6Var.mo13633g(r);
        k4Var.f4868c = r;
        return A;
    }

    /* renamed from: w */
    public static int m2861w(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: w0 */
    public static void m2862w0(C3612t tVar, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[16384];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new C3610s(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                m2692A0(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                m2692A0(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m2708E0(bArr, tVar, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                m2708E0(bArr, tVar, outputStream, readUnsignedShort2, read2, j3);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                m2708E0(bArr, tVar, outputStream, readUnsignedShort3, read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m2708E0(bArr, tVar, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                m2708E0(bArr, tVar, outputStream, readInt3, read2, j3);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                m2708E0(bArr, tVar, outputStream, readInt4, read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m2708E0(bArr, tVar, outputStream, readLong, read2, j3);
                                break;
                            default:
                                m2692A0(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            throw new C3610s(C0843a.m438N(30, "Unexpected version=", read));
        }
    }

    @Nullable
    /* renamed from: w1 */
    public static String m2863w1(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: w2 */
    public static int m2864w2(int i, byte[] bArr, int i2, int i3, C2171g<?> gVar, C2144em emVar) {
        C2096d dVar = (C2096d) gVar;
        int V0 = m2759V0(bArr, i2, emVar);
        while (true) {
            dVar.mo12496l(emVar.f3837a);
            if (V0 >= i3) {
                break;
            }
            int V02 = m2759V0(bArr, V0, emVar);
            if (i != emVar.f3837a) {
                break;
            }
            V0 = m2759V0(bArr, V02, emVar);
        }
        return V0;
    }

    /* renamed from: x */
    public static <T> T m2865x(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: x0 */
    public static int m2866x0(CharSequence charSequence, int i, int i2) {
        int i3;
        CharSequence charSequence2 = charSequence;
        int i4 = i;
        if (i4 >= charSequence.length()) {
            return i2;
        }
        float[] fArr = new float[6];
        if (i2 == 0) {
            // fill-array-data instruction
            fArr[0] = 0;
            fArr[1] = 1065353216;
            fArr[2] = 1065353216;
            fArr[3] = 1065353216;
            fArr[4] = 1065353216;
            fArr[5] = 1067450368;
        } else {
            // fill-array-data instruction
            fArr[0] = 1065353216;
            fArr[1] = 1073741824;
            fArr[2] = 1073741824;
            fArr[3] = 1073741824;
            fArr[4] = 1073741824;
            fArr[5] = 1074790400;
            fArr[i2] = 0.0f;
        }
        int i5 = 0;
        while (true) {
            int i6 = i4 + i5;
            if (i6 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int M = m2731M(fArr, iArr, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, bArr);
                int i7 = 0;
                for (int i8 = 0; i8 < 6; i8++) {
                    i7 += bArr[i8];
                }
                if (iArr[0] == M) {
                    return 0;
                }
                if (i7 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i7 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i7 != 1 || bArr[2] <= 0) {
                    return (i7 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i6);
            i5++;
            if (m2814k0(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m2818l0(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m2818l0(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m2818l0(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m2830o0(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m2818l0(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                i3 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i3 = 4;
                if (m2818l0(charAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i5 >= i3) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m2731M(fArr, iArr2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, bArr2);
                int i9 = 0;
                for (int i10 = 0; i10 < 6; i10++) {
                    i9 += bArr2[i10];
                }
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (i9 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (i9 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (i9 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        int i11 = i4 + i5 + 1;
                        while (i11 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i11);
                            if (!m2858v0(charAt2)) {
                                if (!m2830o0(charAt2)) {
                                    break;
                                }
                                i11++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
        return 5;
    }

    /* renamed from: x1 */
    public static /* synthetic */ boolean m2867x1(byte b) {
        return b >= 0;
    }

    /* renamed from: x2 */
    public static int m2868x2(int i, byte[] bArr, int i2, int i3, C2977u5<?> u5Var, C2846k4 k4Var) {
        C2912p5 p5Var = (C2912p5) u5Var;
        int W0 = m2762W0(bArr, i2, k4Var);
        while (true) {
            p5Var.mo13574n(k4Var.f4866a);
            if (W0 >= i3) {
                break;
            }
            int W02 = m2762W0(bArr, W0, k4Var);
            if (i != k4Var.f4866a) {
                break;
            }
            W0 = m2762W0(bArr, W02, k4Var);
        }
        return W0;
    }

    /* renamed from: y */
    public static void m2869y(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m2813k(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m2813k(i2, i3, "end index");
            } else {
                str = C3757c.m7060a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: y0 */
    public static Object m2870y0(Object obj) {
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.class) ? Long.valueOf((long) ((Integer) obj).intValue()) : cls.equals(Float.class) ? Double.valueOf((double) ((Float) obj).floatValue()) : obj;
    }

    /* renamed from: y1 */
    public static int m2871y1(int i, byte[] bArr, int i2, C2144em emVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i3 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                emVar.f3837a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            emVar.f3837a = i7 | i4;
            return i8;
        }
        emVar.f3837a = i5 | i3;
        return i6;
    }

    /* renamed from: y2 */
    public static int m2872y2(byte[] bArr, int i, C2171g<?> gVar, C2144em emVar) {
        C2096d dVar = (C2096d) gVar;
        int V0 = m2759V0(bArr, i, emVar);
        int i2 = emVar.f3837a + V0;
        while (V0 < i2) {
            V0 = m2759V0(bArr, V0, emVar);
            dVar.mo12496l(emVar.f3837a);
        }
        if (V0 == i2) {
            return V0;
        }
        throw C2246j.m3524a();
    }

    /* renamed from: z */
    public static void m2873z(boolean z) {
        if (!z) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* renamed from: z0 */
    public static boolean m2874z0(String str, boolean z) {
        Class<CustomTabsServiceConnection> cls = CustomTabsServiceConnection.class;
        if (1 == 0) {
            return false;
        }
        return CustomTabsClient.bindCustomTabsService(C4857i2.f9358c, "com.android.chrome", new C5044y2(str, z));
    }

    /* renamed from: z1 */
    public static int m2875z1(int i, byte[] bArr, int i2, C2846k4 k4Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i3 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                k4Var.f4866a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            k4Var.f4866a = i7 | i4;
            return i8;
        }
        k4Var.f4866a = i5 | i3;
        return i6;
    }

    /* renamed from: z2 */
    public static int m2876z2(byte[] bArr, int i, C2977u5<?> u5Var, C2846k4 k4Var) {
        C2912p5 p5Var = (C2912p5) u5Var;
        int W0 = m2762W0(bArr, i, k4Var);
        int i2 = k4Var.f4866a + W0;
        while (W0 < i2) {
            W0 = m2762W0(bArr, W0, k4Var);
            p5Var.mo13574n(k4Var.f4866a);
        }
        if (W0 == i2) {
            return W0;
        }
        throw C3016x5.m5682a();
    }
}
