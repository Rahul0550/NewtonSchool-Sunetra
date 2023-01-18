// public class updateBit {
//     public static void main(String[] args) {
//         int n = 17;
//         int pos = 1;
//         int bitmask = 1<<pos;
//         int newno = bitmask | n;
//         System.out.println(newno);
//     }
// }
// Java implementation to find the
// count of numbers possible less
// than N, such that every digit
// is from the given set of digits
import java.util.*;

class updateBit{

static int [][]dp = new int[15][2];

static String convertToString(int num)
{
	return String.valueOf(num);
}

static int calculate(int pos, int tight,
	int D[], int sz, String num)
{
	if (pos == num.length())
		return 1;
	
	if (dp[pos][tight] != -1)
		return dp[pos][tight];

	int val = 0;
	
	if (tight == 0) {
		
		for (int i = 0; i < sz; i++) {
			
			if (D[i] < (num.charAt(pos) - '0')) {
				val += calculate(pos + 1,
						1, D, sz, num);
			}
			else if (D[i] == num.charAt(pos) - '0')
				val += calculate(pos + 1,
					tight, D, sz, num);
		}
	}
	else {
		
		for (int i = 0; i < sz; i++) {
			val += calculate(pos + 1,
					tight, D, sz, num);
		}
	}
	
	return dp[pos][tight] = val;
}

static int countNumbers(int D[], int N, int sz)
{
	String num = convertToString(N);
	int len = num.length();
	
	for (int i = 0; i < 15; i++)
		for (int j = 0; j < 2; j++)
			dp[i][j] = -1;
	
	int ans = calculate(0, 0, D, sz, num);
	
	for (int i = 1; i < len; i++)
		ans += calculate(i, 1, D, sz, num);

	return ans;
}

public static void main(String[] args)
{
	int sz = 3;
	int D[] = { 3, 4, 5 };
	int N = 100;
	System.out.print(countNumbers(D, N, sz));
}
}
