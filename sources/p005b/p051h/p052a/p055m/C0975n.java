package p005b.p051h.p052a.p055m;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Collection;
import p005b.p051h.p052a.p055m.p058v.C1115w;

/* renamed from: b.h.a.m.n */
public class C0975n<T> implements C0983t<T> {

    /* renamed from: b */
    public final Collection<? extends C0983t<T>> f1019b;

    public C0975n(@NonNull Collection<? extends C0983t<T>> collection) {
        if (!collection.isEmpty()) {
            this.f1019b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @NonNull
    /* renamed from: a */
    public C1115w<T> mo10828a(@NonNull Context context, @NonNull C1115w<T> wVar, int i, int i2) {
        C1115w<T> wVar2 = wVar;
        for (C0983t a : this.f1019b) {
            C1115w<T> a2 = a.mo10828a(context, wVar2, i, i2);
            if (wVar2 != null && !wVar2.equals(wVar) && !wVar2.equals(a2)) {
                wVar2.recycle();
            }
            wVar2 = a2;
        }
        return wVar2;
    }

    /* renamed from: b */
    public void mo10372b(@NonNull MessageDigest messageDigest) {
        for (C0983t b : this.f1019b) {
            b.mo10372b(messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0975n) {
            return this.f1019b.equals(((C0975n) obj).f1019b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1019b.hashCode();
    }
}
