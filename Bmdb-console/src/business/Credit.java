package business;

public class Credit {

	private int id, actorId, movieId;
	private String role;

	public Credit() {
		// default constructor
	}

	public Credit(int id, int actorId, int movieId, String role) {
		super();
		this.id = id;
		this.actorId = actorId;
		this.movieId = movieId;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Credit [id=" + id + ", actorId=" + actorId + ", movieId=" + movieId + ", role=" + role + "]";
	}
	
	

}