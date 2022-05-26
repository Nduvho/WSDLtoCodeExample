/*
 * An XML document type.
 * Localname: LanguageNameResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one LanguageNameResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class LanguageNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LanguageNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGENAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "LanguageNameResponse");
    
    
    /**
     * Gets the "LanguageNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse getLanguageNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse)get_store().find_element_user(LANGUAGENAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LanguageNameResponse" element
     */
    public void setLanguageNameResponse(org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse languageNameResponse)
    {
        generatedSetterHelperImpl(languageNameResponse, LANGUAGENAMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LanguageNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse addNewLanguageNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse)get_store().add_element_user(LANGUAGENAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LanguageNameResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class LanguageNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageNameResponseDocument.LanguageNameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public LanguageNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LANGUAGENAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "LanguageNameResult");
        
        
        /**
         * Gets the "LanguageNameResult" element
         */
        public java.lang.String getLanguageNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGENAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LanguageNameResult" element
         */
        public org.apache.xmlbeans.XmlString xgetLanguageNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGENAMERESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LanguageNameResult" element
         */
        public void setLanguageNameResult(java.lang.String languageNameResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGENAMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGENAMERESULT$0);
                }
                target.setStringValue(languageNameResult);
            }
        }
        
        /**
         * Sets (as xml) the "LanguageNameResult" element
         */
        public void xsetLanguageNameResult(org.apache.xmlbeans.XmlString languageNameResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGENAMERESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGENAMERESULT$0);
                }
                target.set(languageNameResult);
            }
        }
    }
}
