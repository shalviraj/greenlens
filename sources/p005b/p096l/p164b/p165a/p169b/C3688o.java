package p005b.p096l.p164b.p165a.p169b;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p173d.C3715b;
import p005b.p096l.p164b.p165a.p173d.C3718d;
import p005b.p096l.p164b.p165a.p173d.C3719e;
import p005b.p096l.p164b.p165a.p173d.C3723g;
import p005b.p096l.p164b.p165a.p173d.C3729j;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3734l;
import p005b.p096l.p164b.p165a.p173d.C3742t;
import p005b.p096l.p164b.p165a.p173d.p174z.C3750a;

/* renamed from: b.l.b.a.b.o */
public class C3688o implements C3742t {

    /* renamed from: a */
    public static final String f6812a;

    static {
        C3676e eVar = new C3676e("application/x-www-form-urlencoded");
        Charset charset = C3718d.f6864a;
        eVar.mo14986e("charset", charset == null ? null : charset.name());
        f6812a = eVar.mo14983a();
    }

    /* renamed from: a */
    public static void m6956a(Reader reader, Object obj, boolean z) {
        int read;
        Object obj2 = obj;
        Class<?> cls = obj.getClass();
        C3719e b = C3719e.m7013b(cls);
        List asList = Arrays.asList(new Type[]{cls});
        C3730k kVar = C3730k.class.isAssignableFrom(cls) ? (C3730k) obj2 : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj2 : null;
        C3715b bVar = new C3715b(obj2);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z2 = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    String stringWriter3 = stringWriter.toString();
                } else {
                    if (read != 61) {
                        if (z2) {
                            stringWriter.write(read);
                        }
                    } else if (z2) {
                        z2 = false;
                    }
                    stringWriter2.write(read);
                }
            }
            String stringWriter32 = stringWriter.toString();
            if (z) {
                stringWriter32 = C3750a.m7057a(stringWriter32);
            }
            if (stringWriter32.length() != 0) {
                String stringWriter4 = stringWriter2.toString();
                if (z) {
                    stringWriter4 = C3750a.m7057a(stringWriter4);
                }
                C3729j a = b.mo15076a(stringWriter32);
                if (a != null) {
                    Type j = C3723g.m7027j(asList, a.mo15100a());
                    if (C3734l.m7046j(j)) {
                        Class<?> f = C3734l.m7042f(asList, C3734l.m7039c(j));
                        bVar.mo15072a(a.f6905b, f, m6958c(f, asList, stringWriter4));
                    } else if (C3734l.m7047k(C3734l.m7042f(asList, j), Iterable.class)) {
                        Collection<Object> collection = (Collection) a.mo15101b(obj2);
                        if (collection == null) {
                            collection = C3723g.m7023f(j);
                            a.mo15102f(obj2, collection);
                        }
                        collection.add(m6958c(j == Object.class ? null : C3734l.m7041e(j), asList, stringWriter4));
                    } else {
                        a.mo15102f(obj2, m6958c(j, asList, stringWriter4));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(stringWriter32);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (kVar != null) {
                            kVar.set(stringWriter32, arrayList);
                        } else {
                            map.put(stringWriter32, arrayList);
                        }
                    }
                    arrayList.add(stringWriter4);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (read != -1);
        bVar.mo15073b();
    }

    /* renamed from: b */
    public static void m6957b(String str, Object obj) {
        try {
            m6956a(new StringReader(str), obj, true);
        } catch (IOException e) {
            C1960d.m2704D0(e);
            throw null;
        }
    }

    /* renamed from: c */
    public static Object m6958c(Type type, List<Type> list, String str) {
        return C3723g.m7026i(C3723g.m7027j(list, type), str);
    }
}
