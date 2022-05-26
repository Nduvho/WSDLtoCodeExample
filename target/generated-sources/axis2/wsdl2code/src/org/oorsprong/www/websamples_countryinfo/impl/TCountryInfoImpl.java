/*
 * XML Type:  tCountryInfo
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.TCountryInfo
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML tCountryInfo(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class TCountryInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.TCountryInfo
{
    private static final long serialVersionUID = 1L;
    
    public TCountryInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SISOCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sISOCode");
    private static final javax.xml.namespace.QName SNAME$2 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sName");
    private static final javax.xml.namespace.QName SCAPITALCITY$4 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCapitalCity");
    private static final javax.xml.namespace.QName SPHONECODE$6 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sPhoneCode");
    private static final javax.xml.namespace.QName SCONTINENTCODE$8 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sContinentCode");
    private static final javax.xml.namespace.QName SCURRENCYISOCODE$10 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCurrencyISOCode");
    private static final javax.xml.namespace.QName SCOUNTRYFLAG$12 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCountryFlag");
    private static final javax.xml.namespace.QName LANGUAGES$14 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "Languages");
    
    
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
    
    /**
     * Gets the "sName" element
     */
    public java.lang.String getSName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sName" element
     */
    public org.apache.xmlbeans.XmlString xgetSName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sName" element
     */
    public void setSName(java.lang.String sName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNAME$2);
            }
            target.setStringValue(sName);
        }
    }
    
    /**
     * Sets (as xml) the "sName" element
     */
    public void xsetSName(org.apache.xmlbeans.XmlString sName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SNAME$2);
            }
            target.set(sName);
        }
    }
    
    /**
     * Gets the "sCapitalCity" element
     */
    public java.lang.String getSCapitalCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCAPITALCITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sCapitalCity" element
     */
    public org.apache.xmlbeans.XmlString xgetSCapitalCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCAPITALCITY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sCapitalCity" element
     */
    public void setSCapitalCity(java.lang.String sCapitalCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCAPITALCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCAPITALCITY$4);
            }
            target.setStringValue(sCapitalCity);
        }
    }
    
    /**
     * Sets (as xml) the "sCapitalCity" element
     */
    public void xsetSCapitalCity(org.apache.xmlbeans.XmlString sCapitalCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCAPITALCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCAPITALCITY$4);
            }
            target.set(sCapitalCity);
        }
    }
    
    /**
     * Gets the "sPhoneCode" element
     */
    public java.lang.String getSPhoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPHONECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sPhoneCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSPhoneCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPHONECODE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sPhoneCode" element
     */
    public void setSPhoneCode(java.lang.String sPhoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPHONECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPHONECODE$6);
            }
            target.setStringValue(sPhoneCode);
        }
    }
    
    /**
     * Sets (as xml) the "sPhoneCode" element
     */
    public void xsetSPhoneCode(org.apache.xmlbeans.XmlString sPhoneCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPHONECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPHONECODE$6);
            }
            target.set(sPhoneCode);
        }
    }
    
    /**
     * Gets the "sContinentCode" element
     */
    public java.lang.String getSContinentCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCONTINENTCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sContinentCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSContinentCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCONTINENTCODE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sContinentCode" element
     */
    public void setSContinentCode(java.lang.String sContinentCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCONTINENTCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCONTINENTCODE$8);
            }
            target.setStringValue(sContinentCode);
        }
    }
    
    /**
     * Sets (as xml) the "sContinentCode" element
     */
    public void xsetSContinentCode(org.apache.xmlbeans.XmlString sContinentCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCONTINENTCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCONTINENTCODE$8);
            }
            target.set(sContinentCode);
        }
    }
    
    /**
     * Gets the "sCurrencyISOCode" element
     */
    public java.lang.String getSCurrencyISOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCURRENCYISOCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sCurrencyISOCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSCurrencyISOCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCURRENCYISOCODE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sCurrencyISOCode" element
     */
    public void setSCurrencyISOCode(java.lang.String sCurrencyISOCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCURRENCYISOCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCURRENCYISOCODE$10);
            }
            target.setStringValue(sCurrencyISOCode);
        }
    }
    
    /**
     * Sets (as xml) the "sCurrencyISOCode" element
     */
    public void xsetSCurrencyISOCode(org.apache.xmlbeans.XmlString sCurrencyISOCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCURRENCYISOCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCURRENCYISOCODE$10);
            }
            target.set(sCurrencyISOCode);
        }
    }
    
    /**
     * Gets the "sCountryFlag" element
     */
    public java.lang.String getSCountryFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOUNTRYFLAG$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sCountryFlag" element
     */
    public org.apache.xmlbeans.XmlString xgetSCountryFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOUNTRYFLAG$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sCountryFlag" element
     */
    public void setSCountryFlag(java.lang.String sCountryFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOUNTRYFLAG$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOUNTRYFLAG$12);
            }
            target.setStringValue(sCountryFlag);
        }
    }
    
    /**
     * Sets (as xml) the "sCountryFlag" element
     */
    public void xsetSCountryFlag(org.apache.xmlbeans.XmlString sCountryFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOUNTRYFLAG$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOUNTRYFLAG$12);
            }
            target.set(sCountryFlag);
        }
    }
    
    /**
     * Gets the "Languages" element
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage getLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage)get_store().find_element_user(LANGUAGES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Languages" element
     */
    public void setLanguages(org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage languages)
    {
        generatedSetterHelperImpl(languages, LANGUAGES$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Languages" element
     */
    public org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage addNewLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage)get_store().add_element_user(LANGUAGES$14);
            return target;
        }
    }
}
