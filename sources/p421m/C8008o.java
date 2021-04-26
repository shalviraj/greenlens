package p421m;

import androidx.recyclerview.widget.RecyclerView;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.p422m0.C7867c;
import p421m.p422m0.p427h.C7904c;

/* renamed from: m.o */
public final class C8008o {

    /* renamed from: j */
    public static final Pattern f16064j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f16065k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f16066l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f16067m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final C8008o f16068n = null;

    /* renamed from: a */
    public final String f16069a;

    /* renamed from: b */
    public final String f16070b;

    /* renamed from: c */
    public final long f16071c;

    /* renamed from: d */
    public final String f16072d;

    /* renamed from: e */
    public final String f16073e;

    /* renamed from: f */
    public final boolean f16074f;

    /* renamed from: g */
    public final boolean f16075g;

    /* renamed from: h */
    public final boolean f16076h;

    /* renamed from: i */
    public final boolean f16077i;

    public C8008o(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f16069a = str;
        this.f16070b = str2;
        this.f16071c = j;
        this.f16072d = str3;
        this.f16073e = str4;
        this.f16074f = z;
        this.f16075g = z2;
        this.f16076h = z3;
        this.f16077i = z4;
    }

    /* renamed from: a */
    public static final int m14674a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            boolean z2 = true;
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && (('0' > charAt || '9' < charAt) && (('a' > charAt || 'z' < charAt) && (('A' > charAt || 'Z' < charAt) && charAt != ':')))) {
                z2 = false;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static final long m14675b(String str, int i, int i2) {
        int a = m14674a(str, i, i2, false);
        Matcher matcher = f16067m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m14674a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f16067m).matches()) {
                String group = matcher.group(1);
                C6888i.m12437d(group, "matcher.group(1)");
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                C6888i.m12437d(group2, "matcher.group(2)");
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                C6888i.m12437d(group3, "matcher.group(3)");
                i8 = Integer.parseInt(group3);
            } else if (i5 != -1 || !matcher.usePattern(f16066l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = f16065k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        C6888i.m12437d(group4, "matcher.group(1)");
                        Locale locale = Locale.US;
                        C6888i.m12437d(locale, "Locale.US");
                        String lowerCase = group4.toLowerCase(locale);
                        C6888i.m12437d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        C6888i.m12437d(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = C7694h.m13934l(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f16064j).matches()) {
                    String group5 = matcher.group(1);
                    C6888i.m12437d(group5, "matcher.group(1)");
                    i3 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                C6888i.m12437d(group6, "matcher.group(1)");
                i5 = Integer.parseInt(group6);
            }
            a = m14674a(str, a2 + 1, i2, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += RecyclerView.MAX_SCROLL_DURATION;
        }
        if (i3 >= 1601) {
            if (i6 != -1) {
                if (1 <= i5 && 31 >= i5) {
                    if (i4 >= 0 && 23 >= i4) {
                        if (i7 >= 0 && 59 >= i7) {
                            if (i8 >= 0 && 59 >= i8) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(C7867c.f15623e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i3);
                                gregorianCalendar.set(2, i6 - 1);
                                gregorianCalendar.set(5, i5);
                                gregorianCalendar.set(11, i4);
                                gregorianCalendar.set(12, i7);
                                gregorianCalendar.set(13, i8);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public static final long m14676c(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            C6888i.m12438e("-?\\d+", "pattern");
            Pattern compile = Pattern.compile("-?\\d+");
            C6888i.m12437d(compile, "Pattern.compile(pattern)");
            C6888i.m12438e(compile, "nativePattern");
            C6888i.m12438e(str, "input");
            if (!compile.matcher(str).matches()) {
                throw e;
            } else if (C7694h.m13910A(str, "-", false, 2)) {
                return Long.MIN_VALUE;
            } else {
                return RecyclerView.FOREVER_NS;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8008o) {
            C8008o oVar = (C8008o) obj;
            return C6888i.m12434a(oVar.f16069a, this.f16069a) && C6888i.m12434a(oVar.f16070b, this.f16070b) && oVar.f16071c == this.f16071c && C6888i.m12434a(oVar.f16072d, this.f16072d) && C6888i.m12434a(oVar.f16073e, this.f16073e) && oVar.f16074f == this.f16074f && oVar.f16075g == this.f16075g && oVar.f16076h == this.f16076h && oVar.f16077i == this.f16077i;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int hashCode = this.f16070b.hashCode();
        int hashCode2 = Long.hashCode(this.f16071c);
        int hashCode3 = this.f16072d.hashCode();
        int hashCode4 = this.f16073e.hashCode();
        int hashCode5 = Boolean.hashCode(this.f16074f);
        int hashCode6 = Boolean.hashCode(this.f16075g);
        int hashCode7 = Boolean.hashCode(this.f16076h);
        return Boolean.hashCode(this.f16077i) + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f16069a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16069a);
        sb.append('=');
        sb.append(this.f16070b);
        if (this.f16076h) {
            if (this.f16071c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                Date date = new Date(this.f16071c);
                C7904c.C7905a aVar = C7904c.f15754a;
                C6888i.m12438e(date, "$this$toHttpDateString");
                str = ((DateFormat) C7904c.f15754a.get()).format(date);
                C6888i.m12437d(str, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(str);
        }
        if (!this.f16077i) {
            sb.append("; domain=");
            sb.append(this.f16072d);
        }
        sb.append("; path=");
        sb.append(this.f16073e);
        if (this.f16074f) {
            sb.append("; secure");
        }
        if (this.f16075g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "toString()");
        return sb2;
    }
}
