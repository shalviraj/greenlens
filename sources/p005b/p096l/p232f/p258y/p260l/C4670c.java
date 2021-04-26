package p005b.p096l.p232f.p258y.p260l;

import java.util.Objects;

/* renamed from: b.l.f.y.l.c */
public final class C4670c {

    /* renamed from: a */
    public final C4668a f8876a;

    public C4670c(C4668a aVar) {
        this.f8876a = aVar;
    }

    /* renamed from: a */
    public void mo16363a(int[] iArr, int i) {
        int[] iArr2;
        C4669b bVar = new C4669b(this.f8876a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C4668a aVar = this.f8876a;
            int b = bVar.mo16355b(aVar.f8867a[aVar.f8873g + i3]);
            iArr3[(i - 1) - i3] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C4669b bVar2 = new C4669b(this.f8876a, iArr3);
            C4669b a = this.f8876a.mo16350a(i, 1);
            if (a.mo16357d() < bVar2.mo16357d()) {
                C4669b bVar3 = a;
                a = bVar2;
                bVar2 = bVar3;
            }
            C4668a aVar2 = this.f8876a;
            C4669b bVar4 = aVar2.f8869c;
            C4669b bVar5 = aVar2.f8870d;
            C4669b bVar6 = bVar4;
            while (bVar2.mo16357d() >= i / 2) {
                if (!bVar2.mo16358e()) {
                    C4669b bVar7 = this.f8876a.f8869c;
                    int b2 = this.f8876a.mo16351b(bVar2.mo16356c(bVar2.mo16357d()));
                    while (a.mo16357d() >= bVar2.mo16357d() && !a.mo16358e()) {
                        int d = a.mo16357d() - bVar2.mo16357d();
                        int c = this.f8876a.mo16352c(a.mo16356c(a.mo16357d()), b2);
                        bVar7 = bVar7.mo16354a(this.f8876a.mo16350a(d, c));
                        a = a.mo16354a(bVar2.mo16361h(d, c));
                    }
                    C4669b a2 = bVar7.mo16360g(bVar5).mo16354a(bVar6);
                    if (a.mo16357d() < bVar2.mo16357d()) {
                        C4669b bVar8 = a;
                        a = bVar2;
                        bVar2 = bVar8;
                        C4669b bVar9 = bVar5;
                        bVar5 = a2;
                        bVar6 = bVar9;
                    } else {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                    }
                } else {
                    throw new C4672e("r_{i-1} was zero");
                }
            }
            int c2 = bVar5.mo16356c(0);
            if (c2 != 0) {
                int b3 = this.f8876a.mo16351b(c2);
                C4669b[] bVarArr = {bVar5.mo16359f(b3), bVar2.mo16359f(b3)};
                C4669b bVar10 = bVarArr[0];
                C4669b bVar11 = bVarArr[1];
                int d2 = bVar10.mo16357d();
                if (d2 == 1) {
                    iArr2 = new int[]{bVar10.mo16356c(1)};
                } else {
                    int[] iArr4 = new int[d2];
                    int i4 = 0;
                    for (int i5 = 1; i5 < this.f8876a.f8871e && i4 < d2; i5++) {
                        if (bVar10.mo16355b(i5) == 0) {
                            iArr4[i4] = this.f8876a.mo16351b(i5);
                            i4++;
                        }
                    }
                    if (i4 == d2) {
                        iArr2 = iArr4;
                    } else {
                        throw new C4672e("Error locator degree does not match number of roots");
                    }
                }
                int length = iArr2.length;
                int[] iArr5 = new int[length];
                for (int i6 = 0; i6 < length; i6++) {
                    int b4 = this.f8876a.mo16351b(iArr2[i6]);
                    int i7 = 1;
                    for (int i8 = 0; i8 < length; i8++) {
                        if (i6 != i8) {
                            int c3 = this.f8876a.mo16352c(iArr2[i8], b4);
                            i7 = this.f8876a.mo16352c(i7, (c3 & 1) == 0 ? c3 | 1 : c3 & -2);
                        }
                    }
                    iArr5[i6] = this.f8876a.mo16352c(bVar11.mo16355b(b4), this.f8876a.mo16351b(i7));
                    C4668a aVar3 = this.f8876a;
                    if (aVar3.f8873g != 0) {
                        iArr5[i6] = aVar3.mo16352c(iArr5[i6], b4);
                    }
                }
                while (i2 < iArr2.length) {
                    int length2 = iArr.length - 1;
                    C4668a aVar4 = this.f8876a;
                    int i9 = iArr2[i2];
                    Objects.requireNonNull(aVar4);
                    if (i9 != 0) {
                        int i10 = length2 - aVar4.f8868b[i9];
                        if (i10 >= 0) {
                            iArr[i10] = iArr[i10] ^ iArr5[i2];
                            i2++;
                        } else {
                            throw new C4672e("Bad error location");
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                return;
            }
            throw new C4672e("sigmaTilde(0) was zero");
        }
    }
}
