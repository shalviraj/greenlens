package p005b.p096l.p180d.p213v;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p096l.p097a.p113c.p131e.p137f.C2654a;
import p005b.p096l.p180d.p213v.C4260o0;

/* renamed from: b.l.d.v.v */
public final class C4274v extends C2654a {

    /* renamed from: a */
    public final /* synthetic */ C4276w f7914a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4274v(C4276w wVar, Looper looper) {
        super(looper);
        this.f7914a = wVar;
    }

    public final void handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Bundle bundle;
        String str8;
        C4276w wVar = this.f7914a;
        Objects.requireNonNull(wVar);
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C4260o0.C4261a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C4260o0) {
                        wVar.f7922f = (C4260o0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        wVar.f7921e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    str6 = intent2.getStringExtra("registration_id");
                    if (str6 == null) {
                        str6 = intent2.getStringExtra("unregistered");
                    }
                    if (str6 == null) {
                        String stringExtra = intent2.getStringExtra("error");
                        if (stringExtra == null) {
                            str2 = "FirebaseInstanceId";
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            str = sb.toString();
                        } else {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Received InstanceID error ".concat(stringExtra) : new String("Received InstanceID error "));
                            }
                            if (stringExtra.startsWith("|")) {
                                String[] split = stringExtra.split("\\|");
                                if (split.length <= 2 || !"ID".equals(split[1])) {
                                    str2 = "FirebaseInstanceId";
                                    str = stringExtra.length() != 0 ? "Unexpected structured response ".concat(stringExtra) : new String("Unexpected structured response ");
                                } else {
                                    str8 = split[2];
                                    String str9 = split[3];
                                    if (str9.startsWith(":")) {
                                        str9 = str9.substring(1);
                                    }
                                    bundle = intent2.putExtra("error", str9).getExtras();
                                }
                            } else {
                                synchronized (wVar.f7917a) {
                                    for (int i = 0; i < wVar.f7917a.size(); i++) {
                                        wVar.mo15870a(wVar.f7917a.keyAt(i), intent2.getExtras());
                                    }
                                }
                                return;
                            }
                        }
                        Log.w(str2, str);
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(str6);
                    if (matcher.matches()) {
                        str8 = matcher.group(1);
                        String group = matcher.group(2);
                        bundle = intent2.getExtras();
                        bundle.putString("registration_id", group);
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        str3 = "FirebaseInstanceId";
                        str7 = "Unexpected response string: ";
                        if (str6.length() == 0) {
                            str5 = new String(str7);
                            str4 = str5;
                            Log.d(str3, str4);
                            return;
                        }
                    } else {
                        return;
                    }
                    wVar.mo15870a(str8, bundle);
                    return;
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    str3 = "FirebaseInstanceId";
                    str7 = "Unexpected response action: ";
                    str6 = String.valueOf(action);
                    if (str6.length() == 0) {
                        str5 = new String(str7);
                        str4 = str5;
                        Log.d(str3, str4);
                        return;
                    }
                } else {
                    return;
                }
                str4 = str7.concat(str6);
                Log.d(str3, str4);
                return;
            }
        }
        str2 = "FirebaseInstanceId";
        str = "Dropping invalid message";
        Log.w(str2, str);
    }
}
