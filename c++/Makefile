GXX=c++
GXXOPTS= -g -Wall -Werror

all: $(patsubst %.cpp,%,$(wildcard 0*.cpp))

%: %.cpp
	$(GXX) $(GXXOPTS) -o $@ $^

clean:
		/bin/rm -f *.o 0[012]? 
