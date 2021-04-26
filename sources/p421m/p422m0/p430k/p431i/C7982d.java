package p421m.p422m0.p430k.p431i;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: m.m0.k.i.d */
public final class C7982d extends Handler {

    /* renamed from: a */
    public static final C7982d f16021a = new C7982d();

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        int min;
        C6888i.m12438e(logRecord, "record");
        C7981c cVar = C7981c.f16020c;
        String loggerName = logRecord.getLoggerName();
        C6888i.m12437d(loggerName, "record.loggerName");
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        C6888i.m12437d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        C6888i.m12438e(loggerName, "loggerName");
        C6888i.m12438e(message, "message");
        String str = C7981c.f16019b.get(loggerName);
        if (str == null) {
            int i2 = 23;
            C6888i.m12438e(loggerName, "$this$take");
            int length = loggerName.length();
            if (23 > length) {
                i2 = length;
            }
            str = loggerName.substring(0, i2);
            C6888i.m12437d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder y = C0843a.m464y(message, "\n");
                y.append(Log.getStackTraceString(thrown));
                message = y.toString();
            }
            int length2 = message.length();
            int i3 = 0;
            while (i3 < length2) {
                int k = C7694h.m13933k(message, 10, i3, false, 4);
                if (k == -1) {
                    k = length2;
                }
                while (true) {
                    min = Math.min(k, i3 + 4000);
                    String substring = message.substring(i3, min);
                    C6888i.m12437d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= k) {
                        break;
                    }
                    i3 = min;
                }
                i3 = min + 1;
            }
        }
    }
}
