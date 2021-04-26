package p005b.p096l.p232f.p237c0;

import java.util.EnumMap;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4622p;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4624r;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.x */
public final class C4547x {

    /* renamed from: c */
    public static final int[] f8480c = {1, 1, 2};

    /* renamed from: a */
    public final C4545v f8481a = new C4545v();

    /* renamed from: b */
    public final C4546w f8482b = new C4546w();

    /* renamed from: a */
    public C4623q mo16208a(int i, C4657a aVar, int i2) {
        EnumMap enumMap;
        int i3 = i;
        C4657a aVar2 = aVar;
        int[] iArr = f8480c;
        int[] o = C4548y.m8374o(aVar2, i2, false, iArr, new int[iArr.length]);
        try {
            return this.f8482b.mo16207a(i3, aVar2, o);
        } catch (C4622p unused) {
            C4545v vVar = this.f8481a;
            StringBuilder sb = vVar.f8476b;
            sb.setLength(0);
            int[] iArr2 = vVar.f8475a;
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            int i4 = aVar2.f8786h;
            int i5 = o[1];
            int i6 = 0;
            for (int i7 = 0; i7 < 2 && i5 < i4; i7++) {
                int k = C4548y.m8373k(aVar2, iArr2, i5, C4548y.f8487h);
                sb.append((char) ((k % 10) + 48));
                for (int i8 : iArr2) {
                    i5 += i8;
                }
                if (k >= 10) {
                    i6 |= 1 << (1 - i7);
                }
                if (i7 != 1) {
                    i5 = aVar2.mo16325h(aVar2.mo16324g(i5));
                }
            }
            if (sb.length() != 2) {
                throw C4619m.f8685i;
            } else if (Integer.parseInt(sb.toString()) % 4 == i6) {
                String sb2 = sb.toString();
                if (sb2.length() != 2) {
                    enumMap = null;
                } else {
                    enumMap = new EnumMap(C4624r.class);
                    enumMap.put(C4624r.ISSUE_NUMBER, Integer.valueOf(sb2));
                }
                float f = (float) i3;
                C4623q qVar = new C4623q(sb2, (byte[]) null, new C4625s[]{new C4625s(((float) (o[0] + o[1])) / 2.0f, f), new C4625s((float) i5, f)}, C4484a.UPC_EAN_EXTENSION);
                if (enumMap != null) {
                    qVar.mo16282a(enumMap);
                }
                return qVar;
            } else {
                throw C4619m.f8685i;
            }
        }
    }
}
