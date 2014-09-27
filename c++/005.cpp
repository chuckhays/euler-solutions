#include <iostream>
#include <vector>

bool isPalindrome(long n)
{
	std::vector<int> digits;

	while (n > 0)
	{
		int digit = n % 10;
		digits.push_back(digit);
		n = n / 10;
	}

	std::vector<int>::size_type sz = digits.size();

	for( int i = 0; i < sz/2; ++i)
	{
		if (digits[i] != digits[sz-1-i])
		{
			return false;
		}
	}

	return true;
}

int main() {

	int largest = 0;


	for(int i = 999; i > 99; --i)
	{
		for(int j = 999; j > 99; --j)
		{
			if (isPalindrome(i * j))
			{
				if (i * j > largest)
				{
					largest = i * j;
				}
			}
		}
	}	

	std::cout << largest << "\r\n";
	return(0);
}

