package p005b.p273o;

import android.database.Cursor;
import androidx.appcompat.widget.ActivityChooserModel;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import p005b.p273o.C4857i2;
import p005b.p273o.p274w4.p275f.C5019c;
import p005b.p273o.p276x4.C5026a;
import p005b.p273o.p276x4.p277j.C5036b;
import p005b.p273o.p276x4.p277j.C5037c;
import p005b.p273o.p276x4.p277j.C5038d;

/* renamed from: b.o.p1 */
public class C4937p1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4953r1 f9526g;

    public C4937p1(C4953r1 r1Var) {
        this.f9526g = r1Var;
    }

    public void run() {
        ArrayList arrayList;
        boolean z;
        int i;
        C5037c cVar;
        Thread.currentThread().setPriority(10);
        C5026a aVar = this.f9526g.f9559b.mo16786b().f9728b;
        synchronized (aVar) {
            arrayList = new ArrayList();
            Cursor S = ((C4783a3) aVar.f9720b).mo16511S("outcome", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (S.moveToFirst()) {
                do {
                    C5019c d = C5019c.m9220d(S.getString(S.getColumnIndex("notification_influence_type")));
                    C5019c d2 = C5019c.m9220d(S.getString(S.getColumnIndex("iam_influence_type")));
                    String string = S.getString(S.getColumnIndex("notification_ids"));
                    if (string == null) {
                        string = "[]";
                    }
                    String string2 = S.getString(S.getColumnIndex("iam_ids"));
                    if (string2 == null) {
                        string2 = "[]";
                    }
                    String string3 = S.getString(S.getColumnIndex("name"));
                    float f = S.getFloat(S.getColumnIndex(ActivityChooserModel.ATTRIBUTE_WEIGHT));
                    long j = S.getLong(S.getColumnIndex(BasePayload.TIMESTAMP_KEY));
                    try {
                        C5038d dVar = new C5038d();
                        C5038d dVar2 = new C5038d();
                        int ordinal = d.ordinal();
                        if (ordinal == 0) {
                            dVar.f9738a = new JSONArray(string);
                            cVar = new C5037c(dVar, (C5038d) null);
                        } else if (ordinal != 1) {
                            cVar = null;
                        } else {
                            dVar2.f9738a = new JSONArray(string);
                            cVar = new C5037c((C5038d) null, dVar2);
                        }
                        int ordinal2 = d2.ordinal();
                        if (ordinal2 == 0) {
                            dVar.f9739b = new JSONArray(string2);
                            if (cVar == null) {
                                cVar = new C5037c(dVar, (C5038d) null);
                            } else {
                                cVar.f9736a = dVar;
                            }
                        } else if (ordinal2 == 1) {
                            dVar2.f9739b = new JSONArray(string2);
                            if (cVar == null) {
                                cVar = new C5037c((C5038d) null, dVar2);
                            } else {
                                cVar.f9737b = dVar2;
                            }
                        }
                        arrayList.add(new C5036b(string3, cVar, f, j));
                    } catch (JSONException e) {
                        Objects.requireNonNull((C4856i1) aVar.f9719a);
                        C4857i2.m8933a(C4857i2.C4868k.ERROR, "Generating JSONArray from notifications ids outcome:JSON Failed.", e);
                    }
                } while (S.moveToNext());
            }
            S.close();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5036b bVar = (C5036b) it.next();
            C4953r1 r1Var = this.f9526g;
            Objects.requireNonNull(r1Var);
            boolean z2 = false;
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                i = 2;
            } else {
                if (!C4835f2.m8864n()) {
                    if (C4835f2.m8860j()) {
                        if (C4835f2.m8859i() && C4835f2.m8862l()) {
                            z2 = C4835f2.m8865o();
                        }
                    }
                    if (z2 || (!C4835f2.m8864n() && C4835f2.m8869s("com.huawei.hwid"))) {
                        i = 13;
                    }
                }
                i = 1;
            }
            r1Var.f9559b.mo16786b().mo16787a(C4857i2.f9356a, i, bVar, new C4945q1(r1Var, bVar));
        }
    }
}
