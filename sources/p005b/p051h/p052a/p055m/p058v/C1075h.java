package p005b.p051h.p052a.p055m.p058v;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005b.p051h.p052a.C0933e;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.C0935g;
import p005b.p051h.p052a.p055m.C0965d;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1076i;
import p005b.p051h.p052a.p055m.p058v.C1090l;
import p005b.p051h.p052a.p055m.p058v.p060d0.C1044a;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p064x.C1211b;
import p005b.p051h.p052a.p055m.p064x.p070h.C1298e;
import p005b.p051h.p052a.p055m.p064x.p070h.C1299f;
import p005b.p051h.p052a.p055m.p064x.p070h.C1301g;
import p005b.p051h.p052a.p073p.C1330a;
import p005b.p051h.p052a.p073p.C1333c;
import p005b.p051h.p052a.p073p.C1335e;
import p005b.p051h.p052a.p078s.C1379i;

/* renamed from: b.h.a.m.v.h */
public final class C1075h<Transcode> {

    /* renamed from: a */
    public final List<C1161n.C1162a<?>> f1178a = new ArrayList();

    /* renamed from: b */
    public final List<C0974m> f1179b = new ArrayList();

    /* renamed from: c */
    public C0933e f1180c;

    /* renamed from: d */
    public Object f1181d;

    /* renamed from: e */
    public int f1182e;

    /* renamed from: f */
    public int f1183f;

    /* renamed from: g */
    public Class<?> f1184g;

    /* renamed from: h */
    public C1076i.C1080d f1185h;

    /* renamed from: i */
    public C0979p f1186i;

    /* renamed from: j */
    public Map<Class<?>, C0983t<?>> f1187j;

    /* renamed from: k */
    public Class<Transcode> f1188k;

    /* renamed from: l */
    public boolean f1189l;

    /* renamed from: m */
    public boolean f1190m;

    /* renamed from: n */
    public C0974m f1191n;

    /* renamed from: o */
    public C0934f f1192o;

    /* renamed from: p */
    public C1086k f1193p;

    /* renamed from: q */
    public boolean f1194q;

    /* renamed from: r */
    public boolean f1195r;

    /* renamed from: a */
    public List<C0974m> mo10954a() {
        if (!this.f1190m) {
            this.f1190m = true;
            this.f1179b.clear();
            List<C1161n.C1162a<?>> c = mo10956c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C1161n.C1162a aVar = c.get(i);
                if (!this.f1179b.contains(aVar.f1409a)) {
                    this.f1179b.add(aVar.f1409a);
                }
                for (int i2 = 0; i2 < aVar.f1410b.size(); i2++) {
                    if (!this.f1179b.contains(aVar.f1410b.get(i2))) {
                        this.f1179b.add(aVar.f1410b.get(i2));
                    }
                }
            }
        }
        return this.f1179b;
    }

    /* renamed from: b */
    public C1044a mo10955b() {
        return ((C1090l.C1095c) this.f1185h).mo10988a();
    }

    /* renamed from: c */
    public List<C1161n.C1162a<?>> mo10956c() {
        if (!this.f1189l) {
            this.f1189l = true;
            this.f1178a.clear();
            List f = this.f1180c.f864b.mo10766f(this.f1181d);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                C1161n.C1162a a = ((C1161n) f.get(i)).mo11030a(this.f1181d, this.f1182e, this.f1183f, this.f1186i);
                if (a != null) {
                    this.f1178a.add(a);
                }
            }
        }
        return this.f1178a;
    }

    /* renamed from: d */
    public <Data> C1112u<Data, ?, Transcode> mo10957d(Class<Data> cls) {
        C1112u<Data, ?, Transcode> uVar;
        ArrayList arrayList;
        C1298e eVar;
        C1298e eVar2;
        Class<Data> cls2 = cls;
        C0935g gVar = this.f1180c.f864b;
        Class<?> cls3 = this.f1184g;
        Class<Transcode> cls4 = this.f1188k;
        C1333c cVar = gVar.f886i;
        C1379i andSet = cVar.f1684b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C1379i();
        }
        andSet.f1798a = cls2;
        andSet.f1799b = cls3;
        andSet.f1800c = cls4;
        synchronized (cVar.f1683a) {
            uVar = cVar.f1683a.get(andSet);
        }
        cVar.f1684b.set(andSet);
        Objects.requireNonNull(gVar.f886i);
        if (C1333c.f1682c.equals(uVar)) {
            return null;
        }
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) gVar.f880c.mo11171b(cls2, cls3)).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = ((ArrayList) gVar.f883f.mo11139a(cls5, cls4)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    C1335e eVar3 = gVar.f880c;
                    synchronized (eVar3) {
                        arrayList = new ArrayList();
                        for (String str : eVar3.f1687a) {
                            List<C1335e.C1336a> list = eVar3.f1688b.get(str);
                            if (list != null) {
                                for (C1335e.C1336a aVar : list) {
                                    if (aVar.mo11172a(cls2, cls5)) {
                                        arrayList.add(aVar.f1691c);
                                    }
                                }
                            }
                        }
                    }
                    C1299f fVar = gVar.f883f;
                    synchronized (fVar) {
                        if (cls6.isAssignableFrom(cls5)) {
                            eVar = C1301g.f1644a;
                        } else {
                            for (C1299f.C1300a next : fVar.f1640a) {
                                if (next.mo11140a(cls5, cls6)) {
                                    eVar = next.f1643c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                        eVar2 = eVar;
                    }
                    C1084j jVar = r2;
                    C1084j jVar2 = new C1084j(cls, cls5, cls6, arrayList, eVar2, gVar.f887j);
                    arrayList2.add(jVar);
                }
            }
        }
        C1112u<Data, ?, Transcode> uVar2 = arrayList2.isEmpty() ? null : new C1112u<>(cls, cls3, cls4, arrayList2, gVar.f887j);
        C1333c cVar2 = gVar.f886i;
        synchronized (cVar2.f1683a) {
            cVar2.f1683a.put(new C1379i(cls2, cls3, cls4), uVar2 != null ? uVar2 : C1333c.f1682c);
        }
        return uVar2;
    }

    /* renamed from: e */
    public <X> C0965d<X> mo10958e(X x) {
        C0965d<T> dVar;
        C1330a aVar = this.f1180c.f864b.f879b;
        Class<?> cls = x.getClass();
        synchronized (aVar) {
            Iterator<C1330a.C1331a<?>> it = aVar.f1678a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                C1330a.C1331a next = it.next();
                if (next.f1679a.isAssignableFrom(cls)) {
                    dVar = next.f1680b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new C0935g.C0940e(x.getClass());
    }

    /* renamed from: f */
    public <Z> C0983t<Z> mo10959f(Class<Z> cls) {
        C0983t<Z> tVar = this.f1187j.get(cls);
        if (tVar == null) {
            Iterator<Map.Entry<Class<?>, C0983t<?>>> it = this.f1187j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    tVar = (C0983t) next.getValue();
                    break;
                }
            }
        }
        if (tVar != null) {
            return tVar;
        }
        if (!this.f1187j.isEmpty() || !this.f1194q) {
            return (C1211b) C1211b.f1487b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: g */
    public boolean mo10960g(Class<?> cls) {
        return mo10957d(cls) != null;
    }
}
