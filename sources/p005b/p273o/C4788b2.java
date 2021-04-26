package p005b.p273o;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: b.o.b2 */
public class C4788b2 extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ FragmentManager f9165a;

    /* renamed from: b */
    public final /* synthetic */ C4802c2 f9166b;

    public C4788b2(C4802c2 c2Var, FragmentManager fragmentManager) {
        this.f9166b = c2Var;
        this.f9165a = fragmentManager;
    }

    public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentDetached(fragmentManager, fragment);
        if (fragment instanceof DialogFragment) {
            this.f9165a.unregisterFragmentLifecycleCallbacks(this);
            this.f9166b.f9197a.mo16546b();
        }
    }
}
