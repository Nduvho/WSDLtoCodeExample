/*
 * An XML document type.
 * Localname: LanguageISOCodeResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one LanguageISOCodeResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class LanguageISOCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LanguageISOCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGEISOCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "LanguageISOCodeResponse");
    
    
    /**
     * Gets the "LanguageISOCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse getLanguageISOCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse)get_store().find_element_user(LANGUAGEISOCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LanguageISOCodeResponse" element
     */
    public void setLanguageISOCodeResponse(org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse languageISOCodeResponse)
    {
        generatedSetterHelperImpl(languageISOCodeResponse, LANGUAGEISOCODERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LanguageISOCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse addNewLanguageISOCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse)get_store().add_element_user(LANGUAGEISOCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LanguageISOCodeResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class LanguageISOCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponseDocument.LanguageISOCodeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public LanguageISOCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LANGUAGEISOCODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "LanguageISOCodeResult");
        
        
        /**
         * Gets the "LanguageISOCodeResult" element
         */
        public java.lang.String getLanguageISOCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGEISOCODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LanguageISOCodeResult" element
         */
        public org.apache.xmlbeans.XmlString xgetLanguageISOCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGEISOCODERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LanguageISOCodeResult" element
         */
        public void setLanguageISOCodeResult(java.lang.String languageISOCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGEISOCODERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGEISOCODERESULT$0);
                }
                target.setStringValue(languageISOCodeResult);
            }
        }
        
        /**
         * Sets (as xml) the "LanguageISOCodeResult" element
         */
        public void xsetLanguageISOCodeResult(org.apache.xmlbeans.XmlString languageISOCodeResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGEISOCODERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGEISOCODERESULT$0);
                }
                target.set(languageISOCodeResult);
            }
        }
    }
}
