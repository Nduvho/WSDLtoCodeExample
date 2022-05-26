/*
 * An XML document type.
 * Localname: CapitalCityResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CapitalCityResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CapitalCityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapitalCityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPITALCITYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CapitalCityResponse");
    
    
    /**
     * Gets the "CapitalCityResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse getCapitalCityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse)get_store().find_element_user(CAPITALCITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CapitalCityResponse" element
     */
    public void setCapitalCityResponse(org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse capitalCityResponse)
    {
        generatedSetterHelperImpl(capitalCityResponse, CAPITALCITYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CapitalCityResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse addNewCapitalCityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse)get_store().add_element_user(CAPITALCITYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CapitalCityResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CapitalCityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CapitalCityResponseDocument.CapitalCityResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CapitalCityResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAPITALCITYRESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CapitalCityResult");
        
        
        /**
         * Gets the "CapitalCityResult" element
         */
        public java.lang.String getCapitalCityResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALCITYRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CapitalCityResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCapitalCityResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAPITALCITYRESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CapitalCityResult" element
         */
        public void setCapitalCityResult(java.lang.String capitalCityResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALCITYRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPITALCITYRESULT$0);
                }
                target.setStringValue(capitalCityResult);
            }
        }
        
        /**
         * Sets (as xml) the "CapitalCityResult" element
         */
        public void xsetCapitalCityResult(org.apache.xmlbeans.XmlString capitalCityResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAPITALCITYRESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAPITALCITYRESULT$0);
                }
                target.set(capitalCityResult);
            }
        }
    }
}
