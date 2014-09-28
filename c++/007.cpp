#include <iostream>
bool isPrime(long n)
{
	for(long i = 2; i < n/2; ++i)
	{
		if (n % i == 0)
		{
			return false;
		}
	}
	return true;
}
int main() {


	int target = 10001;
	int current = 0;
	int currentPrime = 0;

	int i = 2;
	while (current <= target)
	{
		if (isPrime(i))
		{
			++current;
			currentPrime = i;
		}

		++i;
	}


	std::cout << currentPrime << "\r\n";

	return(0);
}

