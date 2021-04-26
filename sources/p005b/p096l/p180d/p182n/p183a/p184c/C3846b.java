package p005b.p096l.p180d.p182n.p183a.p184c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p005b.p096l.p097a.p113c.p145h.p147b.C3271o5;

/* renamed from: b.l.d.n.a.c.b */
public final class C3846b {

    /* renamed from: a */
    public static final Set<String> f7069a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    public static final List<String> f7070b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});

    /* renamed from: c */
    public static final List<String> f7071c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    public static final List<String> f7072d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    public static final List<String> f7073e;

    /* renamed from: f */
    public static final List<String> f7074f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        String[][] strArr = {C3271o5.f5810a, C3271o5.f5811b};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += strArr[i2].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i);
        int length = strArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            String[] strArr2 = strArr[i3];
            System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
            length += strArr2.length;
        }
        f7073e = Arrays.asList((String[]) copyOf);
    }

    /* renamed from: a */
    public static boolean m7231a(String str) {
        return !f7071c.contains(str);
    }
}
