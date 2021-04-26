package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.k */
public final class C4104k extends C4129v.C4134d.C4140d.C4141a {

    /* renamed from: a */
    public final C4129v.C4134d.C4140d.C4141a.C4143b f7656a;

    /* renamed from: b */
    public final C4155w<C4129v.C4131b> f7657b;

    /* renamed from: c */
    public final Boolean f7658c;

    /* renamed from: d */
    public final int f7659d;

    /* renamed from: b.l.d.q.f.i.k$b */
    public static final class C4106b extends C4129v.C4134d.C4140d.C4141a.C4142a {

        /* renamed from: a */
        public C4129v.C4134d.C4140d.C4141a.C4143b f7660a;

        /* renamed from: b */
        public C4155w<C4129v.C4131b> f7661b;

        /* renamed from: c */
        public Boolean f7662c;

        /* renamed from: d */
        public Integer f7663d;

        public C4106b() {
        }

        public C4106b(C4129v.C4134d.C4140d.C4141a aVar, C4105a aVar2) {
            C4104k kVar = (C4104k) aVar;
            this.f7660a = kVar.f7656a;
            this.f7661b = kVar.f7657b;
            this.f7662c = kVar.f7658c;
            this.f7663d = Integer.valueOf(kVar.f7659d);
        }

        /* renamed from: a */
        public C4129v.C4134d.C4140d.C4141a mo15670a() {
            String str = this.f7660a == null ? " execution" : "";
            if (this.f7663d == null) {
                str = C0843a.m451l(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new C4104k(this.f7660a, this.f7661b, this.f7662c, this.f7663d.intValue(), (C4105a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }
    }

    public C4104k(C4129v.C4134d.C4140d.C4141a.C4143b bVar, C4155w wVar, Boolean bool, int i, C4105a aVar) {
        this.f7656a = bVar;
        this.f7657b = wVar;
        this.f7658c = bool;
        this.f7659d = i;
    }

    @Nullable
    /* renamed from: a */
    public Boolean mo15662a() {
        return this.f7658c;
    }

    @Nullable
    /* renamed from: b */
    public C4155w<C4129v.C4131b> mo15663b() {
        return this.f7657b;
    }

    @NonNull
    /* renamed from: c */
    public C4129v.C4134d.C4140d.C4141a.C4143b mo15664c() {
        return this.f7656a;
    }

    /* renamed from: d */
    public int mo15665d() {
        return this.f7659d;
    }

    /* renamed from: e */
    public C4129v.C4134d.C4140d.C4141a.C4142a mo15666e() {
        return new C4106b(this, (C4105a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f7658c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f7657b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d.C4140d.C4141a
            r2 = 0
            if (r1 == 0) goto L_0x004c
            b.l.d.q.f.i.v$d$d$a r5 = (p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d.C4140d.C4141a) r5
            b.l.d.q.f.i.v$d$d$a$b r1 = r4.f7656a
            b.l.d.q.f.i.v$d$d$a$b r3 = r5.mo15664c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            b.l.d.q.f.i.w<b.l.d.q.f.i.v$b> r1 = r4.f7657b
            if (r1 != 0) goto L_0x0022
            b.l.d.q.f.i.w r1 = r5.mo15663b()
            if (r1 != 0) goto L_0x004a
            goto L_0x002c
        L_0x0022:
            b.l.d.q.f.i.w r3 = r5.mo15663b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x002c:
            java.lang.Boolean r1 = r4.f7658c
            if (r1 != 0) goto L_0x0037
            java.lang.Boolean r1 = r5.mo15662a()
            if (r1 != 0) goto L_0x004a
            goto L_0x0041
        L_0x0037:
            java.lang.Boolean r3 = r5.mo15662a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
        L_0x0041:
            int r1 = r4.f7659d
            int r5 = r5.mo15665d()
            if (r1 != r5) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = r2
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p197i.C4104k.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.f7656a.hashCode() ^ 1000003) * 1000003;
        C4155w<C4129v.C4131b> wVar = this.f7657b;
        int i = 0;
        int hashCode2 = (hashCode ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        Boolean bool = this.f7658c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f7659d;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Application{execution=");
        u.append(this.f7656a);
        u.append(", customAttributes=");
        u.append(this.f7657b);
        u.append(", background=");
        u.append(this.f7658c);
        u.append(", uiOrientation=");
        return C0843a.m453n(u, this.f7659d, "}");
    }
}
