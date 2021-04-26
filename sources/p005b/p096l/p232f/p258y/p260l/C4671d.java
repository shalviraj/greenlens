package p005b.p096l.p232f.p258y.p260l;

import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.f.y.l.d */
public final class C4671d {

    /* renamed from: a */
    public final C4668a f8877a;

    /* renamed from: b */
    public final List<C4669b> f8878b;

    public C4671d(C4668a aVar) {
        this.f8877a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f8878b = arrayList;
        arrayList.add(new C4669b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    public void mo16364a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                if (i >= this.f8878b.size()) {
                    C4669b bVar = (C4669b) C0843a.m437M(this.f8878b, 1);
                    for (int size = this.f8878b.size(); size <= i; size++) {
                        C4668a aVar = this.f8877a;
                        bVar = bVar.mo16360g(new C4669b(aVar, new int[]{1, aVar.f8867a[(size - 1) + aVar.f8873g]}));
                        this.f8878b.add(bVar);
                    }
                }
                C4669b bVar2 = this.f8878b.get(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                C4669b h = new C4669b(this.f8877a, iArr2).mo16361h(i, 1);
                if (!h.f8874a.equals(bVar2.f8874a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                } else if (!bVar2.mo16358e()) {
                    C4669b bVar3 = h.f8874a.f8869c;
                    int b = h.f8874a.mo16351b(bVar2.mo16356c(bVar2.mo16357d()));
                    C4669b bVar4 = h;
                    while (bVar4.mo16357d() >= bVar2.mo16357d() && !bVar4.mo16358e()) {
                        int d = bVar4.mo16357d() - bVar2.mo16357d();
                        int c = h.f8874a.mo16352c(bVar4.mo16356c(bVar4.mo16357d()), b);
                        C4669b h2 = bVar2.mo16361h(d, c);
                        bVar3 = bVar3.mo16354a(h.f8874a.mo16350a(d, c));
                        bVar4 = bVar4.mo16354a(h2);
                    }
                    int[] iArr3 = new C4669b[]{bVar3, bVar4}[1].f8875b;
                    int length2 = i - iArr3.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        iArr[length + i2] = 0;
                    }
                    System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
                } else {
                    throw new IllegalArgumentException("Divide by 0");
                }
            } else {
                throw new IllegalArgumentException("No data bytes provided");
            }
        } else {
            throw new IllegalArgumentException("No error correction bytes");
        }
    }
}
