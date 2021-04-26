package p005b.p096l.p097a.p098a.p101f;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.C1634e;

/* renamed from: b.l.a.a.f.a */
public final class C1625a extends C1634e {

    /* renamed from: a */
    public final String f2847a;

    /* renamed from: b */
    public final Integer f2848b;

    /* renamed from: c */
    public final C1633d f2849c;

    /* renamed from: d */
    public final long f2850d;

    /* renamed from: e */
    public final long f2851e;

    /* renamed from: f */
    public final Map<String, String> f2852f;

    /* renamed from: b.l.a.a.f.a$b */
    public static final class C1627b extends C1634e.C1635a {

        /* renamed from: a */
        public String f2853a;

        /* renamed from: b */
        public Integer f2854b;

        /* renamed from: c */
        public C1633d f2855c;

        /* renamed from: d */
        public Long f2856d;

        /* renamed from: e */
        public Long f2857e;

        /* renamed from: f */
        public Map<String, String> f2858f;

        /* renamed from: b */
        public C1634e mo11802b() {
            String str = this.f2853a == null ? " transportName" : "";
            if (this.f2855c == null) {
                str = C0843a.m451l(str, " encodedPayload");
            }
            if (this.f2856d == null) {
                str = C0843a.m451l(str, " eventMillis");
            }
            if (this.f2857e == null) {
                str = C0843a.m451l(str, " uptimeMillis");
            }
            if (this.f2858f == null) {
                str = C0843a.m451l(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new C1625a(this.f2853a, this.f2854b, this.f2855c, this.f2856d.longValue(), this.f2857e.longValue(), this.f2858f, (C1626a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }

        /* renamed from: c */
        public Map<String, String> mo11803c() {
            Map<String, String> map = this.f2858f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* renamed from: d */
        public C1634e.C1635a mo11804d(C1633d dVar) {
            Objects.requireNonNull(dVar, "Null encodedPayload");
            this.f2855c = dVar;
            return this;
        }

        /* renamed from: e */
        public C1634e.C1635a mo11805e(long j) {
            this.f2856d = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C1634e.C1635a mo11806f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f2853a = str;
            return this;
        }

        /* renamed from: g */
        public C1634e.C1635a mo11807g(long j) {
            this.f2857e = Long.valueOf(j);
            return this;
        }
    }

    public C1625a(String str, Integer num, C1633d dVar, long j, long j2, Map map, C1626a aVar) {
        this.f2847a = str;
        this.f2848b = num;
        this.f2849c = dVar;
        this.f2850d = j;
        this.f2851e = j2;
        this.f2852f = map;
    }

    /* renamed from: b */
    public Map<String, String> mo11793b() {
        return this.f2852f;
    }

    @Nullable
    /* renamed from: c */
    public Integer mo11794c() {
        return this.f2848b;
    }

    /* renamed from: d */
    public C1633d mo11795d() {
        return this.f2849c;
    }

    /* renamed from: e */
    public long mo11796e() {
        return this.f2850d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f2848b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p005b.p096l.p097a.p098a.p101f.C1634e
            r2 = 0
            if (r1 == 0) goto L_0x005b
            b.l.a.a.f.e r8 = (p005b.p096l.p097a.p098a.p101f.C1634e) r8
            java.lang.String r1 = r7.f2847a
            java.lang.String r3 = r8.mo11798g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f2848b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.mo11794c()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.mo11794c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            b.l.a.a.f.d r1 = r7.f2849c
            b.l.a.a.f.d r3 = r8.mo11795d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f2850d
            long r5 = r8.mo11796e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f2851e
            long r5 = r8.mo11799h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f2852f
            java.util.Map r8 = r8.mo11793b()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p098a.p101f.C1625a.equals(java.lang.Object):boolean");
    }

    /* renamed from: g */
    public String mo11798g() {
        return this.f2847a;
    }

    /* renamed from: h */
    public long mo11799h() {
        return this.f2851e;
    }

    public int hashCode() {
        int hashCode = (this.f2847a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f2848b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f2850d;
        long j2 = this.f2851e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f2849c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f2852f.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("EventInternal{transportName=");
        u.append(this.f2847a);
        u.append(", code=");
        u.append(this.f2848b);
        u.append(", encodedPayload=");
        u.append(this.f2849c);
        u.append(", eventMillis=");
        u.append(this.f2850d);
        u.append(", uptimeMillis=");
        u.append(this.f2851e);
        u.append(", autoMetadata=");
        u.append(this.f2852f);
        u.append("}");
        return u.toString();
    }
}
