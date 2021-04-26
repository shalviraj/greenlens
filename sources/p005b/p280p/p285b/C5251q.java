package p005b.p280p.p285b;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.p.b.q */
public final class C5251q {

    /* renamed from: c */
    public static final Pattern f10443c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    public static final Pattern f10444d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f10445a;

    /* renamed from: b */
    public final String f10446b;

    public C5251q(String str, String str2, String str3, String str4) {
        this.f10445a = str;
        this.f10446b = str4;
    }

    /* renamed from: b */
    public static C5251q m9744b(String str) {
        Matcher matcher = f10443c.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f10444d.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                if (str2 == null || group3.equalsIgnoreCase(str2)) {
                    str2 = group3;
                } else {
                    throw new IllegalArgumentException(C0843a.m451l("Multiple different charsets: ", str));
                }
            }
        }
        return new C5251q(str, lowerCase, lowerCase2, str2);
    }

    /* renamed from: a */
    public Charset mo17184a(Charset charset) {
        String str = this.f10446b;
        return str != null ? Charset.forName(str) : charset;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5251q) && ((C5251q) obj).f10445a.equals(this.f10445a);
    }

    public int hashCode() {
        return this.f10445a.hashCode();
    }

    public String toString() {
        return this.f10445a;
    }
}
