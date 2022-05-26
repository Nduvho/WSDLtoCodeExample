/*
 * An XML document type.
 * Localname: ListOfCurrenciesByCode
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCurrenciesByCode(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCurrenciesByCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCurrenciesByCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCURRENCIESBYCODE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCurrenciesByCode");
    
    
    /**
     * Gets the "ListOfCurrenciesByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode getListOfCurrenciesByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode)get_store().find_element_user(LISTOFCURRENCIESBYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCurrenciesByCode" element
     */
    public void setListOfCurrenciesByCode(org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode listOfCurrenciesByCode)
    {
        generatedSetterHelperImpl(listOfCurrenciesByCode, LISTOFCURRENCIESBYCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCurrenciesByCode" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode addNewListOfCurrenciesByCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode)get_store().add_element_user(LISTOFCURRENCIESBYCODE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCurrenciesByCode(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCurrenciesByCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeDocument.ListOfCurrenciesByCode
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCurrenciesByCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
