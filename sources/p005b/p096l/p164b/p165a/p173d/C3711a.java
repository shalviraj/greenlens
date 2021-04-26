package p005b.p096l.p164b.p165a.p173d;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.d.a */
public class C3711a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: g */
    public int f6850g;

    /* renamed from: h */
    public Object[] f6851h;

    /* renamed from: b.l.b.a.d.a$a */
    public final class C3712a implements Map.Entry<K, V> {

        /* renamed from: g */
        public int f6852g;

        public C3712a(int i) {
            this.f6852g = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!C1960d.m2725K(getKey(), entry.getKey()) || !C1960d.m2725K(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        public K getKey() {
            C3711a aVar = C3711a.this;
            int i = this.f6852g;
            Objects.requireNonNull(aVar);
            if (i < 0 || i >= aVar.f6850g) {
                return null;
            }
            return aVar.f6851h[i << 1];
        }

        public V getValue() {
            return C3711a.this.mo15049c(this.f6852g);
        }

        public int hashCode() {
            Object key = getKey();
            Object value = getValue();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            return C3711a.this.mo15056g(this.f6852g, v);
        }
    }

    /* renamed from: b.l.b.a.d.a$b */
    public final class C3713b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: g */
        public boolean f6854g;

        /* renamed from: h */
        public int f6855h;

        public C3713b() {
        }

        public boolean hasNext() {
            return this.f6855h < C3711a.this.f6850g;
        }

        public Object next() {
            int i = this.f6855h;
            C3711a aVar = C3711a.this;
            if (i != aVar.f6850g) {
                this.f6855h = i + 1;
                this.f6854g = false;
                return new C3712a(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            int i = this.f6855h - 1;
            if (this.f6854g || i < 0) {
                throw new IllegalArgumentException();
            }
            C3711a.this.mo15055f(i << 1);
            this.f6855h--;
            this.f6854g = true;
        }
    }

    /* renamed from: b.l.b.a.d.a$c */
    public final class C3714c extends AbstractSet<Map.Entry<K, V>> {
        public C3714c() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3713b();
        }

        public int size() {
            return C3711a.this.f6850g;
        }
    }

    /* renamed from: a */
    public C3711a<K, V> clone() {
        try {
            C3711a<K, V> aVar = (C3711a) super.clone();
            Object[] objArr = this.f6851h;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f6851h = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final int mo15048b(Object obj) {
        int i = this.f6850g << 1;
        Object[] objArr = this.f6851h;
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    /* renamed from: c */
    public final V mo15049c(int i) {
        if (i < 0 || i >= this.f6850g) {
            return null;
        }
        return mo15058h((i << 1) + 1);
    }

    public void clear() {
        this.f6850g = 0;
        this.f6851h = null;
    }

    public final boolean containsKey(Object obj) {
        return -2 != mo15048b(obj);
    }

    public final boolean containsValue(Object obj) {
        int i = this.f6850g << 1;
        Object[] objArr = this.f6851h;
        int i2 = 1;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new C3714c();
    }

    /* renamed from: f */
    public final V mo15055f(int i) {
        int i2 = this.f6850g << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V h = mo15058h(i + 1);
        Object[] objArr = this.f6851h;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f6850g--;
        int i4 = i2 - 2;
        Object[] objArr2 = this.f6851h;
        objArr2[i4] = null;
        objArr2[i4 + 1] = null;
        return h;
    }

    /* renamed from: g */
    public final V mo15056g(int i, V v) {
        int i2 = this.f6850g;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V h = mo15058h(i3);
        this.f6851h[i3] = v;
        return h;
    }

    public final V get(Object obj) {
        return mo15058h(mo15048b(obj) + 1);
    }

    /* renamed from: h */
    public final V mo15058h(int i) {
        if (i < 0) {
            return null;
        }
        return this.f6851h[i];
    }

    public final V put(K k, V v) {
        int b = mo15048b(k) >> 1;
        if (b == -1) {
            b = this.f6850g;
        }
        if (b >= 0) {
            int i = b + 1;
            if (i >= 0) {
                Object[] objArr = this.f6851h;
                int i2 = i << 1;
                int length = objArr == null ? 0 : objArr.length;
                if (i2 > length) {
                    int i3 = ((length / 2) * 3) + 1;
                    if (i3 % 2 != 0) {
                        i3++;
                    }
                    if (i3 >= i2) {
                        i2 = i3;
                    }
                    if (i2 == 0) {
                        this.f6851h = null;
                    } else {
                        int i4 = this.f6850g;
                        if (i4 == 0 || i2 != objArr.length) {
                            Object[] objArr2 = new Object[i2];
                            this.f6851h = objArr2;
                            if (i4 != 0) {
                                System.arraycopy(objArr, 0, objArr2, 0, i4 << 1);
                            }
                        }
                    }
                }
                int i5 = b << 1;
                int i6 = i5 + 1;
                V h = mo15058h(i6);
                Object[] objArr3 = this.f6851h;
                objArr3[i5] = k;
                objArr3[i6] = v;
                if (i > this.f6850g) {
                    this.f6850g = i;
                }
                return h;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V remove(Object obj) {
        return mo15055f(mo15048b(obj));
    }

    public final int size() {
        return this.f6850g;
    }
}
