package p005b.p291q.p292a;

import android.annotation.TargetApi;
import android.graphics.RectF;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.utils.Utils;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.C6766h;
import p298d.C6768j;
import p298d.C6769k;
import p298d.C6771l;
import p298d.C6772m;
import p298d.C6777r;
import p298d.C6778s;
import p298d.p299a.C6726e;
import p298d.p299a.C6727f;
import p298d.p299a.C6736l;
import p298d.p299a.C6741n;
import p298d.p299a.C6750u;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.C5922i0;
import p298d.p299a.p300a.p301a.C5931l0;
import p298d.p299a.p300a.p301a.C5939n0;
import p298d.p299a.p300a.p301a.C5941o0;
import p298d.p299a.p300a.p301a.C5960u0;
import p298d.p299a.p300a.p301a.C5970v0;
import p298d.p299a.p300a.p301a.p302x0.C5980b;
import p298d.p299a.p300a.p301a.p302x0.C5981c;
import p298d.p299a.p300a.p301a.p302x0.C5982d;
import p298d.p299a.p300a.p301a.p302x0.C5984f;
import p298d.p299a.p300a.p301a.p302x0.C5986h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6025b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6031c;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6036d1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6050e1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6052f0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6072g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6073g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6152i;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6158j0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6208l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6209l0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6239t;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6241u;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6250x0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6253y0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6254z;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6255z0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6066k;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6102f0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6107g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6109h0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6111i0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6121m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6123n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p308i1.C6154a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p308i1.C6155b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p308i1.C6156c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6172a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6177c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6183f;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6256a;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6258c;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6261e;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6263f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6267b0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6271c0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6273d0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6303g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6317h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6411j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6440k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6516v;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6521x;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6282a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6316k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6319a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6320b;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6321c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6324e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6329h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6333k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6417d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6438y;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6448e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6449f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6498t;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6548k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6565s;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6566t;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6567u;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6643i;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6646j;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6654n;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6684u;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6695x;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6719f;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7093g;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7197i;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7201m;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7210q;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7211r;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7212s;
import p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7214a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7215b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7216c;
import p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7217d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7218e;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7237o;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7282j;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7293b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7295d;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7391p;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7410y;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7412z;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7464e1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7471f0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7526l0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7553o;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7554o0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7557p0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7566t;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7568u;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7569u0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7579w;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7583y;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7584y0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7585z;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7586z0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7492c;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7527a;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7530d;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7531e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7532f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7536j;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7537k;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7538l;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7539m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7540n;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7542p;
import p298d.p299a.p300a.p301a.p303y0.p405l.p410n1.C7549a;
import p298d.p299a.p300a.p301a.p303y0.p405l.p410n1.C7552d;
import p298d.p299a.p300a.p301a.p303y0.p411m.C7589b;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7622a;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7624c;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7625d;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7626e;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7627f;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7644m;
import p298d.p333a0.C6758d;
import p298d.p334t.C6787e;
import p298d.p334t.C6790h;
import p298d.p334t.C6791i;
import p298d.p334t.C6792j;
import p298d.p334t.C6798p;
import p298d.p334t.C6800r;
import p298d.p337v.C6824d;
import p298d.p337v.C6825e;
import p298d.p337v.C6827f;
import p298d.p337v.C6832h;
import p298d.p337v.p338i.C6833a;
import p298d.p337v.p338i.C6834b;
import p298d.p337v.p338i.C6835c;
import p298d.p337v.p339j.p340a.C6836a;
import p298d.p337v.p339j.p340a.C6838c;
import p298d.p341w.C6847b;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6874a;
import p298d.p344x.p346c.C6881c;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6889j;
import p298d.p344x.p346c.C6902w;
import p298d.p344x.p346c.C6905z;
import p298d.p414b0.C7657a;
import p298d.p414b0.C7661d;
import p298d.p414b0.C7664f;
import p298d.p414b0.C7666g;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7670j;
import p298d.p414b0.C7671k;
import p298d.p414b0.C7672l;
import p298d.p414b0.C7673m;
import p298d.p414b0.C7674n;
import p298d.p414b0.C7679s;
import p298d.p414b0.C7681t;
import p298d.p414b0.C7683u;
import p298d.p415c0.C7694h;
import p416l.p417a.C7699a;
import p416l.p417a.C7701a1;
import p416l.p417a.C7706c0;
import p416l.p417a.C7714d1;
import p416l.p417a.C7716e0;
import p416l.p417a.C7717e1;
import p416l.p417a.C7719f0;
import p416l.p417a.C7720f1;
import p416l.p417a.C7722g0;
import p416l.p417a.C7728i0;
import p416l.p417a.C7744m1;
import p416l.p417a.C7748o;
import p416l.p417a.C7754q;
import p416l.p417a.C7756q1;
import p416l.p417a.C7757r;
import p416l.p417a.C7769u;
import p416l.p417a.C7818x;
import p416l.p417a.C7819x0;
import p416l.p417a.C7821y;
import p416l.p417a.C7823z;
import p416l.p417a.p419u1.C7774d;
import p416l.p417a.p419u1.C7775e;
import p416l.p417a.p419u1.C7776f;
import p416l.p417a.p419u1.C7788o;
import p416l.p417a.p419u1.C7790q;
import p416l.p417a.p419u1.C7791r;
import p421m.p422m0.C7867c;
import p421m.p422m0.p425f.C7873a;
import p421m.p422m0.p425f.C7875c;
import p421m.p422m0.p425f.C7876d;
import p435n.C8030a0;
import p435n.C8034b0;
import p435n.C8036c;
import p435n.C8039d;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8052o;
import p435n.C8053p;
import p435n.C8056r;
import p435n.C8058t;
import p435n.C8059u;
import p435n.C8063x;
import p435n.C8064y;
import p435n.C8065z;
import p435n.p436c0.C8038b;

/* renamed from: b.q.a.a */
public final class C5266a {
    /* renamed from: A */
    public static final <T> C7668h<T> m9770A(Iterator<? extends T> it) {
        C6888i.m12438e(it, "$this$asSequence");
        C7670j jVar = new C7670j(it);
        C6888i.m12438e(jVar, "$this$constrainOnce");
        return jVar instanceof C7657a ? jVar : new C7657a(jVar);
    }

    /* renamed from: A0 */
    public static final C7580w0 m9771A0(C7452c0 c0Var, C7484h1 h1Var, C6248w0 w0Var) {
        C6888i.m12438e(c0Var, "type");
        C6888i.m12438e(h1Var, "projectionKind");
        if ((w0Var == null ? null : w0Var.mo23137j()) == h1Var) {
            h1Var = C7484h1.INVARIANT;
        }
        return new C7584y0(h1Var, c0Var);
    }

    /* renamed from: A1 */
    public static final C6726e<?> m9772A1(C6741n nVar) {
        C6726e<?> z1;
        C6888i.m12438e(nVar, "$this$jvmErasure");
        C6727f h = nVar.mo23016h();
        if (h != null && (z1 = m10069z1(h)) != null) {
            return z1;
        }
        throw new C5931l0("Cannot calculate JVM erasure for type: " + nVar);
    }

    /* renamed from: A2 */
    public static final boolean m9773A2(C6207k0 k0Var) {
        C6888i.m12438e(k0Var, "<this>");
        return k0Var.mo23216b() == null;
    }

    /* renamed from: A3 */
    public static /* synthetic */ C7489j0 m9774A3(C7489j0 j0Var, List<C7580w0> list, C6060h hVar, int i) {
        if ((i & 1) != 0) {
            list = j0Var.mo24886U();
        }
        if ((i & 2) != 0) {
            hVar = j0Var.getAnnotations();
        }
        return m10065y3(j0Var, list, hVar);
    }

    /* renamed from: A4 */
    public static final <T> List<T> m9775A4(T[] tArr) {
        C6888i.m12438e(tArr, "$this$toMutableList");
        C6888i.m12438e(tArr, "$this$asCollection");
        return new ArrayList(new C6787e(tArr, false));
    }

    /* renamed from: B */
    public static final <T> C7668h<T> m9776B(T[] tArr) {
        C6888i.m12438e(tArr, "$this$asSequence");
        return tArr.length == 0 ? C7661d.f15173a : new C6792j(tArr);
    }

    /* renamed from: B0 */
    public static C6107g0 m9777B0(C6207k0 k0Var, C6060h hVar, C6060h hVar2, boolean z, boolean z2, boolean z3, C6233r rVar, C6234r0 r0Var) {
        C6060h hVar3 = hVar2;
        if (hVar == null) {
            m9935d(8);
            throw null;
        } else if (hVar3 == null) {
            m9935d(9);
            throw null;
        } else if (rVar == null) {
            m9935d(10);
            throw null;
        } else if (r0Var != null) {
            C6107g0 g0Var = new C6107g0(k0Var, hVar, k0Var.getModality(), rVar, z, z2, z3, C6023b.C6024a.DECLARATION, (C6211m0) null, r0Var);
            g0Var.mo23243U(C6107g0.m10959D(g0Var, k0Var.mo23093a(), hVar2));
            return g0Var;
        } else {
            m9935d(11);
            throw null;
        }
    }

    /* renamed from: B1 */
    public static final String m9778B1(C6023b bVar) {
        C6023b bVar2;
        C6888i.m12438e(bVar, "callableMemberDescriptor");
        C6023b H1 = KotlinBuiltIns.isBuiltIn(bVar) ? m9814H1(bVar) : null;
        if (H1 == null) {
            bVar2 = null;
        } else {
            bVar2 = C7255a.m13140m(H1);
        }
        if (bVar2 == null) {
            return null;
        }
        if (bVar2 instanceof C6207k0) {
            return C6440k.f12639a.mo23554a(bVar2);
        }
        if (!(bVar2 instanceof C6232q0)) {
            return null;
        }
        C6303g gVar = C6303g.f12404m;
        C6232q0 q0Var = (C6232q0) bVar2;
        C6888i.m12438e(q0Var, "functionDescriptor");
        Map<String, C6717d> map = C6275e0.f12351j;
        String c = C6561p.m11654c(q0Var);
        C6717d dVar = c == null ? null : map.get(c);
        if (dVar == null) {
            return null;
        }
        return dVar.mo23886e();
    }

    /* renamed from: B2 */
    public static boolean m9779B2(C7492c cVar, C7535i iVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(iVar, "receiver");
        if (iVar instanceof C7489j0) {
            return ((C7489j0) iVar).mo23566W();
        }
        throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
    }

    /* renamed from: B3 */
    public static final C7452c0 m9780B3(C7452c0 c0Var, C6060h hVar) {
        C6888i.m12438e(c0Var, "<this>");
        C6888i.m12438e(hVar, "newAnnotations");
        return (!c0Var.getAnnotations().isEmpty() || !hVar.isEmpty()) ? c0Var.mo25056Y().mo23547b0(hVar) : c0Var;
    }

    /* renamed from: B4 */
    public static final <T> Set<T> m9781B4(T[] tArr) {
        C6888i.m12438e(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return C6800r.f13715g;
        }
        if (length == 1) {
            return m9891U3(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(m9957g3(tArr.length));
        m10030s4(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: C */
    public static final C7489j0 m9782C(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C7481g1 Y = c0Var.mo25056Y();
        C7489j0 j0Var = Y instanceof C7489j0 ? (C7489j0) Y : null;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException(C6888i.m12444k("This is should be simple type: ", c0Var).toString());
    }

    /* renamed from: C0 */
    public static final String m9783C0(C7567t0 t0Var) {
        StringBuilder sb = new StringBuilder();
        m9789D0(C6888i.m12444k("type: ", t0Var), sb);
        m9789D0(C6888i.m12444k("hashCode: ", Integer.valueOf(t0Var.hashCode())), sb);
        m9789D0(C6888i.m12444k("javaClass: ", t0Var.getClass().getCanonicalName()), sb);
        for (C6206k declarationDescriptor = t0Var.getDeclarationDescriptor(); declarationDescriptor != null; declarationDescriptor = declarationDescriptor.getContainingDeclaration()) {
            m9789D0(C6888i.m12444k("fqName: ", C7150c.f14297a.mo24787q(declarationDescriptor)), sb);
            m9789D0(C6888i.m12444k("javaClass: ", declarationDescriptor.getClass().getCanonicalName()), sb);
        }
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: C1 */
    public static final <T> C6726e<T> m9784C1(Class<T> cls) {
        C6888i.m12438e(cls, "$this$kotlin");
        return C6902w.m12460a(cls);
    }

    /* renamed from: C2 */
    public static boolean m9785C2(C7540n nVar, C7534h hVar) {
        C6888i.m12438e(nVar, "this");
        C6888i.m12438e(hVar, "receiver");
        return (hVar instanceof C7535i) && nVar.mo25113d((C7535i) hVar);
    }

    /* renamed from: C3 */
    public static final C7452c0 m9786C3(C7452c0 c0Var) {
        C7489j0 j0Var;
        C6888i.m12438e(c0Var, "<this>");
        C7481g1 Y = c0Var.mo25056Y();
        if (Y instanceof C7579w) {
            C7455d0 d0Var = C7455d0.f14869a;
            C7579w wVar = (C7579w) Y;
            C7489j0 j0Var2 = wVar.f15029h;
            if (!j0Var2.mo24887V().getParameters().isEmpty() && j0Var2.mo24887V().getDeclarationDescriptor() != null) {
                List<C6248w0> parameters = j0Var2.mo24887V().getParameters();
                C6888i.m12437d(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(m9892V(parameters, 10));
                for (C6248w0 o0Var : parameters) {
                    arrayList.add(new C7554o0(o0Var));
                }
                j0Var2 = m9774A3(j0Var2, arrayList, (C6060h) null, 2);
            }
            C7489j0 j0Var3 = wVar.f15030i;
            if (!j0Var3.mo24887V().getParameters().isEmpty() && j0Var3.mo24887V().getDeclarationDescriptor() != null) {
                List<C6248w0> parameters2 = j0Var3.mo24887V().getParameters();
                C6888i.m12437d(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(m9892V(parameters2, 10));
                for (C6248w0 o0Var2 : parameters2) {
                    arrayList2.add(new C7554o0(o0Var2));
                }
                j0Var3 = m9774A3(j0Var3, arrayList2, (C6060h) null, 2);
            }
            j0Var = C7455d0.m13428c(j0Var2, j0Var3);
        } else if (Y instanceof C7489j0) {
            C7489j0 j0Var4 = (C7489j0) Y;
            boolean isEmpty = j0Var4.mo24887V().getParameters().isEmpty();
            j0Var = j0Var4;
            if (!isEmpty) {
                C6083h declarationDescriptor = j0Var4.mo24887V().getDeclarationDescriptor();
                j0Var = j0Var4;
                if (declarationDescriptor != null) {
                    List<C6248w0> parameters3 = j0Var4.mo24887V().getParameters();
                    C6888i.m12437d(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(m9892V(parameters3, 10));
                    for (C6248w0 o0Var3 : parameters3) {
                        arrayList3.add(new C7554o0(o0Var3));
                    }
                    j0Var = m9774A3(j0Var4, arrayList3, (C6060h) null, 2);
                }
            }
        } else {
            throw new C6766h();
        }
        return m9980k2(j0Var, Y);
    }

    /* renamed from: C4 */
    public static final <K, V> Map<K, V> m9787C4(Map<? extends K, ? extends V> map) {
        C6888i.m12438e(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C6888i.m12437d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: D */
    public static C7535i m9788D(C7492c cVar, C7534h hVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        if (hVar instanceof C7452c0) {
            C7481g1 Y = ((C7452c0) hVar).mo25056Y();
            if (Y instanceof C7489j0) {
                return (C7489j0) Y;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: D0 */
    public static final StringBuilder m9789D0(String str, StringBuilder sb) {
        C6888i.m12438e(str, "<this>");
        C6888i.m12438e(sb, "$this_anonymous");
        sb.append(str);
        C6888i.m12437d(sb, "append(value)");
        sb.append(10);
        C6888i.m12437d(sb, "append('\\n')");
        return sb;
    }

    /* renamed from: D1 */
    public static final <T> int m9790D1(T[] tArr) {
        C6888i.m12438e(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    /* renamed from: D2 */
    public static boolean m9791D2(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            return KotlinBuiltIns.isTypeConstructorForGivenClass((C7567t0) lVar, StandardNames.FqNames.nothing);
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: D3 */
    public static final C7452c0 m9792D3(C7452c0 c0Var, List<C7552d> list) {
        C7584y0 y0Var;
        C7484h1 h1Var;
        c0Var.mo24886U().size();
        list.size();
        ArrayList arrayList = new ArrayList(m9892V(list, 10));
        for (C7552d dVar : list) {
            C7484h1 h1Var2 = C7484h1.OUT_VARIANCE;
            C7484h1 h1Var3 = C7484h1.INVARIANT;
            Objects.requireNonNull(dVar);
            C7493d.f14926a.mo25128d(dVar.f14990b, dVar.f14991c);
            if (C6888i.m12434a(dVar.f14990b, dVar.f14991c) || dVar.f14989a.mo23137j() == (h1Var = C7484h1.IN_VARIANCE)) {
                y0Var = new C7584y0(dVar.f14990b);
            } else if (KotlinBuiltIns.isNothing(dVar.f14990b) && dVar.f14989a.mo23137j() != h1Var) {
                if (h1Var2 == dVar.f14989a.mo23137j()) {
                    h1Var2 = h1Var3;
                }
                y0Var = new C7584y0(h1Var2, dVar.f14991c);
            } else if (KotlinBuiltIns.isNullableAny(dVar.f14991c)) {
                if (h1Var != dVar.f14989a.mo23137j()) {
                    h1Var3 = h1Var;
                }
                y0Var = new C7584y0(h1Var3, dVar.f14990b);
            } else {
                if (h1Var2 == dVar.f14989a.mo23137j()) {
                    h1Var2 = h1Var3;
                }
                y0Var = new C7584y0(h1Var2, dVar.f14991c);
            }
            arrayList.add(y0Var);
        }
        return m10071z3(c0Var, arrayList, (C6060h) null, (List) null, 6);
    }

    /* renamed from: D4 */
    public static final <T> Object m9793D4(Object obj, C6862l<? super Throwable, C6777r> lVar) {
        Throwable a = C6769k.m12309a(obj);
        return a == null ? lVar != null ? new C7757r(obj, lVar) : obj : new C7754q(a, false, 2);
    }

    /* renamed from: E */
    public static final C7580w0 m9794E(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return new C7584y0(c0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = r5;
     */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress m9795E0(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r18
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = p298d.p415c0.C7694h.m13948z(r0, r14, r6, r5, r12)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = p298d.p415c0.C7694h.m13948z(r0, r11, r6, r5, r12)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = p298d.p415c0.C7694h.m13948z(r0, r11, r6, r5, r12)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x009c
            if (r11 != r2) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            if (r11 == r6) goto L_0x005f
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
        L_0x005b:
            r0 = r5
            goto L_0x00a2
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r1) goto L_0x008b
            char r5 = r0.charAt(r14)
            r2 = 48
            int r16 = p298d.p344x.p346c.C6888i.m12440g(r5, r2)
            if (r16 < 0) goto L_0x008b
            r4 = 57
            int r4 = p298d.p344x.p346c.C6888i.m12440g(r5, r4)
            if (r4 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r12
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r1) goto L_0x00c2
            char r4 = r0.charAt(r6)
            int r4 = p421m.p422m0.C7867c.m14296q(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r12) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9795E0(java.lang.String, int, int):java.net.InetAddress");
    }

    @TargetApi(17)
    /* renamed from: E1 */
    public static int m9796E1() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
        return iArr3[0];
    }

    /* renamed from: E2 */
    public static boolean m9797E2(C7492c cVar, C7534h hVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        if (hVar instanceof C7452c0) {
            return C7460d1.m13441g((C7452c0) hVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: E3 */
    public static final <E> void m9798E3(E[] eArr, int i) {
        C6888i.m12438e(eArr, "$this$resetAt");
        eArr[i] = null;
    }

    /* renamed from: E4 */
    public static RectF m9799E4(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float round = ((float) Math.round(fArr[i - 1] * 10.0f)) / 10.0f;
            float round2 = ((float) Math.round(fArr[i] * 10.0f)) / 10.0f;
            float f = rectF.left;
            if (round < f) {
                f = round;
            }
            rectF.left = f;
            float f2 = rectF.top;
            if (round2 < f2) {
                f2 = round2;
            }
            rectF.top = f2;
            float f3 = rectF.right;
            if (round <= f3) {
                round = f3;
            }
            rectF.right = round;
            float f4 = rectF.bottom;
            if (round2 <= f4) {
                round2 = f4;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }

    /* renamed from: F */
    public static C7706c0 m9800F(C7821y yVar, C6827f fVar, C7823z zVar, C6866p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C6832h.f13753g;
        }
        C7823z zVar2 = (i & 2) != 0 ? C7823z.DEFAULT : null;
        C6827f a = C7769u.m14114a(yVar, fVar);
        Objects.requireNonNull(zVar2);
        C7716e0 e1Var = zVar2 == C7823z.LAZY ? new C7717e1(a, pVar) : new C7716e0(a, true);
        e1Var.mo25305T(zVar2, e1Var, pVar);
        return e1Var;
    }

    /* renamed from: F0 */
    public static final C6233r m9801F0(C7410y yVar, C6695x xVar) {
        String str;
        C6233r rVar;
        C6888i.m12438e(yVar, "<this>");
        int i = xVar == null ? -1 : C7412z.f14826b[xVar.ordinal()];
        if (i == 1) {
            rVar = C6219q.f12244d;
            str = "INTERNAL";
        } else if (i == 3) {
            rVar = C6219q.f12242b;
            str = "PRIVATE_TO_THIS";
        } else if (i == 4) {
            rVar = C6219q.f12243c;
            str = "PROTECTED";
        } else if (i == 5) {
            rVar = C6219q.f12245e;
            str = "PUBLIC";
        } else if (i != 6) {
            rVar = C6219q.f12241a;
            str = "PRIVATE";
        } else {
            rVar = C6219q.f12246f;
            str = "LOCAL";
        }
        C6888i.m12437d(rVar, str);
        return rVar;
    }

    /* renamed from: F1 */
    public static final C6717d m9802F1(C6705c cVar, int i) {
        C6888i.m12438e(cVar, "<this>");
        C6717d k = C6717d.m12269k(cVar.mo23725a(i));
        C6888i.m12437d(k, "guessByFirstCharacter(getString(index))");
        return k;
    }

    /* renamed from: F2 */
    public static boolean m9803F2(C7492c cVar, C7535i iVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(iVar, "receiver");
        if (iVar instanceof C7452c0) {
            return KotlinBuiltIns.isPrimitiveType((C7452c0) iVar);
        }
        throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
    }

    /* renamed from: F3 */
    public static final <E> void m9804F3(E[] eArr, int i, int i2) {
        C6888i.m12438e(eArr, "$this$resetRange");
        while (i < i2) {
            m9798E3(eArr, i);
            i++;
        }
    }

    /* renamed from: F4 */
    public static X509TrustManager m9805F4(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    /* renamed from: G */
    public static final C8042f m9806G(C8064y yVar) {
        C6888i.m12438e(yVar, "$this$buffer");
        return new C8058t(yVar);
    }

    /* renamed from: G0 */
    public static <N, R> R m9807G0(Collection<N> collection, C7624c<N> cVar, C7625d<N, R> dVar) {
        if (collection == null) {
            m9947f(4);
            throw null;
        } else if (cVar != null) {
            C7627f fVar = new C7627f();
            for (N H0 : collection) {
                m9813H0(H0, cVar, fVar, dVar);
            }
            return dVar.result();
        } else {
            m9947f(5);
            throw null;
        }
    }

    /* renamed from: G1 */
    public static final Integer m9808G1(int[] iArr, int i) {
        C6888i.m12438e(iArr, "$this$getOrNull");
        if (i >= 0) {
            C6888i.m12438e(iArr, "$this$lastIndex");
            if (i <= iArr.length - 1) {
                return Integer.valueOf(iArr[i]);
            }
        }
        return null;
    }

    /* renamed from: G2 */
    public static final boolean m9809G2(C8040e eVar) {
        C6888i.m12438e(eVar, "$this$isProbablyUtf8");
        try {
            C8040e eVar2 = new C8040e();
            long j = eVar.f16140h;
            eVar.mo25946z(eVar2, 0, j > 64 ? 64 : j);
            for (int i = 0; i < 16; i++) {
                if (eVar2.mo25886D()) {
                    return true;
                }
                int p0 = eVar2.mo25923p0();
                if (Character.isISOControl(p0) && !Character.isWhitespace(p0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: G3 */
    public static final C6060h m9810G3(C6328g gVar, C6417d dVar) {
        C6888i.m12438e(gVar, "<this>");
        C6888i.m12438e(dVar, "annotationsOwner");
        return new C6324e(gVar, dVar, false);
    }

    /* renamed from: G4 */
    public static final Class<?> m9811G4(ClassLoader classLoader, String str) {
        C6888i.m12438e(classLoader, "<this>");
        C6888i.m12438e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: H */
    public static final C8043g m9812H(C8030a0 a0Var) {
        C6888i.m12438e(a0Var, "$this$buffer");
        return new C8059u(a0Var);
    }

    /* renamed from: H0 */
    public static <N> void m9813H0(N n, C7624c<N> cVar, C7626e<N> eVar, C7625d<N, ?> dVar) {
        if (n == null) {
            m9947f(22);
            throw null;
        } else if (cVar == null) {
            m9947f(23);
            throw null;
        } else if (eVar == null) {
            m9947f(24);
            throw null;
        } else if (dVar == null) {
            m9947f(25);
            throw null;
        } else if (((C7627f) eVar).f15111a.add(n) && dVar.beforeChildren(n)) {
            for (Object H0 : cVar.getNeighbors(n)) {
                m9813H0(H0, cVar, eVar, dVar);
            }
            dVar.afterChildren(n);
        }
    }

    /* renamed from: H1 */
    public static final <T extends C6023b> T m9814H1(T t) {
        C6862l lVar;
        C6888i.m12438e(t, "<this>");
        C6275e0.C6276a aVar = C6275e0.f12342a;
        if (!C6275e0.f12352k.contains(t.getName())) {
            C6411j jVar = C6411j.f12631a;
            if (!C6411j.f12635e.contains(C7255a.m13140m(t).getName())) {
                return null;
            }
        }
        if (t instanceof C6207k0 ? true : t instanceof C6158j0) {
            lVar = C6267b0.f12333g;
        } else if (!(t instanceof C6232q0)) {
            return null;
        } else {
            lVar = C6271c0.f12338g;
        }
        return C7255a.m13130c(t, false, lVar, 1);
    }

    /* renamed from: H2 */
    public static final boolean m9815H2(Throwable th) {
        C6888i.m12438e(th, "<this>");
        Class cls = th.getClass();
        while (!C6888i.m12434a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H3 */
    public static final C6046e m9816H3(C6021a0 a0Var, C6714b bVar, C6257b bVar2) {
        C6208l lVar;
        C7277h unsubstitutedInnerClassesScope;
        C6888i.m12438e(a0Var, "<this>");
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(bVar2, "lookupLocation");
        if (bVar.mo23864d()) {
            return null;
        }
        C6714b e = bVar.mo23865e();
        C6888i.m12437d(e, "fqName.parent()");
        C7277h memberScope = a0Var.mo23088G(e).getMemberScope();
        C6717d g = bVar.mo23868g();
        C6888i.m12437d(g, "fqName.shortName()");
        C6083h contributedClassifier = memberScope.getContributedClassifier(g, bVar2);
        C6046e eVar = contributedClassifier instanceof C6046e ? (C6046e) contributedClassifier : null;
        if (eVar != null) {
            return eVar;
        }
        C6714b e2 = bVar.mo23865e();
        C6888i.m12437d(e2, "fqName.parent()");
        C6046e H3 = m9816H3(a0Var, e2, bVar2);
        if (H3 == null || (unsubstitutedInnerClassesScope = H3.getUnsubstitutedInnerClassesScope()) == null) {
            lVar = null;
        } else {
            C6717d g2 = bVar.mo23868g();
            C6888i.m12437d(g2, "fqName.shortName()");
            lVar = unsubstitutedInnerClassesScope.getContributedClassifier(g2, bVar2);
        }
        if (lVar instanceof C6046e) {
            return (C6046e) lVar;
        }
        return null;
    }

    /* renamed from: H4 */
    public static final C6667q m9817H4(C6684u uVar, C6707e eVar) {
        C6888i.m12438e(uVar, "<this>");
        C6888i.m12438e(eVar, "typeTable");
        if (uVar.mo23822t()) {
            C6667q qVar = uVar.f13475l;
            C6888i.m12437d(qVar, "type");
            return qVar;
        }
        if ((uVar.f13472i & 8) == 8) {
            return eVar.mo23845a(uVar.f13476m);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d.a.a.a.y0.b.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.p303y0.p304b.C6153i0 m9818I(p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0 r5, p298d.p299a.p300a.p301a.p303y0.p304b.C6152i r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0059
            boolean r1 = p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.m13789j(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x0059
        L_0x000a:
            java.util.List r1 = r6.getDeclaredTypeParameters()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.isInner()
            if (r2 != 0) goto L_0x003c
            java.util.List r2 = r5.mo24886U()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0026
            p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13040t(r6)
        L_0x0026:
            d.a.a.a.y0.b.i0 r1 = new d.a.a.a.y0.b.i0
            java.util.List r2 = r5.mo24886U()
            java.util.List r5 = r5.mo24886U()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x003c:
            java.util.List r2 = r5.mo24886U()
            java.util.List r7 = r2.subList(r7, r1)
            d.a.a.a.y0.b.i0 r2 = new d.a.a.a.y0.b.i0
            d.a.a.a.y0.b.k r3 = r6.getContainingDeclaration()
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6152i
            if (r4 == 0) goto L_0x0051
            r0 = r3
            d.a.a.a.y0.b.i r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6152i) r0
        L_0x0051:
            d.a.a.a.y0.b.i0 r5 = m9818I(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9818I(d.a.a.a.y0.l.c0, d.a.a.a.y0.b.i, int):d.a.a.a.y0.b.i0");
    }

    /* renamed from: I0 */
    public static float m9819I0(float f, float f2, float f3, float f4) {
        float f5 = f / (f4 / 2.0f);
        float f6 = f3 / 2.0f;
        if (f5 < 1.0f) {
            return (f6 * f5 * f5 * f5) + f2;
        }
        float f7 = f5 - 2.0f;
        return (((f7 * f7 * f7) + 2.0f) * f6) + f2;
    }

    /* renamed from: I1 */
    public static final <T extends C6023b> T m9820I1(T t) {
        C6888i.m12438e(t, "<this>");
        T H1 = m9814H1(t);
        if (H1 != null) {
            return H1;
        }
        C6317h hVar = C6317h.f12423m;
        C6717d name = t.getName();
        C6888i.m12437d(name, "name");
        if (!hVar.mo23464b(name)) {
            return null;
        }
        return C7255a.m13130c(t, false, C6273d0.f12340g, 1);
    }

    /* renamed from: I2 */
    public static boolean m9821I2(C7492c cVar, C7537k kVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(kVar, "receiver");
        if (kVar instanceof C7580w0) {
            return ((C7580w0) kVar).mo25163c();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C6902w.m12460a(kVar.getClass())).toString());
    }

    /* renamed from: I3 */
    public static <D extends C6023b> Collection<D> m9822I3(C6717d dVar, Collection<D> collection, Collection<D> collection2, C6046e eVar, C7391p pVar, C7201m mVar, boolean z) {
        if (dVar == null) {
            m9929c(12);
            throw null;
        } else if (collection == null) {
            m9929c(13);
            throw null;
        } else if (collection2 == null) {
            m9929c(14);
            throw null;
        } else if (eVar == null) {
            m9929c(15);
            throw null;
        } else if (pVar == null) {
            m9929c(16);
            throw null;
        } else if (mVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            mVar.mo24879h(dVar, collection, collection2, eVar, new C6282a(pVar, linkedHashSet, z));
            return linkedHashSet;
        } else {
            m9929c(17);
            throw null;
        }
    }

    /* renamed from: I4 */
    public static C7538l m9823I4(C7492c cVar, C7535i iVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(iVar, "receiver");
        if (iVar instanceof C7489j0) {
            return ((C7489j0) iVar).mo24887V();
        }
        throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
    }

    /* renamed from: J */
    public static final int m9824J(int i) {
        if (i < 3) {
            return 3;
        }
        return (i / 3) + i + 1;
    }

    /* renamed from: J0 */
    public static final boolean m9825J0(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [d.a.a.a.y0.i.z.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6389o m9826J1(p298d.p299a.p300a.p301a.p303y0.p304b.C6046e r3) {
        /*
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            int r1 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.f14475a
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            d.a.a.a.y0.l.j0 r3 = r3.getDefaultType()
            d.a.a.a.y0.l.t0 r3 = r3.mo24887V()
            java.util.Collection r3 = r3.getSupertypes()
            java.util.Iterator r3 = r3.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r3.next()
            d.a.a.a.y0.l.c0 r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r0
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAnyOrNullableAny(r0)
            if (r2 != 0) goto L_0x001a
            d.a.a.a.y0.l.t0 r0 = r0.mo24887V()
            d.a.a.a.y0.b.h r0 = r0.getDeclarationDescriptor()
            boolean r2 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13035o(r0)
            if (r2 == 0) goto L_0x001a
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            java.util.Objects.requireNonNull(r0, r3)
            d.a.a.a.y0.b.e r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r0
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            if (r0 != 0) goto L_0x0047
            return r1
        L_0x0047:
            d.a.a.a.y0.i.z.h r3 = r0.getStaticScope()
            boolean r2 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6389o
            if (r2 == 0) goto L_0x0052
            r1 = r3
            d.a.a.a.y0.d.a.h0.l.o r1 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6389o) r1
        L_0x0052:
            if (r1 != 0) goto L_0x0058
            d.a.a.a.y0.d.a.h0.l.o r1 = m9826J1(r0)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9826J1(d.a.a.a.y0.b.e):d.a.a.a.y0.d.a.h0.l.o");
    }

    /* renamed from: J2 */
    public static final boolean m9827J2(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return C7460d1.m13442h(c0Var);
    }

    /* renamed from: J3 */
    public static <D extends C6023b> Collection<D> m9828J3(C6717d dVar, Collection<D> collection, Collection<D> collection2, C6046e eVar, C7391p pVar, C7201m mVar) {
        if (dVar == null) {
            m9929c(0);
            throw null;
        } else if (collection == null) {
            m9929c(1);
            throw null;
        } else if (collection2 == null) {
            m9929c(2);
            throw null;
        } else if (eVar == null) {
            m9929c(3);
            throw null;
        } else if (pVar == null) {
            m9929c(4);
            throw null;
        } else if (mVar != null) {
            return m9822I3(dVar, collection, collection2, eVar, pVar, mVar, false);
        } else {
            m9929c(5);
            throw null;
        }
    }

    /* renamed from: J4 */
    public static C7538l m9829J4(C7540n nVar, C7534h hVar) {
        C6888i.m12438e(nVar, "this");
        C6888i.m12438e(hVar, "receiver");
        C7535i a = nVar.mo25110a(hVar);
        if (a == null) {
            a = nVar.mo25083k(hVar);
        }
        return nVar.mo25112c(a);
    }

    /* renamed from: K */
    public static final String m9830K(String str) {
        C6888i.m12438e(str, "<this>");
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt <= 'z') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(upperCase) + substring;
    }

    /* renamed from: K0 */
    public static C6055c m9831K0(C6060h hVar, C6714b bVar) {
        Object obj;
        C6888i.m12438e(hVar, "this");
        C6888i.m12438e(bVar, "fqName");
        Iterator it = hVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C6888i.m12434a(((C6055c) obj).getFqName(), bVar)) {
                break;
            }
        }
        return (C6055c) obj;
    }

    /* renamed from: K1 */
    public static PrimitiveType m9832K1(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            C6083h declarationDescriptor = ((C7567t0) lVar).getDeclarationDescriptor();
            Objects.requireNonNull(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return KotlinBuiltIns.getPrimitiveArrayType((C6046e) declarationDescriptor);
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: K2 */
    public static boolean m9833K2(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            C6083h declarationDescriptor = ((C7567t0) lVar).getDeclarationDescriptor();
            return C6888i.m12434a(declarationDescriptor == null ? null : Boolean.valueOf(KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)), Boolean.TRUE);
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: K3 */
    public static <D extends C6023b> Collection<D> m9834K3(C6717d dVar, Collection<D> collection, Collection<D> collection2, C6046e eVar, C7391p pVar, C7201m mVar) {
        if (collection == null) {
            m9929c(7);
            throw null;
        } else if (eVar == null) {
            m9929c(9);
            throw null;
        } else if (pVar == null) {
            m9929c(10);
            throw null;
        } else if (mVar != null) {
            return m9822I3(dVar, collection, collection2, eVar, pVar, mVar, true);
        } else {
            m9929c(11);
            throw null;
        }
    }

    /* renamed from: K4 */
    public static C7535i m9835K4(C7492c cVar, C7532f fVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(fVar, "receiver");
        if (fVar instanceof C7579w) {
            return ((C7579w) fVar).f15030i;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C6902w.m12460a(fVar.getClass())).toString());
    }

    /* renamed from: L */
    public static <M extends Member> void m9836L(C5986h<? extends M> hVar, Object[] objArr) {
        C6888i.m12438e(objArr, "args");
        if (m9943e1(hVar) != objArr.length) {
            StringBuilder u = C0843a.m460u("Callable expects ");
            u.append(m9943e1(hVar));
            u.append(" arguments, but ");
            throw new IllegalArgumentException(C0843a.m453n(u, objArr.length, " were provided."));
        }
    }

    /* renamed from: L0 */
    public static C6177c m9837L0(C6183f fVar, C6714b bVar) {
        Annotation[] declaredAnnotations;
        C6888i.m12438e(fVar, "this");
        C6888i.m12438e(bVar, "fqName");
        AnnotatedElement d = fVar.mo23364d();
        if (d == null || (declaredAnnotations = d.getDeclaredAnnotations()) == null) {
            return null;
        }
        return m9843M0(declaredAnnotations, bVar);
    }

    /* renamed from: L1 */
    public static PrimitiveType m9838L1(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            C6083h declarationDescriptor = ((C7567t0) lVar).getDeclarationDescriptor();
            Objects.requireNonNull(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return KotlinBuiltIns.getPrimitiveType((C6046e) declarationDescriptor);
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: L2 */
    public static final boolean m9839L2(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        return z ? 'A' <= charAt && charAt <= 'Z' : Character.isUpperCase(charAt);
    }

    /* renamed from: L3 */
    public static final <T> void m9840L3(C7722g0<? super T> g0Var, C6824d<? super T> dVar, boolean z) {
        Object h = g0Var.mo25372h();
        Throwable e = g0Var.mo25370e(h);
        Object u0 = e != null ? m10038u0(e) : g0Var.mo25371f(h);
        if (z) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            C7775e eVar = (C7775e) dVar;
            C6824d<T> dVar2 = eVar.f15331m;
            Object obj = eVar.f15329k;
            C6827f context = dVar2.getContext();
            Object b = C7791r.m14156b(context, obj);
            C7756q1<?> b2 = b != C7791r.f15356a ? C7769u.m14115b(dVar2, context, b) : null;
            try {
                eVar.f15331m.mo24166c(u0);
            } finally {
                if (b2 == null || b2.mo25428U()) {
                    C7791r.m14155a(context, b);
                }
            }
        } else {
            dVar.mo24166c(u0);
        }
    }

    /* renamed from: L4 */
    public static C7535i m9841L4(C7540n nVar, C7534h hVar) {
        C6888i.m12438e(nVar, "this");
        C6888i.m12438e(hVar, "receiver");
        C7532f r = nVar.mo25120r(hVar);
        if (r != null) {
            return nVar.mo25115i(r);
        }
        C7535i a = nVar.mo25110a(hVar);
        C6888i.m12436c(a);
        return a;
    }

    /* renamed from: M */
    public static <T> T m9842M(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: M0 */
    public static final C6177c m9843M0(Annotation[] annotationArr, C6714b bVar) {
        Annotation annotation;
        C6888i.m12438e(annotationArr, "<this>");
        C6888i.m12438e(bVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C6888i.m12434a(C6173b.m11073b(m10033t1(m9913Z0(annotation))).mo23851b(), bVar)) {
                break;
            }
            i++;
        }
        if (annotation == null) {
            return null;
        }
        return new C6177c(annotation);
    }

    /* renamed from: M1 */
    public static final int m9844M1(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m9987l3(m9987l3(i2, i3) - m9987l3(i, i3), i3);
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            int i4 = -i3;
            return i2 + m9987l3(m9987l3(i, i4) - m9987l3(i2, i4), i4);
        }
    }

    /* renamed from: M2 */
    public static boolean m9845M2(byte[] bArr, int i, int i2) {
        return m10011p3(bArr, i, i2) == 0;
    }

    /* renamed from: M3 */
    public static final C6667q m9846M3(C6643i iVar, C6707e eVar) {
        C6888i.m12438e(iVar, "<this>");
        C6888i.m12438e(eVar, "typeTable");
        if (iVar.mo23766w()) {
            C6667q qVar = iVar.f13221m;
            C6888i.m12437d(qVar, "returnType");
            return qVar;
        }
        if ((iVar.f13217i & 16) == 16) {
            return eVar.mo23845a(iVar.f13222n);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    /* renamed from: M4 */
    public static final C7489j0 m9847M4(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C7481g1 Y = c0Var.mo25056Y();
        if (Y instanceof C7579w) {
            return ((C7579w) Y).f15030i;
        }
        if (Y instanceof C7489j0) {
            return (C7489j0) Y;
        }
        throw new C6766h();
    }

    /* renamed from: N */
    public static final void m9848N(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: N0 */
    public static final C6046e m9849N0(C6021a0 a0Var, C6713a aVar) {
        C6888i.m12438e(a0Var, "<this>");
        C6888i.m12438e(aVar, "classId");
        C6083h O0 = m9855O0(a0Var, aVar);
        if (O0 instanceof C6046e) {
            return (C6046e) O0;
        }
        return null;
    }

    /* renamed from: N1 */
    public static final C7452c0 m9850N1(C6248w0 w0Var) {
        T t;
        C6888i.m12438e(w0Var, "<this>");
        List<C7452c0> upperBounds = w0Var.getUpperBounds();
        C6888i.m12437d(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<C7452c0> upperBounds2 = w0Var.getUpperBounds();
        C6888i.m12437d(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T declarationDescriptor = ((C7452c0) next).mo24887V().getDeclarationDescriptor();
            if (declarationDescriptor instanceof C6046e) {
                t = (C6046e) declarationDescriptor;
            }
            boolean z = false;
            if (!(t == null || t.getKind() == C6051f.INTERFACE || t.getKind() == C6051f.ANNOTATION_CLASS)) {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        C7452c0 c0Var = (C7452c0) t;
        if (c0Var != null) {
            return c0Var;
        }
        List<C7452c0> upperBounds3 = w0Var.getUpperBounds();
        C6888i.m12437d(upperBounds3, "upperBounds");
        Object o = C6790h.m12361o(upperBounds3);
        C6888i.m12437d(o, "upperBounds.first()");
        return (C7452c0) o;
    }

    /* renamed from: N2 */
    public static final boolean m9851N2(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: N3 */
    public static final C6667q m9852N3(C6654n nVar, C6707e eVar) {
        C6888i.m12438e(nVar, "<this>");
        C6888i.m12438e(eVar, "typeTable");
        if (nVar.mo23780w()) {
            C6667q qVar = nVar.f13296m;
            C6888i.m12437d(qVar, "returnType");
            return qVar;
        }
        if ((nVar.f13292i & 16) == 16) {
            return eVar.mo23845a(nVar.f13297n);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: N4 */
    public static final <T> Object m9853N4(C6827f fVar, C6866p<? super C7821y, ? super C6824d<? super T>, ? extends Object> pVar, C6824d<? super T> dVar) {
        Object obj;
        C6827f fVar2 = ((C6838c) dVar).f13768i;
        C6888i.m12436c(fVar2);
        C6827f plus = fVar2.plus(fVar);
        C7819x0 x0Var = (C7819x0) plus.get(C7819x0.f15427f);
        if (x0Var == null || x0Var.mo25307d()) {
            if (plus == fVar2) {
                C7788o oVar = new C7788o(plus, dVar);
                obj = m9970i4(oVar, oVar, pVar);
            } else {
                int i = C6825e.f13750c;
                C6825e.C6826a aVar = C6825e.C6826a.f13751g;
                if (C6888i.m12434a((C6825e) plus.get(aVar), (C6825e) fVar2.get(aVar))) {
                    C7756q1 q1Var = new C7756q1(plus, dVar);
                    Object b = C7791r.m14156b(plus, (Object) null);
                    try {
                        Object i4 = m9970i4(q1Var, q1Var, pVar);
                        C7791r.m14155a(plus, b);
                        obj = i4;
                    } catch (Throwable th) {
                        C7791r.m14155a(plus, b);
                        throw th;
                    }
                } else {
                    C7719f0 f0Var = new C7719f0(plus, dVar);
                    f0Var.mo25301M();
                    m9964h4(pVar, f0Var, f0Var, (C6862l) null, 4);
                    obj = f0Var.mo25367U();
                }
            }
            if (obj == C6833a.COROUTINE_SUSPENDED) {
                C6888i.m12438e(dVar, "frame");
            }
            return obj;
        }
        throw x0Var.mo25334S();
    }

    /* renamed from: O */
    public static final int m9854O(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder v = C0843a.m461v("radix ", i, " was not in valid range ");
        v.append(new C6758d(2, 36));
        throw new IllegalArgumentException(v.toString());
    }

    /* renamed from: O0 */
    public static final C6083h m9855O0(C6021a0 a0Var, C6713a aVar) {
        C6083h hVar;
        C6260d dVar = C6260d.FROM_DESERIALIZATION;
        C6888i.m12438e(a0Var, "<this>");
        C6888i.m12438e(aVar, "classId");
        C6254z<C7211r> zVar = C7212s.f14447a;
        C6888i.m12438e(a0Var, "<this>");
        C7211r rVar = (C7211r) a0Var.mo23089R(C7212s.f14447a);
        C6021a0 a = rVar == null ? null : rVar.mo24885a(a0Var);
        if (a == null) {
            C6714b h = aVar.mo23856h();
            C6888i.m12437d(h, "classId.packageFqName");
            C6073g0 G = a0Var.mo23088G(h);
            List<C6717d> f = aVar.mo23858i().mo23867f();
            C6888i.m12437d(f, "classId.relativeClassName.pathSegments()");
            C7277h memberScope = G.getMemberScope();
            Object o = C6790h.m12361o(f);
            C6888i.m12437d(o, "segments.first()");
            hVar = memberScope.getContributedClassifier((C6717d) o, dVar);
            if (hVar == null) {
                return null;
            }
            for (C6717d next : f.subList(1, f.size())) {
                if (!(hVar instanceof C6046e)) {
                    return null;
                }
                C7277h unsubstitutedInnerClassesScope = ((C6046e) hVar).getUnsubstitutedInnerClassesScope();
                C6888i.m12437d(next, "name");
                C6083h contributedClassifier = unsubstitutedInnerClassesScope.getContributedClassifier(next, dVar);
                if (contributedClassifier instanceof C6046e) {
                    hVar = (C6046e) contributedClassifier;
                    continue;
                } else {
                    hVar = null;
                    continue;
                }
                if (hVar == null) {
                    return null;
                }
            }
        } else {
            C6714b h2 = aVar.mo23856h();
            C6888i.m12437d(h2, "classId.packageFqName");
            C6073g0 G2 = a.mo23088G(h2);
            List<C6717d> f2 = aVar.mo23858i().mo23867f();
            C6888i.m12437d(f2, "classId.relativeClassName.pathSegments()");
            C7277h memberScope2 = G2.getMemberScope();
            Object o2 = C6790h.m12361o(f2);
            C6888i.m12437d(o2, "segments.first()");
            C6083h contributedClassifier2 = memberScope2.getContributedClassifier((C6717d) o2, dVar);
            if (contributedClassifier2 != null) {
                Iterator<C6717d> it = f2.subList(1, f2.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C6717d next2 = it.next();
                    if (contributedClassifier2 instanceof C6046e) {
                        C7277h unsubstitutedInnerClassesScope2 = ((C6046e) contributedClassifier2).getUnsubstitutedInnerClassesScope();
                        C6888i.m12437d(next2, "name");
                        C6083h contributedClassifier3 = unsubstitutedInnerClassesScope2.getContributedClassifier(next2, dVar);
                        if (contributedClassifier3 instanceof C6046e) {
                            contributedClassifier2 = (C6046e) contributedClassifier3;
                            continue;
                        } else {
                            contributedClassifier2 = null;
                            continue;
                        }
                        if (contributedClassifier2 == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            contributedClassifier2 = null;
            if (contributedClassifier2 != null) {
                return contributedClassifier2;
            }
            C6714b h3 = aVar.mo23856h();
            C6888i.m12437d(h3, "classId.packageFqName");
            C6073g0 G3 = a0Var.mo23088G(h3);
            List<C6717d> f3 = aVar.mo23858i().mo23867f();
            C6888i.m12437d(f3, "classId.relativeClassName.pathSegments()");
            C7277h memberScope3 = G3.getMemberScope();
            Object o3 = C6790h.m12361o(f3);
            C6888i.m12437d(o3, "segments.first()");
            C6083h contributedClassifier4 = memberScope3.getContributedClassifier((C6717d) o3, dVar);
            if (contributedClassifier4 == null) {
                return null;
            }
            for (C6717d next3 : f3.subList(1, f3.size())) {
                if (!(hVar instanceof C6046e)) {
                    return null;
                }
                C7277h unsubstitutedInnerClassesScope3 = ((C6046e) hVar).getUnsubstitutedInnerClassesScope();
                C6888i.m12437d(next3, "name");
                C6083h contributedClassifier5 = unsubstitutedInnerClassesScope3.getContributedClassifier(next3, dVar);
                if (contributedClassifier5 instanceof C6046e) {
                    contributedClassifier4 = (C6046e) contributedClassifier5;
                    continue;
                } else {
                    contributedClassifier4 = null;
                    continue;
                }
                if (contributedClassifier4 == null) {
                    return null;
                }
            }
        }
        return hVar;
    }

    /* renamed from: O1 */
    public static C7534h m9856O1(C7492c cVar, C7539m mVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(mVar, "receiver");
        if (mVar instanceof C6248w0) {
            return m9850N1((C6248w0) mVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C6902w.m12460a(mVar.getClass())).toString());
    }

    /* renamed from: O2 */
    public static final <T> Iterator<T> m9857O2(T[] tArr) {
        C6888i.m12438e(tArr, "array");
        return new C6874a(tArr);
    }

    /* renamed from: O3 */
    public static final int m9858O3(C8063x xVar, int i) {
        int i2;
        C6888i.m12438e(xVar, "$this$segment");
        int[] iArr = xVar.f16195m;
        int i3 = i + 1;
        int length = xVar.f16194l.length;
        C6888i.m12438e(iArr, "$this$binarySearch");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* renamed from: O4 */
    public static C7535i m9859O4(C7492c cVar, C7535i iVar, boolean z) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(iVar, "receiver");
        if (iVar instanceof C7489j0) {
            return ((C7489j0) iVar).mo23545Z(z);
        }
        throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
    }

    /* renamed from: P */
    public static final C6328g m9860P(C6328g gVar, C6206k kVar, C6438y yVar, int i, C6764f<C6521x> fVar) {
        C6333k kVar2;
        C6321c cVar = gVar.f12460a;
        if (yVar == null) {
            kVar2 = null;
        } else {
            kVar2 = new C6329h(gVar, kVar, yVar, i);
        }
        if (kVar2 == null) {
            kVar2 = gVar.f12461b;
        }
        return new C6328g(cVar, kVar2, fVar);
    }

    /* renamed from: P0 */
    public static final C6552l m9861P0(C6548k kVar, C6713a aVar) {
        C6888i.m12438e(kVar, "<this>");
        C6888i.m12438e(aVar, "classId");
        C6548k.C6549a c = kVar.mo23332c(aVar);
        if (c == null) {
            return null;
        }
        return c.mo23656a();
    }

    /* renamed from: P1 */
    public static C7534h m9862P1(C7492c cVar, C7534h hVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        if (hVar instanceof C7452c0) {
            C7452c0 c0Var = (C7452c0) hVar;
            int i = C7197i.f14428a;
            C6888i.m12438e(c0Var, "<this>");
            C6888i.m12438e(c0Var, "<this>");
            C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
            if (!(declarationDescriptor instanceof C6046e)) {
                declarationDescriptor = null;
            }
            C6046e eVar = (C6046e) declarationDescriptor;
            C6030b1 e = eVar == null ? null : C7197i.m13053e(eVar);
            if (e == null) {
                return null;
            }
            return C7448b1.m13402d(c0Var).mo25053k(e.mo23093a(), C7484h1.INVARIANT);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: P2 */
    public static final <T, A extends Appendable> A m9863P2(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C6862l<? super T, ? extends CharSequence> lVar) {
        C6888i.m12438e(tArr, "$this$joinTo");
        C6888i.m12438e(a, "buffer");
        C6888i.m12438e(charSequence, "separator");
        C6888i.m12438e(charSequence2, "prefix");
        C6888i.m12438e(charSequence3, "postfix");
        C6888i.m12438e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            m10013q(a, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r4 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r1 = p298d.p334t.C6790h.m12349e0(p298d.p334t.C6790h.m12325L(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        return p298d.p334t.C6790h.m12330Q(r1);
     */
    /* renamed from: P3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m9864P3(java.util.Set<? extends T> r1, T r2, T r3, T r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            java.lang.String r0 = "low"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            java.lang.String r0 = "high"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            if (r5 == 0) goto L_0x0035
            boolean r5 = r1.contains(r2)
            r0 = 0
            if (r5 == 0) goto L_0x001a
            r1 = r2
            goto L_0x0023
        L_0x001a:
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0022
            r1 = r3
            goto L_0x0023
        L_0x0022:
            r1 = r0
        L_0x0023:
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r1, r2)
            if (r2 == 0) goto L_0x0031
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r4, r3)
            if (r2 == 0) goto L_0x0031
            r4 = r0
            goto L_0x0034
        L_0x0031:
            if (r4 != 0) goto L_0x0034
            r4 = r1
        L_0x0034:
            return r4
        L_0x0035:
            if (r4 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            java.util.Set r1 = p298d.p334t.C6790h.m12325L(r1, r4)
            java.util.Set r1 = p298d.p334t.C6790h.m12349e0(r1)
        L_0x0040:
            java.lang.Object r1 = p298d.p334t.C6790h.m12330Q(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9864P3(java.util.Set, java.lang.Object, java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    /* renamed from: P4 */
    public static final C7481g1 m9865P4(C7481g1 g1Var, C7452c0 c0Var) {
        C6888i.m12438e(g1Var, "<this>");
        if (c0Var == null) {
            return g1Var;
        }
        if (g1Var instanceof C7489j0) {
            return new C7526l0((C7489j0) g1Var, c0Var);
        }
        if (g1Var instanceof C7579w) {
            return new C7583y((C7579w) g1Var, c0Var);
        }
        throw new C6766h();
    }

    /* renamed from: Q */
    public static C6328g m9866Q(C6328g gVar, C6072g gVar2, C6438y yVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            yVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C6888i.m12438e(gVar, "<this>");
        C6888i.m12438e(gVar2, "containingDeclaration");
        return m9860P(gVar, gVar2, yVar, i, m9885T2(C6765g.NONE, new C6319a(gVar, gVar2)));
    }

    /* renamed from: Q0 */
    public static final C6046e m9867Q0(C6021a0 a0Var, C6713a aVar, C6025b0 b0Var) {
        C6888i.m12438e(a0Var, "<this>");
        C6888i.m12438e(aVar, "classId");
        C6888i.m12438e(b0Var, "notFoundClasses");
        C6046e N0 = m9849N0(a0Var, aVar);
        return N0 != null ? N0 : b0Var.mo23099a(aVar, C7679s.m13901i(C7679s.m13898f(m9898W0(aVar, C6239t.f12259p), C6241u.f12260g)));
    }

    /* renamed from: Q1 */
    public static C7534h m9868Q1(C7492c cVar, C7537k kVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(kVar, "receiver");
        if (kVar instanceof C7580w0) {
            return ((C7580w0) kVar).mo25161a().mo25056Y();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C6902w.m12460a(kVar.getClass())).toString());
    }

    /* renamed from: Q2 */
    public static String m9869Q2(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C6862l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) != 0 ? "" : charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        String str3 = (i2 & 16) != 0 ? "..." : null;
        C6862l lVar2 = (i2 & 32) != 0 ? null : lVar;
        C6888i.m12438e(objArr, "$this$joinToString");
        C6888i.m12438e(charSequence5, "separator");
        C6888i.m12438e(str, "prefix");
        C6888i.m12438e(str2, "postfix");
        C6888i.m12438e(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        m9863P2(objArr, sb, charSequence5, str, str2, i3, str3, lVar2);
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: Q3 */
    public static final C6451h m9870Q3(Set<? extends C6451h> set, C6451h hVar, boolean z) {
        C6888i.m12438e(set, "<this>");
        C6451h hVar2 = C6451h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (C6451h) m9864P3(set, C6451h.NOT_NULL, C6451h.NULLABLE, hVar, z);
    }

    /* renamed from: Q4 */
    public static C7586z0 m9871Q4(C7586z0 z0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        C6888i.m12438e(z0Var, "<this>");
        if (!(z0Var instanceof C7585z)) {
            return new C7218e(z, z0Var);
        }
        C7585z zVar = (C7585z) z0Var;
        C6248w0[] w0VarArr = zVar.f15035b;
        C7580w0[] w0VarArr2 = zVar.f15036c;
        C6888i.m12438e(w0VarArr2, "$this$zip");
        C6888i.m12438e(w0VarArr, "other");
        int min = Math.min(w0VarArr2.length, w0VarArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i2 = 0; i2 < min; i2++) {
            arrayList.add(new C6768j(w0VarArr2[i2], w0VarArr[i2]));
        }
        ArrayList arrayList2 = new ArrayList(m9892V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6768j jVar = (C6768j) it.next();
            arrayList2.add(m9996n0((C7580w0) jVar.f13681g, (C6248w0) jVar.f13682h));
        }
        Object[] array = arrayList2.toArray(new C7580w0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new C7585z(w0VarArr, (C7580w0[]) array, z);
    }

    /* renamed from: R */
    public static C6328g m9872R(C6328g gVar, C6206k kVar, C6438y yVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C6888i.m12438e(gVar, "<this>");
        C6888i.m12438e(kVar, "containingDeclaration");
        C6888i.m12438e(yVar, "typeParameterOwner");
        return m9860P(gVar, kVar, yVar, i, gVar.f12462c);
    }

    /* renamed from: R0 */
    public static final <T> T m9873R0(T[] tArr) {
        C6888i.m12438e(tArr, "$this$first");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: R1 */
    public static C7539m m9874R1(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            C6083h declarationDescriptor = ((C7567t0) lVar).getDeclarationDescriptor();
            if (declarationDescriptor instanceof C6248w0) {
                return (C6248w0) declarationDescriptor;
            }
            return null;
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: R2 */
    public static final <T> T m9875R2(T[] tArr) {
        C6888i.m12438e(tArr, "$this$last");
        if (!(tArr.length == 0)) {
            return tArr[m9790D1(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: R3 */
    public static final <H> Collection<H> m9876R3(Collection<? extends H> collection, C6862l<? super H, ? extends C6019a> lVar) {
        Object obj;
        C6888i.m12438e(collection, "<this>");
        C6888i.m12438e(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C7644m a = C7644m.C7646b.m13874a();
        while (!linkedList.isEmpty()) {
            Object o = C6790h.m12361o(linkedList);
            C7644m a2 = C7644m.C7646b.m13874a();
            Collection<H> g = C7201m.m13066g(o, linkedList, lVar, new C7210q(a2));
            C6888i.m12437d(g, "val conflictedHandles = SmartSet.create<H>()\n\n        val overridableGroup =\n            OverridingUtil.extractMembersOverridableInBothWays(nextHandle, queue, descriptorByHandle) { conflictedHandles.add(it) }");
            ArrayList arrayList = (ArrayList) g;
            if (arrayList.size() != 1 || !a2.isEmpty()) {
                obj = C7201m.m13074s(g, lVar);
                C6888i.m12437d(obj, "selectMostSpecificMember(overridableGroup, descriptorByHandle)");
                C6019a aVar = (C6019a) lVar.invoke(obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C6888i.m12437d(next, "it");
                    if (!C7201m.m13069k(aVar, (C6019a) lVar.invoke(next))) {
                        a2.add(next);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
            } else {
                obj = C6790h.m12328O(g);
                C6888i.m12437d(obj, "overridableGroup.single()");
            }
            a.add(obj);
        }
        return a;
    }

    /* renamed from: S */
    public static final void m9877S(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m10007p(th, th2);
            }
        }
    }

    /* renamed from: S0 */
    public static final <T> T m9878S0(T[] tArr) {
        C6888i.m12438e(tArr, "$this$firstOrNull");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: S1 */
    public static final Method m9879S1(Class<?> cls, C6023b bVar) {
        C6888i.m12438e(cls, "$this$getUnboxMethod");
        C6888i.m12438e(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C6888i.m12437d(declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C5931l0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    /* renamed from: S2 */
    public static C7819x0 m9880S2(C7821y yVar, C6827f fVar, C7823z zVar, C6866p pVar, int i, Object obj) {
        C7823z zVar2 = null;
        C6832h hVar = (i & 1) != 0 ? C6832h.f13753g : null;
        if ((i & 2) != 0) {
            zVar2 = C7823z.DEFAULT;
        }
        C6827f a = C7769u.m14114a(yVar, hVar);
        Objects.requireNonNull(zVar2);
        C7699a f1Var = zVar2 == C7823z.LAZY ? new C7720f1(a, pVar) : new C7744m1(a, true);
        f1Var.mo25305T(zVar2, f1Var, pVar);
        return f1Var;
    }

    /* renamed from: S3 */
    public static final <T> C7668h<T> m9881S3(T... tArr) {
        C6888i.m12438e(tArr, "elements");
        return tArr.length == 0 ? C7661d.f15173a : m9776B(tArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = m10060x4((r0 = m10003o1(r2)));
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9882T(java.lang.Object r1, p298d.p299a.p300a.p301a.p303y0.p304b.C6023b r2) {
        /*
            java.lang.String r0 = "descriptor"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = r2 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0
            if (r0 == 0) goto L_0x0013
            r0 = r2
            d.a.a.a.y0.b.c1 r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6033c1) r0
            boolean r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13052d(r0)
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            d.a.a.a.y0.l.c0 r0 = m10003o1(r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Class r0 = m10060x4(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.reflect.Method r2 = m9879S1(r0, r2)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r2.invoke(r1, r0)
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9882T(java.lang.Object, d.a.a.a.y0.b.b):java.lang.Object");
    }

    /* renamed from: T0 */
    public static final Set<C6717d> m9883T0(Iterable<? extends C7277h> iterable) {
        C6888i.m12438e(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (C7277h classifierNames : iterable) {
            Set<C6717d> classifierNames2 = classifierNames.getClassifierNames();
            if (classifierNames2 == null) {
                return null;
            }
            C6790h.m12342b(hashSet, classifierNames2);
        }
        return hashSet;
    }

    /* renamed from: T1 */
    public static final <T> Object m9884T1(C7437i iVar, C6736l lVar) {
        C6888i.m12438e(iVar, "<this>");
        C6888i.m12438e(lVar, "p");
        return iVar.invoke();
    }

    /* renamed from: T2 */
    public static final <T> C6764f<T> m9885T2(C6765g gVar, C6851a<? extends T> aVar) {
        C6888i.m12438e(gVar, "mode");
        C6888i.m12438e(aVar, "initializer");
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return new C6772m(aVar, (Object) null, 2);
        }
        if (ordinal == 1) {
            return new C6771l(aVar);
        }
        if (ordinal == 2) {
            return new C6778s(aVar);
        }
        throw new C6766h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r3 = r3.mo22975w();
     */
    /* renamed from: T3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m9886T3(p298d.p299a.C6725d<?> r3, boolean r4) {
        /*
            java.lang.String r0 = "$this$isAccessible"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            boolean r0 = r3 instanceof p298d.p299a.C6730i
            java.lang.String r1 = "$this$javaGetter"
            if (r0 == 0) goto L_0x0039
            r0 = r3
            d.a.l r0 = (p298d.p299a.C6736l) r0
            java.lang.reflect.Field r2 = m10039u1(r0)
            if (r2 == 0) goto L_0x0017
            r2.setAccessible(r4)
        L_0x0017:
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            d.a.l$b r0 = r0.mo22961b()
            java.lang.reflect.Method r0 = m10045v1(r0)
            if (r0 == 0) goto L_0x0027
            r0.setAccessible(r4)
        L_0x0027:
            d.a.i r3 = (p298d.p299a.C6730i) r3
            java.lang.String r0 = "$this$javaSetter"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            d.a.i$a r3 = r3.mo23048c()
            java.lang.reflect.Method r3 = m10045v1(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x008f
        L_0x0039:
            boolean r0 = r3 instanceof p298d.p299a.C6736l
            if (r0 == 0) goto L_0x0056
            d.a.l r3 = (p298d.p299a.C6736l) r3
            java.lang.reflect.Field r0 = m10039u1(r3)
            if (r0 == 0) goto L_0x0048
            r0.setAccessible(r4)
        L_0x0048:
            p298d.p344x.p346c.C6888i.m12438e(r3, r1)
            d.a.l$b r3 = r3.mo22961b()
            java.lang.reflect.Method r3 = m10045v1(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x008f
        L_0x0056:
            boolean r0 = r3 instanceof p298d.p299a.C6736l.C6738b
            if (r0 == 0) goto L_0x0073
            r0 = r3
            d.a.l$b r0 = (p298d.p299a.C6736l.C6738b) r0
            d.a.l r0 = r0.mo22964n()
            java.lang.reflect.Field r0 = m10039u1(r0)
            if (r0 == 0) goto L_0x006a
            r0.setAccessible(r4)
        L_0x006a:
            d.a.h r3 = (p298d.p299a.C6729h) r3
            java.lang.reflect.Method r3 = m10045v1(r3)
            if (r3 == 0) goto L_0x00e7
            goto L_0x008f
        L_0x0073:
            boolean r0 = r3 instanceof p298d.p299a.C6730i.C6731a
            if (r0 == 0) goto L_0x0093
            r0 = r3
            d.a.i$a r0 = (p298d.p299a.C6730i.C6731a) r0
            d.a.l r0 = r0.mo22964n()
            java.lang.reflect.Field r0 = m10039u1(r0)
            if (r0 == 0) goto L_0x0087
            r0.setAccessible(r4)
        L_0x0087:
            d.a.h r3 = (p298d.p299a.C6729h) r3
            java.lang.reflect.Method r3 = m10045v1(r3)
            if (r3 == 0) goto L_0x00e7
        L_0x008f:
            r3.setAccessible(r4)
            goto L_0x00e7
        L_0x0093:
            boolean r0 = r3 instanceof p298d.p299a.C6729h
            if (r0 == 0) goto L_0x00e8
            r0 = r3
            d.a.h r0 = (p298d.p299a.C6729h) r0
            java.lang.reflect.Method r1 = m10045v1(r0)
            if (r1 == 0) goto L_0x00a3
            r1.setAccessible(r4)
        L_0x00a3:
            d.a.a.a.g r3 = p298d.p299a.p300a.p301a.C5970v0.m10806a(r3)
            r1 = 0
            if (r3 == 0) goto L_0x00b5
            d.a.a.a.x0.h r3 = r3.mo22975w()
            if (r3 == 0) goto L_0x00b5
            java.lang.reflect.Member r3 = r3.mo23070b()
            goto L_0x00b6
        L_0x00b5:
            r3 = r1
        L_0x00b6:
            boolean r2 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r2 != 0) goto L_0x00bb
            r3 = r1
        L_0x00bb:
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3
            if (r3 == 0) goto L_0x00c3
            r2 = 1
            r3.setAccessible(r2)
        L_0x00c3:
            java.lang.String r3 = "$this$javaConstructor"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            d.a.a.a.g r3 = p298d.p299a.p300a.p301a.C5970v0.m10806a(r0)
            if (r3 == 0) goto L_0x00d9
            d.a.a.a.x0.h r3 = r3.mo22973u()
            if (r3 == 0) goto L_0x00d9
            java.lang.reflect.Member r3 = r3.mo23070b()
            goto L_0x00da
        L_0x00d9:
            r3 = r1
        L_0x00da:
            boolean r0 = r3 instanceof java.lang.reflect.Constructor
            if (r0 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r1 = r3
        L_0x00e0:
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 == 0) goto L_0x00e7
            r1.setAccessible(r4)
        L_0x00e7:
            return
        L_0x00e8:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown callable: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9886T3(d.a.d, boolean):void");
    }

    /* renamed from: U */
    public static final void m9887U(C6035d0 d0Var, C6714b bVar, Collection<C6032c0> collection) {
        C6888i.m12438e(d0Var, "<this>");
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(collection, "packageFragments");
        if (d0Var instanceof C6052f0) {
            ((C6052f0) d0Var).collectPackageFragments(bVar, collection);
        } else {
            collection.addAll(d0Var.getPackageFragments(bVar));
        }
    }

    /* renamed from: U0 */
    public static final <T> C7668h<T> m9888U0(C7668h<? extends C7668h<? extends T>> hVar) {
        C6888i.m12438e(hVar, "$this$flatten");
        C7671k kVar = C7671k.f15193g;
        if (!(hVar instanceof C7683u)) {
            return new C7664f(hVar, C7672l.f15194g, kVar);
        }
        C7683u uVar = (C7683u) hVar;
        C6888i.m12438e(kVar, "iterator");
        return new C7664f(uVar.f15206a, uVar.f15207b, kVar);
    }

    /* renamed from: U1 */
    public static C7542p m9889U1(C7492c cVar, C7537k kVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(kVar, "receiver");
        if (kVar instanceof C7580w0) {
            C7484h1 b = ((C7580w0) kVar).mo25162b();
            C6888i.m12437d(b, "this.projectionKind");
            return m9960h0(b);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C6902w.m12460a(kVar.getClass())).toString());
    }

    /* renamed from: U2 */
    public static final <T> C6764f<T> m9890U2(C6851a<? extends T> aVar) {
        C6888i.m12438e(aVar, "initializer");
        return new C6772m(aVar, (Object) null, 2);
    }

    /* renamed from: U3 */
    public static final <T> Set<T> m9891U3(T t) {
        Set<T> singleton = Collections.singleton(t);
        C6888i.m12437d(singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    /* renamed from: V */
    public static final <T> int m9892V(Iterable<? extends T> iterable, int i) {
        C6888i.m12438e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: V0 */
    public static final String m9893V0(long j) {
        StringBuilder sb;
        long j2;
        StringBuilder sb2;
        long j3;
        StringBuilder sb3;
        long j4;
        if (j <= ((long) -999500000)) {
            sb = new StringBuilder();
            j2 = j - ((long) 500000000);
        } else {
            if (j <= ((long) -999500)) {
                sb2 = new StringBuilder();
                j3 = j - ((long) 500000);
            } else {
                if (j <= 0) {
                    sb3 = new StringBuilder();
                    j4 = j - ((long) 500);
                } else if (j < ((long) 999500)) {
                    sb3 = new StringBuilder();
                    j4 = j + ((long) 500);
                } else if (j < ((long) 999500000)) {
                    sb2 = new StringBuilder();
                    j3 = j + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j2 = j + ((long) 500000000);
                }
                sb3.append(j4 / ((long) 1000));
                sb3.append(" µs");
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
                C6888i.m12437d(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb3.append(j3 / ((long) 1000000));
            sb3.append(" ms");
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
            C6888i.m12437d(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb3.append(j2 / ((long) Utils.SECOND_IN_NANOS));
        sb3.append(" s ");
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb3.toString()}, 1));
        C6888i.m12437d(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0136  */
    /* renamed from: V1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6708f> m9894V1(p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7344h r21) {
        /*
            java.lang.String r0 = "this"
            r1 = r21
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            d.a.a.a.y0.g.p r0 = r21.mo24956t()
            d.a.a.a.y0.e.z.c r2 = r21.mo24952S()
            d.a.a.a.y0.e.z.g r1 = r21.mo24951P()
            java.lang.String r3 = "proto"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)
            java.lang.String r3 = "nameResolver"
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            java.lang.String r4 = "table"
            p298d.p344x.p346c.C6888i.m12438e(r1, r4)
            boolean r5 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p326e.C6621c
            if (r5 == 0) goto L_0x002b
            d.a.a.a.y0.e.c r0 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6621c) r0
            java.util.List<java.lang.Integer> r0 = r0.f13084A
            goto L_0x004e
        L_0x002b:
            boolean r5 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p326e.C6625d
            if (r5 == 0) goto L_0x0034
            d.a.a.a.y0.e.d r0 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6625d) r0
            java.util.List<java.lang.Integer> r0 = r0.f13139l
            goto L_0x004e
        L_0x0034:
            boolean r5 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p326e.C6643i
            if (r5 == 0) goto L_0x003d
            d.a.a.a.y0.e.i r0 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6643i) r0
            java.util.List<java.lang.Integer> r0 = r0.f13228t
            goto L_0x004e
        L_0x003d:
            boolean r5 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p326e.C6654n
            if (r5 == 0) goto L_0x0046
            d.a.a.a.y0.e.n r0 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6654n) r0
            java.util.List<java.lang.Integer> r0 = r0.f13304u
            goto L_0x004e
        L_0x0046:
            boolean r5 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p326e.C6674r
            if (r5 == 0) goto L_0x014f
            d.a.a.a.y0.e.r r0 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6674r) r0
            java.util.List<java.lang.Integer> r0 = r0.f13420r
        L_0x004e:
            java.lang.String r5 = "ids"
            p298d.p344x.p346c.C6888i.m12437d(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x005c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x014e
            java.lang.Object r6 = r0.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.String r7 = "id"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            int r6 = r6.intValue()
            p298d.p344x.p346c.C6888i.m12438e(r2, r3)
            p298d.p344x.p346c.C6888i.m12438e(r1, r4)
            java.util.List<d.a.a.a.y0.e.v> r7 = r1.f13609a
            java.lang.Object r6 = p298d.p334t.C6790h.m12365s(r7, r6)
            d.a.a.a.y0.e.v r6 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6687v) r6
            if (r6 != 0) goto L_0x0084
            r7 = 0
            goto L_0x0147
        L_0x0084:
            int r8 = r6.f13491h
            r9 = 1
            r8 = r8 & r9
            r10 = 0
            if (r8 != r9) goto L_0x008d
            r8 = r9
            goto L_0x008e
        L_0x008d:
            r8 = r10
        L_0x008e:
            if (r8 == 0) goto L_0x0097
            int r8 = r6.f13492i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0098
        L_0x0097:
            r8 = 0
        L_0x0098:
            int r11 = r6.f13491h
            r12 = 2
            r11 = r11 & r12
            if (r11 != r12) goto L_0x00a0
            r11 = r9
            goto L_0x00a1
        L_0x00a0:
            r11 = r10
        L_0x00a1:
            if (r11 == 0) goto L_0x00aa
            int r11 = r6.f13493j
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00ab
        L_0x00aa:
            r11 = 0
        L_0x00ab:
            r13 = 16
            r14 = 8
            if (r11 == 0) goto L_0x00cc
            d.a.a.a.y0.e.z.f$a r8 = new d.a.a.a.y0.e.z.f$a
            int r15 = r11.intValue()
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r16 = r11.intValue()
            int r7 = r16 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r11 = r11.intValue()
            int r11 = r11 >> r13
            r11 = r11 & 255(0xff, float:3.57E-43)
            r8.<init>(r15, r7, r11)
            goto L_0x00ee
        L_0x00cc:
            if (r8 == 0) goto L_0x00ec
            d.a.a.a.y0.e.z.f$a r7 = new d.a.a.a.y0.e.z.f$a
            int r11 = r8.intValue()
            r11 = r11 & 7
            int r15 = r8.intValue()
            int r15 = r15 >> 3
            r15 = r15 & 15
            int r8 = r8.intValue()
            int r8 = r8 >> 7
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r7.<init>(r11, r15, r8)
            r16 = r7
            goto L_0x00f0
        L_0x00ec:
            d.a.a.a.y0.e.z.f$a r8 = p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6708f.C6709a.f13603e
        L_0x00ee:
            r16 = r8
        L_0x00f0:
            d.a.a.a.y0.e.v$c r7 = r6.f13494k
            p298d.p344x.p346c.C6888i.m12436c(r7)
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x010b
            if (r7 == r9) goto L_0x0108
            if (r7 != r12) goto L_0x0102
            d.b r7 = p298d.C6760b.HIDDEN
            goto L_0x010d
        L_0x0102:
            d.h r0 = new d.h
            r0.<init>()
            throw r0
        L_0x0108:
            d.b r7 = p298d.C6760b.ERROR
            goto L_0x010d
        L_0x010b:
            d.b r7 = p298d.C6760b.WARNING
        L_0x010d:
            r18 = r7
            int r7 = r6.f13491h
            r7 = r7 & r14
            if (r7 != r14) goto L_0x0116
            r7 = r9
            goto L_0x0117
        L_0x0116:
            r7 = r10
        L_0x0117:
            if (r7 == 0) goto L_0x0122
            int r7 = r6.f13495l
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r19 = r7
            goto L_0x0124
        L_0x0122:
            r19 = 0
        L_0x0124:
            int r7 = r6.f13491h
            r7 = r7 & r13
            if (r7 != r13) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r9 = r10
        L_0x012b:
            if (r9 == 0) goto L_0x0136
            int r7 = r6.f13496m
            java.lang.String r7 = r2.mo23725a(r7)
            r20 = r7
            goto L_0x0138
        L_0x0136:
            r20 = 0
        L_0x0138:
            d.a.a.a.y0.e.z.f r7 = new d.a.a.a.y0.e.z.f
            d.a.a.a.y0.e.v$d r6 = r6.f13497n
            java.lang.String r8 = "info.versionKind"
            p298d.p344x.p346c.C6888i.m12437d(r6, r8)
            r15 = r7
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20)
        L_0x0147:
            if (r7 == 0) goto L_0x005c
            r5.add(r7)
            goto L_0x005c
        L_0x014e:
            return r5
        L_0x014f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "Unexpected declaration: "
            java.lang.String r0 = p298d.p344x.p346c.C6888i.m12444k(r2, r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9894V1(d.a.a.a.y0.j.b.f0.h):java.util.List");
    }

    /* renamed from: V2 */
    public static <T> C5941o0<T> m9895V2(C6851a<T> aVar) {
        return new C5941o0<>(aVar);
    }

    /* renamed from: V3 */
    public static final boolean m9896V3(C6498t tVar) {
        C6888i.m12438e(tVar, "<this>");
        return tVar != C6498t.INFLEXIBLE;
    }

    /* renamed from: W */
    public static final <T> List<T> m9897W(ArrayList<T> arrayList) {
        C6888i.m12438e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C6798p.f13713g;
        }
        if (size == 1) {
            return m9910Y2(C6790h.m12361o(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* renamed from: W0 */
    public static final <T> C7668h<T> m9898W0(T t, C6862l<? super T, ? extends T> lVar) {
        C6888i.m12438e(lVar, "nextFunction");
        return t == null ? C7661d.f15173a : new C7666g(new C7674n(t), lVar);
    }

    /* renamed from: W1 */
    public static C6050e1 m9899W1(C6172a0 a0Var) {
        C6888i.m12438e(a0Var, "this");
        int t = a0Var.mo23339t();
        return Modifier.isPublic(t) ? C6036d1.C6044h.f11886c : Modifier.isPrivate(t) ? C6036d1.C6041e.f11883c : Modifier.isProtected(t) ? Modifier.isStatic(t) ? C6156c.f12172c : C6155b.f12171c : C6154a.f12170c;
    }

    /* renamed from: W2 */
    public static <T> C5939n0<T> m9900W2(T t, C6851a<T> aVar) {
        if (aVar != null) {
            return new C5939n0<>(t, aVar);
        }
        m9917a(1);
        throw null;
    }

    /* renamed from: W3 */
    public static final String m9901W3(C6565s sVar, C6046e eVar, String str) {
        String str2;
        C6888i.m12438e(sVar, "<this>");
        C6888i.m12438e(eVar, "classDescriptor");
        C6888i.m12438e(str, "jvmDescriptor");
        C6888i.m12438e(eVar, "<this>");
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        C6715c j = C7255a.m13135h(eVar).mo23872j();
        C6888i.m12437d(j, "fqNameSafe.toUnsafe()");
        C6713a mapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(j);
        if (mapKotlinToJava == null) {
            str2 = m9924b0(eVar, C6567u.f12857a);
        } else {
            str2 = JvmClassName.byClassId(mapKotlinToJava).getInternalName();
            C6888i.m12437d(str2, "byClassId(it).internalName");
        }
        return sVar.mo23671i(str2, str);
    }

    /* renamed from: X */
    public static final <T extends Comparable<?>> int m9902X(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: X0 */
    public static final <T> C7668h<T> m9903X0(C6851a<? extends T> aVar) {
        C6888i.m12438e(aVar, "nextFunction");
        C7666g gVar = new C7666g(aVar, new C7673m(aVar));
        C6888i.m12438e(gVar, "$this$constrainOnce");
        return gVar instanceof C7657a ? gVar : new C7657a(gVar);
    }

    /* renamed from: X1 */
    public static final void m9904X1(C6827f fVar, Throwable th) {
        try {
            int i = CoroutineExceptionHandler.f15235e;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.C7698a.f15236g);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                C7818x.m14213a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                m10007p(runtimeException, th);
                th = runtimeException;
            }
            C7818x.m14213a(fVar, th);
        }
    }

    /* renamed from: X2 */
    public static <T> C5939n0<T> m9905X2(C6851a<T> aVar) {
        return m9900W2((Object) null, aVar);
    }

    /* renamed from: X3 */
    public static final char m9906X3(char[] cArr) {
        C6888i.m12438e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: Y */
    public static final C6060h m9907Y(C6060h hVar, C6060h hVar2) {
        C6888i.m12438e(hVar, "first");
        C6888i.m12438e(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        if (hVar2.isEmpty()) {
            return hVar;
        }
        return new C6066k(hVar, hVar2);
    }

    /* renamed from: Y0 */
    public static C7537k m9908Y0(C7540n nVar, C7536j jVar, int i) {
        C6888i.m12438e(nVar, "this");
        C6888i.m12438e(jVar, "receiver");
        if (jVar instanceof C7535i) {
            return nVar.mo25116j((C7534h) jVar, i);
        }
        if (jVar instanceof C7527a) {
            Object obj = ((C7527a) jVar).get(i);
            C6888i.m12437d(obj, "get(index)");
            return (C7537k) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + C6902w.m12460a(jVar.getClass())).toString());
    }

    /* renamed from: Y1 */
    public static boolean m9909Y1(C6060h hVar, C6714b bVar) {
        C6888i.m12438e(hVar, "this");
        C6888i.m12438e(bVar, "fqName");
        return hVar.mo23168j(bVar) != null;
    }

    /* renamed from: Y2 */
    public static final <T> List<T> m9910Y2(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C6888i.m12437d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: Y3 */
    public static final <T> T m9911Y3(T[] tArr) {
        C6888i.m12438e(tArr, "$this$single");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: Z */
    public static final List<C6248w0> m9912Z(C6152i iVar) {
        List<C6248w0> list;
        C6206k kVar;
        C7567t0 typeConstructor;
        C6888i.m12438e(iVar, "<this>");
        List<C6248w0> declaredTypeParameters = iVar.getDeclaredTypeParameters();
        C6888i.m12437d(declaredTypeParameters, "declaredTypeParameters");
        if (!iVar.isInner() && !(iVar.getContainingDeclaration() instanceof C6019a)) {
            return declaredTypeParameters;
        }
        C7668h<C6206k> l = C7255a.m13139l(iVar);
        C6250x0 x0Var = C6250x0.f12262g;
        C6888i.m12438e(l, "$this$takeWhile");
        C6888i.m12438e(x0Var, "predicate");
        List i = C7679s.m13901i(C7679s.m13897e(C7679s.m13895c(new C7681t(l, x0Var), C6253y0.f12269g), C6255z0.f12271g));
        Iterator<C6206k> it = C7255a.m13139l(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                kVar = null;
                break;
            }
            kVar = it.next();
            if (kVar instanceof C6046e) {
                break;
            }
        }
        C6046e eVar = (C6046e) kVar;
        if (!(eVar == null || (typeConstructor = eVar.getTypeConstructor()) == null)) {
            list = typeConstructor.getParameters();
        }
        if (list == null) {
            list = C6798p.f13713g;
        }
        if (!i.isEmpty() || !list.isEmpty()) {
            List<T> I = C6790h.m12322I(i, list);
            ArrayList arrayList = new ArrayList(m9892V(I, 10));
            for (T t : I) {
                C6888i.m12437d(t, "it");
                arrayList.add(new C6031c(t, iVar, declaredTypeParameters.size()));
            }
            return C6790h.m12322I(declaredTypeParameters, arrayList);
        }
        List<C6248w0> declaredTypeParameters2 = iVar.getDeclaredTypeParameters();
        C6888i.m12437d(declaredTypeParameters2, "declaredTypeParameters");
        return declaredTypeParameters2;
    }

    /* renamed from: Z0 */
    public static final <T extends Annotation> C6726e<? extends T> m9913Z0(T t) {
        C6888i.m12438e(t, "$this$annotationClass");
        Class<? extends Annotation> annotationType = t.annotationType();
        C6888i.m12437d(annotationType, "(this as java.lang.annot…otation).annotationType()");
        C6726e<? extends T> C1 = m9784C1(annotationType);
        Objects.requireNonNull(C1, "null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        return C1;
    }

    /* renamed from: Z1 */
    public static boolean m9914Z1(C7492c cVar, C7534h hVar, C6714b bVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        C6888i.m12438e(bVar, "fqName");
        if (hVar instanceof C7452c0) {
            return ((C7452c0) hVar).getAnnotations().mo23169v(bVar);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: Z2 */
    public static final C7639l<C7277h> m9915Z2(Iterable<? extends C7277h> iterable) {
        C6888i.m12438e(iterable, "scopes");
        C7639l<C7277h> lVar = new C7639l<>();
        for (Object next : iterable) {
            C7277h hVar = (C7277h) next;
            if ((hVar == null || hVar == C7277h.C7280b.f14521b) ? false : true) {
                lVar.add(next);
            }
        }
        return lVar;
    }

    /* renamed from: Z3 */
    public static final C8064y m9916Z3(Socket socket) {
        Logger logger = C8053p.f16164a;
        C6888i.m12438e(socket, "$this$sink");
        C8065z zVar = new C8065z(socket);
        OutputStream outputStream = socket.getOutputStream();
        C6888i.m12437d(outputStream, "getOutputStream()");
        C8056r rVar = new C8056r(outputStream, zVar);
        C6888i.m12438e(rVar, "sink");
        return new C8036c(zVar, rVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m9917a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r3.mo25085n(r4) != false) goto L_0x002b;
     */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h m9918a0(p298d.p299a.p300a.p301a.p303y0.p405l.C7453c1 r3, p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h r4, java.util.HashSet<p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7538l> r5) {
        /*
            d.a.a.a.y0.l.l1.l r0 = r3.mo25084l(r4)
            boolean r1 = r5.add(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            d.a.a.a.y0.l.l1.m r1 = r3.mo25062p(r0)
            if (r1 == 0) goto L_0x0032
            d.a.a.a.y0.l.l1.h r0 = r3.mo25061h(r1)
            d.a.a.a.y0.l.l1.h r5 = m9918a0(r3, r0, r5)
            if (r5 != 0) goto L_0x001e
            r4 = r2
            goto L_0x0061
        L_0x001e:
            boolean r0 = r3.mo25118o(r5)
            if (r0 != 0) goto L_0x0030
            boolean r4 = r3.mo25085n(r4)
            if (r4 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            d.a.a.a.y0.l.l1.h r4 = r3.mo25063w(r5)
            goto L_0x0061
        L_0x0030:
            r4 = r5
            goto L_0x0061
        L_0x0032:
            boolean r0 = r3.mo25059f(r0)
            if (r0 == 0) goto L_0x0061
            d.a.a.a.y0.l.l1.h r0 = r3.mo25060g(r4)
            if (r0 != 0) goto L_0x003f
            return r2
        L_0x003f:
            d.a.a.a.y0.l.l1.h r5 = m9918a0(r3, r0, r5)
            if (r5 != 0) goto L_0x0046
            return r2
        L_0x0046:
            boolean r0 = r3.mo25118o(r4)
            if (r0 != 0) goto L_0x004d
            goto L_0x0030
        L_0x004d:
            boolean r0 = r3.mo25118o(r5)
            if (r0 == 0) goto L_0x0054
            goto L_0x0061
        L_0x0054:
            boolean r0 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i
            if (r0 == 0) goto L_0x002b
            r0 = r5
            d.a.a.a.y0.l.l1.i r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i) r0
            boolean r0 = r3.mo25126y(r0)
            if (r0 == 0) goto L_0x002b
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9918a0(d.a.a.a.y0.l.c1, d.a.a.a.y0.l.l1.h, java.util.HashSet):d.a.a.a.y0.l.l1.h");
    }

    /* renamed from: a1 */
    public static C6030b1 m9919a1(C6717d dVar, C6046e eVar) {
        if (dVar == null) {
            m9929c(19);
            throw null;
        } else if (eVar != null) {
            Collection<C6034d> constructors = eVar.getConstructors();
            if (constructors.size() != 1) {
                return null;
            }
            for (C6030b1 next : constructors.iterator().next().getValueParameters()) {
                if (next.getName().equals(dVar)) {
                    return next;
                }
            }
            return null;
        } else {
            m9929c(20);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* renamed from: a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m9920a2(p298d.p299a.p300a.p301a.p303y0.p304b.C6046e r12, p298d.p299a.p300a.p301a.p303y0.p304b.C6019a r13) {
        /*
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r12, r0)
            java.lang.String r0 = "specialCallableDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            d.a.a.a.y0.b.k r13 = r13.getContainingDeclaration()
            d.a.a.a.y0.b.e r13 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r13
            d.a.a.a.y0.l.j0 r13 = r13.getDefaultType()
            java.lang.String r0 = "specialCallableDescriptor.containingDeclaration as ClassDescriptor).defaultType"
            p298d.p344x.p346c.C6888i.m12437d(r13, r0)
        L_0x0019:
            d.a.a.a.y0.b.e r12 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13032l(r12)
            r0 = 0
            if (r12 == 0) goto L_0x015d
            boolean r1 = r12 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6307d
            if (r1 != 0) goto L_0x0019
            d.a.a.a.y0.l.j0 r1 = r12.getDefaultType()
            r2 = 0
            if (r1 == 0) goto L_0x0159
            r3 = 3
            d.a.a.a.y0.l.h1 r4 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.INVARIANT
            java.lang.String r5 = "subtype"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            java.lang.String r5 = "supertype"
            p298d.p344x.p346c.C6888i.m12438e(r13, r5)
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            d.a.a.a.y0.l.j1.o r6 = new d.a.a.a.y0.l.j1.o
            r6.<init>(r1, r2)
            r5.add(r6)
            d.a.a.a.y0.l.t0 r1 = r13.mo24887V()
        L_0x0049:
            boolean r6 = r5.isEmpty()
            r7 = 1
            if (r6 != 0) goto L_0x014e
            java.lang.Object r6 = r5.poll()
            d.a.a.a.y0.l.j1.o r6 = (p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7509o) r6
            d.a.a.a.y0.l.c0 r8 = r6.f14952a
            d.a.a.a.y0.l.t0 r9 = r8.mo24887V()
            if (r9 == 0) goto L_0x014a
            if (r1 == 0) goto L_0x0145
            boolean r10 = r9.equals(r1)
            if (r10 == 0) goto L_0x0123
            boolean r5 = r8.mo23566W()
        L_0x006a:
            d.a.a.a.y0.l.j1.o r6 = r6.f14953b
            if (r6 == 0) goto L_0x00df
            d.a.a.a.y0.l.c0 r9 = r6.f14952a
            java.util.List r10 = r9.mo24886U()
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x007f
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x007f
            goto L_0x009c
        L_0x007f:
            java.util.Iterator r10 = r10.iterator()
        L_0x0083:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009c
            java.lang.Object r11 = r10.next()
            d.a.a.a.y0.l.w0 r11 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r11
            d.a.a.a.y0.l.h1 r11 = r11.mo25162b()
            if (r11 == r4) goto L_0x0097
            r11 = r7
            goto L_0x0098
        L_0x0097:
            r11 = r0
        L_0x0098:
            if (r11 == 0) goto L_0x0083
            r10 = r7
            goto L_0x009d
        L_0x009c:
            r10 = r0
        L_0x009d:
            if (r10 == 0) goto L_0x00bf
            d.a.a.a.y0.l.v0$a r10 = p298d.p299a.p300a.p301a.p303y0.p405l.C7577v0.f15028b
            d.a.a.a.y0.l.z0 r10 = r10.mo25186a(r9)
            d.a.a.a.y0.l.z0 r10 = m9871Q4(r10, r0, r7)
            d.a.a.a.y0.l.b1 r10 = r10.mo25194c()
            d.a.a.a.y0.l.c0 r8 = r10.mo25052i(r8, r4)
            java.lang.String r10 = "TypeConstructorSubstitution.create(currentType)\n                            .wrapWithCapturingSubstitution().buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)"
            p298d.p344x.p346c.C6888i.m12437d(r8, r10)
            d.a.a.a.y0.l.n1.a r8 = m10019r(r8)
            T r8 = r8.f14987b
            d.a.a.a.y0.l.c0 r8 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r8
            goto L_0x00d2
        L_0x00bf:
            d.a.a.a.y0.l.v0$a r10 = p298d.p299a.p300a.p301a.p303y0.p405l.C7577v0.f15028b
            d.a.a.a.y0.l.z0 r10 = r10.mo25186a(r9)
            d.a.a.a.y0.l.b1 r10 = r10.mo25194c()
            d.a.a.a.y0.l.c0 r8 = r10.mo25052i(r8, r4)
            java.lang.String r10 = "{\n                    TypeConstructorSubstitution.create(currentType)\n                            .buildSubstitutor()\n                            .safeSubstitute(substituted, Variance.INVARIANT)\n                }"
            p298d.p344x.p346c.C6888i.m12437d(r8, r10)
        L_0x00d2:
            if (r5 != 0) goto L_0x00dd
            boolean r5 = r9.mo23566W()
            if (r5 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r5 = r0
            goto L_0x006a
        L_0x00dd:
            r5 = r7
            goto L_0x006a
        L_0x00df:
            d.a.a.a.y0.l.t0 r4 = r8.mo24887V()
            if (r4 == 0) goto L_0x011f
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x00f0
            d.a.a.a.y0.l.c0 r2 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13444j(r8, r5)
            goto L_0x014e
        L_0x00f0:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r13 = "Type constructors should be equals!\nsubstitutedSuperType: "
            java.lang.StringBuilder r13 = p005b.p035e.p036a.p037a.C0843a.m460u(r13)
            java.lang.String r0 = m9783C0(r4)
            r13.append(r0)
            java.lang.String r0 = ", \n\nsupertype: "
            r13.append(r0)
            java.lang.String r0 = m9783C0(r1)
            r13.append(r0)
            java.lang.String r0 = " \n"
            r13.append(r0)
            boolean r0 = r4.equals(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x011f:
            p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7510p.m13624a(r3)
            throw r2
        L_0x0123:
            java.util.Collection r7 = r9.getSupertypes()
            java.util.Iterator r7 = r7.iterator()
        L_0x012b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0049
            java.lang.Object r8 = r7.next()
            d.a.a.a.y0.l.c0 r8 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r8
            d.a.a.a.y0.l.j1.o r9 = new d.a.a.a.y0.l.j1.o
            java.lang.String r10 = "immediateSupertype"
            p298d.p344x.p346c.C6888i.m12437d(r8, r10)
            r9.<init>(r8, r6)
            r5.add(r9)
            goto L_0x012b
        L_0x0145:
            r12 = 4
            p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7510p.m13624a(r12)
            throw r2
        L_0x014a:
            p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7510p.m13624a(r3)
            throw r2
        L_0x014e:
            if (r2 == 0) goto L_0x0151
            r0 = r7
        L_0x0151:
            if (r0 == 0) goto L_0x0019
            boolean r12 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(r12)
            r12 = r12 ^ r7
            return r12
        L_0x0159:
            p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7511q.m13625a(r0)
            throw r2
        L_0x015d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9920a2(d.a.a.a.y0.b.e, d.a.a.a.y0.b.a):boolean");
    }

    /* renamed from: a3 */
    public static C7535i m9921a3(C7492c cVar, C7532f fVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(fVar, "receiver");
        if (fVar instanceof C7579w) {
            return ((C7579w) fVar).f15029h;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C6902w.m12460a(fVar.getClass())).toString());
    }

    /* renamed from: a4 */
    public static int m9922a4(C7540n nVar, C7536j jVar) {
        C6888i.m12438e(nVar, "this");
        C6888i.m12438e(jVar, "receiver");
        if (jVar instanceof C7535i) {
            return nVar.mo25111b((C7534h) jVar);
        }
        if (jVar instanceof C7527a) {
            return ((C7527a) jVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + C6902w.m12460a(jVar.getClass())).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ void m9923b(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b0 */
    public static final String m9924b0(C6046e eVar, C6566t<?> tVar) {
        C6888i.m12438e(eVar, "klass");
        C6888i.m12438e(tVar, "typeMappingConfiguration");
        String e = tVar.mo23676e(eVar);
        if (e != null) {
            return e;
        }
        C6206k containingDeclaration = eVar.getContainingDeclaration();
        C6888i.m12437d(containingDeclaration, "klass.containingDeclaration");
        C6717d name = eVar.getName();
        C6717d dVar = C6719f.f13626a;
        if (name == null || name.f13624h) {
            name = C6719f.f13628c;
        }
        C6046e eVar2 = null;
        if (name != null) {
            String i = name.mo23889i();
            C6888i.m12437d(i, "safeIdentifier(klass.name).identifier");
            if (containingDeclaration instanceof C6032c0) {
                C6714b fqName = ((C6032c0) containingDeclaration).getFqName();
                if (fqName.mo23864d()) {
                    return i;
                }
                StringBuilder sb = new StringBuilder();
                String b = fqName.mo23862b();
                C6888i.m12437d(b, "fqName.asString()");
                sb.append(C7694h.m13943u(b, '.', '/', false, 4));
                sb.append('/');
                sb.append(i);
                return sb.toString();
            }
            if (containingDeclaration instanceof C6046e) {
                eVar2 = (C6046e) containingDeclaration;
            }
            if (eVar2 != null) {
                String a = tVar.mo23672a(eVar2);
                if (a == null) {
                    a = m9924b0(eVar2, tVar);
                }
                return a + '$' + i;
            }
            throw new IllegalArgumentException("Unexpected container: " + containingDeclaration + " for " + eVar);
        }
        C6719f.m12275a(0);
        throw null;
    }

    /* renamed from: b1 */
    public static List<C6177c> m9925b1(C6183f fVar) {
        C6888i.m12438e(fVar, "this");
        AnnotatedElement d = fVar.mo23364d();
        Annotation[] declaredAnnotations = d == null ? null : d.getDeclaredAnnotations();
        return declaredAnnotations == null ? C6798p.f13713g : m9931c1(declaredAnnotations);
    }

    /* renamed from: b2 */
    public static final boolean m9926b2(C6643i iVar) {
        C6888i.m12438e(iVar, "<this>");
        return iVar.mo23764t() || iVar.mo23765v();
    }

    /* renamed from: b3 */
    public static C7535i m9927b3(C7540n nVar, C7534h hVar) {
        C6888i.m12438e(nVar, "this");
        C6888i.m12438e(hVar, "receiver");
        C7532f r = nVar.mo25120r(hVar);
        if (r != null) {
            return nVar.mo25125x(r);
        }
        C7535i a = nVar.mo25110a(hVar);
        C6888i.m12436c(a);
        return a;
    }

    /* renamed from: b4 */
    public static final <T> void m9928b4(List<T> list, Comparator<? super T> comparator) {
        C6888i.m12438e(list, "$this$sortWith");
        C6888i.m12438e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m9929c(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 18 ? 3 : 2)];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 18 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r4v7, types: [d.a.a.a.y0.d.a.t] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v8, types: [d.a.a.a.y0.d.a.t] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6521x m9930c0(p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g r13, p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h r14) {
        /*
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r13, r0)
            java.lang.String r0 = "additionalAnnotations"
            p298d.p344x.p346c.C6888i.m12438e(r14, r0)
            d.a.a.a.y0.d.a.h0.c r0 = r13.f12460a
            d.a.a.a.y0.n.i r0 = r0.f12449v
            boolean r0 = r0.f15129h
            if (r0 == 0) goto L_0x0017
            d.a.a.a.y0.d.a.x r13 = r13.mo23470a()
            return r13
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0020:
            boolean r1 = r14.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x019c
            java.lang.Object r1 = r14.next()
            d.a.a.a.y0.b.f1.c r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c) r1
            d.a.a.a.y0.n.k r5 = p298d.p299a.p300a.p301a.p303y0.p412n.C7638k.IGNORE
            d.a.a.a.y0.d.a.h0.c r6 = r13.f12460a
            d.a.a.a.y0.d.a.c r6 = r6.f12444q
            java.util.Objects.requireNonNull(r6)
            java.lang.String r7 = "annotationDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r1, r7)
            d.a.a.a.y0.n.i r8 = r6.f12334a
            boolean r8 = r8.f15129h
            if (r8 == 0) goto L_0x0044
            goto L_0x0073
        L_0x0044:
            java.util.Map<d.a.a.a.y0.f.b, d.a.a.a.y0.d.a.t> r8 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6266b.f12331g
            d.a.a.a.y0.f.b r9 = r1.getFqName()
            java.lang.Object r8 = r8.get(r9)
            d.a.a.a.y0.d.a.t r8 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6514t) r8
            if (r8 != 0) goto L_0x0053
            goto L_0x0073
        L_0x0053:
            java.util.Map<d.a.a.a.y0.f.b, d.a.a.a.y0.d.a.t> r9 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6266b.f12330f
            d.a.a.a.y0.f.b r10 = r1.getFqName()
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L_0x0064
            d.a.a.a.y0.n.i r9 = r6.f12334a
            d.a.a.a.y0.n.k r9 = r9.f15126e
            goto L_0x0068
        L_0x0064:
            d.a.a.a.y0.n.k r9 = r6.mo23447b(r1)
        L_0x0068:
            if (r9 == r5) goto L_0x006c
            r10 = r3
            goto L_0x006d
        L_0x006c:
            r10 = r2
        L_0x006d:
            if (r10 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r9 = r4
        L_0x0071:
            if (r9 != 0) goto L_0x0075
        L_0x0073:
            r11 = r4
            goto L_0x0092
        L_0x0075:
            d.a.a.a.y0.d.a.k0.i r10 = r8.f12759a
            boolean r9 = r9.mo25204d()
            d.a.a.a.y0.d.a.k0.i r9 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i.m11509a(r10, r4, r9, r3)
            java.util.Collection<d.a.a.a.y0.d.a.a> r10 = r8.f12760b
            boolean r8 = r8.f12761c
            java.lang.String r11 = "nullabilityQualifier"
            p298d.p344x.p346c.C6888i.m12438e(r9, r11)
            java.lang.String r11 = "qualifierApplicabilityTypes"
            p298d.p344x.p346c.C6888i.m12438e(r10, r11)
            d.a.a.a.y0.d.a.t r11 = new d.a.a.a.y0.d.a.t
            r11.<init>(r9, r10, r8)
        L_0x0092:
            if (r11 != 0) goto L_0x0194
            p298d.p344x.p346c.C6888i.m12438e(r1, r7)
            d.a.a.a.y0.n.i r7 = r6.f12334a
            boolean r7 = r7.f15128g
            if (r7 == 0) goto L_0x009f
            goto L_0x0149
        L_0x009f:
            d.a.a.a.y0.b.e r7 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13132e(r1)
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b3
        L_0x00a6:
            d.a.a.a.y0.b.f1.h r8 = r7.getAnnotations()
            d.a.a.a.y0.f.b r9 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6266b.f12327c
            boolean r8 = r8.mo23169v(r9)
            if (r8 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r7 = r4
        L_0x00b4:
            if (r7 != 0) goto L_0x00b8
            goto L_0x0149
        L_0x00b8:
            d.a.a.a.y0.b.e r8 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13132e(r1)
            p298d.p344x.p346c.C6888i.m12436c(r8)
            d.a.a.a.y0.b.f1.h r8 = r8.getAnnotations()
            d.a.a.a.y0.f.b r9 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6266b.f12327c
            d.a.a.a.y0.b.f1.c r8 = r8.mo23168j(r9)
            p298d.p344x.p346c.C6888i.m12436c(r8)
            java.util.Map r8 = r8.mo23163b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00dd:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x010a
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            d.a.a.a.y0.f.d r11 = (p298d.p299a.p300a.p301a.p303y0.p331f.C6717d) r11
            java.lang.Object r10 = r10.getValue()
            d.a.a.a.y0.i.v.g r10 = (p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g) r10
            d.a.a.a.y0.f.d r12 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z.f12770b
            boolean r11 = p298d.p344x.p346c.C6888i.m12434a(r11, r12)
            if (r11 == 0) goto L_0x0104
            d.a.a.a.y0.d.a.d r11 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6272d.f12339g
            java.util.List r10 = r6.mo23446a(r10, r11)
            goto L_0x0106
        L_0x0104:
            d.t.p r10 = p298d.p334t.C6798p.f13713g
        L_0x0106:
            p298d.p334t.C6790h.m12342b(r9, r10)
            goto L_0x00dd
        L_0x010a:
            java.util.Iterator r8 = r9.iterator()
            r9 = r2
        L_0x010f:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0123
            java.lang.Object r10 = r8.next()
            d.a.a.a.y0.d.a.a r10 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a) r10
            int r10 = r10.ordinal()
            int r10 = r3 << r10
            r9 = r9 | r10
            goto L_0x010f
        L_0x0123:
            d.a.a.a.y0.b.f1.h r7 = r7.getAnnotations()
            java.util.Iterator r7 = r7.iterator()
        L_0x012b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0144
            java.lang.Object r8 = r7.next()
            r10 = r8
            d.a.a.a.y0.b.f1.c r10 = (p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c) r10
            d.a.a.a.y0.b.f1.c r10 = r6.mo23449d(r10)
            if (r10 == 0) goto L_0x0140
            r10 = r3
            goto L_0x0141
        L_0x0140:
            r10 = r2
        L_0x0141:
            if (r10 == 0) goto L_0x012b
            goto L_0x0145
        L_0x0144:
            r8 = r4
        L_0x0145:
            d.a.a.a.y0.b.f1.c r8 = (p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c) r8
            if (r8 != 0) goto L_0x014b
        L_0x0149:
            r7 = r4
            goto L_0x0150
        L_0x014b:
            d.a.a.a.y0.d.a.c$a r7 = new d.a.a.a.y0.d.a.c$a
            r7.<init>(r8, r9)
        L_0x0150:
            if (r7 != 0) goto L_0x0153
            goto L_0x0195
        L_0x0153:
            d.a.a.a.y0.b.f1.c r8 = r7.f12336a
            java.util.List r7 = r7.mo23450a()
            d.a.a.a.y0.n.k r1 = r6.mo23448c(r1)
            if (r1 != 0) goto L_0x0163
            d.a.a.a.y0.n.k r1 = r6.mo23447b(r8)
        L_0x0163:
            java.util.Objects.requireNonNull(r1)
            if (r1 != r5) goto L_0x016a
            r5 = r3
            goto L_0x016b
        L_0x016a:
            r5 = r2
        L_0x016b:
            if (r5 == 0) goto L_0x016e
            goto L_0x0195
        L_0x016e:
            d.a.a.a.y0.d.a.h0.c r5 = r13.f12460a
            d.a.a.a.y0.d.a.h0.d r5 = r5.f12447t
            boolean r5 = r5.mo23466b()
            d.a.a.a.y0.d.a.h0.c r6 = r13.f12460a
            d.a.a.a.y0.d.a.k0.l r6 = r6.f12445r
            d.a.a.a.y0.d.a.k0.i r5 = r6.mo23578b(r8, r5, r2)
            if (r5 != 0) goto L_0x0182
            r1 = r4
            goto L_0x018a
        L_0x0182:
            boolean r1 = r1.mo25204d()
            d.a.a.a.y0.d.a.k0.i r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i.m11509a(r5, r4, r1, r3)
        L_0x018a:
            if (r1 != 0) goto L_0x018d
            goto L_0x0195
        L_0x018d:
            d.a.a.a.y0.d.a.t r4 = new d.a.a.a.y0.d.a.t
            r3 = 4
            r4.<init>(r1, r7, r2, r3)
            goto L_0x0195
        L_0x0194:
            r4 = r11
        L_0x0195:
            if (r4 == 0) goto L_0x0020
            r0.add(r4)
            goto L_0x0020
        L_0x019c:
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L_0x01a7
            d.a.a.a.y0.d.a.x r13 = r13.mo23470a()
            return r13
        L_0x01a7:
            d.a.a.a.y0.d.a.x r14 = r13.mo23470a()
            if (r14 != 0) goto L_0x01ae
            goto L_0x01b8
        L_0x01ae:
            java.util.EnumMap<d.a.a.a.y0.d.a.a, d.a.a.a.y0.d.a.t> r14 = r14.f12766a
            if (r14 != 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            java.util.EnumMap r4 = new java.util.EnumMap
            r4.<init>(r14)
        L_0x01b8:
            if (r4 != 0) goto L_0x01c1
            java.util.EnumMap r4 = new java.util.EnumMap
            java.lang.Class<d.a.a.a.y0.d.a.a> r14 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a.class
            r4.<init>(r14)
        L_0x01c1:
            java.util.Iterator r14 = r0.iterator()
        L_0x01c5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r0 = r14.next()
            d.a.a.a.y0.d.a.t r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6514t) r0
            java.util.Collection<d.a.a.a.y0.d.a.a> r1 = r0.f12760b
            java.util.Iterator r1 = r1.iterator()
        L_0x01d7:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01c5
            java.lang.Object r2 = r1.next()
            d.a.a.a.y0.d.a.a r2 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a) r2
            r4.put(r2, r0)
            r2 = r3
            goto L_0x01d7
        L_0x01e8:
            if (r2 != 0) goto L_0x01ef
            d.a.a.a.y0.d.a.x r13 = r13.mo23470a()
            goto L_0x01f4
        L_0x01ef:
            d.a.a.a.y0.d.a.x r13 = new d.a.a.a.y0.d.a.x
            r13.<init>(r4)
        L_0x01f4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9930c0(d.a.a.a.y0.d.a.h0.g, d.a.a.a.y0.b.f1.h):d.a.a.a.y0.d.a.x");
    }

    /* renamed from: c1 */
    public static final List<C6177c> m9931c1(Annotation[] annotationArr) {
        C6888i.m12438e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation cVar : annotationArr) {
            arrayList.add(new C6177c(cVar));
        }
        return arrayList;
    }

    /* renamed from: c2 */
    public static final boolean m9932c2(C6654n nVar) {
        C6888i.m12438e(nVar, "<this>");
        return nVar.mo23778t() || nVar.mo23779v();
    }

    /* renamed from: c3 */
    public static final C7489j0 m9933c3(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C7481g1 Y = c0Var.mo25056Y();
        if (Y instanceof C7579w) {
            return ((C7579w) Y).f15029h;
        }
        if (Y instanceof C7489j0) {
            return (C7489j0) Y;
        }
        throw new C6766h();
    }

    /* renamed from: c4 */
    public static final <T> List<T> m9934c4(T[] tArr, Comparator<? super T> comparator) {
        C6888i.m12438e(tArr, "$this$sortedWith");
        C6888i.m12438e(comparator, "comparator");
        C6888i.m12438e(tArr, "$this$sortedArrayWith");
        C6888i.m12438e(comparator, "comparator");
        if (!(tArr.length == 0)) {
            tArr = Arrays.copyOf(tArr, tArr.length);
            C6888i.m12437d(tArr, "java.util.Arrays.copyOf(this, size)");
            C6888i.m12438e(tArr, "$this$sortWith");
            C6888i.m12438e(comparator, "comparator");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return C6790h.m12344c(tArr);
    }

    /* renamed from: d */
    public static /* synthetic */ void m9935d(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 23 || i == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: d0 */
    public static final <T> Collection<T> m9936d0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C6888i.m12438e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: d1 */
    public static C7537k m9937d1(C7492c cVar, C7534h hVar, int i) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        if (hVar instanceof C7452c0) {
            return ((C7452c0) hVar).mo24886U().get(i);
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: d2 */
    public static boolean m9938d2(C7492c cVar, C7535i iVar, C7535i iVar2) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(iVar, "a");
        C6888i.m12438e(iVar2, "b");
        if (!(iVar instanceof C7489j0)) {
            throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
        } else if (iVar2 instanceof C7489j0) {
            return ((C7489j0) iVar).mo24886U() == ((C7489j0) iVar2).mo24886U();
        } else {
            throw new IllegalArgumentException(C0843a.m457r(iVar2, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar2, ", ")).toString());
        }
    }

    /* renamed from: d3 */
    public static final C7452c0 m9939d3(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C7452c0 i = C7460d1.m13443i(c0Var);
        C6888i.m12437d(i, "makeNotNullable(this)");
        return i;
    }

    /* renamed from: d4 */
    public static final C8030a0 m9940d4(InputStream inputStream) {
        Logger logger = C8053p.f16164a;
        C6888i.m12438e(inputStream, "$this$source");
        return new C8052o(inputStream, new C8034b0());
    }

    /* renamed from: e */
    public static /* synthetic */ void m9941e(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: e0 */
    public static final boolean m9942e0(C7452c0 c0Var, C6862l<? super C7481g1, Boolean> lVar) {
        C6888i.m12438e(c0Var, "<this>");
        C6888i.m12438e(lVar, "predicate");
        return C7460d1.m13437c(c0Var, lVar);
    }

    /* renamed from: e1 */
    public static final int m9943e1(C5986h<?> hVar) {
        C6888i.m12438e(hVar, "$this$arity");
        return hVar.mo23069a().size();
    }

    /* renamed from: e2 */
    public static <N> Boolean m9944e2(Collection<N> collection, C7624c<N> cVar, C6862l<N, Boolean> lVar) {
        if (cVar != null) {
            return (Boolean) m9807G0(collection, cVar, new C7622a(lVar, new boolean[1]));
        }
        m9947f(8);
        throw null;
    }

    /* renamed from: e3 */
    public static final C7452c0 m9945e3(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C7452c0 j = C7460d1.m13444j(c0Var, true);
        C6888i.m12437d(j, "makeNullable(this)");
        return j;
    }

    /* renamed from: e4 */
    public static final C8030a0 m9946e4(Socket socket) {
        Logger logger = C8053p.f16164a;
        C6888i.m12438e(socket, "$this$source");
        C8065z zVar = new C8065z(socket);
        InputStream inputStream = socket.getInputStream();
        C6888i.m12437d(inputStream, "getInputStream()");
        C8052o oVar = new C8052o(inputStream, zVar);
        C6888i.m12438e(oVar, "source");
        return new C8039d(zVar, oVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m9947f(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: f0 */
    public static final <T> boolean m9948f0(T[] tArr, T t) {
        C6888i.m12438e(tArr, "$this$contains");
        return m9974j2(tArr, t) >= 0;
    }

    /* renamed from: f1 */
    public static final Object m9949f1(C5885c0.C5886a<?, ?> aVar) {
        C6888i.m12438e(aVar, "$this$boundReceiver");
        C5885c0<?> B = aVar.mo22963B();
        return m9882T(B.f11672o, B.mo22976x());
    }

    /* renamed from: f2 */
    public static int m9950f2(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: f3 */
    public static C7534h m9951f3(C7492c cVar, C7534h hVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        C7535i a = cVar.mo25110a(hVar);
        return a == null ? hVar : cVar.mo25114e(a, true);
    }

    /* renamed from: f4 */
    public static final C7452c0 m9952f4(C6248w0 w0Var) {
        C6888i.m12438e(w0Var, "<this>");
        List<C6248w0> parameters = ((C6152i) w0Var.getContainingDeclaration()).getTypeConstructor().getParameters();
        C6888i.m12437d(parameters, "classDescriptor.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(m9892V(parameters, 10));
        for (C6248w0 typeConstructor : parameters) {
            arrayList.add(typeConstructor.getTypeConstructor());
        }
        C7448b1 e = C7448b1.m13403e(new C7557p0(arrayList));
        List<C7452c0> upperBounds = w0Var.getUpperBounds();
        C6888i.m12437d(upperBounds, "this.upperBounds");
        C7452c0 k = e.mo25053k((C7452c0) C6790h.m12361o(upperBounds), C7484h1.OUT_VARIANCE);
        if (k != null) {
            return k;
        }
        C7489j0 defaultBound = C7255a.m13133f(w0Var).getDefaultBound();
        C6888i.m12437d(defaultBound, "builtIns.defaultBound");
        return defaultBound;
    }

    /* renamed from: g */
    public static final C7821y m9953g(C6827f fVar) {
        if (fVar.get(C7819x0.f15427f) == null) {
            fVar = fVar.plus(m9959h((C7819x0) null, 1, (Object) null));
        }
        return new C7774d(fVar);
    }

    /* renamed from: g0 */
    public static final <T> Collection<T> m9954g0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C6888i.m12438e(iterable, "$this$convertToSetForSetOperationWith");
        C6888i.m12438e(iterable2, "source");
        if (!(iterable instanceof Set)) {
            if (iterable instanceof Collection) {
                if (((Collection) iterable2).size() >= 2) {
                    Collection<T> collection = (Collection) iterable;
                    if (!(collection.size() > 2 && (collection instanceof ArrayList))) {
                        return collection;
                    }
                }
            }
            return C6790h.m12335V(iterable);
        }
        return (Collection) iterable;
    }

    /* renamed from: g1 */
    public static final KotlinBuiltIns m9955g1(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        KotlinBuiltIns builtIns = c0Var.mo24887V().getBuiltIns();
        C6888i.m12437d(builtIns, "constructor.builtIns");
        return builtIns;
    }

    /* renamed from: g2 */
    public static int m9956g2(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: g3 */
    public static final int m9957g3(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: g4 */
    public static final void m9958g4(C6824d<? super C6777r> dVar, C6824d<?> dVar2) {
        try {
            C7776f.m14130b(m9986l2(dVar), C6777r.f13694a, (C6862l) null, 2);
        } catch (Throwable th) {
            ((C7699a) dVar2).mo24166c(m10038u0(th));
        }
    }

    /* renamed from: h */
    public static C7748o m9959h(C7819x0 x0Var, int i, Object obj) {
        int i2 = i & 1;
        return new C7701a1((C7819x0) null);
    }

    /* renamed from: h0 */
    public static final C7542p m9960h0(C7484h1 h1Var) {
        C6888i.m12438e(h1Var, "<this>");
        int ordinal = h1Var.ordinal();
        if (ordinal == 0) {
            return C7542p.INV;
        }
        if (ordinal == 1) {
            return C7542p.IN;
        }
        if (ordinal == 2) {
            return C7542p.OUT;
        }
        throw new C6766h();
    }

    /* renamed from: h1 */
    public static float[] m9961h1(RectF rectF) {
        return new float[]{rectF.centerX(), rectF.centerY()};
    }

    /* renamed from: h2 */
    public static int m9962h2(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                return m9950f2(b, bArr[i]);
            }
            if (i3 == 2) {
                return m9956g2(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* renamed from: h3 */
    public static final <K, V> Map<K, V> m9963h3(C6768j<? extends K, ? extends V> jVar) {
        C6888i.m12438e(jVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jVar.f13681g, jVar.f13682h);
        C6888i.m12437d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: h4 */
    public static void m9964h4(C6866p pVar, Object obj, C6824d dVar, C6862l lVar, int i) {
        int i2 = i & 4;
        try {
            C7776f.m14129a(m9986l2(m10002o0(pVar, obj, dVar)), C6777r.f13694a, (C6862l<? super Throwable, C6777r>) null);
        } catch (Throwable th) {
            dVar.mo24166c(m10038u0(th));
        }
    }

    /* renamed from: i */
    public static final C6714b m9965i(C6714b bVar, String str) {
        C6714b c = bVar.mo23863c(C6717d.m12270l(str));
        C6888i.m12437d(c, "child(Name.identifier(name))");
        return c;
    }

    /* renamed from: i0 */
    public static final void m9966i0(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(C0843a.m447h("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    /* renamed from: i1 */
    public static C6715c m9967i1(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            C6083h declarationDescriptor = ((C7567t0) lVar).getDeclarationDescriptor();
            Objects.requireNonNull(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return C7255a.m13136i((C6046e) declarationDescriptor);
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: i2 */
    public static final int m9968i2(int[] iArr, int i) {
        C6888i.m12438e(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        r5 = m9967i1(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
        if (r6 != false) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m9969i3(p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0 r19, p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6546i r20, p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6568v r21, p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6566t r22, p298d.p344x.p345b.C6867q r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = "kotlinType"
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)
            java.lang.String r5 = "factory"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            java.lang.String r5 = "mode"
            p298d.p344x.p346c.C6888i.m12438e(r2, r5)
            java.lang.String r6 = "typeMappingConfiguration"
            p298d.p344x.p346c.C6888i.m12438e(r3, r6)
            java.lang.String r6 = "writeGenericType"
            p298d.p344x.p346c.C6888i.m12438e(r4, r6)
            d.a.a.a.y0.l.c0 r6 = r3.mo23673b(r0)
            if (r6 != 0) goto L_0x0291
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(r19)
            if (r6 == 0) goto L_0x003c
            boolean r5 = r22.mo23674c()
            d.a.a.a.y0.l.j0 r0 = kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(r0, r5)
            java.lang.Object r0 = m9969i3(r0, r1, r2, r3, r4)
            return r0
        L_0x003c:
            d.a.a.a.y0.l.j1.n r6 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7508n.f14951a
            java.lang.String r7 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r6, r7)
            java.lang.String r8 = "type"
            p298d.p344x.p346c.C6888i.m12438e(r0, r8)
            java.lang.String r9 = "typeFactory"
            p298d.p344x.p346c.C6888i.m12438e(r1, r9)
            p298d.p344x.p346c.C6888i.m12438e(r2, r5)
            d.a.a.a.y0.l.l1.l r5 = m9829J4(r6, r0)
            boolean r9 = m10022r2(r6, r5)
            r10 = 0
            java.lang.String r11 = "possiblyPrimitiveType"
            java.lang.String r12 = "["
            r13 = 0
            r14 = 1
            if (r9 != 0) goto L_0x0063
            goto L_0x0106
        L_0x0063:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r9 = m9838L1(r6, r5)
            if (r9 == 0) goto L_0x0099
            java.lang.Object r5 = r1.mo23652f(r9)
            boolean r9 = m9797E2(r6, r0)
            if (r9 != 0) goto L_0x0089
            p298d.p344x.p346c.C6888i.m12438e(r6, r7)
            p298d.p344x.p346c.C6888i.m12438e(r0, r8)
            d.a.a.a.y0.f.b r8 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z.f12783o
            java.lang.String r9 = "ENHANCED_NULLABILITY_ANNOTATION"
            p298d.p344x.p346c.C6888i.m12437d(r8, r9)
            boolean r6 = m9914Z1(r6, r0, r8)
            if (r6 == 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r6 = r13
            goto L_0x008a
        L_0x0089:
            r6 = r14
        L_0x008a:
            p298d.p344x.p346c.C6888i.m12438e(r1, r7)
            p298d.p344x.p346c.C6888i.m12438e(r5, r11)
            if (r6 == 0) goto L_0x0096
            java.lang.Object r5 = r1.mo23650d(r5)
        L_0x0096:
            r10 = r5
            goto L_0x0106
        L_0x0099:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r8 = m9832K1(r6, r5)
            if (r8 == 0) goto L_0x00b0
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get((kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) r8)
            java.lang.String r5 = r5.getDesc()
            java.lang.String r5 = p298d.p344x.p346c.C6888i.m12444k(r12, r5)
            java.lang.Object r10 = r1.mo23647a(r5)
            goto L_0x0106
        L_0x00b0:
            boolean r8 = m9833K2(r6, r5)
            if (r8 == 0) goto L_0x0106
            d.a.a.a.y0.f.c r5 = m9967i1(r6, r5)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap r6 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE
            d.a.a.a.y0.f.a r5 = r6.mapKotlinToJava(r5)
            if (r5 == 0) goto L_0x0106
            boolean r8 = r2.f12867g
            if (r8 != 0) goto L_0x00f5
            java.util.List r6 = r6.getMutabilityMappings()
            boolean r8 = r6 instanceof java.util.Collection
            if (r8 == 0) goto L_0x00d5
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x00d5
            goto L_0x00f1
        L_0x00d5:
            java.util.Iterator r6 = r6.iterator()
        L_0x00d9:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00f1
            java.lang.Object r8 = r6.next()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap$PlatformMutabilityMapping r8 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping) r8
            d.a.a.a.y0.f.a r8 = r8.getJavaClass()
            boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r8, r5)
            if (r8 == 0) goto L_0x00d9
            r6 = r14
            goto L_0x00f2
        L_0x00f1:
            r6 = r13
        L_0x00f2:
            if (r6 == 0) goto L_0x00f5
            goto L_0x0106
        L_0x00f5:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.byClassId(r5)
            java.lang.String r5 = r5.getInternalName()
            java.lang.String r6 = "byClassId(classId).internalName"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            java.lang.Object r10 = r1.mo23648b(r5)
        L_0x0106:
            if (r10 != 0) goto L_0x027f
            d.a.a.a.y0.l.t0 r5 = r19.mo24887V()
            boolean r6 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7443a0
            if (r6 == 0) goto L_0x0125
            d.a.a.a.y0.l.a0 r5 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7443a0) r5
            d.a.a.a.y0.l.c0 r0 = r5.f14858a
            if (r0 != 0) goto L_0x011c
            java.util.LinkedHashSet<d.a.a.a.y0.l.c0> r0 = r5.f14859b
            d.a.a.a.y0.l.c0 r0 = r3.mo23678g(r0)
        L_0x011c:
            d.a.a.a.y0.l.c0 r0 = m9786C3(r0)
            java.lang.Object r0 = m9969i3(r0, r1, r2, r3, r4)
            return r0
        L_0x0125:
            d.a.a.a.y0.b.h r5 = r5.getDeclarationDescriptor()
            if (r5 == 0) goto L_0x0273
            boolean r6 = p298d.p299a.p300a.p301a.p303y0.p405l.C7570v.m13789j(r5)
            if (r6 == 0) goto L_0x013d
            java.lang.String r2 = "error/NonExistentClass"
            java.lang.Object r1 = r1.mo23648b(r2)
            d.a.a.a.y0.b.e r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r5
            r3.mo23677f(r0, r5)
            return r1
        L_0x013d:
            boolean r6 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r6 == 0) goto L_0x01b6
            boolean r8 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(r19)
            if (r8 == 0) goto L_0x01b6
            java.util.List r5 = r19.mo24886U()
            int r5 = r5.size()
            if (r5 != r14) goto L_0x01ae
            java.util.List r0 = r19.mo24886U()
            java.lang.Object r0 = r0.get(r13)
            d.a.a.a.y0.l.w0 r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0) r0
            d.a.a.a.y0.l.c0 r5 = r0.mo25161a()
            java.lang.String r6 = "memberProjection.type"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            d.a.a.a.y0.l.h1 r6 = r0.mo25162b()
            d.a.a.a.y0.l.h1 r7 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.IN_VARIANCE
            if (r6 != r7) goto L_0x0173
            java.lang.String r0 = "java/lang/Object"
            java.lang.Object r0 = r1.mo23648b(r0)
            goto L_0x01a1
        L_0x0173:
            d.a.a.a.y0.l.h1 r0 = r0.mo25162b()
            java.lang.String r6 = "memberProjection.projectionKind"
            p298d.p344x.p346c.C6888i.m12437d(r0, r6)
            java.lang.String r6 = "effectiveVariance"
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)
            boolean r6 = r2.f12863c
            if (r6 == 0) goto L_0x0186
            goto L_0x019c
        L_0x0186:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0198
            if (r0 == r14) goto L_0x0193
            d.a.a.a.y0.d.b.v r0 = r2.f12866f
            if (r0 != 0) goto L_0x019d
            goto L_0x019c
        L_0x0193:
            d.a.a.a.y0.d.b.v r0 = r2.f12868h
            if (r0 != 0) goto L_0x019d
            goto L_0x019c
        L_0x0198:
            d.a.a.a.y0.d.b.v r0 = r2.f12869i
            if (r0 != 0) goto L_0x019d
        L_0x019c:
            r0 = r2
        L_0x019d:
            java.lang.Object r0 = m9969i3(r5, r1, r0, r3, r4)
        L_0x01a1:
            java.lang.String r0 = r1.mo23649c(r0)
            java.lang.String r0 = p298d.p344x.p346c.C6888i.m12444k(r12, r0)
            java.lang.Object r0 = r1.mo23647a(r0)
            return r0
        L_0x01ae:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "arrays must have one type argument"
            r0.<init>(r1)
            throw r0
        L_0x01b6:
            if (r6 == 0) goto L_0x0243
            boolean r6 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13050b(r5)
            if (r6 == 0) goto L_0x01fb
            boolean r6 = r2.f12862b
            if (r6 != 0) goto L_0x01fb
            d.a.a.a.y0.l.j1.n r6 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7508n.f14951a
            p298d.p344x.p346c.C6888i.m12438e(r6, r7)
            java.lang.String r7 = "inlineClassType"
            p298d.p344x.p346c.C6888i.m12438e(r0, r7)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            d.a.a.a.y0.l.l1.h r6 = m9918a0(r6, r0, r7)
            d.a.a.a.y0.l.c0 r6 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r6
            if (r6 == 0) goto L_0x01fb
            d.a.a.a.y0.d.b.v r0 = new d.a.a.a.y0.d.b.v
            boolean r8 = r2.f12861a
            boolean r10 = r2.f12863c
            boolean r11 = r2.f12864d
            boolean r12 = r2.f12865e
            d.a.a.a.y0.d.b.v r13 = r2.f12866f
            boolean r14 = r2.f12867g
            d.a.a.a.y0.d.b.v r15 = r2.f12868h
            d.a.a.a.y0.d.b.v r2 = r2.f12869i
            r9 = 1
            r17 = 0
            r18 = 512(0x200, float:7.175E-43)
            r7 = r0
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = m9969i3(r6, r1, r0, r3, r4)
            return r0
        L_0x01fb:
            boolean r6 = r2.f12863c
            if (r6 == 0) goto L_0x020d
            r6 = r5
            d.a.a.a.y0.b.e r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r6
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isKClass(r6)
            if (r6 == 0) goto L_0x020d
            java.lang.Object r1 = r20.mo23651e()
            goto L_0x023f
        L_0x020d:
            d.a.a.a.y0.b.e r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r5
            d.a.a.a.y0.b.e r6 = r5.getOriginal()
            java.lang.String r7 = "descriptor.original"
            p298d.p344x.p346c.C6888i.m12437d(r6, r7)
            java.lang.Object r6 = r3.mo23675d(r6)
            if (r6 != 0) goto L_0x023e
            d.a.a.a.y0.b.f r6 = r5.getKind()
            d.a.a.a.y0.b.f r7 = p298d.p299a.p300a.p301a.p303y0.p304b.C6051f.ENUM_ENTRY
            if (r6 != r7) goto L_0x022c
            d.a.a.a.y0.b.k r5 = r5.getContainingDeclaration()
            d.a.a.a.y0.b.e r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r5
        L_0x022c:
            d.a.a.a.y0.b.e r5 = r5.getOriginal()
            java.lang.String r6 = "enumClassIfEnumEntry.original"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            java.lang.String r3 = m9924b0(r5, r3)
            java.lang.Object r1 = r1.mo23648b(r3)
            goto L_0x023f
        L_0x023e:
            r1 = r6
        L_0x023f:
            r4.mo22971j(r0, r1, r2)
            return r1
        L_0x0243:
            boolean r6 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0
            if (r6 == 0) goto L_0x0254
            d.a.a.a.y0.b.w0 r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r5
            d.a.a.a.y0.l.c0 r0 = m9850N1(r5)
            d.x.b.q<java.lang.Object, java.lang.Object, java.lang.Object, d.r> r4 = p298d.p299a.p300a.p301a.p303y0.p412n.C7628g.f15113b
            java.lang.Object r0 = m9969i3(r0, r1, r2, r3, r4)
            return r0
        L_0x0254:
            boolean r6 = r5 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0
            if (r6 == 0) goto L_0x0267
            boolean r6 = r2.f12870j
            if (r6 == 0) goto L_0x0267
            d.a.a.a.y0.b.v0 r5 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0) r5
            d.a.a.a.y0.l.j0 r0 = r5.mo23434L()
            java.lang.Object r0 = m9969i3(r0, r1, r2, r3, r4)
            return r0
        L_0x0267:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Unknown type "
            java.lang.String r0 = p298d.p344x.p346c.C6888i.m12444k(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0273:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "no descriptor for type constructor of "
            java.lang.String r0 = p298d.p344x.p346c.C6888i.m12444k(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x027f:
            boolean r3 = r2.f12861a
            p298d.p344x.p346c.C6888i.m12438e(r1, r7)
            p298d.p344x.p346c.C6888i.m12438e(r10, r11)
            if (r3 == 0) goto L_0x028d
            java.lang.Object r10 = r1.mo23650d(r10)
        L_0x028d:
            r4.mo22971j(r0, r10, r2)
            return r10
        L_0x0291:
            java.lang.Object r0 = m9969i3(r6, r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9969i3(d.a.a.a.y0.l.c0, d.a.a.a.y0.d.b.i, d.a.a.a.y0.d.b.v, d.a.a.a.y0.d.b.t, d.x.b.q):java.lang.Object");
    }

    /* renamed from: i4 */
    public static final <T, R> Object m9970i4(C7788o<? super T> oVar, R r, C6866p<? super R, ? super C6824d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object x;
        oVar.mo25301M();
        if (pVar != null) {
            try {
                C6905z.m12473b(pVar, 2);
                obj = pVar.invoke(r, oVar);
            } catch (Throwable th) {
                obj = new C7754q(th, false, 2);
            }
            C6833a aVar = C6833a.COROUTINE_SUSPENDED;
            if (obj == aVar || (x = oVar.mo25352x(obj)) == C7714d1.f15258b) {
                return aVar;
            }
            if (!(x instanceof C7754q)) {
                return C7714d1.m14023a(x);
            }
            throw ((C7754q) x).f15306a;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    /* renamed from: j */
    public static final C6714b m9971j(C6715c cVar, String str) {
        C6714b i = cVar.mo23875c(C6717d.m12270l(str)).mo23883i();
        C6888i.m12437d(i, "child(Name.identifier(name)).toSafe()");
        return i;
    }

    /* renamed from: j0 */
    public static final long m9972j0(InputStream inputStream, OutputStream outputStream, int i) {
        C6888i.m12438e(inputStream, "$this$copyTo");
        C6888i.m12438e(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: j1 */
    public static final C6713a m9973j1(C6705c cVar, int i) {
        C6888i.m12438e(cVar, "<this>");
        C6713a f = C6713a.m12238f(cVar.mo23727c(i), cVar.mo23726b(i));
        C6888i.m12437d(f, "fromString(getQualifiedClassName(index), isLocalClassName(index))");
        return f;
    }

    /* renamed from: j2 */
    public static final <T> int m9974j2(T[] tArr, T t) {
        C6888i.m12438e(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C6888i.m12434a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: j3 */
    public static boolean m9975j3(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        return false;
    }

    /* renamed from: j4 */
    public static C7448b1 m9976j4(List<C6248w0> list, C7586z0 z0Var, C6206k kVar, List<C6248w0> list2) {
        if (z0Var == null) {
            m9941e(1);
            throw null;
        } else if (kVar == null) {
            m9941e(2);
            throw null;
        } else if (list2 != null) {
            C7448b1 k4 = m9982k4(list, z0Var, kVar, list2, (boolean[]) null);
            if (k4 != null) {
                return k4;
            }
            throw new AssertionError("Substitution failed");
        } else {
            m9941e(3);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0104  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.p302x0.C5986h m9977k(p298d.p299a.p300a.p301a.C5885c0.C5886a r6, boolean r7) {
        /*
            java.lang.Class<?> r0 = p298d.p299a.p300a.p301a.C5934n.f11745g
            d.c0.d r0 = p298d.p299a.p300a.p301a.C5934n.f11746h
            d.a.a.a.c0 r1 = r6.mo22963B()
            java.lang.String r1 = r1.f11671n
            boolean r0 = r0.mo25278a(r1)
            if (r0 == 0) goto L_0x0014
            d.a.a.a.x0.l r6 = p298d.p299a.p300a.p301a.p302x0.C6016l.f11854a
            goto L_0x01e1
        L_0x0014:
            d.a.a.a.d0 r0 = new d.a.a.a.d0
            r0.<init>(r6)
            d.a.a.a.e0 r1 = new d.a.a.a.e0
            r1.<init>(r6)
            d.a.a.a.f0 r2 = new d.a.a.a.f0
            r2.<init>(r6, r7, r1, r0)
            d.a.a.a.t0 r1 = p298d.p299a.p300a.p301a.C5956t0.f11773b
            d.a.a.a.c0 r1 = r6.mo22963B()
            d.a.a.a.y0.b.k0 r1 = r1.mo22976x()
            d.a.a.a.f r1 = p298d.p299a.p300a.p301a.C5956t0.m10790c(r1)
            boolean r3 = r1 instanceof p298d.p299a.p300a.p301a.C5907f.C5910c
            if (r3 == 0) goto L_0x0153
            d.a.a.a.f$c r1 = (p298d.p299a.p300a.p301a.C5907f.C5910c) r1
            d.a.a.a.y0.e.a0.a$d r3 = r1.f11704d
            r4 = 0
            if (r7 == 0) goto L_0x0045
            boolean r7 = r3.mo23703j()
            if (r7 == 0) goto L_0x004e
            d.a.a.a.y0.e.a0.a$c r7 = r3.f12948k
            goto L_0x004f
        L_0x0045:
            boolean r7 = r3.mo23704k()
            if (r7 == 0) goto L_0x004e
            d.a.a.a.y0.e.a0.a$c r7 = r3.f12949l
            goto L_0x004f
        L_0x004e:
            r7 = r4
        L_0x004f:
            if (r7 == 0) goto L_0x006b
            d.a.a.a.c0 r3 = r6.mo22963B()
            d.a.a.a.n r3 = r3.f11669l
            d.a.a.a.y0.e.z.c r4 = r1.f11705e
            int r5 = r7.f12935i
            java.lang.String r4 = r4.mo23725a(r5)
            d.a.a.a.y0.e.z.c r1 = r1.f11705e
            int r7 = r7.f12936j
            java.lang.String r7 = r1.mo23725a(r7)
            java.lang.reflect.Method r4 = r3.mo23036u(r4, r7)
        L_0x006b:
            if (r4 != 0) goto L_0x0104
            d.a.a.a.c0 r7 = r6.mo22963B()
            d.a.a.a.y0.b.k0 r7 = r7.mo22976x()
            boolean r7 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13052d(r7)
            if (r7 == 0) goto L_0x00e1
            d.a.a.a.c0 r7 = r6.mo22963B()
            d.a.a.a.y0.b.k0 r7 = r7.mo22976x()
            d.a.a.a.y0.b.r r7 = r7.getVisibility()
            d.a.a.a.y0.b.r r0 = p298d.p299a.p300a.p301a.p303y0.p304b.C6219q.f12244d
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r7, r0)
            if (r7 == 0) goto L_0x00e1
            d.a.a.a.c0 r7 = r6.mo22963B()
            d.a.a.a.y0.b.k0 r7 = r7.mo22976x()
            d.a.a.a.y0.b.k r7 = r7.getContainingDeclaration()
            java.lang.Class r7 = m10054w4(r7)
            if (r7 == 0) goto L_0x00c5
            d.a.a.a.c0 r0 = r6.mo22963B()
            d.a.a.a.y0.b.k0 r0 = r0.mo22976x()
            java.lang.reflect.Method r7 = m9879S1(r7, r0)
            boolean r0 = r6.mo22977z()
            if (r0 == 0) goto L_0x00be
            d.a.a.a.x0.k$a r0 = new d.a.a.a.x0.k$a
            java.lang.Object r1 = m9949f1(r6)
            r0.<init>(r7, r1)
            goto L_0x0184
        L_0x00be:
            d.a.a.a.x0.k$b r0 = new d.a.a.a.x0.k$b
            r0.<init>(r7)
            goto L_0x0184
        L_0x00c5:
            d.a.a.a.l0 r7 = new d.a.a.a.l0
            java.lang.String r0 = "Underlying property of inline class "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            d.a.a.a.c0 r6 = r6.mo22963B()
            r0.append(r6)
            java.lang.String r6 = " should have a field"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00e1:
            d.a.a.a.c0 r7 = r6.mo22963B()
            java.lang.reflect.Field r7 = r7.mo22995D()
            if (r7 == 0) goto L_0x00ed
            goto L_0x015b
        L_0x00ed:
            d.a.a.a.l0 r7 = new d.a.a.a.l0
            java.lang.String r0 = "No accessors or field is found for property "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            d.a.a.a.c0 r6 = r6.mo22963B()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0104:
            int r7 = r4.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L_0x0125
            boolean r7 = r6.mo22977z()
            if (r7 == 0) goto L_0x011e
            d.a.a.a.x0.i$g$a r7 = new d.a.a.a.x0.i$g$a
            java.lang.Object r0 = m9949f1(r6)
            r7.<init>(r4, r0)
            goto L_0x0123
        L_0x011e:
            d.a.a.a.x0.i$g$d r7 = new d.a.a.a.x0.i$g$d
            r7.<init>(r4)
        L_0x0123:
            r0 = r7
            goto L_0x0184
        L_0x0125:
            boolean r7 = r0.mo23001a()
            if (r7 == 0) goto L_0x013d
            boolean r7 = r6.mo22977z()
            if (r7 == 0) goto L_0x0137
            d.a.a.a.x0.i$g$b r7 = new d.a.a.a.x0.i$g$b
            r7.<init>(r4)
            goto L_0x0123
        L_0x0137:
            d.a.a.a.x0.i$g$e r7 = new d.a.a.a.x0.i$g$e
            r7.<init>(r4)
            goto L_0x0123
        L_0x013d:
            boolean r7 = r6.mo22977z()
            if (r7 == 0) goto L_0x014d
            d.a.a.a.x0.i$g$c r7 = new d.a.a.a.x0.i$g$c
            java.lang.Object r0 = m9949f1(r6)
            r7.<init>(r4, r0)
            goto L_0x0123
        L_0x014d:
            d.a.a.a.x0.i$g$f r7 = new d.a.a.a.x0.i$g$f
            r7.<init>(r4)
            goto L_0x0123
        L_0x0153:
            boolean r0 = r1 instanceof p298d.p299a.p300a.p301a.C5907f.C5908a
            if (r0 == 0) goto L_0x0160
            d.a.a.a.f$a r1 = (p298d.p299a.p300a.p301a.C5907f.C5908a) r1
            java.lang.reflect.Field r7 = r1.f11698a
        L_0x015b:
            d.a.a.a.x0.i r0 = r2.invoke(r7)
            goto L_0x0184
        L_0x0160:
            boolean r0 = r1 instanceof p298d.p299a.p300a.p301a.C5907f.C5909b
            if (r0 == 0) goto L_0x01a3
            d.a.a.a.f$b r1 = (p298d.p299a.p300a.p301a.C5907f.C5909b) r1
            if (r7 == 0) goto L_0x016b
            java.lang.reflect.Method r7 = r1.f11699a
            goto L_0x016f
        L_0x016b:
            java.lang.reflect.Method r7 = r1.f11700b
            if (r7 == 0) goto L_0x018e
        L_0x016f:
            boolean r0 = r6.mo22977z()
            if (r0 == 0) goto L_0x017f
            d.a.a.a.x0.i$g$a r0 = new d.a.a.a.x0.i$g$a
            java.lang.Object r1 = m9949f1(r6)
            r0.<init>(r7, r1)
            goto L_0x0184
        L_0x017f:
            d.a.a.a.x0.i$g$d r0 = new d.a.a.a.x0.i$g$d
            r0.<init>(r7)
        L_0x0184:
            d.a.a.a.y0.b.j0 r6 = r6.mo22999A()
            r7 = 0
            d.a.a.a.x0.h r6 = m10056x0(r0, r6, r7)
            goto L_0x01e1
        L_0x018e:
            d.a.a.a.l0 r6 = new d.a.a.a.l0
            java.lang.String r7 = "No source found for setter of Java method property: "
            java.lang.StringBuilder r7 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            java.lang.reflect.Method r0 = r1.f11699a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x01a3:
            boolean r0 = r1 instanceof p298d.p299a.p300a.p301a.C5907f.C5911d
            if (r0 == 0) goto L_0x0210
            d.a.a.a.f$d r1 = (p298d.p299a.p300a.p301a.C5907f.C5911d) r1
            if (r7 == 0) goto L_0x01ae
            d.a.a.a.e$e r7 = r1.f11707a
            goto L_0x01b2
        L_0x01ae:
            d.a.a.a.e$e r7 = r1.f11708b
            if (r7 == 0) goto L_0x01f9
        L_0x01b2:
            d.a.a.a.c0 r0 = r6.mo22963B()
            d.a.a.a.n r0 = r0.f11669l
            d.a.a.a.y0.e.a0.b.e$b r7 = r7.f11696b
            java.lang.String r1 = r7.f13003a
            java.lang.String r7 = r7.f13004b
            java.lang.reflect.Method r7 = r0.mo23036u(r1, r7)
            if (r7 == 0) goto L_0x01e2
            int r0 = r7.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r6.mo22977z()
            if (r0 == 0) goto L_0x01dc
            d.a.a.a.x0.i$g$a r0 = new d.a.a.a.x0.i$g$a
            java.lang.Object r6 = m9949f1(r6)
            r0.<init>(r7, r6)
            r6 = r0
            goto L_0x01e1
        L_0x01dc:
            d.a.a.a.x0.i$g$d r6 = new d.a.a.a.x0.i$g$d
            r6.<init>(r7)
        L_0x01e1:
            return r6
        L_0x01e2:
            d.a.a.a.l0 r7 = new d.a.a.a.l0
            java.lang.String r0 = "No accessor found for property "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            d.a.a.a.c0 r6 = r6.mo22963B()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x01f9:
            d.a.a.a.l0 r7 = new d.a.a.a.l0
            java.lang.String r0 = "No setter found for property "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            d.a.a.a.c0 r6 = r6.mo22963B()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0210:
            d.h r6 = new d.h
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9977k(d.a.a.a.c0$a, boolean):d.a.a.a.x0.h");
    }

    /* renamed from: k0 */
    public static final List<C6030b1> m9978k0(Collection<C6316k> collection, Collection<? extends C6030b1> collection2, C6019a aVar) {
        C6888i.m12438e(collection, "newValueParametersTypes");
        C6888i.m12438e(collection2, "oldValueParameters");
        C6888i.m12438e(aVar, "newOwner");
        collection.size();
        collection2.size();
        List<C6768j<T, R>> g0 = C6790h.m12353g0(collection, collection2);
        ArrayList arrayList = new ArrayList(m9892V(g0, 10));
        Iterator it = ((ArrayList) g0).iterator();
        while (it.hasNext()) {
            C6768j jVar = (C6768j) it.next();
            C6316k kVar = (C6316k) jVar.f13681g;
            C6030b1 b1Var = (C6030b1) jVar.f13682h;
            int d = b1Var.mo23128d();
            C6060h annotations = b1Var.getAnnotations();
            C6717d name = b1Var.getName();
            C6888i.m12437d(name, "oldParameter.name");
            C7452c0 c0Var = kVar.f12421a;
            boolean z = kVar.f12422b;
            boolean g = b1Var.mo23129g();
            boolean N = b1Var.mo23126N();
            C7452c0 arrayElementType = b1Var.mo23130p() != null ? C7255a.m13138k(aVar).getBuiltIns().getArrayElementType(kVar.f12421a) : null;
            C6234r0 source = b1Var.getSource();
            C6888i.m12437d(source, "oldParameter.source");
            arrayList.add(new C6123n0(aVar, (C6030b1) null, d, annotations, name, c0Var, z, g, N, arrayElementType, source));
        }
        return arrayList;
    }

    /* renamed from: k1 */
    public static final String m9979k1(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: k2 */
    public static final C7481g1 m9980k2(C7481g1 g1Var, C7452c0 c0Var) {
        C6888i.m12438e(g1Var, "<this>");
        C6888i.m12438e(c0Var, "origin");
        return m9865P4(g1Var, m9997n1(c0Var));
    }

    /* renamed from: k3 */
    public static final C6023b.C6024a m9981k3(C7410y yVar, C6646j jVar) {
        C6023b.C6024a aVar = C6023b.C6024a.DECLARATION;
        C6888i.m12438e(yVar, "<this>");
        int i = jVar == null ? -1 : C7412z.f14825a[jVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? aVar : C6023b.C6024a.SYNTHESIZED : C6023b.C6024a.DELEGATION : C6023b.C6024a.FAKE_OVERRIDE : aVar;
    }

    /* renamed from: k4 */
    public static C7448b1 m9982k4(List<C6248w0> list, C7586z0 z0Var, C6206k kVar, List<C6248w0> list2, boolean[] zArr) {
        C7586z0 z0Var2 = z0Var;
        List<C6248w0> list3 = list2;
        if (list == null) {
            m9941e(5);
            throw null;
        } else if (z0Var2 == null) {
            m9941e(6);
            throw null;
        } else if (kVar == null) {
            m9941e(7);
            throw null;
        } else if (list3 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            for (C6248w0 next : list) {
                C6121m0 V = C6121m0.m10977V(kVar, next.getAnnotations(), next.mo23141v(), next.mo23137j(), next.getName(), i, C6234r0.f12257a, next.mo23138m());
                hashMap.put(next.getTypeConstructor(), new C7584y0(V.getDefaultType()));
                hashMap2.put(next, V);
                list3.add(V);
                i++;
            }
            C6888i.m12438e(hashMap, "map");
            C6888i.m12438e(hashMap, "map");
            C7448b1 f = C7448b1.m13404f(z0Var2, new C7569u0(hashMap, false));
            for (C6248w0 next2 : list) {
                C6121m0 m0Var = (C6121m0) hashMap2.get(next2);
                for (C7452c0 next3 : next2.getUpperBounds()) {
                    C7452c0 k = f.mo25053k(next3, C7484h1.IN_VARIANCE);
                    if (k == null) {
                        return null;
                    }
                    if (!(k == next3 || zArr == null)) {
                        zArr[0] = true;
                    }
                    m0Var.mo23263O(k);
                }
                m0Var.mo23264U();
                m0Var.f12096o = true;
            }
            return f;
        } else {
            m9941e(8);
            throw null;
        }
    }

    /* renamed from: l */
    public static final String m9983l(Object obj) {
        StringBuilder u = C0843a.m460u("ClassicTypeCheckerContext couldn't handle ");
        u.append(C6902w.m12460a(obj.getClass()));
        u.append(' ');
        u.append(obj);
        return u.toString();
    }

    /* renamed from: l0 */
    public static final C6328g m9984l0(C6328g gVar, C6060h hVar) {
        C6888i.m12438e(gVar, "<this>");
        C6888i.m12438e(hVar, "additionalAnnotations");
        return hVar.isEmpty() ? gVar : new C6328g(gVar.f12460a, gVar.f12461b, m9885T2(C6765g.NONE, new C6320b(gVar, hVar)));
    }

    /* renamed from: l1 */
    public static Collection m9985l1(C7282j jVar, C7268d dVar, C6862l lVar, int i, Object obj) {
        C6862l<C6717d, Boolean> lVar2;
        if ((i & 1) != 0) {
            dVar = C7268d.f14500o;
        }
        if ((i & 2) != 0) {
            Objects.requireNonNull(C7277h.f14517a);
            lVar2 = C7277h.C7278a.f14519b;
        } else {
            lVar2 = null;
        }
        return jVar.getContributedDescriptors(dVar, lVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: d.v.d<? super T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: d.v.j.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: d.v.d<? super T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: d.v.d<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: d.v.d<? super T>} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> p298d.p337v.C6824d<T> m9986l2(p298d.p337v.C6824d<? super T> r2) {
        /*
            java.lang.String r0 = "$this$intercepted"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            boolean r0 = r2 instanceof p298d.p337v.p339j.p340a.C6838c
            if (r0 != 0) goto L_0x000b
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = r2
        L_0x000c:
            d.v.j.a.c r0 = (p298d.p337v.p339j.p340a.C6838c) r0
            if (r0 == 0) goto L_0x0030
            d.v.d<java.lang.Object> r2 = r0.f13767h
            if (r2 == 0) goto L_0x0015
            goto L_0x0030
        L_0x0015:
            d.v.f r2 = r0.f13768i
            p298d.p344x.p346c.C6888i.m12436c(r2)
            int r1 = p298d.p337v.C6825e.f13750c
            d.v.e$a r1 = p298d.p337v.C6825e.C6826a.f13751g
            d.v.f$a r2 = r2.get(r1)
            d.v.e r2 = (p298d.p337v.C6825e) r2
            if (r2 == 0) goto L_0x002d
            d.v.d r2 = r2.mo24169q(r0)
            if (r2 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = r0
        L_0x002e:
            r0.f13767h = r2
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m9986l2(d.v.d):d.v.d");
    }

    /* renamed from: l3 */
    public static final int m9987l3(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: l4 */
    public static final long m9988l4(String str, long j, long j2, long j3) {
        String m4 = m9994m4(str);
        if (m4 == null) {
            return j;
        }
        C6888i.m12438e(m4, "$this$toLongOrNull");
        Long K = C7694h.m13920K(m4, 10);
        if (K != null) {
            long longValue = K.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m4 + '\'').toString());
    }

    /* renamed from: m */
    public static final String m9989m(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C6888i.m12437d(parameterTypes, "parameterTypes");
        sb.append(m9869Q2(parameterTypes, "", "(", ")", 0, (CharSequence) null, C5960u0.f11777g, 24));
        Class<?> returnType = method.getReturnType();
        C6888i.m12437d(returnType, "returnType");
        sb.append(C6173b.m11074c(returnType));
        return sb.toString();
    }

    /* renamed from: m0 */
    public static final <T> T m9990m0(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        C6888i.m12438e(cls, "annotationClass");
        C6888i.m12438e(map, "values");
        C6888i.m12438e(list, "methods");
        C5980b bVar = new C5980b(cls, list, map);
        C6764f U2 = m9890U2(new C5981c(map));
        C6764f U22 = m9890U2(new C5984f(cls, map));
        T newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C5982d(cls, U22, (C6736l) null, U2, (C6736l) null, bVar, map));
        Objects.requireNonNull(newProxyInstance, "null cannot be cast to non-null type T");
        return newProxyInstance;
    }

    /* renamed from: m1 */
    public static float[] m9991m1(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    /* renamed from: m2 */
    public static String m9992m2(C7589b bVar, C6244v vVar) {
        C6888i.m12438e(bVar, "this");
        C6888i.m12438e(vVar, "functionDescriptor");
        if (!bVar.mo25197b(vVar)) {
            return bVar.getDescription();
        }
        return null;
    }

    /* renamed from: m3 */
    public static final <K, V> HashMap<K, V> m9993m3(int i) {
        return new HashMap<>(m9824J(i));
    }

    /* renamed from: m4 */
    public static final String m9994m4(String str) {
        int i = C7790q.f15355a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static final void m9995n(C7873a aVar, C7875c cVar, String str) {
        C7876d.C7878b bVar = C7876d.f15644j;
        Logger logger = C7876d.f15643i;
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f15641f);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C6888i.m12437d(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f15633c);
        logger.fine(sb.toString());
    }

    /* renamed from: n0 */
    public static final C7580w0 m9996n0(C7580w0 w0Var, C6248w0 w0Var2) {
        if (w0Var2 == null || w0Var.mo25162b() == C7484h1.INVARIANT) {
            return w0Var;
        }
        if (w0Var2.mo23137j() != w0Var.mo25162b()) {
            C6888i.m12438e(w0Var, "typeProjection");
            C7216c cVar = new C7216c(w0Var);
            Objects.requireNonNull(C6060h.f11920d);
            return new C7584y0(new C7214a(w0Var, cVar, false, C6060h.C6061a.f11922b));
        } else if (!w0Var.mo25163c()) {
            return new C7584y0(w0Var.mo25161a());
        } else {
            C7441m mVar = C7417e.f14830e;
            C6888i.m12437d(mVar, "NO_LOCKS");
            return new C7584y0(new C7471f0(mVar, new C7217d(w0Var)));
        }
    }

    /* renamed from: n1 */
    public static final C7452c0 m9997n1(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        if (c0Var instanceof C7464e1) {
            return ((C7464e1) c0Var).mo25071z();
        }
        return null;
    }

    /* renamed from: n2 */
    public static /* synthetic */ C7728i0 m9998n2(C7819x0 x0Var, boolean z, boolean z2, C6862l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return x0Var.mo25333O(z, z2, lVar);
    }

    /* renamed from: n3 */
    public static final C6667q m9999n3(C6667q qVar, C6707e eVar) {
        C6888i.m12438e(qVar, "<this>");
        C6888i.m12438e(eVar, "typeTable");
        if (qVar.mo23798x()) {
            return qVar.f13367s;
        }
        if ((qVar.f13357i & 512) == 512) {
            return eVar.mo23845a(qVar.f13368t);
        }
        return null;
    }

    /* renamed from: n4 */
    public static int m10000n4(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return (int) m9988l4(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: o */
    public static final <T> void m10001o(Collection<T> collection, T t) {
        C6888i.m12438e(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: o0 */
    public static final <R, T> C6824d<C6777r> m10002o0(C6866p<? super R, ? super C6824d<? super T>, ? extends Object> pVar, R r, C6824d<? super T> dVar) {
        C6888i.m12438e(pVar, "$this$createCoroutineUnintercepted");
        C6888i.m12438e(dVar, "completion");
        C6888i.m12438e(dVar, "completion");
        if (pVar instanceof C6836a) {
            return ((C6836a) pVar).mo10325b(r, dVar);
        }
        C6827f context = dVar.getContext();
        return context == C6832h.f13753g ? new C6834b(dVar, dVar, pVar, r) : new C6835c(dVar, context, dVar, context, pVar, r);
    }

    /* renamed from: o1 */
    public static final C7452c0 m10003o1(C6023b bVar) {
        C6213n0 extensionReceiverParameter = bVar.getExtensionReceiverParameter();
        C6213n0 dispatchReceiverParameter = bVar.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.mo23093a();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (bVar instanceof C6157j) {
            return dispatchReceiverParameter.mo23093a();
        }
        C6206k containingDeclaration = bVar.getContainingDeclaration();
        if (!(containingDeclaration instanceof C6046e)) {
            containingDeclaration = null;
        }
        C6046e eVar = (C6046e) containingDeclaration;
        if (eVar != null) {
            return eVar.getDefaultType();
        }
        return null;
    }

    /* renamed from: o2 */
    public static final boolean m10004o2(AssertionError assertionError) {
        Logger logger = C8053p.f16164a;
        C6888i.m12438e(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C7694h.m13926d(message, "getsockname failed", false, 2) : false;
    }

    /* renamed from: o3 */
    public static final List<C6032c0> m10005o3(C6035d0 d0Var, C6714b bVar) {
        C6888i.m12438e(d0Var, "<this>");
        C6888i.m12438e(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        m9887U(d0Var, bVar, arrayList);
        return arrayList;
    }

    /* renamed from: o4 */
    public static /* synthetic */ long m10006o4(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = RecyclerView.FOREVER_NS;
        }
        return m9988l4(str, j, j4, j3);
    }

    /* renamed from: p */
    public static final void m10007p(Throwable th, Throwable th2) {
        C6888i.m12438e(th, "$this$addSuppressed");
        C6888i.m12438e(th2, "exception");
        if (th != th2) {
            C6847b.f13777a.mo24182a(th, th2);
        }
    }

    /* renamed from: p0 */
    public static C6102f0 m10008p0(C6207k0 k0Var, C6060h hVar) {
        if (hVar != null) {
            return m10050w0(k0Var, hVar, true, false, false, k0Var.getSource());
        }
        m9935d(14);
        throw null;
    }

    /* renamed from: p1 */
    public static final <M extends C7095h.C7099d<M>, T> T m10009p1(C7095h.C7099d<M> dVar, C7095h.C7102f<M, T> fVar) {
        C6888i.m12438e(dVar, "<this>");
        C6888i.m12438e(fVar, "extension");
        if (dVar.mo24682m(fVar)) {
            return dVar.mo24681l(fVar);
        }
        return null;
    }

    /* renamed from: p2 */
    public static final boolean m10010p2(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: p3 */
    public static int m10011p3(byte[] bArr, int i, int i2) {
        while (r8 < i2 && bArr[r8] >= 0) {
            i = r8 + 1;
        }
        if (r8 >= i2) {
            return 0;
        }
        while (r8 < i2) {
            int i3 = r8 + 1;
            byte b = bArr[r8];
            if (b < 0) {
                if (b >= -32) {
                    if (b < -16) {
                        if (i3 < i2 - 1) {
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                r8 = i4 + 1;
                                if (bArr[i4] > -65) {
                                }
                            }
                        }
                    } else if (i3 < i2 - 2) {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65) {
                            if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                int i6 = i5 + 1;
                                if (bArr[i5] <= -65) {
                                    i3 = i6 + 1;
                                    if (bArr[i6] > -65) {
                                    }
                                }
                            }
                        }
                    }
                    return m9962h2(bArr, i3, i2);
                } else if (i3 >= i2) {
                    return b;
                } else {
                    if (b >= -62) {
                        r8 = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                }
                return -1;
            }
            r8 = i3;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r0.charAt(r2.length()) == '.') goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: p4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.p303y0.p331f.C6714b m10012p4(p298d.p299a.p300a.p301a.p303y0.p331f.C6714b r5, p298d.p299a.p300a.p301a.p303y0.p331f.C6714b r6) {
        /*
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            java.lang.String r1 = "prefix"
            p298d.p344x.p346c.C6888i.m12438e(r6, r1)
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            java.lang.String r0 = "packageName"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            r1 = 1
            if (r0 == 0) goto L_0x001a
            goto L_0x0047
        L_0x001a:
            boolean r0 = r6.mo23864d()
            if (r0 == 0) goto L_0x0021
            goto L_0x0047
        L_0x0021:
            java.lang.String r0 = r5.mo23862b()
            java.lang.String r2 = "this.asString()"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            java.lang.String r2 = r6.mo23862b()
            java.lang.String r3 = "packageName.asString()"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)
            r3 = 0
            r4 = 2
            boolean r4 = p298d.p415c0.C7694h.m13910A(r0, r2, r3, r4)
            if (r4 == 0) goto L_0x0048
            int r2 = r2.length()
            char r0 = r0.charAt(r2)
            r2 = 46
            if (r0 != r2) goto L_0x0048
        L_0x0047:
            r3 = r1
        L_0x0048:
            if (r3 == 0) goto L_0x0080
            boolean r0 = r6.mo23864d()
            if (r0 == 0) goto L_0x0051
            goto L_0x0080
        L_0x0051:
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r5, r6)
            if (r0 == 0) goto L_0x005f
            d.a.a.a.y0.f.b r5 = p298d.p299a.p300a.p301a.p303y0.p331f.C6714b.f13613c
            java.lang.String r6 = "ROOT"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            goto L_0x0080
        L_0x005f:
            d.a.a.a.y0.f.b r0 = new d.a.a.a.y0.f.b
            java.lang.String r5 = r5.mo23862b()
            java.lang.String r2 = "asString()"
            p298d.p344x.p346c.C6888i.m12437d(r5, r2)
            java.lang.String r6 = r6.mo23862b()
            int r6 = r6.length()
            int r6 = r6 + r1
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r5, r6)
            r0.<init>((java.lang.String) r5)
            r5 = r0
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m10012p4(d.a.a.a.y0.f.b, d.a.a.a.y0.f.b):d.a.a.a.y0.f.b");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [d.x.b.l<? super T, ? extends java.lang.CharSequence>, d.x.b.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m10013q(java.lang.Appendable r1, T r2, p298d.p344x.p345b.C6862l<? super T, ? extends java.lang.CharSequence> r3) {
        /*
            java.lang.String r0 = "$this$appendElement"
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            if (r3 == 0) goto L_0x000c
            java.lang.Object r2 = r3.invoke(r2)
            goto L_0x0014
        L_0x000c:
            if (r2 == 0) goto L_0x0011
            boolean r3 = r2 instanceof java.lang.CharSequence
            goto L_0x0012
        L_0x0011:
            r3 = 1
        L_0x0012:
            if (r3 == 0) goto L_0x0017
        L_0x0014:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x0029
        L_0x0017:
            boolean r3 = r2 instanceof java.lang.Character
            if (r3 == 0) goto L_0x0025
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.append(r2)
            goto L_0x002c
        L_0x0025:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L_0x0029:
            r1.append(r2)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m10013q(java.lang.Appendable, java.lang.Object, d.x.b.l):void");
    }

    /* renamed from: q0 */
    public static C6107g0 m10014q0(C6207k0 k0Var, C6060h hVar, C6060h hVar2) {
        if (hVar == null) {
            m9935d(1);
            throw null;
        } else if (hVar2 != null) {
            C6234r0 source = k0Var.getSource();
            if (source != null) {
                return m9777B0(k0Var, hVar, hVar2, true, false, false, k0Var.getVisibility(), source);
            }
            m9935d(6);
            throw null;
        } else {
            m9935d(2);
            throw null;
        }
    }

    /* renamed from: q1 */
    public static final <M extends C7095h.C7099d<M>, T> T m10015q1(C7095h.C7099d<M> dVar, C7095h.C7102f<M, List<T>> fVar, int i) {
        C6888i.m12438e(dVar, "<this>");
        C6888i.m12438e(fVar, "extension");
        dVar.mo24686s(fVar);
        C7093g<C7095h.C7101e> gVar = dVar.f14193g;
        C7095h.C7101e eVar = fVar.f14206d;
        Objects.requireNonNull(gVar);
        if (eVar.f14201j) {
            Object f = gVar.mo24667f(eVar);
            if (i >= (f == null ? 0 : ((List) f).size())) {
                return null;
            }
            dVar.mo24686s(fVar);
            C7093g<C7095h.C7101e> gVar2 = dVar.f14193g;
            C7095h.C7101e eVar2 = fVar.f14206d;
            Objects.requireNonNull(gVar2);
            if (eVar2.f14201j) {
                Object f2 = gVar2.mo24667f(eVar2);
                if (f2 != null) {
                    return fVar.mo24689a(((List) f2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: q2 */
    public static final boolean m10016q2(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return c0Var.mo24887V() instanceof C7215b;
    }

    /* renamed from: q3 */
    public static final C6717d m10017q3(C6717d dVar, boolean z) {
        C6888i.m12438e(dVar, "methodName");
        return m10023r3(dVar, "set", false, z ? "is" : null, 4);
    }

    /* renamed from: q4 */
    public static final void m10018q4(Object obj) {
        if (obj instanceof C6769k.C6770a) {
            throw ((C6769k.C6770a) obj).f13683g;
        }
    }

    /* renamed from: r */
    public static final C7549a<C7452c0> m10019r(C7452c0 c0Var) {
        Object obj;
        C7552d dVar;
        C6888i.m12438e(c0Var, "type");
        if (m10058x2(c0Var)) {
            C7549a<C7452c0> r = m10019r(m9933c3(c0Var));
            C7549a<C7452c0> r2 = m10019r(m9847M4(c0Var));
            C7455d0 d0Var = C7455d0.f14869a;
            return new C7549a<>(m9980k2(C7455d0.m13428c(m9933c3((C7452c0) r.f14986a), m9847M4((C7452c0) r2.f14986a)), c0Var), m9980k2(C7455d0.m13428c(m9933c3((C7452c0) r.f14987b), m9847M4((C7452c0) r2.f14987b)), c0Var));
        }
        C7567t0 V = c0Var.mo24887V();
        boolean z = true;
        if (m10016q2(c0Var)) {
            C7580w0 a = ((C7215b) V).mo24890a();
            C7452c0 a2 = a.mo25161a();
            C6888i.m12437d(a2, "typeProjection.type");
            C7452c0 k = C7460d1.m13445k(a2, c0Var.mo23566W());
            C6888i.m12437d(k, "makeNullableIfNeeded(this, type.isMarkedNullable)");
            int ordinal = a.mo25162b().ordinal();
            if (ordinal == 1) {
                C7489j0 nullableAnyType = m9955g1(c0Var).getNullableAnyType();
                C6888i.m12437d(nullableAnyType, "type.builtIns.nullableAnyType");
                return new C7549a<>(k, nullableAnyType);
            } else if (ordinal == 2) {
                C7489j0 nothingType = m9955g1(c0Var).getNothingType();
                C6888i.m12437d(nothingType, "type.builtIns.nothingType");
                C7452c0 k2 = C7460d1.m13445k(nothingType, c0Var.mo23566W());
                C6888i.m12437d(k2, "makeNullableIfNeeded(this, type.isMarkedNullable)");
                return new C7549a<>(k2, k);
            } else {
                throw new AssertionError(C6888i.m12444k("Only nontrivial projections should have been captured, not: ", a));
            }
        } else if (c0Var.mo24886U().isEmpty() || c0Var.mo24886U().size() != V.getParameters().size()) {
            return new C7549a<>(c0Var, c0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<C7580w0> U = c0Var.mo24886U();
            List<C6248w0> parameters = V.getParameters();
            C6888i.m12437d(parameters, "typeConstructor.parameters");
            Iterator it = ((ArrayList) C6790h.m12353g0(U, parameters)).iterator();
            while (it.hasNext()) {
                C6768j jVar = (C6768j) it.next();
                C7580w0 w0Var = (C7580w0) jVar.f13681g;
                C6248w0 w0Var2 = (C6248w0) jVar.f13682h;
                C6888i.m12437d(w0Var2, "typeParameter");
                C7484h1 j = w0Var2.mo23137j();
                C7448b1 b1Var = C7448b1.f14862b;
                if (j == null) {
                    C7448b1.m13399a(33);
                    throw null;
                } else if (w0Var != null) {
                    int ordinal2 = (w0Var.mo25163c() ? C7484h1.OUT_VARIANCE : C7448b1.m13400b(j, w0Var.mo25162b())).ordinal();
                    if (ordinal2 == 0) {
                        C7452c0 a3 = w0Var.mo25161a();
                        C6888i.m12437d(a3, "type");
                        C7452c0 a4 = w0Var.mo25161a();
                        C6888i.m12437d(a4, "type");
                        dVar = new C7552d(w0Var2, a3, a4);
                    } else if (ordinal2 == 1) {
                        C7452c0 a5 = w0Var.mo25161a();
                        C6888i.m12437d(a5, "type");
                        C7489j0 nullableAnyType2 = C7255a.m13133f(w0Var2).getNullableAnyType();
                        C6888i.m12437d(nullableAnyType2, "typeParameter.builtIns.nullableAnyType");
                        dVar = new C7552d(w0Var2, a5, nullableAnyType2);
                    } else if (ordinal2 == 2) {
                        C7489j0 nothingType2 = C7255a.m13133f(w0Var2).getNothingType();
                        C6888i.m12437d(nothingType2, "typeParameter.builtIns.nothingType");
                        C7452c0 a6 = w0Var.mo25161a();
                        C6888i.m12437d(a6, "type");
                        dVar = new C7552d(w0Var2, nothingType2, a6);
                    } else {
                        throw new C6766h();
                    }
                    if (w0Var.mo25163c()) {
                        arrayList.add(dVar);
                        arrayList2.add(dVar);
                    } else {
                        C7549a<C7452c0> r3 = m10019r(dVar.f14990b);
                        C7549a<C7452c0> r4 = m10019r(dVar.f14991c);
                        C7552d dVar2 = new C7552d(dVar.f14989a, (C7452c0) r3.f14987b, (C7452c0) r4.f14986a);
                        C7552d dVar3 = new C7552d(dVar.f14989a, (C7452c0) r3.f14986a, (C7452c0) r4.f14987b);
                        arrayList.add(dVar2);
                        arrayList2.add(dVar3);
                    }
                } else {
                    C7448b1.m13399a(34);
                    throw null;
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C7552d dVar4 = (C7552d) it2.next();
                    Objects.requireNonNull(dVar4);
                    if (!C7493d.f14926a.mo25128d(dVar4.f14990b, dVar4.f14991c)) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                obj = m9955g1(c0Var).getNothingType();
                C6888i.m12437d(obj, "type.builtIns.nothingType");
            } else {
                obj = m9792D3(c0Var, arrayList);
            }
            return new C7549a<>(obj, m9792D3(c0Var, arrayList2));
        }
    }

    /* renamed from: r0 */
    public static C6232q0 m10020r0(C6046e eVar) {
        C6046e eVar2 = eVar;
        if (eVar2 != null) {
            C6060h.C6061a aVar = C6060h.f11920d;
            Objects.requireNonNull(aVar);
            C6060h hVar = C6060h.C6061a.f11922b;
            C6111i0 create = C6111i0.create(eVar2, hVar, StandardNames.ENUM_VALUE_OF, C6023b.C6024a.SYNTHESIZED, eVar.getSource());
            Objects.requireNonNull(aVar);
            C6111i0 i0Var = create;
            C6111i0 initialize = i0Var.initialize((C6213n0) null, (C6213n0) null, (List<? extends C6248w0>) Collections.emptyList(), (List<C6030b1>) Collections.singletonList(new C6123n0(create, (C6030b1) null, 0, hVar, C6717d.m12270l("value"), C7255a.m13133f(eVar).getStringType(), false, false, false, (C7452c0) null, eVar.getSource())), (C7452c0) eVar.getDefaultType(), C6251y.FINAL, C6219q.f12245e);
            if (initialize != null) {
                return initialize;
            }
            m9935d(25);
            throw null;
        }
        m9935d(24);
        throw null;
    }

    /* renamed from: r1 */
    public static C6714b m10021r1(C6055c cVar) {
        C6888i.m12438e(cVar, "this");
        C6046e e = C7255a.m13132e(cVar);
        if (e == null) {
            return null;
        }
        if (C7570v.m13789j(e)) {
            e = null;
        }
        if (e == null) {
            return null;
        }
        return C7255a.m13131d(e);
    }

    /* renamed from: r2 */
    public static boolean m10022r2(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            return ((C7567t0) lVar).getDeclarationDescriptor() instanceof C6046e;
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0119, code lost:
        if (p298d.p299a.p300a.p301a.p303y0.p331f.C6717d.m12271n(r5) == false) goto L_0x011b;
     */
    /* renamed from: r3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p298d.p299a.p300a.p301a.p303y0.p331f.C6717d m10023r3(p298d.p299a.p300a.p301a.p303y0.p331f.C6717d r5, java.lang.String r6, boolean r7, java.lang.String r8, int r9) {
        /*
            r0 = r9 & 4
            r1 = 1
            if (r0 == 0) goto L_0x0006
            r7 = r1
        L_0x0006:
            r9 = r9 & 8
            r0 = 0
            if (r9 == 0) goto L_0x000c
            r8 = r0
        L_0x000c:
            boolean r9 = r5.f13624h
            if (r9 == 0) goto L_0x0012
            goto L_0x011b
        L_0x0012:
            java.lang.String r9 = r5.mo23889i()
            java.lang.String r2 = "methodName.identifier"
            p298d.p344x.p346c.C6888i.m12437d(r9, r2)
            r2 = 2
            r3 = 0
            boolean r2 = p298d.p415c0.C7694h.m13910A(r9, r6, r3, r2)
            if (r2 != 0) goto L_0x0025
            goto L_0x011b
        L_0x0025:
            int r2 = r9.length()
            int r4 = r6.length()
            if (r2 != r4) goto L_0x0031
            goto L_0x011b
        L_0x0031:
            int r2 = r6.length()
            char r2 = r9.charAt(r2)
            r4 = 97
            if (r4 > r2) goto L_0x0043
            r4 = 122(0x7a, float:1.71E-43)
            if (r2 > r4) goto L_0x0043
            r2 = r1
            goto L_0x0044
        L_0x0043:
            r2 = r3
        L_0x0044:
            if (r2 == 0) goto L_0x0048
            goto L_0x011b
        L_0x0048:
            if (r8 == 0) goto L_0x0054
            java.lang.String r5 = p298d.p415c0.C7694h.m13941s(r9, r6)
            java.lang.String r5 = p298d.p344x.p346c.C6888i.m12444k(r8, r5)
            goto L_0x011d
        L_0x0054:
            if (r7 != 0) goto L_0x0058
            goto L_0x0121
        L_0x0058:
            java.lang.String r5 = p298d.p415c0.C7694h.m13941s(r9, r6)
            java.lang.String r6 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r5, r6)
            int r7 = r5.length()
            if (r7 != 0) goto L_0x0069
            r7 = r1
            goto L_0x006a
        L_0x0069:
            r7 = r3
        L_0x006a:
            if (r7 != 0) goto L_0x0115
            boolean r7 = m9839L2(r5, r3, r1)
            if (r7 != 0) goto L_0x0074
            goto L_0x0115
        L_0x0074:
            int r7 = r5.length()
            java.lang.String r8 = "(this as java.lang.String).substring(startIndex)"
            if (r7 == r1) goto L_0x00d9
            boolean r7 = m9839L2(r5, r1, r1)
            if (r7 != 0) goto L_0x0083
            goto L_0x00d9
        L_0x0083:
            java.lang.String r6 = "$this$indices"
            p298d.p344x.p346c.C6888i.m12438e(r5, r6)
            d.a0.d r6 = new d.a0.d
            int r7 = r5.length()
            int r7 = r7 + -1
            r6.<init>(r3, r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x0097:
            r7 = r6
            d.a0.c r7 = (p298d.p333a0.C6757c) r7
            boolean r7 = r7.f13662h
            if (r7 == 0) goto L_0x00b1
            java.lang.Object r7 = r6.next()
            r9 = r7
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            boolean r9 = m9839L2(r5, r9, r1)
            r9 = r9 ^ r1
            if (r9 == 0) goto L_0x0097
            goto L_0x00b2
        L_0x00b1:
            r7 = r0
        L_0x00b2:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x00bb
            java.lang.String r5 = m10072z4(r5, r1)
            goto L_0x0115
        L_0x00bb:
            int r6 = r7.intValue()
            int r6 = r6 - r1
            java.lang.String r7 = r5.substring(r3, r6)
            java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p298d.p344x.p346c.C6888i.m12437d(r7, r9)
            java.lang.String r7 = m10072z4(r7, r1)
            java.lang.String r5 = r5.substring(r6)
            p298d.p344x.p346c.C6888i.m12437d(r5, r8)
            java.lang.String r5 = p298d.p344x.p346c.C6888i.m12444k(r7, r5)
            goto L_0x0115
        L_0x00d9:
            p298d.p344x.p346c.C6888i.m12438e(r5, r6)
            int r6 = r5.length()
            if (r6 != 0) goto L_0x00e4
            r6 = r1
            goto L_0x00e5
        L_0x00e4:
            r6 = r3
        L_0x00e5:
            if (r6 == 0) goto L_0x00e8
            goto L_0x0115
        L_0x00e8:
            char r6 = r5.charAt(r3)
            r7 = 65
            if (r7 > r6) goto L_0x00f5
            r7 = 90
            if (r6 > r7) goto L_0x00f5
            r3 = r1
        L_0x00f5:
            if (r3 == 0) goto L_0x0115
            char r6 = java.lang.Character.toLowerCase(r6)
            java.lang.String r5 = r5.substring(r1)
            p298d.p344x.p346c.C6888i.m12437d(r5, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x0115:
            boolean r6 = p298d.p299a.p300a.p301a.p303y0.p331f.C6717d.m12271n(r5)
            if (r6 != 0) goto L_0x011d
        L_0x011b:
            r5 = r0
            goto L_0x0121
        L_0x011d:
            d.a.a.a.y0.f.d r5 = p298d.p299a.p300a.p301a.p303y0.p331f.C6717d.m12270l(r5)
        L_0x0121:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m10023r3(d.a.a.a.y0.f.d, java.lang.String, boolean, java.lang.String, int):d.a.a.a.y0.f.d");
    }

    /* renamed from: r4 */
    public static final String m10024r4(String str) {
        C6888i.m12438e(str, "$this$toCanonicalHost");
        int i = 0;
        int i2 = -1;
        if (C7694h.m13926d(str, ":", false, 2)) {
            InetAddress E0 = (!C7694h.m13910A(str, "[", false, 2) || !C7694h.m13927e(str, "]", false, 2)) ? m9795E0(str, 0, str.length()) : m9795E0(str, 1, str.length() - 1);
            if (E0 == null) {
                return null;
            }
            byte[] address = E0.getAddress();
            if (address.length == 16) {
                C6888i.m12437d(address, "address");
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C8040e eVar = new C8040e();
                while (i < address.length) {
                    if (i == i2) {
                        eVar.mo25940v0(58);
                        i += i4;
                        if (i == 16) {
                            eVar.mo25940v0(58);
                        }
                    } else {
                        if (i > 0) {
                            eVar.mo25940v0(58);
                        }
                        byte b = address[i];
                        byte[] bArr = C7867c.f15619a;
                        eVar.mo25920o((long) (((b & ExifInterface.MARKER) << 8) | (address[i + 1] & ExifInterface.MARKER)));
                        i += 2;
                    }
                }
                return eVar.mo25919n0();
            } else if (address.length == 4) {
                return E0.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                C6888i.m12437d(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                C6888i.m12437d(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                C6888i.m12437d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i7);
                    if (C6888i.m12440g(charAt, 31) <= 0) {
                        break;
                    } else if (C6888i.m12440g(charAt, 127) >= 0) {
                        break;
                    } else if (C7694h.m13933k(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i7++;
                    }
                }
                i = 1;
                if (i != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: s */
    public static int m10025s(C7492c cVar, C7534h hVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        if (hVar instanceof C7452c0) {
            return ((C7452c0) hVar).mo24886U().size();
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: s0 */
    public static C6232q0 m10026s0(C6046e eVar) {
        if (eVar != null) {
            Objects.requireNonNull(C6060h.f11920d);
            C6111i0 initialize = C6111i0.create(eVar, C6060h.C6061a.f11922b, StandardNames.ENUM_VALUES, C6023b.C6024a.SYNTHESIZED, eVar.getSource()).initialize((C6213n0) null, (C6213n0) null, (List<? extends C6248w0>) Collections.emptyList(), (List<C6030b1>) Collections.emptyList(), (C7452c0) C7255a.m13133f(eVar).getArrayType(C7484h1.INVARIANT, eVar.getDefaultType()), C6251y.FINAL, C6219q.f12245e);
            if (initialize != null) {
                return initialize;
            }
            m9935d(23);
            throw null;
        }
        m9935d(22);
        throw null;
    }

    /* renamed from: s1 */
    public static final String m10027s1(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: s2 */
    public static boolean m10028s2(C6183f fVar) {
        C6888i.m12438e(fVar, "this");
        return false;
    }

    /* renamed from: s3 */
    public static final C6667q m10029s3(C6643i iVar, C6707e eVar) {
        C6888i.m12438e(iVar, "<this>");
        C6888i.m12438e(eVar, "typeTable");
        if (iVar.mo23764t()) {
            return iVar.f13224p;
        }
        if (iVar.mo23765v()) {
            return eVar.mo23845a(iVar.f13225q);
        }
        return null;
    }

    /* renamed from: s4 */
    public static final <T, C extends Collection<? super T>> C m10030s4(T[] tArr, C c) {
        C6888i.m12438e(tArr, "$this$toCollection");
        C6888i.m12438e(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: t */
    public static final <E> E[] m10031t(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: t0 */
    public static C6213n0 m10032t0(C6019a aVar, C7452c0 c0Var, C6060h hVar) {
        if (hVar == null) {
            m9935d(30);
            throw null;
        } else if (c0Var == null) {
            return null;
        } else {
            return new C6109h0(aVar, new C7293b(aVar, c0Var, (C7295d) null), hVar);
        }
    }

    /* renamed from: t1 */
    public static final <T> Class<T> m10033t1(C6726e<T> eVar) {
        C6888i.m12438e(eVar, "$this$java");
        Class<?> n = ((C6881c) eVar).mo22949n();
        Objects.requireNonNull(n, "null cannot be cast to non-null type java.lang.Class<T>");
        return n;
    }

    /* renamed from: t2 */
    public static final boolean m10034t2(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return c0Var.mo25056Y() instanceof C7566t;
    }

    /* renamed from: t3 */
    public static final void m10035t3(C6258c cVar, C6257b bVar, C6046e eVar, C6717d dVar) {
        C6256a d;
        C6888i.m12438e(cVar, "<this>");
        C6888i.m12438e(bVar, "from");
        C6888i.m12438e(eVar, "scopeOwner");
        C6888i.m12438e(dVar, "name");
        if (cVar != C6258c.C6259a.f12272a && (d = bVar.mo23440d()) != null) {
            C6261e b = cVar.mo23442b() ? d.mo23439b() : C6261e.f12298j;
            String a = d.mo23438a();
            String b2 = C7193g.m13027g(eVar).mo23874b();
            C6888i.m12437d(b2, "getFqName(scopeOwner).asString()");
            C6263f fVar = C6263f.CLASSIFIER;
            String e = dVar.mo23886e();
            C6888i.m12437d(e, "name.asString()");
            cVar.mo23441a(a, b, b2, fVar, e);
        }
    }

    /* renamed from: t4 */
    public static final String m10036t4(C6824d<?> dVar) {
        String str;
        if (dVar instanceof C7775e) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + m10027s1(dVar);
        } catch (Throwable th) {
            str = m10038u0(th);
        }
        Throwable a = C6769k.m12309a(str);
        String str2 = str;
        if (a != null) {
            str2 = dVar.getClass().getName() + '@' + m10027s1(dVar);
        }
        return (String) str2;
    }

    /* renamed from: u */
    public static final boolean m10037u(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C6888i.m12438e(bArr, "a");
        C6888i.m12438e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u0 */
    public static final Object m10038u0(Throwable th) {
        C6888i.m12438e(th, "exception");
        return new C6769k.C6770a(th);
    }

    /* renamed from: u1 */
    public static final Field m10039u1(C6736l<?> lVar) {
        C6888i.m12438e(lVar, "$this$javaField");
        C5885c0<?> c = C5970v0.m10808c(lVar);
        if (c != null) {
            return c.mo22995D();
        }
        return null;
    }

    /* renamed from: u2 */
    public static boolean m10040u2(C6244v vVar) {
        return vVar.getKind() == C6023b.C6024a.SYNTHESIZED && C7193g.m13037q(vVar.getContainingDeclaration());
    }

    /* renamed from: u3 */
    public static final void m10041u3(C6258c cVar, C6257b bVar, C6032c0 c0Var, C6717d dVar) {
        C6256a d;
        C6888i.m12438e(cVar, "<this>");
        C6888i.m12438e(bVar, "from");
        C6888i.m12438e(c0Var, "scopeOwner");
        C6888i.m12438e(dVar, "name");
        String b = c0Var.getFqName().mo23862b();
        C6888i.m12437d(b, "scopeOwner.fqName.asString()");
        String e = dVar.mo23886e();
        C6888i.m12437d(e, "name.asString()");
        C6888i.m12438e(cVar, "<this>");
        C6888i.m12438e(bVar, "from");
        C6888i.m12438e(b, "packageFqName");
        C6888i.m12438e(e, "name");
        if (cVar != C6258c.C6259a.f12272a && (d = bVar.mo23440d()) != null) {
            cVar.mo23441a(d.mo23438a(), cVar.mo23442b() ? d.mo23439b() : C6261e.f12298j, b, C6263f.PACKAGE, e);
        }
    }

    /* renamed from: u4 */
    public static final C6233r m10042u4(C6050e1 e1Var) {
        C6888i.m12438e(e1Var, "<this>");
        C6233r rVar = C6516v.f12765d.get(e1Var);
        if (rVar == null) {
            rVar = C6219q.m11196h(e1Var);
        }
        C6888i.m12437d(rVar, "toDescriptorVisibility(this)");
        return rVar;
    }

    /* renamed from: v */
    public static C7530d m10043v(C7492c cVar, C7535i iVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(iVar, "receiver");
        if (!(iVar instanceof C7489j0)) {
            throw new IllegalArgumentException(C0843a.m457r(iVar, C0843a.m425A("ClassicTypeSystemContext couldn't handle: ", iVar, ", ")).toString());
        } else if (iVar instanceof C7553o) {
            return (C7553o) iVar;
        } else {
            return null;
        }
    }

    /* renamed from: v0 */
    public static C7534h m10044v0(C7492c cVar, C7535i iVar, C7535i iVar2) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(iVar, "lowerBound");
        C6888i.m12438e(iVar2, "upperBound");
        if (!(iVar instanceof C7489j0)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + C6902w.m12460a(cVar.getClass())).toString());
        } else if (iVar2 instanceof C7489j0) {
            C7455d0 d0Var = C7455d0.f14869a;
            return C7455d0.m13428c((C7489j0) iVar, (C7489j0) iVar2);
        } else {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + C6902w.m12460a(cVar.getClass())).toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.mo22973u();
     */
    /* renamed from: v1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Method m10045v1(p298d.p299a.C6729h<?> r2) {
        /*
            java.lang.String r0 = "$this$javaMethod"
            p298d.p344x.p346c.C6888i.m12438e(r2, r0)
            d.a.a.a.g r2 = p298d.p299a.p300a.p301a.C5970v0.m10806a(r2)
            r0 = 0
            if (r2 == 0) goto L_0x0017
            d.a.a.a.x0.h r2 = r2.mo22973u()
            if (r2 == 0) goto L_0x0017
            java.lang.reflect.Member r2 = r2.mo23070b()
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r1 = r2 instanceof java.lang.reflect.Method
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m10045v1(d.a.h):java.lang.reflect.Method");
    }

    /* renamed from: v2 */
    public static final boolean m10046v2(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C7481g1 Y = c0Var.mo25056Y();
        return (Y instanceof C7568u) || ((Y instanceof C7579w) && (((C7579w) Y).mo23548c0() instanceof C7568u));
    }

    /* renamed from: v3 */
    public static final <T> Object m10047v3(Object obj, C6824d<? super T> dVar) {
        return obj instanceof C7754q ? m10038u0(((C7754q) obj).f15306a) : obj;
    }

    /* renamed from: v4 */
    public static final String m10048v4(byte b) {
        char[] cArr = C8038b.f16136a;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    /* renamed from: w */
    public static C7531e m10049w(C7492c cVar, C7532f fVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(fVar, "receiver");
        if (!(fVar instanceof C7579w)) {
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fVar + ", " + C6902w.m12460a(fVar.getClass())).toString());
        } else if (fVar instanceof C7566t) {
            return (C7566t) fVar;
        } else {
            return null;
        }
    }

    /* renamed from: w0 */
    public static C6102f0 m10050w0(C6207k0 k0Var, C6060h hVar, boolean z, boolean z2, boolean z3, C6234r0 r0Var) {
        if (hVar == null) {
            m9935d(18);
            throw null;
        } else if (r0Var != null) {
            return new C6102f0(k0Var, hVar, k0Var.getModality(), k0Var.getVisibility(), z, z2, z3, C6023b.C6024a.DECLARATION, (C6209l0) null, r0Var);
        } else {
            m9935d(19);
            throw null;
        }
    }

    /* renamed from: w1 */
    public static final <T> Class<T> m10051w1(C6726e<T> eVar) {
        C6888i.m12438e(eVar, "$this$javaObjectType");
        Class<?> n = ((C6881c) eVar).mo22949n();
        if (!n.isPrimitive()) {
            return n;
        }
        String name = n.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : n;
            case 104431:
                return name.equals("int") ? Integer.class : n;
            case 3039496:
                return name.equals("byte") ? Byte.class : n;
            case 3052374:
                return name.equals("char") ? Character.class : n;
            case 3327612:
                return name.equals("long") ? Long.class : n;
            case 3625364:
                return name.equals("void") ? Void.class : n;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : n;
            case 97526364:
                return name.equals("float") ? Float.class : n;
            case 109413500:
                return name.equals("short") ? Short.class : n;
            default:
                return n;
        }
    }

    /* renamed from: w2 */
    public static final boolean m10052w2(C6046e eVar) {
        C6888i.m12438e(eVar, "<this>");
        return eVar.getModality() == C6251y.FINAL && eVar.getKind() != C6051f.ENUM_CLASS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0 != false) goto L_0x003f;
     */
    /* renamed from: w3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m10053w3(p298d.p299a.p300a.p301a.p303y0.p331f.C6717d r7) {
        /*
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            boolean r0 = r7.f13624h
            r1 = 0
            java.lang.String r2 = "asString()"
            if (r0 == 0) goto L_0x000d
            goto L_0x0040
        L_0x000d:
            java.lang.String r0 = r7.mo23886e()
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            java.util.Set<java.lang.String> r3 = p298d.p299a.p300a.p301a.p303y0.p390h.C7179m.f14392a
            boolean r3 = r3.contains(r0)
            r4 = 1
            if (r3 != 0) goto L_0x003f
            r3 = r1
        L_0x001e:
            int r5 = r0.length()
            if (r3 >= r5) goto L_0x003c
            char r5 = r0.charAt(r3)
            boolean r6 = java.lang.Character.isLetterOrDigit(r5)
            if (r6 != 0) goto L_0x0034
            r6 = 95
            if (r5 == r6) goto L_0x0034
            r5 = r4
            goto L_0x0035
        L_0x0034:
            r5 = r1
        L_0x0035:
            if (r5 == 0) goto L_0x0039
            r0 = r4
            goto L_0x003d
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x003c:
            r0 = r1
        L_0x003d:
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r1 = r4
        L_0x0040:
            if (r1 == 0) goto L_0x0065
            r0 = 96
            java.lang.String r7 = r7.mo23886e()
            p298d.p344x.p346c.C6888i.m12437d(r7, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "`"
            java.lang.String r7 = p298d.p344x.p346c.C6888i.m12444k(r7, r0)
            goto L_0x006c
        L_0x0065:
            java.lang.String r7 = r7.mo23886e()
            p298d.p344x.p346c.C6888i.m12437d(r7, r2)
        L_0x006c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m10053w3(d.a.a.a.y0.f.d):java.lang.String");
    }

    /* renamed from: w4 */
    public static final Class<?> m10054w4(C6206k kVar) {
        if (!(kVar instanceof C6046e) || !C7197i.m13050b(kVar)) {
            return null;
        }
        C6046e eVar = (C6046e) kVar;
        Class<?> j = C5970v0.m10815j(eVar);
        if (j != null) {
            return j;
        }
        StringBuilder u = C0843a.m460u("Class object for the class ");
        u.append(eVar.getName());
        u.append(" cannot be found (classId=");
        u.append(C7255a.m13134g((C6083h) kVar));
        u.append(')');
        throw new C5931l0(u.toString());
    }

    /* renamed from: x */
    public static final C7579w m10055x(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return (C7579w) c0Var.mo25056Y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if ((r0 != null && p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13051c(r0)) != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.lang.reflect.Member> p298d.p299a.p300a.p301a.p302x0.C5986h<M> m10056x0(p298d.p299a.p300a.p301a.p302x0.C5986h<? extends M> r5, p298d.p299a.p300a.p301a.p303y0.p304b.C6023b r6, boolean r7) {
        /*
            java.lang.String r0 = "$this$createInlineClassAwareCallerIfNeeded"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            java.lang.String r0 = "descriptor"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            boolean r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13049a(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x006b
            java.util.List r0 = r6.getValueParameters()
            java.lang.String r3 = "descriptor.valueParameters"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0048
        L_0x0023:
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r0.next()
            d.a.a.a.y0.b.b1 r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r3
            java.lang.String r4 = "it"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            d.a.a.a.y0.l.c0 r3 = r3.mo23093a()
            java.lang.String r4 = "it.type"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            boolean r3 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13051c(r3)
            if (r3 == 0) goto L_0x0027
            r0 = r2
        L_0x0048:
            if (r0 != 0) goto L_0x006b
            d.a.a.a.y0.l.c0 r0 = r6.getReturnType()
            if (r0 == 0) goto L_0x0056
            boolean r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13051c(r0)
            if (r0 == r2) goto L_0x006b
        L_0x0056:
            boolean r0 = r5 instanceof p298d.p299a.p300a.p301a.p302x0.C5985g
            if (r0 != 0) goto L_0x006c
            d.a.a.a.y0.l.c0 r0 = m10003o1(r6)
            if (r0 == 0) goto L_0x0068
            boolean r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7197i.m13051c(r0)
            if (r0 != r2) goto L_0x0068
            r0 = r2
            goto L_0x0069
        L_0x0068:
            r0 = r1
        L_0x0069:
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r1 = r2
        L_0x006c:
            if (r1 == 0) goto L_0x0074
            d.a.a.a.x0.j r0 = new d.a.a.a.x0.j
            r0.<init>(r6, r5, r7)
            r5 = r0
        L_0x0074:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m10056x0(d.a.a.a.x0.h, d.a.a.a.y0.b.b, boolean):d.a.a.a.x0.h");
    }

    /* renamed from: x1 */
    public static final <T> Class<T> m10057x1(C6726e<T> eVar) {
        C6888i.m12438e(eVar, "$this$javaPrimitiveType");
        Class<?> n = ((C6881c) eVar).mo22949n();
        if (n.isPrimitive()) {
            return n;
        }
        String name = n.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    /* renamed from: x2 */
    public static final boolean m10058x2(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return c0Var.mo25056Y() instanceof C7579w;
    }

    /* renamed from: x3 */
    public static final String m10059x3(List<C6717d> list) {
        C6888i.m12438e(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C6717d next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m10053w3(next));
        }
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: x4 */
    public static final Class<?> m10060x4(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "$this$toInlineClass");
        return m10054w4(c0Var.mo24887V().getDeclarationDescriptor());
    }

    /* renamed from: y */
    public static C7532f m10061y(C7492c cVar, C7534h hVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(hVar, "receiver");
        if (hVar instanceof C7452c0) {
            C7481g1 Y = ((C7452c0) hVar).mo25056Y();
            if (Y instanceof C7579w) {
                return (C7579w) Y;
            }
            return null;
        }
        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + hVar + ", " + C6902w.m12460a(hVar.getClass())).toString());
    }

    /* renamed from: y0 */
    public static <T> T m10062y0(Class<?> cls, Class<T> cls2) {
        try {
            return cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            StringBuilder u = C0843a.m460u("Provider ");
            u.append(cls.getName());
            u.append(" could not be instantiated.");
            throw new ServiceConfigurationError(u.toString(), e);
        }
    }

    /* renamed from: y1 */
    public static final Type m10063y1(C6741n nVar) {
        Type t;
        C6888i.m12438e(nVar, "$this$javaType");
        Type t2 = ((C5922i0) nVar).mo23020t();
        if (t2 != null) {
            return t2;
        }
        C6888i.m12438e(nVar, "$this$javaType");
        if (!(nVar instanceof C6889j) || (t = ((C6889j) nVar).mo23020t()) == null) {
            return C6750u.m12299b(nVar, false);
        }
        return t;
    }

    /* renamed from: y2 */
    public static boolean m10064y2(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            C6083h declarationDescriptor = ((C7567t0) lVar).getDeclarationDescriptor();
            Boolean bool = null;
            C6046e eVar = declarationDescriptor instanceof C6046e ? (C6046e) declarationDescriptor : null;
            if (eVar != null) {
                bool = Boolean.valueOf(C7197i.m13050b(eVar));
            }
            return C6888i.m12434a(bool, Boolean.TRUE);
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: y3 */
    public static final C7489j0 m10065y3(C7489j0 j0Var, List<? extends C7580w0> list, C6060h hVar) {
        C6888i.m12438e(j0Var, "<this>");
        C6888i.m12438e(list, "newArguments");
        C6888i.m12438e(hVar, "newAnnotations");
        if (list.isEmpty() && hVar == j0Var.getAnnotations()) {
            return j0Var;
        }
        if (list.isEmpty()) {
            return j0Var.mo23568d0(hVar);
        }
        C7455d0 d0Var = C7455d0.f14869a;
        return C7455d0.m13432g(hVar, j0Var.mo24887V(), list, j0Var.mo23566W(), (C7495e) null, 16);
    }

    /* renamed from: y4 */
    public static final <T> List<T> m10066y4(T[] tArr) {
        C6888i.m12438e(tArr, "$this$toList");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m9775A4(tArr) : m9910Y2(tArr[0]) : C6798p.f13713g;
    }

    /* renamed from: z */
    public static final <T> Iterable<T> m10067z(T[] tArr) {
        C6888i.m12438e(tArr, "$this$asIterable");
        return tArr.length == 0 ? C6798p.f13713g : new C6791i(tArr);
    }

    /* renamed from: z0 */
    public static final C6448e m10068z0(C6451h hVar, C6449f fVar, boolean z, boolean z2) {
        return (!z2 || hVar != C6451h.NOT_NULL) ? new C6448e(hVar, fVar, false, z) : new C6448e(hVar, fVar, true, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: d.a.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.C6726e<?> m10069z1(p298d.p299a.C6727f r5) {
        /*
            java.lang.String r0 = "$this$jvmErasure"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            boolean r0 = r5 instanceof p298d.p299a.C6726e
            if (r0 == 0) goto L_0x000c
            d.a.e r5 = (p298d.p299a.C6726e) r5
            goto L_0x0072
        L_0x000c:
            boolean r0 = r5 instanceof p298d.p299a.C6742o
            if (r0 == 0) goto L_0x0073
            d.a.o r5 = (p298d.p299a.C6742o) r5
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r0 = r5.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            r3 = r1
            d.a.n r3 = (p298d.p299a.C6741n) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            java.util.Objects.requireNonNull(r3, r4)
            d.a.a.a.i0 r3 = (p298d.p299a.p300a.p301a.C5922i0) r3
            d.a.a.a.y0.l.c0 r3 = r3.f11730j
            d.a.a.a.y0.l.t0 r3 = r3.mo24887V()
            d.a.a.a.y0.b.h r3 = r3.getDeclarationDescriptor()
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r4 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            d.a.a.a.y0.b.e r2 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r2
            if (r2 == 0) goto L_0x0055
            d.a.a.a.y0.b.f r3 = r2.getKind()
            d.a.a.a.y0.b.f r4 = p298d.p299a.p300a.p301a.p303y0.p304b.C6051f.INTERFACE
            if (r3 == r4) goto L_0x0055
            d.a.a.a.y0.b.f r2 = r2.getKind()
            d.a.a.a.y0.b.f r3 = p298d.p299a.p300a.p301a.p303y0.p304b.C6051f.ANNOTATION_CLASS
            if (r2 == r3) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x001a
            r2 = r1
        L_0x0059:
            d.a.n r2 = (p298d.p299a.C6741n) r2
            if (r2 == 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            java.lang.Object r5 = p298d.p334t.C6790h.m12363q(r5)
            r2 = r5
            d.a.n r2 = (p298d.p299a.C6741n) r2
        L_0x0065:
            if (r2 == 0) goto L_0x006c
            d.a.e r5 = m9772A1(r2)
            goto L_0x0072
        L_0x006c:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            d.a.e r5 = p298d.p344x.p346c.C6902w.m12460a(r5)
        L_0x0072:
            return r5
        L_0x0073:
            d.a.a.a.l0 r0 = new d.a.a.a.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p291q.p292a.C5266a.m10069z1(d.a.f):d.a.e");
    }

    /* renamed from: z2 */
    public static boolean m10070z2(C7492c cVar, C7538l lVar) {
        C6888i.m12438e(cVar, "this");
        C6888i.m12438e(lVar, "receiver");
        if (lVar instanceof C7567t0) {
            return lVar instanceof C7237o;
        }
        throw new IllegalArgumentException(C0843a.m458s(lVar, C0843a.m426B("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
    }

    /* renamed from: z3 */
    public static C7452c0 m10071z3(C7452c0 c0Var, List<C7580w0> list, C6060h hVar, List list2, int i) {
        if ((i & 1) != 0) {
            list = c0Var.mo24886U();
        }
        if ((i & 2) != 0) {
            hVar = c0Var.getAnnotations();
        }
        List<C7580w0> list3 = (i & 4) != 0 ? list : null;
        C6888i.m12438e(c0Var, "<this>");
        C6888i.m12438e(list, "newArguments");
        C6888i.m12438e(hVar, "newAnnotations");
        C6888i.m12438e(list3, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == c0Var.mo24886U()) && hVar == c0Var.getAnnotations()) {
            return c0Var;
        }
        C7481g1 Y = c0Var.mo25056Y();
        if (Y instanceof C7579w) {
            C7455d0 d0Var = C7455d0.f14869a;
            C7579w wVar = (C7579w) Y;
            return C7455d0.m13428c(m10065y3(wVar.f15029h, list, hVar), m10065y3(wVar.f15030i, list3, hVar));
        } else if (Y instanceof C7489j0) {
            return m10065y3((C7489j0) Y, list, hVar);
        } else {
            throw new C6766h();
        }
    }

    /* renamed from: z4 */
    public static final String m10072z4(String str, boolean z) {
        if (z) {
            C6888i.m12438e(str, "<this>");
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                i++;
                if ('A' <= charAt && charAt <= 'Z') {
                    charAt = Character.toLowerCase(charAt);
                }
                sb.append(charAt);
            }
            String sb2 = sb.toString();
            C6888i.m12437d(sb2, "builder.toString()");
            return sb2;
        }
        String lowerCase = str.toLowerCase();
        C6888i.m12437d(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
