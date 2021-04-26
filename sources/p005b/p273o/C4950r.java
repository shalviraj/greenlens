package p005b.p273o;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.onesignal.NotificationOpenedReceiver;
import com.segment.analytics.AnalyticsContext;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p273o.C4857i2;

/* renamed from: b.o.r */
public class C4950r {

    /* renamed from: a */
    public static Context f9548a;

    /* renamed from: b */
    public static String f9549b;

    /* renamed from: c */
    public static Resources f9550c;

    /* renamed from: d */
    public static Class<?> f9551d;

    /* renamed from: e */
    public static boolean f9552e;

    /* renamed from: b.o.r$a */
    public static class C4951a {

        /* renamed from: a */
        public NotificationCompat.Builder f9553a;

        /* renamed from: b */
        public boolean f9554b;

        public C4951a(C4941q qVar) {
        }
    }

    /* renamed from: a */
    public static void m9089a(JSONObject jSONObject, NotificationCompat.Builder builder) {
        JSONObject jSONObject2;
        Bitmap bitmap;
        String str;
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = m9096h(jSONObject2.optString("img", (String) null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = m9097i("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            RemoteViews remoteViews = new RemoteViews(f9548a.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(R.id.os_bgimage_notif_title, m9104p(jSONObject));
            remoteViews.setTextViewText(R.id.os_bgimage_notif_body, jSONObject.optString("alert"));
            m9108t(remoteViews, jSONObject2, R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            m9108t(remoteViews, jSONObject2, R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f9550c.getIdentifier("onesignal_bgimage_notif_image_align", "string", f9549b);
                str = identifier != 0 ? f9550c.getString(identifier) : null;
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, bitmap);
            }
            builder.setContent(remoteViews);
            builder.setStyle((NotificationCompat.Style) null);
        }
    }

    /* renamed from: b */
    public static void m9090b(JSONObject jSONObject, List list, List list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
        if (jSONObject2.has("a")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i);
                    list.add(jSONObject4.optString(NotificationCompat.MessagingStyle.Message.KEY_TEXT));
                    list2.add(jSONObject4.optString(AnalyticsContext.Device.DEVICE_ID_KEY));
                }
            }
        }
    }

    /* renamed from: c */
    public static void m9091c(JSONObject jSONObject, NotificationCompat.Builder builder, int i, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent n = m9102n(i);
                        n.setAction("" + i2);
                        n.putExtra("action_button", true);
                        jSONObject4.put("actionId", optJSONObject.optString(AnalyticsContext.Device.DEVICE_ID_KEY));
                        n.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            n.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            n.putExtra("grp", jSONObject.optString("grp"));
                        }
                        builder.addAction(optJSONObject.has("icon") ? m9103o(optJSONObject.optString("icon")) : 0, optJSONObject.optString(NotificationCompat.MessagingStyle.Message.KEY_TEXT), m9100l(i, n));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m9092d(C4951a aVar, Notification notification) {
        if (aVar.f9554b) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public static Intent m9093e(int i, JSONObject jSONObject, String str) {
        return m9102n(i).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0116 A[EDGE_INSN: B:110:0x0116->B:40:0x0116 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[SYNTHETIC, Splitter:B:22:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0128 A[LOOP:0: B:24:0x0095->B:49:0x0128, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9094f(p005b.p273o.C4849h0 r23, p005b.p273o.C4950r.C4951a r24) {
        /*
            r1 = r23
            r2 = r24
            java.lang.String r0 = "message"
            java.lang.String r3 = "title"
            java.lang.String r4 = "full_data"
            java.lang.String r5 = "is_summary"
            java.lang.String r6 = "android_notification_id"
            boolean r7 = r1.f9313c
            org.json.JSONObject r8 = r1.f9312b
            java.lang.String r9 = "grp"
            r10 = 0
            java.lang.String r9 = r8.optString(r9, r10)
            java.security.SecureRandom r11 = new java.security.SecureRandom
            r11.<init>()
            int r12 = r11.nextInt()
            r13 = 0
            android.content.Intent r14 = m9101m(r13)
            java.lang.String r15 = "summary"
            android.content.Intent r14 = r14.putExtra(r15, r9)
            android.app.PendingIntent r12 = m9100l(r12, r14)
            android.content.Context r14 = f9548a
            b.o.a3 r14 = p005b.p273o.C4783a3.m8766e(r14)
            java.lang.String[] r17 = new java.lang.String[]{r6, r4, r5, r3, r0}     // Catch:{ all -> 0x02d2 }
            java.lang.String r10 = "group_id = ? AND dismissed = 0 AND opened = 0"
            r15 = 1
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ all -> 0x02cf }
            r15[r13] = r9     // Catch:{ all -> 0x02cf }
            if (r7 != 0) goto L_0x006e
            java.lang.Integer r13 = r23.mo16584a()     // Catch:{ all -> 0x006a }
            int r13 = r13.intValue()     // Catch:{ all -> 0x006a }
            r1 = -1
            if (r13 == r1) goto L_0x006e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r1.<init>()     // Catch:{ all -> 0x006a }
            r1.append(r10)     // Catch:{ all -> 0x006a }
            java.lang.String r10 = " AND android_notification_id <> "
            r1.append(r10)     // Catch:{ all -> 0x006a }
            java.lang.Integer r10 = r23.mo16584a()     // Catch:{ all -> 0x006a }
            r1.append(r10)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006a }
            r18 = r1
            goto L_0x0070
        L_0x006a:
            r0 = move-exception
            r1 = 0
            goto L_0x02d4
        L_0x006e:
            r18 = r10
        L_0x0070:
            java.lang.String r16 = "notification"
            r20 = 0
            r21 = 0
            java.lang.String r22 = "_id DESC"
            r1 = r15
            r15 = r14
            r19 = r1
            android.database.Cursor r1 = r15.mo16511S(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x02cf }
            boolean r10 = r1.moveToFirst()     // Catch:{ all -> 0x02cd }
            java.lang.String r13 = " "
            java.lang.String r15 = ""
            if (r10 == 0) goto L_0x0132
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x02cd }
            r10.<init>()     // Catch:{ all -> 0x02cd }
            r16 = 0
            r17 = 0
            r18 = r8
        L_0x0095:
            int r8 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x02cd }
            int r8 = r1.getInt(r8)     // Catch:{ all -> 0x02cd }
            r2 = 1
            if (r8 != r2) goto L_0x00b1
            int r2 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x02cd }
            int r2 = r1.getInt(r2)     // Catch:{ all -> 0x02cd }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x02cd }
            r19 = r0
            r20 = r3
            goto L_0x010e
        L_0x00b1:
            int r2 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x02cd }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x02cd }
            if (r2 != 0) goto L_0x00bd
            r2 = r15
            goto L_0x00cc
        L_0x00bd:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x02cd }
            r8.<init>()     // Catch:{ all -> 0x02cd }
            r8.append(r2)     // Catch:{ all -> 0x02cd }
            r8.append(r13)     // Catch:{ all -> 0x02cd }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x02cd }
        L_0x00cc:
            int r8 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x02cd }
            java.lang.String r8 = r1.getString(r8)     // Catch:{ all -> 0x02cd }
            r19 = r0
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ all -> 0x02cd }
            r20 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02cd }
            r3.<init>()     // Catch:{ all -> 0x02cd }
            r3.append(r2)     // Catch:{ all -> 0x02cd }
            r3.append(r8)     // Catch:{ all -> 0x02cd }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02cd }
            r0.<init>(r3)     // Catch:{ all -> 0x02cd }
            int r3 = r2.length()     // Catch:{ all -> 0x02cd }
            if (r3 <= 0) goto L_0x0100
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan     // Catch:{ all -> 0x02cd }
            r8 = 1
            r3.<init>(r8)     // Catch:{ all -> 0x02cd }
            int r2 = r2.length()     // Catch:{ all -> 0x02cd }
            r8 = 0
            r0.setSpan(r3, r8, r2, r8)     // Catch:{ all -> 0x02cd }
        L_0x0100:
            r10.add(r0)     // Catch:{ all -> 0x02cd }
            if (r16 != 0) goto L_0x010e
            int r0 = r1.getColumnIndex(r4)     // Catch:{ all -> 0x02cd }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x02cd }
            goto L_0x0110
        L_0x010e:
            r0 = r16
        L_0x0110:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x02cd }
            if (r2 != 0) goto L_0x0128
            if (r7 == 0) goto L_0x0125
            if (r0 == 0) goto L_0x0125
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0121 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0121 }
            r8 = r2
            goto L_0x0137
        L_0x0121:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x02cd }
        L_0x0125:
            r8 = r18
            goto L_0x0137
        L_0x0128:
            r2 = r24
            r16 = r0
            r0 = r19
            r3 = r20
            goto L_0x0095
        L_0x0132:
            r18 = r8
            r10 = 0
            r17 = 0
        L_0x0137:
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x0140
            r1.close()
        L_0x0140:
            if (r17 != 0) goto L_0x016d
            int r0 = r11.nextInt()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            int r0 = r17.intValue()
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r0)
            java.lang.String r0 = "group_id"
            r1.put(r0, r9)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r5, r0)
            java.lang.String r0 = "notification"
            r2 = 0
            r14.mo16509N(r0, r2, r1)
        L_0x016d:
            int r0 = r11.nextInt()
            int r1 = r17.intValue()
            android.content.Intent r1 = m9093e(r1, r8, r9)
            android.app.PendingIntent r0 = m9100l(r0, r1)
            if (r10 == 0) goto L_0x028c
            if (r7 == 0) goto L_0x0188
            int r1 = r10.size()
            r2 = 1
            if (r1 > r2) goto L_0x0190
        L_0x0188:
            if (r7 != 0) goto L_0x028c
            int r1 = r10.size()
            if (r1 <= 0) goto L_0x028c
        L_0x0190:
            int r1 = r10.size()
            r2 = r7 ^ 1
            int r1 = r1 + r2
            java.lang.String r2 = "grp_msg"
            r3 = 0
            java.lang.String r2 = r8.optString(r2, r3)
            if (r2 != 0) goto L_0x01b2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r4 = " new messages"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x01c7
        L_0x01b2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "$[notif_count]"
            java.lang.String r2 = r2.replace(r5, r4)
        L_0x01c7:
            b.o.r$a r4 = m9095g(r23)
            androidx.core.app.NotificationCompat$Builder r4 = r4.f9553a
            if (r7 == 0) goto L_0x01d2
            m9105q(r4)
        L_0x01d2:
            androidx.core.app.NotificationCompat$Builder r0 = r4.setContentIntent(r0)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setDeleteIntent(r12)
            android.content.Context r5 = f9548a
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.Context r6 = f9548a
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()
            java.lang.CharSequence r5 = r5.getApplicationLabel(r6)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setContentTitle(r5)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setContentText(r2)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setNumber(r1)
            int r1 = m9098j()
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon(r1)
            java.lang.String r1 = "ic_onesignal_large_icon_default"
            android.graphics.Bitmap r1 = m9097i(r1)
            android.graphics.Bitmap r1 = m9106r(r1)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setLargeIcon(r1)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setOnlyAlertOnce(r7)
            r1 = 0
            androidx.core.app.NotificationCompat$Builder r0 = r0.setAutoCancel(r1)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setGroup(r9)
            r1 = 1
            r0.setGroupSummary(r1)
            r4.setGroupAlertBehavior(r1)     // Catch:{ all -> 0x0220 }
        L_0x0220:
            if (r7 != 0) goto L_0x0225
            r4.setTicker(r2)
        L_0x0225:
            androidx.core.app.NotificationCompat$InboxStyle r0 = new androidx.core.app.NotificationCompat$InboxStyle
            r0.<init>()
            if (r7 != 0) goto L_0x026d
            java.lang.CharSequence r1 = r23.mo16587d()
            if (r1 == 0) goto L_0x023c
            java.lang.CharSequence r1 = r23.mo16587d()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = r1.toString()
        L_0x023c:
            if (r3 != 0) goto L_0x023f
            goto L_0x0243
        L_0x023f:
            java.lang.String r15 = p005b.p035e.p036a.p037a.C0843a.m451l(r3, r13)
        L_0x0243:
            java.lang.CharSequence r1 = r23.mo16586c()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.toString()
            android.text.SpannableString r3 = new android.text.SpannableString
            java.lang.String r1 = p005b.p035e.p036a.p037a.C0843a.m451l(r15, r1)
            r3.<init>(r1)
            int r1 = r15.length()
            if (r1 <= 0) goto L_0x026a
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r5 = 1
            r1.<init>(r5)
            int r5 = r15.length()
            r6 = 0
            r3.setSpan(r1, r6, r5, r6)
        L_0x026a:
            r0.addLine(r3)
        L_0x026d:
            java.util.Iterator r1 = r10.iterator()
        L_0x0271:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0281
            java.lang.Object r3 = r1.next()
            android.text.SpannableString r3 = (android.text.SpannableString) r3
            r0.addLine(r3)
            goto L_0x0271
        L_0x0281:
            r0.setBigContentTitle(r2)
            r4.setStyle(r0)
            android.app.Notification r0 = r4.build()
            goto L_0x02bf
        L_0x028c:
            r1 = r24
            androidx.core.app.NotificationCompat$Builder r2 = r1.f9553a
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r3 = r2.mActions
            r3.clear()
            int r3 = r17.intValue()
            m9091c(r8, r2, r3, r9)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setDeleteIntent(r12)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setOnlyAlertOnce(r7)
            r3 = 0
            androidx.core.app.NotificationCompat$Builder r0 = r0.setAutoCancel(r3)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setGroup(r9)
            r3 = 1
            r0.setGroupSummary(r3)
            r2.setGroupAlertBehavior(r3)     // Catch:{ all -> 0x02b8 }
        L_0x02b8:
            android.app.Notification r0 = r2.build()
            m9092d(r1, r0)
        L_0x02bf:
            android.content.Context r1 = f9548a
            androidx.core.app.NotificationManagerCompat r1 = androidx.core.app.NotificationManagerCompat.from(r1)
            int r2 = r17.intValue()
            r1.notify(r2, r0)
            return
        L_0x02cd:
            r0 = move-exception
            goto L_0x02d4
        L_0x02cf:
            r0 = move-exception
            r10 = 0
            goto L_0x02d3
        L_0x02d2:
            r0 = move-exception
        L_0x02d3:
            r1 = r10
        L_0x02d4:
            if (r1 == 0) goto L_0x02df
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L_0x02df
            r1.close()
        L_0x02df:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4950r.m9094f(b.o.h0, b.o.r$a):void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0094 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084 A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d A[SYNTHETIC, Splitter:B:23:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e8 A[SYNTHETIC, Splitter:B:45:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p273o.C4950r.C4951a m9095g(p005b.p273o.C4849h0 r12) {
        /*
            java.lang.String r0 = "vis"
            org.json.JSONObject r1 = r12.f9312b
            b.o.r$a r2 = new b.o.r$a
            r3 = 0
            r2.<init>(r3)
            java.lang.String r4 = p005b.p273o.C4833f0.m8852b(r12)     // Catch:{ all -> 0x0016 }
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder     // Catch:{ all -> 0x0016 }
            android.content.Context r6 = f9548a     // Catch:{ all -> 0x0016 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0016 }
            goto L_0x001d
        L_0x0016:
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r4 = f9548a
            r5.<init>(r4)
        L_0x001d:
            java.lang.String r4 = "alert"
            java.lang.String r4 = r1.optString(r4, r3)
            r6 = 1
            androidx.core.app.NotificationCompat$Builder r7 = r5.setAutoCancel(r6)
            java.lang.String r8 = "sicon"
            java.lang.String r8 = r1.optString(r8, r3)
            int r8 = m9103o(r8)
            if (r8 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r8 = m9098j()
        L_0x0039:
            androidx.core.app.NotificationCompat$Builder r7 = r7.setSmallIcon(r8)
            androidx.core.app.NotificationCompat$BigTextStyle r8 = new androidx.core.app.NotificationCompat$BigTextStyle
            r8.<init>()
            androidx.core.app.NotificationCompat$BigTextStyle r8 = r8.bigText(r4)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setStyle(r8)
            androidx.core.app.NotificationCompat$Builder r7 = r7.setContentText(r4)
            r7.setTicker(r4)
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.optString(r7)
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0066
            java.lang.CharSequence r7 = m9104p(r1)
            r5.setContentTitle(r7)
        L_0x0066:
            r7 = 16
            java.lang.String r8 = "bgac"
            boolean r9 = r1.has(r8)     // Catch:{ all -> 0x007a }
            if (r9 == 0) goto L_0x007a
            java.math.BigInteger r9 = new java.math.BigInteger     // Catch:{ all -> 0x007a }
            java.lang.String r8 = r1.optString(r8, r3)     // Catch:{ all -> 0x007a }
            r9.<init>(r8, r7)     // Catch:{ all -> 0x007a }
            goto L_0x008b
        L_0x007a:
            android.content.Context r8 = f9548a     // Catch:{ all -> 0x008a }
            java.lang.String r9 = "com.onesignal.NotificationAccentColor.DEFAULT"
            java.lang.String r8 = p005b.p273o.C4835f2.m8855d(r8, r9)     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x008a
            java.math.BigInteger r9 = new java.math.BigInteger     // Catch:{ all -> 0x008a }
            r9.<init>(r8, r7)     // Catch:{ all -> 0x008a }
            goto L_0x008b
        L_0x008a:
            r9 = r3
        L_0x008b:
            if (r9 == 0) goto L_0x0094
            int r8 = r9.intValue()     // Catch:{ all -> 0x0094 }
            r5.setColor(r8)     // Catch:{ all -> 0x0094 }
        L_0x0094:
            boolean r8 = r1.has(r0)     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x00a3
            java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x00a7 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a4
        L_0x00a3:
            r0 = r6
        L_0x00a4:
            r5.setVisibility(r0)     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            java.lang.String r0 = "licon"
            java.lang.String r0 = r1.optString(r0)
            android.graphics.Bitmap r0 = m9096h(r0)
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "ic_onesignal_large_icon_default"
            android.graphics.Bitmap r0 = m9097i(r0)
        L_0x00b9:
            if (r0 != 0) goto L_0x00bd
            r0 = r3
            goto L_0x00c1
        L_0x00bd:
            android.graphics.Bitmap r0 = m9106r(r0)
        L_0x00c1:
            if (r0 == 0) goto L_0x00c8
            r2.f9554b = r6
            r5.setLargeIcon(r0)
        L_0x00c8:
            java.lang.String r0 = "bicon"
            java.lang.String r0 = r1.optString(r0, r3)
            android.graphics.Bitmap r0 = m9096h(r0)
            if (r0 == 0) goto L_0x00e4
            androidx.core.app.NotificationCompat$BigPictureStyle r8 = new androidx.core.app.NotificationCompat$BigPictureStyle
            r8.<init>()
            androidx.core.app.NotificationCompat$BigPictureStyle r0 = r8.bigPicture(r0)
            androidx.core.app.NotificationCompat$BigPictureStyle r0 = r0.setSummaryText(r4)
            r5.setStyle(r0)
        L_0x00e4:
            java.lang.Long r12 = r12.f9316f
            if (r12 == 0) goto L_0x00f2
            long r8 = r12.longValue()     // Catch:{ all -> 0x00f2 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            r5.setWhen(r8)     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r12 = 6
            java.lang.String r0 = "pri"
            int r12 = r1.optInt(r0, r12)
            r0 = 9
            r4 = 4
            r8 = 0
            r9 = 2
            if (r12 <= r0) goto L_0x0101
            goto L_0x010f
        L_0x0101:
            r0 = 7
            if (r12 <= r0) goto L_0x0106
            r9 = r6
            goto L_0x010f
        L_0x0106:
            if (r12 <= r4) goto L_0x010a
            r9 = r8
            goto L_0x010f
        L_0x010a:
            if (r12 <= r9) goto L_0x010e
            r9 = -1
            goto L_0x010f
        L_0x010e:
            r9 = -2
        L_0x010f:
            r5.setPriority(r9)
            if (r9 >= 0) goto L_0x0116
            r12 = r6
            goto L_0x0117
        L_0x0116:
            r12 = r8
        L_0x0117:
            if (r12 == 0) goto L_0x011b
            goto L_0x019c
        L_0x011b:
            java.lang.String r12 = "ledc"
            boolean r0 = r1.has(r12)
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "led"
            int r0 = r1.optInt(r0, r6)
            if (r0 != r6) goto L_0x0140
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0140 }
            java.lang.String r12 = r1.optString(r12)     // Catch:{ all -> 0x0140 }
            r0.<init>(r12, r7)     // Catch:{ all -> 0x0140 }
            int r12 = r0.intValue()     // Catch:{ all -> 0x0140 }
            r0 = 2000(0x7d0, float:2.803E-42)
            r7 = 5000(0x1388, float:7.006E-42)
            r5.setLights(r12, r0, r7)     // Catch:{ all -> 0x0140 }
            r4 = r8
        L_0x0140:
            java.lang.String r12 = p005b.p273o.C4857i2.f9356a
            java.lang.String r12 = p005b.p273o.C4815d3.f9230a
            java.lang.String r0 = "GT_VIBRATE_ENABLED"
            boolean r0 = p005b.p273o.C4815d3.m8827b(r12, r0, r6)
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = "vib"
            int r0 = r1.optInt(r0, r6)
            if (r0 != r6) goto L_0x0168
            java.lang.String r0 = "vib_pt"
            boolean r0 = r1.has(r0)
            if (r0 == 0) goto L_0x0166
            long[] r0 = p005b.p273o.C4835f2.m8870t(r1)
            if (r0 == 0) goto L_0x0168
            r5.setVibrate(r0)
            goto L_0x0168
        L_0x0166:
            r4 = r4 | 2
        L_0x0168:
            java.lang.String r0 = "sound"
            java.lang.String r7 = r1.optString(r0, r3)
            java.lang.String r9 = "null"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x0185
            java.lang.String r9 = "nil"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x017f
            goto L_0x0185
        L_0x017f:
            java.lang.String r7 = "GT_SOUND_ENABLED"
            boolean r8 = p005b.p273o.C4815d3.m8827b(r12, r7, r6)
        L_0x0185:
            if (r8 == 0) goto L_0x0199
            android.content.Context r12 = f9548a
            java.lang.String r0 = r1.optString(r0, r3)
            android.net.Uri r12 = p005b.p273o.C4835f2.m8857g(r12, r0)
            if (r12 == 0) goto L_0x0197
            r5.setSound(r12)
            goto L_0x0199
        L_0x0197:
            r4 = r4 | 1
        L_0x0199:
            r5.setDefaults(r4)
        L_0x019c:
            r2.f9553a = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4950r.m9095g(b.o.h0):b.o.r$a");
    }

    /* renamed from: h */
    public static Bitmap m9096h(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
            return m9097i(str);
        }
        try {
            return BitmapFactory.decodeStream(new URL(trim).openConnection().getInputStream());
        } catch (Throwable th) {
            C4857i2.m8933a(C4857i2.C4868k.WARN, "Could not download image!", th);
            return null;
        }
    }

    /* renamed from: i */
    public static Bitmap m9097i(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(f9548a.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    bitmap = BitmapFactory.decodeStream(f9548a.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int o = m9103o(str);
            if (o != 0) {
                return BitmapFactory.decodeResource(f9550c, o);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    /* renamed from: j */
    public static int m9098j() {
        int k = m9099k("ic_stat_onesignal_default");
        if (k != 0) {
            return k;
        }
        int k2 = m9099k("corona_statusbar_icon_default");
        if (k2 != 0) {
            return k2;
        }
        int k3 = m9099k("ic_os_notification_fallback_white_24dp");
        if (k3 != 0) {
            return k3;
        }
        return 17301598;
    }

    /* renamed from: k */
    public static int m9099k(String str) {
        return f9550c.getIdentifier(str, "drawable", f9549b);
    }

    /* renamed from: l */
    public static PendingIntent m9100l(int i, Intent intent) {
        return f9552e ? PendingIntent.getBroadcast(f9548a, i, intent, 134217728) : PendingIntent.getActivity(f9548a, i, intent, 134217728);
    }

    /* renamed from: m */
    public static Intent m9101m(int i) {
        Intent putExtra = new Intent(f9548a, f9551d).putExtra("androidNotificationId", i).putExtra("dismissed", true);
        return f9552e ? putExtra : putExtra.addFlags(402718720);
    }

    /* renamed from: n */
    public static Intent m9102n(int i) {
        Intent putExtra = new Intent(f9548a, f9551d).putExtra("androidNotificationId", i);
        return f9552e ? putExtra : putExtra.addFlags(603979776);
    }

    /* renamed from: o */
    public static int m9103o(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (!(trim != null && !trim.matches("^[0-9]"))) {
            return 0;
        }
        int k = m9099k(trim);
        if (k != 0) {
            return k;
        }
        try {
            return R.drawable.class.getField(str).getInt((Object) null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: p */
    public static CharSequence m9104p(JSONObject jSONObject) {
        String optString = jSONObject.optString("title", (String) null);
        return optString != null ? optString : f9548a.getPackageManager().getApplicationLabel(f9548a.getApplicationInfo());
    }

    /* renamed from: q */
    public static void m9105q(NotificationCompat.Builder builder) {
        builder.setOnlyAlertOnce(true).setDefaults(0).setSound((Uri) null).setVibrate((long[]) null).setTicker((CharSequence) null);
    }

    /* renamed from: r */
    public static Bitmap m9106r(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f9550c.getDimension(17104902);
            int dimension2 = (int) f9550c.getDimension(17104901);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (((float) dimension) * (((float) width) / ((float) height)));
            } else if (width > height) {
                dimension = (int) (((float) dimension2) * (((float) height) / ((float) width)));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    /* renamed from: s */
    public static void m9107s(Context context) {
        Class cls;
        f9548a = context;
        f9549b = context.getPackageName();
        f9550c = f9548a.getResources();
        PackageManager packageManager = f9548a.getPackageManager();
        Intent intent = new Intent(f9548a, NotificationOpenedReceiver.class);
        intent.setPackage(f9548a.getPackageName());
        if (packageManager.queryBroadcastReceivers(intent, 0).size() > 0) {
            f9552e = true;
            cls = NotificationOpenedReceiver.class;
        } else {
            cls = C4881j0.class;
        }
        f9551d = cls;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9108t(android.widget.RemoteViews r1, org.json.JSONObject r2, int r3, java.lang.String r4, java.lang.String r5) {
        /*
            if (r2 == 0) goto L_0x001c
            boolean r0 = r2.has(r4)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001c
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x001c }
            java.lang.String r2 = r2.optString(r4)     // Catch:{ all -> 0x001c }
            r4 = 16
            r0.<init>(r2, r4)     // Catch:{ all -> 0x001c }
            int r2 = r0.intValue()     // Catch:{ all -> 0x001c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x0024
            int r2 = r2.intValue()
            goto L_0x0036
        L_0x0024:
            android.content.res.Resources r2 = f9550c
            java.lang.String r4 = f9549b
            java.lang.String r0 = "color"
            int r2 = r2.getIdentifier(r5, r0, r4)
            if (r2 == 0) goto L_0x0039
            android.content.Context r4 = f9548a
            int r2 = r4.getColor(r2)
        L_0x0036:
            r1.setTextColor(r3, r2)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4950r.m9108t(android.widget.RemoteViews, org.json.JSONObject, int, java.lang.String, java.lang.String):void");
    }
}
