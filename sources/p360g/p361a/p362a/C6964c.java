package p360g.p361a.p362a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;
import java.util.zip.ZipFile;
import p005b.p035e.p036a.p037a.C0843a;
import p360g.p361a.p362a.p363e.C6967a;

/* renamed from: g.a.a.c */
public final class C6964c {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static Application f13963a;

    /* renamed from: b */
    public static C6967a f13964b = new C6967a();

    /* renamed from: c */
    public static final Deque<String> f13965c = new ArrayDeque(50);

    /* renamed from: d */
    public static WeakReference<Activity> f13966d = new WeakReference<>((Object) null);

    /* renamed from: e */
    public static boolean f13967e = true;

    /* renamed from: g.a.a.c$a */
    public interface C6965a extends Serializable {
        /* renamed from: n */
        void mo24355n();

        /* renamed from: r */
        void mo24356r();

        /* renamed from: u */
        void mo24357u();
    }

    @NonNull
    /* renamed from: a */
    public static String m12557a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    @NonNull
    /* renamed from: b */
    public static String m12558b(@NonNull Context context, @NonNull Intent intent) {
        long j;
        String str;
        String str2;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
            j = zipFile.getEntry("classes.dex").getTime();
            zipFile.close();
        } catch (Exception unused) {
            j = 0;
        }
        String format = j > 312764400000L ? simpleDateFormat.format(new Date(j)) : null;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused2) {
            str = "Unknown";
        }
        String str3 = "" + "Build version: " + str + " \n";
        if (format != null) {
            str3 = str3 + "Build date: " + format + " \n";
        }
        StringBuilder y = C0843a.m464y(str3, "Current date: ");
        y.append(simpleDateFormat.format(date));
        y.append(" \n");
        StringBuilder y2 = C0843a.m464y(y.toString(), "Device: ");
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        if (str5.startsWith(str4)) {
            str2 = m12557a(str5);
        } else {
            str2 = m12557a(str4) + " " + str5;
        }
        StringBuilder u = C0843a.m460u(C0843a.m451l(C0843a.m455p(y2, str2, " \n \n"), "Stack trace:  \n"));
        u.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        String sb = u.toString();
        String stringExtra = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
        return stringExtra != null ? C0843a.m451l(C0843a.m451l(sb, "\nUser actions: \n"), stringExtra) : sb;
    }

    @Nullable
    /* renamed from: c */
    public static C6967a m12559c(@NonNull Intent intent) {
        C6967a aVar = (C6967a) intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (aVar.f13973k && intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE") != null) {
            StringBuilder u = C0843a.m460u("The previous app process crashed. This is the stack trace of the crash:\n");
            u.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
            Log.e("CustomActivityOnCrash", u.toString());
        }
        return aVar;
    }

    /* renamed from: d */
    public static void m12560d() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    /* renamed from: e */
    public static void m12561e(@NonNull Activity activity, @NonNull C6967a aVar) {
        Intent intent = new Intent(activity, aVar.f13978p);
        intent.addFlags(270565376);
        if (intent.getComponent() != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        C6965a aVar2 = aVar.f13979q;
        if (aVar2 != null) {
            aVar2.mo24357u();
        }
        activity.finish();
        activity.startActivity(intent);
        m12560d();
    }
}
