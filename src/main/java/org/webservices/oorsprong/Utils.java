package org.webservices.oorsprong;

import org.webservices.oorsprong.ws.CountryInfoService;
import org.webservices.oorsprong.ws.CountryInfoServiceSoapType;
import org.webservices.oorsprong.ws.ObjectFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Utils {
    public static final String endpoint="http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    public static final URL url;

    static {
        try {
            url = URI.create(endpoint).toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static final CountryInfoService service = new CountryInfoService(url);
    public static final  CountryInfoServiceSoapType port = service.getPort(CountryInfoServiceSoapType.class);

    final ObjectFactory factory = new ObjectFactory();

    public Utils() {
    }

    public static void getCountryList()  {
        for (int i=0;i<port.listOfCountryNamesByName().tCountryCodeAndName.size();i++){
            System.out.println("Name: " + port.listOfCountryNamesByName().tCountryCodeAndName.get(i).getSName());
            System.out.println("Code: " + port.listOfCountryNamesByName().tCountryCodeAndName.get(i).getSISOCode());
            System.out.println("\t");
        }
    }

    public static void getCurrencyList() {
        for (int i=0;i<port.listOfCurrenciesByName().tCurrency.size();i++){
            System.out.println("Name: " + port.listOfCurrenciesByName().tCurrency.get(i).getSName());
            System.out.println("Code: " + port.listOfCurrenciesByName().tCurrency.get(i).getSISOCode());
            System.out.println("\t");
        }
    }

}
