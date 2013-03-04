/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.keaddonexample.page.controller;

import org.openmrs.Patient;
import org.openmrs.module.appframework.AppUiUtil;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.ui.framework.page.PageModel;
import org.openmrs.ui.framework.session.Session;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Home page controller
 */
public class HomePageController {
	
	public void controller(@RequestParam(required=false, value="patientId") Patient patient, Session session, PageModel model, UiUtils ui) {

		AppUiUtil.startApp("keaddonexample.example", session);
	}
}