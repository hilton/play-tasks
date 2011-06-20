package models;

import javax.persistence.Entity;

@Entity
public class Task extends play.db.jpa.Model {

	public String title;
	public boolean done;

	public Task(final String title) {
		this.title = title;
	}
}
