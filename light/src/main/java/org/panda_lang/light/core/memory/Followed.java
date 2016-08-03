package org.panda_lang.light.core.memory;

import org.panda_lang.light.LightCore;
import org.panda_lang.panda.core.Inst;
import org.panda_lang.panda.core.memory.Global;
import org.panda_lang.panda.core.memory.MemoryFollower;

import java.io.IOException;

public class Followed {

    private final Variables variables;
    private final Storage storage;

    public Followed(Variables variables) {
        this.variables = variables;
        this.storage = new Storage(this);
    }

    public void add(final String variableName) {
        final org.panda_lang.light.core.memory.Followed followed = this;
        Global.COMMON_MEMORY.registerMemoryFollower(new MemoryFollower() {
            @Override
            public void put(String key, Inst value) {
                if (key.equals(variableName)) {
                    followed.updateVariable(key, value);
                }
            }
        });
    }

    public void updateVariable(String variableName, Inst value) {
        try {
            storage.update(variableName, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Storage getStorage() {
        return storage;
    }

    public LightCore getLightCore() {
        return variables.getLightCore();
    }

}