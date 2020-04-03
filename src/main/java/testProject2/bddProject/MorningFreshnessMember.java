package testProject2.bddProject;


public class MorningFreshnessMember {

	private String name;
	private SuperSmoothiesSchema schema;
	int points;
	
	public MorningFreshnessMember(String name, SuperSmoothiesSchema schema) {
		this.name=name;
		this.schema=schema;
	}

	public void orders(Integer amount, String drink) {
		points += schema.getPointsFor(drink) * amount;
	}

	public int getPoints() {
		// TODO Auto-generated method stub
		return points;
	}

}
