package p005b.p032d.p033a.p034g;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;

/* renamed from: b.d.a.g.a */
public final class C0842a implements ViewBinding {
    @NonNull

    /* renamed from: a */
    public final FrameLayout f693a;
    @NonNull

    /* renamed from: b */
    public final FrameLayout f694b;
    @NonNull

    /* renamed from: c */
    public final CoordinatorLayout f695c;
    @NonNull

    /* renamed from: d */
    public final CornerRadiusFrameLayout f696d;
    @NonNull

    /* renamed from: e */
    public final View f697e;

    public C0842a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull CoordinatorLayout coordinatorLayout, @NonNull CornerRadiusFrameLayout cornerRadiusFrameLayout, @NonNull View view) {
        this.f693a = frameLayout;
        this.f694b = frameLayout2;
        this.f695c = coordinatorLayout;
        this.f696d = cornerRadiusFrameLayout;
        this.f697e = view;
    }

    @NonNull
    public View getRoot() {
        return this.f693a;
    }
}
