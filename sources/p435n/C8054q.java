package p435n;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6781b;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.q */
public final class C8054q extends C6781b<C8044h> implements RandomAccess {

    /* renamed from: i */
    public static final C8055a f16165i = new C8055a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public final C8044h[] f16166g;

    /* renamed from: h */
    public final int[] f16167h;

    /* renamed from: n.q$a */
    public static final class C8055a {
        public C8055a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final void mo25979a(long j, C8040e eVar, int i, List<? extends C8044h> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C8040e eVar2;
            C8040e eVar3 = eVar;
            int i8 = i;
            List<? extends C8044h> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C8044h) list3.get(i11)).mo25959l() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C8044h hVar = (C8044h) list.get(i2);
                C8044h hVar2 = (C8044h) list3.get(i10 - 1);
                int i12 = -1;
                if (i8 == hVar.mo25959l()) {
                    int intValue = list4.get(i9).intValue();
                    int i13 = i9 + 1;
                    i4 = i13;
                    i5 = intValue;
                    hVar = (C8044h) list3.get(i13);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (hVar.mo25962s(i8) != hVar2.mo25962s(i8)) {
                    int i14 = 1;
                    for (int i15 = i4 + 1; i15 < i10; i15++) {
                        if (((C8044h) list3.get(i15 - 1)).mo25962s(i8) != ((C8044h) list3.get(i15)).mo25962s(i8)) {
                            i14++;
                        }
                    }
                    long b = mo25980b(eVar3) + j + ((long) 2) + ((long) (i14 * 2));
                    eVar3.mo25943x0(i14);
                    eVar3.mo25943x0(i5);
                    for (int i16 = i4; i16 < i10; i16++) {
                        byte s = ((C8044h) list3.get(i16)).mo25962s(i8);
                        if (i16 == i4 || s != ((C8044h) list3.get(i16 - 1)).mo25962s(i8)) {
                            eVar3.mo25943x0(s & ExifInterface.MARKER);
                        }
                    }
                    C8040e eVar4 = new C8040e();
                    while (i4 < i10) {
                        byte s2 = ((C8044h) list3.get(i4)).mo25962s(i8);
                        int i17 = i4 + 1;
                        int i18 = i17;
                        while (true) {
                            if (i18 >= i10) {
                                i6 = i10;
                                break;
                            } else if (s2 != ((C8044h) list3.get(i18)).mo25962s(i8)) {
                                i6 = i18;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (i17 == i6 && i8 + 1 == ((C8044h) list3.get(i4)).mo25959l()) {
                            eVar3.mo25943x0(list4.get(i4).intValue());
                            i7 = i6;
                            eVar2 = eVar4;
                        } else {
                            eVar3.mo25943x0(((int) (mo25980b(eVar4) + b)) * i12);
                            i7 = i6;
                            eVar2 = eVar4;
                            mo25979a(b, eVar4, i8 + 1, list, i4, i6, list2);
                        }
                        eVar4 = eVar2;
                        i4 = i7;
                        i12 = -1;
                    }
                    eVar3.mo25918n(eVar4);
                    return;
                }
                int min = Math.min(hVar.mo25959l(), hVar2.mo25959l());
                int i19 = i8;
                int i20 = 0;
                while (i19 < min && hVar.mo25962s(i19) == hVar2.mo25962s(i19)) {
                    i20++;
                    i19++;
                }
                long b2 = mo25980b(eVar3) + j + ((long) 2) + ((long) i20) + 1;
                eVar3.mo25943x0(-i20);
                eVar3.mo25943x0(i5);
                int i21 = i8 + i20;
                while (i8 < i21) {
                    eVar3.mo25943x0(hVar.mo25962s(i8) & ExifInterface.MARKER);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i21 == ((C8044h) list3.get(i4)).mo25959l()) {
                        eVar3.mo25943x0(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C8040e eVar5 = new C8040e();
                eVar3.mo25943x0(((int) (mo25980b(eVar5) + b2)) * -1);
                mo25979a(b2, eVar5, i21, list, i4, i3, list2);
                eVar3.mo25918n(eVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        public final long mo25980b(C8040e eVar) {
            return eVar.f16140h / ((long) 4);
        }

        /* renamed from: c */
        public final C8054q mo25981c(C8044h... hVarArr) {
            int i;
            C8044h[] hVarArr2 = hVarArr;
            C6888i.m12438e(hVarArr2, "byteStrings");
            int i2 = 0;
            if (hVarArr2.length == 0) {
                return new C8054q(new C8044h[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List A4 = C5266a.m9775A4(hVarArr);
            C6888i.m12438e(A4, "$this$sort");
            ArrayList arrayList = (ArrayList) A4;
            if (arrayList.size() > 1) {
                Collections.sort(A4);
            }
            ArrayList arrayList2 = new ArrayList(hVarArr2.length);
            for (C8044h hVar : hVarArr2) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List E = C6790h.m12318E((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = hVarArr2.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                C8044h hVar2 = hVarArr2[i3];
                int i5 = i4 + 1;
                int size = arrayList.size();
                C6888i.m12438e(A4, "$this$binarySearch");
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException(C0843a.m447h("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
                } else if (size <= size2) {
                    int i6 = size - 1;
                    int i7 = 0;
                    while (true) {
                        if (i7 > i6) {
                            i = -(i7 + 1);
                            break;
                        }
                        i = (i7 + i6) >>> 1;
                        int X = C5266a.m9902X((Comparable) arrayList.get(i), hVar2);
                        if (X >= 0) {
                            if (X <= 0) {
                                break;
                            }
                            i6 = i - 1;
                        } else {
                            i7 = i + 1;
                        }
                    }
                    E.set(i, Integer.valueOf(i4));
                    i3++;
                    i4 = i5;
                } else {
                    throw new IndexOutOfBoundsException(C0843a.m447h("toIndex (", size, ") is greater than size (", size2, ")."));
                }
            }
            if (((C8044h) arrayList.get(0)).mo25959l() > 0) {
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    C8044h hVar3 = (C8044h) arrayList.get(i8);
                    int i9 = i8 + 1;
                    int i10 = i9;
                    while (i10 < arrayList.size()) {
                        C8044h hVar4 = (C8044h) arrayList.get(i10);
                        Objects.requireNonNull(hVar4);
                        C6888i.m12438e(hVar3, "prefix");
                        if (!hVar4.mo25964v(0, hVar3, 0, hVar3.mo25959l())) {
                            continue;
                            break;
                        }
                        if (!(hVar4.mo25959l() != hVar3.mo25959l())) {
                            throw new IllegalArgumentException(("duplicate option: " + hVar4).toString());
                        } else if (((Number) E.get(i10)).intValue() > ((Number) E.get(i8)).intValue()) {
                            arrayList.remove(i10);
                            E.remove(i10);
                        } else {
                            i10++;
                        }
                    }
                    i8 = i9;
                }
                C8040e eVar = new C8040e();
                mo25979a(0, eVar, 0, A4, 0, arrayList.size(), E);
                int[] iArr = new int[((int) mo25980b(eVar))];
                while (!eVar.mo25886D()) {
                    iArr[i2] = eVar.readInt();
                    i2++;
                }
                Object[] copyOf = Arrays.copyOf(hVarArr2, hVarArr2.length);
                C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new C8054q((C8044h[]) copyOf, iArr, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    public C8054q(C8044h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f16166g = hVarArr;
        this.f16167h = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C8044h) {
            return super.contains((C8044h) obj);
        }
        return false;
    }

    /* renamed from: e */
    public int mo23951e() {
        return this.f16166g.length;
    }

    public Object get(int i) {
        return this.f16166g[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C8044h) {
            return super.indexOf((C8044h) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C8044h) {
            return super.lastIndexOf((C8044h) obj);
        }
        return -1;
    }
}
