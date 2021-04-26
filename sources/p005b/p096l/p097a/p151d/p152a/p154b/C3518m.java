package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p159e.C3604p;
import p005b.p096l.p097a.p151d.p152a.p159e.C3607q0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3608r;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;
import p005b.p096l.p097a.p151d.p152a.p163i.C3651r;

/* renamed from: b.l.a.d.a.b.m */
public final class C3518m implements C3525n2 {

    /* renamed from: f */
    public static final C3584f f6467f = new C3584f("AssetPackServiceImpl");

    /* renamed from: g */
    public static final Intent f6468g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f6469a;

    /* renamed from: b */
    public final C3511k0 f6470b;
    @Nullable

    /* renamed from: c */
    public C3604p<C3607q0> f6471c;
    @Nullable

    /* renamed from: d */
    public C3604p<C3607q0> f6472d;

    /* renamed from: e */
    public final AtomicBoolean f6473e = new AtomicBoolean();

    public C3518m(Context context, C3511k0 k0Var) {
        this.f6469a = context.getPackageName();
        this.f6470b = k0Var;
        if (C3608r.m6844a(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            C3584f fVar = f6467f;
            Intent intent = f6468g;
            this.f6471c = new C3604p(context2, fVar, "AssetPackService", intent, C3529o2.f6507c);
            Context applicationContext2 = context.getApplicationContext();
            this.f6472d = new C3604p(applicationContext2 != null ? applicationContext2 : context, fVar, "AssetPackService-keepAlive", intent, C3529o2.f6506b);
        }
        f6467f.mo14884b(3, "AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: h */
    public static Bundle m6694h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    /* renamed from: i */
    public static /* synthetic */ Bundle m6695i(Map map) {
        Bundle h = m6694h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        h.putParcelableArrayList("installed_asset_module", arrayList);
        return h;
    }

    /* renamed from: j */
    public static Bundle m6696j(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i2);
        return bundle;
    }

    /* renamed from: l */
    public static <T> C3651r<T> m6697l() {
        f6467f.mo14884b(6, "onError(%d)", new Object[]{-11});
        return C1960d.m2805i(new C3470a(-11));
    }

    /* renamed from: a */
    public final void mo14758a(int i, String str) {
        mo14792k(i, str, 10);
    }

    /* renamed from: b */
    public final C3651r<ParcelFileDescriptor> mo14759b(int i, String str, String str2, int i2) {
        if (this.f6471c == null) {
            return m6697l();
        }
        f6467f.mo14884b(4, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{str, str2, Integer.valueOf(i2), Integer.valueOf(i)});
        C3647n nVar = new C3647n();
        this.f6471c.mo14904a(new C3490f(this, nVar, i, str, str2, i2, nVar));
        return nVar.f6722a;
    }

    /* renamed from: c */
    public final synchronized void mo14760c() {
        if (this.f6472d == null) {
            f6467f.mo14884b(5, "Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C3584f fVar = f6467f;
        fVar.mo14884b(4, "keepAlive", new Object[0]);
        if (!this.f6473e.compareAndSet(false, true)) {
            fVar.mo14884b(4, "Service is already kept alive.", new Object[0]);
            return;
        }
        C3647n nVar = new C3647n();
        this.f6472d.mo14904a(new C3494g(this, nVar, nVar));
    }

    /* renamed from: d */
    public final void mo14761d(int i) {
        if (this.f6471c != null) {
            f6467f.mo14884b(4, "notifySessionFailed", new Object[0]);
            C3647n nVar = new C3647n();
            this.f6471c.mo14904a(new C3486e(this, nVar, i, nVar));
            return;
        }
        throw new C3495g0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: e */
    public final C3651r<List<String>> mo14762e(Map<String, Long> map) {
        if (this.f6471c == null) {
            return m6697l();
        }
        f6467f.mo14884b(4, "syncPacks", new Object[0]);
        C3647n nVar = new C3647n();
        this.f6471c.mo14904a(new C3537q2(this, nVar, map, nVar));
        return nVar.f6722a;
    }

    /* renamed from: f */
    public final void mo14763f(List<String> list) {
        if (this.f6471c != null) {
            f6467f.mo14884b(4, "cancelDownloads(%s)", new Object[]{list});
            C3647n nVar = new C3647n();
            this.f6471c.mo14904a(new C3533p2(this, nVar, list, nVar));
        }
    }

    /* renamed from: g */
    public final void mo14764g(int i, String str, String str2, int i2) {
        if (this.f6471c != null) {
            f6467f.mo14884b(4, "notifyChunkTransferred", new Object[0]);
            C3647n nVar = new C3647n();
            this.f6471c.mo14904a(new C3478c(this, nVar, i, str, str2, i2, nVar));
            return;
        }
        throw new C3495g0("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: k */
    public final void mo14792k(int i, String str, int i2) {
        if (this.f6471c != null) {
            f6467f.mo14884b(4, "notifyModuleCompleted", new Object[0]);
            C3647n nVar = new C3647n();
            this.f6471c.mo14904a(new C3482d(this, nVar, i, str, nVar, i2));
            return;
        }
        throw new C3495g0("The Play Store app is not installed or is an unofficial version.", i);
    }
}
