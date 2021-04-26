package p005b.p096l.p180d.p191q.p192f.p195g;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p098a.C1583a;
import p005b.p096l.p097a.p098a.C1584b;
import p005b.p096l.p097a.p098a.C1585c;
import p005b.p096l.p097a.p098a.C1586d;
import p005b.p096l.p097a.p098a.p099e.C1587a;
import p005b.p096l.p097a.p098a.p101f.C1625a;
import p005b.p096l.p097a.p098a.p101f.C1628b;
import p005b.p096l.p097a.p098a.p101f.C1633d;
import p005b.p096l.p097a.p098a.p101f.C1640h;
import p005b.p096l.p097a.p098a.p101f.C1642i;
import p005b.p096l.p097a.p098a.p101f.C1643j;
import p005b.p096l.p097a.p098a.p101f.C1644k;
import p005b.p096l.p097a.p098a.p101f.p106q.C1670e;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3429i;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p196h.C4051b;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;
import p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h;
import p005b.p096l.p180d.p191q.p192f.p200k.C4174g;
import p005b.p096l.p180d.p191q.p192f.p200k.C4175h;
import p005b.p096l.p180d.p191q.p192f.p201l.C4176a;
import p005b.p096l.p180d.p191q.p192f.p201l.C4177b;
import p005b.p096l.p180d.p191q.p192f.p201l.C4178c;
import p005b.p096l.p180d.p191q.p192f.p202m.C4184f;
import p005b.p096l.p180d.p191q.p192f.p205n.C4198d;

/* renamed from: b.l.d.q.f.g.m0 */
public class C4024m0 {

    /* renamed from: a */
    public final C4049z f7374a;

    /* renamed from: b */
    public final C4174g f7375b;

    /* renamed from: c */
    public final C4178c f7376c;

    /* renamed from: d */
    public final C4051b f7377d;

    /* renamed from: e */
    public final C4028o0 f7378e;

    public C4024m0(C4049z zVar, C4174g gVar, C4178c cVar, C4051b bVar, C4028o0 o0Var) {
        this.f7374a = zVar;
        this.f7375b = gVar;
        this.f7376c = cVar;
        this.f7377d = bVar;
        this.f7378e = o0Var;
    }

    /* renamed from: a */
    public static C4024m0 m7422a(Context context, C4012g0 g0Var, C4175h hVar, C3995a aVar, C4051b bVar, C4028o0 o0Var, C4198d dVar, C4184f fVar) {
        File file = new File(new File(hVar.f7743a.getFilesDir(), ".com.google.firebase.crashlytics").getPath());
        Context context2 = context;
        C4012g0 g0Var2 = g0Var;
        C3995a aVar2 = aVar;
        C4049z zVar = new C4049z(context, g0Var, aVar, dVar);
        C4174g gVar = new C4174g(file, fVar);
        C4163h hVar2 = C4178c.f7747b;
        C1644k.m2169b(context);
        C1644k a = C1644k.m2168a();
        C1587a aVar3 = new C1587a(C4178c.f7748c, C4178c.f7749d);
        Objects.requireNonNull(a);
        Set<T> unmodifiableSet = Collections.unmodifiableSet(C1587a.f2695f);
        C1640h.C1641a a2 = C1640h.m2161a();
        a2.mo11814b("cct");
        C1628b.C1630b bVar2 = (C1628b.C1630b) a2;
        bVar2.f2863b = aVar3.mo11734b();
        C1640h a3 = bVar2.mo11813a();
        C1583a aVar4 = new C1583a("json");
        C1585c<C4129v, byte[]> cVar = C4178c.f7750e;
        if (unmodifiableSet.contains(aVar4)) {
            return new C4024m0(zVar, gVar, new C4178c(new C1642i(a3, "FIREBASE_CRASHLYTICS_REPORT", aVar4, cVar, a), cVar), bVar, o0Var);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{aVar4, unmodifiableSet}));
    }

    @NonNull
    /* renamed from: b */
    public List<String> mo15532b() {
        List<File> b = C4174g.m7705b(this.f7375b.f7738b);
        Collections.sort(b, C4174g.f7735j);
        ArrayList arrayList = new ArrayList();
        for (File name : b) {
            arrayList.add(name.getName());
        }
        return arrayList;
    }

    /* renamed from: c */
    public C3428h<Void> mo15533c(@NonNull Executor executor) {
        C4174g gVar = this.f7375b;
        List<File> c = gVar.mo15776c();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(((ArrayList) c).size());
        Iterator it = ((ArrayList) gVar.mo15776c()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(new C3997b(C4174g.f7734i.mo15766f(C4174g.m7709h(file)), file.getName()));
            } catch (IOException e) {
                C3982b bVar = C3982b.f7289a;
                bVar.mo15501g("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3996a0 a0Var = (C3996a0) it2.next();
            C4178c cVar = this.f7376c;
            Objects.requireNonNull(cVar);
            C4129v a = a0Var.mo15505a();
            C3429i iVar = new C3429i();
            C1586d<C4129v> dVar = cVar.f7751a;
            C1584b bVar2 = C1584b.HIGHEST;
            Objects.requireNonNull(a, "Null payload");
            C4176a aVar = new C4176a(iVar, a0Var);
            C1642i iVar2 = (C1642i) dVar;
            C1643j jVar = iVar2.f2886e;
            C1640h hVar = iVar2.f2882a;
            Objects.requireNonNull(hVar, "Null transportContext");
            String str = iVar2.f2883b;
            Objects.requireNonNull(str, "Null transportName");
            C1585c<T, byte[]> cVar2 = iVar2.f2885d;
            Objects.requireNonNull(cVar2, "Null transformer");
            C1583a aVar2 = iVar2.f2884c;
            Objects.requireNonNull(aVar2, "Null encoding");
            C1644k kVar = (C1644k) jVar;
            C1670e eVar = kVar.f2890c;
            C1640h.C1641a a2 = C1640h.m2161a();
            a2.mo11814b(hVar.mo11808b());
            a2.mo11815c(bVar2);
            C1628b.C1630b bVar3 = (C1628b.C1630b) a2;
            bVar3.f2863b = hVar.mo11809c();
            C1640h a3 = bVar3.mo11813a();
            C1625a.C1627b bVar4 = new C1625a.C1627b();
            bVar4.f2858f = new HashMap();
            bVar4.mo11805e(kVar.f2888a.mo11926a());
            bVar4.mo11807g(kVar.f2889b.mo11926a());
            bVar4.mo11806f(str);
            C4177b bVar5 = (C4177b) cVar2;
            bVar4.mo11804d(new C1633d(aVar2, C4178c.f7747b.mo15767g(a).getBytes(Charset.forName("UTF-8"))));
            bVar4.f2854b = null;
            eVar.mo11855a(a3, bVar4.mo11802b(), aVar);
            arrayList2.add(iVar.f6197a.mo14685g(executor, new C4020k0(this)));
        }
        return C1960d.m2753T0(arrayList2);
    }
}
