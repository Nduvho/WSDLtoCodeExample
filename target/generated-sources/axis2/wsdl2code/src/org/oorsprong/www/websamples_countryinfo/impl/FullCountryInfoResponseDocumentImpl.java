/*
 * An XML document type.
 * Localname: FullCountryInfoResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one FullCountryInfoResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class FullCountryInfoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public FullCountryInfoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLCOUNTRYINFORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfoResponse");
    
    
    /**
     * Gets the "FullCountryInfoResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse getFullCountryInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse)get_store().find_element_user(FULLCOUNTRYINFORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FullCountryInfoResponse" element
     */
    public void setFullCountryInfoResponse(org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse fullCountryInfoResponse)
    {
        generatedSetterHelperImpl(fullCountryInfoResponse, FULLCOUNTRYINFORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FullCountryInfoResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse addNewFullCountryInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse)get_store().add_element_user(FULLCOUNTRYINFORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML FullCountryInfoResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class FullCountryInfoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponseDocument.FullCountryInfoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public FullCountryInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FULLCOUNTRYINFORESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfoResult");
        
        
        /**
         * Gets the "FullCountryInfoResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.TCountryInfo getFullCountryInfoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.TCountryInfo target = null;
                target = (org.oorsprong.www.websamples_countryinfo.TCountryInfo)get_store().find_element_user(FULLCOUNTRYINFORESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "FullCountryInfoResult" element
         */
        public void setFullCountryInfoResult(org.oorsprong.www.websamples_countryinfo.TCountryInfo fullCountryInfoResult)
        {
            generatedSetterHelperImpl(fullCountryInfoResult, FULLCOUNTRYINFORESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "FullCountryInfoResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.TCountryInfo addNewFullCountryInfoResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.TCountryInfo target = null;
                target = (org.oorsprong.www.websamples_countryinfo.TCountryInfo)get_store().add_element_user(FULLCOUNTRYINFORESULT$0);
                return target;
            }
        }
    }
}
