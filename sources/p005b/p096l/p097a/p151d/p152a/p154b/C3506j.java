package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.j */
public final class C3506j extends C3498h<List<String>> {

    /* renamed from: c */
    public final /* synthetic */ C3518m f6444c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3506j(C3518m mVar, C3647n<List<String>> nVar) {
        super(mVar, nVar);
        this.f6444c = mVar;
    }

    /* renamed from: I0 */
    public final void mo14779I0(List<Bundle> list) {
        this.f6414b.f6471c.mo14905b();
        C3518m.f6467f.mo14884b(4, "onGetSessionStates", new Object[0]);
        C3518m mVar = this.f6444c;
        ArrayList arrayList = new ArrayList();
        for (Bundle next : list) {
            C3511k0 k0Var = mVar.f6470b;
            ArrayList arrayList2 = new ArrayList();
            C3538r rVar = C3541s.f6549b;
            ArrayList<String> stringArrayList = next.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                hashMap.put(str, AssetPackState.m10422e(next, str, k0Var, rVar));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                hashMap.put(str2, AssetPackState.m10421d(str2, 4, 0, 0, 0, ShadowDrawableWrapper.COS_45, 1, ""));
            }
            next.getLong("total_bytes_to_download");
            AssetPackState assetPackState = (AssetPackState) hashMap.values().iterator().next();
            if (assetPackState == null) {
                C3518m.f6467f.mo14884b(6, "onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C3484d1.m6658d(assetPackState.mo14855h())) {
                arrayList.add(assetPackState.mo14854g());
            }
        }
        this.f6413a.mo14929b(arrayList);
    }
}
