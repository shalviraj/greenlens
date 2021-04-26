package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6564r;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6565s;
import p298d.p334t.C6790h;
import p298d.p334t.C6793k;
import p298d.p334t.C6801s;
import p298d.p334t.C6802t;
import p298d.p334t.C6803u;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.k0.r */
public final class C6494r {

    /* renamed from: a */
    public final Map<String, C6482k> f12728a = new LinkedHashMap();

    /* renamed from: d.a.a.a.y0.d.a.k0.r$a */
    public final class C6495a {

        /* renamed from: a */
        public final String f12729a;

        /* renamed from: b */
        public final /* synthetic */ C6494r f12730b;

        /* renamed from: d.a.a.a.y0.d.a.k0.r$a$a */
        public final class C6496a {

            /* renamed from: a */
            public final String f12731a;

            /* renamed from: b */
            public final List<C6768j<String, C6499u>> f12732b = new ArrayList();

            /* renamed from: c */
            public C6768j<String, C6499u> f12733c = new C6768j<>(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);

            /* renamed from: d */
            public final /* synthetic */ C6495a f12734d;

            public C6496a(C6495a aVar, String str) {
                C6888i.m12438e(aVar, "this$0");
                C6888i.m12438e(str, "functionName");
                this.f12734d = aVar;
                this.f12731a = str;
            }

            /* renamed from: a */
            public final void mo23586a(String str, C6448e... eVarArr) {
                C6499u uVar;
                C6888i.m12438e(str, "type");
                C6888i.m12438e(eVarArr, "qualifiers");
                List<C6768j<String, C6499u>> list = this.f12732b;
                if (eVarArr.length == 0) {
                    uVar = null;
                } else {
                    C6888i.m12438e(eVarArr, "$this$withIndex");
                    C6802t tVar = new C6802t(new C6793k(eVarArr));
                    int g3 = C5266a.m9957g3(C5266a.m9892V(tVar, 10));
                    if (g3 < 16) {
                        g3 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(g3);
                    Iterator it = tVar.iterator();
                    while (true) {
                        C6803u uVar2 = (C6803u) it;
                        if (!uVar2.hasNext()) {
                            break;
                        }
                        C6801s sVar = (C6801s) uVar2.next();
                        linkedHashMap.put(Integer.valueOf(sVar.f13716a), (C6448e) sVar.f13717b);
                    }
                    uVar = new C6499u(linkedHashMap);
                }
                list.add(new C6768j(str, uVar));
            }

            /* renamed from: b */
            public final void mo23587b(String str, C6448e... eVarArr) {
                C6888i.m12438e(str, "type");
                C6888i.m12438e(eVarArr, "qualifiers");
                C6888i.m12438e(eVarArr, "$this$withIndex");
                C6802t tVar = new C6802t(new C6793k(eVarArr));
                int g3 = C5266a.m9957g3(C5266a.m9892V(tVar, 10));
                if (g3 < 16) {
                    g3 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(g3);
                Iterator it = tVar.iterator();
                while (true) {
                    C6803u uVar = (C6803u) it;
                    if (uVar.hasNext()) {
                        C6801s sVar = (C6801s) uVar.next();
                        linkedHashMap.put(Integer.valueOf(sVar.f13716a), (C6448e) sVar.f13717b);
                    } else {
                        this.f12733c = new C6768j<>(str, new C6499u(linkedHashMap));
                        return;
                    }
                }
            }

            /* renamed from: c */
            public final void mo23588c(JvmPrimitiveType jvmPrimitiveType) {
                C6888i.m12438e(jvmPrimitiveType, "type");
                String desc = jvmPrimitiveType.getDesc();
                C6888i.m12437d(desc, "type.desc");
                this.f12733c = new C6768j<>(desc, null);
            }
        }

        public C6495a(C6494r rVar, String str) {
            C6888i.m12438e(rVar, "this$0");
            C6888i.m12438e(str, "className");
            this.f12730b = rVar;
            this.f12729a = str;
        }

        /* renamed from: a */
        public final void mo23585a(String str, C6862l<? super C6496a, C6777r> lVar) {
            String str2 = str;
            C6862l<? super C6496a, C6777r> lVar2 = lVar;
            C6888i.m12438e(str2, "name");
            C6888i.m12438e(lVar2, "block");
            Map<String, C6482k> map = this.f12730b.f12728a;
            C6496a aVar = new C6496a(this, str2);
            lVar2.invoke(aVar);
            C6565s sVar = C6565s.f12856a;
            String str3 = aVar.f12734d.f12729a;
            String str4 = aVar.f12731a;
            List<C6768j<String, C6499u>> list = aVar.f12732b;
            ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
            for (C6768j jVar : list) {
                arrayList.add((String) jVar.f13681g);
            }
            String str5 = (String) aVar.f12733c.f13681g;
            C6888i.m12438e(str4, "name");
            C6888i.m12438e(arrayList, "parameters");
            C6888i.m12438e(str5, "ret");
            String i = sVar.mo23671i(str3, str4 + '(' + C6790h.m12369w(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C6564r(sVar), 30) + ')' + sVar.mo23664b(str5));
            C6499u uVar = (C6499u) aVar.f12733c.f13682h;
            List<C6768j<String, C6499u>> list2 = aVar.f12732b;
            ArrayList arrayList2 = new ArrayList(C5266a.m9892V(list2, 10));
            for (C6768j jVar2 : list2) {
                arrayList2.add((C6499u) jVar2.f13682h);
            }
            map.put(i, new C6482k(uVar, arrayList2));
        }
    }
}
