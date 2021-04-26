package com.google.api.client.http;

import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p096l.p164b.p165a.p169b.C3683k;
import p005b.p096l.p164b.p165a.p169b.C3684l;
import p005b.p096l.p164b.p165a.p173d.C3715b;
import p005b.p096l.p164b.p165a.p173d.C3719e;
import p005b.p096l.p164b.p165a.p173d.C3723g;
import p005b.p096l.p164b.p165a.p173d.C3729j;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3734l;
import p005b.p096l.p164b.p165a.p173d.C3736n;
import p005b.p096l.p164b.p165a.p173d.C3746w;

public class HttpHeaders extends C3730k {
    @C3736n("Accept")
    private List<String> accept;
    @C3736n("Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @C3736n("Age")
    private List<Long> age;
    @C3736n("WWW-Authenticate")
    private List<String> authenticate;
    @C3736n("Authorization")
    private List<String> authorization;
    @C3736n("Cache-Control")
    private List<String> cacheControl;
    @C3736n("Content-Encoding")
    private List<String> contentEncoding;
    @C3736n("Content-Length")
    private List<Long> contentLength;
    @C3736n("Content-MD5")
    private List<String> contentMD5;
    @C3736n("Content-Range")
    private List<String> contentRange;
    @C3736n("Content-Type")
    private List<String> contentType;
    @C3736n("Cookie")
    private List<String> cookie;
    @C3736n("Date")
    private List<String> date;
    @C3736n("ETag")
    private List<String> etag;
    @C3736n("Expires")
    private List<String> expires;
    @C3736n("If-Match")
    private List<String> ifMatch;
    @C3736n("If-Modified-Since")
    private List<String> ifModifiedSince;
    @C3736n("If-None-Match")
    private List<String> ifNoneMatch;
    @C3736n("If-Range")
    private List<String> ifRange;
    @C3736n("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @C3736n("Last-Modified")
    private List<String> lastModified;
    @C3736n("Location")
    private List<String> location;
    @C3736n("MIME-Version")
    private List<String> mimeVersion;
    @C3736n("Range")
    private List<String> range;
    @C3736n("Retry-After")
    private List<String> retryAfter;
    @C3736n("User-Agent")
    private List<String> userAgent;
    @C3736n("Warning")
    private List<String> warning;

    /* renamed from: com.google.api.client.http.HttpHeaders$a */
    public static final class C5765a {

        /* renamed from: a */
        public final C3715b f11406a;

        /* renamed from: b */
        public final StringBuilder f11407b;

        /* renamed from: c */
        public final C3719e f11408c;

        /* renamed from: d */
        public final List<Type> f11409d;

        public C5765a(HttpHeaders httpHeaders, StringBuilder sb) {
            Class<?> cls = httpHeaders.getClass();
            this.f11409d = Arrays.asList(new Type[]{cls});
            this.f11408c = C3719e.m7014c(cls, true);
            this.f11407b = sb;
            this.f11406a = new C3715b(httpHeaders);
        }
    }

    public HttpHeaders() {
        super(EnumSet.of(C3730k.C3733c.IGNORE_CASE));
    }

    /* renamed from: a */
    public static void m10487a(Logger logger, StringBuilder sb, StringBuilder sb2, C3683k kVar, String str, Object obj, Writer writer) {
        String str2;
        if (obj != null && !C3723g.m7020c(obj)) {
            if (obj instanceof Enum) {
                str2 = C3729j.m7031c((Enum) obj).f6907d;
            } else {
                str2 = obj.toString();
            }
            String str3 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : str2;
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str3);
                sb.append(C3746w.f6927a);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str3);
                sb2.append("'");
            }
            if (kVar != null) {
                kVar.mo14999a(str, str2);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(str2);
                writer.write("\r\n");
            }
        }
    }

    /* renamed from: l */
    public static Object m10488l(Type type, List<Type> list, String str) {
        return C3723g.m7026i(C3723g.m7027j(list, type), str);
    }

    /* renamed from: b */
    public final void mo22133b(C3684l lVar, StringBuilder sb) {
        clear();
        C5765a aVar = new C5765a(this, sb);
        int f = lVar.mo15008f();
        for (int i = 0; i < f; i++) {
            String g = lVar.mo15009g(i);
            String h = lVar.mo15010h(i);
            List<Type> list = aVar.f11409d;
            C3719e eVar = aVar.f11408c;
            C3715b bVar = aVar.f11406a;
            StringBuilder sb2 = aVar.f11407b;
            if (sb2 != null) {
                sb2.append(g + ": " + h);
                sb2.append(C3746w.f6927a);
            }
            C3729j a = eVar.mo15076a(g);
            if (a != null) {
                Type j = C3723g.m7027j(list, a.mo15100a());
                if (C3734l.m7046j(j)) {
                    Class<?> f2 = C3734l.m7042f(list, C3734l.m7039c(j));
                    bVar.mo15072a(a.f6905b, f2, m10488l(f2, list, h));
                } else if (C3734l.m7047k(C3734l.m7042f(list, j), Iterable.class)) {
                    Collection<Object> collection = (Collection) a.mo15101b(this);
                    if (collection == null) {
                        collection = C3723g.m7023f(j);
                        a.mo15102f(this, collection);
                    }
                    collection.add(m10488l(j == Object.class ? null : C3734l.m7041e(j), list, h));
                } else {
                    a.mo15102f(this, m10488l(j, list, h));
                }
            } else {
                ArrayList arrayList = (ArrayList) get(g);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    super.set(g, arrayList);
                }
                arrayList.add(h);
            }
        }
        aVar.f11406a.mo15073b();
    }

    /* renamed from: c */
    public final <T> List<T> mo22134c(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    public C3730k clone() {
        return (HttpHeaders) super.clone();
    }

    /* renamed from: f */
    public final List<String> mo22135f() {
        return this.authenticate;
    }

    /* renamed from: g */
    public final List<String> mo22136g() {
        return this.authorization;
    }

    /* renamed from: h */
    public final String mo22137h() {
        return (String) mo22138i(this.contentType);
    }

    /* renamed from: i */
    public final <T> T mo22138i(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: j */
    public final String mo22139j() {
        return (String) mo22138i(this.location);
    }

    /* renamed from: k */
    public final String mo22140k() {
        return (String) mo22138i(this.userAgent);
    }

    /* renamed from: m */
    public HttpHeaders mo22141m(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    /* renamed from: n */
    public HttpHeaders mo22142n(String str) {
        this.accept = mo22134c(str);
        return this;
    }

    /* renamed from: o */
    public HttpHeaders mo22143o(String str) {
        this.authorization = mo22134c(str);
        return this;
    }

    /* renamed from: p */
    public HttpHeaders mo22144p(String str) {
        this.ifMatch = mo22134c((Object) null);
        return this;
    }

    /* renamed from: q */
    public HttpHeaders mo22145q(String str) {
        this.ifModifiedSince = mo22134c((Object) null);
        return this;
    }

    /* renamed from: r */
    public HttpHeaders mo22146r(String str) {
        this.ifNoneMatch = mo22134c((Object) null);
        return this;
    }

    /* renamed from: s */
    public HttpHeaders mo22147s(String str) {
        this.ifRange = mo22134c((Object) null);
        return this;
    }

    public C3730k set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    /* renamed from: t */
    public HttpHeaders mo22148t(String str) {
        this.ifUnmodifiedSince = mo22134c((Object) null);
        return this;
    }

    /* renamed from: u */
    public HttpHeaders mo22149u(String str) {
        this.userAgent = mo22134c(str);
        return this;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public Object m15008clone() {
        return (HttpHeaders) super.clone();
    }
}
