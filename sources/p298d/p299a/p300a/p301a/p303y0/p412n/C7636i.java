package p298d.p299a.p300a.p301a.p303y0.p412n;

import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.p334t.C6799q;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.n.i */
public final class C7636i {

    /* renamed from: i */
    public static final C7636i f15121i;

    /* renamed from: a */
    public final C7638k f15122a;

    /* renamed from: b */
    public final C7638k f15123b;

    /* renamed from: c */
    public final Map<String, C7638k> f15124c;

    /* renamed from: d */
    public final boolean f15125d;

    /* renamed from: e */
    public final C7638k f15126e;

    /* renamed from: f */
    public final C6764f f15127f;

    /* renamed from: g */
    public final boolean f15128g;

    /* renamed from: h */
    public final boolean f15129h;

    static {
        C7638k kVar = C7638k.WARN;
        C6799q qVar = C6799q.f13714g;
        new C7636i(kVar, (C7638k) null, qVar, false, (C7638k) null, 24);
        C7638k kVar2 = C7638k.IGNORE;
        C6799q qVar2 = qVar;
        f15121i = new C7636i(kVar2, kVar2, qVar2, false, (C7638k) null, 24);
        C7638k kVar3 = C7638k.STRICT;
        new C7636i(kVar3, kVar3, qVar2, false, (C7638k) null, 24);
    }

    public C7636i(C7638k kVar, C7638k kVar2, Map map, boolean z, C7638k kVar3, int i) {
        boolean z2 = true;
        z = (i & 8) != 0 ? true : z;
        C7638k kVar4 = (i & 16) != 0 ? C7638k.WARN : null;
        C6888i.m12438e(kVar, "globalJsr305Level");
        C6888i.m12438e(map, "userDefinedLevelForSpecificJsr305Annotation");
        C6888i.m12438e(kVar4, "jspecifyReportLevel");
        this.f15122a = kVar;
        this.f15123b = kVar2;
        this.f15124c = map;
        this.f15125d = z;
        this.f15126e = kVar4;
        this.f15127f = C5266a.m9890U2(new C7635h(this));
        C7638k kVar5 = C7638k.IGNORE;
        boolean z3 = kVar == kVar5 && kVar2 == kVar5;
        this.f15128g = z3;
        if (!z3 && kVar4 != kVar5) {
            z2 = false;
        }
        this.f15129h = z2;
    }
}
