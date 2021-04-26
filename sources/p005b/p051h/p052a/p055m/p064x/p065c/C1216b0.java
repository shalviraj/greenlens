package p005b.p051h.p052a.p055m.p064x.p065c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0976o;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;

/* renamed from: b.h.a.m.x.c.b0 */
public class C1216b0<T> implements C0981r<T, Bitmap> {

    /* renamed from: d */
    public static final C0976o<Long> f1493d = new C0976o<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1217a());

    /* renamed from: e */
    public static final C0976o<Integer> f1494e = new C0976o<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1218b());

    /* renamed from: f */
    public static final C1221e f1495f = new C1221e();

    /* renamed from: a */
    public final C1222f<T> f1496a;

    /* renamed from: b */
    public final C1025d f1497b;

    /* renamed from: c */
    public final C1221e f1498c;

    /* renamed from: b.h.a.m.x.c.b0$a */
    public class C1217a implements C0976o.C0978b<Long> {

        /* renamed from: a */
        public final ByteBuffer f1499a = ByteBuffer.allocate(8);

        /* renamed from: a */
        public void mo10832a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f1499a) {
                this.f1499a.position(0);
                messageDigest.update(this.f1499a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: b.h.a.m.x.c.b0$b */
    public class C1218b implements C0976o.C0978b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f1500a = ByteBuffer.allocate(4);

        /* renamed from: a */
        public void mo10832a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f1500a) {
                    this.f1500a.position(0);
                    messageDigest.update(this.f1500a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: b.h.a.m.x.c.b0$c */
    public static final class C1219c implements C1222f<AssetFileDescriptor> {
        public C1219c(C1217a aVar) {
        }

        /* renamed from: a */
        public void mo11066a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @RequiresApi(23)
    /* renamed from: b.h.a.m.x.c.b0$d */
    public static final class C1220d implements C1222f<ByteBuffer> {
        /* renamed from: a */
        public void mo11066a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new C1225c0(this, (ByteBuffer) obj));
        }
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.x.c.b0$e */
    public static class C1221e {
    }

    @VisibleForTesting
    /* renamed from: b.h.a.m.x.c.b0$f */
    public interface C1222f<T> {
        /* renamed from: a */
        void mo11066a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: b.h.a.m.x.c.b0$g */
    public static final class C1223g implements C1222f<ParcelFileDescriptor> {
        /* renamed from: a */
        public void mo11066a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public C1216b0(C1025d dVar, C1222f<T> fVar) {
        C1221e eVar = f1495f;
        this.f1497b = dVar;
        this.f1496a = fVar;
        this.f1498c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m1157c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, p005b.p051h.p052a.p055m.p064x.p065c.C1239l r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0060
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0060
            if (r14 == r0) goto L_0x0060
            b.h.a.m.x.c.l r0 = p005b.p051h.p052a.p055m.p064x.p065c.C1239l.f1520d
            if (r15 == r0) goto L_0x0060
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0051 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0051 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0051 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0051 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0051 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.mo11083b(r0, r1, r13, r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r0     // Catch:{ all -> 0x0051 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0051 }
            float r14 = (float) r1     // Catch:{ all -> 0x0051 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0051 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r13 = move-exception
            r14 = 3
            java.lang.String r15 = "VideoDecoder"
            boolean r14 = android.util.Log.isLoggable(r15, r14)
            if (r14 == 0) goto L_0x0060
            java.lang.String r14 = "Exception trying to decode frame on oreo+"
            android.util.Log.d(r15, r14, r13)
        L_0x0060:
            r13 = 0
        L_0x0061:
            if (r13 != 0) goto L_0x0067
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x0067:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p064x.p065c.C1216b0.m1157c(android.media.MediaMetadataRetriever, long, int, int, int, b.h.a.m.x.c.l):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public C1115w<Bitmap> mo10836a(@NonNull T t, int i, int i2, @NonNull C0979p pVar) {
        long longValue = ((Long) pVar.mo10833c(f1493d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) pVar.mo10833c(f1494e);
            if (num == null) {
                num = 2;
            }
            C1239l lVar = (C1239l) pVar.mo10833c(C1239l.f1522f);
            if (lVar == null) {
                lVar = C1239l.f1521e;
            }
            C1239l lVar2 = lVar;
            Objects.requireNonNull(this.f1498c);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f1496a.mo11066a(mediaMetadataRetriever, t);
                Bitmap c = m1157c(mediaMetadataRetriever, longValue, num.intValue(), i, i2, lVar2);
                mediaMetadataRetriever.release();
                return C1227e.m1168c(c, this.f1497b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException(C0843a.m448i("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull T t, @NonNull C0979p pVar) {
        return true;
    }
}
