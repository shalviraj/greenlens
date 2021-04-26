package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.h6 */
public final class C2809h6 implements C2900o6 {

    /* renamed from: a */
    public final C2900o6[] f4815a;

    public C2809h6(C2900o6... o6VarArr) {
        this.f4815a = o6VarArr;
    }

    /* renamed from: a */
    public final boolean mo13346a(Class<?> cls) {
        C2900o6[] o6VarArr = this.f4815a;
        for (int i = 0; i < 2; i++) {
            if (o6VarArr[i].mo13346a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C2887n6 mo13347b(Class<?> cls) {
        C2900o6[] o6VarArr = this.f4815a;
        for (int i = 0; i < 2; i++) {
            C2900o6 o6Var = o6VarArr[i];
            if (o6Var.mo13346a(cls)) {
                return o6Var.mo13347b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
