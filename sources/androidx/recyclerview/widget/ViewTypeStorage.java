package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;

public interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        public SparseArray<NestedAdapterWrapper> mGlobalTypeToWrapper = new SparseArray<>();
        public int mNextViewType = 0;

        public class WrapperViewTypeLookup implements ViewTypeLookup {
            private SparseIntArray mGlobalToLocalMapping = new SparseIntArray(1);
            private SparseIntArray mLocalToGlobalMapping = new SparseIntArray(1);
            public final NestedAdapterWrapper mWrapper;

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            public void dispose() {
                IsolatedViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            public int globalToLocal(int i) {
                int indexOfKey = this.mGlobalToLocalMapping.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.mGlobalToLocalMapping.valueAt(indexOfKey);
                }
                StringBuilder v = C0843a.m461v("requested global type ", i, " does not belong to the adapter:");
                v.append(this.mWrapper.adapter);
                throw new IllegalStateException(v.toString());
            }

            public int localToGlobal(int i) {
                int indexOfKey = this.mLocalToGlobalMapping.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.mLocalToGlobalMapping.valueAt(indexOfKey);
                }
                int obtainViewType = IsolatedViewTypeStorage.this.obtainViewType(this.mWrapper);
                this.mLocalToGlobalMapping.put(i, obtainViewType);
                this.mGlobalToLocalMapping.put(obtainViewType, i);
                return obtainViewType;
            }
        }

        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @NonNull
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            NestedAdapterWrapper nestedAdapterWrapper = this.mGlobalTypeToWrapper.get(i);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new IllegalArgumentException(C0843a.m444e("Cannot find the wrapper for global view type ", i));
        }

        public int obtainViewType(NestedAdapterWrapper nestedAdapterWrapper) {
            int i = this.mNextViewType;
            this.mNextViewType = i + 1;
            this.mGlobalTypeToWrapper.put(i, nestedAdapterWrapper);
            return i;
        }

        public void removeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                if (this.mGlobalTypeToWrapper.valueAt(size) == nestedAdapterWrapper) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        public SparseArray<List<NestedAdapterWrapper>> mGlobalTypeToWrapper = new SparseArray<>();

        public class WrapperViewTypeLookup implements ViewTypeLookup {
            public final NestedAdapterWrapper mWrapper;

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            public void dispose() {
                SharedIdRangeViewTypeStorage.this.removeWrapper(this.mWrapper);
            }

            public int globalToLocal(int i) {
                return i;
            }

            public int localToGlobal(int i) {
                List list = SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.get(i);
                if (list == null) {
                    list = new ArrayList();
                    SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.put(i, list);
                }
                if (!list.contains(this.mWrapper)) {
                    list.add(this.mWrapper);
                }
                return i;
            }
        }

        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @NonNull
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            List list = this.mGlobalTypeToWrapper.get(i);
            if (list != null && !list.isEmpty()) {
                return (NestedAdapterWrapper) list.get(0);
            }
            throw new IllegalArgumentException(C0843a.m444e("Cannot find the wrapper for global view type ", i));
        }

        public void removeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper) {
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                List valueAt = this.mGlobalTypeToWrapper.valueAt(size);
                if (valueAt.remove(nestedAdapterWrapper) && valueAt.isEmpty()) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i);

        int localToGlobal(int i);
    }

    @NonNull
    ViewTypeLookup createViewTypeWrapper(@NonNull NestedAdapterWrapper nestedAdapterWrapper);

    @NonNull
    NestedAdapterWrapper getWrapperForGlobalType(int i);
}
