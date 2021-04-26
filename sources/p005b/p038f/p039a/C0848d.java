package p005b.p038f.p039a;

/* renamed from: b.f.a.d */
public final class C0848d {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r8 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r8 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m466a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x002e, all -> 0x002c }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x002e, all -> 0x002c }
            if (r8 == 0) goto L_0x0029
            boolean r9 = r8.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x0027 }
            if (r9 == 0) goto L_0x0029
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ IllegalArgumentException -> 0x0027 }
            r8.close()
            return r9
        L_0x0027:
            r9 = move-exception
            goto L_0x0031
        L_0x0029:
            if (r8 == 0) goto L_0x0039
            goto L_0x0036
        L_0x002c:
            r8 = move-exception
            goto L_0x003d
        L_0x002e:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L_0x0031:
            r9.printStackTrace()     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x0039
        L_0x0036:
            r8.close()
        L_0x0039:
            return r7
        L_0x003a:
            r9 = move-exception
            r7 = r8
            r8 = r9
        L_0x003d:
            if (r7 == 0) goto L_0x0042
            r7.close()
        L_0x0042:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0848d.m466a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m467b(android.content.Context r8, android.net.Uri r9) {
        /*
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r8, r9)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = r9.getAuthority()
            java.lang.String r3 = "com.android.externalstorage.documents"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r4 = ":"
            java.lang.String r5 = "docId"
            r6 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.String r8 = android.provider.DocumentsContract.getDocumentId(r9)
            p298d.p344x.p346c.C6888i.m12435b(r8, r5)
            d.c0.d r9 = new d.c0.d
            r9.<init>(r4)
            java.util.List r8 = r9.mo25280c(r8, r6)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x005a
            int r9 = r8.size()
            java.util.ListIterator r9 = r8.listIterator(r9)
        L_0x0039:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r9.previous()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004d
            r0 = r2
            goto L_0x004e
        L_0x004d:
            r0 = r6
        L_0x004e:
            if (r0 != 0) goto L_0x0039
            int r9 = r9.nextIndex()
            int r9 = r9 + r2
            java.util.List r8 = p298d.p334t.C6790h.m12332S(r8, r9)
            goto L_0x005c
        L_0x005a:
            d.t.p r8 = p298d.p334t.C6798p.f13713g
        L_0x005c:
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.Object[] r8 = r8.toArray(r9)
            if (r8 == 0) goto L_0x008f
            java.lang.String[] r8 = (java.lang.String[]) r8
            r9 = r8[r6]
            java.lang.String r0 = "primary"
            boolean r9 = p298d.p415c0.C7694h.m13928f(r0, r9, r2)
            if (r9 == 0) goto L_0x0195
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.String r0 = "/"
            r9.append(r0)
            r8 = r8[r2]
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            return r8
        L_0x008f:
            d.o r8 = new d.o
            r8.<init>(r3)
            throw r8
        L_0x0095:
            java.lang.String r0 = r9.getAuthority()
            java.lang.String r7 = "com.android.providers.downloads.documents"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r7, r0)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r9 = android.provider.DocumentsContract.getDocumentId(r9)
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            if (r9 == 0) goto L_0x00be
            long r2 = r9.longValue()
            android.net.Uri r9 = android.content.ContentUris.withAppendedId(r0, r2)
            java.lang.String r8 = m466a(r8, r9, r1, r1)
            return r8
        L_0x00be:
            p298d.p344x.p346c.C6888i.m12445l()
            throw r1
        L_0x00c2:
            java.lang.String r0 = r9.getAuthority()
            java.lang.String r7 = "com.android.providers.media.documents"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r7, r0)
            if (r0 == 0) goto L_0x0195
            java.lang.String r9 = android.provider.DocumentsContract.getDocumentId(r9)
            p298d.p344x.p346c.C6888i.m12435b(r9, r5)
            d.c0.d r0 = new d.c0.d
            r0.<init>(r4)
            java.util.List r9 = r0.mo25280c(r9, r6)
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x010d
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L_0x00ec:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L_0x010d
            java.lang.Object r4 = r0.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0100
            r4 = r2
            goto L_0x0101
        L_0x0100:
            r4 = r6
        L_0x0101:
            if (r4 != 0) goto L_0x00ec
            int r0 = r0.nextIndex()
            int r0 = r0 + r2
            java.util.List r9 = p298d.p334t.C6790h.m12332S(r9, r0)
            goto L_0x010f
        L_0x010d:
            d.t.p r9 = p298d.p334t.C6798p.f13713g
        L_0x010f:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r9 = r9.toArray(r0)
            if (r9 == 0) goto L_0x015c
            java.lang.String[] r9 = (java.lang.String[]) r9
            r0 = r9[r6]
            int r3 = r0.hashCode()
            r4 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r3 == r4) goto L_0x0145
            r4 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r3 == r4) goto L_0x013a
            r4 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r3 == r4) goto L_0x012f
            goto L_0x014f
        L_0x012f:
            java.lang.String r3 = "video"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x014f
            android.net.Uri r1 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x014f
        L_0x013a:
            java.lang.String r3 = "image"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x014f
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x014f
        L_0x0145:
            java.lang.String r3 = "audio"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x014f
            android.net.Uri r1 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x014f:
            java.lang.String[] r0 = new java.lang.String[r2]
            r9 = r9[r2]
            r0[r6] = r9
            java.lang.String r9 = "_id=?"
            java.lang.String r8 = m466a(r8, r1, r9, r0)
            return r8
        L_0x015c:
            d.o r8 = new d.o
            r8.<init>(r3)
            throw r8
        L_0x0162:
            java.lang.String r0 = r9.getScheme()
            java.lang.String r3 = "content"
            boolean r0 = p298d.p415c0.C7694h.m13928f(r3, r0, r2)
            if (r0 == 0) goto L_0x0184
            java.lang.String r0 = r9.getAuthority()
            java.lang.String r2 = "com.google.android.apps.photos.content"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r2, r0)
            if (r0 == 0) goto L_0x017f
            java.lang.String r8 = r9.getLastPathSegment()
            goto L_0x0183
        L_0x017f:
            java.lang.String r8 = m466a(r8, r9, r1, r1)
        L_0x0183:
            return r8
        L_0x0184:
            java.lang.String r8 = r9.getScheme()
            java.lang.String r0 = "file"
            boolean r8 = p298d.p415c0.C7694h.m13928f(r0, r8, r2)
            if (r8 == 0) goto L_0x0195
            java.lang.String r8 = r9.getPath()
            return r8
        L_0x0195:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p038f.p039a.C0848d.m467b(android.content.Context, android.net.Uri):java.lang.String");
    }
}
