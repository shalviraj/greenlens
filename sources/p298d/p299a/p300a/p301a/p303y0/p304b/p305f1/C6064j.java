package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.b.f1.j */
public final class C6064j implements C6055c {

    /* renamed from: a */
    public final KotlinBuiltIns f11924a;

    /* renamed from: b */
    public final C6714b f11925b;

    /* renamed from: c */
    public final Map<C6717d, C7227g<?>> f11926c;

    /* renamed from: d */
    public final C6764f f11927d = C5266a.m9885T2(C6765g.PUBLICATION, new C6065a(this));

    /* renamed from: d.a.a.a.y0.b.f1.j$a */
    public static final class C6065a extends C6890k implements C6851a<C7489j0> {

        /* renamed from: g */
        public final /* synthetic */ C6064j f11928g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6065a(C6064j jVar) {
            super(0);
            this.f11928g = jVar;
        }

        public Object invoke() {
            C6064j jVar = this.f11928g;
            return jVar.f11924a.getBuiltInClassByFqName(jVar.f11925b).getDefaultType();
        }
    }

    public C6064j(KotlinBuiltIns kotlinBuiltIns, C6714b bVar, Map<C6717d, ? extends C7227g<?>> map) {
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(map, "allValueArguments");
        this.f11924a = kotlinBuiltIns;
        this.f11925b = bVar;
        this.f11926c = map;
    }

    /* renamed from: a */
    public C7452c0 mo23162a() {
        Object value = this.f11927d.getValue();
        C6888i.m12437d(value, "pyright 2010-2017 JetBrains s.r.o.\n *\n * Licensed under the Apache License, Version 2.0 (the \"License\");\n * you may not use this file except in compliance with the License.\n * You may obtain a copy of the License at\n *\n * http://www.apache.org/licenses/LICENSE-2.0\n *\n * Unless required by applicable law or agreed to in writing, software\n * distributed under the License is distributed on an \"AS IS\" BASIS,\n * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n * See the License for the specific language governing permissions and\n * limitations under the License.\n */\n\npackage org.jetbrains.kotlin.descriptors.annotations\n\nimport org.jetbrains.kotlin.builtins.KotlinBuiltIns\nimport org.jetbrains.kotlin.descriptors.SourceElement\nimport org.jetbrains.kotlin.name.FqName\nimport org.jetbrains.kotlin.name.Name\nimport org.jetbrains.kotlin.resolve.constants.ConstantValue\nimport org.jetbrains.kotlin.types.KotlinType\nimport kotlin.LazyThreadSafetyMode.PUBLICATION\n\nclass BuiltInAnnotationDescriptor(\n        private val builtIns: KotlinBuiltIns,\n        override val fqName: FqName,\n        override val allValueArguments: Map<Name, ConstantValue<*>>\n) : AnnotationDescriptor {\n    override val type: KotlinType by lazy(PUBLICATION) {\n        builtIns.getBuiltInClassByFqName(fqName).defaultType\n    }");
        return (C7452c0) value;
    }

    /* renamed from: b */
    public Map<C6717d, C7227g<?>> mo23163b() {
        return this.f11926c;
    }

    public C6714b getFqName() {
        return this.f11925b;
    }

    public C6234r0 getSource() {
        C6234r0 r0Var = C6234r0.f12257a;
        C6888i.m12437d(r0Var, "NO_SOURCE");
        return r0Var;
    }
}
