package p005b.p096l.p097a.p113c.p145h.p147b;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import java.util.Map;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p140i.C2708a1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2722b1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2736c1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2750d1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2778f1;
import p005b.p096l.p097a.p113c.p131e.p140i.C3016x5;

/* renamed from: b.l.a.c.h.b.i4 */
public final class C3204i4 extends C3395z8 implements C3154e {

    /* renamed from: d */
    public final Map<String, Map<String, String>> f5599d = new ArrayMap();

    /* renamed from: e */
    public final Map<String, Map<String, Boolean>> f5600e = new ArrayMap();

    /* renamed from: f */
    public final Map<String, Map<String, Boolean>> f5601f = new ArrayMap();

    /* renamed from: g */
    public final Map<String, C2750d1> f5602g = new ArrayMap();

    /* renamed from: h */
    public final Map<String, Map<String, Integer>> f5603h = new ArrayMap();

    /* renamed from: i */
    public final Map<String, String> f5604i = new ArrayMap();

    public C3204i4(C3220j9 j9Var) {
        super(j9Var);
    }

    /* renamed from: w */
    public static final Map<String, String> m6024w(C2750d1 d1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (C2778f1 next : d1Var.mo13276w()) {
            arrayMap.put(next.mo13310s(), next.mo13311t());
        }
        return arrayMap;
    }

    @WorkerThread
    /* renamed from: b */
    public final String mo14156b(String str, String str2) {
        mo14126h();
        mo14276t(str);
        Map map = this.f5599d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: j */
    public final boolean mo14178j() {
        return false;
    }

    @WorkerThread
    /* renamed from: l */
    public final C2750d1 mo14268l(String str) {
        mo14646i();
        mo14126h();
        C0823f.m376j(str);
        mo14276t(str);
        return this.f5602g.get(str);
    }

    @WorkerThread
    /* renamed from: m */
    public final boolean mo14269m(String str) {
        mo14126h();
        C2750d1 l = mo14268l(str);
        if (l == null) {
            return false;
        }
        return l.mo13271A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x033a, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x033b, code lost:
        r12.put("filter_id", r3);
        r12.put("event_name", r13.mo13466u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x034b, code lost:
        if (r13.mo13462C() == false) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x034d, code lost:
        r3 = java.lang.Boolean.valueOf(r13.mo13463D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0356, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0357, code lost:
        r12.put("session_scoped", r3);
        r12.put("data", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0369, code lost:
        if (r5.mo14286A().insertWithOnConflict(r4, (java.lang.String) null, r12, 5) != -1) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036b, code lost:
        r5.f5638a.mo14329d().f5799f.mo14415b("Failed to insert event filter (got -1). appId", p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x037c, code lost:
        r3 = r20;
        r1 = r23;
        r12 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0384, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r1 = r5.f5638a.mo14329d().f5799f;
        r3 = "Error storing event filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0391, code lost:
        r0 = r0.mo13412u().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x039d, code lost:
        if (r0.hasNext() == false) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x039f, code lost:
        r1 = r0.next();
        r5.mo14646i();
        r5.mo14126h();
        p005b.p006a.p007a.p024o.C0823f.m376j(r28);
        java.util.Objects.requireNonNull(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03b9, code lost:
        if (android.text.TextUtils.isEmpty(r1.mo13762u()) == false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03bb, code lost:
        r0 = r5.f5638a.mo14329d().f5802i;
        r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28);
        r8 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03d1, code lost:
        if (r1.mo13760s() == false) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d3, code lost:
        r1 = java.lang.Integer.valueOf(r1.mo13761t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03dc, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03dd, code lost:
        r0.mo14417d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03e6, code lost:
        r12 = r1.mo13371e();
        r13 = new android.content.ContentValues();
        r13.put(r3, r2);
        r25 = r0;
        r13.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03ff, code lost:
        if (r1.mo13760s() == false) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0401, code lost:
        r0 = java.lang.Integer.valueOf(r1.mo13761t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x040a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x040b, code lost:
        r13.put("filter_id", r0);
        r26 = r3;
        r13.put("property_name", r1.mo13762u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x041d, code lost:
        if (r1.mo13766y() == false) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x041f, code lost:
        r0 = java.lang.Boolean.valueOf(r1.mo13767z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0428, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0429, code lost:
        r13.put("session_scoped", r0);
        r13.put("data", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x043b, code lost:
        if (r5.mo14286A().insertWithOnConflict("property_filters", (java.lang.String) null, r13, 5) != -1) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x043d, code lost:
        r5.f5638a.mo14329d().f5799f.mo14415b("Failed to insert property filter (got -1). appId", p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x044f, code lost:
        r0 = r25;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0455, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r1 = r5.f5638a.mo14329d().f5799f;
        r3 = "Error storing property filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0460, code lost:
        r1.mo14416c(r3, p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0467, code lost:
        r5.mo14646i();
        r5.mo14126h();
        p005b.p006a.p007a.p024o.C0823f.m376j(r28);
        r0 = r5.mo14286A();
        r8 = r17;
        r0.delete("property_filters", r8, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
        r0.delete(r4, r8, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0494, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0496, code lost:
        r17 = r8;
        r19 = r10;
        r3 = r20;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0605, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r12 = r0.mo13412u().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x028d, code lost:
        if (r12.hasNext() == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0299, code lost:
        if (r12.next().mo13760s() != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x029b, code lost:
        r0 = r5.f5638a.mo14329d().f5802i;
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02a6, code lost:
        r0.mo14416c(r7, p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28), java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r12 = r0.mo13415x().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02bd, code lost:
        r20 = r3;
        r3 = "app_id";
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02cd, code lost:
        if (r12.hasNext() == false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r13 = r12.next();
        r5.mo14646i();
        r5.mo14126h();
        p005b.p006a.p007a.p024o.C0823f.m376j(r28);
        java.util.Objects.requireNonNull(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e9, code lost:
        if (android.text.TextUtils.isEmpty(r13.mo13466u()) == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02eb, code lost:
        r0 = r5.f5638a.mo14329d().f5802i;
        r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0301, code lost:
        if (r13.mo13464s() == false) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0303, code lost:
        r8 = java.lang.Integer.valueOf(r13.mo13465t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x030c, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x030d, code lost:
        r0.mo14417d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r7, java.lang.String.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0316, code lost:
        r1 = r13.mo13371e();
        r25 = r12;
        r12 = new android.content.ContentValues();
        r12.put(r3, r2);
        r12.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x032f, code lost:
        if (r13.mo13464s() == false) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0331, code lost:
        r3 = java.lang.Integer.valueOf(r13.mo13465t());
     */
    @androidx.annotation.WorkerThread
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14270n(java.lang.String r28, byte[] r29, java.lang.String r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r27.mo14646i()
            r27.mo14126h()
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)
            b.l.a.c.e.i.d1 r0 = r27.mo14278v(r28, r29)
            b.l.a.c.e.i.l5 r0 = r0.mo13546n()
            r3 = r0
            b.l.a.c.e.i.c1 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2736c1) r3
            r1.mo14277u(r2, r3)
            java.util.Map<java.lang.String, b.l.a.c.e.i.d1> r0 = r1.f5602g
            b.l.a.c.e.i.o5 r4 = r3.mo13484g()
            b.l.a.c.e.i.d1 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r4
            r0.put(r2, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f5604i
            r4 = r30
            r0.put(r2, r4)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r1.f5599d
            b.l.a.c.e.i.o5 r5 = r3.mo13484g()
            b.l.a.c.e.i.d1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r5
            java.util.Map r5 = m6024w(r5)
            r0.put(r2, r5)
            b.l.a.c.h.b.j9 r0 = r1.f6128b
            b.l.a.c.h.b.j r5 = r0.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            MessageType r0 = r3.f4885h
            b.l.a.c.e.i.d1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r0
            java.util.List r0 = r0.mo13279z()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.<init>(r0)
            java.lang.String r7 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r8 = "event_filters"
            java.lang.String r9 = "property_filters"
            java.lang.String r10 = "null reference"
            r12 = 0
        L_0x005f:
            int r13 = r6.size()
            if (r12 >= r13) goto L_0x01e7
            java.lang.Object r13 = r6.get(r12)
            b.l.a.c.e.i.j0 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r13
            b.l.a.c.e.i.l5 r13 = r13.mo13546n()
            b.l.a.c.e.i.i0 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2816i0) r13
            MessageType r15 = r13.f4885h
            b.l.a.c.e.i.j0 r15 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r15
            int r15 = r15.mo13416y()
            if (r15 == 0) goto L_0x0167
            r15 = r13
            r14 = 0
        L_0x007d:
            MessageType r11 = r15.f4885h
            b.l.a.c.e.i.j0 r11 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r11
            int r11 = r11.mo13416y()
            if (r14 >= r11) goto L_0x015e
            MessageType r11 = r15.f4885h
            b.l.a.c.e.i.j0 r11 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r11
            b.l.a.c.e.i.l0 r11 = r11.mo13417z(r14)
            b.l.a.c.e.i.l5 r11 = r11.mo13546n()
            b.l.a.c.e.i.k0 r11 = (p005b.p096l.p097a.p113c.p131e.p140i.C2842k0) r11
            b.l.a.c.e.i.l5 r16 = r11.clone()
            r4 = r16
            b.l.a.c.e.i.k0 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2842k0) r4
            MessageType r1 = r11.f4885h
            b.l.a.c.e.i.l0 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r1
            java.lang.String r1 = r1.mo13466u()
            r16 = r3
            java.lang.String[] r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3249m5.f5737a
            r17 = r7
            java.lang.String[] r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3249m5.f5739c
            java.lang.String r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3360w6.m6447b(r1, r3, r7)
            if (r1 == 0) goto L_0x00c6
            boolean r3 = r4.f4886i
            if (r3 == 0) goto L_0x00bd
            r4.mo13487j()
            r3 = 0
            r4.f4886i = r3
        L_0x00bd:
            MessageType r3 = r4.f4885h
            b.l.a.c.e.i.l0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r3
            p005b.p096l.p097a.p113c.p131e.p140i.C2855l0.m4912G(r3, r1)
            r1 = 1
            goto L_0x00c7
        L_0x00c6:
            r1 = 0
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            MessageType r7 = r11.f4885h
            b.l.a.c.e.i.l0 r7 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r7
            int r7 = r7.mo13468w()
            if (r3 >= r7) goto L_0x0127
            MessageType r7 = r11.f4885h
            b.l.a.c.e.i.l0 r7 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r7
            b.l.a.c.e.i.n0 r7 = r7.mo13469x(r3)
            r18 = r11
            java.lang.String r11 = r7.mo13510z()
            r19 = r10
            java.lang.String[] r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3260n5.f5768a
            r20 = r8
            java.lang.String[] r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3260n5.f5769b
            java.lang.String r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3360w6.m6447b(r11, r10, r8)
            if (r8 == 0) goto L_0x011e
            b.l.a.c.e.i.l5 r1 = r7.mo13546n()
            b.l.a.c.e.i.m0 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2868m0) r1
            boolean r7 = r1.f4886i
            if (r7 == 0) goto L_0x00ff
            r1.mo13487j()
            r7 = 0
            r1.f4886i = r7
            goto L_0x0100
        L_0x00ff:
            r7 = 0
        L_0x0100:
            MessageType r10 = r1.f4885h
            b.l.a.c.e.i.n0 r10 = (p005b.p096l.p097a.p113c.p131e.p140i.C2881n0) r10
            p005b.p096l.p097a.p113c.p131e.p140i.C2881n0.m4971C(r10, r8)
            b.l.a.c.e.i.o5 r1 = r1.mo13484g()
            b.l.a.c.e.i.n0 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2881n0) r1
            boolean r8 = r4.f4886i
            if (r8 == 0) goto L_0x0116
            r4.mo13487j()
            r4.f4886i = r7
        L_0x0116:
            MessageType r7 = r4.f4885h
            b.l.a.c.e.i.l0 r7 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r7
            p005b.p096l.p097a.p113c.p131e.p140i.C2855l0.m4913H(r7, r3, r1)
            r1 = 1
        L_0x011e:
            int r3 = r3 + 1
            r11 = r18
            r10 = r19
            r8 = r20
            goto L_0x00c8
        L_0x0127:
            r20 = r8
            r19 = r10
            if (r1 == 0) goto L_0x014e
            boolean r1 = r15.f4886i
            if (r1 == 0) goto L_0x0137
            r15.mo13487j()
            r1 = 0
            r15.f4886i = r1
        L_0x0137:
            MessageType r1 = r15.f4885h
            b.l.a.c.e.i.j0 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r1
            b.l.a.c.e.i.o5 r3 = r4.mo13484g()
            b.l.a.c.e.i.l0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r3
            p005b.p096l.p097a.p113c.p131e.p140i.C2829j0.m4847C(r1, r14, r3)
            b.l.a.c.e.i.o5 r1 = r13.mo13484g()
            b.l.a.c.e.i.j0 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r1
            r6.set(r12, r1)
            r15 = r13
        L_0x014e:
            int r14 = r14 + 1
            r1 = r27
            r4 = r30
            r3 = r16
            r7 = r17
            r10 = r19
            r8 = r20
            goto L_0x007d
        L_0x015e:
            r16 = r3
            r17 = r7
            r20 = r8
            r19 = r10
            goto L_0x0170
        L_0x0167:
            r16 = r3
            r17 = r7
            r20 = r8
            r19 = r10
            r15 = r13
        L_0x0170:
            MessageType r1 = r15.f4885h
            b.l.a.c.e.i.j0 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r1
            int r1 = r1.mo13413v()
            if (r1 == 0) goto L_0x01d7
            r1 = 0
        L_0x017b:
            MessageType r3 = r15.f4885h
            b.l.a.c.e.i.j0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r3
            int r3 = r3.mo13413v()
            if (r1 >= r3) goto L_0x01d7
            MessageType r3 = r15.f4885h
            b.l.a.c.e.i.j0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r3
            b.l.a.c.e.i.u0 r3 = r3.mo13414w(r1)
            java.lang.String r4 = r3.mo13762u()
            java.lang.String[] r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3271o5.f5810a
            java.lang.String[] r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3271o5.f5811b
            java.lang.String r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3360w6.m6447b(r4, r7, r8)
            if (r4 == 0) goto L_0x01d4
            b.l.a.c.e.i.l5 r3 = r3.mo13546n()
            b.l.a.c.e.i.t0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2959t0) r3
            boolean r7 = r3.f4886i
            if (r7 == 0) goto L_0x01ac
            r3.mo13487j()
            r7 = 0
            r3.f4886i = r7
            goto L_0x01ad
        L_0x01ac:
            r7 = 0
        L_0x01ad:
            MessageType r8 = r3.f4885h
            b.l.a.c.e.i.u0 r8 = (p005b.p096l.p097a.p113c.p131e.p140i.C2972u0) r8
            p005b.p096l.p097a.p113c.p131e.p140i.C2972u0.m5342C(r8, r4)
            boolean r4 = r15.f4886i
            if (r4 == 0) goto L_0x01bd
            r15.mo13487j()
            r15.f4886i = r7
        L_0x01bd:
            MessageType r4 = r15.f4885h
            b.l.a.c.e.i.j0 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r4
            b.l.a.c.e.i.o5 r3 = r3.mo13484g()
            b.l.a.c.e.i.u0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2972u0) r3
            p005b.p096l.p097a.p113c.p131e.p140i.C2829j0.m4846B(r4, r1, r3)
            b.l.a.c.e.i.o5 r3 = r13.mo13484g()
            b.l.a.c.e.i.j0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r3
            r6.set(r12, r3)
            r15 = r13
        L_0x01d4:
            int r1 = r1 + 1
            goto L_0x017b
        L_0x01d7:
            int r12 = r12 + 1
            r1 = r27
            r4 = r30
            r3 = r16
            r7 = r17
            r10 = r19
            r8 = r20
            goto L_0x005f
        L_0x01e7:
            r16 = r3
            r17 = r7
            r20 = r8
            r19 = r10
            r5.mo14646i()
            r5.mo14126h()
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)
            android.database.sqlite.SQLiteDatabase r1 = r5.mo14286A()
            r1.beginTransaction()
            r5.mo14646i()     // Catch:{ all -> 0x0609 }
            r5.mo14126h()     // Catch:{ all -> 0x0609 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)     // Catch:{ all -> 0x0609 }
            android.database.sqlite.SQLiteDatabase r3 = r5.mo14286A()     // Catch:{ all -> 0x0609 }
            r4 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x0609 }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x0609 }
            r3.delete(r9, r0, r7)     // Catch:{ all -> 0x0609 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x0609 }
            r7[r8] = r2     // Catch:{ all -> 0x0609 }
            r4 = r20
            r3.delete(r4, r0, r7)     // Catch:{ all -> 0x0609 }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ all -> 0x0609 }
        L_0x0222:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0609 }
            if (r0 == 0) goto L_0x04a5
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x04a0 }
            b.l.a.c.e.i.j0 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r0     // Catch:{ all -> 0x04a0 }
            r5.mo14646i()     // Catch:{ all -> 0x04a0 }
            r5.mo14126h()     // Catch:{ all -> 0x04a0 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)     // Catch:{ all -> 0x04a0 }
            r10 = r19
            java.util.Objects.requireNonNull(r0, r10)     // Catch:{ all -> 0x04a0 }
            boolean r11 = r0.mo13410s()     // Catch:{ all -> 0x04a0 }
            if (r11 != 0) goto L_0x0254
            b.l.a.c.h.b.p4 r0 = r5.f5638a     // Catch:{ all -> 0x0609 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0609 }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ all -> 0x0609 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ all -> 0x0609 }
            r0.mo14415b(r7, r8)     // Catch:{ all -> 0x0609 }
            goto L_0x02ad
        L_0x0254:
            int r11 = r0.mo13411t()     // Catch:{ all -> 0x04a0 }
            java.util.List r12 = r0.mo13415x()     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04a0 }
        L_0x0260:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r13 == 0) goto L_0x0281
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0609 }
            b.l.a.c.e.i.l0 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r13     // Catch:{ all -> 0x0609 }
            boolean r13 = r13.mo13464s()     // Catch:{ all -> 0x0609 }
            if (r13 != 0) goto L_0x0260
            b.l.a.c.h.b.p4 r0 = r5.f5638a     // Catch:{ all -> 0x0609 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0609 }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ all -> 0x0609 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
        L_0x027c:
            java.lang.Object r8 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ all -> 0x0609 }
            goto L_0x02a6
        L_0x0281:
            java.util.List r12 = r0.mo13412u()     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04a0 }
        L_0x0289:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04a0 }
            if (r13 == 0) goto L_0x02b1
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0609 }
            b.l.a.c.e.i.u0 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2972u0) r13     // Catch:{ all -> 0x0609 }
            boolean r13 = r13.mo13760s()     // Catch:{ all -> 0x0609 }
            if (r13 != 0) goto L_0x0289
            b.l.a.c.h.b.p4 r0 = r5.f5638a     // Catch:{ all -> 0x0609 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0609 }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ all -> 0x0609 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            goto L_0x027c
        L_0x02a6:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0609 }
            r0.mo14416c(r7, r8, r11)     // Catch:{ all -> 0x0609 }
        L_0x02ad:
            r19 = r10
            goto L_0x0222
        L_0x02b1:
            java.util.List r12 = r0.mo13415x()     // Catch:{ all -> 0x04a0 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04a0 }
        L_0x02b9:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04a0 }
            java.lang.String r14 = "data"
            java.lang.String r15 = "session_scoped"
            java.lang.String r7 = "filter_id"
            java.lang.String r8 = "audience_id"
            r20 = r3
            java.lang.String r3 = "app_id"
            r21 = -1
            r23 = r1
            if (r13 == 0) goto L_0x0391
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0605 }
            b.l.a.c.e.i.l0 r13 = (p005b.p096l.p097a.p113c.p131e.p140i.C2855l0) r13     // Catch:{ all -> 0x0605 }
            r5.mo14646i()     // Catch:{ all -> 0x0605 }
            r5.mo14126h()     // Catch:{ all -> 0x0605 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)     // Catch:{ all -> 0x0605 }
            java.util.Objects.requireNonNull(r13, r10)     // Catch:{ all -> 0x0605 }
            java.lang.String r24 = r13.mo13466u()     // Catch:{ all -> 0x0605 }
            boolean r24 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x0605 }
            if (r24 == 0) goto L_0x0316
            b.l.a.c.h.b.p4 r0 = r5.f5638a     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ all -> 0x0605 }
            java.lang.String r1 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ all -> 0x0605 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0605 }
            boolean r8 = r13.mo13464s()     // Catch:{ all -> 0x0605 }
            if (r8 == 0) goto L_0x030c
            int r8 = r13.mo13465t()     // Catch:{ all -> 0x0605 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0605 }
            goto L_0x030d
        L_0x030c:
            r8 = 0
        L_0x030d:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0605 }
            r0.mo14417d(r1, r3, r7, r8)     // Catch:{ all -> 0x0605 }
            goto L_0x0467
        L_0x0316:
            byte[] r1 = r13.mo13371e()     // Catch:{ all -> 0x0605 }
            r25 = r12
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0605 }
            r12.<init>()     // Catch:{ all -> 0x0605 }
            r12.put(r3, r2)     // Catch:{ all -> 0x0605 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0605 }
            r12.put(r8, r3)     // Catch:{ all -> 0x0605 }
            boolean r3 = r13.mo13464s()     // Catch:{ all -> 0x0605 }
            if (r3 == 0) goto L_0x033a
            int r3 = r13.mo13465t()     // Catch:{ all -> 0x0605 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0605 }
            goto L_0x033b
        L_0x033a:
            r3 = 0
        L_0x033b:
            r12.put(r7, r3)     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = "event_name"
            java.lang.String r7 = r13.mo13466u()     // Catch:{ all -> 0x0605 }
            r12.put(r3, r7)     // Catch:{ all -> 0x0605 }
            boolean r3 = r13.mo13462C()     // Catch:{ all -> 0x0605 }
            if (r3 == 0) goto L_0x0356
            boolean r3 = r13.mo13463D()     // Catch:{ all -> 0x0605 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0605 }
            goto L_0x0357
        L_0x0356:
            r3 = 0
        L_0x0357:
            r12.put(r15, r3)     // Catch:{ all -> 0x0605 }
            r12.put(r14, r1)     // Catch:{ all -> 0x0605 }
            android.database.sqlite.SQLiteDatabase r1 = r5.mo14286A()     // Catch:{ SQLiteException -> 0x0384 }
            r3 = 5
            r7 = 0
            long r12 = r1.insertWithOnConflict(r4, r7, r12, r3)     // Catch:{ SQLiteException -> 0x0384 }
            int r1 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x037c
            b.l.a.c.h.b.p4 r1 = r5.f5638a     // Catch:{ SQLiteException -> 0x0384 }
            b.l.a.c.h.b.o3 r1 = r1.mo14329d()     // Catch:{ SQLiteException -> 0x0384 }
            b.l.a.c.h.b.m3 r1 = r1.f5799f     // Catch:{ SQLiteException -> 0x0384 }
            java.lang.String r3 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ SQLiteException -> 0x0384 }
            r1.mo14415b(r3, r7)     // Catch:{ SQLiteException -> 0x0384 }
        L_0x037c:
            r3 = r20
            r1 = r23
            r12 = r25
            goto L_0x02b9
        L_0x0384:
            r0 = move-exception
            b.l.a.c.h.b.p4 r1 = r5.f5638a     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.o3 r1 = r1.mo14329d()     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.m3 r1 = r1.f5799f     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = "Error storing event filter. appId"
            goto L_0x0460
        L_0x0391:
            java.util.List r0 = r0.mo13412u()     // Catch:{ all -> 0x0605 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0605 }
        L_0x0399:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0605 }
            if (r1 == 0) goto L_0x0494
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0605 }
            b.l.a.c.e.i.u0 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2972u0) r1     // Catch:{ all -> 0x0605 }
            r5.mo14646i()     // Catch:{ all -> 0x0605 }
            r5.mo14126h()     // Catch:{ all -> 0x0605 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)     // Catch:{ all -> 0x0605 }
            java.util.Objects.requireNonNull(r1, r10)     // Catch:{ all -> 0x0605 }
            java.lang.String r12 = r1.mo13762u()     // Catch:{ all -> 0x0605 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0605 }
            if (r12 == 0) goto L_0x03e6
            b.l.a.c.h.b.p4 r0 = r5.f5638a     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.m3 r0 = r0.f5802i     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ all -> 0x0605 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0605 }
            boolean r12 = r1.mo13760s()     // Catch:{ all -> 0x0605 }
            if (r12 == 0) goto L_0x03dc
            int r1 = r1.mo13761t()     // Catch:{ all -> 0x0605 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0605 }
            goto L_0x03dd
        L_0x03dc:
            r1 = 0
        L_0x03dd:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0605 }
            r0.mo14417d(r3, r7, r8, r1)     // Catch:{ all -> 0x0605 }
            goto L_0x0467
        L_0x03e6:
            byte[] r12 = r1.mo13371e()     // Catch:{ all -> 0x0605 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0605 }
            r13.<init>()     // Catch:{ all -> 0x0605 }
            r13.put(r3, r2)     // Catch:{ all -> 0x0605 }
            r25 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0605 }
            r13.put(r8, r0)     // Catch:{ all -> 0x0605 }
            boolean r0 = r1.mo13760s()     // Catch:{ all -> 0x0605 }
            if (r0 == 0) goto L_0x040a
            int r0 = r1.mo13761t()     // Catch:{ all -> 0x0605 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0605 }
            goto L_0x040b
        L_0x040a:
            r0 = 0
        L_0x040b:
            r13.put(r7, r0)     // Catch:{ all -> 0x0605 }
            java.lang.String r0 = "property_name"
            r26 = r3
            java.lang.String r3 = r1.mo13762u()     // Catch:{ all -> 0x0605 }
            r13.put(r0, r3)     // Catch:{ all -> 0x0605 }
            boolean r0 = r1.mo13766y()     // Catch:{ all -> 0x0605 }
            if (r0 == 0) goto L_0x0428
            boolean r0 = r1.mo13767z()     // Catch:{ all -> 0x0605 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0605 }
            goto L_0x0429
        L_0x0428:
            r0 = 0
        L_0x0429:
            r13.put(r15, r0)     // Catch:{ all -> 0x0605 }
            r13.put(r14, r12)     // Catch:{ all -> 0x0605 }
            android.database.sqlite.SQLiteDatabase r0 = r5.mo14286A()     // Catch:{ SQLiteException -> 0x0455 }
            r1 = 5
            r3 = 0
            long r12 = r0.insertWithOnConflict(r9, r3, r13, r1)     // Catch:{ SQLiteException -> 0x0455 }
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x044f
            b.l.a.c.h.b.p4 r0 = r5.f5638a     // Catch:{ SQLiteException -> 0x0455 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x0455 }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ SQLiteException -> 0x0455 }
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ SQLiteException -> 0x0455 }
            r0.mo14415b(r1, r3)     // Catch:{ SQLiteException -> 0x0455 }
            goto L_0x0467
        L_0x044f:
            r0 = r25
            r3 = r26
            goto L_0x0399
        L_0x0455:
            r0 = move-exception
            b.l.a.c.h.b.p4 r1 = r5.f5638a     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.o3 r1 = r1.mo14329d()     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.m3 r1 = r1.f5799f     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = "Error storing property filter. appId"
        L_0x0460:
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ all -> 0x0605 }
            r1.mo14416c(r3, r7, r0)     // Catch:{ all -> 0x0605 }
        L_0x0467:
            r5.mo14646i()     // Catch:{ all -> 0x0605 }
            r5.mo14126h()     // Catch:{ all -> 0x0605 }
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)     // Catch:{ all -> 0x0605 }
            android.database.sqlite.SQLiteDatabase r0 = r5.mo14286A()     // Catch:{ all -> 0x0605 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0605 }
            r7 = 0
            r3[r7] = r2     // Catch:{ all -> 0x0605 }
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0605 }
            r12 = 1
            r3[r12] = r8     // Catch:{ all -> 0x0605 }
            r8 = r17
            r0.delete(r9, r8, r3)     // Catch:{ all -> 0x0605 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0605 }
            r1[r7] = r2     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0605 }
            r1[r12] = r3     // Catch:{ all -> 0x0605 }
            r0.delete(r4, r8, r1)     // Catch:{ all -> 0x0605 }
            goto L_0x0496
        L_0x0494:
            r8 = r17
        L_0x0496:
            r17 = r8
            r19 = r10
            r3 = r20
            r1 = r23
            goto L_0x0222
        L_0x04a0:
            r0 = move-exception
            r23 = r1
            goto L_0x0606
        L_0x04a5:
            r23 = r1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0605 }
            r0.<init>()     // Catch:{ all -> 0x0605 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0605 }
        L_0x04b0:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0605 }
            if (r3 == 0) goto L_0x04d0
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0605 }
            b.l.a.c.e.i.j0 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2829j0) r3     // Catch:{ all -> 0x0605 }
            boolean r4 = r3.mo13410s()     // Catch:{ all -> 0x0605 }
            if (r4 == 0) goto L_0x04cb
            int r3 = r3.mo13411t()     // Catch:{ all -> 0x0605 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0605 }
            goto L_0x04cc
        L_0x04cb:
            r7 = 0
        L_0x04cc:
            r0.add(r7)     // Catch:{ all -> 0x0605 }
            goto L_0x04b0
        L_0x04d0:
            p005b.p006a.p007a.p024o.C0823f.m376j(r28)     // Catch:{ all -> 0x0605 }
            r5.mo14646i()     // Catch:{ all -> 0x0605 }
            r5.mo14126h()     // Catch:{ all -> 0x0605 }
            android.database.sqlite.SQLiteDatabase r1 = r5.mo14286A()     // Catch:{ all -> 0x0605 }
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0580 }
            r3 = 0
            r4[r3] = r2     // Catch:{ SQLiteException -> 0x0580 }
            java.lang.String r3 = "select count(1) from audience_filter_values where app_id=?"
            long r3 = r5.mo14315v(r3, r4)     // Catch:{ SQLiteException -> 0x0580 }
            b.l.a.c.h.b.p4 r5 = r5.f5638a     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.f r5 = r5.f5848g     // Catch:{ all -> 0x0605 }
            r6 = 2000(0x7d0, float:2.803E-42)
            b.l.a.c.h.b.a3<java.lang.Integer> r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5349F     // Catch:{ all -> 0x0605 }
            int r5 = r5.mo14195p(r2, r7)     // Catch:{ all -> 0x0605 }
            int r5 = java.lang.Math.min(r6, r5)     // Catch:{ all -> 0x0605 }
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)     // Catch:{ all -> 0x0605 }
            long r6 = (long) r5     // Catch:{ all -> 0x0605 }
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0505
            goto L_0x0592
        L_0x0505:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0605 }
            r3.<init>()     // Catch:{ all -> 0x0605 }
            r4 = 0
        L_0x050b:
            int r6 = r0.size()     // Catch:{ all -> 0x0605 }
            if (r4 >= r6) goto L_0x0527
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x0605 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0605 }
            if (r6 == 0) goto L_0x0592
            int r6 = r6.intValue()     // Catch:{ all -> 0x0605 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0605 }
            r3.add(r6)     // Catch:{ all -> 0x0605 }
            int r4 = r4 + 1
            goto L_0x050b
        L_0x0527:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0605 }
            int r3 = r3.length()     // Catch:{ all -> 0x0605 }
            r4 = 2
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0605 }
            r4.<init>(r3)     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = "("
            r4.append(r3)     // Catch:{ all -> 0x0605 }
            r4.append(r0)     // Catch:{ all -> 0x0605 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x0605 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = "audience_filter_values"
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0605 }
            int r4 = r4.length()     // Catch:{ all -> 0x0605 }
            int r4 = r4 + 140
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0605 }
            r6.<init>(r4)     // Catch:{ all -> 0x0605 }
            java.lang.String r4 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r4)     // Catch:{ all -> 0x0605 }
            r6.append(r0)     // Catch:{ all -> 0x0605 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch:{ all -> 0x0605 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0605 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0605 }
            r6 = 0
            r4[r6] = r2     // Catch:{ all -> 0x0605 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0605 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0605 }
            r1.delete(r3, r0, r4)     // Catch:{ all -> 0x0605 }
            goto L_0x0592
        L_0x0580:
            r0 = move-exception
            b.l.a.c.h.b.p4 r1 = r5.f5638a     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.o3 r1 = r1.mo14329d()     // Catch:{ all -> 0x0605 }
            b.l.a.c.h.b.m3 r1 = r1.f5799f     // Catch:{ all -> 0x0605 }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)     // Catch:{ all -> 0x0605 }
            r1.mo14416c(r3, r4, r0)     // Catch:{ all -> 0x0605 }
        L_0x0592:
            r23.setTransactionSuccessful()     // Catch:{ all -> 0x0605 }
            r23.endTransaction()
            r1 = r16
            boolean r0 = r1.f4886i     // Catch:{ RuntimeException -> 0x05b8 }
            if (r0 == 0) goto L_0x05a4
            r1.mo13487j()     // Catch:{ RuntimeException -> 0x05b8 }
            r3 = 0
            r1.f4886i = r3     // Catch:{ RuntimeException -> 0x05b8 }
        L_0x05a4:
            MessageType r0 = r1.f4885h     // Catch:{ RuntimeException -> 0x05b8 }
            b.l.a.c.e.i.d1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r0     // Catch:{ RuntimeException -> 0x05b8 }
            p005b.p096l.p097a.p113c.p131e.p140i.C2750d1.m4674F(r0)     // Catch:{ RuntimeException -> 0x05b8 }
            b.l.a.c.e.i.o5 r0 = r1.mo13484g()     // Catch:{ RuntimeException -> 0x05b8 }
            b.l.a.c.e.i.d1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r0     // Catch:{ RuntimeException -> 0x05b8 }
            byte[] r0 = r0.mo13371e()     // Catch:{ RuntimeException -> 0x05b8 }
            r3 = r27
            goto L_0x05ce
        L_0x05b8:
            r0 = move-exception
            r3 = r27
            b.l.a.c.h.b.p4 r4 = r3.f5638a
            b.l.a.c.h.b.o3 r4 = r4.mo14329d()
            b.l.a.c.h.b.m3 r4 = r4.f5802i
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r28)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.mo14416c(r6, r5, r0)
            r0 = r29
        L_0x05ce:
            b.l.a.c.e.i.oa r4 = p005b.p096l.p097a.p113c.p131e.p140i.C2904oa.f4924h
            b.l.a.c.e.i.pa r4 = r4.mo13235a()
            r4.mo13590a()
            b.l.a.c.h.b.p4 r4 = r3.f5638a
            b.l.a.c.h.b.f r4 = r4.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5345C0
            r6 = 0
            boolean r4 = r4.mo14197r(r6, r5)
            if (r4 == 0) goto L_0x05ee
            b.l.a.c.h.b.j9 r4 = r3.f6128b
            b.l.a.c.h.b.j r4 = r4.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r4)
            r6 = r30
            goto L_0x05f5
        L_0x05ee:
            b.l.a.c.h.b.j9 r4 = r3.f6128b
            b.l.a.c.h.b.j r4 = r4.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r4)
        L_0x05f5:
            r4.mo14303R(r2, r0, r6)
            java.util.Map<java.lang.String, b.l.a.c.e.i.d1> r0 = r3.f5602g
            b.l.a.c.e.i.o5 r1 = r1.mo13484g()
            b.l.a.c.e.i.d1 r1 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r1
            r0.put(r2, r1)
            r1 = 1
            return r1
        L_0x0605:
            r0 = move-exception
        L_0x0606:
            r3 = r27
            goto L_0x060e
        L_0x0609:
            r0 = move-exception
            r3 = r27
            r23 = r1
        L_0x060e:
            r23.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3204i4.mo14270n(java.lang.String, byte[], java.lang.String):boolean");
    }

    @WorkerThread
    /* renamed from: o */
    public final boolean mo14271o(String str, String str2) {
        Boolean bool;
        mo14126h();
        mo14276t(str);
        if ("1".equals(mo14156b(str, "measurement.upload.blacklist_internal")) && C3297q9.m6338F(str2)) {
            return true;
        }
        if ("1".equals(mo14156b(str, "measurement.upload.blacklist_public")) && C3297q9.m6345f0(str2)) {
            return true;
        }
        Map map = this.f5600e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    /* renamed from: p */
    public final boolean mo14272p(String str, String str2) {
        Boolean bool;
        mo14126h();
        mo14276t(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f5601f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    /* renamed from: q */
    public final int mo14273q(String str, String str2) {
        Integer num;
        mo14126h();
        mo14276t(str);
        Map map = this.f5603h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: r */
    public final boolean mo14274r(String str) {
        return "1".equals(mo14156b(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: s */
    public final boolean mo14275s(String str) {
        return "1".equals(mo14156b(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        if (r2 != null) goto L_0x008c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff  */
    @androidx.annotation.WorkerThread
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14276t(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo14646i()
            r12.mo14126h()
            p005b.p006a.p007a.p024o.C0823f.m376j(r13)
            java.util.Map<java.lang.String, b.l.a.c.e.i.d1> r0 = r12.f5602g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0103
            b.l.a.c.h.b.j9 r0 = r12.f6128b
            b.l.a.c.h.b.j r0 = r0.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r0)
            p005b.p006a.p007a.p024o.C0823f.m376j(r13)
            r0.mo14126h()
            r0.mo14646i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo14286A()     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0076, all -> 0x0073 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0071 }
            if (r3 != 0) goto L_0x0046
            goto L_0x008c
        L_0x0046:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0071 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0071 }
            if (r5 == 0) goto L_0x0065
            b.l.a.c.h.b.p4 r5 = r0.f5638a     // Catch:{ SQLiteException -> 0x0071 }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ SQLiteException -> 0x0071 }
            b.l.a.c.h.b.m3 r5 = r5.f5799f     // Catch:{ SQLiteException -> 0x0071 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r13)     // Catch:{ SQLiteException -> 0x0071 }
            r5.mo14415b(r6, r7)     // Catch:{ SQLiteException -> 0x0071 }
        L_0x0065:
            if (r3 != 0) goto L_0x0068
            goto L_0x008c
        L_0x0068:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0071 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0071 }
            r2.close()
            goto L_0x0090
        L_0x0071:
            r3 = move-exception
            goto L_0x0079
        L_0x0073:
            r13 = move-exception
            goto L_0x00fd
        L_0x0076:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0079:
            b.l.a.c.h.b.p4 r0 = r0.f5638a     // Catch:{ all -> 0x00fb }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ all -> 0x00fb }
            b.l.a.c.h.b.m3 r0 = r0.f5799f     // Catch:{ all -> 0x00fb }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r13)     // Catch:{ all -> 0x00fb }
            r0.mo14416c(r4, r5, r3)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x008f
        L_0x008c:
            r2.close()
        L_0x008f:
            r5 = r1
        L_0x0090:
            if (r5 != 0) goto L_0x00ae
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r12.f5599d
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f5600e
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f5601f
            r0.put(r13, r1)
            java.util.Map<java.lang.String, b.l.a.c.e.i.d1> r0 = r12.f5602g
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f5604i
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r12.f5603h
            goto L_0x00f7
        L_0x00ae:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            b.l.a.c.e.i.d1 r0 = r12.mo14278v(r13, r0)
            b.l.a.c.e.i.l5 r0 = r0.mo13546n()
            b.l.a.c.e.i.c1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2736c1) r0
            r12.mo14277u(r13, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r12.f5599d
            b.l.a.c.e.i.o5 r3 = r0.mo13484g()
            b.l.a.c.e.i.d1 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r3
            java.util.Map r3 = m6024w(r3)
            r2.put(r13, r3)
            java.util.Map<java.lang.String, b.l.a.c.e.i.d1> r2 = r12.f5602g
            b.l.a.c.e.i.o5 r0 = r0.mo13484g()
            b.l.a.c.e.i.d1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2750d1) r0
            r2.put(r13, r0)
            b.l.a.c.e.i.oa r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2904oa.f4924h
            b.l.a.c.e.i.pa r0 = r0.mo13235a()
            r0.mo13590a()
            b.l.a.c.h.b.p4 r0 = r12.f5638a
            b.l.a.c.h.b.f r0 = r0.f5848g
            b.l.a.c.h.b.a3<java.lang.Boolean> r2 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5345C0
            boolean r0 = r0.mo14197r(r1, r2)
            if (r0 == 0) goto L_0x00f5
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f5604i
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00f7
        L_0x00f5:
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.f5604i
        L_0x00f7:
            r0.put(r13, r1)
            return
        L_0x00fb:
            r13 = move-exception
            r1 = r2
        L_0x00fd:
            if (r1 == 0) goto L_0x0102
            r1.close()
        L_0x0102:
            throw r13
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3204i4.mo14276t(java.lang.String):void");
    }

    /* renamed from: u */
    public final void mo14277u(String str, C2736c1 c1Var) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        for (int i = 0; i < ((C2750d1) c1Var.f4885h).mo13277x(); i++) {
            C2708a1 a1Var = (C2708a1) ((C2750d1) c1Var.f4885h).mo13278y(i).mo13546n();
            if (TextUtils.isEmpty(a1Var.mo13215m())) {
                this.f5638a.mo14329d().f5802i.mo14414a("EventConfig contained null event name");
            } else {
                String m = a1Var.mo13215m();
                String b = C3360w6.m6447b(a1Var.mo13215m(), C3249m5.f5737a, C3249m5.f5739c);
                if (!TextUtils.isEmpty(b)) {
                    if (a1Var.f4886i) {
                        a1Var.mo13487j();
                        a1Var.f4886i = false;
                    }
                    C2722b1.m4578y((C2722b1) a1Var.f4885h, b);
                    if (c1Var.f4886i) {
                        c1Var.mo13487j();
                        c1Var.f4886i = false;
                    }
                    C2750d1.m4673E((C2750d1) c1Var.f4885h, i, (C2722b1) a1Var.mo13484g());
                }
                arrayMap.put(m, Boolean.valueOf(((C2722b1) a1Var.f4885h).mo13247t()));
                arrayMap2.put(a1Var.mo13215m(), Boolean.valueOf(((C2722b1) a1Var.f4885h).mo13248u()));
                if (((C2722b1) a1Var.f4885h).mo13249v()) {
                    if (a1Var.mo13216n() < 2 || a1Var.mo13216n() > 65535) {
                        this.f5638a.mo14329d().f5802i.mo14416c("Invalid sampling rate. Event name, sample rate", a1Var.mo13215m(), Integer.valueOf(a1Var.mo13216n()));
                    } else {
                        arrayMap3.put(a1Var.mo13215m(), Integer.valueOf(a1Var.mo13216n()));
                    }
                }
            }
        }
        this.f5600e.put(str, arrayMap);
        this.f5601f.put(str, arrayMap2);
        this.f5603h.put(str, arrayMap3);
    }

    @WorkerThread
    /* renamed from: v */
    public final C2750d1 mo14278v(String str, byte[] bArr) {
        C3269o3 d;
        if (bArr == null) {
            return C2750d1.m4671C();
        }
        try {
            C2750d1 d1Var = (C2750d1) ((C2736c1) C3242l9.m6192G(C2750d1.m4670B(), bArr)).mo13484g();
            C3247m3 m3Var = this.f5638a.mo14329d().f5807n;
            String str2 = null;
            Long valueOf = d1Var.mo13272s() ? Long.valueOf(d1Var.mo13273t()) : null;
            if (d1Var.mo13274u()) {
                str2 = d1Var.mo13275v();
            }
            m3Var.mo14416c("Parsed config. version, gmp_app_id", valueOf, str2);
            return d1Var;
        } catch (C3016x5 e) {
            e = e;
            d = this.f5638a.mo14329d();
            d.f5802i.mo14416c("Unable to merge remote config. appId", C3269o3.m6253t(str), e);
            return C2750d1.m4671C();
        } catch (RuntimeException e2) {
            e = e2;
            d = this.f5638a.mo14329d();
            d.f5802i.mo14416c("Unable to merge remote config. appId", C3269o3.m6253t(str), e);
            return C2750d1.m4671C();
        }
    }
}
