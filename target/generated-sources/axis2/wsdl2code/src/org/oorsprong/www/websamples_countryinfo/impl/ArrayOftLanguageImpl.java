/*
 * XML Type:  ArrayOftLanguage
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * An XML ArrayOftLanguage(@http://www.oorsprong.org/websamples.countryinfo).
 *
 * This is a complex type.
 */
public class ArrayOftLanguageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage
{
    private static final long serialVersionUID = 1L;
    
    public ArrayOftLanguageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TLANGUAGE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tLanguage");
    
    
    /**
     * Gets array of all "tLanguage" elements
     */
    public org.oorsprong.www.websamples_countryinfo.TLanguage[] getTLanguageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TLANGUAGE$0, targetList);
            org.oorsprong.www.websamples_countryinfo.TLanguage[] result = new org.oorsprong.www.websamples_countryinfo.TLanguage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tLanguage" element
     */
    public org.oorsprong.www.websamples_countryinfo.TLanguage getTLanguageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TLanguage target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TLanguage)get_store().find_element_user(TLANGUAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "tLanguage" element
     */
    public boolean isNilTLanguageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TLanguage target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TLanguage)get_store().find_element_user(TLANGUAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tLanguage" element
     */
    public int sizeOfTLanguageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TLANGUAGE$0);
        }
    }
    
    /**
     * Sets array of all "tLanguage" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTLanguageArray(org.oorsprong.www.websamples_countryinfo.TLanguage[] tLanguageArray)
    {
        check_orphaned();
        arraySetterHelper(tLanguageArray, TLANGUAGE$0);
    }
    
    /**
     * Sets ith "tLanguage" element
     */
    public void setTLanguageArray(int i, org.oorsprong.www.websamples_countryinfo.TLanguage tLanguage)
    {
        generatedSetterHelperImpl(tLanguage, TLANGUAGE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "tLanguage" element
     */
    public void setNilTLanguageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TLanguage target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TLanguage)get_store().find_element_user(TLANGUAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tLanguage" element
     */
    public org.oorsprong.www.websamples_countryinfo.TLanguage insertNewTLanguage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TLanguage target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TLanguage)get_store().insert_element_user(TLANGUAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tLanguage" element
     */
    public org.oorsprong.www.websamples_countryinfo.TLanguage addNewTLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.TLanguage target = null;
            target = (org.oorsprong.www.websamples_countryinfo.TLanguage)get_store().add_element_user(TLANGUAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tLanguage" element
     */
    public void removeTLanguage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TLANGUAGE$0, i);
        }
    }
}
