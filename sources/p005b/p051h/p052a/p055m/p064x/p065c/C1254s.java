package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p051h.p052a.p055m.C0969h;
import p005b.p051h.p052a.p055m.C0971j;
import p005b.p051h.p052a.p055m.p056u.C1000k;
import p005b.p051h.p052a.p055m.p056u.C1003m;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;

/* renamed from: b.h.a.m.x.c.s */
public interface C1254s {

    /* renamed from: b.h.a.m.x.c.s$a */
    public static final class C1255a implements C1254s {

        /* renamed from: a */
        public final C1000k f1551a;

        /* renamed from: b */
        public final C1023b f1552b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f1553c;

        public C1255a(InputStream inputStream, List<ImageHeaderParser> list, C1023b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f1552b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f1553c = list;
            this.f1551a = new C1000k(inputStream, bVar);
        }

        @Nullable
        /* renamed from: a */
        public Bitmap mo11090a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f1551a.mo10855a(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo11091b() {
            C1260w wVar = this.f1551a.f1050a;
            synchronized (wVar) {
                wVar.f1563i = wVar.f1561g.length;
            }
        }

        /* renamed from: c */
        public int mo11092c() {
            return C0823f.m337F(this.f1553c, this.f1551a.mo10855a(), this.f1552b);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo11093d() {
            return C0823f.m348Q(this.f1553c, this.f1551a.mo10855a(), this.f1552b);
        }
    }

    @RequiresApi(21)
    /* renamed from: b.h.a.m.x.c.s$b */
    public static final class C1256b implements C1254s {

        /* renamed from: a */
        public final C1023b f1554a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f1555b;

        /* renamed from: c */
        public final C1003m f1556c;

        public C1256b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C1023b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f1554a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f1555b = list;
            this.f1556c = new C1003m(parcelFileDescriptor);
        }

        @Nullable
        /* renamed from: a */
        public Bitmap mo11090a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f1556c.mo10855a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo11091b() {
        }

        /* renamed from: c */
        public int mo11092c() {
            return C0823f.m338G(this.f1555b, new C0971j(this.f1556c, this.f1554a));
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo11093d() {
            return C0823f.m349R(this.f1555b, new C0969h(this.f1556c, this.f1554a));
        }
    }

    @Nullable
    /* renamed from: a */
    Bitmap mo11090a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo11091b();

    /* renamed from: c */
    int mo11092c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo11093d();
}
