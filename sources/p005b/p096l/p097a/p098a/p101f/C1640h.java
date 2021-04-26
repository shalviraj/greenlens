package p005b.p096l.p097a.p098a.p101f;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import p005b.p096l.p097a.p098a.C1584b;
import p005b.p096l.p097a.p098a.p101f.C1628b;

@AutoValue
/* renamed from: b.l.a.a.f.h */
public abstract class C1640h {

    @AutoValue.Builder
    /* renamed from: b.l.a.a.f.h$a */
    public static abstract class C1641a {
        /* renamed from: a */
        public abstract C1640h mo11813a();

        /* renamed from: b */
        public abstract C1641a mo11814b(String str);

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: c */
        public abstract C1641a mo11815c(C1584b bVar);
    }

    /* renamed from: a */
    public static C1641a m2161a() {
        C1628b.C1630b bVar = new C1628b.C1630b();
        bVar.mo11815c(C1584b.DEFAULT);
        return bVar;
    }

    /* renamed from: b */
    public abstract String mo11808b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo11809c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract C1584b mo11810d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo11808b();
        objArr[1] = mo11810d();
        objArr[2] = mo11809c() == null ? "" : Base64.encodeToString(mo11809c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
