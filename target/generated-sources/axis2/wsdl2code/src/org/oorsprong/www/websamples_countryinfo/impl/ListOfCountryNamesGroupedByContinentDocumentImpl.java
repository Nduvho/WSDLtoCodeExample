/*
 * An XML document type.
 * Localname: ListOfCountryNamesGroupedByContinent
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCountryNamesGroupedByContinent(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCountryNamesGroupedByContinentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCountryNamesGroupedByContinentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESGROUPEDBYCONTINENT$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesGroupedByContinent");
    
    
    /**
     * Gets the "ListOfCountryNamesGroupedByContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent getListOfCountryNamesGroupedByContinent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent)get_store().find_element_user(LISTOFCOUNTRYNAMESGROUPEDBYCONTINENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCountryNamesGroupedByContinent" element
     */
    public void setListOfCountryNamesGroupedByContinent(org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent listOfCountryNamesGroupedByContinent)
    {
        generatedSetterHelperImpl(listOfCountryNamesGroupedByContinent, LISTOFCOUNTRYNAMESGROUPEDBYCONTINENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCountryNamesGroupedByContinent" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent addNewListOfCountryNamesGroupedByContinent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent)get_store().add_element_user(LISTOFCOUNTRYNAMESGROUPEDBYCONTINENT$0);
            return target;
        }
    }
    /**
     * An XML ListOfCountryNamesGroupedByContinent(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCountryNamesGroupedByContinentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentDocument.ListOfCountryNamesGroupedByContinent
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCountryNamesGroupedByContinentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
