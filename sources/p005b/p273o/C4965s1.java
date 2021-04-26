package p005b.p273o;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import p005b.p273o.p274w4.p275f.C5018b;
import p005b.p273o.p276x4.C5026a;
import p005b.p273o.p276x4.C5029d;
import p005b.p273o.p276x4.p277j.C5035a;
import p005b.p273o.p276x4.p277j.C5036b;
import p005b.p273o.p276x4.p277j.C5037c;
import p005b.p273o.p276x4.p277j.C5038d;

/* renamed from: b.o.s1 */
public class C4965s1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C5036b f9588g;

    /* renamed from: h */
    public final /* synthetic */ C4953r1 f9589h;

    public C4965s1(C4953r1 r1Var, C5036b bVar) {
        this.f9589h = r1Var;
        this.f9588g = bVar;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        C5029d b = this.f9589h.f9559b.mo16786b();
        C5036b bVar = this.f9588g;
        C5026a aVar = b.f9728b;
        C5018b bVar2 = C5018b.NOTIFICATION;
        C5018b bVar3 = C5018b.IAM;
        synchronized (aVar) {
            C4882j1 j1Var = aVar.f9719a;
            ((C4856i1) j1Var).mo16609a("OneSignal saveUniqueOutcomeEventParams: " + bVar.toString());
            if (bVar.f9733b != null) {
                String str = bVar.f9732a;
                ArrayList arrayList = new ArrayList();
                C5037c cVar = bVar.f9733b;
                C5038d dVar = cVar.f9736a;
                C5038d dVar2 = cVar.f9737b;
                if (dVar != null) {
                    JSONArray jSONArray = dVar.f9739b;
                    JSONArray jSONArray2 = dVar.f9738a;
                    aVar.mo16782a(arrayList, jSONArray, bVar3);
                    aVar.mo16782a(arrayList, jSONArray2, bVar2);
                }
                if (dVar2 != null) {
                    JSONArray jSONArray3 = dVar2.f9739b;
                    JSONArray jSONArray4 = dVar2.f9738a;
                    aVar.mo16782a(arrayList, jSONArray3, bVar3);
                    aVar.mo16782a(arrayList, jSONArray4, bVar2);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C5035a aVar2 = (C5035a) it.next();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("channel_influence_id", aVar2.f9730a);
                    contentValues.put("channel_type", String.valueOf(aVar2.f9731b));
                    contentValues.put("name", str);
                    ((C4783a3) aVar.f9720b).mo16508H("cached_unique_outcome", (String) null, contentValues);
                }
            }
        }
    }
}
