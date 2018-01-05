
public class TestClass {

	@SimpleAnnotation1
	void methodOne() {

	}

	@SimpleAnnotation2("attribute text")
	void methodTwo() {

	}

	@SimpleAnnotation3(firstName = "Perica", parents = { "Ivica", "Marica" })
	void methodThree() {

	}

}
