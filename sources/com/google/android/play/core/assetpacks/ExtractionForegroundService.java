package com.google.android.play.core.assetpacks;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p096l.p097a.p151d.p152a.p154b.C3477b2;
import p005b.p096l.p097a.p151d.p152a.p154b.C3483d0;
import p005b.p096l.p097a.p151d.p152a.p154b.C3484d1;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

public class ExtractionForegroundService extends Service {

    /* renamed from: g */
    public final C3584f f11400g = new C3584f("ExtractionForegroundService");

    /* renamed from: h */
    public Context f11401h;

    /* renamed from: i */
    public C3477b2 f11402i;

    /* renamed from: j */
    public NotificationManager f11403j;

    @Nullable
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        C3483d0 h = C3484d1.m6662h(getApplicationContext());
        Context context = h.f6338a.f6382a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        this.f11401h = context;
        this.f11402i = h.f6362y.mo14735a();
        this.f11403j = (NotificationManager) this.f11401h.getSystemService("notification");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final int onStartCommand(android.content.Intent r9, int r10, int r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r10 = "notification_title"
            java.lang.String r10 = r9.getStringExtra(r10)     // Catch:{ all -> 0x00dd }
            java.lang.String r11 = "notification_subtext"
            java.lang.String r11 = r9.getStringExtra(r11)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "notification_timeout"
            r1 = 600000(0x927c0, double:2.964394E-318)
            long r0 = r9.getLongExtra(r0, r1)     // Catch:{ all -> 0x00dd }
            java.lang.String r2 = "notification_on_click_intent"
            android.os.Parcelable r2 = r9.getParcelableExtra(r2)     // Catch:{ all -> 0x00dd }
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch:{ all -> 0x00dd }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00dd }
            r4 = 26
            if (r3 < r4) goto L_0x0032
            android.app.Notification$Builder r5 = new android.app.Notification$Builder     // Catch:{ all -> 0x00dd }
            android.content.Context r6 = r8.f11401h     // Catch:{ all -> 0x00dd }
            java.lang.String r7 = "playcore-assetpacks-service-notification-channel"
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00dd }
            android.app.Notification$Builder r0 = r5.setTimeoutAfter(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x003e
        L_0x0032:
            android.app.Notification$Builder r0 = new android.app.Notification$Builder     // Catch:{ all -> 0x00dd }
            android.content.Context r1 = r8.f11401h     // Catch:{ all -> 0x00dd }
            r0.<init>(r1)     // Catch:{ all -> 0x00dd }
            r1 = -2
            android.app.Notification$Builder r0 = r0.setPriority(r1)     // Catch:{ all -> 0x00dd }
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r0.setContentIntent(r2)     // Catch:{ all -> 0x00dd }
        L_0x0043:
            r1 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r1 = r0.setSmallIcon(r1)     // Catch:{ all -> 0x00dd }
            r2 = 0
            android.app.Notification$Builder r1 = r1.setOngoing(r2)     // Catch:{ all -> 0x00dd }
            if (r10 != 0) goto L_0x0054
            java.lang.String r5 = "Downloading additional file"
            goto L_0x0055
        L_0x0054:
            r5 = r10
        L_0x0055:
            android.app.Notification$Builder r1 = r1.setContentTitle(r5)     // Catch:{ all -> 0x00dd }
            if (r11 != 0) goto L_0x005d
            java.lang.String r10 = "Transferring"
        L_0x005d:
            r1.setSubText(r10)     // Catch:{ all -> 0x00dd }
            java.lang.String r10 = "notification_color"
            int r10 = r9.getIntExtra(r10, r2)     // Catch:{ all -> 0x00dd }
            if (r10 == 0) goto L_0x0070
            android.app.Notification$Builder r10 = r0.setColor(r10)     // Catch:{ all -> 0x00dd }
            r11 = -1
            r10.setVisibility(r11)     // Catch:{ all -> 0x00dd }
        L_0x0070:
            android.app.Notification r10 = r0.build()     // Catch:{ all -> 0x00dd }
            b.l.a.d.a.e.f r11 = r8.f11400g     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "Starting foreground installation service."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x00dd }
            r5 = 4
            r11.mo14884b(r5, r0, r1)     // Catch:{ all -> 0x00dd }
            b.l.a.d.a.b.b2 r11 = r8.f11402i     // Catch:{ all -> 0x00dd }
            r0 = 1
            r11.mo14757a(r0)     // Catch:{ all -> 0x00dd }
            r11 = 2
            if (r3 < r4) goto L_0x00a3
            java.lang.String r1 = "notification_channel_name"
            java.lang.String r1 = r9.getStringExtra(r1)     // Catch:{ all -> 0x00dd }
            monitor-enter(r8)     // Catch:{ all -> 0x00dd }
            if (r1 != 0) goto L_0x0092
            java.lang.String r1 = "File downloads by Play"
        L_0x0092:
            android.app.NotificationChannel r3 = new android.app.NotificationChannel     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "playcore-assetpacks-service-notification-channel"
            r3.<init>(r4, r1, r11)     // Catch:{ all -> 0x00a0 }
            android.app.NotificationManager r1 = r8.f11403j     // Catch:{ all -> 0x00a0 }
            r1.createNotificationChannel(r3)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r8)     // Catch:{ all -> 0x00dd }
            goto L_0x00a3
        L_0x00a0:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00dd }
            throw r9     // Catch:{ all -> 0x00dd }
        L_0x00a3:
            r1 = -1883842196(0xffffffff8fb6d96c, float:-1.8030333E-29)
            r8.startForeground(r1, r10)     // Catch:{ all -> 0x00dd }
            monitor-exit(r8)
            java.lang.String r10 = "action_type"
            int r9 = r9.getIntExtra(r10, r2)
            if (r9 != r11) goto L_0x00cc
            monitor-enter(r8)
            b.l.a.d.a.e.f r9 = r8.f11400g     // Catch:{ all -> 0x00c9 }
            java.lang.String r10 = "Stopping service."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c9 }
            r9.mo14884b(r5, r10, r1)     // Catch:{ all -> 0x00c9 }
            b.l.a.d.a.b.b2 r9 = r8.f11402i     // Catch:{ all -> 0x00c9 }
            r9.mo14757a(r2)     // Catch:{ all -> 0x00c9 }
            r8.stopForeground(r0)     // Catch:{ all -> 0x00c9 }
            r8.stopSelf()     // Catch:{ all -> 0x00c9 }
            monitor-exit(r8)
            goto L_0x00dc
        L_0x00c9:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x00cc:
            b.l.a.d.a.e.f r10 = r8.f11400g
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r2] = r9
            java.lang.String r9 = "Unknown action type received: %d"
            r1 = 6
            r10.mo14884b(r1, r9, r0)
        L_0x00dc:
            return r11
        L_0x00dd:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.ExtractionForegroundService.onStartCommand(android.content.Intent, int, int):int");
    }
}
