package p421m;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: m.e */
public final class C7837e {

    /* renamed from: n */
    public static final C7838a f15513n = new C7838a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final boolean f15514a;

    /* renamed from: b */
    public final boolean f15515b;

    /* renamed from: c */
    public final int f15516c;

    /* renamed from: d */
    public final int f15517d;

    /* renamed from: e */
    public final boolean f15518e;

    /* renamed from: f */
    public final boolean f15519f;

    /* renamed from: g */
    public final boolean f15520g;

    /* renamed from: h */
    public final int f15521h;

    /* renamed from: i */
    public final int f15522i;

    /* renamed from: j */
    public final boolean f15523j;

    /* renamed from: k */
    public final boolean f15524k;

    /* renamed from: l */
    public final boolean f15525l;

    /* renamed from: m */
    public String f15526m;

    /* renamed from: m.e$a */
    public static final class C7838a {
        public C7838a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final int mo25530a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C7694h.m13925c(str2, str.charAt(i), false, 2)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p421m.C7837e mo25531b(p421m.C8022y r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                java.lang.String r2 = "headers"
                p298d.p344x.p346c.C6888i.m12438e(r1, r2)
                int r2 = r27.size()
                r6 = 1
                r8 = r6
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0191
                java.lang.String r3 = r1.mo25840l(r7)
                java.lang.String r4 = r1.mo25842q(r7)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r3, r5, r6)
                if (r5 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r4
                goto L_0x0043
            L_0x003a:
                java.lang.String r5 = "Pragma"
                boolean r3 = p298d.p415c0.C7694h.m13928f(r3, r5, r6)
                if (r3 == 0) goto L_0x0185
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r5 = r4.length()
                if (r3 >= r5) goto L_0x0180
                java.lang.String r5 = "=,;"
                int r5 = r0.mo25530a(r4, r5, r3)
                java.lang.String r3 = r4.substring(r3, r5)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p298d.p344x.p346c.C6888i.m12437d(r3, r6)
                java.lang.CharSequence r3 = p298d.p415c0.C7694h.m13921L(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r4.length()
                if (r5 == r1) goto L_0x00dc
                char r1 = r4.charAt(r5)
                r24 = r2
                r2 = 44
                if (r1 == r2) goto L_0x00de
                char r1 = r4.charAt(r5)
                r2 = 59
                if (r1 != r2) goto L_0x007a
                goto L_0x00de
            L_0x007a:
                int r5 = r5 + 1
                byte[] r1 = p421m.p422m0.C7867c.f15619a
                java.lang.String r1 = "$this$indexOfNonWhitespace"
                p298d.p344x.p346c.C6888i.m12438e(r4, r1)
                int r1 = r4.length()
            L_0x0087:
                if (r5 >= r1) goto L_0x009d
                char r2 = r4.charAt(r5)
                r25 = r1
                r1 = 32
                if (r2 == r1) goto L_0x0098
                r1 = 9
                if (r2 == r1) goto L_0x0098
                goto L_0x00a1
            L_0x0098:
                int r5 = r5 + 1
                r1 = r25
                goto L_0x0087
            L_0x009d:
                int r5 = r4.length()
            L_0x00a1:
                int r1 = r4.length()
                if (r5 >= r1) goto L_0x00c3
                char r1 = r4.charAt(r5)
                r2 = 34
                if (r1 != r2) goto L_0x00c3
                int r5 = r5 + 1
                r1 = 4
                r25 = r9
                r9 = 0
                int r1 = p298d.p415c0.C7694h.m13933k(r4, r2, r5, r9, r1)
                java.lang.String r2 = r4.substring(r5, r1)
                p298d.p344x.p346c.C6888i.m12437d(r2, r6)
                r5 = 1
                int r1 = r1 + r5
                goto L_0x00e5
            L_0x00c3:
                r25 = r9
                r9 = 0
                java.lang.String r1 = ",;"
                int r1 = r0.mo25530a(r4, r1, r5)
                java.lang.String r2 = r4.substring(r5, r1)
                p298d.p344x.p346c.C6888i.m12437d(r2, r6)
                java.lang.CharSequence r2 = p298d.p415c0.C7694h.m13921L(r2)
                java.lang.String r2 = r2.toString()
                goto L_0x00e5
            L_0x00dc:
                r24 = r2
            L_0x00de:
                r25 = r9
                r9 = 0
                int r5 = r5 + 1
                r1 = r5
                r2 = 0
            L_0x00e5:
                java.lang.String r5 = "no-cache"
                r6 = 1
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x00f2
                r10 = r6
            L_0x00ef:
                r5 = -1
                goto L_0x0177
            L_0x00f2:
                java.lang.String r5 = "no-store"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x00fc
                r11 = r6
                goto L_0x00ef
            L_0x00fc:
                java.lang.String r5 = "max-age"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x010b
                r5 = -1
                int r12 = p421m.p422m0.C7867c.m14305z(r2, r5)
                goto L_0x0177
            L_0x010b:
                r5 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = p298d.p415c0.C7694h.m13928f(r9, r3, r6)
                if (r9 == 0) goto L_0x0119
                int r13 = p421m.p422m0.C7867c.m14305z(r2, r5)
                goto L_0x0177
            L_0x0119:
                java.lang.String r5 = "private"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x0123
                r14 = r6
                goto L_0x00ef
            L_0x0123:
                java.lang.String r5 = "public"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x012d
                r15 = r6
                goto L_0x00ef
            L_0x012d:
                java.lang.String r5 = "must-revalidate"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x0138
                r16 = r6
                goto L_0x00ef
            L_0x0138:
                java.lang.String r5 = "max-stale"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x0148
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = p421m.p422m0.C7867c.m14305z(r2, r3)
                goto L_0x00ef
            L_0x0148:
                java.lang.String r5 = "min-fresh"
                boolean r5 = p298d.p415c0.C7694h.m13928f(r5, r3, r6)
                if (r5 == 0) goto L_0x0156
                r5 = -1
                int r18 = p421m.p422m0.C7867c.m14305z(r2, r5)
                goto L_0x0177
            L_0x0156:
                r5 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = p298d.p415c0.C7694h.m13928f(r2, r3, r6)
                if (r2 == 0) goto L_0x0162
                r19 = r6
                goto L_0x0177
            L_0x0162:
                java.lang.String r2 = "no-transform"
                boolean r2 = p298d.p415c0.C7694h.m13928f(r2, r3, r6)
                if (r2 == 0) goto L_0x016d
                r20 = r6
                goto L_0x0177
            L_0x016d:
                java.lang.String r2 = "immutable"
                boolean r2 = p298d.p415c0.C7694h.m13928f(r2, r3, r6)
                if (r2 == 0) goto L_0x0177
                r21 = r6
            L_0x0177:
                r3 = r1
                r2 = r24
                r9 = r25
                r1 = r27
                goto L_0x0044
            L_0x0180:
                r24 = r2
                r25 = r9
                goto L_0x0188
            L_0x0185:
                r24 = r2
                r3 = r9
            L_0x0188:
                r5 = -1
                int r7 = r7 + 1
                r1 = r27
                r2 = r24
                goto L_0x0023
            L_0x0191:
                r3 = r9
                if (r8 != 0) goto L_0x0197
                r22 = 0
                goto L_0x0199
            L_0x0197:
                r22 = r3
            L_0x0199:
                m.e r1 = new m.e
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.C7837e.C7838a.mo25531b(m.y):m.e");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C6888i.m12438e(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public C7837e(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f15514a = z;
        this.f15515b = z2;
        this.f15516c = i;
        this.f15517d = i2;
        this.f15518e = z3;
        this.f15519f = z4;
        this.f15520g = z5;
        this.f15521h = i3;
        this.f15522i = i4;
        this.f15523j = z6;
        this.f15524k = z7;
        this.f15525l = z8;
        this.f15526m = str;
    }

    public String toString() {
        String str = this.f15526m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f15514a) {
            sb.append("no-cache, ");
        }
        if (this.f15515b) {
            sb.append("no-store, ");
        }
        if (this.f15516c != -1) {
            sb.append("max-age=");
            sb.append(this.f15516c);
            sb.append(", ");
        }
        if (this.f15517d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f15517d);
            sb.append(", ");
        }
        if (this.f15518e) {
            sb.append("private, ");
        }
        if (this.f15519f) {
            sb.append("public, ");
        }
        if (this.f15520g) {
            sb.append("must-revalidate, ");
        }
        if (this.f15521h != -1) {
            sb.append("max-stale=");
            sb.append(this.f15521h);
            sb.append(", ");
        }
        if (this.f15522i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f15522i);
            sb.append(", ");
        }
        if (this.f15523j) {
            sb.append("only-if-cached, ");
        }
        if (this.f15524k) {
            sb.append("no-transform, ");
        }
        if (this.f15525l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f15526m = sb2;
        return sb2;
    }
}
