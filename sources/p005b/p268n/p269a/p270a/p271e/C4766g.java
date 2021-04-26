package p005b.p268n.p269a.p270a.p271e;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p080i.p081a.C1422f;
import p005b.p080i.p081a.C1501h;
import p005b.p080i.p081a.C1502i;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: b.n.a.a.e.g */
public final class C4766g extends C4767h<String> {
    /* renamed from: d */
    public int mo16485d(@NonNull Object obj) {
        try {
            return ((String) obj).getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: e */
    public C1422f mo16486e(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        try {
            return new C1502i().mo11411h(new ByteArrayInputStream(((String) obj).getBytes()), true);
        } catch (C1501h e) {
            throw new C4768i(e);
        }
    }
}
