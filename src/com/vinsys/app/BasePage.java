package com.vinsys.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public abstract class BasePage extends WebPage {

	public BasePage() {
		Link movieLink = new Link("movies") {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				setResponsePage(MoviesPage.class);
			}

		};

		Link telivisionLink = new Link("telivision") {

			@Override
			public void onClick() {
				setResponsePage(Telivisionpage.class);


			}

		};
		Link eventLink = new Link("events") {

			@Override
			public void onClick() {
				setResponsePage(EventsPage.class);

			}

		};
		Link homelink = new Link("home") {

			@Override
			public void onClick() {
				setResponsePage(HomePage.class);

			}

		};
		Link loginlink = new Link("loginlink") {

			@Override
			public void onClick() {
				setResponsePage(LoginPage.class);

			}

		};
		add(loginlink);
		add(homelink);
		add(telivisionLink);
		add(movieLink);
		add(eventLink);

	}

}
