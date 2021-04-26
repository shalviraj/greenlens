package p005b.p096l.p164b.p165a.p173d;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p164b.p165a.p173d.C3724h;

/* renamed from: b.l.b.a.d.k */
public class C3730k extends AbstractMap<String, Object> implements Cloneable {
    public final C3719e classInfo;
    public Map<String, Object> unknownFields;

    /* renamed from: b.l.b.a.d.k$a */
    public final class C3731a implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: g */
        public boolean f6908g;

        /* renamed from: h */
        public final Iterator<Map.Entry<String, Object>> f6909h;

        /* renamed from: i */
        public final Iterator<Map.Entry<String, Object>> f6910i;

        public C3731a(C3730k kVar, C3724h.C3727c cVar) {
            this.f6909h = new C3724h.C3726b();
            this.f6910i = kVar.unknownFields.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.f6909h.hasNext() || this.f6910i.hasNext();
        }

        public Object next() {
            Iterator<Map.Entry<String, Object>> it;
            if (!this.f6908g) {
                if (this.f6909h.hasNext()) {
                    it = this.f6909h;
                    return it.next();
                }
                this.f6908g = true;
            }
            it = this.f6910i;
            return it.next();
        }

        public void remove() {
            if (this.f6908g) {
                this.f6910i.remove();
            }
            this.f6909h.remove();
        }
    }

    /* renamed from: b.l.b.a.d.k$b */
    public final class C3732b extends AbstractSet<Map.Entry<String, Object>> {

        /* renamed from: g */
        public final C3724h.C3727c f6911g;

        public C3732b() {
            this.f6911g = new C3724h.C3727c();
        }

        public void clear() {
            C3730k.this.unknownFields.clear();
            this.f6911g.clear();
        }

        public Iterator<Map.Entry<String, Object>> iterator() {
            return new C3731a(C3730k.this, this.f6911g);
        }

        public int size() {
            return this.f6911g.size() + C3730k.this.unknownFields.size();
        }
    }

    /* renamed from: b.l.b.a.d.k$c */
    public enum C3733c {
        IGNORE_CASE
    }

    public C3730k() {
        this(EnumSet.noneOf(C3733c.class));
    }

    public C3730k(EnumSet<C3733c> enumSet) {
        this.unknownFields = new C3711a();
        this.classInfo = C3719e.m7014c(getClass(), enumSet.contains(C3733c.IGNORE_CASE));
    }

    public C3730k clone() {
        try {
            C3730k kVar = (C3730k) super.clone();
            C3723g.m7019b(this, kVar);
            kVar.unknownFields = (Map) C3723g.m7018a(this.unknownFields);
            return kVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return new C3732b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C3730k)) {
            return false;
        }
        C3730k kVar = (C3730k) obj;
        return super.equals(kVar) && Objects.equals(this.classInfo, kVar.classInfo);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C3729j a = this.classInfo.mo15076a(str);
        if (a != null) {
            return a.mo15101b(this);
        }
        if (this.classInfo.f6868a) {
            str = str.toLowerCase(Locale.US);
        }
        return this.unknownFields.get(str);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.classInfo});
    }

    public Object put(Object obj, Object obj2) {
        String str = (String) obj;
        C3729j a = this.classInfo.mo15076a(str);
        if (a != null) {
            Object b = a.mo15101b(this);
            a.mo15102f(this, obj2);
            return b;
        }
        if (this.classInfo.f6868a) {
            str = str.toLowerCase(Locale.US);
        }
        return this.unknownFields.put(str, obj2);
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            set((String) next.getKey(), next.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.classInfo.mo15076a(str) == null) {
            if (this.classInfo.f6868a) {
                str = str.toLowerCase(Locale.US);
            }
            return this.unknownFields.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public C3730k set(String str, Object obj) {
        C3729j a = this.classInfo.mo15076a(str);
        if (a != null) {
            a.mo15102f(this, obj);
        } else {
            if (this.classInfo.f6868a) {
                str = str.toLowerCase(Locale.US);
            }
            this.unknownFields.put(str, obj);
        }
        return this;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("GenericData{classInfo=");
        u.append(this.classInfo.f6870c);
        u.append(", ");
        return C0843a.m455p(u, super.toString(), "}");
    }
}
