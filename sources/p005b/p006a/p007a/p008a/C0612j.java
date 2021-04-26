package p005b.p006a.p007a.p008a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.model.Page;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p018i.C0758q;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.a.j */
public final class C0612j extends C0594b {

    /* renamed from: j */
    public ViewPager2 f254j;

    /* renamed from: b.a.a.a.j$a */
    public final class C0613a extends FragmentStateAdapter {

        /* renamed from: a */
        public final /* synthetic */ C0612j f255a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0613a(C0612j jVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            C6888i.m12438e(fragmentActivity, "fa");
            this.f255a = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r0 = r0.f11047o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.fragment.app.Fragment createFragment(int r3) {
            /*
                r2 = this;
                b.a.a.a.j r0 = r2.f255a
                com.appfoundry.previewer.model.Page r0 = r0.f210g
                r1 = 0
                if (r0 == 0) goto L_0x0012
                java.util.List<java.lang.String> r0 = r0.f11047o
                if (r0 == 0) goto L_0x0012
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x0013
            L_0x0012:
                r3 = r1
            L_0x0013:
                com.appfoundry.previewer.model.Page r3 = p005b.p006a.p007a.p024o.C0823f.m339H(r3)
                if (r3 == 0) goto L_0x001f
                r0 = 1
                b.a.a.a.b r3 = p005b.p006a.p007a.p018i.C0744e.m200d(r3, r1, r0)
                goto L_0x0024
            L_0x001f:
                b.a.a.a.h r3 = new b.a.a.a.h
                r3.<init>()
            L_0x0024:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p008a.C0612j.C0613a.createFragment(int):androidx.fragment.app.Fragment");
        }

        public int getItemCount() {
            List<String> list;
            Page page = this.f255a.f210g;
            if (page == null || (list = page.f11047o) == null) {
                return 0;
            }
            return list.size();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6888i.m12438e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_viewpager_toolbar_solid, viewGroup, false);
        C6888i.m12437d(inflate, "view");
        C0758q.m244i(inflate);
        Page page = this.f210g;
        C0758q.m237b(inflate, page != null ? page.f11033a : null, page != null ? page.f11041i : null, (Boolean) null, 4);
        Page page2 = this.f210g;
        C0758q.m239d(inflate, page2 != null ? page2.f11033a : null, page2 != null ? page2.f11036d : null, Boolean.FALSE);
        View findViewById = inflate.findViewById(R.id.fragment_viewpager);
        C6888i.m12437d(findViewById, "view.findViewById(R.id.fragment_viewpager)");
        this.f254j = (ViewPager2) findViewById;
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C0613a aVar = new C0613a(this, (FragmentActivity) context);
        ViewPager2 viewPager2 = this.f254j;
        if (viewPager2 != null) {
            viewPager2.setAdapter(aVar);
            return inflate;
        }
        C6888i.m12446m("viewPager");
        throw null;
    }
}
