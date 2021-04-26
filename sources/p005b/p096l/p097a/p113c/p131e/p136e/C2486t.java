package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.t */
public final class C2486t implements C2047b0 {

    /* renamed from: a */
    public final C2047b0[] f4299a;

    public C2486t(C2047b0... b0VarArr) {
        this.f4299a = b0VarArr;
    }

    /* renamed from: a */
    public final boolean mo12415a(Class<?> cls) {
        C2047b0[] b0VarArr = this.f4299a;
        for (int i = 0; i < 2; i++) {
            if (b0VarArr[i].mo12415a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C2022a0 mo12416b(Class<?> cls) {
        C2047b0[] b0VarArr = this.f4299a;
        for (int i = 0; i < 2; i++) {
            C2047b0 b0Var = b0VarArr[i];
            if (b0Var.mo12415a(cls)) {
                return b0Var.mo12416b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
