package p005b.p006a.p007a.p022m;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import java.util.Iterator;
import java.util.List;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.m.a */
public final class C0795a extends RecyclerView.Adapter<C0796b> {

    /* renamed from: a */
    public final String f583a;

    /* renamed from: b */
    public final List<Container> f584b;

    /* renamed from: c */
    public final Boolean f585c;

    /* renamed from: d */
    public final Boolean f586d;

    /* renamed from: e */
    public final Float f587e;

    public C0795a(String str, List list, Boolean bool, Boolean bool2, Float f, int i) {
        bool = (i & 4) != 0 ? Boolean.FALSE : bool;
        bool2 = (i & 8) != 0 ? Boolean.FALSE : bool2;
        f = (i & 16) != 0 ? Float.valueOf(100.0f) : f;
        this.f583a = str;
        this.f584b = list;
        this.f585c = bool;
        this.f586d = bool2;
        this.f587e = f;
    }

    public int getItemCount() {
        if (C6888i.m12434a(this.f586d, Boolean.TRUE)) {
            return 1000;
        }
        List<Container> list = this.f584b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getItemViewType(int i) {
        boolean z;
        List<String> list;
        String z2;
        Component component;
        T t;
        boolean z3;
        List<String> list2;
        String z4;
        if (C6888i.m12434a(this.f586d, Boolean.TRUE)) {
            List<Container> list3 = this.f584b;
            i %= list3 != null ? list3.size() : 1;
        }
        List<Container> list4 = this.f584b;
        T t2 = null;
        Container container = list4 != null ? list4.get(i) : null;
        boolean z5 = false;
        if (container != null) {
            C6888i.m12438e(container, "$this$hasVideo");
            List<Component> list5 = container.f10972f;
            if (list5 != null) {
                Iterator<T> it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    Component component2 = (Component) t;
                    C6888i.m12438e(component2, "$this$isVideo");
                    if (C6888i.m12434a(component2.f10940b, "component:video") || !((list2 = component2.f10947i) == null || (z4 = C0849e.m555z(list2)) == null || !z4.equals("video"))) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
                component = (Component) t;
            } else {
                component = null;
            }
            if (component != null) {
                return 9;
            }
        }
        if (container != null) {
            C6888i.m12438e(container, "$this$hasLottie");
            List<Component> list6 = container.f10972f;
            if (list6 != null) {
                Iterator<T> it2 = list6.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Component component3 = (Component) next;
                    C6888i.m12438e(component3, "$this$isLottie");
                    if (C6888i.m12434a(component3.f10940b, "component:lottie") || !((list = component3.f10947i) == null || (z2 = C0849e.m555z(list)) == null || !z2.equals("lottie"))) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                t2 = (Component) t2;
            }
            if (t2 != null) {
                z5 = true;
            }
            if (z5) {
                return 15;
            }
        }
        if (container != null && C0744e.m218v(container)) {
            return 17;
        }
        if (container == null || !C0744e.m189B(container)) {
            return 1;
        }
        return 5;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C6888i.m12438e(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0796b bVar = (C0796b) viewHolder;
        C6888i.m12438e(bVar, "holder");
        if (C6888i.m12434a(this.f586d, Boolean.TRUE)) {
            List<Container> list = this.f584b;
            i %= list != null ? list.size() : 1;
        }
        if (getItemViewType(i) == 9) {
            bVar.setIsRecyclable(false);
        }
        List<Container> list2 = this.f584b;
        Container container = list2 != null ? list2.get(i) : null;
        String str = this.f583a;
        Float f = this.f587e;
        if (container != null && !C0744e.m189B(container)) {
            bVar.f588a.removeAllViews();
        }
        if (container != null) {
            View view = bVar.itemView;
            C6888i.m12437d(view, "itemView");
            Context context = view.getContext();
            C6888i.m12437d(context, "itemView.context");
            C0744e.m201e(container, context, str, bVar.f588a, bVar.f589b, f != null ? f.floatValue() : 100.0f);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        C6888i.m12438e(viewGroup, "parent");
        if (i == 5) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.viewholder_container_slider;
        } else if (i != 17) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.viewholder_container_default;
        } else {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.viewholder_container_carousel;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        C6888i.m12437d(inflate, "view");
        return new C0796b(inflate, this.f585c);
    }
}
