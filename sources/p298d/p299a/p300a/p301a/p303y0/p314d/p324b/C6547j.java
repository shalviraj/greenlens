package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import androidx.exifinterface.media.ExifInterface;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6542h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.d.b.j */
public final class C6547j implements C6546i<C6542h> {

    /* renamed from: a */
    public static final C6547j f12849a = new C6547j();

    /* renamed from: d */
    public Object mo23650d(Object obj) {
        JvmPrimitiveType jvmPrimitiveType;
        C6542h hVar = (C6542h) obj;
        C6888i.m12438e(hVar, "possiblyPrimitiveType");
        if (!(hVar instanceof C6542h.C6545c) || (jvmPrimitiveType = ((C6542h.C6545c) hVar).f12848j) == null) {
            return hVar;
        }
        String internalName = JvmClassName.byFqNameWithoutInnerClasses(jvmPrimitiveType.getWrapperFqName()).getInternalName();
        C6888i.m12437d(internalName, "byFqNameWithoutInnerClasses(possiblyPrimitiveType.jvmPrimitiveType.wrapperFqName).internalName");
        return mo23648b(internalName);
    }

    /* renamed from: e */
    public Object mo23651e() {
        return mo23648b("java/lang/Class");
    }

    /* renamed from: f */
    public Object mo23652f(PrimitiveType primitiveType) {
        C6888i.m12438e(primitiveType, "primitiveType");
        switch (primitiveType.ordinal()) {
            case 0:
                C6542h hVar = C6542h.f12837a;
                return C6542h.f12838b;
            case 1:
                C6542h hVar2 = C6542h.f12837a;
                return C6542h.f12839c;
            case 2:
                C6542h hVar3 = C6542h.f12837a;
                return C6542h.f12840d;
            case 3:
                C6542h hVar4 = C6542h.f12837a;
                return C6542h.f12841e;
            case 4:
                C6542h hVar5 = C6542h.f12837a;
                return C6542h.f12842f;
            case 5:
                C6542h hVar6 = C6542h.f12837a;
                return C6542h.f12843g;
            case 6:
                C6542h hVar7 = C6542h.f12837a;
                return C6542h.f12844h;
            case 7:
                C6542h hVar8 = C6542h.f12837a;
                return C6542h.f12845i;
            default:
                throw new C6766h();
        }
    }

    /* renamed from: g */
    public C6542h mo23647a(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        C6542h bVar;
        C6888i.m12438e(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int i = 0;
        while (true) {
            if (i >= 8) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new C6542h.C6545c(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new C6542h.C6545c((JvmPrimitiveType) null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
            bVar = new C6542h.C6543a(mo23647a(substring));
        } else {
            if (charAt == 'L') {
                C6888i.m12438e(str, "$this$endsWith");
                if (str.length() > 0) {
                    boolean J0 = C5266a.m9825J0(str.charAt(C7694h.m13929g(str)), ';', false);
                }
            }
            String substring2 = str.substring(1, str.length() - 1);
            C6888i.m12437d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            bVar = new C6542h.C6544b(substring2);
        }
        return bVar;
    }

    /* renamed from: h */
    public C6542h.C6544b mo23648b(String str) {
        C6888i.m12438e(str, "internalName");
        return new C6542h.C6544b(str);
    }

    /* renamed from: i */
    public String mo23649c(C6542h hVar) {
        String desc;
        C6888i.m12438e(hVar, "type");
        if (hVar instanceof C6542h.C6543a) {
            return C6888i.m12444k("[", mo23649c(((C6542h.C6543a) hVar).f12846j));
        }
        if (hVar instanceof C6542h.C6545c) {
            JvmPrimitiveType jvmPrimitiveType = ((C6542h.C6545c) hVar).f12848j;
            if (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) {
                return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            }
            return desc;
        } else if (hVar instanceof C6542h.C6544b) {
            return C0843a.m454o(C0843a.m459t('L'), ((C6542h.C6544b) hVar).f12847j, ';');
        } else {
            throw new C6766h();
        }
    }
}
