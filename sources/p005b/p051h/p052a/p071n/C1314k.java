package p005b.p051h.p052a.p071n;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0943i;

@Deprecated
/* renamed from: b.h.a.n.k */
public class C1314k extends Fragment {

    /* renamed from: g */
    public final C1302a f1654g;

    /* renamed from: h */
    public final C1319m f1655h = new C1315a();

    /* renamed from: i */
    public final Set<C1314k> f1656i = new HashSet();
    @Nullable

    /* renamed from: j */
    public C0943i f1657j;
    @Nullable

    /* renamed from: k */
    public C1314k f1658k;
    @Nullable

    /* renamed from: l */
    public Fragment f1659l;

    /* renamed from: b.h.a.n.k$a */
    public class C1315a implements C1319m {
        public C1315a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C1314k.this + "}";
        }
    }

    public C1314k() {
        C1302a aVar = new C1302a();
        this.f1654g = aVar;
    }

    /* renamed from: a */
    public final void mo11148a(@NonNull Activity activity) {
        mo11149b();
        C1316l lVar = C0929c.m652b(activity).f844l;
        Objects.requireNonNull(lVar);
        C1314k c = lVar.mo11158c(activity.getFragmentManager(), (Fragment) null, C1316l.m1338e(activity));
        this.f1658k = c;
        if (!equals(c)) {
            this.f1658k.f1656i.add(this);
        }
    }

    /* renamed from: b */
    public final void mo11149b() {
        C1314k kVar = this.f1658k;
        if (kVar != null) {
            kVar.f1656i.remove(this);
            this.f1658k = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mo11148a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1654g.mo11143c();
        mo11149b();
    }

    public void onDetach() {
        super.onDetach();
        mo11149b();
    }

    public void onStart() {
        super.onStart();
        this.f1654g.mo11144d();
    }

    public void onStop() {
        super.onStop();
        this.f1654g.mo11145e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f1659l;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
