package com.nerdstore;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1
 * 2016-12-06T12:02:39.541-02:00
 * Generated source version: 2.7.14.redhat-1
 * 
 */
@WebService(targetNamespace = "http://das.ufsc.br/ConsultaCEP/", name = "ConsultaCEP")
@XmlSeeAlso({ObjectFactory.class})
public interface ConsultaCEP {

    @WebMethod(action = "http://das.ufsc.br/ConsultaCEP/consultarCEP")
    @RequestWrapper(localName = "consultarCEP", targetNamespace = "http://das.ufsc.br/ConsultaCEP/", className = "com.nerdstore.ConsultarCEP")
    @ResponseWrapper(localName = "consultarCEPResponse", targetNamespace = "http://das.ufsc.br/ConsultaCEP/", className = "com.nerdstore.ConsultarCEPResponse")
    @WebResult(name = "informacaoCEP", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
    public com.nerdstore.InformacaoCEP consultarCEP(
        @WebParam(name = "cep", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String cep,
        @WebParam(name = "Nome", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String nome,
        @WebParam(name = "Email", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String email,
        @WebParam(name = "Cartao", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String cartao,
        @WebParam(name = "CartaoVenc", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String cartaoVenc,
        @WebParam(name = "qdtReatorArk", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String qdtReatorArk,
        @WebParam(name = "qdtReatorSolar", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String qdtReatorSolar,
        @WebParam(name = "qdtRoboMedico", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String qdtRoboMedico,
        @WebParam(name = "qdtRoboSeguranca", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String qdtRoboSeguranca,
        @WebParam(name = "qdtRoboDomestico", targetNamespace = "http://das.ufsc.br/ConsultaCEP/")
        java.lang.String qdtRoboDomestico
    );
}