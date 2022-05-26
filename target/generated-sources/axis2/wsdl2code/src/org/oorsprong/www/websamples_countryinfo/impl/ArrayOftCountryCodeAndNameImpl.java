/*
 * XML Type:  ArrayOftCountryCodeAndName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML ArrayOftCountryCodeAndName(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class ArrayOftCountryCodeAndNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOftCountryCodeAndNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCOUNTRYCODEANDNAME$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndName");
    
    
    /**
     * Gets array of all "tCountryCodeAndName" elements
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[] getTCountryCodeAndNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TCOUNTRYCODEANDNAME$0, targetList);
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[] result = new org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tCountryCodeAndName" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName getTCountryCodeAndNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName)get_store().find_element_user(TCOUNTRYCODEANDNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "tCountryCodeAndName" element
     */
    public boolean isNilTCountryCodeAndNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName)get_store().find_element_user(TCOUNTRYCODEANDNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tCountryCodeAndName" element
     */
    public int sizeOfTCountryCodeAndNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCOUNTRYCODEANDNAME$0);
        }
    }
    
    /**
     * Sets array of all "tCountryCodeAndName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTCountryCodeAndNameArray(org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName[] tCountryCodeAndNameArray)
    {
        check_orphaned();
        arraySetterHelper(tCountryCodeAndNameArray, TCOUNTRYCODEANDNAME$0);
    }
    
    /**
     * Sets ith "tCountryCodeAndName" element
     */
    public void setTCountryCodeAndNameArray(int i, org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName tCountryCodeAndName)
    {
        generatedSetterHelperImpl(tCountryCodeAndName, TCOUNTRYCODEANDNAME$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "tCountryCodeAndName" element
     */
    public void setNilTCountryCodeAndNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName)get_store().find_element_user(TCOUNTRYCODEANDNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tCountryCodeAndName" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName insertNewTCountryCodeAndName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName)get_store().insert_element_user(TCOUNTRYCODEANDNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tCountryCodeAndName" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName addNewTCountryCodeAndName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName)get_store().add_element_user(TCOUNTRYCODEANDNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tCountryCodeAndName" element
     */
    public void removeTCountryCodeAndName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCOUNTRYCODEANDNAME$0, i);
        }
    }
}
