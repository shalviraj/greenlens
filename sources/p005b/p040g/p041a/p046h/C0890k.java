package p005b.p040g.p041a.p046h;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import p005b.p040g.p041a.p045g.C0874e;

/* renamed from: b.g.a.h.k */
public class C0890k {

    /* renamed from: a */
    public static final Integer f773a = 60;

    /* renamed from: a */
    public void mo10740a(@NonNull C0874e eVar, @NonNull C0889j jVar) {
        C0902r rVar = jVar.f768c;
        Objects.requireNonNull(rVar);
        String str = eVar.f740h.get("alg");
        String[] split = eVar.f739g.split("\\.");
        if (rVar.f809a.contains(str)) {
            rVar.mo10729a(split);
            if (TextUtils.isEmpty(eVar.f741i.f742a)) {
                throw new C0904t("Issuer (iss) claim must be a string present in the ID token");
            } else if (!eVar.f741i.f742a.equals(jVar.f766a)) {
                throw new C0904t(String.format("Issuer (iss) claim mismatch in the ID token, expected \"%s\", found \"%s\"", new Object[]{jVar.f766a, eVar.f741i.f742a}));
            } else if (!TextUtils.isEmpty(eVar.f741i.f743b)) {
                List<String> list = eVar.f741i.f746e;
                if (list == null || list.isEmpty()) {
                    throw new C0904t("Audience (aud) claim must be a string or array of strings present in the ID token");
                } else if (list.contains(jVar.f767b)) {
                    Calendar instance = Calendar.getInstance();
                    Date date = jVar.f772g;
                    if (date == null) {
                        date = instance.getTime();
                    }
                    Integer num = jVar.f771f;
                    if (num == null) {
                        num = f773a;
                    }
                    int intValue = num.intValue();
                    Date date2 = eVar.f741i.f744c;
                    if (date2 != null) {
                        instance.setTime(date2);
                        instance.add(13, intValue);
                        Date time = instance.getTime();
                        if (date.after(time)) {
                            throw new C0904t(String.format("Expiration Time (exp) claim error in the ID token; current time (%d) is after expiration time (%d)", new Object[]{Long.valueOf(date.getTime() / 1000), Long.valueOf(time.getTime() / 1000)}));
                        } else if (eVar.f741i.f745d != null) {
                            if (jVar.f769d != null) {
                                String b = eVar.mo10717b("nonce").mo10715b();
                                if (TextUtils.isEmpty(b)) {
                                    throw new C0904t("Nonce (nonce) claim must be a string present in the ID token");
                                } else if (!jVar.f769d.equals(b)) {
                                    throw new C0904t(String.format("Nonce (nonce) claim mismatch in the ID token; expected \"%s\", found \"%s\"", new Object[]{jVar.f769d, b}));
                                }
                            }
                            if (list.size() > 1) {
                                String b2 = eVar.mo10717b("azp").mo10715b();
                                if (TextUtils.isEmpty(b2)) {
                                    throw new C0904t("Authorized Party (azp) claim must be a string present in the ID token when Audience (aud) claim has multiple values");
                                } else if (!jVar.f767b.equals(b2)) {
                                    throw new C0904t(String.format("Authorized Party (azp) claim mismatch in the ID token; expected \"%s\", found \"%s\"", new Object[]{jVar.f767b, b2}));
                                }
                            }
                            if (jVar.f770e != null) {
                                Date a = eVar.mo10717b("auth_time").mo10714a();
                                if (a != null) {
                                    instance.setTime(a);
                                    instance.add(13, jVar.f770e.intValue());
                                    instance.add(13, intValue);
                                    Date time2 = instance.getTime();
                                    if (date.after(time2)) {
                                        throw new C0904t(String.format("Authentication Time (auth_time) claim in the ID token indicates that too much time has passed since the last end-user authentication. Current time (%d) is after last auth at (%d)", new Object[]{Long.valueOf(date.getTime() / 1000), Long.valueOf(time2.getTime() / 1000)}));
                                    }
                                    return;
                                }
                                throw new C0904t("Authentication Time (auth_time) claim must be a number present in the ID token when Max Age (max_age) is specified");
                            }
                        } else {
                            throw new C0904t("Issued At (iat) claim must be a number present in the ID token");
                        }
                    } else {
                        throw new C0904t("Expiration Time (exp) claim must be a number present in the ID token");
                    }
                } else {
                    throw new C0904t(String.format("Audience (aud) claim mismatch in the ID token; expected \"%s\" but was not one of \"%s\"", new Object[]{jVar.f767b, eVar.f741i.f746e}));
                }
            } else {
                throw new C0904t("Subject (sub) claim must be a string present in the ID token");
            }
        } else {
            throw new C0904t(String.format("Signature algorithm of \"%s\" is not supported. Expected the ID token to be signed with any of %s.", new Object[]{str, rVar.f809a}));
        }
    }
}
