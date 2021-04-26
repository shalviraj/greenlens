package com.github.dhaval2404.imagepicker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.github.dhaval2404.imagepicker.provider.CameraProvider;
import com.github.dhaval2404.imagepicker.provider.CompressionProvider;
import com.github.dhaval2404.imagepicker.provider.CropProvider;
import com.github.dhaval2404.imagepicker.provider.GalleryProvider;
import com.segment.analytics.integrations.BasePayload;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b5\u0010\u001eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u000bJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010\u000bJ\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "restoreInstanceState", "(Landroid/os/Bundle;)V", "loadBundle", "Ljava/io/File;", "file", "setResult", "(Ljava/io/File;)V", "onCreate", "outState", "onSaveInstanceState", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "()V", "setImage", "setCropImage", "setCompressedImage", "setResultCancel", "message", "setError", "(Ljava/lang/String;)V", "Lcom/github/dhaval2404/imagepicker/provider/CropProvider;", "mCropProvider", "Lcom/github/dhaval2404/imagepicker/provider/CropProvider;", "mCropFile", "Ljava/io/File;", "Lcom/github/dhaval2404/imagepicker/provider/CameraProvider;", "mCameraProvider", "Lcom/github/dhaval2404/imagepicker/provider/CameraProvider;", "Lcom/github/dhaval2404/imagepicker/provider/CompressionProvider;", "mCompressionProvider", "Lcom/github/dhaval2404/imagepicker/provider/CompressionProvider;", "mImageFile", "Lcom/github/dhaval2404/imagepicker/provider/GalleryProvider;", "mGalleryProvider", "Lcom/github/dhaval2404/imagepicker/provider/GalleryProvider;", "<init>", "Companion", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class ImagePickerActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String STATE_IMAGE_FILE = "state.image_file";
    private static final String TAG = "image_picker";
    private HashMap _$_findViewCache;
    private CameraProvider mCameraProvider;
    private CompressionProvider mCompressionProvider;
    private File mCropFile;
    private CropProvider mCropProvider;
    private GalleryProvider mGalleryProvider;
    private File mImageFile;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/ImagePickerActivity$Companion;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "getCancelledIntent$imagepicker_release", "(Landroid/content/Context;)Landroid/content/Intent;", "getCancelledIntent", "", "STATE_IMAGE_FILE", "Ljava/lang/String;", "TAG", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent getCancelledIntent$imagepicker_release(Context context) {
            C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
            Intent intent = new Intent();
            intent.putExtra(ImagePicker.EXTRA_ERROR, context.getString(C5456R.string.error_task_cancelled));
            return intent;
        }
    }

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {}, mo24462d2 = {}, mo24463k = 3, mo24464mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            ImageProvider.values();
            int[] iArr = new int[3];
            $EnumSwitchMapping$0 = iArr;
            ImageProvider imageProvider = ImageProvider.GALLERY;
            iArr[0] = 1;
            ImageProvider imageProvider2 = ImageProvider.CAMERA;
            iArr[1] = 2;
        }
    }

    private final void loadBundle(Bundle bundle) {
        CameraProvider cameraProvider;
        CropProvider cropProvider = new CropProvider(this);
        this.mCropProvider = cropProvider;
        Serializable serializable = null;
        if (cropProvider != null) {
            cropProvider.onRestoreInstanceState(bundle);
            this.mCompressionProvider = new CompressionProvider(this);
            Intent intent = getIntent();
            if (intent != null) {
                serializable = intent.getSerializableExtra(ImagePicker.EXTRA_IMAGE_PROVIDER);
            }
            ImageProvider imageProvider = (ImageProvider) serializable;
            if (imageProvider != null) {
                int ordinal = imageProvider.ordinal();
                if (ordinal == 0) {
                    GalleryProvider galleryProvider = new GalleryProvider(this);
                    this.mGalleryProvider = galleryProvider;
                    if (bundle == null && galleryProvider != null) {
                        galleryProvider.startIntent();
                        return;
                    }
                    return;
                } else if (ordinal == 1) {
                    CameraProvider cameraProvider2 = new CameraProvider(this);
                    this.mCameraProvider = cameraProvider2;
                    if (cameraProvider2 != null) {
                        cameraProvider2.onRestoreInstanceState(bundle);
                    }
                    if (bundle == null && (cameraProvider = this.mCameraProvider) != null) {
                        cameraProvider.startIntent();
                        return;
                    }
                    return;
                }
            }
            Log.e(TAG, "Image provider can not be null");
            String string = getString(C5456R.string.error_task_cancelled);
            C6888i.m12435b(string, "getString(R.string.error_task_cancelled)");
            setError(string);
            return;
        }
        C6888i.m12446m("mCropProvider");
        throw null;
    }

    private final void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.mImageFile = (File) bundle.getSerializable(STATE_IMAGE_FILE);
        }
    }

    private final void setResult(File file) {
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(file));
        intent.putExtra(ImagePicker.EXTRA_FILE_PATH, file.getAbsolutePath());
        setResult(-1, intent);
        finish();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CameraProvider cameraProvider = this.mCameraProvider;
        if (cameraProvider != null) {
            cameraProvider.onActivityResult(i, i2, intent);
        }
        GalleryProvider galleryProvider = this.mGalleryProvider;
        if (galleryProvider != null) {
            galleryProvider.onActivityResult(i, i2, intent);
        }
        CropProvider cropProvider = this.mCropProvider;
        if (cropProvider != null) {
            cropProvider.onActivityResult(i, i2, intent);
        } else {
            C6888i.m12446m("mCropProvider");
            throw null;
        }
    }

    public void onBackPressed() {
        setResultCancel();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        restoreInstanceState(bundle);
        loadBundle(bundle);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C6888i.m12439f(strArr, "permissions");
        C6888i.m12439f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        CameraProvider cameraProvider = this.mCameraProvider;
        if (cameraProvider != null) {
            cameraProvider.onRequestPermissionsResult(i);
        }
        GalleryProvider galleryProvider = this.mGalleryProvider;
        if (galleryProvider != null) {
            galleryProvider.onRequestPermissionsResult(i);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6888i.m12439f(bundle, "outState");
        bundle.putSerializable(STATE_IMAGE_FILE, this.mImageFile);
        CameraProvider cameraProvider = this.mCameraProvider;
        if (cameraProvider != null) {
            cameraProvider.onSaveInstanceState(bundle);
        }
        CropProvider cropProvider = this.mCropProvider;
        if (cropProvider != null) {
            cropProvider.onSaveInstanceState(bundle);
            super.onSaveInstanceState(bundle);
            return;
        }
        C6888i.m12446m("mCropProvider");
        throw null;
    }

    public final void setCompressedImage(File file) {
        File file2;
        C6888i.m12439f(file, "file");
        if (!(this.mCameraProvider == null || (file2 = this.mImageFile) == null)) {
            file2.delete();
        }
        File file3 = this.mCropFile;
        if (file3 != null) {
            file3.delete();
        }
        this.mCropFile = null;
        setResult(file);
    }

    public final void setCropImage(File file) {
        C6888i.m12439f(file, "file");
        this.mCropFile = file;
        if (this.mCameraProvider != null) {
            File file2 = this.mImageFile;
            if (file2 != null) {
                file2.delete();
            }
            this.mImageFile = null;
        }
        CompressionProvider compressionProvider = this.mCompressionProvider;
        if (compressionProvider == null) {
            C6888i.m12446m("mCompressionProvider");
            throw null;
        } else if (compressionProvider.isCompressionRequired(file)) {
            CompressionProvider compressionProvider2 = this.mCompressionProvider;
            if (compressionProvider2 != null) {
                compressionProvider2.compress(file);
            } else {
                C6888i.m12446m("mCompressionProvider");
                throw null;
            }
        } else {
            setResult(file);
        }
    }

    public final void setError(String str) {
        C6888i.m12439f(str, "message");
        Intent intent = new Intent();
        intent.putExtra(ImagePicker.EXTRA_ERROR, str);
        setResult(64, intent);
        finish();
    }

    public final void setImage(File file) {
        C6888i.m12439f(file, "file");
        this.mImageFile = file;
        CropProvider cropProvider = this.mCropProvider;
        if (cropProvider == null) {
            C6888i.m12446m("mCropProvider");
            throw null;
        } else if (cropProvider.isCropEnabled()) {
            CropProvider cropProvider2 = this.mCropProvider;
            if (cropProvider2 != null) {
                cropProvider2.startIntent(file);
            } else {
                C6888i.m12446m("mCropProvider");
                throw null;
            }
        } else {
            CompressionProvider compressionProvider = this.mCompressionProvider;
            if (compressionProvider == null) {
                C6888i.m12446m("mCompressionProvider");
                throw null;
            } else if (compressionProvider.isCompressionRequired(file)) {
                CompressionProvider compressionProvider2 = this.mCompressionProvider;
                if (compressionProvider2 != null) {
                    compressionProvider2.compress(file);
                } else {
                    C6888i.m12446m("mCompressionProvider");
                    throw null;
                }
            } else {
                setResult(file);
            }
        }
    }

    public final void setResultCancel() {
        setResult(0, Companion.getCancelledIntent$imagepicker_release(this));
        finish();
    }
}
