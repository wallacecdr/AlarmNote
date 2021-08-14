package model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Note.class)
public abstract class Note_ {

	public static volatile SingularAttribute<Note, String> name;
	public static volatile SingularAttribute<Note, Integer> alarm;
	public static volatile SingularAttribute<Note, String> description;
	public static volatile SingularAttribute<Note, Timestamp> dateTimeAlarm;
	public static volatile SingularAttribute<Note, Long> id;

	public static final String NAME = "name";
	public static final String ALARM = "alarm";
	public static final String DESCRIPTION = "description";
	public static final String DATE_TIME_ALARM = "dateTimeAlarm";
	public static final String ID = "id";

}

