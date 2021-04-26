package p421m;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p298d.p344x.p346c.C6888i;
import p421m.C8025z;
import p421m.p422m0.C7867c;
import p435n.C8040e;
import p435n.C8042f;

/* renamed from: m.v */
public final class C8017v extends C7844g0 {

    /* renamed from: d */
    public static final C7829b0 f16085d = C7829b0.m14222b("application/x-www-form-urlencoded");

    /* renamed from: b */
    public final List<String> f16086b;

    /* renamed from: c */
    public final List<String> f16087c;

    /* renamed from: m.v$a */
    public static final class C8018a {

        /* renamed from: a */
        public final List<String> f16088a = new ArrayList();

        /* renamed from: b */
        public final List<String> f16089b = new ArrayList();

        /* renamed from: c */
        public final Charset f16090c = null;

        /* renamed from: a */
        public final C8018a mo25830a(String str, String str2) {
            C6888i.m12438e(str, "name");
            C6888i.m12438e(str2, "value");
            List<String> list = this.f16088a;
            C8025z.C8028b bVar = C8025z.f16101l;
            list.add(C8025z.C8028b.m14720a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f16090c, 91));
            this.f16089b.add(C8025z.C8028b.m14720a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f16090c, 91));
            return this;
        }
    }

    static {
        C7829b0 b0Var = C7829b0.f15448e;
    }

    public C8017v(List<String> list, List<String> list2) {
        C6888i.m12438e(list, "encodedNames");
        C6888i.m12438e(list2, "encodedValues");
        this.f16086b = C7867c.m14304y(list);
        this.f16087c = C7867c.m14304y(list2);
    }

    /* renamed from: a */
    public long mo25542a() {
        return mo25829d((C8042f) null, true);
    }

    /* renamed from: b */
    public C7829b0 mo25543b() {
        return f16085d;
    }

    /* renamed from: c */
    public void mo25544c(C8042f fVar) {
        C6888i.m12438e(fVar, "sink");
        mo25829d(fVar, false);
    }

    /* renamed from: d */
    public final long mo25829d(C8042f fVar, boolean z) {
        C8040e eVar;
        if (z) {
            eVar = new C8040e();
        } else {
            C6888i.m12436c(fVar);
            eVar = fVar.mo25901c();
        }
        int size = this.f16086b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVar.mo25940v0(38);
            }
            eVar.mo25947z0(this.f16086b.get(i));
            eVar.mo25940v0(61);
            eVar.mo25947z0(this.f16087c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = eVar.f16140h;
        eVar.skip(j);
        return j;
    }
}
