package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0935g;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p058v.C1073g;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1164p;
import p005b.p051h.p052a.p073p.C1334d;
import p005b.p051h.p052a.p078s.C1379i;

/* renamed from: b.h.a.m.v.x */
public class C1116x implements C1073g, C0987d.C0988a<Object> {

    /* renamed from: g */
    public final C1073g.C1074a f1346g;

    /* renamed from: h */
    public final C1075h<?> f1347h;

    /* renamed from: i */
    public int f1348i;

    /* renamed from: j */
    public int f1349j = -1;

    /* renamed from: k */
    public C0974m f1350k;

    /* renamed from: l */
    public List<C1161n<File, ?>> f1351l;

    /* renamed from: m */
    public int f1352m;

    /* renamed from: n */
    public volatile C1161n.C1162a<?> f1353n;

    /* renamed from: o */
    public File f1354o;

    /* renamed from: p */
    public C1117y f1355p;

    public C1116x(C1075h<?> hVar, C1073g.C1074a aVar) {
        this.f1347h = hVar;
        this.f1346g = aVar;
    }

    /* renamed from: a */
    public boolean mo10875a() {
        List list;
        List<Class<?>> d;
        List<C0974m> a = this.f1347h.mo10954a();
        if (a.isEmpty()) {
            return false;
        }
        C1075h<?> hVar = this.f1347h;
        C0935g gVar = hVar.f1180c.f864b;
        Class<?> cls = hVar.f1181d.getClass();
        Class<?> cls2 = hVar.f1184g;
        Class<Transcode> cls3 = hVar.f1188k;
        C1334d dVar = gVar.f885h;
        C1379i andSet = dVar.f1685a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C1379i(cls, cls2, cls3);
        } else {
            andSet.f1798a = cls;
            andSet.f1799b = cls2;
            andSet.f1800c = cls3;
        }
        synchronized (dVar.f1686b) {
            list = dVar.f1686b.get(andSet);
        }
        dVar.f1685a.set(andSet);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            C1164p pVar = gVar.f878a;
            synchronized (pVar) {
                d = pVar.f1412a.mo11060d(cls);
            }
            Iterator it = ((ArrayList) d).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) gVar.f880c.mo11171b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) gVar.f883f.mo11139a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            C1334d dVar2 = gVar.f885h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (dVar2.f1686b) {
                dVar2.f1686b.put(new C1379i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<C1161n<File, ?>> list2 = this.f1351l;
                if (list2 != null) {
                    if (this.f1352m < list2.size()) {
                        this.f1353n = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.f1352m < this.f1351l.size())) {
                                break;
                            }
                            List<C1161n<File, ?>> list3 = this.f1351l;
                            int i = this.f1352m;
                            this.f1352m = i + 1;
                            File file = this.f1354o;
                            C1075h<?> hVar2 = this.f1347h;
                            this.f1353n = list3.get(i).mo11030a(file, hVar2.f1182e, hVar2.f1183f, hVar2.f1186i);
                            if (this.f1353n != null && this.f1347h.mo10960g(this.f1353n.f1411c.mo10839a())) {
                                this.f1353n.f1411c.mo10847f(this.f1347h.f1192o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i2 = this.f1349j + 1;
                this.f1349j = i2;
                if (i2 >= arrayList.size()) {
                    int i3 = this.f1348i + 1;
                    this.f1348i = i3;
                    if (i3 >= a.size()) {
                        return false;
                    }
                    this.f1349j = 0;
                }
                C0974m mVar = a.get(this.f1348i);
                Class cls5 = (Class) arrayList.get(this.f1349j);
                C0983t<Z> f = this.f1347h.mo10959f(cls5);
                C1075h<?> hVar3 = this.f1347h;
                this.f1355p = new C1117y(hVar3.f1180c.f863a, mVar, hVar3.f1191n, hVar3.f1182e, hVar3.f1183f, f, cls5, hVar3.f1186i);
                File b = hVar3.mo10955b().mo10927b(this.f1355p);
                this.f1354o = b;
                if (b != null) {
                    this.f1350k = mVar;
                    this.f1351l = this.f1347h.f1180c.f864b.mo10766f(b);
                    this.f1352m = 0;
                }
            }
        } else if (File.class.equals(this.f1347h.f1188k)) {
            return false;
        } else {
            StringBuilder u = C0843a.m460u("Failed to find any load path from ");
            u.append(this.f1347h.f1181d.getClass());
            u.append(" to ");
            u.append(this.f1347h.f1188k);
            throw new IllegalStateException(u.toString());
        }
    }

    /* renamed from: c */
    public void mo10853c(@NonNull Exception exc) {
        this.f1346g.mo10878e(this.f1355p, exc, this.f1353n.f1411c, C0962a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C1161n.C1162a<?> aVar = this.f1353n;
        if (aVar != null) {
            aVar.f1411c.cancel();
        }
    }

    /* renamed from: d */
    public void mo10854d(Object obj) {
        this.f1346g.mo10879i(this.f1350k, obj, this.f1353n.f1411c, C0962a.RESOURCE_DISK_CACHE, this.f1355p);
    }
}
