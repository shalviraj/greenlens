package p005b.p096l.p180d.p191q.p192f.p200k;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* renamed from: b.l.d.q.f.k.d */
public final /* synthetic */ class C4171d implements Comparator {

    /* renamed from: g */
    public static final C4171d f7729g = new C4171d();

    public int compare(Object obj, Object obj2) {
        Charset charset = C4174g.f7732g;
        String name = ((File) obj).getName();
        int i = C4174g.f7733h;
        return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
    }
}
