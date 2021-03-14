/*
 * HSRM Wallbox API
 * This REST-API serves as a interface to a ISO-15118 SECC Server for vehicle to grid communication between an electric vehicle and a charging station. Over this API new charging sessions can be created and controlled. The API propeses methods to control the charging parameters during a charging session.
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: fabian.birk@student.hs-rm.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.v2gclarity.risev2g.secc.wallboxServerEndpoint.rest.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.v2gclarity.risev2g.secc.wallboxServerEndpoint.rest.openapi.model.ChargeParameterAcChargeParameter;
import com.v2gclarity.risev2g.secc.wallboxServerEndpoint.rest.openapi.model.ChargeParameterDcChargeParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ChargeParameter
 */
@JsonPropertyOrder({
  ChargeParameter.JSON_PROPERTY_AC_CHARGE_PARAMETER,
  ChargeParameter.JSON_PROPERTY_DC_CHARGE_PARAMETER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-03-14T10:53:36.676157800+01:00[Europe/Berlin]")
public class ChargeParameter   {
  public static final String JSON_PROPERTY_AC_CHARGE_PARAMETER = "ac-charge-parameter";
  @JsonProperty(JSON_PROPERTY_AC_CHARGE_PARAMETER)
  private ChargeParameterAcChargeParameter acChargeParameter;

  public static final String JSON_PROPERTY_DC_CHARGE_PARAMETER = "dc-charge-parameter";
  @JsonProperty(JSON_PROPERTY_DC_CHARGE_PARAMETER)
  private ChargeParameterDcChargeParameter dcChargeParameter;

  public ChargeParameter acChargeParameter(ChargeParameterAcChargeParameter acChargeParameter) {
    this.acChargeParameter = acChargeParameter;
    return this;
  }

  /**
   * Get acChargeParameter
   * @return acChargeParameter
   **/
  @JsonProperty("ac-charge-parameter")
  @ApiModelProperty(value = "")
  @Valid 
  public ChargeParameterAcChargeParameter getAcChargeParameter() {
    return acChargeParameter;
  }

  public void setAcChargeParameter(ChargeParameterAcChargeParameter acChargeParameter) {
    this.acChargeParameter = acChargeParameter;
  }

  public ChargeParameter dcChargeParameter(ChargeParameterDcChargeParameter dcChargeParameter) {
    this.dcChargeParameter = dcChargeParameter;
    return this;
  }

  /**
   * Get dcChargeParameter
   * @return dcChargeParameter
   **/
  @JsonProperty("dc-charge-parameter")
  @ApiModelProperty(value = "")
  @Valid 
  public ChargeParameterDcChargeParameter getDcChargeParameter() {
    return dcChargeParameter;
  }

  public void setDcChargeParameter(ChargeParameterDcChargeParameter dcChargeParameter) {
    this.dcChargeParameter = dcChargeParameter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeParameter chargeParameter = (ChargeParameter) o;
    return Objects.equals(this.acChargeParameter, chargeParameter.acChargeParameter) &&
        Objects.equals(this.dcChargeParameter, chargeParameter.dcChargeParameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acChargeParameter, dcChargeParameter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeParameter {\n");
    
    sb.append("    acChargeParameter: ").append(toIndentedString(acChargeParameter)).append("\n");
    sb.append("    dcChargeParameter: ").append(toIndentedString(dcChargeParameter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

