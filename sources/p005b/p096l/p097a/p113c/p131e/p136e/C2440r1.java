package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.r1 */
public final class C2440r1 {

    /* renamed from: a */
    public final C2416q1 f4250a;

    public C2440r1(C2416q1 q1Var) {
        this.f4250a = q1Var;
    }

    /* renamed from: a */
    public static C2440r1 m4062a(String str) {
        int i = C2459rk.f4267a;
        C2240ii iiVar = new C2240ii(Pattern.compile("[.-]"));
        Matcher matcher = iiVar.f3944g.matcher("");
        Objects.requireNonNull(matcher);
        if (!matcher.matches()) {
            return new C2440r1(new C2630z(iiVar));
        }
        throw new IllegalArgumentException(C1960d.m2772Z1("The pattern may not match the empty string: %s", iiVar));
    }

    /* renamed from: b */
    public final List<String> mo12961b(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator<String> a = this.f4250a.mo12822a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
