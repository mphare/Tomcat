package com.crunchy.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService
{
  @GET
  @Produces("application/xml")
  public String convertCtoF()
  {

    Double fahr;
    Double cels = 36.8;
    fahr = ((cels * 9) / 5) + 32;

    String result = "@Produces(\"application/xmnl\") Output: \n\nC to F Convert Out: \n\n" + fahr;
    return "<ctofservice>" + "<celsius>" + cels + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>"
        + "</ctofservice>";

  }

}
