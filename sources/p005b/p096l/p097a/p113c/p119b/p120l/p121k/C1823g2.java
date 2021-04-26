package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p005b.p096l.p097a.p113c.p131e.p135d.C2020d;

/* renamed from: b.l.a.c.b.l.k.g2 */
public final class C1823g2 extends Fragment implements C1827i {

    /* renamed from: j */
    public static WeakHashMap<FragmentActivity, WeakReference<C1823g2>> f3214j = new WeakHashMap<>();

    /* renamed from: g */
    public Map<String, LifecycleCallback> f3215g = new ArrayMap();

    /* renamed from: h */
    public int f3216h = 0;

    /* renamed from: i */
    public Bundle f3217i;

    /* renamed from: a */
    public final void mo12076a(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f3215g.containsKey(str)) {
            this.f3215g.put(str, lifecycleCallback);
            if (this.f3216h > 0) {
                new C2020d(Looper.getMainLooper()).post(new C1816f2(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo12077b(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f3215g.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f3215g.values()) {
            a.mo18871a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback c : this.f3215g.values()) {
            c.mo18872c(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3216h = 1;
        this.f3217i = bundle;
        for (Map.Entry next : this.f3215g.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo18873d(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3216h = 5;
        for (LifecycleCallback requireNonNull : this.f3215g.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onResume() {
        super.onResume();
        this.f3216h = 3;
        for (LifecycleCallback requireNonNull : this.f3215g.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f3215g.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo18874e(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f3216h = 2;
        for (LifecycleCallback f : this.f3215g.values()) {
            f.mo18875f();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f3216h = 4;
        for (LifecycleCallback g : this.f3215g.values()) {
            g.mo14698g();
        }
    }
}
