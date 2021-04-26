package p005b.p051h.p052a.p055m.p062w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;

/* renamed from: b.h.a.m.w.n */
public interface C1161n<Model, Data> {

    /* renamed from: b.h.a.m.w.n$a */
    public static class C1162a<Data> {

        /* renamed from: a */
        public final C0974m f1409a;

        /* renamed from: b */
        public final List<C0974m> f1410b;

        /* renamed from: c */
        public final C0987d<Data> f1411c;

        public C1162a(@NonNull C0974m mVar, @NonNull C0987d<Data> dVar) {
            List<C0974m> emptyList = Collections.emptyList();
            Objects.requireNonNull(mVar, "Argument must not be null");
            this.f1409a = mVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.f1410b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.f1411c = dVar;
        }
    }

    @Nullable
    /* renamed from: a */
    C1162a<Data> mo11030a(@NonNull Model model, int i, int i2, @NonNull C0979p pVar);

    /* renamed from: b */
    boolean mo11031b(@NonNull Model model);
}
