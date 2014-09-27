#include <iostream>
#define LENGTH 1000000

bool isFactor(long divisor, long value)
{
	return value % divisor == 0;
}

int main() {

	long largest = 0;
	long target = 600851475143;
	long n = target;
	
	for (long i = 2; i * i <= n; ++i)
	{
		if (isFactor(i, n))
		{
			n = n / i;
			largest = i;
		}
	}

	if (n > largest)
	{
		largest = n;
	}
	std::cout << largest << "\r\n";
	return(0);
}

