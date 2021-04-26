package p005b.p096l.p180d.p185o.p189e0;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import p005b.p096l.p097a.p113c.p131e.p136e.C2027a5;
import p005b.p096l.p097a.p113c.p131e.p136e.C2052b5;
import p005b.p096l.p097a.p113c.p131e.p136e.C2124e2;
import p005b.p096l.p097a.p113c.p131e.p136e.C2467s4;
import p005b.p096l.p097a.p113c.p131e.p136e.C2488t1;
import p005b.p096l.p097a.p113c.p131e.p136e.C2560w1;
import p005b.p096l.p097a.p113c.p131e.p136e.C2587x4;

/* renamed from: b.l.d.o.e0.b0 */
public final class C3867b0 {

    /* renamed from: c */
    public static C3867b0 f7115c;

    /* renamed from: a */
    public final String f7116a;
    @Nullable

    /* renamed from: b */
    public final C2052b5 f7117b;

    public C3867b0(Context context, String str, boolean z) {
        C2052b5 b5Var;
        this.f7116a = str;
        try {
            C2467s4.m4119a();
            C2027a5 a5Var = new C2027a5();
            a5Var.mo12371a(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            a5Var.mo12372b(C2587x4.f4432b);
            String format = String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str});
            if (format.startsWith("android-keystore://")) {
                a5Var.f3577b = format;
                b5Var = a5Var.mo12373c();
                this.f7117b = b5Var;
                return;
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        } catch (IOException | GeneralSecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered during crypto setup:\n".concat(valueOf) : new String("Exception encountered during crypto setup:\n"));
            b5Var = null;
        }
    }

    /* renamed from: a */
    public static C3867b0 m7254a(Context context, String str) {
        String str2;
        C3867b0 b0Var = f7115c;
        if (b0Var == null || ((str2 = b0Var.f7116a) != str && (str2 == null || !str2.equals(str)))) {
            f7115c = new C3867b0(context, str, true);
        }
        return f7115c;
    }

    @Nullable
    /* renamed from: b */
    public final String mo15370b() {
        C2124e2 b;
        if (this.f7117b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2488t1 t1Var = new C2488t1(byteArrayOutputStream);
        try {
            synchronized (this.f7117b) {
                C2052b5 b5Var = this.f7117b;
                synchronized (b5Var) {
                    b = b5Var.f3625b.mo12633b();
                }
                b.mo12580d().mo12579c(t1Var);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered when attempting to get Public Key:\n".concat(valueOf) : new String("Exception encountered when attempting to get Public Key:\n"));
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo15371c(String str) {
        C2124e2 b;
        String str2;
        C2052b5 b5Var = this.f7117b;
        if (b5Var != null) {
            try {
                synchronized (b5Var) {
                    C2052b5 b5Var2 = this.f7117b;
                    synchronized (b5Var2) {
                        b = b5Var2.f3625b.mo12633b();
                    }
                    str2 = new String(((C2560w1) b.mo12581e(C2560w1.class)).mo13007a(Base64.decode(str, 8), (byte[]) null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered while decrypting bytes:\n".concat(valueOf) : new String("Exception encountered while decrypting bytes:\n"));
                return null;
            }
        } else {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
    }
}
