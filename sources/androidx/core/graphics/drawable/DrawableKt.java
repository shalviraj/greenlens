package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0033Px;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u00012\b\b\u0003\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo24462d2 = {"Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "left", "top", "right", "bottom", "Ld/r;", "updateBounds", "(Landroid/graphics/drawable/Drawable;IIII)V", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class DrawableKt {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r0.getConfig() == r9) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap toBitmap(android.graphics.drawable.Drawable r6, @androidx.annotation.C0033Px int r7, @androidx.annotation.C0033Px int r8, android.graphics.Bitmap.Config r9) {
        /*
            java.lang.String r0 = "$this$toBitmap"
            p298d.p344x.p346c.C6888i.m12439f(r6, r0)
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            java.lang.String r1 = "bitmap"
            if (r0 == 0) goto L_0x0042
            if (r9 == 0) goto L_0x001d
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            p298d.p344x.p346c.C6888i.m12435b(r0, r1)
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != r9) goto L_0x0042
        L_0x001d:
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            int r9 = r6.getIntrinsicWidth()
            if (r7 != r9) goto L_0x0033
            int r9 = r6.getIntrinsicHeight()
            if (r8 != r9) goto L_0x0033
            android.graphics.Bitmap r6 = r6.getBitmap()
            p298d.p344x.p346c.C6888i.m12435b(r6, r1)
            return r6
        L_0x0033:
            android.graphics.Bitmap r6 = r6.getBitmap()
            r9 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r7, r8, r9)
            java.lang.String r7 = "Bitmap.createScaledBitma…map, width, height, true)"
            p298d.p344x.p346c.C6888i.m12435b(r6, r7)
            return r6
        L_0x0042:
            android.graphics.Rect r0 = r6.getBounds()
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r0 = r0.bottom
            if (r9 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0053:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r7, r8, r9)
            r5 = 0
            r6.setBounds(r5, r5, r7, r8)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r9)
            r6.draw(r7)
            r6.setBounds(r2, r3, r4, r0)
            p298d.p344x.p346c.C6888i.m12435b(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.DrawableKt.toBitmap(android.graphics.drawable.Drawable, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i, i2, config);
    }

    public static final void updateBounds(Drawable drawable, @C0033Px int i, @C0033Px int i2, @C0033Px int i3, @C0033Px int i4) {
        C6888i.m12439f(drawable, "$this$updateBounds");
        drawable.setBounds(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i2 = drawable.getBounds().top;
        }
        if ((i5 & 4) != 0) {
            i3 = drawable.getBounds().right;
        }
        if ((i5 & 8) != 0) {
            i4 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i, i2, i3, i4);
    }
}
