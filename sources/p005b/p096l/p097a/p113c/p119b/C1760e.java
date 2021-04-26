package p005b.p096l.p097a.p113c.p119b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p040g.p041a.p046h.C0893n;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1794a1;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1798b1;
import p005b.p096l.p097a.p113c.p119b.p122m.C1909e;
import p005b.p096l.p097a.p113c.p119b.p122m.C1911f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1952x;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p134c.C2016c;

/* renamed from: b.l.a.c.b.e */
public class C1760e extends C1763f {

    /* renamed from: c */
    public static final Object f3107c = new Object();

    /* renamed from: d */
    public static final C1760e f3108d = new C1760e();

    @SuppressLint({"HandlerLeak"})
    /* renamed from: b.l.a.c.b.e$a */
    public class C1761a extends C2016c {

        /* renamed from: a */
        public final Context f3109a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1761a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f3109a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int d = C1760e.this.mo12006d(this.f3109a);
            if (C1760e.this.mo12005c(d)) {
                C1760e eVar = C1760e.this;
                Context context = this.f3109a;
                Intent a = eVar.mo12003a(context, d, C0893n.f779k);
                eVar.mo12009i(context, d, a == null ? null : PendingIntent.getActivity(context, 0, a, 134217728));
            }
        }
    }

    /* renamed from: f */
    public static Dialog m2330f(Context context, int i, C1911f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C1909e.m2634c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b = C1909e.m2633b(context, i);
        if (b != null) {
            builder.setPositiveButton(b, fVar);
        }
        String d = C1909e.m2635d(context, i);
        if (d != null) {
            builder.setTitle(d);
        }
        return builder.create();
    }

    /* renamed from: h */
    public static void m2331h(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            C1769k kVar = new C1769k();
            C0823f.m380l(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            kVar.f3122g = dialog;
            if (onCancelListener != null) {
                kVar.f3123h = onCancelListener;
            }
            kVar.show(supportFragmentManager, str);
            return;
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        C1756c cVar = new C1756c();
        C0823f.m380l(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f3098g = dialog;
        if (onCancelListener != null) {
            cVar.f3099h = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Nullable
    /* renamed from: a */
    public Intent mo12003a(Context context, int i, @Nullable String str) {
        return super.mo12003a(context, i, str);
    }

    /* renamed from: b */
    public int mo12004b(Context context, int i) {
        return super.mo12004b(context, i);
    }

    /* renamed from: c */
    public final boolean mo12005c(int i) {
        return super.mo12005c(i);
    }

    /* renamed from: d */
    public int mo12006d(Context context) {
        return mo12004b(context, C1763f.f3112a);
    }

    /* renamed from: e */
    public boolean mo12007e(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog f = m2330f(activity, i, new C1952x(super.mo12003a(activity, i, "d"), activity, i2), onCancelListener);
        if (f == null) {
            return false;
        }
        m2331h(activity, f, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Nullable
    /* renamed from: g */
    public final C1798b1 mo12008g(Context context, C1794a1 a1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C1798b1 b1Var = new C1798b1(a1Var);
        context.registerReceiver(b1Var, intentFilter);
        b1Var.f3147a = context;
        if (C1767i.m2346d(context, "com.google.android.gms")) {
            return b1Var;
        }
        a1Var.mo12044a();
        b1Var.mo12047a();
        return null;
    }

    @TargetApi(20)
    /* renamed from: i */
    public final void mo12009i(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            new C1761a(context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String e = i == 6 ? C1909e.m2636e(context, "common_google_play_services_resolution_required_title") : C1909e.m2635d(context, i);
            if (e == null) {
                e = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            String f = (i == 6 || i == 19) ? C1909e.m2637f(context, "common_google_play_services_resolution_required_text", C1909e.m2632a(context)) : C1909e.m2634c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(e).setStyle(new NotificationCompat.BigTextStyle().bigText(f));
            if (C1960d.m2842r0(context)) {
                C0823f.m384n(true);
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (C1960d.m2846s0(context)) {
                    style.addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(f);
            }
            if (C1960d.m2806i0()) {
                C0823f.m384n(C1960d.m2806i0());
                synchronized (f3107c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                SimpleArrayMap<String, String> simpleArrayMap = C1909e.f3425a;
                String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    style.setChannelId("com.google.android.gms.availability");
                }
                notificationManager.createNotificationChannel(notificationChannel);
                style.setChannelId("com.google.android.gms.availability");
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C1767i.f3118c.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
