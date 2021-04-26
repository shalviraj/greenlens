package com.github.dhaval2404.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.Fragment;
import com.github.dhaval2404.imagepicker.constant.ImageProvider;
import com.github.dhaval2404.imagepicker.util.DialogHelper;
import com.github.florent37.inlineactivityresult.kotlin.KotlinActivityResult;
import com.github.florent37.inlineactivityresult.kotlin.Kotlin_activity_resultKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.C6774o;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/ImagePicker;", "", "<init>", "()V", "Companion", "Builder", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public class ImagePicker {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EXTRA_CROP = "extra.crop";
    public static final String EXTRA_CROP_X = "extra.crop_x";
    public static final String EXTRA_CROP_Y = "extra.crop_y";
    public static final String EXTRA_ERROR = "extra.error";
    public static final String EXTRA_FILE_PATH = "extra.file_path";
    public static final String EXTRA_IMAGE_MAX_SIZE = "extra.image_max_size";
    public static final String EXTRA_IMAGE_PROVIDER = "extra.image_provider";
    public static final String EXTRA_MAX_HEIGHT = "extra.max_height";
    public static final String EXTRA_MAX_WIDTH = "extra.max_width";
    public static final String EXTRA_MIME_TYPES = "extra.mime_types";
    public static final String EXTRA_SAVE_DIRECTORY = "extra.save_directory";
    public static final int REQUEST_CODE = 2404;
    public static final int RESULT_ERROR = 64;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00109\u001a\u000208¢\u0006\u0004\bI\u0010JB\u0011\b\u0016\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010KJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0005\u001a\u00020\u00042\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u00042\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0014J\r\u0010 \u001a\u00020\u0000¢\u0006\u0004\b \u0010\u0014J\u001d\u0010#\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-J!\u00100\u001a\u00020\u00002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b2\u0010\u0006J-\u00102\u001a\u00020\u00042\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b2\u0010\nR\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0018\u0010)\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010<R\u0016\u0010\u001e\u001a\u00020=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010>R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010%\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010CR$\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "", "", "reqCode", "Ld/r;", "showImageProviderDialog", "(I)V", "Lkotlin/Function2;", "Landroid/content/Intent;", "completionHandler", "(Ld/x/b/p;)V", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "startActivity", "Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "imageProvider", "provider", "(Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "cameraOnly", "()Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "galleryOnly", "", "", "mimeTypes", "galleryMimeTypes", "([Ljava/lang/String;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "", "x", "y", "crop", "(FF)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "cropSquare", "width", "height", "maxResultSize", "(II)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "maxSize", "compress", "(I)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "path", "saveDir", "(Ljava/lang/String;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Ljava/io/File;", "file", "(Ljava/io/File;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Lkotlin/Function1;", "interceptor", "setImageProviderInterceptor", "(Ld/x/b/l;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "start", "()V", "cropY", "F", "Lcom/github/dhaval2404/imagepicker/constant/ImageProvider;", "Ljava/lang/String;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "cropX", "[Ljava/lang/String;", "", "Z", "maxHeight", "I", "maxWidth", "", "J", "imageProviderInterceptor", "Ld/x/b/l;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroid/app/Activity;)V", "(Landroidx/fragment/app/Fragment;)V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
    public static final class Builder {
        /* access modifiers changed from: private */
        public final Activity activity;
        private boolean crop;
        private float cropX;
        private float cropY;
        private Fragment fragment;
        /* access modifiers changed from: private */
        public ImageProvider imageProvider;
        /* access modifiers changed from: private */
        public C6862l<? super ImageProvider, C6777r> imageProviderInterceptor;
        private int maxHeight;
        private long maxSize;
        private int maxWidth;
        private String[] mimeTypes;
        private String saveDir;

        public Builder(Activity activity2) {
            C6888i.m12439f(activity2, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.activity = activity2;
            this.imageProvider = ImageProvider.BOTH;
            this.mimeTypes = new String[0];
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Builder(androidx.fragment.app.Fragment r3) {
            /*
                r2 = this;
                java.lang.String r0 = "fragment"
                p298d.p344x.p346c.C6888i.m12439f(r3, r0)
                androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
                if (r0 == 0) goto L_0x0016
                java.lang.String r1 = "fragment.activity!!"
                p298d.p344x.p346c.C6888i.m12435b(r0, r1)
                r2.<init>((android.app.Activity) r0)
                r2.fragment = r3
                return
            L_0x0016:
                p298d.p344x.p346c.C6888i.m12445l()
                r3 = 0
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.ImagePicker.Builder.<init>(androidx.fragment.app.Fragment):void");
        }

        private final Bundle getBundle() {
            Bundle bundle = new Bundle();
            bundle.putSerializable(ImagePicker.EXTRA_IMAGE_PROVIDER, this.imageProvider);
            bundle.putStringArray(ImagePicker.EXTRA_MIME_TYPES, this.mimeTypes);
            bundle.putBoolean(ImagePicker.EXTRA_CROP, this.crop);
            bundle.putFloat(ImagePicker.EXTRA_CROP_X, this.cropX);
            bundle.putFloat(ImagePicker.EXTRA_CROP_Y, this.cropY);
            bundle.putInt(ImagePicker.EXTRA_MAX_WIDTH, this.maxWidth);
            bundle.putInt(ImagePicker.EXTRA_MAX_HEIGHT, this.maxHeight);
            bundle.putLong(ImagePicker.EXTRA_IMAGE_MAX_SIZE, this.maxSize);
            bundle.putString(ImagePicker.EXTRA_SAVE_DIRECTORY, this.saveDir);
            return bundle;
        }

        private final void showImageProviderDialog(int i) {
            DialogHelper.INSTANCE.showChooseAppDialog(this.activity, new ImagePicker$Builder$showImageProviderDialog$1(this, i));
        }

        private final void showImageProviderDialog(C6866p<? super Integer, ? super Intent, C6777r> pVar) {
            DialogHelper.INSTANCE.showChooseAppDialog(this.activity, new ImagePicker$Builder$showImageProviderDialog$2(this, pVar));
        }

        public static /* synthetic */ void showImageProviderDialog$default(Builder builder, C6866p pVar, int i, Object obj) {
            if ((i & 1) != 0) {
                pVar = null;
            }
            builder.showImageProviderDialog((C6866p<? super Integer, ? super Intent, C6777r>) pVar);
        }

        public static /* synthetic */ void start$default(Builder builder, C6866p pVar, int i, Object obj) {
            if ((i & 1) != 0) {
                pVar = null;
            }
            builder.start((C6866p<? super Integer, ? super Intent, C6777r>) pVar);
        }

        /* access modifiers changed from: private */
        public final void startActivity(int i) {
            Intent intent = new Intent(this.activity, ImagePickerActivity.class);
            intent.putExtras(getBundle());
            Fragment fragment2 = this.fragment;
            if (fragment2 == null) {
                this.activity.startActivityForResult(intent, i);
            } else if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i);
            }
        }

        /* access modifiers changed from: private */
        public final void startActivity(C6866p<? super Integer, ? super Intent, C6777r> pVar) {
            Context context;
            KotlinActivityResult startForResult;
            C6862l imagePicker$Builder$startActivity$4;
            try {
                Intent intent = new Intent(this.activity, ImagePickerActivity.class);
                intent.putExtras(getBundle());
                Fragment fragment2 = this.fragment;
                if (fragment2 == null) {
                    Activity activity2 = this.activity;
                    if (activity2 != null) {
                        startForResult = Kotlin_activity_resultKt.startForResult((AppCompatActivity) activity2, intent, new ImagePicker$Builder$startActivity$3(pVar));
                        imagePicker$Builder$startActivity$4 = new ImagePicker$Builder$startActivity$4(pVar);
                    } else {
                        throw new C6774o("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    }
                } else if (fragment2 != null && (startForResult = Kotlin_activity_resultKt.startForResult(fragment2, intent, new ImagePicker$Builder$startActivity$1(pVar))) != null) {
                    imagePicker$Builder$startActivity$4 = new ImagePicker$Builder$startActivity$2(pVar);
                } else {
                    return;
                }
                startForResult.onFailed(imagePicker$Builder$startActivity$4);
            } catch (Exception e) {
                if (e instanceof ClassNotFoundException) {
                    Fragment fragment3 = this.fragment;
                    if (fragment3 == null) {
                        context = this.activity;
                    } else if (fragment3 != null) {
                        context = fragment3.getContext();
                    } else {
                        C6888i.m12445l();
                        throw null;
                    }
                    Toast.makeText(context, "InlineActivityResult library not installed falling back to default method, please install it from https://github.com/florent37/InlineActivityResult if you want to get inline activity results.", 1).show();
                    startActivity((int) ImagePicker.REQUEST_CODE);
                }
            }
        }

        public static /* synthetic */ void startActivity$default(Builder builder, C6866p pVar, int i, Object obj) {
            if ((i & 1) != 0) {
                pVar = null;
            }
            builder.startActivity((C6866p<? super Integer, ? super Intent, C6777r>) pVar);
        }

        public final Builder cameraOnly() {
            this.imageProvider = ImageProvider.CAMERA;
            return this;
        }

        public final Builder compress(int i) {
            this.maxSize = ((long) i) * 1024;
            return this;
        }

        public final Builder crop() {
            this.crop = true;
            return this;
        }

        public final Builder crop(float f, float f2) {
            this.cropX = f;
            this.cropY = f2;
            return crop();
        }

        public final Builder cropSquare() {
            return crop(1.0f, 1.0f);
        }

        public final Builder galleryMimeTypes(String[] strArr) {
            C6888i.m12439f(strArr, "mimeTypes");
            this.mimeTypes = strArr;
            return this;
        }

        public final Builder galleryOnly() {
            this.imageProvider = ImageProvider.GALLERY;
            return this;
        }

        public final Builder maxResultSize(int i, int i2) {
            this.maxWidth = i;
            this.maxHeight = i2;
            return this;
        }

        public final Builder provider(ImageProvider imageProvider2) {
            C6888i.m12439f(imageProvider2, "imageProvider");
            this.imageProvider = imageProvider2;
            return this;
        }

        public final Builder saveDir(File file) {
            C6888i.m12439f(file, "file");
            this.saveDir = file.getAbsolutePath();
            return this;
        }

        public final Builder saveDir(String str) {
            C6888i.m12439f(str, "path");
            this.saveDir = str;
            return this;
        }

        public final Builder setImageProviderInterceptor(C6862l<? super ImageProvider, C6777r> lVar) {
            C6888i.m12439f(lVar, "interceptor");
            this.imageProviderInterceptor = lVar;
            return this;
        }

        public final void start() {
            start((int) ImagePicker.REQUEST_CODE);
        }

        public final void start(int i) {
            if (this.imageProvider == ImageProvider.BOTH) {
                showImageProviderDialog(i);
            } else {
                startActivity(i);
            }
        }

        public final void start(C6866p<? super Integer, ? super Intent, C6777r> pVar) {
            if (this.imageProvider == ImageProvider.BOTH) {
                showImageProviderDialog(pVar);
            } else {
                startActivity(pVar);
            }
        }
    }

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\f8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010 \u001a\u00020\u001f8\u0006@\u0006XT¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006%"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/ImagePicker$Companion;", "", "Landroid/app/Activity;", "activity", "Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "with", "(Landroid/app/Activity;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Lcom/github/dhaval2404/imagepicker/ImagePicker$Builder;", "Landroid/content/Intent;", "data", "", "getError", "(Landroid/content/Intent;)Ljava/lang/String;", "getFilePath", "Ljava/io/File;", "getFile", "(Landroid/content/Intent;)Ljava/io/File;", "EXTRA_CROP", "Ljava/lang/String;", "EXTRA_CROP_X", "EXTRA_CROP_Y", "EXTRA_ERROR", "EXTRA_FILE_PATH", "EXTRA_IMAGE_MAX_SIZE", "EXTRA_IMAGE_PROVIDER", "EXTRA_MAX_HEIGHT", "EXTRA_MAX_WIDTH", "EXTRA_MIME_TYPES", "EXTRA_SAVE_DIRECTORY", "", "REQUEST_CODE", "I", "RESULT_ERROR", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getError(Intent intent) {
            String stringExtra = intent != null ? intent.getStringExtra(ImagePicker.EXTRA_ERROR) : null;
            return stringExtra != null ? stringExtra : "Unknown Error!";
        }

        public final File getFile(Intent intent) {
            String filePath = getFilePath(intent);
            if (filePath != null) {
                return new File(filePath);
            }
            return null;
        }

        public final String getFilePath(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra(ImagePicker.EXTRA_FILE_PATH);
            }
            return null;
        }

        public final Builder with(Activity activity) {
            C6888i.m12439f(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            return new Builder(activity);
        }

        public final Builder with(Fragment fragment) {
            C6888i.m12439f(fragment, "fragment");
            return new Builder(fragment);
        }
    }
}
