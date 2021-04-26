package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p136e.C2090ci;
import p005b.p096l.p097a.p113c.p131e.p136e.C2363nk;
import p005b.p096l.p097a.p113c.p131e.p136e.C2527ug;
import p005b.p096l.p097a.p113c.p131e.p136e.C2600xh;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.C3857b;
import p005b.p096l.p180d.p185o.C3922p;
import p005b.p096l.p180d.p185o.C3924q;
import p005b.p096l.p180d.p185o.C3927r0;
import p005b.p096l.p180d.p185o.C3929s0;
import p005b.p096l.p180d.p185o.C3931t0;
import p005b.p096l.p180d.p185o.p189e0.C3864a;
import p005b.p096l.p180d.p185o.p189e0.C3866b;
import p005b.p096l.p180d.p185o.p189e0.C3884k;
import p005b.p096l.p180d.p185o.p189e0.C3889n;
import p005b.p096l.p180d.p185o.p189e0.C3894s;
import p005b.p096l.p180d.p185o.p189e0.C3896u;
import p005b.p096l.p180d.p185o.p189e0.C3897v;
import p005b.p096l.p180d.p185o.p189e0.C3899x;
import p005b.p096l.p180d.p221y.C4321b;

public abstract class FirebaseAuth implements C3866b {

    /* renamed from: a */
    public C3825d f11415a;

    /* renamed from: b */
    public final List<C5767b> f11416b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final List<C3864a> f11417c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public List<C5766a> f11418d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public C2600xh f11419e;
    @Nullable

    /* renamed from: f */
    public C3922p f11420f;

    /* renamed from: g */
    public final Object f11421g = new Object();

    /* renamed from: h */
    public final Object f11422h = new Object();

    /* renamed from: i */
    public String f11423i;

    /* renamed from: j */
    public final C3894s f11424j;

    /* renamed from: k */
    public final C3899x f11425k;

    /* renamed from: l */
    public C3896u f11426l;

    /* renamed from: m */
    public C3897v f11427m = C3897v.f7180h;

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    public interface C5766a {
        /* renamed from: a */
        void mo22159a(@RecentlyNonNull FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    public interface C5767b {
        /* renamed from: a */
        void mo22160a(@RecentlyNonNull FirebaseAuth firebaseAuth);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016a, code lost:
        if (r7.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x030c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(@androidx.annotation.RecentlyNonNull p005b.p096l.p180d.C3825d r11) {
        /*
            r10 = this;
            r11.mo15344a()
            b.l.d.l r0 = r11.f7044c
            java.lang.String r0 = r0.f7058a
            p005b.p006a.p007a.p024o.C0823f.m376j(r0)
            b.l.a.c.e.e.si r1 = new b.l.a.c.e.e.si
            r1.<init>(r0)
            r11.mo15344a()
            android.content.Context r0 = r11.f7042a
            b.l.a.c.b.l.a$g<b.l.a.c.e.e.ai> r2 = p005b.p096l.p097a.p113c.p131e.p136e.C2505ti.f4312a
            b.l.a.c.e.e.xh r2 = new b.l.a.c.e.e.xh
            r2.<init>(r0, r1)
            b.l.d.o.e0.s r0 = new b.l.d.o.e0.s
            r11.mo15344a()
            android.content.Context r1 = r11.f7042a
            java.lang.String r3 = r11.mo15345e()
            r0.<init>(r1, r3)
            b.l.d.o.e0.x r1 = p005b.p096l.p180d.p185o.p189e0.C3899x.f7183b
            r10.<init>()
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r10.f11416b = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r10.f11417c = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r10.f11418d = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r10.f11421g = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r10.f11422h = r3
            b.l.d.o.e0.v r3 = p005b.p096l.p180d.p185o.p189e0.C3897v.f7180h
            r10.f11427m = r3
            r10.f11415a = r11
            r10.f11419e = r2
            r10.f11424j = r0
            java.lang.String r11 = "null reference"
            java.util.Objects.requireNonNull(r1, r11)
            r10.f11425k = r1
            java.lang.String r11 = "type"
            android.content.SharedPreferences r1 = r0.f7175c
            java.lang.String r2 = "com.google.firebase.auth.FIREBASE_USER"
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x008f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x008f }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008f }
            boolean r1 = r2.has(r11)     // Catch:{ Exception -> 0x008f }
            if (r1 == 0) goto L_0x008f
            java.lang.String r1 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            java.lang.String r11 = r2.optString(r11)     // Catch:{ Exception -> 0x008f }
            boolean r11 = r1.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x008f }
            if (r11 == 0) goto L_0x008f
            b.l.d.o.e0.j0 r11 = r0.mo15418a(r2)     // Catch:{ Exception -> 0x008f }
            goto L_0x0090
        L_0x008f:
            r11 = r3
        L_0x0090:
            r10.f11420f = r11
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x00be
            b.l.d.o.e0.s r2 = r10.f11424j
            java.util.Objects.requireNonNull(r2)
            android.content.SharedPreferences r2 = r2.f7175c
            java.lang.Object[] r4 = new java.lang.Object[r0]
            b.l.d.o.e0.g0 r11 = r11.f7146h
            java.lang.String r11 = r11.f7134g
            r4[r1] = r11
            java.lang.String r11 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.String r11 = r2.getString(r11, r3)
            if (r11 == 0) goto L_0x00b6
            b.l.a.c.e.e.nk r11 = p005b.p096l.p097a.p113c.p131e.p136e.C2363nk.m3834X(r11)
            goto L_0x00b7
        L_0x00b6:
            r11 = r3
        L_0x00b7:
            if (r11 == 0) goto L_0x00be
            b.l.d.o.p r2 = r10.f11420f
            m10515d(r10, r2, r11, r1, r1)
        L_0x00be:
            b.l.d.o.e0.x r11 = r10.f11425k
            b.l.d.o.e0.r r11 = r11.f7184a
            java.util.Objects.requireNonNull(r11)
            b.l.d.d r11 = r10.f11415a
            r11.mo15344a()
            android.content.Context r11 = r11.f7042a
            java.lang.String r2 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r2, r1)
            java.lang.String r2 = "firebaseAppName"
            java.lang.String r4 = ""
            java.lang.String r2 = r11.getString(r2, r4)
            b.l.d.d r4 = r10.f11415a
            r4.mo15344a()
            java.lang.String r4 = r4.f7043b
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00e9
            goto L_0x041d
        L_0x00e9:
            java.lang.String r2 = "verifyAssertionRequest"
            boolean r2 = r11.contains(r2)
            r4 = -1
            r5 = 0
            if (r2 == 0) goto L_0x03c1
            java.lang.String r2 = "verifyAssertionRequest"
            java.lang.String r7 = ""
            java.lang.String r2 = r11.getString(r2, r7)
            android.os.Parcelable$Creator<b.l.a.c.e.e.nl> r7 = p005b.p096l.p097a.p113c.p131e.p136e.C2364nl.CREATOR
            if (r2 != 0) goto L_0x0102
            r2 = r3
            goto L_0x0108
        L_0x0102:
            r8 = 10
            byte[] r2 = android.util.Base64.decode(r2, r8)
        L_0x0108:
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r7, r8)
            android.os.Parcel r8 = android.os.Parcel.obtain()
            int r9 = r2.length
            r8.unmarshall(r2, r1, r9)
            r8.setDataPosition(r1)
            java.lang.Object r2 = r7.createFromParcel(r8)
            b.l.a.c.b.m.v.c r2 = (p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1950c) r2
            r8.recycle()
            b.l.a.c.e.e.nl r2 = (p005b.p096l.p097a.p113c.p131e.p136e.C2364nl) r2
            java.lang.String r7 = "operation"
            java.lang.String r8 = ""
            java.lang.String r7 = r11.getString(r7, r8)
            java.lang.String r8 = "tenantId"
            java.lang.String r3 = r11.getString(r8, r3)
            java.lang.String r8 = "firebaseUserUid"
            java.lang.String r9 = ""
            java.lang.String r8 = r11.getString(r8, r9)
            java.lang.String r9 = "timestamp"
            r11.getLong(r9, r5)
            if (r3 == 0) goto L_0x014f
            p005b.p006a.p007a.p024o.C0823f.m376j(r3)
            java.lang.Object r5 = r10.f11422h
            monitor-enter(r5)
            r10.f11423i = r3     // Catch:{ all -> 0x014c }
            monitor-exit(r5)     // Catch:{ all -> 0x014c }
            r2.f4121t = r3
            goto L_0x014f
        L_0x014c:
            r11 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x014c }
            throw r11
        L_0x014f:
            int r3 = r7.hashCode()
            r5 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r6 = 2
            if (r3 == r5) goto L_0x0177
            r5 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r3 == r5) goto L_0x016d
            r5 = 1450464913(0x56745691, float:6.7163159E13)
            if (r3 == r5) goto L_0x0164
            goto L_0x0181
        L_0x0164:
            java.lang.String r3 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0181
            goto L_0x0182
        L_0x016d:
            java.lang.String r1 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0181
            r1 = r0
            goto L_0x0182
        L_0x0177:
            java.lang.String r1 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0181
            r1 = r6
            goto L_0x0182
        L_0x0181:
            r1 = r4
        L_0x0182:
            r3 = 17072(0x42b0, float:2.3923E-41)
            if (r1 == 0) goto L_0x030c
            if (r1 == r0) goto L_0x027e
            if (r1 == r6) goto L_0x018c
            goto L_0x03ed
        L_0x018c:
            b.l.d.o.p r0 = r10.f11420f
            java.lang.String r0 = r0.mo15398Z()
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x03ed
            b.l.d.o.p r0 = r10.f11420f
            b.l.d.o.n0 r1 = p005b.p096l.p180d.p185o.C3919n0.m7290W(r2)
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r0, r2)
            b.l.d.o.c r1 = r1.mo15437V()
            boolean r2 = r1 instanceof p005b.p096l.p180d.p185o.C3861d
            if (r2 == 0) goto L_0x0229
            b.l.d.o.d r1 = (p005b.p096l.p180d.p185o.C3861d) r1
            java.lang.String r2 = r1.f7108h
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "password"
            if (r2 != 0) goto L_0x01b9
            r2 = r4
            goto L_0x01bb
        L_0x01b9:
            java.lang.String r2 = "emailLink"
        L_0x01bb:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x01ee
            b.l.a.c.e.e.xh r2 = r10.f11419e
            b.l.d.d r3 = r10.f11415a
            java.lang.String r4 = r1.f7107g
            java.lang.String r1 = r1.f7108h
            p005b.p006a.p007a.p024o.C0823f.m376j(r1)
            java.lang.String r5 = r0.mo15397Y()
            b.l.d.o.v0 r6 = new b.l.d.o.v0
            r6.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            b.l.a.c.e.e.ih r7 = new b.l.a.c.e.e.ih
            r7.<init>(r4, r1, r5)
            r7.mo12468d(r3)
            r7.mo12469e(r0)
            r7.mo12470f(r6)
            r7.mo12471g(r6)
            r2.mo12920b(r7)
            goto L_0x03ed
        L_0x01ee:
            java.lang.String r2 = r1.f7109i
            p005b.p006a.p007a.p024o.C0823f.m376j(r2)
            boolean r2 = r10.mo22156b(r2)
            if (r2 == 0) goto L_0x0207
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r3)
            b.l.d.i r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3151a(r0)
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2737O(r0)
            goto L_0x03ed
        L_0x0207:
            b.l.a.c.e.e.xh r2 = r10.f11419e
            b.l.d.d r3 = r10.f11415a
            b.l.d.o.v0 r4 = new b.l.d.o.v0
            r4.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            b.l.a.c.e.e.gh r5 = new b.l.a.c.e.e.gh
            r5.<init>(r1)
            r5.mo12468d(r3)
            r5.mo12469e(r0)
            r5.mo12470f(r4)
            r5.mo12471g(r4)
            r2.mo12920b(r5)
            goto L_0x03ed
        L_0x0229:
            boolean r2 = r1 instanceof p005b.p096l.p180d.p185o.C3938x
            if (r2 == 0) goto L_0x0258
            b.l.a.c.e.e.xh r2 = r10.f11419e
            b.l.d.d r3 = r10.f11415a
            b.l.d.o.x r1 = (p005b.p096l.p180d.p185o.C3938x) r1
            java.lang.String r4 = r10.f11423i
            b.l.d.o.v0 r5 = new b.l.d.o.v0
            r5.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            java.util.Map<java.lang.String, java.lang.Object> r6 = p005b.p096l.p097a.p113c.p131e.p136e.C2216hj.f3922a
            r6.clear()
            b.l.a.c.e.e.kh r6 = new b.l.a.c.e.e.kh
            r6.<init>(r1, r4)
            r6.mo12468d(r3)
            r6.mo12469e(r0)
            r6.mo12470f(r5)
            r6.mo12471g(r5)
            r2.mo12920b(r6)
            goto L_0x03ed
        L_0x0258:
            b.l.a.c.e.e.xh r2 = r10.f11419e
            b.l.d.d r3 = r10.f11415a
            java.lang.String r4 = r0.mo15397Y()
            b.l.d.o.v0 r5 = new b.l.d.o.v0
            r5.<init>(r10)
            java.util.Objects.requireNonNull(r2)
            b.l.a.c.e.e.eh r6 = new b.l.a.c.e.e.eh
            r6.<init>(r1, r4)
            r6.mo12468d(r3)
            r6.mo12469e(r0)
            r6.mo12470f(r5)
            r6.mo12471g(r5)
            r2.mo12920b(r6)
            goto L_0x03ed
        L_0x027e:
            b.l.d.o.p r1 = r10.f11420f
            java.lang.String r1 = r1.mo15398Z()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x03ed
            b.l.d.o.p r1 = r10.f11420f
            b.l.d.o.n0 r2 = p005b.p096l.p180d.p185o.C3919n0.m7290W(r2)
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)
            b.l.a.c.e.e.xh r4 = r10.f11419e
            b.l.d.d r5 = r10.f11415a
            b.l.d.o.c r2 = r2.mo15437V()
            b.l.d.o.v0 r6 = new b.l.d.o.v0
            r6.<init>(r10)
            java.util.Objects.requireNonNull(r4)
            java.util.Objects.requireNonNull(r5, r3)
            java.util.List r3 = r1.mo15400b0()
            if (r3 == 0) goto L_0x02ca
            r7 = r2
            b.l.d.o.n0 r7 = (p005b.p096l.p180d.p185o.C3919n0) r7
            java.lang.String r7 = r7.f7190g
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto L_0x02ba
            goto L_0x02ca
        L_0x02ba:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17015(0x4277, float:2.3843E-41)
            r0.<init>(r1)
            b.l.d.i r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3151a(r0)
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2737O(r0)
            goto L_0x03ed
        L_0x02ca:
            boolean r3 = r2 instanceof p005b.p096l.p180d.p185o.C3861d
            if (r3 == 0) goto L_0x02e5
            b.l.d.o.d r2 = (p005b.p096l.p180d.p185o.C3861d) r2
            java.lang.String r3 = r2.f7109i
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r0 = r0 ^ r3
            if (r0 != 0) goto L_0x02df
            b.l.a.c.e.e.wg r0 = new b.l.a.c.e.e.wg
            r0.<init>(r2)
            goto L_0x02fb
        L_0x02df:
            b.l.a.c.e.e.ch r0 = new b.l.a.c.e.e.ch
            r0.<init>(r2)
            goto L_0x02fb
        L_0x02e5:
            boolean r0 = r2 instanceof p005b.p096l.p180d.p185o.C3938x
            if (r0 == 0) goto L_0x02f6
            b.l.d.o.x r2 = (p005b.p096l.p180d.p185o.C3938x) r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2216hj.f3922a
            r0.clear()
            b.l.a.c.e.e.ah r0 = new b.l.a.c.e.e.ah
            r0.<init>(r2)
            goto L_0x02fb
        L_0x02f6:
            b.l.a.c.e.e.yg r0 = new b.l.a.c.e.e.yg
            r0.<init>(r2)
        L_0x02fb:
            r0.mo12468d(r5)
            r0.mo12469e(r1)
            r0.mo12470f(r6)
            r0.mo12471g(r6)
            r4.mo12920b(r0)
            goto L_0x03ed
        L_0x030c:
            b.l.d.o.n0 r1 = p005b.p096l.p180d.p185o.C3919n0.m7290W(r2)
            b.l.d.o.c r1 = r1.mo15437V()
            boolean r2 = r1 instanceof p005b.p096l.p180d.p185o.C3861d
            if (r2 == 0) goto L_0x037c
            b.l.d.o.d r1 = (p005b.p096l.p180d.p185o.C3861d) r1
            java.lang.String r2 = r1.f7109i
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x0348
            b.l.a.c.e.e.xh r0 = r10.f11419e
            b.l.d.d r2 = r10.f11415a
            java.lang.String r3 = r1.f7107g
            java.lang.String r1 = r1.f7108h
            p005b.p006a.p007a.p024o.C0823f.m376j(r1)
            java.lang.String r4 = r10.f11423i
            b.l.d.o.u0 r5 = new b.l.d.o.u0
            r5.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            b.l.a.c.e.e.rh r6 = new b.l.a.c.e.e.rh
            r6.<init>(r3, r1, r4)
            r6.mo12468d(r2)
            r6.mo12470f(r5)
            r0.mo12920b(r6)
            goto L_0x03ed
        L_0x0348:
            java.lang.String r0 = r1.f7109i
            p005b.p006a.p007a.p024o.C0823f.m376j(r0)
            boolean r0 = r10.mo22156b(r0)
            if (r0 == 0) goto L_0x0361
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r3)
            b.l.d.i r0 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3151a(r0)
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2737O(r0)
            goto L_0x03ed
        L_0x0361:
            b.l.a.c.e.e.xh r0 = r10.f11419e
            b.l.d.d r2 = r10.f11415a
            b.l.d.o.u0 r3 = new b.l.d.o.u0
            r3.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            b.l.a.c.e.e.th r4 = new b.l.a.c.e.e.th
            r4.<init>(r1)
            r4.mo12468d(r2)
            r4.mo12470f(r3)
            r0.mo12920b(r4)
            goto L_0x03ed
        L_0x037c:
            boolean r0 = r1 instanceof p005b.p096l.p180d.p185o.C3938x
            if (r0 == 0) goto L_0x03a4
            b.l.d.o.x r1 = (p005b.p096l.p180d.p185o.C3938x) r1
            b.l.a.c.e.e.xh r0 = r10.f11419e
            b.l.d.d r2 = r10.f11415a
            java.lang.String r3 = r10.f11423i
            b.l.d.o.u0 r4 = new b.l.d.o.u0
            r4.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            java.util.Map<java.lang.String, java.lang.Object> r5 = p005b.p096l.p097a.p113c.p131e.p136e.C2216hj.f3922a
            r5.clear()
            b.l.a.c.e.e.vh r5 = new b.l.a.c.e.e.vh
            r5.<init>(r1, r3)
            r5.mo12468d(r2)
            r5.mo12470f(r4)
            r0.mo12920b(r5)
            goto L_0x03ed
        L_0x03a4:
            b.l.a.c.e.e.xh r0 = r10.f11419e
            b.l.d.d r2 = r10.f11415a
            java.lang.String r3 = r10.f11423i
            b.l.d.o.u0 r4 = new b.l.d.o.u0
            r4.<init>(r10)
            java.util.Objects.requireNonNull(r0)
            b.l.a.c.e.e.ph r5 = new b.l.a.c.e.e.ph
            r5.<init>(r1, r3)
            r5.mo12468d(r2)
            r5.mo12470f(r4)
            r0.mo12920b(r5)
            goto L_0x03ed
        L_0x03c1:
            java.lang.String r0 = "recaptchaToken"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x03f1
            java.lang.String r0 = "recaptchaToken"
            java.lang.String r1 = ""
            java.lang.String r0 = r11.getString(r0, r1)
            java.lang.String r1 = "operation"
            java.lang.String r2 = ""
            java.lang.String r1 = r11.getString(r1, r2)
            java.lang.String r2 = "timestamp"
            r11.getLong(r2, r5)
            r1.hashCode()
            java.lang.String r2 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03ea
            goto L_0x03ed
        L_0x03ea:
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2740P(r0)
        L_0x03ed:
            p005b.p096l.p180d.p185o.p189e0.C3893r.m7283a(r11)
            goto L_0x041d
        L_0x03f1:
            java.lang.String r0 = "statusCode"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x041d
            java.lang.String r0 = "statusCode"
            r1 = 17062(0x42a6, float:2.3909E-41)
            int r0 = r11.getInt(r0, r1)
            java.lang.String r1 = "statusMessage"
            java.lang.String r2 = ""
            java.lang.String r1 = r11.getString(r1, r2)
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r2.<init>(r0, r1)
            java.lang.String r0 = "timestamp"
            r11.getLong(r0, r5)
            p005b.p096l.p180d.p185o.p189e0.C3893r.m7283a(r11)
            b.l.d.i r11 = p005b.p096l.p097a.p113c.p131e.p136e.C2090ci.m3151a(r2)
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2737O(r11)
        L_0x041d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(b.l.d.d):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:39|40|41|42|43|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0103 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10515d(com.google.firebase.auth.FirebaseAuth r15, p005b.p096l.p180d.p185o.C3922p r16, p005b.p096l.p097a.p113c.p131e.p136e.C2363nk r17, boolean r18, boolean r19) {
        /*
            r0 = r15
            r1 = r16
            r2 = r17
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r1, r3)
            java.util.Objects.requireNonNull(r2, r3)
            b.l.d.o.p r4 = r0.f11420f
            r6 = 1
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = r16.mo15398Z()
            b.l.d.o.p r7 = r0.f11420f
            java.lang.String r7 = r7.mo15398Z()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0024
            r4 = r6
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            if (r4 != 0) goto L_0x002b
            if (r19 != 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            b.l.d.o.p r7 = r0.f11420f
            if (r7 != 0) goto L_0x0032
            r4 = r6
            r7 = r4
            goto L_0x0047
        L_0x0032:
            b.l.a.c.e.e.nk r7 = r7.mo15404f0()
            java.lang.String r7 = r7.f4104h
            java.lang.String r8 = r2.f4104h
            boolean r7 = r7.equals(r8)
            r7 = r7 ^ r6
            if (r4 == 0) goto L_0x0045
            if (r7 != 0) goto L_0x0045
            r7 = 0
            goto L_0x0046
        L_0x0045:
            r7 = r6
        L_0x0046:
            r4 = r4 ^ r6
        L_0x0047:
            b.l.d.o.p r8 = r0.f11420f
            if (r8 != 0) goto L_0x004e
            r0.f11420f = r1
            goto L_0x006d
        L_0x004e:
            java.util.List r9 = r16.mo15396X()
            r8.mo15401c0(r9)
            boolean r8 = r16.mo15399a0()
            if (r8 != 0) goto L_0x0060
            b.l.d.o.p r8 = r0.f11420f
            r8.mo15402d0()
        L_0x0060:
            b.l.d.o.e0.d r8 = r16.mo15395W()
            java.util.List r8 = r8.mo15376a()
            b.l.d.o.p r9 = r0.f11420f
            r9.mo15408j0(r8)
        L_0x006d:
            if (r18 == 0) goto L_0x0189
            b.l.d.o.e0.s r8 = r0.f11424j
            b.l.d.o.p r9 = r0.f11420f
            java.util.Objects.requireNonNull(r8)
            java.util.Objects.requireNonNull(r9, r3)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.Class<b.l.d.o.e0.j0> r11 = p005b.p096l.p180d.p185o.p189e0.C3883j0.class
            java.lang.Class r12 = r9.getClass()
            boolean r11 = r11.isAssignableFrom(r12)
            if (r11 == 0) goto L_0x0170
            b.l.d.o.e0.j0 r9 = (p005b.p096l.p180d.p185o.p189e0.C3883j0) r9
            java.lang.String r11 = "cachedTokenState"
            java.lang.String r12 = r9.mo15406h0()     // Catch:{ Exception -> 0x0159 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = "applicationName"
            java.lang.String r12 = r9.f7147i     // Catch:{ Exception -> 0x0159 }
            b.l.d.d r12 = p005b.p096l.p180d.C3825d.m7209d(r12)     // Catch:{ Exception -> 0x0159 }
            r12.mo15344a()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r12 = r12.f7043b     // Catch:{ Exception -> 0x0159 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = "type"
            java.lang.String r12 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0159 }
            java.util.List<b.l.d.o.e0.g0> r11 = r9.f7149k     // Catch:{ Exception -> 0x0159 }
            if (r11 == 0) goto L_0x00d3
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ Exception -> 0x0159 }
            r11.<init>()     // Catch:{ Exception -> 0x0159 }
            java.util.List<b.l.d.o.e0.g0> r12 = r9.f7149k     // Catch:{ Exception -> 0x0159 }
            r13 = 0
        L_0x00b8:
            int r14 = r12.size()     // Catch:{ Exception -> 0x0159 }
            if (r13 >= r14) goto L_0x00ce
            java.lang.Object r14 = r12.get(r13)     // Catch:{ Exception -> 0x0159 }
            b.l.d.o.e0.g0 r14 = (p005b.p096l.p180d.p185o.p189e0.C3877g0) r14     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = r14.mo15387V()     // Catch:{ Exception -> 0x0159 }
            r11.put(r14)     // Catch:{ Exception -> 0x0159 }
            int r13 = r13 + 1
            goto L_0x00b8
        L_0x00ce:
            java.lang.String r12 = "userInfos"
            r10.put(r12, r11)     // Catch:{ Exception -> 0x0159 }
        L_0x00d3:
            java.lang.String r11 = "anonymous"
            boolean r12 = r9.mo15399a0()     // Catch:{ Exception -> 0x0159 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r11 = "version"
            java.lang.String r12 = "2"
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0159 }
            b.l.d.o.e0.l0 r11 = r9.f7153o     // Catch:{ Exception -> 0x0159 }
            if (r11 == 0) goto L_0x0107
            java.lang.String r12 = "userMetadata"
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0159 }
            r13.<init>()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r14 = "lastSignInTimestamp"
            r19 = r7
            long r6 = r11.f7165g     // Catch:{ JSONException -> 0x0103 }
            r13.put(r14, r6)     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r6 = "creationTimestamp"
            r14 = r6
            long r5 = r11.f7166h     // Catch:{ JSONException -> 0x0103 }
            r11 = r14
            r13.put(r11, r5)     // Catch:{ JSONException -> 0x0103 }
            goto L_0x0103
        L_0x0101:
            r19 = r7
        L_0x0103:
            r10.put(r12, r13)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0109
        L_0x0107:
            r19 = r7
        L_0x0109:
            b.l.d.o.e0.p r5 = r9.f7156r     // Catch:{ Exception -> 0x0159 }
            if (r5 == 0) goto L_0x0128
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0159 }
            r6.<init>()     // Catch:{ Exception -> 0x0159 }
            java.util.List<b.l.d.o.y> r5 = r5.f7170g     // Catch:{ Exception -> 0x0159 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0159 }
        L_0x0118:
            boolean r9 = r5.hasNext()     // Catch:{ Exception -> 0x0159 }
            if (r9 == 0) goto L_0x012d
            java.lang.Object r9 = r5.next()     // Catch:{ Exception -> 0x0159 }
            b.l.d.o.y r9 = (p005b.p096l.p180d.p185o.C3940y) r9     // Catch:{ Exception -> 0x0159 }
            r6.add(r9)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0118
        L_0x0128:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0159 }
            r6.<init>()     // Catch:{ Exception -> 0x0159 }
        L_0x012d:
            boolean r5 = r6.isEmpty()     // Catch:{ Exception -> 0x0159 }
            if (r5 != 0) goto L_0x0154
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0159 }
            r5.<init>()     // Catch:{ Exception -> 0x0159 }
            r9 = 0
        L_0x0139:
            int r11 = r6.size()     // Catch:{ Exception -> 0x0159 }
            if (r9 >= r11) goto L_0x014f
            java.lang.Object r11 = r6.get(r9)     // Catch:{ Exception -> 0x0159 }
            b.l.d.o.t r11 = (p005b.p096l.p180d.p185o.C3930t) r11     // Catch:{ Exception -> 0x0159 }
            org.json.JSONObject r11 = r11.mo15449V()     // Catch:{ Exception -> 0x0159 }
            r5.put(r11)     // Catch:{ Exception -> 0x0159 }
            int r9 = r9 + 1
            goto L_0x0139
        L_0x014f:
            java.lang.String r6 = "userMultiFactorInfo"
            r10.put(r6, r5)     // Catch:{ Exception -> 0x0159 }
        L_0x0154:
            java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x0159 }
            goto L_0x0173
        L_0x0159:
            r0 = move-exception
            b.l.a.c.b.n.a r1 = r8.f7176d
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f3501a
            java.lang.String r4 = "Failed to turn object into JSON"
            java.lang.String r1 = r1.mo12284c(r4, r2)
            android.util.Log.wtf(r3, r1, r0)
            b.l.a.c.e.e.ac r1 = new b.l.a.c.e.e.ac
            r1.<init>(r0)
            throw r1
        L_0x0170:
            r19 = r7
            r5 = 0
        L_0x0173:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x018b
            android.content.SharedPreferences r6 = r8.f7175c
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r8 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r5 = r6.putString(r8, r5)
            r5.apply()
            goto L_0x018b
        L_0x0189:
            r19 = r7
        L_0x018b:
            if (r19 == 0) goto L_0x0199
            b.l.d.o.p r5 = r0.f11420f
            if (r5 == 0) goto L_0x0194
            r5.mo15405g0(r2)
        L_0x0194:
            b.l.d.o.p r5 = r0.f11420f
            m10516e(r15, r5)
        L_0x0199:
            if (r4 == 0) goto L_0x01a0
            b.l.d.o.p r4 = r0.f11420f
            m10517f(r15, r4)
        L_0x01a0:
            if (r18 == 0) goto L_0x01c8
            b.l.d.o.e0.s r4 = r0.f11424j
            java.util.Objects.requireNonNull(r4)
            android.content.SharedPreferences r4 = r4.f7175c
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = r16.mo15398Z()
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            java.lang.String r2 = r17.mo12844W()
            android.content.SharedPreferences$Editor r1 = r4.putString(r1, r2)
            r1.apply()
        L_0x01c8:
            b.l.d.o.p r1 = r0.f11420f
            if (r1 == 0) goto L_0x020c
            b.l.d.o.e0.u r2 = r0.f11426l
            if (r2 != 0) goto L_0x01dc
            b.l.d.d r2 = r0.f11415a
            java.util.Objects.requireNonNull(r2, r3)
            b.l.d.o.e0.u r3 = new b.l.d.o.e0.u
            r3.<init>(r2)
            r0.f11426l = r3
        L_0x01dc:
            b.l.d.o.e0.u r0 = r0.f11426l
            b.l.a.c.e.e.nk r1 = r1.mo15404f0()
            java.util.Objects.requireNonNull(r0)
            if (r1 != 0) goto L_0x01e8
            goto L_0x020c
        L_0x01e8:
            java.lang.Long r2 = r1.f4105i
            r3 = 0
            if (r2 != 0) goto L_0x01f0
            r5 = r3
            goto L_0x01f4
        L_0x01f0:
            long r5 = r2.longValue()
        L_0x01f4:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x01fa
            r5 = 3600(0xe10, double:1.7786E-320)
        L_0x01fa:
            java.lang.Long r1 = r1.f4107k
            long r1 = r1.longValue()
            b.l.d.o.e0.k r0 = r0.f7178a
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            long r5 = r5 + r1
            r0.f7159b = r5
            r1 = -1
            r0.f7160c = r1
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.m10515d(com.google.firebase.auth.FirebaseAuth, b.l.d.o.p, b.l.a.c.e.e.nk, boolean, boolean):void");
    }

    /* renamed from: e */
    public static void m10516e(@RecentlyNonNull FirebaseAuth firebaseAuth, @Nullable C3922p pVar) {
        String str;
        if (pVar != null) {
            String Z = pVar.mo15398Z();
            StringBuilder sb = new StringBuilder(String.valueOf(Z).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(Z);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        C4321b bVar = new C4321b(pVar != null ? pVar.mo15407i0() : null);
        firebaseAuth.f11427m.f7181g.post(new C3927r0(firebaseAuth, bVar));
    }

    /* renamed from: f */
    public static void m10517f(@RecentlyNonNull FirebaseAuth firebaseAuth, @Nullable C3922p pVar) {
        String str;
        if (pVar != null) {
            String Z = pVar.mo15398Z();
            StringBuilder sb = new StringBuilder(String.valueOf(Z).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(Z);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        C3897v vVar = firebaseAuth.f11427m;
        vVar.f7181g.post(new C3929s0(firebaseAuth));
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        C3825d c = C3825d.m7208c();
        c.mo15344a();
        return (FirebaseAuth) c.f7045d.mo15457a(FirebaseAuth.class);
    }

    /* renamed from: a */
    public void mo22155a() {
        Objects.requireNonNull(this.f11424j, "null reference");
        C3922p pVar = this.f11420f;
        if (pVar != null) {
            C3894s sVar = this.f11424j;
            sVar.f7175c.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{pVar.mo15398Z()})).apply();
            this.f11420f = null;
        }
        this.f11424j.f7175c.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        m10516e(this, (C3922p) null);
        m10517f(this, (C3922p) null);
        C3896u uVar = this.f11426l;
        if (uVar != null) {
            C3884k kVar = uVar.f7178a;
            kVar.f7163f.removeCallbacks(kVar.f7164g);
        }
    }

    /* renamed from: b */
    public final boolean mo22156b(String str) {
        C3857b bVar;
        int i = C3857b.f7099c;
        C0823f.m376j(str);
        try {
            bVar = new C3857b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        return bVar != null && !TextUtils.equals(this.f11423i, bVar.f7101b);
    }

    /* renamed from: c */
    public final void mo22157c(C3922p pVar, C2363nk nkVar) {
        m10515d(this, pVar, nkVar, true, false);
    }

    @RecentlyNonNull
    /* renamed from: g */
    public final C3428h<C3924q> mo22158g(@Nullable C3922p pVar, boolean z) {
        if (pVar == null) {
            return C1960d.m2737O(C2090ci.m3151a(new Status(17495)));
        }
        C2363nk f0 = pVar.mo15404f0();
        if (f0.mo12843V() && !z) {
            return C1960d.m2740P(C3889n.m7278a(f0.f4104h));
        }
        C2600xh xhVar = this.f11419e;
        C3825d dVar = this.f11415a;
        String str = f0.f4103g;
        C3931t0 t0Var = new C3931t0(this);
        Objects.requireNonNull(xhVar);
        C2527ug ugVar = new C2527ug(str);
        ugVar.mo12468d(dVar);
        ugVar.mo12469e(pVar);
        ugVar.mo12470f(t0Var);
        ugVar.mo12471g(t0Var);
        return xhVar.mo12921c().f4018a.mo12036e(0, ugVar.mo12392b());
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@RecentlyNonNull C3825d dVar) {
        dVar.mo15344a();
        return (FirebaseAuth) dVar.f7045d.mo15457a(FirebaseAuth.class);
    }
}
