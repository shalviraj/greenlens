package com.github.dhaval2404.imagepicker.provider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.ActivityCompat;
import com.github.dhaval2404.imagepicker.C5456R;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.github.dhaval2404.imagepicker.util.FileUtil;
import com.github.dhaval2404.imagepicker.util.IntentUtils;
import com.github.dhaval2404.imagepicker.util.PermissionUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u0004R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006*"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/CameraProvider;", "Lcom/github/dhaval2404/imagepicker/provider/BaseProvider;", "Ld/r;", "checkPermission", "()V", "startCameraIntent", "Landroid/content/Intent;", "data", "handleResult", "(Landroid/content/Intent;)V", "requestPermission", "Landroid/content/Context;", "context", "", "isPermissionGranted", "(Landroid/content/Context;)Z", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "startIntent", "", "requestCode", "onRequestPermissionsResult", "(I)V", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "onFailure", "Ljava/io/File;", "mFileDir", "Ljava/io/File;", "mAskCameraPermission", "Z", "mCameraFile", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "activity", "<init>", "(Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;)V", "Companion", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class CameraProvider extends BaseProvider {
    private static final int CAMERA_INTENT_REQ_CODE = 4281;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int PERMISSION_INTENT_REQ_CODE = 4282;
    private static final String[] REQUIRED_PERMISSIONS = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] REQUIRED_PERMISSIONS_EXTENDED = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
    private static final String STATE_CAMERA_FILE = "state.camera_file";
    private final boolean mAskCameraPermission = PermissionUtil.INSTANCE.isPermissionInManifest(this, "android.permission.CAMERA");
    private File mCameraFile;
    private File mFileDir;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/CameraProvider$Companion;", "", "", "CAMERA_INTENT_REQ_CODE", "I", "PERMISSION_INTENT_REQ_CODE", "", "", "REQUIRED_PERMISSIONS", "[Ljava/lang/String;", "REQUIRED_PERMISSIONS_EXTENDED", "STATE_CAMERA_FILE", "Ljava/lang/String;", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraProvider(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        C6888i.m12439f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intent intent = imagePickerActivity.getIntent();
        C6888i.m12435b(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString(ImagePicker.EXTRA_SAVE_DIRECTORY);
            if (string != null) {
                this.mFileDir = new File(string);
                return;
            }
            return;
        }
        C6888i.m12445l();
        throw null;
    }

    private final void checkPermission() {
        if (isPermissionGranted(this)) {
            startCameraIntent();
        } else {
            requestPermission();
        }
    }

    private final void handleResult(Intent intent) {
        ImagePickerActivity activity = getActivity();
        File file = this.mCameraFile;
        if (file != null) {
            activity.setImage(file);
        } else {
            C6888i.m12445l();
            throw null;
        }
    }

    private final boolean isPermissionGranted(Context context) {
        if (!this.mAskCameraPermission || !PermissionUtil.INSTANCE.isPermissionGranted(context, REQUIRED_PERMISSIONS_EXTENDED)) {
            return !this.mAskCameraPermission && PermissionUtil.INSTANCE.isPermissionGranted(context, REQUIRED_PERMISSIONS);
        }
        return true;
    }

    private final void requestPermission() {
        if (this.mAskCameraPermission) {
            ActivityCompat.requestPermissions(getActivity(), REQUIRED_PERMISSIONS_EXTENDED, PERMISSION_INTENT_REQ_CODE);
        } else {
            ActivityCompat.requestPermissions(getActivity(), REQUIRED_PERMISSIONS, PERMISSION_INTENT_REQ_CODE);
        }
    }

    private final void startCameraIntent() {
        File imageFile$default = FileUtil.getImageFile$default(FileUtil.INSTANCE, this.mFileDir, (String) null, 2, (Object) null);
        this.mCameraFile = imageFile$default;
        if (imageFile$default == null || !imageFile$default.exists()) {
            setError(C5456R.string.error_failed_to_create_camera_image_file);
            return;
        }
        getActivity().startActivityForResult(IntentUtils.INSTANCE.getCameraIntent(this, imageFile$default), CAMERA_INTENT_REQ_CODE);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != CAMERA_INTENT_REQ_CODE) {
            return;
        }
        if (i2 == -1) {
            handleResult(intent);
        } else {
            setResultCancel();
        }
    }

    public void onFailure() {
        File file = this.mCameraFile;
        if (file != null) {
            file.delete();
        }
    }

    public final void onRequestPermissionsResult(int i) {
        if (i != PERMISSION_INTENT_REQ_CODE) {
            return;
        }
        if (isPermissionGranted(this)) {
            startCameraIntent();
            return;
        }
        String string = getString(this.mAskCameraPermission ? C5456R.string.permission_camera_extended_denied : C5456R.string.permission_camera_denied);
        C6888i.m12435b(string, "getString(errorRes)");
        setError(string);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.mCameraFile = (File) (bundle != null ? bundle.getSerializable(STATE_CAMERA_FILE) : null);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6888i.m12439f(bundle, "outState");
        bundle.putSerializable(STATE_CAMERA_FILE, this.mCameraFile);
    }

    public final void startIntent() {
        checkPermission();
    }
}
