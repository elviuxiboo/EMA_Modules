package mx.ipn.escom.ema.services;

import java.util.List;

import mx.ipn.escom.ema.to.HTMLResourceTO;
import mx.ipn.escom.ema.to.ProjectsTO;
import mx.ipn.escom.ema.to.UsersTO;

public interface HTMLResourceService {

	/*Agregar html*/
	 public void addHTML(HTMLResourceTO htmlTO, ProjectsTO projectTO, UsersTO userTO);
	 
	
	/*Eliminar html*/
	  public void deleteHTML(HTMLResourceTO htmlTO, ProjectsTO projectTO, UsersTO userTO);
	 
	
	/*
	 * Mostrar htmls de proyecto*/
	  public List<HTMLResourceTO> showHTMLResources(ProjectsTO projectTO, UsersTO userTO);
	 

	/*Actualizar html*/
	 public void updateHTML(HTMLResourceTO htmlTO, ProjectsTO projectTO, UsersTO userTO, String newCode);
	 
	
	
}
