package p005b.p280p.p285b;

import java.io.IOException;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.p.b.s */
public enum C5254s {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: g */
    public final String f10478g;

    /* access modifiers changed from: public */
    C5254s(String str) {
        this.f10478g = str;
    }

    /* renamed from: d */
    public static C5254s m9747d(String str) {
        C5254s sVar = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return sVar;
        }
        C5254s sVar2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return sVar2;
        }
        C5254s sVar3 = HTTP_2;
        if (str.equals("h2")) {
            return sVar3;
        }
        C5254s sVar4 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return sVar4;
        }
        throw new IOException(C0843a.m451l("Unexpected protocol: ", str));
    }

    public String toString() {
        return this.f10478g;
    }
}
