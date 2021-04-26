package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashSet;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p352f.p353a.p355b.p357b.p358g.C6946b;
import p352f.p353a.p355b.p357b.p358g.C6953e;

public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    public static class MediaButtonConnectionCallback extends MediaBrowserCompat.C0003b {
        private final Context mContext;
        private final Intent mIntent;
        private MediaBrowserCompat mMediaBrowser;
        private final BroadcastReceiver.PendingResult mPendingResult;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.mContext = context;
            this.mIntent = intent;
            this.mPendingResult = pendingResult;
        }

        private void finish() {
            Messenger messenger;
            MediaBrowserCompat.C0007d dVar = (MediaBrowserCompat.C0007d) this.mMediaBrowser.f1a;
            MediaBrowserCompat.C0011h hVar = dVar.f12f;
            if (!(hVar == null || (messenger = dVar.f13g) == null)) {
                try {
                    hVar.mo16a(7, (Bundle) null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            ((MediaBrowser) dVar.f8b).disconnect();
            this.mPendingResult.finish();
        }

        public void onConnected() {
            try {
                Context context = this.mContext;
                MediaBrowserCompat.C0007d dVar = (MediaBrowserCompat.C0007d) this.mMediaBrowser.f1a;
                if (dVar.f14h == null) {
                    dVar.f14h = MediaSessionCompat.Token.m28a(((MediaBrowser) dVar.f8b).getSessionToken(), (C6946b) null);
                }
                MediaSessionCompat.Token token = dVar.f14h;
                new HashSet();
                if (token != null) {
                    C6953e eVar = new C6953e(context, token);
                    KeyEvent keyEvent = (KeyEvent) this.mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null) {
                        ((MediaController) eVar.f35a).dispatchMediaButtonEvent(keyEvent);
                        finish();
                        return;
                    }
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                throw new IllegalArgumentException("sessionToken must not be null");
            } catch (RemoteException e) {
                Log.e(MediaButtonReceiver.TAG, "Failed to create a media controller", e);
            }
        }

        public void onConnectionFailed() {
            finish();
        }

        public void onConnectionSuspended() {
            finish();
        }

        public void setMediaBrowser(MediaBrowserCompat mediaBrowserCompat) {
            this.mMediaBrowser = mediaBrowserCompat;
        }
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent != null) {
            return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j);
        }
        Log.w(TAG, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j) {
        String str;
        if (componentName == null) {
            str = "The component name of media button receiver should be provided.";
        } else {
            int i = j == 4 ? 126 : j == 2 ? 127 : j == 32 ? 87 : j == 16 ? 88 : j == 1 ? 86 : j == 64 ? 90 : j == 8 ? 89 : j == 512 ? 85 : 0;
            if (i == 0) {
                str = "Cannot build a media button pending intent with the given action: " + j;
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
                return PendingIntent.getBroadcast(context, i, intent, 0);
            }
        }
        Log.w(TAG, str);
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w(TAG, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder z = C0843a.m465z("Expected 1 service that handles ", str, ", found ");
            z.append(queryIntentServices.size());
            throw new IllegalStateException(z.toString());
        }
    }

    public static KeyEvent handleIntent(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        throw null;
    }

    private static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d(TAG, "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction != null) {
            intent.setComponent(serviceComponentByAction);
            startForegroundService(context, intent);
            return;
        }
        ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, MediaBrowserServiceCompat.SERVICE_INTERFACE);
        if (serviceComponentByAction2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback, (Bundle) null);
            mediaButtonConnectionCallback.setMediaBrowser(mediaBrowserCompat);
            ((MediaBrowser) ((MediaBrowserCompat.C0007d) mediaBrowserCompat.f1a).f8b).connect();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
