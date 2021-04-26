package p005b.p096l.p180d.p216x;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: b.l.d.x.a */
public class C4285a {

    /* renamed from: a */
    public final FileChannel f7939a;

    /* renamed from: b */
    public final FileLock f7940b;

    public C4285a(FileChannel fileChannel, FileLock fileLock) {
        this.f7939a = fileChannel;
        this.f7940b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[SYNTHETIC, Splitter:B:15:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC, Splitter:B:19:0x0043] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p096l.p180d.p216x.C4285a m7851a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0031, Error -> 0x002f, OverlappingFileLockException -> 0x002d }
            java.nio.channels.FileLock r5 = r4.lock()     // Catch:{ IOException -> 0x0029, Error -> 0x0027, OverlappingFileLockException -> 0x0025 }
            b.l.d.x.a r1 = new b.l.d.x.a     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x0035
        L_0x0021:
            r1 = move-exception
            goto L_0x0035
        L_0x0023:
            r1 = move-exception
            goto L_0x0035
        L_0x0025:
            r5 = move-exception
            goto L_0x002a
        L_0x0027:
            r5 = move-exception
            goto L_0x002a
        L_0x0029:
            r5 = move-exception
        L_0x002a:
            r1 = r5
            r5 = r0
            goto L_0x0035
        L_0x002d:
            r4 = move-exception
            goto L_0x0032
        L_0x002f:
            r4 = move-exception
            goto L_0x0032
        L_0x0031:
            r4 = move-exception
        L_0x0032:
            r1 = r4
            r4 = r0
            r5 = r4
        L_0x0035:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x0041
            r5.release()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p216x.C4285a.m7851a(android.content.Context, java.lang.String):b.l.d.x.a");
    }

    /* renamed from: b */
    public void mo15889b() {
        try {
            this.f7940b.release();
            this.f7939a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
