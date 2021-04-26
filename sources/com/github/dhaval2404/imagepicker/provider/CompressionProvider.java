package com.github.dhaval2404.imagepicker.provider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.github.dhaval2404.imagepicker.util.FileUriUtils;
import com.github.dhaval2404.imagepicker.util.FileUtil;
import com.github.dhaval2404.imagepicker.util.ImageUtil;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\tR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/CompressionProvider;", "Lcom/github/dhaval2404/imagepicker/provider/BaseProvider;", "Ljava/io/File;", "file", "", "getSizeDiff", "(Ljava/io/File;)J", "Ld/r;", "startCompressionWorker", "(Ljava/io/File;)V", "startCompression", "(Ljava/io/File;)Ljava/io/File;", "", "attempt", "applyCompression", "(Ljava/io/File;I)Ljava/io/File;", "", "", "resolutionList", "()Ljava/util/List;", "handleResult", "getImageSize", "(Ljava/io/File;)[I", "", "isCompressEnabled", "()Z", "isCompressionRequired", "(Ljava/io/File;)Z", "compress", "mFileDir", "Ljava/io/File;", "mOriginalFile", "mMaxWidth", "I", "mMaxHeight", "mMaxFileSize", "J", "Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "activity", "<init>", "(Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;)V", "Companion", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class CompressionProvider extends BaseProvider {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = CompressionProvider.class.getSimpleName();
    private File mFileDir;
    private final long mMaxFileSize;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private File mOriginalFile;

    @Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/provider/CompressionProvider$Companion;", "", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompressionProvider(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        C6888i.m12439f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intent intent = imagePickerActivity.getIntent();
        C6888i.m12435b(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.mMaxWidth = extras.getInt(ImagePicker.EXTRA_MAX_WIDTH, 0);
            this.mMaxHeight = extras.getInt(ImagePicker.EXTRA_MAX_HEIGHT, 0);
            this.mMaxFileSize = extras.getLong(ImagePicker.EXTRA_IMAGE_MAX_SIZE, 0);
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

    private final File applyCompression(File file, int i) {
        int i2;
        List<int[]> resolutionList = resolutionList();
        if (i >= resolutionList.size()) {
            return null;
        }
        int[] iArr = resolutionList.get(i);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = this.mMaxWidth;
        if (i5 > 0 && (i2 = this.mMaxHeight) > 0 && (i3 > i5 || i4 > i2)) {
            i3 = i5;
            i4 = i2;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        String absolutePath = file.getAbsolutePath();
        C6888i.m12435b(absolutePath, "file.absolutePath");
        if (C7694h.m13927e(absolutePath, ".png", false, 2)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        File imageFile = FileUtil.INSTANCE.getImageFile(this.mFileDir, FileUriUtils.INSTANCE.getImageExtension(file));
        if (imageFile == null) {
            return null;
        }
        String absolutePath2 = imageFile.getAbsolutePath();
        C6888i.m12435b(absolutePath2, "compressFile.absolutePath");
        return ImageUtil.INSTANCE.compressImage(file, (float) i3, (float) i4, compressFormat2, 100, absolutePath2);
    }

    private final int[] getImageSize(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    private final long getSizeDiff(File file) {
        return file.length() - this.mMaxFileSize;
    }

    /* access modifiers changed from: private */
    public final void handleResult(File file) {
        getActivity().setCompressedImage(file);
    }

    private final List<int[]> resolutionList() {
        return C6790h.m12314A(new int[]{2448, 3264}, new int[]{2008, 3032}, new int[]{1944, 2580}, new int[]{1680, 2240}, new int[]{1536, 2048}, new int[]{1200, 1600}, new int[]{1024, 1392}, new int[]{960, 1280}, new int[]{768, 1024}, new int[]{600, 800}, new int[]{480, 640}, new int[]{240, 320}, new int[]{120, 160}, new int[]{60, 80}, new int[]{30, 40});
    }

    /* access modifiers changed from: private */
    public final File startCompression(File file) {
        int i;
        int i2 = 0;
        int i3 = 0;
        File file2 = null;
        while (true) {
            if (file2 != null) {
                file2.delete();
            }
            file2 = applyCompression(file, i2);
            if (file2 != null) {
                if (this.mMaxFileSize > 0) {
                    long sizeDiff = getSizeDiff(file2);
                    i = (sizeDiff > ((long) 1048576) ? 3 : sizeDiff > ((long) 512000) ? 2 : 1) + i2;
                } else {
                    i = i2 + 1;
                }
                if (!isCompressionRequired(file2)) {
                    return file2;
                }
                int i4 = i;
                i3 = i2;
                i2 = i4;
            } else if (i2 > 0) {
                return applyCompression(file, i3);
            } else {
                return null;
            }
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    private final void startCompressionWorker(File file) {
        this.mOriginalFile = file;
        new CompressionProvider$startCompressionWorker$1(this).execute(new File[]{file});
    }

    public final void compress(File file) {
        C6888i.m12439f(file, "file");
        startCompressionWorker(file);
    }

    public final boolean isCompressEnabled() {
        return this.mMaxFileSize > 0;
    }

    public final boolean isCompressionRequired(File file) {
        C6888i.m12439f(file, "file");
        boolean z = isCompressEnabled() && getSizeDiff(file) > 0;
        if (z || this.mMaxWidth <= 0 || this.mMaxHeight <= 0) {
            return z;
        }
        int[] imageSize = getImageSize(file);
        return imageSize[0] > this.mMaxWidth || imageSize[1] > this.mMaxHeight;
    }
}
