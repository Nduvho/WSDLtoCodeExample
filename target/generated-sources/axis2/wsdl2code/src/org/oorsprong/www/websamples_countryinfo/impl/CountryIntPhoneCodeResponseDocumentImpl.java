/*
 * An XML document type.
 * Localname: CountryIntPhoneCodeResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountryIntPhoneCodeResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountryIntPhoneCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryIntPhoneCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYINTPHONECODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryIntPhoneCodeResponse");
    
    
    /**
     * Gets the "CountryIntPhoneCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse getCountryIntPhoneCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse)get_store().find_element_user(COUNTRYINTPHONECODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryIntPhoneCodeResponse" element
     */
    public void setCountryIntPhoneCodeResponse(org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse countryIntPhoneCodeResponse)
    {
        generatedSetterHelperImpl(countryIntPhoneCodeResponse, COUNTRYINTPHONECODERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryIntPhoneCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse addNewCountryIntPhoneCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse)get_store().add_element_user(COUNTRYINTPHONECODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CountryIntPhoneCodeResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountryIntPhoneCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponseDocument.CountryIntPhoneCodeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CountryIntPhoneCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRYINTPHONECODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryIntPhoneCodeResult");
        
        
        /**
         * Gets the "CountryIntPhoneCodeResult" element
         */
        public java.lang.String getCountryIntPhoneCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYINTPHONECODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CountryIntPhoneCodeResult" element
         */
        public org.apache.xmlbeans.XmlString xgetCountryIntPhoneCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYINTPHONECODERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CountryIntPhoneCodeResult" element
         */
        public void setCountryIntPhoneCodeResult(java.lang.String countryIntPhoneCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYINTPHONECODERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYINTPHONECODERESULT$0);
                }
                target.setStringValue(countryIntPhoneCodeResult);
            }
        }
        
        /**
         * Sets (as xml) the "CountryIntPhoneCodeResult" element
         */
        public void xsetCountryIntPhoneCodeResult(org.apache.xmlbeans.XmlString countryIntPhoneCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYINTPHONECODERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYINTPHONECODERESULT$0);
                }
                target.set(countryIntPhoneCodeResult);
            }
        }
    }
}
