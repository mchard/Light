package org.panda_lang.moonlight;

import org.panda_lang.moonlight.core.parser.NativeParser;
import org.panda_lang.moonlight.core.parser.PhraseParser;
import org.panda_lang.panda.core.parser.essential.BlockParser;

public class MoonlightBasis {

    private final MoonlightCore moonlightCore;

    public MoonlightBasis(MoonlightCore moonlightCore) {
        this.moonlightCore = moonlightCore;
    }

    public void loadParsers() {
        BlockParser.initialize(moonlightCore.getPanda());
        NativeParser.initialize(moonlightCore);
        PhraseParser.initialize(moonlightCore);
    }

    public MoonlightCore getMoonlightCore() {
        return moonlightCore;
    }

}