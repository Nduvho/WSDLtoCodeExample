/*
 * An XML document type.
 * Localname: FullCountryInfo
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one FullCountryInfo(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class FullCountryInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public FullCountryInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLCOUNTRYINFO$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfo");
    
    
    /**
     * Gets the "FullCountryInfo" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo getFullCountryInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo)get_store().find_element_user(FULLCOUNTRYINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FullCountryInfo" element
     */
    public void setFullCountryInfo(org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo fullCountryInfo)
    {
        generatedSetterHelperImpl(fullCountryInfo, FULLCOUNTRYINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FullCountryInfo" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo addNewFullCountryInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo)get_store().add_element_user(FULLCOUNTRYINFO$0);
            return target;
        }
    }
    /**
     * An XML FullCountryInfo(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class FullCountryInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoDocument.FullCountryInfo
    {
        private static final long serialVersionUID = 1L;
        
        public FullCountryInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCOUNTRYISOCODE$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCountryISOCode");
        
        
        /**
         * Gets the "sCountryISOCode" element
         */
        public java.lang.String getSCountryISOCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOUNTRYISOCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sCountryISOCode" element
         */
        public org.apache.xmlbeans.XmlString xgetSCountryISOCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOUNTRYISOCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sCountryISOCode" element
         */
        public void setSCountryISOCode(java.lang.String sCountryISOCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOUNTRYISOCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOUNTRYISOCODE$0);
                }
                target.setStringValue(sCountryISOCode);
            }
        }
        
        /**
         * Sets (as xml) the "sCountryISOCode" element
         */
        public void xsetSCountryISOCode(org.apache.xmlbeans.XmlString sCountryISOCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOUNTRYISOCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOUNTRYISOCODE$0);
                }
                target.set(sCountryISOCode);
            }
        }
    }
}
