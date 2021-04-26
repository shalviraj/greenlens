package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.b.f1.d */
public class C6056d implements C6055c {

    /* renamed from: a */
    public final C7452c0 f11900a;

    /* renamed from: b */
    public final Map<C6717d, C7227g<?>> f11901b;

    /* renamed from: c */
    public final C6234r0 f11902c;

    public C6056d(C7452c0 c0Var, Map<C6717d, C7227g<?>> map, C6234r0 r0Var) {
        if (c0Var == null) {
            m10897d(0);
            throw null;
        } else if (map == null) {
            m10897d(1);
            throw null;
        } else if (r0Var != null) {
            this.f11900a = c0Var;
            this.f11901b = map;
            this.f11902c = r0Var;
        } else {
            m10897d(2);
            throw null;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m10897d(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C7452c0 mo23162a() {
        C7452c0 c0Var = this.f11900a;
        if (c0Var != null) {
            return c0Var;
        }
        m10897d(3);
        throw null;
    }

    /* renamed from: b */
    public Map<C6717d, C7227g<?>> mo23163b() {
        Map<C6717d, C7227g<?>> map = this.f11901b;
        if (map != null) {
            return map;
        }
        m10897d(4);
        throw null;
    }

    public C6714b getFqName() {
        return C5266a.m10021r1(this);
    }

    public C6234r0 getSource() {
        C6234r0 r0Var = this.f11902c;
        if (r0Var != null) {
            return r0Var;
        }
        m10897d(5);
        throw null;
    }

    public String toString() {
        return C7150c.f14297a.mo24788r(this, (C6057e) null);
    }
}
