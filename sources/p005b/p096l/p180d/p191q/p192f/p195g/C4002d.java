package p005b.p096l.p180d.p191q.p192f.p195g;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b.l.d.q.f.g.d */
public class C4002d {

    /* renamed from: a */
    public static final AtomicLong f7316a = new AtomicLong(0);

    /* renamed from: b */
    public static String f7317b;

    public C4002d(C4012g0 g0Var) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a = m7392a(time % 1000);
        byte[] a2 = m7392a(f7316a.incrementAndGet());
        byte[] a3 = m7392a((long) Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a[0], a[1], a2[0], a2[1], a3[0], a3[1]};
        String m = C4004e.m7405m(g0Var.mo15522b());
        String j = C4004e.m7402j(bArr);
        Locale locale = Locale.US;
        f7317b = String.format(locale, "%s%s%s%s", new Object[]{j.substring(0, 12), j.substring(12, 16), j.subSequence(16, 20), m.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m7392a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return f7317b;
    }
}
