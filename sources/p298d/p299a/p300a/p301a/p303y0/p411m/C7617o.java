package p298d.p299a.p300a.p301a.p303y0.p411m;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.m.o */
public abstract class C7617o implements C7589b {

    /* renamed from: a */
    public final String f15104a;

    /* renamed from: d.a.a.a.y0.m.o$a */
    public static final class C7618a extends C7617o {

        /* renamed from: b */
        public final int f15105b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C7618a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "must have at least "
                java.lang.String r1 = " value parameter"
                java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m461v(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto L_0x000e
                java.lang.String r1 = "s"
                goto L_0x0010
            L_0x000e:
                java.lang.String r1 = ""
            L_0x0010:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f15105b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p411m.C7617o.C7618a.<init>(int):void");
        }

        /* renamed from: b */
        public boolean mo25197b(C6244v vVar) {
            C6888i.m12438e(vVar, "functionDescriptor");
            return vVar.getValueParameters().size() >= this.f15105b;
        }
    }

    /* renamed from: d.a.a.a.y0.m.o$b */
    public static final class C7619b extends C7617o {

        /* renamed from: b */
        public final int f15106b;

        public C7619b(int i) {
            super(C0843a.m445f("must have exactly ", i, " value parameters"), (DefaultConstructorMarker) null);
            this.f15106b = i;
        }

        /* renamed from: b */
        public boolean mo25197b(C6244v vVar) {
            C6888i.m12438e(vVar, "functionDescriptor");
            return vVar.getValueParameters().size() == this.f15106b;
        }
    }

    /* renamed from: d.a.a.a.y0.m.o$c */
    public static final class C7620c extends C7617o {

        /* renamed from: b */
        public static final C7620c f15107b = new C7620c();

        public C7620c() {
            super("must have no value parameters", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo25197b(C6244v vVar) {
            C6888i.m12438e(vVar, "functionDescriptor");
            return vVar.getValueParameters().isEmpty();
        }
    }

    /* renamed from: d.a.a.a.y0.m.o$d */
    public static final class C7621d extends C7617o {

        /* renamed from: b */
        public static final C7621d f15108b = new C7621d();

        public C7621d() {
            super("must have a single value parameter", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo25197b(C6244v vVar) {
            C6888i.m12438e(vVar, "functionDescriptor");
            return vVar.getValueParameters().size() == 1;
        }
    }

    public C7617o(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f15104a = str;
    }

    /* renamed from: a */
    public String mo25196a(C6244v vVar) {
        return C5266a.m9992m2(this, vVar);
    }

    public String getDescription() {
        return this.f15104a;
    }
}
