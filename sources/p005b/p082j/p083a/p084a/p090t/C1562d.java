package p005b.p082j.p083a.p084a.p090t;

import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.p090t.C1563e;

/* renamed from: b.j.a.a.t.d */
public class C1562d extends C1563e.C1565b {

    /* renamed from: j */
    public static final String f2614j;

    /* renamed from: k */
    public static final C1562d f2615k;

    /* renamed from: g */
    public final char[] f2616g;

    /* renamed from: h */
    public final int f2617h;

    /* renamed from: i */
    public final String f2618i;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        f2614j = str;
        f2615k = new C1562d("  ", str);
    }

    public C1562d(String str, String str2) {
        this.f2617h = str.length();
        this.f2616g = new char[(str.length() * 16)];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            str.getChars(0, str.length(), this.f2616g, i);
            i += str.length();
        }
        this.f2618i = str2;
    }

    /* renamed from: a */
    public void mo11692a(C1517d dVar, int i) {
        dVar.mo11474p0(this.f2618i);
        if (i > 0) {
            int i2 = i * this.f2617h;
            while (true) {
                char[] cArr = this.f2616g;
                if (i2 > cArr.length) {
                    dVar.mo11476q0(cArr, 0, cArr.length);
                    i2 -= this.f2616g.length;
                } else {
                    dVar.mo11476q0(cArr, 0, i2);
                    return;
                }
            }
        }
    }

    public boolean isInline() {
        return false;
    }
}
