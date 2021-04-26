package p005b.p051h.p052a.p071n;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0943i;

/* renamed from: b.h.a.n.o */
public class C1321o extends Fragment {

    /* renamed from: g */
    public final C1302a f1670g;

    /* renamed from: h */
    public final C1319m f1671h = new C1322a();

    /* renamed from: i */
    public final Set<C1321o> f1672i = new HashSet();
    @Nullable

    /* renamed from: j */
    public C1321o f1673j;
    @Nullable

    /* renamed from: k */
    public C0943i f1674k;
    @Nullable

    /* renamed from: l */
    public Fragment f1675l;

    /* renamed from: b.h.a.n.o$a */
    public class C1322a implements C1319m {
        public C1322a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C1321o.this + "}";
        }
    }

    public C1321o() {
        C1302a aVar = new C1302a();
        this.f1670g = aVar;
    }

    @Nullable
    /* renamed from: c */
    public final Fragment mo11163c() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f1675l;
    }

    /* renamed from: d */
    public final void mo11164d(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        mo11165e();
        C1316l lVar = C0929c.m652b(context).f844l;
        Objects.requireNonNull(lVar);
        C1321o d = lVar.mo11159d(fragmentManager, (Fragment) null, C1316l.m1338e(context));
        this.f1673j = d;
        if (!equals(d)) {
            this.f1673j.f1672i.add(this);
        }
    }

    /* renamed from: e */
    public final void mo11165e() {
        C1321o oVar = this.f1673j;
        if (oVar != null) {
            oVar.f1672i.remove(this);
            this.f1673j = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                mo11164d(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1670g.mo11143c();
        mo11165e();
    }

    public void onDetach() {
        super.onDetach();
        this.f1675l = null;
        mo11165e();
    }

    public void onStart() {
        super.onStart();
        this.f1670g.mo11144d();
    }

    public void onStop() {
        super.onStop();
        this.f1670g.mo11145e();
    }

    public String toString() {
        return super.toString() + "{parent=" + mo11163c() + "}";
    }
}
