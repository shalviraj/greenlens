package p005b.p096l.p232f.p237c0.p238c0.p239f.p240d;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p232f.C4619m;

/* renamed from: b.l.f.c0.c0.f.d.r */
public final class C4524r {

    /* renamed from: a */
    public static final Object f8433a;

    /* renamed from: b */
    public static final Object[][] f8434b;

    /* renamed from: c */
    public static final Object[][] f8435c;

    /* renamed from: d */
    public static final Object[][] f8436d;

    /* renamed from: e */
    public static final Object[][] f8437e;

    static {
        Object obj = new Object();
        f8433a = obj;
        f8434b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        f8435c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f8436d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        f8437e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    /* renamed from: a */
    public static String m8305a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            for (Object[] objArr : f8434b) {
                if (objArr[0].equals(substring)) {
                    return objArr[1] == f8433a ? m8307c(2, ((Integer) objArr[2]).intValue(), str) : m8306b(2, ((Integer) objArr[1]).intValue(), str);
                }
            }
            if (str.length() >= 3) {
                String substring2 = str.substring(0, 3);
                for (Object[] objArr2 : f8435c) {
                    if (objArr2[0].equals(substring2)) {
                        return objArr2[1] == f8433a ? m8307c(3, ((Integer) objArr2[2]).intValue(), str) : m8306b(3, ((Integer) objArr2[1]).intValue(), str);
                    }
                }
                for (Object[] objArr3 : f8436d) {
                    if (objArr3[0].equals(substring2)) {
                        return objArr3[1] == f8433a ? m8307c(4, ((Integer) objArr3[2]).intValue(), str) : m8306b(4, ((Integer) objArr3[1]).intValue(), str);
                    }
                }
                if (str.length() >= 4) {
                    String substring3 = str.substring(0, 4);
                    for (Object[] objArr4 : f8437e) {
                        if (objArr4[0].equals(substring3)) {
                            return objArr4[1] == f8433a ? m8307c(4, ((Integer) objArr4[2]).intValue(), str) : m8306b(4, ((Integer) objArr4[1]).intValue(), str);
                        }
                    }
                    throw C4619m.f8685i;
                }
                throw C4619m.f8685i;
            }
            throw C4619m.f8685i;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: b */
    public static String m8306b(int i, int i2, String str) {
        if (str.length() >= i) {
            String substring = str.substring(0, i);
            int i3 = i2 + i;
            if (str.length() >= i3) {
                String substring2 = str.substring(i, i3);
                String str2 = "(" + substring + ')' + substring2;
                String a = m8305a(str.substring(i3));
                return a == null ? str2 : C0843a.m451l(str2, a);
            }
            throw C4619m.f8685i;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: c */
    public static String m8307c(int i, int i2, String str) {
        String substring = str.substring(0, i);
        int min = Math.min(str.length(), i2 + i);
        String substring2 = str.substring(i, min);
        String str2 = "(" + substring + ')' + substring2;
        String a = m8305a(str.substring(min));
        return a == null ? str2 : C0843a.m451l(str2, a);
    }
}
