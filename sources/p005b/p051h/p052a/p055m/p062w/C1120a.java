package p005b.p051h.p052a.p055m.p062w;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p056u.C0995h;
import p005b.p051h.p052a.p055m.p056u.C1006n;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.a */
public class C1120a<Data> implements C1161n<Uri, Data> {

    /* renamed from: a */
    public final AssetManager f1367a;

    /* renamed from: b */
    public final C1121a<Data> f1368b;

    /* renamed from: b.h.a.m.w.a$a */
    public interface C1121a<Data> {
        /* renamed from: a */
        C0987d<Data> mo11032a(AssetManager assetManager, String str);
    }

    /* renamed from: b.h.a.m.w.a$b */
    public static class C1122b implements C1163o<Uri, ParcelFileDescriptor>, C1121a<ParcelFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f1369a;

        public C1122b(AssetManager assetManager) {
            this.f1369a = assetManager;
        }

        /* renamed from: a */
        public C0987d<ParcelFileDescriptor> mo11032a(AssetManager assetManager, String str) {
            return new C0995h(assetManager, str);
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Uri, ParcelFileDescriptor> mo11033b(C1169r rVar) {
            return new C1120a(this.f1369a, this);
        }
    }

    /* renamed from: b.h.a.m.w.a$c */
    public static class C1123c implements C1163o<Uri, InputStream>, C1121a<InputStream> {

        /* renamed from: a */
        public final AssetManager f1370a;

        public C1123c(AssetManager assetManager) {
            this.f1370a = assetManager;
        }

        /* renamed from: a */
        public C0987d<InputStream> mo11032a(AssetManager assetManager, String str) {
            return new C1006n(assetManager, str);
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Uri, InputStream> mo11033b(C1169r rVar) {
            return new C1120a(this.f1370a, this);
        }
    }

    public C1120a(AssetManager assetManager, C1121a<Data> aVar) {
        this.f1367a = assetManager;
        this.f1368b = aVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri = (Uri) obj;
        return new C1161n.C1162a(new C1366b(uri), this.f1368b.mo11032a(this.f1367a, uri.toString().substring(22)));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
