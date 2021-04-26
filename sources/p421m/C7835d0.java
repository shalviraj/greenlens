package p421m;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m.d0 */
public enum C7835d0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: o */
    public static final C7836a f15511o = null;

    /* renamed from: g */
    public final String f15512g;

    /* renamed from: m.d0$a */
    public static final class C7836a {
        public C7836a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        f15511o = new C7836a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    C7835d0(String str) {
        this.f15512g = str;
    }

    public String toString() {
        return this.f15512g;
    }
}
