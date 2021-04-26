package p005b.p040g.p041a.p046h;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: b.g.a.h.a */
public class C0879a {

    /* renamed from: a */
    public static final String f748a = "a";

    /* renamed from: a */
    public byte[] mo10727a(String str) {
        try {
            return str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            Log.e(f748a, "Could not convert string to an ASCII byte array", e);
            throw new IllegalStateException("Could not convert string to an ASCII byte array", e);
        }
    }

    /* renamed from: b */
    public byte[] mo10728b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr, 0, bArr.length);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            Log.e(f748a, "Failed to get SHA-256 signature", e);
            throw new IllegalStateException("Failed to get SHA-256 signature", e);
        }
    }
}
