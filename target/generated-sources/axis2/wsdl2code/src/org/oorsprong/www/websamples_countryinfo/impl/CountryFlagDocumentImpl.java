/*
 * An XML document type.
 * Localname: CountryFlag
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountryFlagDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountryFlag(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountryFlagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryFlagDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryFlagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYFLAG$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryFlag");
    
    
    /**
     * Gets the "CountryFlag" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag getCountryFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag)get_store().find_element_user(COUNTRYFLAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryFlag" element
     */
    public void setCountryFlag(org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag countryFlag)
    {
        generatedSetterHelperImpl(countryFlag, COUNTRYFLAG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryFlag" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag addNewCountryFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag)get_store().add_element_user(COUNTRYFLAG$0);
            return target;
        }
    }
    /**
     * An XML CountryFlag(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountryFlagImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountryFlagDocument.CountryFlag
    {
        private static final long serialVersionUID = 1L;
        
        public CountryFlagImpl(org.apache.xmlbeans.SchemaType sType)
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
