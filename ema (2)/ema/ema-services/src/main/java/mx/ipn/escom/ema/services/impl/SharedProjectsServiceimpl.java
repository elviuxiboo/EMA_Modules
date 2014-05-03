package mx.ipn.escom.ema.services.impl;

import mx.ipn.escom.ema.model.entities.SharedProjects;
import mx.ipn.escom.ema.model.resources.DAO.SharedProjectsDAO;
import mx.ipn.escom.ema.model.resources.DAO.impl.SharedProjectsDAOimpl;
import mx.ipn.escom.ema.services.ShareProjectsService;

public class SharedProjectsServiceimpl implements ShareProjectsService{
	
	public void hazalgo(){
		SharedProjects sharedProject = new SharedProjects();
		SharedProjectsDAO sharedProjectsDAO = new SharedProjectsDAOimpl();
		
		
	}
	
	
	/*Compartir Proyecto
	 * public void shareProject(UserTO userTO, ProjectTO projectTO, UserTO userReceiver){
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * Projects project = new Projects();
	 * project.setName(projectTO.getName());
	 * 	SharedProjects sharedProject = new SharedProjects();
		SharedProjectsDAOimpl srd = new SharedProjectsDAOimpl();
		SharedProjects sharedProject = new SharedProjects();
		SharedProjectsDAO sharedProjectsDAO = new SharedProjectsDAOimpl();
		sharedProjectsDAO.shareProject(sharedResource, project, user);
		Users userReceiveProject = new Users();
		userReceiveProject.setUser(userReceiver.getUser());
		sharedProjectsDAO.addUsersReceivers(userReceiveProject, sharedResource);
		sharedProjectsDAO.addReferenceOfProjectReceived(sharedResource, userReceiveProject);
	 * }
	 * */
	
	/*Mostrar proyectos compartidos
	 * public List<ProjectTO> showSharedProjects(UserTO userTO){
	 * ProjectTO projectTO = null;
	 * List<ProjectTO> listSharedProjectTO = new ArrayList<ProjectTO>();
	 * 
	   SharedProjectsDAO sharedProjectsDAO = new SharedProjectsDAOimpl();
	   List<Projects> list = sharedProjectsDAO.showProjects(user);
	   for(int i=0; i< list.size(); i++){
	   	 Projects sharedProject = list.get(i);
	   	 projectTO.setName(sharedProject.getName());
	 * 	projectTO.setResources(projectResult.getResources());
	 * 	projectTO.setUser(projectResult.getUser());
	 * 	listSharedProjectTO.add(projectTO);
	   }
	   return listSharedProjectTO;
	 * }
	 * */

}
