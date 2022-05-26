/*
 * XML Type:  tCountryCodeAndName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML tCountryCodeAndName(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class TCountryCodeAndNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName
{
    private static final long serialVersionUID = 1L;
    
    public TCountryCodeAndNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SISOCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sISOCode");
    private static final javax.xml.namespace.QName SNAME$2 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sName");
    
    
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
}
