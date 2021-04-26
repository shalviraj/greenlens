package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;

public class JvmClassName {
    private C6714b fqName;
    private final String internalName;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    private JvmClassName(String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        this.internalName = str;
    }

    public static JvmClassName byClassId(C6713a aVar) {
        if (aVar == null) {
            $$$reportNull$$$0(1);
        }
        C6714b h = aVar.mo23856h();
        String replace = aVar.mo23858i().mo23862b().replace('.', '$');
        if (h.mo23864d()) {
            return new JvmClassName(replace);
        }
        return new JvmClassName(h.mo23862b().replace('.', '/') + "/" + replace);
    }

    public static JvmClassName byFqNameWithoutInnerClasses(C6714b bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(2);
        }
        JvmClassName jvmClassName = new JvmClassName(bVar.mo23862b().replace('.', '/'));
        jvmClassName.fqName = bVar;
        return jvmClassName;
    }

    public static JvmClassName byInternalName(String str) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        return new JvmClassName(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.internalName.equals(((JvmClassName) obj).internalName);
    }

    public C6714b getFqNameForTopLevelClassMaybeWithDollars() {
        return new C6714b(this.internalName.replace('/', '.'));
    }

    public String getInternalName() {
        String str = this.internalName;
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        return str;
    }

    public C6714b getPackageFqName() {
        int lastIndexOf = this.internalName.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new C6714b(this.internalName.substring(0, lastIndexOf).replace('/', '.'));
        }
        C6714b bVar = C6714b.f13613c;
        if (bVar == null) {
            $$$reportNull$$$0(7);
        }
        return bVar;
    }

    public int hashCode() {
        return this.internalName.hashCode();
    }

    public String toString() {
        return this.internalName;
    }
}
