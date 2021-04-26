package p005b.p006a.p007a.p024o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.appfoundry.previewer.model.Marker;
import java.util.Objects;
import p005b.p038f.p039a.C0849e;
import p005b.p051h.p052a.p074q.p075h.C1349c;
import p005b.p051h.p052a.p074q.p076i.C1362d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p129c.C1984d;
import p005b.p096l.p097a.p113c.p131e.p139h.C2700d;
import p005b.p096l.p097a.p113c.p142g.C3069a;
import p005b.p096l.p097a.p113c.p142g.p144g.C3094b;
import p005b.p096l.p097a.p113c.p142g.p144g.C3096d;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6901v;

/* renamed from: b.a.a.o.e */
public final class C0822e extends C1349c<Bitmap> {

    /* renamed from: j */
    public final /* synthetic */ C6901v f645j;

    /* renamed from: k */
    public final /* synthetic */ C3069a f646k;

    /* renamed from: l */
    public final /* synthetic */ Marker f647l;

    public C0822e(C6901v vVar, C3069a aVar, Marker marker) {
        this.f645j = vVar;
        this.f646k = aVar;
        this.f647l = marker;
    }

    /* renamed from: b */
    public void mo10649b(Object obj, C1362d dVar) {
        Bitmap bitmap = (Bitmap) obj;
        C6888i.m12438e(bitmap, "resource");
        C6901v vVar = this.f645j;
        T a = this.f646k.mo14029a(C0820c.m300B(this.f647l));
        C6888i.m12437d(a, "map.addMarker(withMarkerOptions(marker))");
        vVar.f13801g = a;
        C3094b bVar = (C3094b) this.f645j.f13801g;
        String J = C0849e.m486J(this.f647l);
        Objects.requireNonNull(bVar);
        try {
            bVar.f5223a.mo13206V(new C1984d(J));
            C3094b bVar2 = (C3094b) this.f645j.f13801g;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 100, 100, false);
            try {
                C2700d dVar2 = C1960d.f3517g;
                C0823f.m380l(dVar2, "IBitmapDescriptorFactory is not initialized");
                C1980b S0 = dVar2.mo13204S0(createScaledBitmap);
                Objects.requireNonNull(S0, "null reference");
                Objects.requireNonNull(bVar2);
                try {
                    bVar2.f5223a.mo13207V0(S0);
                } catch (RemoteException e) {
                    throw new C3096d(e);
                }
            } catch (RemoteException e2) {
                throw new C3096d(e2);
            }
        } catch (RemoteException e3) {
            throw new C3096d(e3);
        }
    }

    /* renamed from: g */
    public void mo10650g(Drawable drawable) {
    }
}
