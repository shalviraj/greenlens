package p005b.p096l.p097a.p113c.p119b.p122m;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p005b.p096l.p097a.p113c.p119b.C1766h;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p128q.C1967a;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;

/* renamed from: b.l.a.c.b.m.e */
public final class C1909e {

    /* renamed from: a */
    public static final SimpleArrayMap<String, String> f3425a = new SimpleArrayMap<>();

    /* renamed from: a */
    public static String m2632a(Context context) {
        String packageName = context.getPackageName();
        try {
            C1967a a = C1968b.m2885a(context);
            return a.f3529a.getPackageManager().getApplicationLabel(a.f3529a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    /* renamed from: b */
    public static String m2633b(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : R.string.common_google_play_services_enable_button : R.string.common_google_play_services_update_button : R.string.common_google_play_services_install_button);
    }

    @NonNull
    /* renamed from: c */
    public static String m2634c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m2632a(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m2637f(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m2637f(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m2637f(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m2637f(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m2637f(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C1960d.m2846s0(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a});
        }
    }

    @Nullable
    /* renamed from: d */
    public static String m2635d(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m2636e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m2636e(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m2636e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m2636e(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static String m2636e(Context context, String str) {
        Resources resources;
        SimpleArrayMap<String, String> simpleArrayMap = f3425a;
        synchronized (simpleArrayMap) {
            String str2 = simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = C1766h.f3115e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            f3425a.put(str, string);
            return string;
        }
    }

    /* renamed from: f */
    public static String m2637f(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = m2636e(context, str);
        if (e == null) {
            e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, new Object[]{str2});
    }
}
