//public class changeCounter {
//	public static int sum(int n) {
//
//		int count = 0;
//		for (int i = 0; i <= n / 100; i++) {
//			for (int j = 0; j <= n / 50; j++) {
//				for (int k = 0; k <= n / 10; k++) {
//					for (int l = 0; l <= n / 5; l++) {
//						int v = i * 100 + j * 50 + k * 10 + l * 5;
//						if (v == n) {
//							count++;
//						} else if (v > n) {
//							break;
//						}
//					}
//				}
//			}
//		}
//		return count;
//	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the value to count in cents: ($1 = 100)");
        int change = input.nextInt();
		System.out.println(sum(change));


	}
}
