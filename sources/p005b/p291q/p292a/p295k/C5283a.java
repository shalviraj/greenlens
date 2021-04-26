package p005b.p291q.p292a.p295k;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalantis.ucrop.UCropActivity;
import java.io.File;
import java.lang.ref.WeakReference;
import p005b.p291q.p292a.C5273h;
import p005b.p291q.p292a.p293i.C5274a;
import p005b.p291q.p292a.p294j.C5280b;
import p005b.p291q.p292a.p294j.C5282d;

/* renamed from: b.q.a.k.a */
public class C5283a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    public final WeakReference<Context> f10551a;

    /* renamed from: b */
    public Bitmap f10552b;

    /* renamed from: c */
    public final RectF f10553c;

    /* renamed from: d */
    public final RectF f10554d;

    /* renamed from: e */
    public float f10555e;

    /* renamed from: f */
    public float f10556f;

    /* renamed from: g */
    public final int f10557g;

    /* renamed from: h */
    public final int f10558h;

    /* renamed from: i */
    public final Bitmap.CompressFormat f10559i;

    /* renamed from: j */
    public final int f10560j;

    /* renamed from: k */
    public final String f10561k;

    /* renamed from: l */
    public final String f10562l;

    /* renamed from: m */
    public final C5274a f10563m;

    /* renamed from: n */
    public int f10564n;

    /* renamed from: o */
    public int f10565o;

    /* renamed from: p */
    public int f10566p;

    /* renamed from: q */
    public int f10567q;

    public C5283a(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull C5282d dVar, @NonNull C5280b bVar, @Nullable C5274a aVar) {
        this.f10551a = new WeakReference<>(context);
        this.f10552b = bitmap;
        this.f10553c = dVar.f10547a;
        this.f10554d = dVar.f10548b;
        this.f10555e = dVar.f10549c;
        this.f10556f = dVar.f10550d;
        this.f10557g = bVar.f10537a;
        this.f10558h = bVar.f10538b;
        this.f10559i = bVar.f10539c;
        this.f10560j = bVar.f10540d;
        this.f10561k = bVar.f10541e;
        this.f10562l = bVar.f10542f;
        this.f10563m = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0279  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17225a() {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.f10557g
            r2 = 0
            if (r0 <= 0) goto L_0x005f
            int r0 = r1.f10558h
            if (r0 <= 0) goto L_0x005f
            android.graphics.RectF r0 = r1.f10553c
            float r0 = r0.width()
            float r3 = r1.f10555e
            float r0 = r0 / r3
            android.graphics.RectF r3 = r1.f10553c
            float r3 = r3.height()
            float r4 = r1.f10555e
            float r3 = r3 / r4
            int r4 = r1.f10557g
            float r5 = (float) r4
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x002b
            int r5 = r1.f10558h
            float r5 = (float) r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x005f
        L_0x002b:
            float r4 = (float) r4
            float r4 = r4 / r0
            int r0 = r1.f10558h
            float r0 = (float) r0
            float r0 = r0 / r3
            float r0 = java.lang.Math.min(r4, r0)
            android.graphics.Bitmap r3 = r1.f10552b
            int r4 = r3.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            android.graphics.Bitmap r5 = r1.f10552b
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r5, r2)
            android.graphics.Bitmap r4 = r1.f10552b
            if (r4 == r3) goto L_0x0058
            r4.recycle()
        L_0x0058:
            r1.f10552b = r3
            float r3 = r1.f10555e
            float r3 = r3 / r0
            r1.f10555e = r3
        L_0x005f:
            float r0 = r1.f10556f
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            float r0 = r1.f10556f
            android.graphics.Bitmap r4 = r1.f10552b
            int r4 = r4.getWidth()
            int r4 = r4 / 2
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r1.f10552b
            int r5 = r5.getHeight()
            int r5 = r5 / 2
            float r5 = (float) r5
            r9.setRotate(r0, r4, r5)
            android.graphics.Bitmap r4 = r1.f10552b
            r5 = 0
            r6 = 0
            int r7 = r4.getWidth()
            android.graphics.Bitmap r0 = r1.f10552b
            int r8 = r0.getHeight()
            r10 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.Bitmap r4 = r1.f10552b
            if (r4 == r0) goto L_0x009c
            r4.recycle()
        L_0x009c:
            r1.f10552b = r0
        L_0x009e:
            android.graphics.RectF r0 = r1.f10553c
            float r0 = r0.left
            android.graphics.RectF r4 = r1.f10554d
            float r4 = r4.left
            float r0 = r0 - r4
            float r4 = r1.f10555e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f10566p = r0
            android.graphics.RectF r0 = r1.f10553c
            float r0 = r0.top
            android.graphics.RectF r4 = r1.f10554d
            float r4 = r4.top
            float r0 = r0 - r4
            float r4 = r1.f10555e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f10567q = r0
            android.graphics.RectF r0 = r1.f10553c
            float r0 = r0.width()
            float r4 = r1.f10555e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f10564n = r0
            android.graphics.RectF r0 = r1.f10553c
            float r0 = r0.height()
            float r4 = r1.f10555e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f10565o = r0
            int r4 = r1.f10564n
            int r0 = java.lang.Math.max(r4, r0)
            float r0 = (float) r0
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r4 = 1
            int r0 = r0 + r4
            int r5 = r1.f10557g
            if (r5 <= 0) goto L_0x00f8
            int r5 = r1.f10558h
            if (r5 > 0) goto L_0x0146
        L_0x00f8:
            android.graphics.RectF r5 = r1.f10553c
            float r5 = r5.left
            android.graphics.RectF r6 = r1.f10554d
            float r6 = r6.left
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0146
            android.graphics.RectF r5 = r1.f10553c
            float r5 = r5.top
            android.graphics.RectF r6 = r1.f10554d
            float r6 = r6.top
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0146
            android.graphics.RectF r5 = r1.f10553c
            float r5 = r5.bottom
            android.graphics.RectF r6 = r1.f10554d
            float r6 = r6.bottom
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0146
            android.graphics.RectF r5 = r1.f10553c
            float r5 = r5.right
            android.graphics.RectF r6 = r1.f10554d
            float r6 = r6.right
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            float r0 = r1.f10556f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r0 = r2
            goto L_0x0147
        L_0x0146:
            r0 = r4
        L_0x0147:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Should crop: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "BitmapCropTask"
            android.util.Log.i(r5, r3)
            r3 = 0
            if (r0 == 0) goto L_0x022e
            androidx.exifinterface.media.ExifInterface r0 = new androidx.exifinterface.media.ExifInterface
            java.lang.String r5 = r1.f10561k
            r0.<init>((java.lang.String) r5)
            android.graphics.Bitmap r5 = r1.f10552b
            int r6 = r1.f10566p
            int r7 = r1.f10567q
            int r8 = r1.f10564n
            int r9 = r1.f10565o
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9)
            java.lang.ref.WeakReference<android.content.Context> r6 = r1.f10551a
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 != 0) goto L_0x0180
            goto L_0x01a2
        L_0x0180:
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x0227 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0227 }
            java.lang.String r8 = r1.f10562l     // Catch:{ all -> 0x0227 }
            r7.<init>(r8)     // Catch:{ all -> 0x0227 }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ all -> 0x0227 }
            java.io.OutputStream r3 = r6.openOutputStream(r7)     // Catch:{ all -> 0x0227 }
            android.graphics.Bitmap$CompressFormat r6 = r1.f10559i     // Catch:{ all -> 0x0227 }
            int r7 = r1.f10560j     // Catch:{ all -> 0x0227 }
            r5.compress(r6, r7, r3)     // Catch:{ all -> 0x0227 }
            r5.recycle()     // Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x01a2
            r3.close()     // Catch:{ IOException -> 0x01a2 }
        L_0x01a2:
            android.graphics.Bitmap$CompressFormat r3 = r1.f10559i
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0226
            int r3 = r1.f10564n
            int r5 = r1.f10565o
            java.lang.String r6 = r1.f10562l
            byte[] r7 = p005b.p291q.p292a.p296l.C5287b.f10582b
            java.lang.String r8 = "FNumber"
            java.lang.String r9 = "DateTime"
            java.lang.String r10 = "DateTimeDigitized"
            java.lang.String r11 = "ExposureTime"
            java.lang.String r12 = "Flash"
            java.lang.String r13 = "FocalLength"
            java.lang.String r14 = "GPSAltitude"
            java.lang.String r15 = "GPSAltitudeRef"
            java.lang.String r16 = "GPSDateStamp"
            java.lang.String r17 = "GPSLatitude"
            java.lang.String r18 = "GPSLatitudeRef"
            java.lang.String r19 = "GPSLongitude"
            java.lang.String r20 = "GPSLongitudeRef"
            java.lang.String r21 = "GPSProcessingMethod"
            java.lang.String r22 = "GPSTimeStamp"
            java.lang.String r23 = "PhotographicSensitivity"
            java.lang.String r24 = "Make"
            java.lang.String r25 = "Model"
            java.lang.String r26 = "SubSecTime"
            java.lang.String r27 = "SubSecTimeDigitized"
            java.lang.String r28 = "SubSecTimeOriginal"
            java.lang.String r29 = "WhiteBalance"
            java.lang.String[] r7 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            androidx.exifinterface.media.ExifInterface r8 = new androidx.exifinterface.media.ExifInterface     // Catch:{ IOException -> 0x021c }
            r8.<init>((java.lang.String) r6)     // Catch:{ IOException -> 0x021c }
        L_0x01e9:
            r6 = 22
            if (r2 >= r6) goto L_0x01ff
            r6 = r7[r2]     // Catch:{ IOException -> 0x021c }
            java.lang.String r9 = r0.getAttribute(r6)     // Catch:{ IOException -> 0x021c }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x021c }
            if (r10 != 0) goto L_0x01fc
            r8.setAttribute(r6, r9)     // Catch:{ IOException -> 0x021c }
        L_0x01fc:
            int r2 = r2 + 1
            goto L_0x01e9
        L_0x01ff:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x021c }
            r8.setAttribute(r0, r2)     // Catch:{ IOException -> 0x021c }
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x021c }
            r8.setAttribute(r0, r2)     // Catch:{ IOException -> 0x021c }
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = "0"
            r8.setAttribute(r0, r2)     // Catch:{ IOException -> 0x021c }
            r8.saveAttributes()     // Catch:{ IOException -> 0x021c }
            goto L_0x0226
        L_0x021c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "ImageHeaderParser"
            android.util.Log.d(r2, r0)
        L_0x0226:
            return r4
        L_0x0227:
            r0 = move-exception
            if (r3 == 0) goto L_0x022d
            r3.close()     // Catch:{ IOException -> 0x022d }
        L_0x022d:
            throw r0
        L_0x022e:
            java.lang.String r0 = r1.f10561k
            java.lang.String r4 = r1.f10562l
            boolean r5 = r0.equalsIgnoreCase(r4)
            if (r5 == 0) goto L_0x0239
            goto L_0x026b
        L_0x0239:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0270 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0270 }
            r6.<init>(r0)     // Catch:{ all -> 0x0270 }
            r5.<init>(r6)     // Catch:{ all -> 0x0270 }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ all -> 0x0270 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x026c }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x026c }
            r6.<init>(r4)     // Catch:{ all -> 0x026c }
            r0.<init>(r6)     // Catch:{ all -> 0x026c }
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch:{ all -> 0x026c }
            r8 = 0
            long r10 = r5.size()     // Catch:{ all -> 0x026c }
            r7 = r5
            r12 = r3
            r7.transferTo(r8, r10, r12)     // Catch:{ all -> 0x026c }
            r5.close()     // Catch:{ all -> 0x026c }
            r5.close()
            if (r3 == 0) goto L_0x026b
            r3.close()
        L_0x026b:
            return r2
        L_0x026c:
            r0 = move-exception
            r2 = r3
            r3 = r5
            goto L_0x0272
        L_0x0270:
            r0 = move-exception
            r2 = r3
        L_0x0272:
            if (r3 == 0) goto L_0x0277
            r3.close()
        L_0x0277:
            if (r2 == 0) goto L_0x027c
            r2.close()
        L_0x027c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.p295k.C5283a.mo17225a():boolean");
    }

    @Nullable
    public Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Bitmap bitmap = this.f10552b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f10554d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            mo17225a();
            this.f10552b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public void onPostExecute(@Nullable Object obj) {
        Throwable th = (Throwable) obj;
        C5274a aVar = this.f10563m;
        if (aVar == null) {
            return;
        }
        if (th == null) {
            Uri fromFile = Uri.fromFile(new File(this.f10562l));
            C5274a aVar2 = this.f10563m;
            int i = this.f10566p;
            int i2 = this.f10567q;
            int i3 = this.f10564n;
            int i4 = this.f10565o;
            C5273h hVar = (C5273h) aVar2;
            UCropActivity uCropActivity = hVar.f10533a;
            uCropActivity.setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", fromFile).putExtra("com.yalantis.ucrop.CropAspectRatio", uCropActivity.f11544s.getTargetAspectRatio()).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
            hVar.f10533a.finish();
            return;
        }
        C5273h hVar2 = (C5273h) aVar;
        hVar2.f10533a.mo22887b(th);
        hVar2.f10533a.finish();
    }
}
