package p005b.p051h.p052a.p055m.p056u;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: b.h.a.m.u.n */
public class C1006n extends C0985b<InputStream> {
    public C1006n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo10839a() {
        return InputStream.class;
    }

    /* renamed from: c */
    public void mo10843c(Object obj) {
        ((InputStream) obj).close();
    }

    /* renamed from: d */
    public Object mo10845d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
