package arquillian;

import fr.unice.polytech.isa.tcf.entities.Customer;
import fr.unice.polytech.isa.tcf.utils.Database;
import org.jboss.arquillian.container.test.api.Deployment;
import fr.unice.polytech.isa.tcf.interceptors.Logger;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import fr.unice.polytech.isa.tcf.components.KitchenBean;
import fr.unice.polytech.isa.tcf.Tracker;

import javax.ejb.EJB;

public abstract class AbstractTCFTest {


	@EJB
	protected Database memory;

	@Deployment
	public static WebArchive createDeployment() {
		// Building a Web ARchive (WAR) containing the following elements:
		return ShrinkWrap.create(WebArchive.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				// Utils
				.addPackage(Database.class.getPackage())
				// Interceptors
				.addPackage(Logger.class.getPackage())
				// Entities
				.addPackage(Customer.class.getPackage())
				// Components Interface
				.addPackage(Tracker.class.getPackage())
				// Components Implementation
				.addPackage(KitchenBean.class.getPackage());
	}

}
