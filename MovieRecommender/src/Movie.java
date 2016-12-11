
public class Movie {
	int id;
	String title;
	String year;
	String url;
	String unknown;
	String action;
	String adventure;
	String animation;
	String children;
	String comedy;
	String crime;
	String documentory;
	String drama;
	String fantasy;
	String filmNoir;
	String horror;
	String musical;
	String mystery;
	String romance;
	String sciFi;
	String thriller;
	String war;
	String western;
	
	
	
	public Movie(int id,String title, String year, String url, String unknown, String action, String adventure, String animation,
			String children, String comedy, String crime, String documentory, String drama, String fantasy,
			String filmNoir, String horror, String musical, String mystery, String romance, String sciFi,
			String thriller, String war, String western) {
		if(id <1 || title==null || title.isEmpty()|| url==null||url.isEmpty())
			throw new IllegalArgumentException();
		this.id = id;
		this.title = title;
		this.year = year;
		this.url = url;
		this.unknown = unknown;
		this.action = action;
		this.adventure = adventure;
		this.animation = animation;
		this.children = children;
		this.comedy = comedy; 
		this.crime = crime;
		this.documentory = documentory;
		this.drama = drama;
		this.fantasy = fantasy;
		this.filmNoir = filmNoir;
		this.horror = horror;
		this.musical = musical;
		this.mystery = mystery;
		this.romance = romance;
		this.sciFi = sciFi;
		this.thriller = thriller;
		this.war = war;
		this.western = western;
	}
	

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", url=" + url + ", unknown=" + unknown
				+ ", action=" + action + ", adventure=" + adventure + ", animation=" + animation + ", children="
				+ children + ", comedy=" + comedy + ", crime=" + crime + ", documentory=" + documentory + ", drama="
				+ drama + ", fantasy=" + fantasy + ", filmNoir=" + filmNoir + ", horror=" + horror + ", musical="
				+ musical + ", mystery=" + mystery + ", romance=" + romance + ", sciFi=" + sciFi + ", thriller="
				+ thriller + ", war=" + war + ", western=" + western + "]";
	}




	public int getMovieId() {
		return id;
	}
	public void setMovieID(int id) {
		this.id = id;
	}	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUnknown() {
		return unknown;
	}
	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAdventure() {
		return adventure;
	}
	public void setAdventure(String adventure) {
		this.adventure = adventure;
	}
	public String getAnimation() {
		return animation;
	}
	public void setAnimation(String animation) {
		this.animation = animation;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	public String getComedy() {
		return comedy;
	}
	public void setComedy(String comedy) {
		this.comedy = comedy;
	}
	public String getCrime() {
		return crime;
	}
	public void setCrime(String crime) {
		this.crime = crime;
	}
	public String getDocumentory() {
		return documentory;
	}
	public void setDocumentory(String documentory) {
		this.documentory = documentory;
	}
	public String getDrama() {
		return drama;
	}
	public void setDrama(String drama) {
		this.drama = drama;
	}
	public String getFantasy() {
		return fantasy;
	}
	public void setFantasy(String fantasy) {
		this.fantasy = fantasy;
	}
	public String getFilmNoir() {
		return filmNoir;
	}
	public void setFilmNoir(String filmNoir) {
		this.filmNoir = filmNoir;
	}
	public String getHorror() {
		return horror;
	}
	public void setHorror(String horror) {
		this.horror = horror;
	}
	public String getMusical() {
		return musical;
	}
	public void setMusical(String musical) {
		this.musical = musical;
	}
	public String getMystery() {
		return mystery;
	}
	public void setMystery(String mystery) {
		this.mystery = mystery;
	}
	public String getRomance() {
		return romance;
	}
	public void setRomance(String romance) {
		this.romance = romance;
	}
	public String getSciFi() {
		return sciFi;
	}
	public void setSciFi(String sciFi) {
		this.sciFi = sciFi;
	}
	public String getThriller() {
		return thriller;
	}
	public void setThriller(String thriller) {
		this.thriller = thriller;
	}
	public String getWar() {
		return war;
	}
	public void setWar(String war) {
		this.war = war;
	}
	public String getWestern() {
		return western;
	}
	public void setWestern(String western) {
		this.western = western;
	}
}
