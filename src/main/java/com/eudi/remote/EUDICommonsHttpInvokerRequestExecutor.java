package com.eudi.remote;

import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.springframework.remoting.httpinvoker.CommonsHttpInvokerRequestExecutor;

public class EUDICommonsHttpInvokerRequestExecutor extends CommonsHttpInvokerRequestExecutor {  
  
    static {  
        ProtocolSocketFactory fcty = new EUDISecureProtocolSocketFactory();  
        Protocol.registerProtocol("https", new Protocol("https", fcty, 8443));  
    }  
} 