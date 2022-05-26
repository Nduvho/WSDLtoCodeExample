/*
 * An XML document type.
 * Localname: CountryISOCodeResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountryISOCodeResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountryISOCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryISOCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYISOCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryISOCodeResponse");
    
    
    /**
     * Gets the "CountryISOCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse getCountryISOCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse)get_store().find_element_user(COUNTRYISOCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryISOCodeResponse" element
     */
    public void setCountryISOCodeResponse(org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse countryISOCodeResponse)
    {
        generatedSetterHelperImpl(countryISOCodeResponse, COUNTRYISOCODERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryISOCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse addNewCountryISOCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse)get_store().add_element_user(COUNTRYISOCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CountryISOCodeResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountryISOCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponseDocument.CountryISOCodeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CountryISOCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRYISOCODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryISOCodeResult");
        
        
        /**
         * Gets the "CountryISOCodeResult" element
         */
        public java.lang.String getCountryISOCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISOCODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryISOCodeResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryISOCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISOCODERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CountryISOCodeResult" element
         */
        public void setCountryISOCodeResult(java.lang.String countryISOCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYISOCODERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYISOCODERESULT$0);
                }
                target.setStringValue(countryISOCodeResult);
            }
        }
        
        /**
         * Sets (as xml) the "CountryISOCodeResult" element
         */
        public void xsetCountryISOCodeResult(org.apache.xmlbeans.XmlString countryISOCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYISOCODERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYISOCODERESULT$0);
                }
                target.set(countryISOCodeResult);
            }
        }
    }
}
