package p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6699a;
import p298d.p334t.C6789g;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.a0.b.f */
public final class C6607f extends C6699a {

    /* renamed from: g */
    public static final C6607f f13005g = new C6607f(1, 4, 2);

    /* renamed from: f */
    public final boolean f13006f;

    static {
        int[] iArr = new int[0];
        C6888i.m12438e(iArr, "numbers");
        C6888i.m12438e(iArr, "versionArray");
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        C6888i.m12438e(iArr2, "numbers");
        Integer G1 = C5266a.m9808G1(iArr2, 0);
        if (G1 != null) {
            G1.intValue();
        }
        Integer G12 = C5266a.m9808G1(iArr2, 1);
        if (G12 != null) {
            G12.intValue();
        }
        Integer G13 = C5266a.m9808G1(iArr2, 2);
        if (G13 != null) {
            G13.intValue();
        }
        if (iArr2.length > 3) {
            C6888i.m12438e(iArr2, "$this$asList");
            C6790h.m12337X(new C6789g(iArr2).subList(3, iArr2.length));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6607f(int... iArr) {
        this(iArr, false);
        C6888i.m12438e(iArr, "numbers");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6607f(int[] r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "versionArray"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            int r0 = r4.length
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.<init>(r0)
            r3.f13006f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6607f.<init>(int[], boolean):void");
    }

    /* renamed from: c */
    public boolean mo23724c() {
        boolean z;
        int i = this.f13548b;
        if (i == 1 && this.f13549c == 0) {
            return false;
        }
        if (this.f13006f) {
            z = mo23836b(f13005g);
        } else {
            C6607f fVar = f13005g;
            z = i == fVar.f13548b && this.f13549c <= fVar.f13549c + 1;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
