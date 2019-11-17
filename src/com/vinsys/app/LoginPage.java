package com.vinsys.app;

import org.apache.wicket.Page;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow.PageCreator;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class LoginPage extends BasePage	 {
public LoginPage() {
	ModalWindow helpWinow =new ModalWindow("help");
	helpWinow.setTitle(new Model("Help"));
	helpWinow.setPageCreator(new PageCreator() {
		
		@Override
		public Page createPage() {
			// TODO Auto-generated method stub
			return new Help();
		}
	});
	helpWinow.setOutputMarkupId(true);
	AjaxLink helpAjax=new AjaxLink("help_link") {

		@Override
		public void onClick(AjaxRequestTarget target) {
			// TODO Auto-generated method stub
			helpWinow.show(target);
			
		}
	};
	
	User user=new User();
	FeedbackPanel feedbackPanel= new FeedbackPanel("errormsg");
	Form loginform = new Form<>("loginform");
 Label username = new Label("uname","username");
 Label password = new Label("password","password");
 TextField utext= new TextField<>("userid",new PropertyModel<>(user, "userid"));
 utext.setRequired(true);
 utext.add(new UserValidator());
 PasswordTextField passwordText = new PasswordTextField("passcode",new PropertyModel<>(user, "passcode"));
 passwordText.setRequired(true);
 Button sbutton = new Button("Submit"){
	 @Override
	public void onSubmit() {
		super.onSubmit();
getApplication().getSessionStore().setAttribute(getRequest(), "loggedin", "loggedin");
System.out.println(user.getUsername()+"            ------------------"+user.getPassword());
	 setResponsePage(HomePage.class);
	 }
 };
 
//Data Table
 IColumn[] collumns= new IColumn[2];
 collumns[0]=new PropertyColumn<>(new Model("username"), "username", "username");
 collumns[1]=new PropertyColumn<>(new Model("password"), "password", "password");
 DefaultDataTable table= new DefaultDataTable<>("dataTable", collumns, new UserDataProvider(), 10);
 
 add(table);
 loginform.add(username);
 loginform.add(password);
 loginform.add(utext);
 loginform.add(passwordText);
 loginform.add(sbutton);
 add(feedbackPanel);
 add(loginform);
 add(helpWinow);
 add(helpAjax); 
}
}
