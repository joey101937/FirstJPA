package interhitance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Bus extends Vehicle{
	private int numPassengers;
	public Bus(){
		
	}
	public Bus(String name, int i){
		this.name = name;
		numPassengers = i;
	}
	public int getNumPassengers() {
		return numPassengers;
	}
	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}
	
	
}
