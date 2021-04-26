package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.s */
public final class C4123s extends C4129v.C4134d.C4140d.C4152c {

    /* renamed from: a */
    public final String f7705a;

    public C4123s(String str, C4124a aVar) {
        this.f7705a = str;
    }

    @NonNull
    /* renamed from: a */
    public String mo15724a() {
        return this.f7705a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4129v.C4134d.C4140d.C4152c) {
            return this.f7705a.equals(((C4129v.C4134d.C4140d.C4152c) obj).mo15724a());
        }
        return false;
    }

    public int hashCode() {
        return this.f7705a.hashCode() ^ 1000003;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("Log{content="), this.f7705a, "}");
    }
}
