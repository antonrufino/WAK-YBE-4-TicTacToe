build:
	javac -d bin -sourcepath src src/ybe4/*.java
	jar cfe Exer4.jar ybe4.Main -C bin .
