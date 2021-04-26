package p005b.p268n.p269a.p270a.p271e;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Objects;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p080i.p081a.C1422f;
import p005b.p080i.p081a.C1501h;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: b.n.a.a.e.e */
public final class C4764e extends C4767h<ParcelFileDescriptor> {

    /* renamed from: a */
    public final C4761b f9113a = new C4761b();

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        C4761b bVar = this.f9113a;
        ((ParcelFileDescriptor) obj).getFileDescriptor();
        Objects.requireNonNull(bVar);
        return true;
    }

    /* renamed from: d */
    public int mo16485d(@NonNull Object obj) {
        return C1960d.m2764X(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    /* renamed from: e */
    public C1422f mo16486e(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        C4761b bVar = this.f9113a;
        FileDescriptor fileDescriptor = ((ParcelFileDescriptor) obj).getFileDescriptor();
        Objects.requireNonNull(bVar);
        try {
            return C1960d.m2774a0(fileDescriptor);
        } catch (C1501h | IOException e) {
            throw new C4768i(e);
        }
    }
}
