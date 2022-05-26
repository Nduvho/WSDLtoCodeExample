/*
 * An XML document type.
 * Localname: ListOfCountryNamesByNameResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCountryNamesByNameResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCountryNamesByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCountryNamesByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByNameResponse");
    
    
    /**
     * Gets the "ListOfCountryNamesByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse getListOfCountryNamesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse)get_store().find_element_user(LISTOFCOUNTRYNAMESBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCountryNamesByNameResponse" element
     */
    public void setListOfCountryNamesByNameResponse(org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse listOfCountryNamesByNameResponse)
    {
        generatedSetterHelperImpl(listOfCountryNamesByNameResponse, LISTOFCOUNTRYNAMESBYNAMERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCountryNamesByNameResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse addNewListOfCountryNamesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse)get_store().add_element_user(LISTOFCOUNTRYNAMESBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCountryNamesByNameResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCountryNamesByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponseDocument.ListOfCountryNamesByNameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCountryNamesByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESBYNAMERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByNameResult");
        
        
        /**
         * Gets the "ListOfCountryNamesByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName getListOfCountryNamesByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().find_element_user(LISTOFCOUNTRYNAMESBYNAMERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfCountryNamesByNameResult" element
         */
        public void setListOfCountryNamesByNameResult(org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName listOfCountryNamesByNameResult)
        {
            generatedSetterHelperImpl(listOfCountryNamesByNameResult, LISTOFCOUNTRYNAMESBYNAMERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfCountryNamesByNameResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName addNewListOfCountryNamesByNameResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().add_element_user(LISTOFCOUNTRYNAMESBYNAMERESULT$0);
                return target;
            }
        }
    }
}
