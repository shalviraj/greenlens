package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p064x.p065c.C1254s;

@RequiresApi(21)
/* renamed from: b.h.a.m.x.c.v */
public final class C1259v implements C0981r<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final C1245m f1560a;

    public C1259v(C1245m mVar) {
        this.f1560a = mVar;
    }

    @Nullable
    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        C1245m mVar = this.f1560a;
        return mVar.mo11084a(new C1254s.C1256b((ParcelFileDescriptor) obj, mVar.f1538d, mVar.f1537c), i, i2, pVar, C1245m.f1532k);
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        Objects.requireNonNull(this.f1560a);
        return true;
    }
}
