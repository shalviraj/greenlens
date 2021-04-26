package p005b.p051h.p052a.p055m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;

/* renamed from: b.h.a.m.f */
public class C0967f implements C0973l {

    /* renamed from: a */
    public final /* synthetic */ InputStream f1010a;

    public C0967f(InputStream inputStream) {
        this.f1010a = inputStream;
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo10826a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.mo11072c(this.f1010a);
        } finally {
            this.f1010a.reset();
        }
    }
}
