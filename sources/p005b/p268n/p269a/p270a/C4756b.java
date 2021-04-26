package p005b.p268n.p269a.p270a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Stack;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.p055m.C0963b;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p064x.p065c.C1227e;
import p005b.p051h.p052a.p055m.p064x.p065c.C1239l;
import p005b.p051h.p052a.p055m.p064x.p065c.C1258u;
import p005b.p051h.p052a.p055m.p064x.p069g.C1292i;
import p005b.p051h.p052a.p055m.p064x.p070h.C1298e;
import p005b.p080i.p081a.C1419e;
import p005b.p080i.p081a.C1422f;
import p005b.p080i.p081a.C1489g;
import p005b.p268n.p269a.p270a.p272f.C4770a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: b.n.a.a.b */
public final class C4756b implements C1298e<C1422f, BitmapDrawable> {

    /* renamed from: a */
    public final C1025d f9105a;

    /* renamed from: b */
    public final Resources f9106b;

    /* renamed from: c */
    public final C4770a f9107c;

    /* renamed from: b.n.a.a.b$a */
    public static final class C4757a implements C4770a {

        /* renamed from: a */
        public final C1025d f9108a;

        public C4757a(@NonNull C1025d dVar) {
            this.f9108a = dVar;
        }
    }

    public C4756b(@NonNull Context context, @NonNull C0929c cVar) {
        this.f9106b = context.getResources();
        C1025d dVar = cVar.f839g;
        this.f9105a = dVar;
        this.f9107c = new C4757a(dVar);
    }

    /* renamed from: a */
    public C1115w<BitmapDrawable> mo11138a(@NonNull C1115w<C1422f> wVar, @Nullable C0979p pVar) {
        C0963b bVar;
        if (wVar instanceof C4759d) {
            C1239l lVar = pVar == null ? null : (C1239l) pVar.mo10833c(C1239l.f1522f);
            if (lVar != null) {
                C4759d dVar = (C4759d) wVar;
                float b = lVar.mo11083b(Math.round(wVar.get().mo11298d()), Math.round(wVar.get().mo11297c()), dVar.f9110h, dVar.f9111i);
                C1422f fVar = wVar.get();
                fVar.mo11303i(fVar.mo11298d() * b);
                fVar.mo11302h(fVar.mo11297c() * b);
            }
        }
        C1422f fVar2 = wVar.get();
        C4770a aVar = this.f9107c;
        if (pVar == null) {
            bVar = null;
        } else {
            bVar = (C0963b) pVar.mo10833c(C1292i.f1629a);
        }
        Bitmap d = ((C4757a) aVar).f9108a.mo10895d(Math.round(fVar2.mo11298d()), Math.round(fVar2.mo11297c()), (bVar != null && bVar.ordinal() == 1) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(d);
        C1422f.C1423a aVar2 = new C1422f.C1423a(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        C1489g gVar = new C1489g(canvas, 96.0f);
        gVar.f2126b = fVar2;
        C1422f.C1445e0 e0Var = fVar2.f1910a;
        if (e0Var == null) {
            C1489g.m1628a0("Nothing to render. Document is empty.", new Object[0]);
        } else {
            C1422f.C1423a aVar3 = e0Var.f2091o;
            C1419e eVar = e0Var.f2075n;
            gVar.f2127c = new C1489g.C1497h(gVar);
            gVar.f2128d = new Stack<>();
            gVar.mo11366W(gVar.f2127c, C1422f.C1433d0.m1537a());
            C1489g.C1497h hVar = gVar.f2127c;
            hVar.f2162f = null;
            hVar.f2164h = false;
            gVar.f2128d.push(new C1489g.C1497h(gVar, hVar));
            gVar.f2130f = new Stack<>();
            gVar.f2129e = new Stack<>();
            gVar.mo11377i(e0Var);
            gVar.mo11363T();
            C1422f.C1423a aVar4 = new C1422f.C1423a(aVar2);
            C1422f.C1465o oVar = e0Var.f2027r;
            if (oVar != null) {
                aVar4.f1915c = oVar.mo11328c(gVar, aVar4.f1915c);
            }
            C1422f.C1465o oVar2 = e0Var.f2028s;
            if (oVar2 != null) {
                aVar4.f1916d = oVar2.mo11328c(gVar, aVar4.f1916d);
            }
            gVar.mo11354K(e0Var, aVar4, aVar3, eVar);
            gVar.mo11362S();
        }
        return C1258u.m1248c(this.f9106b, new C1227e(d, this.f9105a));
    }
}
