package androidx.core.graphics;

import android.graphics.ImageDecoder;
import kotlin.Metadata;
import p298d.p344x.p345b.C6867q;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo24462d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Ld/r;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, mo24463k = 3, mo24464mv = {1, 4, 0})
public final class ImageDecoderKt$decodeBitmap$1 implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ C6867q $action;

    public ImageDecoderKt$decodeBitmap$1(C6867q qVar) {
        this.$action = qVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C6888i.m12439f(imageDecoder, "decoder");
        C6888i.m12439f(imageInfo, "info");
        C6888i.m12439f(source, "source");
        this.$action.mo22971j(imageDecoder, imageInfo, source);
    }
}
