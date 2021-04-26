package p005b.p273o;

import android.content.ComponentCallbacks;

/* renamed from: b.o.b */
public final class C4785b implements ComponentCallbacks {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[LOOP:0: B:18:0x005d->B:20:0x0063, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083 A[LOOP:1: B:22:0x007d->B:24:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[LOOP:2: B:26:0x00ad->B:28:0x00b3, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r8) {
        /*
            r7 = this;
            b.o.a r0 = p005b.p273o.C4793c.f9174h
            android.app.Activity r1 = r0.f9119a
            if (r1 == 0) goto L_0x00da
            r2 = 0
            r3 = 1
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.ComponentName r5 = r1.getComponentName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.ActivityInfo r4 = r4.getActivityInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x001c }
            int r4 = r4.configChanges     // Catch:{ NameNotFoundException -> 0x001c }
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0020
            r2 = r3
            goto L_0x0020
        L_0x001c:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0020:
            if (r2 == 0) goto L_0x00da
            int r8 = r8.orientation
            b.o.i2$k r2 = p005b.p273o.C4857i2.C4868k.DEBUG
            r4 = 2
            r5 = 0
            if (r8 != r4) goto L_0x0032
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Configuration Orientation Change: LANDSCAPE ("
            goto L_0x003b
        L_0x0032:
            if (r8 != r3) goto L_0x0050
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Configuration Orientation Change: PORTRAIT ("
        L_0x003b:
            r3.append(r4)
            r3.append(r8)
            java.lang.String r8 = ") on activity: "
            r3.append(r8)
            r3.append(r1)
            java.lang.String r8 = r3.toString()
            p005b.p273o.C4857i2.m8933a(r2, r8, r5)
        L_0x0050:
            r0.mo16489c()
            java.util.Map<java.lang.String, b.o.a$b> r8 = p005b.p273o.C4771a.f9115c
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x005d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0073
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            b.o.a$b r2 = (p005b.p273o.C4771a.C4773b) r2
            r2.mo16494c(r1)
            goto L_0x005d
        L_0x0073:
            java.util.Map<java.lang.String, b.o.a$b> r8 = p005b.p273o.C4771a.f9115c
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x007d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0095
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            b.o.a$b r1 = (p005b.p273o.C4771a.C4773b) r1
            android.app.Activity r2 = r0.f9119a
            r1.mo16492a(r2)
            goto L_0x007d
        L_0x0095:
            android.app.Activity r8 = r0.f9119a
            android.view.Window r8 = r8.getWindow()
            android.view.View r8 = r8.getDecorView()
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()
            java.util.Map<java.lang.String, b.o.c2$b> r1 = p005b.p273o.C4771a.f9116d
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d7
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            b.o.a$e r3 = new b.o.a$e
            java.lang.Object r4 = r2.getValue()
            b.o.c2$b r4 = (p005b.p273o.C4802c2.C4804b) r4
            java.lang.Object r6 = r2.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r3.<init>(r0, r4, r6, r5)
            r8.addOnGlobalLayoutListener(r3)
            java.util.Map<java.lang.String, b.o.a$e> r4 = p005b.p273o.C4771a.f9117e
            java.lang.Object r2 = r2.getKey()
            r4.put(r2, r3)
            goto L_0x00ad
        L_0x00d7:
            r0.mo16488b()
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4785b.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onLowMemory() {
    }
}
