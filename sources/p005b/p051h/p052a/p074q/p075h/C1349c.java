package p005b.p051h.p052a.p074q.p075h;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p074q.C1340b;
import p005b.p051h.p052a.p074q.C1345g;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.q.h.c */
public abstract class C1349c<T> implements C1354h<T> {

    /* renamed from: g */
    public final int f1758g;

    /* renamed from: h */
    public final int f1759h;
    @Nullable

    /* renamed from: i */
    public C1340b f1760i;

    public C1349c() {
        if (C1380j.m1477j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f1758g = Integer.MIN_VALUE;
            this.f1759h = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException(C0843a.m446g("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", Integer.MIN_VALUE, " and height: ", Integer.MIN_VALUE));
    }

    /* renamed from: a */
    public final void mo11210a(@NonNull C1353g gVar) {
    }

    /* renamed from: c */
    public void mo11211c(@Nullable Drawable drawable) {
    }

    /* renamed from: d */
    public void mo10773d() {
    }

    /* renamed from: e */
    public void mo11212e(@Nullable Drawable drawable) {
    }

    @Nullable
    /* renamed from: f */
    public final C1340b mo11213f() {
        return this.f1760i;
    }

    /* renamed from: h */
    public final void mo11214h(@NonNull C1353g gVar) {
        ((C1345g) gVar).mo11196d(this.f1758g, this.f1759h);
    }

    /* renamed from: i */
    public final void mo11215i(@Nullable C1340b bVar) {
        this.f1760i = bVar;
    }

    /* renamed from: j */
    public void mo10774j() {
    }

    public void onStart() {
    }
}
