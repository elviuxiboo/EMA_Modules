package mx.ipn.escom.ema.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import mx.ipn.escom.ema.model.attributes.DAO.impl.AttributesDAOimpl;
import mx.ipn.escom.ema.model.entities.Attributes;
import mx.ipn.escom.ema.model.entities.CSSResources;
import mx.ipn.escom.ema.model.entities.HTMLResources;
import mx.ipn.escom.ema.model.entities.Projects;
import mx.ipn.escom.ema.model.entities.Resources;
import mx.ipn.escom.ema.model.entities.SharedResources;
import mx.ipn.escom.ema.model.entities.Tags;
import mx.ipn.escom.ema.model.entities.Users;
import mx.ipn.escom.ema.model.persistence.EMFService;
import mx.ipn.escom.ema.model.projects.DAO.ProjectsDAO;
import mx.ipn.escom.ema.model.projects.DAO.impl.ProjectsDAOimpl;
import mx.ipn.escom.ema.model.resources.DAO.ResourceDAOcss;
import mx.ipn.escom.ema.model.resources.DAO.ResourceDAOhtml;
import mx.ipn.escom.ema.model.resources.DAO.SharedResourcesDAO;
import mx.ipn.escom.ema.model.resources.DAO.impl.CSSResourcesDAOimpl;
import mx.ipn.escom.ema.model.resources.DAO.impl.HTMLResourcesDAOimpl;
import mx.ipn.escom.ema.model.resources.DAO.impl.ResourcesDAOimpl;
import mx.ipn.escom.ema.model.resources.DAO.impl.SharedResourcesDAOimpl;
import mx.ipn.escom.ema.model.tags.DAO.impl.TagsDAOimpl;
import mx.ipn.escom.ema.model.user.DAO.UsersDAO;
import mx.ipn.escom.ema.model.user.DAO.impl.UserDAOimpl;

public class PruebaServlet extends HttpServlet{
	@Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp)
	      throws IOException {
		PrintWriter pw = resp.getWriter();
/*		Date date = new Date();
		Projects project = new Projects();
		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
		Resources resource = new Resources();
		ResourcesDAOimpl rdi = new ResourcesDAOimpl();
		CSSResources css = new CSSResources();
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		project.setName("Prueba Proyecto");
		project.setEmail("andy");
		project.setDate(date);
		pdi.addProject(project);
	//	resource.setProject(findProject);
		rdi.addResource(resource);

		/*Prueba para hacer el metodo de agregar la referencia del resource al proyecto
		EntityManager em = EMFService.get().createEntityManager();
		com.google.appengine.api.datastore.Key keyProject = KeyFactory.createKey(Projects.class.getSimpleName(), project.getId());
		Projects findProject = em.find(Projects.class, keyProject );
		Resources findResource = em.find(Resources.class, resource.getId());
		List<Resources> listResources = new ArrayList<Resources>();
		listResources.add(findResource);
		findProject.setResources(listResources);
		pdi.addProject(findProject);
		System.out.println(findProject.getName());*/
		
/*	
 * Prueba para agregar recurso  CSS
 * 	css.setName("prueba Julio");
		css.setCode("<h1> hola </h1>");
		css.setDate(date);
		css.setResource(resource);
		crdi.addResourceCSS(css);*/
		
		
		
 /* Prueba de todos los mÃ©todos para agregar proyecto, recurso y recurso css y html y sus referencias respectivamente
		Date date = new Date();
		Users user = new Users();
		UserDAOimpl usi = new UserDAOimpl();
		Projects project = new Projects();
		//Projects projectresult = new Projects();
		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
		Resources resource = new Resources();
		ResourcesDAOimpl rdi = new ResourcesDAOimpl();
		CSSResources css = new CSSResources();
		CSSResources cssresult = new CSSResources();
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		HTMLResources html = new HTMLResources();
		HTMLResourcesDAOimpl hrdi = new HTMLResourcesDAOimpl();
		user.setUser("eandrea.gdiaz@gmail.com");
		user.setName("andrea");
		usi.addUser(user);
		project.setName("Proyecto Prueba");
		//project.setUser(user);
		project.setDate(date);
		pdi.addProject(project);
		usi.addProject(project, user);
		pdi.addReferenceOfUser(user, project);
	//	CSSResources css = new CSSResources();	
		rdi.addResource(resource);
		pdi.addResourcetoProjectTest(resource, project);
		css.setName("css");
		css.setDate(date);
		css.setCode("dkierire");
		crdi.addResourceCSS(css);
		html.setName("html");
		html.setCode("jdjuyu3");
		html.setDate(date);
		hrdi.addResourcehtml(html);
		rdi.addReferenceOfProject(project, resource);
		rdi.addReferenceOfCSS(css, resource);
		crdi.addReferencetoResource(resource, css);
		rdi.addReferenceOfHTML(html, resource);
		hrdi.addReferencetoResource(resource, html);
		
		//Prueba para agregar referencias y hacer el mÃ©todo (ya esta en el DAO)
	/*	EntityManager em = EMFService.get().createEntityManager();
		com.google.appengine.api.datastore.Key keyCSS = KeyFactory.createKey(CSSResources.class.getSimpleName(), css.getId());
		cssresult = em.find(CSSResources.class, keyCSS);
		Resources findResource = em.find(Resources.class, resource.getId());
		findResource.setCssrec(keyCSS);
		em.persist(findResource);
		em.close();
		//Prueba para agregar referencias y hacer el mÃ©todo (ya esta en el DAO)
	/*	Resources findResource = em.find(Resources.class, resource.getId());
		List<Resources> listResources = new ArrayList<Resources>();
		listResources.add(findResource);
		System.out.println(findResource.getId());
		com.google.appengine.api.datastore.Key keyProject = KeyFactory.createKey(Projects.class.getSimpleName(), project.getId());
		System.out.println(keyProject);
		projectresult = em.find(Projects.class, keyProject);
		System.out.println(projectresult.getId());
		projectresult.getResources().add(findResource.getId());
		em.persist(projectresult);
		cssresult = em.find(CSSResources.class, css.getId());
		findResource.setCssrec(cssresult);
		em.persist(findResource);*/
	
	//	resource.setProject(findProject);

		//Prueba para sacar el recurso guardado en el proyecto
/*		Projects project = new Projects();
		List<com.google.appengine.api.datastore.Key> listResources;
		List<CSSResources> listResourcesCSS = null;
		Resources resource = new Resources();
		String resultado = null;
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select e from Projects e where e.name= :name");
		q.setParameter("name", "Prueba Proyecto");
		project = (Projects)q.getSingleResult();	
		System.out.println(project);
		listResources = project.getResources();
		for(int i = 0; i<listResources.size(); i++){
			com.google.appengine.api.datastore.Key keyResource = listResources.get(i);
			Resources resourceResult = em.find(Resources.class, keyResource);
			System.out.println(keyResource);
			System.out.println(resourceResult);
		//System.out.println(listResources);
		}*/
		
/*		
 * 	/Prueba para sacar el recurso CSS del proyecto (el metodo ya se hizo en el dao)
 * 		ResourcesDAOimpl rdi = new ResourcesDAOimpl();
		Resources resource = rdi.findResourceFromProject("Prueba Proyecto");
		System.out.println(resource);
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select e from CSSResources e where e.resource= :resource");
		q.setParameter("resource", resource.getId());
		CSSResources css = (CSSResources) q.getSingleResult();
		System.out.println(css.getName());*/
		
	/*	
	 * Regresa el recurso css del proyecto buscado arriba
	 * 
	 * CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		crdi.ResourcesCssFromProject("Prueba Proyecto");*/
		
	/*	
	 * Agregar Atributo
	 * 
	 * Attributes attribute = new Attributes();
		AttributesDAOimpl adi = new AttributesDAOimpl();
		attribute.setName("href");
		attribute.setDescription("Documento base del URL");
		adi.addAttribute(attribute);
		Attributes attribute2 = new Attributes();
		attribute2.setName("abbr");
		attribute2.setDescription("Abreviatura de celda de cabecera");
		adi.addAttribute(attribute2);*/
		
		
	/*	
	 * Agrega etiqueta
	 * Tags tag = new Tags();
		TagsDAOimpl tdi = new TagsDAOimpl();
		tag.setName("html");
		tag.setDescription("Raiz del documento HTML O XHTML. Todos los demas elementos deben estar debajo de este elemento");
		tdi.addTag(tag);*/
		
	/*	
	 * Regresa el nombre del atributo
	 * TagsDAOimpl tdi = new TagsDAOimpl();
		AttributesDAOimpl adi = new AttributesDAOimpl();
		tdi.addAttributeToTag("html", "href");
		adi.addTagToAttribute("html", "href");
		List<com.google.appengine.api.datastore.Key> list = tdi.getAttributes("html");
		List<String> list = adi.attributesName("html");
		System.out.println(list);*/
		
	/*	
	 * Prueba para modificar proyecto
	 * ProjectsDAOimpl pdi = new ProjectsDAOimpl();
		pdi.updateProject("Prueba Proyecto", "Cambiando Nombre", "eandrea.gdiaz@gmail.com");*/
/*		
 * Prueba para buscar proyecto */
/*  Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
		Projects projectResult = pdi.findProject(project, user);
		System.out.println(projectResult);*/
		
/*Prueba para sacar la lista de recursos de los proyectos	
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		ResourcesDAOimpl rdi = new ResourcesDAOimpl();
		List<com.google.appengine.api.datastore.Key> listResources = rdi.findResourceListFromProject(project);
		System.out.println(listResources);*/

/*Prueba para obtener el id del recurso css
		
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		CSSResources css = new CSSResources();
		css.setName("css");
		System.out.println(crdi.findCSSofProject(css, project));*/

/*Prueba para cambiar nombre del css*
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		CSSResources css = new CSSResources();
		css.setName("cambio nombre css buscando usuario");
		crdi.modifyName(css, project, user, "cambio nombre con dos id");*/
	
		
		/*Prueba para cambiar codio
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		CSSResources css = new CSSResources();
		css.setName("probando que entre 1");
		//crdi.findCSSofProject(css, project);
		crdi.updateResourceCSS(css, project, user, "<h1>hola</h1>");*/
		
		/*Prueba para agregar CSS a proyecto existente
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		CSSResources css = new CSSResources();
		//Resources resource = new Resources();
/*		ResourcesDAOimpl rdi = new ResourcesDAOimpl();
		css.setName("cambio nombre con dos id");
		css.setCode("<h1>holis</h1>");
		crdi.addResourceCSStoProject(css, project, user);
		
		CSSResources css2 = new CSSResources();
		css2.setName("probando que entre 1");
		css2.setCode("<h1>holis</h1>");
		crdi.addResourceCSStoProject(css2, project, user);
		

		CSSResources css3 = new CSSResources();
		css3.setName("probando que entre 2");
		css3.setCode("<h1>holis</h1>");
		crdi.addResourceCSStoProject(css3, project, user);
		
		CSSResources css4 = new CSSResources();
		css4.setName("probando que entre 3");
		css4.setCode("<h1>holis</h1>");
		crdi.addResourceCSStoProject(css, project, user);
		
		/*Prueba para eliminar CSS
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		CSSResources css = new CSSResources();
		css.setName("cambio nombre con dos id");
		crdi.deleteResourceCSS(css, project, user);*/
		
		/*Prueba para eliminar los resources que sobraban del proyecto
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
		pdi.deleteCSSfromProjectTest(project, user);*/
		
	/*	Prueba de obtener recurso del proyecto con usuario
	 * Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		ResourcesDAOimpl rdi = new ResourcesDAOimpl();
		List<com.google.appengine.api.datastore.Key> resource = rdi.findResourceListFromUserProject(project, user);
		System.out.println(resource);*/
		
		/*Muestra recursos css del usuario en el proyecto*
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		List<CSSResources> listResources = crdi.showCSSResourcesFromProject(project, user);
		for(int i=0; i<listResources.size(); i++){
			CSSResources css = listResources.get(i);
			System.out.println(css.getName());
		}*/
	/*	
	 * Prueba para eliminar recurso del proyecto
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto");
		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		CSSResources css3 = new CSSResources();
		css3.setName("probando que entre 2");
		crdi.deleteResourceCSS(css3, project, user);*/
		
		/*Prueba para eliminar proyecto
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		UserDAOimpl udi = new UserDAOimpl();
		udi.deleteUser(user);
	/*	Projects project = new Projects();
		project.setName("Prueba Proyecto 2");
		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
		pdi.addProject(project);
		udi.addProject(project, user);
		pdi.addReferenceOfUser(user, project);
		pdi.deleteProject(user, project);*/
		
/*		Date date = new Date();
		Users user = new Users();
		UserDAOimpl usi = new UserDAOimpl();
		user.setUser("eandrea.gdiaz@gmail.com");
//		usi.deleteUser(user);
//		user.setName("andrea");
//		usi.addUser(user);
		Projects project = new Projects();
		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
/*		List<Projects> list = pdi.showProjects(user);
		System.out.println(list);*/
//		project.setName("Prueba Proyecto 3");
//		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
	//	pdi.addProject(project);
	//	pdi.addReferenceOfUser(user, project);
	//	usi.addProject(project, user);
		
/*		CSSResourcesDAOimpl crdi = new CSSResourcesDAOimpl();
		CSSResources css2 = new CSSResources();
		css2.setName("probando que entre 2 en proyecto 2");
		CSSResources cssResult = crdi.findCSSofProjectofUser(css2, project, user);		
/*		css2.setCode("<h1>holis</h1>");
		crdi.addResourceCSStoProject(css2, project, user);*/
/*		HTMLResourcesDAOimpl hrdi = new HTMLResourcesDAOimpl();
/*		HTMLResources html = new HTMLResources();
		html.setName("html 1");
		html.setCode("jdkkjer");
		html.setDate(date);
		hrdi.addResourceHTMLtoProject(html, project, user);*/
/*		List<HTMLResources> list = hrdi.showHTMLResourcesFromProject(project, user);
		for(int i=0; i<list.size(); i++){
			HTMLResources html = new HTMLResources();
			html = list.get(i);
			System.out.println(html.getName());
		}
		pw.println("agregado");
		
/*		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Upload Test</title>");
		pw.println("</head>");
		pw.println(" <body>");
		pw.println(" <form action="+"<%= blobstoreService.createUploadUrl('/upload') %>" + "method='post' enctype='multipart/form-data'>");
		pw.println();
		pw.println("<input type='text' name='foo'>");
		pw.println(" <input type='file' name='myFile'>");
		pw.println("<input type='submit' value='Submit'>");
		pw.println(" </form>");
		pw.println("</body>");
		pw.println("</html>");*/
		
		//SharedResources sharedResource = new SharedResources();
/*		Users user = new Users();
		UserDAOimpl usi = new UserDAOimpl();
		user.setUser("eandrea.gdiaz@gmail.com");
		Projects project = new Projects();
		project.setName("Prueba Proyecto 3");
		SharedResources sharedResource = new SharedResources();
		SharedResourcesDAOimpl srd = new SharedResourcesDAOimpl();
		System.out.println(project.getId());
		srd.shareResource(sharedResource, project, user);^*/
/*		Users userReceiver = new Users();
		userReceiver.setUser("eandrea.gdiaz@gmail.com");
		SharedResourcesDAOimpl srd = new SharedResourcesDAOimpl();
/*		srd.addUsersReceivers(userReceiver, sharedResource);
		srd.addReferenceOfProjectReceived(sharedResource, userReceiver);
/*		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		SharedResourcesDAOimpl srd = new SharedResourcesDAOimpl();*/
/*		List<Projects> sharedResourcesList = srd.showProjects(userReceiver);
		for(int i =0; i<sharedResourcesList.size(); i++){
			Projects projectp =sharedResourcesList.get(i); 
			System.out.println(projectp.getName());
		}
	/*	HTMLResourcesDAOimpl hrdi = new HTMLResourcesDAOimpl();
		ProjectsDAOimpl pdi = new ProjectsDAOimpl();
		List<Projects> listProjects = srd.showProjects(user);
		for(int i =0; i<listProjects.size(); i++){
			Projects projectResult = listProjects.get(i);
			System.out.println(projectResult.getId());
			Key userKey = projectResult.getUser();
			Users userProject = new Users();
			EntityManager em = EMFService.get().createEntityManager();
			userProject = em.find(Users.class, userKey);
			Projects result = pdi.findProject(projectResult, userProject);
			List<HTMLResources> listHtml = hrdi.showHTMLResourcesFromProject(result, userProject);
			System.out.println(listHtml);
		}*/
		
/*		Projects projectResult = srd.returnProject(user);
		System.out.println(projectResult);*/
		
/*		ProjectsDAO projectsDAO = new ProjectsDAOimpl();
		Date date = new Date();*/
		Users user = new Users();
		user.setUser("eandrea.gdiaz@gmail.com");
		UsersDAO userDAO = new UserDAOimpl();
		//userDAO.validateUser(user);
		Projects project = new Projects();
		project.setName("Prueba Proyecto 3");
	/*	project.setDate(date);
		projectsDAO.validateProject(project, user);*/
		HTMLResources html = new HTMLResources();
		html.setName("html 2");
		ResourceDAOhtml resourceDAOhtml = new HTMLResourcesDAOimpl();
		resourceDAOhtml.existingHTMLinProject(html, project, user);
		
	}
	
}
