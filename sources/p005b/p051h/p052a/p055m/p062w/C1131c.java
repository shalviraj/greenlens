package p005b.p051h.p052a.p055m.p062w;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.p055m.C0965d;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p078s.C1367a;

/* renamed from: b.h.a.m.w.c */
public class C1131c implements C0965d<ByteBuffer> {
    /* renamed from: a */
    public boolean mo10825a(@NonNull Object obj, @NonNull File file, @NonNull C0979p pVar) {
        try {
            C1367a.m1457b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
