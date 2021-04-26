package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1026e;

/* renamed from: b.h.a.m.x.c.n */
public final class C1248n {

    /* renamed from: a */
    public static final C1025d f1540a = new C1249a();

    /* renamed from: b.h.a.m.x.c.n$a */
    public class C1249a extends C1026e {
        /* renamed from: e */
        public void mo10896e(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    @Nullable
    /* renamed from: a */
    public static C1115w<Bitmap> m1223a(C1025d dVar, Drawable drawable, int i, int i2) {
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                }
                z = true;
            } else if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                if (current.getIntrinsicWidth() > 0) {
                    i = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i2 = current.getIntrinsicHeight();
                }
                Lock lock = C1265z.f1576d;
                lock.lock();
                Bitmap d = dVar.mo10895d(i, i2, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(d);
                    current.setBounds(0, 0, i, i2);
                    current.draw(canvas);
                    canvas.setBitmap((Bitmap) null);
                    lock.unlock();
                    bitmap = d;
                    z = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                }
                z = true;
            }
            sb.append(str);
            Log.w("DrawableToBitmap", sb.toString());
            z = true;
        }
        if (!z) {
            dVar = f1540a;
        }
        return C1227e.m1168c(bitmap, dVar);
    }
}
