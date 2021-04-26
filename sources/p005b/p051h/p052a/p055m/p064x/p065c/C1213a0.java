package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.x.c.a0 */
public final class C1213a0 implements C0981r<Bitmap, Bitmap> {

    /* renamed from: b.h.a.m.x.c.a0$a */
    public static final class C1214a implements C1115w<Bitmap> {

        /* renamed from: g */
        public final Bitmap f1490g;

        public C1214a(@NonNull Bitmap bitmap) {
            this.f1490g = bitmap;
        }

        /* renamed from: a */
        public int mo11004a() {
            return C1380j.m1471d(this.f1490g);
        }

        @NonNull
        /* renamed from: b */
        public Class<Bitmap> mo11005b() {
            return Bitmap.class;
        }

        @NonNull
        public Object get() {
            return this.f1490g;
        }

        public void recycle() {
        }
    }

    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        return new C1214a((Bitmap) obj);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
