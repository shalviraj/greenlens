package p005b.p006a.p007a.p018i;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.i.p */
public final class C0757p extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f485a;

    public C0757p(int i) {
        this.f485a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        C6888i.m12438e(rect, "outRect");
        C6888i.m12438e(view, "view");
        C6888i.m12438e(recyclerView, "parent");
        C6888i.m12438e(state, "state");
        if (recyclerView.getChildAdapterPosition(view) != -1 && recyclerView.getAdapter() != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
            C6888i.m12436c(valueOf);
            if (childAdapterPosition == valueOf.intValue() - 1) {
                rect.bottom = this.f485a;
            }
        }
    }
}
