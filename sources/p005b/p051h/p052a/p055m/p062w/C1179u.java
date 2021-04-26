package p005b.p051h.p052a.p055m.p062w;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p062w.C1161n;

/* renamed from: b.h.a.m.w.u */
public class C1179u<Data> implements C1161n<String, Data> {

    /* renamed from: a */
    public final C1161n<Uri, Data> f1441a;

    /* renamed from: b.h.a.m.w.u$a */
    public static final class C1180a implements C1163o<String, AssetFileDescriptor> {
        /* renamed from: b */
        public C1161n<String, AssetFileDescriptor> mo11033b(@NonNull C1169r rVar) {
            return new C1179u(rVar.mo11058b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: b.h.a.m.w.u$b */
    public static class C1181b implements C1163o<String, ParcelFileDescriptor> {
        @NonNull
        /* renamed from: b */
        public C1161n<String, ParcelFileDescriptor> mo11033b(@NonNull C1169r rVar) {
            return new C1179u(rVar.mo11058b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: b.h.a.m.w.u$c */
    public static class C1182c implements C1163o<String, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1161n<String, InputStream> mo11033b(@NonNull C1169r rVar) {
            return new C1179u(rVar.mo11058b(Uri.class, InputStream.class));
        }
    }

    public C1179u(C1161n<Uri, Data> nVar) {
        this.f1441a = nVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri;
        File file;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else {
            if (str.charAt(0) == '/') {
                file = new File(str);
            } else {
                uri = Uri.parse(str);
                if (uri.getScheme() == null) {
                    file = new File(str);
                }
            }
            uri = Uri.fromFile(file);
        }
        if (uri == null || !this.f1441a.mo11031b(uri)) {
            return null;
        }
        return this.f1441a.mo11030a(uri, i, i2, pVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo11031b(@NonNull Object obj) {
        String str = (String) obj;
        return true;
    }
}
