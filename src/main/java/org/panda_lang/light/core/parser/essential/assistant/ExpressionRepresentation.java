package org.panda_lang.light.core.parser.essential.assistant;

import org.panda_lang.light.core.Ray;
import org.panda_lang.light.core.parser.Expression;
import org.panda_lang.light.core.parser.essential.pattern.LightPattern;
import org.panda_lang.panda.core.syntax.Essence;
import org.panda_lang.panda.util.documentation.Documentation;

import java.util.ArrayList;
import java.util.Collection;

public class ExpressionRepresentation {

    private final Expression expression;
    private final Collection<LightPattern> patterns;
    private final Documentation documentation;

    public ExpressionRepresentation(Expression expression) {
        this.expression = expression;
        this.patterns = new ArrayList<>(1);
        this.documentation = new Documentation();
    }

    public Essence run(Ray ray) {
        ray.expressionRepresentation(this);
        return expression.run(ray);
    }

    public ExpressionRepresentation pattern(String pattern) {
        LightPattern lightPattern = LightPattern.builder()
                .compiler()
                .compile(pattern)
                .build(patterns.size());
        return pattern(lightPattern);
    }

    public ExpressionRepresentation pattern(LightPattern lightPattern) {
        patterns.add(lightPattern);
        return this;
    }

    public Documentation documentation() {
        return documentation;
    }

    public Documentation getDocumentation() {
        return documentation;
    }

    public Collection<LightPattern> getPatterns() {
        return patterns;
    }

    public Expression getExpression() {
        return expression;
    }

}
