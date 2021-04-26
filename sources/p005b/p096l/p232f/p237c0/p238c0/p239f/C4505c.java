package p005b.p096l.p232f.p237c0.p238c0.p239f;

import androidx.renderscript.ScriptIntrinsicBLAS;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4577e;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4623q;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p237c0.C4541r;
import p005b.p096l.p232f.p237c0.p238c0.C4498a;
import p005b.p096l.p232f.p237c0.p238c0.C4499b;
import p005b.p096l.p232f.p237c0.p238c0.C4500c;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4506a;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4507b;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4508c;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4509d;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4510e;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4512g;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4515j;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4516k;
import p005b.p096l.p232f.p237c0.p238c0.p239f.p240d.C4525s;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.c0.f.c */
public final class C4505c extends C4498a {

    /* renamed from: k */
    public static final int[] f8404k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    public static final int[] f8405l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    public static final int[] f8406m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    public static final int[][] f8407n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    public static final int[][] f8408o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, BaseTransientBottomBar.ANIMATION_FADE_DURATION, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, ScriptIntrinsicBLAS.UNIT}, new int[]{185, 133, 188, ScriptIntrinsicBLAS.RIGHT, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, new int[]{103, 98, 83, 38, 114, ScriptIntrinsicBLAS.NON_UNIT, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    public static final int[][] f8409p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    public final List<C4503a> f8410g = new ArrayList(11);

    /* renamed from: h */
    public final List<C4504b> f8411h = new ArrayList();

    /* renamed from: i */
    public final int[] f8412i = new int[2];

    /* renamed from: j */
    public boolean f8413j;

    /* renamed from: p */
    public static C4623q m8276p(List<C4503a> list) {
        C4515j jVar;
        int size = (list.size() << 1) - 1;
        if (((C4503a) C0843a.m437M(list, 1)).f8399b == null) {
            size--;
        }
        C4657a aVar = new C4657a(size * 12);
        int i = list.get(0).f8399b.f8382a;
        int i2 = 0;
        for (int i3 = 11; i3 >= 0; i3--) {
            if (((1 << i3) & i) != 0) {
                aVar.mo16330l(i2);
            }
            i2++;
        }
        for (int i4 = 1; i4 < list.size(); i4++) {
            C4503a aVar2 = list.get(i4);
            int i5 = aVar2.f8398a.f8382a;
            for (int i6 = 11; i6 >= 0; i6--) {
                if (((1 << i6) & i5) != 0) {
                    aVar.mo16330l(i2);
                }
                i2++;
            }
            C4499b bVar = aVar2.f8399b;
            if (bVar != null) {
                int i7 = bVar.f8382a;
                for (int i8 = 11; i8 >= 0; i8--) {
                    if (((1 << i8) & i7) != 0) {
                        aVar.mo16330l(i2);
                    }
                    i2++;
                }
            }
        }
        if (aVar.mo16323f(1)) {
            jVar = new C4512g(aVar);
        } else if (!aVar.mo16323f(2)) {
            jVar = new C4516k(aVar);
        } else {
            int d = C4525s.m8308d(aVar, 1, 4);
            if (d == 4) {
                jVar = new C4506a(aVar);
            } else if (d != 5) {
                int d2 = C4525s.m8308d(aVar, 1, 5);
                if (d2 == 12) {
                    jVar = new C4508c(aVar);
                } else if (d2 != 13) {
                    switch (C4525s.m8308d(aVar, 1, 7)) {
                        case 56:
                            jVar = new C4510e(aVar, "310", "11");
                            break;
                        case 57:
                            jVar = new C4510e(aVar, "320", "11");
                            break;
                        case 58:
                            jVar = new C4510e(aVar, "310", "13");
                            break;
                        case 59:
                            jVar = new C4510e(aVar, "320", "13");
                            break;
                        case 60:
                            jVar = new C4510e(aVar, "310", "15");
                            break;
                        case 61:
                            jVar = new C4510e(aVar, "320", "15");
                            break;
                        case 62:
                            jVar = new C4510e(aVar, "310", "17");
                            break;
                        case 63:
                            jVar = new C4510e(aVar, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
                    }
                } else {
                    jVar = new C4509d(aVar);
                }
            } else {
                jVar = new C4507b(aVar);
            }
        }
        String a = jVar.mo16191a();
        C4625s[] sVarArr = list.get(0).f8400c.f8386c;
        C4625s[] sVarArr2 = ((C4503a) C0843a.m437M(list, 1)).f8400c.f8386c;
        return new C4623q(a, (byte[]) null, new C4625s[]{sVarArr[0], sVarArr[1], sVarArr2[0], sVarArr2[1]}, C4484a.RSS_EXPANDED);
    }

    /* renamed from: t */
    public static void m8277t(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: c */
    public void mo16154c() {
        this.f8410g.clear();
        this.f8411h.clear();
    }

    /* renamed from: d */
    public C4623q mo16159d(int i, C4657a aVar, Map<C4577e, ?> map) {
        this.f8410g.clear();
        this.f8413j = false;
        try {
            return m8276p(mo16187r(i, aVar));
        } catch (C4619m unused) {
            this.f8410g.clear();
            this.f8413j = true;
            return m8276p(mo16187r(i, aVar));
        }
    }

    /* renamed from: m */
    public final boolean mo16183m() {
        C4503a aVar = this.f8410g.get(0);
        C4499b bVar = aVar.f8398a;
        C4499b bVar2 = aVar.f8399b;
        if (bVar2 == null) {
            return false;
        }
        int i = bVar2.f8383b;
        int i2 = 2;
        for (int i3 = 1; i3 < this.f8410g.size(); i3++) {
            C4503a aVar2 = this.f8410g.get(i3);
            i += aVar2.f8398a.f8383b;
            i2++;
            C4499b bVar3 = aVar2.f8399b;
            if (bVar3 != null) {
                i += bVar3.f8383b;
                i2++;
            }
        }
        if (((i2 - 4) * 211) + (i % 211) == bVar.f8382a) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final List<C4503a> mo16184n(List<C4504b> list, int i) {
        boolean z;
        while (i < this.f8411h.size()) {
            C4504b bVar = this.f8411h.get(i);
            this.f8410g.clear();
            for (C4504b bVar2 : list) {
                this.f8410g.addAll(bVar2.f8401a);
            }
            this.f8410g.addAll(bVar.f8401a);
            List<C4503a> list2 = this.f8410g;
            int[][] iArr = f8409p;
            int length = iArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int[] iArr2 = iArr[i2];
                if (list2.size() <= iArr2.length) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= list2.size()) {
                            z = true;
                            break;
                        } else if (list2.get(i3).f8400c.f8384a != iArr2[i3]) {
                            z = false;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
                i2++;
            }
            if (!z2) {
                i++;
            } else if (mo16183m()) {
                return this.f8410g;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(bVar);
                try {
                    return mo16184n(arrayList, i + 1);
                } catch (C4619m unused) {
                }
            }
        }
        throw C4619m.f8685i;
    }

    /* renamed from: o */
    public final List<C4503a> mo16185o(boolean z) {
        List<C4503a> list = null;
        if (this.f8411h.size() > 25) {
            this.f8411h.clear();
            return null;
        }
        this.f8410g.clear();
        if (z) {
            Collections.reverse(this.f8411h);
        }
        try {
            list = mo16184n(new ArrayList(), 0);
        } catch (C4619m unused) {
        }
        if (z) {
            Collections.reverse(this.f8411h);
        }
        return list;
    }

    /* renamed from: q */
    public C4499b mo16186q(C4657a aVar, C4500c cVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C4657a aVar2 = aVar;
        C4500c cVar2 = cVar;
        int[] iArr = this.f8377b;
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
        if (z2) {
            C4541r.m8351h(aVar2, cVar2.f8385b[0], iArr);
        } else {
            C4541r.m8350g(aVar2, cVar2.f8385b[1], iArr);
            int i2 = 0;
            for (int length = iArr.length - 1; i2 < length; length--) {
                int i3 = iArr[i2];
                iArr[i2] = iArr[length];
                iArr[length] = i3;
                i2++;
            }
        }
        float N0 = ((float) C1960d.m2735N0(iArr)) / 17.0f;
        int[] iArr2 = cVar2.f8385b;
        float f = ((float) (iArr2[1] - iArr2[0])) / 15.0f;
        if (Math.abs(N0 - f) / f <= 0.3f) {
            int[] iArr3 = this.f8380e;
            int[] iArr4 = this.f8381f;
            float[] fArr = this.f8378c;
            float[] fArr2 = this.f8379d;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                float f2 = (((float) iArr[i4]) * 1.0f) / N0;
                int i5 = (int) (0.5f + f2);
                if (i5 <= 0) {
                    if (f2 >= 0.3f) {
                        i5 = 1;
                    } else {
                        throw C4619m.f8685i;
                    }
                } else if (i5 > 8) {
                    if (f2 <= 8.7f) {
                        i5 = 8;
                    } else {
                        throw C4619m.f8685i;
                    }
                }
                int i6 = i4 / 2;
                if ((i4 & 1) == 0) {
                    iArr3[i6] = i5;
                    fArr[i6] = f2 - ((float) i5);
                } else {
                    iArr4[i6] = i5;
                    fArr2[i6] = f2 - ((float) i5);
                }
            }
            int N02 = C1960d.m2735N0(this.f8380e);
            int N03 = C1960d.m2735N0(this.f8381f);
            if (N02 > 13) {
                z3 = false;
                z4 = true;
            } else {
                z4 = false;
                z3 = N02 < 4;
            }
            if (N03 > 13) {
                z6 = false;
                z5 = true;
            } else if (N03 < 4) {
                z5 = false;
                z6 = true;
            } else {
                z6 = false;
                z5 = false;
            }
            int i7 = (N02 + N03) - 17;
            boolean z7 = (N02 & 1) == 1;
            boolean z8 = (N03 & 1) == 0;
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw C4619m.f8685i;
                    } else if (z7) {
                        if (!z8) {
                            z4 = true;
                        } else {
                            throw C4619m.f8685i;
                        }
                    } else if (z8) {
                        z5 = true;
                    } else {
                        throw C4619m.f8685i;
                    }
                } else if (z7) {
                    if (!z8) {
                        throw C4619m.f8685i;
                    } else if (N02 < N03) {
                        z3 = true;
                        z5 = true;
                    } else {
                        z4 = true;
                        z6 = true;
                    }
                } else if (z8) {
                    throw C4619m.f8685i;
                }
            } else if (z7) {
                if (!z8) {
                    z3 = true;
                } else {
                    throw C4619m.f8685i;
                }
            } else if (z8) {
                z6 = true;
            } else {
                throw C4619m.f8685i;
            }
            if (z3) {
                if (!z4) {
                    C4498a.m8266j(this.f8380e, this.f8378c);
                } else {
                    throw C4619m.f8685i;
                }
            }
            if (z4) {
                C4498a.m8265i(this.f8380e, this.f8378c);
            }
            if (z6) {
                if (!z5) {
                    C4498a.m8266j(this.f8381f, this.f8378c);
                } else {
                    throw C4619m.f8685i;
                }
            }
            if (z5) {
                C4498a.m8265i(this.f8381f, this.f8379d);
            }
            int i8 = (((cVar2.f8384a * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = iArr3.length - 1; length2 >= 0; length2--) {
                if (cVar2.f8384a != 0 || !z || !z2) {
                    i9 += iArr3[length2] * f8408o[i8][length2 * 2];
                }
                i10 += iArr3[length2];
            }
            int i11 = 0;
            for (int length3 = iArr4.length - 1; length3 >= 0; length3--) {
                if (cVar2.f8384a != 0 || !z || !z2) {
                    i11 += iArr4[length3] * f8408o[i8][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) != 0 || i10 > 13 || i10 < 4) {
                throw C4619m.f8685i;
            }
            int i13 = (13 - i10) / 2;
            int i14 = f8404k[i13];
            return new C4499b((C1960d.m2758V(iArr3, i14, true) * f8405l[i13]) + C1960d.m2758V(iArr4, 9 - i14, false) + f8406m[i13], i12);
        }
        throw C4619m.f8685i;
    }

    /* renamed from: r */
    public List<C4503a> mo16187r(int i, C4657a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        while (!z6) {
            try {
                List<C4503a> list = this.f8410g;
                list.add(mo16188s(aVar, list, i));
            } catch (C4619m e) {
                if (!this.f8410g.isEmpty()) {
                    z6 = true;
                } else {
                    throw e;
                }
            }
        }
        if (mo16183m()) {
            return this.f8410g;
        }
        boolean z7 = !this.f8411h.isEmpty();
        int i2 = 0;
        boolean z8 = false;
        while (true) {
            if (i2 >= this.f8411h.size()) {
                z = false;
                break;
            }
            C4504b bVar = this.f8411h.get(i2);
            if (bVar.f8402b > i) {
                z = bVar.f8401a.equals(this.f8410g);
                break;
            }
            z8 = bVar.f8401a.equals(this.f8410g);
            i2++;
        }
        if (!z && !z8) {
            List<C4503a> list2 = this.f8410g;
            Iterator<T> it = this.f8411h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                C4504b bVar2 = (C4504b) it.next();
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z4 = true;
                        continue;
                        break;
                    }
                    C4503a aVar2 = (C4503a) it2.next();
                    Iterator<C4503a> it3 = bVar2.f8401a.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (aVar2.equals(it3.next())) {
                                z5 = true;
                                continue;
                                break;
                            }
                        } else {
                            z5 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z5) {
                        z4 = false;
                        continue;
                        break;
                    }
                }
                if (z4) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                this.f8411h.add(i2, new C4504b(this.f8410g, i, false));
                List<C4503a> list3 = this.f8410g;
                Iterator<C4504b> it4 = this.f8411h.iterator();
                while (it4.hasNext()) {
                    C4504b next = it4.next();
                    if (next.f8401a.size() != list3.size()) {
                        Iterator<C4503a> it5 = next.f8401a.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (!list3.contains(it5.next())) {
                                    z3 = false;
                                    break;
                                }
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                        if (z3) {
                            it4.remove();
                        }
                    }
                }
            }
        }
        if (z7) {
            List<C4503a> o = mo16185o(false);
            if (o != null) {
                return o;
            }
            List<C4503a> o2 = mo16185o(true);
            if (o2 != null) {
                return o2;
            }
        }
        throw C4619m.f8685i;
    }

    /* renamed from: s */
    public C4503a mo16188s(C4657a aVar, List<C4503a> list, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C4500c cVar;
        C4657a aVar2 = aVar;
        List<C4503a> list2 = list;
        int i7 = 2;
        int i8 = 0;
        boolean z = true;
        boolean z2 = list.size() % 2 == 0;
        if (this.f8413j) {
            z2 = !z2;
        }
        int i9 = -1;
        boolean z3 = true;
        while (true) {
            int[] iArr = this.f8376a;
            iArr[i2] = i2;
            iArr[1] = i2;
            iArr[i7] = i2;
            iArr[3] = i2;
            int i10 = aVar2.f8786h;
            if (i9 >= 0) {
                i3 = i9;
            } else if (list.isEmpty()) {
                i3 = i2;
            } else {
                i3 = ((C4503a) C0843a.m437M(list2, 1)).f8400c.f8385b[1];
            }
            int i11 = list.size() % i7 != 0 ? 1 : i2;
            if (this.f8413j) {
                i11 ^= 1;
            }
            boolean z4 = i2;
            while (i3 < i10) {
                z4 = !aVar2.mo16323f(i3);
                if (!z4) {
                    break;
                }
                i3++;
            }
            int i12 = z4;
            int i13 = i3;
            while (i3 < i10) {
                if (aVar2.mo16323f(i3) != i12) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    if (i2 == 3) {
                        if (i11 != 0) {
                            m8277t(iArr);
                        }
                        if (C4498a.m8267k(iArr)) {
                            int[] iArr2 = this.f8412i;
                            int i14 = 0;
                            iArr2[0] = i13;
                            iArr2[1] = i3;
                            if (z2) {
                                int i15 = iArr2[0] - 1;
                                while (i15 >= 0 && !aVar2.mo16323f(i15)) {
                                    i15--;
                                }
                                int i16 = i15 + 1;
                                int[] iArr3 = this.f8412i;
                                i6 = iArr3[0] - i16;
                                i5 = i16;
                                i4 = iArr3[1];
                                i14 = 0;
                            } else {
                                int i17 = iArr2[0];
                                int h = aVar2.mo16325h(iArr2[1] + 1);
                                i6 = h - this.f8412i[1];
                                i4 = h;
                                i5 = i17;
                            }
                            int[] iArr4 = this.f8376a;
                            System.arraycopy(iArr4, i14, iArr4, 1, iArr4.length - 1);
                            iArr4[i14] = i6;
                            C4499b bVar = null;
                            try {
                                int l = C4498a.m8268l(iArr4, f8407n);
                                int[] iArr5 = new int[2];
                                iArr5[i14] = i5;
                                iArr5[1] = i4;
                                cVar = new C4500c(l, iArr5, i5, i4, i);
                            } catch (C4619m unused) {
                                cVar = null;
                            }
                            if (cVar == null) {
                                int i18 = this.f8412i[0];
                                i9 = aVar2.mo16323f(i18) ? aVar2.mo16324g(aVar2.mo16325h(i18)) : aVar2.mo16325h(aVar2.mo16324g(i18));
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                C4499b q = mo16186q(aVar2, cVar, z2, true);
                                if (!list.isEmpty()) {
                                    if (((C4503a) C0843a.m437M(list2, 1)).f8399b != null) {
                                        z = false;
                                    }
                                    if (z) {
                                        throw C4619m.f8685i;
                                    }
                                }
                                try {
                                    bVar = mo16186q(aVar2, cVar, z2, false);
                                } catch (C4619m unused2) {
                                }
                                return new C4503a(q, bVar, cVar);
                            }
                            i7 = 2;
                            i8 = 0;
                        } else {
                            if (i11 != 0) {
                                m8277t(iArr);
                            }
                            i13 = iArr[0] + iArr[1] + i13;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = 0;
                            iArr[3] = 0;
                            i2--;
                        }
                    } else {
                        i2++;
                    }
                    iArr[i2] = 1;
                    i12 ^= 1;
                }
                i3++;
            }
            throw C4619m.f8685i;
        }
    }
}
