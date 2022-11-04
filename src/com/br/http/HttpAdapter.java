package com.br.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);


}
