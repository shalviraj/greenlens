package p005b.p006a.p007a.p008a;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import java.util.Objects;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p019j.C0779j;
import p005b.p006a.p007a.p022m.C0795a;
import p005b.p006a.p007a.p024o.C0820c;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p337v.C6824d;
import p298d.p337v.C6827f;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p339j.p340a.C6840e;
import p298d.p337v.p339j.p340a.C6844h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6898s;
import p416l.p417a.C7725h0;
import p416l.p417a.C7815w;
import p416l.p417a.C7819x0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p416l.p417a.p419u1.C7785l;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.a.e */
public final class C0600e extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C0605h f224a;

    /* renamed from: b */
    public final /* synthetic */ C6898s f225b;

    /* renamed from: c */
    public final /* synthetic */ C6898s f226c;

    /* renamed from: d */
    public final /* synthetic */ FrameLayout f227d;

    @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$setupLoadMore$1$onScrolled$1$1", mo24178f = "BravoFragment.kt", mo24179l = {387}, mo24180m = "invokeSuspend")
    /* renamed from: b.a.a.a.e$a */
    public static final class C0601a extends C6844h implements C6866p<C7821y, C6824d<? super C6777r>, Object> {

        /* renamed from: k */
        public Object f228k;

        /* renamed from: l */
        public int f229l;

        /* renamed from: m */
        public final /* synthetic */ C0600e f230m;

        /* renamed from: n */
        public final /* synthetic */ RecyclerView f231n;

        @C6840e(mo24177c = "com.appfoundry.previewer.fragments.BravoFragment$setupLoadMore$1$onScrolled$1$1$1", mo24178f = "BravoFragment.kt", mo24179l = {}, mo24180m = "invokeSuspend")
        /* renamed from: b.a.a.a.e$a$a */
        public static final class C0602a extends C6844h implements C6866p<C7821y, C6824d<? super Page>, Object> {

            /* renamed from: k */
            public final /* synthetic */ C0601a f232k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0602a(C0601a aVar, C6824d dVar) {
                super(2, dVar);
                this.f232k = aVar;
            }

            /* renamed from: b */
            public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
                C6888i.m12438e(dVar, "completion");
                return new C0602a(this.f232k, dVar);
            }

            /* renamed from: e */
            public final Object mo10326e(Object obj) {
                C5266a.m10018q4(obj);
                C0779j j = C0820c.m310j(this.f232k.f230m.f224a.f210g, true);
                if (j != null) {
                    return j.f549a;
                }
                return null;
            }

            public final Object invoke(Object obj, Object obj2) {
                C6824d dVar = (C6824d) obj2;
                C6888i.m12438e(dVar, "completion");
                C0601a aVar = this.f232k;
                dVar.getContext();
                C5266a.m10018q4(C6777r.f13694a);
                C0779j j = C0820c.m310j(aVar.f230m.f224a.f210g, true);
                if (j != null) {
                    return j.f549a;
                }
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0601a(C6824d dVar, C0600e eVar, RecyclerView recyclerView) {
            super(2, dVar);
            this.f230m = eVar;
            this.f231n = recyclerView;
        }

        /* renamed from: b */
        public final C6824d<C6777r> mo10325b(Object obj, C6824d<?> dVar) {
            C6888i.m12438e(dVar, "completion");
            return new C0601a(dVar, this.f230m, this.f231n);
        }

        /* renamed from: e */
        public final Object mo10326e(Object obj) {
            C0605h hVar;
            C6833a aVar = C6833a.COROUTINE_SUSPENDED;
            int i = this.f229l;
            List<Container> list = null;
            if (i == 0) {
                C5266a.m10018q4(obj);
                Object[] objArr = new Object[1];
                Page page = this.f230m.f224a.f210g;
                objArr[0] = page != null ? page.f11044l : null;
                C8091a.f16272d.mo26043a("SCROLLING getting netLink: %s", objArr);
                C0605h hVar2 = this.f230m.f224a;
                C7815w wVar = C7725h0.f15274b;
                C0602a aVar2 = new C0602a(this, (C6824d) null);
                this.f228k = hVar2;
                this.f229l = 1;
                Object N4 = C5266a.m9853N4(wVar, aVar2, this);
                if (N4 == aVar) {
                    return aVar;
                }
                hVar = hVar2;
                obj = N4;
            } else if (i == 1) {
                hVar = (C0605h) this.f228k;
                C5266a.m10018q4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar.f210g = (Page) obj;
            Object[] objArr2 = new Object[1];
            Page page2 = this.f230m.f224a.f210g;
            objArr2[0] = page2 != null ? page2.f11055w : null;
            C8091a.f16272d.mo26043a("SCROLLING: boundJsonPage after pagination triggered -> %s", objArr2);
            C0600e eVar = this.f230m;
            Page page3 = eVar.f224a.f210g;
            if ((page3 != null ? page3.f11055w : null) != null) {
                RecyclerView.Adapter adapter = this.f231n.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.appfoundry.previewer.recycler.ContainerAdapter");
                C0795a aVar3 = (C0795a) adapter;
                Page page4 = this.f230m.f224a.f210g;
                if (page4 != null) {
                    list = page4.f11055w;
                }
                if (list != null) {
                    list.size();
                    List<Container> list2 = aVar3.f584b;
                    int size = list2 != null ? list2.size() : 0;
                    List<Container> list3 = aVar3.f584b;
                    if (list3 != null) {
                        list3.addAll(list);
                    }
                    aVar3.notifyItemInserted(size);
                }
            } else {
                eVar.f225b.f13798g = false;
            }
            FrameLayout frameLayout = this.f230m.f227d;
            if (frameLayout != null) {
                C0758q.m240e(frameLayout);
            }
            this.f230m.f226c.f13798g = false;
            return C6777r.f13694a;
        }

        public final Object invoke(Object obj, Object obj2) {
            C6824d dVar = (C6824d) obj2;
            C6888i.m12438e(dVar, "completion");
            return new C0601a(dVar, this.f230m, this.f231n).mo10326e(C6777r.f13694a);
        }
    }

    public C0600e(C0605h hVar, C6898s sVar, C6898s sVar2, FrameLayout frameLayout) {
        this.f224a = hVar;
        this.f225b = sVar;
        this.f226c = sVar2;
        this.f227d = frameLayout;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        List<Container> list;
        C6888i.m12438e(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        Page page = this.f224a.f210g;
        if (page != null && (list = page.f11038f) != null) {
            int size = list.size();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            if (((FlexboxLayoutManager) layoutManager).findLastVisibleItemPosition() == size - 1 && this.f225b.f13798g && !this.f226c.f13798g) {
                FrameLayout frameLayout = this.f227d;
                if (frameLayout != null) {
                    C0758q.m247l(frameLayout);
                }
                this.f226c.f13798g = true;
                C7815w wVar = C7725h0.f15273a;
                C5266a.m9880S2(C5266a.m9953g(C7785l.f15351b.plus(C5266a.m9959h((C7819x0) null, 1, (Object) null))), (C6827f) null, (C7823z) null, new C0601a((C6824d) null, this, recyclerView), 3, (Object) null);
            }
        }
    }
}
