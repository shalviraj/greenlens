package p005b.p051h.p052a.p055m.p064x.p065c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;

/* renamed from: b.h.a.m.x.c.a */
public class C1212a<DataType> implements C0981r<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final C0981r<DataType, Bitmap> f1488a;

    /* renamed from: b */
    public final Resources f1489b;

    public C1212a(@NonNull Resources resources, @NonNull C0981r<DataType, Bitmap> rVar) {
        this.f1489b = resources;
        this.f1488a = rVar;
    }

    /* renamed from: a */
    public C1115w<BitmapDrawable> mo10836a(@NonNull DataType datatype, int i, int i2, @NonNull C0979p pVar) {
        return C1258u.m1248c(this.f1489b, this.f1488a.mo10836a(datatype, i, i2, pVar));
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull DataType datatype, @NonNull C0979p pVar) {
        return this.f1488a.mo10837b(datatype, pVar);
    }
}
