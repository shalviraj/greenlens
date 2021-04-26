package p005b.p096l.p232f.p235b0.p236b;

import androidx.exifinterface.media.ExifInterface;
import p005b.p096l.p232f.C4550d;
import p005b.p096l.p232f.p258y.p260l.C4668a;
import p005b.p096l.p232f.p258y.p260l.C4670c;
import p005b.p096l.p232f.p258y.p260l.C4672e;

/* renamed from: b.l.f.b0.b.c */
public final class C4491c {

    /* renamed from: a */
    public final C4670c f8359a = new C4670c(C4668a.f8866o);

    /* renamed from: a */
    public final void mo16155a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & ExifInterface.MARKER;
            }
        }
        try {
            this.f8359a.mo16363a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C4672e unused) {
            throw C4550d.m8384a();
        }
    }
}
