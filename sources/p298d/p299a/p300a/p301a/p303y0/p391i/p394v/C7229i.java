package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.i.v.i */
public final class C7229i {

    /* renamed from: d.a.a.a.y0.i.v.i$a */
    public static final class C7230a extends C6890k implements C6862l<C6021a0, C7452c0> {

        /* renamed from: g */
        public final /* synthetic */ PrimitiveType f14461g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7230a(PrimitiveType primitiveType) {
            super(1);
            this.f14461g = primitiveType;
        }

        public Object invoke(Object obj) {
            C6021a0 a0Var = (C6021a0) obj;
            C6888i.m12438e(a0Var, "module");
            C7489j0 primitiveArrayKotlinType = a0Var.getBuiltIns().getPrimitiveArrayKotlinType(this.f14461g);
            C6888i.m12437d(primitiveArrayKotlinType, "module.builtIns.getPrimitiveArrayKotlinType(componentType)");
            return primitiveArrayKotlinType;
        }
    }

    /* renamed from: a */
    public static final C7221b m13111a(List<?> list, PrimitiveType primitiveType) {
        List<T> X = C6790h.m12337X(list);
        ArrayList arrayList = new ArrayList();
        for (T b : X) {
            C7227g<?> b2 = m13112b(b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return new C7221b(arrayList, new C7230a(primitiveType));
    }

    /* renamed from: b */
    public static final C7227g<?> m13112b(Object obj) {
        PrimitiveType primitiveType;
        List list;
        ArrayList arrayList;
        List list2;
        ArrayList arrayList2;
        List list3;
        ArrayList arrayList3;
        List list4;
        ArrayList arrayList4;
        List list5;
        ArrayList arrayList5;
        List list6;
        ArrayList arrayList6;
        List list7;
        ArrayList arrayList7;
        List list8;
        ArrayList arrayList8;
        if (obj instanceof Byte) {
            return new C7224d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C7248v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C7236n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C7246t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C7225e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C7235m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C7231j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C7223c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C7249w((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            C6888i.m12438e(bArr, "$this$toList");
            int length = bArr.length;
            if (length == 0) {
                arrayList8 = C6798p.f13713g;
            } else if (length != 1) {
                C6888i.m12438e(bArr, "$this$toMutableList");
                ArrayList arrayList9 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    arrayList9.add(Byte.valueOf(bArr[i]));
                    i++;
                }
                arrayList8 = arrayList9;
            } else {
                arrayList8 = C5266a.m9910Y2(Byte.valueOf(bArr[0]));
            }
            primitiveType = PrimitiveType.BYTE;
            list = arrayList8;
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            C6888i.m12438e(sArr, "$this$toList");
            int length3 = sArr.length;
            if (length3 == 0) {
                list8 = C6798p.f13713g;
            } else if (length3 != 1) {
                C6888i.m12438e(sArr, "$this$toMutableList");
                ArrayList arrayList10 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    arrayList10.add(Short.valueOf(sArr[i]));
                    i++;
                }
                arrayList7 = arrayList10;
                primitiveType = PrimitiveType.SHORT;
                list = arrayList7;
            } else {
                list8 = C5266a.m9910Y2(Short.valueOf(sArr[0]));
            }
            arrayList7 = list8;
            primitiveType = PrimitiveType.SHORT;
            list = arrayList7;
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            C6888i.m12438e(iArr, "$this$toList");
            int length5 = iArr.length;
            if (length5 == 0) {
                list7 = C6798p.f13713g;
            } else if (length5 != 1) {
                C6888i.m12438e(iArr, "$this$toMutableList");
                ArrayList arrayList11 = new ArrayList(iArr.length);
                int length6 = iArr.length;
                while (i < length6) {
                    arrayList11.add(Integer.valueOf(iArr[i]));
                    i++;
                }
                arrayList6 = arrayList11;
                primitiveType = PrimitiveType.INT;
                list = arrayList6;
            } else {
                list7 = C5266a.m9910Y2(Integer.valueOf(iArr[0]));
            }
            arrayList6 = list7;
            primitiveType = PrimitiveType.INT;
            list = arrayList6;
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            C6888i.m12438e(jArr, "$this$toList");
            int length7 = jArr.length;
            if (length7 == 0) {
                list6 = C6798p.f13713g;
            } else if (length7 != 1) {
                C6888i.m12438e(jArr, "$this$toMutableList");
                ArrayList arrayList12 = new ArrayList(jArr.length);
                int length8 = jArr.length;
                while (i < length8) {
                    arrayList12.add(Long.valueOf(jArr[i]));
                    i++;
                }
                arrayList5 = arrayList12;
                primitiveType = PrimitiveType.LONG;
                list = arrayList5;
            } else {
                list6 = C5266a.m9910Y2(Long.valueOf(jArr[0]));
            }
            arrayList5 = list6;
            primitiveType = PrimitiveType.LONG;
            list = arrayList5;
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            C6888i.m12438e(cArr, "$this$toList");
            int length9 = cArr.length;
            if (length9 == 0) {
                list5 = C6798p.f13713g;
            } else if (length9 != 1) {
                C6888i.m12438e(cArr, "$this$toMutableList");
                ArrayList arrayList13 = new ArrayList(cArr.length);
                int length10 = cArr.length;
                while (i < length10) {
                    arrayList13.add(Character.valueOf(cArr[i]));
                    i++;
                }
                arrayList4 = arrayList13;
                primitiveType = PrimitiveType.CHAR;
                list = arrayList4;
            } else {
                list5 = C5266a.m9910Y2(Character.valueOf(cArr[0]));
            }
            arrayList4 = list5;
            primitiveType = PrimitiveType.CHAR;
            list = arrayList4;
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            C6888i.m12438e(fArr, "$this$toList");
            int length11 = fArr.length;
            if (length11 == 0) {
                list4 = C6798p.f13713g;
            } else if (length11 != 1) {
                C6888i.m12438e(fArr, "$this$toMutableList");
                ArrayList arrayList14 = new ArrayList(fArr.length);
                int length12 = fArr.length;
                while (i < length12) {
                    arrayList14.add(Float.valueOf(fArr[i]));
                    i++;
                }
                arrayList3 = arrayList14;
                primitiveType = PrimitiveType.FLOAT;
                list = arrayList3;
            } else {
                list4 = C5266a.m9910Y2(Float.valueOf(fArr[0]));
            }
            arrayList3 = list4;
            primitiveType = PrimitiveType.FLOAT;
            list = arrayList3;
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            C6888i.m12438e(dArr, "$this$toList");
            int length13 = dArr.length;
            if (length13 == 0) {
                list3 = C6798p.f13713g;
            } else if (length13 != 1) {
                C6888i.m12438e(dArr, "$this$toMutableList");
                ArrayList arrayList15 = new ArrayList(dArr.length);
                int length14 = dArr.length;
                while (i < length14) {
                    arrayList15.add(Double.valueOf(dArr[i]));
                    i++;
                }
                arrayList2 = arrayList15;
                primitiveType = PrimitiveType.DOUBLE;
                list = arrayList2;
            } else {
                list3 = C5266a.m9910Y2(Double.valueOf(dArr[0]));
            }
            arrayList2 = list3;
            primitiveType = PrimitiveType.DOUBLE;
            list = arrayList2;
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            C6888i.m12438e(zArr, "$this$toList");
            int length15 = zArr.length;
            if (length15 == 0) {
                list2 = C6798p.f13713g;
            } else if (length15 != 1) {
                C6888i.m12438e(zArr, "$this$toMutableList");
                ArrayList arrayList16 = new ArrayList(zArr.length);
                int length16 = zArr.length;
                while (i < length16) {
                    arrayList16.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
                arrayList = arrayList16;
                primitiveType = PrimitiveType.BOOLEAN;
                list = arrayList;
            } else {
                list2 = C5266a.m9910Y2(Boolean.valueOf(zArr[0]));
            }
            arrayList = list2;
            primitiveType = PrimitiveType.BOOLEAN;
            list = arrayList;
        } else if (obj == null) {
            return new C7247u();
        } else {
            return null;
        }
        return m13111a(list, primitiveType);
    }
}
