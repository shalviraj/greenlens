package androidx.renderscript;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.Surface;
import androidx.renderscript.Element;
import androidx.renderscript.Type;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p005b.p035e.p036a.p037a.C0843a;

public class Allocation extends BaseObj {
    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    public static final int USAGE_IO_INPUT = 32;
    public static final int USAGE_IO_OUTPUT = 64;
    public static final int USAGE_SCRIPT = 1;
    public static final int USAGE_SHARED = 128;
    public static BitmapFactory.Options mBitmapOptions;
    public Allocation mAdaptedAllocation;
    public boolean mAutoPadding = false;
    public Bitmap mBitmap;
    public ByteBuffer mByteBuffer = null;
    public long mByteBufferStride = 0;
    public boolean mConstrainedFace;
    public boolean mConstrainedLOD;
    public boolean mConstrainedY;
    public boolean mConstrainedZ;
    public int mCurrentCount;
    public int mCurrentDimX;
    public int mCurrentDimY;
    public int mCurrentDimZ;
    public boolean mIncAllocDestroyed;
    public long mIncCompatAllocation;
    public boolean mReadAllowed = true;
    public Type.CubemapFace mSelectedFace = Type.CubemapFace.POSITIVE_X;
    public int mSelectedLOD;
    public int mSelectedY;
    public int mSelectedZ;
    public int mSize;
    public Type mType;
    public int mUsage;
    public boolean mWriteAllowed = true;

    /* renamed from: androidx.renderscript.Allocation$1 */
    public static /* synthetic */ class C04691 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$graphics$Bitmap$Config = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.renderscript.Allocation.C04691.<clinit>():void");
        }
    }

    public enum MipmapControl {
        MIPMAP_NONE(0),
        MIPMAP_FULL(1),
        MIPMAP_ON_SYNC_TO_TEXTURE(2);
        
        public int mID;

        private MipmapControl(int i) {
            this.mID = i;
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        mBitmapOptions = options;
        options.inScaled = false;
    }

    public Allocation(long j, RenderScript renderScript, Type type, int i) {
        super(j, renderScript);
        if ((i & -228) == 0) {
            if ((i & 32) != 0) {
                this.mWriteAllowed = false;
                if ((i & -36) != 0) {
                    throw new RSIllegalArgumentException("Invalid usage combination.");
                }
            }
            this.mType = type;
            this.mUsage = i;
            this.mIncCompatAllocation = 0;
            this.mIncAllocDestroyed = false;
            if (type != null) {
                this.mSize = this.mType.getElement().getBytesSize() * type.getCount();
                updateCacheInfo(type);
            }
            if (RenderScript.sUseGCHooks) {
                try {
                    RenderScript.registerNativeAllocation.invoke(RenderScript.sRuntime, new Object[]{Integer.valueOf(this.mSize)});
                } catch (Exception e) {
                    Log.e(RenderScript.LOG_TAG, "Couldn't invoke registerNativeAllocation:" + e);
                    throw new RSRuntimeException("Couldn't invoke registerNativeAllocation:" + e);
                }
            }
        } else {
            throw new RSIllegalArgumentException("Unknown usage specified.");
        }
    }

    private void copy1DRangeFromUnchecked(int i, int i2, Object obj, Element.DataType dataType, int i3) {
        int bytesSize = this.mType.mElement.getBytesSize() * i2;
        boolean z = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        data1DChecks(i, i2, i3 * dataType.mSize, bytesSize, z);
        this.mRS.nAllocationData1D(getIDSafe(), i, this.mSelectedLOD, i2, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    private void copy1DRangeToUnchecked(int i, int i2, Object obj, Element.DataType dataType, int i3) {
        int bytesSize = this.mType.mElement.getBytesSize() * i2;
        boolean z = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        data1DChecks(i, i2, i3 * dataType.mSize, bytesSize, z);
        this.mRS.nAllocationRead1D(getIDSafe(), i, this.mSelectedLOD, i2, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    private void copy3DRangeFromUnchecked(int i, int i2, int i3, int i4, int i5, int i6, Object obj, Element.DataType dataType, int i7) {
        boolean z;
        int i8;
        this.mRS.validate();
        validate3DRange(i, i2, i3, i4, i5, i6);
        int bytesSize = this.mType.mElement.getBytesSize() * i4 * i5 * i6;
        int i9 = dataType.mSize * i7;
        if (!this.mAutoPadding || this.mType.getElement().getVectorSize() != 3) {
            if (bytesSize <= i9) {
                z = false;
                i8 = i9;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if ((bytesSize / 4) * 3 <= i9) {
            i8 = bytesSize;
            z = true;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationData3D(getIDSafe(), i, i2, i3, this.mSelectedLOD, i4, i5, i6, obj, i8, dataType, this.mType.mElement.mType.mSize, z);
    }

    private void copyFromUnchecked(Object obj, Element.DataType dataType, int i) {
        this.mRS.validate();
        int i2 = this.mCurrentDimZ;
        if (i2 > 0) {
            copy3DRangeFromUnchecked(0, 0, 0, this.mCurrentDimX, this.mCurrentDimY, i2, obj, dataType, i);
            return;
        }
        int i3 = this.mCurrentDimY;
        if (i3 > 0) {
            copy2DRangeFromUnchecked(0, 0, this.mCurrentDimX, i3, obj, dataType, i);
            return;
        }
        copy1DRangeFromUnchecked(0, this.mCurrentCount, obj, dataType, i);
    }

    private void copyTo(Object obj, Element.DataType dataType, int i) {
        this.mRS.validate();
        boolean z = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        if (z) {
            if (dataType.mSize * i < (this.mSize / 4) * 3) {
                throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
            }
        } else if (dataType.mSize * i < this.mSize) {
            throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
        }
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationRead(getID(renderScript), obj, dataType, this.mType.mElement.mType.mSize, z);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createCubemapFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i) {
        renderScript.validate();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (width % 6 != 0) {
            throw new RSIllegalArgumentException("Cubemap height must be multiple of 6");
        } else if (width / 6 == height) {
            boolean z = false;
            if (((height + -1) & height) == 0) {
                Element elementFromBitmap = elementFromBitmap(renderScript, bitmap);
                Type.Builder builder = new Type.Builder(renderScript, elementFromBitmap);
                builder.setX(height);
                builder.setY(height);
                builder.setFaces(true);
                if (mipmapControl == MipmapControl.MIPMAP_FULL) {
                    z = true;
                }
                builder.setMipmaps(z);
                Type create = builder.create();
                long nAllocationCubeCreateFromBitmap = renderScript.nAllocationCubeCreateFromBitmap(create.getID(renderScript), mipmapControl.mID, bitmap, i);
                if (nAllocationCubeCreateFromBitmap != 0) {
                    return new Allocation(nAllocationCubeCreateFromBitmap, renderScript, create, i);
                }
                throw new RSRuntimeException("Load failed for bitmap " + bitmap + " element " + elementFromBitmap);
            }
            throw new RSIllegalArgumentException("Only power of 2 cube faces supported");
        } else {
            throw new RSIllegalArgumentException("Only square cube map faces supported");
        }
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6) {
        return createCubemapFromCubeFaces(renderScript, bitmap, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, MipmapControl mipmapControl, int i) {
        return null;
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, ScriptIntrinsicBLAS.NON_UNIT);
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i) {
        renderScript.validate();
        if (bitmap.getConfig() != null) {
            Type typeFromBitmap = typeFromBitmap(renderScript, bitmap, mipmapControl);
            if (mipmapControl == MipmapControl.MIPMAP_NONE && typeFromBitmap.getElement().isCompatible(Element.RGBA_8888(renderScript)) && i == 131) {
                long nAllocationCreateBitmapBackedAllocation = renderScript.nAllocationCreateBitmapBackedAllocation(typeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap, i);
                if (nAllocationCreateBitmapBackedAllocation != 0) {
                    Allocation allocation = new Allocation(nAllocationCreateBitmapBackedAllocation, renderScript, typeFromBitmap, i);
                    allocation.setBitmap(bitmap);
                    return allocation;
                }
                throw new RSRuntimeException("Load failed.");
            }
            long nAllocationCreateFromBitmap = renderScript.nAllocationCreateFromBitmap(typeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap, i);
            if (nAllocationCreateFromBitmap != 0) {
                return new Allocation(nAllocationCreateFromBitmap, renderScript, typeFromBitmap, i);
            }
            throw new RSRuntimeException("Load failed.");
        } else if ((i & 128) == 0) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return createFromBitmap(renderScript, createBitmap, mipmapControl, i);
        } else {
            throw new RSIllegalArgumentException("USAGE_SHARED cannot be used with a Bitmap that has a null config.");
        }
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i) {
        return createFromBitmapResource(renderScript, resources, i, MipmapControl.MIPMAP_NONE, 3);
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i, MipmapControl mipmapControl, int i2) {
        renderScript.validate();
        if ((i2 & 224) == 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
            Allocation createFromBitmap = createFromBitmap(renderScript, decodeResource, mipmapControl, i2);
            decodeResource.recycle();
            return createFromBitmap;
        }
        throw new RSIllegalArgumentException("Unsupported usage specified.");
    }

    public static Allocation createFromString(RenderScript renderScript, String str, int i) {
        renderScript.validate();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Allocation createSized = createSized(renderScript, Element.m45U8(renderScript), bytes.length, i);
            createSized.copyFrom(bytes);
            return createSized;
        } catch (Exception unused) {
            throw new RSRuntimeException("Could not convert string to utf-8.");
        }
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i) {
        return createSized(renderScript, element, i, 1);
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i, int i2) {
        renderScript.validate();
        Type.Builder builder = new Type.Builder(renderScript, element);
        builder.setX(i);
        Type create = builder.create();
        long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(create.getID(renderScript), MipmapControl.MIPMAP_NONE.mID, i2, 0);
        if (nAllocationCreateTyped != 0) {
            return new Allocation(nAllocationCreateTyped, renderScript, create, i2);
        }
        throw new RSRuntimeException("Allocation creation failed.");
    }

    public static Allocation createTyped(RenderScript renderScript, Type type) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, 1);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, int i) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, i);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, MipmapControl mipmapControl, int i) {
        renderScript.validate();
        if (type.getID(renderScript) == 0) {
            throw new RSInvalidStateException("Bad Type");
        } else if (renderScript.usingIO() || (i & 32) == 0) {
            long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(type.getID(renderScript), mipmapControl.mID, i, 0);
            if (nAllocationCreateTyped != 0) {
                return new Allocation(nAllocationCreateTyped, renderScript, type, i);
            }
            throw new RSRuntimeException("Allocation creation failed.");
        } else {
            throw new RSRuntimeException("USAGE_IO not supported, Allocation creation failed.");
        }
    }

    private void data1DChecks(int i, int i2, int i3, int i4, boolean z) {
        this.mRS.validate();
        if (i < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        } else if (i2 < 1) {
            throw new RSIllegalArgumentException("Count must be >= 1.");
        } else if (i + i2 > this.mCurrentCount) {
            StringBuilder u = C0843a.m460u("Overflow, Available count ");
            u.append(this.mCurrentCount);
            u.append(", got ");
            u.append(i2);
            u.append(" at offset ");
            throw new RSIllegalArgumentException(C0843a.m453n(u, i, "."));
        } else if (z) {
            if (i3 < (i4 / 4) * 3) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if (i3 < i4) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
    }

    public static Element elementFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return Element.A_8(renderScript);
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return Element.RGBA_4444(renderScript);
        }
        if (config == Bitmap.Config.ARGB_8888) {
            return Element.RGBA_8888(renderScript);
        }
        if (config == Bitmap.Config.RGB_565) {
            return Element.RGB_565(renderScript);
        }
        throw new RSInvalidStateException("Bad bitmap type: " + config);
    }

    private long getIDSafe() {
        Allocation allocation = this.mAdaptedAllocation;
        return allocation != null ? allocation.getID(this.mRS) : getID(this.mRS);
    }

    private void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public static Type typeFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl) {
        Type.Builder builder = new Type.Builder(renderScript, elementFromBitmap(renderScript, bitmap));
        builder.setX(bitmap.getWidth());
        builder.setY(bitmap.getHeight());
        builder.setMipmaps(mipmapControl == MipmapControl.MIPMAP_FULL);
        return builder.create();
    }

    private void updateCacheInfo(Type type) {
        this.mCurrentDimX = type.getX();
        this.mCurrentDimY = type.getY();
        int z = type.getZ();
        this.mCurrentDimZ = z;
        int i = this.mCurrentDimX;
        this.mCurrentCount = i;
        int i2 = this.mCurrentDimY;
        if (i2 > 1) {
            this.mCurrentCount = i * i2;
        }
        if (z > 1) {
            this.mCurrentCount *= z;
        }
    }

    private void validate2DRange(int i, int i2, int i3, int i4) {
        if (this.mAdaptedAllocation == null) {
            if (i < 0 || i2 < 0) {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            } else if (i4 < 0 || i3 < 0) {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            } else if (i + i3 > this.mCurrentDimX || i2 + i4 > this.mCurrentDimY) {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }

    private void validate3DRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.mAdaptedAllocation == null) {
            if (i < 0 || i2 < 0 || i3 < 0) {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            } else if (i5 < 0 || i4 < 0 || i6 < 0) {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            } else if (i + i4 > this.mCurrentDimX || i2 + i5 > this.mCurrentDimY || i3 + i6 > this.mCurrentDimZ) {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }

    private void validateBitmapFormat(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config != null) {
            int i = C04691.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 2) {
                                StringBuilder u = C0843a.m460u("Allocation kind is ");
                                u.append(this.mType.getElement().mKind);
                                u.append(", type ");
                                u.append(this.mType.getElement().mType);
                                u.append(" of ");
                                u.append(this.mType.getElement().getBytesSize());
                                u.append(" bytes, passed bitmap was ");
                                u.append(config);
                                throw new RSIllegalArgumentException(u.toString());
                            }
                        }
                    } else if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGB || this.mType.getElement().getBytesSize() != 2) {
                        StringBuilder u2 = C0843a.m460u("Allocation kind is ");
                        u2.append(this.mType.getElement().mKind);
                        u2.append(", type ");
                        u2.append(this.mType.getElement().mType);
                        u2.append(" of ");
                        u2.append(this.mType.getElement().getBytesSize());
                        u2.append(" bytes, passed bitmap was ");
                        u2.append(config);
                        throw new RSIllegalArgumentException(u2.toString());
                    }
                } else if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 4) {
                    StringBuilder u3 = C0843a.m460u("Allocation kind is ");
                    u3.append(this.mType.getElement().mKind);
                    u3.append(", type ");
                    u3.append(this.mType.getElement().mType);
                    u3.append(" of ");
                    u3.append(this.mType.getElement().getBytesSize());
                    u3.append(" bytes, passed bitmap was ");
                    u3.append(config);
                    throw new RSIllegalArgumentException(u3.toString());
                }
            } else if (this.mType.getElement().mKind != Element.DataKind.PIXEL_A) {
                StringBuilder u4 = C0843a.m460u("Allocation kind is ");
                u4.append(this.mType.getElement().mKind);
                u4.append(", type ");
                u4.append(this.mType.getElement().mType);
                u4.append(" of ");
                u4.append(this.mType.getElement().getBytesSize());
                u4.append(" bytes, passed bitmap was ");
                u4.append(config);
                throw new RSIllegalArgumentException(u4.toString());
            }
        } else {
            throw new RSIllegalArgumentException("Bitmap has an unsupported format for this operation");
        }
    }

    private void validateBitmapSize(Bitmap bitmap) {
        if (this.mCurrentDimX != bitmap.getWidth() || this.mCurrentDimY != bitmap.getHeight()) {
            throw new RSIllegalArgumentException("Cannot update allocation from bitmap, sizes mismatch");
        }
    }

    private void validateIsFloat32() {
        if (this.mType.mElement.mType != Element.DataType.FLOAT_32) {
            StringBuilder u = C0843a.m460u("32 bit float source does not match allocation type ");
            u.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(u.toString());
        }
    }

    private void validateIsFloat64() {
        if (this.mType.mElement.mType != Element.DataType.FLOAT_64) {
            StringBuilder u = C0843a.m460u("64 bit float source does not match allocation type ");
            u.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(u.toString());
        }
    }

    private void validateIsInt16() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_16 && dataType != Element.DataType.UNSIGNED_16) {
            StringBuilder u = C0843a.m460u("16 bit integer source does not match allocation type ");
            u.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(u.toString());
        }
    }

    private void validateIsInt32() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_32 && dataType != Element.DataType.UNSIGNED_32) {
            StringBuilder u = C0843a.m460u("32 bit integer source does not match allocation type ");
            u.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(u.toString());
        }
    }

    private void validateIsInt64() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_64 && dataType != Element.DataType.UNSIGNED_64) {
            StringBuilder u = C0843a.m460u("64 bit integer source does not match allocation type ");
            u.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(u.toString());
        }
    }

    private void validateIsInt8() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_8 && dataType != Element.DataType.UNSIGNED_8) {
            StringBuilder u = C0843a.m460u("8 bit integer source does not match allocation type ");
            u.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(u.toString());
        }
    }

    private void validateIsObject() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.RS_ELEMENT && dataType != Element.DataType.RS_TYPE && dataType != Element.DataType.RS_ALLOCATION && dataType != Element.DataType.RS_SAMPLER && dataType != Element.DataType.RS_SCRIPT) {
            StringBuilder u = C0843a.m460u("Object source does not match allocation type ");
            u.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(u.toString());
        }
    }

    private Element.DataType validateObjectIsPrimitiveArray(Object obj, boolean z) {
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                if (componentType == Long.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_64;
                    }
                    validateIsInt64();
                } else if (componentType == Integer.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_32;
                    }
                    validateIsInt32();
                } else if (componentType == Short.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_16;
                    }
                    validateIsInt16();
                } else if (componentType == Byte.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_8;
                    }
                    validateIsInt8();
                } else if (componentType == Float.TYPE) {
                    if (z) {
                        validateIsFloat32();
                    }
                    return Element.DataType.FLOAT_32;
                } else if (componentType != Double.TYPE) {
                    return null;
                } else {
                    if (z) {
                        validateIsFloat64();
                    }
                    return Element.DataType.FLOAT_64;
                }
                return this.mType.mElement.mType;
            }
            throw new RSIllegalArgumentException("Object passed is not an Array of primitives.");
        }
        throw new RSIllegalArgumentException("Object passed is not an array of primitives.");
    }

    public void copy1DRangeFrom(int i, int i2, Allocation allocation, int i3) {
        Allocation allocation2 = allocation;
        this.mRS.nAllocationData2D(getIDSafe(), i, 0, this.mSelectedLOD, this.mSelectedFace.mID, i2, 1, allocation2.getID(this.mRS), i3, 0, allocation2.mSelectedLOD, allocation2.mSelectedFace.mID);
    }

    public void copy1DRangeFrom(int i, int i2, Object obj) {
        copy1DRangeFromUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeFrom(int i, int i2, byte[] bArr) {
        validateIsInt8();
        copy1DRangeFromUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, float[] fArr) {
        validateIsFloat32();
        copy1DRangeFromUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, int[] iArr) {
        validateIsInt32();
        copy1DRangeFromUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFrom(int i, int i2, short[] sArr) {
        validateIsInt16();
        copy1DRangeFromUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, Object obj) {
        copy1DRangeFromUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy1DRangeFromUnchecked(int i, int i2, byte[] bArr) {
        copy1DRangeFromUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, float[] fArr) {
        copy1DRangeFromUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, int[] iArr) {
        copy1DRangeFromUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFromUnchecked(int i, int i2, short[] sArr) {
        copy1DRangeFromUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeTo(int i, int i2, Object obj) {
        copy1DRangeToUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeTo(int i, int i2, byte[] bArr) {
        validateIsInt8();
        copy1DRangeToUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeTo(int i, int i2, float[] fArr) {
        validateIsFloat32();
        copy1DRangeToUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeTo(int i, int i2, int[] iArr) {
        validateIsInt32();
        copy1DRangeToUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeTo(int i, int i2, short[] sArr) {
        validateIsInt16();
        copy1DRangeToUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, Object obj) {
        copy1DRangeToUnchecked(i, i2, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy1DRangeToUnchecked(int i, int i2, byte[] bArr) {
        copy1DRangeToUnchecked(i, i2, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, float[] fArr) {
        copy1DRangeToUnchecked(i, i2, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, int[] iArr) {
        copy1DRangeToUnchecked(i, i2, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeToUnchecked(int i, int i2, short[] sArr) {
        copy1DRangeToUnchecked(i, i2, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, Allocation allocation, int i5, int i6) {
        Allocation allocation2 = allocation;
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, allocation2.getID(this.mRS), i5, i6, allocation2.mSelectedLOD, allocation2.mSelectedFace.mID);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, Object obj) {
        copy2DRangeFromUnchecked(i, i2, i3, i4, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, byte[] bArr) {
        validateIsInt8();
        copy2DRangeFromUnchecked(i, i2, i3, i4, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, float[] fArr) {
        validateIsFloat32();
        copy2DRangeFromUnchecked(i, i2, i3, i4, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, int[] iArr) {
        validateIsInt32();
        copy2DRangeFromUnchecked(i, i2, i3, i4, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, int i3, int i4, short[] sArr) {
        validateIsInt16();
        copy2DRangeFromUnchecked(i, i2, i3, i4, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i, int i2, Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            copy2DRangeFrom(i, i2, createBitmap);
            return;
        }
        validateBitmapFormat(bitmap);
        validate2DRange(i, i2, bitmap.getWidth(), bitmap.getHeight());
        this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, bitmap);
    }

    public void copy2DRangeFromUnchecked(int i, int i2, int i3, int i4, Object obj, Element.DataType dataType, int i5) {
        boolean z;
        int i6;
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        int bytesSize = this.mType.mElement.getBytesSize() * i3 * i4;
        int i7 = dataType.mSize * i5;
        if (!this.mAutoPadding || this.mType.getElement().getVectorSize() != 3) {
            if (bytesSize <= i7) {
                z = false;
                i6 = i7;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if ((bytesSize / 4) * 3 <= i7) {
            i6 = bytesSize;
            z = true;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationData2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, obj, i6, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, Object obj) {
        copy2DRangeToUnchecked(i, i2, i3, i4, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, byte[] bArr) {
        validateIsInt8();
        copy2DRangeToUnchecked(i, i2, i3, i4, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, float[] fArr) {
        validateIsFloat32();
        copy2DRangeToUnchecked(i, i2, i3, i4, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, int[] iArr) {
        validateIsInt32();
        copy2DRangeToUnchecked(i, i2, i3, i4, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeTo(int i, int i2, int i3, int i4, short[] sArr) {
        validateIsInt16();
        copy2DRangeToUnchecked(i, i2, i3, i4, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeToUnchecked(int i, int i2, int i3, int i4, Object obj, Element.DataType dataType, int i5) {
        boolean z;
        int i6;
        this.mRS.validate();
        validate2DRange(i, i2, i3, i4);
        int bytesSize = this.mType.mElement.getBytesSize() * i3 * i4;
        int i7 = dataType.mSize * i5;
        if (!this.mAutoPadding || this.mType.getElement().getVectorSize() != 3) {
            if (bytesSize <= i7) {
                z = false;
                i6 = i7;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if ((bytesSize / 4) * 3 <= i7) {
            i6 = bytesSize;
            z = true;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationRead2D(getIDSafe(), i, i2, this.mSelectedLOD, this.mSelectedFace.mID, i3, i4, obj, i6, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy3DRangeFrom(int i, int i2, int i3, int i4, int i5, int i6, Allocation allocation, int i7, int i8, int i9) {
        Allocation allocation2 = allocation;
        this.mRS.validate();
        validate3DRange(i, i2, i3, i4, i5, i6);
        this.mRS.nAllocationData3D(getIDSafe(), i, i2, i3, this.mSelectedLOD, i4, i5, i6, allocation2.getID(this.mRS), i7, i8, i9, allocation2.mSelectedLOD);
    }

    public void copy3DRangeFrom(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        Object obj2 = obj;
        copy3DRangeFromUnchecked(i, i2, i3, i4, i5, i6, obj2, validateObjectIsPrimitiveArray(obj2, true), Array.getLength(obj));
    }

    public void copyFrom(Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            copyFrom(createBitmap);
            return;
        }
        validateBitmapSize(bitmap);
        validateBitmapFormat(bitmap);
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationCopyFromBitmap(getID(renderScript), bitmap);
    }

    public void copyFrom(Allocation allocation) {
        this.mRS.validate();
        if (this.mType.equals(allocation.getType())) {
            copy2DRangeFrom(0, 0, this.mCurrentDimX, this.mCurrentDimY, allocation, 0, 0);
            return;
        }
        throw new RSIllegalArgumentException("Types of allocations must match.");
    }

    public void copyFrom(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyFrom(byte[] bArr) {
        validateIsInt8();
        copyFromUnchecked(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyFrom(float[] fArr) {
        validateIsFloat32();
        copyFromUnchecked(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyFrom(int[] iArr) {
        validateIsInt32();
        copyFromUnchecked(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyFrom(BaseObj[] baseObjArr) {
        this.mRS.validate();
        validateIsObject();
        if (baseObjArr.length != this.mCurrentCount) {
            StringBuilder u = C0843a.m460u("Array size mismatch, allocation sizeX = ");
            u.append(this.mCurrentCount);
            u.append(", array length = ");
            u.append(baseObjArr.length);
            throw new RSIllegalArgumentException(u.toString());
        } else if (RenderScript.sPointerSize == 8) {
            long[] jArr = new long[(baseObjArr.length * 4)];
            for (int i = 0; i < baseObjArr.length; i++) {
                jArr[i * 4] = baseObjArr[i].getID(this.mRS);
            }
            copy1DRangeFromUnchecked(0, this.mCurrentCount, (Object) jArr);
        } else {
            int[] iArr = new int[baseObjArr.length];
            for (int i2 = 0; i2 < baseObjArr.length; i2++) {
                iArr[i2] = (int) baseObjArr[i2].getID(this.mRS);
            }
            copy1DRangeFromUnchecked(0, this.mCurrentCount, iArr);
        }
    }

    public void copyFrom(short[] sArr) {
        validateIsInt16();
        copyFromUnchecked(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copyFromUnchecked(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copyFromUnchecked(byte[] bArr) {
        copyFromUnchecked(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyFromUnchecked(float[] fArr) {
        copyFromUnchecked(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyFromUnchecked(int[] iArr) {
        copyFromUnchecked(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyFromUnchecked(short[] sArr) {
        copyFromUnchecked(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copyTo(Bitmap bitmap) {
        this.mRS.validate();
        validateBitmapFormat(bitmap);
        validateBitmapSize(bitmap);
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationCopyToBitmap(getID(renderScript), bitmap);
    }

    public void copyTo(Object obj) {
        copyTo(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyTo(byte[] bArr) {
        validateIsInt8();
        copyTo(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyTo(float[] fArr) {
        validateIsFloat32();
        copyTo(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyTo(int[] iArr) {
        validateIsInt32();
        copyTo(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyTo(short[] sArr) {
        validateIsInt16();
        copyTo(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void destroy() {
        if (this.mIncCompatAllocation != 0) {
            boolean z = false;
            synchronized (this) {
                if (!this.mIncAllocDestroyed) {
                    this.mIncAllocDestroyed = true;
                    z = true;
                }
            }
            if (z) {
                ReentrantReadWriteLock.ReadLock readLock = this.mRS.mRWLock.readLock();
                readLock.lock();
                if (this.mRS.isAlive()) {
                    this.mRS.nIncObjDestroy(this.mIncCompatAllocation);
                }
                readLock.unlock();
                this.mIncCompatAllocation = 0;
            }
        }
        if ((this.mUsage & 96) != 0) {
            setSurface((Surface) null);
        }
        super.destroy();
    }

    public void finalize() {
        if (RenderScript.sUseGCHooks) {
            RenderScript.registerNativeFree.invoke(RenderScript.sRuntime, new Object[]{Integer.valueOf(this.mSize)});
        }
        super.finalize();
    }

    public void generateMipmaps() {
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationGenerateMipmaps(getID(renderScript));
    }

    public ByteBuffer getByteBuffer() {
        byte[] bArr;
        int bytesSize = this.mType.getElement().getBytesSize() * this.mType.getX();
        if (this.mRS.getDispatchAPILevel() >= 21) {
            if (this.mByteBuffer == null || (this.mUsage & 32) != 0) {
                RenderScript renderScript = this.mRS;
                this.mByteBuffer = renderScript.nAllocationGetByteBuffer(getID(renderScript), bytesSize, this.mType.getY(), this.mType.getZ());
            }
            return this.mByteBuffer;
        } else if (this.mType.getZ() > 0) {
            return null;
        } else {
            if (this.mType.getY() > 0) {
                bArr = new byte[(this.mType.getY() * bytesSize)];
                copy2DRangeToUnchecked(0, 0, this.mType.getX(), this.mType.getY(), bArr, Element.DataType.SIGNED_8, this.mType.getY() * bytesSize);
            } else {
                bArr = new byte[bytesSize];
                copy1DRangeToUnchecked(0, this.mType.getX(), bArr);
            }
            ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr).asReadOnlyBuffer();
            this.mByteBufferStride = (long) bytesSize;
            return asReadOnlyBuffer;
        }
    }

    public int getBytesSize() {
        Type type = this.mType;
        int i = type.mDimYuv;
        int count = type.getCount();
        return i != 0 ? (int) Math.ceil(((double) (this.mType.getElement().getBytesSize() * count)) * 1.5d) : this.mType.getElement().getBytesSize() * count;
    }

    public Element getElement() {
        return this.mType.getElement();
    }

    public long getIncAllocID() {
        return this.mIncCompatAllocation;
    }

    public long getStride() {
        long j;
        if (this.mByteBufferStride == 0) {
            if (this.mRS.getDispatchAPILevel() > 21) {
                RenderScript renderScript = this.mRS;
                j = renderScript.nAllocationGetStride(getID(renderScript));
            } else {
                j = (long) (this.mType.getElement().getBytesSize() * this.mType.getX());
            }
            this.mByteBufferStride = j;
        }
        return this.mByteBufferStride;
    }

    public Type getType() {
        return this.mType;
    }

    public int getUsage() {
        return this.mUsage;
    }

    public void ioReceive() {
        if ((this.mUsage & 32) != 0) {
            this.mRS.validate();
            RenderScript renderScript = this.mRS;
            renderScript.nAllocationIoReceive(getID(renderScript));
            return;
        }
        throw new RSIllegalArgumentException("Can only receive if IO_INPUT usage specified.");
    }

    public void ioSend() {
        if ((this.mUsage & 64) != 0) {
            this.mRS.validate();
            RenderScript renderScript = this.mRS;
            renderScript.nAllocationIoSend(getID(renderScript));
            return;
        }
        throw new RSIllegalArgumentException("Can only send buffer if IO_OUTPUT usage specified.");
    }

    public void ioSendOutput() {
        ioSend();
    }

    public void setAutoPadding(boolean z) {
        this.mAutoPadding = z;
    }

    public void setFromFieldPacker(int i, int i2, FieldPacker fieldPacker) {
        this.mRS.validate();
        if (i2 >= this.mType.mElement.mElements.length) {
            throw new RSIllegalArgumentException(C0843a.m445f("Component_number ", i2, " out of range."));
        } else if (i >= 0) {
            byte[] data = fieldPacker.getData();
            int pos = fieldPacker.getPos();
            int bytesSize = this.mType.mElement.mElements[i2].getBytesSize() * this.mType.mElement.mArraySizes[i2];
            if (pos == bytesSize) {
                this.mRS.nAllocationElementData1D(getIDSafe(), i, this.mSelectedLOD, i2, data, pos);
                return;
            }
            throw new RSIllegalArgumentException(C0843a.m447h("Field packer sizelength ", pos, " does not match component size ", bytesSize, "."));
        } else {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
    }

    public void setFromFieldPacker(int i, FieldPacker fieldPacker) {
        this.mRS.validate();
        int bytesSize = this.mType.mElement.getBytesSize();
        byte[] data = fieldPacker.getData();
        int pos = fieldPacker.getPos();
        int i2 = pos / bytesSize;
        if (bytesSize * i2 == pos) {
            copy1DRangeFromUnchecked(i, i2, data);
            return;
        }
        throw new RSIllegalArgumentException(C0843a.m447h("Field packer length ", pos, " not divisible by element size ", bytesSize, "."));
    }

    public void setIncAllocID(long j) {
        this.mIncCompatAllocation = j;
    }

    public void setSurface(Surface surface) {
        this.mRS.validate();
        if ((this.mUsage & 64) != 0) {
            RenderScript renderScript = this.mRS;
            renderScript.nAllocationSetSurface(getID(renderScript), surface);
            return;
        }
        throw new RSInvalidStateException("Allocation is not USAGE_IO_OUTPUT.");
    }

    public void syncAll(int i) {
        if (i == 1 || i == 2) {
            this.mRS.validate();
            this.mRS.nAllocationSyncAll(getIDSafe(), i);
            return;
        }
        throw new RSIllegalArgumentException("Source must be exactly one usage type.");
    }
}
