package p421m;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7867c;
import p435n.C8042f;

/* renamed from: m.g0 */
public abstract class C7844g0 {

    /* renamed from: a */
    public static final C7845a f15540a = new C7845a((DefaultConstructorMarker) null);

    /* renamed from: m.g0$a */
    public static final class C7845a {

        /* renamed from: m.g0$a$a */
        public static final class C7846a extends C7844g0 {

            /* renamed from: b */
            public final /* synthetic */ byte[] f15541b;

            /* renamed from: c */
            public final /* synthetic */ C7829b0 f15542c;

            /* renamed from: d */
            public final /* synthetic */ int f15543d;

            /* renamed from: e */
            public final /* synthetic */ int f15544e;

            public C7846a(byte[] bArr, C7829b0 b0Var, int i, int i2) {
                this.f15541b = bArr;
                this.f15542c = b0Var;
                this.f15543d = i;
                this.f15544e = i2;
            }

            /* renamed from: a */
            public long mo25542a() {
                return (long) this.f15543d;
            }

            /* renamed from: b */
            public C7829b0 mo25543b() {
                return this.f15542c;
            }

            /* renamed from: c */
            public void mo25544c(C8042f fVar) {
                C6888i.m12438e(fVar, "sink");
                fVar.mo25908h(this.f15541b, this.f15544e, this.f15543d);
            }
        }

        public C7845a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: b */
        public static C7844g0 m14247b(C7845a aVar, C7829b0 b0Var, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            C6888i.m12438e(bArr, "content");
            return aVar.mo25545a(bArr, (C7829b0) null, i, i2);
        }

        /* renamed from: c */
        public static /* synthetic */ C7844g0 m14248c(C7845a aVar, byte[] bArr, C7829b0 b0Var, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                b0Var = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo25545a(bArr, b0Var, i, i2);
        }

        /* renamed from: a */
        public final C7844g0 mo25545a(byte[] bArr, C7829b0 b0Var, int i, int i2) {
            C6888i.m12438e(bArr, "$this$toRequestBody");
            C7867c.m14282c((long) bArr.length, (long) i, (long) i2);
            return new C7846a(bArr, b0Var, i2, i);
        }
    }

    /* renamed from: a */
    public abstract long mo25542a();

    /* renamed from: b */
    public abstract C7829b0 mo25543b();

    /* renamed from: c */
    public abstract void mo25544c(C8042f fVar);
}
