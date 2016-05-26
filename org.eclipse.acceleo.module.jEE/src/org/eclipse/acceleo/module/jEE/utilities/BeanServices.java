package org.eclipse.acceleo.module.jEE.utilities;

import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

public class BeanServices {

	public boolean hasStereotype(Class clazz, String stereotypeName) {
		List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
		for (Stereotype stereotype : stereotypes) {
			if (stereotype.getName().equals(stereotypeName)) {
				return true;
			}
		}
		return false;
	}
	
}
