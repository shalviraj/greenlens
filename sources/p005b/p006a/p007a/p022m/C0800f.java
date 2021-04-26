package p005b.p006a.p007a.p022m;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.segment.analytics.integrations.BasePayload;
import java.util.List;
import p005b.p006a.p007a.p016g.C0689a;
import p005b.p006a.p007a.p019j.C0773d;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: b.a.a.m.f */
public final class C0800f extends RecyclerView.Adapter<C0799e> {

    /* renamed from: a */
    public final AppCompatActivity f595a;

    public C0800f(AppCompatActivity appCompatActivity) {
        C6888i.m12438e(appCompatActivity, BasePayload.CONTEXT_KEY);
        this.f595a = appCompatActivity;
    }

    public int getItemCount() {
        List<C0773d> list;
        BravoApp.C5403b bVar = BravoApp.f10730N;
        if (C6888i.m12434a(BravoApp.f10728L, Boolean.TRUE)) {
            C0689a aVar = C0689a.f394c;
            list = C0689a.f393b;
        } else {
            C0689a aVar2 = C0689a.f394c;
            list = C0689a.f392a;
        }
        return list.size();
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            if (C6888i.m12434a(BravoApp.f10728L, Boolean.FALSE)) {
                return 0;
            }
        }
        return 1;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<C0773d> list;
        C0799e eVar = (C0799e) viewHolder;
        C6888i.m12438e(eVar, "holder");
        if (i == 0) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            if (C6888i.m12434a(BravoApp.f10728L, Boolean.FALSE)) {
                ((Button) eVar.itemView.findViewById(R.id.debug_input_app_load)).setOnClickListener(new C0798d(eVar, (TextView) eVar.itemView.findViewById(R.id.debug_input_app_edittext)));
                return;
            }
        }
        BravoApp.C5403b bVar2 = BravoApp.f10730N;
        if (C6888i.m12434a(BravoApp.f10728L, Boolean.TRUE)) {
            C0689a aVar = C0689a.f394c;
            list = C0689a.f393b;
        } else {
            C0689a aVar2 = C0689a.f394c;
            list = C0689a.f392a;
        }
        C0773d dVar = list.get(i);
        C6888i.m12438e(dVar, "debugApp");
        TextView textView = (TextView) eVar.itemView.findViewById(R.id.debug_app_textview);
        String p = C0843a.m455p(C0843a.m460u("<b>"), dVar.f525a, "</b>");
        String str = dVar.f526b;
        C6888i.m12438e(str, "$this$getAppId");
        String substring = str.substring(C7694h.m13938p(str, "/", 0, false, 6) + 1);
        C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
        String substring2 = substring.substring(21);
        C6888i.m12437d(substring2, "(this as java.lang.String).substring(startIndex)");
        String str2 = C7694h.m13926d(dVar.f526b, "apps-service-dev", false, 2) ? "dev" : "prod";
        C6888i.m12437d(textView, "textView");
        textView.setText(Html.fromHtml(p + " (" + str2 + '*' + substring2 + ')', 0));
        textView.setContentDescription(dVar.f525a);
        textView.setOnClickListener(new C0797c(eVar, dVar));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        C6888i.m12438e(viewGroup, "parent");
        if (i == 0) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.viewholder_input_json_app;
        } else {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.viewholder_debug_app;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        AppCompatActivity appCompatActivity = this.f595a;
        C6888i.m12437d(inflate, "view");
        return new C0799e(appCompatActivity, inflate);
    }
}
