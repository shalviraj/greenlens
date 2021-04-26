package p005b.p051h.p052a.p055m.p064x.p070h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p064x.p065c.C1227e;
import p005b.p051h.p052a.p055m.p064x.p069g.C1282c;

/* renamed from: b.h.a.m.x.h.c */
public final class C1296c implements C1298e<Drawable, byte[]> {

    /* renamed from: a */
    public final C1025d f1637a;

    /* renamed from: b */
    public final C1298e<Bitmap, byte[]> f1638b;

    /* renamed from: c */
    public final C1298e<C1282c, byte[]> f1639c;

    public C1296c(@NonNull C1025d dVar, @NonNull C1298e<Bitmap, byte[]> eVar, @NonNull C1298e<C1282c, byte[]> eVar2) {
        this.f1637a = dVar;
        this.f1638b = eVar;
        this.f1639c = eVar2;
    }

    @Nullable
    /* renamed from: a */
    public C1115w<byte[]> mo11138a(@NonNull C1115w<Drawable> wVar, @NonNull C0979p pVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f1638b.mo11138a(C1227e.m1168c(((BitmapDrawable) drawable).getBitmap(), this.f1637a), pVar);
        }
        if (drawable instanceof C1282c) {
            return this.f1639c.mo11138a(wVar, pVar);
        }
        return null;
    }
}
