package classes;

public class Getters {

	private int id;

	private String Name;

	private String Email;

	public int getId() {

		return id;
	}

	public String getName() {

		return Name;
	}

	public String getEmail() {

		return Email;
	}

	public void setId(int id) {

		this.id = id;
	}

	public void setName(String name) {

		Name = name;

	}

	public void setEmail(String email) {
		Email = email;
	}

	public Getters(int id, String name, String email) {
		super();
		this.id = id;
		Name = name;
		Email = email;
	}

}
