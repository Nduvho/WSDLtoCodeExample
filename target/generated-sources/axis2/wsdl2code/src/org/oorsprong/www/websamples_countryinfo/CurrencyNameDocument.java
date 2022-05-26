/*
 * An XML document type.
 * Localname: CurrencyName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo;


/**
 * A document containing one CurrencyName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public interface CurrencyNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurrencyNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F77A0D3DDFB79C1896CAD5EC21E951C").resolveHandle("currencynamec19ddoctype");
    
    /**
     * Gets the "CurrencyName" element
     */
    org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName getCurrencyName();
    
    /**
     * Sets the "CurrencyName" element
     */
    void setCurrencyName(org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName currencyName);
    
    /**
     * Appends and returns a new empty "CurrencyName" element
     */
    org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName addNewCurrencyName();
    
    /**
     * An XML CurrencyName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public interface CurrencyName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurrencyName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F77A0D3DDFB79C1896CAD5EC21E951C").resolveHandle("currencyname1ba5elemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName newInstance() {
              return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument.CurrencyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument newInstance() {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.CurrencyNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
