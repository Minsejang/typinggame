package game;

import java.util.ArrayList;
import java.util.Arrays;

public class NormalWordList {
	String[] words = {
				"Class", "Object", "Method", "Array", "Loop",
				"If", "Else", "For", "While", "Do", "Try",
				"Catch", "Throw", "Throws", "Switch",
				"Case", "Return", "Void", "Byte", "Char",
				"Interface", "Abstract", "Final", "Enum",
				"Super", "This", "Constructor", "Getter",
				"Setter", "Break", "Continue", "Try", "Catch",
				"Throw", "Throws", "Package", "Stack", "Queue",
				"HashMap", "Iterator", "Recursion", "JVM",
				"Static", "Public", "Private", "Default",
				"Thread"
	};
	ArrayList<String> normalWords = new ArrayList<>(Arrays.asList(words));
}
