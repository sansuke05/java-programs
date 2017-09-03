public class sample {
	public static void main(String[] args) {
		String m = System.getProperty("os.name");
		String[] m1 = System.getenv("PATH").split(":");
		System.out.println(m + " " + m1[0]);
	}
}