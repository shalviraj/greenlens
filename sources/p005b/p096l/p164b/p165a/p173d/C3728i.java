package p005b.p096l.p164b.p165a.p173d;

import com.segment.analytics.internal.Iso8601Utils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: b.l.b.a.d.i */
public final class C3728i implements Serializable {

    /* renamed from: j */
    public static final TimeZone f6898j = TimeZone.getTimeZone(Iso8601Utils.GMT_ID);

    /* renamed from: k */
    public static final Pattern f6899k = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");

    /* renamed from: g */
    public final long f6900g;

    /* renamed from: h */
    public final boolean f6901h;

    /* renamed from: i */
    public final int f6902i;

    public C3728i(boolean z, long j, Integer num) {
        this.f6901h = z;
        this.f6900g = j;
        this.f6902i = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
    }

    /* renamed from: a */
    public static void m7029a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    /* renamed from: b */
    public String mo15096b() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f6898j);
        gregorianCalendar.setTimeInMillis((((long) this.f6902i) * 60000) + this.f6900g);
        m7029a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m7029a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m7029a(sb, gregorianCalendar.get(5), 2);
        if (!this.f6901h) {
            sb.append('T');
            m7029a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            m7029a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            m7029a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                m7029a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.f6902i;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                m7029a(sb, i / 60, 2);
                sb.append(':');
                m7029a(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3728i)) {
            return false;
        }
        C3728i iVar = (C3728i) obj;
        return this.f6901h == iVar.f6901h && this.f6900g == iVar.f6900g && this.f6902i == iVar.f6902i;
    }

    public int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.f6900g;
        jArr[1] = this.f6901h ? 1 : 0;
        jArr[2] = (long) this.f6902i;
        return Arrays.hashCode(jArr);
    }

    public String toString() {
        return mo15096b();
    }
}
