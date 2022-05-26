/*
 * An XML document type.
 * Localname: CountriesUsingCurrencyResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountriesUsingCurrencyResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountriesUsingCurrencyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountriesUsingCurrencyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRIESUSINGCURRENCYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountriesUsingCurrencyResponse");
    
    
    /**
     * Gets the "CountriesUsingCurrencyResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse getCountriesUsingCurrencyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse)get_store().find_element_user(COUNTRIESUSINGCURRENCYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountriesUsingCurrencyResponse" element
     */
    public void setCountriesUsingCurrencyResponse(org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse countriesUsingCurrencyResponse)
    {
        generatedSetterHelperImpl(countriesUsingCurrencyResponse, COUNTRIESUSINGCURRENCYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountriesUsingCurrencyResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse addNewCountriesUsingCurrencyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse)get_store().add_element_user(COUNTRIESUSINGCURRENCYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CountriesUsingCurrencyResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountriesUsingCurrencyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponseDocument.CountriesUsingCurrencyResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CountriesUsingCurrencyResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRIESUSINGCURRENCYRESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountriesUsingCurrencyResult");
        
        
        /**
         * Gets the "CountriesUsingCurrencyResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName getCountriesUsingCurrencyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().find_element_user(COUNTRIESUSINGCURRENCYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CountriesUsingCurrencyResult" element
         */
        public void setCountriesUsingCurrencyResult(org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName countriesUsingCurrencyResult)
        {
            generatedSetterHelperImpl(countriesUsingCurrencyResult, COUNTRIESUSINGCURRENCYRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "CountriesUsingCurrencyResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName addNewCountriesUsingCurrencyResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().add_element_user(COUNTRIESUSINGCURRENCYRESULT$0);
                return target;
            }
        }
    }
}
