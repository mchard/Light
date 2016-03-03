package org.panda_lang.light.core.element.type;

import org.panda_lang.light.core.util.Representation;
import org.panda_lang.panda.core.syntax.Essence;

public class TypeRepresentation extends Representation<Type> {

    private final Class<?> clazz;

    public TypeRepresentation(Class<?> clazz, Type representation) {
        super(representation);
        this.clazz = clazz;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Type<Essence> getRepresentation() {
        return super.getRepresentation();
    }

    public Class<?> getClazz() {
        return clazz;
    }

}