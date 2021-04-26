package p005b.p051h.p052a.p055m.p064x.p065c;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

@RequiresApi(27)
/* renamed from: b.h.a.m.x.c.p */
public final class C1251p implements ImageHeaderParser {
    @NonNull
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo11070a(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public int mo11071b(@NonNull InputStream inputStream, @NonNull C1023b bVar) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @NonNull
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo11072c(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
