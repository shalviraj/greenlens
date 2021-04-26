package p421m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p333a0.C6756b;
import p298d.p333a0.C6759e;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;
import p298d.p415c0.C7694h;
import p421m.p422m0.C7867c;

/* renamed from: m.y */
public final class C8022y implements Iterable<C6768j<? extends String, ? extends String>>, C6875a {

    /* renamed from: h */
    public static final C8024b f16097h = new C8024b((DefaultConstructorMarker) null);

    /* renamed from: g */
    public final String[] f16098g;

    /* renamed from: m.y$a */
    public static final class C8023a {

        /* renamed from: a */
        public final List<String> f16099a = new ArrayList(20);

        /* renamed from: a */
        public final C8023a mo25845a(String str, String str2) {
            C6888i.m12438e(str, "name");
            C6888i.m12438e(str2, "value");
            this.f16099a.add(str);
            this.f16099a.add(C7694h.m13921L(str2).toString());
            return this;
        }

        /* renamed from: b */
        public final C8022y mo25846b() {
            Object[] array = this.f16099a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new C8022y((String[]) array, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public final C8023a mo25847c(String str) {
            C6888i.m12438e(str, "name");
            int i = 0;
            while (i < this.f16099a.size()) {
                if (C7694h.m13928f(str, this.f16099a.get(i), true)) {
                    this.f16099a.remove(i);
                    this.f16099a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    /* renamed from: m.y$b */
    public static final class C8024b {
        public C8024b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final void mo25848a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C7867c.m14288i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* renamed from: b */
        public final void mo25849b(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C7867c.m14288i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* renamed from: c */
        public final C8022y mo25850c(String... strArr) {
            C6888i.m12438e(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = C7694h.m13921L(str).toString();
                        i++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                C6756b c = C6759e.m12307c(C6759e.m12308d(0, strArr2.length), 2);
                int i2 = c.f13658g;
                int i3 = c.f13659h;
                int i4 = c.f13660i;
                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                    while (true) {
                        String str2 = strArr2[i2];
                        String str3 = strArr2[i2 + 1];
                        mo25848a(str2);
                        mo25849b(str3, str2);
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                return new C8022y(strArr2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public C8022y(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f16098g = strArr;
    }

    /* renamed from: e */
    public final String mo25836e(String str) {
        C6888i.m12438e(str, "name");
        String[] strArr = this.f16098g;
        C6756b c = C6759e.m12307c(C6759e.m12306b(strArr.length - 2, 0), 2);
        int i = c.f13658g;
        int i2 = c.f13659h;
        int i3 = c.f13660i;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!C7694h.m13928f(str, strArr[i], true)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8022y) && Arrays.equals(this.f16098g, ((C8022y) obj).f16098g);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f16098g);
    }

    public Iterator<C6768j<String, String>> iterator() {
        int size = size();
        C6768j[] jVarArr = new C6768j[size];
        for (int i = 0; i < size; i++) {
            jVarArr[i] = new C6768j(mo25840l(i), mo25842q(i));
        }
        return C5266a.m9857O2(jVarArr);
    }

    /* renamed from: l */
    public final String mo25840l(int i) {
        return this.f16098g[i * 2];
    }

    /* renamed from: n */
    public final C8023a mo25841n() {
        C8023a aVar = new C8023a();
        List<String> list = aVar.f16099a;
        String[] strArr = this.f16098g;
        C6888i.m12438e(list, "$this$addAll");
        C6888i.m12438e(strArr, "elements");
        list.addAll(C6790h.m12344c(strArr));
        return aVar;
    }

    /* renamed from: q */
    public final String mo25842q(int i) {
        return this.f16098g[(i * 2) + 1];
    }

    public final int size() {
        return this.f16098g.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(mo25840l(i));
            sb.append(": ");
            sb.append(mo25842q(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
