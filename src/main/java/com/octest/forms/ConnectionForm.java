package com.octest.forms;

import jakarta.servlet.ServletRequest;

public class ConnectionForm {
	private String resultat;
	
	public void verifierIdentifiants(ServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if(pass.equals(login + "123")) {
			resultat = "Vous êtes bien connecté.";
		} else {
			resultat = "Identifiants incorrects.";
		}
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
}
