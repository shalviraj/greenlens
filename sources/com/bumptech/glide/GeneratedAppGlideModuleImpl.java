package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appfoundry.previewer.custom.SampleGlideModule;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import p005b.p051h.p052a.C0927a;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0931d;
import p005b.p051h.p052a.C0935g;
import p005b.p051h.p052a.p071n.C1316l;
import p005b.p268n.p269a.p270a.C4758c;

public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    public final SampleGlideModule f11187a = new SampleGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.appfoundry.previewer.custom.SampleGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.kirich1409.svgloader.glide.SvgModule");
        }
    }

    /* renamed from: a */
    public void mo11167a(@NonNull Context context, @NonNull C0931d dVar) {
        Objects.requireNonNull(this.f11187a);
    }

    /* renamed from: b */
    public void mo11169b(@NonNull Context context, @NonNull C0929c cVar, @NonNull C0935g gVar) {
        new C4758c().mo11169b(context, cVar, gVar);
        Objects.requireNonNull(this.f11187a);
    }

    /* renamed from: c */
    public boolean mo11168c() {
        Objects.requireNonNull(this.f11187a);
        return false;
    }

    @NonNull
    /* renamed from: d */
    public Set<Class<?>> mo18705d() {
        return Collections.emptySet();
    }

    @NonNull
    /* renamed from: e */
    public C1316l.C1318b mo18706e() {
        return new C0927a();
    }
}
