/*
 * An XML document type.
 * Localname: ListOfCountryNamesByCode
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCountryNamesByCode(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCountryNamesByCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCountryNamesByCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESBYCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByCode");
    
    
    /**
     * Gets the "ListOfCountryNamesByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode getListOfCountryNamesByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode)get_store().find_element_user(LISTOFCOUNTRYNAMESBYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCountryNamesByCode" element
     */
    public void setListOfCountryNamesByCode(org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode listOfCountryNamesByCode)
    {
        generatedSetterHelperImpl(listOfCountryNamesByCode, LISTOFCOUNTRYNAMESBYCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCountryNamesByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode addNewListOfCountryNamesByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode)get_store().add_element_user(LISTOFCOUNTRYNAMESBYCODE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCountryNamesByCode(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCountryNamesByCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeDocument.ListOfCountryNamesByCode
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCountryNamesByCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
