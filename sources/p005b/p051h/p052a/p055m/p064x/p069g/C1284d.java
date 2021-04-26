package p005b.p051h.p052a.p055m.p064x.p069g;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import p005b.p051h.p052a.p055m.C0964c;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0982s;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p078s.C1367a;

/* renamed from: b.h.a.m.x.g.d */
public class C1284d implements C0982s<C1282c> {
    /* renamed from: a */
    public boolean mo10825a(@NonNull Object obj, @NonNull File file, @NonNull C0979p pVar) {
        try {
            C1367a.m1457b(((C1282c) ((C1115w) obj).get()).f1593g.f1604a.f1606a.mo10814g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @NonNull
    /* renamed from: b */
    public C0964c mo10838b(@NonNull C0979p pVar) {
        return C0964c.SOURCE;
    }
}
