package sri;

public class ChickenDecorator extends SubstanceDecorator {
	public ChickenDecorator(pizza decoratorpizza) {
		super(decoratorpizza);
	}
	public String ingredients()
	{
		return decoratedpizza.ingredients()+"and"+addchicken();
		
	}
private String addchicken()
{
	
	return "addchicken o pizza";
}
}
