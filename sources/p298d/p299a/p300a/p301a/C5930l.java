package p298d.p299a.p300a.p301a;

import java.lang.reflect.Type;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.C5858a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.l */
public final class C5930l extends C6890k implements C6851a<Type> {

    /* renamed from: g */
    public final /* synthetic */ C7452c0 f11741g;

    /* renamed from: h */
    public final /* synthetic */ C5858a.C5859a.C5869j f11742h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5930l(C7452c0 c0Var, C5858a.C5859a.C5869j jVar) {
        super(0);
        this.f11741g = c0Var;
        this.f11742h = jVar;
    }

    public Object invoke() {
        String str;
        Type type;
        C6083h declarationDescriptor = this.f11741g.mo24887V().getDeclarationDescriptor();
        if (declarationDescriptor instanceof C6046e) {
            Class<?> j = C5970v0.m10815j((C6046e) declarationDescriptor);
            if (j != null) {
                if (C6888i.m12434a(C5858a.this.f11614j.getSuperclass(), j)) {
                    type = C5858a.this.f11614j.getGenericSuperclass();
                    str = "jClass.genericSuperclass";
                } else {
                    Class[] interfaces = C5858a.this.f11614j.getInterfaces();
                    C6888i.m12437d(interfaces, "jClass.interfaces");
                    int j2 = C5266a.m9974j2(interfaces, j);
                    if (j2 >= 0) {
                        type = C5858a.this.f11614j.getGenericInterfaces()[j2];
                        str = "jClass.genericInterfaces[index]";
                    } else {
                        StringBuilder u = C0843a.m460u("No superclass of ");
                        u.append(this.f11742h.f11640g);
                        u.append(" in Java reflection for ");
                        u.append(declarationDescriptor);
                        throw new C5931l0(u.toString());
                    }
                }
                C6888i.m12437d(type, str);
                return type;
            }
            StringBuilder u2 = C0843a.m460u("Unsupported superclass of ");
            u2.append(this.f11742h.f11640g);
            u2.append(": ");
            u2.append(declarationDescriptor);
            throw new C5931l0(u2.toString());
        }
        throw new C5931l0("Supertype not a class: " + declarationDescriptor);
    }
}
