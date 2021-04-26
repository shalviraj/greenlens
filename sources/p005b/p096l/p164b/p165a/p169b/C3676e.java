package p005b.p096l.p164b.p165a.p169b;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.b.e */
public final class C3676e {

    /* renamed from: e */
    public static final Pattern f6755e = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: f */
    public static final Pattern f6756f = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: g */
    public static final Pattern f6757g = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);

    /* renamed from: h */
    public static final Pattern f6758h = Pattern.compile("\\s*;\\s*(" + "[^\\s/=;\"]+" + ")=(" + "\"([^\"]*)\"|[^\\s;\"]*" + ")");

    /* renamed from: a */
    public String f6759a = "application";

    /* renamed from: b */
    public String f6760b = "octet-stream";

    /* renamed from: c */
    public final SortedMap<String, String> f6761c = new TreeMap();

    /* renamed from: d */
    public String f6762d;

    public C3676e(String str) {
        Matcher matcher = f6757g.matcher(str);
        C1960d.m2833p(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Pattern pattern = f6755e;
        C1960d.m2833p(pattern.matcher(group).matches(), "Type contains reserved characters");
        this.f6759a = group;
        this.f6762d = null;
        String group2 = matcher.group(2);
        C1960d.m2833p(pattern.matcher(group2).matches(), "Subtype contains reserved characters");
        this.f6760b = group2;
        this.f6762d = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = f6758h.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                mo14986e(group4, group5);
            }
        }
    }

    /* renamed from: c */
    public static boolean m6922c(String str, String str2) {
        return new C3676e(str).mo14984b(new C3676e(str2));
    }

    /* renamed from: a */
    public String mo14983a() {
        String str = this.f6762d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6759a);
        sb.append('/');
        sb.append(this.f6760b);
        SortedMap<String, String> sortedMap = this.f6761c;
        if (sortedMap != null) {
            for (Map.Entry next : sortedMap.entrySet()) {
                String str2 = (String) next.getValue();
                sb.append("; ");
                sb.append((String) next.getKey());
                sb.append("=");
                if (!f6756f.matcher(str2).matches()) {
                    str2 = C0843a.m452m("\"", str2.replace("\\", "\\\\").replace("\"", "\\\""), "\"");
                }
                sb.append(str2);
            }
        }
        String sb2 = sb.toString();
        this.f6762d = sb2;
        return sb2;
    }

    /* renamed from: b */
    public boolean mo14984b(C3676e eVar) {
        return eVar != null && this.f6759a.equalsIgnoreCase(eVar.f6759a) && this.f6760b.equalsIgnoreCase(eVar.f6760b);
    }

    /* renamed from: d */
    public Charset mo14985d() {
        String str = (String) this.f6761c.get("charset".toLowerCase(Locale.US));
        if (str == null) {
            return null;
        }
        return Charset.forName(str);
    }

    /* renamed from: e */
    public C3676e mo14986e(String str, String str2) {
        if (str2 == null) {
            this.f6762d = null;
            this.f6761c.remove(str.toLowerCase(Locale.US));
            return this;
        }
        C1960d.m2833p(f6756f.matcher(str).matches(), "Name contains reserved characters");
        this.f6762d = null;
        this.f6761c.put(str.toLowerCase(Locale.US), str2);
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3676e)) {
            return false;
        }
        C3676e eVar = (C3676e) obj;
        return mo14984b(eVar) && this.f6761c.equals(eVar.f6761c);
    }

    public int hashCode() {
        return mo14983a().hashCode();
    }

    public String toString() {
        return mo14983a();
    }
}
