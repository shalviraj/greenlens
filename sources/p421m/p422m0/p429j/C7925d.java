package p421m.p422m0.p429j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7867c;
import p421m.p422m0.p429j.C7955q;
import p435n.C8030a0;
import p435n.C8040e;
import p435n.C8043g;
import p435n.C8044h;

/* renamed from: m.m0.j.d */
public final class C7925d {

    /* renamed from: a */
    public static final C7924c[] f15818a;

    /* renamed from: b */
    public static final Map<C8044h, Integer> f15819b;

    /* renamed from: c */
    public static final C7925d f15820c = new C7925d();

    /* renamed from: m.m0.j.d$a */
    public static final class C7926a {

        /* renamed from: a */
        public final List<C7924c> f15821a;

        /* renamed from: b */
        public final C8043g f15822b;

        /* renamed from: c */
        public C7924c[] f15823c;

        /* renamed from: d */
        public int f15824d;

        /* renamed from: e */
        public int f15825e;

        /* renamed from: f */
        public int f15826f;

        /* renamed from: g */
        public final int f15827g;

        /* renamed from: h */
        public int f15828h;

        public C7926a(C8030a0 a0Var, int i, int i2, int i3) {
            i2 = (i3 & 4) != 0 ? i : i2;
            C6888i.m12438e(a0Var, "source");
            this.f15827g = i;
            this.f15828h = i2;
            this.f15821a = new ArrayList();
            this.f15822b = C5266a.m9812H(a0Var);
            this.f15823c = new C7924c[8];
            this.f15824d = 7;
        }

        /* renamed from: a */
        public final void mo25677a() {
            C7924c[] cVarArr = this.f15823c;
            int length = cVarArr.length;
            C6888i.m12438e(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.f15824d = this.f15823c.length - 1;
            this.f15825e = 0;
            this.f15826f = 0;
        }

        /* renamed from: b */
        public final int mo25678b(int i) {
            return this.f15824d + 1 + i;
        }

        /* renamed from: c */
        public final int mo25679c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f15823c.length;
                while (true) {
                    length--;
                    i2 = this.f15824d;
                    if (length < i2 || i <= 0) {
                        C7924c[] cVarArr = this.f15823c;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f15825e);
                        this.f15824d += i3;
                    } else {
                        C7924c cVar = this.f15823c[length];
                        C6888i.m12436c(cVar);
                        int i4 = cVar.f15815a;
                        i -= i4;
                        this.f15826f -= i4;
                        this.f15825e--;
                        i3++;
                    }
                }
                C7924c[] cVarArr2 = this.f15823c;
                System.arraycopy(cVarArr2, i2 + 1, cVarArr2, i2 + 1 + i3, this.f15825e);
                this.f15824d += i3;
            }
            return i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p435n.C8044h mo25680d(int r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x000d
                m.m0.j.d r1 = p421m.p422m0.p429j.C7925d.f15820c
                m.m0.j.c[] r1 = p421m.p422m0.p429j.C7925d.f15818a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x000d
                r1 = r0
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                if (r1 == 0) goto L_0x0017
                m.m0.j.d r0 = p421m.p422m0.p429j.C7925d.f15820c
                m.m0.j.c[] r0 = p421m.p422m0.p429j.C7925d.f15818a
                r5 = r0[r5]
                goto L_0x002e
            L_0x0017:
                m.m0.j.d r1 = p421m.p422m0.p429j.C7925d.f15820c
                m.m0.j.c[] r1 = p421m.p422m0.p429j.C7925d.f15818a
                int r1 = r1.length
                int r1 = r5 - r1
                int r1 = r4.mo25678b(r1)
                if (r1 < 0) goto L_0x0031
                m.m0.j.c[] r2 = r4.f15823c
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0031
                r5 = r2[r1]
                p298d.p344x.p346c.C6888i.m12436c(r5)
            L_0x002e:
                n.h r5 = r5.f15816b
                return r5
            L_0x0031:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7925d.C7926a.mo25680d(int):n.h");
        }

        /* renamed from: e */
        public final void mo25681e(int i, C7924c cVar) {
            this.f15821a.add(cVar);
            int i2 = cVar.f15815a;
            if (i != -1) {
                C7924c cVar2 = this.f15823c[this.f15824d + 1 + i];
                C6888i.m12436c(cVar2);
                i2 -= cVar2.f15815a;
            }
            int i3 = this.f15828h;
            if (i2 > i3) {
                mo25677a();
                return;
            }
            int c = mo25679c((this.f15826f + i2) - i3);
            if (i == -1) {
                int i4 = this.f15825e + 1;
                C7924c[] cVarArr = this.f15823c;
                if (i4 > cVarArr.length) {
                    C7924c[] cVarArr2 = new C7924c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f15824d = this.f15823c.length - 1;
                    this.f15823c = cVarArr2;
                }
                int i5 = this.f15824d;
                this.f15824d = i5 - 1;
                this.f15823c[i5] = cVar;
                this.f15825e++;
            } else {
                this.f15823c[this.f15824d + 1 + i + c + i] = cVar;
            }
            this.f15826f += i2;
        }

        /* renamed from: f */
        public final C8044h mo25682f() {
            byte readByte = this.f15822b.readByte();
            byte[] bArr = C7867c.f15619a;
            byte b = readByte & ExifInterface.MARKER;
            byte b2 = 0;
            boolean z = (b & 128) == 128;
            long g = (long) mo25683g(b, 127);
            if (!z) {
                return this.f15822b.mo25922p(g);
            }
            C8040e eVar = new C8040e();
            C7955q qVar = C7955q.f15976d;
            C8043g gVar = this.f15822b;
            C6888i.m12438e(gVar, "source");
            C6888i.m12438e(eVar, "sink");
            C7955q.C7956a aVar = C7955q.f15975c;
            int i = 0;
            for (long j = 0; j < g; j++) {
                byte readByte2 = gVar.readByte();
                byte[] bArr2 = C7867c.f15619a;
                b2 = (b2 << 8) | (readByte2 & ExifInterface.MARKER);
                i += 8;
                while (i >= 8) {
                    int i2 = i - 8;
                    C7955q.C7956a[] aVarArr = aVar.f15977a;
                    C6888i.m12436c(aVarArr);
                    aVar = aVarArr[(b2 >>> i2) & 255];
                    C6888i.m12436c(aVar);
                    if (aVar.f15977a == null) {
                        eVar.mo25940v0(aVar.f15978b);
                        i -= aVar.f15979c;
                        aVar = C7955q.f15975c;
                    } else {
                        i = i2;
                    }
                }
            }
            while (i > 0) {
                C7955q.C7956a[] aVarArr2 = aVar.f15977a;
                C6888i.m12436c(aVarArr2);
                C7955q.C7956a aVar2 = aVarArr2[(b2 << (8 - i)) & 255];
                C6888i.m12436c(aVar2);
                if (aVar2.f15977a != null || aVar2.f15979c > i) {
                    break;
                }
                eVar.mo25940v0(aVar2.f15978b);
                i -= aVar2.f15979c;
                aVar = C7955q.f15975c;
            }
            return eVar.mo25907f0();
        }

        /* renamed from: g */
        public final int mo25683g(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte readByte = this.f15822b.readByte();
                byte[] bArr = C7867c.f15619a;
                byte b = readByte & ExifInterface.MARKER;
                if ((b & 128) == 0) {
                    return i2 + (b << i4);
                }
                i2 += (b & Byte.MAX_VALUE) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: m.m0.j.d$b */
    public static final class C7927b {

        /* renamed from: a */
        public int f15829a;

        /* renamed from: b */
        public boolean f15830b;

        /* renamed from: c */
        public int f15831c;

        /* renamed from: d */
        public C7924c[] f15832d;

        /* renamed from: e */
        public int f15833e;

        /* renamed from: f */
        public int f15834f;

        /* renamed from: g */
        public int f15835g;

        /* renamed from: h */
        public int f15836h;

        /* renamed from: i */
        public final boolean f15837i;

        /* renamed from: j */
        public final C8040e f15838j;

        public C7927b(int i, boolean z, C8040e eVar, int i2) {
            i = (i2 & 1) != 0 ? 4096 : i;
            z = (i2 & 2) != 0 ? true : z;
            C6888i.m12438e(eVar, "out");
            this.f15836h = i;
            this.f15837i = z;
            this.f15838j = eVar;
            this.f15829a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f15831c = i;
            this.f15832d = new C7924c[8];
            this.f15833e = 7;
        }

        /* renamed from: a */
        public final void mo25684a() {
            C7924c[] cVarArr = this.f15832d;
            int length = cVarArr.length;
            C6888i.m12438e(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.f15833e = this.f15832d.length - 1;
            this.f15834f = 0;
            this.f15835g = 0;
        }

        /* renamed from: b */
        public final int mo25685b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f15832d.length;
                while (true) {
                    length--;
                    i2 = this.f15833e;
                    if (length < i2 || i <= 0) {
                        C7924c[] cVarArr = this.f15832d;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f15834f);
                        C7924c[] cVarArr2 = this.f15832d;
                        int i4 = this.f15833e;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f15833e += i3;
                    } else {
                        C7924c cVar = this.f15832d[length];
                        C6888i.m12436c(cVar);
                        i -= cVar.f15815a;
                        int i5 = this.f15835g;
                        C7924c cVar2 = this.f15832d[length];
                        C6888i.m12436c(cVar2);
                        this.f15835g = i5 - cVar2.f15815a;
                        this.f15834f--;
                        i3++;
                    }
                }
                C7924c[] cVarArr3 = this.f15832d;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + i3, this.f15834f);
                C7924c[] cVarArr22 = this.f15832d;
                int i42 = this.f15833e;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f15833e += i3;
            }
            return i3;
        }

        /* renamed from: c */
        public final void mo25686c(C7924c cVar) {
            int i = cVar.f15815a;
            int i2 = this.f15831c;
            if (i > i2) {
                mo25684a();
                return;
            }
            mo25685b((this.f15835g + i) - i2);
            int i3 = this.f15834f + 1;
            C7924c[] cVarArr = this.f15832d;
            if (i3 > cVarArr.length) {
                C7924c[] cVarArr2 = new C7924c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15833e = this.f15832d.length - 1;
                this.f15832d = cVarArr2;
            }
            int i4 = this.f15833e;
            this.f15833e = i4 - 1;
            this.f15832d[i4] = cVar;
            this.f15834f++;
            this.f15835g += i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25687d(p435n.C8044h r11) {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                p298d.p344x.p346c.C6888i.m12438e(r11, r0)
                boolean r0 = r10.f15837i
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x0092
                m.m0.j.q r0 = p421m.p422m0.p429j.C7955q.f15976d
                java.lang.String r0 = "bytes"
                p298d.p344x.p346c.C6888i.m12438e(r11, r0)
                int r0 = r11.mo25959l()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x001b:
                if (r5 >= r0) goto L_0x002e
                byte r8 = r11.mo25962s(r5)
                byte[] r9 = p421m.p422m0.C7867c.f15619a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = p421m.p422m0.p429j.C7955q.f15974b
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x001b
            L_0x002e:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.mo25959l()
                if (r0 >= r5) goto L_0x0092
                n.e r0 = new n.e
                r0.<init>()
                m.m0.j.q r5 = p421m.p422m0.p429j.C7955q.f15976d
                java.lang.String r5 = "source"
                p298d.p344x.p346c.C6888i.m12438e(r11, r5)
                java.lang.String r5 = "sink"
                p298d.p344x.p346c.C6888i.m12438e(r0, r5)
                int r5 = r11.mo25959l()
                r6 = r3
                r3 = r2
            L_0x0052:
                if (r2 >= r5) goto L_0x0078
                byte r4 = r11.mo25962s(r2)
                byte[] r8 = p421m.p422m0.C7867c.f15619a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = p421m.p422m0.p429j.C7955q.f15973a
                r8 = r8[r4]
                byte[] r9 = p421m.p422m0.p429j.C7955q.f15974b
                byte r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L_0x0068:
                r4 = 8
                if (r3 < r4) goto L_0x0075
                int r3 = r3 + -8
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.mo25887E(r4)
                goto L_0x0068
            L_0x0075:
                int r2 = r2 + 1
                goto L_0x0052
            L_0x0078:
                if (r3 <= 0) goto L_0x0087
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.mo25887E(r11)
            L_0x0087:
                n.h r11 = r0.mo25907f0()
                int r0 = r11.mo25959l()
                r2 = 128(0x80, float:1.794E-43)
                goto L_0x0096
            L_0x0092:
                int r0 = r11.mo25959l()
            L_0x0096:
                r10.mo25689f(r0, r1, r2)
                n.e r0 = r10.f15838j
                r0.mo25933s0(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7925d.C7927b.mo25687d(n.h):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25688e(java.util.List<p421m.p422m0.p429j.C7924c> r13) {
            /*
                r12 = this;
                java.lang.String r0 = "headerBlock"
                p298d.p344x.p346c.C6888i.m12438e(r13, r0)
                boolean r0 = r12.f15830b
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r12.f15829a
                int r2 = r12.f15831c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r12.mo25689f(r0, r4, r3)
            L_0x0017:
                r12.f15830b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.f15829a = r0
                int r0 = r12.f15831c
                r12.mo25689f(r0, r4, r3)
            L_0x0023:
                int r0 = r13.size()
                r2 = r1
            L_0x0028:
                if (r2 >= r0) goto L_0x0101
                java.lang.Object r3 = r13.get(r2)
                m.m0.j.c r3 = (p421m.p422m0.p429j.C7924c) r3
                n.h r4 = r3.f15816b
                n.h r4 = r4.mo25966x()
                n.h r5 = r3.f15817c
                m.m0.j.d r6 = p421m.p422m0.p429j.C7925d.f15820c
                java.util.Map<n.h, java.lang.Integer> r6 = p421m.p422m0.p429j.C7925d.f15819b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x0070
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L_0x0050
                goto L_0x006e
            L_0x0050:
                if (r8 < r6) goto L_0x006e
                m.m0.j.c[] r8 = p421m.p422m0.p429j.C7925d.f15818a
                int r9 = r6 + -1
                r9 = r8[r9]
                n.h r9 = r9.f15817c
                boolean r9 = p298d.p344x.p346c.C6888i.m12434a(r9, r5)
                if (r9 == 0) goto L_0x0061
                goto L_0x0071
            L_0x0061:
                r8 = r8[r6]
                n.h r8 = r8.f15817c
                boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r8, r5)
                if (r8 == 0) goto L_0x006e
                int r8 = r6 + 1
                goto L_0x0072
            L_0x006e:
                r8 = r7
                goto L_0x0072
            L_0x0070:
                r6 = r7
            L_0x0071:
                r8 = r6
            L_0x0072:
                if (r8 != r7) goto L_0x00b4
                int r9 = r12.f15833e
                int r9 = r9 + 1
                m.m0.j.c[] r10 = r12.f15832d
                int r10 = r10.length
            L_0x007b:
                if (r9 >= r10) goto L_0x00b4
                m.m0.j.c[] r11 = r12.f15832d
                r11 = r11[r9]
                p298d.p344x.p346c.C6888i.m12436c(r11)
                n.h r11 = r11.f15816b
                boolean r11 = p298d.p344x.p346c.C6888i.m12434a(r11, r4)
                if (r11 == 0) goto L_0x00b1
                m.m0.j.c[] r11 = r12.f15832d
                r11 = r11[r9]
                p298d.p344x.p346c.C6888i.m12436c(r11)
                n.h r11 = r11.f15817c
                boolean r11 = p298d.p344x.p346c.C6888i.m12434a(r11, r5)
                if (r11 == 0) goto L_0x00a5
                int r8 = r12.f15833e
                int r9 = r9 - r8
                m.m0.j.d r8 = p421m.p422m0.p429j.C7925d.f15820c
                m.m0.j.c[] r8 = p421m.p422m0.p429j.C7925d.f15818a
                int r8 = r8.length
                int r8 = r8 + r9
                goto L_0x00b4
            L_0x00a5:
                if (r6 != r7) goto L_0x00b1
                int r6 = r12.f15833e
                int r6 = r9 - r6
                m.m0.j.d r11 = p421m.p422m0.p429j.C7925d.f15820c
                m.m0.j.c[] r11 = p421m.p422m0.p429j.C7925d.f15818a
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00b1:
                int r9 = r9 + 1
                goto L_0x007b
            L_0x00b4:
                if (r8 == r7) goto L_0x00be
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.mo25689f(r8, r3, r4)
                goto L_0x00fd
            L_0x00be:
                r8 = 64
                if (r6 != r7) goto L_0x00cb
                n.e r6 = r12.f15838j
                r6.mo25940v0(r8)
                r12.mo25687d(r4)
                goto L_0x00f7
            L_0x00cb:
                n.h r7 = p421m.p422m0.p429j.C7924c.f15809d
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "prefix"
                p298d.p344x.p346c.C6888i.m12438e(r7, r9)
                int r9 = r7.mo25959l()
                boolean r7 = r4.mo25964v(r1, r7, r1, r9)
                if (r7 == 0) goto L_0x00f2
                n.h r7 = p421m.p422m0.p429j.C7924c.f15814i
                boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r7, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00f2
                r3 = 15
                r12.mo25689f(r6, r3, r1)
                r12.mo25687d(r5)
                goto L_0x00fd
            L_0x00f2:
                r4 = 63
                r12.mo25689f(r6, r4, r8)
            L_0x00f7:
                r12.mo25687d(r5)
                r12.mo25686c(r3)
            L_0x00fd:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7925d.C7927b.mo25688e(java.util.List):void");
        }

        /* renamed from: f */
        public final void mo25689f(int i, int i2, int i3) {
            int i4;
            C8040e eVar;
            if (i < i2) {
                eVar = this.f15838j;
                i4 = i | i3;
            } else {
                this.f15838j.mo25940v0(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f15838j.mo25940v0(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                eVar = this.f15838j;
            }
            eVar.mo25940v0(i4);
        }
    }

    static {
        C7924c cVar = new C7924c(C7924c.f15814i, "");
        C8044h hVar = C7924c.f15811f;
        C8044h hVar2 = C7924c.f15812g;
        C8044h hVar3 = C7924c.f15813h;
        C8044h hVar4 = C7924c.f15810e;
        C7924c[] cVarArr = {cVar, new C7924c(hVar, "GET"), new C7924c(hVar, "POST"), new C7924c(hVar2, "/"), new C7924c(hVar2, "/index.html"), new C7924c(hVar3, "http"), new C7924c(hVar3, "https"), new C7924c(hVar4, "200"), new C7924c(hVar4, "204"), new C7924c(hVar4, "206"), new C7924c(hVar4, "304"), new C7924c(hVar4, "400"), new C7924c(hVar4, "404"), new C7924c(hVar4, "500"), new C7924c("accept-charset", ""), new C7924c("accept-encoding", "gzip, deflate"), new C7924c("accept-language", ""), new C7924c("accept-ranges", ""), new C7924c("accept", ""), new C7924c("access-control-allow-origin", ""), new C7924c("age", ""), new C7924c("allow", ""), new C7924c("authorization", ""), new C7924c("cache-control", ""), new C7924c("content-disposition", ""), new C7924c("content-encoding", ""), new C7924c("content-language", ""), new C7924c("content-length", ""), new C7924c("content-location", ""), new C7924c("content-range", ""), new C7924c("content-type", ""), new C7924c("cookie", ""), new C7924c("date", ""), new C7924c("etag", ""), new C7924c("expect", ""), new C7924c("expires", ""), new C7924c("from", ""), new C7924c("host", ""), new C7924c("if-match", ""), new C7924c("if-modified-since", ""), new C7924c("if-none-match", ""), new C7924c("if-range", ""), new C7924c("if-unmodified-since", ""), new C7924c("last-modified", ""), new C7924c("link", ""), new C7924c("location", ""), new C7924c("max-forwards", ""), new C7924c("proxy-authenticate", ""), new C7924c("proxy-authorization", ""), new C7924c("range", ""), new C7924c("referer", ""), new C7924c("refresh", ""), new C7924c("retry-after", ""), new C7924c("server", ""), new C7924c("set-cookie", ""), new C7924c("strict-transport-security", ""), new C7924c("transfer-encoding", ""), new C7924c("user-agent", ""), new C7924c("vary", ""), new C7924c("via", ""), new C7924c("www-authenticate", "")};
        f15818a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i = 0; i < length; i++) {
            C7924c[] cVarArr2 = f15818a;
            if (!linkedHashMap.containsKey(cVarArr2[i].f15816b)) {
                linkedHashMap.put(cVarArr2[i].f15816b, Integer.valueOf(i));
            }
        }
        Map<C8044h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C6888i.m12437d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f15819b = unmodifiableMap;
    }

    /* renamed from: a */
    public final C8044h mo25676a(C8044h hVar) {
        C6888i.m12438e(hVar, "name");
        int l = hVar.mo25959l();
        for (int i = 0; i < l; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte s = hVar.mo25962s(i);
            if (b <= s && b2 >= s) {
                StringBuilder u = C0843a.m460u("PROTOCOL_ERROR response malformed: mixed case name: ");
                u.append(hVar.mo25968z());
                throw new IOException(u.toString());
            }
        }
        return hVar;
    }
}
