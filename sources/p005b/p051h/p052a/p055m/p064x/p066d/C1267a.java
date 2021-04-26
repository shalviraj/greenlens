package p005b.p051h.p052a.p055m.p064x.p066d;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.p055m.p056u.C0989e;

/* renamed from: b.h.a.m.x.d.a */
public class C1267a implements C0989e<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f1577a;

    /* renamed from: b.h.a.m.x.d.a$a */
    public static class C1268a implements C0989e.C0990a<ByteBuffer> {
        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo10857a() {
            return ByteBuffer.class;
        }

        @NonNull
        /* renamed from: b */
        public C0989e mo10858b(Object obj) {
            return new C1267a((ByteBuffer) obj);
        }
    }

    public C1267a(ByteBuffer byteBuffer) {
        this.f1577a = byteBuffer;
    }

    @NonNull
    /* renamed from: a */
    public Object mo10855a() {
        this.f1577a.position(0);
        return this.f1577a;
    }

    /* renamed from: b */
    public void mo10856b() {
    }
}
