package p005b.p006a.p007a.p018i;

import android.content.Context;
import android.graphics.Color;
import android.util.Base64;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7685a;
import p298d.p415c0.C7694h;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.i.o */
public final class C0756o {
    /* renamed from: a */
    public static final String m223a(String str) {
        C6888i.m12438e(str, "$this$base64Decoded");
        byte[] decode = Base64.decode(str, 2);
        C6888i.m12437d(decode, "Base64.decode(this, Base64.NO_WRAP)");
        return new String(decode, C7685a.f15210a);
    }

    /* renamed from: b */
    public static final String m224b(String str) {
        C6888i.m12438e(str, "$this$base64encodedUrl");
        String substring = str.substring(m230h(str, "/", 1, true) + 1);
        C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final String m225c(String str) {
        C6888i.m12438e(str, "$this$getBaseUrl");
        String substring = str.substring(0, m231i(str, "/", 5, false, 4) + 1);
        C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public static final String m226d(String str) {
        C6888i.m12438e(str, "$this$getThirdTagValue");
        String substring = str.substring(m231i(str, ":", 2, false, 4) + 1);
        C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: e */
    public static final boolean m227e(String str) {
        C6888i.m12438e(str, "$this$isBravoDevAppId");
        return str.length() == 29 && C7694h.m13947y(str, "dev", true);
    }

    /* renamed from: f */
    public static final boolean m228f(String str) {
        C6888i.m12438e(str, "$this$isValid");
        if (!C6888i.m12434a(str, "")) {
            String lowerCase = str.toLowerCase();
            C6888i.m12437d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!C6888i.m12434a(lowerCase, "null")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m229g(String str) {
        C6888i.m12438e(str, "$this$isValidColor");
        try {
            if (!C6888i.m12434a(str, "")) {
                if (!C7694h.m13910A(str, "#", false, 2)) {
                    Color.parseColor('#' + str);
                    return true;
                }
                Color.parseColor(str);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: h */
    public static final int m230h(String str, CharSequence charSequence, int i, boolean z) {
        C6888i.m12438e(str, "$this$ordinalIndexOf");
        int i2 = -1;
        if (charSequence == null || i <= 0) {
            return i2;
        }
        if (!(charSequence.length() == 0)) {
            if (z) {
                i2 = str.length();
            }
            int i3 = 0;
            do {
                String obj = charSequence.toString();
                i2 = z ? C7694h.m13938p(str, obj, i2 - 1, false, 4) : C7694h.m13934l(str, obj, i2 + 1, false, 4);
                if (i2 < 0) {
                    return i2;
                }
                i3++;
            } while (i3 < i);
            return i2;
        } else if (z) {
            return str.length();
        } else {
            return 0;
        }
    }

    /* renamed from: i */
    public static /* synthetic */ int m231i(String str, CharSequence charSequence, int i, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m230h(str, charSequence, i, z);
    }

    /* renamed from: j */
    public static final String m232j(String str) {
        C6888i.m12438e(str, "$this$tagValue");
        int i = m231i(str, ":", 1, false, 4);
        if (i == -1) {
            return null;
        }
        String substring = str.substring(i + 1);
        C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: k */
    public static final int m233k(String str) {
        C6888i.m12438e(str, "$this$toColor");
        try {
            if (!(!C6888i.m12434a(str, ""))) {
                return ViewCompat.MEASURED_STATE_MASK;
            }
            if (C7694h.m13910A(str, "#", false, 2)) {
                return Color.parseColor(str);
            }
            return Color.parseColor('#' + str);
        } catch (Exception e) {
            Context a = C0849e.m505a();
            Toast.makeText(a, "ERROR IN COLOR: " + str, 0).show();
            Object[] objArr = {str, e.getLocalizedMessage()};
            C8091a.C8093b bVar = C8091a.f16272d;
            bVar.mo26043a("Error parsing color: %s. Error: %s", objArr);
            bVar.mo26044b("Error parsing color: %s. Error: %s", str, e.getLocalizedMessage());
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: l */
    public static final String m234l(String str) {
        C6888i.m12438e(str, "$this$toTitleCase");
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            char charAt = sb.charAt(i);
            boolean isWhitespace = Character.isWhitespace(charAt);
            if (z) {
                if (!isWhitespace) {
                    sb.setCharAt(i, Character.toTitleCase(charAt));
                    z = false;
                }
            } else if (isWhitespace) {
                z = true;
            } else {
                sb.setCharAt(i, Character.toLowerCase(charAt));
            }
        }
        return sb.toString();
    }

    /* renamed from: m */
    public static final String m235m(String str) {
        C6888i.m12438e(str, "$this$validateText");
        String lowerCase = str.toLowerCase();
        C6888i.m12437d(lowerCase, "(this as java.lang.String).toLowerCase()");
        C6888i.m12438e(lowerCase, "$this$base64Encoded");
        byte[] bytes = lowerCase.getBytes(C7685a.f15210a);
        C6888i.m12437d(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        C6888i.m12437d(encodeToString, "Base64.encodeToString(th…eArray(), Base64.NO_WRAP)");
        return C6888i.m12434a(encodeToString, "d2hvIGlzIGJlaGluZCBicmF2bw==") ? m223a("QWxiZXJ0bywgQXVyaWthLCBDaHJpc3RpbmEsIERhcmlvLCBHb256YWxvLCBMZXdpcywgTWFyaywgTWFydGEsIFBhdSwgUGVkcm8sIFRvYnksIFZpY3Rvcg==") : str;
    }
}
