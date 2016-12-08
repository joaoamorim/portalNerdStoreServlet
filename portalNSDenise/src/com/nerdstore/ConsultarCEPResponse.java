
package com.nerdstore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacaoCEP" type="{http://das.ufsc.br/ConsultaCEP/}InformacaoCEP"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "informacaoCEP"
})
@XmlRootElement(name = "consultarCEPResponse")
public class ConsultarCEPResponse {

    @XmlElement(required = true)
    protected InformacaoCEP informacaoCEP;

    /**
     * Obtém o valor da propriedade informacaoCEP.
     * 
     * @return
     *     possible object is
     *     {@link InformacaoCEP }
     *     
     */
    public InformacaoCEP getInformacaoCEP() {
        return informacaoCEP;
    }

    /**
     * Define o valor da propriedade informacaoCEP.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacaoCEP }
     *     
     */
    public void setInformacaoCEP(InformacaoCEP value) {
        this.informacaoCEP = value;
    }

}
