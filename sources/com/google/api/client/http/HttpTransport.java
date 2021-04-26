package com.google.api.client.http;

import java.util.Arrays;
import java.util.logging.Logger;
import p005b.p096l.p164b.p165a.p169b.C3683k;

public abstract class HttpTransport {

    /* renamed from: a */
    public static final Logger f11410a = Logger.getLogger(HttpTransport.class.getName());

    /* renamed from: b */
    public static final String[] f11411b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        f11411b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public abstract C3683k mo15022a(String str, String str2);
}
