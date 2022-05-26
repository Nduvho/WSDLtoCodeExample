/*
 * XML Type:  ArrayOftCountryCodeAndNameGroupedByContinent
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML ArrayOftCountryCodeAndNameGroupedByContinent(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class ArrayOftCountryCodeAndNameGroupedByContinentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOftCountryCodeAndNameGroupedByContinentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndNameGroupedByContinent");
    
    
    /**
     * Gets array of all "tCountryCodeAndNameGroupedByContinent" elements
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] getTCountryCodeAndNameGroupedByContinentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0, targetList);
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] result = new org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tCountryCodeAndNameGroupedByContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent getTCountryCodeAndNameGroupedByContinentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent)get_store().find_element_user(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "tCountryCodeAndNameGroupedByContinent" element
     */
    public boolean isNilTCountryCodeAndNameGroupedByContinentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent)get_store().find_element_user(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tCountryCodeAndNameGroupedByContinent" element
     */
    public int sizeOfTCountryCodeAndNameGroupedByContinentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0);
        }
    }
    
    /**
     * Sets array of all "tCountryCodeAndNameGroupedByContinent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTCountryCodeAndNameGroupedByContinentArray(org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent[] tCountryCodeAndNameGroupedByContinentArray)
    {
        check_orphaned();
        arraySetterHelper(tCountryCodeAndNameGroupedByContinentArray, TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0);
    }
    
    /**
     * Sets ith "tCountryCodeAndNameGroupedByContinent" element
     */
    public void setTCountryCodeAndNameGroupedByContinentArray(int i, org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent tCountryCodeAndNameGroupedByContinent)
    {
        generatedSetterHelperImpl(tCountryCodeAndNameGroupedByContinent, TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "tCountryCodeAndNameGroupedByContinent" element
     */
    public void setNilTCountryCodeAndNameGroupedByContinentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent)get_store().find_element_user(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tCountryCodeAndNameGroupedByContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent insertNewTCountryCodeAndNameGroupedByContinent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent)get_store().insert_element_user(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tCountryCodeAndNameGroupedByContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent addNewTCountryCodeAndNameGroupedByContinent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent)get_store().add_element_user(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tCountryCodeAndNameGroupedByContinent" element
     */
    public void removeTCountryCodeAndNameGroupedByContinent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCOUNTRYCODEANDNAMEGROUPEDBYCONTINENT$0, i);
        }
    }
}
