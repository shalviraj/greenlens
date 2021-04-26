package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.n */
public final class C4111n extends C4129v.C4134d.C4140d.C4141a.C4143b.C4145b {

    /* renamed from: a */
    public final String f7672a;

    /* renamed from: b */
    public final String f7673b;

    /* renamed from: c */
    public final C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a> f7674c;

    /* renamed from: d */
    public final C4129v.C4134d.C4140d.C4141a.C4143b.C4145b f7675d;

    /* renamed from: e */
    public final int f7676e;

    public C4111n(String str, String str2, C4155w wVar, C4129v.C4134d.C4140d.C4141a.C4143b.C4145b bVar, int i, C4112a aVar) {
        this.f7672a = str;
        this.f7673b = str2;
        this.f7674c = wVar;
        this.f7675d = bVar;
        this.f7676e = i;
    }

    @Nullable
    /* renamed from: a */
    public C4129v.C4134d.C4140d.C4141a.C4143b.C4145b mo15685a() {
        return this.f7675d;
    }

    @NonNull
    /* renamed from: b */
    public C4155w<C4129v.C4134d.C4140d.C4141a.C4143b.C4147d.C4148a> mo15686b() {
        return this.f7674c;
    }

    /* renamed from: c */
    public int mo15687c() {
        return this.f7676e;
    }

    @Nullable
    /* renamed from: d */
    public String mo15688d() {
        return this.f7673b;
    }

    @NonNull
    /* renamed from: e */
    public String mo15689e() {
        return this.f7672a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f7675d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f7673b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d.C4140d.C4141a.C4143b.C4145b
            r2 = 0
            if (r1 == 0) goto L_0x0058
            b.l.d.q.f.i.v$d$d$a$b$b r5 = (p005b.p096l.p180d.p191q.p192f.p197i.C4129v.C4134d.C4140d.C4141a.C4143b.C4145b) r5
            java.lang.String r1 = r4.f7672a
            java.lang.String r3 = r5.mo15689e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f7673b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo15688d()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo15688d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            b.l.d.q.f.i.w<b.l.d.q.f.i.v$d$d$a$b$d$a> r1 = r4.f7674c
            b.l.d.q.f.i.w r3 = r5.mo15686b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            b.l.d.q.f.i.v$d$d$a$b$b r1 = r4.f7675d
            if (r1 != 0) goto L_0x0043
            b.l.d.q.f.i.v$d$d$a$b$b r1 = r5.mo15685a()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            b.l.d.q.f.i.v$d$d$a$b$b r3 = r5.mo15685a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f7676e
            int r5 = r5.mo15687c()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p191q.p192f.p197i.C4111n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.f7672a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7673b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f7674c.hashCode()) * 1000003;
        C4129v.C4134d.C4140d.C4141a.C4143b.C4145b bVar = this.f7675d;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f7676e;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Exception{type=");
        u.append(this.f7672a);
        u.append(", reason=");
        u.append(this.f7673b);
        u.append(", frames=");
        u.append(this.f7674c);
        u.append(", causedBy=");
        u.append(this.f7675d);
        u.append(", overflowCount=");
        return C0843a.m453n(u, this.f7676e, "}");
    }
}
