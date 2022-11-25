package aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public String getTitle() {
        return title;
    }
    
    public boolean isMatch(String title){
        return this.title.equalsIgnoreCase(title);
    }
    
    public String printDetail(){
		return(getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $");
	}


    public void setTitle(String title) {
		this.title = title;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategory(String category) {
		this.category = category;
	}




	public void setDirector(String director) {
		this.director = director;
	}




	public void setLength(int length) {
		this.length = length;
	}




	public void setCost(float cost) {
		this.cost = cost;
	}




	public String getCategory() {
        return category;
    }


    public String getDirector() {
        return director;
    }


    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
    }

    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String title, String category, float cost) {
    	this(title);
        this.category = category;
        this.cost = cost;;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
    	this(title, category, cost);
        this.director = director;
    }


    public void print_Details() {
        System.out.println("Name " + this.getTitle());
        System.out.println("Category " + this.getCategory());
        System.out.println("Director " + this.getDirector());
        System.out.println("Length " + this.getLength());
        System.out.println("Cost " + this.getCost());
        System.out.println("-----------------------------");
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	this(title, category, director, cost);
        this.length = length;
    }
}
