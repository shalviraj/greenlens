package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1925l;
import p005b.p096l.p097a.p113c.p119b.p122m.C1940q;

/* renamed from: b.l.a.c.e.e.xi */
public final class C2601xi {

    /* renamed from: a */
    public final int f4451a;

    public C2601xi(String str) {
        int i = -1;
        try {
            List<String> b = C2440r1.m4062a("[.-]").mo12961b(str);
            if (b.size() == 1) {
                i = Integer.parseInt(str);
            } else if (b.size() >= 3) {
                i = (Integer.parseInt(b.get(1)) * 1000) + (Integer.parseInt(b.get(0)) * 1000000) + Integer.parseInt(b.get(2));
            }
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e}));
            }
        }
        this.f4451a = i;
    }

    /* renamed from: b */
    public static String m4403b() {
        String str;
        C1940q qVar = C1940q.f3482c;
        Objects.requireNonNull(qVar);
        C0823f.m374i("firebase-auth", "Please provide a valid libraryName");
        if (qVar.f3483a.containsKey("firebase-auth")) {
            str = qVar.f3483a.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            String str2 = null;
            try {
                InputStream resourceAsStream = C1940q.class.getResourceAsStream(String.format("/%s.properties", new Object[]{"firebase-auth"}));
                if (resourceAsStream != null) {
                    properties.load(resourceAsStream);
                    str2 = properties.getProperty("version", (String) null);
                    C1925l lVar = C1940q.f3481b;
                    StringBuilder sb = new StringBuilder("firebase-auth".length() + 12 + String.valueOf(str2).length());
                    sb.append("firebase-auth");
                    sb.append(" version is ");
                    sb.append(str2);
                    String sb2 = sb.toString();
                    if (lVar.mo12261a(2)) {
                        String str3 = lVar.f3473b;
                        if (str3 != null) {
                            sb2 = str3.concat(sb2);
                        }
                        Log.v("LibraryVersion", sb2);
                    }
                } else {
                    C1925l lVar2 = C1940q.f3481b;
                    String concat = "firebase-auth".length() != 0 ? "Failed to get app version for libraryName: ".concat("firebase-auth") : new String("Failed to get app version for libraryName: ");
                    if (lVar2.mo12261a(5)) {
                        String str4 = lVar2.f3473b;
                        if (str4 != null) {
                            concat = str4.concat(concat);
                        }
                        Log.w("LibraryVersion", concat);
                    }
                }
            } catch (IOException e) {
                C1925l lVar3 = C1940q.f3481b;
                String concat2 = "firebase-auth".length() != 0 ? "Failed to get app version for libraryName: ".concat("firebase-auth") : new String("Failed to get app version for libraryName: ");
                if (lVar3.mo12261a(6)) {
                    String str5 = lVar3.f3473b;
                    if (str5 != null) {
                        concat2 = str5.concat(concat2);
                    }
                    Log.e("LibraryVersion", concat2, e);
                }
            }
            if (str2 == null) {
                C1925l lVar4 = C1940q.f3481b;
                String str6 = ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used";
                if (lVar4.mo12261a(3)) {
                    String str7 = lVar4.f3473b;
                    if (str7 != null) {
                        str6 = str7.concat(str6);
                    }
                    Log.d("LibraryVersion", str6);
                }
                str2 = "UNKNOWN";
            }
            qVar.f3483a.put("firebase-auth", str2);
            str = str2;
        }
        return (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) ? "-1" : str;
    }

    /* renamed from: a */
    public final String mo13113a() {
        return String.format("X%s", new Object[]{Integer.toString(this.f4451a)});
    }
}
