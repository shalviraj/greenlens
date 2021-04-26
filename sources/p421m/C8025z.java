package p421m;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.badge.BadgeDrawable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7685a;
import p298d.p415c0.C7694h;
import p421m.p422m0.C7867c;
import p435n.C8040e;

/* renamed from: m.z */
public final class C8025z {

    /* renamed from: k */
    public static final char[] f16100k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l */
    public static final C8028b f16101l = new C8028b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final boolean f16102a;

    /* renamed from: b */
    public final String f16103b;

    /* renamed from: c */
    public final String f16104c;

    /* renamed from: d */
    public final String f16105d;

    /* renamed from: e */
    public final String f16106e;

    /* renamed from: f */
    public final int f16107f;

    /* renamed from: g */
    public final List<String> f16108g;

    /* renamed from: h */
    public final List<String> f16109h;

    /* renamed from: i */
    public final String f16110i;

    /* renamed from: j */
    public final String f16111j;

    /* renamed from: m.z$a */
    public static final class C8026a {

        /* renamed from: i */
        public static final C8027a f16112i = new C8027a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public String f16113a;

        /* renamed from: b */
        public String f16114b = "";

        /* renamed from: c */
        public String f16115c = "";

        /* renamed from: d */
        public String f16116d;

        /* renamed from: e */
        public int f16117e = -1;

        /* renamed from: f */
        public final List<String> f16118f;

        /* renamed from: g */
        public List<String> f16119g;

        /* renamed from: h */
        public String f16120h;

        /* renamed from: m.z$a$a */
        public static final class C8027a {
            public C8027a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public C8026a() {
            ArrayList arrayList = new ArrayList();
            this.f16118f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public final C8025z mo25861a() {
            ArrayList arrayList;
            String str = this.f16113a;
            if (str != null) {
                C8028b bVar = C8025z.f16101l;
                String d = C8028b.m14721d(bVar, this.f16114b, 0, 0, false, 7);
                String d2 = C8028b.m14721d(bVar, this.f16115c, 0, 0, false, 7);
                String str2 = this.f16116d;
                if (str2 != null) {
                    int b = mo25862b();
                    List<String> list = this.f16118f;
                    ArrayList arrayList2 = new ArrayList(C5266a.m9892V(list, 10));
                    for (String d3 : list) {
                        arrayList2.add(C8028b.m14721d(C8025z.f16101l, d3, 0, 0, false, 7));
                    }
                    List<String> list2 = this.f16119g;
                    if (list2 != null) {
                        arrayList = new ArrayList(C5266a.m9892V(list2, 10));
                        for (String str3 : list2) {
                            arrayList.add(str3 != null ? C8028b.m14721d(C8025z.f16101l, str3, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f16120h;
                    return new C8025z(str, d, d2, str2, b, arrayList2, arrayList, str4 != null ? C8028b.m14721d(C8025z.f16101l, str4, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: b */
        public final int mo25862b() {
            int i = this.f16117e;
            if (i != -1) {
                return i;
            }
            String str = this.f16113a;
            C6888i.m12436c(str);
            C6888i.m12438e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: c */
        public final C8026a mo25863c(String str) {
            List<String> list;
            if (str != null) {
                C8028b bVar = C8025z.f16101l;
                list = bVar.mo25868e(C8028b.m14720a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211));
            } else {
                list = null;
            }
            this.f16119g = list;
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: boolean} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0322  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0372  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0376  */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x0417 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x03fc A[SYNTHETIC] */
        /* renamed from: d */
        public final p421m.C8025z.C8026a mo25864d(p421m.C8025z r29, java.lang.String r30) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                r12 = r30
                java.lang.String r2 = "input"
                p298d.p344x.p346c.C6888i.m12438e(r12, r2)
                byte[] r2 = p421m.p422m0.C7867c.f15619a
                int r2 = r30.length()
                r3 = 0
                int r2 = p421m.p422m0.C7867c.m14293n(r12, r3, r2)
                int r4 = r30.length()
                int r13 = p421m.p422m0.C7867c.m14294o(r12, r2, r4)
                int r4 = r13 - r2
                r5 = 2
                r6 = 58
                r14 = -1
                r7 = 1
                if (r4 >= r5) goto L_0x0029
                goto L_0x0082
            L_0x0029:
                char r4 = r12.charAt(r2)
                r8 = 97
                int r9 = p298d.p344x.p346c.C6888i.m12440g(r4, r8)
                r10 = 90
                r11 = 122(0x7a, float:1.71E-43)
                r15 = 65
                if (r9 < 0) goto L_0x0041
                int r9 = p298d.p344x.p346c.C6888i.m12440g(r4, r11)
                if (r9 <= 0) goto L_0x004e
            L_0x0041:
                int r9 = p298d.p344x.p346c.C6888i.m12440g(r4, r15)
                if (r9 < 0) goto L_0x0082
                int r4 = p298d.p344x.p346c.C6888i.m12440g(r4, r10)
                if (r4 <= 0) goto L_0x004e
                goto L_0x0082
            L_0x004e:
                r4 = r2
            L_0x004f:
                int r4 = r4 + r7
                if (r4 >= r13) goto L_0x0082
                char r9 = r12.charAt(r4)
                if (r8 <= r9) goto L_0x0059
                goto L_0x005c
            L_0x0059:
                if (r11 < r9) goto L_0x005c
                goto L_0x007a
            L_0x005c:
                if (r15 <= r9) goto L_0x005f
                goto L_0x0062
            L_0x005f:
                if (r10 < r9) goto L_0x0062
                goto L_0x007a
            L_0x0062:
                r8 = 57
                r10 = 48
                if (r10 <= r9) goto L_0x0069
                goto L_0x006c
            L_0x0069:
                if (r8 < r9) goto L_0x006c
                goto L_0x007a
            L_0x006c:
                r8 = 43
                if (r9 != r8) goto L_0x0071
                goto L_0x007a
            L_0x0071:
                r8 = 45
                if (r9 != r8) goto L_0x0076
                goto L_0x007a
            L_0x0076:
                r8 = 46
                if (r9 != r8) goto L_0x007f
            L_0x007a:
                r8 = 97
                r10 = 90
                goto L_0x004f
            L_0x007f:
                if (r9 != r6) goto L_0x0082
                goto L_0x0083
            L_0x0082:
                r4 = r14
            L_0x0083:
                java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r4 == r14) goto L_0x00c4
                java.lang.String r8 = "https:"
                boolean r8 = p298d.p415c0.C7694h.m13946x(r12, r8, r2, r7)
                if (r8 == 0) goto L_0x0096
                java.lang.String r4 = "https"
                r0.f16113a = r4
                int r2 = r2 + 6
                goto L_0x00ca
            L_0x0096:
                java.lang.String r8 = "http:"
                boolean r8 = p298d.p415c0.C7694h.m13946x(r12, r8, r2, r7)
                if (r8 == 0) goto L_0x00a5
                java.lang.String r4 = "http"
                r0.f16113a = r4
                int r2 = r2 + 5
                goto L_0x00ca
            L_0x00a5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
                java.lang.String r3 = r12.substring(r3, r4)
                p298d.p344x.p346c.C6888i.m12437d(r3, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00c4:
                if (r1 == 0) goto L_0x0490
                java.lang.String r4 = r1.f16103b
                r0.f16113a = r4
            L_0x00ca:
                r4 = r2
            L_0x00cb:
                r8 = 47
                r9 = 92
                if (r4 >= r13) goto L_0x00de
                char r10 = r12.charAt(r4)
                if (r10 == r9) goto L_0x00d9
                if (r10 != r8) goto L_0x00de
            L_0x00d9:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00cb
            L_0x00de:
                r4 = 63
                r10 = 35
                if (r3 >= r5) goto L_0x0127
                if (r1 == 0) goto L_0x0127
                java.lang.String r5 = r1.f16103b
                java.lang.String r11 = r0.f16113a
                boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r5, r11)
                r5 = r5 ^ r7
                if (r5 == 0) goto L_0x00f2
                goto L_0x0127
            L_0x00f2:
                java.lang.String r3 = r29.mo25855e()
                r0.f16114b = r3
                java.lang.String r3 = r29.mo25851a()
                r0.f16115c = r3
                java.lang.String r3 = r1.f16106e
                r0.f16116d = r3
                int r3 = r1.f16107f
                r0.f16117e = r3
                java.util.List<java.lang.String> r3 = r0.f16118f
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f16118f
                java.util.List r4 = r29.mo25853c()
                r3.addAll(r4)
                if (r2 == r13) goto L_0x011c
                char r3 = r12.charAt(r2)
                if (r3 != r10) goto L_0x0123
            L_0x011c:
                java.lang.String r1 = r29.mo25854d()
                r0.mo25863c(r1)
            L_0x0123:
                r20 = r13
                goto L_0x02ca
            L_0x0127:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r11 = r2
                r17 = r3
            L_0x012f:
                java.lang.String r1 = "@/\\?#"
                int r7 = p421m.p422m0.C7867c.m14286g(r12, r1, r11, r13)
                if (r7 == r13) goto L_0x013c
                char r1 = r12.charAt(r7)
                goto L_0x013d
            L_0x013c:
                r1 = r14
            L_0x013d:
                if (r1 == r14) goto L_0x01ed
                if (r1 == r10) goto L_0x01ed
                if (r1 == r8) goto L_0x01ed
                if (r1 == r9) goto L_0x01ed
                if (r1 == r4) goto L_0x01ed
                r2 = 64
                if (r1 == r2) goto L_0x014f
                r20 = r13
                goto L_0x01de
            L_0x014f:
                java.lang.String r10 = "%40"
                if (r16 != 0) goto L_0x01ad
                int r9 = p421m.p422m0.C7867c.m14285f(r12, r6, r11, r7)
                m.z$b r18 = p421m.C8025z.f16101l
                r6 = 1
                r8 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r30
                r3 = r11
                r4 = r9
                r11 = r7
                r7 = r8
                r8 = r19
                r14 = r9
                r9 = r20
                r23 = r10
                r10 = r21
                r20 = r13
                r13 = r11
                r11 = r22
                java.lang.String r1 = p421m.C8025z.C8028b.m14720a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x018e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f16114b
                r4 = r23
                java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m456q(r2, r3, r4, r1)
            L_0x018e:
                r0.f16114b = r1
                if (r14 == r13) goto L_0x01aa
                int r3 = r14 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r30
                r4 = r13
                java.lang.String r1 = p421m.C8025z.C8028b.m14720a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f16115c = r1
                r16 = 1
            L_0x01aa:
                r17 = 1
                goto L_0x01dc
            L_0x01ad:
                r4 = r10
                r20 = r13
                r13 = r7
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = r0.f16115c
                r14.append(r1)
                r14.append(r4)
                m.z$b r1 = p421m.C8025z.f16101l
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r30
                r3 = r11
                r4 = r13
                r11 = r18
                java.lang.String r1 = p421m.C8025z.C8028b.m14720a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f16115c = r1
            L_0x01dc:
                int r11 = r13 + 1
            L_0x01de:
                r10 = 35
                r4 = 63
                r9 = 92
                r8 = 47
                r6 = 58
                r13 = r20
                r14 = -1
                goto L_0x012f
            L_0x01ed:
                r20 = r13
                r13 = r7
                r7 = r11
            L_0x01f1:
                if (r7 >= r13) goto L_0x0213
                char r1 = r12.charAt(r7)
                r2 = 58
                if (r1 == r2) goto L_0x020f
                r2 = 91
                if (r1 == r2) goto L_0x0200
                goto L_0x020c
            L_0x0200:
                int r7 = r7 + 1
                if (r7 >= r13) goto L_0x020c
                char r1 = r12.charAt(r7)
                r2 = 93
                if (r1 != r2) goto L_0x0200
            L_0x020c:
                int r7 = r7 + 1
                goto L_0x01f1
            L_0x020f:
                r1 = 1
                r10 = r1
                r14 = r7
                goto L_0x0216
            L_0x0213:
                r1 = 1
                r10 = r1
                r14 = r13
            L_0x0216:
                int r9 = r14 + 1
                r7 = 34
                if (r9 >= r13) goto L_0x029d
                m.z$b r7 = p421m.C8025z.f16101l
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r30
                r3 = r11
                r4 = r14
                java.lang.String r1 = p421m.C8025z.C8028b.m14721d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = p005b.p291q.p292a.C5266a.m10024r4(r1)
                r0.f16116d = r1
                java.lang.String r5 = ""
                r6 = 0
                r8 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r1 = r7
                r2 = r30
                r3 = r9
                r4 = r13
                r7 = r8
                r8 = r16
                r24 = r9
                r9 = r17
                r25 = r10
                r10 = r18
                r29 = r11
                r11 = r19
                java.lang.String r1 = p421m.C8025z.C8028b.m14720a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x0262 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0262 }
                r2 = 65535(0xffff, float:9.1834E-41)
                r8 = r25
                if (r8 <= r1) goto L_0x025f
                goto L_0x026a
            L_0x025f:
                if (r2 < r1) goto L_0x026a
                goto L_0x026b
            L_0x0262:
                r8 = r25
                goto L_0x026a
            L_0x0265:
                r24 = r9
                r8 = r10
                r29 = r11
            L_0x026a:
                r1 = -1
            L_0x026b:
                r0.f16117e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0272
                r10 = r8
                goto L_0x0273
            L_0x0272:
                r10 = 0
            L_0x0273:
                if (r10 == 0) goto L_0x0278
                r7 = 34
                goto L_0x02bf
            L_0x0278:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
                r14 = r24
                java.lang.String r2 = r12.substring(r14, r13)
                p298d.p344x.p346c.C6888i.m12437d(r2, r15)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x029d:
                r8 = r10
                r29 = r11
                m.z$b r9 = p421m.C8025z.f16101l
                r5 = 0
                r6 = 4
                r1 = r9
                r2 = r30
                r3 = r29
                r4 = r14
                java.lang.String r1 = p421m.C8025z.C8028b.m14721d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = p005b.p291q.p292a.C5266a.m10024r4(r1)
                r0.f16116d = r1
                java.lang.String r1 = r0.f16113a
                p298d.p344x.p346c.C6888i.m12436c(r1)
                int r1 = r9.mo25866b(r1)
                r0.f16117e = r1
            L_0x02bf:
                java.lang.String r1 = r0.f16116d
                if (r1 == 0) goto L_0x02c5
                r10 = r8
                goto L_0x02c6
            L_0x02c5:
                r10 = 0
            L_0x02c6:
                if (r10 == 0) goto L_0x046d
                r7 = r8
                r2 = r13
            L_0x02ca:
                java.lang.String r1 = "?#"
                r3 = r20
                int r1 = p421m.p422m0.C7867c.m14286g(r12, r1, r2, r3)
                if (r2 != r1) goto L_0x02d9
                r14 = r0
                r11 = r3
                r13 = r12
                goto L_0x041d
            L_0x02d9:
                char r4 = r12.charAt(r2)
                java.lang.String r5 = ""
                r6 = 47
                if (r4 == r6) goto L_0x0300
                r6 = 92
                if (r4 != r6) goto L_0x02e8
                goto L_0x0300
            L_0x02e8:
                java.util.List<java.lang.String> r4 = r0.f16118f
                int r6 = r4.size()
                int r6 = r6 - r7
                r4.set(r6, r5)
                r10 = r0
                r16 = r10
                r14 = r1
                r15 = r14
                r4 = r2
                r17 = r3
                r11 = r7
                r1 = r12
                r9 = r1
                r13 = r9
                r12 = r5
                goto L_0x0320
            L_0x0300:
                java.util.List<java.lang.String> r4 = r0.f16118f
                r4.clear()
                java.util.List<java.lang.String> r4 = r0.f16118f
                r4.add(r5)
                r8 = r0
                r9 = r8
                r4 = r1
                r13 = r3
                r6 = r5
                r3 = r4
                r5 = r2
                r1 = r12
                r2 = r1
            L_0x0313:
                int r5 = r5 + r7
                r14 = r3
                r15 = r4
                r4 = r5
                r11 = r7
                r16 = r8
                r10 = r9
                r9 = r12
                r17 = r13
                r13 = r2
                r12 = r6
            L_0x0320:
                if (r4 >= r15) goto L_0x0417
                java.lang.String r2 = "/\\"
                int r8 = p421m.p422m0.C7867c.m14286g(r9, r2, r4, r15)
                if (r8 >= r15) goto L_0x032d
                r18 = r11
                goto L_0x0330
            L_0x032d:
                r2 = 0
                r18 = r2
            L_0x0330:
                r7 = 1
                m.z$b r2 = p421m.C8025z.f16101l
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 240(0xf0, float:3.36E-43)
                java.lang.String r6 = " \"<>^`{}|/\\?#"
                r3 = r9
                r5 = r8
                r24 = r8
                r8 = r19
                r19 = r9
                r9 = r20
                r26 = r10
                r10 = r21
                r27 = r11
                r11 = r22
                r0 = r12
                r12 = r23
                java.lang.String r2 = p421m.C8025z.C8028b.m14720a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.String r3 = "."
                boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r2, r3)
                if (r3 != 0) goto L_0x036d
                java.lang.String r3 = "%2e"
                r7 = r27
                boolean r3 = p298d.p415c0.C7694h.m13928f(r2, r3, r7)
                if (r3 == 0) goto L_0x036b
                goto L_0x036f
            L_0x036b:
                r11 = 0
                goto L_0x0370
            L_0x036d:
                r7 = r27
            L_0x036f:
                r11 = r7
            L_0x0370:
                if (r11 == 0) goto L_0x0376
                r9 = r26
                goto L_0x03fa
            L_0x0376:
                java.lang.String r3 = ".."
                boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r2, r3)
                if (r3 != 0) goto L_0x0399
                java.lang.String r3 = "%2e."
                boolean r3 = p298d.p415c0.C7694h.m13928f(r2, r3, r7)
                if (r3 != 0) goto L_0x0399
                java.lang.String r3 = ".%2e"
                boolean r3 = p298d.p415c0.C7694h.m13928f(r2, r3, r7)
                if (r3 != 0) goto L_0x0399
                java.lang.String r3 = "%2e%2e"
                boolean r3 = p298d.p415c0.C7694h.m13928f(r2, r3, r7)
                if (r3 == 0) goto L_0x0397
                goto L_0x0399
            L_0x0397:
                r11 = 0
                goto L_0x039a
            L_0x0399:
                r11 = r7
            L_0x039a:
                if (r11 == 0) goto L_0x03d0
                r9 = r26
                java.util.List<java.lang.String> r2 = r9.f16118f
                int r3 = r2.size()
                int r3 = r3 - r7
                java.lang.Object r2 = r2.remove(r3)
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r2.length()
                if (r2 != 0) goto L_0x03b3
                r11 = r7
                goto L_0x03b4
            L_0x03b3:
                r11 = 0
            L_0x03b4:
                if (r11 == 0) goto L_0x03ca
                java.util.List<java.lang.String> r2 = r9.f16118f
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ r7
                if (r2 == 0) goto L_0x03ca
                java.util.List<java.lang.String> r2 = r9.f16118f
                int r3 = r2.size()
                int r3 = r3 - r7
                r2.set(r3, r0)
                goto L_0x03fa
            L_0x03ca:
                java.util.List<java.lang.String> r2 = r9.f16118f
                r2.add(r0)
                goto L_0x03fa
            L_0x03d0:
                r9 = r26
                java.util.List<java.lang.String> r3 = r9.f16118f
                java.lang.Object r3 = p005b.p035e.p036a.p037a.C0843a.m437M(r3, r7)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x03e2
                r11 = r7
                goto L_0x03e3
            L_0x03e2:
                r11 = 0
            L_0x03e3:
                java.util.List<java.lang.String> r3 = r9.f16118f
                if (r11 == 0) goto L_0x03f0
                int r4 = r3.size()
                int r4 = r4 - r7
                r3.set(r4, r2)
                goto L_0x03f3
            L_0x03f0:
                r3.add(r2)
            L_0x03f3:
                if (r18 == 0) goto L_0x03fa
                java.util.List<java.lang.String> r2 = r9.f16118f
                r2.add(r0)
            L_0x03fa:
                if (r18 == 0) goto L_0x040c
                r6 = r0
                r2 = r13
                r3 = r14
                r4 = r15
                r8 = r16
                r13 = r17
                r12 = r19
                r5 = r24
                r0 = r28
                goto L_0x0313
            L_0x040c:
                r12 = r0
                r11 = r7
                r10 = r9
                r9 = r19
                r4 = r24
                r0 = r28
                goto L_0x0320
            L_0x0417:
                r12 = r1
                r1 = r14
                r14 = r16
                r11 = r17
            L_0x041d:
                if (r1 >= r11) goto L_0x044d
                char r0 = r13.charAt(r1)
                r2 = 63
                if (r0 != r2) goto L_0x044d
                r15 = 35
                int r16 = p421m.p422m0.C7867c.m14285f(r13, r15, r1, r11)
                m.z$b r10 = p421m.C8025z.f16101l
                int r2 = r1 + 1
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r17 = 208(0xd0, float:2.91E-43)
                java.lang.String r4 = " \"'<>#"
                r0 = r10
                r1 = r12
                r3 = r16
                r15 = r10
                r10 = r17
                java.lang.String r0 = p421m.C8025z.C8028b.m14720a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.util.List r0 = r15.mo25868e(r0)
                r14.f16119g = r0
                r1 = r16
            L_0x044d:
                r15 = 35
                if (r1 >= r11) goto L_0x046c
                char r0 = r13.charAt(r1)
                if (r0 != r15) goto L_0x046c
                m.z$b r0 = p421m.C8025z.f16101l
                int r2 = r1 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 176(0xb0, float:2.47E-43)
                java.lang.String r4 = ""
                r1 = r12
                r3 = r11
                java.lang.String r0 = p421m.C8025z.C8028b.m14720a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r14.f16120h = r0
            L_0x046c:
                return r14
            L_0x046d:
                java.lang.String r0 = "Invalid URL host: \""
                java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
                r2 = r29
                java.lang.String r1 = r12.substring(r2, r14)
                p298d.p344x.p346c.C6888i.m12437d(r1, r15)
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0490:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.C8025z.C8026a.mo25864d(m.z, java.lang.String):m.z$a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r9.f16115c.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
            if (r1 != r5) goto L_0x00b2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r9.f16113a
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r9.f16114b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0020
                r1 = r2
                goto L_0x0021
            L_0x0020:
                r1 = r3
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r9.f16115c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = r2
                goto L_0x0030
            L_0x002f:
                r1 = r3
            L_0x0030:
                if (r1 == 0) goto L_0x0050
            L_0x0032:
                java.lang.String r1 = r9.f16114b
                r0.append(r1)
                java.lang.String r1 = r9.f16115c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = r3
            L_0x0041:
                if (r2 == 0) goto L_0x004b
                r0.append(r4)
                java.lang.String r1 = r9.f16115c
                r0.append(r1)
            L_0x004b:
                r1 = 64
                r0.append(r1)
            L_0x0050:
                java.lang.String r1 = r9.f16116d
                r2 = 2
                if (r1 == 0) goto L_0x0073
                p298d.p344x.p346c.C6888i.m12436c(r1)
                boolean r1 = p298d.p415c0.C7694h.m13925c(r1, r4, r3, r2)
                if (r1 == 0) goto L_0x006e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r9.f16116d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0073
            L_0x006e:
                java.lang.String r1 = r9.f16116d
                r0.append(r1)
            L_0x0073:
                int r1 = r9.f16117e
                r5 = -1
                if (r1 != r5) goto L_0x007c
                java.lang.String r1 = r9.f16113a
                if (r1 == 0) goto L_0x00b8
            L_0x007c:
                int r1 = r9.mo25862b()
                java.lang.String r6 = r9.f16113a
                if (r6 == 0) goto L_0x00b2
                p298d.p344x.p346c.C6888i.m12436c(r6)
                java.lang.String r7 = "scheme"
                p298d.p344x.p346c.C6888i.m12438e(r6, r7)
                int r7 = r6.hashCode()
                r8 = 3213448(0x310888, float:4.503E-39)
                if (r7 == r8) goto L_0x00a6
                r8 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r7 == r8) goto L_0x009b
                goto L_0x00b0
            L_0x009b:
                java.lang.String r7 = "https"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L_0x00b0
                r5 = 443(0x1bb, float:6.21E-43)
                goto L_0x00b0
            L_0x00a6:
                java.lang.String r7 = "http"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L_0x00b0
                r5 = 80
            L_0x00b0:
                if (r1 == r5) goto L_0x00b8
            L_0x00b2:
                r0.append(r4)
                r0.append(r1)
            L_0x00b8:
                java.util.List<java.lang.String> r1 = r9.f16118f
                java.lang.String r4 = "$this$toPathString"
                p298d.p344x.p346c.C6888i.m12438e(r1, r4)
                java.lang.String r4 = "out"
                p298d.p344x.p346c.C6888i.m12438e(r0, r4)
                int r5 = r1.size()
                r6 = r3
            L_0x00c9:
                if (r6 >= r5) goto L_0x00dc
                r7 = 47
                r0.append(r7)
                java.lang.Object r7 = r1.get(r6)
                java.lang.String r7 = (java.lang.String) r7
                r0.append(r7)
                int r6 = r6 + 1
                goto L_0x00c9
            L_0x00dc:
                java.util.List<java.lang.String> r1 = r9.f16119g
                if (r1 == 0) goto L_0x0131
                r1 = 63
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r9.f16119g
                p298d.p344x.p346c.C6888i.m12436c(r1)
                java.lang.String r5 = "$this$toQueryString"
                p298d.p344x.p346c.C6888i.m12438e(r1, r5)
                p298d.p344x.p346c.C6888i.m12438e(r0, r4)
                int r4 = r1.size()
                d.a0.d r3 = p298d.p333a0.C6759e.m12308d(r3, r4)
                d.a0.b r2 = p298d.p333a0.C6759e.m12307c(r3, r2)
                int r3 = r2.f13658g
                int r4 = r2.f13659h
                int r2 = r2.f13660i
                if (r2 < 0) goto L_0x0109
                if (r3 > r4) goto L_0x0131
                goto L_0x010b
            L_0x0109:
                if (r3 < r4) goto L_0x0131
            L_0x010b:
                java.lang.Object r5 = r1.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                int r6 = r3 + 1
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r3 <= 0) goto L_0x0120
                r7 = 38
                r0.append(r7)
            L_0x0120:
                r0.append(r5)
                if (r6 == 0) goto L_0x012d
                r5 = 61
                r0.append(r5)
                r0.append(r6)
            L_0x012d:
                if (r3 == r4) goto L_0x0131
                int r3 = r3 + r2
                goto L_0x010b
            L_0x0131:
                java.lang.String r1 = r9.f16120h
                if (r1 == 0) goto L_0x013f
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r9.f16120h
                r0.append(r1)
            L_0x013f:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p298d.p344x.p346c.C6888i.m12437d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.C8025z.C8026a.toString():java.lang.String");
        }
    }

    /* renamed from: m.z$b */
    public static final class C8028b {
        public C8028b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public static String m14720a(C8028b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
            boolean z5;
            C8028b bVar2 = bVar;
            String str3 = str;
            String str4 = str2;
            int i4 = i3;
            int i5 = (i4 & 1) != 0 ? 0 : i;
            int length = (i4 & 2) != 0 ? str.length() : i2;
            boolean z6 = (i4 & 8) != 0 ? false : z;
            boolean z7 = (i4 & 16) != 0 ? false : z2;
            boolean z8 = (i4 & 32) != 0 ? false : z3;
            boolean z9 = (i4 & 64) != 0 ? false : z4;
            Charset charset2 = (i4 & 128) != 0 ? null : charset;
            C6888i.m12438e(str3, "$this$canonicalize");
            C6888i.m12438e(str4, "encodeSet");
            int i6 = i5;
            while (i6 < length) {
                int codePointAt = str3.codePointAt(i6);
                int i7 = 2;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || C7694h.m13925c(str4, (char) codePointAt, false, 2) || ((codePointAt == 37 && (!z6 || (z7 && !bVar2.mo25867c(str3, i6, length)))) || (codePointAt == 43 && z8)))) {
                    C8040e eVar = new C8040e();
                    eVar.mo25883A0(str3, i5, i6);
                    C8040e eVar2 = null;
                    while (i6 < length) {
                        int codePointAt2 = str3.codePointAt(i6);
                        if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 != 43 || !z8) {
                                if (codePointAt2 < 32 || codePointAt2 == 127 || (codePointAt2 >= 128 && !z9)) {
                                    z5 = z8;
                                } else {
                                    z5 = z8;
                                    if (!C7694h.m13925c(str4, (char) codePointAt2, false, i7) && (codePointAt2 != 37 || (z6 && (!z7 || bVar2.mo25867c(str3, i6, length))))) {
                                        eVar.mo25884B0(codePointAt2);
                                        i6 += Character.charCount(codePointAt2);
                                        i7 = 2;
                                        z8 = z5;
                                    }
                                }
                                if (eVar2 == null) {
                                    eVar2 = new C8040e();
                                }
                                if (charset2 == null || C6888i.m12434a(charset2, StandardCharsets.UTF_8)) {
                                    eVar2.mo25884B0(codePointAt2);
                                } else {
                                    int charCount = Character.charCount(codePointAt2) + i6;
                                    C6888i.m12438e(str3, "string");
                                    C6888i.m12438e(charset2, "charset");
                                    boolean z10 = true;
                                    if (i6 >= 0) {
                                        if (charCount >= i6) {
                                            if (charCount > str.length()) {
                                                z10 = false;
                                            }
                                            if (!z10) {
                                                StringBuilder v = C0843a.m461v("endIndex > string.length: ", charCount, " > ");
                                                v.append(str.length());
                                                throw new IllegalArgumentException(v.toString().toString());
                                            } else if (C6888i.m12434a(charset2, C7685a.f15210a)) {
                                                eVar2.mo25883A0(str3, i6, charCount);
                                            } else {
                                                String substring = str3.substring(i6, charCount);
                                                C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                byte[] bytes = substring.getBytes(charset2);
                                                C6888i.m12437d(bytes, "(this as java.lang.String).getBytes(charset)");
                                                eVar2.mo25938u0(bytes, 0, bytes.length);
                                            }
                                        } else {
                                            throw new IllegalArgumentException(C0843a.m446g("endIndex < beginIndex: ", charCount, " < ", i6).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(C0843a.m444e("beginIndex < 0: ", i6).toString());
                                    }
                                }
                                while (!eVar2.mo25886D()) {
                                    byte readByte = eVar2.readByte() & ExifInterface.MARKER;
                                    eVar.mo25940v0(37);
                                    char[] cArr = C8025z.f16100k;
                                    eVar.mo25940v0(cArr[(readByte >> 4) & 15]);
                                    eVar.mo25940v0(cArr[readByte & 15]);
                                }
                                i6 += Character.charCount(codePointAt2);
                                i7 = 2;
                                z8 = z5;
                            } else {
                                eVar.mo25947z0(z6 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                            }
                        }
                        z5 = z8;
                        i6 += Character.charCount(codePointAt2);
                        i7 = 2;
                        z8 = z5;
                    }
                    return eVar.mo25919n0();
                }
                i6 += Character.charCount(codePointAt);
            }
            String substring2 = str3.substring(i5, length);
            C6888i.m12437d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }

        /* renamed from: d */
        public static String m14721d(C8028b bVar, String str, int i, int i2, boolean z, int i3) {
            int i4;
            int i5;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            C6888i.m12438e(str, "$this$percentDecode");
            int i6 = i;
            while (i4 < i2) {
                char charAt = str.charAt(i4);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C8040e eVar = new C8040e();
                    eVar.mo25883A0(str, i, i4);
                    while (i4 < i2) {
                        int codePointAt = str.codePointAt(i4);
                        if (codePointAt == 37 && (i5 = i4 + 2) < i2) {
                            int q = C7867c.m14296q(str.charAt(i4 + 1));
                            int q2 = C7867c.m14296q(str.charAt(i5));
                            if (!(q == -1 || q2 == -1)) {
                                eVar.mo25940v0((q << 4) + q2);
                                i4 = Character.charCount(codePointAt) + i5;
                            }
                        } else if (codePointAt == 43 && z) {
                            eVar.mo25940v0(32);
                            i4++;
                        }
                        eVar.mo25884B0(codePointAt);
                        i4 += Character.charCount(codePointAt);
                    }
                    return eVar.mo25919n0();
                }
                i6 = i4 + 1;
            }
            String substring = str.substring(i, i2);
            C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: b */
        public final int mo25866b(String str) {
            C6888i.m12438e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean mo25867c(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C7867c.m14296q(str.charAt(i + 1)) != -1 && C7867c.m14296q(str.charAt(i3)) != -1;
        }

        /* renamed from: e */
        public final List<String> mo25868e(String str) {
            String str2;
            C6888i.m12438e(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int k = C7694h.m13933k(str, '&', i, false, 4);
                if (k == -1) {
                    k = str.length();
                }
                int k2 = C7694h.m13933k(str, '=', i, false, 4);
                if (k2 == -1 || k2 > k) {
                    String substring = str.substring(i, k);
                    C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i, k2);
                    C6888i.m12437d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(k2 + 1, k);
                    C6888i.m12437d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i = k + 1;
            }
            return arrayList;
        }
    }

    public C8025z(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        C6888i.m12438e(str, "scheme");
        C6888i.m12438e(str2, "username");
        C6888i.m12438e(str3, "password");
        C6888i.m12438e(str4, "host");
        C6888i.m12438e(list, "pathSegments");
        C6888i.m12438e(str6, "url");
        this.f16103b = str;
        this.f16104c = str2;
        this.f16105d = str3;
        this.f16106e = str4;
        this.f16107f = i;
        this.f16108g = list;
        this.f16109h = list2;
        this.f16110i = str5;
        this.f16111j = str6;
        this.f16102a = C6888i.m12434a(str, "https");
    }

    /* renamed from: a */
    public final String mo25851a() {
        if (this.f16105d.length() == 0) {
            return "";
        }
        int k = C7694h.m13933k(this.f16111j, '@', 0, false, 6);
        String str = this.f16111j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C7694h.m13933k(this.f16111j, ':', this.f16103b.length() + 3, false, 4) + 1, k);
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public final String mo25852b() {
        int k = C7694h.m13933k(this.f16111j, '/', this.f16103b.length() + 3, false, 4);
        String str = this.f16111j;
        int g = C7867c.m14286g(str, "?#", k, str.length());
        String str2 = this.f16111j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(k, g);
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public final List<String> mo25853c() {
        int k = C7694h.m13933k(this.f16111j, '/', this.f16103b.length() + 3, false, 4);
        String str = this.f16111j;
        int g = C7867c.m14286g(str, "?#", k, str.length());
        ArrayList arrayList = new ArrayList();
        while (k < g) {
            int i = k + 1;
            int f = C7867c.m14285f(this.f16111j, '/', i, g);
            String str2 = this.f16111j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i, f);
            C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            k = f;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String mo25854d() {
        if (this.f16109h == null) {
            return null;
        }
        int k = C7694h.m13933k(this.f16111j, '?', 0, false, 6) + 1;
        String str = this.f16111j;
        int f = C7867c.m14285f(str, '#', k, str.length());
        String str2 = this.f16111j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(k, f);
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final String mo25855e() {
        if (this.f16104c.length() == 0) {
            return "";
        }
        int length = this.f16103b.length() + 3;
        String str = this.f16111j;
        int g = C7867c.m14286g(str, ":@", length, str.length());
        String str2 = this.f16111j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, g);
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8025z) && C6888i.m12434a(((C8025z) obj).f16111j, this.f16111j);
    }

    /* renamed from: f */
    public final String mo25857f() {
        C8026a aVar;
        C6888i.m12438e("/...", "link");
        try {
            aVar = new C8026a();
            aVar.mo25864d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        C6888i.m12436c(aVar);
        C6888i.m12438e("", "username");
        C8028b bVar = f16101l;
        aVar.f16114b = C8028b.m14720a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        C6888i.m12438e("", "password");
        aVar.f16115c = C8028b.m14720a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        return aVar.mo25861a().f16111j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2 A[LOOP:0: B:22:0x00d0->B:23:0x00d2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.URI mo25858g() {
        /*
            r25 = this;
            r1 = r25
            m.z$a r0 = new m.z$a
            r0.<init>()
            java.lang.String r2 = r1.f16103b
            r0.f16113a = r2
            java.lang.String r2 = r25.mo25855e()
            java.lang.String r3 = "<set-?>"
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            r0.f16114b = r2
            java.lang.String r2 = r25.mo25851a()
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            r0.f16115c = r2
            java.lang.String r2 = r1.f16106e
            r0.f16116d = r2
            int r2 = r1.f16107f
            java.lang.String r3 = r1.f16103b
            java.lang.String r4 = "scheme"
            p298d.p344x.p346c.C6888i.m12438e(r3, r4)
            int r4 = r3.hashCode()
            r5 = 3213448(0x310888, float:4.503E-39)
            r6 = -1
            if (r4 == r5) goto L_0x0047
            r5 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r5) goto L_0x003c
            goto L_0x0052
        L_0x003c:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0052
            r3 = 443(0x1bb, float:6.21E-43)
            goto L_0x0053
        L_0x0047:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0052
            r3 = 80
            goto L_0x0053
        L_0x0052:
            r3 = r6
        L_0x0053:
            if (r2 == r3) goto L_0x0057
            int r6 = r1.f16107f
        L_0x0057:
            r0.f16117e = r6
            java.util.List<java.lang.String> r2 = r0.f16118f
            r2.clear()
            java.util.List<java.lang.String> r2 = r0.f16118f
            java.util.List r3 = r25.mo25853c()
            r2.addAll(r3)
            java.lang.String r2 = r25.mo25854d()
            r0.mo25863c(r2)
            java.lang.String r2 = r1.f16110i
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0076
            r2 = r3
            goto L_0x0091
        L_0x0076:
            java.lang.String r2 = r1.f16111j
            r5 = 35
            r6 = 6
            int r2 = p298d.p415c0.C7694h.m13933k(r2, r5, r4, r4, r6)
            int r2 = r2 + 1
            java.lang.String r5 = r1.f16111j
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r5, r6)
            java.lang.String r2 = r5.substring(r2)
            java.lang.String r5 = "(this as java.lang.String).substring(startIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r2, r5)
        L_0x0091:
            r0.f16120h = r2
            java.lang.String r2 = r0.f16116d
            java.lang.String r5 = "nativePattern.matcher(in…).replaceAll(replacement)"
            java.lang.String r6 = "replacement"
            java.lang.String r7 = "input"
            java.lang.String r8 = ""
            java.lang.String r9 = "nativePattern"
            java.lang.String r10 = "Pattern.compile(pattern)"
            java.lang.String r11 = "pattern"
            if (r2 == 0) goto L_0x00c6
            java.lang.String r12 = "[\"<>^`{|}]"
            p298d.p344x.p346c.C6888i.m12438e(r12, r11)
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
            p298d.p344x.p346c.C6888i.m12437d(r12, r10)
            p298d.p344x.p346c.C6888i.m12438e(r12, r9)
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)
            p298d.p344x.p346c.C6888i.m12438e(r8, r6)
            java.util.regex.Matcher r2 = r12.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r8)
            p298d.p344x.p346c.C6888i.m12437d(r2, r5)
            goto L_0x00c7
        L_0x00c6:
            r2 = r3
        L_0x00c7:
            r0.f16116d = r2
            java.util.List<java.lang.String> r2 = r0.f16118f
            int r2 = r2.size()
            r12 = r4
        L_0x00d0:
            if (r12 >= r2) goto L_0x00f8
            java.util.List<java.lang.String> r13 = r0.f16118f
            m.z$b r14 = f16101l
            java.lang.Object r15 = r13.get(r12)
            java.lang.String r15 = (java.lang.String) r15
            r16 = 0
            r17 = 0
            r19 = 1
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 227(0xe3, float:3.18E-43)
            java.lang.String r18 = "[]"
            java.lang.String r14 = p421m.C8025z.C8028b.m14720a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r13.set(r12, r14)
            int r12 = r12 + 1
            goto L_0x00d0
        L_0x00f8:
            java.util.List<java.lang.String> r2 = r0.f16119g
            if (r2 == 0) goto L_0x012b
            int r12 = r2.size()
        L_0x0100:
            if (r4 >= r12) goto L_0x012b
            java.lang.Object r13 = r2.get(r4)
            r15 = r13
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x0124
            m.z$b r14 = f16101l
            r16 = 0
            r17 = 0
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 195(0xc3, float:2.73E-43)
            java.lang.String r18 = "\\^`{|}"
            java.lang.String r13 = p421m.C8025z.C8028b.m14720a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0125
        L_0x0124:
            r13 = r3
        L_0x0125:
            r2.set(r4, r13)
            int r4 = r4 + 1
            goto L_0x0100
        L_0x012b:
            java.lang.String r14 = r0.f16120h
            if (r14 == 0) goto L_0x0146
            m.z$b r13 = f16101l
            r15 = 0
            r16 = 0
            r18 = 1
            r19 = 1
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 163(0xa3, float:2.28E-43)
            java.lang.String r17 = " \"#<>\\^`{|}"
            java.lang.String r3 = p421m.C8025z.C8028b.m14720a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0146:
            r0.f16120h = r3
            java.lang.String r2 = r0.toString()
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0152 }
            r0.<init>(r2)     // Catch:{ URISyntaxException -> 0x0152 }
            goto L_0x017c
        L_0x0152:
            r0 = move-exception
            java.lang.String r3 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            p298d.p344x.p346c.C6888i.m12438e(r3, r11)     // Catch:{ Exception -> 0x017d }
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ Exception -> 0x017d }
            p298d.p344x.p346c.C6888i.m12437d(r3, r10)     // Catch:{ Exception -> 0x017d }
            p298d.p344x.p346c.C6888i.m12438e(r3, r9)     // Catch:{ Exception -> 0x017d }
            p298d.p344x.p346c.C6888i.m12438e(r2, r7)     // Catch:{ Exception -> 0x017d }
            p298d.p344x.p346c.C6888i.m12438e(r8, r6)     // Catch:{ Exception -> 0x017d }
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r2.replaceAll(r8)     // Catch:{ Exception -> 0x017d }
            p298d.p344x.p346c.C6888i.m12437d(r2, r5)     // Catch:{ Exception -> 0x017d }
            java.net.URI r0 = java.net.URI.create(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = "try {\n        val stripp…e) // Unexpected!\n      }"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
        L_0x017c:
            return r0
        L_0x017d:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.C8025z.mo25858g():java.net.URI");
    }

    public int hashCode() {
        return this.f16111j.hashCode();
    }

    public String toString() {
        return this.f16111j;
    }
}
