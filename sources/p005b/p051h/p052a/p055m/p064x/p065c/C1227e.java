package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p051h.p052a.p055m.p058v.C1110s;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.x.c.e */
public class C1227e implements C1115w<Bitmap>, C1110s {

    /* renamed from: g */
    public final Bitmap f1506g;

    /* renamed from: h */
    public final C1025d f1507h;

    public C1227e(@NonNull Bitmap bitmap, @NonNull C1025d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f1506g = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.f1507h = dVar;
    }

    @Nullable
    /* renamed from: c */
    public static C1227e m1168c(@Nullable Bitmap bitmap, @NonNull C1025d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1227e(bitmap, dVar);
    }

    /* renamed from: a */
    public int mo11004a() {
        return C1380j.m1471d(this.f1506g);
    }

    @NonNull
    /* renamed from: b */
    public Class<Bitmap> mo11005b() {
        return Bitmap.class;
    }

    @NonNull
    public Object get() {
        return this.f1506g;
    }

    public void initialize() {
        this.f1506g.prepareToDraw();
    }

    public void recycle() {
        this.f1507h.mo10896e(this.f1506g);
    }
}
