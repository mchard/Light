package org.panda_lang.light.core.parser;

import org.panda_lang.light.core.element.expression.ExpressionRuntime;
import org.panda_lang.panda.core.parser.Atom;
import org.panda_lang.panda.core.parser.Parser;

public class ArgumentParser implements Parser {

    @Override
    public ExpressionRuntime parse(Atom atom) {
        String argumentSource = atom.getSourceCode();


        return null;
    }

}