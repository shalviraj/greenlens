package p005b.p051h.p052a.p055m.p064x;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0963b;
import p005b.p051h.p052a.p055m.C0976o;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0980q;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p064x.p065c.C1226d;
import p005b.p051h.p052a.p055m.p064x.p065c.C1227e;
import p005b.p051h.p052a.p055m.p064x.p065c.C1239l;
import p005b.p051h.p052a.p055m.p064x.p065c.C1245m;
import p005b.p051h.p052a.p055m.p064x.p065c.C1253r;

@RequiresApi(api = 28)
/* renamed from: b.h.a.m.x.a */
public abstract class C1208a<T> implements C0981r<ImageDecoder.Source, T> {

    /* renamed from: a */
    public final C1253r f1479a = C1253r.m1232a();

    /* renamed from: b.h.a.m.x.a$a */
    public class C1209a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ int f1480a;

        /* renamed from: b */
        public final /* synthetic */ int f1481b;

        /* renamed from: c */
        public final /* synthetic */ boolean f1482c;

        /* renamed from: d */
        public final /* synthetic */ C0963b f1483d;

        /* renamed from: e */
        public final /* synthetic */ C1239l f1484e;

        /* renamed from: f */
        public final /* synthetic */ C0980q f1485f;

        /* renamed from: b.h.a.m.x.a$a$a */
        public class C1210a implements ImageDecoder.OnPartialImageListener {
            public C1210a(C1209a aVar) {
            }

            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C1209a(int i, int i2, boolean z, C0963b bVar, C1239l lVar, C0980q qVar) {
            this.f1480a = i;
            this.f1481b = i2;
            this.f1482c = z;
            this.f1483d = bVar;
            this.f1484e = lVar;
            this.f1485f = qVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (C1208a.this.f1479a.mo11089b(this.f1480a, this.f1481b, this.f1482c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f1483d == C0963b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C1210a(this));
            Size size = imageInfo.getSize();
            int i = this.f1480a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f1481b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f1484e.mo11083b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder u = C0843a.m460u("Resizing from [");
                u.append(size.getWidth());
                u.append("x");
                u.append(size.getHeight());
                u.append("] to [");
                u.append(round);
                u.append("x");
                u.append(round2);
                u.append("] scaleFactor: ");
                u.append(b);
                Log.v("ImageDecoder", u.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f1485f == C0980q.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i3 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    @Nullable
    /* renamed from: c */
    public final C1115w<T> mo10836a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull C0979p pVar) {
        C0963b bVar = (C0963b) pVar.mo10833c(C1245m.f1527f);
        C1239l lVar = (C1239l) pVar.mo10833c(C1239l.f1522f);
        C0976o oVar = C1245m.f1530i;
        boolean z = pVar.mo10833c(oVar) != null && ((Boolean) pVar.mo10833c(oVar)).booleanValue();
        C1226d dVar = (C1226d) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C1209a(i, i2, z, bVar, lVar, (C0980q) pVar.mo10833c(C1245m.f1528g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder u = C0843a.m460u("Decoded [");
            u.append(decodeBitmap.getWidth());
            u.append("x");
            u.append(decodeBitmap.getHeight());
            u.append("] for [");
            u.append(i);
            u.append("x");
            u.append(i2);
            u.append("]");
            Log.v("BitmapImageDecoder", u.toString());
        }
        return new C1227e(decodeBitmap, dVar.f1505b);
    }
}
