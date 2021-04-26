package p435n;

import java.security.MessageDigest;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.x */
public final class C8063x extends C8044h {

    /* renamed from: l */
    public final transient byte[][] f16194l;

    /* renamed from: m */
    public final transient int[] f16195m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8063x(byte[][] bArr, int[] iArr) {
        super(C8044h.f16142j.f16146i);
        C6888i.m12438e(bArr, "segments");
        C6888i.m12438e(iArr, "directory");
        this.f16194l = bArr;
        this.f16195m = iArr;
    }

    /* renamed from: A */
    public void mo25953A(C8040e eVar, int i, int i2) {
        int i3;
        C6888i.m12438e(eVar, "buffer");
        int i4 = i + i2;
        int O3 = C5266a.m9858O3(this, i);
        while (i < i4) {
            if (O3 == 0) {
                i3 = 0;
            } else {
                i3 = this.f16195m[O3 - 1];
            }
            int[] iArr = this.f16195m;
            int i5 = iArr[this.f16194l.length + O3];
            int min = Math.min(i4, (iArr[O3] - i3) + i3) - i;
            int i6 = (i - i3) + i5;
            C8061v vVar = new C8061v(this.f16194l[O3], i6, i6 + min, true, false);
            C8061v vVar2 = eVar.f16139g;
            if (vVar2 == null) {
                vVar.f16189g = vVar;
                vVar.f16188f = vVar;
                eVar.f16139g = vVar;
            } else {
                C6888i.m12436c(vVar2);
                C8061v vVar3 = vVar2.f16189g;
                C6888i.m12436c(vVar3);
                vVar3.mo25997b(vVar);
            }
            i += min;
            O3++;
        }
        eVar.f16140h += (long) i2;
    }

    /* renamed from: B */
    public final C8044h mo26000B() {
        return new C8044h(mo25967y());
    }

    /* renamed from: d */
    public String mo25955d() {
        return mo26000B().mo25955d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8044h) {
            C8044h hVar = (C8044h) obj;
            if (hVar.mo25959l() == mo25959l() && mo25964v(0, hVar, 0, mo25959l())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f16144g;
        if (i != 0) {
            return i;
        }
        int length = this.f16194l.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f16195m;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f16194l[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f16144g = i3;
        return i3;
    }

    /* renamed from: i */
    public C8044h mo25958i(String str) {
        C6888i.m12438e(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = this.f16194l.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f16195m;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(this.f16194l[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C6888i.m12437d(digest, "digestBytes");
        return new C8044h(digest);
    }

    /* renamed from: l */
    public int mo25959l() {
        return this.f16195m[this.f16194l.length - 1];
    }

    /* renamed from: p */
    public String mo25960p() {
        return mo26000B().mo25960p();
    }

    /* renamed from: q */
    public byte[] mo25961q() {
        return mo25967y();
    }

    /* renamed from: s */
    public byte mo25962s(int i) {
        int i2;
        C5266a.m9848N((long) this.f16195m[this.f16194l.length - 1], (long) i, 1);
        int O3 = C5266a.m9858O3(this, i);
        if (O3 == 0) {
            i2 = 0;
        } else {
            i2 = this.f16195m[O3 - 1];
        }
        int[] iArr = this.f16195m;
        byte[][] bArr = this.f16194l;
        return bArr[O3][(i - i2) + iArr[bArr.length + O3]];
    }

    public String toString() {
        return mo26000B().toString();
    }

    /* renamed from: v */
    public boolean mo25964v(int i, C8044h hVar, int i2, int i3) {
        int i4;
        C6888i.m12438e(hVar, "other");
        if (i < 0 || i > mo25959l() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int O3 = C5266a.m9858O3(this, i);
        while (i < i5) {
            if (O3 == 0) {
                i4 = 0;
            } else {
                i4 = this.f16195m[O3 - 1];
            }
            int[] iArr = this.f16195m;
            int i6 = iArr[this.f16194l.length + O3];
            int min = Math.min(i5, (iArr[O3] - i4) + i4) - i;
            if (!hVar.mo25965w(i2, this.f16194l[O3], (i - i4) + i6, min)) {
                return false;
            }
            i2 += min;
            i += min;
            O3++;
        }
        return true;
    }

    /* renamed from: w */
    public boolean mo25965w(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C6888i.m12438e(bArr, "other");
        if (i < 0 || i > mo25959l() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int O3 = C5266a.m9858O3(this, i);
        while (i < i5) {
            if (O3 == 0) {
                i4 = 0;
            } else {
                i4 = this.f16195m[O3 - 1];
            }
            int[] iArr = this.f16195m;
            int i6 = iArr[this.f16194l.length + O3];
            int min = Math.min(i5, (iArr[O3] - i4) + i4) - i;
            if (!C5266a.m10037u(this.f16194l[O3], (i - i4) + i6, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            O3++;
        }
        return true;
    }

    /* renamed from: x */
    public C8044h mo25966x() {
        return mo26000B().mo25966x();
    }

    /* renamed from: y */
    public byte[] mo25967y() {
        byte[] bArr = new byte[mo25959l()];
        int length = this.f16194l.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f16195m;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            C6790h.m12350f(this.f16194l[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }
}
