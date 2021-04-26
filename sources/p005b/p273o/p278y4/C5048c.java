package p005b.p273o.p278y4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.y4.c */
public final class C5048c {

    /* renamed from: a */
    public static final List<Class<? extends C5046a>> f9753a;

    /* renamed from: b */
    public static C5046a f9754b;

    /* renamed from: c */
    public static ComponentName f9755c;

    static {
        LinkedList linkedList = new LinkedList();
        f9753a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    /* renamed from: a */
    public static void m9244a(Context context, int i) {
        if (f9754b == null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            boolean z = false;
            if (launchIntentForPackage == null) {
                StringBuilder u = C0843a.m460u("Unable to find launch intent for package ");
                u.append(context.getPackageName());
                Log.e("ShortcutBadger", u.toString());
            } else {
                f9755c = launchIntentForPackage.getComponent();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null && !resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                    String str = resolveActivity.activityInfo.packageName;
                    Iterator<Class<? extends C5046a>> it = f9753a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C5046a aVar = null;
                        try {
                            aVar = (C5046a) it.next().newInstance();
                        } catch (Exception unused) {
                        }
                        if (aVar != null && aVar.mo16800a().contains(str)) {
                            f9754b = aVar;
                            break;
                        }
                    }
                    if (f9754b == null) {
                        String str2 = Build.MANUFACTURER;
                        f9754b = str2.equalsIgnoreCase("ZUK") ? new ZukHomeBadger() : str2.equalsIgnoreCase("OPPO") ? new OPPOHomeBader() : str2.equalsIgnoreCase("VIVO") ? new VivoHomeBadger() : new DefaultBadger();
                    }
                    z = true;
                }
            }
            if (!z) {
                throw new C5047b("No default launcher available");
            }
        }
        try {
            f9754b.mo16801b(context, f9755c, i);
        } catch (Exception e) {
            throw new C5047b("Unable to execute badge", e);
        }
    }
}
