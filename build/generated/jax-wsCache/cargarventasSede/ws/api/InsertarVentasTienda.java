
package ws.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsertarVentasTienda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsertarVentasTienda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invfec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codalm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuscod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusnam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusruc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusadr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destot" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="destot_n" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="netord" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totord" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totdto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="igvord" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tpacod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docpag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numcmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usecaj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invsta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numdoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tdofac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codstd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipcli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prfnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="medcod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plnnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destot_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codpre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipkar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarcod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invgnc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invppac" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invpseg" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="invcoa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invigv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mednam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecanu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useanu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="siscod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coscom_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cospro_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mondol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipcam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invuti_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invuti_r" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invuti_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feccre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecumv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usecod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usenam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invmmax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plnemmfa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inverd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tdoidser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totpuntos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totcompro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tippln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totdto_a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meddir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invnum_est" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codanu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obsanu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diacod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dirrep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="obsrep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invnum_cot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invnum_cen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="staproc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moncod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fktienda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertarVentasTienda", propOrder = {
    "invfec",
    "codalm",
    "cuscod",
    "cusnam",
    "cusruc",
    "cusadr",
    "destot",
    "destotN",
    "netord",
    "totord",
    "totdto",
    "igvord",
    "tpacod",
    "docpag",
    "numcmp",
    "usecaj",
    "invsta",
    "numdoc",
    "tdofac",
    "codstd",
    "tipcli",
    "prfnum",
    "medcod",
    "plnnum",
    "destotP",
    "codpre",
    "tipkar",
    "tarcod",
    "invgnc",
    "invppac",
    "invpseg",
    "invcoa",
    "invigv",
    "mednam",
    "fecanu",
    "useanu",
    "siscod",
    "coscomT",
    "cosproT",
    "mondol",
    "tipcam",
    "invutiC",
    "invutiR",
    "invutiP",
    "estado",
    "feccre",
    "fecumv",
    "usecod",
    "usenam",
    "hostname",
    "invmmax",
    "plnemmfa",
    "inverd",
    "tdoidser",
    "totpuntos",
    "totcompro",
    "tippln",
    "totdtoA",
    "meddir",
    "ubicod",
    "invnumEst",
    "codanu",
    "obsanu",
    "diacod",
    "dirrep",
    "obsrep",
    "invnumCot",
    "invnumCen",
    "staproc",
    "moncod",
    "fecdoc",
    "fktienda"
})
public class InsertarVentasTienda {

    protected String invfec;
    protected String codalm;
    protected String cuscod;
    protected String cusnam;
    protected String cusruc;
    protected String cusadr;
    protected double destot;
    @XmlElement(name = "destot_n")
    protected double destotN;
    protected double netord;
    protected double totord;
    protected double totdto;
    protected double igvord;
    protected String tpacod;
    protected String docpag;
    protected String numcmp;
    protected String usecaj;
    protected String invsta;
    protected int numdoc;
    protected String tdofac;
    protected String codstd;
    protected String tipcli;
    protected int prfnum;
    protected String medcod;
    protected String plnnum;
    @XmlElement(name = "destot_p")
    protected String destotP;
    protected String codpre;
    protected String tipkar;
    protected String tarcod;
    protected double invgnc;
    protected double invppac;
    protected double invpseg;
    protected String invcoa;
    protected String invigv;
    protected String mednam;
    protected String fecanu;
    protected int useanu;
    protected int siscod;
    @XmlElement(name = "coscom_t")
    protected String coscomT;
    @XmlElement(name = "cospro_t")
    protected String cosproT;
    protected String mondol;
    protected String tipcam;
    @XmlElement(name = "invuti_c")
    protected String invutiC;
    @XmlElement(name = "invuti_r")
    protected String invutiR;
    @XmlElement(name = "invuti_p")
    protected String invutiP;
    protected String estado;
    protected String feccre;
    protected String fecumv;
    protected int usecod;
    protected String usenam;
    protected String hostname;
    protected String invmmax;
    protected String plnemmfa;
    protected String inverd;
    protected String tdoidser;
    protected String totpuntos;
    protected String totcompro;
    protected String tippln;
    @XmlElement(name = "totdto_a")
    protected String totdtoA;
    protected String meddir;
    protected String ubicod;
    @XmlElement(name = "invnum_est")
    protected String invnumEst;
    protected String codanu;
    protected String obsanu;
    protected String diacod;
    protected String dirrep;
    protected String obsrep;
    @XmlElement(name = "invnum_cot")
    protected int invnumCot;
    @XmlElement(name = "invnum_cen")
    protected int invnumCen;
    protected String staproc;
    protected String moncod;
    protected String fecdoc;
    protected int fktienda;

    /**
     * Obtiene el valor de la propiedad invfec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvfec() {
        return invfec;
    }

    /**
     * Define el valor de la propiedad invfec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvfec(String value) {
        this.invfec = value;
    }

    /**
     * Obtiene el valor de la propiedad codalm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodalm() {
        return codalm;
    }

    /**
     * Define el valor de la propiedad codalm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodalm(String value) {
        this.codalm = value;
    }

    /**
     * Obtiene el valor de la propiedad cuscod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuscod() {
        return cuscod;
    }

    /**
     * Define el valor de la propiedad cuscod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuscod(String value) {
        this.cuscod = value;
    }

    /**
     * Obtiene el valor de la propiedad cusnam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusnam() {
        return cusnam;
    }

    /**
     * Define el valor de la propiedad cusnam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusnam(String value) {
        this.cusnam = value;
    }

    /**
     * Obtiene el valor de la propiedad cusruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusruc() {
        return cusruc;
    }

    /**
     * Define el valor de la propiedad cusruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusruc(String value) {
        this.cusruc = value;
    }

    /**
     * Obtiene el valor de la propiedad cusadr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusadr() {
        return cusadr;
    }

    /**
     * Define el valor de la propiedad cusadr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusadr(String value) {
        this.cusadr = value;
    }

    /**
     * Obtiene el valor de la propiedad destot.
     * 
     */
    public double getDestot() {
        return destot;
    }

    /**
     * Define el valor de la propiedad destot.
     * 
     */
    public void setDestot(double value) {
        this.destot = value;
    }

    /**
     * Obtiene el valor de la propiedad destotN.
     * 
     */
    public double getDestotN() {
        return destotN;
    }

    /**
     * Define el valor de la propiedad destotN.
     * 
     */
    public void setDestotN(double value) {
        this.destotN = value;
    }

    /**
     * Obtiene el valor de la propiedad netord.
     * 
     */
    public double getNetord() {
        return netord;
    }

    /**
     * Define el valor de la propiedad netord.
     * 
     */
    public void setNetord(double value) {
        this.netord = value;
    }

    /**
     * Obtiene el valor de la propiedad totord.
     * 
     */
    public double getTotord() {
        return totord;
    }

    /**
     * Define el valor de la propiedad totord.
     * 
     */
    public void setTotord(double value) {
        this.totord = value;
    }

    /**
     * Obtiene el valor de la propiedad totdto.
     * 
     */
    public double getTotdto() {
        return totdto;
    }

    /**
     * Define el valor de la propiedad totdto.
     * 
     */
    public void setTotdto(double value) {
        this.totdto = value;
    }

    /**
     * Obtiene el valor de la propiedad igvord.
     * 
     */
    public double getIgvord() {
        return igvord;
    }

    /**
     * Define el valor de la propiedad igvord.
     * 
     */
    public void setIgvord(double value) {
        this.igvord = value;
    }

    /**
     * Obtiene el valor de la propiedad tpacod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpacod() {
        return tpacod;
    }

    /**
     * Define el valor de la propiedad tpacod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpacod(String value) {
        this.tpacod = value;
    }

    /**
     * Obtiene el valor de la propiedad docpag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocpag() {
        return docpag;
    }

    /**
     * Define el valor de la propiedad docpag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocpag(String value) {
        this.docpag = value;
    }

    /**
     * Obtiene el valor de la propiedad numcmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumcmp() {
        return numcmp;
    }

    /**
     * Define el valor de la propiedad numcmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumcmp(String value) {
        this.numcmp = value;
    }

    /**
     * Obtiene el valor de la propiedad usecaj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsecaj() {
        return usecaj;
    }

    /**
     * Define el valor de la propiedad usecaj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsecaj(String value) {
        this.usecaj = value;
    }

    /**
     * Obtiene el valor de la propiedad invsta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvsta() {
        return invsta;
    }

    /**
     * Define el valor de la propiedad invsta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvsta(String value) {
        this.invsta = value;
    }

    /**
     * Obtiene el valor de la propiedad numdoc.
     * 
     */
    public int getNumdoc() {
        return numdoc;
    }

    /**
     * Define el valor de la propiedad numdoc.
     * 
     */
    public void setNumdoc(int value) {
        this.numdoc = value;
    }

    /**
     * Obtiene el valor de la propiedad tdofac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdofac() {
        return tdofac;
    }

    /**
     * Define el valor de la propiedad tdofac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdofac(String value) {
        this.tdofac = value;
    }

    /**
     * Obtiene el valor de la propiedad codstd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodstd() {
        return codstd;
    }

    /**
     * Define el valor de la propiedad codstd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodstd(String value) {
        this.codstd = value;
    }

    /**
     * Obtiene el valor de la propiedad tipcli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipcli() {
        return tipcli;
    }

    /**
     * Define el valor de la propiedad tipcli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipcli(String value) {
        this.tipcli = value;
    }

    /**
     * Obtiene el valor de la propiedad prfnum.
     * 
     */
    public int getPrfnum() {
        return prfnum;
    }

    /**
     * Define el valor de la propiedad prfnum.
     * 
     */
    public void setPrfnum(int value) {
        this.prfnum = value;
    }

    /**
     * Obtiene el valor de la propiedad medcod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedcod() {
        return medcod;
    }

    /**
     * Define el valor de la propiedad medcod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedcod(String value) {
        this.medcod = value;
    }

    /**
     * Obtiene el valor de la propiedad plnnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlnnum() {
        return plnnum;
    }

    /**
     * Define el valor de la propiedad plnnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlnnum(String value) {
        this.plnnum = value;
    }

    /**
     * Obtiene el valor de la propiedad destotP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestotP() {
        return destotP;
    }

    /**
     * Define el valor de la propiedad destotP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestotP(String value) {
        this.destotP = value;
    }

    /**
     * Obtiene el valor de la propiedad codpre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodpre() {
        return codpre;
    }

    /**
     * Define el valor de la propiedad codpre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodpre(String value) {
        this.codpre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipkar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipkar() {
        return tipkar;
    }

    /**
     * Define el valor de la propiedad tipkar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipkar(String value) {
        this.tipkar = value;
    }

    /**
     * Obtiene el valor de la propiedad tarcod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarcod() {
        return tarcod;
    }

    /**
     * Define el valor de la propiedad tarcod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarcod(String value) {
        this.tarcod = value;
    }

    /**
     * Obtiene el valor de la propiedad invgnc.
     * 
     */
    public double getInvgnc() {
        return invgnc;
    }

    /**
     * Define el valor de la propiedad invgnc.
     * 
     */
    public void setInvgnc(double value) {
        this.invgnc = value;
    }

    /**
     * Obtiene el valor de la propiedad invppac.
     * 
     */
    public double getInvppac() {
        return invppac;
    }

    /**
     * Define el valor de la propiedad invppac.
     * 
     */
    public void setInvppac(double value) {
        this.invppac = value;
    }

    /**
     * Obtiene el valor de la propiedad invpseg.
     * 
     */
    public double getInvpseg() {
        return invpseg;
    }

    /**
     * Define el valor de la propiedad invpseg.
     * 
     */
    public void setInvpseg(double value) {
        this.invpseg = value;
    }

    /**
     * Obtiene el valor de la propiedad invcoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcoa() {
        return invcoa;
    }

    /**
     * Define el valor de la propiedad invcoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvcoa(String value) {
        this.invcoa = value;
    }

    /**
     * Obtiene el valor de la propiedad invigv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvigv() {
        return invigv;
    }

    /**
     * Define el valor de la propiedad invigv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvigv(String value) {
        this.invigv = value;
    }

    /**
     * Obtiene el valor de la propiedad mednam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMednam() {
        return mednam;
    }

    /**
     * Define el valor de la propiedad mednam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMednam(String value) {
        this.mednam = value;
    }

    /**
     * Obtiene el valor de la propiedad fecanu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecanu() {
        return fecanu;
    }

    /**
     * Define el valor de la propiedad fecanu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecanu(String value) {
        this.fecanu = value;
    }

    /**
     * Obtiene el valor de la propiedad useanu.
     * 
     */
    public int getUseanu() {
        return useanu;
    }

    /**
     * Define el valor de la propiedad useanu.
     * 
     */
    public void setUseanu(int value) {
        this.useanu = value;
    }

    /**
     * Obtiene el valor de la propiedad siscod.
     * 
     */
    public int getSiscod() {
        return siscod;
    }

    /**
     * Define el valor de la propiedad siscod.
     * 
     */
    public void setSiscod(int value) {
        this.siscod = value;
    }

    /**
     * Obtiene el valor de la propiedad coscomT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoscomT() {
        return coscomT;
    }

    /**
     * Define el valor de la propiedad coscomT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoscomT(String value) {
        this.coscomT = value;
    }

    /**
     * Obtiene el valor de la propiedad cosproT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCosproT() {
        return cosproT;
    }

    /**
     * Define el valor de la propiedad cosproT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCosproT(String value) {
        this.cosproT = value;
    }

    /**
     * Obtiene el valor de la propiedad mondol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMondol() {
        return mondol;
    }

    /**
     * Define el valor de la propiedad mondol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMondol(String value) {
        this.mondol = value;
    }

    /**
     * Obtiene el valor de la propiedad tipcam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipcam() {
        return tipcam;
    }

    /**
     * Define el valor de la propiedad tipcam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipcam(String value) {
        this.tipcam = value;
    }

    /**
     * Obtiene el valor de la propiedad invutiC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvutiC() {
        return invutiC;
    }

    /**
     * Define el valor de la propiedad invutiC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvutiC(String value) {
        this.invutiC = value;
    }

    /**
     * Obtiene el valor de la propiedad invutiR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvutiR() {
        return invutiR;
    }

    /**
     * Define el valor de la propiedad invutiR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvutiR(String value) {
        this.invutiR = value;
    }

    /**
     * Obtiene el valor de la propiedad invutiP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvutiP() {
        return invutiP;
    }

    /**
     * Define el valor de la propiedad invutiP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvutiP(String value) {
        this.invutiP = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad feccre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeccre() {
        return feccre;
    }

    /**
     * Define el valor de la propiedad feccre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeccre(String value) {
        this.feccre = value;
    }

    /**
     * Obtiene el valor de la propiedad fecumv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecumv() {
        return fecumv;
    }

    /**
     * Define el valor de la propiedad fecumv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecumv(String value) {
        this.fecumv = value;
    }

    /**
     * Obtiene el valor de la propiedad usecod.
     * 
     */
    public int getUsecod() {
        return usecod;
    }

    /**
     * Define el valor de la propiedad usecod.
     * 
     */
    public void setUsecod(int value) {
        this.usecod = value;
    }

    /**
     * Obtiene el valor de la propiedad usenam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsenam() {
        return usenam;
    }

    /**
     * Define el valor de la propiedad usenam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsenam(String value) {
        this.usenam = value;
    }

    /**
     * Obtiene el valor de la propiedad hostname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Define el valor de la propiedad hostname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Obtiene el valor de la propiedad invmmax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvmmax() {
        return invmmax;
    }

    /**
     * Define el valor de la propiedad invmmax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvmmax(String value) {
        this.invmmax = value;
    }

    /**
     * Obtiene el valor de la propiedad plnemmfa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlnemmfa() {
        return plnemmfa;
    }

    /**
     * Define el valor de la propiedad plnemmfa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlnemmfa(String value) {
        this.plnemmfa = value;
    }

    /**
     * Obtiene el valor de la propiedad inverd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInverd() {
        return inverd;
    }

    /**
     * Define el valor de la propiedad inverd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInverd(String value) {
        this.inverd = value;
    }

    /**
     * Obtiene el valor de la propiedad tdoidser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdoidser() {
        return tdoidser;
    }

    /**
     * Define el valor de la propiedad tdoidser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdoidser(String value) {
        this.tdoidser = value;
    }

    /**
     * Obtiene el valor de la propiedad totpuntos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotpuntos() {
        return totpuntos;
    }

    /**
     * Define el valor de la propiedad totpuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotpuntos(String value) {
        this.totpuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad totcompro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotcompro() {
        return totcompro;
    }

    /**
     * Define el valor de la propiedad totcompro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotcompro(String value) {
        this.totcompro = value;
    }

    /**
     * Obtiene el valor de la propiedad tippln.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTippln() {
        return tippln;
    }

    /**
     * Define el valor de la propiedad tippln.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTippln(String value) {
        this.tippln = value;
    }

    /**
     * Obtiene el valor de la propiedad totdtoA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotdtoA() {
        return totdtoA;
    }

    /**
     * Define el valor de la propiedad totdtoA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotdtoA(String value) {
        this.totdtoA = value;
    }

    /**
     * Obtiene el valor de la propiedad meddir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeddir() {
        return meddir;
    }

    /**
     * Define el valor de la propiedad meddir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeddir(String value) {
        this.meddir = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicod() {
        return ubicod;
    }

    /**
     * Define el valor de la propiedad ubicod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicod(String value) {
        this.ubicod = value;
    }

    /**
     * Obtiene el valor de la propiedad invnumEst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvnumEst() {
        return invnumEst;
    }

    /**
     * Define el valor de la propiedad invnumEst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvnumEst(String value) {
        this.invnumEst = value;
    }

    /**
     * Obtiene el valor de la propiedad codanu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodanu() {
        return codanu;
    }

    /**
     * Define el valor de la propiedad codanu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodanu(String value) {
        this.codanu = value;
    }

    /**
     * Obtiene el valor de la propiedad obsanu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsanu() {
        return obsanu;
    }

    /**
     * Define el valor de la propiedad obsanu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsanu(String value) {
        this.obsanu = value;
    }

    /**
     * Obtiene el valor de la propiedad diacod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiacod() {
        return diacod;
    }

    /**
     * Define el valor de la propiedad diacod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiacod(String value) {
        this.diacod = value;
    }

    /**
     * Obtiene el valor de la propiedad dirrep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirrep() {
        return dirrep;
    }

    /**
     * Define el valor de la propiedad dirrep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirrep(String value) {
        this.dirrep = value;
    }

    /**
     * Obtiene el valor de la propiedad obsrep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsrep() {
        return obsrep;
    }

    /**
     * Define el valor de la propiedad obsrep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsrep(String value) {
        this.obsrep = value;
    }

    /**
     * Obtiene el valor de la propiedad invnumCot.
     * 
     */
    public int getInvnumCot() {
        return invnumCot;
    }

    /**
     * Define el valor de la propiedad invnumCot.
     * 
     */
    public void setInvnumCot(int value) {
        this.invnumCot = value;
    }

    /**
     * Obtiene el valor de la propiedad invnumCen.
     * 
     */
    public int getInvnumCen() {
        return invnumCen;
    }

    /**
     * Define el valor de la propiedad invnumCen.
     * 
     */
    public void setInvnumCen(int value) {
        this.invnumCen = value;
    }

    /**
     * Obtiene el valor de la propiedad staproc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaproc() {
        return staproc;
    }

    /**
     * Define el valor de la propiedad staproc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaproc(String value) {
        this.staproc = value;
    }

    /**
     * Obtiene el valor de la propiedad moncod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoncod() {
        return moncod;
    }

    /**
     * Define el valor de la propiedad moncod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoncod(String value) {
        this.moncod = value;
    }

    /**
     * Obtiene el valor de la propiedad fecdoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecdoc() {
        return fecdoc;
    }

    /**
     * Define el valor de la propiedad fecdoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecdoc(String value) {
        this.fecdoc = value;
    }

    /**
     * Obtiene el valor de la propiedad fktienda.
     * 
     */
    public int getFktienda() {
        return fktienda;
    }

    /**
     * Define el valor de la propiedad fktienda.
     * 
     */
    public void setFktienda(int value) {
        this.fktienda = value;
    }

}
