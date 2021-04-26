package p005b.p082j.p083a.p084a.p090t;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import p005b.p082j.p083a.p084a.p087q.C1541f;

/* renamed from: b.j.a.a.t.h */
public final class C1568h {

    /* renamed from: l */
    public static final char[] f2628l = new char[0];

    /* renamed from: a */
    public final C1559a f2629a;

    /* renamed from: b */
    public char[] f2630b;

    /* renamed from: c */
    public int f2631c;

    /* renamed from: d */
    public int f2632d;

    /* renamed from: e */
    public ArrayList<char[]> f2633e;

    /* renamed from: f */
    public boolean f2634f;

    /* renamed from: g */
    public int f2635g;

    /* renamed from: h */
    public char[] f2636h;

    /* renamed from: i */
    public int f2637i;

    /* renamed from: j */
    public String f2638j;

    /* renamed from: k */
    public char[] f2639k;

    public C1568h(C1559a aVar) {
        this.f2629a = aVar;
    }

    /* renamed from: a */
    public final char[] mo11696a(int i) {
        C1559a aVar = this.f2629a;
        return aVar != null ? aVar.mo11685b(2, i) : new char[Math.max(i, 500)];
    }

    /* renamed from: b */
    public final void mo11697b() {
        this.f2634f = false;
        this.f2633e.clear();
        this.f2635g = 0;
        this.f2637i = 0;
    }

    /* renamed from: c */
    public char[] mo11698c() {
        int i;
        char[] cArr = this.f2639k;
        if (cArr == null) {
            String str = this.f2638j;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i2 = this.f2631c;
                if (i2 >= 0) {
                    int i3 = this.f2632d;
                    if (i3 >= 1) {
                        cArr = i2 == 0 ? Arrays.copyOf(this.f2630b, i3) : Arrays.copyOfRange(this.f2630b, i2, i3 + i2);
                    }
                } else {
                    int p = mo11711p();
                    if (p >= 1) {
                        cArr = new char[p];
                        ArrayList<char[]> arrayList = this.f2633e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i4 = 0; i4 < size; i4++) {
                                char[] cArr2 = this.f2633e.get(i4);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArr, i, length);
                                i += length;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.f2636h, 0, cArr, i, this.f2637i);
                    }
                }
                cArr = f2628l;
            }
            this.f2639k = cArr;
        }
        return cArr;
    }

    /* renamed from: d */
    public BigDecimal mo11699d() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f2639k;
        if (cArr3 != null) {
            String str = C1541f.f2466a;
            return C1541f.m1857b(cArr3, 0, cArr3.length);
        }
        int i = this.f2631c;
        if (i >= 0 && (cArr2 = this.f2630b) != null) {
            return C1541f.m1857b(cArr2, i, this.f2632d);
        }
        if (this.f2635g == 0 && (cArr = this.f2636h) != null) {
            return C1541f.m1857b(cArr, 0, this.f2637i);
        }
        char[] c = mo11698c();
        String str2 = C1541f.f2466a;
        return C1541f.m1857b(c, 0, c.length);
    }

    /* renamed from: e */
    public int mo11700e(boolean z) {
        char[] cArr;
        int i = this.f2631c;
        return (i < 0 || (cArr = this.f2630b) == null) ? z ? -C1541f.m1858c(this.f2636h, 1, this.f2637i - 1) : C1541f.m1858c(this.f2636h, 0, this.f2637i) : z ? -C1541f.m1858c(cArr, i + 1, this.f2632d - 1) : C1541f.m1858c(cArr, i, this.f2632d);
    }

    /* renamed from: f */
    public String mo11701f() {
        String sb;
        if (this.f2638j == null) {
            if (this.f2639k != null) {
                sb = new String(this.f2639k);
            } else {
                String str = "";
                if (this.f2631c < 0) {
                    int i = this.f2635g;
                    int i2 = this.f2637i;
                    if (i == 0) {
                        if (i2 != 0) {
                            str = new String(this.f2636h, 0, i2);
                        }
                        this.f2638j = str;
                    } else {
                        StringBuilder sb2 = new StringBuilder(i + i2);
                        ArrayList<char[]> arrayList = this.f2633e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                char[] cArr = this.f2633e.get(i3);
                                sb2.append(cArr, 0, cArr.length);
                            }
                        }
                        sb2.append(this.f2636h, 0, this.f2637i);
                        sb = sb2.toString();
                    }
                } else if (this.f2632d < 1) {
                    this.f2638j = str;
                    return str;
                } else {
                    sb = new String(this.f2630b, this.f2631c, this.f2632d);
                }
            }
            this.f2638j = sb;
        }
        return this.f2638j;
    }

    /* renamed from: g */
    public char[] mo11702g() {
        this.f2631c = -1;
        this.f2637i = 0;
        this.f2632d = 0;
        this.f2630b = null;
        this.f2638j = null;
        this.f2639k = null;
        if (this.f2634f) {
            mo11697b();
        }
        char[] cArr = this.f2636h;
        if (cArr != null) {
            return cArr;
        }
        char[] a = mo11696a(0);
        this.f2636h = a;
        return a;
    }

    /* renamed from: h */
    public final void mo11703h() {
        if (this.f2633e == null) {
            this.f2633e = new ArrayList<>();
        }
        char[] cArr = this.f2636h;
        this.f2634f = true;
        this.f2633e.add(cArr);
        this.f2635g += cArr.length;
        this.f2637i = 0;
        int length = cArr.length;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        this.f2636h = new char[i];
    }

    /* renamed from: i */
    public char[] mo11704i() {
        char[] cArr = this.f2636h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.f2636h = copyOf;
        return copyOf;
    }

    /* renamed from: j */
    public char[] mo11705j() {
        if (this.f2633e == null) {
            this.f2633e = new ArrayList<>();
        }
        this.f2634f = true;
        this.f2633e.add(this.f2636h);
        int length = this.f2636h.length;
        this.f2635g += length;
        this.f2637i = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        char[] cArr = new char[i];
        this.f2636h = cArr;
        return cArr;
    }

    /* renamed from: k */
    public char[] mo11706k() {
        if (this.f2631c >= 0) {
            mo11712q(1);
        } else {
            char[] cArr = this.f2636h;
            if (cArr == null) {
                this.f2636h = mo11696a(0);
            } else if (this.f2637i >= cArr.length) {
                mo11703h();
            }
        }
        return this.f2636h;
    }

    /* renamed from: l */
    public char[] mo11707l() {
        if (this.f2631c >= 0) {
            return this.f2630b;
        }
        char[] cArr = this.f2639k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f2638j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f2639k = charArray;
            return charArray;
        } else if (this.f2634f) {
            return mo11698c();
        } else {
            char[] cArr2 = this.f2636h;
            return cArr2 == null ? f2628l : cArr2;
        }
    }

    /* renamed from: m */
    public int mo11708m() {
        int i = this.f2631c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: n */
    public void mo11709n() {
        this.f2631c = -1;
        this.f2637i = 0;
        this.f2632d = 0;
        this.f2630b = null;
        this.f2638j = null;
        this.f2639k = null;
        if (this.f2634f) {
            mo11697b();
        }
    }

    /* renamed from: o */
    public void mo11710o(char[] cArr, int i, int i2) {
        this.f2638j = null;
        this.f2639k = null;
        this.f2630b = cArr;
        this.f2631c = i;
        this.f2632d = i2;
        if (this.f2634f) {
            mo11697b();
        }
    }

    /* renamed from: p */
    public int mo11711p() {
        if (this.f2631c >= 0) {
            return this.f2632d;
        }
        char[] cArr = this.f2639k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f2638j;
        return str != null ? str.length() : this.f2635g + this.f2637i;
    }

    /* renamed from: q */
    public final void mo11712q(int i) {
        int i2 = this.f2632d;
        this.f2632d = 0;
        char[] cArr = this.f2630b;
        this.f2630b = null;
        int i3 = this.f2631c;
        this.f2631c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.f2636h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.f2636h = mo11696a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.f2636h, 0, i2);
        }
        this.f2635g = 0;
        this.f2637i = i2;
    }

    public String toString() {
        return mo11701f();
    }
}
