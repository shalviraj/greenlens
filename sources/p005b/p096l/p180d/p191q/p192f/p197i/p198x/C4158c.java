package p005b.p096l.p180d.p191q.p192f.p197i.p198x;

import android.util.JsonReader;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4087c;
import p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h;
import p005b.p096l.p180d.p208s.C4202a;

/* renamed from: b.l.d.q.f.i.x.c */
public final /* synthetic */ class C4158c implements C4163h.C4164a {

    /* renamed from: a */
    public static final C4158c f7715a = new C4158c();

    /* renamed from: a */
    public Object mo15765a(JsonReader jsonReader) {
        C4202a aVar = C4163h.f7720a;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null key");
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.nextString();
                Objects.requireNonNull(str2, "Null value");
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : "";
        if (str2 == null) {
            str3 = C0843a.m451l(str3, " value");
        }
        if (str3.isEmpty()) {
            return new C4087c(str, str2, (C4087c.C4088a) null);
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str3));
    }
}
