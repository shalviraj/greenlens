package p005b.p273o.p274w4.p275f;

import androidx.annotation.NonNull;

/* renamed from: b.o.w4.f.c */
public enum C5019c {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    @NonNull
    /* renamed from: d */
    public static C5019c m9220d(String str) {
        C5019c cVar = UNATTRIBUTED;
        if (str != null && !str.isEmpty()) {
            C5019c[] values = values();
            for (int i = 0; i < 4; i++) {
                C5019c cVar2 = values[i];
                if (cVar2.name().equalsIgnoreCase(str)) {
                    return cVar2;
                }
            }
        }
        return cVar;
    }

    /* renamed from: e */
    public boolean mo16776e() {
        return mo16777i() || mo16778k();
    }

    /* renamed from: i */
    public boolean mo16777i() {
        return equals(DIRECT);
    }

    /* renamed from: k */
    public boolean mo16778k() {
        return equals(INDIRECT);
    }
}
