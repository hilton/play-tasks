package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * A human tasks, e.g. 'Get the presenter a beer'
 */
@Entity
public class Task extends Model {

   @Required
   public String title;
}
