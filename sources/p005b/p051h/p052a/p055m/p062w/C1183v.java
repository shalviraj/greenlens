package p005b.p051h.p052a.p055m.p062w;

import androidx.annotation.NonNull;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.v */
public class C1183v<Model> implements C1161n<Model, Model> {

    /* renamed from: a */
    public static final C1183v<?> f1442a = new C1183v<>();

    /* renamed from: b.h.a.m.w.v$a */
    public static class C1184a<Model> implements C1163o<Model, Model> {

        /* renamed from: a */
        public static final C1184a<?> f1443a = new C1184a<>();

        @NonNull
        /* renamed from: b */
        public C1161n<Model, Model> mo11033b(C1169r rVar) {
            return C1183v.f1442a;
        }
    }

    /* renamed from: b.h.a.m.w.v$b */
    public static class C1185b<Model> implements C0987d<Model> {

        /* renamed from: g */
        public final Model f1444g;

        public C1185b(Model model) {
            this.f1444g = model;
        }

        @NonNull
        /* renamed from: a */
        public Class<Model> mo10839a() {
            return this.f1444g.getClass();
        }

        /* renamed from: b */
        public void mo10842b() {
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: e */
        public C0962a mo10846e() {
            return C0962a.LOCAL;
        }

        /* renamed from: f */
        public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super Model> aVar) {
            aVar.mo10854d(this.f1444g);
        }
    }

    /* renamed from: a */
    public C1161n.C1162a<Model> mo11030a(@NonNull Model model, int i, int i2, @NonNull C0979p pVar) {
        return new C1161n.C1162a<>(new C1366b(model), new C1185b(model));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Model model) {
        return true;
    }
}
