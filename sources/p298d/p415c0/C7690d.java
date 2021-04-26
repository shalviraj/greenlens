package p298d.p415c0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.c0.d */
public final class C7690d implements Serializable {

    /* renamed from: g */
    public final Pattern f15227g;

    public C7690d(String str) {
        C6888i.m12438e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C6888i.m12437d(compile, "Pattern.compile(pattern)");
        C6888i.m12438e(compile, "nativePattern");
        this.f15227g = compile;
    }

    /* renamed from: a */
    public final boolean mo25278a(CharSequence charSequence) {
        C6888i.m12438e(charSequence, "input");
        return this.f15227g.matcher(charSequence).matches();
    }

    /* renamed from: b */
    public final String mo25279b(CharSequence charSequence, String str) {
        C6888i.m12438e(charSequence, "input");
        C6888i.m12438e(str, "replacement");
        String replaceAll = this.f15227g.matcher(charSequence).replaceAll(str);
        C6888i.m12437d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: c */
    public final List<String> mo25280c(CharSequence charSequence, int i) {
        C6888i.m12438e(charSequence, "input");
        int i2 = 0;
        if (i >= 0) {
            Matcher matcher = this.f15227g.matcher(charSequence);
            if (!matcher.find() || i == 1) {
                return C5266a.m9910Y2(charSequence.toString());
            }
            int i3 = 10;
            if (i > 0 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            int i4 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                break;
            } while (!matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public String toString() {
        String pattern = this.f15227g.toString();
        C6888i.m12437d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
