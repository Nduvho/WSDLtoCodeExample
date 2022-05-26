/*
 * XML Type:  tCountryCodeAndNameGroupedByContinent
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML tCountryCodeAndNameGroupedByContinent(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class TCountryCodeAndNameGroupedByContinentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent
{
    private static final long serialVersionUID = 1L;
    
    public TCountryCodeAndNameGroupedByContinentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTINENT$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "Continent");
    private static final javax.xml.namespace.QName COUNTRYCODEANDNAMES$2 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryCodeAndNames");
    
    
    /**
     * Gets the "Continent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent getContinent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TContinent)get_store().find_element_user(CONTINENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Continent" element
     */
    public void setContinent(org.oorsprong.www.websamples_countryinfo.TContinent continent)
    {
        generatedSetterHelperImpl(continent, CONTINENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Continent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent addNewContinent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TContinent)get_store().add_element_user(CONTINENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "CountryCodeAndNames" element
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName getCountryCodeAndNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().find_element_user(COUNTRYCODEANDNAMES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountryCodeAndNames" element
     */
    public void setCountryCodeAndNames(org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName countryCodeAndNames)
    {
        generatedSetterHelperImpl(countryCodeAndNames, COUNTRYCODEANDNAMES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CountryCodeAndNames" element
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName addNewCountryCodeAndNames()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().add_element_user(COUNTRYCODEANDNAMES$2);
            return target;
        }
    }
}
