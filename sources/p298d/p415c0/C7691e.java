package p298d.p415c0;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.c0.e */
public final class C7691e {

    /* renamed from: a */
    public static final C7690d f15228a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        C0843a.m431G(sb, "[eE][+-]?(\\p{Digit}+)", ")?)|", "(\\.(", "(\\p{Digit}+)");
        C0843a.m431G(sb, ")(", "[eE][+-]?(\\p{Digit}+)", ")?)|", "((");
        sb.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        sb.append(")[pP][+-]?");
        sb.append("(\\p{Digit}+)");
        sb.append(')');
        f15228a = new C7690d(C0843a.m452m("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", sb.toString(), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
