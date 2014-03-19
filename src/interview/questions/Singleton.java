package interview.questions;

/**
 *
 * @author rossbille
 */
public class Singleton
{
	private static final Singleton instance = new Singleton();
	
	private Singleton(){
		if(instance!=null){
			throw new InstantiationError("Singleton can only be instantiated once");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("Cannot clone singleton");
	}
}
