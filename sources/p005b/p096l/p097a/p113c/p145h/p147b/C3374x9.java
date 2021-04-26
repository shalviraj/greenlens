package p005b.p096l.p097a.p113c.p145h.p147b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.x9 */
public final class C3374x9 {

    /* renamed from: a */
    public final C3281p4 f6107a;

    public C3374x9(C3281p4 p4Var) {
        this.f6107a = p4Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14630a(String str, Bundle bundle) {
        String str2;
        this.f6107a.mo14331f().mo14126h();
        if (!this.f6107a.mo14460j()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f6107a.mo14464q().f5441u.mo14128b(str2);
                C3379y3 y3Var = this.f6107a.mo14464q().f5442v;
                Objects.requireNonNull((C1959c) this.f6107a.f5855n);
                y3Var.mo14634b(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo14631b() {
        if (!mo14632c()) {
            return false;
        }
        Objects.requireNonNull((C1959c) this.f6107a.f5855n);
        if (System.currentTimeMillis() - this.f6107a.mo14464q().f5442v.mo14633a() > this.f6107a.f5848g.mo14194o((String) null, C3134c3.f5361R)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo14632c() {
        return this.f6107a.mo14464q().f5442v.mo14633a() > 0;
    }
}
