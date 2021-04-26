package p005b.p051h.p052a.p055m.p064x.p065c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p051h.p052a.p055m.p058v.C1110s;
import p005b.p051h.p052a.p055m.p058v.C1115w;

/* renamed from: b.h.a.m.x.c.u */
public final class C1258u implements C1115w<BitmapDrawable>, C1110s {

    /* renamed from: g */
    public final Resources f1558g;

    /* renamed from: h */
    public final C1115w<Bitmap> f1559h;

    public C1258u(@NonNull Resources resources, @NonNull C1115w<Bitmap> wVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f1558g = resources;
        this.f1559h = wVar;
    }

    @Nullable
    /* renamed from: c */
    public static C1115w<BitmapDrawable> m1248c(@NonNull Resources resources, @Nullable C1115w<Bitmap> wVar) {
        if (wVar == null) {
            return null;
        }
        return new C1258u(resources, wVar);
    }

    /* renamed from: a */
    public int mo11004a() {
        return this.f1559h.mo11004a();
    }

    @NonNull
    /* renamed from: b */
    public Class<BitmapDrawable> mo11005b() {
        return BitmapDrawable.class;
    }

    @NonNull
    public Object get() {
        return new BitmapDrawable(this.f1558g, this.f1559h.get());
    }

    public void initialize() {
        C1115w<Bitmap> wVar = this.f1559h;
        if (wVar instanceof C1110s) {
            ((C1110s) wVar).initialize();
        }
    }

    public void recycle() {
        this.f1559h.recycle();
    }
}
