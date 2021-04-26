package p005b.p051h.p052a.p055m.p058v;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;

/* renamed from: b.h.a.m.v.r */
public final class C1108r extends Exception {

    /* renamed from: l */
    public static final StackTraceElement[] f1328l = new StackTraceElement[0];

    /* renamed from: g */
    public final List<Throwable> f1329g;

    /* renamed from: h */
    public C0974m f1330h;

    /* renamed from: i */
    public C0962a f1331i;

    /* renamed from: j */
    public Class<?> f1332j;

    /* renamed from: k */
    public String f1333k;

    /* renamed from: b.h.a.m.v.r$a */
    public static final class C1109a implements Appendable {

        /* renamed from: g */
        public final Appendable f1334g;

        /* renamed from: h */
        public boolean f1335h = true;

        public C1109a(Appendable appendable) {
            this.f1334g = appendable;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f1335h) {
                this.f1335h = false;
                this.f1334g.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f1335h = z;
            this.f1334g.append(c);
            return this;
        }

        public Appendable append(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public Appendable append(@Nullable CharSequence charSequence, int i, int i2) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f1335h) {
                this.f1335h = false;
                this.f1334g.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f1335h = z;
            this.f1334g.append(charSequence, i, i2);
            return this;
        }
    }

    public C1108r(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f1333k = str;
        setStackTrace(f1328l);
        this.f1329g = emptyList;
    }

    public C1108r(String str, List<Throwable> list) {
        this.f1333k = str;
        setStackTrace(f1328l);
        this.f1329g = list;
    }

    /* renamed from: b */
    public static void m980b(List<Throwable> list, Appendable appendable) {
        try {
            m981c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m981c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof C1108r) {
                ((C1108r) th).mo11013f(appendable);
            } else {
                m982d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m982d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void mo11011a(Throwable th, List<Throwable> list) {
        if (th instanceof C1108r) {
            for (Throwable a : ((C1108r) th).f1329g) {
                mo11011a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: e */
    public void mo11012e(String str) {
        ArrayList arrayList = new ArrayList();
        mo11011a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder u = C0843a.m460u("Root cause (");
            int i2 = i + 1;
            u.append(i2);
            u.append(" of ");
            u.append(size);
            u.append(")");
            Log.i(str, u.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    /* renamed from: f */
    public final void mo11013f(Appendable appendable) {
        m982d(this, appendable);
        m980b(this.f1329g, new C1109a(appendable));
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f1333k);
        String str4 = "";
        if (this.f1332j != null) {
            StringBuilder u = C0843a.m460u(", ");
            u.append(this.f1332j);
            str = u.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f1331i != null) {
            StringBuilder u2 = C0843a.m460u(", ");
            u2.append(this.f1331i);
            str2 = u2.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f1330h != null) {
            StringBuilder u3 = C0843a.m460u(", ");
            u3.append(this.f1330h);
            str4 = u3.toString();
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        mo11011a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        mo11013f(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        mo11013f(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        mo11013f(printWriter);
    }

    public C1108r(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f1333k = str;
        setStackTrace(f1328l);
        this.f1329g = singletonList;
    }
}
