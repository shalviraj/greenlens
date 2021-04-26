package p005b.p051h.p052a.p055m.p064x.p069g;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p005b.p051h.p052a.p055m.p058v.C1110s;
import p005b.p051h.p052a.p055m.p064x.p067e.C1271b;
import p005b.p051h.p052a.p055m.p064x.p069g.C1287g;

/* renamed from: b.h.a.m.x.g.e */
public class C1285e extends C1271b<C1282c> implements C1110s {
    public C1285e(C1282c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public int mo11004a() {
        C1287g gVar = ((C1282c) this.f1580g).f1593g.f1604a;
        return gVar.f1606a.mo10813f() + gVar.f1620o;
    }

    @NonNull
    /* renamed from: b */
    public Class<C1282c> mo11005b() {
        return C1282c.class;
    }

    public void initialize() {
        ((C1282c) this.f1580g).mo11115b().prepareToDraw();
    }

    public void recycle() {
        ((C1282c) this.f1580g).stop();
        C1282c cVar = (C1282c) this.f1580g;
        cVar.f1596j = true;
        C1287g gVar = cVar.f1593g.f1604a;
        gVar.f1608c.clear();
        Bitmap bitmap = gVar.f1617l;
        if (bitmap != null) {
            gVar.f1610e.mo10896e(bitmap);
            gVar.f1617l = null;
        }
        gVar.f1611f = false;
        C1287g.C1288a aVar = gVar.f1614i;
        if (aVar != null) {
            gVar.f1609d.mo10775n(aVar);
            gVar.f1614i = null;
        }
        C1287g.C1288a aVar2 = gVar.f1616k;
        if (aVar2 != null) {
            gVar.f1609d.mo10775n(aVar2);
            gVar.f1616k = null;
        }
        C1287g.C1288a aVar3 = gVar.f1619n;
        if (aVar3 != null) {
            gVar.f1609d.mo10775n(aVar3);
            gVar.f1619n = null;
        }
        gVar.f1606a.clear();
        gVar.f1615j = true;
    }
}
