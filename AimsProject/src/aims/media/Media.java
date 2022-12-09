package aims.media;

public abstract class Media {
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	
	
	
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



	public Media() {
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	    public abstract String toString();

	    public void printDetail() {
	        System.out.println(toString());
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (!(obj instanceof Media))
	            return false;
	        return this.id == ((Media) obj).id;
	    }

}
