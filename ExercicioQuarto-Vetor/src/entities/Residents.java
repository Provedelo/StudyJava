package entities;

public class Residents {
	private String name;
	private String email;
	private int room;
	

	public Residents() {
		
	}
	
	public Residents(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
}
