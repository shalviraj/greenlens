package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.f */
public final class C4093f extends C4129v.C4134d {

    /* renamed from: a */
    public final String f7604a;

    /* renamed from: b */
    public final String f7605b;

    /* renamed from: c */
    public final long f7606c;

    /* renamed from: d */
    public final Long f7607d;

    /* renamed from: e */
    public final boolean f7608e;

    /* renamed from: f */
    public final C4129v.C4134d.C4135a f7609f;

    /* renamed from: g */
    public final C4129v.C4134d.C4154f f7610g;

    /* renamed from: h */
    public final C4129v.C4134d.C4153e f7611h;

    /* renamed from: i */
    public final C4129v.C4134d.C4138c f7612i;

    /* renamed from: j */
    public final C4155w<C4129v.C4134d.C4140d> f7613j;

    /* renamed from: k */
    public final int f7614k;

    /* renamed from: b.l.d.q.f.i.f$b */
    public static final class C4095b extends C4129v.C4134d.C4137b {

        /* renamed from: a */
        public String f7615a;

        /* renamed from: b */
        public String f7616b;

        /* renamed from: c */
        public Long f7617c;

        /* renamed from: d */
        public Long f7618d;

        /* renamed from: e */
        public Boolean f7619e;

        /* renamed from: f */
        public C4129v.C4134d.C4135a f7620f;

        /* renamed from: g */
        public C4129v.C4134d.C4154f f7621g;

        /* renamed from: h */
        public C4129v.C4134d.C4153e f7622h;

        /* renamed from: i */
        public C4129v.C4134d.C4138c f7623i;

        /* renamed from: j */
        public C4155w<C4129v.C4134d.C4140d> f7624j;

        /* renamed from: k */
        public Integer f7625k;

        public C4095b() {
        }

        public C4095b(C4129v.C4134d dVar, C4094a aVar) {
            C4093f fVar = (C4093f) dVar;
            this.f7615a = fVar.f7604a;
            this.f7616b = fVar.f7605b;
            this.f7617c = Long.valueOf(fVar.f7606c);
            this.f7618d = fVar.f7607d;
            this.f7619e = Boolean.valueOf(fVar.f7608e);
            this.f7620f = fVar.f7609f;
            this.f7621g = fVar.f7610g;
            this.f7622h = fVar.f7611h;
            this.f7623i = fVar.f7612i;
            this.f7624j = fVar.f7613j;
            this.f7625k = Integer.valueOf(fVar.f7614k);
        }

        /* renamed from: a */
        public C4129v.C4134d mo15625a() {
            String str = this.f7615a == null ? " generator" : "";
            if (this.f7616b == null) {
                str = C0843a.m451l(str, " identifier");
            }
            if (this.f7617c == null) {
                str = C0843a.m451l(str, " startedAt");
            }
            if (this.f7619e == null) {
                str = C0843a.m451l(str, " crashed");
            }
            if (this.f7620f == null) {
                str = C0843a.m451l(str, " app");
            }
            if (this.f7625k == null) {
                str = C0843a.m451l(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new C4093f(this.f7615a, this.f7616b, this.f7617c.longValue(), this.f7618d, this.f7619e.booleanValue(), this.f7620f, this.f7621g, this.f7622h, this.f7623i, this.f7624j, this.f7625k.intValue(), (C4094a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }

        /* renamed from: b */
        public C4129v.C4134d.C4137b mo15626b(boolean z) {
            this.f7619e = Boolean.valueOf(z);
            return this;
        }
    }

    public C4093f(String str, String str2, long j, Long l, boolean z, C4129v.C4134d.C4135a aVar, C4129v.C4134d.C4154f fVar, C4129v.C4134d.C4153e eVar, C4129v.C4134d.C4138c cVar, C4155w wVar, int i, C4094a aVar2) {
        this.f7604a = str;
        this.f7605b = str2;
        this.f7606c = j;
        this.f7607d = l;
        this.f7608e = z;
        this.f7609f = aVar;
        this.f7610g = fVar;
        this.f7611h = eVar;
        this.f7612i = cVar;
        this.f7613j = wVar;
        this.f7614k = i;
    }

    @NonNull
    /* renamed from: a */
    public C4129v.C4134d.C4135a mo15610a() {
        return this.f7609f;
    }

    @Nullable
    /* renamed from: b */
    public C4129v.C4134d.C4138c mo15611b() {
        return this.f7612i;
    }

    @Nullable
    /* renamed from: c */
    public Long mo15612c() {
        return this.f7607d;
    }

    @Nullable
    /* renamed from: d */
    public C4155w<C4129v.C4134d.C4140d> mo15613d() {
        return this.f7613j;
    }

    @NonNull
    /* renamed from: e */
    public String mo15614e() {
        return this.f7604a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f7607d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f7610g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f7611h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f7612i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f7613j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            b.l.d.q.f.i.v$d r8 = (p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d) r8
            java.lang.String r1 = r7.f7604a
            java.lang.String r3 = r8.mo15614e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f7605b
            java.lang.String r3 = r8.mo15617g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.f7606c
            long r5 = r8.mo15620i()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.f7607d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.mo15612c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.mo15612c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f7608e
            boolean r3 = r8.mo15622k()
            if (r1 != r3) goto L_0x00b3
            b.l.d.q.f.i.v$d$a r1 = r7.f7609f
            b.l.d.q.f.i.v$d$a r3 = r8.mo15610a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            b.l.d.q.f.i.v$d$f r1 = r7.f7610g
            if (r1 != 0) goto L_0x0061
            b.l.d.q.f.i.v$d$f r1 = r8.mo15621j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            b.l.d.q.f.i.v$d$f r3 = r8.mo15621j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            b.l.d.q.f.i.v$d$e r1 = r7.f7611h
            if (r1 != 0) goto L_0x0076
            b.l.d.q.f.i.v$d$e r1 = r8.mo15618h()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            b.l.d.q.f.i.v$d$e r3 = r8.mo15618h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            b.l.d.q.f.i.v$d$c r1 = r7.f7612i
            if (r1 != 0) goto L_0x008b
            b.l.d.q.f.i.v$d$c r1 = r8.mo15611b()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            b.l.d.q.f.i.v$d$c r3 = r8.mo15611b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            b.l.d.q.f.i.w<b.l.d.q.f.i.v$d$d> r1 = r7.f7613j
            if (r1 != 0) goto L_0x00a0
            b.l.d.q.f.i.w r1 = r8.mo15613d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            b.l.d.q.f.i.w r3 = r8.mo15613d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f7614k
            int r8 = r8.mo15616f()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p197i.C4093f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo15616f() {
        return this.f7614k;
    }

    @NonNull
    /* renamed from: g */
    public String mo15617g() {
        return this.f7605b;
    }

    @Nullable
    /* renamed from: h */
    public C4129v.C4134d.C4153e mo15618h() {
        return this.f7611h;
    }

    public int hashCode() {
        long j = this.f7606c;
        int hashCode = (((((this.f7604a.hashCode() ^ 1000003) * 1000003) ^ this.f7605b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f7607d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f7608e ? 1231 : 1237)) * 1000003) ^ this.f7609f.hashCode()) * 1000003;
        C4129v.C4134d.C4154f fVar = this.f7610g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C4129v.C4134d.C4153e eVar = this.f7611h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C4129v.C4134d.C4138c cVar = this.f7612i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C4155w<C4129v.C4134d.C4140d> wVar = this.f7613j;
        if (wVar != null) {
            i = wVar.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.f7614k;
    }

    /* renamed from: i */
    public long mo15620i() {
        return this.f7606c;
    }

    @Nullable
    /* renamed from: j */
    public C4129v.C4134d.C4154f mo15621j() {
        return this.f7610g;
    }

    /* renamed from: k */
    public boolean mo15622k() {
        return this.f7608e;
    }

    /* renamed from: l */
    public C4129v.C4134d.C4137b mo15623l() {
        return new C4095b(this, (C4094a) null);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Session{generator=");
        u.append(this.f7604a);
        u.append(", identifier=");
        u.append(this.f7605b);
        u.append(", startedAt=");
        u.append(this.f7606c);
        u.append(", endedAt=");
        u.append(this.f7607d);
        u.append(", crashed=");
        u.append(this.f7608e);
        u.append(", app=");
        u.append(this.f7609f);
        u.append(", user=");
        u.append(this.f7610g);
        u.append(", os=");
        u.append(this.f7611h);
        u.append(", device=");
        u.append(this.f7612i);
        u.append(", events=");
        u.append(this.f7613j);
        u.append(", generatorType=");
        return C0843a.m453n(u, this.f7614k, "}");
    }
}
