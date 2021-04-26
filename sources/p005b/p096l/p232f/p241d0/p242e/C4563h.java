package p005b.p096l.p232f.p241d0.p242e;

/* renamed from: b.l.f.d0.e.h */
public final class C4563h extends C4562g {

    /* renamed from: c */
    public final boolean f8533c;

    public C4563h(C4557c cVar, boolean z) {
        super(cVar);
        this.f8533c = z;
    }

    /* renamed from: c */
    public C4555a mo16219c() {
        C4558d[] dVarArr = this.f8532b;
        C4556b bVar = new C4556b();
        C4556b bVar2 = new C4556b();
        C4556b bVar3 = new C4556b();
        C4556b bVar4 = new C4556b();
        for (C4558d dVar : dVarArr) {
            if (dVar != null) {
                dVar.mo16212b();
                int i = dVar.f8515d % 30;
                int i2 = dVar.f8516e;
                if (!this.f8533c) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    bVar2.mo16210b((i * 3) + 1);
                } else if (i3 == 1) {
                    bVar4.mo16210b(i / 3);
                    bVar3.mo16210b(i % 3);
                } else if (i3 == 2) {
                    bVar.mo16210b(i + 1);
                }
            }
        }
        if (bVar.mo16209a().length == 0 || bVar2.mo16209a().length == 0 || bVar3.mo16209a().length == 0 || bVar4.mo16209a().length == 0 || bVar.mo16209a()[0] <= 0 || bVar2.mo16209a()[0] + bVar3.mo16209a()[0] < 3 || bVar2.mo16209a()[0] + bVar3.mo16209a()[0] > 90) {
            return null;
        }
        C4555a aVar = new C4555a(bVar.mo16209a()[0], bVar2.mo16209a()[0], bVar3.mo16209a()[0], bVar4.mo16209a()[0]);
        mo16220d(dVarArr, aVar);
        return aVar;
    }

    /* renamed from: d */
    public final void mo16220d(C4558d[] dVarArr, C4555a aVar) {
        for (int i = 0; i < dVarArr.length; i++) {
            C4558d dVar = dVarArr[i];
            if (dVarArr[i] != null) {
                int i2 = dVar.f8515d % 30;
                int i3 = dVar.f8516e;
                if (i3 > aVar.f8501e) {
                    dVarArr[i] = null;
                } else {
                    if (!this.f8533c) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != aVar.f8497a) {
                                dVarArr[i] = null;
                            }
                        } else if (i2 / 3 != aVar.f8498b || i2 % 3 != aVar.f8500d) {
                            dVarArr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != aVar.f8499c) {
                        dVarArr[i] = null;
                    }
                }
            }
        }
    }

    public String toString() {
        return "IsLeft: " + this.f8533c + 10 + super.toString();
    }
}
