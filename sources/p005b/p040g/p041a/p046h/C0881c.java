package p005b.p040g.p041a.p046h;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Collections;

/* renamed from: b.g.a.h.c */
public class C0881c extends C0902r {

    /* renamed from: b */
    public Signature f749b;

    public C0881c(@Nullable PublicKey publicKey) {
        super(Collections.singletonList("RS256"));
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            this.f749b = instance;
            instance.initVerify(publicKey);
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    /* renamed from: a */
    public void mo10729a(@NonNull String[] strArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        sb.append(strArr[0]);
        sb.append(".");
        sb.append(strArr[1]);
        byte[] bytes = sb.toString().getBytes(Charset.defaultCharset());
        try {
            byte[] decode = Base64.decode(strArr[2], 10);
            this.f749b.update(bytes);
            z = this.f749b.verify(decode);
        } catch (Exception unused) {
        }
        if (!z) {
            throw new C0904t("Invalid ID token signature.");
        }
    }
}
