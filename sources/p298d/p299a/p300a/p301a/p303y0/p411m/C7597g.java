package p298d.p299a.p300a.p301a.p303y0.p411m;

import java.util.Collection;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7690d;

/* renamed from: d.a.a.a.y0.m.g */
public final class C7597g {

    /* renamed from: a */
    public final C6717d f15045a;

    /* renamed from: b */
    public final C7690d f15046b;

    /* renamed from: c */
    public final Collection<C6717d> f15047c;

    /* renamed from: d */
    public final C6862l<C6244v, String> f15048d;

    /* renamed from: e */
    public final C7589b[] f15049e;

    public C7597g(C6717d dVar, C7690d dVar2, Collection<C6717d> collection, C6862l<? super C6244v, String> lVar, C7589b... bVarArr) {
        this.f15045a = null;
        this.f15046b = dVar2;
        this.f15047c = collection;
        this.f15048d = lVar;
        this.f15049e = bVarArr;
    }

    public C7597g(C6717d dVar, C7589b[] bVarArr, C6862l<? super C6244v, String> lVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVarArr, "checks");
        C6888i.m12438e(lVar, "additionalChecks");
        C7589b[] bVarArr2 = new C7589b[bVarArr.length];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
        this.f15045a = dVar;
        this.f15046b = null;
        this.f15047c = null;
        this.f15048d = lVar;
        this.f15049e = bVarArr2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7597g(C6717d dVar, C7589b[] bVarArr, C6862l lVar, int i) {
        this(dVar, bVarArr, (C6862l<? super C6244v, String>) (i & 4) != 0 ? C7594d.f15042g : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7597g(java.util.Collection<p298d.p299a.p300a.p301a.p303y0.p331f.C6717d> r8, p298d.p299a.p300a.p301a.p303y0.p411m.C7589b[] r9, p298d.p344x.p345b.C6862l<? super p298d.p299a.p300a.p301a.p303y0.p304b.C6244v, java.lang.String> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "nameList"
            p298d.p344x.p346c.C6888i.m12438e(r8, r0)
            java.lang.String r0 = "checks"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            java.lang.String r0 = "additionalChecks"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            int r0 = r9.length
            d.a.a.a.y0.m.b[] r6 = new p298d.p299a.p300a.p301a.p303y0.p411m.C7589b[r0]
            int r0 = r9.length
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r6, r1, r0)
            r2 = 0
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p411m.C7597g.<init>(java.util.Collection, d.a.a.a.y0.m.b[], d.x.b.l):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7597g(Collection collection, C7589b[] bVarArr, C6862l lVar, int i) {
        this((Collection<C6717d>) collection, bVarArr, (C6862l<? super C6244v, String>) (i & 4) != 0 ? C7596f.f15044g : null);
    }
}
