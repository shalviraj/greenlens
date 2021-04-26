package p005b.p006a.p007a.p009b;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.C0941h;
import p005b.p051h.p052a.C0943i;
import p005b.p051h.p052a.C0946j;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0976o;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1086k;
import p005b.p051h.p052a.p055m.p064x.p065c.C1231i;
import p005b.p051h.p052a.p055m.p064x.p065c.C1239l;
import p005b.p051h.p052a.p074q.C1339a;
import p005b.p051h.p052a.p074q.C1342d;

/* renamed from: b.a.a.b.i */
public class C0632i<TranscodeType> extends C0941h<TranscodeType> implements Cloneable {
    public C0632i(@NonNull C0929c cVar, @NonNull C0943i iVar, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(cVar, iVar, cls, context);
    }

    @CheckResult
    @NonNull
    /* renamed from: A */
    public C0941h mo10401A(@NonNull C1339a aVar) {
        return (C0632i) super.mo10382a(aVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: F */
    public C0941h mo10403F(@Nullable File file) {
        this.f893L = file;
        this.f896O = true;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: G */
    public C0941h mo10404G(@Nullable Object obj) {
        this.f893L = obj;
        this.f896O = true;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: I */
    public C0941h mo10405I(@Nullable String str) {
        this.f893L = str;
        this.f896O = true;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: K */
    public C0941h mo10406K(@NonNull C0946j jVar) {
        super.mo10406K(jVar);
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: L */
    public C0632i<TranscodeType> mo10407L(@NonNull C1339a<?> aVar) {
        return (C0632i) super.mo10382a(aVar);
    }

    @CheckResult
    /* renamed from: M */
    public C0632i<TranscodeType> mo10385d() {
        return (C0632i) super.mo10385d();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public C1339a mo10382a(@NonNull C1339a aVar) {
        return (C0632i) super.mo10382a(aVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public C1339a mo10409c() {
        return (C0632i) mo11179w(C1239l.f1519c, new C1231i());
    }

    @CheckResult
    @NonNull
    /* renamed from: f */
    public C1339a mo10386f(@NonNull Class cls) {
        return (C0632i) super.mo10386f(cls);
    }

    @CheckResult
    @NonNull
    /* renamed from: g */
    public C1339a mo10387g(@NonNull C1086k kVar) {
        return (C0632i) super.mo10387g(kVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: h */
    public C1339a mo10388h(@NonNull C1239l lVar) {
        return (C0632i) super.mo10388h(lVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public C1339a mo10390k() {
        return (C0632i) super.mo10390k();
    }

    @CheckResult
    @NonNull
    /* renamed from: l */
    public C1339a mo10391l() {
        return (C0632i) super.mo10391l();
    }

    @CheckResult
    @NonNull
    /* renamed from: m */
    public C1339a mo10392m() {
        return (C0632i) super.mo10392m();
    }

    @CheckResult
    @NonNull
    /* renamed from: o */
    public C1339a mo10393o(int i, int i2) {
        return (C0632i) super.mo10393o(i, i2);
    }

    @CheckResult
    @NonNull
    /* renamed from: p */
    public C1339a mo10394p(@NonNull C0934f fVar) {
        return (C0632i) super.mo10394p(fVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: r */
    public C1339a mo10395r(@NonNull C0976o oVar, @NonNull Object obj) {
        return (C0632i) super.mo10395r(oVar, obj);
    }

    @CheckResult
    @NonNull
    /* renamed from: s */
    public C1339a mo10396s(@NonNull C0974m mVar) {
        return (C0632i) super.mo10396s(mVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: t */
    public C1339a mo10397t(boolean z) {
        return (C0632i) super.mo10397t(z);
    }

    @CheckResult
    @NonNull
    /* renamed from: u */
    public C1339a mo10398u(@NonNull C0983t tVar) {
        return (C0632i) mo11178v(tVar, true);
    }

    @CheckResult
    @NonNull
    /* renamed from: y */
    public C1339a mo10399y(boolean z) {
        return (C0632i) super.mo10399y(z);
    }

    @CheckResult
    @NonNull
    /* renamed from: z */
    public C0941h mo10410z(@Nullable C1342d dVar) {
        if (dVar != null) {
            if (this.f894M == null) {
                this.f894M = new ArrayList();
            }
            this.f894M.add(dVar);
        }
        return this;
    }
}
