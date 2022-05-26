/*
 * An XML document type.
 * Localname: LanguageISOCode
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one LanguageISOCode(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class LanguageISOCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LanguageISOCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGEISOCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "LanguageISOCode");
    
    
    /**
     * Gets the "LanguageISOCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode getLanguageISOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode)get_store().find_element_user(LANGUAGEISOCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LanguageISOCode" element
     */
    public void setLanguageISOCode(org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode languageISOCode)
    {
        generatedSetterHelperImpl(languageISOCode, LANGUAGEISOCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LanguageISOCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode addNewLanguageISOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode)get_store().add_element_user(LANGUAGEISOCODE$0);
            return target;
        }
    }
    /**
     * An XML LanguageISOCode(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class LanguageISOCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.LanguageISOCodeDocument.LanguageISOCode
    {
        private static final long serialVersionUID = 1L;
        
        public LanguageISOCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SLANGUAGENAME$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sLanguageName");
        
        
        /**
         * Gets the "sLanguageName" element
         */
        public java.lang.String getSLanguageName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLANGUAGENAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sLanguageName" element
         */
        public org.apache.xmlbeans.XmlString xgetSLanguageName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SLANGUAGENAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sLanguageName" element
         */
        public void setSLanguageName(java.lang.String sLanguageName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SLANGUAGENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SLANGUAGENAME$0);
                }
                target.setStringValue(sLanguageName);
            }
        }
        
        /**
         * Sets (as xml) the "sLanguageName" element
         */
        public void xsetSLanguageName(org.apache.xmlbeans.XmlString sLanguageName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SLANGUAGENAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SLANGUAGENAME$0);
                }
                target.set(sLanguageName);
            }
        }
    }
}
