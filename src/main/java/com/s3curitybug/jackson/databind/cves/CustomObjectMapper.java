package com.s3curitybug.jackson.databind.cves;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;

@Component
public class CustomObjectMapper
        extends ObjectMapper {

    private static final long serialVersionUID = -1766881318866287980L;

    public CustomObjectMapper() {
        super();
        this.enableDefaultTyping(); // Enable default typing.
    }

    @Override
    public ObjectMapper setDefaultTyping(
            TypeResolverBuilder<?> typer) {
        _deserializationConfig = _deserializationConfig.with(typer); // Enable default typing only for deserializing.
        return this;
    }

}
