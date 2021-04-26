package com.github.dhaval2404.imagepicker.provider;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import com.github.dhaval2404.imagepicker.C5456R;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.github.dhaval2404.imagepicker.util.FileUriUtils;
import com.github.dhaval2404.imagepicker.util.FileUtil;
import com.yalantis.ucrop.UCropActivity;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0016\u0010$\u001a\u00020 8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/CropProvider;", "Lcom/github/dhaval2404/imagepicker/provider/BaseProvider;", "Ljava/io/File;", "file", "Ld/r;", "cropImage", "(Ljava/io/File;)V", "handleResult", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onRestoreInstanceState", "", "isCropEnabled", "()Z", "startIntent", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onFailure", "()V", "mMaxWidth", "I", "mFileDir", "Ljava/io/File;", "mMaxHeight", "", "mCropAspectX", "F", "mCropImageFile", "mCropAspectY", "mCrop", "Z", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "activity", "<init>", "(Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;)V", "Companion", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class CropProvider extends BaseProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String STATE_CROP_FILE = "state.crop_file";
    private static final String TAG = CropProvider.class.getSimpleName();
    private final boolean mCrop;
    private final float mCropAspectX;
    private final float mCropAspectY;
    private File mCropImageFile;
    private File mFileDir;
    private final int mMaxHeight;
    private final int mMaxWidth;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/CropProvider$Companion;", "", "", "STATE_CROP_FILE", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "TAG", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropProvider(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        C6888i.m12439f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intent intent = imagePickerActivity.getIntent();
        C6888i.m12435b(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.mMaxWidth = extras.getInt(ImagePicker.EXTRA_MAX_WIDTH, 0);
            this.mMaxHeight = extras.getInt(ImagePicker.EXTRA_MAX_HEIGHT, 0);
            this.mCrop = extras.getBoolean(ImagePicker.EXTRA_CROP, false);
            this.mCropAspectX = extras.getFloat(ImagePicker.EXTRA_CROP_X, 0.0f);
            this.mCropAspectY = extras.getFloat(ImagePicker.EXTRA_CROP_Y, 0.0f);
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

    private final void cropImage(File file) {
        int i;
        Uri fromFile = Uri.fromFile(file);
        FileUriUtils fileUriUtils = FileUriUtils.INSTANCE;
        C6888i.m12435b(fromFile, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        String imageExtension = fileUriUtils.getImageExtension(fromFile);
        FileUtil fileUtil = FileUtil.INSTANCE;
        File imageFile = fileUtil.getImageFile(this.mFileDir, imageExtension);
        this.mCropImageFile = imageFile;
        if (imageFile != null) {
            if (imageFile == null) {
                C6888i.m12445l();
                throw null;
            } else if (imageFile.exists()) {
                Bundle bundle = new Bundle();
                bundle.putString("com.yalantis.ucrop.CompressionFormatName", fileUtil.getCompressFormat(imageExtension).name());
                Uri fromFile2 = Uri.fromFile(this.mCropImageFile);
                Intent intent = new Intent();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("com.yalantis.ucrop.InputUri", fromFile);
                bundle2.putParcelable("com.yalantis.ucrop.OutputUri", fromFile2);
                bundle2.putAll(bundle);
                float f = this.mCropAspectX;
                float f2 = (float) 0;
                if (f > f2) {
                    float f3 = this.mCropAspectY;
                    if (f3 > f2) {
                        bundle2.putFloat("com.yalantis.ucrop.AspectRatioX", f);
                        bundle2.putFloat("com.yalantis.ucrop.AspectRatioY", f3);
                    }
                }
                int i2 = this.mMaxWidth;
                if (i2 > 0 && (i = this.mMaxHeight) > 0) {
                    if (i2 < 10) {
                        i2 = 10;
                    }
                    if (i < 10) {
                        i = 10;
                    }
                    bundle2.putInt("com.yalantis.ucrop.MaxSizeX", i2);
                    bundle2.putInt("com.yalantis.ucrop.MaxSizeY", i);
                }
                try {
                    ImagePickerActivity activity = getActivity();
                    intent.setClass(activity, UCropActivity.class);
                    intent.putExtras(bundle2);
                    activity.startActivityForResult(intent, 69);
                    return;
                } catch (ActivityNotFoundException e) {
                    setError("uCrop not specified in manifest file.Add UCropActivity in Manifest<activity\n    android:name=\"com.yalantis.ucrop.UCropActivity\"\n    android:screenOrientation=\"portrait\"\n    android:theme=\"@style/Theme.AppCompat.Light.NoActionBar\"/>");
                    e.printStackTrace();
                    return;
                }
            }
        }
        Log.e(TAG, "Failed to create crop image file");
        setError(C5456R.string.error_failed_to_crop_image);
    }

    private final void handleResult(File file) {
        if (file != null) {
            getActivity().setCropImage(file);
        } else {
            setError(C5456R.string.error_failed_to_crop_image);
        }
    }

    public final boolean isCropEnabled() {
        return this.mCrop;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 69) {
            return;
        }
        if (i2 == -1) {
            handleResult(this.mCropImageFile);
        } else {
            setResultCancel();
        }
    }

    public void onFailure() {
        File file = this.mCropImageFile;
        if (file != null) {
            file.delete();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        this.mCropImageFile = (File) (bundle != null ? bundle.getSerializable(STATE_CROP_FILE) : null);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6888i.m12439f(bundle, "outState");
        bundle.putSerializable(STATE_CROP_FILE, this.mCropImageFile);
    }

    public final void startIntent(File file) {
        C6888i.m12439f(file, "file");
        cropImage(file);
    }
}
