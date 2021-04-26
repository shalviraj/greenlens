package kotlin.reflect.jvm.internal.impl.builtins;

import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6074a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6076b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;

public interface BuiltInsLoader {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final C6764f<BuiltInsLoader> Instance$delegate = C5266a.m9885T2(C6765g.PUBLICATION, BuiltInsLoader$Companion$Instance$2.INSTANCE);

        private Companion() {
        }

        public final BuiltInsLoader getInstance() {
            return Instance$delegate.getValue();
        }
    }

    C6035d0 createPackageFragmentProvider(C7441m mVar, C6021a0 a0Var, Iterable<? extends C6076b> iterable, C6077c cVar, C6074a aVar, boolean z);
}
