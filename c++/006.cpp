#include <iostream>

int main() {


	for(int i = 20*19;true;++i)
	{
		bool divisible = true;
		for(int j = 2; j <= 20; ++j)
		{
			if (i % j != 0)
			{
				divisible = false;
				break;
			}
		}
		if (divisible)
		{
			std::cout << i << "\r\n";
			return(0);
		}
	}


	return(0);
}

