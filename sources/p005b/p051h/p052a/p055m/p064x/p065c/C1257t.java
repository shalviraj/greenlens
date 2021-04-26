package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p078s.C1367a;

@RequiresApi(api = 28)
/* renamed from: b.h.a.m.x.c.t */
public final class C1257t implements C0981r<InputStream, Bitmap> {

    /* renamed from: a */
    public final C1226d f1557a = new C1226d();

    @Nullable
    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        InputStream inputStream = (InputStream) obj;
        AtomicReference<byte[]> atomicReference = C1367a.f1777a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = C1367a.f1777a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                C1367a.f1777a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f1557a.mo10836a(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i, i2, pVar);
            }
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
