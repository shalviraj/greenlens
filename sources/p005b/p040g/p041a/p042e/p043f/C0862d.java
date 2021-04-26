package p005b.p040g.p041a.p042e.p043f;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Calendar;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import p005b.p035e.p036a.p037a.C0843a;

@RequiresApi(api = 19)
/* renamed from: b.g.a.e.f.d */
public class C0862d {

    /* renamed from: e */
    public static final String f722e = "d";

    /* renamed from: a */
    public final String f723a;

    /* renamed from: b */
    public final String f724b;

    /* renamed from: c */
    public final C0868j f725c;

    /* renamed from: d */
    public final Context f726d;

    public C0862d(@NonNull Context context, @NonNull C0868j jVar, @NonNull String str) {
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            this.f723a = trim;
            this.f724b = C0843a.m451l(trim, "_iv");
            this.f726d = context;
            this.f725c = jVar;
            return;
        }
        throw new IllegalArgumentException("RSA and AES Key alias must be valid.");
    }

    @VisibleForTesting
    /* renamed from: a */
    public byte[] mo10693a(byte[] bArr) {
        try {
            Certificate certificate = mo10699g().getCertificate();
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, certificate);
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            Log.e(f722e, "The device can't encrypt input using a RSA Key.", e);
            throw new C0863e(e);
        } catch (BadPaddingException | IllegalBlockSizeException e2) {
            mo10695c();
            throw new C0861c("The RSA decrypted input is invalid.", e2);
        }
    }

    /* renamed from: b */
    public byte[] mo10694b(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(mo10697e(), "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NOPADDING");
            String g = this.f725c.mo10711g(this.f724b);
            if (!TextUtils.isEmpty(g)) {
                instance.init(2, secretKeySpec, new IvParameterSpec(Base64.decode(g, 0)));
                return instance.doFinal(bArr);
            }
            throw new C0861c("The encryption keys changed recently. You need to re-encrypt something first.", (Throwable) null);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            Log.e(f722e, "Error while decrypting the input.", e);
            throw new C0863e(e);
        } catch (BadPaddingException | IllegalBlockSizeException e2) {
            throw new C0861c("The AES encrypted input is corrupted and cannot be recovered. Please discard it.", e2);
        }
    }

    /* renamed from: c */
    public final void mo10695c() {
        this.f725c.mo10709e(this.f723a);
        this.f725c.mo10709e(this.f724b);
    }

    /* renamed from: d */
    public byte[] mo10696d(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(mo10697e(), "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NOPADDING");
            instance.init(1, secretKeySpec);
            byte[] doFinal = instance.doFinal(bArr);
            this.f725c.mo10706b(this.f724b, new String(Base64.encode(instance.getIV(), 0)));
            return doFinal;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            Log.e(f722e, "Error while encrypting the input.", e);
            throw new C0863e(e);
        } catch (BadPaddingException | IllegalBlockSizeException e2) {
            throw new C0861c("The AES decrypted input is invalid.", e2);
        }
    }

    @VisibleForTesting
    /* renamed from: e */
    public byte[] mo10697e() {
        String g = this.f725c.mo10711g(this.f723a);
        if (g != null) {
            byte[] decode = Base64.decode(g, 0);
            try {
                PrivateKey privateKey = mo10699g().getPrivateKey();
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(2, privateKey);
                return instance.doFinal(decode);
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                Log.e(f722e, "The device can't decrypt input using a RSA Key.", e);
                throw new C0863e(e);
            } catch (BadPaddingException | IllegalBlockSizeException e2) {
                mo10695c();
                throw new C0861c("The RSA encrypted input is corrupted and cannot be recovered. Please discard it.", e2);
            }
        } else {
            try {
                KeyGenerator instance2 = KeyGenerator.getInstance("AES");
                instance2.init(256);
                byte[] encoded = instance2.generateKey().getEncoded();
                this.f725c.mo10706b(this.f723a, new String(Base64.encode(mo10693a(encoded), 0)));
                return encoded;
            } catch (NoSuchAlgorithmException e3) {
                Log.e(f722e, "Error while creating the AES key.", e3);
                throw new C0863e(e3);
            }
        }
    }

    /* renamed from: f */
    public final KeyStore.PrivateKeyEntry mo10698f(KeyStore keyStore) {
        PrivateKey privateKey;
        if (Build.VERSION.SDK_INT < 28 || (privateKey = (PrivateKey) keyStore.getKey(this.f723a, (char[]) null)) == null) {
            return (KeyStore.PrivateKeyEntry) keyStore.getEntry(this.f723a, (KeyStore.ProtectionParameter) null);
        }
        return new KeyStore.PrivateKeyEntry(privateKey, new Certificate[]{keyStore.getCertificate(this.f723a)});
    }

    @VisibleForTesting
    /* renamed from: g */
    public KeyStore.PrivateKeyEntry mo10699g() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (instance.containsAlias(this.f723a)) {
                return mo10698f(instance);
            }
            Calendar instance2 = Calendar.getInstance();
            Calendar instance3 = Calendar.getInstance();
            instance3.add(1, 25);
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(this.f723a, 3).setCertificateSubject(new X500Principal("CN=Auth0.Android,O=Auth0")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance2.getTime()).setCertificateNotAfter(instance3.getTime()).setKeySize(2048).setEncryptionPaddings(new String[]{"PKCS1Padding"}).setBlockModes(new String[]{"ECB"}).build();
            KeyPairGenerator instance4 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance4.initialize(build);
            instance4.generateKeyPair();
            return mo10698f(instance);
        } catch (InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
            Log.e(f722e, "The device can't generate a new RSA Key pair.", e);
            throw new C0863e(e);
        } catch (IOException | UnrecoverableEntryException e2) {
            try {
                KeyStore instance5 = KeyStore.getInstance("AndroidKeyStore");
                instance5.load((KeyStore.LoadStoreParameter) null);
                instance5.deleteEntry(this.f723a);
                Log.d(f722e, "Deleting the existing RSA key pair from the KeyStore.");
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e3) {
                Log.e(f722e, "Failed to remove the RSA KeyEntry from the Android KeyStore.", e3);
            }
            mo10695c();
            throw new C0861c("The existing RSA key pair could not be recovered and has been deleted. This occasionally happens when the Lock Screen settings are changed. You can safely retry this operation.", e2);
        }
    }
}
