package org.mines.douai.tpj2ee.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class I18nYellowJacket extends TagSupport {
	
	private String language;
	private String key;

	public I18nYellowJacket() {
	}

	public String getLanguage() {
		return language;
	}
	public void setLanguage(String format) {
		this.language = format;
	}
	
	public String getKey() {
		return this.key;
	}
	public void setKey(String format) {
		this.key = format;
	}

	public int doStartTag() throws JspException {
		
		if (this.getLanguage()==null) {
			this.setLanguage("Francais");
		}
		if (this.getKey()==null) {
			this.setKey("France");
		}
		
		try {
			if(this.getLanguage().equals("English")) {
				switch(this.getKey()) {
					case "France":
						this.setKey("French");
						break;
					case "Allemagne":
						this.setKey("Germany");
						break;
					case "Pologne":
						this.setKey("Poland");
						break;
					default:
						break;
				}
			}
			pageContext.getOut().println (this.key);
		} catch (IOException e) {
			throw new JspException ("I/O Error", e);
		}
		return SKIP_BODY;
	}

}
