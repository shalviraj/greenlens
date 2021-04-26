package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.appfoundry.previewer.constants.AnimationStrength;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.C1767i;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;
import p005b.p096l.p097a.p113c.p131e.p140i.C3007w9;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.q9 */
public final class C3297q9 extends C3227k5 {

    /* renamed from: g */
    public static final String[] f5910g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f5911h = {"_err"};

    /* renamed from: c */
    public SecureRandom f5912c;

    /* renamed from: d */
    public final AtomicLong f5913d = new AtomicLong(0);

    /* renamed from: e */
    public int f5914e;

    /* renamed from: f */
    public Integer f5915f = null;

    public C3297q9(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: B */
    public static MessageDigest m6335B() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: C */
    public static long m6336C(byte[] bArr) {
        Objects.requireNonNull(bArr, "null reference");
        int length = bArr.length;
        int i = 0;
        C0823f.m384n(length > 0);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: D */
    public static boolean m6337D(Context context) {
        Objects.requireNonNull(context, "null reference");
        return m6343b0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* renamed from: F */
    public static boolean m6338F(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: G */
    public static boolean m6339G(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: W */
    public static ArrayList<Bundle> m6340W(List<C3118b> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C3118b next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f5302g);
            bundle.putString("origin", next.f5303h);
            bundle.putLong("creation_timestamp", next.f5305j);
            bundle.putString("name", next.f5304i.f5751h);
            C1960d.m2815k1(bundle, next.f5304i.mo14428V());
            bundle.putBoolean("active", next.f5306k);
            String str = next.f5307l;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C3309s sVar = next.f5308m;
            if (sVar != null) {
                bundle.putString("timed_out_event_name", sVar.f5937g);
                C3287q qVar = next.f5308m.f5938h;
                if (qVar != null) {
                    bundle.putBundle("timed_out_event_params", qVar.mo14488Z());
                }
            }
            bundle.putLong("trigger_timeout", next.f5309n);
            C3309s sVar2 = next.f5310o;
            if (sVar2 != null) {
                bundle.putString("triggered_event_name", sVar2.f5937g);
                C3287q qVar2 = next.f5310o.f5938h;
                if (qVar2 != null) {
                    bundle.putBundle("triggered_event_params", qVar2.mo14488Z());
                }
            }
            bundle.putLong("triggered_timestamp", next.f5304i.f5752i);
            bundle.putLong("time_to_live", next.f5311p);
            C3309s sVar3 = next.f5312q;
            if (sVar3 != null) {
                bundle.putString("expired_event_name", sVar3.f5937g);
                C3287q qVar3 = next.f5312q.f5938h;
                if (qVar3 != null) {
                    bundle.putBundle("expired_event_params", qVar3.mo14488Z());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: X */
    public static boolean m6341X(Context context) {
        ActivityInfo receiverInfo;
        Objects.requireNonNull(context, "null reference");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: Y */
    public static final boolean m6342Y(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6343b0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.m6343b0(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: c0 */
    public static boolean m6344c0(String str, String[] strArr) {
        for (String G : strArr) {
            if (m6339G(str, G)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public static boolean m6345f0(String str) {
        C0823f.m376j(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: A */
    public final void mo14515A(C3286p9 p9Var, String str, int i, String str2, String str3, int i2, boolean z) {
        Bundle bundle = new Bundle();
        m6342Y(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        if (z) {
            p9Var.mo14208a(str, "_err", bundle);
            return;
        }
        C3281p4 p4Var = this.f5638a;
        C3165ea eaVar = p4Var.f5847f;
        p4Var.mo14466s().mo14493A("auto", "_err", bundle);
    }

    @WorkerThread
    /* renamed from: E */
    public final boolean mo14516E(String str) {
        mo14126h();
        if (C1968b.m2885a(this.f5638a.f5842a).f3529a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.f5638a.mo14329d().f5806m.mo14415b("Permission not granted", str);
        return false;
    }

    /* renamed from: H */
    public final boolean mo14517H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String j = this.f5638a.f5848g.mo14189j("debug.firebase.analytics.app", "");
        C3165ea eaVar = this.f5638a.f5847f;
        return j.equals(str);
    }

    /* renamed from: I */
    public final Bundle mo14518I(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object s = mo14552s(str, bundle.get(str));
                if (s == null) {
                    this.f5638a.mo14329d().f5804k.mo14415b("Param value can't be null", this.f5638a.mo14468u().mo14322q(str));
                } else {
                    mo14559z(bundle2, str, s);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: J */
    public final C3309s mo14519J(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo14541l0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            Bundle t = mo14553t(str, str2, bundle2, Collections.singletonList("_o"), false);
            if (z) {
                t = mo14518I(t);
            }
            return new C3309s(str2, new C3287q(t), str3, j);
        }
        this.f5638a.mo14329d().f5799f.mo14415b("Invalid conditional property event name", this.f5638a.mo14468u().mo14323r(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: K */
    public final boolean mo14520K(Context context, String str) {
        C3247m3 m3Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = C1968b.m2885a(context).f3529a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            e = e;
            m3Var = this.f5638a.mo14329d().f5799f;
            str2 = "Error obtaining certificate";
            m3Var.mo14415b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            m3Var = this.f5638a.mo14329d().f5799f;
            str2 = "Package name not found";
            m3Var.mo14415b(str2, e);
            return true;
        }
    }

    /* renamed from: L */
    public final byte[] mo14521L(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: M */
    public final int mo14522M() {
        if (this.f5915f == null) {
            C1763f fVar = C1763f.f3113b;
            Context context = this.f5638a.f5842a;
            Objects.requireNonNull(fVar);
            boolean z = C1767i.f3116a;
            int i = 0;
            try {
                i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f5915f = Integer.valueOf(i / 1000);
        }
        return this.f5915f.intValue();
    }

    /* renamed from: N */
    public final long mo14523N(long j, long j2) {
        return ((j2 * 60000) + j) / 86400000;
    }

    @WorkerThread
    /* renamed from: O */
    public final void mo14524O(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f5638a.mo14329d().f5802i.mo14415b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: P */
    public final void mo14525P(C3035yb ybVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: Q */
    public final void mo14526Q(C3035yb ybVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: R */
    public final void mo14527R(C3035yb ybVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: S */
    public final void mo14528S(C3035yb ybVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: T */
    public final void mo14529T(C3035yb ybVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: U */
    public final void mo14530U(C3035yb ybVar, Bundle bundle) {
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: V */
    public final void mo14531V(C3035yb ybVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            ybVar.mo13602Y(bundle);
        } catch (RemoteException e) {
            this.f5638a.mo14329d().f5802i.mo14415b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: Z */
    public final Object mo14532Z(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo14548q(String.valueOf(obj), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle I = mo14518I((Bundle) parcelable);
                    if (!I.isEmpty()) {
                        arrayList.add(I);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: a0 */
    public final int mo14533a0(String str) {
        if ("_ldl".equals(str)) {
            C3166f fVar = this.f5638a.f5848g;
            return 2048;
        } else if ("_id".equals(str)) {
            C3166f fVar2 = this.f5638a.f5848g;
            return 256;
        } else if (!this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5381f0) || !"_lgclid".equals(str)) {
            C3166f fVar3 = this.f5638a.f5848g;
            return 36;
        } else {
            C3166f fVar4 = this.f5638a.f5848g;
            return 100;
        }
    }

    /* renamed from: d0 */
    public final long mo14534d0() {
        long andIncrement;
        long j;
        if (this.f5913d.get() == 0) {
            synchronized (this.f5913d) {
                long nanoTime = System.nanoTime();
                Objects.requireNonNull((C1959c) this.f5638a.f5855n);
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.f5914e + 1;
                this.f5914e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f5913d) {
            this.f5913d.compareAndSet(-1, 1);
            andIncrement = this.f5913d.getAndIncrement();
        }
        return andIncrement;
    }

    @WorkerThread
    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: e0 */
    public final SecureRandom mo14535e0() {
        mo14126h();
        if (this.f5912c == null) {
            this.f5912c = new SecureRandom();
        }
        return this.f5912c;
    }

    /* renamed from: g0 */
    public final Bundle mo14536g0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("source", str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString(AnimationStrength.MEDIUM, str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f5638a.mo14329d().f5802i.mo14415b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* renamed from: h0 */
    public final boolean mo14537h0(String str, String str2) {
        if (str2 == null) {
            this.f5638a.mo14329d().f5801h.mo14415b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f5638a.mo14329d().f5801h.mo14415b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f5638a.mo14329d().f5801h.mo14416c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f5638a.mo14329d().f5801h.mo14416c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: i */
    public final boolean mo14141i() {
        return true;
    }

    /* renamed from: i0 */
    public final boolean mo14538i0(String str, String str2) {
        if (str2 == null) {
            this.f5638a.mo14329d().f5801h.mo14415b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f5638a.mo14329d().f5801h.mo14415b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f5638a.mo14329d().f5801h.mo14416c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f5638a.mo14329d().f5801h.mo14416c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    @WorkerThread
    /* renamed from: j */
    public final void mo14142j() {
        mo14126h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f5638a.mo14329d().f5802i.mo14414a("Utils falling back to Random for random id");
            }
        }
        this.f5913d.set(nextLong);
    }

    /* renamed from: j0 */
    public final boolean mo14539j0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f5638a.mo14329d().f5801h.mo14415b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f5910g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f5638a.mo14329d().f5801h.mo14416c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m6344c0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m6344c0(str2, strArr2)) {
            return true;
        }
        this.f5638a.mo14329d().f5801h.mo14416c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: k0 */
    public final boolean mo14540k0(String str, int i, String str2) {
        if (str2 == null) {
            this.f5638a.mo14329d().f5801h.mo14415b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f5638a.mo14329d().f5801h.mo14417d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* renamed from: l0 */
    public final int mo14541l0(String str) {
        if (!mo14538i0("event", str)) {
            return 2;
        }
        if (!mo14539j0("event", C3249m5.f5737a, C3249m5.f5738b, str)) {
            return 13;
        }
        C3166f fVar = this.f5638a.f5848g;
        if (!mo14540k0("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: m0 */
    public final int mo14542m0(String str) {
        if (!mo14538i0("user property", str)) {
            return 6;
        }
        if (!mo14539j0("user property", C3271o5.f5810a, (String[]) null, str)) {
            return 15;
        }
        C3166f fVar = this.f5638a.f5848g;
        if (!mo14540k0("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: n0 */
    public final int mo14543n0(String str) {
        if (!mo14537h0("event param", str)) {
            return 3;
        }
        if (!mo14539j0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        C3166f fVar = this.f5638a.f5848g;
        if (!mo14540k0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: o */
    public final boolean mo14544o(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            Objects.requireNonNull(str, "null reference");
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (this.f5638a.mo14471x()) {
                this.f5638a.mo14329d().f5801h.mo14415b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C3269o3.m6253t(str));
            }
            return false;
        }
        C3007w9.m5549b();
        if (this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5385h0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            Objects.requireNonNull(str2, "null reference");
            if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            this.f5638a.mo14329d().f5801h.mo14415b("Invalid admob_app_id. Analytics disabled.", C3269o3.m6253t(str2));
            return false;
        }
        if (this.f5638a.mo14471x()) {
            this.f5638a.mo14329d().f5801h.mo14414a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* renamed from: o0 */
    public final int mo14545o0(String str) {
        if (!mo14538i0("event param", str)) {
            return 3;
        }
        if (!mo14539j0("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        C3166f fVar = this.f5638a.f5848g;
        if (!mo14540k0("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: p */
    public final boolean mo14546p(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Objects.requireNonNull(str, "null reference");
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* renamed from: p0 */
    public final boolean mo14547p0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: q */
    public final String mo14548q(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: q0 */
    public final boolean mo14549q0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                this.f5638a.mo14329d().f5804k.mo14417d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    @androidx.annotation.WorkerThread
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14550r(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.mo14126h()
            boolean r2 = r14.mo14547p0(r0)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00a8
            if (r22 == 0) goto L_0x00a5
            java.lang.String[] r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3260n5.f5770c
            boolean r2 = m6344c0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            b.l.a.c.h.b.p4 r2 = r7.f5638a
            b.l.a.c.h.b.f8 r2 = r2.mo14473z()
            r2.mo14126h()
            r2.mo14065i()
            boolean r5 = r2.mo14219n()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            b.l.a.c.h.b.p4 r2 = r2.f5638a
            b.l.a.c.h.b.q9 r2 = r2.mo14467t()
            int r2 = r2.mo14522M()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            b.l.a.c.h.b.p4 r2 = r7.f5638a
            b.l.a.c.h.b.f r2 = r2.f5848g
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0052
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005d
        L_0x0052:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00a8
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005d:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00a8
            b.l.a.c.h.b.p4 r9 = r7.f5638a
            b.l.a.c.h.b.o3 r9 = r9.mo14329d()
            b.l.a.c.h.b.m3 r9 = r9.f5804k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.mo14417d(r10, r3, r8, r5)
            b.l.a.c.h.b.p4 r5 = r7.f5638a
            b.l.a.c.h.b.f r5 = r5.f5848g
            if (r2 == 0) goto L_0x0088
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x00a1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a1
        L_0x0088:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a1
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x00a1
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x00a1:
            r1 = 17
            r9 = r1
            goto L_0x00a9
        L_0x00a5:
            r0 = 21
            return r0
        L_0x00a8:
            r9 = r4
        L_0x00a9:
            b.l.a.c.h.b.p4 r1 = r7.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5362S
            r10 = r15
            boolean r1 = r1.mo14197r(r15, r2)
            if (r1 == 0) goto L_0x00bc
            boolean r1 = m6338F(r16)
            if (r1 != 0) goto L_0x00c2
        L_0x00bc:
            boolean r1 = m6338F(r17)
            if (r1 == 0) goto L_0x00c9
        L_0x00c2:
            b.l.a.c.h.b.p4 r1 = r7.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00cf
        L_0x00c9:
            b.l.a.c.h.b.p4 r1 = r7.f5638a
            b.l.a.c.h.b.f r1 = r1.f5848g
            r1 = 100
        L_0x00cf:
            boolean r1 = r14.mo14549q0(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00d6
            return r9
        L_0x00d6:
            if (r22 == 0) goto L_0x0162
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00ee
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo14551r0(r1, r2, r3, r4, r5, r6)
            goto L_0x0161
        L_0x00ee:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0121
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = r4
        L_0x00f7:
            if (r13 >= r12) goto L_0x0161
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010e
            b.l.a.c.h.b.p4 r1 = r7.f5638a
            b.l.a.c.h.b.o3 r1 = r1.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5804k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            goto L_0x014a
        L_0x010e:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo14551r0(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x00f7
        L_0x0121:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0162
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = r4
        L_0x012d:
            if (r13 >= r12) goto L_0x0161
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014e
            b.l.a.c.h.b.p4 r1 = r7.f5638a
            b.l.a.c.h.b.o3 r1 = r1.mo14329d()
            b.l.a.c.h.b.m3 r1 = r1.f5804k
            if (r0 == 0) goto L_0x0146
            java.lang.Class r0 = r0.getClass()
            goto L_0x0148
        L_0x0146:
            java.lang.String r0 = "null"
        L_0x0148:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
        L_0x014a:
            r1.mo14416c(r2, r0, r8)
            goto L_0x0162
        L_0x014e:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo14551r0(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x012d
        L_0x0161:
            return r9
        L_0x0162:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.mo14550r(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: r0 */
    public final void mo14551r0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            C3166f fVar = this.f5638a.f5848g;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                String str6 = (String) it.next();
                if (list2 == null || !list2.contains(str6)) {
                    i = z ? mo14543n0(str6) : 0;
                    if (i == 0) {
                        i = mo14545o0(str6);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    mo14556w(bundle2, i, str6, i == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (mo14547p0(bundle2.get(str6))) {
                        this.f5638a.mo14329d().f5804k.mo14417d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i2 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i2 = mo14550r(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo14556w(bundle2, i2, str4, bundle2.get(str4));
                    } else if (m6345f0(str4) && !m6344c0(str4, C3260n5.f5771d) && (i3 = i3 + 1) > 0) {
                        this.f5638a.mo14329d().f5801h.mo14416c("Item cannot contain custom parameters", this.f5638a.mo14468u().mo14321p(str5), this.f5638a.mo14468u().mo14324s(bundle2));
                        m6342Y(bundle2, 23);
                    }
                    bundle2.remove(str4);
                }
            }
        }
    }

    /* renamed from: s */
    public final Object mo14552s(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            C3166f fVar = this.f5638a.f5848g;
            return mo14532Z(256, obj, true, true);
        }
        if (m6338F(str)) {
            C3166f fVar2 = this.f5638a.f5848g;
        } else {
            C3166f fVar3 = this.f5638a.f5848g;
            i = 100;
        }
        return mo14532Z(i, obj, false, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14553t(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3249m5.f5740d
            boolean r13 = m6344c0(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            b.l.a.c.h.b.p4 r0 = r9.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            int r15 = r0.mo14190k()
            b.l.a.c.h.b.p4 r0 = r9.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5367X
            r8 = r20
            boolean r0 = r0.mo14197r(r8, r1)
            if (r0 == 0) goto L_0x0033
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            goto L_0x0037
        L_0x0033:
            java.util.Set r0 = r22.keySet()
        L_0x0037:
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x003f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0058
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r0 = r17
            goto L_0x0067
        L_0x0058:
            if (r24 == 0) goto L_0x005f
            int r0 = r9.mo14543n0(r7)
            goto L_0x0061
        L_0x005f:
            r0 = r17
        L_0x0061:
            if (r0 != 0) goto L_0x0067
            int r0 = r9.mo14545o0(r7)
        L_0x0067:
            if (r0 == 0) goto L_0x0077
            r1 = 3
            if (r0 != r1) goto L_0x006e
            r1 = r7
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            r9.mo14556w(r14, r0, r7, r1)
            r14.remove(r7)
            goto L_0x0103
        L_0x0077:
            java.lang.Object r4 = r11.get(r7)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r7
            r5 = r14
            r6 = r23
            r12 = r7
            r7 = r24
            r8 = r13
            int r0 = r0.mo14550r(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0097
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.mo14556w(r14, r1, r12, r0)
            goto L_0x00b3
        L_0x0097:
            if (r0 == 0) goto L_0x00b3
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x00b3
            r1 = 21
            if (r0 != r1) goto L_0x00a7
            r7 = r10
            goto L_0x00a8
        L_0x00a7:
            r7 = r12
        L_0x00a8:
            java.lang.Object r1 = r11.get(r12)
            r9.mo14556w(r14, r0, r7, r1)
            r14.remove(r12)
            goto L_0x0103
        L_0x00b3:
            boolean r0 = m6345f0(r12)
            if (r0 == 0) goto L_0x0103
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x00fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            b.l.a.c.h.b.p4 r2 = r9.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5801h
            b.l.a.c.h.b.p4 r3 = r9.f5638a
            b.l.a.c.h.b.j3 r3 = r3.mo14468u()
            java.lang.String r3 = r3.mo14321p(r10)
            b.l.a.c.h.b.p4 r4 = r9.f5638a
            b.l.a.c.h.b.j3 r4 = r4.mo14468u()
            java.lang.String r4 = r4.mo14324s(r11)
            r2.mo14416c(r1, r3, r4)
            r1 = 5
            m6342Y(r14, r1)
            r14.remove(r12)
        L_0x00fb:
            r8 = r20
            r12 = r23
            r18 = r0
            goto L_0x003f
        L_0x0103:
            r8 = r20
            r12 = r23
            goto L_0x003f
        L_0x0109:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3297q9.mo14553t(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: u */
    public final void mo14554u(C3280p3 p3Var, int i) {
        Iterator it = new TreeSet(p3Var.f5832d.keySet()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (m6345f0(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                this.f5638a.mo14329d().f5801h.mo14416c(sb.toString(), this.f5638a.mo14468u().mo14321p(p3Var.f5829a), this.f5638a.mo14468u().mo14324s(p3Var.f5832d));
                m6342Y(p3Var.f5832d, 5);
                p3Var.f5832d.remove(str);
            }
        }
    }

    /* renamed from: v */
    public final void mo14555v(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.f5638a.mo14467t().mo14559z(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo14556w(Bundle bundle, int i, String str, Object obj) {
        if (m6342Y(bundle, i)) {
            C3166f fVar = this.f5638a.f5848g;
            bundle.putString("_ev", mo14548q(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) String.valueOf(obj).length());
            }
        }
    }

    /* renamed from: x */
    public final int mo14557x(String str, Object obj) {
        String str2;
        int i;
        if ("_ldl".equals(str)) {
            i = mo14533a0(str);
            str2 = "user property referrer";
        } else {
            i = mo14533a0(str);
            str2 = "user property";
        }
        return mo14549q0(str2, str, i, obj) ? 0 : 7;
    }

    /* renamed from: y */
    public final Object mo14558y(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int a0 = mo14533a0(str);
        return equals ? mo14532Z(a0, obj, true, false) : mo14532Z(a0, obj, false, false);
    }

    /* renamed from: z */
    public final void mo14559z(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.f5638a.mo14329d().f5804k.mo14416c("Not putting event parameter. Invalid value type. name, type", this.f5638a.mo14468u().mo14322q(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }
}
