package site.forgus.plugins.apigenerator.config;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@State(name = "ApiGeneratorConfig", storages = {@com.intellij.openapi.components.Storage(value = "$APP_CONFIG$/ApiGeneratorConfig.xml")})
public class PersistentConfig implements PersistentStateComponent<PersistentConfig.State> {

    static class State {

        public String dirPath = "";
        public String prefix = "└";
    }
    State myState;

    /**
     * 服务管理器获取实例
     *
     * @return PersistentState instance
     */
    public static PersistentConfig getInstance() {
        return ServiceManager.getService(PersistentConfig.class);
    }

    @Nullable
    @Override
    public State getState() {
        return myState;
    }

    @Override
    public void loadState(@NotNull State state) {
        myState = state;
    }



}
