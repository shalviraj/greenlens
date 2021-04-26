package p005b.p051h.p052a.p055m.p056u;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.m.u.i */
public class C0996i extends C1002l<ParcelFileDescriptor> {
    public C0996i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @NonNull
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo10839a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: c */
    public void mo10840c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: d */
    public Object mo10841d(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(C0843a.m449j("FileDescriptor is null for: ", uri));
    }
}
