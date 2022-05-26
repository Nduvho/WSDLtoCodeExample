/*
 * XML Type:  ArrayOftCountryInfo
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML ArrayOftCountryInfo(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class ArrayOftCountryInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOftCountryInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TCOUNTRYINFO$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryInfo");
    
    
    /**
     * Gets array of all "tCountryInfo" elements
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryInfo[] getTCountryInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TCOUNTRYINFO$0, targetList);
            org.oorsprong.www.websamples_countryinfo.TCountryInfo[] result = new org.oorsprong.www.websamples_countryinfo.TCountryInfo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tCountryInfo" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryInfo getTCountryInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryInfo target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryInfo)get_store().find_element_user(TCOUNTRYINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "tCountryInfo" element
     */
    public boolean isNilTCountryInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryInfo target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryInfo)get_store().find_element_user(TCOUNTRYINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tCountryInfo" element
     */
    public int sizeOfTCountryInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TCOUNTRYINFO$0);
        }
    }
    
    /**
     * Sets array of all "tCountryInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTCountryInfoArray(org.oorsprong.www.websamples_countryinfo.TCountryInfo[] tCountryInfoArray)
    {
        check_orphaned();
        arraySetterHelper(tCountryInfoArray, TCOUNTRYINFO$0);
    }
    
    /**
     * Sets ith "tCountryInfo" element
     */
    public void setTCountryInfoArray(int i, org.oorsprong.www.websamples_countryinfo.TCountryInfo tCountryInfo)
    {
        generatedSetterHelperImpl(tCountryInfo, TCOUNTRYINFO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "tCountryInfo" element
     */
    public void setNilTCountryInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryInfo target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryInfo)get_store().find_element_user(TCOUNTRYINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tCountryInfo" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryInfo insertNewTCountryInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryInfo target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryInfo)get_store().insert_element_user(TCOUNTRYINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tCountryInfo" element
     */
    public org.oorsprong.www.websamples_countryinfo.TCountryInfo addNewTCountryInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TCountryInfo target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TCountryInfo)get_store().add_element_user(TCOUNTRYINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tCountryInfo" element
     */
    public void removeTCountryInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TCOUNTRYINFO$0, i);
        }
    }
}
