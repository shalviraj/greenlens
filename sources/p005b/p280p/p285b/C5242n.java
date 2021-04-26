package p005b.p280p.p285b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: b.p.b.n */
public final class C5242n {

    /* renamed from: a */
    public final String[] f10417a;

    /* renamed from: b.p.b.n$b */
    public static final class C5244b {

        /* renamed from: a */
        public final List<String> f10418a = new ArrayList(20);

        /* renamed from: a */
        public C5244b mo17159a(String str, String str2) {
            mo17162d(str, str2);
            this.f10418a.add(str);
            this.f10418a.add(str2.trim());
            return this;
        }

        /* renamed from: b */
        public C5244b mo17160b(String str, String str2) {
            this.f10418a.add(str);
            this.f10418a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C5242n mo17161c() {
            return new C5242n(this, (C5243a) null);
        }

        /* renamed from: d */
        public final void mo17162d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* renamed from: e */
        public C5244b mo17163e(String str) {
            int i = 0;
            while (i < this.f10418a.size()) {
                if (str.equalsIgnoreCase(this.f10418a.get(i))) {
                    this.f10418a.remove(i);
                    this.f10418a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    public C5242n(C5244b bVar, C5243a aVar) {
        List<String> list = bVar.f10418a;
        this.f10417a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    public String mo17153a(String str) {
        String[] strArr = this.f10417a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    /* renamed from: b */
    public String mo17154b(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f10417a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: c */
    public C5244b mo17155c() {
        C5244b bVar = new C5244b();
        Collections.addAll(bVar.f10418a, this.f10417a);
        return bVar;
    }

    /* renamed from: d */
    public int mo17156d() {
        return this.f10417a.length / 2;
    }

    /* renamed from: e */
    public String mo17157e(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f10417a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int d = mo17156d();
        for (int i = 0; i < d; i++) {
            sb.append(mo17154b(i));
            sb.append(": ");
            sb.append(mo17157e(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
