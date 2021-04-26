package com.github.dhaval2404.imagepicker.util;

import android.graphics.Bitmap;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/util/FileUtil;", "", "Ljava/io/File;", "getCameraDirectory", "()Ljava/io/File;", "", "getTimestamp", "()Ljava/lang/String;", "dir", "extension", "getImageFile", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "file", "", "getFreeSpace", "(Ljava/io/File;)J", "Landroid/graphics/Bitmap$CompressFormat;", "getCompressFormat", "(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class FileUtil {
    public static final FileUtil INSTANCE = new FileUtil();

    private FileUtil() {
    }

    private final File getCameraDirectory() {
        return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
    }

    public static /* synthetic */ File getImageFile$default(FileUtil fileUtil, File file, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            file = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return fileUtil.getImageFile(file, str);
    }

    private final String getTimestamp() {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.getDefault()).format(new Date());
        C6888i.m12435b(format, "SimpleDateFormat(timeFor…Default()).format(Date())");
        return format;
    }

    public final Bitmap.CompressFormat getCompressFormat(String str) {
        C6888i.m12439f(str, "extension");
        return C7694h.m13924b(str, "png", true) ? Bitmap.CompressFormat.PNG : C7694h.m13924b(str, "webp", true) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    public final long getFreeSpace(File file) {
        C6888i.m12439f(file, "file");
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public final File getImageFile(File file, String str) {
        if (str == null) {
            str = ".jpg";
        }
        try {
            String str2 = "IMG_" + getTimestamp() + str;
            if (file == null) {
                file = getCameraDirectory();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            file2.createNewFile();
            return file2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
