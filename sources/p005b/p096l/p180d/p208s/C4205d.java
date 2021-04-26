package p005b.p096l.p180d.p208s;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.d.s.d */
public final class C4205d {

    /* renamed from: a */
    public final String f7795a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f7796b;

    public C4205d(String str, Map<Class<?>, Object> map) {
        this.f7795a = str;
        this.f7796b = map;
    }

    @NonNull
    /* renamed from: a */
    public static C4205d m7742a(@NonNull String str) {
        return new C4205d(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4205d)) {
            return false;
        }
        C4205d dVar = (C4205d) obj;
        return this.f7795a.equals(dVar.f7795a) && this.f7796b.equals(dVar.f7796b);
    }

    public int hashCode() {
        return this.f7796b.hashCode() + (this.f7795a.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder u = C0843a.m460u("FieldDescriptor{name=");
        u.append(this.f7795a);
        u.append(", properties=");
        u.append(this.f7796b.values());
        u.append("}");
        return u.toString();
    }
}
