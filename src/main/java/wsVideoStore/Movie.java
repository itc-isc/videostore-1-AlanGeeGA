package wsVideoStore;

public abstract class Movie
{
	public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    private String title;
	private int dineros;

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}

	public int getPriceCode() {
		return dineros;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}