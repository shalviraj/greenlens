package p005b.p051h.p052a.p055m.p064x.p067e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p051h.p052a.p055m.p058v.C1110s;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p064x.p069g.C1282c;

/* renamed from: b.h.a.m.x.e.b */
public abstract class C1271b<T extends Drawable> implements C1115w<T>, C1110s {

    /* renamed from: g */
    public final T f1580g;

    public C1271b(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f1580g = t;
    }

    @NonNull
    public Object get() {
        Drawable.ConstantState constantState = this.f1580g.getConstantState();
        return constantState == null ? this.f1580g : constantState.newDrawable();
    }

    public void initialize() {
        Bitmap b;
        T t = this.f1580g;
        if (t instanceof BitmapDrawable) {
            b = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof C1282c) {
            b = ((C1282c) t).mo11115b();
        } else {
            return;
        }
        b.prepareToDraw();
    }
}
