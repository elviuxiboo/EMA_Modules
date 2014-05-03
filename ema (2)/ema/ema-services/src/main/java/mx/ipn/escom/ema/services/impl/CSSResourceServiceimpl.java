package mx.ipn.escom.ema.services.impl;

import mx.ipn.escom.ema.model.resources.DAO.ResourceDAOcss;
import mx.ipn.escom.ema.model.resources.DAO.impl.CSSResourcesDAOimpl;
import mx.ipn.escom.ema.services.CSSResourceService;

public class CSSResourceServiceimpl implements CSSResourceService{
	
	public void hazAlgo(){
		ResourceDAOcss resourceDAOcss = new CSSResourcesDAOimpl();
		
		
	}
	
	/*Agregar css
	 * public void addCSS(CSSTO cssTO, ProjectTO projectTO, UserTO userTO){
	 * Date date = new Date();
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * Projects project = new Projects();
	 * project.setName(projectTO.getName());
	 * CSSResources css = new CSSResources();
	 * css.setName(cssTO.getName());
	 * css.setDate(date);
	 * ResourceDAOcss resourceDAOcss = new CSSResourcesDAOimpl();
	 * resourceDAOcss.existingCSSinProject(css, project, user);
	 * }
	 * */
	
	/*Eliminar css
	 * public void deleteCSS(CSSTO cssTO, ProjectTO projectTO, UserTO userTO){
	 * Date date = new Date();
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * Projects project = new Projects();
	 * project.setName(projectTO.getName());
	 * CSSResources css = new CSSResources();
	 * css.setName(cssTO.getName());
	 * ResourceDAOcss resourceDAOcss = new CSSResourcesDAOimpl();
	   resourceDAOcss.deleteResourceCSS(css, project, user);
	 * }
	 * */
	
	/*
	 * Mostrar recursos css de proyecto
	 * public List<CSSTO> showCSSResources(ProjectTO projectTO, UserTO userTO){
	 * ResourceDAOcss cssDAO = new CSSResourcesDAOimpl();
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * Projects project = new Projects();
	 * project.setName(projectTO.getProject());
	 * List<CSSTO> listCSSTO = new ArrayList<CSSTO>();
	 * List<CSSResources> listResources = new ArrayList<CSSResources>();
	 * CSSTO cssTO = null;
	 * listResources = resourceDAOcss.showCSSResourcesFromProject(project, user);
	 * 	for(int i =0; i<listResources.size(); i++){
	 * 	CSSResources css = listResources.get(i);
	 * 	cssTO.setName(css.getName());
	 * 	cssTO.setCode(css.getCode());
	 * 	cssTO.setDate(css.getDate());
	 * 	listCSSTO.add(cssTO);
	 * 	}
	 * return listCSSTO;
	 * }
	 * */
	
	/*Actualizar css
	 * public void updateCSS(CSSTO cssTO, ProjectTO projectTO, UserTO userTO, String newCode){
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * Projects project = new Projects();
	 * project.setName(projectTO.getName());
	 * CSSResources css = new CSSResources();
	 * css.setName(cssTO.getName());
	 * resourceDAOcss.updateResourceCSS(css, project, user, newCode);
	 * }
	 * */

}
