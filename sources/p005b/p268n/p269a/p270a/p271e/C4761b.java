package p005b.p268n.p269a.p270a.p271e;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.FileDescriptor;
import java.io.IOException;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p080i.p081a.C1422f;
import p005b.p080i.p081a.C1501h;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: b.n.a.a.e.b */
public final class C4761b extends C4767h<FileDescriptor> {
    /* renamed from: d */
    public int mo16485d(@NonNull Object obj) {
        return C1960d.m2764X((FileDescriptor) obj);
    }

    /* renamed from: e */
    public C1422f mo16486e(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        try {
            return C1960d.m2774a0((FileDescriptor) obj);
        } catch (C1501h | IOException e) {
            throw new C4768i(e);
        }
    }
}
