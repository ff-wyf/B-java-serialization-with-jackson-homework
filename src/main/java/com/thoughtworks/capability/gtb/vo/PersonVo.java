package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.Serialize.PersonVoSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = PersonVoSerialize.class)
public class PersonVo {

  private String id;
  private Integer age;
  private String name;
  private String hobby;

}
