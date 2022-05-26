/*
 * An XML document type.
 * Localname: CountryNameResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountryNameResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountryNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryNameResponse");
    
    
    /**
     * Gets the "CountryNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse getCountryNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse)get_store().find_element_user(COUNTRYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryNameResponse" element
     */
    public void setCountryNameResponse(org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse countryNameResponse)
    {
        generatedSetterHelperImpl(countryNameResponse, COUNTRYNAMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse addNewCountryNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse)get_store().add_element_user(COUNTRYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CountryNameResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountryNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryNameResponseDocument.CountryNameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CountryNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRYNAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryNameResult");
        
        
        /**
         * Gets the "CountryNameResult" element
         */
        public java.lang.String getCountryNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryNameResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAMERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CountryNameResult" element
         */
        public void setCountryNameResult(java.lang.String countryNameResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYNAMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYNAMERESULT$0);
                }
                target.setStringValue(countryNameResult);
            }
        }
        
        /**
         * Sets (as xml) the "CountryNameResult" element
         */
        public void xsetCountryNameResult(org.apache.xmlbeans.XmlString countryNameResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYNAMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYNAMERESULT$0);
                }
                target.set(countryNameResult);
            }
        }
    }
}
