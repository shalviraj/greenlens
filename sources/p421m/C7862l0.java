package p421m;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.l0 */
public enum C7862l0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: n */
    public static final C7863a f15613n = null;

    /* renamed from: g */
    public final String f15614g;

    /* renamed from: m.l0$a */
    public static final class C7863a {
        public C7863a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final C7862l0 mo25581a(String str) {
            C6888i.m12438e(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return C7862l0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return C7862l0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return C7862l0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return C7862l0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return C7862l0.SSL_3_0;
            }
            throw new IllegalArgumentException(C0843a.m451l("Unexpected TLS version: ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        f15613n = new C7863a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    C7862l0(String str) {
        this.f15614g = str;
    }
}
