package androidx.constraintlayout.solver;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;
import p005b.p035e.p036a.p037a.C0843a;

public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    public static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    public int definitionId = -1;
    public float[] goalStrengthVector = new float[9];

    /* renamed from: id */
    public int f99id = -1;
    public boolean inGoal;
    public HashSet<ArrayRow> inRows = null;
    public boolean isFinalValue = false;
    public boolean isSynonym = false;
    public ArrayRow[] mClientEquations = new ArrayRow[16];
    public int mClientEquationsCount = 0;
    private String mName;
    public Type mType;
    public int strength = 0;
    public float[] strengthVector = new float[9];
    public int synonym = -1;
    public float synonymDelta = 0.0f;
    public int usageInRowCount = 0;

    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1 */
    public static /* synthetic */ class C01721 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
        static {
            /*
                androidx.constraintlayout.solver.SolverVariable.Type.values()
                r0 = 5
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = r1
                r2 = 1
                androidx.constraintlayout.solver.SolverVariable$Type r3 = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.solver.SolverVariable$Type r4 = androidx.constraintlayout.solver.SolverVariable.Type.CONSTANT     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r2 = 3
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.solver.SolverVariable$Type r4 = androidx.constraintlayout.solver.SolverVariable.Type.SLACK     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r1 = 4
                int[] r3 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.constraintlayout.solver.SolverVariable$Type r4 = androidx.constraintlayout.solver.SolverVariable.Type.ERROR     // Catch:{ NoSuchFieldError -> 0x0023 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type     // Catch:{ NoSuchFieldError -> 0x0029 }
                androidx.constraintlayout.solver.SolverVariable$Type r3 = androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0029 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.SolverVariable.C01721.<clinit>():void");
        }
    }

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.mType = type;
    }

    public SolverVariable(String str, Type type) {
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        int i;
        StringBuilder sb;
        if (str != null) {
            sb = C0843a.m460u(str);
            i = uniqueErrorId;
        } else {
            int ordinal = type.ordinal();
            if (ordinal == 0) {
                sb = C0843a.m460u("U");
                i = uniqueUnrestrictedId + 1;
                uniqueUnrestrictedId = i;
            } else if (ordinal == 1) {
                sb = C0843a.m460u("C");
                i = uniqueConstantId + 1;
                uniqueConstantId = i;
            } else if (ordinal == 2) {
                sb = C0843a.m460u(ExifInterface.LATITUDE_SOUTH);
                i = uniqueSlackId + 1;
                uniqueSlackId = i;
            } else if (ordinal == 3) {
                sb = C0843a.m460u("e");
                i = uniqueErrorId + 1;
                uniqueErrorId = i;
            } else if (ordinal == 4) {
                sb = C0843a.m460u(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                i = uniqueId + 1;
                uniqueId = i;
            } else {
                throw new AssertionError(type.name());
            }
        }
        sb.append(i);
        return sb.toString();
    }

    public static void increaseErrorId() {
        uniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.mClientEquationsCount;
            if (i >= i2) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i2 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i3 = this.mClientEquationsCount;
                arrayRowArr2[i3] = arrayRow;
                this.mClientEquationsCount = i3 + 1;
                return;
            } else if (this.mClientEquations[i] != arrayRow) {
                i++;
            } else {
                return;
            }
        }
    }

    public void clearStrengths() {
        for (int i = 0; i < 9; i++) {
            this.strengthVector[i] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        int i2 = 0;
        while (i2 < i) {
            if (this.mClientEquations[i2] == arrayRow) {
                while (i2 < i - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i3 = i2 + 1;
                    arrayRowArr[i2] = arrayRowArr[i3];
                    i2 = i3;
                }
                this.mClientEquationsCount--;
                return;
            }
            i2++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.f99id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.goalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f) {
        this.computedValue = f;
        this.isFinalValue = true;
        this.isSynonym = false;
        this.synonym = -1;
        this.synonymDelta = 0.0f;
        int i = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f) {
        this.isSynonym = true;
        this.synonym = solverVariable.f99id;
        this.synonymDelta = f;
        int i = this.mClientEquationsCount;
        this.definitionId = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    public String strengthsToString() {
        String str = this + "[";
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (i < this.strengthVector.length) {
            StringBuilder u = C0843a.m460u(str);
            u.append(this.strengthVector[i]);
            String sb = u.toString();
            float[] fArr = this.strengthVector;
            if (fArr[i] > 0.0f) {
                z2 = false;
            } else if (fArr[i] < 0.0f) {
                z2 = true;
            }
            if (fArr[i] != 0.0f) {
                z = false;
            }
            int length = fArr.length - 1;
            StringBuilder u2 = C0843a.m460u(sb);
            u2.append(i < length ? ", " : "] ");
            str = u2.toString();
            i++;
        }
        if (z2) {
            str = C0843a.m451l(str, " (-)");
        }
        return z ? C0843a.m451l(str, " (*)") : str;
    }

    public String toString() {
        StringBuilder sb;
        if (this.mName != null) {
            sb = C0843a.m460u("");
            sb.append(this.mName);
        } else {
            sb = C0843a.m460u("");
            sb.append(this.f99id);
        }
        return sb.toString();
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }
}
