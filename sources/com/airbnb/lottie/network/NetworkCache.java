package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import p005b.p035e.p036a.p037a.C0843a;

public class NetworkCache {
    @NonNull
    private final LottieNetworkCacheProvider cacheProvider;

    public NetworkCache(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.cacheProvider = lottieNetworkCacheProvider;
    }

    private static String filenameForUrl(String str, FileExtension fileExtension, boolean z) {
        StringBuilder u = C0843a.m460u("lottie_cache_");
        u.append(str.replaceAll("\\W+", ""));
        u.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return u.toString();
    }

    @Nullable
    private File getCachedFile(String str) {
        File file = new File(parentDir(), filenameForUrl(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(parentDir(), filenameForUrl(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File parentDir() {
        File cacheDir = this.cacheProvider.getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    public void clear() {
        File parentDir = parentDir();
        if (parentDir.exists()) {
            File[] listFiles = parentDir.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : parentDir.listFiles()) {
                    delete.delete();
                }
            }
            parentDir.delete();
        }
    }

    @WorkerThread
    @Nullable
    public Pair<FileExtension, InputStream> fetch(String str) {
        try {
            File cachedFile = getCachedFile(str);
            if (cachedFile == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(cachedFile);
            FileExtension fileExtension = cachedFile.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : FileExtension.JSON;
            StringBuilder z = C0843a.m465z("Cache hit for ", str, " at ");
            z.append(cachedFile.getAbsolutePath());
            Logger.debug(z.toString());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public void renameTempFile(String str, FileExtension fileExtension) {
        File file = new File(parentDir(), filenameForUrl(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        Logger.debug("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            StringBuilder u = C0843a.m460u("Unable to rename cache file ");
            u.append(file.getAbsolutePath());
            u.append(" to ");
            u.append(file2.getAbsolutePath());
            u.append(".");
            Logger.warning(u.toString());
        }
    }

    public File writeTempCacheFile(String str, InputStream inputStream, FileExtension fileExtension) {
        FileOutputStream fileOutputStream;
        File file = new File(parentDir(), filenameForUrl(str, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
