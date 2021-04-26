package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.b.h */
public abstract class C6542h {

    /* renamed from: a */
    public static final C6542h f12837a = null;

    /* renamed from: b */
    public static final C6545c f12838b = new C6545c(JvmPrimitiveType.BOOLEAN);

    /* renamed from: c */
    public static final C6545c f12839c = new C6545c(JvmPrimitiveType.CHAR);

    /* renamed from: d */
    public static final C6545c f12840d = new C6545c(JvmPrimitiveType.BYTE);

    /* renamed from: e */
    public static final C6545c f12841e = new C6545c(JvmPrimitiveType.SHORT);

    /* renamed from: f */
    public static final C6545c f12842f = new C6545c(JvmPrimitiveType.INT);

    /* renamed from: g */
    public static final C6545c f12843g = new C6545c(JvmPrimitiveType.FLOAT);

    /* renamed from: h */
    public static final C6545c f12844h = new C6545c(JvmPrimitiveType.LONG);

    /* renamed from: i */
    public static final C6545c f12845i = new C6545c(JvmPrimitiveType.DOUBLE);

    /* renamed from: d.a.a.a.y0.d.b.h$a */
    public static final class C6543a extends C6542h {

        /* renamed from: j */
        public final C6542h f12846j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6543a(C6542h hVar) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(hVar, "elementType");
            this.f12846j = hVar;
        }
    }

    /* renamed from: d.a.a.a.y0.d.b.h$b */
    public static final class C6544b extends C6542h {

        /* renamed from: j */
        public final String f12847j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6544b(String str) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(str, "internalName");
            this.f12847j = str;
        }
    }

    /* renamed from: d.a.a.a.y0.d.b.h$c */
    public static final class C6545c extends C6542h {

        /* renamed from: j */
        public final JvmPrimitiveType f12848j;

        public C6545c(JvmPrimitiveType jvmPrimitiveType) {
            super((DefaultConstructorMarker) null);
            this.f12848j = jvmPrimitiveType;
        }
    }

    public C6542h() {
    }

    public C6542h(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public String toString() {
        return C6547j.f12849a.mo23649c(this);
    }
}
