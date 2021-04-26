package p005b.p096l.p164b.p165a.p171c;

import java.io.Closeable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p171c.C3704g;
import p005b.p096l.p164b.p165a.p171c.p172j.C3710c;
import p005b.p096l.p164b.p165a.p173d.C3719e;
import p005b.p096l.p164b.p165a.p173d.C3723g;
import p005b.p096l.p164b.p165a.p173d.C3729j;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3734l;

/* renamed from: b.l.b.a.c.f */
public abstract class C3703f implements Closeable {

    /* renamed from: g */
    public static WeakHashMap<Class<?>, Field> f6831g = new WeakHashMap<>();

    /* renamed from: h */
    public static final Lock f6832h = new ReentrantLock();

    /* renamed from: d */
    public static Field m6987d(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock = f6832h;
        lock.lock();
        try {
            if (f6831g.containsKey(cls)) {
                Field field2 = f6831g.get(cls);
                lock.unlock();
                return field2;
            }
            for (T t : Collections.unmodifiableCollection(C3719e.m7013b(cls).f6869b.values())) {
                Field field3 = t.f6905b;
                C3704g gVar = (C3704g) field3.getAnnotation(C3704g.class);
                if (gVar != null) {
                    C1960d.m2845s(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    C1960d.m2845s(C3723g.m7021d(field3.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, field3.getType());
                    C3704g.C3705a[] typeDefinitions = gVar.typeDefinitions();
                    HashSet hashSet = new HashSet();
                    C1960d.m2833p(typeDefinitions.length > 0, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (C3704g.C3705a aVar : typeDefinitions) {
                        C1960d.m2845s(hashSet.add(aVar.key()), "Class contains two @TypeDef annotations with identical key: %s", aVar.key());
                    }
                    field = field3;
                }
            }
            f6831g.put(cls, field);
            return field;
        } finally {
            f6832h.unlock();
        }
    }

    /* renamed from: H */
    public Object mo15032H(Type type, boolean z, C3698a aVar) {
        try {
            if (!Void.class.equals(type)) {
                mo15036Z();
            }
            return mo15035S((Field) null, type, new ArrayList(), (Object) null, aVar, true);
        } finally {
            if (z) {
                ((C3710c) this).f6848i.close();
            }
        }
    }

    /* renamed from: N */
    public final void mo15033N(ArrayList<Type> arrayList, Object obj, C3698a aVar) {
        if (obj instanceof C3699b) {
            ((C3699b) obj).jsonFactory = ((C3710c) this).f6849j;
        }
        C3707i f0 = mo15038f0();
        Class<?> cls = obj.getClass();
        C3719e b = C3719e.m7013b(cls);
        boolean isAssignableFrom = C3730k.class.isAssignableFrom(cls);
        if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            while (f0 == C3707i.FIELD_NAME) {
                String q = mo15039q();
                mo15040z();
                if (aVar == null) {
                    C3729j a = b.mo15076a(q);
                    if (a != null) {
                        if (!Modifier.isFinal(a.f6905b.getModifiers()) || a.f6904a) {
                            Field field = a.f6905b;
                            int size = arrayList.size();
                            arrayList.add(field.getGenericType());
                            Object S = mo15035S(field, a.mo15100a(), arrayList, obj, aVar, true);
                            arrayList.remove(size);
                            a.mo15102f(obj, S);
                        } else {
                            throw new IllegalArgumentException("final array/object fields are not supported");
                        }
                    } else if (isAssignableFrom) {
                        ((C3730k) obj).set(q, mo15035S((Field) null, (Type) null, arrayList, obj, aVar, true));
                    } else if (aVar == null) {
                        ((C3710c) this).f6848i.mo11498n0();
                    } else {
                        throw null;
                    }
                    f0 = mo15040z();
                } else {
                    throw null;
                }
            }
            return;
        }
        mo15034O((Field) null, (Map) obj, C3734l.m7038b(cls, Map.class, 1), arrayList, aVar);
    }

    /* renamed from: O */
    public final void mo15034O(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, C3698a aVar) {
        C3707i f0 = mo15038f0();
        while (f0 == C3707i.FIELD_NAME) {
            String q = mo15039q();
            mo15040z();
            if (aVar == null) {
                map.put(q, mo15035S(field, type, arrayList, map, aVar, true));
                f0 = mo15040z();
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:208:0x033a A[Catch:{ IllegalArgumentException -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0344 A[Catch:{ IllegalArgumentException -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0349 A[ADDED_TO_REGION, Catch:{ IllegalArgumentException -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0363 A[Catch:{ IllegalArgumentException -> 0x0397 }, LOOP:1: B:219:0x035f->B:221:0x0363, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0378 A[Catch:{ IllegalArgumentException -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0381 A[Catch:{ IllegalArgumentException -> 0x0397 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab A[Catch:{ IllegalArgumentException -> 0x0397 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae A[Catch:{ IllegalArgumentException -> 0x0397 }] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo15035S(java.lang.reflect.Field r8, java.lang.reflect.Type r9, java.util.ArrayList<java.lang.reflect.Type> r10, java.lang.Object r11, p005b.p096l.p164b.p165a.p171c.C3698a r12, boolean r13) {
        /*
            r7 = this;
            java.lang.Class<java.lang.Double> r11 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            java.lang.reflect.Type r9 = p005b.p096l.p164b.p165a.p173d.C3723g.m7027j(r10, r9)
            boolean r1 = r9 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L_0x0011
            r1 = r9
            java.lang.Class r1 = (java.lang.Class) r1
            goto L_0x0012
        L_0x0011:
            r1 = r2
        L_0x0012:
            boolean r3 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x001d
            r1 = r9
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.Class r1 = p005b.p096l.p164b.p165a.p173d.C3734l.m7043g(r1)
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r1 != r3) goto L_0x002a
            r8 = r7
            b.l.b.a.c.j.c r8 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r8
            b.j.a.a.g r8 = r8.f6848i
            r8.mo11498n0()
            return r2
        L_0x002a:
            b.l.b.a.c.i r3 = r7.mo15037e()
            b.l.b.a.c.i r4 = r7.mo15037e()     // Catch:{ IllegalArgumentException -> 0x0397 }
            int r4 = r4.ordinal()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r5 = 0
            r6 = 1
            switch(r4) {
                case 0: goto L_0x0319;
                case 1: goto L_0x0319;
                case 2: goto L_0x022b;
                case 3: goto L_0x022b;
                case 4: goto L_0x022b;
                case 5: goto L_0x01d6;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00b1;
                case 8: goto L_0x008a;
                case 9: goto L_0x008a;
                case 10: goto L_0x003f;
                default: goto L_0x003b;
            }     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x003b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x0382
        L_0x003f:
            if (r1 == 0) goto L_0x0047
            boolean r11 = r1.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r11 != 0) goto L_0x0048
        L_0x0047:
            r5 = r6
        L_0x0048:
            java.lang.String r11 = "primitive number field but found a JSON null"
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2833p(r5, r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 == 0) goto L_0x0081
            int r11 = r1.getModifiers()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r11 = r11 & 1536(0x600, float:2.152E-42)
            if (r11 == 0) goto L_0x0081
            java.lang.Class<java.util.Collection> r11 = java.util.Collection.class
            boolean r11 = p005b.p096l.p164b.p165a.p173d.C3734l.m7047k(r1, r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r11 == 0) goto L_0x006c
            java.util.Collection r9 = p005b.p096l.p164b.p165a.p173d.C3723g.m7023f(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Object r8 = p005b.p096l.p164b.p165a.p173d.C3723g.m7025h(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x006c:
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            boolean r11 = p005b.p096l.p164b.p165a.p173d.C3734l.m7047k(r1, r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r11 == 0) goto L_0x0081
            java.util.Map r9 = p005b.p096l.p164b.p165a.p173d.C3723g.m7024g(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Object r8 = p005b.p096l.p164b.p165a.p173d.C3723g.m7025h(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x0081:
            java.lang.Class r9 = p005b.p096l.p164b.p165a.p173d.C3734l.m7042f(r10, r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Object r8 = p005b.p096l.p164b.p165a.p173d.C3723g.m7025h(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x008a:
            if (r9 == 0) goto L_0x009d
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 == r10) goto L_0x009d
            if (r1 == 0) goto L_0x009b
            java.lang.Class<java.lang.Boolean> r10 = java.lang.Boolean.class
            boolean r10 = r1.isAssignableFrom(r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r10 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r10 = r5
            goto L_0x009e
        L_0x009d:
            r10 = r6
        L_0x009e:
            java.lang.String r11 = "expected type Boolean or boolean but got %s"
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ IllegalArgumentException -> 0x0397 }
            r12[r5] = r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2845s(r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.l.b.a.c.i r9 = p005b.p096l.p164b.p165a.p171c.C3707i.VALUE_TRUE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r3 != r9) goto L_0x00ae
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x00b0
        L_0x00ae:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x00b0:
            return r8
        L_0x00b1:
            if (r8 == 0) goto L_0x00bb
            java.lang.Class<b.l.b.a.c.h> r10 = p005b.p096l.p164b.p165a.p171c.C3706h.class
            java.lang.annotation.Annotation r10 = r8.getAnnotation(r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r10 != 0) goto L_0x00bc
        L_0x00bb:
            r5 = r6
        L_0x00bc:
            java.lang.String r10 = "number type formatted as a JSON number cannot use @JsonString annotation"
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2833p(r5, r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 == 0) goto L_0x01cc
            java.lang.Class<java.math.BigDecimal> r10 = java.math.BigDecimal.class
            boolean r10 = r1.isAssignableFrom(r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r10 == 0) goto L_0x00cd
            goto L_0x01cc
        L_0x00cd:
            java.lang.Class<java.math.BigInteger> r10 = java.math.BigInteger.class
            if (r1 != r10) goto L_0x00db
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.math.BigInteger r8 = r9.mo11493d()     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x00db:
            if (r1 == r11) goto L_0x01be
            java.lang.Class r10 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 != r10) goto L_0x00e3
            goto L_0x01be
        L_0x00e3:
            java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
            if (r1 == r10) goto L_0x01b0
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 != r10) goto L_0x00ed
            goto L_0x01b0
        L_0x00ed:
            if (r1 == r0) goto L_0x01a2
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 != r10) goto L_0x00f5
            goto L_0x01a2
        L_0x00f5:
            java.lang.Class<java.lang.Integer> r10 = java.lang.Integer.class
            if (r1 == r10) goto L_0x0194
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 != r10) goto L_0x00ff
            goto L_0x0194
        L_0x00ff:
            java.lang.Class<java.lang.Short> r10 = java.lang.Short.class
            java.lang.String r11 = "Numeric value ("
            if (r1 == r10) goto L_0x015f
            java.lang.Class r10 = java.lang.Short.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 != r10) goto L_0x010a
            goto L_0x015f
        L_0x010a:
            java.lang.Class<java.lang.Byte> r10 = java.lang.Byte.class
            if (r1 == r10) goto L_0x012a
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 != r10) goto L_0x0113
            goto L_0x012a
        L_0x0113:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0397 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r12 = "expected numeric type but got "
            r11.append(r12)     // Catch:{ IllegalArgumentException -> 0x0397 }
            r11.append(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r9 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            throw r10     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x012a:
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            int r10 = r9.mo11490S()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r12 = -128(0xffffffffffffff80, float:NaN)
            if (r10 < r12) goto L_0x0141
            r12 = 255(0xff, float:3.57E-43)
            if (r10 > r12) goto L_0x0141
            byte r9 = (byte) r10     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Byte r8 = java.lang.Byte.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x0141:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.<init>()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r11 = r9.mo11495f0()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r11 = ") out of range of Java byte"
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r10 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.f r11 = new b.j.a.a.f     // Catch:{ IllegalArgumentException -> 0x0397 }
            r11.<init>(r9, r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x015f:
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            int r10 = r9.mo11490S()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r12 = -32768(0xffffffffffff8000, float:NaN)
            if (r10 < r12) goto L_0x0176
            r12 = 32767(0x7fff, float:4.5916E-41)
            if (r10 > r12) goto L_0x0176
            short r9 = (short) r10     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Short r8 = java.lang.Short.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x0176:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.<init>()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r11 = r9.mo11495f0()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r11 = ") out of range of Java short"
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r10 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.f r11 = new b.j.a.a.f     // Catch:{ IllegalArgumentException -> 0x0397 }
            r11.<init>(r9, r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x0194:
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            int r9 = r9.mo11490S()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x01a2:
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            float r9 = r9.mo11489O()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Float r8 = java.lang.Float.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x01b0:
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            long r9 = r9.mo11491Z()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x01be:
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            double r9 = r9.mo11488N()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Double r8 = java.lang.Double.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x01cc:
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.j.a.a.g r9 = r9.f6848i     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.math.BigDecimal r8 = r9.mo11487H()     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x01d6:
            java.lang.String r10 = r7.mo15039q()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r10 = r10.trim()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r10 = r10.toLowerCase(r12)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Class r12 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 == r12) goto L_0x01f0
            if (r1 == r0) goto L_0x01f0
            java.lang.Class r12 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r1 == r12) goto L_0x01f0
            if (r1 != r11) goto L_0x0208
        L_0x01f0:
            java.lang.String r11 = "nan"
            boolean r11 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r11 != 0) goto L_0x0222
            java.lang.String r11 = "infinity"
            boolean r11 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r11 != 0) goto L_0x0222
            java.lang.String r11 = "-infinity"
            boolean r10 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r10 != 0) goto L_0x0222
        L_0x0208:
            if (r1 == 0) goto L_0x021c
            java.lang.Class<java.lang.Number> r10 = java.lang.Number.class
            boolean r10 = r10.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r10 == 0) goto L_0x021c
            if (r8 == 0) goto L_0x021d
            java.lang.Class<b.l.b.a.c.h> r10 = p005b.p096l.p164b.p165a.p171c.C3706h.class
            java.lang.annotation.Annotation r10 = r8.getAnnotation(r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r10 == 0) goto L_0x021d
        L_0x021c:
            r5 = r6
        L_0x021d:
            java.lang.String r10 = "number field formatted as a JSON string must use the @JsonString annotation"
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2833p(r5, r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x0222:
            java.lang.String r10 = r7.mo15039q()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Object r8 = p005b.p096l.p164b.p165a.p173d.C3723g.m7026i(r9, r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x022b:
            boolean r11 = p005b.p096l.p164b.p165a.p173d.C3734l.m7046j(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r11 != 0) goto L_0x0233
            r11 = r6
            goto L_0x0234
        L_0x0233:
            r11 = r5
        L_0x0234:
            java.lang.String r0 = "expected object or map type but got %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ IllegalArgumentException -> 0x0397 }
            r3[r5] = r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2845s(r11, r0, r3)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r13 == 0) goto L_0x0244
            java.lang.reflect.Field r11 = m6987d(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x0245
        L_0x0244:
            r11 = r2
        L_0x0245:
            if (r1 == 0) goto L_0x024b
            if (r12 != 0) goto L_0x024a
            goto L_0x024b
        L_0x024a:
            throw r2     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x024b:
            if (r1 == 0) goto L_0x0257
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            boolean r13 = p005b.p096l.p164b.p165a.p173d.C3734l.m7047k(r1, r13)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r13 == 0) goto L_0x0257
            r13 = r6
            goto L_0x0258
        L_0x0257:
            r13 = r5
        L_0x0258:
            if (r11 == 0) goto L_0x0260
            b.l.b.a.c.b r0 = new b.l.b.a.c.b     // Catch:{ IllegalArgumentException -> 0x0397 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x026e
        L_0x0260:
            if (r13 != 0) goto L_0x026a
            if (r1 != 0) goto L_0x0265
            goto L_0x026a
        L_0x0265:
            java.lang.Object r0 = p005b.p096l.p164b.p165a.p173d.C3734l.m7049m(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x026e
        L_0x026a:
            java.util.Map r0 = p005b.p096l.p164b.p165a.p173d.C3723g.m7024g(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x026e:
            int r3 = r10.size()     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r9 == 0) goto L_0x0277
            r10.add(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x0277:
            if (r13 == 0) goto L_0x029f
            java.lang.Class<b.l.b.a.d.k> r13 = p005b.p096l.p164b.p165a.p173d.C3730k.class
            boolean r13 = r13.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r13 != 0) goto L_0x029f
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            boolean r13 = r13.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r13 == 0) goto L_0x0291
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            java.lang.reflect.Type r13 = p005b.p096l.p164b.p165a.p173d.C3734l.m7038b(r9, r13, r6)     // Catch:{ IllegalArgumentException -> 0x0397 }
            r4 = r13
            goto L_0x0292
        L_0x0291:
            r4 = r2
        L_0x0292:
            if (r4 == 0) goto L_0x029f
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x0397 }
            r1 = r7
            r2 = r8
            r5 = r10
            r6 = r12
            r1.mo15034O(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r0
        L_0x029f:
            r7.mo15033N(r10, r0, r12)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r9 == 0) goto L_0x02a7
            r10.remove(r3)     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x02a7:
            if (r11 != 0) goto L_0x02aa
            return r0
        L_0x02aa:
            r9 = r0
            b.l.b.a.c.b r9 = (p005b.p096l.p164b.p165a.p171c.C3699b) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r12 = r11.getName()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r9 == 0) goto L_0x02b9
            r12 = r6
            goto L_0x02ba
        L_0x02b9:
            r12 = r5
        L_0x02ba:
            java.lang.String r13 = "No value specified for @JsonPolymorphicTypeMap field"
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2833p(r12, r13)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r9 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Class<b.l.b.a.c.g> r12 = p005b.p096l.p164b.p165a.p171c.C3704g.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.l.b.a.c.g r11 = (p005b.p096l.p164b.p165a.p171c.C3704g) r11     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.l.b.a.c.g$a[] r11 = r11.typeDefinitions()     // Catch:{ IllegalArgumentException -> 0x0397 }
            int r12 = r11.length     // Catch:{ IllegalArgumentException -> 0x0397 }
            r13 = r5
        L_0x02d1:
            if (r13 >= r12) goto L_0x02e7
            r1 = r11[r13]     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r3 = r1.key()     // Catch:{ IllegalArgumentException -> 0x0397 }
            boolean r3 = r3.equals(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r3 == 0) goto L_0x02e4
            java.lang.Class r2 = r1.ref()     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x02e7
        L_0x02e4:
            int r13 = r13 + 1
            goto L_0x02d1
        L_0x02e7:
            if (r2 == 0) goto L_0x02ea
            goto L_0x02eb
        L_0x02ea:
            r6 = r5
        L_0x02eb:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0397 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r12 = "No TypeDef annotation found with key: "
            r11.append(r12)     // Catch:{ IllegalArgumentException -> 0x0397 }
            r11.append(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r9 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x0397 }
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2833p(r6, r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            r9 = r7
            b.l.b.a.c.j.c r9 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.l.b.a.c.j.a r9 = r9.f6849j     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r11 = r9.mo15028e(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.l.b.a.c.f r0 = r9.mo15027d(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            r0.mo15036Z()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r8
            r3 = r10
            java.lang.Object r8 = r0.mo15035S(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x0319:
            boolean r11 = p005b.p096l.p164b.p165a.p173d.C3734l.m7046j(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r9 == 0) goto L_0x032e
            if (r11 != 0) goto L_0x032e
            if (r1 == 0) goto L_0x032c
            java.lang.Class<java.util.Collection> r13 = java.util.Collection.class
            boolean r13 = p005b.p096l.p164b.p165a.p173d.C3734l.m7047k(r1, r13)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r13 == 0) goto L_0x032c
            goto L_0x032e
        L_0x032c:
            r13 = r5
            goto L_0x032f
        L_0x032e:
            r13 = r6
        L_0x032f:
            java.lang.String r0 = "expected collection or array type but got %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ IllegalArgumentException -> 0x0397 }
            r3[r5] = r9     // Catch:{ IllegalArgumentException -> 0x0397 }
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2845s(r13, r0, r3)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r12 == 0) goto L_0x033e
            if (r8 != 0) goto L_0x033d
            goto L_0x033e
        L_0x033d:
            throw r2     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x033e:
            java.util.Collection r13 = p005b.p096l.p164b.p165a.p173d.C3723g.m7023f(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r11 == 0) goto L_0x0349
            java.lang.reflect.Type r2 = p005b.p096l.p164b.p165a.p173d.C3734l.m7039c(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x0357
        L_0x0349:
            if (r1 == 0) goto L_0x0357
            java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r0 == 0) goto L_0x0357
            java.lang.reflect.Type r2 = p005b.p096l.p164b.p165a.p173d.C3734l.m7041e(r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x0357:
            java.lang.reflect.Type r9 = p005b.p096l.p164b.p165a.p173d.C3723g.m7027j(r10, r2)     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.l.b.a.c.i r0 = r7.mo15038f0()     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x035f:
            b.l.b.a.c.i r1 = p005b.p096l.p164b.p165a.p171c.C3707i.END_ARRAY     // Catch:{ IllegalArgumentException -> 0x0397 }
            if (r0 == r1) goto L_0x0376
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r12
            java.lang.Object r0 = r0.mo15035S(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0397 }
            r13.add(r0)     // Catch:{ IllegalArgumentException -> 0x0397 }
            b.l.b.a.c.i r0 = r7.mo15040z()     // Catch:{ IllegalArgumentException -> 0x0397 }
            goto L_0x035f
        L_0x0376:
            if (r11 == 0) goto L_0x0381
            java.lang.Class r9 = p005b.p096l.p164b.p165a.p173d.C3734l.m7042f(r10, r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.Object r8 = p005b.p096l.p164b.p165a.p173d.C3734l.m7051o(r13, r9)     // Catch:{ IllegalArgumentException -> 0x0397 }
            return r8
        L_0x0381:
            return r13
        L_0x0382:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.<init>()     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r11 = "unexpected JSON node type: "
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x0397 }
            r10.append(r3)     // Catch:{ IllegalArgumentException -> 0x0397 }
            java.lang.String r10 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x0397 }
            r9.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0397 }
            throw r9     // Catch:{ IllegalArgumentException -> 0x0397 }
        L_0x0397:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r7
            b.l.b.a.c.j.c r11 = (p005b.p096l.p164b.p165a.p171c.p172j.C3710c) r11
            b.j.a.a.g r11 = r11.f6848i
            java.lang.String r11 = r11.mo11499q()
            if (r11 == 0) goto L_0x03b0
            java.lang.String r12 = "key "
            r10.append(r12)
            r10.append(r11)
        L_0x03b0:
            if (r8 == 0) goto L_0x03c1
            if (r11 == 0) goto L_0x03b9
            java.lang.String r11 = ", "
            r10.append(r11)
        L_0x03b9:
            java.lang.String r11 = "field "
            r10.append(r11)
            r10.append(r8)
        L_0x03c1:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r8.<init>(r10, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p171c.C3703f.mo15035S(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, b.l.b.a.c.a, boolean):java.lang.Object");
    }

    /* renamed from: Z */
    public final C3707i mo15036Z() {
        C3707i e = mo15037e();
        if (e == null) {
            e = mo15040z();
        }
        C1960d.m2833p(e != null, "no JSON input found");
        return e;
    }

    /* renamed from: e */
    public abstract C3707i mo15037e();

    /* renamed from: f0 */
    public final C3707i mo15038f0() {
        C3707i Z = mo15036Z();
        int ordinal = Z.ordinal();
        if (ordinal == 0) {
            return mo15040z();
        }
        if (ordinal != 2) {
            return Z;
        }
        C3707i z = mo15040z();
        C1960d.m2833p(z == C3707i.FIELD_NAME || z == C3707i.END_OBJECT, z);
        return z;
    }

    /* renamed from: q */
    public abstract String mo15039q();

    /* renamed from: z */
    public abstract C3707i mo15040z();
}
