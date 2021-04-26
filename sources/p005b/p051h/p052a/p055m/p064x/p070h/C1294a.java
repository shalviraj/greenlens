package p005b.p051h.p052a.p055m.p064x.p070h;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p064x.p066d.C1269b;

/* renamed from: b.h.a.m.x.h.a */
public class C1294a implements C1298e<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f1634a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b */
    public final int f1635b = 100;

    @Nullable
    /* renamed from: a */
    public C1115w<byte[]> mo11138a(@NonNull C1115w<Bitmap> wVar, @NonNull C0979p pVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f1634a, this.f1635b, byteArrayOutputStream);
        wVar.recycle();
        return new C1269b(byteArrayOutputStream.toByteArray());
    }
}
