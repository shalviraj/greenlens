package p005b.p096l.p232f.p241d0.p242e;

import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.d0.e.c */
public final class C4557c {

    /* renamed from: a */
    public final C4658b f8503a;

    /* renamed from: b */
    public final C4625s f8504b;

    /* renamed from: c */
    public final C4625s f8505c;

    /* renamed from: d */
    public final C4625s f8506d;

    /* renamed from: e */
    public final C4625s f8507e;

    /* renamed from: f */
    public final int f8508f;

    /* renamed from: g */
    public final int f8509g;

    /* renamed from: h */
    public final int f8510h;

    /* renamed from: i */
    public final int f8511i;

    public C4557c(C4658b bVar, C4625s sVar, C4625s sVar2, C4625s sVar3, C4625s sVar4) {
        boolean z = false;
        boolean z2 = sVar == null || sVar2 == null;
        z = (sVar3 == null || sVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                sVar = new C4625s(0.0f, sVar3.f8709b);
                sVar2 = new C4625s(0.0f, sVar4.f8709b);
            } else if (z) {
                int i = bVar.f8787g;
                sVar3 = new C4625s((float) (i - 1), sVar.f8709b);
                sVar4 = new C4625s((float) (i - 1), sVar2.f8709b);
            }
            this.f8503a = bVar;
            this.f8504b = sVar;
            this.f8505c = sVar2;
            this.f8506d = sVar3;
            this.f8507e = sVar4;
            this.f8508f = (int) Math.min(sVar.f8708a, sVar2.f8708a);
            this.f8509g = (int) Math.max(sVar3.f8708a, sVar4.f8708a);
            this.f8510h = (int) Math.min(sVar.f8709b, sVar3.f8709b);
            this.f8511i = (int) Math.max(sVar2.f8709b, sVar4.f8709b);
            return;
        }
        throw C4619m.f8685i;
    }

    public C4557c(C4557c cVar) {
        this.f8503a = cVar.f8503a;
        this.f8504b = cVar.f8504b;
        this.f8505c = cVar.f8505c;
        this.f8506d = cVar.f8506d;
        this.f8507e = cVar.f8507e;
        this.f8508f = cVar.f8508f;
        this.f8509g = cVar.f8509g;
        this.f8510h = cVar.f8510h;
        this.f8511i = cVar.f8511i;
    }
}
