package p005b.p280p.p285b.p286a0.p288k;

import java.net.ProtocolException;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.C5254s;

/* renamed from: b.p.b.a0.k.o */
public final class C5210o {

    /* renamed from: a */
    public final C5254s f10225a;

    /* renamed from: b */
    public final int f10226b;

    /* renamed from: c */
    public final String f10227c;

    public C5210o(C5254s sVar, int i, String str) {
        this.f10225a = sVar;
        this.f10226b = i;
        this.f10227c = str;
    }

    /* renamed from: a */
    public static C5210o m9664a(String str) {
        String str2;
        C5254s sVar = C5254s.HTTP_1_0;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    sVar = C5254s.HTTP_1_1;
                } else {
                    throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
                }
                return new C5210o(sVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(C0843a.m451l("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10225a == C5254s.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f10226b);
        if (this.f10227c != null) {
            sb.append(' ');
            sb.append(this.f10227c);
        }
        return sb.toString();
    }
}
