package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* renamed from: b.l.a.c.e.e.f5 */
public final class C2152f5 {

    /* renamed from: a */
    public final SharedPreferences f3853a;

    public C2152f5(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f3853a = str == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public final byte[] mo12638a() {
        try {
            String string = this.f3853a.getString("GenericIdpKeyset", (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{"GenericIdpKeyset"}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i + i;
                    int digit = Character.digit(string.charAt(i2), 16);
                    int digit2 = Character.digit(string.charAt(i2 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{"GenericIdpKeyset"}));
        }
    }
}
