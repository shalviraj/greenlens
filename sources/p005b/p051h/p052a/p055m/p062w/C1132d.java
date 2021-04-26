package p005b.p051h.p052a.p055m.p062w;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;
import p005b.p051h.p052a.p078s.C1367a;

/* renamed from: b.h.a.m.w.d */
public class C1132d implements C1161n<File, ByteBuffer> {

    /* renamed from: b.h.a.m.w.d$a */
    public static final class C1133a implements C0987d<ByteBuffer> {

        /* renamed from: g */
        public final File f1374g;

        public C1133a(File file) {
            this.f1374g = file;
        }

        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo10839a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public void mo10842b() {
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: e */
        public C0962a mo10846e() {
            return C0962a.LOCAL;
        }

        /* renamed from: f */
        public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super ByteBuffer> aVar) {
            try {
                aVar.mo10854d(C1367a.m1456a(this.f1374g));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo10853c(e);
            }
        }
    }

    /* renamed from: b.h.a.m.w.d$b */
    public static class C1134b implements C1163o<File, ByteBuffer> {
        @NonNull
        /* renamed from: b */
        public C1161n<File, ByteBuffer> mo11033b(@NonNull C1169r rVar) {
            return new C1132d();
        }
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        File file = (File) obj;
        return new C1161n.C1162a(new C1366b(file), new C1133a(file));
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo11031b(@NonNull Object obj) {
        File file = (File) obj;
        return true;
    }
}
