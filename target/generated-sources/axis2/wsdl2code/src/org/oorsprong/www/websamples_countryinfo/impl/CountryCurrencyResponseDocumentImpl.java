/*
 * An XML document type.
 * Localname: CountryCurrencyResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountryCurrencyResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountryCurrencyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryCurrencyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYCURRENCYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryCurrencyResponse");
    
    
    /**
     * Gets the "CountryCurrencyResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse getCountryCurrencyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse)get_store().find_element_user(COUNTRYCURRENCYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryCurrencyResponse" element
     */
    public void setCountryCurrencyResponse(org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse countryCurrencyResponse)
    {
        generatedSetterHelperImpl(countryCurrencyResponse, COUNTRYCURRENCYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryCurrencyResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse addNewCountryCurrencyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse)get_store().add_element_user(COUNTRYCURRENCYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CountryCurrencyResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountryCurrencyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponseDocument.CountryCurrencyResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CountryCurrencyResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRYCURRENCYRESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryCurrencyResult");
        
        
        /**
         * Gets the "CountryCurrencyResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.TCurrency getCountryCurrencyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.TCurrency target = null;
                target = (org.oorsprong.www.websamples_countryinfo.TCurrency)get_store().find_element_user(COUNTRYCURRENCYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CountryCurrencyResult" element
         */
        public void setCountryCurrencyResult(org.oorsprong.www.websamples_countryinfo.TCurrency countryCurrencyResult)
        {
            generatedSetterHelperImpl(countryCurrencyResult, COUNTRYCURRENCYRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CountryCurrencyResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.TCurrency addNewCountryCurrencyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.TCurrency target = null;
                target = (org.oorsprong.www.websamples_countryinfo.TCurrency)get_store().add_element_user(COUNTRYCURRENCYRESULT$0);
                return target;
            }
        }
    }
}
