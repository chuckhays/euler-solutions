JAVAC=javac
JAVAOPTS= -Werror -Xlint:unchecked -Xlint:deprecation

sources = $(wildcard Program.java)
classes = $(sources:.java=.class)

all: $(classes)

clean :
		rm -f *.class

%.class : %.java
		$(JAVAC) $(JAVAOPTS) $<
