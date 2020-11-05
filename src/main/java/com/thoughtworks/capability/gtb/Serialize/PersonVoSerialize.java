package com.thoughtworks.capability.gtb.Serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;

public class PersonVoSerialize extends StdSerializer<PersonVo> {
    protected PersonVoSerialize() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeObjectField("id", value.getId());
        if (value.getAge() == null) {
            gen.writeObjectField("age", 0);
        } else {
            gen.writeObjectField("age", value.getAge());
        }
        gen.writeObjectField("name", value.getName());
        if (value.getHobby() != null) {
            gen.writeObjectField("hobby", value.getHobby());
        }
        gen.writeEndObject();

    }
}
