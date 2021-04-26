package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.z.d */
public final class C7268d {

    /* renamed from: c */
    public static final C7269a f14488c = new C7269a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static int f14489d = 1;

    /* renamed from: e */
    public static final int f14490e;

    /* renamed from: f */
    public static final int f14491f;

    /* renamed from: g */
    public static final int f14492g;

    /* renamed from: h */
    public static final int f14493h;

    /* renamed from: i */
    public static final int f14494i;

    /* renamed from: j */
    public static final int f14495j;

    /* renamed from: k */
    public static final int f14496k;

    /* renamed from: l */
    public static final int f14497l;

    /* renamed from: m */
    public static final int f14498m;

    /* renamed from: n */
    public static final int f14499n;

    /* renamed from: o */
    public static final C7268d f14500o;

    /* renamed from: p */
    public static final C7268d f14501p;

    /* renamed from: q */
    public static final C7268d f14502q;

    /* renamed from: r */
    public static final C7268d f14503r;

    /* renamed from: s */
    public static final C7268d f14504s;

    /* renamed from: t */
    public static final List<C7269a.C7270a> f14505t;

    /* renamed from: u */
    public static final List<C7269a.C7270a> f14506u;

    /* renamed from: a */
    public final List<C7265c> f14507a;

    /* renamed from: b */
    public final int f14508b;

    /* renamed from: d.a.a.a.y0.i.z.d$a */
    public static final class C7269a {

        /* renamed from: d.a.a.a.y0.i.z.d$a$a */
        public static final class C7270a {

            /* renamed from: a */
            public final int f14509a;

            /* renamed from: b */
            public final String f14510b;

            public C7270a(int i, String str) {
                C6888i.m12438e(str, "name");
                this.f14509a = i;
                this.f14510b = str;
            }
        }

        public C7269a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C7269a.C7270a aVar;
        C7269a.C7270a aVar2;
        Class<C7268d> cls = C7268d.class;
        int i = f14489d;
        int i2 = i << 1;
        f14489d = i2;
        f14490e = i;
        int i3 = i2 << 1;
        f14489d = i3;
        f14491f = i2;
        int i4 = i3 << 1;
        f14489d = i4;
        f14492g = i3;
        int i5 = i4 << 1;
        f14489d = i5;
        f14493h = i4;
        int i6 = i5 << 1;
        f14489d = i6;
        f14494i = i5;
        int i7 = i6 << 1;
        f14489d = i7;
        f14495j = i6;
        f14489d = i7 << 1;
        int i8 = i7 - 1;
        f14496k = i8;
        int i9 = i | i2 | i3;
        f14497l = i9;
        int i10 = i2 | i5 | i6;
        f14498m = i10;
        int i11 = i5 | i6;
        f14499n = i11;
        f14500o = new C7268d(i8, (List) null, 2);
        f14501p = new C7268d(i11, (List) null, 2);
        new C7268d(i, (List) null, 2);
        new C7268d(i2, (List) null, 2);
        new C7268d(i3, (List) null, 2);
        f14502q = new C7268d(i9, (List) null, 2);
        new C7268d(i4, (List) null, 2);
        f14503r = new C7268d(i5, (List) null, 2);
        f14504s = new C7268d(i6, (List) null, 2);
        new C7268d(i10, (List) null, 2);
        Field[] fields = cls.getFields();
        C6888i.m12437d(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field2 = (Field) it.next();
            Object obj = field2.get((Object) null);
            C7268d dVar = obj instanceof C7268d ? (C7268d) obj : null;
            if (dVar != null) {
                int i12 = dVar.f14508b;
                String name = field2.getName();
                C6888i.m12437d(name, "field.name");
                aVar2 = new C7269a.C7270a(i12, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f14505t = arrayList2;
        Field[] fields2 = cls.getFields();
        C6888i.m12437d(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (C6888i.m12434a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get((Object) null);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                C6888i.m12437d(name2, "field.name");
                aVar = new C7269a.C7270a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f14506u = arrayList5;
    }

    public C7268d(int i, List<? extends C7265c> list) {
        C6888i.m12438e(list, "excludes");
        this.f14507a = list;
        for (C7265c a : list) {
            i &= ~a.mo24914a();
        }
        this.f14508b = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7268d(int i, List list, int i2) {
        this(i, (i2 & 2) != 0 ? C6798p.f13713g : null);
    }

    /* renamed from: a */
    public final boolean mo24916a(int i) {
        return (i & this.f14508b) != 0;
    }

    public String toString() {
        T t;
        String str;
        boolean z;
        Iterator<T> it = f14505t.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C7269a.C7270a) t).f14509a == this.f14508b) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C7269a.C7270a aVar = (C7269a.C7270a) t;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.f14510b;
        }
        if (str == null) {
            List<C7269a.C7270a> list = f14506u;
            ArrayList arrayList = new ArrayList();
            for (C7269a.C7270a aVar2 : list) {
                String str2 = mo24916a(aVar2.f14509a) ? aVar2.f14510b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = C6790h.m12369w(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6862l) null, 62);
        }
        StringBuilder z2 = C0843a.m465z("DescriptorKindFilter(", str, ", ");
        z2.append(this.f14507a);
        z2.append(')');
        return z2.toString();
    }
}
