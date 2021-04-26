package p421m;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6768j;
import p298d.p334t.C6790h;
import p298d.p334t.C6799q;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C8022y;
import p421m.C8025z;
import p421m.p422m0.C7867c;
import p421m.p422m0.p427h.C7908f;

/* renamed from: m.e0 */
public final class C7839e0 {

    /* renamed from: a */
    public C7837e f15527a;

    /* renamed from: b */
    public final C8025z f15528b;

    /* renamed from: c */
    public final String f15529c;

    /* renamed from: d */
    public final C8022y f15530d;

    /* renamed from: e */
    public final C7844g0 f15531e;

    /* renamed from: f */
    public final Map<Class<?>, Object> f15532f;

    /* renamed from: m.e0$a */
    public static class C7840a {

        /* renamed from: a */
        public C8025z f15533a;

        /* renamed from: b */
        public String f15534b;

        /* renamed from: c */
        public C8022y.C8023a f15535c;

        /* renamed from: d */
        public C7844g0 f15536d;

        /* renamed from: e */
        public Map<Class<?>, Object> f15537e;

        public C7840a() {
            this.f15537e = new LinkedHashMap();
            this.f15534b = "GET";
            this.f15535c = new C8022y.C8023a();
        }

        public C7840a(C7839e0 e0Var) {
            Map<Class<?>, Object> map;
            C6888i.m12438e(e0Var, "request");
            this.f15537e = new LinkedHashMap();
            this.f15533a = e0Var.f15528b;
            this.f15534b = e0Var.f15529c;
            this.f15536d = e0Var.f15531e;
            if (e0Var.f15532f.isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = C6790h.m12345c0(e0Var.f15532f);
            }
            this.f15537e = map;
            this.f15535c = e0Var.f15530d.mo25841n();
        }

        /* renamed from: a */
        public C7839e0 mo25535a() {
            Map map;
            C8025z zVar = this.f15533a;
            if (zVar != null) {
                String str = this.f15534b;
                C8022y b = this.f15535c.mo25846b();
                C7844g0 g0Var = this.f15536d;
                Map<Class<?>, Object> map2 = this.f15537e;
                byte[] bArr = C7867c.f15619a;
                C6888i.m12438e(map2, "$this$toImmutableMap");
                if (map2.isEmpty()) {
                    map = C6799q.f13714g;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(map2));
                    C6888i.m12437d(map, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new C7839e0(zVar, str, b, g0Var, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: b */
        public C7840a mo25536b(String str, String str2) {
            C6888i.m12438e(str, "name");
            C6888i.m12438e(str2, "value");
            C8022y.C8023a aVar = this.f15535c;
            Objects.requireNonNull(aVar);
            C6888i.m12438e(str, "name");
            C6888i.m12438e(str2, "value");
            C8022y.C8024b bVar = C8022y.f16097h;
            bVar.mo25848a(str);
            bVar.mo25849b(str2, str);
            aVar.mo25847c(str);
            aVar.mo25845a(str, str2);
            return this;
        }

        /* renamed from: c */
        public C7840a mo25537c(String str, C7844g0 g0Var) {
            C6888i.m12438e(str, "method");
            boolean z = true;
            if (str.length() > 0) {
                if (g0Var == null) {
                    C6888i.m12438e(str, "method");
                    if (!C6888i.m12434a(str, "POST") && !C6888i.m12434a(str, "PUT") && !C6888i.m12434a(str, "PATCH") && !C6888i.m12434a(str, "PROPPATCH") && !C6888i.m12434a(str, "REPORT")) {
                        z = false;
                    }
                    if (!(!z)) {
                        throw new IllegalArgumentException(C0843a.m452m("method ", str, " must have a request body.").toString());
                    }
                } else if (!C7908f.m14396a(str)) {
                    throw new IllegalArgumentException(C0843a.m452m("method ", str, " must not have a request body.").toString());
                }
                this.f15534b = str;
                this.f15536d = g0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: d */
        public C7840a mo25538d(C7844g0 g0Var) {
            C6888i.m12438e(g0Var, "body");
            mo25537c("POST", g0Var);
            return this;
        }

        /* renamed from: e */
        public C7840a mo25539e(String str) {
            C6888i.m12438e(str, "name");
            this.f15535c.mo25847c(str);
            return this;
        }

        /* renamed from: f */
        public C7840a mo25540f(String str) {
            int i;
            StringBuilder sb;
            C6888i.m12438e(str, "url");
            if (C7694h.m13947y(str, "ws:", true)) {
                sb = C0843a.m460u("http:");
                i = 3;
            } else {
                if (C7694h.m13947y(str, "wss:", true)) {
                    sb = C0843a.m460u("https:");
                    i = 4;
                }
                C6888i.m12438e(str, "$this$toHttpUrl");
                C8025z.C8026a aVar = new C8025z.C8026a();
                aVar.mo25864d((C8025z) null, str);
                mo25541g(aVar.mo25861a());
                return this;
            }
            String substring = str.substring(i);
            C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            str = sb.toString();
            C6888i.m12438e(str, "$this$toHttpUrl");
            C8025z.C8026a aVar2 = new C8025z.C8026a();
            aVar2.mo25864d((C8025z) null, str);
            mo25541g(aVar2.mo25861a());
            return this;
        }

        /* renamed from: g */
        public C7840a mo25541g(C8025z zVar) {
            C6888i.m12438e(zVar, "url");
            this.f15533a = zVar;
            return this;
        }
    }

    public C7839e0(C8025z zVar, String str, C8022y yVar, C7844g0 g0Var, Map<Class<?>, ? extends Object> map) {
        C6888i.m12438e(zVar, "url");
        C6888i.m12438e(str, "method");
        C6888i.m12438e(yVar, "headers");
        C6888i.m12438e(map, "tags");
        this.f15528b = zVar;
        this.f15529c = str;
        this.f15530d = yVar;
        this.f15531e = g0Var;
        this.f15532f = map;
    }

    /* renamed from: a */
    public final C7837e mo25532a() {
        C7837e eVar = this.f15527a;
        if (eVar != null) {
            return eVar;
        }
        C7837e b = C7837e.f15513n.mo25531b(this.f15530d);
        this.f15527a = b;
        return b;
    }

    /* renamed from: b */
    public final String mo25533b(String str) {
        C6888i.m12438e(str, "name");
        return this.f15530d.mo25836e(str);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Request{method=");
        u.append(this.f15529c);
        u.append(", url=");
        u.append(this.f15528b);
        if (this.f15530d.size() != 0) {
            u.append(", headers=[");
            int i = 0;
            for (Object next : this.f15530d) {
                int i2 = i + 1;
                if (i >= 0) {
                    C6768j jVar = (C6768j) next;
                    String str = (String) jVar.f13681g;
                    String str2 = (String) jVar.f13682h;
                    if (i > 0) {
                        u.append(", ");
                    }
                    u.append(str);
                    u.append(':');
                    u.append(str2);
                    i = i2;
                } else {
                    C6790h.m12333T();
                    throw null;
                }
            }
            u.append(']');
        }
        if (!this.f15532f.isEmpty()) {
            u.append(", tags=");
            u.append(this.f15532f);
        }
        u.append('}');
        String sb = u.toString();
        C6888i.m12437d(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }
}
