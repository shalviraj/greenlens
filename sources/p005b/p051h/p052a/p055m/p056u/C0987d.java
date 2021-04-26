package p005b.p051h.p052a.p055m.p056u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;

/* renamed from: b.h.a.m.u.d */
public interface C0987d<T> {

    /* renamed from: b.h.a.m.u.d$a */
    public interface C0988a<T> {
        /* renamed from: c */
        void mo10853c(@NonNull Exception exc);

        /* renamed from: d */
        void mo10854d(@Nullable T t);
    }

    @NonNull
    /* renamed from: a */
    Class<T> mo10839a();

    /* renamed from: b */
    void mo10842b();

    void cancel();

    @NonNull
    /* renamed from: e */
    C0962a mo10846e();

    /* renamed from: f */
    void mo10847f(@NonNull C0934f fVar, @NonNull C0988a<? super T> aVar);
}
