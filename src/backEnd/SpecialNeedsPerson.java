package backEnd;

public class SpecialNeedsPerson extends Person{
	
	public SpecialNeedsPerson(Person p){
		super(p);
		
		setCashiersTime((getCashiersTime()*2));
		setLeaveTime((getTickTime()*3));
		setEateryTime(getEateryTime() * 4);

	}

}