import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(),
					customer.lastName.toUpperCase(), Integer.parseInt(customer.birthYear));
		} catch (NumberFormatException e) {
			System.out.println("format");
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("remote");
			e.printStackTrace();
		}
		finally 
		{
			return result;
		}
	}
}
