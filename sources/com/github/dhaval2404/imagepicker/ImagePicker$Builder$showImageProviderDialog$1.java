package com.github.dhaval2404.imagepicker;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.github.dhaval2404.imagepicker.listener.ResultListener;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo24462d2 = {"com/github/dhaval2404/imagepicker/ImagePicker$Builder$showImageProviderDialog$1", "Lcom/github/dhaval2404/imagepicker/listener/ResultListener;", "Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "t", "Ld/r;", "onResult", "(Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;)V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class ImagePicker$Builder$showImageProviderDialog$1 implements ResultListener<ImageProvider> {
    public final /* synthetic */ int $reqCode;
    public final /* synthetic */ ImagePicker.Builder this$0;

    public ImagePicker$Builder$showImageProviderDialog$1(ImagePicker.Builder builder, int i) {
        this.this$0 = builder;
        this.$reqCode = i;
    }

    public void onResult(ImageProvider imageProvider) {
        if (imageProvider != null) {
            this.this$0.imageProvider = imageProvider;
            C6862l access$getImageProviderInterceptor$p = this.this$0.imageProviderInterceptor;
            if (access$getImageProviderInterceptor$p != null) {
                C6777r rVar = (C6777r) access$getImageProviderInterceptor$p.invoke(this.this$0.imageProvider);
            }
            this.this$0.startActivity(this.$reqCode);
        }
    }
}
