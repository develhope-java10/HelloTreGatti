package co.devlhope.HelloTreGatti;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Word {
	@Id
	@GeneratedValue
	private String id;
	private String displayText;
	private String description;
	
	public Word(String id, String displayText, String description) {
		this.id = id;
		this.displayText = displayText;
		this.description = description;
	}
	
	public Word() {
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDisplayText() {
		return displayText;
	}
	
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
