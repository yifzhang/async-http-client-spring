package org.asynchttpclient.spring;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.AsyncClientHttpRequestFactory;

public class NingAsyncClientHttpRequestFactoryTestCase extends AbstractAsyncHttpRequestFactoryTestCase {

    @Override
    protected AsyncClientHttpRequestFactory createRequestFactory() {
        return new NingAsyncClientHttpRequestFactory();
    }


    @Override
    @Test
    public void httpMethods() throws Exception {
        super.httpMethods();
        assertHttpMethod("patch", HttpMethod.PATCH);
    }

}
