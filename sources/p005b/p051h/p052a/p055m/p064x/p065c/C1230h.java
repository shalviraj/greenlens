package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;

@RequiresApi(api = 28)
/* renamed from: b.h.a.m.x.c.h */
public final class C1230h implements C0981r<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C1226d f1509a = new C1226d();

    @Nullable
    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        return this.f1509a.mo10836a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, pVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
