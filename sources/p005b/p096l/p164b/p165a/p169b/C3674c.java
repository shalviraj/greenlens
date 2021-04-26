package p005b.p096l.p164b.p165a.p169b;

import com.google.android.material.badge.BadgeDrawable;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.p174z.C3750a;
import p005b.p096l.p164b.p165a.p173d.p174z.C3751b;
import p005b.p096l.p164b.p165a.p173d.p174z.C3754d;

/* renamed from: b.l.b.a.b.c */
public class C3674c extends C3730k {
    public static final C3754d URI_FRAGMENT_ESCAPER = new C3751b("=&-_.!~*'()@:$,;/?:", false);
    public String fragment;
    public String host;
    public List<String> pathParts;
    public int port;
    public String scheme;
    public String userInfo;
    public boolean verbatim;

    public C3674c() {
        this.port = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3674c(String str) {
        this(new URL(str), false);
        try {
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static boolean appendParam(boolean z, StringBuilder sb, String str, Object obj, boolean z2) {
        char c;
        if (z) {
            z = false;
            c = '?';
        } else {
            c = '&';
        }
        sb.append(c);
        sb.append(str);
        String obj2 = obj.toString();
        if (!z2) {
            obj2 = C3750a.f6935d.mo15130a(obj2);
        }
        if (obj2.length() != 0) {
            sb.append('=');
            sb.append(obj2);
        }
        return z;
    }

    public static List<String> toPathParts(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = true;
        while (z2) {
            int indexOf = str.indexOf(47, i);
            boolean z3 = indexOf != -1;
            String substring = z3 ? str.substring(i, indexOf) : str.substring(i);
            if (!z) {
                C3754d dVar = C3750a.f6932a;
                if (substring == null) {
                    substring = null;
                } else {
                    try {
                        substring = URLDecoder.decode(substring.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%2B"), StandardCharsets.UTF_8.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            arrayList.add(substring);
            i = indexOf + 1;
            z2 = z3;
        }
        return arrayList;
    }

    public final void appendRawPathFromParts(StringBuilder sb) {
        int size = this.pathParts.size();
        for (int i = 0; i < size; i++) {
            String str = this.pathParts.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                if (!this.verbatim) {
                    str = C3750a.f6933b.mo15130a(str);
                }
                sb.append(str);
            }
        }
    }

    public final String build() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = this.scheme;
        Objects.requireNonNull(str);
        sb2.append(str);
        sb2.append("://");
        String str2 = this.userInfo;
        if (str2 != null) {
            if (!this.verbatim) {
                str2 = C3750a.f6934c.mo15130a(str2);
            }
            sb2.append(str2);
            sb2.append('@');
        }
        String str3 = this.host;
        Objects.requireNonNull(str3);
        sb2.append(str3);
        int i = this.port;
        if (i != -1) {
            sb2.append(':');
            sb2.append(i);
        }
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        if (this.pathParts != null) {
            appendRawPathFromParts(sb3);
        }
        Set<Map.Entry<String, Object>> entrySet = entrySet();
        boolean z = this.verbatim;
        boolean z2 = true;
        for (Map.Entry next : entrySet) {
            Object value = next.getValue();
            if (value != null) {
                String str4 = (String) next.getKey();
                if (!z) {
                    str4 = C3750a.f6935d.mo15130a(str4);
                }
                if (value instanceof Collection) {
                    for (Object appendParam : (Collection) value) {
                        z2 = appendParam(z2, sb3, str4, appendParam, z);
                    }
                } else {
                    z2 = appendParam(z2, sb3, str4, value, z);
                }
            }
        }
        String str5 = this.fragment;
        if (str5 != null) {
            sb3.append('#');
            if (!this.verbatim) {
                str5 = URI_FRAGMENT_ESCAPER.mo15130a(str5);
            }
            sb3.append(str5);
        }
        sb.append(sb3.toString());
        return sb.toString();
    }

    public C3674c clone() {
        C3674c cVar = (C3674c) super.clone();
        if (this.pathParts != null) {
            cVar.pathParts = new ArrayList(this.pathParts);
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C3674c)) {
            return false;
        }
        return build().equals(((C3674c) obj).build());
    }

    public int hashCode() {
        return build().hashCode();
    }

    public C3674c set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public String toString() {
        return build();
    }

    public C3674c(URL url, boolean z) {
        String protocol = url.getProtocol();
        String host2 = url.getHost();
        int port2 = url.getPort();
        String path = url.getPath();
        String ref = url.getRef();
        String query = url.getQuery();
        String userInfo2 = url.getUserInfo();
        this.port = -1;
        this.scheme = protocol.toLowerCase(Locale.US);
        this.host = host2;
        this.port = port2;
        this.pathParts = toPathParts(path, z);
        this.verbatim = z;
        String str = null;
        if (z) {
            this.fragment = ref;
            if (query != null) {
                String str2 = C3688o.f6812a;
                try {
                    C3688o.m6956a(new StringReader(query), this, false);
                } catch (IOException e) {
                    C1960d.m2704D0(e);
                    throw null;
                }
            }
            this.userInfo = userInfo2;
            return;
        }
        this.fragment = ref != null ? C3750a.m7057a(ref) : null;
        if (query != null) {
            C3688o.m6957b(query, this);
        }
        this.userInfo = userInfo2 != null ? C3750a.m7057a(userInfo2) : str;
    }
}
