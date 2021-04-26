package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p078s.C1367a;

/* renamed from: b.h.a.m.x.c.g */
public class C1229g implements C0981r<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C1245m f1508a;

    public C1229g(C1245m mVar) {
        this.f1508a = mVar;
    }

    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        AtomicReference<byte[]> atomicReference = C1367a.f1777a;
        return this.f1508a.mo11085b(new C1367a.C1368a((ByteBuffer) obj), i, i2, pVar, C1245m.f1532k);
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        Objects.requireNonNull(this.f1508a);
        return true;
    }
}
