package p437o.p438a.p439a;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: o.a.a.g */
public interface C8074g {

    /* renamed from: o.a.a.g$a */
    public static class C8075a implements C8074g {

        /* renamed from: a */
        public static final boolean f16231a;

        static {
            boolean z;
            try {
                Class.forName("android.util.Log");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            f16231a = z;
        }

        public C8075a(String str) {
        }

        /* renamed from: a */
        public void mo26018a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(mo26020c(level), "EventBus", str);
            }
        }

        /* renamed from: b */
        public void mo26019b(Level level, String str, Throwable th) {
            if (level != Level.OFF) {
                int c = mo26020c(level);
                StringBuilder y = C0843a.m464y(str, "\n");
                y.append(Log.getStackTraceString(th));
                Log.println(c, "EventBus", y.toString());
            }
        }

        /* renamed from: c */
        public int mo26020c(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            }
            if (intValue < 900) {
                return 4;
            }
            return intValue < 1000 ? 5 : 6;
        }
    }

    /* renamed from: o.a.a.g$b */
    public static class C8076b implements C8074g {
        /* renamed from: a */
        public void mo26018a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        /* renamed from: b */
        public void mo26019b(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    /* renamed from: a */
    void mo26018a(Level level, String str);

    /* renamed from: b */
    void mo26019b(Level level, String str, Throwable th);
}
