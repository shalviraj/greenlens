package p005b.p096l.p180d.p191q.p192f.p197i.p198x;

import android.util.Base64;
import android.util.JsonReader;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4109m;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;
import p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h;
import p005b.p096l.p180d.p208s.C4202a;

/* renamed from: b.l.d.q.f.i.x.e */
public final /* synthetic */ class C4160e implements C4163h.C4164a {

    /* renamed from: a */
    public static final C4160e f7717a = new C4160e();

    /* renamed from: a */
    public Object mo15765a(JsonReader jsonReader) {
        C4202a aVar = C4163h.f7720a;
        jsonReader.beginObject();
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String c = C0843a.m442c(jsonReader);
            char c2 = 65535;
            switch (c.hashCode()) {
                case 3373707:
                    if (c.equals("name")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (c.equals("size")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (c.equals("uuid")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (c.equals("baseAddress")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 1:
                    l2 = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), C4129v.f7711a);
                    break;
                case 3:
                    l = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = l == null ? " baseAddress" : "";
        if (l2 == null) {
            str3 = C0843a.m451l(str3, " size");
        }
        if (str == null) {
            str3 = C0843a.m451l(str3, " name");
        }
        if (str3.isEmpty()) {
            return new C4109m(l.longValue(), l2.longValue(), str, str2, (C4109m.C4110a) null);
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str3));
    }
}
