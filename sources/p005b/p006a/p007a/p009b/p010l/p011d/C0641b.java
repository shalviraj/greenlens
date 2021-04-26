package p005b.p006a.p007a.p009b.p010l.p011d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import java.util.Objects;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.l.d.b */
public abstract class C0641b<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {

    /* renamed from: a */
    public C0642c f306a;

    /* renamed from: b */
    public RecyclerView.Adapter<T> f307b;

    /* renamed from: c */
    public RecyclerView f308c;

    /* renamed from: d */
    public List<Integer> f309d;

    /* renamed from: e */
    public Interpolator f310e;

    /* renamed from: f */
    public int f311f;

    public C0641b(RecyclerView.Adapter<T> adapter, RecyclerView recyclerView, List<Integer> list, Interpolator interpolator, int i) {
        C6888i.m12438e(adapter, "adapter");
        C6888i.m12438e(recyclerView, "recyclerView");
        this.f307b = adapter;
        this.f308c = recyclerView;
        this.f309d = list;
        this.f310e = interpolator;
        this.f311f = i;
        C0642c cVar = new C0642c(recyclerView);
        this.f306a = cVar;
        cVar.f313b = this.f311f;
    }

    /* renamed from: a */
    public abstract List<Animator> mo10426a(View view);

    public int getItemCount() {
        return this.f307b.getItemCount();
    }

    public long getItemId(int i) {
        return this.f307b.getItemId(i);
    }

    public int getItemViewType(int i) {
        return this.f307b.getItemViewType(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C6888i.m12438e(recyclerView, "recyclerView");
        this.f307b.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(T t, int i) {
        this.f307b.onBindViewHolder(t, i);
        if (t != null) {
            C0642c cVar = this.f306a;
            View view = t.itemView;
            C6888i.m12437d(view, "it.itemView");
            Objects.requireNonNull(cVar);
            C6888i.m12438e(view, "view");
            int hashCode = view.hashCode();
            Animator animator = cVar.f312a.get(hashCode);
            if (animator != null) {
                animator.end();
                cVar.f312a.remove(hashCode);
            }
            View view2 = t.itemView;
            C6888i.m12437d(view2, "it.itemView");
            List<Integer> list = this.f309d;
            if (list == null || !list.contains(Integer.valueOf(i))) {
                List<Animator> a = mo10426a(view2);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, Key.ALPHA, new float[]{0.0f, 1.0f});
                C6888i.m12437d(ofFloat, "ObjectAnimator.ofFloat(view, ALPHA, 0f, 1f)");
                ofFloat.setDuration((long) this.f311f);
                Interpolator interpolator = this.f310e;
                if (interpolator != null) {
                    ofFloat.setInterpolator(interpolator);
                }
                C0642c cVar2 = this.f306a;
                List<T> J = C6790h.m12323J(a, ofFloat);
                Objects.requireNonNull(cVar2);
                C6888i.m12438e(view2, "view");
                C6888i.m12438e(J, "animators");
                if (cVar2.f317f && i > cVar2.f316e) {
                    if (cVar2.f315d == -1) {
                        cVar2.f315d = i;
                    }
                    if (cVar2.f314c == -1) {
                        cVar2.f314c = SystemClock.uptimeMillis();
                    }
                    view2.setAlpha(0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(J);
                    animatorSet.setStartDelay((long) (i * 20));
                    animatorSet.setDuration((long) cVar2.f313b);
                    animatorSet.start();
                    cVar2.f312a.put(view2.hashCode(), animatorSet);
                    cVar2.f316e = i;
                }
            }
        }
    }

    public T onCreateViewHolder(ViewGroup viewGroup, int i) {
        C6888i.m12438e(viewGroup, "parent");
        return this.f307b.onCreateViewHolder(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C6888i.m12438e(recyclerView, "recyclerView");
        this.f307b.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(T t) {
        return this.f307b.onFailedToRecycleView(t);
    }

    public void onViewAttachedToWindow(T t) {
        this.f307b.onViewAttachedToWindow(t);
    }

    public void onViewDetachedFromWindow(T t) {
        this.f307b.onViewDetachedFromWindow(t);
    }

    public void onViewRecycled(T t) {
        this.f307b.onViewRecycled(t);
    }

    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        C6888i.m12438e(adapterDataObserver, "observer");
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f307b.registerAdapterDataObserver(adapterDataObserver);
    }

    public void setHasStableIds(boolean z) {
        this.f307b.setHasStableIds(z);
    }

    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        C6888i.m12438e(adapterDataObserver, "observer");
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f307b.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
