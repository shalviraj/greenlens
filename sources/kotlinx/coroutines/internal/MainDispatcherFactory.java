package kotlinx.coroutines.internal;

import java.util.List;
import p416l.p417a.C7723g1;

public interface MainDispatcherFactory {
    C7723g1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
