package osgitranslatorservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.training.domain.HindiTranslator;
import com.training.ifaces.TranslatorService;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		TranslatorService service = new HindiTranslator();
		context.registerService(TranslatorService.class,service, null);
		System.out.println("Service Started");
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
