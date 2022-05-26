/*
 * XML Type:  tCountryInfo
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.TCountryInfo
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo;


/**
 * An XML tCountryInfo(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public interface TCountryInfo extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCountryInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s900B59590CF882B5950BB311352F74E5").resolveHandle("tcountryinfocd81type");
    
    /**
     * Gets the "sISOCode" element
     */
    java.lang.String getSISOCode();
    
    /**
     * Gets (as xml) the "sISOCode" element
     */
    org.apache.xmlbeans.XmlString xgetSISOCode();
    
    /**
     * Sets the "sISOCode" element
     */
    void setSISOCode(java.lang.String sisoCode);
    
    /**
     * Sets (as xml) the "sISOCode" element
     */
    void xsetSISOCode(org.apache.xmlbeans.XmlString sisoCode);
    
    /**
     * Gets the "sName" element
     */
    java.lang.String getSName();
    
    /**
     * Gets (as xml) the "sName" element
     */
    org.apache.xmlbeans.XmlString xgetSName();
    
    /**
     * Sets the "sName" element
     */
    void setSName(java.lang.String sName);
    
    /**
     * Sets (as xml) the "sName" element
     */
    void xsetSName(org.apache.xmlbeans.XmlString sName);
    
    /**
     * Gets the "sCapitalCity" element
     */
    java.lang.String getSCapitalCity();
    
    /**
     * Gets (as xml) the "sCapitalCity" element
     */
    org.apache.xmlbeans.XmlString xgetSCapitalCity();
    
    /**
     * Sets the "sCapitalCity" element
     */
    void setSCapitalCity(java.lang.String sCapitalCity);
    
    /**
     * Sets (as xml) the "sCapitalCity" element
     */
    void xsetSCapitalCity(org.apache.xmlbeans.XmlString sCapitalCity);
    
    /**
     * Gets the "sPhoneCode" element
     */
    java.lang.String getSPhoneCode();
    
    /**
     * Gets (as xml) the "sPhoneCode" element
     */
    org.apache.xmlbeans.XmlString xgetSPhoneCode();
    
    /**
     * Sets the "sPhoneCode" element
     */
    void setSPhoneCode(java.lang.String sPhoneCode);
    
    /**
     * Sets (as xml) the "sPhoneCode" element
     */
    void xsetSPhoneCode(org.apache.xmlbeans.XmlString sPhoneCode);
    
    /**
     * Gets the "sContinentCode" element
     */
    java.lang.String getSContinentCode();
    
    /**
     * Gets (as xml) the "sContinentCode" element
     */
    org.apache.xmlbeans.XmlString xgetSContinentCode();
    
    /**
     * Sets the "sContinentCode" element
     */
    void setSContinentCode(java.lang.String sContinentCode);
    
    /**
     * Sets (as xml) the "sContinentCode" element
     */
    void xsetSContinentCode(org.apache.xmlbeans.XmlString sContinentCode);
    
    /**
     * Gets the "sCurrencyISOCode" element
     */
    java.lang.String getSCurrencyISOCode();
    
    /**
     * Gets (as xml) the "sCurrencyISOCode" element
     */
    org.apache.xmlbeans.XmlString xgetSCurrencyISOCode();
    
    /**
     * Sets the "sCurrencyISOCode" element
     */
    void setSCurrencyISOCode(java.lang.String sCurrencyISOCode);
    
    /**
     * Sets (as xml) the "sCurrencyISOCode" element
     */
    void xsetSCurrencyISOCode(org.apache.xmlbeans.XmlString sCurrencyISOCode);
    
    /**
     * Gets the "sCountryFlag" element
     */
    java.lang.String getSCountryFlag();
    
    /**
     * Gets (as xml) the "sCountryFlag" element
     */
    org.apache.xmlbeans.XmlString xgetSCountryFlag();
    
    /**
     * Sets the "sCountryFlag" element
     */
    void setSCountryFlag(java.lang.String sCountryFlag);
    
    /**
     * Sets (as xml) the "sCountryFlag" element
     */
    void xsetSCountryFlag(org.apache.xmlbeans.XmlString sCountryFlag);
    
    /**
     * Gets the "Languages" element
     */
    org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage getLanguages();
    
    /**
     * Sets the "Languages" element
     */
    void setLanguages(org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage languages);
    
    /**
     * Appends and returns a new empty "Languages" element
     */
    org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage addNewLanguages();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo newInstance() {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.TCountryInfo parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.TCountryInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
