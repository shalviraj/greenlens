package p005b.p096l.p232f.p258y;

import java.util.HashMap;
import java.util.Map;
import p005b.p096l.p232f.C4614h;

/* renamed from: b.l.f.y.d */
public enum C4660d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{"US-ASCII"}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    

    /* renamed from: J */
    public static final Map<Integer, C4660d> f8803J = null;

    /* renamed from: K */
    public static final Map<String, C4660d> f8804K = null;

    /* renamed from: g */
    public final int[] f8824g;

    /* renamed from: h */
    public final String[] f8825h;

    /* access modifiers changed from: public */
    static {
        f8803J = new HashMap();
        f8804K = new HashMap();
        C4660d[] values = values();
        for (int i = 0; i < 27; i++) {
            C4660d dVar = values[i];
            for (int valueOf : dVar.f8824g) {
                f8803J.put(Integer.valueOf(valueOf), dVar);
            }
            f8804K.put(dVar.name(), dVar);
            for (String put : dVar.f8825h) {
                f8804K.put(put, dVar);
            }
        }
    }

    /* access modifiers changed from: public */
    C4660d(int i) {
        this.f8824g = new int[]{i};
        this.f8825h = new String[0];
    }

    /* access modifiers changed from: public */
    C4660d(int i, String... strArr) {
        this.f8824g = new int[]{i};
        this.f8825h = strArr;
    }

    /* access modifiers changed from: public */
    C4660d(int[] iArr, String... strArr) {
        this.f8824g = iArr;
        this.f8825h = strArr;
    }

    /* renamed from: d */
    public static C4660d m8585d(int i) {
        if (i >= 0 && i < 900) {
            return f8803J.get(Integer.valueOf(i));
        }
        throw C4614h.m8506a();
    }
}
