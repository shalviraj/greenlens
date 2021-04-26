package p005b.p051h.p052a.p055m.p064x.p065c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;

/* renamed from: b.h.a.m.x.c.o */
public class C1250o implements C0983t<Drawable> {

    /* renamed from: b */
    public final C0983t<Bitmap> f1541b;

    /* renamed from: c */
    public final boolean f1542c;

    public C1250o(C0983t<Bitmap> tVar, boolean z) {
        this.f1541b = tVar;
        this.f1542c = z;
    }

    @NonNull
    /* renamed from: a */
    public C1115w<Drawable> mo10828a(@NonNull Context context, @NonNull C1115w<Drawable> wVar, int i, int i2) {
        C1025d dVar = C0929c.m652b(context).f839g;
        Drawable drawable = wVar.get();
        C1115w<Bitmap> a = C1248n.m1223a(dVar, drawable, i, i2);
        if (a != null) {
            C1115w<Bitmap> a2 = this.f1541b.mo10828a(context, a, i, i2);
            if (!a2.equals(a)) {
                return C1258u.m1248c(context.getResources(), a2);
            }
            a2.recycle();
            return wVar;
        } else if (!this.f1542c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        this.f1541b.mo10372b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1250o) {
            return this.f1541b.equals(((C1250o) obj).f1541b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1541b.hashCode();
    }
}
