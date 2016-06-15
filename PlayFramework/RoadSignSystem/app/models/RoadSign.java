package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class RoadSign extends Model {
	
	@Column(length=50, name="rs_name", nullable=false, unique=true)
	private String name;
	
	@Lob
	@Column(length=500, name="rs_description", nullable=true)
	private String description;
	
	private Blob image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}
    
}
