package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: g */
        public final boolean f11188g;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.f11188g = z;
        }

        public boolean hasAlpha() {
            return this.f11188g;
        }
    }

    @NonNull
    /* renamed from: a */
    ImageType mo11070a(@NonNull ByteBuffer byteBuffer);

    /* renamed from: b */
    int mo11071b(@NonNull InputStream inputStream, @NonNull C1023b bVar);

    @NonNull
    /* renamed from: c */
    ImageType mo11072c(@NonNull InputStream inputStream);
}
