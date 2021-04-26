package p421m;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p333a0.C6756b;
import p298d.p333a0.C6758d;
import p298d.p333a0.C6759e;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: m.b0 */
public final class C7829b0 {

    /* renamed from: c */
    public static final Pattern f15446c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    public static final Pattern f15447d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: e */
    public static final C7829b0 f15448e = null;

    /* renamed from: a */
    public final String f15449a;

    /* renamed from: b */
    public final String[] f15450b;

    public C7829b0(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f15449a = str;
        this.f15450b = strArr;
    }

    /* renamed from: b */
    public static final C7829b0 m14222b(String str) {
        C6888i.m12438e(str, "$this$toMediaType");
        Matcher matcher = f15446c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            C6888i.m12437d(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            C6888i.m12437d(locale, "Locale.US");
            String lowerCase = group.toLowerCase(locale);
            C6888i.m12437d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            C6888i.m12437d(group2, "typeSubtype.group(2)");
            C6888i.m12437d(locale, "Locale.US");
            String lowerCase2 = group2.toLowerCase(locale);
            C6888i.m12437d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = f15447d.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 != null) {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (C7694h.m13910A(group4, "'", false, 2) && C7694h.m13927e(group4, "'", false, 2) && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            C6888i.m12437d(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder u = C0843a.m460u("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
                    u.append(substring);
                    u.append("\" for: \"");
                    u.append(str);
                    u.append('\"');
                    throw new IllegalArgumentException(u.toString().toString());
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new C7829b0(str, lowerCase, lowerCase2, (String[]) array, (DefaultConstructorMarker) null);
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    /* renamed from: c */
    public static final C7829b0 m14223c(String str) {
        C6888i.m12438e(str, "$this$toMediaTypeOrNull");
        try {
            return m14222b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Charset mo25521a(Charset charset) {
        String str;
        C6888i.m12438e("charset", "name");
        String[] strArr = this.f15450b;
        C6888i.m12438e(strArr, "$this$indices");
        C6756b c = C6759e.m12307c(new C6758d(0, C5266a.m9790D1(strArr)), 2);
        int i = c.f13658g;
        int i2 = c.f13659h;
        int i3 = c.f13660i;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                if (!C7694h.m13928f(this.f15450b[i], "charset", true)) {
                    if (i == i2) {
                        break;
                    }
                    i += i3;
                } else {
                    str = this.f15450b[i + 1];
                    break;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7829b0) && C6888i.m12434a(((C7829b0) obj).f15449a, this.f15449a);
    }

    public int hashCode() {
        return this.f15449a.hashCode();
    }

    public String toString() {
        return this.f15449a;
    }
}
