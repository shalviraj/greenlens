package p005b.p051h.p052a.p055m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

/* renamed from: b.h.a.m.i */
public class C0970i implements C0972k {

    /* renamed from: a */
    public final /* synthetic */ InputStream f1014a;

    /* renamed from: b */
    public final /* synthetic */ C1023b f1015b;

    public C0970i(InputStream inputStream, C1023b bVar) {
        this.f1014a = inputStream;
        this.f1015b = bVar;
    }

    /* renamed from: a */
    public int mo10827a(ImageHeaderParser imageHeaderParser) {
        try {
            return imageHeaderParser.mo11071b(this.f1014a, this.f1015b);
        } finally {
            this.f1014a.reset();
        }
    }
}
