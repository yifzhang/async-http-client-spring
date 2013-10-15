package org.asynchttpclient.spring;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.AsyncClientHttpRequestFactory;

public class NingAsyncClientHttpRequestFactoryTests extends AbstractAsyncHttpRequestFactoryTestCase {

    @Override
    protected AsyncClientHttpRequestFactory createRequestFactory() {
        return new NingAsyncClientHttpRequestFactory();
    }


    @Override
    @Test
    public void httpMethods() throws Exception {
        assertHttpMethod("patch", HttpMethod.PATCH);
    }

}
