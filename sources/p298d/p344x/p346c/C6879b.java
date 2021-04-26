package p298d.p344x.p346c;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p298d.p299a.C6725d;
import p298d.p299a.C6728g;
import p298d.p299a.C6734k;
import p298d.p299a.C6741n;

/* renamed from: d.x.c.b */
public abstract class C6879b implements C6725d, Serializable {

    /* renamed from: m */
    public static final /* synthetic */ int f13780m = 0;

    /* renamed from: g */
    public transient C6725d f13781g;

    /* renamed from: h */
    public final Object f13782h;

    /* renamed from: i */
    public final Class f13783i;

    /* renamed from: j */
    public final String f13784j;

    /* renamed from: k */
    public final String f13785k;

    /* renamed from: l */
    public final boolean f13786l;

    /* renamed from: d.x.c.b$a */
    public static class C6880a implements Serializable {

        /* renamed from: g */
        public static final C6880a f13787g = new C6880a();
    }

    public C6879b() {
        this.f13782h = C6880a.f13787g;
        this.f13783i = null;
        this.f13784j = null;
        this.f13785k = null;
        this.f13786l = false;
    }

    public C6879b(Object obj, Class cls, String str, String str2, boolean z) {
        this.f13782h = obj;
        this.f13783i = cls;
        this.f13784j = str;
        this.f13785k = str2;
        this.f13786l = z;
    }

    public List<Annotation> getAnnotations() {
        return mo24189x().getAnnotations();
    }

    public String getName() {
        return this.f13784j;
    }

    public List<C6734k> getParameters() {
        return mo24189x().getParameters();
    }

    public C6741n getReturnType() {
        return mo24189x().getReturnType();
    }

    /* renamed from: j */
    public C6725d mo24187j() {
        C6725d dVar = this.f13781g;
        if (dVar != null) {
            return dVar;
        }
        C6725d v = mo24188v();
        this.f13781g = v;
        return v;
    }

    /* renamed from: k */
    public Object mo23009k(Object... objArr) {
        return mo24189x().mo23009k(objArr);
    }

    /* renamed from: l */
    public Object mo23010l(Map map) {
        return mo24189x().mo23010l(map);
    }

    /* renamed from: v */
    public abstract C6725d mo24188v();

    /* renamed from: w */
    public C6728g mo22957w() {
        Class cls = this.f13783i;
        if (cls == null) {
            return null;
        }
        if (this.f13786l) {
            return C6902w.f13802a.mo23043c(cls, "");
        }
        return C6902w.m12460a(cls);
    }

    /* renamed from: x */
    public abstract C6725d mo24189x();

    /* renamed from: y */
    public String mo22958y() {
        return this.f13785k;
    }
}
