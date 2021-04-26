package p005b.p096l.p164b.p165a.p173d;

import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.d.o */
public class C3737o extends ByteArrayOutputStream {

    /* renamed from: g */
    public int f6916g;

    /* renamed from: h */
    public final int f6917h;

    /* renamed from: i */
    public boolean f6918i;

    /* renamed from: j */
    public final Level f6919j;

    /* renamed from: k */
    public final Logger f6920k;

    public C3737o(Logger logger, Level level, int i) {
        Objects.requireNonNull(logger);
        this.f6920k = logger;
        Objects.requireNonNull(level);
        this.f6919j = level;
        C1960d.m2849t(i >= 0);
        this.f6917h = i;
    }

    /* renamed from: d */
    public static void m7054d(StringBuilder sb, int i) {
        String str;
        if (i == 1) {
            str = "1 byte";
        } else {
            sb.append(NumberFormat.getInstance().format((long) i));
            str = " bytes";
        }
        sb.append(str);
    }

    public synchronized void close() {
        if (!this.f6918i) {
            if (this.f6916g != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Total: ");
                m7054d(sb, this.f6916g);
                int i = this.count;
                if (i != 0 && i < this.f6916g) {
                    sb.append(" (logging first ");
                    m7054d(sb, this.count);
                    sb.append(")");
                }
                this.f6920k.config(sb.toString());
                if (this.count != 0) {
                    this.f6920k.log(this.f6919j, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.f6918i = true;
        }
    }

    public synchronized void write(int i) {
        C1960d.m2849t(!this.f6918i);
        this.f6916g++;
        if (this.count < this.f6917h) {
            super.write(i);
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        C1960d.m2849t(!this.f6918i);
        this.f6916g += i2;
        int i3 = this.count;
        int i4 = this.f6917h;
        if (i3 < i4) {
            int i5 = i3 + i2;
            if (i5 > i4) {
                i2 += i4 - i5;
            }
            super.write(bArr, i, i2);
        }
    }
}
