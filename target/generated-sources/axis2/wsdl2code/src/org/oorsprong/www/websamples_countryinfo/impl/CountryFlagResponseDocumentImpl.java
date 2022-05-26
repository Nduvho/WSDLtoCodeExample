/*
 * An XML document type.
 * Localname: CountryFlagResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountryFlagResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountryFlagResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryFlagResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYFLAGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryFlagResponse");
    
    
    /**
     * Gets the "CountryFlagResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse getCountryFlagResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse)get_store().find_element_user(COUNTRYFLAGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryFlagResponse" element
     */
    public void setCountryFlagResponse(org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse countryFlagResponse)
    {
        generatedSetterHelperImpl(countryFlagResponse, COUNTRYFLAGRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryFlagResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse addNewCountryFlagResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse)get_store().add_element_user(COUNTRYFLAGRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CountryFlagResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountryFlagResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryFlagResponseDocument.CountryFlagResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CountryFlagResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRYFLAGRESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryFlagResult");
        
        
        /**
         * Gets the "CountryFlagResult" element
         */
        public java.lang.String getCountryFlagResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYFLAGRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryFlagResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryFlagResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYFLAGRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CountryFlagResult" element
         */
        public void setCountryFlagResult(java.lang.String countryFlagResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYFLAGRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYFLAGRESULT$0);
                }
                target.setStringValue(countryFlagResult);
            }
        }
        
        /**
         * Sets (as xml) the "CountryFlagResult" element
         */
        public void xsetCountryFlagResult(org.apache.xmlbeans.XmlString countryFlagResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYFLAGRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYFLAGRESULT$0);
                }
                target.set(countryFlagResult);
            }
        }
    }
}
