/*
 * XML Type:  tContinent
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.TContinent
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo;


/**
 * An XML tContinent(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public interface TContinent extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TContinent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F77A0D3DDFB79C1896CAD5EC21E951C").resolveHandle("tcontinent1711type");
    
    /**
     * Gets the "sCode" element
     */
    java.lang.String getSCode();
    
    /**
     * Gets (as xml) the "sCode" element
     */
    org.apache.xmlbeans.XmlString xgetSCode();
    
    /**
     * Sets the "sCode" element
     */
    void setSCode(java.lang.String sCode);
    
    /**
     * Sets (as xml) the "sCode" element
     */
    void xsetSCode(org.apache.xmlbeans.XmlString sCode);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oorsprong.www.websamples_countryinfo.TContinent newInstance() {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.TContinent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.TContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
