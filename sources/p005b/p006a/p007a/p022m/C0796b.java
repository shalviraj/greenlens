package p005b.p006a.p007a.p022m;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.m.b */
public final class C0796b extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final FrameLayout f588a;

    /* renamed from: b */
    public final Boolean f589b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0796b(View view, Boolean bool) {
        super(view);
        C6888i.m12438e(view, "itemView");
        View findViewById = view.findViewById(R.id.container_parent);
        C6888i.m12437d(findViewById, "itemView.findViewById(R.id.container_parent)");
        this.f588a = (FrameLayout) findViewById;
        this.f589b = bool;
    }
}
