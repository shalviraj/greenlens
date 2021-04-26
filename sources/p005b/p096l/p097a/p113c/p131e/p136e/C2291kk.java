package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import p005b.p096l.p180d.p185o.C3854a;

/* renamed from: b.l.a.c.e.e.kk */
public final class C2291kk implements C2553vi {

    /* renamed from: g */
    public final String f4022g;

    /* renamed from: h */
    public String f4023h;

    /* renamed from: i */
    public String f4024i;

    /* renamed from: j */
    public String f4025j;

    /* renamed from: k */
    public C3854a f4026k;
    @Nullable

    /* renamed from: l */
    public String f4027l;

    public C2291kk(int i) {
        this.f4022g = i != 1 ? i != 4 ? i != 6 ? i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public C2291kk(C3854a aVar, @Nullable String str, @Nullable String str2) {
        this.f4022g = "VERIFY_AND_CHANGE_EMAIL";
        this.f4026k = aVar;
        this.f4023h = null;
        this.f4024i = str;
        this.f4025j = str2;
        this.f4027l = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12411a() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.f4022g
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1452371317: goto L_0x0031;
                case -1341836234: goto L_0x0027;
                case -1099157829: goto L_0x001d;
                case 870738373: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x003b
        L_0x0013:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r5
            goto L_0x003c
        L_0x001d:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r4
            goto L_0x003c
        L_0x0027:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r6
            goto L_0x003c
        L_0x0031:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r1 = -1
        L_0x003c:
            if (r1 == 0) goto L_0x004b
            if (r1 == r6) goto L_0x0049
            if (r1 == r5) goto L_0x0047
            if (r1 == r4) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            r3 = 7
            goto L_0x004c
        L_0x0047:
            r3 = 6
            goto L_0x004c
        L_0x0049:
            r3 = 4
            goto L_0x004c
        L_0x004b:
            r3 = r6
        L_0x004c:
            java.lang.String r1 = "requestType"
            r0.put(r1, r3)
            java.lang.String r1 = r7.f4023h
            if (r1 == 0) goto L_0x005a
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x005a:
            java.lang.String r1 = r7.f4024i
            if (r1 == 0) goto L_0x0063
            java.lang.String r2 = "newEmail"
            r0.put(r2, r1)
        L_0x0063:
            java.lang.String r1 = r7.f4025j
            if (r1 == 0) goto L_0x006c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x006c:
            b.l.d.o.a r1 = r7.f4026k
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r1.f7091k
            java.lang.String r2 = "androidInstallApp"
            r0.put(r2, r1)
            b.l.d.o.a r1 = r7.f4026k
            boolean r1 = r1.f7093m
            java.lang.String r2 = "canHandleCodeInApp"
            r0.put(r2, r1)
            b.l.d.o.a r1 = r7.f4026k
            java.lang.String r1 = r1.f7087g
            if (r1 == 0) goto L_0x008b
            java.lang.String r2 = "continueUrl"
            r0.put(r2, r1)
        L_0x008b:
            b.l.d.o.a r1 = r7.f4026k
            java.lang.String r1 = r1.f7088h
            if (r1 == 0) goto L_0x0096
            java.lang.String r2 = "iosBundleId"
            r0.put(r2, r1)
        L_0x0096:
            b.l.d.o.a r1 = r7.f4026k
            java.lang.String r1 = r1.f7089i
            if (r1 == 0) goto L_0x00a1
            java.lang.String r2 = "iosAppStoreId"
            r0.put(r2, r1)
        L_0x00a1:
            b.l.d.o.a r1 = r7.f4026k
            java.lang.String r1 = r1.f7090j
            if (r1 == 0) goto L_0x00ac
            java.lang.String r2 = "androidPackageName"
            r0.put(r2, r1)
        L_0x00ac:
            b.l.d.o.a r1 = r7.f4026k
            java.lang.String r1 = r1.f7092l
            if (r1 == 0) goto L_0x00b7
            java.lang.String r2 = "androidMinimumVersion"
            r0.put(r2, r1)
        L_0x00b7:
            b.l.d.o.a r1 = r7.f4026k
            java.lang.String r1 = r1.f7096p
            if (r1 == 0) goto L_0x00c2
            java.lang.String r2 = "dynamicLinkDomain"
            r0.put(r2, r1)
        L_0x00c2:
            java.lang.String r1 = r7.f4027l
            if (r1 == 0) goto L_0x00cb
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00cb:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p136e.C2291kk.mo12411a():java.lang.String");
    }
}
