package p005b.p096l.p097a.p098a.p099e.p100e;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
/* renamed from: b.l.a.a.e.e.n */
public abstract class C1620n {
    @NonNull
    /* renamed from: a */
    public static C1620n m2127a(@NonNull Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new C1611h(Long.parseLong(jsonReader.nextString()));
                } else {
                    C1611h hVar = new C1611h(jsonReader.nextLong());
                    jsonReader.close();
                    return hVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: b */
    public abstract long mo11784b();
}
