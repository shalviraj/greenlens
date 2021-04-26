package p005b.p096l.p180d.p191q.p192f.p197i.p198x;

import android.util.JsonReader;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4115p;
import p005b.p096l.p180d.p191q.p192f.p197i.C4155w;
import p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h;
import p005b.p096l.p180d.p208s.C4202a;

/* renamed from: b.l.d.q.f.i.x.d */
public final /* synthetic */ class C4159d implements C4163h.C4164a {

    /* renamed from: a */
    public static final C4159d f7716a = new C4159d();

    /* renamed from: a */
    public Object mo15765a(JsonReader jsonReader) {
        C4202a aVar = C4163h.f7720a;
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        C4155w wVar = null;
        while (jsonReader.hasNext()) {
            String c = C0843a.m442c(jsonReader);
            char c2 = 65535;
            switch (c.hashCode()) {
                case -1266514778:
                    if (c.equals("frames")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (c.equals("name")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (c.equals("importance")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    wVar = C4163h.m7694a(jsonReader, C4162g.f7719a);
                    break;
                case 1:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 2:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " name" : "";
        if (num == null) {
            str2 = C0843a.m451l(str2, " importance");
        }
        if (wVar == null) {
            str2 = C0843a.m451l(str2, " frames");
        }
        if (str2.isEmpty()) {
            return new C4115p(str, num.intValue(), wVar, (C4115p.C4116a) null);
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str2));
    }
}
