package p005b.p273o;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: b.o.f4 */
public class C4838f4 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4830e4 f9297g;

    public C4838f4(C4830e4 e4Var) {
        this.f9297g = e4Var;
    }

    public void run() {
        Method method;
        C4830e4 e4Var = this.f9297g;
        e4Var.f9282h = true;
        try {
            if (e4Var.f9277c == null) {
                Class<String> cls = String.class;
                Method[] methods = C4830e4.f9274j.getMethods();
                int length = methods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i];
                    Class<String>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls && parameterTypes[2] == cls && parameterTypes[3] == cls) {
                        break;
                    }
                    i++;
                }
                e4Var.f9277c = method;
                this.f9297g.f9277c.setAccessible(true);
            }
            C4830e4 e4Var2 = this.f9297g;
            Bundle bundle = (Bundle) e4Var2.f9277c.invoke(e4Var2.f9276b, new Object[]{3, this.f9297g.f9279e.getPackageName(), "inapp", null});
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str = stringArrayList.get(i2);
                    String string = new JSONObject(stringArrayList2.get(i2)).getString("purchaseToken");
                    if (!this.f9297g.f9280f.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    C4830e4.m8849a(this.f9297g, arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    this.f9297g.f9281g = false;
                    C4815d3.m8834i("GTPlayerPurchases", "ExistingPurchases", false);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f9297g.f9282h = false;
    }
}
