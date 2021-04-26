package p005b.p051h.p052a.p055m.p062w;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p062w.C1161n;
import p005b.p051h.p052a.p077r.C1366b;

/* renamed from: b.h.a.m.w.e */
public final class C1135e<Model, Data> implements C1161n<Model, Data> {

    /* renamed from: a */
    public final C1136a<Data> f1375a;

    /* renamed from: b.h.a.m.w.e$a */
    public interface C1136a<Data> {
    }

    /* renamed from: b.h.a.m.w.e$b */
    public static final class C1137b<Data> implements C0987d<Data> {

        /* renamed from: g */
        public final String f1376g;

        /* renamed from: h */
        public final C1136a<Data> f1377h;

        /* renamed from: i */
        public Data f1378i;

        public C1137b(String str, C1136a<Data> aVar) {
            this.f1376g = str;
            this.f1377h = aVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo10839a() {
            Objects.requireNonNull((C1138c.C1139a) this.f1377h);
            return InputStream.class;
        }

        /* renamed from: b */
        public void mo10842b() {
            try {
                C1136a<Data> aVar = this.f1377h;
                Data data = this.f1378i;
                Objects.requireNonNull((C1138c.C1139a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
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
                Data a = ((C1138c.C1139a) this.f1377h).mo11036a(this.f1376g);
                this.f1378i = a;
                aVar.mo10854d(a);
            } catch (IllegalArgumentException e) {
                aVar.mo10853c(e);
            }
        }
    }

    /* renamed from: b.h.a.m.w.e$c */
    public static final class C1138c<Model> implements C1163o<Model, InputStream> {

        /* renamed from: a */
        public final C1136a<InputStream> f1379a = new C1139a(this);

        /* renamed from: b.h.a.m.w.e$c$a */
        public class C1139a implements C1136a<InputStream> {
            public C1139a(C1138c cVar) {
            }

            /* renamed from: a */
            public Object mo11036a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @NonNull
        /* renamed from: b */
        public C1161n<Model, InputStream> mo11033b(@NonNull C1169r rVar) {
            return new C1135e(this.f1379a);
        }
    }

    public C1135e(C1136a<Data> aVar) {
        this.f1375a = aVar;
    }

    /* renamed from: a */
    public C1161n.C1162a<Data> mo11030a(@NonNull Model model, int i, int i2, @NonNull C0979p pVar) {
        return new C1161n.C1162a<>(new C1366b(model), new C1137b(model.toString(), this.f1375a));
    }

    /* renamed from: b */
    public boolean mo11031b(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }
}
