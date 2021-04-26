package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p334t.C6790h;

/* renamed from: d.a.a.a.y0.b.f1.n */
public enum C6071n {
    CLASS("class", false, 2),
    ANNOTATION_CLASS("annotation class", false, 2),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2),
    FIELD("field", false, 2),
    LOCAL_VARIABLE("local variable", false, 2),
    VALUE_PARAMETER("value parameter", false, 2),
    CONSTRUCTOR("constructor", false, 2),
    FUNCTION("function", false, 2),
    PROPERTY_GETTER("getter", false, 2),
    PROPERTY_SETTER("setter", false, 2),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: h */
    public static final HashMap<String, C6071n> f11963h = null;

    /* renamed from: i */
    public static final Map<C6057e, C6071n> f11964i = null;

    /* renamed from: g */
    public final boolean f11982g;

    /* access modifiers changed from: public */
    static {
        f11963h = new HashMap<>();
        C6071n[] values = values();
        int i = 0;
        while (i < 41) {
            C6071n nVar = values[i];
            i++;
            f11963h.put(nVar.name(), nVar);
        }
        C6071n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 41; i2++) {
            C6071n nVar2 = values2[i2];
            if (nVar2.f11982g) {
                arrayList.add(nVar2);
            }
        }
        C6790h.m12349e0(arrayList);
        C5266a.m9781B4(values());
        C6057e eVar = C6057e.CONSTRUCTOR_PARAMETER;
        C6071n nVar3 = VALUE_PARAMETER;
        C6057e eVar2 = C6057e.FIELD;
        C6071n nVar4 = FIELD;
        f11964i = C6790h.m12317D(new C6768j(eVar, nVar3), new C6768j(eVar2, nVar4), new C6768j(C6057e.PROPERTY, PROPERTY), new C6768j(C6057e.FILE, FILE), new C6768j(C6057e.PROPERTY_GETTER, PROPERTY_GETTER), new C6768j(C6057e.PROPERTY_SETTER, PROPERTY_SETTER), new C6768j(C6057e.RECEIVER, nVar3), new C6768j(C6057e.SETTER_PARAMETER, nVar3), new C6768j(C6057e.PROPERTY_DELEGATE_FIELD, nVar4));
    }

    /* access modifiers changed from: public */
    C6071n(String str, boolean z) {
        this.f11982g = z;
    }

    /* access modifiers changed from: public */
    C6071n(String str, boolean z, int i) {
        this.f11982g = (i & 2) != 0 ? true : z;
    }
}
