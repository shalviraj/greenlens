package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p213v.C4244g0;
import p005b.p096l.p180d.p213v.C4252k0;
import p005b.p096l.p180d.p213v.C4278x;
import p005b.p096l.p180d.p213v.C4280y;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    public static C4252k0 f11453a;

    /* renamed from: b */
    public static int m10557b(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        C4252k0 k0Var;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (f11453a == null) {
                f11453a = new C4252k0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            k0Var = f11453a;
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (k0Var) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            k0Var.f7873d.add(new C4244g0(intent, goAsync, k0Var.f7872c));
            k0Var.mo15841a();
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo22179a(Context context, Intent intent) {
        ComponentName componentName;
        String str = null;
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        int i = -1;
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(valueOf.length() + stringExtra.length() + 21);
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.m10541a().mo22177o();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId a = FirebaseInstanceId.m10541a();
                    Objects.requireNonNull(a);
                    C4278x xVar = FirebaseInstanceId.f11438j;
                    synchronized (xVar) {
                        String concat = "".concat("|T|");
                        SharedPreferences.Editor edit = xVar.f7924a.edit();
                        for (String next : xVar.f7924a.getAll().keySet()) {
                            if (next.startsWith(concat)) {
                                edit.remove(next);
                            }
                        }
                        edit.commit();
                    }
                    a.mo22169c();
                }
            }
        } else {
            String stringExtra2 = intent.getStringExtra("gcm.rawData64");
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra("gcm.rawData64");
            }
            boolean z = true;
            boolean z2 = C1960d.m2806i0() && context.getApplicationInfo().targetSdkVersion >= 26;
            if ((intent.getFlags() & 268435456) == 0) {
                z = false;
            }
            if (!z2 || z) {
                C4280y a2 = C4280y.m7833a();
                Objects.requireNonNull(a2);
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Starting service");
                }
                a2.f7934d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a2) {
                    String str2 = a2.f7931a;
                    if (str2 != null) {
                        str = str2;
                    } else {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveService != null) {
                            ServiceInfo serviceInfo = resolveService.serviceInfo;
                            if (serviceInfo != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName)) {
                                    String str3 = serviceInfo.name;
                                    if (str3 != null) {
                                        if (str3.startsWith(".")) {
                                            String valueOf2 = String.valueOf(context.getPackageName());
                                            String valueOf3 = String.valueOf(serviceInfo.name);
                                            str = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                                        } else {
                                            str = serviceInfo.name;
                                        }
                                        a2.f7931a = str;
                                    }
                                }
                                String str4 = serviceInfo.packageName;
                                String str5 = serviceInfo.name;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 94 + String.valueOf(str5).length());
                                sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                                sb2.append(str4);
                                sb2.append("/");
                                sb2.append(str5);
                                Log.e("FirebaseInstanceId", sb2.toString());
                            }
                        }
                        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", str.length() != 0 ? "Restricting intent to a specific service: ".concat(str) : new String("Restricting intent to a specific service: "));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (a2.mo15878b(context)) {
                        componentName = WakefulBroadcastReceiver.startWakefulService(context, intent2);
                    } else {
                        componentName = context.startService(intent2);
                        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentName == null) {
                        Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    }
                } catch (SecurityException e) {
                    Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
                    i = 401;
                } catch (IllegalStateException e2) {
                    String valueOf4 = String.valueOf(e2);
                    StringBuilder sb3 = new StringBuilder(valueOf4.length() + 45);
                    sb3.append("Failed to start service while in background: ");
                    sb3.append(valueOf4);
                    Log.e("FirebaseInstanceId", sb3.toString());
                    i = 402;
                }
                if (C1960d.m2806i0() && i == 402) {
                    m10557b(this, context, intent);
                    i = 403;
                }
            } else {
                m10557b(this, context, intent);
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                mo22179a(context, intent2);
            } else {
                mo22179a(context, intent);
            }
        }
    }
}
