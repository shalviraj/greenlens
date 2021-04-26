package p005b.p051h.p052a.p055m.p056u;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.m.u.a */
public final class C0984a extends C1002l<AssetFileDescriptor> {
    public C0984a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    /* renamed from: a */
    public Class<AssetFileDescriptor> mo10839a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: c */
    public void mo10840c(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    /* renamed from: d */
    public Object mo10841d(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(C0843a.m449j("FileDescriptor is null for: ", uri));
    }
}
