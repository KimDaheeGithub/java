All: Hello Welcome Add Add2

Add2: Add2.java
	javac Add2.java

Hello: Hello.java
	javac Hello.java

Welcome: Welcome.java
	javac Welcome.java

Add: Add.java
	javac Add.java

clean:
	rm Add.class
	rm Hello.class
	rm Welcome.class