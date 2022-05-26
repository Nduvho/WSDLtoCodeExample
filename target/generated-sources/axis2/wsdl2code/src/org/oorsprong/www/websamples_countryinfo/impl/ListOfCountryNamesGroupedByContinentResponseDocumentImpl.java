/*
 * An XML document type.
 * Localname: ListOfCountryNamesGroupedByContinentResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCountryNamesGroupedByContinentResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCountryNamesGroupedByContinentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCountryNamesGroupedByContinentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesGroupedByContinentResponse");
    
    
    /**
     * Gets the "ListOfCountryNamesGroupedByContinentResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse getListOfCountryNamesGroupedByContinentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse)get_store().find_element_user(LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCountryNamesGroupedByContinentResponse" element
     */
    public void setListOfCountryNamesGroupedByContinentResponse(org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse listOfCountryNamesGroupedByContinentResponse)
    {
        generatedSetterHelperImpl(listOfCountryNamesGroupedByContinentResponse, LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCountryNamesGroupedByContinentResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse addNewListOfCountryNamesGroupedByContinentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse)get_store().add_element_user(LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCountryNamesGroupedByContinentResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCountryNamesGroupedByContinentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponseDocument.ListOfCountryNamesGroupedByContinentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCountryNamesGroupedByContinentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesGroupedByContinentResult");
        
        
        /**
         * Gets the "ListOfCountryNamesGroupedByContinentResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent getListOfCountryNamesGroupedByContinentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent)get_store().find_element_user(LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfCountryNamesGroupedByContinentResult" element
         */
        public void setListOfCountryNamesGroupedByContinentResult(org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent listOfCountryNamesGroupedByContinentResult)
        {
            generatedSetterHelperImpl(listOfCountryNamesGroupedByContinentResult, LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfCountryNamesGroupedByContinentResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent addNewListOfCountryNamesGroupedByContinentResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent)get_store().add_element_user(LISTOFCOUNTRYNAMESGROUPEDBYCONTINENTRESULT$0);
                return target;
            }
        }
    }
}
