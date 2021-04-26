package p005b.p040g.p041a.p047i.p048b;

import android.util.Base64;
import android.util.Log;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p005b.p040g.p041a.p046h.C0893n;
import p005b.p096l.p224e.C4469n;
import p005b.p096l.p224e.C4470o;
import p005b.p096l.p224e.C4471p;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4474s;
import p005b.p096l.p224e.C4475t;
import p005b.p096l.p224e.C4476u;
import p005b.p096l.p224e.p226e0.C4372s;
import p005b.p096l.p224e.p226e0.p228z.C4409m;

/* renamed from: b.g.a.i.b.g */
public class C0914g implements C4471p<Map<String, PublicKey>> {
    /* renamed from: a */
    public Object mo10724a(C4472q qVar, Type type, C4470o oVar) {
        Class<String> cls = String.class;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof C4475t) || (qVar instanceof C4474s) || ((AbstractCollection) qVar.mo16136e().entrySet()).isEmpty()) {
            throw new C4476u("jwks json must be a valid and non-empty json object");
        }
        HashMap hashMap = new HashMap();
        C4372s.C4379e<String, C4472q> c = qVar.mo16136e().f8319a.mo16002c("keys");
        Iterator<C4472q> it = ((C4469n) (c != null ? c.f8108m : null)).iterator();
        while (it.hasNext()) {
            C4475t e = it.next().mo16136e();
            C4409m.C4411b bVar = (C4409m.C4411b) oVar;
            String str = (String) bVar.mo16085a(e.mo16144r("use"), cls);
            if ("RS256".equals((String) bVar.mo16085a(e.mo16144r("alg"), cls)) && "sig".equals(str)) {
                String str2 = (String) bVar.mo16085a(e.mo16144r("kty"), cls);
                String str3 = (String) bVar.mo16085a(e.mo16144r("kid"), cls);
                try {
                    hashMap.put(str3, KeyFactory.getInstance(str2).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode((String) bVar.mo16085a(e.mo16144r(C0893n.f779k), cls), 11)), new BigInteger(1, Base64.decode((String) bVar.mo16085a(e.mo16144r("e"), cls), 11)))));
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                    String simpleName = C0914g.class.getSimpleName();
                    Log.e(simpleName, "Could not parse the JWK with ID " + str3, e2);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
