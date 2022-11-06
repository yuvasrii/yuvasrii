package sri;

public class CheeseDecorator extends SubstanceDecorator {
public CheeseDecorator(pizza decoratorpizza )
{
	super(decoratorpizza);
}
public String ingrediens()
{
	return decoratedpizza.ingredients()+"and"+addcheese();
} 
private String addcheese()
{
	return "addcheese to pizza";
	} 
} 




