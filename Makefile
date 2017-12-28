All: Hello.class Welcome.class

Hello.class: Hello.java
	javac Hello.java

Welcome.class: Welcome.java
	javac Welcome.java

clean:
	rm Hello.class
	rm Welcome.class