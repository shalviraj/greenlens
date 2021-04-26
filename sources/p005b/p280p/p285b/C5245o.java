package p005b.p280p.p285b;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.badge.BadgeDrawable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p435n.C8040e;

/* renamed from: b.p.b.o */
public final class C5245o {

    /* renamed from: j */
    public static final char[] f10419j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f10420a;

    /* renamed from: b */
    public final String f10421b;

    /* renamed from: c */
    public final String f10422c;

    /* renamed from: d */
    public final String f10423d;

    /* renamed from: e */
    public final int f10424e;

    /* renamed from: f */
    public final List<String> f10425f;

    /* renamed from: g */
    public final List<String> f10426g;

    /* renamed from: h */
    public final String f10427h;

    /* renamed from: i */
    public final String f10428i;

    /* renamed from: b.p.b.o$b */
    public static final class C5247b {

        /* renamed from: a */
        public String f10429a;

        /* renamed from: b */
        public String f10430b = "";

        /* renamed from: c */
        public String f10431c = "";

        /* renamed from: d */
        public String f10432d;

        /* renamed from: e */
        public int f10433e = -1;

        /* renamed from: f */
        public final List<String> f10434f;

        /* renamed from: g */
        public List<String> f10435g;

        /* renamed from: h */
        public String f10436h;

        /* renamed from: b.p.b.o$b$a */
        public enum C5248a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public C5247b() {
            ArrayList arrayList = new ArrayList();
            this.f10434f = arrayList;
            arrayList.add("");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0180, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
            r4 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
            if ((r13 - r11) != 0) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f5, code lost:
            if (r9 == r0) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f7, code lost:
            if (r10 != -1) goto L_0x00fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fc, code lost:
            r1 = r9 - r10;
            java.lang.System.arraycopy(r7, r10, r7, 16 - r1, r1);
            r0 = 0;
            java.util.Arrays.fill(r7, r10, (16 - r9) + r10, (byte) 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            r1 = java.net.InetAddress.getByAddress(r7);
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m9735d(java.lang.String r16, int r17, int r18) {
            /*
                r0 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                java.lang.String r1 = p005b.p280p.p285b.C5245o.m9724m(r1, r2, r3, r0)
                java.lang.String r2 = "["
                boolean r2 = r1.startsWith(r2)
                r4 = 1
                r5 = -1
                if (r2 == 0) goto L_0x0181
                java.lang.String r2 = "]"
                boolean r2 = r1.endsWith(r2)
                if (r2 == 0) goto L_0x0181
                int r2 = r1.length()
                int r2 = r2 - r4
                r6 = 16
                byte[] r7 = new byte[r6]
                r9 = r0
                r8 = r4
                r10 = r5
                r11 = r10
            L_0x002a:
                r12 = 255(0xff, float:3.57E-43)
                if (r8 >= r2) goto L_0x00f4
                if (r9 != r6) goto L_0x0032
                goto L_0x00bf
            L_0x0032:
                int r13 = r8 + 2
                r14 = 4
                if (r13 > r2) goto L_0x0050
                java.lang.String r15 = "::"
                r3 = 2
                boolean r3 = r1.regionMatches(r8, r15, r0, r3)
                if (r3 == 0) goto L_0x0050
                if (r10 == r5) goto L_0x0044
                goto L_0x00bf
            L_0x0044:
                int r9 = r9 + 2
                if (r13 != r2) goto L_0x004c
                r0 = r6
                r10 = r9
                goto L_0x00f5
            L_0x004c:
                r10 = r9
                r11 = r13
                goto L_0x00c3
            L_0x0050:
                if (r9 == 0) goto L_0x00c2
                java.lang.String r3 = ":"
                boolean r3 = r1.regionMatches(r8, r3, r0, r4)
                if (r3 == 0) goto L_0x005e
                int r8 = r8 + 1
                goto L_0x00c2
            L_0x005e:
                java.lang.String r3 = "."
                boolean r3 = r1.regionMatches(r8, r3, r0, r4)
                if (r3 == 0) goto L_0x00bf
                int r3 = r9 + -2
                r8 = r3
            L_0x0069:
                if (r11 >= r2) goto L_0x00b1
                if (r8 != r6) goto L_0x006e
                goto L_0x0078
            L_0x006e:
                if (r8 == r3) goto L_0x007c
                char r13 = r1.charAt(r11)
                r15 = 46
                if (r13 == r15) goto L_0x007a
            L_0x0078:
                r4 = r0
                goto L_0x00b7
            L_0x007a:
                int r11 = r11 + 1
            L_0x007c:
                r15 = r0
                r13 = r11
            L_0x007e:
                if (r13 >= r2) goto L_0x00a0
                char r4 = r1.charAt(r13)
                r0 = 48
                if (r4 < r0) goto L_0x00a0
                r6 = 57
                if (r4 <= r6) goto L_0x008d
                goto L_0x00a0
            L_0x008d:
                if (r15 != 0) goto L_0x0092
                if (r11 == r13) goto L_0x0092
                goto L_0x00b4
            L_0x0092:
                int r15 = r15 * 10
                int r15 = r15 + r4
                int r15 = r15 - r0
                if (r15 <= r12) goto L_0x0099
                goto L_0x00b4
            L_0x0099:
                int r13 = r13 + 1
                r0 = 0
                r4 = 1
                r6 = 16
                goto L_0x007e
            L_0x00a0:
                int r0 = r13 - r11
                if (r0 != 0) goto L_0x00a5
                goto L_0x00b4
            L_0x00a5:
                int r0 = r8 + 1
                byte r4 = (byte) r15
                r7[r8] = r4
                r8 = r0
                r11 = r13
                r0 = 0
                r4 = 1
                r6 = 16
                goto L_0x0069
            L_0x00b1:
                int r3 = r3 + r14
                if (r8 == r3) goto L_0x00b6
            L_0x00b4:
                r4 = 0
                goto L_0x00b7
            L_0x00b6:
                r4 = 1
            L_0x00b7:
                if (r4 != 0) goto L_0x00ba
                goto L_0x00bf
            L_0x00ba:
                int r9 = r9 + 2
                r0 = 16
                goto L_0x00f5
            L_0x00bf:
                r0 = 16
                goto L_0x00f9
            L_0x00c2:
                r11 = r8
            L_0x00c3:
                r8 = r11
                r0 = 0
            L_0x00c5:
                if (r8 >= r2) goto L_0x00d8
                char r3 = r1.charAt(r8)
                int r3 = p005b.p280p.p285b.C5245o.m9719c(r3)
                if (r3 != r5) goto L_0x00d2
                goto L_0x00d8
            L_0x00d2:
                int r0 = r0 << 4
                int r0 = r0 + r3
                int r8 = r8 + 1
                goto L_0x00c5
            L_0x00d8:
                int r3 = r8 - r11
                if (r3 == 0) goto L_0x00bf
                if (r3 <= r14) goto L_0x00df
                goto L_0x00bf
            L_0x00df:
                int r3 = r9 + 1
                int r4 = r0 >>> 8
                r4 = r4 & r12
                byte r4 = (byte) r4
                r7[r9] = r4
                int r9 = r3 + 1
                r0 = r0 & 255(0xff, float:3.57E-43)
                byte r0 = (byte) r0
                r7[r3] = r0
                r0 = 0
                r4 = 1
                r6 = 16
                goto L_0x002a
            L_0x00f4:
                r0 = r6
            L_0x00f5:
                if (r9 == r0) goto L_0x010b
                if (r10 != r5) goto L_0x00fc
            L_0x00f9:
                r0 = 0
                r1 = 0
                goto L_0x0110
            L_0x00fc:
                int r1 = r9 - r10
                int r2 = 16 - r1
                java.lang.System.arraycopy(r7, r10, r7, r2, r1)
                int r6 = 16 - r9
                int r6 = r6 + r10
                r0 = 0
                java.util.Arrays.fill(r7, r10, r6, r0)
                goto L_0x010c
            L_0x010b:
                r0 = 0
            L_0x010c:
                java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r7)     // Catch:{ UnknownHostException -> 0x017b }
            L_0x0110:
                if (r1 != 0) goto L_0x0114
                r2 = 0
                return r2
            L_0x0114:
                byte[] r1 = r1.getAddress()
                int r2 = r1.length
                r3 = 16
                if (r2 != r3) goto L_0x0175
                r2 = r0
                r4 = r2
            L_0x011f:
                int r6 = r1.length
                if (r2 >= r6) goto L_0x013f
                r6 = r2
            L_0x0123:
                if (r6 >= r3) goto L_0x0134
                byte r3 = r1[r6]
                if (r3 != 0) goto L_0x0134
                int r3 = r6 + 1
                byte r3 = r1[r3]
                if (r3 != 0) goto L_0x0134
                int r6 = r6 + 2
                r3 = 16
                goto L_0x0123
            L_0x0134:
                int r3 = r6 - r2
                if (r3 <= r4) goto L_0x013a
                r5 = r2
                r4 = r3
            L_0x013a:
                int r2 = r6 + 2
                r3 = 16
                goto L_0x011f
            L_0x013f:
                n.e r2 = new n.e
                r2.<init>()
            L_0x0144:
                int r3 = r1.length
                if (r0 >= r3) goto L_0x0170
                r3 = 58
                if (r0 != r5) goto L_0x0157
                r2.mo25940v0(r3)
                int r0 = r0 + r4
                r6 = 16
                if (r0 != r6) goto L_0x0144
                r2.mo25940v0(r3)
                goto L_0x0144
            L_0x0157:
                r6 = 16
                if (r0 <= 0) goto L_0x015e
                r2.mo25940v0(r3)
            L_0x015e:
                byte r3 = r1[r0]
                r3 = r3 & r12
                int r3 = r3 << 8
                int r7 = r0 + 1
                byte r7 = r1[r7]
                r7 = r7 & r12
                r3 = r3 | r7
                long r7 = (long) r3
                r2.mo25920o(r7)
                int r0 = r0 + 2
                goto L_0x0144
            L_0x0170:
                java.lang.String r0 = r2.mo25919n0()
                return r0
            L_0x0175:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x017b:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0181:
                r2 = 0
                java.lang.String r1 = java.net.IDN.toASCII(r1)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                java.util.Locale r3 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x01b9 }
                java.lang.String r1 = r1.toLowerCase(r3)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                boolean r3 = r1.isEmpty()     // Catch:{ IllegalArgumentException -> 0x01b9 }
                if (r3 == 0) goto L_0x0193
                goto L_0x01b9
            L_0x0193:
                r3 = r0
            L_0x0194:
                int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x01b9 }
                if (r3 >= r4) goto L_0x01b4
                char r4 = r1.charAt(r3)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                r6 = 31
                if (r4 <= r6) goto L_0x01b3
                r6 = 127(0x7f, float:1.78E-43)
                if (r4 < r6) goto L_0x01a7
                goto L_0x01b3
            L_0x01a7:
                java.lang.String r6 = " #%/:?@[\\]"
                int r4 = r6.indexOf(r4)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                if (r4 == r5) goto L_0x01b0
                goto L_0x01b3
            L_0x01b0:
                int r3 = r3 + 1
                goto L_0x0194
            L_0x01b3:
                r0 = 1
            L_0x01b4:
                if (r0 == 0) goto L_0x01b7
                goto L_0x01b9
            L_0x01b7:
                r3 = r1
                goto L_0x01ba
            L_0x01b9:
                r3 = r2
            L_0x01ba:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.C5245o.C5247b.m9735d(java.lang.String, int, int):java.lang.String");
        }

        /* renamed from: a */
        public C5247b mo17175a(String str) {
            mo17180g(str, 0, str.length(), false, true);
            return this;
        }

        /* renamed from: b */
        public C5247b mo17176b(String str) {
            mo17180g(str, 0, str.length(), false, false);
            return this;
        }

        /* renamed from: c */
        public C5245o mo17177c() {
            if (this.f10429a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f10432d != null) {
                return new C5245o(this, (C5246a) null);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* renamed from: e */
        public C5247b mo17178e(String str) {
            this.f10435g = str != null ? C5245o.m9726p(C5245o.m9718b(str, " \"'<>#", true, true, true)) : null;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f9, code lost:
            if (r1 <= 65535) goto L_0x01fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008b, code lost:
            if (r7 == ':') goto L_0x0092;
         */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x0205  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0211  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0214  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x01d8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x0281 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0139  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p005b.p280p.p285b.C5245o.C5247b.C5248a mo17179f(p005b.p280p.p285b.C5245o r19, java.lang.String r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r8 = r20
                int r2 = r20.length()
                r3 = 0
            L_0x000b:
                r4 = 32
                r5 = 13
                r6 = 12
                r7 = 10
                r9 = 9
                if (r3 >= r2) goto L_0x002a
                char r10 = r8.charAt(r3)
                if (r10 == r9) goto L_0x0027
                if (r10 == r7) goto L_0x0027
                if (r10 == r6) goto L_0x0027
                if (r10 == r5) goto L_0x0027
                if (r10 == r4) goto L_0x0027
                r10 = r3
                goto L_0x002b
            L_0x0027:
                int r3 = r3 + 1
                goto L_0x000b
            L_0x002a:
                r10 = r2
            L_0x002b:
                int r2 = r20.length()
                r11 = -1
                int r2 = r2 + r11
            L_0x0031:
                r12 = 1
                if (r2 < r10) goto L_0x0048
                char r3 = r8.charAt(r2)
                if (r3 == r9) goto L_0x0045
                if (r3 == r7) goto L_0x0045
                if (r3 == r6) goto L_0x0045
                if (r3 == r5) goto L_0x0045
                if (r3 == r4) goto L_0x0045
                int r2 = r2 + r12
                r9 = r2
                goto L_0x0049
            L_0x0045:
                int r2 = r2 + -1
                goto L_0x0031
            L_0x0048:
                r9 = r10
            L_0x0049:
                int r2 = r9 - r10
                r13 = 58
                r14 = 2
                if (r2 >= r14) goto L_0x0051
                goto L_0x0091
            L_0x0051:
                char r2 = r8.charAt(r10)
                r3 = 122(0x7a, float:1.71E-43)
                r4 = 65
                r5 = 97
                r6 = 90
                if (r2 < r5) goto L_0x0061
                if (r2 <= r3) goto L_0x0066
            L_0x0061:
                if (r2 < r4) goto L_0x0091
                if (r2 <= r6) goto L_0x0066
                goto L_0x0091
            L_0x0066:
                r2 = r10
            L_0x0067:
                int r2 = r2 + r12
                if (r2 >= r9) goto L_0x0091
                char r7 = r8.charAt(r2)
                if (r7 < r5) goto L_0x0072
                if (r7 <= r3) goto L_0x008e
            L_0x0072:
                if (r7 < r4) goto L_0x0076
                if (r7 <= r6) goto L_0x008e
            L_0x0076:
                r3 = 48
                if (r7 < r3) goto L_0x007e
                r3 = 57
                if (r7 <= r3) goto L_0x008e
            L_0x007e:
                r3 = 43
                if (r7 == r3) goto L_0x008e
                r3 = 45
                if (r7 == r3) goto L_0x008e
                r3 = 46
                if (r7 != r3) goto L_0x008b
                goto L_0x008e
            L_0x008b:
                if (r7 != r13) goto L_0x0091
                goto L_0x0092
            L_0x008e:
                r3 = 122(0x7a, float:1.71E-43)
                goto L_0x0067
            L_0x0091:
                r2 = r11
            L_0x0092:
                if (r2 == r11) goto L_0x00c1
                r3 = 1
                r6 = 0
                r7 = 6
                java.lang.String r5 = "https:"
                r2 = r20
                r4 = r10
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x00a9
                java.lang.String r2 = "https"
                r0.f10429a = r2
                int r10 = r10 + 6
                goto L_0x00c7
            L_0x00a9:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r20
                r4 = r10
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x00be
                java.lang.String r2 = "http"
                r0.f10429a = r2
                int r10 = r10 + 5
                goto L_0x00c7
            L_0x00be:
                b.p.b.o$b$a r1 = p005b.p280p.p285b.C5245o.C5247b.C5248a.UNSUPPORTED_SCHEME
                return r1
            L_0x00c1:
                if (r1 == 0) goto L_0x02c2
                java.lang.String r2 = r1.f10420a
                r0.f10429a = r2
            L_0x00c7:
                r2 = 0
                r3 = r10
            L_0x00c9:
                r4 = 92
                r5 = 47
                if (r3 >= r9) goto L_0x00dc
                char r6 = r8.charAt(r3)
                if (r6 == r4) goto L_0x00d7
                if (r6 != r5) goto L_0x00dc
            L_0x00d7:
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L_0x00c9
            L_0x00dc:
                r3 = 63
                r6 = 35
                if (r2 >= r14) goto L_0x0122
                if (r1 == 0) goto L_0x0122
                java.lang.String r7 = r1.f10420a
                java.lang.String r14 = r0.f10429a
                boolean r7 = r7.equals(r14)
                if (r7 != 0) goto L_0x00ef
                goto L_0x0122
            L_0x00ef:
                java.lang.String r2 = r19.mo17169i()
                r0.f10430b = r2
                java.lang.String r2 = r19.mo17165f()
                r0.f10431c = r2
                java.lang.String r2 = r1.f10423d
                r0.f10432d = r2
                int r2 = r1.f10424e
                r0.f10433e = r2
                java.util.List<java.lang.String> r2 = r0.f10434f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f10434f
                java.util.List r3 = r19.mo17166g()
                r2.addAll(r3)
                if (r10 == r9) goto L_0x0119
                char r2 = r8.charAt(r10)
                if (r2 != r6) goto L_0x0215
            L_0x0119:
                java.lang.String r1 = r19.mo17167h()
                r0.mo17178e(r1)
                goto L_0x0215
            L_0x0122:
                int r10 = r10 + r2
                r1 = 0
                r2 = 0
                r17 = r10
                r10 = r1
                r1 = r11
                r11 = r2
                r2 = r17
            L_0x012c:
                java.lang.String r7 = "@/\\?#"
                int r14 = p005b.p280p.p285b.C5245o.m9721e(r8, r2, r9, r7)
                if (r14 == r9) goto L_0x0139
                char r7 = r8.charAt(r14)
                goto L_0x013a
            L_0x0139:
                r7 = r1
            L_0x013a:
                if (r7 == r1) goto L_0x01b9
                if (r7 == r6) goto L_0x01b9
                if (r7 == r5) goto L_0x01b9
                if (r7 == r4) goto L_0x01b9
                if (r7 == r3) goto L_0x01b9
                r1 = 64
                if (r7 == r1) goto L_0x0149
                goto L_0x01ab
            L_0x0149:
                java.lang.String r15 = "%40"
                if (r10 != 0) goto L_0x0187
                java.lang.String r1 = ":"
                int r7 = p005b.p280p.p285b.C5245o.m9721e(r8, r2, r14, r1)
                r5 = 1
                r6 = 0
                r16 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r20
                r3 = r7
                r13 = r7
                r7 = r16
                java.lang.String r1 = p005b.p280p.p285b.C5245o.m9717a(r1, r2, r3, r4, r5, r6, r7)
                if (r11 == 0) goto L_0x0170
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f10430b
                java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m456q(r2, r3, r15, r1)
            L_0x0170:
                r0.f10430b = r1
                if (r13 == r14) goto L_0x0185
                int r2 = r13 + 1
                r5 = 1
                r6 = 0
                r7 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r20
                r3 = r14
                java.lang.String r1 = p005b.p280p.p285b.C5245o.m9717a(r1, r2, r3, r4, r5, r6, r7)
                r0.f10431c = r1
                r10 = r12
            L_0x0185:
                r11 = r12
                goto L_0x01a9
            L_0x0187:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r1 = r0.f10431c
                r12.append(r1)
                r12.append(r15)
                r5 = 1
                r6 = 0
                r7 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r20
                r3 = r14
                java.lang.String r1 = p005b.p280p.p285b.C5245o.m9717a(r1, r2, r3, r4, r5, r6, r7)
                r12.append(r1)
                java.lang.String r1 = r12.toString()
                r0.f10431c = r1
            L_0x01a9:
                int r2 = r14 + 1
            L_0x01ab:
                r6 = 35
                r3 = 63
                r5 = 47
                r4 = 92
                r1 = -1
                r12 = 1
                r13 = 58
                goto L_0x012c
            L_0x01b9:
                r1 = r2
            L_0x01ba:
                if (r1 >= r14) goto L_0x01d8
                char r3 = r8.charAt(r1)
                r4 = 58
                if (r3 == r4) goto L_0x01d9
                r5 = 91
                if (r3 == r5) goto L_0x01ca
                r3 = 1
                goto L_0x01d6
            L_0x01ca:
                r3 = 1
            L_0x01cb:
                int r1 = r1 + r3
                if (r1 >= r14) goto L_0x01d6
                char r5 = r8.charAt(r1)
                r6 = 93
                if (r5 != r6) goto L_0x01cb
            L_0x01d6:
                int r1 = r1 + r3
                goto L_0x01ba
            L_0x01d8:
                r1 = r14
            L_0x01d9:
                int r3 = r1 + 1
                java.lang.String r1 = m9735d(r8, r2, r1)
                r0.f10432d = r1
                if (r3 >= r14) goto L_0x0205
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 1
                r1 = r20
                r2 = r3
                r3 = r14
                java.lang.String r1 = p005b.p280p.p285b.C5245o.m9717a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ NumberFormatException -> 0x01fc }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01fc }
                if (r1 <= 0) goto L_0x01fc
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x01fc
                goto L_0x01fd
            L_0x01fc:
                r1 = -1
            L_0x01fd:
                r0.f10433e = r1
                r2 = -1
                if (r1 != r2) goto L_0x020d
                b.p.b.o$b$a r1 = p005b.p280p.p285b.C5245o.C5247b.C5248a.INVALID_PORT
                return r1
            L_0x0205:
                java.lang.String r1 = r0.f10429a
                int r1 = p005b.p280p.p285b.C5245o.m9720d(r1)
                r0.f10433e = r1
            L_0x020d:
                java.lang.String r1 = r0.f10432d
                if (r1 != 0) goto L_0x0214
                b.p.b.o$b$a r1 = p005b.p280p.p285b.C5245o.C5247b.C5248a.INVALID_HOST
                return r1
            L_0x0214:
                r10 = r14
            L_0x0215:
                java.lang.String r1 = "?#"
                int r1 = p005b.p280p.p285b.C5245o.m9721e(r8, r10, r9, r1)
                if (r10 != r1) goto L_0x0224
                r12 = r0
                r3 = r1
                r1 = r8
                r14 = r9
                r9 = r1
                goto L_0x0282
            L_0x0224:
                char r2 = r8.charAt(r10)
                java.lang.String r3 = ""
                r4 = 47
                if (r2 == r4) goto L_0x0246
                r4 = 92
                if (r2 != r4) goto L_0x0233
                goto L_0x0246
            L_0x0233:
                java.util.List<java.lang.String> r2 = r0.f10434f
                int r4 = r2.size()
                int r4 = r4 + -1
                r2.set(r4, r3)
                r11 = r0
                r12 = r11
                r3 = r1
                r4 = r3
                r1 = r8
                r2 = r1
                r13 = r2
                goto L_0x025c
            L_0x0246:
                r2 = 1
                java.util.List<java.lang.String> r4 = r0.f10434f
                r4.clear()
                java.util.List<java.lang.String> r4 = r0.f10434f
                r4.add(r3)
                r6 = r0
                r7 = r6
                r3 = r1
                r4 = r3
                r5 = r2
                r1 = r8
                r2 = r1
            L_0x0258:
                int r10 = r10 + r5
                r11 = r6
                r12 = r7
                r13 = r8
            L_0x025c:
                r14 = r9
                r7 = r10
            L_0x025e:
                if (r7 >= r4) goto L_0x0281
                java.lang.String r5 = "/\\"
                int r15 = p005b.p280p.p285b.C5245o.m9721e(r13, r7, r4, r5)
                if (r15 >= r4) goto L_0x026a
                r5 = 1
                goto L_0x026b
            L_0x026a:
                r5 = 0
            L_0x026b:
                r16 = r5
                r10 = 1
                r5 = r11
                r6 = r13
                r8 = r15
                r9 = r16
                r5.mo17180g(r6, r7, r8, r9, r10)
                if (r16 == 0) goto L_0x027f
                r5 = 1
                r6 = r11
                r7 = r12
                r8 = r13
                r9 = r14
                r10 = r15
                goto L_0x0258
            L_0x027f:
                r7 = r15
                goto L_0x025e
            L_0x0281:
                r9 = r2
            L_0x0282:
                if (r3 >= r14) goto L_0x02a6
                char r2 = r1.charAt(r3)
                r4 = 63
                if (r2 != r4) goto L_0x02a6
                java.lang.String r2 = "#"
                int r10 = p005b.p280p.p285b.C5245o.m9721e(r1, r3, r14, r2)
                int r3 = r3 + 1
                r6 = 1
                r7 = 1
                r8 = 1
                java.lang.String r5 = " \"'<>#"
                r2 = r9
                r4 = r10
                java.lang.String r2 = p005b.p280p.p285b.C5245o.m9717a(r2, r3, r4, r5, r6, r7, r8)
                java.util.List r2 = p005b.p280p.p285b.C5245o.m9726p(r2)
                r12.f10435g = r2
                r3 = r10
            L_0x02a6:
                if (r3 >= r14) goto L_0x02bf
                char r1 = r1.charAt(r3)
                r2 = 35
                if (r1 != r2) goto L_0x02bf
                int r3 = r3 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                java.lang.String r5 = ""
                r2 = r9
                r4 = r14
                java.lang.String r1 = p005b.p280p.p285b.C5245o.m9717a(r2, r3, r4, r5, r6, r7, r8)
                r12.f10436h = r1
            L_0x02bf:
                b.p.b.o$b$a r1 = p005b.p280p.p285b.C5245o.C5247b.C5248a.SUCCESS
                return r1
            L_0x02c2:
                b.p.b.o$b$a r1 = p005b.p280p.p285b.C5245o.C5247b.C5248a.MISSING_SCHEME
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.C5245o.C5247b.mo17179f(b.p.b.o, java.lang.String):b.p.b.o$b$a");
        }

        /* renamed from: g */
        public final void mo17180g(String str, int i, int i2, boolean z, boolean z2) {
            String a = C5245o.m9717a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, true);
            boolean z3 = false;
            if (!(a.equals(".") || a.equalsIgnoreCase("%2e"))) {
                if (a.equals("..") || a.equalsIgnoreCase("%2e.") || a.equalsIgnoreCase(".%2e") || a.equalsIgnoreCase("%2e%2e")) {
                    z3 = true;
                }
                if (z3) {
                    List<String> list = this.f10434f;
                    if (!list.remove(list.size() - 1).isEmpty() || this.f10434f.isEmpty()) {
                        this.f10434f.add("");
                        return;
                    }
                    List<String> list2 = this.f10434f;
                    list2.set(list2.size() - 1, "");
                    return;
                }
                if (((String) C0843a.m437M(this.f10434f, 1)).isEmpty()) {
                    List<String> list3 = this.f10434f;
                    list3.set(list3.size() - 1, a);
                } else {
                    this.f10434f.add(a);
                }
                if (z) {
                    this.f10434f.add("");
                }
            }
        }

        /* renamed from: h */
        public C5247b mo17181h() {
            int size = this.f10434f.size();
            for (int i = 0; i < size; i++) {
                this.f10434f.set(i, C5245o.m9718b(this.f10434f.get(i), "[]", true, false, true));
            }
            List<String> list = this.f10435g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f10435g.get(i2);
                    if (str != null) {
                        this.f10435g.set(i2, C5245o.m9718b(str, "\\^`{|}", true, true, true));
                    }
                }
            }
            String str2 = this.f10436h;
            if (str2 != null) {
                this.f10436h = C5245o.m9718b(str2, " \"#<>\\^`{|}", true, false, false);
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10429a);
            sb.append("://");
            if (!this.f10430b.isEmpty() || !this.f10431c.isEmpty()) {
                sb.append(this.f10430b);
                if (!this.f10431c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f10431c);
                }
                sb.append('@');
            }
            if (this.f10432d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f10432d);
                sb.append(']');
            } else {
                sb.append(this.f10432d);
            }
            int i = this.f10433e;
            if (i == -1) {
                i = C5245o.m9720d(this.f10429a);
            }
            if (i != C5245o.m9720d(this.f10429a)) {
                sb.append(':');
                sb.append(i);
            }
            List<String> list = this.f10434f;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append(list.get(i2));
            }
            if (this.f10435g != null) {
                sb.append('?');
                C5245o.m9722j(sb, this.f10435g);
            }
            if (this.f10436h != null) {
                sb.append('#');
                sb.append(this.f10436h);
            }
            return sb.toString();
        }
    }

    public C5245o(C5247b bVar, C5246a aVar) {
        this.f10420a = bVar.f10429a;
        this.f10421b = m9725n(bVar.f10430b, false);
        this.f10422c = m9725n(bVar.f10431c, false);
        this.f10423d = bVar.f10432d;
        int i = bVar.f10433e;
        this.f10424e = i == -1 ? m9720d(bVar.f10429a) : i;
        this.f10425f = mo17171o(bVar.f10434f, false);
        List<String> list = bVar.f10435g;
        String str = null;
        this.f10426g = list != null ? mo17171o(list, true) : null;
        String str2 = bVar.f10436h;
        this.f10427h = str2 != null ? m9724m(str2, 0, str2.length(), false) : str;
        this.f10428i = bVar.toString();
    }

    /* renamed from: a */
    public static String m9717a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        String str3 = str;
        int i3 = i2;
        String str4 = str2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str3.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (codePointAt == 43 && z2)))) {
                C8040e eVar = new C8040e();
                eVar.mo25883A0(str3, i, i4);
                C8040e eVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str3.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z2) {
                            eVar.mo25947z0(z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (eVar2 == null) {
                                eVar2 = new C8040e();
                            }
                            eVar2.mo25884B0(codePointAt2);
                            while (!eVar2.mo25886D()) {
                                byte readByte = eVar2.readByte() & ExifInterface.MARKER;
                                eVar.mo25940v0(37);
                                char[] cArr = f10419j;
                                eVar.mo25940v0(cArr[(readByte >> 4) & 15]);
                                eVar.mo25940v0(cArr[readByte & 15]);
                            }
                        } else {
                            eVar.mo25884B0(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return eVar.mo25919n0();
            }
            i4 += Character.charCount(codePointAt);
        }
        int i5 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    public static String m9718b(String str, String str2, boolean z, boolean z2, boolean z3) {
        return m9717a(str, 0, str.length(), str2, z, z2, z3);
    }

    /* renamed from: c */
    public static int m9719c(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: d */
    public static int m9720d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: e */
    public static int m9721e(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: j */
    public static void m9722j(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: l */
    public static C5245o m9723l(String str) {
        C5247b bVar = new C5247b();
        if (bVar.mo17179f((C5245o) null, str) == C5247b.C5248a.SUCCESS) {
            return bVar.mo17177c();
        }
        return null;
    }

    /* renamed from: m */
    public static String m9724m(String str, int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                C8040e eVar = new C8040e();
                eVar.mo25883A0(str, i, i4);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i3 = i4 + 2) < i2) {
                        int c = m9719c(str.charAt(i4 + 1));
                        int c2 = m9719c(str.charAt(i3));
                        if (!(c == -1 || c2 == -1)) {
                            eVar.mo25940v0((c << 4) + c2);
                            i4 = i3;
                            i4 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        eVar.mo25940v0(32);
                        i4 += Character.charCount(codePointAt);
                    }
                    eVar.mo25884B0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
                return eVar.mo25919n0();
            }
            i4++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: n */
    public static String m9725n(String str, boolean z) {
        return m9724m(str, 0, str.length(), z);
    }

    /* renamed from: p */
    public static List<String> m9726p(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5245o) && ((C5245o) obj).f10428i.equals(this.f10428i);
    }

    /* renamed from: f */
    public String mo17165f() {
        if (this.f10422c.isEmpty()) {
            return "";
        }
        int indexOf = this.f10428i.indexOf(64);
        return this.f10428i.substring(this.f10428i.indexOf(58, this.f10420a.length() + 3) + 1, indexOf);
    }

    /* renamed from: g */
    public List<String> mo17166g() {
        int indexOf = this.f10428i.indexOf(47, this.f10420a.length() + 3);
        String str = this.f10428i;
        int e = m9721e(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < e) {
            int i = indexOf + 1;
            int e2 = m9721e(this.f10428i, i, e, "/");
            arrayList.add(this.f10428i.substring(i, e2));
            indexOf = e2;
        }
        return arrayList;
    }

    /* renamed from: h */
    public String mo17167h() {
        if (this.f10426g == null) {
            return null;
        }
        int indexOf = this.f10428i.indexOf(63) + 1;
        String str = this.f10428i;
        return this.f10428i.substring(indexOf, m9721e(str, indexOf + 1, str.length(), "#"));
    }

    public int hashCode() {
        return this.f10428i.hashCode();
    }

    /* renamed from: i */
    public String mo17169i() {
        if (this.f10421b.isEmpty()) {
            return "";
        }
        int length = this.f10420a.length() + 3;
        String str = this.f10428i;
        return this.f10428i.substring(length, m9721e(str, length, str.length(), ":@"));
    }

    /* renamed from: k */
    public C5247b mo17170k() {
        C5247b bVar = new C5247b();
        bVar.f10429a = this.f10420a;
        bVar.f10430b = mo17169i();
        bVar.f10431c = mo17165f();
        bVar.f10432d = this.f10423d;
        bVar.f10433e = this.f10424e != m9720d(this.f10420a) ? this.f10424e : -1;
        bVar.f10434f.clear();
        bVar.f10434f.addAll(mo17166g());
        bVar.mo17178e(mo17167h());
        bVar.f10436h = this.f10427h == null ? null : this.f10428i.substring(this.f10428i.indexOf(35) + 1);
        return bVar;
    }

    /* renamed from: o */
    public final List<String> mo17171o(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? m9724m(next, 0, next.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: q */
    public C5245o mo17172q(String str) {
        C5247b bVar = new C5247b();
        if (bVar.mo17179f(this, str) == C5247b.C5248a.SUCCESS) {
            return bVar.mo17177c();
        }
        return null;
    }

    /* renamed from: r */
    public URI mo17173r() {
        try {
            C5247b k = mo17170k();
            k.mo17181h();
            return new URI(k.toString());
        } catch (URISyntaxException unused) {
            StringBuilder u = C0843a.m460u("not valid as a java.net.URI: ");
            u.append(this.f10428i);
            throw new IllegalStateException(u.toString());
        }
    }

    public String toString() {
        return this.f10428i;
    }
}
