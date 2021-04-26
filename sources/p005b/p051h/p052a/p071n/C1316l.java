package p005b.p051h.p052a.p071n;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0943i;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.n.l */
public class C1316l implements Handler.Callback {

    /* renamed from: f */
    public static final C1318b f1661f = new C1317a();

    /* renamed from: a */
    public volatile C0943i f1662a;
    @VisibleForTesting

    /* renamed from: b */
    public final Map<FragmentManager, C1314k> f1663b = new HashMap();
    @VisibleForTesting

    /* renamed from: c */
    public final Map<androidx.fragment.app.FragmentManager, C1321o> f1664c = new HashMap();

    /* renamed from: d */
    public final Handler f1665d;

    /* renamed from: e */
    public final C1318b f1666e;

    /* renamed from: b.h.a.n.l$a */
    public class C1317a implements C1318b {
        @NonNull
        /* renamed from: a */
        public C0943i mo10757a(@NonNull C0929c cVar, @NonNull C1311h hVar, @NonNull C1319m mVar, @NonNull Context context) {
            return new C0943i(cVar, hVar, mVar, context);
        }
    }

    /* renamed from: b.h.a.n.l$b */
    public interface C1318b {
        @NonNull
        /* renamed from: a */
        C0943i mo10757a(@NonNull C0929c cVar, @NonNull C1311h hVar, @NonNull C1319m mVar, @NonNull Context context);
    }

    public C1316l(@Nullable C1318b bVar) {
        new ArrayMap();
        new ArrayMap();
        new Bundle();
        this.f1666e = bVar == null ? f1661f : bVar;
        this.f1665d = new Handler(Looper.getMainLooper(), this);
    }

    @Nullable
    /* renamed from: a */
    public static Activity m1337a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m1337a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m1338e(Context context) {
        Activity a = m1337a(context);
        return a == null || !a.isFinishing();
    }

    @NonNull
    /* renamed from: b */
    public C0943i mo11157b(@NonNull Context context) {
        if (context != null) {
            if (C1380j.m1476i() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    if (C1380j.m1475h()) {
                        return mo11157b(fragmentActivity.getApplicationContext());
                    }
                    if (!fragmentActivity.isDestroyed()) {
                        C1321o d = mo11159d(fragmentActivity.getSupportFragmentManager(), (Fragment) null, m1338e(fragmentActivity));
                        C0943i iVar = d.f1674k;
                        if (iVar != null) {
                            return iVar;
                        }
                        C0943i a = this.f1666e.mo10757a(C0929c.m652b(fragmentActivity), d.f1670g, d.f1671h, fragmentActivity);
                        d.f1674k = a;
                        return a;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (C1380j.m1475h()) {
                        return mo11157b(activity.getApplicationContext());
                    }
                    if (!activity.isDestroyed()) {
                        C1314k c = mo11158c(activity.getFragmentManager(), (android.app.Fragment) null, m1338e(activity));
                        C0943i iVar2 = c.f1657j;
                        if (iVar2 != null) {
                            return iVar2;
                        }
                        C0943i a2 = this.f1666e.mo10757a(C0929c.m652b(activity), c.f1654g, c.f1655h, activity);
                        c.f1657j = a2;
                        return a2;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo11157b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f1662a == null) {
                synchronized (this) {
                    if (this.f1662a == null) {
                        this.f1662a = this.f1666e.mo10757a(C0929c.m652b(context.getApplicationContext()), new C1303b(), new C1310g(), context.getApplicationContext());
                    }
                }
            }
            return this.f1662a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    /* renamed from: c */
    public final C1314k mo11158c(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        C1314k kVar = (C1314k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f1663b.get(fragmentManager)) == null) {
            kVar = new C1314k();
            kVar.f1659l = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                kVar.mo11148a(fragment.getActivity());
            }
            if (z) {
                kVar.f1654g.mo11144d();
            }
            this.f1663b.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f1665d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    @NonNull
    /* renamed from: d */
    public final C1321o mo11159d(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        C1321o oVar = (C1321o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f1664c.get(fragmentManager)) == null) {
            oVar = new C1321o();
            oVar.f1675l = fragment;
            if (!(fragment == null || fragment.getContext() == null)) {
                Fragment fragment2 = fragment;
                while (fragment2.getParentFragment() != null) {
                    fragment2 = fragment2.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                if (fragmentManager2 != null) {
                    oVar.mo11164d(fragment.getContext(), fragmentManager2);
                }
            }
            if (z) {
                oVar.f1670g.mo11144d();
            }
            this.f1664c.put(fragmentManager, oVar);
            fragmentManager.beginTransaction().add((Fragment) oVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f1665d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f1663b;
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (androidx.fragment.app.FragmentManager) message.obj;
            map = this.f1664c;
        }
        Object obj4 = obj2;
        obj3 = map.remove(obj2);
        obj = obj4;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }
}
