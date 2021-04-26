package p298d.p344x.p346c;

import p298d.p299a.C6726e;
import p298d.p299a.C6728g;
import p298d.p299a.C6729h;
import p298d.p299a.C6732j;
import p298d.p299a.C6739m;

/* renamed from: d.x.c.x */
public class C6903x {
    /* renamed from: a */
    public C6729h mo23041a(C6886g gVar) {
        return gVar;
    }

    /* renamed from: b */
    public C6726e mo23042b(Class cls) {
        return new C6882d(cls);
    }

    /* renamed from: c */
    public C6728g mo23043c(Class cls, String str) {
        return new C6894o(cls, str);
    }

    /* renamed from: d */
    public C6732j mo23044d(C6891l lVar) {
        return lVar;
    }

    /* renamed from: e */
    public C6739m mo23045e(C6895p pVar) {
        return pVar;
    }

    /* renamed from: f */
    public String mo23046f(C6885f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: g */
    public String mo23047g(C6890k kVar) {
        return mo23046f(kVar);
    }
}
