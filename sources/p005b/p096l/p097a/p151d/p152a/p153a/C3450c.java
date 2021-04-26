package p005b.p096l.p097a.p151d.p152a.p153a;

import androidx.annotation.NonNull;

/* renamed from: b.l.a.d.a.a.c */
public abstract class C3450c {
    @NonNull
    /* renamed from: c */
    public static C3450c m6594c(int i) {
        Integer valueOf = Integer.valueOf(i);
        Boolean bool = Boolean.FALSE;
        String str = "";
        if (valueOf == null) {
            str = str.concat(" appUpdateType");
        }
        if (bool == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new C3467t(valueOf.intValue(), bool.booleanValue());
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    /* renamed from: a */
    public abstract boolean mo14732a();

    /* renamed from: b */
    public abstract int mo14733b();
}
