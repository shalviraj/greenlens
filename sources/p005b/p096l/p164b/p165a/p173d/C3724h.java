package p005b.p096l.p164b.p165a.p173d;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.d.h */
public final class C3724h extends AbstractMap<String, Object> {

    /* renamed from: g */
    public final Object f6885g;

    /* renamed from: h */
    public final C3719e f6886h;

    /* renamed from: b.l.b.a.d.h$a */
    public final class C3725a implements Map.Entry<String, Object> {

        /* renamed from: g */
        public Object f6887g;

        /* renamed from: h */
        public final C3729j f6888h;

        public C3725a(C3729j jVar, Object obj) {
            this.f6888h = jVar;
            Objects.requireNonNull(obj);
            this.f6887g = obj;
        }

        /* renamed from: a */
        public String getKey() {
            String str = this.f6888h.f6907d;
            return C3724h.this.f6886h.f6868a ? str.toLowerCase(Locale.US) : str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!getKey().equals(entry.getKey()) || !this.f6887g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getValue() {
            return this.f6887g;
        }

        public int hashCode() {
            return getKey().hashCode() ^ this.f6887g.hashCode();
        }

        public Object setValue(Object obj) {
            Object obj2 = this.f6887g;
            Objects.requireNonNull(obj);
            this.f6887g = obj;
            this.f6888h.mo15102f(C3724h.this.f6885g, obj);
            return obj2;
        }
    }

    /* renamed from: b.l.b.a.d.h$b */
    public final class C3726b implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: g */
        public int f6890g = -1;

        /* renamed from: h */
        public C3729j f6891h;

        /* renamed from: i */
        public Object f6892i;

        /* renamed from: j */
        public boolean f6893j;

        /* renamed from: k */
        public boolean f6894k;

        /* renamed from: l */
        public C3729j f6895l;

        public C3726b() {
        }

        public boolean hasNext() {
            if (!this.f6894k) {
                this.f6894k = true;
                Object obj = null;
                while (true) {
                    this.f6892i = obj;
                    if (this.f6892i != null) {
                        break;
                    }
                    int i = this.f6890g + 1;
                    this.f6890g = i;
                    if (i >= C3724h.this.f6886h.f6870c.size()) {
                        break;
                    }
                    C3719e eVar = C3724h.this.f6886h;
                    C3729j a = eVar.mo15076a(eVar.f6870c.get(this.f6890g));
                    this.f6891h = a;
                    obj = a.mo15101b(C3724h.this.f6885g);
                }
            }
            return this.f6892i != null;
        }

        public Object next() {
            if (hasNext()) {
                C3729j jVar = this.f6891h;
                this.f6895l = jVar;
                Object obj = this.f6892i;
                this.f6894k = false;
                this.f6893j = false;
                this.f6891h = null;
                this.f6892i = null;
                return new C3725a(jVar, obj);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C1960d.m2699C(this.f6895l != null && !this.f6893j);
            this.f6893j = true;
            this.f6895l.mo15102f(C3724h.this.f6885g, (Object) null);
        }
    }

    /* renamed from: b.l.b.a.d.h$c */
    public final class C3727c extends AbstractSet<Map.Entry<String, Object>> {
        public C3727c() {
        }

        public void clear() {
            for (String a : C3724h.this.f6886h.f6870c) {
                C3724h.this.f6886h.mo15076a(a).mo15102f(C3724h.this.f6885g, (Object) null);
            }
        }

        public boolean isEmpty() {
            for (String a : C3724h.this.f6886h.f6870c) {
                if (C3724h.this.f6886h.mo15076a(a).mo15101b(C3724h.this.f6885g) != null) {
                    return false;
                }
            }
            return true;
        }

        public Iterator iterator() {
            return new C3726b();
        }

        public int size() {
            int i = 0;
            for (String a : C3724h.this.f6886h.f6870c) {
                if (C3724h.this.f6886h.mo15076a(a).mo15101b(C3724h.this.f6885g) != null) {
                    i++;
                }
            }
            return i;
        }
    }

    public C3724h(Object obj, boolean z) {
        this.f6885g = obj;
        this.f6886h = C3719e.m7014c(obj.getClass(), z);
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public Set entrySet() {
        return new C3727c();
    }

    public Object get(Object obj) {
        C3729j a;
        if ((obj instanceof String) && (a = this.f6886h.mo15076a((String) obj)) != null) {
            return a.mo15101b(this.f6885g);
        }
        return null;
    }

    public Object put(Object obj, Object obj2) {
        String str = (String) obj;
        C3729j a = this.f6886h.mo15076a(str);
        C1960d.m2865x(a, "no field of key " + str);
        Object b = a.mo15101b(this.f6885g);
        Object obj3 = this.f6885g;
        Objects.requireNonNull(obj2);
        a.mo15102f(obj3, obj2);
        return b;
    }
}
