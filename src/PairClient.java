
public class PairClient {
	
	public static void main (String[] args) {
		Pair<String> pair = new Pair("Yay");
		System.out.print(pair.getFirst());
		Pair<Integer> intPair = new Pair(55);
		System.out.print(" " + intPair.getFirst());
	}

}
