package p005b.p096l.p097a.p113c.p131e.p136e;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.hi */
public class C2215hi {

    /* renamed from: a */
    public final String f3920a;

    /* renamed from: b */
    public final C2649zi f3921b;

    public C2215hi(String str, C2649zi ziVar) {
        this.f3920a = str;
        this.f3921b = ziVar;
    }

    /* renamed from: a */
    public final String mo12706a(String str, String str2) {
        String str3 = this.f3920a;
        StringBuilder sb = new StringBuilder(C0843a.m441b(String.valueOf(str3).length(), 5, str.length(), String.valueOf(str2).length()));
        sb.append(str3);
        sb.append(str);
        sb.append("?key=");
        sb.append(str2);
        return sb.toString();
    }
}
