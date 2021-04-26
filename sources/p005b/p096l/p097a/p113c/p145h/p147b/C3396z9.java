package p005b.p096l.p097a.p113c.p145h.p147b;

import p005b.p096l.p097a.p113c.p131e.p140i.C2908p1;

/* renamed from: b.l.a.c.h.b.z9 */
public final class C3396z9 {

    /* renamed from: a */
    public C2908p1 f6159a;

    /* renamed from: b */
    public Long f6160b;

    /* renamed from: c */
    public long f6161c;

    /* renamed from: d */
    public final /* synthetic */ C3153da f6162d;

    public /* synthetic */ C3396z9(C3153da daVar) {
        this.f6162d = daVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        if (r14 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p096l.p097a.p113c.p131e.p140i.C2908p1 mo14648a(java.lang.String r18, p005b.p096l.p097a.p113c.p131e.p140i.C2908p1 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo13557v()
            java.util.List r9 = r19.mo13554s()
            b.l.a.c.h.b.da r2 = r1.f6162d
            b.l.a.c.h.b.j9 r2 = r2.f6128b
            b.l.a.c.h.b.l9 r2 = r2.f5654g
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r2)
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6198l(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = 0
            if (r4 == 0) goto L_0x0226
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01de
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.j9 r0 = r0.f6128b
            b.l.a.c.h.b.l9 r0 = r0.f5654g
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r0)
            java.lang.String r0 = "_en"
            java.lang.Object r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6198l(r8, r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5800g
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo14415b(r2, r4)
            return r5
        L_0x0055:
            b.l.a.c.e.i.p1 r0 = r1.f6159a
            r12 = 1
            if (r0 == 0) goto L_0x006c
            java.lang.Long r0 = r1.f6160b
            if (r0 == 0) goto L_0x006c
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f6160b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0123
        L_0x006c:
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.j9 r0 = r0.f6128b
            b.l.a.c.h.b.j r13 = r0.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r13)
            r13.mo14126h()
            r13.mo14646i()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo14286A()     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            r14[r10] = r3     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            r14[r12] = r15     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e5, all -> 0x00e1 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00a8 }
            if (r0 != 0) goto L_0x00aa
            b.l.a.c.h.b.p4 r0 = r13.f5638a     // Catch:{ SQLiteException -> 0x00a8 }
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()     // Catch:{ SQLiteException -> 0x00a8 }
            b.l.a.c.h.b.m3 r0 = r0.f5807n     // Catch:{ SQLiteException -> 0x00a8 }
            java.lang.String r15 = "Main event not found"
            r0.mo14414a(r15)     // Catch:{ SQLiteException -> 0x00a8 }
            r14.close()
            r0 = r5
            goto L_0x00fa
        L_0x00a8:
            r0 = move-exception
            goto L_0x00e7
        L_0x00aa:
            byte[] r0 = r14.getBlob(r10)     // Catch:{ SQLiteException -> 0x00a8 }
            long r15 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x00a8 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00a8 }
            b.l.a.c.e.i.o1 r5 = p005b.p096l.p097a.p113c.p131e.p140i.C2908p1.m5058C()     // Catch:{ IOException -> 0x00ce }
            b.l.a.c.e.i.g4 r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6192G(r5, r0)     // Catch:{ IOException -> 0x00ce }
            b.l.a.c.e.i.o1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r0     // Catch:{ IOException -> 0x00ce }
            b.l.a.c.e.i.o5 r0 = r0.mo13484g()     // Catch:{ IOException -> 0x00ce }
            b.l.a.c.e.i.p1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00a8 }
            r14.close()
            goto L_0x00fa
        L_0x00ce:
            r0 = move-exception
            b.l.a.c.h.b.p4 r5 = r13.f5638a     // Catch:{ SQLiteException -> 0x00a8 }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ SQLiteException -> 0x00a8 }
            b.l.a.c.h.b.m3 r5 = r5.f5799f     // Catch:{ SQLiteException -> 0x00a8 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r10 = p005b.p096l.p097a.p113c.p145h.p147b.C3269o3.m6253t(r18)     // Catch:{ SQLiteException -> 0x00a8 }
            r5.mo14417d(r15, r10, r4, r0)     // Catch:{ SQLiteException -> 0x00a8 }
            goto L_0x00f6
        L_0x00e1:
            r0 = move-exception
            r5 = 0
            goto L_0x01d8
        L_0x00e5:
            r0 = move-exception
            r14 = 0
        L_0x00e7:
            b.l.a.c.h.b.p4 r5 = r13.f5638a     // Catch:{ all -> 0x01d6 }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ all -> 0x01d6 }
            b.l.a.c.h.b.m3 r5 = r5.f5799f     // Catch:{ all -> 0x01d6 }
            java.lang.String r10 = "Error selecting main event"
            r5.mo14415b(r10, r0)     // Catch:{ all -> 0x01d6 }
            if (r14 == 0) goto L_0x00f9
        L_0x00f6:
            r14.close()
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0102
            goto L_0x01c5
        L_0x0102:
            b.l.a.c.e.i.p1 r5 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r5
            r1.f6159a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.f6161c = r13
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.j9 r0 = r0.f6128b
            b.l.a.c.h.b.l9 r0 = r0.f5654g
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r0)
            b.l.a.c.e.i.p1 r0 = r1.f6159a
            java.lang.Object r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6198l(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f6160b = r0
        L_0x0123:
            long r13 = r1.f6161c
            r15 = -1
            long r13 = r13 + r15
            r1.f6161c = r13
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0165
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.j9 r0 = r0.f6128b
            b.l.a.c.h.b.j r2 = r0.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r2)
            r2.mo14126h()
            b.l.a.c.h.b.p4 r0 = r2.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5807n
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo14415b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo14286A()     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0156 }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x0156 }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x0156 }
            goto L_0x0177
        L_0x0156:
            r0 = move-exception
            b.l.a.c.h.b.p4 r2 = r2.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5799f
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo14415b(r3, r0)
            goto L_0x0177
        L_0x0165:
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.j9 r0 = r0.f6128b
            b.l.a.c.h.b.j r2 = r0.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r2)
            long r5 = r1.f6161c
            b.l.a.c.e.i.p1 r7 = r1.f6159a
            r3 = r18
            r2.mo14311q(r3, r4, r5, r7)
        L_0x0177:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            b.l.a.c.e.i.p1 r2 = r1.f6159a
            java.util.List r2 = r2.mo13554s()
            java.util.Iterator r2 = r2.iterator()
        L_0x0186:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01a9
            java.lang.Object r3 = r2.next()
            b.l.a.c.e.i.t1 r3 = (p005b.p096l.p097a.p113c.p131e.p140i.C2960t1) r3
            b.l.a.c.h.b.da r4 = r1.f6162d
            b.l.a.c.h.b.j9 r4 = r4.f6128b
            b.l.a.c.h.b.l9 r4 = r4.f5654g
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r4)
            java.lang.String r4 = r3.mo13737t()
            b.l.a.c.e.i.t1 r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6197L(r8, r4)
            if (r4 != 0) goto L_0x0186
            r0.add(r3)
            goto L_0x0186
        L_0x01a9:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b4
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c3
        L_0x01b4:
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5800g
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo14415b(r2, r11)
        L_0x01c3:
            r0 = r11
            goto L_0x0226
        L_0x01c5:
            b.l.a.c.h.b.da r0 = r1.f6162d
            b.l.a.c.h.b.p4 r0 = r0.f5638a
            b.l.a.c.h.b.o3 r0 = r0.mo14329d()
            b.l.a.c.h.b.m3 r0 = r0.f5800g
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo14416c(r2, r11, r4)
            r2 = 0
            return r2
        L_0x01d6:
            r0 = move-exception
            r5 = r14
        L_0x01d8:
            if (r5 == 0) goto L_0x01dd
            r5.close()
        L_0x01dd:
            throw r0
        L_0x01de:
            r1.f6160b = r4
            r1.f6159a = r8
            b.l.a.c.h.b.da r2 = r1.f6162d
            b.l.a.c.h.b.j9 r2 = r2.f6128b
            b.l.a.c.h.b.l9 r2 = r2.f5654g
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6198l(r8, r5)
            if (r5 == 0) goto L_0x01f8
            r2 = r5
        L_0x01f8:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f6161c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0214
            b.l.a.c.h.b.da r2 = r1.f6162d
            b.l.a.c.h.b.p4 r2 = r2.f5638a
            b.l.a.c.h.b.o3 r2 = r2.mo14329d()
            b.l.a.c.h.b.m3 r2 = r2.f5800g
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo14415b(r3, r0)
            goto L_0x0226
        L_0x0214:
            b.l.a.c.h.b.da r2 = r1.f6162d
            b.l.a.c.h.b.j9 r2 = r2.f6128b
            b.l.a.c.h.b.j r2 = r2.f5650c
            p005b.p096l.p097a.p113c.p145h.p147b.C3220j9.m6111F(r2)
            long r5 = r1.f6161c
            r3 = r18
            r7 = r19
            r2.mo14311q(r3, r4, r5, r7)
        L_0x0226:
            b.l.a.c.e.i.l5 r2 = r19.mo13546n()
            b.l.a.c.e.i.o1 r2 = (p005b.p096l.p097a.p113c.p131e.p140i.C2895o1) r2
            r2.mo13533t(r0)
            boolean r0 = r2.f4886i
            if (r0 == 0) goto L_0x0239
            r2.mo13487j()
            r3 = 0
            r2.f4886i = r3
        L_0x0239:
            MessageType r0 = r2.f4885h
            b.l.a.c.e.i.p1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r0
            p005b.p096l.p097a.p113c.p131e.p140i.C2908p1.m5063H(r0)
            boolean r0 = r2.f4886i
            if (r0 == 0) goto L_0x024a
            r2.mo13487j()
            r3 = 0
            r2.f4886i = r3
        L_0x024a:
            MessageType r0 = r2.f4885h
            b.l.a.c.e.i.p1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r0
            p005b.p096l.p097a.p113c.p131e.p140i.C2908p1.m5062G(r0, r9)
            b.l.a.c.e.i.o5 r0 = r2.mo13484g()
            b.l.a.c.e.i.p1 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2908p1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3396z9.mo14648a(java.lang.String, b.l.a.c.e.i.p1):b.l.a.c.e.i.p1");
    }
}
