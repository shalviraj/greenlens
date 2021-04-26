package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p435n.C8043g;
import p435n.C8059u;

public class LottieCompositionFactory {
    private static final byte[] MAGIC = {80, 75, 3, 4};
    /* access modifiers changed from: private */
    public static final Map<String, LottieTask<LottieComposition>> taskCache = new HashMap();

    private LottieCompositionFactory() {
    }

    private static LottieTask<LottieComposition> cache(@Nullable final String str, Callable<LottieResult<LottieComposition>> callable) {
        final LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieTask<>(new Callable<LottieResult<LottieComposition>>() {
                public LottieResult<LottieComposition> call() {
                    return new LottieResult<>(LottieComposition.this);
                }
            });
        }
        if (str != null) {
            Map<String, LottieTask<LottieComposition>> map = taskCache;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        LottieTask<LottieComposition> lottieTask = new LottieTask<>(callable);
        if (str != null) {
            lottieTask.addListener(new LottieListener<LottieComposition>() {
                public void onResult(LottieComposition lottieComposition) {
                    LottieCompositionFactory.taskCache.remove(str);
                }
            });
            lottieTask.addFailureListener(new LottieListener<Throwable>() {
                public void onResult(Throwable th) {
                    LottieCompositionFactory.taskCache.remove(str);
                }
            });
            taskCache.put(str, lottieTask);
        }
        return lottieTask;
    }

    public static void clearCache(Context context) {
        taskCache.clear();
        LottieCompositionCache.getInstance().clear();
        C5312L.networkCache(context).clear();
    }

    @Nullable
    private static LottieImageAsset findImageAssetForFileName(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset next : lottieComposition.getImages().values()) {
            if (next.getFileName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, final String str, @Nullable final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return cache(str2, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieCompositionFactory.fromAssetSync(applicationContext, str, str2);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return fromJsonInputStreamSync(context.getAssets().open(str), str2);
                }
            }
            return fromZipStreamSync(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(final JSONObject jSONObject, @Nullable final String str) {
        return cache(str, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieCompositionFactory.fromJsonSync(jSONObject, str);
            }
        });
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(final InputStream inputStream, @Nullable final String str) {
        return cache(str, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    @WorkerThread
    private static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            return fromJsonReaderSync(JsonReader.m10109of(C5266a.m9812H(C5266a.m9940d4(inputStream))), str);
        } finally {
            if (z) {
                Utils.closeQuietly(inputStream);
            }
        }
    }

    public static LottieTask<LottieComposition> fromJsonReader(final JsonReader jsonReader, @Nullable final String str) {
        return cache(str, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieCompositionFactory.fromJsonReaderSync(JsonReader.this, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, @Nullable String str) {
        return fromJsonReaderSyncInternal(jsonReader, str, true);
    }

    private static LottieResult<LottieComposition> fromJsonReaderSyncInternal(JsonReader jsonReader, @Nullable String str, boolean z) {
        try {
            LottieComposition parse = LottieCompositionMoshiParser.parse(jsonReader);
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, parse);
            }
            LottieResult<LottieComposition> lottieResult = new LottieResult<>(parse);
            if (z) {
                Utils.closeQuietly(jsonReader);
            }
            return lottieResult;
        } catch (Exception e) {
            LottieResult<LottieComposition> lottieResult2 = new LottieResult<>((Throwable) e);
            if (z) {
                Utils.closeQuietly(jsonReader);
            }
            return lottieResult2;
        } catch (Throwable th) {
            if (z) {
                Utils.closeQuietly(jsonReader);
            }
            throw th;
        }
    }

    public static LottieTask<LottieComposition> fromJsonString(final String str, @Nullable final String str2) {
        return cache(str2, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieCompositionFactory.fromJsonStringSync(str, str2);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonStringSync(String str, @Nullable String str2) {
        return fromJsonReaderSync(JsonReader.m10109of(C5266a.m9812H(C5266a.m9940d4(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @WorkerThread
    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, @Nullable String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes int i) {
        return fromRawRes(context, i, rawResCacheKey(context, i));
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes final int i, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return cache(str, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                Context context = (Context) weakReference.get();
                if (context == null) {
                    context = applicationContext;
                }
                return LottieCompositionFactory.fromRawResSync(context, i, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i) {
        return fromRawResSync(context, i, rawResCacheKey(context, i));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i, @Nullable String str) {
        try {
            C8043g H = C5266a.m9812H(C5266a.m9940d4(context.getResources().openRawResource(i)));
            if (isZipCompressed(H).booleanValue()) {
                return fromZipStreamSync(new ZipInputStream(new C8059u.C8060a((C8059u) H)), str);
            }
            return fromJsonInputStreamSync(new C8059u.C8060a((C8059u) H), str);
        } catch (Resources.NotFoundException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    public static LottieTask<LottieComposition> fromUrl(final Context context, final String str, @Nullable final String str2) {
        return cache(str2, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                LottieResult<LottieComposition> fetchSync = C5312L.networkFetcher(context).fetchSync(str, str2);
                if (!(str2 == null || fetchSync.getValue() == null)) {
                    LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
                }
                return fetchSync;
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, @Nullable String str2) {
        LottieResult<LottieComposition> fetchSync = C5312L.networkFetcher(context).fetchSync(str, str2);
        if (!(str2 == null || fetchSync.getValue() == null)) {
            LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
        }
        return fetchSync;
    }

    public static LottieTask<LottieComposition> fromZipStream(final ZipInputStream zipInputStream, @Nullable final String str) {
        return cache(str, new Callable<LottieResult<LottieComposition>>() {
            public LottieResult<LottieComposition> call() {
                return LottieCompositionFactory.fromZipStreamSync(zipInputStream, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return fromZipStreamSyncInternal(zipInputStream, str);
        } finally {
            Utils.closeQuietly(zipInputStream);
        }
    }

    @WorkerThread
    private static LottieResult<LottieComposition> fromZipStreamSyncInternal(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX")) {
                    if (!nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                        if (nextEntry.getName().contains(".json")) {
                            lottieComposition = fromJsonReaderSyncInternal(JsonReader.m10109of(C5266a.m9812H(C5266a.m9940d4(zipInputStream))), (String) null, false).getValue();
                        } else {
                            if (!name.contains(".png")) {
                                if (name.contains(".webp")) {
                                }
                            }
                            String[] split = name.split("/");
                            hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                LottieImageAsset findImageAssetForFileName = findImageAssetForFileName(lottieComposition, (String) entry.getKey());
                if (findImageAssetForFileName != null) {
                    findImageAssetForFileName.setBitmap(Utils.resizeBitmapIfNeeded((Bitmap) entry.getValue(), findImageAssetForFileName.getWidth(), findImageAssetForFileName.getHeight()));
                }
            }
            for (Map.Entry next : lottieComposition.getImages().entrySet()) {
                if (((LottieImageAsset) next.getValue()).getBitmap() == null) {
                    StringBuilder u = C0843a.m460u("There is no image for ");
                    u.append(((LottieImageAsset) next.getValue()).getFileName());
                    return new LottieResult<>((Throwable) new IllegalStateException(u.toString()));
                }
            }
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, lottieComposition);
            }
            return new LottieResult<>(lottieComposition);
        } catch (IOException e) {
            return new LottieResult<>((Throwable) e);
        }
    }

    private static boolean isNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean isZipCompressed(C8043g gVar) {
        try {
            C8043g X = gVar.mo25898X();
            for (byte b : MAGIC) {
                if (X.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            X.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            Logger.error("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    private static String rawResCacheKey(Context context, @RawRes int i) {
        StringBuilder u = C0843a.m460u("rawRes");
        u.append(isNightMode(context) ? "_night_" : "_day_");
        u.append(i);
        return u.toString();
    }

    public static void setMaxCacheSize(int i) {
        LottieCompositionCache.getInstance().resize(i);
    }
}
