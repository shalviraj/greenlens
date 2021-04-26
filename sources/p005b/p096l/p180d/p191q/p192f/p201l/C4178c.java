package p005b.p096l.p180d.p191q.p192f.p201l;

import p005b.p096l.p097a.p098a.C1585c;
import p005b.p096l.p097a.p098a.C1586d;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;
import p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h;

/* renamed from: b.l.d.q.f.l.c */
public class C4178c {

    /* renamed from: b */
    public static final C4163h f7747b = new C4163h();

    /* renamed from: c */
    public static final String f7748c = m7716a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    public static final String f7749d = m7716a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    public static final C1585c<C4129v, byte[]> f7750e = C4177b.f7746a;

    /* renamed from: a */
    public final C1586d<C4129v> f7751a;

    public C4178c(C1586d<C4129v> dVar, C1585c<C4129v, byte[]> cVar) {
        this.f7751a = dVar;
    }

    /* renamed from: a */
    public static String m7716a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
