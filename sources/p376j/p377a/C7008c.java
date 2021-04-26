package p376j.p377a;

import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: j.a.c */
public final class C7008c<K, V> {

    /* renamed from: a */
    public final C7012d<K, V> f14063a;

    /* renamed from: j.a.c$a */
    public static final class C7009a<K, V> implements C7012d<K, V> {

        /* renamed from: a */
        public final K[] f14064a;

        /* renamed from: b */
        public final V[] f14065b;

        public C7009a(K k, V v, K k2, V v2) {
            K[] kArr = {k, k2};
            this.f14064a = kArr;
            this.f14065b = new Object[]{v, v2};
        }

        public C7009a(K[] kArr, V[] vArr) {
            this.f14064a = kArr;
            this.f14065b = vArr;
        }

        /* renamed from: a */
        public V mo24393a(K k, int i, int i2) {
            int i3 = 0;
            while (true) {
                K[] kArr = this.f14064a;
                if (i3 >= kArr.length) {
                    return null;
                }
                if (kArr[i3] == k) {
                    return this.f14065b[i3];
                }
                i3++;
            }
        }

        /* renamed from: b */
        public C7012d<K, V> mo24394b(K k, V v, int i, int i2) {
            K[] kArr;
            int i3 = 0;
            int hashCode = this.f14064a[0].hashCode();
            if (hashCode != i) {
                return C7010b.m12605c(new C7011c(k, v), i, this, hashCode, i2);
            }
            while (true) {
                kArr = this.f14064a;
                if (i3 >= kArr.length) {
                    i3 = -1;
                    break;
                } else if (kArr[i3] == k) {
                    break;
                } else {
                    i3++;
                }
            }
            int length = kArr.length;
            if (i3 != -1) {
                Object[] copyOf = Arrays.copyOf(kArr, length);
                Object[] copyOf2 = Arrays.copyOf(this.f14065b, this.f14064a.length);
                copyOf[i3] = k;
                copyOf2[i3] = v;
                return new C7009a(copyOf, copyOf2);
            }
            Object[] copyOf3 = Arrays.copyOf(kArr, length + 1);
            Object[] copyOf4 = Arrays.copyOf(this.f14065b, this.f14064a.length + 1);
            K[] kArr2 = this.f14064a;
            copyOf3[kArr2.length] = k;
            copyOf4[kArr2.length] = v;
            return new C7009a(copyOf3, copyOf4);
        }

        public int size() {
            return this.f14065b.length;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("CollisionLeaf(");
            for (int i = 0; i < this.f14065b.length; i++) {
                u.append("(key=");
                u.append(this.f14064a[i]);
                u.append(" value=");
                u.append(this.f14065b[i]);
                u.append(") ");
            }
            u.append(")");
            return u.toString();
        }
    }

    /* renamed from: j.a.c$b */
    public static final class C7010b<K, V> implements C7012d<K, V> {

        /* renamed from: a */
        public final int f14066a;

        /* renamed from: b */
        public final C7012d<K, V>[] f14067b;

        /* renamed from: c */
        public final int f14068c;

        public C7010b(int i, C7012d<K, V>[] dVarArr, int i2) {
            this.f14066a = i;
            this.f14067b = dVarArr;
            this.f14068c = i2;
        }

        /* renamed from: c */
        public static <K, V> C7012d<K, V> m12605c(C7012d<K, V> dVar, int i, C7012d<K, V> dVar2, int i2, int i3) {
            int d = m12606d(i, i3);
            int d2 = m12606d(i2, i3);
            if (d == d2) {
                C7012d<K, V> c = m12605c(dVar, i, dVar2, i2, i3 + 5);
                return new C7010b(d, new C7012d[]{c}, c.size());
            }
            if (((i >>> i3) & 31) > ((i2 >>> i3) & 31)) {
                C7012d<K, V> dVar3 = dVar2;
                dVar2 = dVar;
                dVar = dVar3;
            }
            return new C7010b(d | d2, new C7012d[]{dVar, dVar2}, dVar2.size() + dVar.size());
        }

        /* renamed from: d */
        public static int m12606d(int i, int i2) {
            return 1 << ((i >>> i2) & 31);
        }

        /* renamed from: a */
        public V mo24393a(K k, int i, int i2) {
            int d = m12606d(i, i2);
            int i3 = this.f14066a;
            if ((i3 & d) == 0) {
                return null;
            }
            return this.f14067b[Integer.bitCount((d - 1) & i3)].mo24393a(k, i, i2 + 5);
        }

        /* renamed from: b */
        public C7012d<K, V> mo24394b(K k, V v, int i, int i2) {
            int d = m12606d(i, i2);
            int bitCount = Integer.bitCount(this.f14066a & (d - 1));
            int i3 = this.f14066a;
            if ((i3 & d) == 0) {
                int i4 = i3 | d;
                C7012d<K, V>[] dVarArr = this.f14067b;
                C7012d[] dVarArr2 = new C7012d[(dVarArr.length + 1)];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, bitCount);
                dVarArr2[bitCount] = new C7011c(k, v);
                C7012d<K, V>[] dVarArr3 = this.f14067b;
                System.arraycopy(dVarArr3, bitCount, dVarArr2, bitCount + 1, dVarArr3.length - bitCount);
                return new C7010b(i4, dVarArr2, this.f14068c + 1);
            }
            C7012d<K, V>[] dVarArr4 = this.f14067b;
            C7012d[] dVarArr5 = (C7012d[]) Arrays.copyOf(dVarArr4, dVarArr4.length);
            dVarArr5[bitCount] = this.f14067b[bitCount].mo24394b(k, v, i, i2 + 5);
            int i5 = this.f14068c;
            return new C7010b(this.f14066a, dVarArr5, (dVarArr5[bitCount].size() + i5) - this.f14067b[bitCount].size());
        }

        public int size() {
            return this.f14068c;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("CompressedIndex(");
            u.append(String.format("bitmap=%s ", new Object[]{Integer.toBinaryString(this.f14066a)}));
            for (C7012d<K, V> append : this.f14067b) {
                u.append(append);
                u.append(" ");
            }
            u.append(")");
            return u.toString();
        }
    }

    /* renamed from: j.a.c$c */
    public static final class C7011c<K, V> implements C7012d<K, V> {

        /* renamed from: a */
        public final K f14069a;

        /* renamed from: b */
        public final V f14070b;

        public C7011c(K k, V v) {
            this.f14069a = k;
            this.f14070b = v;
        }

        /* renamed from: a */
        public V mo24393a(K k, int i, int i2) {
            if (this.f14069a == k) {
                return this.f14070b;
            }
            return null;
        }

        /* renamed from: b */
        public C7012d<K, V> mo24394b(K k, V v, int i, int i2) {
            int hashCode = this.f14069a.hashCode();
            if (hashCode != i) {
                return C7010b.m12605c(new C7011c(k, v), i, this, hashCode, i2);
            }
            K k2 = this.f14069a;
            return k2 == k ? new C7011c(k, v) : new C7009a(k2, this.f14070b, k, v);
        }

        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", new Object[]{this.f14069a, this.f14070b});
        }
    }

    /* renamed from: j.a.c$d */
    public interface C7012d<K, V> {
        /* renamed from: a */
        V mo24393a(K k, int i, int i2);

        /* renamed from: b */
        C7012d<K, V> mo24394b(K k, V v, int i, int i2);

        int size();
    }

    public C7008c() {
        this.f14063a = null;
    }

    public C7008c(C7012d<K, V> dVar) {
        this.f14063a = dVar;
    }
}
