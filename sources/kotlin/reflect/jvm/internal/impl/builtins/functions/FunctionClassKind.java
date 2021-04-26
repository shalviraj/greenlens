package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

public enum FunctionClassKind {
    Function(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function"),
    SuspendFunction(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE, "SuspendFunction"),
    KFunction(r4, "KFunction"),
    KSuspendFunction(r4, "KSuspendFunction");
    
    public static final Companion Companion = null;
    private final String classNamePrefix;
    private final C6714b packageFqName;

    public static final class Companion {

        public static final class KindWithArity {
            private final int arity;
            private final FunctionClassKind kind;

            public KindWithArity(FunctionClassKind functionClassKind, int i) {
                C6888i.m12438e(functionClassKind, "kind");
                this.kind = functionClassKind;
                this.arity = i;
            }

            public final FunctionClassKind component1() {
                return this.kind;
            }

            public final int component2() {
                return this.arity;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KindWithArity)) {
                    return false;
                }
                KindWithArity kindWithArity = (KindWithArity) obj;
                return this.kind == kindWithArity.kind && this.arity == kindWithArity.arity;
            }

            public final FunctionClassKind getKind() {
                return this.kind;
            }

            public int hashCode() {
                return (this.kind.hashCode() * 31) + this.arity;
            }

            public String toString() {
                StringBuilder u = C0843a.m460u("KindWithArity(kind=");
                u.append(this.kind);
                u.append(", arity=");
                u.append(this.arity);
                u.append(')');
                return u.toString();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Integer toInt(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                i++;
                int i3 = charAt - '0';
                if (!(i3 >= 0 && i3 <= 9)) {
                    return null;
                }
                i2 = (i2 * 10) + i3;
            }
            return Integer.valueOf(i2);
        }

        public final FunctionClassKind byClassNamePrefix(C6714b bVar, String str) {
            C6888i.m12438e(bVar, "packageFqName");
            C6888i.m12438e(str, "className");
            FunctionClassKind[] values = FunctionClassKind.values();
            for (int i = 0; i < 4; i++) {
                FunctionClassKind functionClassKind = values[i];
                if (C6888i.m12434a(functionClassKind.getPackageFqName(), bVar) && C7694h.m13910A(str, functionClassKind.getClassNamePrefix(), false, 2)) {
                    return functionClassKind;
                }
            }
            return null;
        }

        public final FunctionClassKind getFunctionalClassKind(String str, C6714b bVar) {
            C6888i.m12438e(str, "className");
            C6888i.m12438e(bVar, "packageFqName");
            KindWithArity parseClassName = parseClassName(str, bVar);
            if (parseClassName == null) {
                return null;
            }
            return parseClassName.getKind();
        }

        public final KindWithArity parseClassName(String str, C6714b bVar) {
            C6888i.m12438e(str, "className");
            C6888i.m12438e(bVar, "packageFqName");
            FunctionClassKind byClassNamePrefix = byClassNamePrefix(bVar, str);
            if (byClassNamePrefix == null) {
                return null;
            }
            String substring = str.substring(byClassNamePrefix.getClassNamePrefix().length());
            C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
            Integer num = toInt(substring);
            if (num == null) {
                return null;
            }
            return new KindWithArity(byClassNamePrefix, num.intValue());
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    private FunctionClassKind(C6714b bVar, String str) {
        this.packageFqName = bVar;
        this.classNamePrefix = str;
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final C6714b getPackageFqName() {
        return this.packageFqName;
    }

    public final C6717d numberedClassName(int i) {
        C6717d l = C6717d.m12270l(C6888i.m12444k(this.classNamePrefix, Integer.valueOf(i)));
        C6888i.m12437d(l, "identifier(\"$classNamePrefix$arity\")");
        return l;
    }
}
