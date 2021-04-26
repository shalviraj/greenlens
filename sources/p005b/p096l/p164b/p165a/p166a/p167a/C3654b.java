package p005b.p096l.p164b.p165a.p166a.p167a;

import com.google.api.client.http.HttpHeaders;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p169b.C3675d;
import p005b.p096l.p164b.p165a.p169b.C3677f;
import p005b.p096l.p164b.p165a.p169b.C3678g;
import p005b.p096l.p164b.p165a.p173d.C3746w;
import p005b.p096l.p164b.p165a.p173d.p174z.C3751b;
import p005b.p096l.p175c.p177b.C3774g0;
import p005b.p096l.p175c.p177b.C3792o;
import p005b.p096l.p175c.p177b.C3800v;
import p005b.p096l.p175c.p178c.C3805a;
import p005b.p096l.p175c.p179d.C3812a;

/* renamed from: b.l.b.a.a.a.b */
public final class C3654b implements C3675d, C3678g {

    /* renamed from: h */
    public static final SecureRandom f6732h = new SecureRandom();

    /* renamed from: i */
    public static final C3751b f6733i = new C3751b("-_.~", false);

    /* renamed from: a */
    public C3653a f6734a;

    /* renamed from: b */
    public String f6735b;

    /* renamed from: c */
    public String f6736c;

    /* renamed from: d */
    public String f6737d;

    /* renamed from: e */
    public String f6738e;

    /* renamed from: f */
    public String f6739f;

    /* renamed from: g */
    public String f6740g;

    /* renamed from: b.l.b.a.a.a.b$a */
    public static class C3655a implements Comparable<C3655a> {

        /* renamed from: g */
        public final String f6741g;

        /* renamed from: h */
        public final String f6742h;

        public C3655a(String str, String str2) {
            this.f6741g = str;
            this.f6742h = str2;
        }

        public int compareTo(Object obj) {
            C3655a aVar = (C3655a) obj;
            int compareTo = this.f6741g.compareTo(aVar.f6741g);
            return compareTo == 0 ? this.f6742h.compareTo(aVar.f6742h) : compareTo;
        }
    }

    /* renamed from: c */
    public static String m6893c(String str) {
        return f6733i.mo15130a(str);
    }

    /* renamed from: a */
    public final void mo14939a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            C3751b bVar = f6733i;
            sb.append(bVar.mo15130a(str));
            sb.append("=\"");
            sb.append(bVar.mo15130a(str2));
            sb.append("\",");
        }
    }

    /* renamed from: b */
    public void mo14940b(String str, C3674c cVar) {
        byte[] bArr;
        C3653a aVar = this.f6734a;
        Objects.requireNonNull(aVar);
        this.f6738e = "HMAC-SHA1";
        C3774g0 g0Var = new C3774g0(C3800v.f7009g);
        String str2 = this.f6735b;
        if (str2 != null) {
            mo14941d(g0Var, "oauth_consumer_key", str2);
        }
        String str3 = this.f6736c;
        if (str3 != null) {
            mo14941d(g0Var, "oauth_nonce", str3);
        }
        mo14941d(g0Var, "oauth_signature_method", "HMAC-SHA1");
        String str4 = this.f6739f;
        if (str4 != null) {
            mo14941d(g0Var, "oauth_timestamp", str4);
        }
        String str5 = this.f6740g;
        if (str5 != null) {
            mo14941d(g0Var, "oauth_token", str5);
        }
        for (Map.Entry next : cVar.entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String str6 = (String) next.getKey();
                if (value instanceof Collection) {
                    for (Object d : (Collection) value) {
                        mo14941d(g0Var, str6, d);
                    }
                } else {
                    mo14941d(g0Var, str6, value);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = true;
        for (C3655a aVar2 : g0Var.m7092c()) {
            if (z2) {
                z2 = false;
            } else {
                sb.append('&');
            }
            sb.append(aVar2.f6741g);
            String str7 = aVar2.f6742h;
            if (str7 != null) {
                sb.append('=');
                sb.append(str7);
            }
        }
        String sb2 = sb.toString();
        C3674c cVar2 = new C3674c();
        String str8 = cVar.scheme;
        Objects.requireNonNull(str8);
        cVar2.scheme = str8;
        String str9 = cVar.host;
        Objects.requireNonNull(str9);
        cVar2.host = str9;
        cVar2.pathParts = cVar.pathParts;
        int i = cVar.port;
        if (("http".equals(str8) && i == 80) || ("https".equals(str8) && i == 443)) {
            i = -1;
        }
        if (i < -1) {
            z = false;
        }
        C1960d.m2833p(z, "expected port >= -1");
        cVar2.port = i;
        String build = cVar2.build();
        StringBuilder sb3 = new StringBuilder();
        C3751b bVar = f6733i;
        sb3.append(bVar.mo15130a(str));
        sb3.append('&');
        sb3.append(m6893c(build));
        sb3.append('&');
        sb3.append(m6893c(sb2));
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        String str10 = aVar.f6730a;
        if (str10 != null) {
            sb5.append(bVar.mo15130a(str10));
        }
        sb5.append('&');
        String str11 = aVar.f6731b;
        if (str11 != null) {
            sb5.append(bVar.mo15130a(str11));
        }
        String sb6 = sb5.toString();
        String str12 = C3746w.f6927a;
        String str13 = null;
        SecretKeySpec secretKeySpec = new SecretKeySpec(sb6 == null ? null : sb6.getBytes(StandardCharsets.UTF_8), "HmacSHA1");
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(secretKeySpec);
        if (sb4 == null) {
            bArr = null;
        } else {
            bArr = sb4.getBytes(StandardCharsets.UTF_8);
        }
        byte[] doFinal = instance.doFinal(bArr);
        if (doFinal != null) {
            C3805a aVar3 = C3805a.f7015a;
            Objects.requireNonNull(aVar3);
            int length = doFinal.length;
            C1960d.m2869y(0, length + 0, doFinal.length);
            C3805a.C3806a aVar4 = ((C3805a.C3809d) aVar3).f7024b;
            StringBuilder sb7 = new StringBuilder(C3812a.m7195a(length, aVar4.f7021f, RoundingMode.CEILING) * aVar4.f7020e);
            try {
                aVar3.mo15323a(sb7, doFinal, 0, length);
                str13 = sb7.toString();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        this.f6737d = str13;
    }

    /* renamed from: d */
    public final void mo14941d(C3792o<C3655a> oVar, String str, Object obj) {
        String str2;
        String a = f6733i.mo15130a(str);
        if (obj == null) {
            str2 = null;
        } else {
            str2 = m6893c(obj.toString());
        }
        oVar.add(new C3655a(a, str2));
    }

    public void initialize(C3677f fVar) {
        fVar.f6765a = this;
    }

    public void intercept(C3677f fVar) {
        this.f6736c = Long.toHexString(Math.abs(f6732h.nextLong()));
        this.f6739f = Long.toString(System.currentTimeMillis() / 1000);
        try {
            mo14940b(fVar.f6774j, fVar.f6775k);
            HttpHeaders httpHeaders = fVar.f6766b;
            StringBuilder sb = new StringBuilder("OAuth");
            mo14939a(sb, "realm", (String) null);
            mo14939a(sb, "oauth_callback", (String) null);
            mo14939a(sb, "oauth_consumer_key", this.f6735b);
            mo14939a(sb, "oauth_nonce", this.f6736c);
            mo14939a(sb, "oauth_signature", this.f6737d);
            mo14939a(sb, "oauth_signature_method", this.f6738e);
            mo14939a(sb, "oauth_timestamp", this.f6739f);
            mo14939a(sb, "oauth_token", this.f6740g);
            mo14939a(sb, "oauth_verifier", (String) null);
            mo14939a(sb, "oauth_version", (String) null);
            httpHeaders.mo22143o(sb.substring(0, sb.length() - 1));
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }
}
