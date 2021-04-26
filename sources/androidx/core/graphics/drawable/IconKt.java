package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0005H\b¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0007H\b¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, mo24462d2 = {"Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "toAdaptiveIcon", "(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;", "toIcon", "Landroid/net/Uri;", "(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;", "", "([B)Landroid/graphics/drawable/Icon;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class IconKt {
    @RequiresApi(26)
    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        C6888i.m12439f(bitmap, "$this$toAdaptiveIcon");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        C6888i.m12435b(createWithAdaptiveBitmap, "Icon.createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Bitmap bitmap) {
        C6888i.m12439f(bitmap, "$this$toIcon");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        C6888i.m12435b(createWithBitmap, "Icon.createWithBitmap(this)");
        return createWithBitmap;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Uri uri) {
        C6888i.m12439f(uri, "$this$toIcon");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        C6888i.m12435b(createWithContentUri, "Icon.createWithContentUri(this)");
        return createWithContentUri;
    }

    @RequiresApi(26)
    public static final Icon toIcon(byte[] bArr) {
        C6888i.m12439f(bArr, "$this$toIcon");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        C6888i.m12435b(createWithData, "Icon.createWithData(this, 0, size)");
        return createWithData;
    }
}
