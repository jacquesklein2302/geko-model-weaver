/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 ******************************************************************************/
package lu.uni.geko.common;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class GeKoAdapter {
	private static final SimpleMessageConsole CONSOLE = SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME);
	
	public static EObject getPointcutRootElementIfCorrectlyTyped(URI pointcutURI) {
		EObject rootObject = MainResourceLoader.getUniqueResourceContentRoot(pointcutURI, "pointcut model");
		if (rootObject != null) {
			if (rootObject.eClass().getName().equals(GeKoConstants.POINTCUT_MM_ROOT_ELEMENT_NAME)) {
				// FIXME MK check whether all requried dynamically introduced properties of the pointcut root element are present
				return rootObject;
			} else {
				CONSOLE.printErrorln("The root element of the pointcut model '" + pointcutURI + "' is not '" + GeKoConstants.POINTCUT_MM_ROOT_ELEMENT_NAME + "!");
			}
		}
		return null;
	}
	
	/**
	 * Gets all EObjects that are contained in the pointcut resource except for the elements that were introduced using the pointcut mm
	 * @param pointcutMURI
	 * @return
	 */
	public static Set<EObject> getPointcutElements(URI pointcutURI) {
		return getPointcutOrAdviceElements(pointcutURI, true);
	}
	
	/**
	 * Gets all EObjects that are contained in the advice resource except for the elements that were introduced using the advice mm
	 * @param adviceMURI
	 * @return
	 */
	public static Set<EObject> getAdviceElements(URI adviceURI) {
		return getPointcutOrAdviceElements(adviceURI, false);
	}
	
	private static Set<EObject> getPointcutOrAdviceElements(URI uri, boolean pointcut) {
		Set<EObject> resourceContentsSet = new HashSet<EObject>();
		Iterator<EObject> allResourceContentsIterator = MainResourceLoader.getAllContentsIterator(uri);
		while (allResourceContentsIterator.hasNext()) {
			EObject nextContent = allResourceContentsIterator.next();
			if (pointcut) {
				if (!skipPointcutElementForWeaving(nextContent)) {
					resourceContentsSet.add(nextContent);
				}
			} else {
				if (!skipAdviceElementForWeaving(nextContent)) {
					resourceContentsSet.add(nextContent);
				}
			}
		}
		return resourceContentsSet;
	}
	
	private static boolean skipPointcutElementForWeaving(EObject eObject) {
		String eObjectClassName = eObject.eClass().getInstanceClass().getSimpleName();
		if (eObjectClassName.equals(GeKoConstants.POINTCUT_MM_ROOT_ELEMENT_NAME)) {
			return true;
		} else {
			// FIXME MK implement the skipping of all pointcut specific elements for the weaving as soon as further elements and / or properties are introduced into the pointcut mm
			return false;
		}
	}
	
	public static boolean skipAdviceElementForWeaving(EObject eObject) {
		String eObjectClassName = eObject.eClass().getInstanceClass().getSimpleName();
		if (eObjectClassName.equals(GeKoConstants.ADVICE_MM_ROOT_ELEMENT_NAME)) {
			return true;
		} else if (eObjectClassName.equals(GeKoConstants.SCOPE_MM_GLOBAL_CLASS_NAME)) {
			return true;
		} else if (eObjectClassName.equals(GeKoConstants.SCOPE_MM_PER_JOIN_POINT_CLASS_NAME)) {
			return true;
		} else {
			// FIXME MK implement the skipping of all advice specific elements for the weaving as soon as further elements and / or properties are introduced into the advice mm
			return false;
		}
	}

	public static boolean isAdviceEObject(EObject eObject) {
		return eObject.eClass().getEPackage().getNsURI().endsWith(GeKoConstants.ADVICE_MM_PACKAGE_NSURI_APPENDAGE);
	}
}
