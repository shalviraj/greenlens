package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.q */
public final class C4117q extends C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a {

    /* renamed from: a */
    public final long f7683a;

    /* renamed from: b */
    public final String f7684b;

    /* renamed from: c */
    public final String f7685c;

    /* renamed from: d */
    public final long f7686d;

    /* renamed from: e */
    public final int f7687e;

    /* renamed from: b.l.d.q.f.i.q$b */
    public static final class C4119b extends C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a.C4149a {

        /* renamed from: a */
        public Long f7688a;

        /* renamed from: b */
        public String f7689b;

        /* renamed from: c */
        public String f7690c;

        /* renamed from: d */
        public Long f7691d;

        /* renamed from: e */
        public Integer f7692e;

        /* renamed from: a */
        public C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a mo15713a() {
            String str = this.f7688a == null ? " pc" : "";
            if (this.f7689b == null) {
                str = C0843a.m451l(str, " symbol");
            }
            if (this.f7691d == null) {
                str = C0843a.m451l(str, " offset");
            }
            if (this.f7692e == null) {
                str = C0843a.m451l(str, " importance");
            }
            if (str.isEmpty()) {
                return new C4117q(this.f7688a.longValue(), this.f7689b, this.f7690c, this.f7691d.longValue(), this.f7692e.intValue(), (C4118a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }
    }

    public C4117q(long j, String str, String str2, long j2, int i, C4118a aVar) {
        this.f7683a = j;
        this.f7684b = str;
        this.f7685c = str2;
        this.f7686d = j2;
        this.f7687e = i;
    }

    @Nullable
    /* renamed from: a */
    public String mo15705a() {
        return this.f7685c;
    }

    /* renamed from: b */
    public int mo15706b() {
        return this.f7687e;
    }

    /* renamed from: c */
    public long mo15707c() {
        return this.f7686d;
    }

    /* renamed from: d */
    public long mo15708d() {
        return this.f7683a;
    }

    @NonNull
    /* renamed from: e */
    public String mo15709e() {
        return this.f7684b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f7685c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a
            r2 = 0
            if (r1 == 0) goto L_0x004b
            b.l.d.q.f.i.v$d$d$a$b$d$a r8 = (p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a) r8
            long r3 = r7.f7683a
            long r5 = r8.mo15708d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f7684b
            java.lang.String r3 = r8.mo15709e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f7685c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.mo15705a()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.mo15705a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f7686d
            long r5 = r8.mo15707c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f7687e
            int r8 = r8.mo15706b()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p197i.C4117q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long j = this.f7683a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f7684b.hashCode()) * 1000003;
        String str = this.f7685c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f7686d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f7687e;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Frame{pc=");
        u.append(this.f7683a);
        u.append(", symbol=");
        u.append(this.f7684b);
        u.append(", file=");
        u.append(this.f7685c);
        u.append(", offset=");
        u.append(this.f7686d);
        u.append(", importance=");
        return C0843a.m453n(u, this.f7687e, "}");
    }
}
