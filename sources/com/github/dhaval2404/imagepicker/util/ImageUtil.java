package com.github.dhaval2404.imagepicker.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/util/ImageUtil;", "", "Ljava/io/File;", "imageFile", "", "reqWidth", "reqHeight", "Landroid/graphics/Bitmap;", "decodeSampledBitmapFromFile", "(Ljava/io/File;FF)Landroid/graphics/Bitmap;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "candidate", "targetOptions", "", "canUseForInBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Z", "Landroid/graphics/Bitmap$Config;", "config", "getBytesPerPixel", "(Landroid/graphics/Bitmap$Config;)I", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "quality", "", "destinationPath", "compressImage", "(Ljava/io/File;FFLandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;)Ljava/io/File;", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class ImageUtil {
    public static final ImageUtil INSTANCE = new ImageUtil();

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {}, mo24462d2 = {}, mo24463k = 3, mo24464mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            iArr[Bitmap.Config.RGB_565.ordinal()] = 2;
            iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        }
    }

    private ImageUtil() {
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int i5 = 2;
        int i6 = i3 / 2;
        int i7 = i4 / 2;
        while (i6 / i5 >= i2 && i7 / i5 >= i) {
            i5 *= 2;
        }
        return i5;
    }

    private final boolean canUseForInBitmap(Bitmap bitmap, BitmapFactory.Options options) {
        int i = options.outWidth;
        int i2 = options.inSampleSize;
        int i3 = (options.outHeight / i2) * (i / i2);
        Bitmap.Config config = bitmap.getConfig();
        C6888i.m12435b(config, "candidate.config");
        return i3 * getBytesPerPixel(config) <= bitmap.getAllocationByteCount();
    }

    private final Bitmap decodeSampledBitmapFromFile(File file, float f, float f2) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i = options.outHeight;
        int i2 = options.outWidth;
        float f3 = (float) i2;
        float f4 = (float) i;
        float f5 = f3 / f4;
        float f6 = f / f2;
        if (f4 > f2 || f3 > f) {
            if (f5 < f6) {
                i2 = (int) ((f2 / f4) * f3);
                i = (int) f2;
            } else {
                if (f5 > f6) {
                    f2 = (f / f3) * f4;
                }
                i = (int) f2;
                i2 = (int) f;
            }
        }
        options.inSampleSize = calculateInSampleSize(options, i2, i);
        options.inJustDecodeBounds = false;
        if (decodeFile != null && canUseForInBitmap(decodeFile, options)) {
            options.inMutable = true;
            options.inBitmap = decodeFile;
        }
        options.inTempStorage = new byte[16384];
        try {
            decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        try {
            bitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmap = null;
        }
        float f7 = (float) i2;
        float f8 = f7 / ((float) options.outWidth);
        float f9 = (float) i;
        float f10 = f9 / ((float) options.outHeight);
        float f11 = f7 / 2.0f;
        float f12 = f9 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f10, f11, f12);
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            canvas.setMatrix(matrix);
            if (decodeFile != null) {
                canvas.drawBitmap(decodeFile, f11 - ((float) (decodeFile.getWidth() / 2)), f12 - ((float) (decodeFile.getHeight() / 2)), new Paint(2));
                decodeFile.recycle();
                try {
                    int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
                    Matrix matrix2 = new Matrix();
                    if (attributeInt == 6) {
                        matrix2.postRotate(90.0f);
                    } else if (attributeInt == 3) {
                        matrix2.postRotate(180.0f);
                    } else if (attributeInt == 8) {
                        matrix2.postRotate(270.0f);
                    }
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return bitmap;
                }
            } else {
                C6888i.m12445l();
                throw null;
            }
        } else {
            C6888i.m12445l();
            throw null;
        }
    }

    private final int getBytesPerPixel(Bitmap.Config config) {
        int i = WhenMappings.$EnumSwitchMapping$0[config.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 2 : 1;
        }
        return 4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File compressImage(java.io.File r3, float r4, float r5, android.graphics.Bitmap.CompressFormat r6, int r7, java.lang.String r8) {
        /*
            r2 = this;
            java.lang.String r0 = "imageFile"
            p298d.p344x.p346c.C6888i.m12439f(r3, r0)
            java.lang.String r0 = "compressFormat"
            p298d.p344x.p346c.C6888i.m12439f(r6, r0)
            java.lang.String r0 = "destinationPath"
            p298d.p344x.p346c.C6888i.m12439f(r8, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            java.io.File r0 = r0.getParentFile()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0021
            r0.mkdirs()
        L_0x0021:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0043 }
            r1.<init>(r8)     // Catch:{ all -> 0x0043 }
            android.graphics.Bitmap r3 = r2.decodeSampledBitmapFromFile(r3, r4, r5)     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x003c
            r3.compress(r6, r7, r1)     // Catch:{ all -> 0x0040 }
            r1.flush()
            r1.close()
            java.io.File r3 = new java.io.File
            r3.<init>(r8)
            return r3
        L_0x003c:
            p298d.p344x.p346c.C6888i.m12445l()     // Catch:{ all -> 0x0040 }
            throw r0
        L_0x0040:
            r3 = move-exception
            r0 = r1
            goto L_0x0044
        L_0x0043:
            r3 = move-exception
        L_0x0044:
            if (r0 == 0) goto L_0x004c
            r0.flush()
            r0.close()
        L_0x004c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.util.ImageUtil.compressImage(java.io.File, float, float, android.graphics.Bitmap$CompressFormat, int, java.lang.String):java.io.File");
    }
}
