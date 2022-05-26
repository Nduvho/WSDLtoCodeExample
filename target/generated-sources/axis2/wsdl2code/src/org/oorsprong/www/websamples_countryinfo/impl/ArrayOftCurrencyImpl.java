/*
 * XML Type:  ArrayOftCurrency
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML ArrayOftCurrency(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class ArrayOftCurrencyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOftCurrencyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCURRENCY$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCurrency");
    
    
    /**
     * Gets array of all "tCurrency" elements
     */
    public org.oorsprong.www.websamples_countryinfo.TCurrency[] getTCurrencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TCURRENCY$0, targetList);
            org.oorsprong.www.websamples_countryinfo.TCurrency[] result = new org.oorsprong.www.websamples_countryinfo.TCurrency[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tCurrency" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCurrency getTCurrencyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCurrency target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCurrency)get_store().find_element_user(TCURRENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "tCurrency" element
     */
    public boolean isNilTCurrencyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCurrency target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCurrency)get_store().find_element_user(TCURRENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tCurrency" element
     */
    public int sizeOfTCurrencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCURRENCY$0);
        }
    }
    
    /**
     * Sets array of all "tCurrency" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTCurrencyArray(org.oorsprong.www.websamples_countryinfo.TCurrency[] tCurrencyArray)
    {
        check_orphaned();
        arraySetterHelper(tCurrencyArray, TCURRENCY$0);
    }
    
    /**
     * Sets ith "tCurrency" element
     */
    public void setTCurrencyArray(int i, org.oorsprong.www.websamples_countryinfo.TCurrency tCurrency)
    {
        generatedSetterHelperImpl(tCurrency, TCURRENCY$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "tCurrency" element
     */
    public void setNilTCurrencyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCurrency target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCurrency)get_store().find_element_user(TCURRENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tCurrency" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCurrency insertNewTCurrency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCurrency target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCurrency)get_store().insert_element_user(TCURRENCY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tCurrency" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCurrency addNewTCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCurrency target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCurrency)get_store().add_element_user(TCURRENCY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tCurrency" element
     */
    public void removeTCurrency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCURRENCY$0, i);
        }
    }
}
