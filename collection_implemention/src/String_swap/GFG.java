package String_swap;

// Java program to find minimum length subString 
// having exactly k distinct character. 
class GFG 
{ 

// Function to find minimum length subString 
// having exactly k distinct character. 
static String findMinLenStr(String str, int k) 
{ 
	int n = str.length(); 

	// Starting index of sliding window. 
	int st = 0; 

	// Ending index of sliding window. 
	int end = 0; 

	// To store count of character. 
	int cnt[] = new int[26]; 
	for(int i = 0; i < 26; i++)cnt[i] = 0; 

	// To store count of distinct 
	// character in current sliding 
	// window. 
	int distEle = 0; 

	// To store length of current 
	// sliding window. 
	int currlen; 

	// To store minimum length. 
	int minlen = n; 

	// To store starting index of minimum 
	// length subString. 
	int startInd = -1; 

	while (end < n) 
	{ 

		// Increment count of current character 
		// If this count is one then a new 
		// distinct character is found in 
		// sliding window. 
		cnt[str.charAt(end) - 'a']++; 
		if (cnt[str.charAt(end) - 'a'] == 1) 
			distEle++; 

		// If number of distinct characters is 
		// is greater than k, then move starting 
		// point of sliding window forward, 
		// until count is k. 
		if (distEle > k) 
		{ 
			while (st < end && distEle > k) 
			{ 
				if (cnt[str.charAt(st) - 'a'] == 1) 
					distEle--; 
				cnt[str.charAt(st) - 'a']--; 
				st++; 
			} 
		} 

		// Remove characters from the beginning of 
		// sliding window having count more than 1 
		// to minimize length. 
		if (distEle == k) 
		{ 
			while (st < end && cnt[str.charAt(st) - 'a'] > 1) 
			{ 
				cnt[str.charAt(st) - 'a']--; 
				st++; 
			} 

			// Comapre length with minimum length 
			// and update if required. 
			currlen = end - st + 1; 
			if (currlen < minlen) 
			{ 
				minlen = currlen; 
				startInd = st; 
			} 
		} 

		end++; 
	} 

	// Return minimum length subString. 
	return str.substring(startInd,startInd + minlen); 
} 

// Driver code 
public static void main(String args[]) 
{ 
	String str = "efecfefd"; 
	int k = 4; 
	System.out.println(findMinLenStr(str, k)); 
} 
} 

// This code is contributed by Arnab Kundu 
