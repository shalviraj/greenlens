package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6111i0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7271e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

public final class CloneableClassScope extends C7271e {
    /* access modifiers changed from: private */
    public static final C6717d CLONE_NAME;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6717d getCLONE_NAME() {
            return CloneableClassScope.CLONE_NAME;
        }
    }

    static {
        C6717d l = C6717d.m12270l("clone");
        C6888i.m12437d(l, "identifier(\"clone\")");
        CLONE_NAME = l;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(C7441m mVar, C6046e eVar) {
        super(mVar, eVar);
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(eVar, "containingClass");
    }

    public List<C6244v> computeDeclaredFunctions() {
        C6046e containingClass = getContainingClass();
        Objects.requireNonNull(C6060h.f11920d);
        C6111i0 create = C6111i0.create(containingClass, C6060h.C6061a.f11922b, Companion.getCLONE_NAME(), C6023b.C6024a.DECLARATION, C6234r0.f12257a);
        C6213n0 thisAsReceiverParameter = getContainingClass().getThisAsReceiverParameter();
        C6798p pVar = C6798p.f13713g;
        create.initialize((C6213n0) null, thisAsReceiverParameter, (List<? extends C6248w0>) pVar, (List<C6030b1>) pVar, (C7452c0) C7255a.m13133f(getContainingClass()).getAnyType(), C6251y.OPEN, C6219q.f12243c);
        return C5266a.m9910Y2(create);
    }
}
