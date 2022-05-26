/*
 * An XML document type.
 * Localname: FullCountryInfoAllCountries
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one FullCountryInfoAllCountries(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class FullCountryInfoAllCountriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public FullCountryInfoAllCountriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLCOUNTRYINFOALLCOUNTRIES$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "FullCountryInfoAllCountries");
    
    
    /**
     * Gets the "FullCountryInfoAllCountries" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries getFullCountryInfoAllCountries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries)get_store().find_element_user(FULLCOUNTRYINFOALLCOUNTRIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FullCountryInfoAllCountries" element
     */
    public void setFullCountryInfoAllCountries(org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries fullCountryInfoAllCountries)
    {
        generatedSetterHelperImpl(fullCountryInfoAllCountries, FULLCOUNTRYINFOALLCOUNTRIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FullCountryInfoAllCountries" element
     */
    public org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries addNewFullCountryInfoAllCountries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries target = null;
            target = (org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries)get_store().add_element_user(FULLCOUNTRYINFOALLCOUNTRIES$0);
            return target;
        }
    }
    /**
     * An XML FullCountryInfoAllCountries(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class FullCountryInfoAllCountriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesDocument.FullCountryInfoAllCountries
    {
        private static final long serialVersionUID = 1L;
        
        public FullCountryInfoAllCountriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
