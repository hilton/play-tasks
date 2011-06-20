package controllers;

import java.util.List;

import models.Task;
import play.data.validation.Required;
import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		final List tasks = Task.findAll();
		render(tasks);
	}

	public static void add(@Required final String title) {
		if (validation.hasErrors()) {
			validation.keep();
			index();
		}

		new Task(title).save();
		index();
	}

	public static void delete(final Long id) {
		final Task task = Task.findById(id);
		task.delete();
		index();
	}
}