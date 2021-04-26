package p005b.p096l.p097a.p113c.p131e.p136e;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: b.l.a.c.e.e.c5 */
public final class C2077c5 implements C2464s1 {

    /* renamed from: b */
    public static final String f3657b = "c5";

    /* renamed from: a */
    public final SecretKey f3658a;

    public C2077c5(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f3658a = secretKey;
        if (secretKey == null) {
            String valueOf = String.valueOf(str);
            throw new InvalidKeyException(valueOf.length() != 0 ? "Keystore cannot load the key with ID: ".concat(valueOf) : new String("Keystore cannot load the key with ID: "));
        }
    }

    /* renamed from: a */
    public final byte[] mo12385a(byte[] bArr, byte[] bArr2) {
        try {
            return mo12455c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f3657b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return mo12455c(bArr, bArr2);
        }
    }

    /* renamed from: b */
    public final byte[] mo12386b(byte[] bArr, byte[] bArr2) {
        try {
            return mo12456d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f3657b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return mo12456d(bArr, bArr2);
        }
    }

    /* renamed from: c */
    public final byte[] mo12455c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f3658a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: d */
    public final byte[] mo12456d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f3658a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
