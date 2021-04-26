package p005b.p082j.p083a.p084a.p089s;

import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p082j.p083a.p084a.C1514b;
import p005b.p082j.p083a.p084a.p090t.C1566f;

/* renamed from: b.j.a.a.s.b */
public final class C1556b {

    /* renamed from: a */
    public final C1556b f2583a;

    /* renamed from: b */
    public final AtomicReference<C1558b> f2584b;

    /* renamed from: c */
    public final int f2585c;

    /* renamed from: d */
    public final int f2586d;

    /* renamed from: e */
    public boolean f2587e;

    /* renamed from: f */
    public String[] f2588f;

    /* renamed from: g */
    public C1557a[] f2589g;

    /* renamed from: h */
    public int f2590h;

    /* renamed from: i */
    public int f2591i;

    /* renamed from: j */
    public int f2592j;

    /* renamed from: k */
    public int f2593k;

    /* renamed from: l */
    public boolean f2594l;

    /* renamed from: m */
    public BitSet f2595m;

    /* renamed from: b.j.a.a.s.b$a */
    public static final class C1557a {

        /* renamed from: a */
        public final String f2596a;

        /* renamed from: b */
        public final C1557a f2597b;

        /* renamed from: c */
        public final int f2598c;

        public C1557a(String str, C1557a aVar) {
            this.f2596a = str;
            this.f2597b = aVar;
            this.f2598c = aVar != null ? 1 + aVar.f2598c : 1;
        }

        /* renamed from: a */
        public String mo11683a(char[] cArr, int i, int i2) {
            if (this.f2596a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f2596a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f2596a;
                }
            }
            return null;
        }
    }

    /* renamed from: b.j.a.a.s.b$b */
    public static final class C1558b {

        /* renamed from: a */
        public final int f2599a;

        /* renamed from: b */
        public final int f2600b;

        /* renamed from: c */
        public final String[] f2601c;

        /* renamed from: d */
        public final C1557a[] f2602d;

        public C1558b(int i, int i2, String[] strArr, C1557a[] aVarArr) {
            this.f2599a = i;
            this.f2600b = i2;
            this.f2601c = strArr;
            this.f2602d = aVarArr;
        }

        public C1558b(C1556b bVar) {
            this.f2599a = bVar.f2590h;
            this.f2600b = bVar.f2593k;
            this.f2601c = bVar.f2588f;
            this.f2602d = bVar.f2589g;
        }
    }

    public C1556b(int i) {
        this.f2583a = null;
        this.f2585c = i;
        this.f2587e = true;
        this.f2586d = -1;
        this.f2594l = false;
        this.f2593k = 0;
        this.f2584b = new AtomicReference<>(new C1558b(0, 0, new String[64], new C1557a[32]));
    }

    public C1556b(C1556b bVar, int i, int i2, C1558b bVar2) {
        this.f2583a = bVar;
        this.f2585c = i2;
        this.f2584b = null;
        this.f2586d = i;
        this.f2587e = C1514b.C1515a.CANONICALIZE_FIELD_NAMES.mo11459d(i);
        String[] strArr = bVar2.f2601c;
        this.f2588f = strArr;
        this.f2589g = bVar2.f2602d;
        this.f2590h = bVar2.f2599a;
        this.f2593k = bVar2.f2600b;
        int length = strArr.length;
        this.f2591i = length - (length >> 2);
        this.f2592j = length - 1;
        this.f2594l = true;
    }

    /* renamed from: a */
    public int mo11679a(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.f2592j;
    }

    /* renamed from: b */
    public int mo11680b(String str) {
        int length = str.length();
        int i = this.f2585c;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: c */
    public String mo11681c(char[] cArr, int i, int i2, int i3) {
        BitSet bitSet;
        String str;
        if (i2 < 1) {
            return "";
        }
        if (!this.f2587e) {
            return new String(cArr, i, i2);
        }
        int a = mo11679a(i3);
        String str2 = this.f2588f[a];
        if (str2 != null) {
            if (str2.length() == i2) {
                int i4 = 0;
                while (str2.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str2;
                    }
                }
            }
            C1557a aVar = this.f2589g[a >> 1];
            if (aVar != null) {
                String a2 = aVar.mo11683a(cArr, i, i2);
                if (a2 != null) {
                    return a2;
                }
                C1557a aVar2 = aVar.f2597b;
                while (true) {
                    if (aVar2 == null) {
                        str = null;
                        break;
                    }
                    str = aVar2.mo11683a(cArr, i, i2);
                    if (str != null) {
                        break;
                    }
                    aVar2 = aVar2.f2597b;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        if (this.f2594l) {
            String[] strArr = this.f2588f;
            this.f2588f = (String[]) Arrays.copyOf(strArr, strArr.length);
            C1557a[] aVarArr = this.f2589g;
            this.f2589g = (C1557a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            this.f2594l = false;
        } else if (this.f2590h >= this.f2591i) {
            int i5 = r1 + r1;
            if (i5 > 65536) {
                this.f2590h = 0;
                this.f2587e = false;
                this.f2588f = new String[64];
                this.f2589g = new C1557a[32];
                this.f2592j = 63;
                this.f2594l = false;
            } else {
                C1557a[] aVarArr2 = this.f2589g;
                this.f2588f = new String[i5];
                this.f2589g = new C1557a[(i5 >> 1)];
                this.f2592j = i5 - 1;
                this.f2591i = i5 - (i5 >> 2);
                int i6 = 0;
                int i7 = 0;
                for (String str3 : this.f2588f) {
                    if (str3 != null) {
                        i6++;
                        int a3 = mo11679a(mo11680b(str3));
                        String[] strArr2 = this.f2588f;
                        if (strArr2[a3] == null) {
                            strArr2[a3] = str3;
                        } else {
                            int i8 = a3 >> 1;
                            C1557a[] aVarArr3 = this.f2589g;
                            C1557a aVar3 = new C1557a(str3, aVarArr3[i8]);
                            aVarArr3[i8] = aVar3;
                            i7 = Math.max(i7, aVar3.f2598c);
                        }
                    }
                }
                int i9 = r1 >> 1;
                for (int i10 = 0; i10 < i9; i10++) {
                    for (C1557a aVar4 = aVarArr2[i10]; aVar4 != null; aVar4 = aVar4.f2597b) {
                        i6++;
                        String str4 = aVar4.f2596a;
                        int a4 = mo11679a(mo11680b(str4));
                        String[] strArr3 = this.f2588f;
                        if (strArr3[a4] == null) {
                            strArr3[a4] = str4;
                        } else {
                            int i11 = a4 >> 1;
                            C1557a[] aVarArr4 = this.f2589g;
                            C1557a aVar5 = new C1557a(str4, aVarArr4[i11]);
                            aVarArr4[i11] = aVar5;
                            i7 = Math.max(i7, aVar5.f2598c);
                        }
                    }
                }
                this.f2593k = i7;
                this.f2595m = null;
                if (i6 != this.f2590h) {
                    throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[]{Integer.valueOf(this.f2590h), Integer.valueOf(i6)}));
                }
            }
            int i12 = this.f2585c;
            int i13 = i2 + i;
            for (int i14 = i; i14 < i13; i14++) {
                i12 = (i12 * 33) + cArr[i14];
            }
            if (i12 == 0) {
                i12 = 1;
            }
            a = mo11679a(i12);
        }
        String str5 = new String(cArr, i, i2);
        if (C1514b.C1515a.INTERN_FIELD_NAMES.mo11459d(this.f2586d)) {
            str5 = C1566f.f2626h.mo11695a(str5);
        }
        this.f2590h++;
        String[] strArr4 = this.f2588f;
        if (strArr4[a] == null) {
            strArr4[a] = str5;
        } else {
            int i15 = a >> 1;
            C1557a[] aVarArr5 = this.f2589g;
            C1557a aVar6 = new C1557a(str5, aVarArr5[i15]);
            int i16 = aVar6.f2598c;
            if (i16 > 100) {
                BitSet bitSet2 = this.f2595m;
                if (bitSet2 == null) {
                    bitSet = new BitSet();
                    this.f2595m = bitSet;
                } else if (!bitSet2.get(i15)) {
                    bitSet = this.f2595m;
                } else if (!C1514b.C1515a.FAIL_ON_SYMBOL_HASH_OVERFLOW.mo11459d(this.f2586d)) {
                    this.f2587e = false;
                    this.f2588f[a] = aVar6.f2596a;
                    this.f2589g[i15] = null;
                    this.f2590h -= aVar6.f2598c;
                    this.f2593k = -1;
                } else {
                    StringBuilder u = C0843a.m460u("Longest collision chain in symbol table (of size ");
                    u.append(this.f2590h);
                    u.append(") now exceeds maximum, ");
                    u.append(100);
                    u.append(" -- suspect a DoS attack based on hash collisions");
                    throw new IllegalStateException(u.toString());
                }
                bitSet.set(i15);
                this.f2588f[a] = aVar6.f2596a;
                this.f2589g[i15] = null;
                this.f2590h -= aVar6.f2598c;
                this.f2593k = -1;
            } else {
                aVarArr5[i15] = aVar6;
                this.f2593k = Math.max(i16, this.f2593k);
            }
        }
        return str5;
    }

    /* renamed from: d */
    public C1556b mo11682d(int i) {
        return new C1556b(this, i, this.f2585c, this.f2584b.get());
    }
}
