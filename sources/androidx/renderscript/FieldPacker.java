package androidx.renderscript;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.util.BitSet;
import p005b.p035e.p036a.p037a.C0843a;

public class FieldPacker {
    private BitSet mAlignment;
    private byte[] mData;
    private int mLen;
    private int mPos;

    public FieldPacker(int i) {
        this.mPos = 0;
        this.mLen = i;
        this.mData = new byte[i];
        this.mAlignment = new BitSet();
    }

    public FieldPacker(byte[] bArr) {
        this.mPos = bArr.length;
        this.mLen = bArr.length;
        this.mData = bArr;
        this.mAlignment = new BitSet();
    }

    private void addSafely(Object obj) {
        boolean z;
        int i = this.mPos;
        do {
            z = false;
            try {
                addToPack(this, obj);
                continue;
            } catch (ArrayIndexOutOfBoundsException unused) {
                this.mPos = i;
                resize(this.mLen * 2);
                z = true;
                continue;
            }
        } while (z);
    }

    private static void addToPack(FieldPacker fieldPacker, Object obj) {
        if (obj instanceof Boolean) {
            fieldPacker.addBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            fieldPacker.addI8(((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            fieldPacker.addI16(((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            fieldPacker.addI32(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            fieldPacker.addI64(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            fieldPacker.addF32(((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            fieldPacker.addF64(((Double) obj).doubleValue());
        } else if (obj instanceof Byte2) {
            fieldPacker.addI8((Byte2) obj);
        } else if (obj instanceof Byte3) {
            fieldPacker.addI8((Byte3) obj);
        } else if (obj instanceof Byte4) {
            fieldPacker.addI8((Byte4) obj);
        } else if (obj instanceof Short2) {
            fieldPacker.addI16((Short2) obj);
        } else if (obj instanceof Short3) {
            fieldPacker.addI16((Short3) obj);
        } else if (obj instanceof Short4) {
            fieldPacker.addI16((Short4) obj);
        } else if (obj instanceof Int2) {
            fieldPacker.addI32((Int2) obj);
        } else if (obj instanceof Int3) {
            fieldPacker.addI32((Int3) obj);
        } else if (obj instanceof Int4) {
            fieldPacker.addI32((Int4) obj);
        } else if (obj instanceof Long2) {
            fieldPacker.addI64((Long2) obj);
        } else if (obj instanceof Long3) {
            fieldPacker.addI64((Long3) obj);
        } else if (obj instanceof Long4) {
            fieldPacker.addI64((Long4) obj);
        } else if (obj instanceof Float2) {
            fieldPacker.addF32((Float2) obj);
        } else if (obj instanceof Float3) {
            fieldPacker.addF32((Float3) obj);
        } else if (obj instanceof Float4) {
            fieldPacker.addF32((Float4) obj);
        } else if (obj instanceof Double2) {
            fieldPacker.addF64((Double2) obj);
        } else if (obj instanceof Double3) {
            fieldPacker.addF64((Double3) obj);
        } else if (obj instanceof Double4) {
            fieldPacker.addF64((Double4) obj);
        } else if (obj instanceof Matrix2f) {
            fieldPacker.addMatrix((Matrix2f) obj);
        } else if (obj instanceof Matrix3f) {
            fieldPacker.addMatrix((Matrix3f) obj);
        } else if (obj instanceof Matrix4f) {
            fieldPacker.addMatrix((Matrix4f) obj);
        } else if (obj instanceof BaseObj) {
            fieldPacker.addObj((BaseObj) obj);
        }
    }

    public static FieldPacker createFieldPack(Object[] objArr) {
        int i = 0;
        for (Object packedSize : objArr) {
            i += getPackedSize(packedSize);
        }
        FieldPacker fieldPacker = new FieldPacker(i);
        for (Object addToPack : objArr) {
            addToPack(fieldPacker, addToPack);
        }
        return fieldPacker;
    }

    public static FieldPacker createFromArray(Object[] objArr) {
        FieldPacker fieldPacker = new FieldPacker(RenderScript.sPointerSize * 8);
        for (Object addSafely : objArr) {
            fieldPacker.addSafely(addSafely);
        }
        fieldPacker.resize(fieldPacker.mPos);
        return fieldPacker;
    }

    private static int getPackedSize(Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof Byte)) {
            return 1;
        }
        if (obj instanceof Short) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if (obj instanceof Long) {
            return 8;
        }
        if (obj instanceof Float) {
            return 4;
        }
        if (obj instanceof Double) {
            return 8;
        }
        if (obj instanceof Byte2) {
            return 2;
        }
        if (obj instanceof Byte3) {
            return 3;
        }
        if ((obj instanceof Byte4) || (obj instanceof Short2)) {
            return 4;
        }
        if (obj instanceof Short3) {
            return 6;
        }
        if ((obj instanceof Short4) || (obj instanceof Int2)) {
            return 8;
        }
        if (obj instanceof Int3) {
            return 12;
        }
        if ((obj instanceof Int4) || (obj instanceof Long2)) {
            return 16;
        }
        if (obj instanceof Long3) {
            return 24;
        }
        if (obj instanceof Long4) {
            return 32;
        }
        if (obj instanceof Float2) {
            return 8;
        }
        if (obj instanceof Float3) {
            return 12;
        }
        if ((obj instanceof Float4) || (obj instanceof Double2)) {
            return 16;
        }
        if (obj instanceof Double3) {
            return 24;
        }
        if (obj instanceof Double4) {
            return 32;
        }
        if (obj instanceof Matrix2f) {
            return 16;
        }
        if (obj instanceof Matrix3f) {
            return 36;
        }
        if (obj instanceof Matrix4f) {
            return 64;
        }
        if (obj instanceof BaseObj) {
            return RenderScript.sPointerSize == 8 ? 32 : 4;
        }
        return 0;
    }

    private boolean resize(int i) {
        if (i == this.mLen) {
            return false;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.mData, 0, bArr, 0, this.mPos);
        this.mData = bArr;
        this.mLen = i;
        return true;
    }

    public void addBoolean(boolean z) {
        addI8(z ? (byte) 1 : 0);
    }

    public void addF32(float f) {
        addI32(Float.floatToRawIntBits(f));
    }

    public void addF32(Float2 float2) {
        addF32(float2.f156x);
        addF32(float2.f157y);
    }

    public void addF32(Float3 float3) {
        addF32(float3.f158x);
        addF32(float3.f159y);
        addF32(float3.f160z);
    }

    public void addF32(Float4 float4) {
        addF32(float4.f162x);
        addF32(float4.f163y);
        addF32(float4.f164z);
        addF32(float4.f161w);
    }

    public void addF64(double d) {
        addI64(Double.doubleToRawLongBits(d));
    }

    public void addF64(Double2 double2) {
        addF64(double2.f147x);
        addF64(double2.f148y);
    }

    public void addF64(Double3 double3) {
        addF64(double3.f149x);
        addF64(double3.f150y);
        addF64(double3.f151z);
    }

    public void addF64(Double4 double4) {
        addF64(double4.f153x);
        addF64(double4.f154y);
        addF64(double4.f155z);
        addF64(double4.f152w);
    }

    public void addI16(Short2 short2) {
        addI16(short2.f185x);
        addI16(short2.f186y);
    }

    public void addI16(Short3 short3) {
        addI16(short3.f187x);
        addI16(short3.f188y);
        addI16(short3.f189z);
    }

    public void addI16(Short4 short4) {
        addI16(short4.f191x);
        addI16(short4.f192y);
        addI16(short4.f193z);
        addI16(short4.f190w);
    }

    public void addI16(short s) {
        align(2);
        byte[] bArr = this.mData;
        int i = this.mPos;
        int i2 = i + 1;
        this.mPos = i2;
        bArr[i] = (byte) (s & 255);
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (s >> 8);
    }

    public void addI32(int i) {
        align(4);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.mPos = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.mPos = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.mPos = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public void addI32(Int2 int2) {
        addI32(int2.f165x);
        addI32(int2.f166y);
    }

    public void addI32(Int3 int3) {
        addI32(int3.f167x);
        addI32(int3.f168y);
        addI32(int3.f169z);
    }

    public void addI32(Int4 int4) {
        addI32(int4.f171x);
        addI32(int4.f172y);
        addI32(int4.f173z);
        addI32(int4.f170w);
    }

    public void addI64(long j) {
        align(8);
        byte[] bArr = this.mData;
        int i = this.mPos;
        int i2 = i + 1;
        this.mPos = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.mPos = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.mPos = i5;
        bArr[i4] = (byte) ((int) ((j >> 24) & 255));
        int i6 = i5 + 1;
        this.mPos = i6;
        bArr[i5] = (byte) ((int) ((j >> 32) & 255));
        int i7 = i6 + 1;
        this.mPos = i7;
        bArr[i6] = (byte) ((int) ((j >> 40) & 255));
        int i8 = i7 + 1;
        this.mPos = i8;
        bArr[i7] = (byte) ((int) ((j >> 48) & 255));
        this.mPos = i8 + 1;
        bArr[i8] = (byte) ((int) ((j >> 56) & 255));
    }

    public void addI64(Long2 long2) {
        addI64(long2.f174x);
        addI64(long2.f175y);
    }

    public void addI64(Long3 long3) {
        addI64(long3.f176x);
        addI64(long3.f177y);
        addI64(long3.f178z);
    }

    public void addI64(Long4 long4) {
        addI64(long4.f180x);
        addI64(long4.f181y);
        addI64(long4.f182z);
        addI64(long4.f179w);
    }

    public void addI8(byte b) {
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = b;
    }

    public void addI8(Byte2 byte2) {
        addI8(byte2.f138x);
        addI8(byte2.f139y);
    }

    public void addI8(Byte3 byte3) {
        addI8(byte3.f140x);
        addI8(byte3.f141y);
        addI8(byte3.f142z);
    }

    public void addI8(Byte4 byte4) {
        addI8(byte4.f144x);
        addI8(byte4.f145y);
        addI8(byte4.f146z);
        addI8(byte4.f143w);
    }

    public void addMatrix(Matrix2f matrix2f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix2f.mMat;
            if (i < fArr.length) {
                addF32(fArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void addMatrix(Matrix3f matrix3f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix3f.mMat;
            if (i < fArr.length) {
                addF32(fArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void addMatrix(Matrix4f matrix4f) {
        int i = 0;
        while (true) {
            float[] fArr = matrix4f.mMat;
            if (i < fArr.length) {
                addF32(fArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void addObj(BaseObj baseObj) {
        int i;
        if (baseObj != null) {
            if (RenderScript.sPointerSize == 8) {
                addI64(baseObj.getID((RenderScript) null));
            } else {
                i = (int) baseObj.getID((RenderScript) null);
                addI32(i);
                return;
            }
        } else if (RenderScript.sPointerSize == 8) {
            addI64(0);
        } else {
            i = 0;
            addI32(i);
            return;
        }
        addI64(0);
        addI64(0);
        addI64(0);
    }

    public void addU16(int i) {
        if (i < 0 || i > 65535) {
            Log.e("rs", "FieldPacker.addU16( " + i + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(2);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) (i & 255);
        this.mPos = i3 + 1;
        bArr[i3] = (byte) (i >> 8);
    }

    public void addU16(Int2 int2) {
        addU16(int2.f165x);
        addU16(int2.f166y);
    }

    public void addU16(Int3 int3) {
        addU16(int3.f167x);
        addU16(int3.f168y);
        addU16(int3.f169z);
    }

    public void addU16(Int4 int4) {
        addU16(int4.f171x);
        addU16(int4.f172y);
        addU16(int4.f173z);
        addU16(int4.f170w);
    }

    public void addU32(long j) {
        if (j < 0 || j > 4294967295L) {
            Log.e("rs", "FieldPacker.addU32( " + j + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(4);
        byte[] bArr = this.mData;
        int i = this.mPos;
        int i2 = i + 1;
        this.mPos = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.mPos = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.mPos = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        this.mPos = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >> 24) & 255));
    }

    public void addU32(Long2 long2) {
        addU32(long2.f174x);
        addU32(long2.f175y);
    }

    public void addU32(Long3 long3) {
        addU32(long3.f176x);
        addU32(long3.f177y);
        addU32(long3.f178z);
    }

    public void addU32(Long4 long4) {
        addU32(long4.f180x);
        addU32(long4.f181y);
        addU32(long4.f182z);
        addU32(long4.f179w);
    }

    public void addU64(long j) {
        if (j >= 0) {
            align(8);
            byte[] bArr = this.mData;
            int i = this.mPos;
            int i2 = i + 1;
            this.mPos = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.mPos = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.mPos = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.mPos = i5;
            bArr[i4] = (byte) ((int) ((j >> 24) & 255));
            int i6 = i5 + 1;
            this.mPos = i6;
            bArr[i5] = (byte) ((int) ((j >> 32) & 255));
            int i7 = i6 + 1;
            this.mPos = i7;
            bArr[i6] = (byte) ((int) ((j >> 40) & 255));
            int i8 = i7 + 1;
            this.mPos = i8;
            bArr[i7] = (byte) ((int) ((j >> 48) & 255));
            this.mPos = i8 + 1;
            bArr[i8] = (byte) ((int) ((j >> 56) & 255));
            return;
        }
        Log.e("rs", "FieldPacker.addU64( " + j + " )");
        throw new IllegalArgumentException("Saving value out of range for type");
    }

    public void addU64(Long2 long2) {
        addU64(long2.f174x);
        addU64(long2.f175y);
    }

    public void addU64(Long3 long3) {
        addU64(long3.f176x);
        addU64(long3.f177y);
        addU64(long3.f178z);
    }

    public void addU64(Long4 long4) {
        addU64(long4.f180x);
        addU64(long4.f181y);
        addU64(long4.f182z);
        addU64(long4.f179w);
    }

    public void addU8(Short2 short2) {
        addU8(short2.f185x);
        addU8(short2.f186y);
    }

    public void addU8(Short3 short3) {
        addU8(short3.f187x);
        addU8(short3.f188y);
        addU8(short3.f189z);
    }

    public void addU8(Short4 short4) {
        addU8(short4.f191x);
        addU8(short4.f192y);
        addU8(short4.f193z);
        addU8(short4.f190w);
    }

    public void addU8(short s) {
        if (s < 0 || s > 255) {
            Log.e("rs", "FieldPacker.addU8( " + s + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) s;
    }

    public void align(int i) {
        if (i > 0) {
            int i2 = i - 1;
            if ((i & i2) == 0) {
                while (true) {
                    int i3 = this.mPos;
                    if ((i3 & i2) != 0) {
                        this.mAlignment.flip(i3);
                        byte[] bArr = this.mData;
                        int i4 = this.mPos;
                        this.mPos = i4 + 1;
                        bArr[i4] = 0;
                    } else {
                        return;
                    }
                }
            }
        }
        throw new RSIllegalArgumentException(C0843a.m444e("argument must be a non-negative non-zero power of 2: ", i));
    }

    public final byte[] getData() {
        return this.mData;
    }

    public int getPos() {
        return this.mPos;
    }

    public void reset() {
        this.mPos = 0;
    }

    public void reset(int i) {
        if (i < 0 || i > this.mLen) {
            throw new RSIllegalArgumentException(C0843a.m444e("out of range argument: ", i));
        }
        this.mPos = i;
    }

    public void skip(int i) {
        int i2 = this.mPos + i;
        if (i2 < 0 || i2 > this.mLen) {
            throw new RSIllegalArgumentException(C0843a.m444e("out of range argument: ", i));
        }
        this.mPos = i2;
    }

    public boolean subBoolean() {
        return subI8() == 1;
    }

    public Byte2 subByte2() {
        Byte2 byte2 = new Byte2();
        byte2.f139y = subI8();
        byte2.f138x = subI8();
        return byte2;
    }

    public Byte3 subByte3() {
        Byte3 byte3 = new Byte3();
        byte3.f142z = subI8();
        byte3.f141y = subI8();
        byte3.f140x = subI8();
        return byte3;
    }

    public Byte4 subByte4() {
        Byte4 byte4 = new Byte4();
        byte4.f143w = subI8();
        byte4.f146z = subI8();
        byte4.f145y = subI8();
        byte4.f144x = subI8();
        return byte4;
    }

    public Double2 subDouble2() {
        Double2 double2 = new Double2();
        double2.f148y = subF64();
        double2.f147x = subF64();
        return double2;
    }

    public Double3 subDouble3() {
        Double3 double3 = new Double3();
        double3.f151z = subF64();
        double3.f150y = subF64();
        double3.f149x = subF64();
        return double3;
    }

    public Double4 subDouble4() {
        Double4 double4 = new Double4();
        double4.f152w = subF64();
        double4.f155z = subF64();
        double4.f154y = subF64();
        double4.f153x = subF64();
        return double4;
    }

    public float subF32() {
        return Float.intBitsToFloat(subI32());
    }

    public double subF64() {
        return Double.longBitsToDouble(subI64());
    }

    public Float2 subFloat2() {
        Float2 float2 = new Float2();
        float2.f157y = subF32();
        float2.f156x = subF32();
        return float2;
    }

    public Float3 subFloat3() {
        Float3 float3 = new Float3();
        float3.f160z = subF32();
        float3.f159y = subF32();
        float3.f158x = subF32();
        return float3;
    }

    public Float4 subFloat4() {
        Float4 float4 = new Float4();
        float4.f161w = subF32();
        float4.f164z = subF32();
        float4.f163y = subF32();
        float4.f162x = subF32();
        return float4;
    }

    public short subI16() {
        subalign(2);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = i - 1;
        this.mPos = i2;
        return (short) (((short) (bArr[i2] & ExifInterface.MARKER)) | ((short) ((bArr[i] & ExifInterface.MARKER) << 8)));
    }

    public int subI32() {
        subalign(4);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = i - 1;
        this.mPos = i2;
        int i3 = i2 - 1;
        this.mPos = i3;
        int i4 = i3 - 1;
        this.mPos = i4;
        return (bArr[i4] & ExifInterface.MARKER) | ((bArr[i] & ExifInterface.MARKER) << 24) | ((bArr[i2] & ExifInterface.MARKER) << 16) | ((bArr[i3] & ExifInterface.MARKER) << 8);
    }

    public long subI64() {
        subalign(8);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = i - 1;
        this.mPos = i2;
        int i3 = i2 - 1;
        this.mPos = i3;
        int i4 = i3 - 1;
        this.mPos = i4;
        int i5 = i4 - 1;
        this.mPos = i5;
        int i6 = i5 - 1;
        this.mPos = i6;
        int i7 = i6 - 1;
        this.mPos = i7;
        int i8 = i7 - 1;
        this.mPos = i8;
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i]) & 255) << 56) | 0 | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    public byte subI8() {
        subalign(1);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        return bArr[i];
    }

    public Int2 subInt2() {
        Int2 int2 = new Int2();
        int2.f166y = subI32();
        int2.f165x = subI32();
        return int2;
    }

    public Int3 subInt3() {
        Int3 int3 = new Int3();
        int3.f169z = subI32();
        int3.f168y = subI32();
        int3.f167x = subI32();
        return int3;
    }

    public Int4 subInt4() {
        Int4 int4 = new Int4();
        int4.f170w = subI32();
        int4.f173z = subI32();
        int4.f172y = subI32();
        int4.f171x = subI32();
        return int4;
    }

    public Long2 subLong2() {
        Long2 long2 = new Long2();
        long2.f175y = subI64();
        long2.f174x = subI64();
        return long2;
    }

    public Long3 subLong3() {
        Long3 long3 = new Long3();
        long3.f178z = subI64();
        long3.f177y = subI64();
        long3.f176x = subI64();
        return long3;
    }

    public Long4 subLong4() {
        Long4 long4 = new Long4();
        long4.f179w = subI64();
        long4.f182z = subI64();
        long4.f181y = subI64();
        long4.f180x = subI64();
        return long4;
    }

    public Matrix2f subMatrix2f() {
        Matrix2f matrix2f = new Matrix2f();
        for (int length = matrix2f.mMat.length - 1; length >= 0; length--) {
            matrix2f.mMat[length] = subF32();
        }
        return matrix2f;
    }

    public Matrix3f subMatrix3f() {
        Matrix3f matrix3f = new Matrix3f();
        for (int length = matrix3f.mMat.length - 1; length >= 0; length--) {
            matrix3f.mMat[length] = subF32();
        }
        return matrix3f;
    }

    public Matrix4f subMatrix4f() {
        Matrix4f matrix4f = new Matrix4f();
        for (int length = matrix4f.mMat.length - 1; length >= 0; length--) {
            matrix4f.mMat[length] = subF32();
        }
        return matrix4f;
    }

    public Short2 subShort2() {
        Short2 short2 = new Short2();
        short2.f186y = subI16();
        short2.f185x = subI16();
        return short2;
    }

    public Short3 subShort3() {
        Short3 short3 = new Short3();
        short3.f189z = subI16();
        short3.f188y = subI16();
        short3.f187x = subI16();
        return short3;
    }

    public Short4 subShort4() {
        Short4 short4 = new Short4();
        short4.f190w = subI16();
        short4.f193z = subI16();
        short4.f192y = subI16();
        short4.f191x = subI16();
        return short4;
    }

    public void subalign(int i) {
        int i2;
        int i3 = i - 1;
        if ((i & i3) == 0) {
            while (true) {
                i2 = this.mPos;
                if ((i2 & i3) == 0) {
                    break;
                }
                this.mPos = i2 - 1;
            }
            if (i2 > 0) {
                while (this.mAlignment.get(this.mPos - 1)) {
                    int i4 = this.mPos - 1;
                    this.mPos = i4;
                    this.mAlignment.flip(i4);
                }
                return;
            }
            return;
        }
        throw new RSIllegalArgumentException(C0843a.m444e("argument must be a non-negative non-zero power of 2: ", i));
    }
}
