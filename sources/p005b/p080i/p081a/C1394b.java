package p005b.p080i.p081a;

import android.util.Log;
import com.segment.analytics.AnalyticsContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p080i.p081a.C1422f;
import p005b.p080i.p081a.C1502i;

/* renamed from: b.i.a.b */
public class C1394b {

    /* renamed from: a */
    public C1401f f1809a = null;

    /* renamed from: b */
    public C1416u f1810b = null;

    /* renamed from: c */
    public boolean f1811c = false;

    /* renamed from: b.i.a.b$b */
    public static class C1396b {

        /* renamed from: a */
        public final String f1812a;

        /* renamed from: b */
        public final C1397c f1813b;

        /* renamed from: c */
        public final String f1814c;

        public C1396b(String str, C1397c cVar, String str2) {
            this.f1812a = str;
            this.f1813b = cVar;
            this.f1814c = str2;
        }
    }

    /* renamed from: b.i.a.b$c */
    public enum C1397c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* renamed from: b.i.a.b$d */
    public static class C1398d extends C1502i.C1511i {

        /* renamed from: b.i.a.b$d$a */
        public static class C1399a {

            /* renamed from: a */
            public int f1820a;

            /* renamed from: b */
            public int f1821b;

            public C1399a(int i, int i2) {
                this.f1820a = i;
                this.f1821b = i2;
            }
        }

        public C1398d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* renamed from: s */
        public final int mo11271s(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            int i2 = 65;
            if (i < 65 || i > 70) {
                i2 = 97;
                if (i < 97 || i > 102) {
                    return -1;
                }
            }
            return (i - i2) + 10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
            r2 = mo11434h().intValue();
         */
        /* renamed from: t */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String mo11272t() {
            /*
                r8 = this;
                boolean r0 = r8.mo11432f()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = r8.f2313a
                int r2 = r8.f2314b
                char r0 = r0.charAt(r2)
                r2 = 39
                if (r0 == r2) goto L_0x0019
                r2 = 34
                if (r0 == r2) goto L_0x0019
                return r1
            L_0x0019:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r8.f2314b
                r3 = 1
                int r2 = r2 + r3
                r8.f2314b = r2
            L_0x0024:
                java.lang.Integer r2 = r8.mo11434h()
                int r2 = r2.intValue()
            L_0x002c:
                r4 = -1
                if (r2 == r4) goto L_0x0076
                if (r2 == r0) goto L_0x0076
                r5 = 92
                if (r2 != r5) goto L_0x0071
                java.lang.Integer r2 = r8.mo11434h()
                int r2 = r2.intValue()
                if (r2 != r4) goto L_0x0040
                goto L_0x002c
            L_0x0040:
                r5 = 10
                if (r2 == r5) goto L_0x0024
                r5 = 13
                if (r2 == r5) goto L_0x0024
                r5 = 12
                if (r2 != r5) goto L_0x004d
                goto L_0x0024
            L_0x004d:
                int r5 = r8.mo11271s(r2)
                if (r5 == r4) goto L_0x0071
                r6 = r3
            L_0x0054:
                r7 = 5
                if (r6 > r7) goto L_0x006c
                java.lang.Integer r2 = r8.mo11434h()
                int r2 = r2.intValue()
                int r7 = r8.mo11271s(r2)
                if (r7 != r4) goto L_0x0066
                goto L_0x006c
            L_0x0066:
                int r5 = r5 * 16
                int r5 = r5 + r7
                int r6 = r6 + 1
                goto L_0x0054
            L_0x006c:
                char r4 = (char) r5
                r1.append(r4)
                goto L_0x002c
            L_0x0071:
                char r2 = (char) r2
                r1.append(r2)
                goto L_0x0024
            L_0x0076:
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1394b.C1398d.mo11272t():java.lang.String");
        }

        /* renamed from: u */
        public String mo11273u() {
            int i;
            int i2;
            if (mo11432f()) {
                i = this.f2314b;
            } else {
                int i3 = this.f2314b;
                int charAt = this.f2313a.charAt(i3);
                if (charAt == 45) {
                    charAt = mo11427a();
                }
                if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                    i2 = i3;
                } else {
                    while (true) {
                        int a = mo11427a();
                        if ((a < 65 || a > 90) && ((a < 97 || a > 122) && !((a >= 48 && a <= 57) || a == 45 || a == 95))) {
                            break;
                        }
                    }
                    i2 = this.f2314b;
                }
                this.f2314b = i3;
                i = i2;
            }
            int i4 = this.f2314b;
            if (i == i4) {
                return null;
            }
            String substring = this.f2313a.substring(i4, i);
            this.f2314b = i;
            return substring;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: b.i.a.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: b.i.a.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: b.i.a.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r3v5, types: [b.i.a.b$a, java.lang.String] */
        /* JADX WARNING: type inference failed for: r8v19 */
        /* JADX WARNING: type inference failed for: r8v20, types: [b.i.a.b$m] */
        /* JADX WARNING: type inference failed for: r3v51, types: [b.i.a.b$m] */
        /* JADX WARNING: type inference failed for: r8v21, types: [b.i.a.b$i] */
        /* JADX WARNING: type inference failed for: r3v55, types: [b.i.a.b$l] */
        /* JADX WARNING: type inference failed for: r3v60, types: [b.i.a.b$l] */
        /* JADX WARNING: type inference failed for: r3v64 */
        /* JADX WARNING: type inference failed for: r3v73 */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x018d, code lost:
            throw new p005b.p080i.p081a.C1393a(p005b.p035e.p036a.p037a.C0843a.m451l("Unsupported pseudo class: ", r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x018e, code lost:
            r3 = new p005b.p080i.p081a.C1394b.C1407l(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0199, code lost:
            if (mo11432f() == false) goto L_0x019c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x019c, code lost:
            r8 = r0.f2314b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a2, code lost:
            if (mo11430d('(') != false) goto L_0x01a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a5, code lost:
            mo11444r();
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a8, code lost:
            r10 = mo11273u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ac, code lost:
            if (r10 != null) goto L_0x01af;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x01af, code lost:
            if (r3 != null) goto L_0x01b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b1, code lost:
            r3 = new java.util.ArrayList();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b6, code lost:
            r3.add(r10);
            mo11444r();
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c0, code lost:
            if (mo11443q() != false) goto L_0x01a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c6, code lost:
            if (mo11430d(')') == false) goto L_0x01c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c9, code lost:
            r0.f2314b = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x01cb, code lost:
            r3 = new p005b.p080i.p081a.C1394b.C1407l(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d2, code lost:
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d6, code lost:
            if (mo11432f() == false) goto L_0x01d9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d9, code lost:
            r8 = r0.f2314b;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x01df, code lost:
            if (mo11430d('(') != false) goto L_0x01e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e2, code lost:
            mo11444r();
            r10 = mo11274v();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e9, code lost:
            if (r10 != null) goto L_0x01ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f0, code lost:
            if (mo11430d(')') != false) goto L_0x01f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f2, code lost:
            r0.f2314b = r8;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x01f5, code lost:
            r8 = r10.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x01fd, code lost:
            if (r8.hasNext() == false) goto L_0x0234;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ff, code lost:
            r11 = r8.next().f1878a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0207, code lost:
            if (r11 != null) goto L_0x020a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x020a, code lost:
            r11 = r11.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0212, code lost:
            if (r11.hasNext() == false) goto L_0x01f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x0214, code lost:
            r13 = r11.next().f1883d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x021c, code lost:
            if (r13 != null) goto L_0x021f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x021f, code lost:
            r13 = r13.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0227, code lost:
            if (r13.hasNext() == false) goto L_0x020e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0231, code lost:
            if ((r13.next() instanceof p005b.p080i.p081a.C1394b.C1406k) == false) goto L_0x0223;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0234, code lost:
            r3 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0235, code lost:
            if (r3 == null) goto L_0x025a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0237, code lost:
            r8 = new p005b.p080i.p081a.C1394b.C1406k(r3);
            r3 = r3.iterator();
            r9 = Integer.MIN_VALUE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0246, code lost:
            if (r3.hasNext() == false) goto L_0x0254;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0248, code lost:
            r10 = r3.next().f1879b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0250, code lost:
            if (r10 <= r9) goto L_0x0242;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0252, code lost:
            r9 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0254, code lost:
            r4.f1879b = r9;
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0263, code lost:
            throw new p005b.p080i.p081a.C1393a(p005b.p035e.p036a.p037a.C0843a.m451l("Invalid or missing parameter section for pseudo class: ", r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0264, code lost:
            r8 = new p005b.p080i.p081a.C1394b.C1404i(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x026a, code lost:
            r3 = new p005b.p080i.p081a.C1394b.C1408m(r8, r2.f1881b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0272, code lost:
            r8 = new p005b.p080i.p081a.C1394b.C1408m(false, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0278, code lost:
            r3 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x027a, code lost:
            r10 = new p005b.p080i.p081a.C1394b.C1403h(0, 1, false, true, r2.f1881b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0287, code lost:
            r16 = new p005b.p080i.p081a.C1394b.C1403h(0, 1, true, true, r2.f1881b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x029b, code lost:
            r9 = new p005b.p080i.p081a.C1394b.C1403h(0, 1, false, false, (java.lang.String) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x02a7, code lost:
            r15 = new p005b.p080i.p081a.C1394b.C1403h(0, 1, true, false, (java.lang.String) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x02b7, code lost:
            r8 = r3;
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x02be, code lost:
            if (r10 == p005b.p080i.p081a.C1394b.C1405j.f1852i) goto L_0x02c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c2, code lost:
            if (r10 != p005b.p080i.p081a.C1394b.C1405j.f1854k) goto L_0x02c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c5, code lost:
            r17 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c9, code lost:
            r17 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x02cd, code lost:
            if (r10 == p005b.p080i.p081a.C1394b.C1405j.f1854k) goto L_0x02d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d1, code lost:
            if (r10 != p005b.p080i.p081a.C1394b.C1405j.f1855l) goto L_0x02d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x02d4, code lost:
            r18 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x02d8, code lost:
            r18 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x02de, code lost:
            if (mo11432f() == false) goto L_0x02e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x02e1, code lost:
            r10 = r0.f2314b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x02e7, code lost:
            if (mo11430d('(') != false) goto L_0x02ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x02e9, code lost:
            r20 = r7;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x02ed, code lost:
            mo11444r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x02f7, code lost:
            if (mo11431e("odd") == false) goto L_0x02ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x02f9, code lost:
            r3 = new p005b.p080i.p081a.C1394b.C1398d.C1399a(2, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0305, code lost:
            if (mo11431e("even") == false) goto L_0x0311;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0307, code lost:
            r3 = new p005b.p080i.p081a.C1394b.C1398d.C1399a(2, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x030d, code lost:
            r20 = r7;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x0311, code lost:
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0319, code lost:
            if (mo11430d('+') == false) goto L_0x031c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x031c, code lost:
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0320, code lost:
            if (mo11430d('-') == false) goto L_0x0323;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0322, code lost:
            r8 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x0323, code lost:
            r3 = p005b.p080i.p081a.C1417c.m1514a(r0.f2313a, r0.f2314b, r0.f2315c, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x032e, code lost:
            if (r3 == null) goto L_0x0334;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0330, code lost:
            r0.f2314b = r3.f1887a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x033a, code lost:
            if (mo11430d('n') != false) goto L_0x0350;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0342, code lost:
            if (mo11430d('N') == false) goto L_0x0345;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0345, code lost:
            r11 = r8;
            r8 = 1;
            r14 = null;
            r13 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0350, code lost:
            if (r3 == null) goto L_0x0353;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0353, code lost:
            r3 = new p005b.p080i.p081a.C1417c(1, r0.f2314b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x035c, code lost:
            mo11444r();
            r13 = mo11430d('+');
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x0365, code lost:
            if (r13 != false) goto L_0x036f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0367, code lost:
            r13 = mo11430d('-');
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x036b, code lost:
            if (r13 == false) goto L_0x036f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x036d, code lost:
            r11 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x036f, code lost:
            r11 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0370, code lost:
            if (r13 == false) goto L_0x038c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0372, code lost:
            mo11444r();
            r16 = r3;
            r3 = 0;
            r13 = p005b.p080i.p081a.C1417c.m1514a(r0.f2313a, r0.f2314b, r0.f2315c, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0382, code lost:
            if (r13 == null) goto L_0x0389;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0384, code lost:
            r0.f2314b = r13.f1887a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0389, code lost:
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x038c, code lost:
            r16 = r3;
            r3 = 0;
            r13 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0390, code lost:
            r14 = r16;
            r22 = r13;
            r13 = r3;
            r3 = r22;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0399, code lost:
            if (r14 != null) goto L_0x039c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x039c, code lost:
            r13 = ((int) r14.f1888b) * r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x03a0, code lost:
            if (r3 != null) goto L_0x03a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x03a2, code lost:
            r3 = 0;
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x03a6, code lost:
            r20 = r7;
            r3 = ((int) r3.f1888b) * r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x03ac, code lost:
            r3 = new p005b.p080i.p081a.C1394b.C1398d.C1399a(r13, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x03b0, code lost:
            mo11444r();
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x03b9, code lost:
            if (mo11430d(')') == false) goto L_0x03bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x03bc, code lost:
            r0.f2314b = r10;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x03bf, code lost:
            if (r3 == null) goto L_0x03d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x03c1, code lost:
            r8 = new p005b.p080i.p081a.C1394b.C1403h(r3.f1820a, r3.f1821b, r17, r18, r2.f1881b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x03dc, code lost:
            throw new p005b.p080i.p081a.C1393a(p005b.p035e.p036a.p037a.C0843a.m451l("Invalid or missing parameter section for pseudo class: ", r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x03dd, code lost:
            r20 = r7;
            r3 = new p005b.p080i.p081a.C1394b.C1409n((p005b.p080i.p081a.C1394b.C1395a) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x03e6, code lost:
            r20 = r7;
            r3 = new p005b.p080i.p081a.C1394b.C1410o(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x03ee, code lost:
            r8 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x03ef, code lost:
            r4.mo11287a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x03f4, code lost:
            if (r2.f1883d != null) goto L_0x03fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f6, code lost:
            r2.f1883d = new java.util.ArrayList();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x03fd, code lost:
            r2.f1883d.add(r8);
            r3 = false;
            r8 = true;
            r7 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x040f, code lost:
            throw new p005b.p080i.p081a.C1393a("Invalid pseudo class");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:276:0x007b, code lost:
            r8 = r8;
            r3 = r3;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:278:0x007b, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:284:0x0235, code lost:
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
            if (mo11430d('#') == false) goto L_0x00d0;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
            if (r2 != null) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
            r2 = new p005b.p080i.p081a.C1394b.C1415t(r7, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
            r9 = mo11273u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
            if (r9 == null) goto L_0x00c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
            r2.mo11290a(com.segment.analytics.AnalyticsContext.Device.DEVICE_ID_KEY, r5, r9);
            r4.f1879b += 1000000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
            throw new p005b.p080i.p081a.C1393a("Invalid \"#id\" simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
            if (mo11430d('[') == false) goto L_0x0153;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d8, code lost:
            if (r2 != null) goto L_0x00df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00da, code lost:
            r2 = new p005b.p080i.p081a.C1394b.C1415t(r7, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
            mo11444r();
            r9 = mo11273u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e8, code lost:
            if (r9 == null) goto L_0x014d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ea, code lost:
            mo11444r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
            if (mo11430d('=') == false) goto L_0x00f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
            r11 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
            if (mo11431e("~=") == false) goto L_0x0102;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ff, code lost:
            r11 = p005b.p080i.p081a.C1394b.C1397c.f1817i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
            if (mo11431e("|=") == false) goto L_0x010d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
            r11 = p005b.p080i.p081a.C1394b.C1397c.f1818j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x010d, code lost:
            r11 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x010e, code lost:
            if (r11 == null) goto L_0x0132;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0110, code lost:
            mo11444r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0117, code lost:
            if (mo11432f() == false) goto L_0x011b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0119, code lost:
            r12 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x011b, code lost:
            r12 = mo11437k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x011f, code lost:
            if (r12 == null) goto L_0x0122;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0122, code lost:
            r12 = mo11273u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
            if (r12 == null) goto L_0x012c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
            mo11444r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0131, code lost:
            throw new p005b.p080i.p081a.C1393a("Invalid attribute simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0132, code lost:
            r12 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0139, code lost:
            if (mo11430d(']') == false) goto L_0x0147;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x013b, code lost:
            if (r11 != null) goto L_0x013f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x013d, code lost:
            r11 = p005b.p080i.p081a.C1394b.C1397c.f1815g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x013f, code lost:
            r2.mo11290a(r9, r11, r12);
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x014c, code lost:
            throw new p005b.p080i.p081a.C1393a("Invalid attribute simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0152, code lost:
            throw new p005b.p080i.p081a.C1393a("Invalid attribute simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0159, code lost:
            if (mo11430d(':') == false) goto L_0x0410;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x015b, code lost:
            if (r2 != null) goto L_0x0162;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x015d, code lost:
            r2 = new p005b.p080i.p081a.C1394b.C1415t(r7, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0162, code lost:
            r9 = mo11273u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0166, code lost:
            if (r9 == null) goto L_0x0408;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0168, code lost:
            r10 = p005b.p080i.p081a.C1394b.C1405j.f1848F.get(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0170, code lost:
            if (r10 == null) goto L_0x0173;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0173, code lost:
            r10 = p005b.p080i.p081a.C1394b.C1405j.f1847E;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x017f, code lost:
            switch(r10.ordinal()) {
                case 0: goto L_0x03e6;
                case 1: goto L_0x03dd;
                case 2: goto L_0x02bc;
                case 3: goto L_0x02bc;
                case 4: goto L_0x02bc;
                case 5: goto L_0x02bc;
                case 6: goto L_0x02a7;
                case 7: goto L_0x029b;
                case 8: goto L_0x0287;
                case 9: goto L_0x027a;
                case 10: goto L_0x0272;
                case 11: goto L_0x026a;
                case 12: goto L_0x0264;
                case 13: goto L_0x01d2;
                case 14: goto L_0x0195;
                case 15: goto L_0x018e;
                case 16: goto L_0x018e;
                case 17: goto L_0x018e;
                case 18: goto L_0x018e;
                case 19: goto L_0x018e;
                case 20: goto L_0x018e;
                case 21: goto L_0x018e;
                case 22: goto L_0x018e;
                case 23: goto L_0x018e;
                default: goto L_0x0182;
            };
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x0412  */
        /* JADX WARNING: Removed duplicated region for block: B:243:0x0424  */
        /* JADX WARNING: Removed duplicated region for block: B:246:0x0429  */
        /* JADX WARNING: Removed duplicated region for block: B:255:0x044a  */
        /* JADX WARNING: Removed duplicated region for block: B:256:0x044c  */
        /* JADX WARNING: Removed duplicated region for block: B:258:0x044f  */
        /* JADX WARNING: Removed duplicated region for block: B:261:0x043f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<p005b.p080i.p081a.C1394b.C1414s> mo11274v() {
            /*
                r23 = this;
                r0 = r23
                boolean r1 = r23.mo11432f()
                r2 = 0
                if (r1 == 0) goto L_0x000a
                return r2
            L_0x000a:
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 1
                r1.<init>(r3)
                b.i.a.b$s r4 = new b.i.a.b$s
                r4.<init>(r2)
            L_0x0015:
                boolean r5 = r23.mo11432f()
                if (r5 != 0) goto L_0x043f
                b.i.a.b$c r5 = p005b.p080i.p081a.C1394b.C1397c.EQUALS
                boolean r6 = r23.mo11432f()
                if (r6 == 0) goto L_0x0025
                goto L_0x0426
            L_0x0025:
                int r6 = r0.f2314b
                java.util.List<b.i.a.b$t> r7 = r4.f1878a
                if (r7 == 0) goto L_0x0034
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0032
                goto L_0x0034
            L_0x0032:
                r7 = 0
                goto L_0x0035
            L_0x0034:
                r7 = r3
            L_0x0035:
                r8 = 43
                if (r7 != 0) goto L_0x0050
                r7 = 62
                boolean r7 = r0.mo11430d(r7)
                if (r7 == 0) goto L_0x0044
                b.i.a.b$e r7 = p005b.p080i.p081a.C1394b.C1400e.CHILD
                goto L_0x004c
            L_0x0044:
                boolean r7 = r0.mo11430d(r8)
                if (r7 == 0) goto L_0x0050
                b.i.a.b$e r7 = p005b.p080i.p081a.C1394b.C1400e.FOLLOWS
            L_0x004c:
                r23.mo11444r()
                goto L_0x0051
            L_0x0050:
                r7 = r2
            L_0x0051:
                r8 = 42
                boolean r8 = r0.mo11430d(r8)
                if (r8 == 0) goto L_0x0065
                b.i.a.b$t r8 = new b.i.a.b$t
                r8.<init>(r7, r2)
                r22 = r3
                r3 = r2
                r2 = r8
                r8 = r22
                goto L_0x007b
            L_0x0065:
                java.lang.String r8 = r23.mo11273u()
                if (r8 == 0) goto L_0x0079
                b.i.a.b$t r9 = new b.i.a.b$t
                r9.<init>(r7, r8)
                int r8 = r4.f1879b
                int r8 = r8 + r3
                r4.f1879b = r8
                r8 = r3
                r3 = r2
                r2 = r9
                goto L_0x007b
            L_0x0079:
                r8 = r3
                r3 = r2
            L_0x007b:
                boolean r9 = r23.mo11432f()
                if (r9 != 0) goto L_0x0410
                r9 = 46
                boolean r9 = r0.mo11430d(r9)
                if (r9 == 0) goto L_0x00a5
                if (r2 != 0) goto L_0x0090
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x0090:
                java.lang.String r9 = r23.mo11273u()
                if (r9 == 0) goto L_0x009d
                java.lang.String r10 = "class"
                r2.mo11290a(r10, r5, r9)
                goto L_0x0142
            L_0x009d:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Invalid \".class\" simpleSelectors"
                r1.<init>(r2)
                throw r1
            L_0x00a5:
                r9 = 35
                boolean r9 = r0.mo11430d(r9)
                if (r9 == 0) goto L_0x00d0
                if (r2 != 0) goto L_0x00b4
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x00b4:
                java.lang.String r9 = r23.mo11273u()
                if (r9 == 0) goto L_0x00c8
                java.lang.String r10 = "id"
                r2.mo11290a(r10, r5, r9)
                int r9 = r4.f1879b
                r10 = 1000000(0xf4240, float:1.401298E-39)
                int r9 = r9 + r10
                r4.f1879b = r9
                goto L_0x007b
            L_0x00c8:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Invalid \"#id\" simpleSelectors"
                r1.<init>(r2)
                throw r1
            L_0x00d0:
                r9 = 91
                boolean r9 = r0.mo11430d(r9)
                if (r9 == 0) goto L_0x0153
                if (r2 != 0) goto L_0x00df
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x00df:
                r23.mo11444r()
                java.lang.String r9 = r23.mo11273u()
                java.lang.String r10 = "Invalid attribute simpleSelectors"
                if (r9 == 0) goto L_0x014d
                r23.mo11444r()
                r11 = 61
                boolean r11 = r0.mo11430d(r11)
                if (r11 == 0) goto L_0x00f7
                r11 = r5
                goto L_0x010e
            L_0x00f7:
                java.lang.String r11 = "~="
                boolean r11 = r0.mo11431e(r11)
                if (r11 == 0) goto L_0x0102
                b.i.a.b$c r11 = p005b.p080i.p081a.C1394b.C1397c.INCLUDES
                goto L_0x010e
            L_0x0102:
                java.lang.String r11 = "|="
                boolean r11 = r0.mo11431e(r11)
                if (r11 == 0) goto L_0x010d
                b.i.a.b$c r11 = p005b.p080i.p081a.C1394b.C1397c.DASHMATCH
                goto L_0x010e
            L_0x010d:
                r11 = r3
            L_0x010e:
                if (r11 == 0) goto L_0x0132
                r23.mo11444r()
                boolean r12 = r23.mo11432f()
                if (r12 == 0) goto L_0x011b
                r12 = r3
                goto L_0x0126
            L_0x011b:
                java.lang.String r12 = r23.mo11437k()
                if (r12 == 0) goto L_0x0122
                goto L_0x0126
            L_0x0122:
                java.lang.String r12 = r23.mo11273u()
            L_0x0126:
                if (r12 == 0) goto L_0x012c
                r23.mo11444r()
                goto L_0x0133
            L_0x012c:
                b.i.a.a r1 = new b.i.a.a
                r1.<init>(r10)
                throw r1
            L_0x0132:
                r12 = r3
            L_0x0133:
                r13 = 93
                boolean r13 = r0.mo11430d(r13)
                if (r13 == 0) goto L_0x0147
                if (r11 != 0) goto L_0x013f
                b.i.a.b$c r11 = p005b.p080i.p081a.C1394b.C1397c.EXISTS
            L_0x013f:
                r2.mo11290a(r9, r11, r12)
            L_0x0142:
                r4.mo11287a()
                goto L_0x007b
            L_0x0147:
                b.i.a.a r1 = new b.i.a.a
                r1.<init>(r10)
                throw r1
            L_0x014d:
                b.i.a.a r1 = new b.i.a.a
                r1.<init>(r10)
                throw r1
            L_0x0153:
                r9 = 58
                boolean r9 = r0.mo11430d(r9)
                if (r9 == 0) goto L_0x0410
                if (r2 != 0) goto L_0x0162
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x0162:
                java.lang.String r9 = r23.mo11273u()
                if (r9 == 0) goto L_0x0408
                java.util.Map<java.lang.String, b.i.a.b$j> r10 = p005b.p080i.p081a.C1394b.C1405j.f1848F
                java.lang.Object r10 = r10.get(r9)
                b.i.a.b$j r10 = (p005b.p080i.p081a.C1394b.C1405j) r10
                if (r10 == 0) goto L_0x0173
                goto L_0x0175
            L_0x0173:
                b.i.a.b$j r10 = p005b.p080i.p081a.C1394b.C1405j.UNSUPPORTED
            L_0x0175:
                int r11 = r10.ordinal()
                java.lang.String r12 = "Invalid or missing parameter section for pseudo class: "
                r13 = 40
                r14 = 41
                switch(r11) {
                    case 0: goto L_0x03e6;
                    case 1: goto L_0x03dd;
                    case 2: goto L_0x02bc;
                    case 3: goto L_0x02bc;
                    case 4: goto L_0x02bc;
                    case 5: goto L_0x02bc;
                    case 6: goto L_0x02a7;
                    case 7: goto L_0x029b;
                    case 8: goto L_0x0287;
                    case 9: goto L_0x027a;
                    case 10: goto L_0x0272;
                    case 11: goto L_0x026a;
                    case 12: goto L_0x0264;
                    case 13: goto L_0x01d2;
                    case 14: goto L_0x0195;
                    case 15: goto L_0x018e;
                    case 16: goto L_0x018e;
                    case 17: goto L_0x018e;
                    case 18: goto L_0x018e;
                    case 19: goto L_0x018e;
                    case 20: goto L_0x018e;
                    case 21: goto L_0x018e;
                    case 22: goto L_0x018e;
                    case 23: goto L_0x018e;
                    default: goto L_0x0182;
                }
            L_0x0182:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Unsupported pseudo class: "
                java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m451l(r2, r9)
                r1.<init>(r2)
                throw r1
            L_0x018e:
                b.i.a.b$l r3 = new b.i.a.b$l
                r3.<init>(r9)
                goto L_0x02b7
            L_0x0195:
                boolean r8 = r23.mo11432f()
                if (r8 == 0) goto L_0x019c
                goto L_0x01cb
            L_0x019c:
                int r8 = r0.f2314b
                boolean r10 = r0.mo11430d(r13)
                if (r10 != 0) goto L_0x01a5
                goto L_0x01cb
            L_0x01a5:
                r23.mo11444r()
            L_0x01a8:
                java.lang.String r10 = r23.mo11273u()
                if (r10 != 0) goto L_0x01af
                goto L_0x01c9
            L_0x01af:
                if (r3 != 0) goto L_0x01b6
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x01b6:
                r3.add(r10)
                r23.mo11444r()
                boolean r10 = r23.mo11443q()
                if (r10 != 0) goto L_0x01a8
                boolean r3 = r0.mo11430d(r14)
                if (r3 == 0) goto L_0x01c9
                goto L_0x01cb
            L_0x01c9:
                r0.f2314b = r8
            L_0x01cb:
                b.i.a.b$l r3 = new b.i.a.b$l
                r3.<init>(r9)
                goto L_0x02b7
            L_0x01d2:
                boolean r8 = r23.mo11432f()
                if (r8 == 0) goto L_0x01d9
                goto L_0x0235
            L_0x01d9:
                int r8 = r0.f2314b
                boolean r10 = r0.mo11430d(r13)
                if (r10 != 0) goto L_0x01e2
                goto L_0x0235
            L_0x01e2:
                r23.mo11444r()
                java.util.List r10 = r23.mo11274v()
                if (r10 != 0) goto L_0x01ec
                goto L_0x01f2
            L_0x01ec:
                boolean r11 = r0.mo11430d(r14)
                if (r11 != 0) goto L_0x01f5
            L_0x01f2:
                r0.f2314b = r8
                goto L_0x0235
            L_0x01f5:
                java.util.Iterator r8 = r10.iterator()
            L_0x01f9:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x0234
                java.lang.Object r11 = r8.next()
                b.i.a.b$s r11 = (p005b.p080i.p081a.C1394b.C1414s) r11
                java.util.List<b.i.a.b$t> r11 = r11.f1878a
                if (r11 != 0) goto L_0x020a
                goto L_0x0234
            L_0x020a:
                java.util.Iterator r11 = r11.iterator()
            L_0x020e:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x01f9
                java.lang.Object r13 = r11.next()
                b.i.a.b$t r13 = (p005b.p080i.p081a.C1394b.C1415t) r13
                java.util.List<b.i.a.b$g> r13 = r13.f1883d
                if (r13 != 0) goto L_0x021f
                goto L_0x01f9
            L_0x021f:
                java.util.Iterator r13 = r13.iterator()
            L_0x0223:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x020e
                java.lang.Object r14 = r13.next()
                b.i.a.b$g r14 = (p005b.p080i.p081a.C1394b.C1402g) r14
                boolean r14 = r14 instanceof p005b.p080i.p081a.C1394b.C1406k
                if (r14 == 0) goto L_0x0223
                goto L_0x0235
            L_0x0234:
                r3 = r10
            L_0x0235:
                if (r3 == 0) goto L_0x025a
                b.i.a.b$k r8 = new b.i.a.b$k
                r8.<init>(r3)
                java.util.Iterator r3 = r3.iterator()
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0242:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L_0x0254
                java.lang.Object r10 = r3.next()
                b.i.a.b$s r10 = (p005b.p080i.p081a.C1394b.C1414s) r10
                int r10 = r10.f1879b
                if (r10 <= r9) goto L_0x0242
                r9 = r10
                goto L_0x0242
            L_0x0254:
                r4.f1879b = r9
                r20 = r7
                goto L_0x03f2
            L_0x025a:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m451l(r12, r9)
                r1.<init>(r2)
                throw r1
            L_0x0264:
                b.i.a.b$i r8 = new b.i.a.b$i
                r8.<init>(r3)
                goto L_0x0278
            L_0x026a:
                b.i.a.b$m r3 = new b.i.a.b$m
                java.lang.String r9 = r2.f1881b
                r3.<init>(r8, r9)
                goto L_0x02b7
            L_0x0272:
                b.i.a.b$m r8 = new b.i.a.b$m
                r9 = 0
                r8.<init>(r9, r3)
            L_0x0278:
                r3 = r8
                goto L_0x02b7
            L_0x027a:
                b.i.a.b$h r3 = new b.i.a.b$h
                r11 = 0
                r12 = 1
                r13 = 0
                r14 = 1
                java.lang.String r15 = r2.f1881b
                r10 = r3
                r10.<init>(r11, r12, r13, r14, r15)
                goto L_0x02b7
            L_0x0287:
                b.i.a.b$h r3 = new b.i.a.b$h
                r17 = 0
                r18 = 1
                r19 = 1
                r20 = 1
                java.lang.String r8 = r2.f1881b
                r16 = r3
                r21 = r8
                r16.<init>(r17, r18, r19, r20, r21)
                goto L_0x02b7
            L_0x029b:
                b.i.a.b$h r3 = new b.i.a.b$h
                r10 = 0
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = 0
                r9 = r3
                r9.<init>(r10, r11, r12, r13, r14)
                goto L_0x02b7
            L_0x02a7:
                b.i.a.b$h r3 = new b.i.a.b$h
                r16 = 0
                r17 = 1
                r18 = 1
                r19 = 0
                r20 = 0
                r15 = r3
                r15.<init>(r16, r17, r18, r19, r20)
            L_0x02b7:
                r8 = r3
                r20 = r7
                goto L_0x03ef
            L_0x02bc:
                b.i.a.b$j r11 = p005b.p080i.p081a.C1394b.C1405j.nth_child
                if (r10 == r11) goto L_0x02c9
                b.i.a.b$j r11 = p005b.p080i.p081a.C1394b.C1405j.nth_of_type
                if (r10 != r11) goto L_0x02c5
                goto L_0x02c9
            L_0x02c5:
                r11 = 0
                r17 = r11
                goto L_0x02cb
            L_0x02c9:
                r17 = r8
            L_0x02cb:
                b.i.a.b$j r11 = p005b.p080i.p081a.C1394b.C1405j.nth_of_type
                if (r10 == r11) goto L_0x02d8
                b.i.a.b$j r11 = p005b.p080i.p081a.C1394b.C1405j.nth_last_of_type
                if (r10 != r11) goto L_0x02d4
                goto L_0x02d8
            L_0x02d4:
                r10 = 0
                r18 = r10
                goto L_0x02da
            L_0x02d8:
                r18 = r8
            L_0x02da:
                boolean r10 = r23.mo11432f()
                if (r10 == 0) goto L_0x02e1
                goto L_0x02e9
            L_0x02e1:
                int r10 = r0.f2314b
                boolean r11 = r0.mo11430d(r13)
                if (r11 != 0) goto L_0x02ed
            L_0x02e9:
                r20 = r7
                goto L_0x03bf
            L_0x02ed:
                r23.mo11444r()
                java.lang.String r3 = "odd"
                boolean r3 = r0.mo11431e(r3)
                r11 = 2
                if (r3 == 0) goto L_0x02ff
                b.i.a.b$d$a r3 = new b.i.a.b$d$a
                r3.<init>(r11, r8)
                goto L_0x030d
            L_0x02ff:
                java.lang.String r3 = "even"
                boolean r3 = r0.mo11431e(r3)
                if (r3 == 0) goto L_0x0311
                b.i.a.b$d$a r3 = new b.i.a.b$d$a
                r8 = 0
                r3.<init>(r11, r8)
            L_0x030d:
                r20 = r7
                goto L_0x03b0
            L_0x0311:
                r3 = 43
                boolean r3 = r0.mo11430d(r3)
                r11 = 45
                if (r3 == 0) goto L_0x031c
                goto L_0x0323
            L_0x031c:
                boolean r3 = r0.mo11430d(r11)
                if (r3 == 0) goto L_0x0323
                r8 = -1
            L_0x0323:
                java.lang.String r3 = r0.f2313a
                int r13 = r0.f2314b
                int r14 = r0.f2315c
                r15 = 0
                b.i.a.c r3 = p005b.p080i.p081a.C1417c.m1514a(r3, r13, r14, r15)
                if (r3 == 0) goto L_0x0334
                int r13 = r3.f1887a
                r0.f2314b = r13
            L_0x0334:
                r13 = 110(0x6e, float:1.54E-43)
                boolean r13 = r0.mo11430d(r13)
                if (r13 != 0) goto L_0x0350
                r13 = 78
                boolean r13 = r0.mo11430d(r13)
                if (r13 == 0) goto L_0x0345
                goto L_0x0350
            L_0x0345:
                r11 = 0
                r13 = 0
                r14 = 1
                r22 = r11
                r11 = r8
                r8 = r14
                r14 = r13
                r13 = r22
                goto L_0x0397
            L_0x0350:
                if (r3 == 0) goto L_0x0353
                goto L_0x035c
            L_0x0353:
                b.i.a.c r3 = new b.i.a.c
                r13 = 1
                int r15 = r0.f2314b
                r3.<init>(r13, r15)
            L_0x035c:
                r23.mo11444r()
                r13 = 43
                boolean r13 = r0.mo11430d(r13)
                if (r13 != 0) goto L_0x036f
                boolean r13 = r0.mo11430d(r11)
                if (r13 == 0) goto L_0x036f
                r11 = -1
                goto L_0x0370
            L_0x036f:
                r11 = 1
            L_0x0370:
                if (r13 == 0) goto L_0x038c
                r23.mo11444r()
                java.lang.String r13 = r0.f2313a
                int r14 = r0.f2314b
                int r15 = r0.f2315c
                r16 = r3
                r3 = 0
                b.i.a.c r13 = p005b.p080i.p081a.C1417c.m1514a(r13, r14, r15, r3)
                if (r13 == 0) goto L_0x0389
                int r14 = r13.f1887a
                r0.f2314b = r14
                goto L_0x0390
            L_0x0389:
                r20 = r7
                goto L_0x03bc
            L_0x038c:
                r16 = r3
                r3 = 0
                r13 = 0
            L_0x0390:
                r14 = r16
                r22 = r13
                r13 = r3
                r3 = r22
            L_0x0397:
                b.i.a.b$d$a r15 = new b.i.a.b$d$a
                if (r14 != 0) goto L_0x039c
                goto L_0x03a0
            L_0x039c:
                long r13 = r14.f1888b
                int r13 = (int) r13
                int r13 = r13 * r8
            L_0x03a0:
                if (r3 != 0) goto L_0x03a6
                r3 = 0
                r20 = r7
                goto L_0x03ac
            L_0x03a6:
                r20 = r7
                long r7 = r3.f1888b
                int r3 = (int) r7
                int r3 = r3 * r11
            L_0x03ac:
                r15.<init>(r13, r3)
                r3 = r15
            L_0x03b0:
                r23.mo11444r()
                r7 = 41
                boolean r7 = r0.mo11430d(r7)
                if (r7 == 0) goto L_0x03bc
                goto L_0x03bf
            L_0x03bc:
                r0.f2314b = r10
                r3 = 0
            L_0x03bf:
                if (r3 == 0) goto L_0x03d3
                b.i.a.b$h r7 = new b.i.a.b$h
                int r15 = r3.f1820a
                int r3 = r3.f1821b
                java.lang.String r8 = r2.f1881b
                r14 = r7
                r16 = r3
                r19 = r8
                r14.<init>(r15, r16, r17, r18, r19)
                r8 = r7
                goto L_0x03ef
            L_0x03d3:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m451l(r12, r9)
                r1.<init>(r2)
                throw r1
            L_0x03dd:
                r20 = r7
                b.i.a.b$n r3 = new b.i.a.b$n
                r7 = 0
                r3.<init>(r7)
                goto L_0x03ee
            L_0x03e6:
                r20 = r7
                b.i.a.b$o r7 = new b.i.a.b$o
                r7.<init>(r3)
                r3 = r7
            L_0x03ee:
                r8 = r3
            L_0x03ef:
                r4.mo11287a()
            L_0x03f2:
                java.util.List<b.i.a.b$g> r3 = r2.f1883d
                if (r3 != 0) goto L_0x03fd
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r2.f1883d = r3
            L_0x03fd:
                java.util.List<b.i.a.b$g> r3 = r2.f1883d
                r3.add(r8)
                r3 = 0
                r8 = 1
                r7 = r20
                goto L_0x007b
            L_0x0408:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Invalid pseudo class"
                r1.<init>(r2)
                throw r1
            L_0x0410:
                if (r2 == 0) goto L_0x0424
                java.util.List<b.i.a.b$t> r3 = r4.f1878a
                if (r3 != 0) goto L_0x041d
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.f1878a = r3
            L_0x041d:
                java.util.List<b.i.a.b$t> r3 = r4.f1878a
                r3.add(r2)
                r2 = 1
                goto L_0x0427
            L_0x0424:
                r0.f2314b = r6
            L_0x0426:
                r2 = 0
            L_0x0427:
                if (r2 == 0) goto L_0x043f
                boolean r2 = r23.mo11443q()
                if (r2 != 0) goto L_0x0431
                r2 = 0
                goto L_0x043c
            L_0x0431:
                r1.add(r4)
                b.i.a.b$s r2 = new b.i.a.b$s
                r3 = 0
                r2.<init>(r3)
                r4 = r2
                r2 = r3
            L_0x043c:
                r3 = 1
                goto L_0x0015
            L_0x043f:
                java.util.List<b.i.a.b$t> r2 = r4.f1878a
                if (r2 == 0) goto L_0x044c
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x044a
                goto L_0x044c
            L_0x044a:
                r2 = 0
                goto L_0x044d
            L_0x044c:
                r2 = 1
            L_0x044d:
                if (r2 != 0) goto L_0x0452
                r1.add(r4)
            L_0x0452:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1394b.C1398d.mo11274v():java.util.List");
        }
    }

    /* renamed from: b.i.a.b$e */
    public enum C1400e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* renamed from: b.i.a.b$f */
    public enum C1401f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* renamed from: b.i.a.b$g */
    public interface C1402g {
        /* renamed from: a */
        boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var);
    }

    /* renamed from: b.i.a.b$h */
    public static class C1403h implements C1402g {

        /* renamed from: a */
        public int f1838a;

        /* renamed from: b */
        public int f1839b;

        /* renamed from: c */
        public boolean f1840c;

        /* renamed from: d */
        public boolean f1841d;

        /* renamed from: e */
        public String f1842e;

        public C1403h(int i, int i2, boolean z, boolean z2, String str) {
            this.f1838a = i;
            this.f1839b = i2;
            this.f1840c = z;
            this.f1841d = z2;
            this.f1842e = str;
        }

        /* renamed from: a */
        public boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var) {
            int i;
            int i2;
            String o = (!this.f1841d || this.f1842e != null) ? this.f1842e : k0Var.mo11307o();
            C1422f.C1454i0 i0Var = k0Var.f2066b;
            if (i0Var != null) {
                Iterator<C1422f.C1462m0> it = i0Var.mo11308c().iterator();
                i2 = 0;
                i = 0;
                while (it.hasNext()) {
                    C1422f.C1458k0 k0Var2 = (C1422f.C1458k0) it.next();
                    if (k0Var2 == k0Var) {
                        i2 = i;
                    }
                    if (o == null || k0Var2.mo11307o().equals(o)) {
                        i++;
                    }
                }
            } else {
                i2 = 0;
                i = 1;
            }
            int i3 = this.f1840c ? i2 + 1 : i - i2;
            int i4 = this.f1838a;
            if (i4 == 0) {
                return i3 == this.f1839b;
            }
            int i5 = this.f1839b;
            if ((i3 - i5) % i4 == 0) {
                return Integer.signum(i3 - i5) == 0 || Integer.signum(i3 - this.f1839b) == Integer.signum(this.f1838a);
            }
            return false;
        }

        public String toString() {
            String str = this.f1840c ? "" : "last-";
            if (this.f1841d) {
                return String.format("nth-%schild(%dn%+d of type <%s>)", new Object[]{str, Integer.valueOf(this.f1838a), Integer.valueOf(this.f1839b), this.f1842e});
            }
            return String.format("nth-%schild(%dn%+d)", new Object[]{str, Integer.valueOf(this.f1838a), Integer.valueOf(this.f1839b)});
        }
    }

    /* renamed from: b.i.a.b$i */
    public static class C1404i implements C1402g {
        public C1404i(C1395a aVar) {
        }

        /* renamed from: a */
        public boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var) {
            return !(k0Var instanceof C1422f.C1454i0) || ((C1422f.C1454i0) k0Var).mo11308c().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    /* renamed from: b.i.a.b$j */
    public enum C1405j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;
        

        /* renamed from: F */
        public static final Map<String, C1405j> f1848F = null;

        /* access modifiers changed from: public */
        static {
            f1848F = new HashMap();
            C1405j[] values = values();
            for (int i = 0; i < 25; i++) {
                C1405j jVar = values[i];
                if (jVar != UNSUPPORTED) {
                    f1848F.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }
    }

    /* renamed from: b.i.a.b$k */
    public static class C1406k implements C1402g {

        /* renamed from: a */
        public List<C1414s> f1870a;

        public C1406k(List<C1414s> list) {
            this.f1870a = list;
        }

        /* renamed from: a */
        public boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var) {
            for (C1414s h : this.f1870a) {
                if (C1394b.m1491h(qVar, h, k0Var)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("not(");
            u.append(this.f1870a);
            u.append(")");
            return u.toString();
        }
    }

    /* renamed from: b.i.a.b$l */
    public static class C1407l implements C1402g {

        /* renamed from: a */
        public String f1871a;

        public C1407l(String str) {
            this.f1871a = str;
        }

        /* renamed from: a */
        public boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var) {
            return false;
        }

        public String toString() {
            return this.f1871a;
        }
    }

    /* renamed from: b.i.a.b$m */
    public static class C1408m implements C1402g {

        /* renamed from: a */
        public boolean f1872a;

        /* renamed from: b */
        public String f1873b;

        public C1408m(boolean z, String str) {
            this.f1872a = z;
            this.f1873b = str;
        }

        /* renamed from: a */
        public boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var) {
            int i;
            String o = (!this.f1872a || this.f1873b != null) ? this.f1873b : k0Var.mo11307o();
            C1422f.C1454i0 i0Var = k0Var.f2066b;
            if (i0Var != null) {
                Iterator<C1422f.C1462m0> it = i0Var.mo11308c().iterator();
                i = 0;
                while (it.hasNext()) {
                    C1422f.C1458k0 k0Var2 = (C1422f.C1458k0) it.next();
                    if (o == null || k0Var2.mo11307o().equals(o)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            if (!this.f1872a) {
                return String.format("only-child", new Object[0]);
            }
            return String.format("only-of-type <%s>", new Object[]{this.f1873b});
        }
    }

    /* renamed from: b.i.a.b$n */
    public static class C1409n implements C1402g {
        public C1409n(C1395a aVar) {
        }

        /* renamed from: a */
        public boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var) {
            return k0Var.f2066b == null;
        }

        public String toString() {
            return "root";
        }
    }

    /* renamed from: b.i.a.b$o */
    public static class C1410o implements C1402g {
        public C1410o(C1395a aVar) {
        }

        /* renamed from: a */
        public boolean mo11275a(C1412q qVar, C1422f.C1458k0 k0Var) {
            return qVar != null && k0Var == null;
        }

        public String toString() {
            return "target";
        }
    }

    /* renamed from: b.i.a.b$p */
    public static class C1411p {

        /* renamed from: a */
        public C1414s f1874a = null;

        /* renamed from: b */
        public C1422f.C1433d0 f1875b = null;

        /* renamed from: c */
        public C1416u f1876c;

        public C1411p(C1414s sVar, C1422f.C1433d0 d0Var, C1416u uVar) {
            this.f1874a = sVar;
            this.f1875b = d0Var;
            this.f1876c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f1874a) + " {...} (src=" + this.f1876c + ")";
        }
    }

    /* renamed from: b.i.a.b$q */
    public static class C1412q {
    }

    /* renamed from: b.i.a.b$r */
    public static class C1413r {

        /* renamed from: a */
        public List<C1411p> f1877a = null;

        /* renamed from: a */
        public void mo11284a(C1411p pVar) {
            if (this.f1877a == null) {
                this.f1877a = new ArrayList();
            }
            for (int i = 0; i < this.f1877a.size(); i++) {
                if (this.f1877a.get(i).f1874a.f1879b > pVar.f1874a.f1879b) {
                    this.f1877a.add(i, pVar);
                    return;
                }
            }
            this.f1877a.add(pVar);
        }

        /* renamed from: b */
        public void mo11285b(C1413r rVar) {
            if (rVar.f1877a != null) {
                if (this.f1877a == null) {
                    this.f1877a = new ArrayList(rVar.f1877a.size());
                }
                for (C1411p a : rVar.f1877a) {
                    mo11284a(a);
                }
            }
        }

        public String toString() {
            if (this.f1877a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (C1411p pVar : this.f1877a) {
                sb.append(pVar.toString());
                sb.append(10);
            }
            return sb.toString();
        }
    }

    /* renamed from: b.i.a.b$s */
    public static class C1414s {

        /* renamed from: a */
        public List<C1415t> f1878a = null;

        /* renamed from: b */
        public int f1879b = 0;

        public C1414s() {
        }

        public C1414s(C1395a aVar) {
        }

        /* renamed from: a */
        public void mo11287a() {
            this.f1879b += 1000;
        }

        /* renamed from: b */
        public C1415t mo11288b(int i) {
            return this.f1878a.get(i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (C1415t append : this.f1878a) {
                sb.append(append);
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f1879b);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: b.i.a.b$t */
    public static class C1415t {

        /* renamed from: a */
        public C1400e f1880a = null;

        /* renamed from: b */
        public String f1881b = null;

        /* renamed from: c */
        public List<C1396b> f1882c = null;

        /* renamed from: d */
        public List<C1402g> f1883d = null;

        public C1415t(C1400e eVar, String str) {
            this.f1880a = eVar == null ? C1400e.DESCENDANT : eVar;
            this.f1881b = str;
        }

        /* renamed from: a */
        public void mo11290a(String str, C1397c cVar, String str2) {
            if (this.f1882c == null) {
                this.f1882c = new ArrayList();
            }
            this.f1882c.add(new C1396b(str, cVar, str2));
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                b.i.a.b$e r1 = r5.f1880a
                b.i.a.b$e r2 = p005b.p080i.p081a.C1394b.C1400e.CHILD
                if (r1 != r2) goto L_0x0011
                java.lang.String r1 = "> "
            L_0x000d:
                r0.append(r1)
                goto L_0x0018
            L_0x0011:
                b.i.a.b$e r2 = p005b.p080i.p081a.C1394b.C1400e.FOLLOWS
                if (r1 != r2) goto L_0x0018
                java.lang.String r1 = "+ "
                goto L_0x000d
            L_0x0018:
                java.lang.String r1 = r5.f1881b
                if (r1 != 0) goto L_0x001e
                java.lang.String r1 = "*"
            L_0x001e:
                r0.append(r1)
                java.util.List<b.i.a.b$b> r1 = r5.f1882c
                if (r1 == 0) goto L_0x0068
                java.util.Iterator r1 = r1.iterator()
            L_0x0029:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0068
                java.lang.Object r2 = r1.next()
                b.i.a.b$b r2 = (p005b.p080i.p081a.C1394b.C1396b) r2
                r3 = 91
                r0.append(r3)
                java.lang.String r3 = r2.f1812a
                r0.append(r3)
                b.i.a.b$c r3 = r2.f1813b
                int r3 = r3.ordinal()
                r4 = 1
                if (r3 == r4) goto L_0x0058
                r4 = 2
                if (r3 == r4) goto L_0x0052
                r4 = 3
                if (r3 == r4) goto L_0x004f
                goto L_0x0062
            L_0x004f:
                java.lang.String r3 = "|="
                goto L_0x0054
            L_0x0052:
                java.lang.String r3 = "~="
            L_0x0054:
                r0.append(r3)
                goto L_0x005d
            L_0x0058:
                r3 = 61
                r0.append(r3)
            L_0x005d:
                java.lang.String r2 = r2.f1814c
                r0.append(r2)
            L_0x0062:
                r2 = 93
                r0.append(r2)
                goto L_0x0029
            L_0x0068:
                java.util.List<b.i.a.b$g> r1 = r5.f1883d
                if (r1 == 0) goto L_0x0085
                java.util.Iterator r1 = r1.iterator()
            L_0x0070:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0085
                java.lang.Object r2 = r1.next()
                b.i.a.b$g r2 = (p005b.p080i.p081a.C1394b.C1402g) r2
                r3 = 58
                r0.append(r3)
                r0.append(r2)
                goto L_0x0070
            L_0x0085:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1394b.C1415t.toString():java.lang.String");
        }
    }

    /* renamed from: b.i.a.b$u */
    public enum C1416u {
        Document,
        RenderOptions
    }

    public C1394b(C1401f fVar, C1416u uVar) {
        this.f1809a = fVar;
        this.f1810b = uVar;
    }

    /* renamed from: a */
    public static int m1487a(List<C1422f.C1454i0> list, int i, C1422f.C1458k0 k0Var) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        C1422f.C1454i0 i0Var = list.get(i);
        C1422f.C1454i0 i0Var2 = k0Var.f2066b;
        if (i0Var != i0Var2) {
            return -1;
        }
        for (C1422f.C1462m0 m0Var : i0Var2.mo11308c()) {
            if (m0Var == k0Var) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m1488b(List<C1401f> list, C1401f fVar) {
        for (C1401f next : list) {
            if (next == C1401f.all) {
                return true;
            }
            if (next == fVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static List<C1401f> m1489d(C1398d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.mo11432f()) {
            String str = null;
            if (!dVar.mo11432f()) {
                int i = dVar.f2314b;
                char charAt = dVar.f2313a.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    dVar.f2314b = i;
                } else {
                    while (true) {
                        int a = dVar.mo11427a();
                        if ((a < 65 || a > 90) && (a < 97 || a > 122)) {
                            str = dVar.f2313a.substring(i, dVar.f2314b);
                        }
                    }
                    str = dVar.f2313a.substring(i, dVar.f2314b);
                }
            }
            if (str != null) {
                try {
                    arrayList.add(C1401f.valueOf(str));
                } catch (IllegalArgumentException unused) {
                }
                if (!dVar.mo11443q()) {
                    break;
                }
            } else {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m1490g(C1412q qVar, C1414s sVar, int i, List<C1422f.C1454i0> list, int i2, C1422f.C1458k0 k0Var) {
        C1415t tVar = sVar.f1878a.get(i);
        if (!m1493j(qVar, tVar, k0Var)) {
            return false;
        }
        C1400e eVar = tVar.f1880a;
        if (eVar == C1400e.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 >= 0) {
                if (m1492i(qVar, sVar, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        } else if (eVar == C1400e.CHILD) {
            return m1492i(qVar, sVar, i - 1, list, i2);
        } else {
            int a = m1487a(list, i2, k0Var);
            if (a <= 0) {
                return false;
            }
            return m1490g(qVar, sVar, i - 1, list, i2, (C1422f.C1458k0) k0Var.f2066b.mo11308c().get(a - 1));
        }
    }

    /* renamed from: h */
    public static boolean m1491h(C1412q qVar, C1414s sVar, C1422f.C1458k0 k0Var) {
        int i;
        ArrayList arrayList = new ArrayList();
        C1422f.C1454i0 i0Var = k0Var.f2066b;
        while (true) {
            i = 0;
            if (i0Var == null) {
                break;
            }
            arrayList.add(0, i0Var);
            i0Var = ((C1422f.C1462m0) i0Var).f2066b;
        }
        int size = arrayList.size() - 1;
        List<C1415t> list = sVar.f1878a;
        if ((list == null ? 0 : list.size()) == 1) {
            return m1493j(qVar, sVar.mo11288b(0), k0Var);
        }
        List<C1415t> list2 = sVar.f1878a;
        if (list2 != null) {
            i = list2.size();
        }
        return m1490g(qVar, sVar, i - 1, arrayList, size, k0Var);
    }

    /* renamed from: i */
    public static boolean m1492i(C1412q qVar, C1414s sVar, int i, List<C1422f.C1454i0> list, int i2) {
        C1415t tVar = sVar.f1878a.get(i);
        C1422f.C1458k0 k0Var = (C1422f.C1458k0) list.get(i2);
        if (!m1493j(qVar, tVar, k0Var)) {
            return false;
        }
        C1400e eVar = tVar.f1880a;
        if (eVar == C1400e.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (m1492i(qVar, sVar, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        } else if (eVar == C1400e.CHILD) {
            return m1492i(qVar, sVar, i - 1, list, i2 - 1);
        } else {
            int a = m1487a(list, i2, k0Var);
            if (a <= 0) {
                return false;
            }
            return m1490g(qVar, sVar, i - 1, list, i2, (C1422f.C1458k0) k0Var.f2066b.mo11308c().get(a - 1));
        }
    }

    /* renamed from: j */
    public static boolean m1493j(C1412q qVar, C1415t tVar, C1422f.C1458k0 k0Var) {
        List<String> list;
        String str = tVar.f1881b;
        if (str != null && !str.equals(k0Var.mo11307o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C1396b> list2 = tVar.f1882c;
        if (list2 != null) {
            for (C1396b next : list2) {
                String str2 = next.f1812a;
                str2.hashCode();
                if (!str2.equals(AnalyticsContext.Device.DEVICE_ID_KEY)) {
                    if (!str2.equals("class") || (list = k0Var.f2059g) == null || !list.contains(next.f1814c)) {
                        return false;
                    }
                } else if (!next.f1814c.equals(k0Var.f2055c)) {
                    return false;
                }
            }
        }
        List<C1402g> list3 = tVar.f1883d;
        if (list3 == null) {
            return true;
        }
        for (C1402g a : list3) {
            if (!a.mo11275a(qVar, k0Var)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void mo11268c(C1413r rVar, C1398d dVar) {
        int intValue;
        char charAt;
        char c;
        int s;
        String u = dVar.mo11273u();
        dVar.mo11444r();
        if (u != null) {
            int i = 0;
            if (!this.f1811c && u.equals("media")) {
                List<C1401f> d = m1489d(dVar);
                if (dVar.mo11430d('{')) {
                    dVar.mo11444r();
                    if (m1488b(d, this.f1809a)) {
                        this.f1811c = true;
                        rVar.mo11285b(mo11270f(dVar));
                        this.f1811c = false;
                    } else {
                        mo11270f(dVar);
                    }
                    if (!dVar.mo11432f() && !dVar.mo11430d('}')) {
                        throw new C1393a("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new C1393a("Invalid @media rule: missing rule set");
                }
            } else if (this.f1811c || !u.equals("import")) {
                Log.w("CSSParser", String.format("Ignoring @%s rule", new Object[]{u}));
                while (!dVar.mo11432f() && ((intValue = dVar.mo11434h().intValue()) != 59 || i != 0)) {
                    if (intValue != 123) {
                        if (intValue == 125 && i > 0 && i - 1 == 0) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
            } else {
                String str = null;
                if (!dVar.mo11432f()) {
                    int i2 = dVar.f2314b;
                    if (dVar.mo11431e("url(")) {
                        dVar.mo11444r();
                        String t = dVar.mo11272t();
                        if (t == null) {
                            StringBuilder sb = new StringBuilder();
                            while (!dVar.mo11432f() && (charAt = dVar.f2313a.charAt(dVar.f2314b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !dVar.mo11433g(charAt) && !Character.isISOControl(charAt)) {
                                dVar.f2314b++;
                                if (charAt == '\\') {
                                    if (!dVar.mo11432f()) {
                                        String str2 = dVar.f2313a;
                                        int i3 = dVar.f2314b;
                                        dVar.f2314b = i3 + 1;
                                        charAt = str2.charAt(i3);
                                        if (!(charAt == 10 || charAt == 13 || charAt == 12)) {
                                            int s2 = dVar.mo11271s(charAt);
                                            if (s2 != -1) {
                                                for (int i4 = 1; i4 <= 5 && !dVar.mo11432f() && (s = dVar.mo11271s(dVar.f2313a.charAt(dVar.f2314b))) != -1; i4++) {
                                                    dVar.f2314b++;
                                                    s2 = (s2 * 16) + s;
                                                }
                                                c = (char) s2;
                                                sb.append(c);
                                            }
                                        }
                                    }
                                }
                                c = (char) charAt;
                                sb.append(c);
                            }
                            t = sb.length() == 0 ? null : sb.toString();
                        }
                        if (t != null) {
                            dVar.mo11444r();
                            if (dVar.mo11432f() || dVar.mo11431e(")")) {
                                str = t;
                            }
                        }
                        dVar.f2314b = i2;
                    }
                }
                if (str == null) {
                    str = dVar.mo11272t();
                }
                if (str != null) {
                    dVar.mo11444r();
                    m1489d(dVar);
                    if (!dVar.mo11432f() && !dVar.mo11430d(';')) {
                        throw new C1393a("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new C1393a("Invalid @import rule: expected string or url()");
                }
            }
            dVar.mo11444r();
            return;
        }
        throw new C1393a("Invalid '@' rule");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11269e(p005b.p080i.p081a.C1394b.C1413r r14, p005b.p080i.p081a.C1394b.C1398d r15) {
        /*
            r13 = this;
            java.util.List r0 = r15.mo11274v()
            r1 = 0
            if (r0 == 0) goto L_0x00e8
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00e8
            r2 = 123(0x7b, float:1.72E-43)
            boolean r2 = r15.mo11430d(r2)
            if (r2 == 0) goto L_0x00e0
            r15.mo11444r()
            b.i.a.f$d0 r2 = new b.i.a.f$d0
            r2.<init>()
        L_0x001d:
            java.lang.String r3 = r15.mo11273u()
            r15.mo11444r()
            r4 = 58
            boolean r4 = r15.mo11430d(r4)
            if (r4 == 0) goto L_0x00d8
            r15.mo11444r()
            boolean r4 = r15.mo11432f()
            r5 = 0
            r6 = 33
            r7 = 125(0x7d, float:1.75E-43)
            r8 = 59
            r9 = 1
            if (r4 == 0) goto L_0x003e
            goto L_0x007a
        L_0x003e:
            int r4 = r15.f2314b
            java.lang.String r10 = r15.f2313a
            char r10 = r10.charAt(r4)
            r11 = r4
        L_0x0047:
            r12 = -1
            if (r10 == r12) goto L_0x006d
            if (r10 == r8) goto L_0x006d
            if (r10 == r7) goto L_0x006d
            if (r10 == r6) goto L_0x006d
            r12 = 10
            if (r10 == r12) goto L_0x005b
            r12 = 13
            if (r10 != r12) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r12 = r1
            goto L_0x005c
        L_0x005b:
            r12 = r9
        L_0x005c:
            if (r12 != 0) goto L_0x006d
            boolean r10 = r15.mo11433g(r10)
            if (r10 != 0) goto L_0x0068
            int r10 = r15.f2314b
            int r11 = r10 + 1
        L_0x0068:
            int r10 = r15.mo11427a()
            goto L_0x0047
        L_0x006d:
            int r10 = r15.f2314b
            if (r10 <= r4) goto L_0x0078
            java.lang.String r5 = r15.f2313a
            java.lang.String r5 = r5.substring(r4, r11)
            goto L_0x007a
        L_0x0078:
            r15.f2314b = r4
        L_0x007a:
            if (r5 == 0) goto L_0x00d0
            r15.mo11444r()
            boolean r4 = r15.mo11430d(r6)
            if (r4 == 0) goto L_0x009c
            r15.mo11444r()
            java.lang.String r4 = "important"
            boolean r4 = r15.mo11431e(r4)
            if (r4 == 0) goto L_0x0094
            r15.mo11444r()
            goto L_0x009c
        L_0x0094:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Malformed rule set: found unexpected '!'"
            r14.<init>(r15)
            throw r14
        L_0x009c:
            r15.mo11430d(r8)
            p005b.p080i.p081a.C1502i.m1706J(r2, r3, r5)
            r15.mo11444r()
            boolean r3 = r15.mo11432f()
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r15.mo11430d(r7)
            if (r3 == 0) goto L_0x001d
        L_0x00b1:
            r15.mo11444r()
            java.util.Iterator r15 = r0.iterator()
        L_0x00b8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r15.next()
            b.i.a.b$s r0 = (p005b.p080i.p081a.C1394b.C1414s) r0
            b.i.a.b$p r1 = new b.i.a.b$p
            b.i.a.b$u r3 = r13.f1810b
            r1.<init>(r0, r2, r3)
            r14.mo11284a(r1)
            goto L_0x00b8
        L_0x00cf:
            return r9
        L_0x00d0:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Expected property value"
            r14.<init>(r15)
            throw r14
        L_0x00d8:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Expected ':'"
            r14.<init>(r15)
            throw r14
        L_0x00e0:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Malformed rule block: expected '{'"
            r14.<init>(r15)
            throw r14
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p080i.p081a.C1394b.mo11269e(b.i.a.b$r, b.i.a.b$d):boolean");
    }

    /* renamed from: f */
    public final C1413r mo11270f(C1398d dVar) {
        C1413r rVar = new C1413r();
        while (!dVar.mo11432f()) {
            try {
                if (!dVar.mo11431e("<!--")) {
                    if (!dVar.mo11431e("-->")) {
                        if (!dVar.mo11430d('@')) {
                            if (!mo11269e(rVar, dVar)) {
                                break;
                            }
                        } else {
                            mo11268c(rVar, dVar);
                        }
                    }
                }
            } catch (C1393a e) {
                StringBuilder u = C0843a.m460u("CSS parser terminated early due to error: ");
                u.append(e.getMessage());
                Log.e("CSSParser", u.toString());
            }
        }
        return rVar;
    }
}
