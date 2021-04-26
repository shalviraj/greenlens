package p005b.p096l.p180d.p191q.p192f.p197i.p198x;

import android.util.Base64;
import android.util.JsonReader;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4091e;
import p005b.p096l.p180d.p191q.p192f.p197i.p198x.C4163h;
import p005b.p096l.p180d.p208s.C4202a;

/* renamed from: b.l.d.q.f.i.x.b */
public final /* synthetic */ class C4157b implements C4163h.C4164a {

    /* renamed from: a */
    public static final C4157b f7714a = new C4157b();

    /* renamed from: a */
    public Object mo15765a(JsonReader jsonReader) {
        C4202a aVar = C4163h.f7720a;
        jsonReader.beginObject();
        String str = null;
        byte[] bArr = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                str = jsonReader.nextString();
                Objects.requireNonNull(str, "Null filename");
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                bArr = Base64.decode(jsonReader.nextString(), 2);
                Objects.requireNonNull(bArr, "Null contents");
            }
        }
        jsonReader.endObject();
        String str2 = str == null ? " filename" : "";
        if (bArr == null) {
            str2 = C0843a.m451l(str2, " contents");
        }
        if (str2.isEmpty()) {
            return new C4091e(str, bArr, (C4091e.C4092a) null);
        }
        throw new IllegalStateException(C0843a.m451l("Missing required properties:", str2));
    }
}
