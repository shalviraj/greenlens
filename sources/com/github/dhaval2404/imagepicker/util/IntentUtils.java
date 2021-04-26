package com.github.dhaval2404.imagepicker.util;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.FileProvider;
import com.github.dhaval2404.imagepicker.C5456R;
import com.segment.analytics.integrations.BasePayload;
import java.io.File;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0007J!\u0010\t\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/util/IntentUtils;", "", "", "", "mimeTypes", "Landroid/content/Intent;", "getGalleryDocumentIntent", "([Ljava/lang/String;)Landroid/content/Intent;", "getLegacyGalleryPickIntent", "applyImageTypes", "(Landroid/content/Intent;[Ljava/lang/String;)Landroid/content/Intent;", "Landroid/content/Context;", "context", "getGalleryIntent", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Ljava/io/File;", "file", "getCameraIntent", "(Landroid/content/Context;Ljava/io/File;)Landroid/content/Intent;", "", "isCameraHardwareAvailable", "(Landroid/content/Context;)Z", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class IntentUtils {
    public static final IntentUtils INSTANCE = new IntentUtils();

    private IntentUtils() {
    }

    private final Intent applyImageTypes(Intent intent, String[] strArr) {
        intent.setType("image/*");
        if (!(strArr.length == 0)) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        return intent;
    }

    private final Intent getGalleryDocumentIntent(String[] strArr) {
        Intent applyImageTypes = applyImageTypes(new Intent("android.intent.action.OPEN_DOCUMENT"), strArr);
        applyImageTypes.addCategory("android.intent.category.OPENABLE");
        return applyImageTypes;
    }

    private final Intent getLegacyGalleryPickIntent(String[] strArr) {
        return applyImageTypes(new Intent("android.intent.action.PICK"), strArr);
    }

    public final Intent getCameraIntent(Context context, File file) {
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(file, "file");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", FileProvider.getUriForFile(context, context.getPackageName() + context.getString(C5456R.string.image_picker_provider_authority_suffix), file));
        return intent;
    }

    public final Intent getGalleryIntent(Context context, String[] strArr) {
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(strArr, "mimeTypes");
        Intent galleryDocumentIntent = getGalleryDocumentIntent(strArr);
        return galleryDocumentIntent.resolveActivity(context.getPackageManager()) != null ? galleryDocumentIntent : getLegacyGalleryPickIntent(strArr);
    }

    public final boolean isCameraHardwareAvailable(Context context) {
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }
}
