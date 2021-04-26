package p005b.p051h.p052a.p055m.p062w.p063y;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
import p005b.p051h.p052a.p055m.C0976o;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0997j;
import p005b.p051h.p052a.p055m.p062w.C1148g;
import p005b.p051h.p052a.p055m.p062w.C1158m;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p055m.p062w.C1163o;
import p005b.p051h.p052a.p055m.p062w.C1169r;

/* renamed from: b.h.a.m.w.y.a */
public class C1193a implements C1161n<C1148g, InputStream> {

    /* renamed from: b */
    public static final C0976o<Integer> f1452b = C0976o.m746a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @Nullable

    /* renamed from: a */
    public final C1158m<C1148g, C1148g> f1453a;

    /* renamed from: b.h.a.m.w.y.a$a */
    public static class C1194a implements C1163o<C1148g, InputStream> {

        /* renamed from: a */
        public final C1158m<C1148g, C1148g> f1454a = new C1158m<>(500);

        @NonNull
        /* renamed from: b */
        public C1161n<C1148g, InputStream> mo11033b(C1169r rVar) {
            return new C1193a(this.f1454a);
        }
    }

    public C1193a(@Nullable C1158m<C1148g, C1148g> mVar) {
        this.f1453a = mVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        C1148g gVar = (C1148g) obj;
        C1158m<C1148g, C1148g> mVar = this.f1453a;
        if (mVar != null) {
            C1158m.C1160b a = C1158m.C1160b.m1071a(gVar, 0, 0);
            B a2 = mVar.f1404a.mo11252a(a);
            Queue<C1158m.C1160b<?>> queue = C1158m.C1160b.f1405d;
            synchronized (queue) {
                queue.offer(a);
            }
            C1148g gVar2 = (C1148g) a2;
            if (gVar2 == null) {
                C1158m<C1148g, C1148g> mVar2 = this.f1453a;
                Objects.requireNonNull(mVar2);
                mVar2.f1404a.mo11253d(C1158m.C1160b.m1071a(gVar, 0, 0), gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new C1161n.C1162a(gVar, new C0997j(gVar, ((Integer) pVar.mo10833c(f1452b)).intValue()));
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo11031b(@NonNull Object obj) {
        C1148g gVar = (C1148g) obj;
        return true;
    }
}
