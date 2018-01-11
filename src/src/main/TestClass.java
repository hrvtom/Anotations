package src.main;

public class TestClass {

	@SimpleAnnotation1
	void methodOne() {

	}

	@SimpleAnnotation2("attribute text")
	void methodTwo() {

	}

	@SimpleAnnotation3(firstName = "Perica", parents = { "Ivica", "Marica" }, age = 16)
	void methodThree() {

	}

	@SimpleAnnotation2(value = "some attribute value")
	@SimpleAnnotation3(firstName = "marica", lastName = "kek", parents = { "kok", "jak" }, age = 12)
	void methodFour(String one, Integer two) {

	}

}
