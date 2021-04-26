package p298d.p299a.p300a.p301a.p303y0.p411m;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.m.i */
public abstract class C7599i implements C7589b {

    /* renamed from: a */
    public final String f15051a;

    /* renamed from: d.a.a.a.y0.m.i$a */
    public static final class C7600a extends C7599i {

        /* renamed from: b */
        public static final C7600a f15052b = new C7600a();

        public C7600a() {
            super("must be a member function", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo25197b(C6244v vVar) {
            C6888i.m12438e(vVar, "functionDescriptor");
            return vVar.getDispatchReceiverParameter() != null;
        }
    }

    /* renamed from: d.a.a.a.y0.m.i$b */
    public static final class C7601b extends C7599i {

        /* renamed from: b */
        public static final C7601b f15053b = new C7601b();

        public C7601b() {
            super("must be a member or an extension function", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo25197b(C6244v vVar) {
            C6888i.m12438e(vVar, "functionDescriptor");
            return (vVar.getDispatchReceiverParameter() == null && vVar.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    public C7599i(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f15051a = str;
    }

    /* renamed from: a */
    public String mo25196a(C6244v vVar) {
        return C5266a.m9992m2(this, vVar);
    }

    public String getDescription() {
        return this.f15051a;
    }
}
