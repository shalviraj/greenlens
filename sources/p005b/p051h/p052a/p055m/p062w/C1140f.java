package p005b.p051h.p052a.p055m.p062w;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.f */
public class C1140f<Data> implements C1161n<File, Data> {

    /* renamed from: a */
    public final C1145d<Data> f1380a;

    /* renamed from: b.h.a.m.w.f$a */
    public static class C1141a<Data> implements C1163o<File, Data> {

        /* renamed from: a */
        public final C1145d<Data> f1381a;

        public C1141a(C1145d<Data> dVar) {
            this.f1381a = dVar;
        }

        @NonNull
        /* renamed from: b */
        public final C1161n<File, Data> mo11033b(@NonNull C1169r rVar) {
            return new C1140f(this.f1381a);
        }
    }

    /* renamed from: b.h.a.m.w.f$b */
    public static class C1142b extends C1141a<ParcelFileDescriptor> {

        /* renamed from: b.h.a.m.w.f$b$a */
        public class C1143a implements C1145d<ParcelFileDescriptor> {
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo11037a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: b */
            public Object mo11038b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            /* renamed from: c */
            public void mo11039c(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public C1142b() {
            super(new C1143a());
        }
    }

    /* renamed from: b.h.a.m.w.f$c */
    public static final class C1144c<Data> implements C0987d<Data> {

        /* renamed from: g */
        public final File f1382g;

        /* renamed from: h */
        public final C1145d<Data> f1383h;

        /* renamed from: i */
        public Data f1384i;

        public C1144c(File file, C1145d<Data> dVar) {
            this.f1382g = file;
            this.f1383h = dVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo10839a() {
            return this.f1383h.mo11037a();
        }

        /* renamed from: b */
        public void mo10842b() {
            Data data = this.f1384i;
            if (data != null) {
                try {
                    this.f1383h.mo11039c(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: e */
        public C0962a mo10846e() {
            return C0962a.LOCAL;
        }

        /* renamed from: f */
        public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super Data> aVar) {
            try {
                Data b = this.f1383h.mo11038b(this.f1382g);
                this.f1384i = b;
                aVar.mo10854d(b);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo10853c(e);
            }
        }
    }

    /* renamed from: b.h.a.m.w.f$d */
    public interface C1145d<Data> {
        /* renamed from: a */
        Class<Data> mo11037a();

        /* renamed from: b */
        Data mo11038b(File file);

        /* renamed from: c */
        void mo11039c(Data data);
    }

    /* renamed from: b.h.a.m.w.f$e */
    public static class C1146e extends C1141a<InputStream> {

        /* renamed from: b.h.a.m.w.f$e$a */
        public class C1147a implements C1145d<InputStream> {
            /* renamed from: a */
            public Class<InputStream> mo11037a() {
                return InputStream.class;
            }

            /* renamed from: b */
            public Object mo11038b(File file) {
                return new FileInputStream(file);
            }

            /* renamed from: c */
            public void mo11039c(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public C1146e() {
            super(new C1147a());
        }
    }

    public C1140f(C1145d<Data> dVar) {
        this.f1380a = dVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        File file = (File) obj;
        return new C1161n.C1162a(new C1366b(file), new C1144c(file, this.f1380a));
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo11031b(@NonNull Object obj) {
        File file = (File) obj;
        return true;
    }
}
