package p005b.p051h.p052a.p071n;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.n.a */
public class C1302a implements C1311h {

    /* renamed from: a */
    public final Set<C1312i> f1645a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f1646b;

    /* renamed from: c */
    public boolean f1647c;

    /* renamed from: a */
    public void mo11141a(@NonNull C1312i iVar) {
        this.f1645a.add(iVar);
        if (this.f1647c) {
            iVar.mo10774j();
        } else if (this.f1646b) {
            iVar.onStart();
        } else {
            iVar.mo10773d();
        }
    }

    /* renamed from: b */
    public void mo11142b(@NonNull C1312i iVar) {
        this.f1645a.remove(iVar);
    }

    /* renamed from: c */
    public void mo11143c() {
        this.f1647c = true;
        Iterator it = ((ArrayList) C1380j.m1472e(this.f1645a)).iterator();
        while (it.hasNext()) {
            ((C1312i) it.next()).mo10774j();
        }
    }

    /* renamed from: d */
    public void mo11144d() {
        this.f1646b = true;
        Iterator it = ((ArrayList) C1380j.m1472e(this.f1645a)).iterator();
        while (it.hasNext()) {
            ((C1312i) it.next()).onStart();
        }
    }

    /* renamed from: e */
    public void mo11145e() {
        this.f1646b = false;
        Iterator it = ((ArrayList) C1380j.m1472e(this.f1645a)).iterator();
        while (it.hasNext()) {
            ((C1312i) it.next()).mo10773d();
        }
    }
}
