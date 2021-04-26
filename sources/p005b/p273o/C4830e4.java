package p005b.p273o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p273o.C4857i2;

/* renamed from: b.o.e4 */
public class C4830e4 {

    /* renamed from: i */
    public static int f9273i = -99;

    /* renamed from: j */
    public static Class<?> f9274j;

    /* renamed from: a */
    public ServiceConnection f9275a;

    /* renamed from: b */
    public Object f9276b;

    /* renamed from: c */
    public Method f9277c;

    /* renamed from: d */
    public Method f9278d;

    /* renamed from: e */
    public Context f9279e;

    /* renamed from: f */
    public ArrayList<String> f9280f;

    /* renamed from: g */
    public boolean f9281g = true;

    /* renamed from: h */
    public boolean f9282h;

    /* renamed from: b.o.e4$a */
    public class C4831a implements ServiceConnection {
        public C4831a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Method method;
            try {
                Method[] methods = Class.forName("com.android.vending.billing.IInAppBillingService$Stub").getMethods();
                int length = methods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i];
                    Class<IBinder>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                        break;
                    }
                    i++;
                }
                method.setAccessible(true);
                C4830e4.this.f9276b = method.invoke((Object) null, new Object[]{iBinder});
                C4830e4 e4Var = C4830e4.this;
                if (!e4Var.f9282h) {
                    new Thread(new C4838f4(e4Var)).start();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C4830e4.f9273i = -99;
            C4830e4.this.f9276b = null;
        }
    }

    public C4830e4(Context context) {
        boolean z = false;
        this.f9282h = false;
        this.f9279e = context;
        this.f9280f = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(C4815d3.m8831f("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f9280f.add(jSONArray.get(i).toString());
            }
            z = jSONArray.length() == 0 ? true : z;
            this.f9281g = z;
            if (z) {
                this.f9281g = C4815d3.m8827b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo16567b();
    }

    /* renamed from: a */
    public static void m8849a(C4830e4 e4Var, ArrayList arrayList, ArrayList arrayList2) {
        Method method;
        C4830e4 e4Var2 = e4Var;
        Objects.requireNonNull(e4Var);
        try {
            if (e4Var2.f9278d == null) {
                Class<String> cls = String.class;
                Method[] methods = f9274j.getMethods();
                int length = methods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i];
                    Class<Bundle>[] parameterTypes = method.getParameterTypes();
                    Class<?> returnType = method.getReturnType();
                    if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls && parameterTypes[2] == cls && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                        break;
                    }
                    i++;
                }
                e4Var2.f9278d = method;
                method.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) e4Var2.f9278d.invoke(e4Var2.f9276b, new Object[]{3, e4Var2.f9279e.getPackageName(), "inapp", bundle});
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (hashMap.containsKey(str)) {
                        jSONArray.put(hashMap.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    C4857i2.m8925B(jSONArray, e4Var2.f9281g, new C4847g4(e4Var, arrayList2));
                }
            }
        } catch (Throwable th) {
            C4857i2.m8933a(C4857i2.C4868k.WARN, "Failed to track IAP purchases", th);
        }
    }

    /* renamed from: b */
    public void mo16567b() {
        if (this.f9275a == null) {
            this.f9275a = new C4831a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f9279e.bindService(intent, this.f9275a, 1);
        } else if (this.f9276b != null && !this.f9282h) {
            new Thread(new C4838f4(this)).start();
        }
    }
}
