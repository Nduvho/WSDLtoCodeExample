/*
 * An XML document type.
 * Localname: ListOfContinentsByCode
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfContinentsByCode(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfContinentsByCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfContinentsByCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCONTINENTSBYCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByCode");
    
    
    /**
     * Gets the "ListOfContinentsByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode getListOfContinentsByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode)get_store().find_element_user(LISTOFCONTINENTSBYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfContinentsByCode" element
     */
    public void setListOfContinentsByCode(org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode listOfContinentsByCode)
    {
        generatedSetterHelperImpl(listOfContinentsByCode, LISTOFCONTINENTSBYCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfContinentsByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode addNewListOfContinentsByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode)get_store().add_element_user(LISTOFCONTINENTSBYCODE$0);
            return target;
        }
    }
    /**
     * An XML ListOfContinentsByCode(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfContinentsByCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeDocument.ListOfContinentsByCode
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfContinentsByCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
