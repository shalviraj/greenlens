package p005b.p040g.p041a.p046h;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.security.SecureRandom;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p005b.p040g.p041a.C0850a;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.p042e.C0854a;
import p005b.p040g.p041a.p042e.C0855b;
import p005b.p040g.p041a.p042e.C0856c;
import p005b.p040g.p041a.p044f.C0869a;
import p005b.p040g.p041a.p045g.C0873d;
import p005b.p040g.p041a.p045g.C0874e;
import p005b.p040g.p041a.p047i.p048b.C0908a;
import p005b.p040g.p041a.p047i.p048b.C0916i;
import p005b.p040g.p041a.p047i.p048b.C0917j;
import p005b.p040g.p041a.p049j.C0921a;
import p005b.p096l.p224e.C4465k;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.C5252r;

/* renamed from: b.g.a.h.n */
public class C0893n extends C0900p {

    /* renamed from: k */
    public static final String f779k = "n";

    /* renamed from: a */
    public final C0850a f780a;

    /* renamed from: b */
    public final C0882d f781b;

    /* renamed from: c */
    public final Map<String, String> f782c;

    /* renamed from: d */
    public final C0855b f783d;

    /* renamed from: e */
    public boolean f784e;

    /* renamed from: f */
    public boolean f785f = true;

    /* renamed from: g */
    public int f786g;

    /* renamed from: h */
    public C0898o f787h;

    /* renamed from: i */
    public C0887i f788i;

    /* renamed from: j */
    public Integer f789j;

    /* renamed from: b.g.a.h.n$a */
    public class C0894a implements C0869a<Void, C0904t> {

        /* renamed from: a */
        public final /* synthetic */ C0921a f790a;

        /* renamed from: b */
        public final /* synthetic */ Map f791b;

        public C0894a(C0921a aVar, Map map) {
            this.f790a = aVar;
            this.f791b = map;
        }

        /* renamed from: a */
        public void mo10712a(Object obj) {
            Void voidR = (Void) obj;
            if (!C0893n.this.mo10744f()) {
                C0893n.this.f781b.mo10730a(this.f790a);
            } else {
                C0893n.this.f787h.mo10745a((String) this.f791b.get("code"), new C0892m(this, C0893n.this.f781b));
            }
        }

        /* renamed from: b */
        public void mo10713b(C0851b bVar) {
            C0893n.this.f781b.mo10731b(new C0856c("Could not verify the ID token", (C0851b) (C0904t) bVar));
        }
    }

    /* renamed from: b.g.a.h.n$b */
    public class C0895b extends C0903s {

        /* renamed from: b */
        public final /* synthetic */ C0921a f793b;

        /* renamed from: b.g.a.h.n$b$a */
        public class C0896a implements C0869a<Void, C0904t> {

            /* renamed from: a */
            public final /* synthetic */ C0921a f795a;

            public C0896a(C0921a aVar) {
                this.f795a = aVar;
            }

            /* renamed from: a */
            public void mo10712a(Object obj) {
                Void voidR = (Void) obj;
                C0893n.this.f781b.mo10730a(C0893n.m616e(C0895b.this.f793b, this.f795a));
            }

            /* renamed from: b */
            public void mo10713b(C0851b bVar) {
                C0893n.this.f781b.mo10731b(new C0856c("Could not verify the ID token", (C0851b) (C0904t) bVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0895b(C0882d dVar, C0921a aVar) {
            super(dVar);
            this.f793b = aVar;
        }

        /* renamed from: a */
        public void mo10730a(@NonNull C0921a aVar) {
            C0893n.this.mo10743c(aVar.f826c, new C0896a(aVar));
        }
    }

    /* renamed from: b.g.a.h.n$c */
    public class C0897c implements C0869a<C0902r, C0904t> {

        /* renamed from: a */
        public final /* synthetic */ C0869a f797a;

        /* renamed from: b */
        public final /* synthetic */ C0874e f798b;

        public C0897c(C0869a aVar, C0874e eVar) {
            this.f797a = aVar;
            this.f798b = eVar;
        }

        /* renamed from: a */
        public void mo10712a(Object obj) {
            C0893n nVar = C0893n.this;
            C0850a aVar = nVar.f783d.f711a;
            C0889j jVar = new C0889j(aVar.f708b.f10428i, aVar.f707a, (C0902r) obj);
            String str = nVar.f782c.get("max_age");
            if (!TextUtils.isEmpty(str)) {
                jVar.f770e = Integer.valueOf(str);
            }
            C0893n nVar2 = C0893n.this;
            jVar.f771f = nVar2.f789j;
            jVar.f769d = nVar2.f782c.get("nonce");
            Objects.requireNonNull(C0893n.this);
            jVar.f772g = new Date(System.currentTimeMillis());
            try {
                new C0890k().mo10740a(this.f798b, jVar);
                Objects.requireNonNull(C0893n.this.f780a);
                this.f797a.mo10712a(null);
            } catch (C0904t e) {
                this.f797a.mo10713b(e);
            }
        }

        /* renamed from: b */
        public void mo10713b(C0851b bVar) {
            this.f797a.mo10713b((C0904t) bVar);
        }
    }

    public C0893n(@NonNull C0850a aVar, @NonNull C0882d dVar, @NonNull Map<String, String> map) {
        this.f780a = aVar;
        this.f781b = dVar;
        this.f782c = new HashMap(map);
        this.f783d = new C0855b(aVar);
    }

    @VisibleForTesting
    /* renamed from: d */
    public static String m615d(@Nullable String str) {
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    @VisibleForTesting
    /* renamed from: e */
    public static C0921a m616e(C0921a aVar, C0921a aVar2) {
        String str = TextUtils.isEmpty(aVar.f826c) ? aVar2.f826c : aVar.f826c;
        String str2 = TextUtils.isEmpty(aVar2.f824a) ? aVar.f824a : aVar2.f824a;
        String str3 = TextUtils.isEmpty(aVar2.f825b) ? aVar.f825b : aVar2.f825b;
        String str4 = aVar2.f827d;
        Date date = aVar2.f829f;
        if (date == null) {
            date = aVar.f829f;
        }
        return new C0921a(str, str2, str3, str4, date, TextUtils.isEmpty(aVar2.f828e) ? aVar.f828e : aVar2.f828e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10741a(p005b.p040g.p041a.p046h.C0883e r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "state"
            boolean r2 = r19.mo10733b()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0016
            r2 = r19
            int r5 = r2.f751a
            r6 = -1
            if (r5 != r6) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r5 = r4
            goto L_0x0019
        L_0x0016:
            r2 = r19
        L_0x0018:
            r5 = r3
        L_0x0019:
            if (r5 == 0) goto L_0x001d
            r5 = r3
            goto L_0x0025
        L_0x001d:
            java.lang.String r5 = p005b.p040g.p041a.p046h.C0883e.f750c
            java.lang.String r6 = "Result is invalid: Either the received Intent is null or the Request Code doesn't match the expected one."
            android.util.Log.d(r5, r6)
            r5 = r4
        L_0x0025:
            if (r5 != 0) goto L_0x002d
            java.lang.String r0 = f779k
            java.lang.String r2 = "The Authorize Result is invalid."
            goto L_0x00a0
        L_0x002d:
            boolean r5 = r19.mo10733b()
            if (r5 == 0) goto L_0x0042
            b.g.a.e.c r0 = new b.g.a.e.c
            java.lang.String r2 = "a0.authentication_canceled"
            java.lang.String r4 = "The user closed the browser app and the authentication was canceled."
            r0.<init>((java.lang.String) r2, (java.lang.String) r4)
            b.g.a.h.d r2 = r1.f781b
            r2.mo10731b(r0)
            return r3
        L_0x0042:
            android.net.Uri r2 = r19.mo10732a()
            java.lang.String r5 = p005b.p040g.p041a.p046h.C0884f.f753a
            r5 = 2
            if (r2 != 0) goto L_0x0050
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x0096
        L_0x0050:
            java.lang.String r6 = r2.getQuery()
            if (r6 == 0) goto L_0x005b
            java.lang.String r2 = r2.getQuery()
            goto L_0x005f
        L_0x005b:
            java.lang.String r2 = r2.getFragment()
        L_0x005f:
            if (r2 != 0) goto L_0x0067
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L_0x0096
        L_0x0067:
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x0074
            java.lang.String r6 = "&"
            java.lang.String[] r2 = r2.split(r6)
            goto L_0x0076
        L_0x0074:
            java.lang.String[] r2 = new java.lang.String[r4]
        L_0x0076:
            java.util.HashMap r6 = new java.util.HashMap
            int r7 = r2.length
            r6.<init>(r7)
            int r7 = r2.length
            r8 = r4
        L_0x007e:
            if (r8 >= r7) goto L_0x0095
            r9 = r2[r8]
            java.lang.String r10 = "="
            java.lang.String[] r9 = r9.split(r10)
            int r10 = r9.length
            if (r10 != r5) goto L_0x0092
            r10 = r9[r4]
            r9 = r9[r3]
            r6.put(r10, r9)
        L_0x0092:
            int r8 = r8 + 1
            goto L_0x007e
        L_0x0095:
            r2 = r6
        L_0x0096:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x00a4
            java.lang.String r0 = f779k
            java.lang.String r2 = "The response didn't contain any of these values: code, state, id_token, access_token, token_type, refresh_token"
        L_0x00a0:
            android.util.Log.w(r0, r2)
            return r4
        L_0x00a4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "The parsed CallbackURI contains the following values: "
            r6.append(r7)
            r6.append(r2)
            r6.toString()
            b.g.a.a r6 = r1.f780a
            java.util.Objects.requireNonNull(r6)
            java.lang.String r6 = "error"
            java.lang.Object r6 = r2.get(r6)     // Catch:{ c -> 0x0198 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ c -> 0x0198 }
            java.lang.String r7 = "error_description"
            java.lang.Object r7 = r2.get(r7)     // Catch:{ c -> 0x0198 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ c -> 0x0198 }
            r1.mo10742b(r6, r7)     // Catch:{ c -> 0x0198 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.f782c     // Catch:{ c -> 0x0198 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ c -> 0x0198 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ c -> 0x0198 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ c -> 0x0198 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ c -> 0x0198 }
            boolean r7 = r6.equals(r0)     // Catch:{ c -> 0x0198 }
            if (r7 == 0) goto L_0x017d
            java.lang.String r0 = "expires_in"
            boolean r5 = r2.containsKey(r0)
            r6 = 0
            if (r5 != 0) goto L_0x00ec
            r16 = r6
            goto L_0x0109
        L_0x00ec:
            java.util.Date r5 = new java.util.Date
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r9 = r0.longValue()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            long r9 = r9 + r7
            r5.<init>(r9)
            r16 = r5
        L_0x0109:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f782c
            java.lang.String r5 = "response_type"
            boolean r0 = r0.containsKey(r5)
            java.lang.String r7 = "id_token"
            if (r0 == 0) goto L_0x0124
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f782c
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0124
            r4 = r3
        L_0x0124:
            b.g.a.j.a r0 = new b.g.a.j.a
            if (r4 == 0) goto L_0x012f
            java.lang.Object r5 = r2.get(r7)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
        L_0x012f:
            java.lang.String r5 = "access_token"
            java.lang.Object r5 = r2.get(r5)
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r5 = "token_type"
            java.lang.Object r5 = r2.get(r5)
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            java.lang.String r5 = "scope"
            java.lang.Object r5 = r2.get(r5)
            r17 = r5
            java.lang.String r17 = (java.lang.String) r17
            r11 = r0
            r12 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x015c
            b.g.a.h.n$a r4 = new b.g.a.h.n$a
            r4.<init>(r0, r2)
            r1.mo10743c(r6, r4)
            return r3
        L_0x015c:
            boolean r4 = r18.mo10744f()
            if (r4 != 0) goto L_0x0168
            b.g.a.h.d r2 = r1.f781b
            r2.mo10730a(r0)
            return r3
        L_0x0168:
            b.g.a.h.o r4 = r1.f787h
            java.lang.String r5 = "code"
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            b.g.a.h.n$b r5 = new b.g.a.h.n$b
            b.g.a.h.d r6 = r1.f781b
            r5.<init>(r6, r0)
            r4.mo10745a(r2, r5)
            return r3
        L_0x017d:
            java.lang.String r2 = f779k     // Catch:{ c -> 0x0198 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ c -> 0x0198 }
            r5[r4] = r0     // Catch:{ c -> 0x0198 }
            r5[r3] = r6     // Catch:{ c -> 0x0198 }
            java.lang.String r0 = "Received state doesn't match. Received %s but expected %s"
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ c -> 0x0198 }
            android.util.Log.e(r2, r0)     // Catch:{ c -> 0x0198 }
            b.g.a.e.c r0 = new b.g.a.e.c     // Catch:{ c -> 0x0198 }
            java.lang.String r2 = "access_denied"
            java.lang.String r4 = "The received state is invalid. Try again."
            r0.<init>((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ c -> 0x0198 }
            throw r0     // Catch:{ c -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            b.g.a.h.d r2 = r1.f781b
            r2.mo10731b(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p040g.p041a.p046h.C0893n.mo10741a(b.g.a.h.e):boolean");
    }

    /* renamed from: b */
    public final void mo10742b(String str, String str2) {
        if (str != null) {
            Log.e(f779k, "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard.");
            if ("access_denied".equalsIgnoreCase(str)) {
                throw new C0856c("access_denied", "Permissions were not granted. Try again.");
            } else if ("unauthorized".equalsIgnoreCase(str)) {
                throw new C0856c("unauthorized", str2);
            } else if ("login_required".equals(str)) {
                throw new C0856c(str, str2);
            } else {
                throw new C0856c("a0.invalid_configuration", "The application isn't configured properly for the social connection. Please check your Auth0's application configuration");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [b.g.a.h.q, b.g.a.f.a] */
    /* renamed from: c */
    public final void mo10743c(String str, C0869a<Void, C0904t> aVar) {
        C0904t tVar;
        if (TextUtils.isEmpty(str)) {
            tVar = new C0904t("ID token is required but missing");
        } else {
            try {
                C0874e eVar = new C0874e(str);
                C0897c cVar = new C0897c(aVar, eVar);
                String str2 = eVar.f740h.get("alg");
                if (this.f780a.f710d || "RS256".equals(str2)) {
                    C0855b bVar = this.f783d;
                    C5245o.C5247b k = C5245o.m9723l(bVar.f711a.f708b.f10428i).mo17170k();
                    k.mo17176b(".well-known");
                    k.mo17176b("jwks.json");
                    C5245o c = k.mo17177c();
                    C0854a aVar2 = new C0854a(bVar);
                    C0916i iVar = bVar.f714d;
                    C5252r rVar = bVar.f712b;
                    C4465k kVar = bVar.f713c;
                    C0908a<C0856c> aVar3 = bVar.f715e;
                    Objects.requireNonNull(iVar);
                    C0917j jVar = new C0917j(c, rVar, kVar, "GET", aVar2, aVar3);
                    iVar.mo10752b(jVar);
                    jVar.mo10750c(new C0901q(eVar.f740h.get("kid"), cVar));
                    return;
                }
                cVar.mo10712a(new C0880b());
                return;
            } catch (C0873d unused) {
                tVar = new C0904t("ID token could not be decoded");
            }
        }
        aVar.mo10713b(tVar);
    }

    /* renamed from: f */
    public final boolean mo10744f() {
        boolean z;
        if (this.f782c.containsKey("response_type") && this.f782c.get("response_type").contains("code")) {
            String str = C0898o.f800e;
            C0879a aVar = new C0879a();
            try {
                aVar.mo10728b(aVar.mo10727a("test"));
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
