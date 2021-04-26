package p005b.p051h.p052a.p055m.p062w;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p062w.C1161n;

/* renamed from: b.h.a.m.w.s */
public class C1173s<Data> implements C1161n<Integer, Data> {

    /* renamed from: a */
    public final C1161n<Uri, Data> f1434a;

    /* renamed from: b */
    public final Resources f1435b;

    /* renamed from: b.h.a.m.w.s$a */
    public static final class C1174a implements C1163o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f1436a;

        public C1174a(Resources resources) {
            this.f1436a = resources;
        }

        /* renamed from: b */
        public C1161n<Integer, AssetFileDescriptor> mo11033b(C1169r rVar) {
            return new C1173s(this.f1436a, rVar.mo11058b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: b.h.a.m.w.s$b */
    public static class C1175b implements C1163o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f1437a;

        public C1175b(Resources resources) {
            this.f1437a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Integer, ParcelFileDescriptor> mo11033b(C1169r rVar) {
            return new C1173s(this.f1437a, rVar.mo11058b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: b.h.a.m.w.s$c */
    public static class C1176c implements C1163o<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f1438a;

        public C1176c(Resources resources) {
            this.f1438a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Integer, InputStream> mo11033b(C1169r rVar) {
            return new C1173s(this.f1438a, rVar.mo11058b(Uri.class, InputStream.class));
        }
    }

    /* renamed from: b.h.a.m.w.s$d */
    public static class C1177d implements C1163o<Integer, Uri> {

        /* renamed from: a */
        public final Resources f1439a;

        public C1177d(Resources resources) {
            this.f1439a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Integer, Uri> mo11033b(C1169r rVar) {
            return new C1173s(this.f1439a, C1183v.f1442a);
        }
    }

    public C1173s(Resources resources, C1161n<Uri, Data> nVar) {
        this.f1435b = resources;
        this.f1434a = nVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f1435b.getResourcePackageName(num.intValue()) + '/' + this.f1435b.getResourceTypeName(num.intValue()) + '/' + this.f1435b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f1434a.mo11030a(uri, i, i2, pVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo11031b(@NonNull Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
