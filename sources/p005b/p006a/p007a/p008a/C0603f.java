package p005b.p006a.p007a.p008a;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.a.f */
public final class C0603f implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a */
    public final /* synthetic */ C0605h f233a;

    public C0603f(C0605h hVar) {
        this.f233a = hVar;
    }

    public final void onRefresh() {
        try {
            C0605h.m73d(this.f233a, true, false, 2);
        } catch (Exception e) {
            C8091a.f16272d.mo26044b("Exception pulling to refresh: %s", e.getLocalizedMessage());
        }
    }
}
