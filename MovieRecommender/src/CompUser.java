
public class CompUser {
	int user;
	int similar;
	
	@Override
	public String toString() {
		return "CompUser [user=" + user + ", similar=" + similar + "]";
	}

	public CompUser(int user, int similar) {
		this.user = user;
		this.similar = similar;
	}
	
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getSimilar() {
		return similar;
	}
	public void setSimilar(int similar) {
		this.similar = similar;
	}
}
