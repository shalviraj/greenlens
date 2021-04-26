package com.github.dhaval2404.imagepicker.provider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.ActivityCompat;
import com.github.dhaval2404.imagepicker.C5456R;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.github.dhaval2404.imagepicker.util.FileUriUtils;
import com.github.dhaval2404.imagepicker.util.IntentUtils;
import com.github.dhaval2404.imagepicker.util.PermissionUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/GalleryProvider;", "Lcom/github/dhaval2404/imagepicker/provider/BaseProvider;", "Ld/r;", "checkPermission", "()V", "startGalleryIntent", "Landroid/content/Intent;", "data", "handleResult", "(Landroid/content/Intent;)V", "startIntent", "", "requestCode", "onRequestPermissionsResult", "(I)V", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "mimeTypes", "[Ljava/lang/String;", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "activity", "<init>", "(Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;)V", "Companion", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class GalleryProvider extends BaseProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int GALLERY_INTENT_REQ_CODE = 4261;
    private static final int PERMISSION_INTENT_REQ_CODE = 4262;
    private static final String[] REQUIRED_PERMISSIONS = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private final String[] mimeTypes;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/GalleryProvider$Companion;", "", "", "GALLERY_INTENT_REQ_CODE", "I", "PERMISSION_INTENT_REQ_CODE", "", "", "REQUIRED_PERMISSIONS", "[Ljava/lang/String;", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryProvider(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        C6888i.m12439f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intent intent = imagePickerActivity.getIntent();
        C6888i.m12435b(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String[] stringArray = extras.getStringArray(ImagePicker.EXTRA_MIME_TYPES);
            this.mimeTypes = stringArray == null ? new String[0] : stringArray;
            return;
        }
        C6888i.m12445l();
        throw null;
    }

    private final void checkPermission() {
        PermissionUtil permissionUtil = PermissionUtil.INSTANCE;
        String[] strArr = REQUIRED_PERMISSIONS;
        if (!permissionUtil.isPermissionGranted(this, strArr)) {
            ActivityCompat.requestPermissions(getActivity(), strArr, PERMISSION_INTENT_REQ_CODE);
        } else {
            startGalleryIntent();
        }
    }

    private final void handleResult(Intent intent) {
        Uri data = intent != null ? intent.getData() : null;
        if (data != null) {
            String realPath = FileUriUtils.INSTANCE.getRealPath(getActivity(), data);
            if (!(realPath == null || realPath.length() == 0)) {
                getActivity().setImage(new File(realPath));
                return;
            }
        }
        setError(C5456R.string.error_failed_pick_gallery_image);
    }

    private final void startGalleryIntent() {
        getActivity().startActivityForResult(IntentUtils.INSTANCE.getGalleryIntent(getActivity(), this.mimeTypes), GALLERY_INTENT_REQ_CODE);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != GALLERY_INTENT_REQ_CODE) {
            return;
        }
        if (i2 == -1) {
            handleResult(intent);
        } else {
            setResultCancel();
        }
    }

    public final void onRequestPermissionsResult(int i) {
        if (i != PERMISSION_INTENT_REQ_CODE) {
            return;
        }
        if (PermissionUtil.INSTANCE.isPermissionGranted(this, REQUIRED_PERMISSIONS)) {
            startGalleryIntent();
            return;
        }
        String string = getString(C5456R.string.permission_gallery_denied);
        C6888i.m12435b(string, "getString(R.string.permission_gallery_denied)");
        setError(string);
    }

    public final void startIntent() {
        checkPermission();
    }
}
