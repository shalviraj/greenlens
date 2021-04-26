package p005b.p051h.p052a.p055m.p056u;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;

/* renamed from: b.h.a.m.u.h */
public class C0995h extends C0985b<ParcelFileDescriptor> {
    public C0995h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo10839a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: c */
    public void mo10843c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: d */
    public Object mo10845d(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
