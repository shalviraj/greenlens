package p005b.p051h.p052a.p055m.p062w;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.b */
public class C1124b<Data> implements C1161n<byte[], Data> {

    /* renamed from: a */
    public final C1127b<Data> f1371a;

    /* renamed from: b.h.a.m.w.b$a */
    public static class C1125a implements C1163o<byte[], ByteBuffer> {

        /* renamed from: b.h.a.m.w.b$a$a */
        public class C1126a implements C1127b<ByteBuffer> {
            public C1126a(C1125a aVar) {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo11034a() {
                return ByteBuffer.class;
            }

            /* renamed from: b */
            public Object mo11035b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @NonNull
        /* renamed from: b */
        public C1161n<byte[], ByteBuffer> mo11033b(@NonNull C1169r rVar) {
            return new C1124b(new C1126a(this));
        }
    }

    /* renamed from: b.h.a.m.w.b$b */
    public interface C1127b<Data> {
        /* renamed from: a */
        Class<Data> mo11034a();

        /* renamed from: b */
        Data mo11035b(byte[] bArr);
    }

    /* renamed from: b.h.a.m.w.b$c */
    public static class C1128c<Data> implements C0987d<Data> {

        /* renamed from: g */
        public final byte[] f1372g;

        /* renamed from: h */
        public final C1127b<Data> f1373h;

        public C1128c(byte[] bArr, C1127b<Data> bVar) {
            this.f1372g = bArr;
            this.f1373h = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo10839a() {
            return this.f1373h.mo11034a();
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
        public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super Data> aVar) {
            aVar.mo10854d(this.f1373h.mo11035b(this.f1372g));
        }
    }

    /* renamed from: b.h.a.m.w.b$d */
    public static class C1129d implements C1163o<byte[], InputStream> {

        /* renamed from: b.h.a.m.w.b$d$a */
        public class C1130a implements C1127b<InputStream> {
            public C1130a(C1129d dVar) {
            }

            /* renamed from: a */
            public Class<InputStream> mo11034a() {
                return InputStream.class;
            }

            /* renamed from: b */
            public Object mo11035b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @NonNull
        /* renamed from: b */
        public C1161n<byte[], InputStream> mo11033b(@NonNull C1169r rVar) {
            return new C1124b(new C1130a(this));
        }
    }

    public C1124b(C1127b<Data> bVar) {
        this.f1371a = bVar;
    }

    /* renamed from: a */
    public C1161n.C1162a mo11030a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        byte[] bArr = (byte[]) obj;
        return new C1161n.C1162a(new C1366b(bArr), new C1128c(bArr, this.f1371a));
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo11031b(@NonNull Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
