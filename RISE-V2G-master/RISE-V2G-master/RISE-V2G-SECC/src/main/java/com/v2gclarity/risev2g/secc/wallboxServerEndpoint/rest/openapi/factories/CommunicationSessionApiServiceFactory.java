package com.v2gclarity.risev2g.secc.wallboxServerEndpoint.rest.openapi.factories;

import com.v2gclarity.risev2g.secc.wallboxServerEndpoint.rest.openapi.CommunicationSessionApiService;
import com.v2gclarity.risev2g.secc.wallboxServerEndpoint.rest.openapi.impl.CommunicationSessionApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-02-22T09:14:36.215937400+01:00[Europe/Berlin]")
public class CommunicationSessionApiServiceFactory {
    private static final CommunicationSessionApiService service = new CommunicationSessionApiServiceImpl();

    public static CommunicationSessionApiService getCommunicationSessionApi() {
        return service;
    }
}
