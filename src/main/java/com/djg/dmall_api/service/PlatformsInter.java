package com.djg.dmall_api.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author mac
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
@SuppressWarnings("deprecation")
public interface PlatformsInter {

    public String getToken(@WebParam(name="account") String account ,@WebParam(name="password") String password);
}
