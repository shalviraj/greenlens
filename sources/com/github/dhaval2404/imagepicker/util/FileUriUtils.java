package com.github.dhaval2404.imagepicker.util;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.segment.analytics.integrations.BasePayload;
import java.io.File;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ!\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\bJ\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001c¨\u0006\u001f"}, mo24462d2 = {"Lcom/github/dhaval2404/imagepicker/util/FileUriUtils;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "getPathFromLocalUri", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;", "selection", "", "selectionArgs", "getDataColumn", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getFilePath", "getPathFromRemoteUri", "", "isExternalStorageDocument", "(Landroid/net/Uri;)Z", "isDownloadsDocument", "isMediaDocument", "isGooglePhotosUri", "getRealPath", "uriImage", "getImageExtension", "(Landroid/net/Uri;)Ljava/lang/String;", "Ljava/io/File;", "file", "(Ljava/io/File;)Ljava/lang/String;", "<init>", "()V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class FileUriUtils {
    public static final FileUriUtils INSTANCE = new FileUriUtils();

    private FileUriUtils() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r9 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r9 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getDataColumn(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r8 = this;
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x003d, all -> 0x0036 }
            if (r10 == 0) goto L_0x0032
            r6 = 0
            r2 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x003d, all -> 0x0036 }
            if (r9 == 0) goto L_0x002c
            boolean r10 = r9.moveToFirst()     // Catch:{ Exception -> 0x003e, all -> 0x0029 }
            if (r10 == 0) goto L_0x002c
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x003e, all -> 0x0029 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ Exception -> 0x003e, all -> 0x0029 }
            r9.close()
            return r10
        L_0x0029:
            r10 = move-exception
            r7 = r9
            goto L_0x0037
        L_0x002c:
            if (r9 == 0) goto L_0x0041
        L_0x002e:
            r9.close()
            goto L_0x0041
        L_0x0032:
            p298d.p344x.p346c.C6888i.m12445l()     // Catch:{ Exception -> 0x003d, all -> 0x0036 }
            throw r7
        L_0x0036:
            r10 = move-exception
        L_0x0037:
            if (r7 == 0) goto L_0x003c
            r7.close()
        L_0x003c:
            throw r10
        L_0x003d:
            r9 = r7
        L_0x003e:
            if (r9 == 0) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.util.FileUriUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getFilePath(android.content.Context r9, android.net.Uri r10) {
        /*
            r8 = this;
            java.lang.String r0 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ all -> 0x0030 }
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r10
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0030 }
            if (r9 == 0) goto L_0x002a
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0027 }
            if (r10 == 0) goto L_0x002a
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0027 }
            r9.close()
            return r10
        L_0x0027:
            r10 = move-exception
            r7 = r9
            goto L_0x0031
        L_0x002a:
            if (r9 == 0) goto L_0x002f
            r9.close()
        L_0x002f:
            return r7
        L_0x0030:
            r10 = move-exception
        L_0x0031:
            if (r7 == 0) goto L_0x0036
            r7.close()
        L_0x0036:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.util.FileUriUtils.getFilePath(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getPathFromLocalUri(android.content.Context r8, android.net.Uri r9) {
        /*
            r7 = this;
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r8, r9)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x019c
            boolean r0 = r7.isExternalStorageDocument(r9)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r4 = "docId"
            java.lang.String r5 = ":"
            r6 = 0
            if (r0 == 0) goto L_0x00cd
            java.lang.String r8 = android.provider.DocumentsContract.getDocumentId(r9)
            p298d.p344x.p346c.C6888i.m12435b(r8, r4)
            d.c0.d r9 = new d.c0.d
            r9.<init>(r5)
            java.util.List r9 = r9.mo25280c(r8, r6)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0054
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L_0x0033:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r0.previous()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0047
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r6
        L_0x0048:
            if (r1 != 0) goto L_0x0033
            int r0 = r0.nextIndex()
            int r0 = r0 + r2
            java.util.List r9 = p298d.p334t.C6790h.m12332S(r9, r0)
            goto L_0x0056
        L_0x0054:
            d.t.p r9 = p298d.p334t.C6798p.f13713g
        L_0x0056:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r9 = r9.toArray(r0)
            if (r9 == 0) goto L_0x00c7
            java.lang.String[] r9 = (java.lang.String[]) r9
            r0 = r9[r6]
            java.lang.String r1 = "primary"
            boolean r0 = p298d.p415c0.C7694h.m13928f(r1, r0, r2)
            java.lang.String r1 = "/"
            if (r0 == 0) goto L_0x0099
            int r8 = r9.length
            if (r8 <= r2) goto L_0x0085
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            r8.append(r1)
            r9 = r9[r2]
            goto L_0x00bf
        L_0x0085:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.io.File r9 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r9 = r9.toString()
            r8.append(r9)
            r8.append(r1)
            goto L_0x00c2
        L_0x0099:
            java.lang.String r0 = "storage/"
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            r3 = 4
            java.lang.String r8 = p298d.p415c0.C7694h.m13944v(r8, r5, r1, r6, r3)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00b7
            goto L_0x00c6
        L_0x00b7:
            java.lang.String r8 = "/storage/sdcard/"
            java.lang.StringBuilder r8 = p005b.p035e.p036a.p037a.C0843a.m460u(r8)
            r9 = r9[r2]
        L_0x00bf:
            r8.append(r9)
        L_0x00c2:
            java.lang.String r8 = r8.toString()
        L_0x00c6:
            return r8
        L_0x00c7:
            d.o r8 = new d.o
            r8.<init>(r3)
            throw r8
        L_0x00cd:
            boolean r0 = r7.isDownloadsDocument(r9)
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r7.getFilePath(r8, r9)
            if (r0 == 0) goto L_0x00f6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.io.File r9 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r9 = r9.toString()
            r8.append(r9)
            java.lang.String r9 = "/Download/"
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x00f6:
            java.lang.String r9 = android.provider.DocumentsContract.getDocumentId(r9)
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r2 = "java.lang.Long.valueOf(id)"
            p298d.p344x.p346c.C6888i.m12435b(r9, r2)
            long r2 = r9.longValue()
            android.net.Uri r9 = android.content.ContentUris.withAppendedId(r0, r2)
            java.lang.String r8 = r7.getDataColumn(r8, r9, r1, r1)
            return r8
        L_0x0116:
            boolean r0 = r7.isMediaDocument(r9)
            if (r0 == 0) goto L_0x01cd
            java.lang.String r9 = android.provider.DocumentsContract.getDocumentId(r9)
            p298d.p344x.p346c.C6888i.m12435b(r9, r4)
            d.c0.d r0 = new d.c0.d
            r0.<init>(r5)
            java.util.List r9 = r0.mo25280c(r9, r6)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x015b
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L_0x013a:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L_0x015b
            java.lang.Object r4 = r0.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x014e
            r4 = r2
            goto L_0x014f
        L_0x014e:
            r4 = r6
        L_0x014f:
            if (r4 != 0) goto L_0x013a
            int r0 = r0.nextIndex()
            int r0 = r0 + r2
            java.util.List r9 = p298d.p334t.C6790h.m12332S(r9, r0)
            goto L_0x015d
        L_0x015b:
            d.t.p r9 = p298d.p334t.C6798p.f13713g
        L_0x015d:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r9 = r9.toArray(r0)
            if (r9 == 0) goto L_0x0196
            java.lang.String[] r9 = (java.lang.String[]) r9
            r0 = r9[r6]
            java.lang.String r3 = "image"
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r3 == 0) goto L_0x0174
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x0189
        L_0x0174:
            java.lang.String r3 = "video"
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r3 == 0) goto L_0x017f
            android.net.Uri r1 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x0189
        L_0x017f:
            java.lang.String r3 = "audio"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x0189
            android.net.Uri r1 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x0189:
            java.lang.String[] r0 = new java.lang.String[r2]
            r9 = r9[r2]
            r0[r6] = r9
            java.lang.String r9 = "_id=?"
            java.lang.String r8 = r7.getDataColumn(r8, r1, r9, r0)
            return r8
        L_0x0196:
            d.o r8 = new d.o
            r8.<init>(r3)
            throw r8
        L_0x019c:
            java.lang.String r0 = r9.getScheme()
            if (r0 == 0) goto L_0x01d2
            java.lang.String r3 = "content"
            boolean r0 = p298d.p415c0.C7694h.m13928f(r3, r0, r2)
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r7.isGooglePhotosUri(r9)
            if (r0 == 0) goto L_0x01b5
            java.lang.String r8 = r9.getLastPathSegment()
            goto L_0x01b9
        L_0x01b5:
            java.lang.String r8 = r7.getDataColumn(r8, r9, r1, r1)
        L_0x01b9:
            return r8
        L_0x01ba:
            java.lang.String r8 = r9.getScheme()
            if (r8 == 0) goto L_0x01ce
            java.lang.String r0 = "file"
            boolean r8 = p298d.p415c0.C7694h.m13928f(r0, r8, r2)
            if (r8 == 0) goto L_0x01cd
            java.lang.String r8 = r9.getPath()
            return r8
        L_0x01cd:
            return r1
        L_0x01ce:
            p298d.p344x.p346c.C6888i.m12445l()
            throw r1
        L_0x01d2:
            p298d.p344x.p346c.C6888i.m12445l()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.util.FileUriUtils.getPathFromLocalUri(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0036 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0048 A[SYNTHETIC, Splitter:B:36:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004d A[SYNTHETIC, Splitter:B:40:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0056 A[SYNTHETIC, Splitter:B:48:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x005b A[SYNTHETIC, Splitter:B:52:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getPathFromRemoteUri(android.content.Context r5, android.net.Uri r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = r4.getImageExtension((android.net.Uri) r6)     // Catch:{ IOException -> 0x0051, all -> 0x0044 }
            android.content.ContentResolver r3 = r5.getContentResolver()     // Catch:{ IOException -> 0x0051, all -> 0x0044 }
            java.io.InputStream r6 = r3.openInputStream(r6)     // Catch:{ IOException -> 0x0051, all -> 0x0044 }
            com.github.dhaval2404.imagepicker.util.FileUtil r3 = com.github.dhaval2404.imagepicker.util.FileUtil.INSTANCE     // Catch:{ IOException -> 0x0041, all -> 0x003d }
            java.io.File r5 = r5.getCacheDir()     // Catch:{ IOException -> 0x0041, all -> 0x003d }
            java.io.File r5 = r3.getImageFile(r5, r2)     // Catch:{ IOException -> 0x0041, all -> 0x003d }
            if (r5 != 0) goto L_0x0020
            if (r6 == 0) goto L_0x001f
            r6.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            return r1
        L_0x0020:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003b, all -> 0x003d }
            r2.<init>(r5)     // Catch:{ IOException -> 0x003b, all -> 0x003d }
            if (r6 == 0) goto L_0x0030
            r3 = 4096(0x1000, float:5.74E-42)
            p005b.p291q.p292a.C5266a.m9972j0(r6, r2, r3)     // Catch:{ IOException -> 0x0054, all -> 0x002e }
            r3 = 1
            goto L_0x0031
        L_0x002e:
            r5 = move-exception
            goto L_0x003f
        L_0x0030:
            r3 = r0
        L_0x0031:
            if (r6 == 0) goto L_0x0036
            r6.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r2.close()     // Catch:{ IOException -> 0x005e }
            r0 = r3
            goto L_0x005e
        L_0x003b:
            r2 = r1
            goto L_0x0054
        L_0x003d:
            r5 = move-exception
            r2 = r1
        L_0x003f:
            r1 = r6
            goto L_0x0046
        L_0x0041:
            r5 = r1
            r2 = r5
            goto L_0x0054
        L_0x0044:
            r5 = move-exception
            r2 = r1
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r5
        L_0x0051:
            r5 = r1
            r6 = r5
            r2 = r6
        L_0x0054:
            if (r6 == 0) goto L_0x0059
            r6.close()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            if (r2 == 0) goto L_0x005e
            r2.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            if (r0 == 0) goto L_0x006b
            if (r5 == 0) goto L_0x0067
            java.lang.String r1 = r5.getPath()
            goto L_0x006b
        L_0x0067:
            p298d.p344x.p346c.C6888i.m12445l()
            throw r1
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.util.FileUriUtils.getPathFromRemoteUri(android.content.Context, android.net.Uri):java.lang.String");
    }

    private final boolean isDownloadsDocument(Uri uri) {
        return C6888i.m12434a("com.android.providers.downloads.documents", uri.getAuthority());
    }

    private final boolean isExternalStorageDocument(Uri uri) {
        return C6888i.m12434a("com.android.externalstorage.documents", uri.getAuthority());
    }

    private final boolean isGooglePhotosUri(Uri uri) {
        return C6888i.m12434a("com.google.android.apps.photos.content", uri.getAuthority());
    }

    private final boolean isMediaDocument(Uri uri) {
        return C6888i.m12434a("com.android.providers.media.documents", uri.getAuthority());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r1 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getImageExtension(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "uriImage"
            p298d.p344x.p346c.C6888i.m12439f(r8, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r8 = r8.getPath()     // Catch:{ Exception -> 0x0027 }
            if (r8 == 0) goto L_0x0027
            r4 = 6
            int r5 = p298d.p415c0.C7694h.m13938p(r8, r0, r3, r3, r4)     // Catch:{ Exception -> 0x0027 }
            r6 = -1
            if (r5 == r6) goto L_0x0027
            int r0 = p298d.p415c0.C7694h.m13938p(r8, r0, r3, r3, r4)     // Catch:{ Exception -> 0x0027 }
            int r0 = r0 + r1
            java.lang.String r8 = r8.substring(r0)     // Catch:{ Exception -> 0x0027 }
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            p298d.p344x.p346c.C6888i.m12435b(r8, r0)     // Catch:{ Exception -> 0x0027 }
            r2 = r8
        L_0x0027:
            if (r2 == 0) goto L_0x0033
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            if (r1 == 0) goto L_0x0035
        L_0x0033:
            java.lang.String r2 = "jpg"
        L_0x0035:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0 = 46
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.util.FileUriUtils.getImageExtension(android.net.Uri):java.lang.String");
    }

    public final String getImageExtension(File file) {
        C6888i.m12439f(file, "file");
        Uri fromFile = Uri.fromFile(file);
        C6888i.m12435b(fromFile, "Uri.fromFile(file)");
        return getImageExtension(fromFile);
    }

    public final String getRealPath(Context context, Uri uri) {
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        String pathFromLocalUri = getPathFromLocalUri(context, uri);
        return pathFromLocalUri == null ? getPathFromRemoteUri(context, uri) : pathFromLocalUri;
    }
}
