package p298d.p299a.p300a.p301a.p303y0.p412n;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.n.h */
public final class C7635h extends C6890k implements C6851a<String[]> {

    /* renamed from: g */
    public final /* synthetic */ C7636i f15120g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7635h(C7636i iVar) {
        super(0);
        this.f15120g = iVar;
    }

    public Object invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f15120g.f15122a.f15136g);
        C7638k kVar = this.f15120g.f15123b;
        if (kVar != null) {
            arrayList.add(C6888i.m12444k("under-migration:", kVar.f15136g));
        }
        for (Map.Entry next : this.f15120g.f15124c.entrySet()) {
            StringBuilder t = C0843a.m459t('@');
            t.append((String) next.getKey());
            t.append(':');
            t.append(((C7638k) next.getValue()).f15136g);
            arrayList.add(t.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
