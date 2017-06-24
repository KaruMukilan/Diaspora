package com.niit.diaspora.config;
import javax.servlet.Filter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.niit.diaspora.filter.CORSFilter;
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
        @Override
        protected Filter[] getServletFilters() {
    	        Filter [] filters = {new CORSFilter()};
    	        return filters;
        }
} 