package src.main;

public class TestClass {

	@SimpleAnnotation1
	void methodOne() {

	}

	@SimpleAnnotation2("attribute text")
	void methodTwo() {

	}

	@SimpleAnnotation3(firstName = "Perica", parent = { "Ivica", "Marica" }, age = 16)
	void methodThree() {

	}

	@SimpleAnnotation2(value = "some attribute value")
	@SimpleAnnotation3(firstName = "marica", lastName = "kek", parent = { "kok", "jak" }, age = 12)
	// in case of multiple parents array must be used
//	@SimpleAnnotation3(firstName = "marica", lastName = "kek", parent = "kok", parent = "jak", age = 12) //  doesn't work like this
	void methodFour(String one, Integer two) {

	}

	// case of single parent
	@SimpleAnnotation3(firstName = "jura", lastName = "maki", parent = "tahi", age = 12)
	void methodFive() {

	}

	// repeatable annotations
	@SimpleAnnotation4(valueInt = 34, valueString = "hkllkjh")
	@SimpleAnnotation4(valueInt = 45, valueString = "asdffa")
	void methodSix() {

	}

	// since Family has only one parameter and it is named value it can be omitted
	@Family({ @Relative(relation = "dad", person = @Person(firstName = "ivo", lastName = "ivic", age = 34)),
			@Relative(relation = "mam", person = @Person(firstName = "ana", lastName = "ivic", age = 36)),
			@Relative(relation = "sis", person = @Person(firstName = "kata", lastName = "ivic", age = 8)),
			@Relative(relation = "me", person = @Person(firstName = "pero", lastName = "ivic", age = 10)) })
	void myFamily() {

	}

}
