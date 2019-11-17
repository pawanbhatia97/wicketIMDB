package com.vinsys.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;
import org.apache.wicket.model.Model;

public class HomePage extends BasePage{
	public HomePage(){
		
	}

	/*public HomePage(){
		JavascriptResourceReference resourceref=new JavascriptResourceReference("default.js");

		Label lable= new Label("hello_lable", "Hello lable");
		FeedbackPanel lableError= new FeedbackPanel("error");
				UserNameValidator userNameValidator=new UserNameValidator();
Link link= new Link("my_Link") {
	@Override
	public void onClick(){ 
		setResponsePage(Sucess.class);
	}
};
Form login= new Form<>("login_form");
Model userModel =new Model();
TextField textField= new TextField<>("username",userModel);
textField.add(userNameValidator);
Button submitButton= new Button("submit"){
	@Override
	public void onSubmit() {
	System.out.println("username   "+userModel.getObject());
setResponsePage(Sucess.class);
	}
};

login.add(submitButton);
login.add(textField);

add(login);
add(link);
add(lable);
add(lableError);
	}*/

}

