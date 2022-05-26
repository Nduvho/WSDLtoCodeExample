/*
 * An XML document type.
 * Localname: CountriesUsingCurrency
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one CountriesUsingCurrency(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class CountriesUsingCurrencyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountriesUsingCurrencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRIESUSINGCURRENCY$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountriesUsingCurrency");
    
    
    /**
     * Gets the "CountriesUsingCurrency" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency getCountriesUsingCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency)get_store().find_element_user(COUNTRIESUSINGCURRENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountriesUsingCurrency" element
     */
    public void setCountriesUsingCurrency(org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency countriesUsingCurrency)
    {
        generatedSetterHelperImpl(countriesUsingCurrency, COUNTRIESUSINGCURRENCY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountriesUsingCurrency" element
     */
    public org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency addNewCountriesUsingCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency target = null;
            target = (org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency)get_store().add_element_user(COUNTRIESUSINGCURRENCY$0);
            return target;
        }
    }
    /**
     * An XML CountriesUsingCurrency(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class CountriesUsingCurrencyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyDocument.CountriesUsingCurrency
    {
        private static final long serialVersionUID = 1L;
        
        public CountriesUsingCurrencyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SISOCURRENCYCODE$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sISOCurrencyCode");
        
        
        /**
         * Gets the "sISOCurrencyCode" element
         */
        public java.lang.String getSISOCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SISOCURRENCYCODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sISOCurrencyCode" element
         */
        public org.apache.xmlbeans.XmlString xgetSISOCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SISOCURRENCYCODE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sISOCurrencyCode" element
         */
        public void setSISOCurrencyCode(java.lang.String sisoCurrencyCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SISOCURRENCYCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SISOCURRENCYCODE$0);
                }
                target.setStringValue(sisoCurrencyCode);
            }
        }
        
        /**
         * Sets (as xml) the "sISOCurrencyCode" element
         */
        public void xsetSISOCurrencyCode(org.apache.xmlbeans.XmlString sisoCurrencyCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SISOCURRENCYCODE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SISOCURRENCYCODE$0);
                }
                target.set(sisoCurrencyCode);
            }
        }
    }
}
