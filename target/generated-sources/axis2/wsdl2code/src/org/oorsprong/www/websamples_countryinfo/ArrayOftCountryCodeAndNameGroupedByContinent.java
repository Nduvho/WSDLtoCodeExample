/*
 * XML Type:  ArrayOftCountryCodeAndNameGroupedByContinent
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo;


/**
 * An XML ArrayOftCountryCodeAndNameGroupedByContinent(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public interface ArrayOftCountryCodeAndNameGroupedByContinent extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOftCountryCodeAndNameGroupedByContinent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F77A0D3DDFB79C1896CAD5EC21E951C").resolveHandle("arrayoftcountrycodeandnamegroupedbycontinentd7f3type");
    
    /**
     * Gets array of all "tCountryCodeAndNameGroupedByContinent" elements
     */
    org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] getTCountryCodeAndNameGroupedByContinentArray();
    
    /**
     * Gets ith "tCountryCodeAndNameGroupedByContinent" element
     */
    org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent getTCountryCodeAndNameGroupedByContinentArray(int i);
    
    /**
     * Tests for nil ith "tCountryCodeAndNameGroupedByContinent" element
     */
    boolean isNilTCountryCodeAndNameGroupedByContinentArray(int i);
    
    /**
     * Returns number of "tCountryCodeAndNameGroupedByContinent" element
     */
    int sizeOfTCountryCodeAndNameGroupedByContinentArray();
    
    /**
     * Sets array of all "tCountryCodeAndNameGroupedByContinent" element
     */
    void setTCountryCodeAndNameGroupedByContinentArray(org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] tCountryCodeAndNameGroupedByContinentArray);
    
    /**
     * Sets ith "tCountryCodeAndNameGroupedByContinent" element
     */
    void setTCountryCodeAndNameGroupedByContinentArray(int i, org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent tCountryCodeAndNameGroupedByContinent);
    
    /**
     * Nils the ith "tCountryCodeAndNameGroupedByContinent" element
     */
    void setNilTCountryCodeAndNameGroupedByContinentArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tCountryCodeAndNameGroupedByContinent" element
     */
    org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent insertNewTCountryCodeAndNameGroupedByContinent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tCountryCodeAndNameGroupedByContinent" element
     */
    org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent addNewTCountryCodeAndNameGroupedByContinent();
    
    /**
     * Removes the ith "tCountryCodeAndNameGroupedByContinent" element
     */
    void removeTCountryCodeAndNameGroupedByContinent(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent newInstance() {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
