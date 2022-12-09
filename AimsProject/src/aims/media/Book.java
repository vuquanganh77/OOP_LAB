package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public void addAuthor(String authorName) {
		for(int i=0; i<authors.size(); i++) {
			if( authors.contains(authorName)) {
				System.out.println("Author already existed");
				System.exit(0);
			}
		}
		authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		for(int i=0; i<authors.size(); i++) {
			if(!authors.contains(authorName)) {
				System.out.println("Author is not existed");
				System.exit(0);
			}
		}
		authors.remove(authorName);
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

}
