package p005b.p096l.p097a.p098a.p099e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p098a.C1583a;

/* renamed from: b.l.a.a.e.a */
public final class C1587a {

    /* renamed from: c */
    public static final String f2692c = C0823f.m355X("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d */
    public static final String f2693d = C0823f.m355X("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e */
    public static final String f2694e = C0823f.m355X("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f */
    public static final Set<C1583a> f2695f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1583a[]{new C1583a("proto"), new C1583a("json")})));
    @NonNull

    /* renamed from: a */
    public final String f2696a;
    @Nullable

    /* renamed from: b */
    public final String f2697b;

    public C1587a(@NonNull String str, @Nullable String str2) {
        this.f2696a = str;
        this.f2697b = str2;
    }

    @NonNull
    /* renamed from: a */
    public static C1587a m2053a(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C1587a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Nullable
    /* renamed from: b */
    public byte[] mo11734b() {
        String str = this.f2697b;
        if (str == null && this.f2696a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f2696a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
