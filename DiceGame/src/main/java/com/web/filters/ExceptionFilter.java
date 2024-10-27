package com.web.filters;

//import com.bo.Message;
import com.bo.Messages;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebFilter("/*")
public class ExceptionFilter extends HttpFilter {
	Logger LOGGER = Logger.getLogger(getClass());

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		LOGGER.debug("Execution du filtre ExceptionFilter");
		try {

			chain.doFilter(request, response);

		} catch (Exception e) {
			LOGGER.debug("Erreur gérée par le filtre. Cause de l'exception :" + e.getMessage(), e);
			List<Messages> list = new ArrayList<>();
			list.add(new Messages("Une erreur est survenue veuillez consulter le fichier journal pour plus de détails",
					Messages.ERROR));
			request.setAttribute("msg", list);
			getServletContext().getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);

		}
	}

}
