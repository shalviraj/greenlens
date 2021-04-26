package p005b.p051h.p052a;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Map;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.p055m.p058v.C1090l;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p074q.C1342d;
import p005b.p051h.p052a.p074q.C1343e;
import p005b.p051h.p052a.p074q.p075h.C1352f;

/* renamed from: b.h.a.e */
public class C0933e extends ContextWrapper {
    @VisibleForTesting

    /* renamed from: k */
    public static final C0946j<?, ?> f862k = new C0928b();

    /* renamed from: a */
    public final C1023b f863a;

    /* renamed from: b */
    public final C0935g f864b;

    /* renamed from: c */
    public final C1352f f865c;

    /* renamed from: d */
    public final C0929c.C0930a f866d;

    /* renamed from: e */
    public final List<C1342d<Object>> f867e;

    /* renamed from: f */
    public final Map<Class<?>, C0946j<?, ?>> f868f;

    /* renamed from: g */
    public final C1090l f869g;

    /* renamed from: h */
    public final boolean f870h;

    /* renamed from: i */
    public final int f871i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j */
    public C1343e f872j;

    public C0933e(@NonNull Context context, @NonNull C1023b bVar, @NonNull C0935g gVar, @NonNull C1352f fVar, @NonNull C0929c.C0930a aVar, @NonNull Map<Class<?>, C0946j<?, ?>> map, @NonNull List<C1342d<Object>> list, @NonNull C1090l lVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f863a = bVar;
        this.f864b = gVar;
        this.f865c = fVar;
        this.f866d = aVar;
        this.f867e = list;
        this.f868f = map;
        this.f869g = lVar;
        this.f870h = z;
        this.f871i = i;
    }
}
