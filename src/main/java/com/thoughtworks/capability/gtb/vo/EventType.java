package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");

  @JsonProperty("type")
  private String code;

  EventType(String code) {
    this.code = code;
  }

  @JsonValue
  public String getCode() {
    return this.code;
  }
}
