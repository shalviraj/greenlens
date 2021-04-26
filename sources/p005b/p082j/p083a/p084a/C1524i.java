package p005b.p082j.p083a.p084a;

import p005b.p082j.p083a.p084a.p087q.C1535a;

/* renamed from: b.j.a.a.i */
public abstract class C1524i {

    /* renamed from: a */
    public int f2384a;

    /* renamed from: b */
    public int f2385b;

    /* renamed from: a */
    public abstract String mo11503a();

    /* renamed from: b */
    public final boolean mo11504b() {
        return this.f2384a == 1;
    }

    /* renamed from: c */
    public final boolean mo11505c() {
        return this.f2384a == 2;
    }

    /* renamed from: d */
    public final boolean mo11506d() {
        return this.f2384a == 0;
    }

    /* renamed from: e */
    public String mo11507e() {
        int i = this.f2384a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(64);
        int i = this.f2384a;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                sb.append('{');
                String a = mo11503a();
                if (a != null) {
                    sb.append('\"');
                    int[] iArr = C1535a.f2448h;
                    int length = iArr.length;
                    int length2 = a.length();
                    while (i2 < length2) {
                        char charAt = a.charAt(i2);
                        if (charAt < length && iArr[charAt] != 0) {
                            sb.append('\\');
                            int i3 = iArr[charAt];
                            if (i3 < 0) {
                                sb.append('u');
                                sb.append('0');
                                sb.append('0');
                                char[] cArr = C1535a.f2441a;
                                sb.append(cArr[charAt >> 4]);
                                charAt = cArr[charAt & 15];
                            } else {
                                charAt = (char) i3;
                            }
                        }
                        sb.append(charAt);
                        i2++;
                    }
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                c = '}';
            } else {
                sb.append('[');
                int i4 = this.f2385b;
                if (i4 >= 0) {
                    i2 = i4;
                }
                sb.append(i2);
                c = ']';
            }
            sb.append(c);
        } else {
            sb.append("/");
        }
        return sb.toString();
    }
}
