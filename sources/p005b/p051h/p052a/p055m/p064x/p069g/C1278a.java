package p005b.p051h.p052a.p055m.p064x.p069g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p054l.C0959c;
import p005b.p051h.p052a.p054l.C0960d;
import p005b.p051h.p052a.p054l.C0961e;
import p005b.p051h.p052a.p055m.C0963b;
import p005b.p051h.p052a.p055m.C0968g;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p064x.C1211b;
import p005b.p051h.p052a.p078s.C1376f;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.m.x.g.a */
public class C1278a implements C0981r<ByteBuffer, C1282c> {

    /* renamed from: f */
    public static final C1279a f1583f = new C1279a();

    /* renamed from: g */
    public static final C1280b f1584g = new C1280b();

    /* renamed from: a */
    public final Context f1585a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f1586b;

    /* renamed from: c */
    public final C1280b f1587c;

    /* renamed from: d */
    public final C1279a f1588d;

    /* renamed from: e */
    public final C1281b f1589e;

    @VisibleForTesting
    /* renamed from: b.h.a.m.x.g.a$a */
    public static class C1279a {
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.x.g.a$b */
    public static class C1280b {

        /* renamed from: a */
        public final Queue<C0960d> f1590a = new ArrayDeque(0);

        public C1280b() {
            char[] cArr = C1380j.f1801a;
        }

        /* renamed from: a */
        public synchronized void mo11112a(C0960d dVar) {
            dVar.f973b = null;
            dVar.f974c = null;
            this.f1590a.offer(dVar);
        }
    }

    public C1278a(Context context, List<ImageHeaderParser> list, C1025d dVar, C1023b bVar) {
        C1280b bVar2 = f1584g;
        C1279a aVar = f1583f;
        this.f1585a = context.getApplicationContext();
        this.f1586b = list;
        this.f1588d = aVar;
        this.f1589e = new C1281b(dVar, bVar);
        this.f1587c = bVar2;
    }

    /* renamed from: d */
    public static int m1284d(C0959c cVar, int i, int i2) {
        int min = Math.min(cVar.f967g / i2, cVar.f966f / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder x = C0843a.m463x("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i, "x");
            x.append(i2);
            x.append("], actual dimens: [");
            x.append(cVar.f966f);
            x.append("x");
            x.append(cVar.f967g);
            x.append("]");
            Log.v("BufferGifDecoder", x.toString());
        }
        return max;
    }

    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        C0960d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C1280b bVar = this.f1587c;
        synchronized (bVar) {
            C0960d poll = bVar.f1590a.poll();
            if (poll == null) {
                poll = new C0960d();
            }
            dVar = poll;
            dVar.f973b = null;
            Arrays.fill(dVar.f972a, (byte) 0);
            dVar.f974c = new C0959c();
            dVar.f975d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f973b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f973b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return mo11111c(byteBuffer, i, i2, dVar, pVar);
        } finally {
            this.f1587c.mo11112a(dVar);
        }
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) pVar.mo10833c(C1292i.f1630b)).booleanValue()) {
            if ((byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : C0823f.m349R(this.f1586b, new C0968g(byteBuffer))) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: c */
    public final C1285e mo11111c(ByteBuffer byteBuffer, int i, int i2, C0960d dVar, C0979p pVar) {
        int i3 = C1376f.f1793b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            C0959c b = dVar.mo10816b();
            if (b.f963c > 0) {
                if (b.f962b == 0) {
                    Bitmap.Config config = pVar.mo10833c(C1292i.f1629a) == C0963b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int d = m1284d(b, i, i2);
                    C1279a aVar = this.f1588d;
                    C1281b bVar = this.f1589e;
                    Objects.requireNonNull(aVar);
                    C0961e eVar = new C0961e(bVar, b, byteBuffer, d);
                    eVar.mo10823i(config);
                    eVar.f987k = (eVar.f987k + 1) % eVar.f988l.f963c;
                    Bitmap b2 = eVar.mo10808b();
                    if (b2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder u = C0843a.m460u("Decoded GIF from stream in ");
                            u.append(C1376f.m1460a(elapsedRealtimeNanos));
                            Log.v("BufferGifDecoder", u.toString());
                        }
                        return null;
                    }
                    C1285e eVar2 = new C1285e(new C1282c(this.f1585a, eVar, (C1211b) C1211b.f1487b, i, i2, b2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder u2 = C0843a.m460u("Decoded GIF from stream in ");
                        u2.append(C1376f.m1460a(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", u2.toString());
                    }
                    return eVar2;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder u3 = C0843a.m460u("Decoded GIF from stream in ");
                u3.append(C1376f.m1460a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", u3.toString());
            }
        }
    }
}
