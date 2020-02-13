/*
 * Domainrobot JSON API
 * Domainrobot JSON API for managing: Domains, SSL            Certificates, DNS and            much more.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.domainrobot.sdk.models.generated;

import java.util.Objects;
import java.util.Arrays;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DomainPreregStatusConstants
 */
public enum DomainPreregStatusConstants {
  
  PENDING("PENDING"),
  
  PENDING_SENT("PENDING_SENT"),
  
  PENDING_DOCUMENT_SENT("PENDING_DOCUMENT_SENT"),
  
  PENDING_PROGRESS("PENDING_PROGRESS"),
  
  PENDING_UPDATE("PENDING_UPDATE"),
  
  PENDING_SENT_UPDATE("PENDING_SENT_UPDATE"),
  
  TIMEOUT("TIMEOUT"),
  
  ACCEPT("ACCEPT"),
  
  DECLINE("DECLINE"),
  
  INVALID_NAME("INVALID_NAME"),
  
  FAILED("FAILED"),
  
  CANCEL("CANCEL"),
  
  AUTO_CANCEL("AUTO_CANCEL"),
  
  ACTIVE("ACTIVE"),
  
  SENT("SENT"),
  
  OPEN("OPEN"),
  
  TMCH_CLAIM("TMCH_CLAIM"),
  
  TMCH_CLAIM_CONFIRMED("TMCH_CLAIM_CONFIRMED"),
  
  TMCH_CLAIM_REJECTED("TMCH_CLAIM_REJECTED"),
  
  TMCH_CLAIM_EXPIRED("TMCH_CLAIM_EXPIRED"),
  
  TMCH_CLAIM_PENDING("TMCH_CLAIM_PENDING"),
  
  TMCH_CLAIM_FAILED("TMCH_CLAIM_FAILED"),
  
  FAILED_REF("FAILED_REF");

  private String value;

  DomainPreregStatusConstants(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DomainPreregStatusConstants fromValue(String text) {
    for (DomainPreregStatusConstants b : DomainPreregStatusConstants.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
