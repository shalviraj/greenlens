package p005b.p280p.p281a.p282a0.p283a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5074k;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.C5099x;
import p005b.p280p.p281a.p282a0.p283a.C5057a;
import p005b.p280p.p281a.p284z.C5117b;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6726e;
import p298d.p299a.C6729h;
import p298d.p299a.C6732j;
import p298d.p299a.C6734k;
import p298d.p299a.C6736l;
import p298d.p299a.C6739m;
import p298d.p299a.p300a.p301a.C5858a;
import p298d.p299a.p300a.p301a.C5877b;
import p298d.p299a.p300a.p301a.C5913g;
import p298d.p299a.p300a.p301a.C5939n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6905z;
import p298d.p344x.p346c.p347a0.C6875a;
import p298d.p344x.p346c.p347a0.C6877c;

/* renamed from: b.p.a.a0.a.b */
public final class C5060b implements C5075l.C5076a {
    /* renamed from: a */
    public C5075l<?> mo16807a(Type type, Set<? extends Annotation> set, C5099x xVar) {
        Object obj;
        Iterator it;
        String str;
        String str2;
        T t;
        Type type2 = type;
        C5099x xVar2 = xVar;
        C6888i.m12438e(type2, "type");
        C6888i.m12438e(set, "annotations");
        C6888i.m12438e(xVar2, "moshi");
        boolean z = true;
        T t2 = null;
        if (!set.isEmpty()) {
            return null;
        }
        C6888i.m12438e(type2, "$this$rawType");
        Class<?> j = C4805c3.m8811j(type);
        C6888i.m12437d(j, "Types.getRawType(this)");
        if (j.isInterface() || j.isEnum()) {
            return null;
        }
        Class<Metadata> cls = C5061c.f9777a;
        if (!j.isAnnotationPresent(C5061c.f9777a) || C5117b.m9418e(j)) {
            return null;
        }
        try {
            C5075l<?> c = C5117b.m9416c(xVar2, type2, j);
            if (c != null) {
                return c;
            }
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            if (!(runtimeException.getCause() instanceof ClassNotFoundException)) {
                throw runtimeException;
            }
        }
        if (!j.isLocalClass()) {
            C6726e<?> C1 = C5266a.m9784C1(j);
            if (!(!C1.mo22946i())) {
                StringBuilder u = C0843a.m460u("Cannot serialize abstract class ");
                u.append(j.getName());
                throw new IllegalArgumentException(u.toString().toString());
            } else if (!C1.isInner()) {
                if (!(C1.mo22950q() == null)) {
                    StringBuilder u2 = C0843a.m460u("Cannot serialize object declaration ");
                    u2.append(j.getName());
                    throw new IllegalArgumentException(u2.toString().toString());
                } else if (!C1.mo22943f()) {
                    C6888i.m12438e(C1, "$this$primaryConstructor");
                    C5858a aVar = (C5858a) C1;
                    C5939n0 n0Var = aVar.f11613i.invoke().f11619g;
                    C6736l lVar = C5858a.C5859a.f11615p[4];
                    Iterator it2 = ((Collection) n0Var.invoke()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        C6729h hVar = (C6729h) obj;
                        Objects.requireNonNull(hVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
                        C6244v D = ((C5877b) hVar).mo22976x();
                        Objects.requireNonNull(D, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
                        if (((C6157j) D).mo23248q()) {
                            break;
                        }
                    }
                    C6729h hVar2 = (C6729h) obj;
                    if (hVar2 == null) {
                        return null;
                    }
                    List<C6734k> parameters = hVar2.getParameters();
                    int g3 = C5266a.m9957g3(C5266a.m9892V(parameters, 10));
                    if (g3 < 16) {
                        g3 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(g3);
                    for (T next : parameters) {
                        linkedHashMap.put(((C6734k) next).getName(), next);
                    }
                    C5266a.m9886T3(hVar2, true);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    C6888i.m12438e(C1, "$this$memberProperties");
                    C5939n0 n0Var2 = aVar.f11613i.invoke().f11625m;
                    C6736l lVar2 = C5858a.C5859a.f11615p[14];
                    ArrayList arrayList = new ArrayList();
                    for (Object next2 : (Collection) n0Var2.invoke()) {
                        C5913g gVar = (C5913g) next2;
                        if (((gVar.mo22976x().getExtensionReceiverParameter() != null) ^ true) && (gVar instanceof C6739m)) {
                            arrayList.add(next2);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C6739m mVar = (C6739m) it3.next();
                        C6734k kVar = (C6734k) linkedHashMap.get(mVar.getName());
                        Field u1 = C5266a.m10039u1(mVar);
                        if (Modifier.isTransient(u1 != null ? u1.getModifiers() : 0)) {
                            if (kVar != null && !kVar.mo23063s()) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(("No default value for transient constructor " + kVar).toString());
                            }
                        } else {
                            if (!((kVar == null || C6888i.m12434a(kVar.mo23055a(), mVar.getReturnType())) ? z : false)) {
                                C6734k kVar2 = kVar;
                                StringBuilder t3 = C0843a.m459t('\'');
                                t3.append(mVar.getName());
                                t3.append("' has a constructor parameter of type ");
                                C6888i.m12436c(kVar2);
                                t3.append(kVar2.mo23055a());
                                t3.append(" but a property of type ");
                                t3.append(mVar.getReturnType());
                                t3.append('.');
                                throw new IllegalArgumentException(t3.toString().toString());
                            } else if ((mVar instanceof C6732j) || kVar != null) {
                                C5266a.m9886T3(mVar, z);
                                List<T> b0 = C6790h.m12343b0(mVar.getAnnotations());
                                Iterator<T> it4 = mVar.getAnnotations().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    T next3 = it4.next();
                                    if (((Annotation) next3) instanceof C5074k) {
                                        t2 = next3;
                                        break;
                                    }
                                }
                                C5074k kVar3 = (C5074k) t2;
                                if (kVar != null) {
                                    C6790h.m12342b(b0, kVar.getAnnotations());
                                    if (kVar3 == null) {
                                        Iterator<T> it5 = kVar.getAnnotations().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it5.next();
                                            if (((Annotation) t) instanceof C5074k) {
                                                break;
                                            }
                                        }
                                        kVar3 = (C5074k) t;
                                    }
                                }
                                if (kVar3 == null || (str = kVar3.name()) == null) {
                                    str = mVar.getName();
                                }
                                String str3 = str;
                                Type h = C5117b.m9421h(type2, j, C5266a.m10063y1(mVar.getReturnType()));
                                it = it3;
                                Object[] array = ((ArrayList) b0).toArray(new Annotation[0]);
                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                C5075l<T> d = xVar2.mo16932d(h, C5117b.m9419f((Annotation[]) array), mVar.getName());
                                String name = mVar.getName();
                                if (kVar3 == null || (str2 = kVar3.name()) == null) {
                                    str2 = str3;
                                }
                                C6888i.m12437d(d, "adapter");
                                linkedHashMap2.put(name, new C5057a.C5058a(str3, str2, d, mVar, kVar, kVar != null ? kVar.mo23056d() : -1));
                                z = true;
                                t2 = null;
                                it3 = it;
                            }
                        }
                        it = it3;
                        z = true;
                        t2 = null;
                        it3 = it;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (C6734k next4 : hVar2.getParameters()) {
                        String name2 = next4.getName();
                        if (!(linkedHashMap2 instanceof C6875a) || (linkedHashMap2 instanceof C6877c)) {
                            C5057a.C5058a aVar2 = (C5057a.C5058a) linkedHashMap2.remove(name2);
                            if (aVar2 != null || next4.mo23063s()) {
                                arrayList2.add(aVar2);
                            } else {
                                throw new IllegalArgumentException(("No property for required constructor " + next4).toString());
                            }
                        } else {
                            C6905z.m12474c(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                    }
                    int size = arrayList2.size();
                    int i = size;
                    for (Map.Entry value : linkedHashMap2.entrySet()) {
                        C5057a.C5058a aVar3 = (C5057a.C5058a) value.getValue();
                        String str4 = aVar3.f9769a;
                        String str5 = aVar3.f9770b;
                        C5075l<P> lVar3 = aVar3.f9771c;
                        C6739m<K, P> mVar2 = aVar3.f9772d;
                        C6734k kVar4 = aVar3.f9773e;
                        C6888i.m12438e(str4, "name");
                        C6888i.m12438e(lVar3, "adapter");
                        C6888i.m12438e(mVar2, "property");
                        arrayList2.add(new C5057a.C5058a(str4, str5, lVar3, mVar2, kVar4, i));
                        i++;
                    }
                    C6888i.m12438e(arrayList2, "$this$filterNotNull");
                    ArrayList arrayList3 = new ArrayList();
                    C6888i.m12438e(arrayList2, "$this$filterNotNullTo");
                    C6888i.m12438e(arrayList3, "destination");
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Object next5 = it6.next();
                        if (next5 != null) {
                            arrayList3.add(next5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(C5266a.m9892V(arrayList3, 10));
                    Iterator it7 = arrayList3.iterator();
                    while (it7.hasNext()) {
                        arrayList4.add(((C5057a.C5058a) it7.next()).f9769a);
                    }
                    Object[] array2 = arrayList4.toArray(new String[0]);
                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                    String[] strArr = (String[]) array2;
                    C5081q.C5082a a = C5081q.C5082a.m9296a((String[]) Arrays.copyOf(strArr, strArr.length));
                    C6888i.m12437d(a, "options");
                    return new C5057a(hVar2, arrayList2, arrayList3, a).mo16831c();
                } else {
                    StringBuilder u3 = C0843a.m460u("Cannot reflectively serialize sealed class ");
                    u3.append(j.getName());
                    u3.append(". Please register an adapter.");
                    throw new IllegalArgumentException(u3.toString().toString());
                }
            } else {
                StringBuilder u4 = C0843a.m460u("Cannot serialize inner class ");
                u4.append(j.getName());
                throw new IllegalArgumentException(u4.toString().toString());
            }
        } else {
            StringBuilder u5 = C0843a.m460u("Cannot serialize local class or object expression ");
            u5.append(j.getName());
            throw new IllegalArgumentException(u5.toString().toString());
        }
    }
}
