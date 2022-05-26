/*
 * An XML document type.
 * Localname: FullCountryInfoAllCountriesResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one FullCountryInfoAllCountriesResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class FullCountryInfoAllCountriesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public FullCountryInfoAllCountriesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLCOUNTRYINFOALLCOUNTRIESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfoAllCountriesResponse");
    
    
    /**
     * Gets the "FullCountryInfoAllCountriesResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse getFullCountryInfoAllCountriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse)get_store().find_element_user(FULLCOUNTRYINFOALLCOUNTRIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FullCountryInfoAllCountriesResponse" element
     */
    public void setFullCountryInfoAllCountriesResponse(org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse fullCountryInfoAllCountriesResponse)
    {
        generatedSetterHelperImpl(fullCountryInfoAllCountriesResponse, FULLCOUNTRYINFOALLCOUNTRIESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FullCountryInfoAllCountriesResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse addNewFullCountryInfoAllCountriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse)get_store().add_element_user(FULLCOUNTRYINFOALLCOUNTRIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML FullCountryInfoAllCountriesResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class FullCountryInfoAllCountriesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponseDocument.FullCountryInfoAllCountriesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public FullCountryInfoAllCountriesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLCOUNTRYINFOALLCOUNTRIESRESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfoAllCountriesResult");
        
        
        /**
         * Gets the "FullCountryInfoAllCountriesResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo getFullCountryInfoAllCountriesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo)get_store().find_element_user(FULLCOUNTRYINFOALLCOUNTRIESRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "FullCountryInfoAllCountriesResult" element
         */
        public void setFullCountryInfoAllCountriesResult(org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo fullCountryInfoAllCountriesResult)
        {
            generatedSetterHelperImpl(fullCountryInfoAllCountriesResult, FULLCOUNTRYINFOALLCOUNTRIESRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "FullCountryInfoAllCountriesResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo addNewFullCountryInfoAllCountriesResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo)get_store().add_element_user(FULLCOUNTRYINFOALLCOUNTRIESRESULT$0);
                return target;
            }
        }
    }
}
