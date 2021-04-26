package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.renderscript.ScriptIntrinsicBLAS;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6073g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6209l0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6074a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6076b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6086a0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7435g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7584y0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

public abstract class KotlinBuiltIns {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final C6717d BUILTINS_MODULE_NAME = C6717d.m12272p("<built-ins module>");
    private final C7435g<C6717d, C6046e> builtInClassesByName;
    private final C7437i<Collection<C6073g0>> builtInPackagesImportedByDefault;
    /* access modifiers changed from: private */
    public C6086a0 builtInsModule;
    private final C7437i<Primitives> primitives;
    private final C7441m storageManager;

    public static class Primitives {
        public final Map<C7489j0, C7489j0> kotlinArrayTypeToPrimitiveKotlinType;
        public final Map<C7452c0, C7489j0> primitiveKotlinTypeToKotlinArrayType;
        public final Map<PrimitiveType, C7489j0> primitiveTypeToArrayKotlinType;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private Primitives(Map<PrimitiveType, C7489j0> map, Map<C7452c0, C7489j0> map2, Map<C7489j0, C7489j0> map3) {
            if (map == null) {
                $$$reportNull$$$0(0);
            }
            if (map2 == null) {
                $$$reportNull$$$0(1);
            }
            if (map3 == null) {
                $$$reportNull$$$0(2);
            }
            this.primitiveTypeToArrayKotlinType = map;
            this.primitiveKotlinTypeToKotlinArrayType = map2;
            this.kotlinArrayTypeToPrimitiveKotlinType = map3;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 71:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 8:
            case 9:
            case 75:
            case 76:
            case 88:
            case 95:
            case 102:
            case 106:
            case 107:
            case 144:
            case 145:
            case 147:
            case 155:
            case 156:
            case 157:
                objArr[0] = "descriptor";
                break;
            case 11:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 134:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 15:
            case 16:
            case 52:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 98:
            case 104:
            case 108:
            case 109:
            case 110:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case ScriptIntrinsicBLAS.NON_UNIT:
            case ScriptIntrinsicBLAS.UNIT:
            case 133:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case ScriptIntrinsicBLAS.LEFT:
            case ScriptIntrinsicBLAS.RIGHT:
            case 143:
            case 146:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 159:
                objArr[0] = "type";
                break;
            case 45:
                objArr[0] = "classSimpleName";
                break;
            case 66:
                objArr[0] = "arrayType";
                break;
            case 70:
                objArr[0] = "notNullArrayType";
                break;
            case 72:
                objArr[0] = "primitiveType";
                break;
            case 74:
                objArr[0] = "kotlinType";
                break;
            case 77:
            case 81:
                objArr[0] = "projectionType";
                break;
            case 78:
            case 82:
            case 84:
                objArr[0] = "argument";
                break;
            case 79:
                objArr[0] = "annotations";
                break;
            case 100:
                objArr[0] = "typeConstructor";
                break;
            case 111:
                objArr[0] = "classDescriptor";
                break;
            case 158:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 17:
                objArr[1] = "getSuspendFunction";
                break;
            case 18:
                objArr[1] = "getKFunction";
                break;
            case 19:
                objArr[1] = "getKSuspendFunction";
                break;
            case 20:
                objArr[1] = "getKClass";
                break;
            case 21:
                objArr[1] = "getKCallable";
                break;
            case 22:
                objArr[1] = "getKProperty";
                break;
            case 23:
                objArr[1] = "getKProperty0";
                break;
            case 24:
                objArr[1] = "getKProperty1";
                break;
            case 25:
                objArr[1] = "getKProperty2";
                break;
            case 26:
                objArr[1] = "getKMutableProperty0";
                break;
            case 27:
                objArr[1] = "getKMutableProperty1";
                break;
            case 28:
                objArr[1] = "getKMutableProperty2";
                break;
            case 29:
                objArr[1] = "getIterator";
                break;
            case 30:
                objArr[1] = "getIterable";
                break;
            case 31:
                objArr[1] = "getMutableIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterator";
                break;
            case 33:
                objArr[1] = "getCollection";
                break;
            case 34:
                objArr[1] = "getMutableCollection";
                break;
            case 35:
                objArr[1] = "getList";
                break;
            case 36:
                objArr[1] = "getMutableList";
                break;
            case 37:
                objArr[1] = "getSet";
                break;
            case 38:
                objArr[1] = "getMutableSet";
                break;
            case 39:
                objArr[1] = "getMap";
                break;
            case 40:
                objArr[1] = "getMutableMap";
                break;
            case 41:
                objArr[1] = "getMapEntry";
                break;
            case 42:
                objArr[1] = "getMutableMapEntry";
                break;
            case 43:
                objArr[1] = "getListIterator";
                break;
            case 44:
                objArr[1] = "getMutableListIterator";
                break;
            case 46:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 47:
                objArr[1] = "getNothingType";
                break;
            case 48:
                objArr[1] = "getNullableNothingType";
                break;
            case 49:
                objArr[1] = "getAnyType";
                break;
            case 50:
                objArr[1] = "getNullableAnyType";
                break;
            case 51:
                objArr[1] = "getDefaultBound";
                break;
            case 53:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 54:
                objArr[1] = "getNumberType";
                break;
            case 55:
                objArr[1] = "getByteType";
                break;
            case 56:
                objArr[1] = "getShortType";
                break;
            case 57:
                objArr[1] = "getIntType";
                break;
            case 58:
                objArr[1] = "getLongType";
                break;
            case 59:
                objArr[1] = "getFloatType";
                break;
            case 60:
                objArr[1] = "getDoubleType";
                break;
            case 61:
                objArr[1] = "getCharType";
                break;
            case 62:
                objArr[1] = "getBooleanType";
                break;
            case 63:
                objArr[1] = "getUnitType";
                break;
            case 64:
                objArr[1] = "getStringType";
                break;
            case 65:
                objArr[1] = "getIterableType";
                break;
            case 67:
            case 68:
            case 69:
                objArr[1] = "getArrayElementType";
                break;
            case 73:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 80:
            case 83:
                objArr[1] = "getArrayType";
                break;
            case 85:
                objArr[1] = "getEnumType";
                break;
            case 86:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 13:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 15:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 16:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 45:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 52:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 66:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
            case 71:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 72:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 75:
            case 92:
                objArr[2] = "getPrimitiveType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 77:
            case 78:
            case 79:
            case 81:
            case 82:
                objArr[2] = "getArrayType";
                break;
            case 84:
                objArr[2] = "getEnumType";
                break;
            case 87:
                objArr[2] = "isArray";
                break;
            case 88:
            case 89:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 90:
                objArr[2] = "isPrimitiveArray";
                break;
            case 91:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 93:
                objArr[2] = "isPrimitiveType";
                break;
            case 94:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveClass";
                break;
            case 96:
            case 97:
            case 98:
            case 99:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 100:
            case 101:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "classFqNameEquals";
                break;
            case 104:
            case 105:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 106:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 107:
            case 108:
                objArr[2] = "isAny";
                break;
            case 109:
            case 111:
                objArr[2] = "isBoolean";
                break;
            case 110:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 112:
                objArr[2] = "isNumber";
                break;
            case 113:
                objArr[2] = "isChar";
                break;
            case 114:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 115:
                objArr[2] = "isInt";
                break;
            case 116:
                objArr[2] = "isByte";
                break;
            case 117:
                objArr[2] = "isLong";
                break;
            case 118:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 119:
                objArr[2] = "isShort";
                break;
            case 120:
                objArr[2] = "isFloat";
                break;
            case 121:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 122:
                objArr[2] = "isDouble";
                break;
            case 123:
                objArr[2] = "isUByte";
                break;
            case 124:
                objArr[2] = "isUShort";
                break;
            case 125:
                objArr[2] = "isUInt";
                break;
            case 126:
                objArr[2] = "isULong";
                break;
            case 127:
                objArr[2] = "isUByteArray";
                break;
            case 128:
                objArr[2] = "isUShortArray";
                break;
            case 129:
                objArr[2] = "isUIntArray";
                break;
            case 130:
                objArr[2] = "isULongArray";
                break;
            case ScriptIntrinsicBLAS.NON_UNIT:
                objArr[2] = "isUnsignedArrayType";
                break;
            case ScriptIntrinsicBLAS.UNIT:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 133:
            case 134:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 135:
                objArr[2] = "isNothing";
                break;
            case 136:
                objArr[2] = "isNullableNothing";
                break;
            case 137:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 138:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 139:
                objArr[2] = "isNullableAny";
                break;
            case 140:
                objArr[2] = "isDefaultBound";
                break;
            case ScriptIntrinsicBLAS.LEFT:
                objArr[2] = "isUnit";
                break;
            case ScriptIntrinsicBLAS.RIGHT:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 143:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 144:
                objArr[2] = "isMemberOfAny";
                break;
            case 145:
            case 146:
                objArr[2] = "isEnum";
                break;
            case 147:
            case 148:
                objArr[2] = "isComparable";
                break;
            case 149:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 150:
                objArr[2] = "isListOrNullableList";
                break;
            case 151:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 152:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 153:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 154:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 155:
                objArr[2] = "isKClass";
                break;
            case 156:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 157:
                objArr[2] = "isCloneable";
                break;
            case 158:
                objArr[2] = "isDeprecated";
                break;
            case 159:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public KotlinBuiltIns(C7441m mVar) {
        if (mVar == null) {
            $$$reportNull$$$0(0);
        }
        this.storageManager = mVar;
        this.builtInPackagesImportedByDefault = mVar.mo25018a(new C6851a<Collection<C6073g0>>() {
            public Collection<C6073g0> invoke() {
                return Arrays.asList(new C6073g0[]{KotlinBuiltIns.this.builtInsModule.mo23088G(StandardNames.BUILT_INS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.builtInsModule.mo23088G(StandardNames.COLLECTIONS_PACKAGE_FQ_NAME), KotlinBuiltIns.this.builtInsModule.mo23088G(StandardNames.RANGES_PACKAGE_FQ_NAME), KotlinBuiltIns.this.builtInsModule.mo23088G(StandardNames.ANNOTATION_PACKAGE_FQ_NAME)});
            }
        });
        this.primitives = mVar.mo25018a(new C6851a<Primitives>() {
            public Primitives invoke() {
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                PrimitiveType[] values = PrimitiveType.values();
                for (int i = 0; i < 8; i++) {
                    PrimitiveType primitiveType = values[i];
                    C7489j0 access$100 = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getTypeName().mo23886e());
                    C7489j0 access$1002 = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getArrayTypeName().mo23886e());
                    enumMap.put(primitiveType, access$1002);
                    hashMap.put(access$100, access$1002);
                    hashMap2.put(access$1002, access$100);
                }
                return new Primitives(enumMap, hashMap, hashMap2);
            }
        });
        this.builtInClassesByName = mVar.mo25025h(new C6862l<C6717d, C6046e>() {
            public C6046e invoke(C6717d dVar) {
                C6083h contributedClassifier = KotlinBuiltIns.this.getBuiltInsPackageScope().getContributedClassifier(dVar, C6260d.FROM_BUILTINS);
                if (contributedClassifier == null) {
                    StringBuilder u = C0843a.m460u("Built-in class ");
                    u.append(StandardNames.BUILT_INS_PACKAGE_FQ_NAME.mo23863c(dVar));
                    u.append(" is not found");
                    throw new AssertionError(u.toString());
                } else if (contributedClassifier instanceof C6046e) {
                    return (C6046e) contributedClassifier;
                } else {
                    throw new AssertionError("Must be a class descriptor " + dVar + ", but was " + contributedClassifier);
                }
            }
        });
    }

    private static boolean classFqNameEquals(C6083h hVar, C6715c cVar) {
        if (hVar == null) {
            $$$reportNull$$$0(102);
        }
        if (cVar == null) {
            $$$reportNull$$$0(103);
        }
        return hVar.getName().equals(cVar.mo23881h()) && cVar.equals(C7193g.m13027g(hVar));
    }

    private C6046e getBuiltInClassByName(String str) {
        if (str == null) {
            $$$reportNull$$$0(13);
        }
        C6046e eVar = (C6046e) ((C7417e.C7431m) this.builtInClassesByName).invoke(C6717d.m12270l(str));
        if (eVar == null) {
            $$$reportNull$$$0(14);
        }
        return eVar;
    }

    /* access modifiers changed from: private */
    public C7489j0 getBuiltInTypeByClassName(String str) {
        if (str == null) {
            $$$reportNull$$$0(45);
        }
        C7489j0 defaultType = getBuiltInClassByName(str).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(46);
        }
        return defaultType;
    }

    private static C7452c0 getElementTypeForUnsignedArray(C7452c0 c0Var, C6021a0 a0Var) {
        C6713a g;
        C6713a unsignedClassIdByArrayClassId;
        C6046e N0;
        if (c0Var == null) {
            $$$reportNull$$$0(70);
        }
        if (a0Var == null) {
            $$$reportNull$$$0(71);
        }
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return null;
        }
        UnsignedTypes unsignedTypes = UnsignedTypes.INSTANCE;
        if (!unsignedTypes.isShortNameOfUnsignedArray(declarationDescriptor.getName()) || (g = C7255a.m13134g(declarationDescriptor)) == null || (unsignedClassIdByArrayClassId = unsignedTypes.getUnsignedClassIdByArrayClassId(g)) == null || (N0 = C5266a.m9849N0(a0Var, unsignedClassIdByArrayClassId)) == null) {
            return null;
        }
        return N0.getDefaultType();
    }

    public static PrimitiveType getPrimitiveArrayType(C6206k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(76);
        }
        if (StandardNames.FqNames.primitiveArrayTypeShortNames.contains(kVar.getName())) {
            return StandardNames.FqNames.arrayClassFqNameToPrimitiveType.get(C7193g.m13027g(kVar));
        }
        return null;
    }

    private C6046e getPrimitiveClassDescriptor(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(15);
        }
        return getBuiltInClassByName(primitiveType.getTypeName().mo23886e());
    }

    public static PrimitiveType getPrimitiveType(C6206k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(75);
        }
        if (StandardNames.FqNames.primitiveTypeShortNames.contains(kVar.getName())) {
            return StandardNames.FqNames.fqNameToPrimitiveType.get(C7193g.m13027g(kVar));
        }
        return null;
    }

    public static boolean isAny(C6046e eVar) {
        if (eVar == null) {
            $$$reportNull$$$0(107);
        }
        return classFqNameEquals(eVar, StandardNames.FqNames.any);
    }

    public static boolean isAnyOrNullableAny(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(138);
        }
        return isConstructedFromGivenClass(c0Var, StandardNames.FqNames.any);
    }

    public static boolean isArray(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(87);
        }
        return isConstructedFromGivenClass(c0Var, StandardNames.FqNames.array);
    }

    public static boolean isArrayOrPrimitiveArray(C6046e eVar) {
        if (eVar == null) {
            $$$reportNull$$$0(88);
        }
        return classFqNameEquals(eVar, StandardNames.FqNames.array) || getPrimitiveArrayType(eVar) != null;
    }

    public static boolean isBoolean(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(109);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames._boolean);
    }

    public static boolean isBuiltIn(C6206k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(8);
        }
        return C7193g.m13031k(kVar, BuiltInsPackageFragment.class, false) != null;
    }

    public static boolean isByte(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(116);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames._byte);
    }

    public static boolean isChar(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(113);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames._char);
    }

    private static boolean isConstructedFromGivenClass(C7452c0 c0Var, C6715c cVar) {
        if (c0Var == null) {
            $$$reportNull$$$0(96);
        }
        if (cVar == null) {
            $$$reportNull$$$0(97);
        }
        return isTypeConstructorForGivenClass(c0Var.mo24887V(), cVar);
    }

    private static boolean isConstructedFromGivenClassAndNotNullable(C7452c0 c0Var, C6715c cVar) {
        if (c0Var == null) {
            $$$reportNull$$$0(133);
        }
        if (cVar == null) {
            $$$reportNull$$$0(134);
        }
        return isConstructedFromGivenClass(c0Var, cVar) && !c0Var.mo23566W();
    }

    public static boolean isDefaultBound(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(140);
        }
        return isNullableAny(c0Var);
    }

    public static boolean isDeprecated(C6206k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(158);
        }
        if (kVar.getOriginal().getAnnotations().mo23169v(StandardNames.FqNames.deprecated)) {
            return true;
        }
        if (!(kVar instanceof C6207k0)) {
            return false;
        }
        C6207k0 k0Var = (C6207k0) kVar;
        boolean o = k0Var.mo23147o();
        C6209l0 b = k0Var.mo23216b();
        C6211m0 c = k0Var.mo23217c();
        if (b != null && isDeprecated(b)) {
            if (!o) {
                return true;
            }
            if (c != null && isDeprecated(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDouble(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(122);
        }
        return isDoubleOrNullableDouble(c0Var) && !c0Var.mo23566W();
    }

    public static boolean isDoubleOrNullableDouble(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(ScriptIntrinsicBLAS.UNIT);
        }
        return isConstructedFromGivenClass(c0Var, StandardNames.FqNames._double);
    }

    public static boolean isFloat(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(120);
        }
        return isFloatOrNullableFloat(c0Var) && !c0Var.mo23566W();
    }

    public static boolean isFloatOrNullableFloat(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(121);
        }
        return isConstructedFromGivenClass(c0Var, StandardNames.FqNames._float);
    }

    public static boolean isInt(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(115);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames._int);
    }

    public static boolean isKClass(C6046e eVar) {
        if (eVar == null) {
            $$$reportNull$$$0(155);
        }
        return classFqNameEquals(eVar, StandardNames.FqNames.kClass);
    }

    public static boolean isLong(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(117);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames._long);
    }

    private static boolean isNotNullConstructedFromGivenClass(C7452c0 c0Var, C6715c cVar) {
        if (c0Var == null) {
            $$$reportNull$$$0(104);
        }
        if (cVar == null) {
            $$$reportNull$$$0(105);
        }
        return !c0Var.mo23566W() && isConstructedFromGivenClass(c0Var, cVar);
    }

    public static boolean isNothing(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(135);
        }
        return isNothingOrNullableNothing(c0Var) && !C7460d1.m13441g(c0Var);
    }

    public static boolean isNothingOrNullableNothing(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(137);
        }
        return isConstructedFromGivenClass(c0Var, StandardNames.FqNames.nothing);
    }

    public static boolean isNullableAny(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(139);
        }
        return isAnyOrNullableAny(c0Var) && c0Var.mo23566W();
    }

    public static boolean isPrimitiveArray(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(90);
        }
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        return (declarationDescriptor == null || getPrimitiveArrayType(declarationDescriptor) == null) ? false : true;
    }

    public static boolean isPrimitiveClass(C6046e eVar) {
        if (eVar == null) {
            $$$reportNull$$$0(95);
        }
        return getPrimitiveType(eVar) != null;
    }

    public static boolean isPrimitiveType(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(93);
        }
        return !c0Var.mo23566W() && isPrimitiveTypeOrNullablePrimitiveType(c0Var);
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(94);
        }
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        return (declarationDescriptor instanceof C6046e) && isPrimitiveClass((C6046e) declarationDescriptor);
    }

    public static boolean isShort(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(119);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames._short);
    }

    public static boolean isSpecialClassWithNoSupertypes(C6046e eVar) {
        if (eVar == null) {
            $$$reportNull$$$0(106);
        }
        return classFqNameEquals(eVar, StandardNames.FqNames.any) || classFqNameEquals(eVar, StandardNames.FqNames.nothing);
    }

    public static boolean isString(C7452c0 c0Var) {
        return c0Var != null && isNotNullConstructedFromGivenClass(c0Var, StandardNames.FqNames.string);
    }

    public static boolean isTypeConstructorForGivenClass(C7567t0 t0Var, C6715c cVar) {
        if (t0Var == null) {
            $$$reportNull$$$0(100);
        }
        if (cVar == null) {
            $$$reportNull$$$0(101);
        }
        C6083h declarationDescriptor = t0Var.getDeclarationDescriptor();
        return (declarationDescriptor instanceof C6046e) && classFqNameEquals(declarationDescriptor, cVar);
    }

    public static boolean isUByteArray(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(127);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames.uByteArrayFqName.mo23872j());
    }

    public static boolean isUIntArray(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(129);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames.uIntArrayFqName.mo23872j());
    }

    public static boolean isULongArray(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(130);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames.uLongArrayFqName.mo23872j());
    }

    public static boolean isUShortArray(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(128);
        }
        return isConstructedFromGivenClassAndNotNullable(c0Var, StandardNames.FqNames.uShortArrayFqName.mo23872j());
    }

    public static boolean isUnderKotlinPackage(C6206k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(9);
        }
        while (kVar != null) {
            if (kVar instanceof C6032c0) {
                return ((C6032c0) kVar).getFqName().mo23871i(StandardNames.BUILT_INS_PACKAGE_NAME);
            }
            kVar = kVar.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isUnit(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(ScriptIntrinsicBLAS.LEFT);
        }
        return isNotNullConstructedFromGivenClass(c0Var, StandardNames.FqNames.unit);
    }

    public static boolean isUnsignedArrayType(C7452c0 c0Var) {
        if (c0Var == null) {
            $$$reportNull$$$0(ScriptIntrinsicBLAS.NON_UNIT);
        }
        return isUByteArray(c0Var) || isUShortArray(c0Var) || isUIntArray(c0Var) || isULongArray(c0Var);
    }

    public void createBuiltInsModule(boolean z) {
        C6717d dVar = BUILTINS_MODULE_NAME;
        C7441m mVar = this.storageManager;
        C6888i.m12438e(dVar, "moduleName");
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(this, "builtIns");
        C6086a0 a0Var = new C6086a0(dVar, mVar, this, (Map) null, (C6717d) null, 48);
        this.builtInsModule = a0Var;
        C6035d0 createPackageFragmentProvider = BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.storageManager, this.builtInsModule, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z);
        C6888i.m12438e(createPackageFragmentProvider, "providerForModuleContent");
        a0Var.f11993k = createPackageFragmentProvider;
        C6086a0 a0Var2 = this.builtInsModule;
        a0Var2.mo23192D(a0Var2);
    }

    public C6074a getAdditionalClassPartsProvider() {
        return C6074a.C6075a.f11983a;
    }

    public C6046e getAny() {
        return getBuiltInClassByName("Any");
    }

    public C7489j0 getAnyType() {
        C7489j0 defaultType = getAny().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(49);
        }
        return defaultType;
    }

    public C6046e getArray() {
        return getBuiltInClassByName("Array");
    }

    public C7452c0 getArrayElementType(C7452c0 c0Var) {
        C7452c0 elementTypeForUnsignedArray;
        if (c0Var == null) {
            $$$reportNull$$$0(66);
        }
        if (!isArray(c0Var)) {
            C7452c0 i = C7460d1.m13443i(c0Var);
            C7452c0 c0Var2 = ((Primitives) this.primitives.invoke()).kotlinArrayTypeToPrimitiveKotlinType.get(i);
            if (c0Var2 != null) {
                return c0Var2;
            }
            int i2 = C7193g.f14418a;
            C6021a0 a0Var = null;
            if (i != null) {
                C6083h declarationDescriptor = i.mo24887V().getDeclarationDescriptor();
                if (declarationDescriptor != null) {
                    a0Var = C7193g.m13025e(declarationDescriptor);
                }
                if (a0Var != null && (elementTypeForUnsignedArray = getElementTypeForUnsignedArray(i, a0Var)) != null) {
                    return elementTypeForUnsignedArray;
                }
                throw new IllegalStateException("not array: " + c0Var);
            }
            C7193g.m13021a(18);
            throw null;
        } else if (c0Var.mo24886U().size() == 1) {
            C7452c0 a = c0Var.mo24886U().get(0).mo25161a();
            if (a == null) {
                $$$reportNull$$$0(67);
            }
            return a;
        } else {
            throw new IllegalStateException();
        }
    }

    public C7489j0 getArrayType(C7484h1 h1Var, C7452c0 c0Var) {
        if (h1Var == null) {
            $$$reportNull$$$0(81);
        }
        if (c0Var == null) {
            $$$reportNull$$$0(82);
        }
        Objects.requireNonNull(C6060h.f11920d);
        C7489j0 arrayType = getArrayType(h1Var, c0Var, C6060h.C6061a.f11922b);
        if (arrayType == null) {
            $$$reportNull$$$0(83);
        }
        return arrayType;
    }

    public C7489j0 getArrayType(C7484h1 h1Var, C7452c0 c0Var, C6060h hVar) {
        if (h1Var == null) {
            $$$reportNull$$$0(77);
        }
        if (c0Var == null) {
            $$$reportNull$$$0(78);
        }
        if (hVar == null) {
            $$$reportNull$$$0(79);
        }
        return C7455d0.m13430e(hVar, getArray(), Collections.singletonList(new C7584y0(h1Var, c0Var)));
    }

    public C7489j0 getBooleanType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(62);
        }
        return primitiveKotlinType;
    }

    public C6046e getBuiltInClassByFqName(C6714b bVar) {
        if (bVar == null) {
            $$$reportNull$$$0(11);
        }
        C6046e H3 = C5266a.m9816H3(this.builtInsModule, bVar, C6260d.FROM_BUILTINS);
        if (H3 == null) {
            $$$reportNull$$$0(12);
        }
        return H3;
    }

    public C6086a0 getBuiltInsModule() {
        C6086a0 a0Var = this.builtInsModule;
        if (a0Var == null) {
            $$$reportNull$$$0(6);
        }
        return a0Var;
    }

    public C7277h getBuiltInsPackageScope() {
        C7277h memberScope = this.builtInsModule.mo23088G(StandardNames.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope == null) {
            $$$reportNull$$$0(10);
        }
        return memberScope;
    }

    public C7489j0 getByteType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BYTE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(55);
        }
        return primitiveKotlinType;
    }

    public C7489j0 getCharType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.CHAR);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(61);
        }
        return primitiveKotlinType;
    }

    public Iterable<C6076b> getClassDescriptorFactories() {
        List singletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.storageManager, this.builtInsModule));
        if (singletonList == null) {
            $$$reportNull$$$0(4);
        }
        return singletonList;
    }

    public C6046e getCollection() {
        C6046e builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.collection);
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(33);
        }
        return builtInClassByFqName;
    }

    public C6046e getComparable() {
        return getBuiltInClassByName("Comparable");
    }

    public C7489j0 getDefaultBound() {
        C7489j0 nullableAnyType = getNullableAnyType();
        if (nullableAnyType == null) {
            $$$reportNull$$$0(51);
        }
        return nullableAnyType;
    }

    public C7489j0 getDoubleType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(60);
        }
        return primitiveKotlinType;
    }

    public C7489j0 getFloatType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(59);
        }
        return primitiveKotlinType;
    }

    public C6046e getFunction(int i) {
        return getBuiltInClassByName(StandardNames.getFunctionName(i));
    }

    public C7489j0 getIntType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.INT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(57);
        }
        return primitiveKotlinType;
    }

    public C6046e getKClass() {
        C6046e builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.kClass.mo23883i());
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(20);
        }
        return builtInClassByFqName;
    }

    public C7489j0 getLongType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.LONG);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(58);
        }
        return primitiveKotlinType;
    }

    public C6046e getNothing() {
        return getBuiltInClassByName("Nothing");
    }

    public C7489j0 getNothingType() {
        C7489j0 defaultType = getNothing().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(47);
        }
        return defaultType;
    }

    public C7489j0 getNullableAnyType() {
        C7489j0 c0 = getAnyType().mo23545Z(true);
        if (c0 == null) {
            $$$reportNull$$$0(50);
        }
        return c0;
    }

    public C7489j0 getNullableNothingType() {
        C7489j0 c0 = getNothingType().mo23545Z(true);
        if (c0 == null) {
            $$$reportNull$$$0(48);
        }
        return c0;
    }

    public C6046e getNumber() {
        return getBuiltInClassByName("Number");
    }

    public C7489j0 getNumberType() {
        C7489j0 defaultType = getNumber().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(54);
        }
        return defaultType;
    }

    public C6077c getPlatformDependentDeclarationFilter() {
        return C6077c.C6079b.f11985a;
    }

    public C7489j0 getPrimitiveArrayKotlinType(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(72);
        }
        C7489j0 j0Var = ((Primitives) this.primitives.invoke()).primitiveTypeToArrayKotlinType.get(primitiveType);
        if (j0Var == null) {
            $$$reportNull$$$0(73);
        }
        return j0Var;
    }

    public C7489j0 getPrimitiveKotlinType(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(52);
        }
        C7489j0 defaultType = getPrimitiveClassDescriptor(primitiveType).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(53);
        }
        return defaultType;
    }

    public C7489j0 getShortType() {
        C7489j0 primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.SHORT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(56);
        }
        return primitiveKotlinType;
    }

    public C7441m getStorageManager() {
        C7441m mVar = this.storageManager;
        if (mVar == null) {
            $$$reportNull$$$0(5);
        }
        return mVar;
    }

    public C6046e getString() {
        return getBuiltInClassByName("String");
    }

    public C7489j0 getStringType() {
        C7489j0 defaultType = getString().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(64);
        }
        return defaultType;
    }

    public C6046e getSuspendFunction(int i) {
        C6046e builtInClassByFqName = getBuiltInClassByFqName(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE.mo23863c(C6717d.m12270l(StandardNames.getSuspendFunctionName(i))));
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(17);
        }
        return builtInClassByFqName;
    }

    public C6046e getUnit() {
        return getBuiltInClassByName("Unit");
    }

    public C7489j0 getUnitType() {
        C7489j0 defaultType = getUnit().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(63);
        }
        return defaultType;
    }

    public void setBuiltInsModule(final C6086a0 a0Var) {
        if (a0Var == null) {
            $$$reportNull$$$0(1);
        }
        this.storageManager.mo25019b(new C6851a<Void>() {
            public Void invoke() {
                if (KotlinBuiltIns.this.builtInsModule == null) {
                    C6086a0 unused = KotlinBuiltIns.this.builtInsModule = a0Var;
                    return null;
                }
                StringBuilder u = C0843a.m460u("Built-ins module is already set: ");
                u.append(KotlinBuiltIns.this.builtInsModule);
                u.append(" (attempting to reset to ");
                u.append(a0Var);
                u.append(")");
                throw new AssertionError(u.toString());
            }
        });
    }
}
