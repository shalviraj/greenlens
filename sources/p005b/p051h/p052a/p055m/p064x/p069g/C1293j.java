package p005b.p051h.p052a.p055m.p064x.p069g;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

/* renamed from: b.h.a.m.x.g.j */
public class C1293j implements C0981r<InputStream, C1282c> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f1631a;

    /* renamed from: b */
    public final C0981r<ByteBuffer, C1282c> f1632b;

    /* renamed from: c */
    public final C1023b f1633c;

    public C1293j(List<ImageHeaderParser> list, C0981r<ByteBuffer, C1282c> rVar, C1023b bVar) {
        this.f1631a = list;
        this.f1632b = rVar;
        this.f1633c = bVar;
    }

    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f1632b.mo10836a(ByteBuffer.wrap(bArr), i, i2, pVar);
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        return !((Boolean) pVar.mo10833c(C1292i.f1630b)).booleanValue() && C0823f.m348Q(this.f1631a, (InputStream) obj, this.f1633c) == ImageHeaderParser.ImageType.GIF;
    }
}
