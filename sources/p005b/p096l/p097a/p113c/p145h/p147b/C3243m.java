package p005b.p096l.p097a.p113c.p145h.p147b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.m */
public final class C3243m extends C3227k5 {

    /* renamed from: c */
    public long f5716c;

    /* renamed from: d */
    public String f5717d;

    /* renamed from: e */
    public AccountManager f5718e;

    /* renamed from: f */
    public Boolean f5719f;

    /* renamed from: g */
    public long f5720g;

    public C3243m(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: i */
    public final boolean mo14141i() {
        Calendar instance = Calendar.getInstance();
        this.f5716c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f5717d = C0843a.m456q(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    /* renamed from: o */
    public final long mo14410o() {
        mo14377l();
        return this.f5716c;
    }

    /* renamed from: p */
    public final String mo14411p() {
        mo14377l();
        return this.f5717d;
    }

    @WorkerThread
    /* renamed from: q */
    public final long mo14412q() {
        mo14126h();
        return this.f5720g;
    }

    @WorkerThread
    /* renamed from: r */
    public final boolean mo14413r() {
        mo14126h();
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f5720g > 86400000) {
            this.f5719f = null;
        }
        Boolean bool = this.f5719f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.f5638a.f5842a, "android.permission.GET_ACCOUNTS") != 0) {
            this.f5638a.mo14329d().f5803j.mo14414a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f5718e == null) {
                this.f5718e = AccountManager.get(this.f5638a.f5842a);
            }
            try {
                Account[] result = this.f5718e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f5718e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f5719f = Boolean.TRUE;
                        this.f5720g = currentTimeMillis;
                        return true;
                    }
                } else {
                    this.f5719f = Boolean.TRUE;
                    this.f5720g = currentTimeMillis;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.f5638a.mo14329d().f5800g.mo14415b("Exception checking account types", e);
            }
        }
        this.f5720g = currentTimeMillis;
        this.f5719f = Boolean.FALSE;
        return false;
    }
}
