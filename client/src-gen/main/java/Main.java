import services.FacadeImpl;
import services.FacadeImplService;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        FacadeImplService service = new FacadeImplService();
        FacadeImpl proxy = service.getFacadeImplPort();
        System.out.println("liste : "+proxy.getAllNom());
        try {
            URL url = new URL("http://localhost:9191/annuaire?wsdl");
            FacadeImplService serviceWithUrl =
                    new FacadeImplService(url, new QName("http://service/","FacadeImplService"));
            FacadeImpl servicePortWithUrl = serviceWithUrl.getFacadeImplPort();
            System.out.println(servicePortWithUrl.getAllNom());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
