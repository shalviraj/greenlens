package p005b.p006a.p007a.p008a;

import androidx.fragment.app.Fragment;
import com.appfoundry.previewer.model.Page;
import com.segment.analytics.Analytics;
import java.util.UUID;
import p005b.p006a.p007a.p015f.C0688a;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;

/* renamed from: b.a.a.a.b */
public class C0594b extends Fragment {

    /* renamed from: g */
    public Page f210g;

    /* renamed from: h */
    public String f211h;

    /* renamed from: i */
    public Boolean f212i = Boolean.FALSE;

    public void onPause() {
        super.onPause();
        C0688a aVar = C0688a.f391b;
        Page page = this.f210g;
        String str = null;
        String str2 = page != null ? page.f11033a : null;
        if (page != null) {
            str = page.f11034b;
        }
        String str3 = this.f211h;
        Analytics with = Analytics.with(C0849e.m505a());
        String c = C0688a.m185c();
        if (str3 == null) {
            str3 = "";
        }
        C0843a.m430F("Slack", false, with, "Page Closed", C0688a.m184b(c, str3).putValue("page_id", (Object) str2).putValue("page_name", (Object) str));
    }

    public void onResume() {
        super.onResume();
        String uuid = UUID.randomUUID().toString();
        this.f211h = uuid;
        C0688a aVar = C0688a.f391b;
        Page page = this.f210g;
        String str = null;
        String str2 = page != null ? page.f11033a : null;
        if (page != null) {
            str = page.f11034b;
        }
        Analytics with = Analytics.with(C0849e.m505a());
        String c = C0688a.m185c();
        if (uuid == null) {
            uuid = "";
        }
        C0843a.m430F("Slack", false, with, "Page Opened", C0688a.m184b(c, uuid).putValue("page_id", (Object) str2).putValue("page_name", (Object) str));
    }
}
