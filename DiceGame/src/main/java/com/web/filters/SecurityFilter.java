package com.web.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Filtre permettant de vérifier si un utilisateur est déjé authentifié
 * 
 * @author T.BOUDAA
 *

 */


@WebFilter("/back/*")
public class SecurityFilter implements Filter {

	/** la vue d'authentification */
	private static final String CONNEXION_PAGE = "/WEB-INF/login.jsp";

	private final Logger LOGGER;

	public SecurityFilter() {
		LOGGER = Logger.getLogger(SecurityFilter.class);
	}



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		LOGGER.debug("Le filtre de sécurité commence son travail ici ... ");

	
		HttpServletRequest rq = (HttpServletRequest) request;
		HttpSession session = rq.getSession();

		if (session.getAttribute("user") == null) {
			rq.getRequestDispatcher(CONNEXION_PAGE).forward(request, response);
			return;

		} else {

			chain.doFilter(request, response);

		}

	}

}
