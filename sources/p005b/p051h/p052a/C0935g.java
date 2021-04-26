package p005b.p051h.p052a;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005b.p051h.p052a.p055m.C0965d;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.C0982s;
import p005b.p051h.p052a.p055m.p056u.C0989e;
import p005b.p051h.p052a.p055m.p056u.C0991f;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1163o;
import p005b.p051h.p052a.p055m.p062w.C1164p;
import p005b.p051h.p052a.p055m.p062w.C1169r;
import p005b.p051h.p052a.p055m.p064x.p070h.C1298e;
import p005b.p051h.p052a.p055m.p064x.p070h.C1299f;
import p005b.p051h.p052a.p073p.C1330a;
import p005b.p051h.p052a.p073p.C1332b;
import p005b.p051h.p052a.p073p.C1333c;
import p005b.p051h.p052a.p073p.C1334d;
import p005b.p051h.p052a.p073p.C1335e;
import p005b.p051h.p052a.p073p.C1337f;
import p005b.p051h.p052a.p078s.p079k.C1382a;
import p005b.p051h.p052a.p078s.p079k.C1388b;
import p005b.p051h.p052a.p078s.p079k.C1389c;

/* renamed from: b.h.a.g */
public class C0935g {

    /* renamed from: a */
    public final C1164p f878a;

    /* renamed from: b */
    public final C1330a f879b;

    /* renamed from: c */
    public final C1335e f880c;

    /* renamed from: d */
    public final C1337f f881d;

    /* renamed from: e */
    public final C0991f f882e;

    /* renamed from: f */
    public final C1299f f883f;

    /* renamed from: g */
    public final C1332b f884g;

    /* renamed from: h */
    public final C1334d f885h = new C1334d();

    /* renamed from: i */
    public final C1333c f886i = new C1333c();

    /* renamed from: j */
    public final Pools.Pool<List<Throwable>> f887j;

    /* renamed from: b.h.a.g$a */
    public static class C0936a extends RuntimeException {
        public C0936a(@NonNull String str) {
            super(str);
        }
    }

    /* renamed from: b.h.a.g$b */
    public static final class C0937b extends C0936a {
        public C0937b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: b.h.a.g$c */
    public static class C0938c extends C0936a {
        public C0938c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0938c(@androidx.annotation.NonNull java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.C0935g.C0938c.<init>(java.lang.Object):void");
        }

        public <M> C0938c(@NonNull M m, @NonNull List<C1161n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }
    }

    /* renamed from: b.h.a.g$d */
    public static class C0939d extends C0936a {
        public C0939d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: b.h.a.g$e */
    public static class C0940e extends C0936a {
        public C0940e(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C0935g() {
        C1382a.C1385c cVar = new C1382a.C1385c(new Pools.SynchronizedPool(20), new C1388b(), new C1389c());
        this.f887j = cVar;
        this.f878a = new C1164p(cVar);
        this.f879b = new C1330a();
        C1335e eVar = new C1335e();
        this.f880c = eVar;
        this.f881d = new C1337f();
        this.f882e = new C0991f();
        this.f883f = new C1299f();
        this.f884g = new C1332b();
        List asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.f1687a);
            eVar.f1687a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.f1687a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    eVar.f1687a.add(str);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public <Data> C0935g mo10761a(@NonNull Class<Data> cls, @NonNull C0965d<Data> dVar) {
        C1330a aVar = this.f879b;
        synchronized (aVar) {
            aVar.f1678a.add(new C1330a.C1331a(cls, dVar));
        }
        return this;
    }

    @NonNull
    /* renamed from: b */
    public <TResource> C0935g mo10762b(@NonNull Class<TResource> cls, @NonNull C0982s<TResource> sVar) {
        C1337f fVar = this.f881d;
        synchronized (fVar) {
            fVar.f1692a.add(new C1337f.C1338a(cls, sVar));
        }
        return this;
    }

    @NonNull
    /* renamed from: c */
    public <Model, Data> C0935g mo10763c(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C1163o<Model, Data> oVar) {
        C1164p pVar = this.f878a;
        synchronized (pVar) {
            C1169r rVar = pVar.f1412a;
            synchronized (rVar) {
                C1169r.C1171b bVar = new C1169r.C1171b(cls, cls2, oVar);
                List<C1169r.C1171b<?, ?>> list = rVar.f1427a;
                list.add(list.size(), bVar);
            }
            pVar.f1413b.f1414a.clear();
        }
        return this;
    }

    @NonNull
    /* renamed from: d */
    public <Data, TResource> C0935g mo10764d(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull C0981r<Data, TResource> rVar) {
        C1335e eVar = this.f880c;
        synchronized (eVar) {
            eVar.mo11170a(str).add(new C1335e.C1336a(cls, cls2, rVar));
        }
        return this;
    }

    @NonNull
    /* renamed from: e */
    public List<ImageHeaderParser> mo10765e() {
        List<ImageHeaderParser> list;
        C1332b bVar = this.f884g;
        synchronized (bVar) {
            list = bVar.f1681a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new C0937b();
    }

    @NonNull
    /* renamed from: f */
    public <Model> List<C1161n<Model, ?>> mo10766f(@NonNull Model model) {
        List<C1161n<Model, ?>> list;
        C1164p pVar = this.f878a;
        Objects.requireNonNull(pVar);
        Class cls = model.getClass();
        synchronized (pVar) {
            C1164p.C1165a.C1166a aVar = pVar.f1413b.f1414a.get(cls);
            list = aVar == null ? null : aVar.f1415a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f1412a.mo11059c(cls));
                if (pVar.f1413b.f1414a.put(cls, new C1164p.C1165a.C1166a(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<C1161n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C1161n nVar = list.get(i);
                if (nVar.mo11031b(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C0938c(model, list);
        }
        throw new C0938c(model);
    }

    @NonNull
    /* renamed from: g */
    public C0935g mo10767g(@NonNull C0989e.C0990a<?> aVar) {
        C0991f fVar = this.f882e;
        synchronized (fVar) {
            fVar.f1037a.put(aVar.mo10857a(), aVar);
        }
        return this;
    }

    @NonNull
    /* renamed from: h */
    public <TResource, Transcode> C0935g mo10768h(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull C1298e<TResource, Transcode> eVar) {
        C1299f fVar = this.f883f;
        synchronized (fVar) {
            fVar.f1640a.add(new C1299f.C1300a(cls, cls2, eVar));
        }
        return this;
    }
}
