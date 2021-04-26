package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.p056u.C0987d;
import p005b.p051h.p052a.p055m.p058v.C1073g;
import p005b.p051h.p052a.p055m.p062w.C1161n;

/* renamed from: b.h.a.m.v.d */
public class C1043d implements C1073g, C0987d.C0988a<Object> {

    /* renamed from: g */
    public final List<C0974m> f1126g;

    /* renamed from: h */
    public final C1075h<?> f1127h;

    /* renamed from: i */
    public final C1073g.C1074a f1128i;

    /* renamed from: j */
    public int f1129j = -1;

    /* renamed from: k */
    public C0974m f1130k;

    /* renamed from: l */
    public List<C1161n<File, ?>> f1131l;

    /* renamed from: m */
    public int f1132m;

    /* renamed from: n */
    public volatile C1161n.C1162a<?> f1133n;

    /* renamed from: o */
    public File f1134o;

    public C1043d(C1075h<?> hVar, C1073g.C1074a aVar) {
        List<C0974m> a = hVar.mo10954a();
        this.f1126g = a;
        this.f1127h = hVar;
        this.f1128i = aVar;
    }

    public C1043d(List<C0974m> list, C1075h<?> hVar, C1073g.C1074a aVar) {
        this.f1126g = list;
        this.f1127h = hVar;
        this.f1128i = aVar;
    }

    /* renamed from: a */
    public boolean mo10875a() {
        while (true) {
            List<C1161n<File, ?>> list = this.f1131l;
            if (list != null) {
                if (this.f1132m < list.size()) {
                    this.f1133n = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f1132m < this.f1131l.size())) {
                            break;
                        }
                        List<C1161n<File, ?>> list2 = this.f1131l;
                        int i = this.f1132m;
                        this.f1132m = i + 1;
                        File file = this.f1134o;
                        C1075h<?> hVar = this.f1127h;
                        this.f1133n = list2.get(i).mo11030a(file, hVar.f1182e, hVar.f1183f, hVar.f1186i);
                        if (this.f1133n != null && this.f1127h.mo10960g(this.f1133n.f1411c.mo10839a())) {
                            this.f1133n.f1411c.mo10847f(this.f1127h.f1192o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f1129j + 1;
            this.f1129j = i2;
            if (i2 >= this.f1126g.size()) {
                return false;
            }
            C0974m mVar = this.f1126g.get(this.f1129j);
            C1075h<?> hVar2 = this.f1127h;
            File b = hVar2.mo10955b().mo10927b(new C1066e(mVar, hVar2.f1191n));
            this.f1134o = b;
            if (b != null) {
                this.f1130k = mVar;
                this.f1131l = this.f1127h.f1180c.f864b.mo10766f(b);
                this.f1132m = 0;
            }
        }
    }

    /* renamed from: c */
    public void mo10853c(@NonNull Exception exc) {
        this.f1128i.mo10878e(this.f1130k, exc, this.f1133n.f1411c, C0962a.DATA_DISK_CACHE);
    }

    public void cancel() {
        C1161n.C1162a<?> aVar = this.f1133n;
        if (aVar != null) {
            aVar.f1411c.cancel();
        }
    }

    /* renamed from: d */
    public void mo10854d(Object obj) {
        this.f1128i.mo10879i(this.f1130k, obj, this.f1133n.f1411c, C0962a.DATA_DISK_CACHE, this.f1130k);
    }
}
