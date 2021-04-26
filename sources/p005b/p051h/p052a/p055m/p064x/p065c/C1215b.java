package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;
import p005b.p051h.p052a.p055m.C0964c;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0982s;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;

/* renamed from: b.h.a.m.x.c.b */
public class C1215b implements C0982s<BitmapDrawable> {

    /* renamed from: a */
    public final C1025d f1491a;

    /* renamed from: b */
    public final C0982s<Bitmap> f1492b;

    public C1215b(C1025d dVar, C0982s<Bitmap> sVar) {
        this.f1491a = dVar;
        this.f1492b = sVar;
    }

    /* renamed from: a */
    public boolean mo10825a(@NonNull Object obj, @NonNull File file, @NonNull C0979p pVar) {
        return this.f1492b.mo10825a(new C1227e(((BitmapDrawable) ((C1115w) obj).get()).getBitmap(), this.f1491a), file, pVar);
    }

    @NonNull
    /* renamed from: b */
    public C0964c mo10838b(@NonNull C0979p pVar) {
        return this.f1492b.mo10838b(pVar);
    }
}
