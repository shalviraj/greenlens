package p005b.p006a.p007a.p024o;

import java.util.Arrays;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: b.a.a.o.a */
public final class C0818a extends C6890k implements C6862l<Byte, CharSequence> {

    /* renamed from: g */
    public static final C0818a f642g = new C0818a();

    public C0818a() {
        super(1);
    }

    public Object invoke(Object obj) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        C6888i.m12437d(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
