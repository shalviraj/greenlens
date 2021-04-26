package com.airbnb.lottie.parser.moshi;

import p005b.p035e.p036a.p037a.C0843a;

public final class JsonScope {
    public static final int CLOSED = 8;
    public static final int DANGLING_NAME = 4;
    public static final int EMPTY_ARRAY = 1;
    public static final int EMPTY_DOCUMENT = 6;
    public static final int EMPTY_OBJECT = 3;
    public static final int NONEMPTY_ARRAY = 2;
    public static final int NONEMPTY_DOCUMENT = 7;
    public static final int NONEMPTY_OBJECT = 5;

    private JsonScope() {
    }

    public static String getPath(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder t = C0843a.m459t('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                t.append('[');
                t.append(iArr2[i2]);
                t.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                t.append('.');
                if (strArr[i2] != null) {
                    t.append(strArr[i2]);
                }
            }
        }
        return t.toString();
    }
}
