
package com.nerdstore;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InformacaoCEP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InformacaoCEP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         <xsd:element name="Nome" type="xsd:string"/>
 *         <xsd:element name="endereco" type="xsd:string"/>
<xsd:element name="Email" type="xsd:string"/>
<xsd:element name="BrRoboticsCodigo" type="xsd:string"/>
<xsd:element name="StarkSystemCodigo" type="xsd:string"/>
<xsd:element name="TotalStark" type="xsd:string"/>
<xsd:element name="TotalBrRobotics" type="xsd:string"/>
<xsd:element name="TransacaoCard" type="xsd:string"/>
<xsd:element name="Bandeira" type="xsd:string"/>
<xsd:element name="ValorTotalCompra" type="xsd:string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacaoCEP", propOrder = {
    "Nome",
    "endereco",
    "Email",
    "BrRoboticsCodigo",
    "StarkSystemCodigo",
    "TotalStark",
    "TotalBrRobotics",
    "TransacaoCard",
    "Bandeira",
    "ValorTotalCompra"
})
public class InformacaoCEP {

    @XmlElement(required = true)
    protected String Nome;
    @XmlElement(required = true)
    protected String endereco;
    @XmlElement(name = "Email", required = true)
    protected String Email;
    @XmlElement(name = "BrRoboticsCodigo", required = true)
    protected String BrRoboticsCodigo;
    @XmlElement(name = "StarkSystemCodigo", required = true)
    protected String StarkSystemCodigo;
    @XmlElement(name = "TotalStark", required = true)
    protected String TotalStark;
    @XmlElement(name = "TotalBrRobotics", required = true)
    protected String TotalBrRobotics;
    @XmlElement(name = "TransacaoCard", required = true)
    protected String TransacaoCard;
    @XmlElement(name = "Bandeira", required = true)
    protected String Bandeira;
    @XmlElement(name = "ValorTotalCompra", required = true)
    protected String ValorTotalCompra;

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return Nome;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.Nome = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.Email = value;
    }

    /**
     * Obtém o valor da propriedade newElement3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrRoboticsCodigo() {
        return BrRoboticsCodigo;
    }

    /**
     * Define o valor da propriedade newElement3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrRoboticsCodigo(String value) {
        this.BrRoboticsCodigo = value;
    }

    /**
     * Obtém o valor da propriedade newElement2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarkSystemCodigo() {
        return StarkSystemCodigo;
    }

    /**
     * Define o valor da propriedade newElement2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarkSystemCodigo(String value) {
        this.StarkSystemCodigo = value;
    }

    /**
     * Obtém o valor da propriedade newElement1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalStark() {
        return TotalStark;
    }

    /**
     * Define o valor da propriedade newElement1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalStark(String value) {
        this.TotalStark = value;
    }

    /**
     * Obtém o valor da propriedade newElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBrRobotics() {
        return TotalBrRobotics;
    }

    /**
     * Define o valor da propriedade newElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBrRobotics(String value) {
        this.TotalBrRobotics = value;
    }

    /**
     * Obtém o valor da propriedade brRobotic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacaoCard() {
        return TransacaoCard;
    }

    /**
     * Define o valor da propriedade brRobotic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacaoCard(String value) {
        this.TransacaoCard = value;
    }

    /**
     * Obtém o valor da propriedade brRobotic1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandeira() {
        return Bandeira;
    }

    /**
     * Define o valor da propriedade brRobotic1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandeira(String value) {
        this.Bandeira = value;
    }

    /**
     * Obtém o valor da propriedade brRobotic2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorTotalCompra() {
        return ValorTotalCompra;
    }

    /**
     * Define o valor da propriedade ValorTotalCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorTotalCompra(String value) {
        this.ValorTotalCompra = value;
    }

}
