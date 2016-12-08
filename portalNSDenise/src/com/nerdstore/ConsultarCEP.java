
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
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cartao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CartaoVenc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qdtReatorArk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qdtReatorSolar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qdtRoboMedico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qdtRoboSeguranca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qdtRoboDomestico" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cep",
    "nome",
    "email",
    "cartao",
    "cartaoVenc",
    "qdtReatorArk",
    "qdtReatorSolar",
    "qdtRoboMedico",
    "qdtRoboSeguranca",
    "qdtRoboDomestico"
})
@XmlRootElement(name = "consultarCEP")
public class ConsultarCEP {

    @XmlElement(required = true)
    protected String cep;
    @XmlElement(name = "Nome", required = true)
    protected String nome;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Cartao", required = true)
    protected String cartao;
    @XmlElement(name = "CartaoVenc", required = true)
    protected String cartaoVenc;
    @XmlElement(required = true)
    protected String qdtReatorArk;
    @XmlElement(required = true)
    protected String qdtReatorSolar;
    @XmlElement(required = true)
    protected String qdtRoboMedico;
    @XmlElement(required = true)
    protected String qdtRoboSeguranca;
    @XmlElement(required = true)
    protected String qdtRoboDomestico;

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade cartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * Define o valor da propriedade cartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartao(String value) {
        this.cartao = value;
    }

    /**
     * Obtém o valor da propriedade cartaoVenc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartaoVenc() {
        return cartaoVenc;
    }

    /**
     * Define o valor da propriedade cartaoVenc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartaoVenc(String value) {
        this.cartaoVenc = value;
    }

    /**
     * Obtém o valor da propriedade qdtReatorArk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdtReatorArk() {
        return qdtReatorArk;
    }

    /**
     * Define o valor da propriedade qdtReatorArk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdtReatorArk(String value) {
        this.qdtReatorArk = value;
    }

    /**
     * Obtém o valor da propriedade qdtReatorSolar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdtReatorSolar() {
        return qdtReatorSolar;
    }

    /**
     * Define o valor da propriedade qdtReatorSolar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdtReatorSolar(String value) {
        this.qdtReatorSolar = value;
    }

    /**
     * Obtém o valor da propriedade qdtRoboMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdtRoboMedico() {
        return qdtRoboMedico;
    }

    /**
     * Define o valor da propriedade qdtRoboMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdtRoboMedico(String value) {
        this.qdtRoboMedico = value;
    }

    /**
     * Obtém o valor da propriedade qdtRoboSeguranca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdtRoboSeguranca() {
        return qdtRoboSeguranca;
    }

    /**
     * Define o valor da propriedade qdtRoboSeguranca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdtRoboSeguranca(String value) {
        this.qdtRoboSeguranca = value;
    }

    /**
     * Obtém o valor da propriedade qdtRoboDomestico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQdtRoboDomestico() {
        return qdtRoboDomestico;
    }

    /**
     * Define o valor da propriedade qdtRoboDomestico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQdtRoboDomestico(String value) {
        this.qdtRoboDomestico = value;
    }

}
