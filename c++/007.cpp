#include <iostream>

int main() {

	long sumOfSquares = 0;
	long sum = 0;


	for(int i = 1; i <= 100; ++i)
	{
		sum += i;
		sumOfSquares += i * i;

	}
	
	std::cout << (sum * sum - sumOfSquares) << "\r\n";

	return(0);
}

