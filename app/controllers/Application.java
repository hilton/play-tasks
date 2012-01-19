package controllers;

import models.Task;
import play.data.validation.Valid;
import play.mvc.Controller;

import java.util.List;

public class Application extends Controller {

   public static void index() {
      final List<Task> tasks = Task.findAll();
      render(tasks);
   }

   public static void add(@Valid final Task task) {
      if (validation.hasErrors()) {
         validation.keep();
      }
      else {
         task.save();
      }
      index();
   }
   
   public static void delete(final Long id) {
      final Task task = Task.findById(id);
      task.delete();
      index();
   }

}