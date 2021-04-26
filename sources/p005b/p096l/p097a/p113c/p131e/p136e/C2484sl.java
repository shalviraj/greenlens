package p005b.p096l.p097a.p113c.p131e.p136e;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.sl */
public final class C2484sl extends C2583x0 {
    public C2484sl(C2341mm mmVar, C2440r1 r1Var, CharSequence charSequence) {
        super(r1Var, charSequence);
    }

    /* renamed from: b */
    public final int mo12413b(int i) {
        String str;
        CharSequence charSequence = this.f4422i;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            if (i < 0) {
                str = C1960d.m2772Z1("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (length < 0) {
                throw new IllegalArgumentException(C0843a.m438N(26, "negative size: ", length));
            } else {
                str = C1960d.m2772Z1("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(length));
            }
            throw new IndexOutOfBoundsException(str);
        }
        while (i < length) {
            if (charSequence.charAt(i) == '.') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo12414c(int i) {
        return i + 1;
    }
}
