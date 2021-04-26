package p005b.p051h.p052a.p055m.p062w;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0984a;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p056u.C0996i;
import p005b.p051h.p052a.p055m.p056u.C1007o;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.w */
public class C1186w<Data> implements C1161n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f1445b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    public final C1189c<Data> f1446a;

    /* renamed from: b.h.a.m.w.w$a */
    public static final class C1187a implements C1163o<Uri, AssetFileDescriptor>, C1189c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f1447a;

        public C1187a(ContentResolver contentResolver) {
            this.f1447a = contentResolver;
        }

        /* renamed from: a */
        public C0987d<AssetFileDescriptor> mo11061a(Uri uri) {
            return new C0984a(this.f1447a, uri);
        }

        /* renamed from: b */
        public C1161n<Uri, AssetFileDescriptor> mo11033b(C1169r rVar) {
            return new C1186w(this);
        }
    }

    /* renamed from: b.h.a.m.w.w$b */
    public static class C1188b implements C1163o<Uri, ParcelFileDescriptor>, C1189c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f1448a;

        public C1188b(ContentResolver contentResolver) {
            this.f1448a = contentResolver;
        }

        /* renamed from: a */
        public C0987d<ParcelFileDescriptor> mo11061a(Uri uri) {
            return new C0996i(this.f1448a, uri);
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Uri, ParcelFileDescriptor> mo11033b(C1169r rVar) {
            return new C1186w(this);
        }
    }

    /* renamed from: b.h.a.m.w.w$c */
    public interface C1189c<Data> {
        /* renamed from: a */
        C0987d<Data> mo11061a(Uri uri);
    }

    /* renamed from: b.h.a.m.w.w$d */
    public static class C1190d implements C1163o<Uri, InputStream>, C1189c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f1449a;

        public C1190d(ContentResolver contentResolver) {
            this.f1449a = contentResolver;
        }

        /* renamed from: a */
        public C0987d<InputStream> mo11061a(Uri uri) {
            return new C1007o(this.f1449a, uri);
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Uri, InputStream> mo11033b(C1169r rVar) {
            return new C1186w(this);
        }
    }

    public C1186w(C1189c<Data> cVar) {
        this.f1446a = cVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri = (Uri) obj;
        return new C1161n.C1162a(new C1366b(uri), this.f1446a.mo11061a(uri));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Object obj) {
        return f1445b.contains(((Uri) obj).getScheme());
    }
}
