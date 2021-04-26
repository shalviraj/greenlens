package p376j.p378b.p383c;

import p005b.p035e.p036a.p037a.C0843a;
import p376j.p378b.p383c.C7016a;

/* renamed from: j.b.c.b */
public final class C7019b extends C7016a.C7017a {

    /* renamed from: a */
    public final String f14075a;

    public C7019b(String str) {
        this.f14075a = str;
    }

    /* renamed from: a */
    public String mo24400a() {
        return this.f14075a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7016a.C7017a) {
            return this.f14075a.equals(((C7016a.C7017a) obj).mo24400a());
        }
        return false;
    }

    public int hashCode() {
        return this.f14075a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("AttributeValueString{stringValue="), this.f14075a, "}");
    }
}
