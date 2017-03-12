package exampls;

public class Persistent implements java.io.Serializable {
	
	private Integer fruitId;
	private String name;
	private String group;
	private String color;
	
	public void Fruit() {
	
	}
	
	public void Fruit(String name, String group, String color) {
		this.name = name;
		this.group = group;
		this.color = color;
	}
	
	@Id @GeneratedValue(strategy=IDENTITY)
	
	
	@Column(name="fruitId", unique=true, nullable=false)
	public Integer getFruitId() {
		return this.sodaId;
	}
	
	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}

}
