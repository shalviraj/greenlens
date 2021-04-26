package p005b.p096l.p097a.p098a.p099e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amplitude.api.Constants;
import com.segment.analytics.AnalyticsContext;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.p099e.p100e.C1594b;
import p005b.p096l.p097a.p098a.p099e.p100e.C1601c;
import p005b.p096l.p097a.p098a.p099e.p100e.C1603d;
import p005b.p096l.p097a.p098a.p099e.p100e.C1604e;
import p005b.p096l.p097a.p098a.p099e.p100e.C1606f;
import p005b.p096l.p097a.p098a.p099e.p100e.C1609g;
import p005b.p096l.p097a.p098a.p099e.p100e.C1612i;
import p005b.p096l.p097a.p098a.p099e.p100e.C1614j;
import p005b.p096l.p097a.p098a.p099e.p100e.C1615k;
import p005b.p096l.p097a.p098a.p099e.p100e.C1621o;
import p005b.p096l.p097a.p098a.p099e.p100e.C1624p;
import p005b.p096l.p097a.p098a.p101f.C1633d;
import p005b.p096l.p097a.p098a.p101f.C1634e;
import p005b.p096l.p097a.p098a.p101f.p102n.C1647a;
import p005b.p096l.p097a.p098a.p101f.p102n.C1649b;
import p005b.p096l.p097a.p098a.p101f.p102n.C1653f;
import p005b.p096l.p097a.p098a.p101f.p102n.C1654g;
import p005b.p096l.p097a.p098a.p101f.p102n.C1662m;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;
import p005b.p096l.p180d.p208s.C4202a;
import p005b.p096l.p180d.p208s.p210j.C4215d;
import p005b.p096l.p180d.p208s.p210j.C4216e;

/* renamed from: b.l.a.a.e.d */
public final class C1590d implements C1662m {

    /* renamed from: a */
    public final C4202a f2700a;

    /* renamed from: b */
    public final ConnectivityManager f2701b;

    /* renamed from: c */
    public final Context f2702c;

    /* renamed from: d */
    public final URL f2703d = m2056c(C1587a.f2692c);

    /* renamed from: e */
    public final C1735a f2704e;

    /* renamed from: f */
    public final C1735a f2705f;

    /* renamed from: g */
    public final int f2706g;

    /* renamed from: b.l.a.a.e.d$a */
    public static final class C1591a {

        /* renamed from: a */
        public final URL f2707a;

        /* renamed from: b */
        public final C1614j f2708b;
        @Nullable

        /* renamed from: c */
        public final String f2709c;

        public C1591a(URL url, C1614j jVar, @Nullable String str) {
            this.f2707a = url;
            this.f2708b = jVar;
            this.f2709c = str;
        }
    }

    /* renamed from: b.l.a.a.e.d$b */
    public static final class C1592b {

        /* renamed from: a */
        public final int f2710a;
        @Nullable

        /* renamed from: b */
        public final URL f2711b;

        /* renamed from: c */
        public final long f2712c;

        public C1592b(int i, @Nullable URL url, long j) {
            this.f2710a = i;
            this.f2711b = url;
            this.f2712c = j;
        }
    }

    public C1590d(Context context, C1735a aVar, C1735a aVar2) {
        C4216e eVar = new C4216e();
        ((C1594b) C1594b.f2713a).mo11750a(eVar);
        eVar.f7805d = true;
        this.f2700a = new C4215d(eVar);
        this.f2702c = context;
        this.f2701b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f2704e = aVar2;
        this.f2705f = aVar;
        this.f2706g = 40000;
    }

    /* renamed from: c */
    public static URL m2056c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(C0843a.m451l("Invalid url: ", str), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ba, code lost:
        if (p005b.p096l.p097a.p098a.p099e.p100e.C1621o.C1622a.f2795C.get(r0) != null) goto L_0x00be;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p097a.p098a.p101f.C1634e mo11736a(p005b.p096l.p097a.p098a.p101f.C1634e r6) {
        /*
            r5 = this;
            android.net.ConnectivityManager r0 = r5.f2701b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            b.l.a.a.f.e$a r6 = r6.mo11821i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "sdk-version"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r3 = "model"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r3 = "hardware"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r3 = "device"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r3 = "product"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.ID
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r3 = "os-uild"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r3 = "manufacturer"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.util.Map r2 = r6.mo11803c()
            java.lang.String r3 = "fingerprint"
            r2.put(r3, r1)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r2 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r2)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map r3 = r6.mo11803c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r3.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x0090
            b.l.a.a.e.e.o$b r2 = p005b.p096l.p097a.p098a.p099e.p100e.C1621o.C1623b.NONE
            r2 = r1
            goto L_0x0094
        L_0x0090:
            int r2 = r0.getType()
        L_0x0094:
            java.util.Map r3 = r6.mo11803c()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "net-type"
            r3.put(r4, r2)
            r2 = 0
            if (r0 != 0) goto L_0x00a7
            b.l.a.a.e.e.o$a r0 = p005b.p096l.p097a.p098a.p099e.p100e.C1621o.C1622a.UNKNOWN_MOBILE_SUBTYPE
            goto L_0x00bd
        L_0x00a7:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x00b2
            b.l.a.a.e.e.o$a r0 = p005b.p096l.p097a.p098a.p099e.p100e.C1621o.C1622a.COMBINED
            r0 = 100
            goto L_0x00be
        L_0x00b2:
            android.util.SparseArray<b.l.a.a.e.e.o$a> r3 = p005b.p096l.p097a.p098a.p099e.p100e.C1621o.C1622a.f2795C
            java.lang.Object r3 = r3.get(r0)
            b.l.a.a.e.e.o$a r3 = (p005b.p096l.p097a.p098a.p099e.p100e.C1621o.C1622a) r3
            if (r3 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r0 = r2
        L_0x00be:
            java.util.Map r3 = r6.mo11803c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "mobile-subtype"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.util.Map r3 = r6.mo11803c()
            java.lang.String r4 = "country"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.util.Map r3 = r6.mo11803c()
            java.lang.String r4 = "locale"
            r3.put(r4, r0)
            android.content.Context r0 = r5.f2702c
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.util.Map r3 = r6.mo11803c()
            java.lang.String r4 = "mcc_mnc"
            r3.put(r4, r0)
            android.content.Context r0 = r5.f2702c
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0115 }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0115 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0115 }
            goto L_0x011d
        L_0x0115:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            p005b.p006a.p007a.p024o.C0823f.m406y(r2, r3, r0)
        L_0x011d:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.util.Map r1 = r6.mo11803c()
            java.lang.String r2 = "application_build"
            r1.put(r2, r0)
            b.l.a.a.f.e r6 = r6.mo11802b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p098a.p099e.C1590d.mo11736a(b.l.a.a.f.e):b.l.a.a.f.e");
    }

    /* renamed from: b */
    public C1654g mo11737b(C1653f fVar) {
        C1654g.C1655a aVar;
        String str;
        Integer num;
        C1654g.C1655a aVar2;
        C1606f.C1608b bVar;
        C1654g.C1655a aVar3 = C1654g.C1655a.TRANSIENT_ERROR;
        HashMap hashMap = new HashMap();
        C1647a aVar4 = (C1647a) fVar;
        for (C1634e next : aVar4.f2897a) {
            String g = next.mo11798g();
            if (!hashMap.containsKey(g)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(g, arrayList);
            } else {
                ((List) hashMap.get(g)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                C1634e eVar = (C1634e) ((List) entry.getValue()).get(0);
                C1624p pVar = C1624p.DEFAULT;
                Long valueOf = Long.valueOf(this.f2705f.mo11926a());
                Long valueOf2 = Long.valueOf(this.f2704e.mo11926a());
                C1604e eVar2 = new C1604e(C1615k.C1616a.ANDROID_FIREBASE, new C1601c(Integer.valueOf(eVar.mo11820f("sdk-version")), eVar.mo11819a(AnalyticsContext.Device.DEVICE_MODEL_KEY), eVar.mo11819a("hardware"), eVar.mo11819a("device"), eVar.mo11819a("product"), eVar.mo11819a("os-uild"), eVar.mo11819a(AnalyticsContext.Device.DEVICE_MANUFACTURER_KEY), eVar.mo11819a("fingerprint"), eVar.mo11819a("locale"), eVar.mo11819a(Constants.AMP_TRACKING_OPTION_COUNTRY), eVar.mo11819a("mcc_mnc"), eVar.mo11819a("application_build"), (C1601c.C1602a) null), (C1604e.C1605a) null);
                try {
                    str = null;
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                } catch (NumberFormatException unused) {
                    num = null;
                    str = (String) entry.getKey();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    C1634e eVar3 = (C1634e) it2.next();
                    C1633d d = eVar3.mo11795d();
                    Iterator it3 = it;
                    C1583a aVar5 = d.f2877a;
                    Iterator it4 = it2;
                    String str3 = "";
                    if (aVar5.equals(new C1583a("proto"))) {
                        byte[] bArr = d.f2878b;
                        bVar = new C1606f.C1608b();
                        bVar.f2776d = bArr;
                    } else if (aVar5.equals(new C1583a("json"))) {
                        String str4 = new String(d.f2878b, Charset.forName("UTF-8"));
                        bVar = new C1606f.C1608b();
                        bVar.f2777e = str4;
                    } else {
                        aVar2 = aVar3;
                        Log.w(C0823f.m347P("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", new Object[]{aVar5}));
                        it2 = it4;
                        it = it3;
                        aVar3 = aVar2;
                    }
                    bVar.f2773a = Long.valueOf(eVar3.mo11796e());
                    bVar.f2775c = Long.valueOf(eVar3.mo11799h());
                    String str5 = eVar3.mo11793b().get("tz-offset");
                    bVar.f2778f = Long.valueOf(str5 == null ? 0 : Long.valueOf(str5).longValue());
                    aVar2 = aVar3;
                    bVar.f2779g = new C1612i(C1621o.C1623b.f2817A.get(eVar3.mo11820f("net-type")), C1621o.C1622a.f2795C.get(eVar3.mo11820f("mobile-subtype")), (C1612i.C1613a) null);
                    if (eVar3.mo11794c() != null) {
                        bVar.f2774b = eVar3.mo11794c();
                    }
                    String str6 = bVar.f2773a == null ? " eventTimeMs" : str3;
                    if (bVar.f2775c == null) {
                        str6 = C0843a.m451l(str6, " eventUptimeMs");
                    }
                    if (bVar.f2778f == null) {
                        str6 = C0843a.m451l(str6, " timezoneOffsetSeconds");
                    }
                    if (str6.isEmpty()) {
                        arrayList3.add(new C1606f(bVar.f2773a.longValue(), bVar.f2774b, bVar.f2775c.longValue(), bVar.f2776d, bVar.f2777e, bVar.f2778f.longValue(), bVar.f2779g, (C1606f.C1607a) null));
                        it2 = it4;
                        it = it3;
                        aVar3 = aVar2;
                    } else {
                        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str6));
                    }
                }
                Iterator it5 = it;
                C1654g.C1655a aVar6 = aVar3;
                String str7 = valueOf == null ? " requestTimeMs" : "";
                if (valueOf2 == null) {
                    str7 = C0843a.m451l(str7, " requestUptimeMs");
                }
                if (str7.isEmpty()) {
                    arrayList2.add(new C1609g(valueOf.longValue(), valueOf2.longValue(), eVar2, num, str, arrayList3, pVar, (C1609g.C1610a) null));
                    it = it5;
                    aVar3 = aVar6;
                } else {
                    throw new IllegalStateException(C0843a.m451l("Missing required properties:", str7));
                }
            } else {
                C1654g.C1655a aVar7 = aVar3;
                C1603d dVar = new C1603d(arrayList2);
                URL url = this.f2703d;
                if (aVar4.f2898b != null) {
                    try {
                        C1587a a = C1587a.m2053a(((C1647a) fVar).f2898b);
                        String str8 = a.f2697b;
                        if (str8 != null) {
                            str2 = str8;
                        }
                        String str9 = a.f2696a;
                        if (str9 != null) {
                            url = m2056c(str9);
                        }
                    } catch (IllegalArgumentException unused2) {
                        return C1654g.m2180a();
                    }
                }
                try {
                    C1592b bVar2 = (C1592b) C0823f.m375i0(5, new C1591a(url, dVar, str2), new C1588b(this), C1589c.f2699a);
                    int i = bVar2.f2710a;
                    if (i == 200) {
                        return new C1649b(C1654g.C1655a.OK, bVar2.f2712c);
                    }
                    if (i < 500) {
                        if (i != 404) {
                            return C1654g.m2180a();
                        }
                    }
                    aVar = aVar7;
                    try {
                        return new C1649b(aVar, -1);
                    } catch (IOException e) {
                        e = e;
                        C0823f.m406y("CctTransportBackend", "Could not make request to the backend", e);
                        return new C1649b(aVar, -1);
                    }
                } catch (IOException e2) {
                    e = e2;
                    aVar = aVar7;
                    C0823f.m406y("CctTransportBackend", "Could not make request to the backend", e);
                    return new C1649b(aVar, -1);
                }
            }
        }
    }
}
