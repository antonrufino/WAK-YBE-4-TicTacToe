build:
	javac -d bin src/*.java
	jar cfe Exer4.jar ybe4.Main -C bin .
