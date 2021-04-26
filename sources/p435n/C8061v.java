package p435n;

import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.v */
public final class C8061v {

    /* renamed from: a */
    public final byte[] f16183a;

    /* renamed from: b */
    public int f16184b;

    /* renamed from: c */
    public int f16185c;

    /* renamed from: d */
    public boolean f16186d;

    /* renamed from: e */
    public boolean f16187e;

    /* renamed from: f */
    public C8061v f16188f;

    /* renamed from: g */
    public C8061v f16189g;

    public C8061v() {
        this.f16183a = new byte[8192];
        this.f16187e = true;
        this.f16186d = false;
    }

    public C8061v(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C6888i.m12438e(bArr, "data");
        this.f16183a = bArr;
        this.f16184b = i;
        this.f16185c = i2;
        this.f16186d = z;
        this.f16187e = z2;
    }

    /* renamed from: a */
    public final C8061v mo25996a() {
        C8061v vVar = this.f16188f;
        if (vVar == this) {
            vVar = null;
        }
        C8061v vVar2 = this.f16189g;
        C6888i.m12436c(vVar2);
        vVar2.f16188f = this.f16188f;
        C8061v vVar3 = this.f16188f;
        C6888i.m12436c(vVar3);
        vVar3.f16189g = this.f16189g;
        this.f16188f = null;
        this.f16189g = null;
        return vVar;
    }

    /* renamed from: b */
    public final C8061v mo25997b(C8061v vVar) {
        C6888i.m12438e(vVar, "segment");
        vVar.f16189g = this;
        vVar.f16188f = this.f16188f;
        C8061v vVar2 = this.f16188f;
        C6888i.m12436c(vVar2);
        vVar2.f16189g = vVar;
        this.f16188f = vVar;
        return vVar;
    }

    /* renamed from: c */
    public final C8061v mo25998c() {
        this.f16186d = true;
        return new C8061v(this.f16183a, this.f16184b, this.f16185c, true, false);
    }

    /* renamed from: d */
    public final void mo25999d(C8061v vVar, int i) {
        C6888i.m12438e(vVar, "sink");
        if (vVar.f16187e) {
            int i2 = vVar.f16185c;
            if (i2 + i > 8192) {
                if (!vVar.f16186d) {
                    int i3 = vVar.f16184b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = vVar.f16183a;
                        C6790h.m12352g(bArr, bArr, 0, i3, i2, 2);
                        vVar.f16185c -= vVar.f16184b;
                        vVar.f16184b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f16183a;
            byte[] bArr3 = vVar.f16183a;
            int i4 = vVar.f16185c;
            int i5 = this.f16184b;
            C6790h.m12350f(bArr2, bArr3, i4, i5, i5 + i);
            vVar.f16185c += i;
            this.f16184b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }
}
