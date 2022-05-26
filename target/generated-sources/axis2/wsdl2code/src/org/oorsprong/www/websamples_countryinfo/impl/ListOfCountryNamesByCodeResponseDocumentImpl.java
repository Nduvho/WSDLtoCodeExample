/*
 * An XML document type.
 * Localname: ListOfCountryNamesByCodeResponse
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfCountryNamesByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfCountryNamesByCodeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ListOfCountryNamesByCodeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESBYCODERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByCodeResponse");
    
    
    /**
     * Gets the "ListOfCountryNamesByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse getListOfCountryNamesByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse)get_store().find_element_user(LISTOFCOUNTRYNAMESBYCODERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCountryNamesByCodeResponse" element
     */
    public void setListOfCountryNamesByCodeResponse(org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse listOfCountryNamesByCodeResponse)
    {
        generatedSetterHelperImpl(listOfCountryNamesByCodeResponse, LISTOFCOUNTRYNAMESBYCODERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ListOfCountryNamesByCodeResponse" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse addNewListOfCountryNamesByCodeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse)get_store().add_element_user(LISTOFCOUNTRYNAMESBYCODERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCountryNamesByCodeResponse(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfCountryNamesByCodeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponseDocument.ListOfCountryNamesByCodeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ListOfCountryNamesByCodeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LISTOFCOUNTRYNAMESBYCODERESULT$0 = 
            new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfCountryNamesByCodeResult");
        
        
        /**
         * Gets the "ListOfCountryNamesByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName getListOfCountryNamesByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().find_element_user(LISTOFCOUNTRYNAMESBYCODERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ListOfCountryNamesByCodeResult" element
         */
        public void setListOfCountryNamesByCodeResult(org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName listOfCountryNamesByCodeResult)
        {
            generatedSetterHelperImpl(listOfCountryNamesByCodeResult, LISTOFCOUNTRYNAMESBYCODERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "ListOfCountryNamesByCodeResult" element
         */
        public org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName addNewListOfCountryNamesByCodeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName target = null;
                target = (org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName)get_store().add_element_user(LISTOFCOUNTRYNAMESBYCODERESULT$0);
                return target;
            }
        }
    }
}
