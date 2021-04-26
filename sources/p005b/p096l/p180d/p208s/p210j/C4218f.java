package p005b.p096l.p180d.p208s.p210j;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p005b.p096l.p180d.p208s.C4204c;
import p005b.p096l.p180d.p208s.C4205d;
import p005b.p096l.p180d.p208s.C4206e;
import p005b.p096l.p180d.p208s.C4207f;
import p005b.p096l.p180d.p208s.C4208g;
import p005b.p096l.p180d.p208s.C4209h;

/* renamed from: b.l.d.s.j.f */
public final class C4218f implements C4207f, C4209h {

    /* renamed from: a */
    public boolean f7807a = true;

    /* renamed from: b */
    public final JsonWriter f7808b;

    /* renamed from: c */
    public final Map<Class<?>, C4206e<?>> f7809c;

    /* renamed from: d */
    public final Map<Class<?>, C4208g<?>> f7810d;

    /* renamed from: e */
    public final C4206e<Object> f7811e;

    /* renamed from: f */
    public final boolean f7812f;

    public C4218f(@NonNull Writer writer, @NonNull Map<Class<?>, C4206e<?>> map, @NonNull Map<Class<?>, C4208g<?>> map2, C4206e<Object> eVar, boolean z) {
        this.f7808b = new JsonWriter(writer);
        this.f7809c = map;
        this.f7810d = map2;
        this.f7811e = eVar;
        this.f7812f = z;
    }

    @NonNull
    /* renamed from: a */
    public C4207f mo15798a(@NonNull C4205d dVar, boolean z) {
        String str = dVar.f7795a;
        mo15807i();
        this.f7808b.name(str);
        mo15807i();
        this.f7808b.value(z);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public C4207f mo15799b(@NonNull C4205d dVar, long j) {
        String str = dVar.f7795a;
        mo15807i();
        this.f7808b.name(str);
        mo15807i();
        this.f7808b.value(j);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public C4207f mo15800c(@NonNull C4205d dVar, int i) {
        String str = dVar.f7795a;
        mo15807i();
        this.f7808b.name(str);
        mo15807i();
        this.f7808b.value((long) i);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public C4209h mo15802d(@Nullable String str) {
        mo15807i();
        this.f7808b.value(str);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public C4209h mo15803e(boolean z) {
        mo15807i();
        this.f7808b.value(z);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public C4207f mo15801f(@NonNull C4205d dVar, @Nullable Object obj) {
        return mo15806h(dVar.f7795a, obj);
    }

    @NonNull
    /* renamed from: g */
    public C4218f mo15805g(@Nullable Object obj, boolean z) {
        int i = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new C4204c(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f7808b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f7808b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                mo15807i();
                this.f7808b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.f7808b.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f7808b.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    mo15807i();
                    this.f7808b.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f7808b.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f7808b.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number g : (Number[]) obj) {
                    mo15805g(g, false);
                }
            } else {
                for (Object g2 : (Object[]) obj) {
                    mo15805g(g2, false);
                }
            }
            this.f7808b.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f7808b.beginArray();
            for (Object g3 : (Collection) obj) {
                mo15805g(g3, false);
            }
            this.f7808b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f7808b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo15806h((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C4204c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f7808b.endObject();
            return this;
        } else {
            C4206e eVar = this.f7809c.get(obj.getClass());
            if (eVar != null) {
                if (!z) {
                    this.f7808b.beginObject();
                }
                eVar.mo11751a(obj, this);
                if (!z) {
                    this.f7808b.endObject();
                }
                return this;
            }
            C4208g gVar = this.f7810d.get(obj.getClass());
            if (gVar != null) {
                gVar.mo11751a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                mo15807i();
                this.f7808b.value(name);
                return this;
            } else {
                C4206e<Object> eVar2 = this.f7811e;
                if (!z) {
                    this.f7808b.beginObject();
                }
                eVar2.mo11751a(obj, this);
                if (!z) {
                    this.f7808b.endObject();
                }
                return this;
            }
        }
    }

    @NonNull
    /* renamed from: h */
    public C4218f mo15806h(@NonNull String str, @Nullable Object obj) {
        if (!this.f7812f) {
            mo15807i();
            this.f7808b.name(str);
            if (obj != null) {
                return mo15805g(obj, false);
            }
            this.f7808b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            mo15807i();
            this.f7808b.name(str);
            return mo15805g(obj, false);
        }
    }

    /* renamed from: i */
    public final void mo15807i() {
        if (!this.f7807a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
