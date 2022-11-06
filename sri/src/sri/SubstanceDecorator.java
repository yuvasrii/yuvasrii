package sri;
public  abstract class SubstanceDecorator implements pizza {
	protected pizza decoratedpizza;
	public SubstanceDecorator(pizza decoratorpizza)
	{
		this.decoratedpizza=decoratedpizza; 
		
	}

	public String size()
	{
		return decoratedpizza.size();
		
	}
	public String ingredients()
	{
		return decoratedpizza.ingredients();
	}
}




