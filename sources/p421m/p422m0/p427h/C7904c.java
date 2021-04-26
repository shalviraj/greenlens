package p421m.p422m0.p427h;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p421m.p422m0.C7867c;

/* renamed from: m.m0.h.c */
public final class C7904c {

    /* renamed from: a */
    public static final C7905a f15754a = new C7905a();

    /* renamed from: b */
    public static final String[] f15755b;

    /* renamed from: c */
    public static final DateFormat[] f15756c;

    /* renamed from: m.m0.h.c$a */
    public static final class C7905a extends ThreadLocal<DateFormat> {
        public Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C7867c.f15623e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f15755b = strArr;
        f15756c = new DateFormat[strArr.length];
    }
}
