package p005b.p051h.p052a.p055m.p064x.p069g;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Objects;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p064x.p065c.C1227e;

/* renamed from: b.h.a.m.x.g.f */
public class C1286f implements C0983t<C1282c> {

    /* renamed from: b */
    public final C0983t<Bitmap> f1605b;

    public C1286f(C0983t<Bitmap> tVar) {
        Objects.requireNonNull(tVar, "Argument must not be null");
        this.f1605b = tVar;
    }

    @NonNull
    /* renamed from: a */
    public C1115w<C1282c> mo10828a(@NonNull Context context, @NonNull C1115w<C1282c> wVar, int i, int i2) {
        C1282c cVar = wVar.get();
        C1227e eVar = new C1227e(cVar.mo11115b(), C0929c.m652b(context).f839g);
        C1115w<Bitmap> a = this.f1605b.mo10828a(context, eVar, i, i2);
        if (!eVar.equals(a)) {
            eVar.recycle();
        }
        C0983t<Bitmap> tVar = this.f1605b;
        cVar.f1593g.f1604a.mo11136c(tVar, a.get());
        return wVar;
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        this.f1605b.mo10372b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1286f) {
            return this.f1605b.equals(((C1286f) obj).f1605b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1605b.hashCode();
    }
}
