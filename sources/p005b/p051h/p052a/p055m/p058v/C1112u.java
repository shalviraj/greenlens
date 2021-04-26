package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0989e;
import p005b.p051h.p052a.p055m.p058v.C1084j;

/* renamed from: b.h.a.m.v.u */
public class C1112u<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final Pools.Pool<List<Throwable>> f1338a;

    /* renamed from: b */
    public final List<? extends C1084j<Data, ResourceType, Transcode>> f1339b;

    /* renamed from: c */
    public final String f1340c;

    public C1112u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1084j<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f1338a = pool;
        if (!list.isEmpty()) {
            this.f1339b = list;
            StringBuilder u = C0843a.m460u("Failed LoadPath{");
            u.append(cls.getSimpleName());
            u.append("->");
            u.append(cls2.getSimpleName());
            u.append("->");
            u.append(cls3.getSimpleName());
            u.append("}");
            this.f1340c = u.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public C1115w<Transcode> mo11024a(C0989e<Data> eVar, @NonNull C0979p pVar, int i, int i2, C1084j.C1085a<ResourceType> aVar) {
        C1115w<Transcode> wVar;
        List<Throwable> acquire = this.f1338a.acquire();
        Objects.requireNonNull(acquire, "Argument must not be null");
        List list = acquire;
        try {
            int size = this.f1339b.size();
            wVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                wVar = ((C1084j) this.f1339b.get(i3)).mo10975a(eVar, i, i2, pVar, aVar);
                if (wVar != null) {
                    break;
                }
            }
        } catch (C1108r e) {
            list.add(e);
        } catch (Throwable th) {
            this.f1338a.release(list);
            throw th;
        }
        if (wVar != null) {
            this.f1338a.release(list);
            return wVar;
        }
        throw new C1108r(this.f1340c, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LoadPath{decodePaths=");
        u.append(Arrays.toString(this.f1339b.toArray()));
        u.append('}');
        return u.toString();
    }
}
