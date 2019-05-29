package divmod;

public class Logic {
	public static float calculate(int start, int end)
	{
		if(start>end)
		{
			throw new ArithmeticException();
			//return -1;
		}
		else
		{
			float result = 0;
			for(float i=start; i<end; i+=0.0001)
			{
				result-=Math.cos(i);
			}
			return result;
		}
	}
}
