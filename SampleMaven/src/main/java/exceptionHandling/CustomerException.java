package exceptionHandling;

public class CustomerException {

	public static void main(String[] args) throws VotingException {
		int age=17;
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new VotingException("Age under 18");
		}

	}

}
