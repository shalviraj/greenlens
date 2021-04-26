package p416l.p417a;

import java.util.concurrent.CancellationException;
import p298d.p344x.p346c.C6888i;

/* renamed from: l.a.y0 */
public final class C7822y0 extends CancellationException {

    /* renamed from: g */
    public final C7819x0 f15429g;

    public C7822y0(String str, Throwable th, C7819x0 x0Var) {
        super(str);
        this.f15429g = x0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C7822y0) {
                C7822y0 y0Var = (C7822y0) obj;
                if (!C6888i.m12434a(y0Var.getMessage(), getMessage()) || !C6888i.m12434a(y0Var.f15429g, this.f15429g) || !C6888i.m12434a(y0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C6888i.m12436c(message);
        int hashCode = (this.f15429g.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f15429g;
    }
}
