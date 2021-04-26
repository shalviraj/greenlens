package p005b.p096l.p224e;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p224e.p226e0.C4367o;
import p005b.p096l.p224e.p226e0.p228z.C4409m;
import p005b.p096l.p224e.p226e0.p228z.C4414o;
import p005b.p096l.p224e.p226e0.p228z.C4447p;
import p005b.p096l.p224e.p226e0.p228z.C4448q;
import p005b.p096l.p224e.p230f0.C4455a;

/* renamed from: b.l.e.l */
public final class C4467l {

    /* renamed from: a */
    public C4367o f8307a = C4367o.f8076i;

    /* renamed from: b */
    public C4481z f8308b = C4481z.DEFAULT;

    /* renamed from: c */
    public C4344e f8309c = C4335d.IDENTITY;

    /* renamed from: d */
    public final Map<Type, C4468m<?>> f8310d = new HashMap();

    /* renamed from: e */
    public final List<C4334c0> f8311e = new ArrayList();

    /* renamed from: f */
    public final List<C4334c0> f8312f = new ArrayList();

    /* renamed from: g */
    public String f8313g;

    /* renamed from: h */
    public int f8314h = 2;

    /* renamed from: i */
    public int f8315i = 2;

    /* renamed from: j */
    public boolean f8316j = true;

    /* renamed from: a */
    public C4465k mo16127a() {
        C4329a aVar;
        C4329a aVar2;
        C4329a aVar3;
        ArrayList arrayList = new ArrayList(this.f8312f.size() + this.f8311e.size() + 3);
        arrayList.addAll(this.f8311e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f8312f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = this.f8313g;
        int i = this.f8314h;
        int i2 = this.f8315i;
        if (str == null || "".equals(str.trim())) {
            if (!(i == 2 || i2 == 2)) {
                C4329a aVar4 = new C4329a(Date.class, i, i2);
                C4329a aVar5 = new C4329a(Timestamp.class, i, i2);
                C4329a aVar6 = new C4329a(java.sql.Date.class, i, i2);
                aVar3 = aVar4;
                aVar2 = aVar5;
                aVar = aVar6;
            }
            return new C4465k(this.f8307a, this.f8309c, this.f8310d, false, false, false, this.f8316j, false, false, false, this.f8308b, this.f8313g, this.f8314h, this.f8315i, this.f8311e, this.f8312f, arrayList);
        }
        aVar3 = new C4329a(Date.class, str);
        aVar2 = new C4329a(Timestamp.class, str);
        aVar = new C4329a(java.sql.Date.class, str);
        C4332b0<Class> b0Var = C4414o.f8205a;
        arrayList.add(new C4448q(Date.class, aVar3));
        arrayList.add(new C4448q(Timestamp.class, aVar2));
        arrayList.add(new C4448q(java.sql.Date.class, aVar));
        return new C4465k(this.f8307a, this.f8309c, this.f8310d, false, false, false, this.f8316j, false, false, false, this.f8308b, this.f8313g, this.f8314h, this.f8315i, this.f8311e, this.f8312f, arrayList);
    }

    /* renamed from: b */
    public C4467l mo16128b(Type type, Object obj) {
        boolean z = obj instanceof C4479x;
        boolean z2 = true;
        C1960d.m2853u(true);
        if (obj instanceof C4468m) {
            this.f8310d.put(type, (C4468m) obj);
        }
        C4455a aVar = new C4455a(type);
        List<C4334c0> list = this.f8311e;
        if (aVar.f8250b != aVar.f8249a) {
            z2 = false;
        }
        list.add(new C4409m.C4412c(obj, aVar, z2, (Class<?>) null));
        if (obj instanceof C4332b0) {
            List<C4334c0> list2 = this.f8311e;
            C4332b0<Class> b0Var = C4414o.f8205a;
            list2.add(new C4447p(new C4455a(type), (C4332b0) obj));
        }
        return this;
    }
}
