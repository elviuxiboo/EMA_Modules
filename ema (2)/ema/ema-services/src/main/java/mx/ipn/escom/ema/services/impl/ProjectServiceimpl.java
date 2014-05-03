package mx.ipn.escom.ema.services.impl;

import mx.ipn.escom.ema.model.projects.DAO.ProjectsDAO;
import mx.ipn.escom.ema.model.projects.DAO.impl.ProjectsDAOimpl;
import mx.ipn.escom.ema.model.user.DAO.UsersDAO;
import mx.ipn.escom.ema.model.user.DAO.impl.UserDAOimpl;
import mx.ipn.escom.ema.services.ProjectsService;

public class ProjectServiceimpl implements ProjectsService{

	/*
	 * Agregar proyecto
	 * public void addProject(ProjectTO projectTO, UserTO userTO){
	 * Projects project = new Projects();
	 * projects.setName(projectTO.getName());
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * UsersDAO userDAO = new UserDAOimpl();
	 * ProjectsDAO projectDAO = new ProjectsDAOimpl();
	 * projectDAO.validateProject(project, user);
	 * userDAO.addProject(project, user);
	 * }
	 * */
	
	/*
	 * Eliminar proyecto
	 * public void deleteProject(ProjectTO projectTO, UserTO userTO){
	 * Projects project = new Projects();
	 * projects.setName(projectTO.getName());
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * projectDAO.deleteProject(user, project);
	 * }
	 * */
	
	/*
	 * Actualizar proyecto
	 * public ProjectTO updateProject(ProjectTO projectTO, UserTO userTO, String newName){
	 * Projects project = new Projects();
	 * project.setName(projectTO.getName());
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * projectDAO.updateProject(project, newName, user);
	 * }
	 * */
	
	/*
	 * Mostrar todos los proyectos del usuario
	 * public List<ProjectTO> showProjects(UserTO userTO){
	 * Users user = new Users();
	 * user.setUser(userTO.getUser());
	 * List<Long> projectsKey = new ArrayList<Key>();
	 * List<ProjectTO> projects = new ArrayList<ProjectTO>();
	 * ProjectTO projectTO = null:
	 * projectsKey = projectDAO.showProjects(user);
	 * for(int i =0; i< projects.size(); i++){
	 * 	Projects projectResult = projects.get(i);
	 * 	projectTO.setName(projectResult.getName());
	 * 	projectTO.setResources(projectResult.getResources());
	 * 	projectTO.setUser(projectResult.getUser());
	 * 	projects.add(projectTO);
	 * }
	 * return projects;
	 * }
	 * */
}
