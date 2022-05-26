/*
 * An XML document type.
 * Localname: CountryISOCode
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountryISOCode(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountryISOCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryISOCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYISOCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryISOCode");
    
    
    /**
     * Gets the "CountryISOCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode getCountryISOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode)get_store().find_element_user(COUNTRYISOCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryISOCode" element
     */
    public void setCountryISOCode(org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode countryISOCode)
    {
        generatedSetterHelperImpl(countryISOCode, COUNTRYISOCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryISOCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode addNewCountryISOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode)get_store().add_element_user(COUNTRYISOCODE$0);
            return target;
        }
    }
    /**
     * An XML CountryISOCode(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountryISOCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryISOCodeDocument.CountryISOCode
    {
        private static final long serialVersionUID = 1L;
        
        public CountryISOCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCOUNTRYNAME$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCountryName");
        
        
        /**
         * Gets the "sCountryName" element
         */
        public java.lang.String getSCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOUNTRYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sCountryName" element
         */
        public org.apache.xmlbeans.XmlString xgetSCountryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOUNTRYNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sCountryName" element
         */
        public void setSCountryName(java.lang.String sCountryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOUNTRYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOUNTRYNAME$0);
                }
                target.setStringValue(sCountryName);
            }
        }
        
        /**
         * Sets (as xml) the "sCountryName" element
         */
        public void xsetSCountryName(org.apache.xmlbeans.XmlString sCountryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOUNTRYNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOUNTRYNAME$0);
                }
                target.set(sCountryName);
            }
        }
    }
}
