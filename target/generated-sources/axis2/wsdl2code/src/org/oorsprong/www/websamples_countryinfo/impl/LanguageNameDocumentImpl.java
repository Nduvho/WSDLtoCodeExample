/*
 * An XML document type.
 * Localname: LanguageName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.LanguageNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one LanguageName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class LanguageNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LanguageNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGENAME$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "LanguageName");
    
    
    /**
     * Gets the "LanguageName" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName getLanguageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName)get_store().find_element_user(LANGUAGENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LanguageName" element
     */
    public void setLanguageName(org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName languageName)
    {
        generatedSetterHelperImpl(languageName, LANGUAGENAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LanguageName" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName addNewLanguageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName)get_store().add_element_user(LANGUAGENAME$0);
            return target;
        }
    }
    /**
     * An XML LanguageName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class LanguageNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageNameDocument.LanguageName
    {
        private static final long serialVersionUID = 1L;
        
        public LanguageNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SISOCODE$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sISOCode");
        
        
        /**
         * Gets the "sISOCode" element
         */
        public java.lang.String getSISOCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SISOCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sISOCode" element
         */
        public org.apache.xmlbeans.XmlString xgetSISOCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SISOCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sISOCode" element
         */
        public void setSISOCode(java.lang.String sisoCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SISOCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SISOCODE$0);
                }
                target.setStringValue(sisoCode);
            }
        }
        
        /**
         * Sets (as xml) the "sISOCode" element
         */
        public void xsetSISOCode(org.apache.xmlbeans.XmlString sisoCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SISOCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SISOCODE$0);
                }
                target.set(sisoCode);
            }
        }
    }
}
