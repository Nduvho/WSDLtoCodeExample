/*
 * XML Type:  ArrayOftContinent
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ArrayOftContinent
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML ArrayOftContinent(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class ArrayOftContinentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ArrayOftContinent
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOftContinentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCONTINENT$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tContinent");
    
    
    /**
     * Gets array of all "tContinent" elements
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent[] getTContinentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TCONTINENT$0, targetList);
            org.oorsprong.www.websamples_countryinfo.TContinent[] result = new org.oorsprong.www.websamples_countryinfo.TContinent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent getTContinentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TContinent)get_store().find_element_user(TCONTINENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "tContinent" element
     */
    public boolean isNilTContinentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TContinent)get_store().find_element_user(TCONTINENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tContinent" element
     */
    public int sizeOfTContinentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCONTINENT$0);
        }
    }
    
    /**
     * Sets array of all "tContinent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTContinentArray(org.oorsprong.www.websamples_countryinfo.TContinent[] tContinentArray)
    {
        check_orphaned();
        arraySetterHelper(tContinentArray, TCONTINENT$0);
    }
    
    /**
     * Sets ith "tContinent" element
     */
    public void setTContinentArray(int i, org.oorsprong.www.websamples_countryinfo.TContinent tContinent)
    {
        generatedSetterHelperImpl(tContinent, TCONTINENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "tContinent" element
     */
    public void setNilTContinentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TContinent)get_store().find_element_user(TCONTINENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent insertNewTContinent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TContinent)get_store().insert_element_user(TCONTINENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.TContinent addNewTContinent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TContinent)get_store().add_element_user(TCONTINENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tContinent" element
     */
    public void removeTContinent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCONTINENT$0, i);
        }
    }
}
