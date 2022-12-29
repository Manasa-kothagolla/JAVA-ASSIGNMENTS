package manasaCareerTuner;
abstract class Item {
private int identificationnumber;
private String title;
private int numberofcopies;

public Item(int identificationnumber, String title, int numberofcopies) {
	super();
	this.identificationnumber = identificationnumber;
	this.title = title;
	this.numberofcopies = numberofcopies;
}
public int getIdentificationnumber() {
	return identificationnumber;
}
public void setIdentificationnumber(int identificationnumber) {
	this.identificationnumber = identificationnumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNumberofcopies() {
	return numberofcopies;
}
public void setNumberofcopies(int numberofcopies) {
	this.numberofcopies = numberofcopies;
}
public void checkIn() {
	numberofcopies = numberofcopies + 1;
}

public void checkOut() {
	numberofcopies = numberofcopies - 1;
}

public void addItem(int idNum, String str, int n) {
	setIdentificationnumber(idNum);
	setTitle(str);
	setNumberofcopies(n);
}

public void print() {
	System.out.println("Title: " + title);
	System.out.println("ID: " +identificationnumber);
	System.out.println("Number of copies: " + numberofcopies);
}

}
abstract class WrittenItem extends Item {
	public WrittenItem(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}
	private String Author;
	private String Publication;

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublication() {
		return Publication;
	}

	public void setPublication(String publication) {
		Publication = publication;
	}
}


class Book extends WrittenItem {

	public Book(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getPublishedYear()=" + getPublication() + ", toString()="
				+ super.toString() + ", getId_number()=" + getIdentificationnumber() + ", getTitle()=" + getTitle()
				+ ", getNumberOfcopies()=" + getNumberOfcopies() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public int getIdentificationnumber() {
		return super.getIdentificationnumber();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumberOfcopies() {
		return super.getNumberofcopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}

	public void print() {
		System.out.println("Display info about a book: ");
		super.print();
	}

	public void checkIn() {
		super.checkIn();
	}

	public void checkOut() {
		super.checkOut();
	}
}

class JournalPaper extends WrittenItem {

	public JournalPaper(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private int PublicationYear;

	public int getPublicationYear() {
		return PublicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		PublicationYear = publicationYear;
	}

	public String toString() {
		return super.toString() + " Year published: " + PublicationYear;
	}

	public int getIdentificationnumber() {
		return super.getIdentificationnumber();
	}

	public String Title() {
		return super.getTitle();
	}

	public int NumberOfcopies() {
		return super.getNumberofcopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}

	public int yearPub() {
		return PublicationYear;
	}

	public void print() {
		super.print();
		System.out.println("Year published: " + PublicationYear);
	}
}

abstract class MediaItem extends Item {
	public MediaItem(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
}
private int runtime;
}

class video extends MediaItem {

	public video(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private String Director;
	private String Genre;
	private int yearOfrelease;

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getYearOfrelease() {
		return yearOfrelease;
	}

	public void setYearOfrelease(int yearOfrelease) {
		this.yearOfrelease = yearOfrelease;
	}
}

class CD extends MediaItem {

	public CD(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
