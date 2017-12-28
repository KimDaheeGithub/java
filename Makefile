All: Hello.class Welcome.class Add.class

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