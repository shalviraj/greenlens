package p005b.p096l.p097a.p113c.p131e.p136e;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.kc */
public final class C2283kc extends C2282kb {
    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 46;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return C0843a.m456q(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
