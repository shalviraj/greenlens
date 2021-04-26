package p298d.p299a;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7679s;
import p298d.p415c0.C7694h;

/* renamed from: d.a.u */
public final class C6750u {
    /* renamed from: a */
    public static final String m12298a(Type type) {
        String str;
        Object next;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            C7668h W0 = C5266a.m9898W0(type, C6749t.f13653p);
            StringBuilder sb = new StringBuilder();
            C6888i.m12438e(W0, "$this$last");
            Iterator it = W0.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                sb.append(((Class) next).getName());
                sb.append(C7694h.m13942t("[]", C7679s.m13893a(W0)));
                str = sb.toString();
            } else {
                throw new NoSuchElementException("Sequence is empty.");
            }
        } else {
            str = cls.getName();
        }
        C6888i.m12437d(str, "if (type.isArray) {\n    …\n        } else type.name");
        return str;
    }

    /* renamed from: b */
    public static final Type m12299b(C6741n nVar, boolean z) {
        C6727f h = nVar.mo23016h();
        if (h instanceof C6742o) {
            return new C6748s((C6742o) h);
        }
        if (h instanceof C6726e) {
            C6726e eVar = (C6726e) h;
            Class w1 = z ? C5266a.m10051w1(eVar) : C5266a.m10033t1(eVar);
            List<C6743p> g = nVar.mo23015g();
            if (g.isEmpty()) {
                return w1;
            }
            if (!w1.isArray()) {
                return m12301d(w1, g);
            }
            Class<?> componentType = w1.getComponentType();
            C6888i.m12437d(componentType, "jClass.componentType");
            if (componentType.isPrimitive()) {
                return w1;
            }
            C6743p pVar = (C6743p) C6790h.m12331R(g);
            if (pVar != null) {
                C6745q qVar = pVar.f13642a;
                C6741n nVar2 = pVar.f13643b;
                if (qVar == null) {
                    return w1;
                }
                int ordinal = qVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return w1;
                    }
                    if (ordinal != 2) {
                        throw new C6766h();
                    }
                }
                C6888i.m12436c(nVar2);
                Type c = m12300c(nVar2, false, 1);
                return c instanceof Class ? w1 : new C6723b(c);
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + nVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + nVar);
    }

    /* renamed from: c */
    public static /* synthetic */ Type m12300c(C6741n nVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m12299b(nVar, z);
    }

    /* renamed from: d */
    public static final Type m12301d(Class<?> cls, List<C6743p> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
            for (C6743p e : list) {
                arrayList.add(m12302e(e));
            }
            return new C6746r(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C5266a.m9892V(list, 10));
            for (C6743p e2 : list) {
                arrayList2.add(m12302e(e2));
            }
            return new C6746r(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type d = m12301d(declaringClass, list.subList(length, list.size()));
            List<C6743p> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(C5266a.m9892V(subList, 10));
            for (C6743p e3 : subList) {
                arrayList3.add(m12302e(e3));
            }
            return new C6746r(cls, d, arrayList3);
        }
    }

    /* renamed from: e */
    public static final Type m12302e(C6743p pVar) {
        C6745q qVar = pVar.f13642a;
        if (qVar == null) {
            return C6751v.f13654i;
        }
        C6741n nVar = pVar.f13643b;
        C6888i.m12436c(nVar);
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            return m12299b(nVar, true);
        }
        if (ordinal == 1) {
            return new C6751v((Type) null, m12299b(nVar, true));
        }
        if (ordinal == 2) {
            return new C6751v(m12299b(nVar, true), (Type) null);
        }
        throw new C6766h();
    }
}
