package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user",schema="control")
public class User extends Model {

    @Id
    private Long id;
    public String username;
    public String password;
    public String firstname;
    public String lastname;
    public String email;
    public Date created_date;
    public Boolean active;
//
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.TABLE, generator="control.recipe_seq")
//    @Column(name="id")
//    public Long getId() {
//        return id;
//    }

}
