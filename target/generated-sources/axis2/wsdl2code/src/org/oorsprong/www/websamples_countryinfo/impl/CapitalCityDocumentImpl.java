/*
 * An XML document type.
 * Localname: CapitalCity
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CapitalCityDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CapitalCity(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CapitalCityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CapitalCityDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapitalCityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPITALCITY$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CapitalCity");
    
    
    /**
     * Gets the "CapitalCity" element
     */
    public org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity getCapitalCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity)get_store().find_element_user(CAPITALCITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CapitalCity" element
     */
    public void setCapitalCity(org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity capitalCity)
    {
        generatedSetterHelperImpl(capitalCity, CAPITALCITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CapitalCity" element
     */
    public org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity addNewCapitalCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity)get_store().add_element_user(CAPITALCITY$0);
            return target;
        }
    }
    /**
     * An XML CapitalCity(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CapitalCityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CapitalCityDocument.CapitalCity
    {
        private static final long serialVersionUID = 1L;
        
        public CapitalCityImpl(org.apache.xmlbeans.SchemaType sType)
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
