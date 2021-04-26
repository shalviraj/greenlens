package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p064x.p067e.C1271b;
import p005b.p051h.p052a.p055m.p064x.p067e.C1274e;

/* renamed from: b.h.a.m.x.c.x */
public class C1262x implements C0981r<Uri, Bitmap> {

    /* renamed from: a */
    public final C1274e f1567a;

    /* renamed from: b */
    public final C1025d f1568b;

    public C1262x(C1274e eVar, C1025d dVar) {
        this.f1567a = eVar;
        this.f1568b = dVar;
    }

    @Nullable
    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        C1115w c = this.f1567a.mo11110c((Uri) obj);
        if (c == null) {
            return null;
        }
        return C1248n.m1223a(this.f1568b, (Drawable) ((C1271b) c).get(), i, i2);
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
